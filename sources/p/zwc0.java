package p;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zwc0 extends BaseAdapter {
    public int a = -1;
    public final /* synthetic */ axc0 b;

    public zwc0(axc0 axc0Var) {
        this.b = axc0Var;
        a();
    }

    public final void a() {
        msi0 msi0Var = this.b.c;
        ysi0 ysi0Var = msi0Var.v;
        if (ysi0Var != null) {
            msi0Var.j();
            ArrayList arrayList = msi0Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((ysi0) arrayList.get(i)) == ysi0Var) {
                    this.a = i;
                    return;
                }
            }
        }
        this.a = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ysi0 getItem(int i) {
        msi0 msi0Var = this.b.c;
        msi0Var.j();
        ArrayList arrayList = msi0Var.j;
        int i2 = this.a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (ysi0) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        msi0 msi0Var = this.b.c;
        msi0Var.j();
        int size = msi0Var.j.size();
        return this.a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.b.b.inflate(2131623952, viewGroup, false);
        }
        ((rti0) view).d(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
