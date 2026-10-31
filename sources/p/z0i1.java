package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class z0i1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0i1(byte b, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, lnm lnmVar) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new z0i1((a1i1) this.e, lnmVar);
            case 1:
                z0i1 z0i1Var = new z0i1((w9i1) this.g, lnmVar);
                z0i1Var.f = obj;
                return z0i1Var;
            case 2:
                return new z0i1((byte) 2, (x8j1) this.c, (n2o) this.d, (a5f1) this.e, (yir) this.f, (iu30) this.g, lnmVar);
            case 3:
                z0i1 z0i1Var2 = new z0i1((p5j1) this.e, (ven0) this.f, (ven0) this.g, lnmVar, (byte) 3);
                z0i1Var2.d = obj;
                return z0i1Var2;
            case 4:
                return new z0i1((byte) 4, (ven0) this.c, (ven0) this.d, (tob1) this.e, (tob1) this.f, (ven0) this.g, lnmVar);
            case 5:
                z0i1 z0i1Var3 = new z0i1((cm0) this.f, (kom1) this.g, lnmVar, (byte) 5);
                z0i1Var3.e = obj;
                return z0i1Var3;
            case 6:
                return new z0i1((rvo1) this.d, (cwn1) this.e, (String) this.f, (sln1) this.g, lnmVar, (byte) 6);
            case 7:
                z0i1 z0i1Var4 = new z0i1((vrv0) this.f, (u9c) this.g, lnmVar, (byte) 7);
                z0i1Var4.e = obj;
                return z0i1Var4;
            case 8:
                return new z0i1((rvo1) this.d, (u9c) this.e, (String) this.f, (sln1) this.g, lnmVar, (byte) 8);
            case 9:
                z0i1 z0i1Var5 = new z0i1((vrv0) this.e, (String) this.f, (u9c) this.g, lnmVar, (byte) 9);
                z0i1Var5.d = obj;
                return z0i1Var5;
            default:
                z0i1 z0i1Var6 = new z0i1((fqn1) this.f, (zwo1) this.g, lnmVar, (byte) 10);
                z0i1Var6.e = obj;
                return z0i1Var6;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((zwo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((zwo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((rvo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:300:0x0828 A[DONT_INVERT, PHI: r3
      0x0828: PHI (r3v19 java.lang.Boolean) = (r3v13 java.lang.Boolean), (r3v18 java.lang.Boolean), (r3v18 java.lang.Boolean), (r3v33 java.lang.Boolean) binds: [B:299:0x0827, B:305:0x0845, B:307:0x0853, B:290:0x07f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:301:0x082a  */
    /* JADX WARN: Code duplicated, block: B:304:0x0843 A[PHI: r3
      0x0843: PHI (r3v17 java.lang.Object) = (r3v26 java.lang.Object), (r3v31 java.lang.Object) binds: [B:302:0x083f, B:291:0x07fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:306:0x0847  */
    /* JADX WARN: Code duplicated, block: B:325:0x090c A[PHI: r1 r3
      0x090c: PHI (r1v9 java.lang.Object) = (r1v8 java.lang.Object), (r1v17 java.lang.Object) binds: [B:323:0x0909, B:288:0x07d3] A[DONT_GENERATE, DONT_INLINE]
      0x090c: PHI (r3v30 java.lang.Object) = (r3v29 java.lang.Object), (r3v41 java.lang.Object) binds: [B:323:0x0909, B:288:0x07d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:329:0x091b A[Catch: all -> 0x0933, TryCatch #0 {all -> 0x0933, blocks: (B:327:0x0917, B:329:0x091b, B:330:0x091d, B:334:0x092b, B:340:0x0935, B:344:0x0940), top: B:382:0x0917 }] */
    /* JADX WARN: Code duplicated, block: B:332:0x0928  */
    /* JADX WARN: Code duplicated, block: B:333:0x092a  */
    /* JADX WARN: Code duplicated, block: B:336:0x092f  */
    /* JADX WARN: Code duplicated, block: B:342:0x093d  */
    /* JADX WARN: Code duplicated, block: B:343:0x093f  */
    /* JADX WARN: Code duplicated, block: B:382:0x0917 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:251:0x06ef -> B:241:0x06aa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:305:0x0845 -> B:300:0x0828). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:307:0x0853 -> B:300:0x0828). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 2600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.z0i1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0i1(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0i1(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.f = obj;
        this.g = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0i1(a1i1 a1i1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 0;
        this.e = a1i1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0i1(w9i1 w9i1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 1;
        this.g = w9i1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0i1(rvo1 rvo1Var, Object obj, String str, sln1 sln1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = rvo1Var;
        this.e = obj;
        this.f = str;
        this.g = sln1Var;
    }
}
