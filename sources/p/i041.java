package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i041 extends a8d1 implements vu30 {
    public Collection a;
    public Iterator b;
    public Collection c;
    public int d;
    public int e;
    public boolean f;
    public /* synthetic */ Object g;
    public final /* synthetic */ List h;
    public final /* synthetic */ l041 i;
    public final /* synthetic */ voe1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i041(List list, l041 l041Var, voe1 voe1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.h = list;
        this.i = l041Var;
        this.t = voe1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        i041 i041Var = new i041(this.h, this.i, this.t, lnmVar);
        i041Var.g = obj;
        return i041Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0093  */
    /* JADX WARN: Code duplicated, block: B:21:0x00b4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x00b5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00b5 -> B:23:0x00b6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.i041.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
