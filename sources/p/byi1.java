package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class byi1 {
    public final String a;
    public final String b;

    public byi1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof byi1)) {
            return false;
        }
        byi1 byi1Var = (byi1) obj;
        return this.a.equals(byi1Var.a) && this.b.equals(byi1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
