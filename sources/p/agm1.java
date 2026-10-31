package p;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class agm1 extends a8d1 implements vu30 {
    public byte X;
    public final /* synthetic */ phm1 Y;
    public final /* synthetic */ cik1 Z;
    public cik1 a;
    public phm1 b;
    public Collection c;
    public Iterator d;
    public qhm1 e;
    public Object f;
    public Collection g;
    public int h;
    public int i;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agm1(phm1 phm1Var, cik1 cik1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.Y = phm1Var;
        this.Z = cik1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new agm1(this.Y, this.Z, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0082  */
    /* JADX WARN: Code duplicated, block: B:15:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:17:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:24:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:28:0x011c  */
    /* JADX WARN: Code duplicated, block: B:31:0x012e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0167  */
    /* JADX WARN: Code duplicated, block: B:36:0x0177  */
    /* JADX WARN: Code duplicated, block: B:39:0x0180  */
    /* JADX WARN: Code duplicated, block: B:42:0x018d  */
    /* JADX WARN: Code duplicated, block: B:49:0x01bb A[LOOP:2: B:47:0x01b5->B:49:0x01bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:54:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:55:0x0202  */
    /* JADX WARN: Code duplicated, block: B:62:0x019e A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x011c -> B:29:0x0126). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 583
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.agm1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
