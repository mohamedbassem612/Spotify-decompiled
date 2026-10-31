package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class blk0 {
    public final String a;
    public final String b;

    public blk0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blk0)) {
            return false;
        }
        blk0 blk0Var = (blk0) obj;
        return u890.j(this.a, blk0Var.a) && u890.j(this.b, blk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
