package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qd01 {
    public final boolean a;
    public final String b;

    public qd01(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd01)) {
            return false;
        }
        qd01 qd01Var = (qd01) obj;
        return this.a == qd01Var.a && this.b.equals(qd01Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
