package p;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kff extends a8d1 implements vu30 {
    public final /* synthetic */ uff N0;
    public final /* synthetic */ long O0;
    public final /* synthetic */ ven0 P0;
    public int X;
    public byte Y;
    public final /* synthetic */ eth0 Z;
    public uff a;
    public ven0 b;
    public Collection c;
    public Iterator d;
    public dth0 e;
    public long f;
    public int g;
    public int h;
    public int i;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kff(eth0 eth0Var, uff uffVar, long j, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.Z = eth0Var;
        this.N0 = uffVar;
        this.O0 = j;
        this.P0 = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new kff(this.Z, this.N0, this.O0, this.P0, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0096  */
    /* JADX WARN: Code duplicated, block: B:34:0x017e  */
    /* JADX WARN: Code duplicated, block: B:37:0x01b6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00f2 -> B:36:0x01b4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0142 -> B:7:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.kff.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
