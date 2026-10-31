package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cn6 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cn6(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:87:0x015f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    public final Object emit(Object obj, lnm lnmVar) {
        bn6 bn6Var;
        zgc0 zgc0Var;
        yed1 yed1Var;
        byte b = this.a;
        boolean z = false;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        int i = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        String xgc0Var = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof bn6) {
                    bn6Var = (bn6) lnmVar;
                    int i2 = bn6Var.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        bn6Var.b = i2 - Integer.MIN_VALUE;
                    } else {
                        bn6Var = new bn6(this, lnmVar);
                    }
                } else {
                    bn6Var = new bn6(this, lnmVar);
                }
                Object obj4 = bn6Var.a;
                int i3 = bn6Var.b;
                if (i3 == 0) {
                    hm5.M(obj4);
                    k1r map = ((k1r) obj).map(new ym((sxg) obj2, i, (byte) 3));
                    bn6Var.b = 1;
                    if (((vr20) obj3).emit(map, bn6Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i3 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj4);
                }
                return rih1Var;
            case 1:
                if (!((Boolean) obj).booleanValue()) {
                    ptb0 ptb0VarH = ((xtb0) obj3).h();
                    qtb0 qtb0Var = (qtb0) o7h.C0(ptb0VarH.l);
                    ven0 ven0Var = (ven0) obj2;
                    int i4 = qtb0Var != null ? qtb0Var.a : -1;
                    int i5 = qtb0Var != null ? qtb0Var.p + qtb0Var.q : 0;
                    int i6 = ptb0VarH.o;
                    int i7 = ptb0VarH.n;
                    if (i6 == 0 || (i4 == i6 - 1 && i7 - i5 >= (-i))) {
                        z = true;
                    }
                    ven0Var.setValue(Boolean.valueOf(z));
                }
                return rih1Var;
            case 2:
                if (lnmVar instanceof zgc0) {
                    zgc0Var = (zgc0) lnmVar;
                    int i8 = zgc0Var.b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        zgc0Var.b = i8 - Integer.MIN_VALUE;
                    } else {
                        zgc0Var = new zgc0(this, lnmVar);
                    }
                } else {
                    zgc0Var = new zgc0(this, lnmVar);
                }
                Object obj5 = zgc0Var.a;
                int i9 = zgc0Var.b;
                if (i9 == 0) {
                    hm5.M(obj5);
                    vr20 vr20Var = (vr20) obj3;
                    vgc0 vgc0Var = (vgc0) obj;
                    if (vgc0Var != null) {
                        rgc0 rgc0Var = ((dhc0) obj2).b;
                        Set set = rgc0Var.e;
                        String str = vgc0Var.a;
                        if (str == null) {
                            Integer num = vgc0Var.b;
                            if (num != null) {
                                xgc0Var = rgc0Var.b.getString(num.intValue());
                            }
                        } else {
                            xgc0Var = str;
                        }
                        xgc0Var = new xgc0(i, vgc0Var, o7h.i0(set, xgc0Var));
                    }
                    zgc0Var.b = 1;
                    if (vr20Var.emit(xgc0Var, zgc0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i9 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj5);
                }
                return rih1Var;
            default:
                if (lnmVar instanceof yed1) {
                    yed1Var = (yed1) lnmVar;
                    int i10 = yed1Var.b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        yed1Var.b = i10 - Integer.MIN_VALUE;
                    } else {
                        yed1Var = new yed1(this, lnmVar);
                    }
                } else {
                    yed1Var = new yed1(this, lnmVar);
                }
                Object obj6 = yed1Var.a;
                int i11 = yed1Var.b;
                if (i11 == 0) {
                    hm5.M(obj6);
                    vr20 vr20Var2 = (vr20) obj3;
                    List list = (List) obj;
                    ufr0 ufr0Var = (ufr0) obj2;
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            if (((qfr0) it.next()) instanceof sfr0) {
                                ArrayList arrayList = new ArrayList(list);
                                if (i == 0) {
                                    arrayList.add(0, new hfr0(1));
                                } else if (i == p7h.L(ufr0Var.c)) {
                                    arrayList.add(0, new hfr0(2));
                                    arrayList.add(new hfr0(2));
                                } else {
                                    arrayList.add(0, new hfr0(2));
                                }
                                list = arrayList;
                            }
                        }
                    }
                    yed1Var.b = 1;
                    if (vr20Var2.emit(list, yed1Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i11 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj6);
                }
                return rih1Var;
        }
    }

    public /* synthetic */ cn6(vr20 vr20Var, Object obj, int i, byte b) {
        this.a = b;
        this.c = vr20Var;
        this.d = obj;
        this.b = i;
    }
}
