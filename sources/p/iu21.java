package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class iu21 implements ku21 {
    public final String a;
    public final String b;

    public iu21(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iu21)) {
            return false;
        }
        iu21 iu21Var = (iu21) obj;
        return this.a.equals(iu21Var.a) && this.b.equals(iu21Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
