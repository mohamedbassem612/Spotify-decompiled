package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zhr {
    public final wt8 a;
    public final boolean b;

    public zhr(wt8 wt8Var, boolean z) {
        this.a = wt8Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zhr)) {
            return false;
        }
        zhr zhrVar = (zhr) obj;
        return this.a.equals(zhrVar.a) && this.b == zhrVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
