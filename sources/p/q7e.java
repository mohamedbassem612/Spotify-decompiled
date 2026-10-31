package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q7e extends gio1 {
    public final rh90 d;
    public final kfe e;

    public q7e(rh90 rh90Var, kfe kfeVar) {
        this.d = rh90Var;
        this.e = kfeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7e)) {
            return false;
        }
        q7e q7eVar = (q7e) obj;
        return u890.j(this.d, q7eVar.d) && this.e == q7eVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }
}
