package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cih extends eih {
    public final sn51 a;
    public final int b;
    public final boolean c;

    public cih(sn51 sn51Var, int i, boolean z) {
        this.a = sn51Var;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cih)) {
            return false;
        }
        cih cihVar = (cih) obj;
        return this.a.equals(cihVar.a) && this.b == cihVar.b && this.c == cihVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
