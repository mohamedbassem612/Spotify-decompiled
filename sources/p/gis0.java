package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gis0 implements jis0 {
    public final int a;
    public final String b;

    public gis0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gis0)) {
            return false;
        }
        gis0 gis0Var = (gis0) obj;
        return this.a == gis0Var.a && this.b.equals(gis0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
