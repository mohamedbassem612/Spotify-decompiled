package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class oj51 extends a8d1 implements vu30 {
    public int N0;
    public byte O0;
    public /* synthetic */ Object P0;
    public final /* synthetic */ hj51 Q0;
    public final /* synthetic */ yxb0 R0;
    public int X;
    public int Y;
    public int Z;
    public qmn a;
    public List b;
    public Collection c;
    public Iterator d;
    public Integer e;
    public Collection f;
    public Iterator g;
    public Collection h;
    public int i;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oj51(hj51 hj51Var, yxb0 yxb0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.Q0 = hj51Var;
        this.R0 = yxb0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        oj51 oj51Var = new oj51(this.Q0, this.R0, lnmVar);
        oj51Var.P0 = obj;
        return oj51Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:21:0x0115  */
    /* JADX WARN: Code duplicated, block: B:24:0x0120  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x00ab -> B:16:0x00ce). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0115 -> B:22:0x011c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 709
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.oj51.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
