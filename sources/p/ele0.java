package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ele0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ uo5 a;

    public ele0(uo5 uo5Var) {
        this.a = uo5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0089, code lost:
    
        if (r8.b(r7, r0) == r5) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r7, p.r261 r8, p.onm r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p.dle0
            if (r0 == 0) goto L13
            r0 = r9
            p.dle0 r0 = (p.dle0) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.dle0 r0 = new p.dle0
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
            goto L8c
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L31:
            p.r261 r8 = r0.d
            p.hm5.M(r9)     // Catch: java.lang.Exception -> L7b
            goto L6f
        L37:
            p.hm5.M(r9)
            p.eke0 r7 = (p.eke0) r7
            p.jj40 r9 = r7.c
            p.jj40 r1 = p.jj40.c
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L8f
            p.uo5 r6 = r6.a     // Catch: java.lang.Exception -> L7b
            p.jj40 r7 = r7.c     // Catch: java.lang.Exception -> L7b
            int r7 = r7.b     // Catch: java.lang.Exception -> L7b
            r0.d = r8     // Catch: java.lang.Exception -> L7b
            r0.b = r3     // Catch: java.lang.Exception -> L7b
            p.c3c1 r9 = com.spotify.liveeventslocation.v1.userlocation.StoreUserLocationRequest.n()     // Catch: java.lang.Exception -> L7b
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Exception -> L7b
            r9.n(r7)     // Catch: java.lang.Exception -> L7b
            com.google.protobuf.h r7 = r9.build()     // Catch: java.lang.Exception -> L7b
            com.spotify.liveeventslocation.v1.userlocation.StoreUserLocationRequest r7 = (com.spotify.liveeventslocation.v1.userlocation.StoreUserLocationRequest) r7     // Catch: java.lang.Exception -> L7b
            java.lang.Object r6 = r6.b     // Catch: java.lang.Exception -> L7b
            p.cpd0 r6 = (p.cpd0) r6     // Catch: java.lang.Exception -> L7b
            r7.getClass()     // Catch: java.lang.Exception -> L7b
            java.lang.Object r9 = r6.b(r7, r0)     // Catch: java.lang.Exception -> L7b
            if (r9 != r5) goto L6f
            goto L8b
        L6f:
            com.spotify.liveeventslocation.v1.userlocation.StoreUserLocationResponse r9 = (com.spotify.liveeventslocation.v1.userlocation.StoreUserLocationResponse) r9     // Catch: java.lang.Exception -> L7b
            boolean r6 = r9.n()     // Catch: java.lang.Exception -> L7b
            p.wle0 r7 = new p.wle0     // Catch: java.lang.Exception -> L7b
            r7.<init>(r6)     // Catch: java.lang.Exception -> L7b
            goto L81
        L7b:
            p.wle0 r7 = new p.wle0
            r6 = 0
            r7.<init>(r6)
        L81:
            r0.d = r4
            r0.b = r2
            java.lang.Object r6 = r8.b(r7, r0)
            if (r6 != r5) goto L8c
        L8b:
            return r5
        L8c:
            p.rih1 r6 = p.rih1.a
            return r6
        L8f:
            java.lang.String r6 = "Location is empty"
            p.eg.m(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ele0.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
