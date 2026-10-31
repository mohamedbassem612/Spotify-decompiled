package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zsy implements bty {
    public final String a;
    public final boolean b;

    public zsy(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zsy)) {
            return false;
        }
        zsy zsyVar = (zsy) obj;
        return u890.j(this.a, zsyVar.a) && this.b == zsyVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
