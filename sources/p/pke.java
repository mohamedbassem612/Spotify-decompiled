package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pke extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fta b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pke(fta ftaVar, byte b) {
        super(1);
        this.a = b;
        this.b = ftaVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        int i = 0;
        fta ftaVar = this.b;
        switch (b) {
            case 0:
                c380 c380Var = (c380) ftaVar.c;
                ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
                for (Object obj2 : c380Var) {
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    String str = (String) obj2;
                    arrayList.add(new h8k1(new oke(str, i), str));
                    i = i2;
                }
                return new huz(new hj50(arrayList, (ioj0) null), (byte) 10);
            case 1:
                return new uv11(((oke) obj).a, (String) ftaVar.b, (Integer) null, (String) null, (cqs0) null, (tv11) null, 0, 240);
            default:
                ji50 ji50Var = (ji50) obj;
                i3b i3bVar = (i3b) ftaVar.e;
                d0r d0rVar = ji50Var.a;
                zs11 zs11Var = (zs11) i3bVar.b;
                o27 o27Var = new o27(2, 2, (l1d) null);
                smc0 smc0VarN = k4p1.n();
                jd11 jd11Var = rc11.a;
                smc0VarN.add(new l4r(new xv00(jd11Var.b(jo70.class)), 2, rje.R0, new j4r(rje.N0), rje.S0));
                smc0VarN.add(new l4r(new xv00(jd11Var.b(xkk1.class)), 2, rje.T0, new j4r(rje.O0), rje.U0));
                smc0VarN.add(new l4r(new xv00(jd11Var.b(hll.class)), 2, rje.V0, new j4r(rje.P0), rje.W0));
                ji50Var.b.put(oke.class, new r3r(new sv51(new xzq(zs11Var.a(d0rVar, new ls11((ds11) null, (ds11) null, (ds11) null, (ds11) null, (iu30) null, (iu30) null, (qrk) null, (iu30) null, (iu30) null, (yt11) null, new l7c((byte) 1), 2, o27Var, (gye1) null, npc1.a, (sb2) null, (rru) null, false, (o3r) null, (o3r) null, (o3r) null, (o3r) null, new o3r(k4p1.k(smc0VarN), rje.Q0, false), (o3r) null, (cv11) null, (y5z) null, (bnw0) null, new bt11(true), 0, (o3r) null, -39870001, 503), (nu11) null), new pke(ftaVar, (byte) 1)), (aod) ftaVar.d, (String) ftaVar.b), new cka(ftaVar, (byte) 25), 4));
                return rih1.a;
        }
    }
}
