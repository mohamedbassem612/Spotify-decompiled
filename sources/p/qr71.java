package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qr71 {
    public final rr71 a;
    public final String b;

    public qr71(rr71 rr71Var, String str) {
        this.a = rr71Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qr71)) {
            return false;
        }
        qr71 qr71Var = (qr71) obj;
        return this.a.equals(qr71Var.a) && this.b.equals(qr71Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
