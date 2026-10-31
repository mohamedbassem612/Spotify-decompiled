package p;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class moo extends BaseAdapter implements Filterable {
    public boolean a;
    public boolean b;
    public Cursor c;
    public int d;
    public koo e;
    public loo f;
    public z29 g;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                koo kooVar = this.e;
                if (kooVar != null) {
                    cursor2.unregisterContentObserver(kooVar);
                }
                loo looVar = this.f;
                if (looVar != null) {
                    cursor2.unregisterDataSetObserver(looVar);
                }
            }
            this.c = cursor;
            if (cursor != null) {
                koo kooVar2 = this.e;
                if (kooVar2 != null) {
                    cursor.registerContentObserver(kooVar2);
                }
                loo looVar2 = this.f;
                if (looVar2 != null) {
                    cursor.registerDataSetObserver(looVar2);
                }
                this.d = cursor.getColumnIndexOrThrow("_id");
                this.a = true;
                notifyDataSetChanged();
            } else {
                this.d = -1;
                this.a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    public final void e() {
        Cursor cursor;
        if (!this.b || (cursor = this.c) == null || cursor.isClosed()) {
            return;
        }
        this.a = this.c.requery();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.a || (cursor = this.c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.a) {
            return null;
        }
        this.c.moveToPosition(i);
        if (view == null) {
            wwc1 wwc1Var = (wwc1) this;
            view = wwc1Var.t.inflate(wwc1Var.i, viewGroup, false);
        }
        a(view, this.c);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        z29 z29Var = this.g;
        if (z29Var != null) {
            return z29Var;
        }
        z29 z29Var2 = new z29();
        z29Var2.b = this;
        this.g = z29Var2;
        return z29Var2;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.a || (cursor = this.c) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.a && (cursor = this.c) != null && cursor.moveToPosition(i)) {
            return this.c.getLong(this.d);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.a) {
            eg.m("this should only be called when the cursor is valid");
            return null;
        }
        if (!this.c.moveToPosition(i)) {
            eg.m(f4i1.c(i, "couldn't move cursor to position "));
            return null;
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.c);
        return view;
    }
}
