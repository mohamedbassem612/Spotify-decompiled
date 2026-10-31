package p;

import io.reactivex.rxjava3.core.Completable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tu50 extends uu50 {
    public final String a;
    public final d1p0 b;
    public final boolean c;
    public final Completable d;

    public tu50(String str, d1p0 d1p0Var, boolean z, Completable completable) {
        this.a = str;
        this.b = d1p0Var;
        this.c = z;
        this.d = completable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tu50)) {
            return false;
        }
        tu50 tu50Var = (tu50) obj;
        return u890.j(this.a, tu50Var.a) && this.b.equals(tu50Var.b) && this.c == tu50Var.c && this.d.equals(tu50Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 961, this.c);
    }
}
