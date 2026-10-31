package p;

import android.database.Cursor;
import android.widget.BaseAdapter;
import android.widget.Filter;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class z29 extends Filter {
    public final /* synthetic */ byte a = 1;
    public BaseAdapter b;

    public z29(a39 a39Var) {
        this.b = a39Var;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        switch (this.a) {
            case 1:
                return ((moo) this.b).c((Cursor) obj);
            default:
                return super.convertResultToString(obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0030  */
    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorH;
        switch (this.a) {
            case 0:
                Filter.FilterResults filterResults = new Filter.FilterResults();
                filterResults.count = ((a39) this.b).getCount();
                return filterResults;
            default:
                wwc1 wwc1Var = (wwc1) ((moo) this.b);
                SearchView searchView = wwc1Var.X;
                String string = charSequence == null ? "" : charSequence.toString();
                if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
                    try {
                        cursorH = wwc1Var.h(wwc1Var.Y, string);
                        if (cursorH != null) {
                            cursorH.getCount();
                        } else {
                            cursorH = null;
                        }
                        break;
                    } catch (RuntimeException unused) {
                    }
                } else {
                    cursorH = null;
                }
                Filter.FilterResults filterResults2 = new Filter.FilterResults();
                if (cursorH != null) {
                    filterResults2.count = cursorH.getCount();
                    filterResults2.values = cursorH;
                } else {
                    filterResults2.count = 0;
                    filterResults2.values = null;
                }
                return filterResults2;
        }
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        switch (this.a) {
            case 0:
                ((a39) this.b).notifyDataSetChanged();
                break;
            default:
                moo mooVar = (moo) this.b;
                Cursor cursor = mooVar.c;
                Object obj = filterResults.values;
                if (obj != null && obj != cursor) {
                    mooVar.b((Cursor) obj);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ z29() {
    }
}
