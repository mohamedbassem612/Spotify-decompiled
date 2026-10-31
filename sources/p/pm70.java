package p;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pm70 implements vpx0 {
    public final /* synthetic */ byte a;
    public final Set b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public pm70(da6 da6Var, tm tmVar, v67 v67Var, c9n c9nVar, iu30 iu30Var) {
        this.a = (byte) 0;
        this.c = tmVar;
        fn31.T(c9nVar, (o8n) null, 0, new lm70(v67Var, iu30Var, null, (byte) 0), 3);
        fn31.T(c9nVar, (o8n) null, 0, new lm70(v67Var, iu30Var, null, (byte) 1), 3);
        this.d = "ideas";
        rxx0 rxx0Var = rxx0.a;
        rxx0 rxx0Var2 = rxx0.b;
        this.b = f46.S0(new rxx0[]{rxx0Var, rxx0Var2});
        this.e = new evz(da6Var.b, this, (byte) 27);
        this.f = sqg0.J(new mmr0[]{new mmr0(rxx0Var, new mm70(400, hh60.a1)), new mmr0(rxx0Var2, new mm70(500, hh60.b1))});
    }

    public final Set b() {
        byte b = this.a;
        return this.b;
    }

    public final int c(rxx0 rxx0Var) {
        switch (this.a) {
            case 0:
                mm70 mm70Var = (mm70) ((Map) this.f).get(rxx0Var);
                if (mm70Var != null) {
                    return mm70Var.a;
                }
                eg.m("PageType not defined - register in chipConfigMap");
                return 0;
            case 1:
                return 550;
            case 2:
                return 100;
            default:
                return 600;
        }
    }

    public final void d(b0k b0kVar, int i) {
        b0k b0kVar2;
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                tm tmVar = (tm) obj2;
                b0k b0kVar3 = (x340) b0kVar;
                b0kVar3.k0(-1236978050);
                int i2 = i | (b0kVar3.i(this) ? 32 : 16);
                if (b0kVar3.Y(i2 & 1, (i2 & 17) != 16)) {
                    rih1 rih1Var = rih1.a;
                    b0kVar2 = b0kVar3;
                    otw.c(tmVar, rih1Var, (qim0) null, wpb1.D("chip_ideas", tmVar, rih1Var, b0kVar3, 390), b0kVar2, 48, 4);
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                }
                h311 h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new jb50(this, i, (byte) 13);
                }
                break;
            case 1:
                g891 g891Var = (g891) obj;
                m4c m4cVar = fkj0.X;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-897359735);
                int i3 = i | (x340Var.i(this) ? 32 : 16);
                if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
                    ven0 ven0VarH = rwq.h(((da6) obj2).b, x340Var, 0);
                    g431 g431VarH = ((cir0) x340Var.k(k2r0.a)).h();
                    ven0 ven0VarS = v8r.s((iu30) this.e, x340Var);
                    boolean zG = x340Var.g(g431VarH);
                    Object objT = x340Var.T();
                    if (zG || objT == m4cVar) {
                        objT = g431VarH.a(uj1.t, new yw1(ven0VarS, (byte) 3));
                        x340Var.s0(objT);
                    }
                    b431 b431Var = (b431) objT;
                    String str = ((ea6) ven0VarH.getValue()).h;
                    boolean zI = x340Var.i(b431Var) | x340Var.i(ven0VarH);
                    Object objT2 = x340Var.T();
                    if (zI || objT2 == m4cVar) {
                        objT2 = new bsc0(b431Var, ven0VarH, (byte) 10);
                        x340Var.s0(objT2);
                    }
                    she0 she0Var = new she0(str, (Function0) objT2);
                    otw.c(g891Var, she0Var, nim0.a, wpb1.D("chip_location", g891Var, she0Var, x340Var, 6), x340Var, 384, 0);
                } else {
                    x340Var.b0();
                }
                h311 h311VarV2 = x340Var.v();
                if (h311VarV2 != null) {
                    h311VarV2.d = new s2c0(this, i, (byte) 21);
                }
                break;
            case 2:
                x340 x340Var2 = (x340) b0kVar;
                x340Var2.k0(-1991700668);
                int i4 = i | (x340Var2.i(this) ? 32 : 16);
                if (x340Var2.Y(i4 & 1, (i4 & 17) != 16)) {
                    ven0 ven0VarH2 = rwq.h(((da6) obj2).b, x340Var2, 0);
                    boolean zI2 = x340Var2.i(this) | x340Var2.i(ven0VarH2);
                    Object objT3 = x340Var2.T();
                    if (zI2 || objT3 == fkj0.X) {
                        objT3 = new g4k1(this, ven0VarH2, (byte) 3);
                        x340Var2.s0(objT3);
                    }
                    jak1 jak1Var = new jak1((Function0) objT3);
                    Object obj3 = this.f;
                    otw.c((izg) obj3, jak1Var, (qim0) null, wpb1.D("chip_view_errors", (izg) obj3, jak1Var, x340Var2, 6), x340Var2, 0, 4);
                } else {
                    x340Var2.b0();
                }
                h311 h311VarV3 = x340Var2.v();
                if (h311VarV3 != null) {
                    h311VarV3.d = new fak1(this, i, (byte) 1);
                }
                break;
            default:
                g891 g891Var2 = (g891) obj;
                x340 x340Var3 = (x340) b0kVar;
                x340Var3.k0(-953231043);
                int i5 = i | (x340Var3.i(this) ? 32 : 16);
                if (x340Var3.Y(i5 & 1, (i5 & 17) != 16)) {
                    String str2 = ((ea6) rwq.h(((da6) obj2).b, x340Var3, 0).getValue()).g;
                    boolean zI3 = x340Var3.i(this);
                    Object objT4 = x340Var3.T();
                    if (zI3 || objT4 == fkj0.X) {
                        objT4 = new bkk1(this, (byte) 3);
                        x340Var3.s0(objT4);
                    }
                    xpk1 xpk1Var = new xpk1(str2, (Function0) objT4);
                    otw.c(g891Var2, xpk1Var, (qim0) null, wpb1.D("chip_voices", g891Var2, xpk1Var, x340Var3, 6), x340Var3, 0, 4);
                } else {
                    x340Var3.b0();
                }
                h311 h311VarV4 = x340Var3.v();
                if (h311VarV4 != null) {
                    h311VarV4.d = new fak1(this, i, (byte) 3);
                }
                break;
        }
    }

    public final String getId() {
        switch (this.a) {
            case 0:
                return (String) this.d;
            case 1:
                return "location";
            case 2:
                return "view_errors";
            default:
                return "voices";
        }
    }

    public final mr20 isVisible() {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.f;
        switch (b) {
            case 0:
                return (evz) obj;
            case 1:
                return (b8d0) obj2;
            case 2:
                return (vlj1) obj;
            default:
                return (vlj1) obj2;
        }
    }

    public pm70(da6 da6Var, iu30 iu30Var) {
        this.a = (byte) 2;
        this.c = da6Var;
        this.d = iu30Var;
        this.b = Collections.singleton(rxx0.a);
        this.e = new vlj1(da6Var.b, this, (byte) 5);
        this.f = new izg((byte) 6);
    }

    public pm70(da6 da6Var, g891 g891Var, iu30 iu30Var) {
        this.a = (byte) 1;
        this.c = da6Var;
        this.d = g891Var;
        this.e = iu30Var;
        this.b = Collections.singleton(rxx0.b);
        this.f = new b8d0(da6Var.b, this, (byte) 13);
    }

    public pm70(da6 da6Var, g891 g891Var, iu30 iu30Var, byte b) {
        this.a = (byte) 3;
        this.c = da6Var;
        this.d = g891Var;
        this.e = iu30Var;
        this.b = Collections.singleton(rxx0.b);
        this.f = new vlj1(da6Var.b, this, (byte) 6);
    }
}
