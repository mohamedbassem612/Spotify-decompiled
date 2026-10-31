package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class u4v extends z031 implements vu30 {
    public bav0 b;
    public int c;
    public byte d;
    public /* synthetic */ Object e;
    public final /* synthetic */ l811 f;
    public final /* synthetic */ p811 g;
    public final /* synthetic */ p811 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4v(l811 l811Var, p811 p811Var, p811 p811Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.f = l811Var;
        this.g = p811Var;
        this.h = p811Var2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        u4v u4vVar = new u4v(this.f, this.g, this.h, lnmVar);
        u4vVar.e = obj;
        return u4vVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((i8d1) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0068 A[LOOP:2: B:16:0x0059->B:20:0x0068, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x006c A[EDGE_INSN: B:74:0x006c->B:22:0x006c BREAK  A[LOOP:2: B:16:0x0059->B:20:0x0068], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00b5 -> B:39:0x00b8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.u4v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
