package leodevelopments.aboutme2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


public class SecondActivityListView extends BaseAdapter {
    String[] items;
    Context context;
    LayoutInflater inflater;

    public SecondActivityListView(String[] items, Context context) {
        this.items = items;
        this.context = context;

        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    private void initData() {
        items = new String[] {"Алексей", "Олеся", "Дмитрий", "Иван", "Борода", "Александр",
                "Леонид", "Вадим", "Сергей"};
    }

    @Override
    public int getCount() {
        return items == null ? 0 : items.length;
    }

    @Override
    public Object getItem(int position) {
        return items[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if(view == null) {
            view = inflater.inflate(R.layout.second_layout, parent, false);
        }

        TextView itemText = (TextView)view.findViewById(R.id.list);
        itemText.setText(items[position]);

        return view;
    }
}
