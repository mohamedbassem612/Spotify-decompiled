package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wn2 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ long c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn2(wat watVar, jfe jfeVar, boolean z, long j, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 20;
        this.d = watVar;
        this.e = jfeVar;
        this.b = z;
        this.c = j;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                return new wn2(this.d, obj2, this.c, lnmVar, (byte) 0);
            case 1:
                return new wn2(this.d, obj2, this.c, lnmVar, (byte) 1);
            case 2:
                return new wn2(this.d, obj2, this.c, lnmVar, (byte) 2);
            case 3:
                return new wn2(this.c, this.d, obj2, lnmVar, (byte) 3);
            case 4:
                return new wn2(this.d, obj2, this.c, lnmVar, (byte) 4);
            case 5:
                return new wn2(this.d, obj2, this.c, lnmVar, (byte) 5);
            case 6:
                return new wn2(this.d, obj2, this.c, lnmVar, (byte) 6);
            case 7:
                wn2 wn2Var = new wn2((mfe) obj2, this.c, lnmVar, (byte) 7);
                wn2Var.d = obj;
                return wn2Var;
            case 8:
                wn2 wn2Var2 = new wn2((l6v) obj2, this.c, lnmVar, (byte) 8);
                wn2Var2.d = obj;
                return wn2Var2;
            case 9:
                return new wn2(this.c, this.d, obj2, lnmVar, (byte) 9);
            case 10:
                wn2 wn2Var3 = new wn2((mr20) obj2, this.c, lnmVar, (byte) 10);
                wn2Var3.d = obj;
                return wn2Var3;
            case 11:
                return new wn2(this.d, obj2, this.c, lnmVar, (byte) 11);
            case 12:
                return new wn2(this.d, obj2, this.c, lnmVar, (byte) 12);
            case 13:
                return new wn2(this.d, obj2, this.c, lnmVar, (byte) 13);
            case 14:
                return new wn2(this.c, this.d, obj2, lnmVar, (byte) 14);
            case 15:
                return new wn2(this.d, obj2, this.c, lnmVar, (byte) 15);
            case 16:
                return new wn2(this.d, this.c, obj2, lnmVar, (byte) 16);
            case 17:
                return new wn2(this.d, obj2, this.c, lnmVar, (byte) 17);
            case 18:
                return new wn2(this.d, this.c, obj2, lnmVar, (byte) 18);
            case 19:
                return new wn2(this.d, obj2, this.c, lnmVar, (byte) 19);
            default:
                return new wn2((wat) this.d, (jfe) obj2, this.b, this.c, lnmVar);
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
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 17:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 18:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 19:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:94:0x0209  */
    /* JADX WARN: Code duplicated, block: B:96:0x0213  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x0211 -> B:97:0x0215). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 1332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.wn2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wn2(Object obj, long j, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.c = j;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wn2(Object obj, long j, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.c = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wn2(Object obj, Object obj2, long j, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.c = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wn2(long j, Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = j;
        this.d = obj;
        this.e = obj2;
    }
}
