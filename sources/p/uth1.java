package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uth1 extends zmo1 {
    public final String b;
    public final boolean c;

    public uth1(String str, boolean z) {
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uth1)) {
            return false;
        }
        uth1 uth1Var = (uth1) obj;
        return u890.j(this.b, uth1Var.b) && this.c == uth1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }
}
