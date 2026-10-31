package p;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u0r extends a8d1 implements vu30 {
    public final /* synthetic */ List X;
    public final /* synthetic */ nwf1 Y;
    public final /* synthetic */ byte a;
    public Map b;
    public Iterator c;
    public Map d;
    public Object e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0r(List list, nwf1 nwf1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.X = list;
        this.Y = nwf1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        n6g1 n6g1Var = this.Y;
        List list = this.X;
        switch (b) {
            case 0:
                u0r u0rVar = new u0r(list, (w0r) n6g1Var, lnmVar, (byte) 0);
                u0rVar.t = obj;
                return u0rVar;
            default:
                u0r u0rVar2 = new u0r(list, n6g1Var, lnmVar, (byte) 1);
                u0rVar2.t = obj;
                return u0rVar2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0142  */
    /* JADX WARN: Code duplicated, block: B:46:0x016b  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00b9 -> B:24:0x00bd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x016b -> B:47:0x016f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.u0r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
