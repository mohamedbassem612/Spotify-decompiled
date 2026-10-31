package p;

import com.spotify.martini.martinidata.model.Mode;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tq10 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ uq10 a;
    public final /* synthetic */ lik1 b;
    public final /* synthetic */ Mode c;

    public tq10(uq10 uq10Var, lik1 lik1Var, Mode mode) {
        this.a = uq10Var;
        this.b = lik1Var;
        this.c = mode;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:25:0x005c A[Catch: Exception -> 0x0077, TryCatch #0 {Exception -> 0x0077, blocks: (B:16:0x0035, B:23:0x0056, B:25:0x005c, B:26:0x0064, B:28:0x0068, B:29:0x0070, B:30:0x0075), top: B:39:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0064 A[Catch: Exception -> 0x0077, TryCatch #0 {Exception -> 0x0077, blocks: (B:16:0x0035, B:23:0x0056, B:25:0x005c, B:26:0x0064, B:28:0x0068, B:29:0x0070, B:30:0x0075), top: B:39:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0068 A[Catch: Exception -> 0x0077, TryCatch #0 {Exception -> 0x0077, blocks: (B:16:0x0035, B:23:0x0056, B:25:0x005c, B:26:0x0064, B:28:0x0068, B:29:0x0070, B:30:0x0075), top: B:39:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0070 A[Catch: Exception -> 0x0077, TryCatch #0 {Exception -> 0x0077, blocks: (B:16:0x0035, B:23:0x0056, B:25:0x005c, B:26:0x0064, B:28:0x0068, B:29:0x0070, B:30:0x0075), top: B:39:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0088, code lost:
    
        if (r9.b(r8, r0) == r5) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r8, p.r261 r9, p.onm r10) throws kotlin.NoWhenBranchMatchedException {
        /*
            r7 = this;
            boolean r0 = r10 instanceof p.sq10
            if (r0 == 0) goto L13
            r0 = r10
            p.sq10 r0 = (p.sq10) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.sq10 r0 = new p.sq10
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.a
            int r1 = r0.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r10)
            goto L8b
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r4
        L31:
            p.kq10 r7 = r0.e
            p.r261 r9 = r0.d
            p.hm5.M(r10)     // Catch: java.lang.Exception -> L77
            goto L56
        L39:
            p.hm5.M(r10)
            p.kq10 r8 = (p.kq10) r8
            p.uq10 r10 = r7.a     // Catch: java.lang.Exception -> L76
            p.a9m r10 = r10.b     // Catch: java.lang.Exception -> L76
            java.lang.String r1 = r8.a     // Catch: java.lang.Exception -> L76
            p.lik1 r6 = r7.b     // Catch: java.lang.Exception -> L76
            com.spotify.martini.martinidata.model.Mode r7 = r7.c     // Catch: java.lang.Exception -> L76
            r0.d = r9     // Catch: java.lang.Exception -> L76
            r0.e = r8     // Catch: java.lang.Exception -> L76
            r0.b = r3     // Catch: java.lang.Exception -> L76
            java.lang.Object r10 = r10.d(r1, r6, r7, r0)     // Catch: java.lang.Exception -> L76
            if (r10 != r5) goto L55
            goto L8a
        L55:
            r7 = r8
        L56:
            p.q8m r10 = (p.q8m) r10     // Catch: java.lang.Exception -> L77
            boolean r8 = r10 instanceof p.p8m     // Catch: java.lang.Exception -> L77
            if (r8 == 0) goto L64
            p.cr10 r8 = new p.cr10     // Catch: java.lang.Exception -> L77
            java.lang.String r10 = r7.a     // Catch: java.lang.Exception -> L77
            r8.<init>(r10)     // Catch: java.lang.Exception -> L77
            goto L7e
        L64:
            boolean r8 = r10 instanceof p.o8m     // Catch: java.lang.Exception -> L77
            if (r8 == 0) goto L70
            p.br10 r8 = new p.br10     // Catch: java.lang.Exception -> L77
            java.lang.String r10 = r7.a     // Catch: java.lang.Exception -> L77
            r8.<init>(r10)     // Catch: java.lang.Exception -> L77
            goto L7e
        L70:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Exception -> L77
            r8.<init>()     // Catch: java.lang.Exception -> L77
            throw r8     // Catch: java.lang.Exception -> L77
        L76:
            r7 = r8
        L77:
            p.br10 r8 = new p.br10
            java.lang.String r7 = r7.a
            r8.<init>(r7)
        L7e:
            r0.d = r4
            r0.e = r4
            r0.b = r2
            java.lang.Object r7 = r9.b(r8, r0)
            if (r7 != r5) goto L8b
        L8a:
            return r5
        L8b:
            p.rih1 r7 = p.rih1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.tq10.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
