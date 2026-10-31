package p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jsi0 extends BaseAdapter {
    public final msi0 a;
    public int b = -1;
    public boolean c;
    public final boolean d;
    public final LayoutInflater e;
    public final int f;

    public jsi0(msi0 msi0Var, LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.e = layoutInflater;
        this.a = msi0Var;
        this.f = i;
        a();
    }

    public final void a() {
        msi0 msi0Var = this.a;
        ysi0 ysi0Var = msi0Var.v;
        if (ysi0Var != null) {
            msi0Var.j();
            ArrayList arrayList = msi0Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((ysi0) arrayList.get(i)) == ysi0Var) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ysi0 getItem(int i) {
        ArrayList arrayListM;
        boolean z = this.d;
        msi0 msi0Var = this.a;
        if (z) {
            msi0Var.j();
            arrayListM = msi0Var.j;
        } else {
            arrayListM = msi0Var.m();
        }
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (ysi0) arrayListM.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListM;
        boolean z = this.d;
        msi0 msi0Var = this.a;
        if (z) {
            msi0Var.j();
            arrayListM = msi0Var.j;
        } else {
            arrayListM = msi0Var.m();
        }
        return this.b < 0 ? arrayListM.size() : arrayListM.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.e.inflate(this.f, viewGroup, false);
        }
        int i2 = getItem(i).b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.a.n() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        rti0 rti0Var = (rti0) view;
        if (this.c) {
            listMenuItemView.setForceShowIcon(true);
        }
        rti0Var.d(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
