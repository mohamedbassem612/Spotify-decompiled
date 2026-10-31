package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cu implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ssw0 b;

    public /* synthetic */ cu(ssw0 ssw0Var, byte b) {
        this.a = b;
        this.b = ssw0Var;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:93:0x010d  */
    public final Object emit(Object obj, lnm lnmVar) {
        dch dchVar;
        xs20 xs20Var;
        at20 at20Var;
        byte b = this.a;
        jm jmVar = wqn1.a;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        ssw0 ssw0Var = this.b;
        switch (b) {
            case 0:
                Object objB = ssw0Var.b((List) obj, lnmVar);
                return objB == d9nVar ? objB : rih1Var;
            case 1:
                Object objB2 = ssw0Var.b(obj, lnmVar);
                return objB2 == d9nVar ? objB2 : rih1Var;
            case 2:
                if (lnmVar instanceof dch) {
                    dchVar = (dch) lnmVar;
                    int i = dchVar.c;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        dchVar.c = i - Integer.MIN_VALUE;
                    } else {
                        dchVar = new dch(this, lnmVar);
                    }
                } else {
                    dchVar = new dch(this, lnmVar);
                }
                Object obj2 = dchVar.a;
                int i2 = dchVar.c;
                if (i2 == 0) {
                    hm5.M(obj2);
                    r261 r261VarC = ssw0Var.c();
                    if (obj == null) {
                        obj = jmVar;
                    }
                    dchVar.c = 1;
                    if (r261VarC.b(obj, dchVar) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i2 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj2);
                }
                return rih1Var;
            case 3:
                Object objB3 = ssw0Var.b((n331) obj, lnmVar);
                return objB3 == d9nVar ? objB3 : rih1Var;
            case 4:
                Object objB4 = ssw0Var.b((mvh1) obj, lnmVar);
                return objB4 == d9nVar ? objB4 : rih1Var;
            case 5:
                Object objB5 = ssw0Var.b(new it61(Boolean.valueOf(((cgl) obj) == cgl.c)), lnmVar);
                return objB5 == d9nVar ? objB5 : rih1Var;
            case 6:
                if (lnmVar instanceof xs20) {
                    xs20Var = (xs20) lnmVar;
                    int i3 = xs20Var.c;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        xs20Var.c = i3 - Integer.MIN_VALUE;
                    } else {
                        xs20Var = new xs20(this, lnmVar);
                    }
                } else {
                    xs20Var = new xs20(this, lnmVar);
                }
                Object obj3 = xs20Var.a;
                int i4 = xs20Var.c;
                if (i4 == 0) {
                    hm5.M(obj3);
                    if (obj == null) {
                        obj = jmVar;
                    }
                    xs20Var.c = 1;
                    if (ssw0Var.b(obj, xs20Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i4 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj3);
                }
                return rih1Var;
            case 7:
                if (lnmVar instanceof at20) {
                    at20Var = (at20) lnmVar;
                    int i5 = at20Var.c;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        at20Var.c = i5 - Integer.MIN_VALUE;
                    } else {
                        at20Var = new at20(this, lnmVar);
                    }
                } else {
                    at20Var = new at20(this, lnmVar);
                }
                Object obj4 = at20Var.a;
                int i6 = at20Var.c;
                if (i6 == 0) {
                    hm5.M(obj4);
                    if (obj == null) {
                        obj = jmVar;
                    }
                    at20Var.c = 1;
                    if (ssw0Var.b(obj, at20Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i6 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj4);
                }
                return rih1Var;
            case 8:
                Object objB6 = ssw0Var.b((z310) obj, lnmVar);
                return objB6 == d9nVar ? objB6 : rih1Var;
            case 9:
                Object objB7 = ssw0Var.b((z310) obj, lnmVar);
                return objB7 == d9nVar ? objB7 : rih1Var;
            case 10:
                Object objB8 = ssw0Var.b((pld0) obj, lnmVar);
                return objB8 == d9nVar ? objB8 : rih1Var;
            case 11:
                ssw0Var.l((l2s0) obj);
                return rih1Var;
            case 12:
                Object objB9 = ssw0Var.b((jt61) obj, lnmVar);
                return objB9 == d9nVar ? objB9 : rih1Var;
            case 13:
                Object objB10 = ssw0Var.b((py21) obj, lnmVar);
                return objB10 == d9nVar ? objB10 : rih1Var;
            case 14:
                Object objB11 = ssw0Var.b((py21) obj, lnmVar);
                return objB11 == d9nVar ? objB11 : rih1Var;
            default:
                Object objB12 = ssw0Var.b((py21) obj, lnmVar);
                return objB12 == d9nVar ? objB12 : rih1Var;
        }
    }
}
