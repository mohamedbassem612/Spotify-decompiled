package p;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pld1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uw0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pld1(uw0 uw0Var, byte b) {
        super(1);
        this.a = b;
        this.b = uw0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        byte b2 = 5;
        byte b3 = 9;
        w7x w7xVar = w7x.a;
        byte b4 = 1;
        byte b5 = 2;
        rih1 rih1Var = rih1.a;
        byte b6 = 0;
        uw0 uw0Var = this.b;
        switch (b) {
            case 0:
                return new y4e((String) uw0Var.e, 1);
            case 1:
                return Collections.singleton((String) uw0Var.e);
            case 2:
                return new rlb((String) uw0Var.e, false);
            case 3:
                return new o5l1((String) uw0Var.e);
            case 4:
                return new bob((String) uw0Var.e);
            case 5:
                return new oob((String) uw0Var.e, ((nid1) obj).a);
            case 6:
                return new nnb((String) uw0Var.e);
            case 7:
                return Collections.singleton((String) uw0Var.e);
            case 8:
                return new set((String) uw0Var.e);
            case 9:
                return Collections.singleton((String) uw0Var.e);
            case 10:
                ji50 ji50Var = (ji50) obj;
                ucq ucqVar = (ucq) uw0Var.b;
                d0r d0rVar = ji50Var.a;
                r7q r7qVar = ucqVar.a;
                lfo lfoVar = new lfo(d0rVar, (gw70) r7qVar.b.d8.get(), (lzn0) r7qVar.d.i.get());
                byte b7 = 3;
                xzq xzqVar = new xzq(lfoVar, new pld1(uw0Var, b7));
                osc1 osc1Var = osc1.t;
                LinkedHashMap linkedHashMap = ji50Var.b;
                byte b8 = 4;
                linkedHashMap.put(xid1.class, new r3r(xzqVar, osc1Var, 4));
                linkedHashMap.put(lid1.class, new r3r(new xzq(new fob(d0rVar, false, (lzn0) ((ocq) uw0Var.t).a.d.i.get()), new pld1(uw0Var, b8)), osc1.Y, 4));
                linkedHashMap.put(nid1.class, r4o1.Q(vkd1.X0, w7xVar, new rld1(uw0Var, b5), osc1.b1));
                rld1 rld1Var = new rld1(uw0Var, b7);
                inb.a.getClass();
                linkedHashMap.put(jid1.class, r4o1.Q(new pld1(uw0Var, (byte) 7), hnb.b, rld1Var, osc1.d1));
                rld1 rld1Var2 = new rld1(uw0Var, b8);
                linkedHashMap.put(xhd1.class, r4o1.Q(new pld1(uw0Var, b3), wet.e, rld1Var2, sld1.b));
                linkedHashMap.put(hid1.class, r4o1.P(vkd1.Z, w7xVar, new rld1(uw0Var, b2), osc1.R0));
                rld1 rld1Var3 = new rld1(uw0Var, b6);
                linkedHashMap.put(fid1.class, r4o1.Q(new pld1(uw0Var, b4), l1d.u(l98.class), rld1Var3, sld1.c));
                linkedHashMap.put(bid1.class, r4o1.P(vkd1.O0, w7xVar, new rld1(uw0Var, b4), osc1.T0));
                linkedHashMap.put(zhd1.class, new r3r(new xzq(new qlb((ahr) ((qcq) uw0Var.c).a.d.Gd.get(), d0rVar), new pld1(uw0Var, b5)), osc1.N0, 4));
                return rih1Var;
            case 11:
                oi oiVar = (oi) uw0Var.f;
                two1.v((dnc0) obj, yoi1.g(((uu00) oiVar.c).b(new oi("audiobook-pre-release", false, new m4r(oiVar, (byte) 9))).map(new h9n(oiVar, (byte) 5))), false, new pld1(uw0Var, (byte) 10));
                return rih1Var;
            case 12:
                sdb1 sdb1Var = new sdb1(uw0Var, new hho((d0r) uw0Var.i), (byte) 13);
                ((rk11) uw0Var.g).getClass();
                Set setB = rk11.b(2);
                zld1 zld1Var = zld1.g;
                sld1 sld1Var = sld1.R0;
                LinkedHashMap linkedHashMap2 = ((ji50) obj).b;
                linkedHashMap2.put(ojd1.class, r4o1.Q(zld1Var, setB, sdb1Var, sld1Var));
                linkedHashMap2.put(cjd1.class, r4o1.Q(zld1.t, w7xVar, sld1.P0, sld1.T0));
                linkedHashMap2.put(fjd1.class, r4o1.Q(zld1.Y, w7xVar, new rld1(uw0Var, (byte) 6), sld1.U0));
                return rih1Var;
            default:
                two1.v((dnc0) obj, new cly0(d3p1.H((d0r) uw0Var.i, alm0.a, (String) uw0Var.e), (byte) 13), false, new pld1(uw0Var, (byte) 12));
                return rih1Var;
        }
    }
}
