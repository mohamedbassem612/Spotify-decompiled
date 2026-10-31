package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class am21 {
    public final String a;
    public final String b;

    public am21(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am21)) {
            return false;
        }
        am21 am21Var = (am21) obj;
        return this.a.equals(am21Var.a) && this.b.equals(am21Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
