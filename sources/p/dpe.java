package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class dpe implements npe {
    public final String a;
    public final boolean b;

    public dpe(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpe)) {
            return false;
        }
        dpe dpeVar = (dpe) obj;
        return u890.j(this.a, dpeVar.a) && this.b == dpeVar.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
