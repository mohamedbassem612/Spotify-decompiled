package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p7e extends gio1 {
    public final int d;
    public final rh90 e;
    public final kfe f;
    public final boolean g;

    public p7e(int i, kfe kfeVar, rh90 rh90Var, boolean z) {
        this.d = i;
        this.e = rh90Var;
        this.f = kfeVar;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p7e)) {
            return false;
        }
        p7e p7eVar = (p7e) obj;
        return this.d == p7eVar.d && u890.j(this.e, p7eVar.e) && this.f == p7eVar.f && this.g == p7eVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + ((this.e.hashCode() + (Integer.hashCode(this.d) * 31)) * 31)) * 31);
    }
}
