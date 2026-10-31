package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class svr extends a8d1 implements xu30 {
    public final /* synthetic */ byte a = 1;
    public long b;
    public byte c;
    public /* synthetic */ vr20 d;
    public /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public svr(long j, lnm lnmVar) {
        super(3, lnmVar);
        this.b = j;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = (vr20) obj;
        switch (b) {
            case 0:
                svr svrVar = new svr(this.b, (lnm) obj3);
                svrVar.d = vr20Var;
                svrVar.e = (jfx0) obj2;
                return svrVar.invokeSuspend(rih1Var);
            default:
                svr svrVar2 = new svr(3, (lnm) obj3);
                svrVar2.d = vr20Var;
                svrVar2.e = (u7y0) obj2;
                return svrVar2.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004d A[PHI: r1
      0x004d: PHI (r1v7 long) = (r1v3 long), (r1v6 long), (r1v10 long) binds: [B:19:0x004b, B:24:0x0076, B:9:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x005e A[PHI: r1
      0x005e: PHI (r1v5 long) = (r1v7 long), (r1v8 long) binds: [B:21:0x005b, B:11:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0076 -> B:20:0x004d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.svr.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ svr(int i, lnm lnmVar) {
        super(i, lnmVar);
    }
}
