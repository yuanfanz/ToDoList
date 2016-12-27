package yuanfanz.todolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import java.util.List;

import yuanfanz.todolist.models.Todo;

/**
 * Created by yuanfanz on 16/12/26.
 */

public class TodoListConverter {

    private Context context;
    private List<Todo> data;

    public TodoListConverter(Context context, List<Todo> data) {
        this.context = context;
        this.data = data;
    }

    public View getView(int position) {
        Todo todo = data.get(position);

        View view = LayoutInflater.from(context).inflate(R.layout.todo_list_item, null);
        ((TextView) view.findViewById(R.id.todo_list_item_text)).setText(todo.text);
        return view;
    }
}
