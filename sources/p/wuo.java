package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wuo extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public Object b;
    public int c;
    public byte d;
    public final /* synthetic */ boolean e;
    public Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wuo(ij31 ij31Var, boolean z, lnm lnmVar) {
        super(2, lnmVar);
        this.g = ij31Var;
        this.e = z;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        boolean z = this.e;
        Object obj2 = this.g;
        switch (b) {
            case 0:
                wuo wuoVar = new wuo(z, (List) obj2, lnmVar);
                wuoVar.b = obj;
                return wuoVar;
            default:
                return new wuo((ij31) obj2, z, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:? A[LOOP:0: B:92:0x019a->B:109:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0139 A[LOOP:1: B:76:0x0133->B:78:0x0139, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:94:0x01a0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x0180 -> B:75:0x012c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:60:0x00ec
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.wuo.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wuo(boolean z, List list, lnm lnmVar) {
        super(2, lnmVar);
        this.e = z;
        this.g = list;
    }
}
