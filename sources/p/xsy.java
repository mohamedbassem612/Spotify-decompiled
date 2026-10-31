package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xsy {
    public final String a;
    public final boolean b;

    public xsy(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xsy)) {
            return false;
        }
        xsy xsyVar = (xsy) obj;
        return u890.j(this.a, xsyVar.a) && this.b == xsyVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
