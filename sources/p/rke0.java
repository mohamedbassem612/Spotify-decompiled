package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rke0 extends a8d1 implements xu30 {
    public vr20 a;
    public int b;
    public byte c;
    public /* synthetic */ vr20 d;
    public /* synthetic */ rje0 e;
    public final /* synthetic */ zc80 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rke0(zc80 zc80Var, lnm lnmVar) {
        super(3, lnmVar);
        this.f = zc80Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        rke0 rke0Var = new rke0(this.f, (lnm) obj3);
        rke0Var.d = (vr20) obj;
        rke0Var.e = (rje0) obj2;
        return rke0Var.invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        if (r0.emit(p.qle0.a, r9) == r8) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
    
        if (r2.emit(r5, r9) == r8) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009e, code lost:
    
        if (r0.emit(r10, r9) == r8) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [p.rje0] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            p.vr20 r0 = r9.d
            p.rje0 r1 = r9.e
            byte r2 = r9.c
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            p.d9n r8 = p.d9n.a
            if (r2 == 0) goto L36
            if (r2 == r6) goto L31
            if (r2 == r5) goto L29
            if (r2 == r4) goto L22
            if (r2 != r3) goto L1c
            p.vr20 r9 = r9.a
            java.lang.Exception r9 = (java.lang.Exception) r9
            goto L31
        L1c:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            return r7
        L22:
            int r1 = r9.b
            p.hm5.M(r10)     // Catch: java.lang.Exception -> L89
            goto La1
        L29:
            int r1 = r9.b
            p.vr20 r2 = r9.a
            p.hm5.M(r10)     // Catch: java.lang.Exception -> L89
            goto L70
        L31:
            p.hm5.M(r10)
            goto La1
        L36:
            p.hm5.M(r10)
            java.lang.String r10 = r1.c
            int r1 = r10.length()
            r2 = 150(0x96, float:2.1E-43)
            if (r1 != 0) goto L44
            goto L4a
        L44:
            int r1 = r10.length()
            if (r1 <= r2) goto L5b
        L4a:
            r9.d = r7
            r9.e = r7
            r9.b = r2
            r9.c = r6
            p.qle0 r10 = p.qle0.a
            java.lang.Object r9 = r0.emit(r10, r9)
            if (r9 != r8) goto La1
            goto La0
        L5b:
            p.zc80 r1 = r9.f     // Catch: java.lang.Exception -> L88
            r9.d = r0     // Catch: java.lang.Exception -> L88
            r9.e = r7     // Catch: java.lang.Exception -> L88
            r9.a = r0     // Catch: java.lang.Exception -> L88
            r9.b = r2     // Catch: java.lang.Exception -> L88
            r9.c = r5     // Catch: java.lang.Exception -> L88
            java.io.Serializable r10 = r1.a(r10, r9)     // Catch: java.lang.Exception -> L88
            if (r10 != r8) goto L6e
            goto La0
        L6e:
            r1 = r2
            r2 = r0
        L70:
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Exception -> L89
            p.rle0 r5 = new p.rle0     // Catch: java.lang.Exception -> L89
            r5.<init>(r10)     // Catch: java.lang.Exception -> L89
            r9.d = r0     // Catch: java.lang.Exception -> L89
            r9.e = r7     // Catch: java.lang.Exception -> L89
            r9.a = r7     // Catch: java.lang.Exception -> L89
            r9.b = r1     // Catch: java.lang.Exception -> L89
            r9.c = r4     // Catch: java.lang.Exception -> L89
            java.lang.Object r9 = r2.emit(r5, r9)     // Catch: java.lang.Exception -> L89
            if (r9 != r8) goto La1
            goto La0
        L88:
            r1 = r2
        L89:
            p.rle0 r10 = new p.rle0
            p.z6x r2 = p.z6x.a
            r10.<init>(r2)
            r9.d = r7
            r9.e = r7
            r9.a = r7
            r9.b = r1
            r9.c = r3
            java.lang.Object r9 = r0.emit(r10, r9)
            if (r9 != r8) goto La1
        La0:
            return r8
        La1:
            p.rih1 r9 = p.rih1.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.rke0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
