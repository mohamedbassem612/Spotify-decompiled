package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dj2 implements p090 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ dj2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [byte] */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v7, types: [int] */
    /* JADX WARN: Type inference failed for: r3v8 */
    public final ry21 a(uf01 uf01Var) {
        ln21 ln21Var;
        String str;
        Integer num;
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ln21 ln21Var2 = uf01Var.e;
                ?? IntValue = 0;
                IntValue = 0;
                kj2 kj2Var = (kj2) jo31.t(o6x.a, new bj2(this, null, IntValue));
                String strValueOf = "UNKNOWN";
                if (kj2Var instanceof jj2) {
                    ci2 ci2Var = ((jj2) kj2Var).a;
                    uh2 uh2Var = ci2Var.b;
                    int i = uh2Var != null ? uh2Var.a : 0;
                    if (uh2Var != null && (num = uh2Var.b) != null) {
                        IntValue = num.intValue();
                    }
                    if (i != 0) {
                        strValueOf = IntValue == 0 ? String.valueOf(i) : ab80.m(i, (int) IntValue, "-");
                    }
                    ne neVarB = ln21Var2.b();
                    ((t360) neVarB.c).b("x-age-signal-status", kk0.z(ci2Var.a));
                    ((t360) neVarB.c).b("x-age-signal-range", strValueOf);
                    ((t360) neVarB.c).b("x-age-signal-source", kk0.y(ci2Var.d));
                    int i2 = ci2Var.c;
                    if (i2 == 1) {
                        str = "PENDING";
                    } else if (i2 == 2) {
                        str = "DENIED";
                    } else if (i2 == 3) {
                        str = "APPROVED";
                    } else {
                        if (i2 != 4) {
                            throw null;
                        }
                        str = "NOT_APPLICABLE";
                    }
                    ((t360) neVarB.c).b("x-age-signal-change-status", str);
                    ln21Var = new ln21(neVarB);
                } else {
                    if (!(kj2Var instanceof ij2)) {
                        eg.o();
                        return null;
                    }
                    ne neVarB2 = ln21Var2.b();
                    ((t360) neVarB2.c).b("x-age-signal-status", "UNKNOWN");
                    ln21Var = new ln21(neVarB2);
                }
                return uf01Var.b(ln21Var);
            default:
                ln21 ln21Var3 = uf01Var.e;
                if (ln21Var3.c.c("Time-Zone") == null) {
                    ne neVarB3 = ln21Var3.b();
                    ((t360) neVarB3.c).g("Time-Zone", ((yqg) this.b).g().getID());
                    ln21Var3 = new ln21(neVarB3);
                }
                return uf01Var.b(ln21Var3);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:40|21|(1:24)|32) */
    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    /* JADX WARN: Code duplicated, block: B:30:0x0082  */
    /* JADX WARN: Code duplicated, block: B:33:0x0095  */
    /* JADX WARN: Code duplicated, block: B:35:0x0097 A[PHI: r1 r9
      0x0097: PHI (r1v7 int) = (r1v1 int), (r1v8 int) binds: [B:29:0x0080, B:34:0x0096] A[DONT_GENERATE, DONT_INLINE]
      0x0097: PHI (r9v5 int) = (r9v1 int), (r9v6 int) binds: [B:29:0x0080, B:34:0x0096] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x009a  */
    /* JADX WARN: Code duplicated, block: B:40:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        r13 = 0;
        r1 = r7;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0080 -> B:35:0x0097). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0095 -> B:34:0x0096). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(p.onm r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof p.cj2
            if (r0 == 0) goto L13
            r0 = r13
            p.cj2 r0 = (p.cj2) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            p.cj2 r0 = new p.cj2
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.e
            int r1 = r0.g
            r2 = 0
            r3 = 2
            r4 = 1
            r5 = 0
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L46
            if (r1 == r4) goto L37
            if (r1 != r3) goto L31
            int r1 = r0.b
            int r7 = r0.a
            p.hm5.M(r13)
            goto L96
        L31:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r12)
            return r5
        L37:
            int r1 = r0.d
            int r7 = r0.c
            int r8 = r0.b
            int r9 = r0.a
            p.hm5.M(r13)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L43
            goto L68
        L43:
            r13 = r1
            r1 = r8
            goto L6d
        L46:
            p.hm5.M(r13)
            r13 = 3
            r9 = r13
            r7 = r2
        L4c:
            if (r7 >= r9) goto L9a
            p.bj2 r13 = new p.bj2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6b
            r13.<init>(r12, r5, r4)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6b
            r0.a = r9     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6b
            r0.b = r7     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6b
            r0.c = r7     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6b
            r0.d = r2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6b
            r0.g = r4     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6b
            r10 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r13 = p.rc2.M(r10, r13, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6b
            if (r13 != r6) goto L66
            goto L94
        L66:
            r1 = r2
            r8 = r7
        L68:
            p.kj2 r13 = (p.kj2) r13     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L43
            return r13
        L6b:
            r13 = r2
            r1 = r7
        L6d:
            int r8 = r7 + 1
            java.lang.String r10 = "Timeout on attempt "
            java.lang.String r11 = "/3 for interceptor"
            java.lang.String r8 = p.gvg.e(r8, r10, r11)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r10 = "AgeSignalInterceptor"
            com.spotify.base.java.logging.Logger.k(r10, r8)
            if (r7 >= r3) goto L97
            r0.a = r9
            r0.b = r1
            r0.c = r7
            r0.d = r13
            r0.g = r3
            r7 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r13 = p.hap1.i(r7, r0)
            if (r13 != r6) goto L95
        L94:
            return r6
        L95:
            r7 = r9
        L96:
            r9 = r7
        L97:
            int r7 = r1 + 1
            goto L4c
        L9a:
            p.ij2 r12 = new p.ij2
            p.zi2 r13 = new p.zi2
            r0 = 5
            r13.<init>(r0)
            r12.<init>(r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p.dj2.b(p.onm):java.lang.Object");
    }
}
