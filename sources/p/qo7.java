package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qo7 {
    public final String a;
    public final String b;

    public qo7(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qo7)) {
            return false;
        }
        qo7 qo7Var = (qo7) obj;
        return this.a.equals(qo7Var.a) && this.b.equals(qo7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
