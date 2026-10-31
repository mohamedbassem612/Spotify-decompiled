package p;

import android.os.Trace;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class dfa implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ List b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ dfa(WorkDatabase workDatabase, vwl1 vwl1Var, vwl1 vwl1Var2, List list, String str, Set set, boolean z) {
        this.d = workDatabase;
        this.e = vwl1Var;
        this.f = vwl1Var2;
        this.b = list;
        this.g = str;
        this.h = set;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ten0 ten0VarC;
        byte b = this.a;
        Object obj = this.h;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                lee1 lee1Var = (lee1) obj5;
                flb0 flb0Var = (flb0) obj4;
                af5 af5Var = (af5) obj3;
                wat watVar = (wat) obj2;
                f930 f930Var = (f930) obj;
                boolean z = this.c;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    ten0 ten0VarH = pv91.h();
                    ten0 ten0Var = ten0VarH instanceof ten0 ? ten0VarH : null;
                    if (ten0Var == null || (ten0VarC = ten0Var.C((iu30) null, (iu30) null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        jv91 jv91VarJ = ten0VarC.j();
                        try {
                            lee1 lee1VarF = z6p1.F(lee1Var, flb0Var);
                            z6x z6xVar = this.b;
                            if (z6xVar == null) {
                                z6xVar = z6x.a;
                            }
                            wp20 wp20Var = new wp20((List) z6xVar, af5Var, watVar, f930Var, lee1VarF, z);
                            wp20Var.d();
                            wp20Var.e();
                            jv91.q(jv91VarJ);
                            ten0VarC.w().q();
                            ten0VarC.c();
                            Trace.endSection();
                            return;
                        } catch (Throwable th) {
                            jv91.q(jv91VarJ);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            ten0VarC.c();
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    Trace.endSection();
                    throw th4;
                }
            default:
                WorkDatabase workDatabase = (WorkDatabase) obj5;
                vwl1 vwl1Var = (vwl1) obj4;
                vwl1 vwl1Var2 = (vwl1) obj3;
                String str = (String) obj2;
                Set set = (Set) obj;
                final dxl1 dxl1VarA = workDatabase.A();
                gxl1 gxl1VarB = workDatabase.B();
                vwl1 vwl1VarB = vwl1.b(vwl1Var2, (String) null, vwl1Var.b, (String) null, (ewq) null, vwl1Var.k, vwl1Var.n, vwl1Var.s, vwl1Var.t + 1, vwl1Var.u, vwl1Var.v, 29613053);
                if (vwl1Var2.v == 1) {
                    vwl1VarB.u = vwl1Var2.u;
                    vwl1VarB.v++;
                }
                final vwl1 vwl1VarT = y7y0.T(vwl1VarB);
                final byte b2 = 0;
                qyo1.x(dxl1VarA.a, false, true, new iu30() { // from class: p.cxl1
                    public final Object invoke(Object obj6) {
                        byte b3 = b2;
                        rih1 rih1Var = rih1.a;
                        vwl1 vwl1Var3 = vwl1VarT;
                        dxl1 dxl1Var = dxl1VarA;
                        y341 y341Var = (y341) obj6;
                        switch (b3) {
                            case 0:
                                dxl1Var.c.A(y341Var, vwl1Var3);
                                break;
                            default:
                                dxl1Var.b.D(y341Var, vwl1Var3);
                                break;
                        }
                        return rih1Var;
                    }
                });
                qyo1.x(gxl1VarB.a, false, true, new fxl1(str, (byte) 0));
                gxl1VarB.b(str, set);
                if (this.c) {
                    return;
                }
                dxl1VarA.f(-1L, str);
                workDatabase.z().a(str);
                return;
        }
    }

    public /* synthetic */ dfa(lee1 lee1Var, flb0 flb0Var, List list, af5 af5Var, wat watVar, f930 f930Var, boolean z) {
        this.d = lee1Var;
        this.e = flb0Var;
        this.b = list;
        this.f = af5Var;
        this.g = watVar;
        this.h = f930Var;
        this.c = z;
    }
}
