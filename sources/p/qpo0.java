package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qpo0 {
    public final boolean a;
    public final String b;

    public qpo0(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qpo0)) {
            return false;
        }
        qpo0 qpo0Var = (qpo0) obj;
        return this.a == qpo0Var.a && u890.j(this.b, qpo0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
