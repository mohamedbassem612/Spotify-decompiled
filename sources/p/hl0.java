package p;

import com.spotify.scrollsita.v1.Section;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hl0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl0(rk41 rk41Var, boolean z, boolean z2, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 29;
        this.d = rk41Var;
        this.b = z;
        this.c = z2;
        this.e = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                return new hl0(this.d, obj2, this.c, lnmVar, (byte) 0);
            case 1:
                hl0 hl0Var = new hl0((ven0) this.d, (ven0) obj2, lnmVar, (byte) 1);
                hl0Var.c = ((Boolean) obj).booleanValue();
                return hl0Var;
            case 2:
                return new hl0(this.d, obj2, this.c, lnmVar, (byte) 2);
            case 3:
                return new hl0(this.c, this.d, obj2, lnmVar, (byte) 3);
            case 4:
                return new hl0(this.d, obj2, this.c, lnmVar, (byte) 4);
            case 5:
                return new hl0(this.d, this.c, obj2, lnmVar, (byte) 5);
            case 6:
                return new hl0(this.d, this.c, obj2, lnmVar, (byte) 6);
            case 7:
                return new hl0(this.d, obj2, this.c, lnmVar, (byte) 7);
            case 8:
                hl0 hl0Var2 = new hl0((hks) obj2, this.c, lnmVar);
                hl0Var2.d = obj;
                return hl0Var2;
            case 9:
                return new hl0(this.d, obj2, this.c, lnmVar, (byte) 9);
            case 10:
                return new hl0(this.d, obj2, this.c, lnmVar, (byte) 10);
            case 11:
                return new hl0(this.d, this.c, obj2, lnmVar, (byte) 11);
            case 12:
                return new hl0(this.d, obj2, this.c, lnmVar, (byte) 12);
            case 13:
                return new hl0(this.d, obj2, this.c, lnmVar, (byte) 13);
            case 14:
                return new hl0(this.d, obj2, this.c, lnmVar, (byte) 14);
            case 15:
                return new hl0(this.c, this.d, obj2, lnmVar, (byte) 15);
            case 16:
                return new hl0(this.c, this.d, obj2, lnmVar, (byte) 16);
            case 17:
                return new hl0(this.d, this.c, obj2, lnmVar, (byte) 17);
            case 18:
                return new hl0(this.d, obj2, this.c, lnmVar, (byte) 18);
            case 19:
                return new hl0(this.c, this.d, obj2, lnmVar, (byte) 19);
            case 20:
                return new hl0(this.c, this.d, obj2, lnmVar, (byte) 20);
            case 21:
                return new hl0(this.d, obj2, this.c, lnmVar, (byte) 21);
            case 22:
                return new hl0(this.c, this.d, obj2, lnmVar, (byte) 22);
            case 23:
                return new hl0(this.c, this.d, obj2, lnmVar, (byte) 23);
            case 24:
                return new hl0(this.d, this.c, obj2, lnmVar, (byte) 24);
            case 25:
                return new hl0(this.d, obj2, this.c, lnmVar, (byte) 25);
            case 26:
                return new hl0(this.b, this.c, (kes) this.d, (hdn0) obj2, lnmVar);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new hl0((w9i1) this.d, (String) obj2, lnmVar, (byte) 27);
            case 28:
                return new hl0(this.c, this.d, obj2, lnmVar, (byte) 28);
            default:
                return new hl0((rk41) this.d, this.b, this.c, (ven0) obj2, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return ((hl0) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((hl0) create(bool, (lnm) obj2)).invokeSuspend(rih1Var);
            case 2:
                return ((hl0) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 3:
                return ((hl0) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 4:
                return ((hl0) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 5:
                return ((hl0) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 6:
                return ((hl0) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 7:
                return ((hl0) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 8:
                return ((hl0) create((ssw0) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 9:
                return ((hl0) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 10:
                return ((hl0) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 11:
                return ((hl0) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 12:
                return ((hl0) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 13:
                ((hl0) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return d9n.a;
            case 14:
                return ((hl0) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 15:
                return ((hl0) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 16:
                return ((hl0) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 17:
                return ((hl0) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 18:
                return ((hl0) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 19:
                return ((hl0) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 20:
                return ((hl0) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 21:
                return ((hl0) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 22:
                return ((hl0) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 23:
                return ((hl0) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 24:
                return ((hl0) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 25:
                return ((hl0) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 26:
                ((hl0) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return ((hl0) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 28:
                return ((hl0) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            default:
                ((hl0) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:193:0x038f  */
    /* JADX WARN: Code duplicated, block: B:236:0x045b  */
    /* JADX WARN: Code duplicated, block: B:238:0x0463  */
    /* JADX WARN: Code duplicated, block: B:240:0x046f  */
    /* JADX WARN: Code duplicated, block: B:242:0x0481  */
    /* JADX WARN: Code duplicated, block: B:243:0x0485  */
    /* JADX WARN: Code duplicated, block: B:246:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:248:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:251:0x04da  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:168:0x030d -> B:170:0x0311). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:192:0x038d -> B:194:0x0391). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:183:0x035b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 2542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hl0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hl0(Object obj, Object obj2, boolean z, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.c = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hl0(Object obj, boolean z, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.c = z;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl0(hks hksVar, boolean z, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 8;
        this.e = hksVar;
        this.c = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hl0(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hl0(boolean z, Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = z;
        this.d = obj;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl0(boolean z, boolean z2, kes kesVar, hdn0 hdn0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 26;
        this.b = z;
        this.c = z2;
        this.d = kesVar;
        this.e = hdn0Var;
    }
}
