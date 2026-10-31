package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a39 extends BaseAdapter implements Filterable {
    public final Context a;
    public String b;
    public String c;
    public String d;
    public List e = z6x.a;
    public final z29 f = new z29(this);

    public a39(Context context) {
        this.a = context;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String getItem(int i) {
        if (i == 0) {
            return this.b;
        }
        if (i == getCount() - 1) {
            return this.d;
        }
        return this.e.isEmpty() ? this.c : ((i320) this.e.get(i - 1)).a;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return Math.max(this.e.size(), 1) + 2;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        return this.f;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == getCount() - 1) {
            return 2;
        }
        return this.e.isEmpty() ? 3 : 1;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        int itemViewType = getItemViewType(i);
        if (itemViewType == 0) {
            i2 = 2131626321;
        } else if (itemViewType != 2) {
            i2 = itemViewType != 3 ? 2131626319 : 2131626322;
        } else {
            i2 = 2131626320;
        }
        if (view == null) {
            view = LayoutInflater.from(this.a).inflate(i2, viewGroup, false);
        }
        ((TextView) view).setText(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 4;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        int itemViewType = getItemViewType(i);
        return itemViewType == 0 || itemViewType == 1;
    }
}
