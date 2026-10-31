package p;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xvg extends a8d1 implements vu30 {
    public AtomicReference a;
    public uac b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ bbc e;
    public final /* synthetic */ zvg f;
    public final /* synthetic */ lz81 g;
    public final /* synthetic */ r261 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xvg(bbc bbcVar, zvg zvgVar, lz81 lz81Var, r261 r261Var, lnm lnmVar) {
        super(2, lnmVar);
        this.e = bbcVar;
        this.f = zvgVar;
        this.g = lz81Var;
        this.h = r261Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        xvg xvgVar = new xvg(this.e, this.f, this.g, this.h, lnmVar);
        xvgVar.d = obj;
        return xvgVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0043  */
    /* JADX WARN: Code duplicated, block: B:16:0x004d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0060  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0038 -> B:12:0x003b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x003a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.d
            p.c9n r0 = (p.c9n) r0
            boolean r1 = r8.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1a
            if (r1 != r3) goto L14
            p.uac r1 = r8.b
            java.util.concurrent.atomic.AtomicReference r4 = r8.a
            p.hm5.M(r9)
            goto L3b
        L14:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r2
        L1a:
            p.hm5.M(r9)
            java.util.concurrent.atomic.AtomicReference r9 = new java.util.concurrent.atomic.AtomicReference
            r9.<init>()
            p.uac r1 = new p.uac
            p.bbc r4 = r8.e
            r1.<init>(r4)
            r4 = r9
        L2a:
            r8.d = r0
            r8.a = r4
            r8.b = r1
            r8.c = r3
            java.lang.Object r9 = r1.a(r8)
            p.d9n r5 = p.d9n.a
            if (r9 != r5) goto L3b
            return r5
        L3b:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L60
            java.lang.Object r9 = r1.c()
            java.lang.Object r9 = r4.getAndSet(r9)
            if (r9 != 0) goto L2a
            p.zvg r9 = r8.f
            p.o8n r9 = r9.a
            p.wvg r5 = new p.wvg
            p.lz81 r6 = r8.g
            p.r261 r7 = r8.h
            r5.<init>(r4, r6, r7, r2)
            r6 = 2
            r7 = 0
            p.fn31.T(r0, r9, r7, r5, r6)
            goto L2a
        L60:
            p.rih1 r8 = p.rih1.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.xvg.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
