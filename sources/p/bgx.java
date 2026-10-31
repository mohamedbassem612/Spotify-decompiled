package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bgx implements u0i {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bgx(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final qzh a(l0i l0iVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (l0iVar == null) {
                    vfx vfxVar = (vfx) obj;
                    return new fcs(vfxVar.a, vfxVar.b, (byte) 7);
                }
                bhn0.d();
                return null;
            case 1:
                if (l0iVar == null) {
                    return new ver(((vfx) obj).a, (byte) 9);
                }
                bhn0.d();
                return null;
            default:
                bnl1 bnl1Var = (bnl1) l0iVar;
                Context context = ((rp5) obj).a;
                if (bnl1Var == null) {
                    bnl1Var = new bnl1(new zml1(0, 100, 10, 80), new anl1(lcl1.X, lcl1.Y, (Integer) null, false));
                }
                return new wyr(context, bnl1Var);
        }
    }
}
