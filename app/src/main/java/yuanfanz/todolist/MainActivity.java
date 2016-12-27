package yuanfanz.todolist;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import yuanfanz.todolist.models.Todo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUI(mockData());
    }

    private void setupUI (@NonNull List<Todo> todos) {
        ListView listView = (ListView) findViewById(R.id.list_view);
        TodoListAdapter adapter = new TodoListAdapter(this, todos);
        listView.setAdapter(adapter);
    }


//    @NonNull
//    private View getListItemView(@NonNull Todo todo) {
//        View view = getLayoutInflater().inflate(R.layout.todo_list_item, null);
//        ((TextView) view.findViewById(R.id.todo_list_item_text)).setText(todo.text);
//        return view;
//    }

    @NonNull
    private List<Todo> mockData() {
        List<Todo> list = new ArrayList<>();
        for (int i = 0; i < 1000; ++i) {
            list.add(new Todo("todo " + i));
        }
        return list;
    }
}
