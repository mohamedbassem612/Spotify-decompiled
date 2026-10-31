package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class c650 implements h650 {
    public final String a;
    public final String b;

    public c650(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c650)) {
            return false;
        }
        c650 c650Var = (c650) obj;
        return this.a.equals(c650Var.a) && this.b.equals(c650Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
