package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class auc1 extends a8d1 implements xu30 {
    public buc1 a;
    public int b;
    public byte c;
    public /* synthetic */ vr20 d;
    public /* synthetic */ boolean e;
    public final /* synthetic */ buc1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auc1(buc1 buc1Var, lnm lnmVar) {
        super(3, lnmVar);
        this.f = buc1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        auc1 auc1Var = new auc1(this.f, (lnm) obj3);
        auc1Var.d = (vr20) obj;
        auc1Var.e = zBooleanValue;
        return auc1Var.invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0092  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00be A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        if (r14 == r12) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            p.vr20 r0 = r13.d
            boolean r1 = r13.e
            byte r2 = r13.c
            p.buc1 r3 = r13.f
            p.rih1 r4 = p.rih1.a
            p.ntc1 r5 = p.ntc1.a
            r6 = 5
            r7 = 4
            r8 = 3
            r9 = 2
            r10 = 1
            r11 = 0
            p.d9n r12 = p.d9n.a
            if (r2 == 0) goto L42
            if (r2 == r10) goto L3e
            if (r2 == r9) goto L34
            if (r2 == r8) goto L2e
            if (r2 == r7) goto L20
            if (r2 != r6) goto L28
        L20:
            p.buc1 r13 = r13.a
            java.util.List r13 = (java.util.List) r13
            p.hm5.M(r14)
            return r4
        L28:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r13)
            return r11
        L2e:
            p.buc1 r2 = r13.a
            p.hm5.M(r14)
            goto L7f
        L34:
            int r2 = r13.b
            p.buc1 r9 = r13.a
            p.hm5.M(r14)
            r14 = r2
            r2 = r9
            goto L6e
        L3e:
            p.hm5.M(r14)
            return r4
        L42:
            p.hm5.M(r14)
            if (r1 != 0) goto L54
            r13.d = r11
            r13.e = r1
            r13.c = r10
            java.lang.Object r13 = r0.emit(r5, r13)
            if (r13 != r12) goto Lbe
            goto Lbd
        L54:
            java.util.List r14 = r3.i
            if (r14 != 0) goto L8c
            r13.d = r0
            r13.a = r3
            r13.e = r1
            r2 = 0
            r13.b = r2
            r13.c = r9
            p.otc1 r14 = p.otc1.a
            java.lang.Object r14 = r0.emit(r14, r13)
            if (r14 != r12) goto L6c
            goto Lbd
        L6c:
            r14 = r2
            r2 = r3
        L6e:
            r13.d = r0
            r13.a = r2
            r13.e = r1
            r13.b = r14
            r13.c = r8
            java.lang.Object r14 = r2.b(r13)
            if (r14 != r12) goto L7f
            goto Lbd
        L7f:
            java.util.List r14 = (java.util.List) r14
            r8 = r14
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L8c
            r2.i = r14
        L8c:
            boolean r2 = r14.isEmpty()
            if (r2 == 0) goto La1
            r13.d = r11
            r13.a = r11
            r13.e = r1
            r13.c = r7
            java.lang.Object r13 = r0.emit(r5, r13)
            if (r13 != r12) goto Lbe
            goto Lbd
        La1:
            p.ptc1 r2 = new p.ptc1
            android.content.Context r3 = r3.a
            r5 = 2131960002(0x7f1320c2, float:1.955666E38)
            java.lang.String r3 = r3.getString(r5)
            r2.<init>(r3, r14)
            r13.d = r11
            r13.a = r11
            r13.e = r1
            r13.c = r6
            java.lang.Object r13 = r0.emit(r2, r13)
            if (r13 != r12) goto Lbe
        Lbd:
            return r12
        Lbe:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.auc1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
