package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qzf {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public qzf(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qzf)) {
            return false;
        }
        qzf qzfVar = (qzf) obj;
        return this.a == qzfVar.a && this.b == qzfVar.b && this.c == qzfVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
