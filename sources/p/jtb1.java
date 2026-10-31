package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jtb1 {
    public final String a;
    public final String b;

    public jtb1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jtb1)) {
            return false;
        }
        jtb1 jtb1Var = (jtb1) obj;
        return this.a.equals(jtb1Var.a) && this.b.equals(jtb1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
