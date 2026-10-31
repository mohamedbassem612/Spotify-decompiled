package p;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wph1 implements vpx0 {
    public final da6 a;
    public final a1r0 b;
    public final nvh1 c;
    public final gg11 d;
    public final c9n e;
    public final iu30 f;
    public final bpb1 g = gio1.b((Object) null);
    public final x010 h;
    public final izg i;

    public wph1(da6 da6Var, rg4 rg4Var, a1r0 a1r0Var, nvh1 nvh1Var, gg11 gg11Var, c9n c9nVar, iu30 iu30Var) {
        this.a = da6Var;
        this.b = a1r0Var;
        this.c = nvh1Var;
        this.d = gg11Var;
        this.e = c9nVar;
        this.f = iu30Var;
        fn31.T(c9nVar, (o8n) null, 0, new b0f1(this, (lnm) null, (byte) 21), 3);
        this.h = new x010(da6Var.b, new huz(Boolean.valueOf(rg4Var.e()), (byte) 10), new lag0(this, (lnm) null, (byte) 16), (byte) 1);
        this.i = new izg((byte) 5);
    }

    public final Set b() {
        return this.d.i();
    }

    public final int c(rxx0 rxx0Var) {
        return 300;
    }

    public final void d(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1774747062);
        int i2 = (x340Var.i(this) ? 32 : 16) | i;
        boolean z = false;
        if (x340Var.Y(i2 & 1, (i2 & 17) != 16)) {
            ven0 ven0VarH = rwq.h(this.a.b, x340Var, 0);
            ven0 ven0VarH2 = rwq.h(this.g, x340Var, 0);
            mvh1 mvh1Var = (mvh1) ven0VarH2.getValue();
            if (mvh1Var == null) {
                mvh1Var = ((ea6) ven0VarH.getValue()).e;
            }
            mvh1 mvh1Var2 = mvh1Var;
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                vph1 vph1Var = new vph1(this, new Handler(Looper.getMainLooper()));
                x340Var.s0(vph1Var);
                objT = vph1Var;
            }
            vph1 vph1Var2 = (vph1) objT;
            if (((ea6) ven0VarH.getValue()).b == l2r0.a && ((mvh1) ven0VarH2.getValue()) == null) {
                z = true;
            }
            boolean zI = x340Var.i(this) | x340Var.i(mvh1Var2) | x340Var.i(ven0VarH) | x340Var.i(vph1Var2);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                odp0 odp0Var = new odp0(this, mvh1Var2, vph1Var2, ven0VarH, (byte) 24);
                x340Var.s0(odp0Var);
                objT2 = odp0Var;
            }
            tph1 tph1Var = new tph1(mvh1Var2, z, (Function0) objT2);
            otw.c(this.i, tph1Var, (qim0) null, wpb1.D("chip_update_cadence", this.i, tph1Var, x340Var, 6), x340Var, 0, 4);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wcf1(this, i, (byte) 28);
        }
    }

    public final void e(mvh1 mvh1Var) {
        String string;
        String string2;
        this.g.l(mvh1Var);
        ea6 ea6Var = (ea6) this.a.b.a.getValue();
        yk41 yk41Var = new yk41(mvh1Var);
        iu30 iu30Var = this.f;
        iu30Var.invoke(yk41Var);
        hab habVar = (hab) this.d.get(ea6Var.a);
        if (habVar != null) {
            byte b = habVar.a;
            ivh1 ivh1Var = ivh1.a;
            hvh1 hvh1Var = hvh1.a;
            jvh1 jvh1Var = jvh1.a;
            String string3 = null;
            Resources resources = habVar.b;
            switch (b) {
                case 0:
                    if (mvh1Var.equals(jvh1Var)) {
                        string3 = resources.getString(2131952861);
                        break;
                    } else if (mvh1Var.equals(hvh1Var)) {
                        string3 = resources.getString(2131952859);
                        break;
                    } else if (mvh1Var.equals(ivh1Var)) {
                        string3 = resources.getString(2131952860);
                        break;
                    } else if (mvh1Var instanceof kvh1) {
                        n7r n7rVar = (n7r) o7h.t0(((kvh1) mvh1Var).a - 1, n7r.i);
                        if (n7rVar == null) {
                            n7rVar = n7r.a;
                        }
                        switch (n7rVar.ordinal()) {
                            case 0:
                                string = resources.getString(2131952865);
                                string3 = string;
                                string3.getClass();
                                break;
                            case 1:
                                string = resources.getString(2131952863);
                                string3 = string;
                                string3.getClass();
                                break;
                            case 2:
                                string = resources.getString(2131952867);
                                string3 = string;
                                string3.getClass();
                                break;
                            case 3:
                                string = resources.getString(2131952868);
                                string3 = string;
                                string3.getClass();
                                break;
                            case 4:
                                string = resources.getString(2131952866);
                                string3 = string;
                                string3.getClass();
                                break;
                            case 5:
                                string = resources.getString(2131952862);
                                string3 = string;
                                string3.getClass();
                                break;
                            case 6:
                                string = resources.getString(2131952864);
                                string3 = string;
                                string3.getClass();
                                break;
                            default:
                                eg.o();
                                break;
                        }
                    } else {
                        eg.o();
                        break;
                    }
                    break;
                default:
                    if (mvh1Var.equals(jvh1Var)) {
                        string3 = resources.getString(2131952418);
                    } else if (mvh1Var.equals(hvh1Var)) {
                        string3 = resources.getString(2131952416);
                    } else if (mvh1Var.equals(ivh1Var)) {
                        string3 = resources.getString(2131952417);
                    } else if (!(mvh1Var instanceof kvh1)) {
                        eg.o();
                    } else {
                        switch (((kvh1) mvh1Var).a) {
                            case 1:
                                string2 = resources.getString(2131952422);
                                break;
                            case 2:
                                string2 = resources.getString(2131952420);
                                break;
                            case 3:
                                string2 = resources.getString(2131952424);
                                break;
                            case 4:
                                string2 = resources.getString(2131952425);
                                break;
                            case 5:
                                string2 = resources.getString(2131952423);
                                break;
                            case 6:
                                string2 = resources.getString(2131952419);
                                break;
                            case 7:
                                string2 = resources.getString(2131952421);
                                break;
                            default:
                                string2 = resources.getString(2131952418);
                                break;
                        }
                        string3 = string2;
                        string3.getClass();
                    }
                    break;
            }
            iu30Var.invoke(new ka81(string3));
        }
    }

    public final String getId() {
        return "update_cadence";
    }

    public final mr20 isVisible() {
        return this.h;
    }
}
