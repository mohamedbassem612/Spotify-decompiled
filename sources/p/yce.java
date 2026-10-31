package p;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class yce extends BaseAdapter {
    public final ArrayList a;
    public final Context b;

    public yce(Context context, ArrayList arrayList) {
        this.a = arrayList;
        this.b = context;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.a.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return (zce) this.a.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.b).inflate(R.layout.simple_list_item_1, viewGroup, false);
            TextView textView = (TextView) view.findViewById(R.id.text1);
            zce zceVar = (zce) this.a.get(i);
            textView.setText(zceVar.a);
            if (zceVar.b) {
                textView.setTextColor(-16777216);
                return view;
            }
            textView.setTextColor(-7829368);
            textView.setEnabled(false);
            textView.setOnClickListener(null);
        }
        return view;
    }
}
