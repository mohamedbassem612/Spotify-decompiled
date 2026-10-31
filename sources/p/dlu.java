package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dlu {
    public final boolean a;
    public final boolean b;
    public final mml c;

    public dlu(boolean z, boolean z2, mml mmlVar) {
        this.a = z;
        this.b = z2;
        this.c = mmlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlu)) {
            return false;
        }
        dlu dluVar = (dlu) obj;
        return this.a == dluVar.a && this.b == dluVar.b && u890.j(this.c, dluVar.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
        mml mmlVar = this.c;
        return iG + (mmlVar == null ? 0 : mmlVar.hashCode());
    }

    public /* synthetic */ dlu() {
        this(false, false, null);
    }
}
