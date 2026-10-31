package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o8a1 {
    public final List a;
    public final boolean b;

    public o8a1(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8a1)) {
            return false;
        }
        o8a1 o8a1Var = (o8a1) obj;
        return u890.j(this.a, o8a1Var.a) && this.b == o8a1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public /* synthetic */ o8a1() {
        this(z6x.a, false);
    }
}
