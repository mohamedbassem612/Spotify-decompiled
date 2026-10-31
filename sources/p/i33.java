package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class i33 implements k33 {
    public final String a;
    public final String b;

    public i33(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i33)) {
            return false;
        }
        i33 i33Var = (i33) obj;
        return u890.j(this.a, i33Var.a) && u890.j(this.b, i33Var.b);
    }

    public final String getSessionId() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
