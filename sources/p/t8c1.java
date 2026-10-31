package p;

import com.spotify.fandomcollectibles.protos.EntityListItem;
import com.spotify.fandomcollectibles.protos.EntityListStory;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t8c1 extends a8d1 implements xu30 {
    public int N0;
    public int O0;
    public int P0;
    public int Q0;
    public byte R0;
    public /* synthetic */ f8c1 S0;
    public final /* synthetic */ EntityListStory T0;
    public gpr0 X;
    public gpr0 Y;
    public Collection Z;
    public Object[] a;
    public zda[] b;
    public Object[] c;
    public sk41 d;
    public Object e;
    public Iterator f;
    public EntityListItem g;
    public Object[] h;
    public sk41 i;
    public zda[] t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8c1(EntityListStory entityListStory, lnm lnmVar) {
        super(3, lnmVar);
        this.T0 = entityListStory;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        t8c1 t8c1Var = new t8c1(this.T0, (lnm) obj3);
        t8c1Var.S0 = (f8c1) obj2;
        return t8c1Var.invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0136  */
    /* JADX WARN: Code duplicated, block: B:20:0x0185  */
    /* JADX WARN: Code duplicated, block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object[], p.sk41] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0185 -> B:21:0x0193). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 517
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.t8c1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
