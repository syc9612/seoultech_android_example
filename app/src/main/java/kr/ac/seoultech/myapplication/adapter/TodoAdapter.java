package kr.ac.seoultech.myapplication.adapter;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.List;

import kr.ac.seoultech.myapplication.R;
import kr.ac.seoultech.myapplication.model.Todo;

/**
 * Created by 신영철 on 2017-06-27.
 */

public class TodoAdapter extends BaseAdapter {

    private Context context;
    private int layoutId;
    private List<Todo> items;
    private LayoutInflater inflater;

    private SimpleDateFormat sdf;

    public TodoAdapter(Context context, int layoutId, List<Todo> items) {
        this.context = context;
        this.layoutId = layoutId;
        this.items = items;
        this.inflater = LayoutInflater.from(context);

        sdf = new SimpleDateFormat("yyyy.MM.dd");
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return items.get(position).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = inflater.inflate(this.layoutId, null);
        }

        TextView txtCreateAt = (TextView) view.findViewById(R.id.txt_create_at);
        TextView txtTitle = (TextView) view.findViewById(R.id.txt_title);
        TextView txtContent = (TextView) view.findViewById(R.id.txt_content);

        Todo todo = this.items.get(position);
        txtCreateAt.setText(sdf.format(todo.getCreateAt()));
        txtTitle.setText(todo.getTitle());
        txtContent.setText(todo.getContent());
        return view;
    }

    public void addItem(int index, Todo todo) {
        this.items.add(index, todo);
        notifyDataSetChanged();
    }

    public void setItem(int index, Todo todo) {
        this. items.set(index, todo);
        notifyDataSetChanged();
    }

    public void  removeItem(int index) {
        this.items.remove(index);
        notifyDataSetChanged();
    }

    public void setItems(List<Todo> items) {
        this.items = items;
        notifyDataSetChanged();
    }
}
