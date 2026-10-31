package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z1v0 extends a8d1 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ byte a = 1;
    public int b;
    public int c;
    public byte d;
    public int e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1v0(wcg1 wcg1Var, xtb0 xtb0Var, fgz0 fgz0Var, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, lnm lnmVar) {
        super(2, lnmVar);
        this.f = wcg1Var;
        this.g = xtb0Var;
        this.h = fgz0Var;
        this.i = ven0Var;
        this.t = ven0Var2;
        this.X = ven0Var3;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.X;
        switch (b) {
            case 0:
                return new z1v0((a2v0) obj2, lnmVar);
            case 1:
                return new z1v0((List) this.i, this.e, (hdn0) this.t, (ven0) obj2, lnmVar);
            default:
                return new z1v0((wcg1) this.f, (xtb0) this.g, (fgz0) this.h, (ven0) this.i, (ven0) this.t, (ven0) obj2, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return d9n.a;
            case 1:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            default:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x029e  */
    /* JADX WARN: Code duplicated, block: B:118:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:119:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:120:0x02d1 -> B:121:0x02d7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:135:0x036e -> B:124:0x02ed). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:138:0x038f -> B:121:0x02d7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x01a9 -> B:80:0x01ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x01e5 -> B:87:0x01e7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 926
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.z1v0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1v0(a2v0 a2v0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.X = a2v0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1v0(List list, int i, hdn0 hdn0Var, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.i = list;
        this.e = i;
        this.t = hdn0Var;
        this.X = ven0Var;
    }
}
