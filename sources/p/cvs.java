package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cvs extends a8d1 implements vu30 {
    public Object X;
    public Object Y;
    public final /* synthetic */ byte a = 0;
    public int b;
    public int c;
    public byte d;
    public Object e;
    public Object f;
    public final /* synthetic */ Object g;
    public Object h;
    public final /* synthetic */ Object i;
    public Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvs(smk0 smk0Var, res resVar, sen0 sen0Var, ven0 ven0Var, drr0 drr0Var, frr0 frr0Var, frr0 frr0Var2, ven0 ven0Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.e = smk0Var;
        this.f = resVar;
        this.g = sen0Var;
        this.h = ven0Var;
        this.i = drr0Var;
        this.t = frr0Var;
        this.X = frr0Var2;
        this.Y = ven0Var2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.i;
        Object obj3 = this.g;
        switch (b) {
            case 0:
                return new cvs((List) obj3, (yjq) obj2, lnmVar);
            default:
                return new cvs((smk0) this.e, (res) this.f, (sen0) obj3, (ven0) this.h, (drr0) obj2, (frr0) this.t, (frr0) this.X, (ven0) this.Y, lnmVar);
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

    /* JADX WARN: Code duplicated, block: B:100:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0277  */
    /* JADX WARN: Code duplicated, block: B:92:0x02be  */
    /* JADX WARN: Code duplicated, block: B:96:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:98:0x02d9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x015a -> B:47:0x015d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x02be -> B:93:0x02c4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 852
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.cvs.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvs(List list, yjq yjqVar, lnm lnmVar) {
        super(2, lnmVar);
        this.g = list;
        this.i = yjqVar;
    }
}
