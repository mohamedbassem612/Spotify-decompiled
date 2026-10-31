package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class igx implements u0i {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wfx b;

    public /* synthetic */ igx(wfx wfxVar, byte b) {
        this.a = b;
        this.b = wfxVar;
    }

    public final qzh a(l0i l0iVar) {
        byte b = this.a;
        wfx wfxVar = this.b;
        switch (b) {
            case 0:
                if (l0iVar == null) {
                    return new eos(wfxVar.b, (byte) 10);
                }
                bhn0.d();
                return null;
            case 1:
                if (l0iVar == null) {
                    return new yir(wfxVar.b, (byte) 24);
                }
                bhn0.d();
                return null;
            case 2:
                if (l0iVar == null) {
                    return new yir(wfxVar.b, (byte) 25);
                }
                bhn0.d();
                return null;
            case 3:
                if (l0iVar == null) {
                    return new h98(wfxVar.b, (byte) 10);
                }
                bhn0.d();
                return null;
            case 4:
                if (l0iVar == null) {
                    return new fcs(wfxVar.b, (byte) 9);
                }
                bhn0.d();
                return null;
            case 5:
                if (l0iVar == null) {
                    return new yir(wfxVar.b, (byte) 10);
                }
                bhn0.d();
                return null;
            case 6:
                if (l0iVar == null) {
                    return new eos(wfxVar.b, wfxVar.a, (byte) 9);
                }
                bhn0.d();
                return null;
            case 7:
                ywf1 ywf1Var = (ywf1) l0iVar;
                Context context = wfxVar.b;
                gw70 gw70Var = wfxVar.a;
                if (ywf1Var == null) {
                    ywf1Var = wwf1.a;
                }
                return new wyr(context, gw70Var, ywf1Var);
            default:
                if (l0iVar == null) {
                    return new yir(wfxVar.b, (byte) 23);
                }
                bhn0.d();
                return null;
        }
    }
}
