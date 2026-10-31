package p;

import android.view.ViewGroup;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class t1g0 implements Iterable, ola0 {
    public final /* synthetic */ Set a;
    public final ViewGroup b;
    public final ViewGroup c;
    public final ViewGroup d;

    public t1g0(ViewGroup viewGroup, ViewGroup viewGroup2, ViewGroup viewGroup3) {
        this.a = f46.S0(new ViewGroup[]{viewGroup, viewGroup2, viewGroup3});
        this.b = viewGroup;
        this.c = viewGroup2;
        this.d = viewGroup3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1g0)) {
            return false;
        }
        t1g0 t1g0Var = (t1g0) obj;
        return u890.j(this.b, t1g0Var.b) && u890.j(this.c, t1g0Var.c) && u890.j(this.d, t1g0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }
}
