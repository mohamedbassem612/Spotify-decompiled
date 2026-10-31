package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yz21 {
    public static final yz21 c = new yz21("", "");
    public static final yz21 d = new yz21("", "local");
    public final String a;
    public final String b;

    public yz21(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yz21)) {
            return false;
        }
        yz21 yz21Var = (yz21) obj;
        return this.a.equals(yz21Var.a) && this.b.equals(yz21Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
