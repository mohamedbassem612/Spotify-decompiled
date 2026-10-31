package p;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p1l implements vpx0 {
    public final da6 a;
    public final frh1 b;
    public final hz5 c;
    public final u9b d;
    public final a1r0 e;
    public final c9n f;
    public final q8n g;
    public final iu30 h;
    public final Set i = Collections.singleton(rxx0.b);
    public final qbk j;
    public final bpb1 k;
    public final xe01 l;
    public xab1 m;

    public p1l(da6 da6Var, frh1 frh1Var, hz5 hz5Var, u9b u9bVar, a1r0 a1r0Var, c9n c9nVar, q8n q8nVar, iu30 iu30Var) {
        this.a = da6Var;
        this.b = frh1Var;
        this.c = hz5Var;
        this.d = u9bVar;
        this.e = a1r0Var;
        this.f = c9nVar;
        this.g = q8nVar;
        this.h = iu30Var;
        xe01 xe01Var = da6Var.b;
        this.j = new qbk(xe01Var, this, (byte) 6);
        bpb1 bpb1VarB = gio1.b((Object) null);
        this.k = bpb1VarB;
        this.l = d5p1.t(new x010(xe01Var, bpb1VarB, new xq0(3, this, p1l.class, "warningState", "warningState(Lcom/spotify/promptedplaylists/promptchips/PromptChipContext;Lcom/spotify/bluejay/promptchips/connectapps/impl/ConnectAppsPromptChip$RefreshedWarning;)Z", 4, (byte) 3), (byte) 1), c9nVar, ey71.a, Boolean.valueOf(f((ea6) xe01Var.a.getValue(), (n1l) bpb1VarB.getValue())));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0019  */
    public static boolean f(ea6 ea6Var, n1l n1lVar) {
        boolean z;
        if (ea6Var.b != l2r0.b) {
            return false;
        }
        if (n1lVar == null) {
            z = ea6Var.i;
        } else {
            if (!u890.j(n1lVar.a, ea6Var.c)) {
                n1lVar = null;
            }
            if (n1lVar != null) {
                z = n1lVar.b;
            } else {
                z = ea6Var.i;
            }
        }
        return z;
    }

    public final Set b() {
        return this.i;
    }

    public final int c(rxx0 rxx0Var) {
        return 400;
    }

    public final void d(b0k b0kVar, int i) {
        p1l p1lVar;
        b0k b0kVar2;
        Object obj = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-783850112);
        int i2 = (b0kVar3.i(this) ? 32 : 16) | i;
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            ven0 ven0VarH = rwq.h(this.l, b0kVar3, 0);
            ven0 ven0VarH2 = rwq.h(this.a.b, b0kVar3, 0);
            a1r0 a1r0Var = this.e;
            boolean zG = b0kVar3.g(a1r0Var);
            Object objT = b0kVar3.T();
            if (zG || objT == obj) {
                r1l r1lVar = new r1l(a1r0Var, new l1k(0, this, p1l.class, "refresh", "refresh$src_main_java_com_spotify_bluejay_promptchips_connectapps_impl_impl()V", 0, (byte) 2));
                b0kVar3.s0(r1lVar);
                objT = r1lVar;
            }
            r1l r1lVar2 = (r1l) objT;
            k8c0 k8c0Var = k8c0.ON_RESUME;
            boolean zI = b0kVar3.i(r1lVar2);
            Object objT2 = b0kVar3.T();
            if (zI || objT2 == obj) {
                objT2 = new vjh(r1lVar2, (byte) 21);
                b0kVar3.s0(objT2);
            }
            cso1.j(k8c0Var, (iac0) null, (Function0) objT2, b0kVar3, 6);
            g431 g431VarH = ((cir0) b0kVar3.k(k2r0.a)).h();
            ven0 ven0VarS = v8r.s(p1lVar.h, b0kVar3);
            boolean zG2 = b0kVar3.g(g431VarH);
            Object objT3 = b0kVar3.T();
            if (zG2 || objT3 == obj) {
                objT3 = g431VarH.a(uj1.q, new mff(this, ven0VarS, (byte) 1));
                b0kVar3.s0(objT3);
            }
            b431 b431Var = (b431) objT3;
            boolean zBooleanValue = ((Boolean) ven0VarH.getValue()).booleanValue();
            boolean zI2 = b0kVar3.i(ven0VarH2) | b0kVar3.i(b431Var) | b0kVar3.i(r1lVar2);
            Object objT4 = b0kVar3.T();
            if (zI2 || objT4 == obj) {
                objT4 = new o0d(b431Var, r1lVar2, ven0VarH2, (byte) 24);
                b0kVar3.s0(objT4);
            }
            l1l l1lVar = new l1l((iu30) objT4, zBooleanValue);
            hz5 hz5Var = p1lVar.c;
            b0kVar2 = b0kVar3;
            otw.c(hz5Var, l1lVar, nim0.a, wpb1.D("chip_connect_apps", hz5Var, l1lVar, b0kVar3, 6), b0kVar2, 384, 0);
        } else {
            p1lVar = this;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new boj(p1lVar, i, (byte) 25);
        }
    }

    public final void e() {
        ea6 ea6Var = (ea6) this.a.b.a.getValue();
        String str = ea6Var.c;
        if (ea6Var.b != l2r0.b || str == null) {
            return;
        }
        xab1 xab1Var = this.m;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.m = fn31.T(this.f, this.g, 0, new cuk(this, str, (lnm) null, (byte) 2), 2);
    }

    public final String getId() {
        return "connect_apps";
    }

    public final mr20 isVisible() {
        return this.j;
    }
}
