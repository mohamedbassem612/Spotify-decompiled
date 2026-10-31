package p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class peb extends a8d1 implements vu30 {
    public final /* synthetic */ fjt a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ at80 d;
    public final /* synthetic */ eus0 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ c380 i;
    public final /* synthetic */ ven0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public peb(fjt fjtVar, boolean z, iu30 iu30Var, at80 at80Var, eus0 eus0Var, boolean z2, boolean z3, boolean z4, c380 c380Var, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = fjtVar;
        this.b = z;
        this.c = iu30Var;
        this.d = at80Var;
        this.e = eus0Var;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = c380Var;
        this.t = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new peb(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        peb pebVarCreate = create((c9n) obj, (lnm) obj2);
        rih1 rih1Var = rih1.a;
        pebVarCreate.invokeSuspend(rih1Var);
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x007f A[LOOP:0: B:35:0x0079->B:37:0x007f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x0095  */
    /* JADX WARN: Code duplicated, block: B:41:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x009a  */
    /* JADX WARN: Code duplicated, block: B:43:0x009d  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b5  */
    public final Object invokeSuspend(Object obj) {
        at80 at80Var;
        ArrayList arrayList;
        Iterator it;
        md80 md80VarL;
        int iOrdinal;
        md80 md80Var;
        dg80 dg80Var;
        int i;
        md80 md80Var2;
        hm5.M(obj);
        fjt fjtVar = fjt.a;
        rih1 rih1Var = rih1.a;
        fjt fjtVar2 = this.a;
        if (fjtVar2 == fjtVar) {
            boolean z = this.b;
            iu30 iu30Var = this.c;
            boolean z2 = this.f;
            at80 at80Var2 = this.d;
            if (z) {
                boolean z3 = this.e.c;
                boolean z4 = this.g;
                if (z3) {
                    i = 1;
                } else {
                    i = (z2 || z4) ? 3 : 2;
                }
                if (z2) {
                    md80Var2 = md80.b;
                } else {
                    md80Var2 = z4 ? md80.c : null;
                }
                iu30Var.invoke(new hg80(i, md80Var2, at80Var2));
            }
            md80 md80Var3 = (md80) this.t.getValue();
            if (!this.h && md80Var3 != null) {
                int iOrdinal2 = fjtVar2.ordinal();
                if (iOrdinal2 == 0) {
                    if (bt80.a[at80Var2.ordinal()] != 1) {
                        at80Var = at80Var2;
                    }
                    c380 c380Var = this.i;
                    arrayList = new ArrayList(q7h.U(c380Var, 10));
                    it = c380Var.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((zk8) it.next()).a.a);
                    }
                    md80VarL = zod.L(arrayList, at80Var);
                    if (z2) {
                        dg80Var = dg80.MARKET_CONFIGURATION_FAILURE;
                    } else if (md80Var3 != md80VarL) {
                        dg80Var = dg80.USER_SWITCH;
                    } else {
                        iOrdinal = at80Var.ordinal();
                        if (iOrdinal != 0 || iOrdinal == 1) {
                            md80Var = md80.b;
                        } else {
                            if (iOrdinal != 2) {
                                eg.o();
                                return null;
                            }
                            md80Var = md80.c;
                        }
                        if (md80VarL != md80Var) {
                            dg80Var = dg80.AUTH_METHOD_UNAVAILABLE;
                        } else {
                            dg80Var = dg80.INITIAL;
                        }
                    }
                    iu30Var.invoke(new kg80(at80Var2, md80Var3, dg80Var));
                } else if (iOrdinal2 != 1) {
                    eg.o();
                    return null;
                }
                at80Var = at80.b;
                c380 c380Var2 = this.i;
                arrayList = new ArrayList(q7h.U(c380Var2, 10));
                it = c380Var2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((zk8) it.next()).a.a);
                }
                md80VarL = zod.L(arrayList, at80Var);
                if (z2) {
                    dg80Var = dg80.MARKET_CONFIGURATION_FAILURE;
                } else if (md80Var3 != md80VarL) {
                    dg80Var = dg80.USER_SWITCH;
                } else {
                    iOrdinal = at80Var.ordinal();
                    if (iOrdinal != 0) {
                        md80Var = md80.b;
                    } else {
                        md80Var = md80.b;
                    }
                    if (md80VarL != md80Var) {
                        dg80Var = dg80.AUTH_METHOD_UNAVAILABLE;
                    } else {
                        dg80Var = dg80.INITIAL;
                    }
                }
                iu30Var.invoke(new kg80(at80Var2, md80Var3, dg80Var));
            }
        }
        return rih1Var;
    }
}
