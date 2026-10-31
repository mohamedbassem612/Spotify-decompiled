package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mug extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public long b;
    public byte c;
    public Object d;
    public /* synthetic */ Object e;
    public Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mug(jfv jfvVar, o95 o95Var, Comparable comparable, long j, ceo ceoVar, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 4;
        this.d = jfvVar;
        this.e = o95Var;
        this.f = comparable;
        this.b = j;
        this.g = ceoVar;
    }

    @Override // p.faa
    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.g;
        switch (b) {
            case 0:
                return new mug(this.b, (q6n1) obj2, (l811) this.e, lnmVar);
            case 1:
                mug mugVar = new mug((t9k) this.e, (yqg) this.f, (rm5) obj2, lnmVar);
                mugVar.d = obj;
                return mugVar;
            case 2:
                mug mugVar2 = new mug(this.e, this.f, this.b, obj2, lnmVar, (byte) 2);
                mugVar2.d = obj;
                return mugVar2;
            case 3:
                mug mugVar3 = new mug((q7i0) this.f, (String) obj2, lnmVar);
                mugVar3.e = obj;
                return mugVar3;
            case 4:
                return new mug((jfv) this.d, (o95) this.e, (Comparable) this.f, this.b, (ceo) obj2, lnmVar);
            case 5:
                mug mugVar4 = new mug(this.f, obj2, this.b, lnmVar, (byte) 5);
                mugVar4.e = obj;
                return mugVar4;
            case 6:
                mug mugVar5 = new mug(this.e, this.f, this.b, obj2, lnmVar, (byte) 6);
                mugVar5.d = obj;
                return mugVar5;
            case 7:
                mug mugVar6 = new mug(this.e, this.f, obj2, this.b, lnmVar, (byte) 7);
                mugVar6.d = obj;
                return mugVar6;
            case 8:
                mug mugVar7 = new mug((b1o1) this.e, this.b, (yln1) this.f, (cik1) obj2, lnmVar);
                mugVar7.d = obj;
                return mugVar7;
            case 9:
                mug mugVar8 = new mug(this.e, this.f, obj2, this.b, lnmVar, (byte) 9);
                mugVar8.d = obj;
                return mugVar8;
            case 10:
                mug mugVar9 = new mug(this.b, (ayh) obj2, lnmVar, (yro1) this.f);
                mugVar9.e = obj;
                return mugVar9;
            case 11:
                mug mugVar10 = new mug(this.e, this.f, obj2, this.b, lnmVar, (byte) 11);
                mugVar10.d = obj;
                return mugVar10;
            case 12:
                mug mugVar11 = new mug(this.e, this.f, obj2, this.b, lnmVar, (byte) 12);
                mugVar11.d = obj;
                return mugVar11;
            default:
                mug mugVar12 = new mug(this.f, obj2, this.b, lnmVar, (byte) 13);
                mugVar12.e = obj;
                return mugVar12;
        }
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return ((mug) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 1:
                return ((mug) create((vr20) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 2:
                return ((mug) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 3:
                return ((mug) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 4:
                return ((mug) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 5:
                return ((mug) create((vr20) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 6:
                return ((mug) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 7:
                return ((mug) create((rvo1) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 8:
                return ((mug) create((zwo1) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 9:
                return ((mug) create((zwo1) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 10:
                return ((mug) create((rvo1) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 11:
                return ((mug) create((zwo1) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 12:
                return ((mug) create((zwo1) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            default:
                return ((mug) create((rvo1) obj, (lnm) obj2)).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzhm */
    /* JADX WARN: Code duplicated, block: B:195:0x0472  */
    /* JADX WARN: Code duplicated, block: B:234:0x0540  */
    /* JADX WARN: Code duplicated, block: B:235:0x0544  */
    /* JADX WARN: Code duplicated, block: B:237:0x054a  */
    /* JADX WARN: Code duplicated, block: B:240:0x0562  */
    /* JADX WARN: Code duplicated, block: B:242:0x056c  */
    /* JADX WARN: Code duplicated, block: B:243:0x0573  */
    /* JADX WARN: Code duplicated, block: B:245:0x0577  */
    /* JADX WARN: Code duplicated, block: B:252:0x0596  */
    /* JADX WARN: Code duplicated, block: B:254:0x059e  */
    /* JADX WARN: Code duplicated, block: B:259:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:263:0x05e0 A[LOOP:2: B:261:0x05da->B:263:0x05e0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:270:0x0625  */
    /* JADX WARN: Code duplicated, block: B:272:0x0635  */
    /* JADX WARN: Code duplicated, block: B:273:0x0637  */
    /* JADX WARN: Code duplicated, block: B:275:0x0644  */
    /* JADX WARN: Code duplicated, block: B:277:0x064a  */
    /* JADX WARN: Code duplicated, block: B:289:0x0682  */
    /* JADX WARN: Code duplicated, block: B:291:0x068a  */
    /* JADX WARN: Code duplicated, block: B:293:0x0694  */
    /* JADX WARN: Code duplicated, block: B:294:0x0699  */
    /* JADX WARN: Code duplicated, block: B:297:0x06a9  */
    /* JADX WARN: Code duplicated, block: B:298:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:301:0x06dd A[LOOP:4: B:299:0x06d7->B:301:0x06dd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:308:0x071d  */
    /* JADX WARN: Code duplicated, block: B:309:0x072f  */
    /* JADX WARN: Code duplicated, block: B:311:0x0741  */
    /* JADX WARN: Code duplicated, block: B:399:0x057e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:402:0x055c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:405:0x0615 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:408:0x0711 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:413:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:414:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:435:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:436:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:449:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x040c, code lost:
    
        if (r10.b(r1, r24) == r8) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x046a, code lost:
    
        if (r2.collect(r13, r24) == r8) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x0891, code lost:
    
        if (r0.a.a(r24) == r8) goto L376;
     */
    @Override // p.faa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.mug.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mug(Object obj, Object obj2, long j, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.b = j;
        this.g = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mug(Object obj, Object obj2, long j, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.f = obj;
        this.g = obj2;
        this.b = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mug(Object obj, Object obj2, Object obj3, long j, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.b = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mug(t9k t9kVar, yqg yqgVar, rm5 rm5Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 1;
        this.e = t9kVar;
        this.f = yqgVar;
        this.g = rm5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mug(long j, ayh ayhVar, lnm lnmVar, yro1 yro1Var) {
        super(2, lnmVar);
        this.a = (byte) 10;
        this.f = yro1Var;
        this.b = j;
        this.g = ayhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mug(q7i0 q7i0Var, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 3;
        this.f = q7i0Var;
        this.g = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mug(b1o1 b1o1Var, long j, yln1 yln1Var, cik1 cik1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 8;
        this.e = b1o1Var;
        this.b = j;
        this.f = yln1Var;
        this.g = cik1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mug(long j, q6n1 q6n1Var, l811 l811Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 0;
        this.b = j;
        this.g = q6n1Var;
        this.e = l811Var;
    }
}
