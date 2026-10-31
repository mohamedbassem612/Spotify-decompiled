package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uww extends vww {
    public final String a;
    public final boolean b;

    public uww(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uww)) {
            return false;
        }
        uww uwwVar = (uww) obj;
        return u890.j(this.a, uwwVar.a) && this.b == uwwVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
