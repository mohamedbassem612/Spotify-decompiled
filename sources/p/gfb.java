package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gfb {
    public final boolean a;
    public final pfb b;

    public gfb(boolean z, pfb pfbVar) {
        this.a = z;
        this.b = pfbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean z = false;
        if (obj != null && gfb.class.equals(obj.getClass())) {
            gfb gfbVar = (gfb) obj;
            if (this.a == gfbVar.a) {
                pfb pfbVar = gfbVar.b;
                pfb pfbVar2 = this.b;
                if (pfbVar2 == null ? pfbVar != null : !pfbVar2.equals(pfbVar)) {
                    z = true;
                }
                return !z;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.a ? 1 : 0) * 31;
        pfb pfbVar = this.b;
        return i + (pfbVar != null ? pfbVar.hashCode() : 0);
    }
}
