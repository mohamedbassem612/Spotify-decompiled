package p;

import android.content.Context;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pp implements u0i {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wfx b;

    public /* synthetic */ pp(wfx wfxVar, byte b) {
        this.a = b;
        this.b = wfxVar;
    }

    public final qzh a(l0i l0iVar) {
        byte b = this.a;
        wfx wfxVar = this.b;
        switch (b) {
            case 0:
                if (l0iVar == null) {
                    return new nzj(wfxVar.b, new j2i(-1564945898, new op(wfxVar, (byte) 0), true));
                }
                bhn0.d();
                return null;
            case 1:
                if (l0iVar == null) {
                    return new fcs(wfxVar.b, (byte) 1);
                }
                bhn0.d();
                return null;
            case 2:
                if (l0iVar == null) {
                    return new zer(wfxVar.b, wfxVar.a, (byte) 0);
                }
                bhn0.d();
                return null;
            case 3:
                if (l0iVar == null) {
                    return new zer(wfxVar.b, wfxVar.a, (byte) 1);
                }
                bhn0.d();
                return null;
            case 4:
                if (l0iVar == null) {
                    return new h98(wfxVar.b, wfxVar.a, (byte) 0);
                }
                bhn0.d();
                return null;
            case 5:
                if (l0iVar == null) {
                    return new mdr(wfxVar.b);
                }
                bhn0.d();
                return null;
            case 6:
                return new yir(wfxVar.b, (byte) 17);
            case 7:
                if (l0iVar == null) {
                    return new eos(wfxVar.b, (byte) 1);
                }
                bhn0.d();
                return null;
            case 8:
                if (l0iVar == null) {
                    return new ver(wfxVar.b, wfxVar.a, (byte) 2);
                }
                bhn0.d();
                return null;
            case 9:
                hhg1.n("Required value was null.");
                return null;
            case 10:
                if (l0iVar == null) {
                    return new nzj(wfxVar.b, new j2i(1721617092, new op(wfxVar, (byte) 1), true));
                }
                bhn0.d();
                return null;
            case 11:
                if (l0iVar == null) {
                    return new yir(wfxVar.b, wfxVar.a, (byte) 1);
                }
                bhn0.d();
                return null;
            case 12:
                return new afr(wfxVar.b, wfxVar.a, false, ai4.b, (byte) 0);
            case 13:
                return new bgr(wfxVar.b, wfxVar.a, false, false, false);
            case 14:
                if (l0iVar == null) {
                    return new fcs(wfxVar.b, wfxVar.a, (byte) 2);
                }
                bhn0.d();
                return null;
            case 15:
                return new ver(wfxVar.b, wfxVar.a, (byte) 3);
            case 16:
                return new hgr(wfxVar.b, wfxVar.a, ai4.b, false, false, false, false);
            case 17:
                hhg1.n("Required value was null.");
                return null;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new rhr(wfxVar.b, wfxVar.a, false, ai4.b);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new eir(wfxVar.b, ai4.b, true, false, false);
            case 20:
                if (l0iVar == null) {
                    return new eos(wfxVar.b, (byte) 3);
                }
                bhn0.d();
                return null;
            case 21:
                if (l0iVar == null) {
                    return new ver(wfxVar.b, (byte) 4);
                }
                bhn0.d();
                return null;
            case 22:
                if (l0iVar == null) {
                    return new nzj(wfxVar.b, new j2i(-693821520, new op(wfxVar, (byte) 2), true));
                }
                bhn0.d();
                return null;
            case 23:
                if (l0iVar == null) {
                    return new h98(wfxVar.b, (byte) 3);
                }
                bhn0.d();
                return null;
            case 24:
                z0w z0wVar = (z0w) l0iVar;
                Context context = wfxVar.b;
                if (z0wVar == null) {
                    z0wVar = new z0w(null, 31);
                }
                return new rhr(context, z0wVar);
            case 25:
                hhg1.n("Required value was null.");
                return null;
            case 26:
                s9z s9zVar = (s9z) l0iVar;
                Context context2 = wfxVar.b;
                gw70 gw70Var = wfxVar.a;
                if (s9zVar == null) {
                    s9zVar = new s9z(3, false);
                }
                return new wyr(gw70Var, context2, s9zVar);
            case 27:
                if (l0iVar == null) {
                    return new yir(wfxVar.b, wfxVar.a, (byte) 5);
                }
                bhn0.d();
                return null;
            case 28:
                if (l0iVar == null) {
                    return new h98(wfxVar.b, (byte) 6);
                }
                bhn0.d();
                return null;
            default:
                return new afr(wfxVar.b, wfxVar.a, bi4.b, false, ai4.b);
        }
    }
}
