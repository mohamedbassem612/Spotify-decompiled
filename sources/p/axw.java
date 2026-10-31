package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class axw extends gxw {
    public final String a;
    public final boolean b;

    public axw(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axw)) {
            return false;
        }
        axw axwVar = (axw) obj;
        return u890.j(this.a, axwVar.a) && this.b == axwVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
