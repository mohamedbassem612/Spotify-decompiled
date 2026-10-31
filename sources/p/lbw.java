package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lbw implements niw {
    public final String a;
    public final String b;

    public lbw(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lbw)) {
            return false;
        }
        lbw lbwVar = (lbw) obj;
        return u890.j(this.a, lbwVar.a) && u890.j(this.b, lbwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
