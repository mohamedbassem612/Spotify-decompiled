package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dgx implements u0i {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vfx b;
    public final /* synthetic */ af10 c;

    public /* synthetic */ dgx(vfx vfxVar, af10 af10Var, byte b) {
        this.a = b;
        this.b = vfxVar;
        this.c = af10Var;
    }

    public final qzh a(l0i l0iVar) {
        byte b = this.a;
        af10 af10Var = this.c;
        vfx vfxVar = this.b;
        switch (b) {
            case 0:
                if (l0iVar == null) {
                    return new kis(vfxVar.a, af10Var, (byte) 0);
                }
                bhn0.d();
                return null;
            case 1:
                if (l0iVar == null) {
                    return new kis(vfxVar.a, af10Var, (byte) 1);
                }
                bhn0.d();
                return null;
            default:
                if (l0iVar == null) {
                    return new kis(vfxVar.a, af10Var, (byte) 2);
                }
                bhn0.d();
                return null;
        }
    }
}
