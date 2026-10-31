package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vcy implements xcy {
    public final String a;
    public final boolean b;

    public vcy(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vcy)) {
            return false;
        }
        vcy vcyVar = (vcy) obj;
        return this.a.equals(vcyVar.a) && this.b == vcyVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
