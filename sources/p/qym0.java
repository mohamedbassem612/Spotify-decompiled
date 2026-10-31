package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qym0 {
    public final String a;
    public final boolean b;

    public qym0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qym0)) {
            return false;
        }
        qym0 qym0Var = (qym0) obj;
        return this.a.equals(qym0Var.a) && this.b == qym0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
