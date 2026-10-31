package p;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qn41 {
    public final xm41 a;
    public final llm b;
    public final llm c;
    public final bbc d;
    public final AtomicReference e;
    public final xgn0 f;

    public qn41(xm41 xm41Var, q8n q8nVar) {
        fns fnsVar = igu.a;
        this.a = xm41Var;
        llm llmVarE = smo1.e(ilo1.B(q8nVar, new z8n("ScopeExecutorImpl")));
        this.b = llmVarE;
        this.c = smo1.e(ilo1.B(fnsVar, new z8n("ScopeExecutorTimers")));
        this.d = mno1.a(Integer.MAX_VALUE, 0, 6);
        this.e = new AtomicReference();
        this.f = new xgn0(true);
        c921.y(llmVarE, (o8n) null, 0, new vse0(this, (lnm) null, (byte) 18), 3);
        sam0 sam0Var = (sam0) xm41Var;
        sam0Var.e(new g521(this, (byte) 20), new mn41(this, (byte) 0));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0087 A[Catch: all -> 0x00c2, TRY_LEAVE, TryCatch #0 {all -> 0x00c2, blocks: (B:25:0x007f, B:27:0x0087, B:28:0x00b0, B:30:0x00be, B:35:0x00c6, B:36:0x00ed, B:37:0x00ee), top: B:44:0x007f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00be A[Catch: all -> 0x00c2, Exception -> 0x00c4, TryCatch #1 {Exception -> 0x00c4, blocks: (B:28:0x00b0, B:30:0x00be, B:35:0x00c6, B:36:0x00ed), top: B:46:0x00b0, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c6 A[Catch: all -> 0x00c2, Exception -> 0x00c4, TryCatch #1 {Exception -> 0x00c4, blocks: (B:28:0x00b0, B:30:0x00be, B:35:0x00c6, B:36:0x00ed), top: B:46:0x00b0, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0133 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0131 -> B:41:0x0134). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:48:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final void a(p.onm r12) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.qn41.a(p.onm):void");
    }
}
