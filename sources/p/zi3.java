package p;

import java.io.File;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zi3 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public int c;
    public Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zi3(int i, Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = i;
        this.d = obj;
        this.e = obj2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                return new zi3(this.d, obj2, this.c, lnmVar, (byte) 0);
            case 1:
                return new zi3(this.d, this.c, obj2, lnmVar, (byte) 1);
            case 2:
                return new zi3(this.d, obj2, this.c, lnmVar, (byte) 2);
            case 3:
                return new zi3((asc) this.d, (File) obj2, lnmVar);
            case 4:
                return new zi3(this.d, obj2, this.c, lnmVar, (byte) 4);
            case 5:
                return new zi3((tjq) obj2, lnmVar);
            case 6:
                return new zi3(this.c, this.d, obj2, lnmVar, (byte) 6);
            case 7:
                return new zi3(this.d, this.c, obj2, lnmVar, (byte) 7);
            case 8:
                zi3 zi3Var = new zi3((upb0) obj2, this.c, lnmVar, (byte) 8);
                zi3Var.d = obj;
                return zi3Var;
            case 9:
                return new zi3(this.d, this.c, obj2, lnmVar, (byte) 9);
            case 10:
                return new zi3(this.d, this.c, obj2, lnmVar, (byte) 10);
            case 11:
                return new zi3(this.d, this.c, obj2, lnmVar, (byte) 11);
            case 12:
                return new zi3(this.d, this.c, obj2, lnmVar, (byte) 12);
            case 13:
                return new zi3(this.c, this.d, obj2, lnmVar, (byte) 13);
            case 14:
                return new zi3(this.c, this.d, obj2, lnmVar, (byte) 14);
            case 15:
                return new zi3(this.c, this.d, obj2, lnmVar, (byte) 15);
            case 16:
                zi3 zi3Var2 = new zi3((w4c1) obj2, this.c, lnmVar, (byte) 16);
                zi3Var2.d = obj;
                return zi3Var2;
            case 17:
                return new zi3(this.d, obj2, this.c, lnmVar, (byte) 17);
            default:
                return new zi3(this.d, obj2, this.c, lnmVar, (byte) 18);
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
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((bs41) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
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
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:170:0x037d A[Catch: all -> 0x03a9, TryCatch #1 {, blocks: (B:167:0x0368, B:168:0x0377, B:170:0x037d, B:172:0x0397, B:174:0x03a5), top: B:282:0x0368 }] */
    /* JADX WARN: Code duplicated, block: B:182:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:188:0x03df  */
    /* JADX WARN: Code duplicated, block: B:194:0x03fa A[LOOP:3: B:192:0x03f4->B:194:0x03fa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:197:0x040a  */
    /* JADX WARN: Code duplicated, block: B:199:0x0414  */
    /* JADX WARN: Code duplicated, block: B:202:0x0446  */
    /* JADX WARN: Code duplicated, block: B:205:0x0450 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:282:0x0368 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:285:0x0397 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:288:0x0377 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x03cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:294:0x03b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:0x03ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x03d9 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:201:0x0444 -> B:203:0x0448). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 1530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.zi3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zi3(Object obj, int i, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.c = i;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zi3(Object obj, int i, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zi3(Object obj, Object obj2, int i, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi3(asc ascVar, File file, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 3;
        this.d = ascVar;
        this.e = file;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi3(tjq tjqVar, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 5;
        this.e = tjqVar;
    }
}
