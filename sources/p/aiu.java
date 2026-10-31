package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class aiu {
    public final zhu a;
    public final iac0 b;
    public final int c;
    public final boolean d;

    public aiu(zhu zhuVar, iac0 iac0Var, int i, boolean z) {
        this.a = zhuVar;
        this.b = iac0Var;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aiu)) {
            return false;
        }
        aiu aiuVar = (aiu) obj;
        return this.a.equals(aiuVar.a) && this.b.equals(aiuVar.b) && this.c == aiuVar.c && this.d == aiuVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ab80.k(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }
}
