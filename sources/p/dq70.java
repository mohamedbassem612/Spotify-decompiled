package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dq70 {
    public final String a;
    public final String b;

    public dq70(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dq70)) {
            return false;
        }
        dq70 dq70Var = (dq70) obj;
        return this.a.equals(dq70Var.a) && this.b.equals(dq70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
