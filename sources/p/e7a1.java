package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e7a1 {
    public final String a;
    public final boolean b;

    public e7a1(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7a1)) {
            return false;
        }
        e7a1 e7a1Var = (e7a1) obj;
        return this.a.equals(e7a1Var.a) && this.b == e7a1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
