package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class g9l1 {
    public final b9l1 a;
    public final fal1 b;
    public final m0t c;
    public final iac0 d;
    public final q9l1 e;
    public final uwm0 f;
    public final llm g;
    public r091 h;
    public xab1 i;
    public volatile vq71 j;
    public final ek2 k;
    public xab1 l;
    public boolean m;
    public int n;
    public final bpb1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xe01 f15p;

    public g9l1(b9l1 b9l1Var, fal1 fal1Var, m0t m0tVar, iac0 iac0Var, q9l1 q9l1Var, uwm0 uwm0Var) {
        this.a = b9l1Var;
        this.b = fal1Var;
        this.c = m0tVar;
        this.d = iac0Var;
        this.e = q9l1Var;
        this.f = uwm0Var;
        j0d1 j0d1VarB = guo1.B();
        fns fnsVar = igu.a;
        this.g = smo1.e(flo1.l(j0d1VarB, pyf0.a.f));
        this.k = new ek2(this, (byte) 26);
        bpb1 bpb1VarB = gio1.b(lt71.a);
        this.o = bpb1VarB;
        this.f15p = d5p1.h(bpb1VarB);
    }

    public final void a() {
        xab1 xab1Var = this.i;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.i = null;
        r091 r091Var = this.h;
        if (r091Var != null) {
            r091Var.j();
        }
        r091 r091Var2 = this.h;
        if (r091Var2 != null) {
            r091Var2.g();
        }
        this.h = null;
        e(lt71.a);
        this.j = null;
        xab1 xab1Var2 = this.l;
        if (xab1Var2 != null) {
            xab1Var2.d((CancellationException) null);
        }
        this.l = null;
        this.d.getLifecycle().d(this.k);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0046  */
    public final void b(vq71 vq71Var, boolean z) {
        mt71 jt71Var;
        c9l1 c9l1Var;
        xab1 xab1Var = this.i;
        sju sjuVar = null;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.i = null;
        if (((mt71) this.o.getValue()) instanceof kt71) {
            r091 r091Var = this.h;
            if (r091Var != null) {
                r091Var.j();
            }
            e(lt71.a);
        }
        this.j = vq71Var;
        r091 r091VarA = this.a.a(this.h);
        if (r091VarA != null) {
            ual1 ual1Var = vq71Var.e;
            if (ual1Var instanceof tal1) {
                String str = vq71Var.d;
                if (str == null) {
                    str = "e57a3dcbd5174b20a9bfa81db99ec7d2";
                } else {
                    if (ihc1.y0(str)) {
                        str = null;
                    }
                    if (str == null) {
                        str = "e57a3dcbd5174b20a9bfa81db99ec7d2";
                    }
                }
                tal1 tal1Var = (tal1) ual1Var;
                c9l1Var = new c9l1(new gec1(str), tal1Var.a, tal1Var.b);
            } else {
                if (!(ual1Var instanceof sal1)) {
                    eg.o();
                    return;
                }
                c9l1Var = new c9l1(fec1.c, "", "");
            }
            ujo1 ujo1Var = c9l1Var.a;
            String str2 = c9l1Var.b;
            String str3 = c9l1Var.c;
            q9l1 q9l1Var = this.e;
            ksm0 ksm0Var = new ksm0(ujo1Var, str2, q9l1Var.m, q9l1Var.f39p, "", "", str3, q9l1Var.e, q9l1Var.l);
            String str4 = vq71Var.b;
            Integer num = vq71Var.f;
            lsm0 lsm0Var = new lsm0(str4, ksm0Var, true, false, (jsm0) null, 0L, num != null ? new ism0(((long) num.intValue()) * 1000) : null, (String) null, true, 0, 1720);
            if (!u890.j(ebp1.n(r091VarA), lsm0Var)) {
                r091VarA.b(lsm0Var);
            }
            if (z) {
                if (((Boolean) this.b.d.getValue()).booleanValue()) {
                    r091VarA.c();
                } else {
                    r091VarA.k();
                }
                uwm0 uwm0Var = this.f;
                r091.f(r091VarA, uwm0Var.a(vq71Var.b, new zem0(uwm0Var, (byte) 3)), this.e.f.b, nky0.a, 4);
            }
            this.i = fn31.T(this.g, (o8n) null, 0, new gqj1((Object) r091VarA, (Object) this, (lnm) sjuVar, (byte) 12), 3);
        } else {
            r091VarA = null;
        }
        this.h = r091VarA;
        vq71 vq71Var2 = this.j;
        if (z) {
            jt71Var = new kt71(vq71Var2 != null ? vq71Var2.g : null);
        } else {
            jt71Var = new jt71(vq71Var2 != null ? vq71Var2.g : null);
        }
        e(jt71Var);
    }

    public final void c(String str, ual1 ual1Var, Integer num, sju sjuVar) {
        vq71 vq71Var;
        vq71 vq71Var2 = this.j;
        if (u890.j(vq71Var2 != null ? vq71Var2.b : null, str) || (vq71Var = this.j) == null) {
            return;
        }
        b(new vq71(vq71Var.a, str, true, vq71Var.d, ual1Var, num, sjuVar), true);
    }

    public final void d() {
        r091 r091Var;
        this.n = 1;
        if (!this.m || (r091Var = this.h) == null) {
            return;
        }
        if (((Boolean) this.b.d.getValue()).booleanValue()) {
            r091Var.c();
        } else {
            r091Var.k();
        }
        uwm0 uwm0Var = this.f;
        vq71 vq71Var = this.j;
        String str = vq71Var != null ? vq71Var.b : null;
        if (str == null) {
            str = "";
        }
        r091.f(r091Var, uwm0Var.a(str, new zem0(uwm0Var, (byte) 3)), this.e.f.b, nky0.a, 4);
        vq71 vq71Var2 = this.j;
        e(new kt71(vq71Var2 != null ? vq71Var2.g : null));
    }

    public final void e(mt71 mt71Var) {
        bpb1 bpb1Var = this.o;
        bpb1Var.getClass();
        bpb1Var.m((Object) null, mt71Var);
    }

    public final boolean f(vq71 vq71Var) {
        boolean z = vq71Var != null && vq71Var.c;
        int i = this.n;
        return this.m && ((z && (i != 2)) || (i == 1));
    }
}
