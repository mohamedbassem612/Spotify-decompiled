package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class iq70 {
    public final String a;
    public final String b;

    public iq70(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iq70)) {
            return false;
        }
        iq70 iq70Var = (iq70) obj;
        return this.a.equals(iq70Var.a) && this.b.equals(iq70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
