package p;

import android.app.Activity;
import android.util.Size;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dj41 {
    public final iac0 a;
    public final hce1 b;
    public final a050 c;
    public final String d;
    public final Long e;
    public final mdg1 f;
    public final iae1 g;
    public final sj30 h;
    public final q8n i;
    public final bpb1 j;
    public final bpb1 k;
    public final law0 l;
    public final uq70 m;
    public erw0 n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f37p;

    public dj41(Activity activity, iac0 iac0Var, hce1 hce1Var, a050 a050Var, String str, Long l, mdg1 mdg1Var, iae1 iae1Var, sj30 sj30Var, q8n q8nVar) {
        this.a = iac0Var;
        this.b = hce1Var;
        this.c = a050Var;
        this.d = str;
        this.e = l;
        this.f = mdg1Var;
        this.g = iae1Var;
        this.h = sj30Var;
        this.i = q8nVar;
        bpb1 bpb1VarB = gio1.b(wi41.a);
        this.j = bpb1VarB;
        this.k = bpb1VarB;
        this.l = new rpv0((byte) 3).d();
        fey feyVar = new fey((byte) 22);
        ((xdn0) feyVar.b).r(xq70.b, 0);
        ((xdn0) feyVar.b).r(cx70.U, new ft21(bbn.h, new gt21(new Size(1600, 1600)), 1));
        xq70 xq70Var = new xq70(eqq0.b((xdn0) feyVar.b));
        cx70.C(xq70Var);
        uq70 uq70Var = new uq70(xq70Var);
        uq70Var.D(Executors.newSingleThreadExecutor(), new tz01(this, (byte) 12));
        this.m = uq70Var;
        Object obj = qok0.b;
        synchronized (obj) {
            if (qok0.c == null) {
                synchronized (obj) {
                    qok0.d(activity, dsd1.a);
                }
            }
        }
        erw0 erw0Var = erw0.g;
        dce dceVarZ = crm0.z(activity);
        dceVarZ.b(new aih0(this, dceVarZ, false, (byte) 21), x74.N(activity));
        fn31.T(cto1.q(iac0Var), null, 0, new bj41(this, (lnm) null, (byte) 0), 3);
        fn31.T(cto1.q(iac0Var), null, 0, new bj41(this, (lnm) null, (byte) 1), 3);
    }

    public final void f() {
        erw0 erw0Var;
        if (this.f37p || (erw0Var = this.n) == null) {
            return;
        }
        this.f37p = true;
        erw0Var.f();
        try {
            erw0Var.a(this.a, u4d.c, this.l, this.m);
        } catch (Exception e) {
            ti41 ti41Var = new ti41(e);
            bpb1 bpb1Var = this.j;
            bpb1Var.getClass();
            bpb1Var.m((Object) null, ti41Var);
        }
    }
}
