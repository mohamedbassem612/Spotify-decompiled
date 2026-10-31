package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class c2l1 extends j2l1 {
    public final String a;
    public final String b;

    public c2l1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2l1)) {
            return false;
        }
        c2l1 c2l1Var = (c2l1) obj;
        return this.a.equals(c2l1Var.a) && this.b.equals(c2l1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
