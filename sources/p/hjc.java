package p;

import android.content.Context;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hjc implements u0i {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ufx b;

    public /* synthetic */ hjc(ufx ufxVar, byte b) {
        this.a = b;
        this.b = ufxVar;
    }

    public final qzh a(l0i l0iVar) {
        byte b = this.a;
        ufx ufxVar = this.b;
        switch (b) {
            case 0:
                if (l0iVar == null) {
                    return new lkr(ufxVar.a, (byte) 0);
                }
                bhn0.d();
                return null;
            case 1:
                if (l0iVar == null) {
                    return new h98(ufxVar.a, ufxVar.b, (byte) 1);
                }
                bhn0.d();
                return null;
            case 2:
                return w3p1.r(ufxVar, xhi.a);
            case 3:
                return w3p1.r(ufxVar, zhi.a);
            case 4:
                return new eos(ufxVar.a, ufxVar.b, (byte) 2);
            case 5:
                return new fcs(ufxVar.a, ufxVar.b, (byte) 3);
            case 6:
                return w3p1.r(ufxVar, aii.a);
            case 7:
                return w3p1.r(ufxVar, iii.a);
            case 8:
                if (l0iVar == null) {
                    return new fcs(ufxVar.a, ufxVar.b, (byte) 4);
                }
                bhn0.d();
                return null;
            case 9:
                uco ucoVar = (uco) l0iVar;
                Context context = ufxVar.a;
                gw70 gw70Var = ufxVar.b;
                if (u890.j(ucoVar, uco.a)) {
                    return new ver(context, gw70Var, (byte) 1);
                }
                return u890.j(ucoVar, uco.b) ? new fcs(context, gw70Var, (byte) 14) : new eos(context, gw70Var, (byte) 4);
            case 10:
                if (l0iVar == null) {
                    return new yir(ufxVar.a, true);
                }
                bhn0.d();
                return null;
            case 11:
                return w3p1.r(ufxVar, whi.a);
            case 12:
                return w3p1.r(ufxVar, ldi.a);
            case 13:
                sgu0 sgu0Var = (sgu0) l0iVar;
                Context context2 = ufxVar.a;
                gw70 gw70Var2 = ufxVar.b;
                if (u890.j(sgu0Var, sgu0.a)) {
                    return new lfs(context2, gw70Var2, false, (byte) 0);
                }
                if (u890.j(sgu0Var, sgu0.b)) {
                    return new lfs(context2, gw70Var2, true, (byte) 0);
                }
                if (u890.j(sgu0Var, sgu0.c)) {
                    return new lfs(context2, gw70Var2, false, (byte) 1);
                }
                return u890.j(sgu0Var, sgu0.d) ? new lfs(context2, gw70Var2, true, (byte) 1) : new lfs(context2, gw70Var2, false, (byte) 0);
            case 14:
                if (l0iVar == null) {
                    return new fcs(ufxVar.a, ufxVar.b, (byte) 5);
                }
                bhn0.d();
                return null;
            case 15:
                if (l0iVar == null) {
                    return new odr(ufxVar.a, ufxVar.b, (byte) 1);
                }
                bhn0.d();
                return null;
            case 16:
                Context context3 = ufxVar.a;
                return u890.j((b900) l0iVar, b900.a) ? new olu0(context3) : new iyr(context3, ufxVar.b);
            case 17:
                if (l0iVar == null) {
                    return new fcs(ufxVar.a, ufxVar.b, (byte) 6);
                }
                bhn0.d();
                return null;
            case 18:
                return w3p1.r(ufxVar, hii.a);
            case 19:
                yt70 yt70Var = (yt70) l0iVar;
                return new n2s(ufxVar.a, ufxVar.b, yt70Var != null ? yt70Var.a : new au70());
            case 20:
                return w3p1.r(ufxVar, kii.a);
            case 21:
                return w3p1.r(ufxVar, mii.a);
            case 22:
                return new h98(ufxVar.a, (byte) 11);
            case 23:
                return w3p1.r(ufxVar, r0j.a);
            case 24:
                if (l0iVar == null) {
                    return new h98(ufxVar.a, ufxVar.b, (byte) 12);
                }
                bhn0.d();
                return null;
            case 25:
                if (l0iVar == null) {
                    return new tps(ufxVar.a, ufxVar.b);
                }
                bhn0.d();
                return null;
            case 26:
                if (l0iVar == null) {
                    return new ngr(ufxVar.a, ufxVar.b);
                }
                bhn0.d();
                return null;
            case 27:
                if (l0iVar == null) {
                    lrn1.a = false;
                    return new lkr(ufxVar.a, (byte) 2);
                }
                bhn0.d();
                return null;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                if (l0iVar == null) {
                    return new ver(ufxVar.a, (byte) 11);
                }
                bhn0.d();
                return null;
            default:
                if (l0iVar == null) {
                    return new lkr(ufxVar.a, (byte) 4);
                }
                bhn0.d();
                return null;
        }
    }
}
