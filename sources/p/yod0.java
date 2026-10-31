package p;

import io.reactivex.rxjava3.core.Single;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yod0 extends a8d1 implements vu30 {
    public final /* synthetic */ Set N0;
    public final /* synthetic */ m900 O0;
    public byte X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ Single Z;
    public m900 a;
    public Map b;
    public Iterator c;
    public String d;
    public vr20 e;
    public Map f;
    public Object g;
    public boolean h;
    public int i;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yod0(Single single, Set set, m900 m900Var, lnm lnmVar) {
        super(2, lnmVar);
        this.Z = single;
        this.N0 = set;
        this.O0 = m900Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        yod0 yod0Var = new yod0(this.Z, this.N0, this.O0, lnmVar);
        yod0Var.Y = obj;
        return yod0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0082  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d7 A[Catch: Exception -> 0x00f4, CancellationException -> 0x010f, TryCatch #0 {CancellationException -> 0x010f, blocks: (B:11:0x0035, B:28:0x00d3, B:30:0x00d7, B:24:0x0089, B:31:0x00e2), top: B:44:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00e2 A[Catch: Exception -> 0x00f4, CancellationException -> 0x010f, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x010f, blocks: (B:11:0x0035, B:28:0x00d3, B:30:0x00d7, B:24:0x0089, B:31:0x00e2), top: B:44:0x0035 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00ce -> B:28:0x00d3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.yod0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
