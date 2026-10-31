package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sfx implements u0i {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vfx b;

    public /* synthetic */ sfx(vfx vfxVar, byte b) {
        this.a = b;
        this.b = vfxVar;
    }

    public final qzh a(l0i l0iVar) {
        byte b = this.a;
        vfx vfxVar = this.b;
        switch (b) {
            case 0:
                return new ver(vfxVar.a, (byte) 5);
            case 1:
                if (l0iVar == null) {
                    return new mns(vfxVar.a);
                }
                bhn0.d();
                return null;
            case 2:
                return new yir(vfxVar.a, (byte) 19);
            case 3:
                h511 h511Var = (h511) l0iVar;
                Context context = vfxVar.a;
                gw70 gw70Var = vfxVar.b;
                if (h511Var instanceof f511) {
                    return new ver(context, gw70Var, true, false);
                }
                return h511Var instanceof g511 ? new ver(context, gw70Var, false, true) : new ver(context, gw70Var, false, false);
            default:
                if (l0iVar == null) {
                    return new eos(vfxVar.a, (byte) 6);
                }
                bhn0.d();
                return null;
        }
    }
}
