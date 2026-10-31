package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xdk extends a8d1 implements vu30 {
    public Long a;
    public Long b;
    public long c;
    public long d;
    public byte e;
    public /* synthetic */ Object f;
    public final /* synthetic */ d7d g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ yqg i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xdk(d7d d7dVar, boolean z, yqg yqgVar, lnm lnmVar) {
        super(2, lnmVar);
        this.g = d7dVar;
        this.h = z;
        this.i = yqgVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        xdk xdkVar = new xdk(this.g, this.h, this.i, lnmVar);
        xdkVar.f = obj;
        return xdkVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00da  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00da -> B:39:0x00dd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0128 -> B:52:0x012b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.xdk.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
