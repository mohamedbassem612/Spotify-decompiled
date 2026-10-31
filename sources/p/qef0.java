package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qef0 implements ref0 {
    public final String a;
    public final boolean b;

    public qef0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qef0)) {
            return false;
        }
        qef0 qef0Var = (qef0) obj;
        return u890.j(this.a, qef0Var.a) && this.b == qef0Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
