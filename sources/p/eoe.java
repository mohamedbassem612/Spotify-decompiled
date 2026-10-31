package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class eoe {
    public final String a;
    public final int b;

    public eoe(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eoe)) {
            return false;
        }
        eoe eoeVar = (eoe) obj;
        return u890.j(this.a, eoeVar.a) && this.b == eoeVar.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
