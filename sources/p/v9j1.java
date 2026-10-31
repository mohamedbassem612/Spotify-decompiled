package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class v9j1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ r0s0 a;
    public final /* synthetic */ lr0 b;
    public final /* synthetic */ ruz c;

    public v9j1(r0s0 r0s0Var, lr0 lr0Var, ruz ruzVar) {
        this.a = r0s0Var;
        this.b = lr0Var;
        this.c = ruzVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if (r3.b.a(r3.c, r5, r4) == r2) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r4, p.r261 r5, p.onm r6) {
        /*
            r3 = this;
            boolean r4 = r6 instanceof p.u9j1
            if (r4 == 0) goto L13
            r4 = r6
            p.u9j1 r4 = (p.u9j1) r4
            int r5 = r4.b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r5 & r0
            if (r1 == 0) goto L13
            int r5 = r5 - r0
            r4.b = r5
            goto L18
        L13:
            p.u9j1 r4 = new p.u9j1
            r4.<init>(r3, r6)
        L18:
            java.lang.Object r5 = r4.a
            int r6 = r4.b
            r0 = 2
            r1 = 1
            p.d9n r2 = p.d9n.a
            if (r6 == 0) goto L37
            if (r6 == r1) goto L31
            if (r6 != r0) goto L2a
            p.hm5.M(r5)
            goto L6b
        L2a:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r3)
            r3 = 0
            return r3
        L31:
            int r6 = r4.d
            p.hm5.M(r5)
            goto L56
        L37:
            p.hm5.M(r5)
            p.r0s0 r5 = r3.a
            java.lang.Object r5 = r5.b
            io.reactivex.rxjava3.core.Flowable r5 = (io.reactivex.rxjava3.core.Flowable) r5
            p.mo9 r6 = p.mo9.N0
            io.reactivex.rxjava3.core.Flowable r5 = r5.j(r6)
            io.reactivex.rxjava3.core.Single r5 = r5.z()
            r6 = 0
            r4.d = r6
            r4.b = r1
            java.lang.Object r5 = p.fc11.j(r5, r4)
            if (r5 != r2) goto L56
            goto L6a
        L56:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r4.d = r6
            r4.b = r0
            p.lr0 r6 = r3.b
            p.ruz r3 = r3.c
            java.lang.Object r3 = r6.a(r3, r5, r4)
            if (r3 != r2) goto L6b
        L6a:
            return r2
        L6b:
            p.rih1 r3 = p.rih1.a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p.v9j1.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
