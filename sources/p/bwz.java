package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bwz implements o700 {
    public final String a;
    public final String b;

    public bwz(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bwz)) {
            return false;
        }
        bwz bwzVar = (bwz) obj;
        return u890.j(this.a, bwzVar.a) && u890.j(this.b, bwzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
