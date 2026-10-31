package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class agz extends grn1 {
    public final boolean e;
    public final String f;

    public agz(boolean z, String str) {
        this.e = z;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agz)) {
            return false;
        }
        agz agzVar = (agz) obj;
        return this.e == agzVar.e && u890.j(this.f, agzVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + (Boolean.hashCode(this.e) * 31);
    }
}
