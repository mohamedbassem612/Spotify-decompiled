package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i50 extends a8d1 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ byte a = 0;
    public int b;
    public int c;
    public byte d;
    public Object e;
    public cv30 f;
    public Object g;
    public Object h;
    public Object i;
    public /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i50(cm0 cm0Var, ncy0 ncy0Var, iu30 iu30Var, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.h = cm0Var;
        this.i = ncy0Var;
        this.t = iu30Var;
        this.X = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.X;
        switch (b) {
            case 0:
                i50 i50Var = new i50((List) obj2, (zu30) this.g, lnmVar);
                i50Var.t = obj;
                return i50Var;
            default:
                return new i50((cm0) this.h, (ncy0) this.i, (iu30) this.t, (ven0) obj2, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x013d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0152  */
    /* JADX WARN: Code duplicated, block: B:58:0x016f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0196  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0196 -> B:63:0x019c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.i50.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i50(List list, zu30 zu30Var, lnm lnmVar) {
        super(2, lnmVar);
        this.X = list;
        this.g = zu30Var;
    }
}
