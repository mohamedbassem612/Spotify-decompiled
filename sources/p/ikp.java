package p;

import android.content.Context;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ikp implements jly0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ ikp(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public static /* bridge */ /* synthetic */ jkp a(ikp ikpVar) {
        return (jkp) ikpVar.b;
    }

    public final Object get() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new hkp(this);
            case 1:
                qjp qjpVar = (qjp) obj;
                t8u0 t8u0Var = (t8u0) ((c890) qjpVar.b).m.get();
                c8o.l(t8u0Var);
                return t8u0Var.a(((q7r0) qjpVar.c).d.c.getLifecycle());
            case 2:
                return u1n0.z((q7r0) ((b6p) obj).b);
            case 3:
                return u1n0.z((q7r0) ((d3p) obj).a);
            case 4:
                return pzm.h((mos) ((cq90) ((z2p) obj).b).c.get());
            case 5:
                return pzm.h((mos) ((ht90) ((b6p) obj).b).c.get());
            case 6:
                a1r0 a1r0Var = (a1r0) ((iz90) ((d3p) obj).a).d.get();
                c8o.l(a1r0Var);
                return a1r0Var;
            case 7:
                return pzm.h((mos) ((lca0) ((qjp) obj).b).c.get());
            case 8:
                return new wkp(this);
            case 9:
                return new xkp(this);
            case 10:
                return new ykp(this);
            case 11:
                return new zkp(this);
            case 12:
                return u1n0.z((q7r0) ((d3p) obj).a);
            case 13:
                return new lop(this);
            case 14:
                return pzm.h((mos) ((t5d0) ((z2p) obj).b).a.get());
            case 15:
                return pzm.h((mos) ((s6d0) ((b6p) obj).b).a.get());
            case 16:
                return ((qop) ((d3p) obj).a).f();
            case 17:
                return new zpp(this);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new aqp(this);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                qjp qjpVar2 = (qjp) obj;
                ozp ozpVar = (ozp) qjpVar2.b;
                Context context = (Context) ozpVar.a.x1.a;
                c8o.l(context);
                lzn0 lzn0Var = (lzn0) ozpVar.b.i.get();
                c8o.l(lzn0Var);
                qop qopVar = (qop) qjpVar2.a;
                n6r0 n6r0Var = qopVar.c;
                c8o.l(n6r0Var);
                return new yxb0(context, lzn0Var, n6r0Var, qopVar.d());
            case 20:
                ez11 ez11Var = (ez11) ((eea0) ((z2p) obj).b).b;
                c8o.l(ez11Var);
                return new qq4(ez11Var);
            case 21:
                return new hod0((cn3) ((jl00) ((b6p) obj).b).b, (byte) 0);
            case 22:
                nzp nzpVar = (nzp) ((d3p) obj).a;
                xfx xfxVar = (xfx) nzpVar.b.q1.get();
                c8o.l(xfxVar);
                lzn0 lzn0Var2 = (lzn0) nzpVar.b.i.get();
                c8o.l(lzn0Var2);
                agc0 agc0Var = (agc0) nzpVar.a.B7.get();
                c8o.l(agc0Var);
                gw70 gw70Var = (gw70) nzpVar.a.d8.get();
                c8o.l(gw70Var);
                return new d460(xfxVar, gw70Var, agc0Var, lzn0Var2, false);
            case 23:
                return u1n0.z((q7r0) ((qjp) obj).a);
            case 24:
                return u1n0.z((q7r0) ((z2p) obj).b);
            case 25:
                return u1n0.z((q7r0) ((b6p) obj).b);
            case 26:
                return u1n0.z((q7r0) ((d3p) obj).a);
            case 27:
                gw70 gw70Var2 = (gw70) ((crp) obj).a.a;
                c8o.l(gw70Var2);
                return new sug0(gw70Var2, new hcx0((byte) 27));
            case 28:
                return new urp(this);
            default:
                return new vrp(this);
        }
    }
}
