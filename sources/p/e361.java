package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class e361 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ w3f a;

    public e361(w3f w3fVar) {
        this.a = w3fVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0085, code lost:
    
        if (r8.b(r1, r0) == r5) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r7, p.r261 r8, p.onm r9) throws kotlin.NoWhenBranchMatchedException {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p.d361
            if (r0 == 0) goto L13
            r0 = r9
            p.d361 r0 = (p.d361) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.d361 r0 = new p.d361
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            int r1 = r0.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r9)
            goto L88
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L31:
            p.f361 r6 = r0.e
            p.r261 r8 = r0.d
            p.hm5.M(r9)
            goto L52
        L39:
            p.hm5.M(r9)
            p.f361 r7 = (p.f361) r7
            java.lang.String r9 = r7.a
            byte r1 = r7.b
            r0.d = r8
            r0.e = r7
            r0.b = r3
            p.w3f r6 = r6.a
            java.lang.Object r9 = r6.a(r1, r9, r0)
            if (r9 != r5) goto L51
            goto L87
        L51:
            r6 = r7
        L52:
            p.q361 r9 = (p.q361) r9
            boolean r7 = r9 instanceof p.p361
            if (r7 == 0) goto L66
            p.p361 r9 = (p.p361) r9
            java.lang.String r7 = r9.a
            java.lang.String r9 = r9.b
            java.lang.String r6 = r6.c
            p.k361 r1 = new p.k361
            r1.<init>(r9, r7, r6)
            goto L7b
        L66:
            p.o361 r6 = p.o361.a
            boolean r6 = p.u890.j(r9, r6)
            if (r6 == 0) goto L71
            p.j361 r1 = p.j361.a
            goto L7b
        L71:
            p.n361 r6 = p.n361.a
            boolean r6 = p.u890.j(r9, r6)
            if (r6 == 0) goto L8b
            p.i361 r1 = p.i361.a
        L7b:
            r0.d = r4
            r0.e = r4
            r0.b = r2
            java.lang.Object r6 = r8.b(r1, r0)
            if (r6 != r5) goto L88
        L87:
            return r5
        L88:
            p.rih1 r6 = p.rih1.a
            return r6
        L8b:
            p.eg.o()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.e361.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
