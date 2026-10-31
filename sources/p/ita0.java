package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ita0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ mta0 a;

    public ita0(mta0 mta0Var) {
        this.a = mta0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        if (r8.b(r6, r0) == r5) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r7, p.r261 r8, p.onm r9) throws kotlinx.coroutines.flow.internal.AbortFlowException {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p.hta0
            if (r0 == 0) goto L13
            r0 = r9
            p.hta0 r0 = (p.hta0) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.hta0 r0 = new p.hta0
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            int r1 = r0.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r9)
            goto L68
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L31:
            p.r261 r8 = r0.d
            p.hm5.M(r9)
            goto L56
        L37:
            p.hm5.M(r9)
            p.asa0 r7 = (p.asa0) r7
            p.mta0 r6 = r6.a
            p.rqa0 r6 = r6.c
            java.lang.String r7 = r7.a
            p.x880 r6 = r6.c
            p.x880 r9 = new p.x880
            r1 = 12
            r9.<init>(r6, r7, r1)
            r0.d = r8
            r0.b = r3
            java.lang.Object r9 = p.b5p1.i(r9, r0)
            if (r9 != r5) goto L56
            goto L67
        L56:
            java.lang.String r9 = (java.lang.String) r9
            p.fra0 r6 = new p.fra0
            r6.<init>(r9)
            r0.d = r4
            r0.b = r2
            java.lang.Object r6 = r8.b(r6, r0)
            if (r6 != r5) goto L68
        L67:
            return r5
        L68:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ita0.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
