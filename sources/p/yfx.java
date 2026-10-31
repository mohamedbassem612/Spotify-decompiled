package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yfx implements u0i {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yfx(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final qzh a(l0i l0iVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ufx ufxVar = (ufx) obj;
                return ((pgu0) l0iVar) instanceof pgu0 ? new ver(ufxVar.a(), ufxVar.b(), (byte) 10) : new ver(ufxVar.a(), ufxVar.b(), (byte) 10);
            case 1:
                p3d1.q(l0iVar);
                return new b6s(((vfx) obj).a(), (byte) 1);
            case 2:
                return new nzj(((tfx) obj).a(), q9j.a);
            default:
                as11 as11Var = (as11) l0iVar;
                wfx wfxVar = (wfx) obj;
                Context context = wfxVar.b;
                if (as11Var == null) {
                    return new nzj(context, apo.j(-1787880365, new op(wfxVar, (byte) 4), true));
                }
                if (as11Var instanceof as11) {
                    return new nzj(context, apo.j(661008572, new op(wfxVar, (byte) 5), true));
                }
                eg.o();
                return null;
        }
    }
}
