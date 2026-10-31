package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hhj0 extends lhj0 {
    public final String a;
    public final boolean b;

    public hhj0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hhj0)) {
            return false;
        }
        hhj0 hhj0Var = (hhj0) obj;
        return this.a.equals(hhj0Var.a) && this.b == hhj0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
