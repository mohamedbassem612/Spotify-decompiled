package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ce4 implements ixq0 {
    public final Context a;
    public final wat b;
    public final long c;
    public final zzq0 d;

    public ce4(Context context, wat watVar, long j, zzq0 zzq0Var) {
        this.a = context;
        this.b = watVar;
        this.c = j;
        this.d = zzq0Var;
    }

    public final hxq0 a() {
        return new be4(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ce4.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        ce4 ce4Var = (ce4) obj;
        if (!u890.j(this.a, ce4Var.a) || !u890.j(this.b, ce4Var.b)) {
            return false;
        }
        long j = ce4Var.c;
        int i = u7h.l;
        return z4h1.b(this.c, j) && this.d.equals(ce4Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = u7h.l;
        return this.d.hashCode() + c13.f(iHashCode, this.c, 31);
    }
}
