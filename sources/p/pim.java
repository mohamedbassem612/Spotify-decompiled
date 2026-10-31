package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pim {
    public final String a;
    public final boolean b;

    public pim(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pim)) {
            return false;
        }
        pim pimVar = (pim) obj;
        return u890.j(this.a, pimVar.a) && this.b == pimVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
