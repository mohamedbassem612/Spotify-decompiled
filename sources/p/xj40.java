package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xj40 extends z031 implements vu30 {
    public int b;
    public byte c;
    public /* synthetic */ Object d;
    public final /* synthetic */ c9n e;
    public final /* synthetic */ pob0 f;
    public final /* synthetic */ lbh g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj40(c9n c9nVar, pob0 pob0Var, lbh lbhVar, lnm lnmVar) {
        super(2, lnmVar);
        this.e = c9nVar;
        this.f = pob0Var;
        this.g = lbhVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        xj40 xj40Var = new xj40(this.e, this.f, this.g, lnmVar);
        xj40Var.d = obj;
        return xj40Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((i8d1) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        if (p.rqd1.b(r1, r18, 2) == r7) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (r8 == r7) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        return r7;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0041 -> B:17:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            java.lang.Object r1 = r0.d
            p.i8d1 r1 = (p.i8d1) r1
            byte r2 = r0.c
            r3 = 0
            r4 = 0
            r5 = 2
            r6 = 1
            p.d9n r7 = p.d9n.a
            if (r2 == 0) goto L26
            if (r2 == r6) goto L22
            if (r2 != r5) goto L1c
            int r2 = r0.b
            p.hm5.M(r19)
            r8 = r19
            goto L44
        L1c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            return r4
        L22:
            p.hm5.M(r19)
            goto L34
        L26:
            p.hm5.M(r19)
            r0.d = r1
            r0.c = r6
            java.lang.Object r2 = p.rqd1.b(r1, r0, r5)
            if (r2 != r7) goto L34
            goto L43
        L34:
            r2 = r3
        L35:
            r0.d = r1
            r0.b = r2
            r0.c = r5
            p.cav0 r8 = p.cav0.b
            java.lang.Object r8 = r1.a(r8, r0)
            if (r8 != r7) goto L44
        L43:
            return r7
        L44:
            r12 = r8
            p.bav0 r12 = (p.bav0) r12
            java.util.List r8 = r12.a
            int r9 = r8.size()
            if (r9 < r5) goto L97
            float r11 = p.vpb1.s(r12)
            r9 = 1065353216(0x3f800000, float:1.0)
            int r9 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r9 != 0) goto L5a
            goto L97
        L5a:
            r9 = 3
            p.pob0 r10 = r0.f
            p.c9n r13 = r0.e
            if (r2 != 0) goto L6a
            p.vj40 r2 = new p.vj40
            r2.<init>(r10, r4, r3)
            p.fn31.T(r13, r4, r3, r2, r9)
            r2 = r6
        L6a:
            r14 = r9
            p.wj40 r9 = new p.wj40
            r15 = r14
            r14 = 0
            r16 = r15
            r15 = 0
            r17 = r13
            p.lbh r13 = r0.g
            r5 = r16
            r6 = r17
            r9.<init>(r10, r11, r12, r13, r14, r15)
            p.fn31.T(r6, r4, r3, r9, r5)
            r5 = r8
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L87:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L97
            java.lang.Object r6 = r5.next()
            p.hav0 r6 = (p.hav0) r6
            r6.a()
            goto L87
        L97:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            boolean r5 = r8 instanceof java.util.Collection
            if (r5 == 0) goto La7
            r5 = r8
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto La7
            goto Lbf
        La7:
            java.util.Iterator r5 = r8.iterator()
        Lab:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Lbf
            java.lang.Object r6 = r5.next()
            p.hav0 r6 = (p.hav0) r6
            boolean r6 = r6.d
            if (r6 == 0) goto Lab
            r5 = 2
            r6 = 1
            goto L35
        Lbf:
            p.rih1 r0 = p.rih1.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.xj40.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
