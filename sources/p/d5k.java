package p;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class d5k extends a8d1 implements vu30 {
    public byte N0;
    public final /* synthetic */ List O0;
    public final /* synthetic */ f5k P0;
    public final /* synthetic */ guq0 Q0;
    public final /* synthetic */ Integer R0;
    public final /* synthetic */ boolean S0;
    public int X;
    public int Y;
    public int Z;
    public Map a;
    public Map b;
    public o811 c;
    public f5k d;
    public guq0 e;
    public Iterator f;
    public x7g1 g;
    public Integer h;
    public Map i;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5k(List list, f5k f5kVar, guq0 guq0Var, Integer num, boolean z, lnm lnmVar) {
        super(2, lnmVar);
        this.O0 = list;
        this.P0 = f5kVar;
        this.Q0 = guq0Var;
        this.R0 = num;
        this.S0 = z;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new d5k(this.O0, this.P0, this.Q0, this.R0, this.S0, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x009e  */
    /* JADX WARN: Code duplicated, block: B:15:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:17:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:19:0x00da  */
    /* JADX WARN: Code duplicated, block: B:20:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:23:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:26:0x012d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0152  */
    /* JADX WARN: Code duplicated, block: B:34:0x0163  */
    /* JADX WARN: Code duplicated, block: B:36:0x0175  */
    /* JADX WARN: Code duplicated, block: B:40:0x018b  */
    /* JADX WARN: Code duplicated, block: B:43:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Integer, java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x012d -> B:27:0x0136). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0152 -> B:32:0x015f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x018b -> B:39:0x0189). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.d5k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
