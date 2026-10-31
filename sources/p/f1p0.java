package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class f1p0 {
    public final String a;
    public final d1p0 b;
    public final boolean c;
    public final Completable d;
    public final CompletableFromAction e;

    public f1p0(String str, d1p0 d1p0Var, boolean z, Completable completable, CompletableFromAction completableFromAction) {
        this.a = str;
        this.b = d1p0Var;
        this.c = z;
        this.d = completable;
        this.e = completableFromAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f1p0) {
            f1p0 f1p0Var = (f1p0) obj;
            return u890.j(this.a, f1p0Var.a) && this.b.equals(f1p0Var.b) && this.c == f1p0Var.c && this.d.equals(f1p0Var.d) && this.e == f1p0Var.e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 961, this.c)) * 31);
    }
}
