package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class aoi0 implements doi0 {
    public final String a;
    public final boolean b;

    public aoi0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aoi0)) {
            return false;
        }
        aoi0 aoi0Var = (aoi0) obj;
        return u890.j(this.a, aoi0Var.a) && this.b == aoi0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
