package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xhg extends z031 implements vu30 {
    public hav0 b;
    public byte c;
    public /* synthetic */ Object d;
    public final /* synthetic */ float e;
    public final /* synthetic */ ame f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xhg(float f, ame ameVar, lnm lnmVar) {
        super(2, lnmVar);
        this.e = f;
        this.f = ameVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        xhg xhgVar = new xhg(this.e, this.f, lnmVar);
        xhgVar.d = obj;
        return xhgVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((i8d1) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0057  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r13 == r6) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        if (r13 == r6) goto L28;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x006a -> B:29:0x006d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.d
            p.i8d1 r0 = (p.i8d1) r0
            byte r1 = r12.c
            r2 = 3
            r3 = 2
            r4 = 1
            p.rih1 r5 = p.rih1.a
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L2c
            if (r1 == r4) goto L28
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1b
            p.hav0 r1 = r12.b
            p.hm5.M(r13)
            goto L6d
        L1b:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r12)
            r12 = 0
            return r12
        L22:
            p.hav0 r1 = r12.b
            p.hm5.M(r13)
            goto L4e
        L28:
            p.hm5.M(r13)
            goto L3a
        L2c:
            p.hm5.M(r13)
            r12.d = r0
            r12.c = r4
            java.lang.Object r13 = p.rqd1.b(r0, r12, r3)
            if (r13 != r6) goto L3a
            goto L6c
        L3a:
            p.hav0 r13 = (p.hav0) r13
        L3c:
            r12.d = r0
            r12.b = r13
            r12.c = r3
            p.cav0 r1 = p.cav0.a
            java.lang.Object r1 = r0.a(r1, r12)
            if (r1 != r6) goto L4b
            goto L6c
        L4b:
            r11 = r1
            r1 = r13
            r13 = r11
        L4e:
            p.bav0 r13 = (p.bav0) r13
            p.hav0 r13 = p.m0p1.s(r13, r1)
            if (r13 != 0) goto L57
            goto L88
        L57:
            boolean r13 = r13.l()
            if (r13 == 0) goto L5e
            goto L88
        L5e:
            r12.d = r0
            r12.b = r1
            r12.c = r2
            p.cav0 r13 = p.cav0.b
            java.lang.Object r13 = r0.a(r13, r12)
            if (r13 != r6) goto L6d
        L6c:
            return r6
        L6d:
            p.bav0 r13 = (p.bav0) r13
            p.hav0 r13 = p.m0p1.s(r13, r1)
            if (r13 != 0) goto L76
            goto L88
        L76:
            long r7 = r13.c
            long r9 = r1.c
            long r7 = androidx.compose.ui.geometry.Offset.f(r7, r9)
            float r4 = androidx.compose.ui.geometry.Offset.d(r7)
            float r7 = r12.e
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 <= 0) goto L89
        L88:
            return r5
        L89:
            boolean r4 = r13.h
            if (r4 == 0) goto L97
            boolean r13 = r13.d
            if (r13 != 0) goto L97
            p.ame r12 = r12.f
            r12.invoke()
            return r5
        L97:
            r13 = r1
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: p.xhg.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
