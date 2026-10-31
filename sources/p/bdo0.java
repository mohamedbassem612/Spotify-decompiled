package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bdo0 {
    public final String a;
    public final String b;

    public bdo0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bdo0)) {
            return false;
        }
        bdo0 bdo0Var = (bdo0) obj;
        return this.a.equals(bdo0Var.a) && this.b.equals(bdo0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
