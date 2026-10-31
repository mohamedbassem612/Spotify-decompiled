package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class csr extends a8d1 implements vu30 {
    public final /* synthetic */ gj3 N0;
    public final /* synthetic */ String X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ boolean Z;
    public Collection a;
    public Iterator b;
    public Collection c;
    public int d;
    public int e;
    public boolean f;
    public /* synthetic */ Object g;
    public final /* synthetic */ ArrayList h;
    public final /* synthetic */ yjq i;
    public final /* synthetic */ List t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csr(ArrayList arrayList, yjq yjqVar, List list, String str, String str2, boolean z, gj3 gj3Var, lnm lnmVar) {
        super(2, lnmVar);
        this.h = arrayList;
        this.i = yjqVar;
        this.t = list;
        this.X = str;
        this.Y = str2;
        this.Z = z;
        this.N0 = gj3Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        csr csrVar = new csr(this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, lnmVar);
        csrVar.g = obj;
        return csrVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0088  */
    /* JADX WARN: Code duplicated, block: B:23:0x00aa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00ab -> B:25:0x00ac). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.csr.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
