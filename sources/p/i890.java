package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i890 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public boolean b;
    public final /* synthetic */ short c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [int, short] */
    public i890(long j, syn0 syn0Var, UUID uuid, lnm lnmVar) {
        super(2, lnmVar);
        this.c = (int) j;
        this.d = syn0Var;
        this.e = uuid;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.e;
        short s = this.c;
        switch (b) {
            case 0:
                i890 i890Var = new i890(s, (o860) obj2, lnmVar);
                i890Var.d = obj;
                return i890Var;
            default:
                return new i890(s, (syn0) this.d, (UUID) obj2, lnmVar);
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

    /* JADX WARN: Code duplicated, block: B:33:0x0078  */
    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a5 A[Catch: all -> 0x00ad, TryCatch #0 {all -> 0x00ad, blocks: (B:38:0x0094, B:40:0x00a5, B:43:0x00af), top: B:55:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00af A[Catch: all -> 0x00ad, TRY_LEAVE, TryCatch #0 {all -> 0x00ad, blocks: (B:38:0x0094, B:40:0x00a5, B:43:0x00af), top: B:55:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0086 -> B:36:0x008a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.i890.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [int, short] */
    public i890(long j, o860 o860Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = (int) j;
        this.e = o860Var;
    }
}
