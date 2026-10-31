package p;

import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e8i1 {
    public static final long l;
    public static final /* synthetic */ int m = 0;
    public final lik1 a;
    public final jl21 b;
    public final j0a1 c;
    public final d7b d;
    public final jed0 e;
    public final y621 f;
    public final vcd0 g;
    public final hgd0 h;
    public final x860 i;
    public final kbd j;
    public final xy91 k;

    static {
        ytw0 ytw0Var = jfv.b;
        l = fdg1.k0(5, ngv.e);
    }

    public e8i1(lik1 lik1Var, jl21 jl21Var, j0a1 j0a1Var, d7b d7bVar, jed0 jed0Var, y621 y621Var, vcd0 vcd0Var, hgd0 hgd0Var, x860 x860Var, kbd kbdVar, xy91 xy91Var) {
        this.a = lik1Var;
        this.b = jl21Var;
        this.c = j0a1Var;
        this.d = d7bVar;
        this.e = jed0Var;
        this.f = y621Var;
        this.g = vcd0Var;
        this.h = hgd0Var;
        this.i = x860Var;
        this.j = kbdVar;
        this.k = xy91Var;
    }

    public final kjm a(z7i1 z7i1Var, a8i1 a8i1Var) {
        jhm jhmVar;
        jhm jhmVar2;
        String str = z7i1Var.a;
        String str2 = z7i1Var.d;
        String str3 = z7i1Var.c;
        Uri uri = str3 != null ? Uri.parse(str3) : Uri.EMPTY;
        uri.getClass();
        igm igmVar = new igm(str2, new wfm(uri, new hgm(z7i1Var.b, str2)), (String) null, 4);
        smc0 smc0VarN = k4p1.n();
        if (a8i1Var != null && (jhmVar2 = a8i1Var.b) != null) {
            smc0VarN.add(jhmVar2);
        }
        if (a8i1Var != null && (jhmVar = a8i1Var.c) != null) {
            smc0VarN.add(jhmVar);
        }
        if (a8i1Var != null && a8i1Var.a) {
            smc0VarN.add(this.f.a(str, str2));
        }
        smc0VarN.add(this.d.a(str, str2, new h7b(3)));
        smc0VarN.add(jl21.b(this.b, str, this.a));
        return new kjm(igmVar, (List) k4p1.k(smc0VarN), 4);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
    
        if (r8 == r5) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(p.z7i1 r7, p.onm r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p.c8i1
            if (r0 == 0) goto L13
            r0 = r8
            p.c8i1 r0 = (p.c8i1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.c8i1 r0 = new p.c8i1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2f
            p.z7i1 r7 = r0.a
            p.hm5.M(r8)     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L93
            goto L72
        L2d:
            r8 = move-exception
            goto L75
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L35:
            p.z7i1 r7 = r0.a
            p.hm5.M(r8)
            goto L58
        L3b:
            p.hm5.M(r8)
            p.hgd0 r8 = r6.h
            boolean r8 = r8.i()
            if (r8 != 0) goto L47
            goto L87
        L47:
            p.jed0 r8 = r6.e
            p.mnc0 r8 = r8.c()
            r0.a = r7
            r0.d = r3
            java.lang.Object r8 = p.b5p1.i(r8, r0)
            if (r8 != r5) goto L58
            goto L71
        L58:
            p.i9d0 r1 = p.i9d0.a
            boolean r8 = p.u890.j(r8, r1)
            if (r8 != 0) goto L61
            goto L87
        L61:
            p.vcd0 r8 = r6.g     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L93
            java.lang.String r1 = r7.b     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L93
            r0.a = r7     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L93
            r0.d = r2     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L93
            p.mdd0 r8 = (p.mdd0) r8     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L93
            java.lang.Enum r8 = r8.h(r1, r0)     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L93
            if (r8 != r5) goto L72
        L71:
            return r5
        L72:
            p.d5i1 r8 = (p.d5i1) r8     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L93
            goto L7b
        L75:
            p.m231 r0 = new p.m231
            r0.<init>(r8)
            r8 = r0
        L7b:
            boolean r0 = r8 instanceof p.m231
            p.d5i1 r1 = p.d5i1.c
            if (r0 == 0) goto L83
            r8 = r1
        L83:
            p.d5i1 r8 = (p.d5i1) r8
            if (r8 != r1) goto L88
        L87:
            return r4
        L88:
            java.lang.String r0 = r7.b
            java.lang.String r7 = r7.d
            p.x860 r6 = r6.i
            p.jhm r6 = r6.a(r0, r7, r8)
            return r6
        L93:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.e8i1.b(p.z7i1, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object c(z7i1 z7i1Var, onm onmVar) {
        d8i1 d8i1Var;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z;
        String str5;
        xy91 xy91Var;
        if (onmVar instanceof d8i1) {
            d8i1Var = (d8i1) onmVar;
            int i = d8i1Var.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                d8i1Var.t = i - Integer.MIN_VALUE;
            } else {
                d8i1Var = new d8i1(this, onmVar);
            }
        } else {
            d8i1Var = new d8i1(this, onmVar);
        }
        Object obj = d8i1Var.h;
        int i2 = d8i1Var.t;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            str = z7i1Var.a;
            str2 = z7i1Var.c;
            str3 = z7i1Var.b;
            String str6 = z7i1Var.d;
            str4 = z7i1Var.e;
            boolean zJ = u890.j(str3, str4);
            mr20 mr20VarB = this.j.b();
            d8i1Var.a = str;
            d8i1Var.b = str2;
            d8i1Var.c = str3;
            d8i1Var.d = str6;
            d8i1Var.e = str4;
            xy91 xy91Var2 = this.k;
            d8i1Var.f = xy91Var2;
            d8i1Var.g = zJ;
            d8i1Var.t = 1;
            Object objI = b5p1.i(mr20VarB, d8i1Var);
            if (objI != d9nVar) {
                z = zJ;
                str5 = str6;
                obj = objI;
                xy91Var = xy91Var2;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        boolean z2 = d8i1Var.g;
        xy91Var = d8i1Var.f;
        str4 = d8i1Var.e;
        String str7 = d8i1Var.d;
        str3 = d8i1Var.c;
        str2 = d8i1Var.b;
        str = d8i1Var.a;
        hm5.M(obj);
        z = z2;
        str5 = str7;
        qy91 qy91Var = new qy91(str3, str, str4, str2, str5, z, ((Boolean) obj).booleanValue(), true);
        d8i1Var.a = null;
        d8i1Var.b = null;
        d8i1Var.c = null;
        d8i1Var.d = null;
        d8i1Var.e = null;
        d8i1Var.f = null;
        d8i1Var.t = 2;
        Object objB = xy91Var.b(qy91Var, d8i1Var);
        return objB == d9nVar ? d9nVar : objB;
    }
}
