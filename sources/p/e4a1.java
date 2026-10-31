package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class e4a1 implements h4a1 {
    public final String a;
    public final boolean b;

    public e4a1(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e4a1)) {
            return false;
        }
        e4a1 e4a1Var = (e4a1) obj;
        return this.a.equals(e4a1Var.a) && this.b == e4a1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
