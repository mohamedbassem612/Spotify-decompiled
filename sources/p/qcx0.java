package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qcx0 extends rcx0 {
    public final String a;
    public final String b;

    public qcx0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qcx0)) {
            return false;
        }
        qcx0 qcx0Var = (qcx0) obj;
        return this.a.equals(qcx0Var.a) && this.b.equals(qcx0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
