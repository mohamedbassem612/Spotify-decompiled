package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class r7e extends gio1 {
    public final rh90 d;
    public final kfe e;

    public r7e(rh90 rh90Var, kfe kfeVar) {
        this.d = rh90Var;
        this.e = kfeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7e)) {
            return false;
        }
        r7e r7eVar = (r7e) obj;
        return u890.j(this.d, r7eVar.d) && this.e == r7eVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }
}
