package p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u800 implements sek1 {
    public final idd1 a;
    public final idd1 b;
    public final idd1 c;
    public final idd1 d;

    public u800(LayoutInflater layoutInflater, ViewGroup viewGroup, iu30 iu30Var) {
        this.a = new idd1(new m551(layoutInflater, viewGroup, iu30Var, (byte) 5));
        this.b = new idd1(new j5z(this, (byte) 4));
        this.c = new idd1(new j5z(this, (byte) 3));
        this.d = new idd1(new j5z(this, (byte) 2));
    }

    public RecyclerView a() {
        return (RecyclerView) this.c.getValue();
    }

    public ViewGroup b() {
        return (ViewGroup) this.a.getValue();
    }

    public View getView() {
        return (View) this.b.getValue();
    }

    public u800(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.a = new idd1(new t800(layoutInflater, viewGroup, (byte) 0));
        this.b = new idd1(new s800(this, (byte) 0));
        this.c = new idd1(new s800(this, (byte) 2));
        this.d = new idd1(new s800(this, (byte) 1));
    }
}
