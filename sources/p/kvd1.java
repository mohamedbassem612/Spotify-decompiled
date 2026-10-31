package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kvd1 {
    public final String a;
    public final qvd1 b;

    public kvd1(String str, qvd1 qvd1Var) {
        this.a = str;
        this.b = qvd1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kvd1)) {
            return false;
        }
        kvd1 kvd1Var = (kvd1) obj;
        return u890.j(this.a, kvd1Var.a) && this.b == kvd1Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
