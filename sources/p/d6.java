package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class d6 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public long c;
    public Object d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(ewn0 ewn0Var, String str, vi11 vi11Var, long j, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 13;
        this.d = ewn0Var;
        this.e = str;
        this.f = vi11Var;
        this.c = j;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.f;
        switch (b) {
            case 0:
                return new d6(this.e, this.c, obj2, lnmVar, (byte) 0);
            case 1:
                return new d6((fq2) this.d, (String) this.e, this.c, (p811) obj2, lnmVar);
            case 2:
                return new d6(this.e, obj2, this.c, lnmVar, (byte) 2);
            case 3:
                d6 d6Var = new d6(this.e, obj2, lnmVar, (byte) 3);
                d6Var.d = obj;
                return d6Var;
            case 4:
                return new d6((ldo) this.d, (edo) this.e, (ven0) obj2, lnmVar);
            case 5:
                return new d6(this.c, (p811) this.e, (ssw0) obj2, lnmVar);
            case 6:
                return new d6(this.e, obj2, this.c, lnmVar, (byte) 6);
            case 7:
                d6 d6Var2 = new d6(this.e, obj2, this.c, lnmVar, (byte) 7);
                d6Var2.d = obj;
                return d6Var2;
            case 8:
                d6 d6Var3 = new d6(this.e, obj2, lnmVar, (byte) 8);
                d6Var3.d = obj;
                return d6Var3;
            case 9:
                return new d6((k3e1) this.d, this.c, (o3e1) this.e, (j3e1) obj2, lnmVar);
            case 10:
                return new d6(this.e, this.c, obj2, lnmVar, (byte) 10);
            case 11:
                return new d6(this.e, this.c, obj2, lnmVar, (byte) 11);
            case 12:
                d6 d6Var4 = new d6(obj2, this.c, lnmVar, (byte) 12);
                d6Var4.e = obj;
                return d6Var4;
            case 13:
                return new d6((ewn0) this.d, (String) this.e, (vi11) obj2, this.c, lnmVar);
            case 14:
                d6 d6Var5 = new d6(this.e, this.c, obj2, lnmVar, (byte) 14);
                d6Var5.d = obj;
                return d6Var5;
            default:
                d6 d6Var6 = new d6(obj2, this.c, lnmVar, (byte) 15);
                d6Var6.e = obj;
                return d6Var6;
        }
    }

    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9n.a;
            case 3:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((rvo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((zwo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzhm */
    /* JADX WARN: Code duplicated, block: B:138:0x0271  */
    /* JADX WARN: Code duplicated, block: B:159:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:162:0x02d5  */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0215, code lost:
    
        if (p.op71.p(r1, r19) == r0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02b9, code lost:
    
        if (r0.b(r7, r19) == r2) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x031e, code lost:
    
        if (r1.a(r2, r19) == r0) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x037b, code lost:
    
        if (r3.emit(r1, r19) == r7) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x040f, code lost:
    
        if (p.o95.b(r0, r4, r2, (java.lang.Float) null, (p.iu30) null, r19, 12) == r9) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0498, code lost:
    
        if (p.o95.b(r2, r6, r3, (java.lang.Float) null, r11, r19, 4) == r10) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x059e, code lost:
    
        if (r3.emit(r6, r19) == r7) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x068d, code lost:
    
        if (r2.invoke(r3, r0, r19) == r1) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x06f5, code lost:
    
        if (r2.invoke(r4, r0, r19) == r1) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x0793, code lost:
    
        if (r0.b(r2, r19) == r1) goto L445;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ef, code lost:
    
        if (r0 != r2) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01ab, code lost:
    
        if (r0 == r9) goto L95;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1980
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.d6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d6(Object obj, long j, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.c = j;
        this.f = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d6(Object obj, long j, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.f = obj;
        this.c = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d6(Object obj, Object obj2, long j, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.c = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d6(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.f = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(fq2 fq2Var, String str, long j, p811 p811Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 1;
        this.d = fq2Var;
        this.e = str;
        this.c = j;
        this.f = p811Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(ldo ldoVar, edo edoVar, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 4;
        this.d = ldoVar;
        this.e = edoVar;
        this.f = ven0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(long j, p811 p811Var, ssw0 ssw0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 5;
        this.c = j;
        this.e = p811Var;
        this.f = ssw0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(k3e1 k3e1Var, long j, o3e1 o3e1Var, j3e1 j3e1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 9;
        this.d = k3e1Var;
        this.c = j;
        this.e = o3e1Var;
        this.f = j3e1Var;
    }
}
