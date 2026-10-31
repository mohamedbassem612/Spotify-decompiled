package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bu00 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;

    public bu00(int i, iu30 iu30Var) {
        this.a = (byte) 3;
        this.c = i;
        this.b = iu30Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e2  */
    public final Object emit(Object obj, lnm lnmVar) {
        au00 au00Var;
        nyg0 nyg0Var;
        xg81 xg81Var;
        byte b = this.a;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        int i = this.c;
        switch (b) {
            case 0:
                if (lnmVar instanceof au00) {
                    au00Var = (au00) lnmVar;
                    int i2 = au00Var.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        au00Var.b = i2 - Integer.MIN_VALUE;
                    } else {
                        au00Var = new au00(this, lnmVar);
                    }
                } else {
                    au00Var = new au00(this, lnmVar);
                }
                Object obj3 = au00Var.a;
                int i3 = au00Var.b;
                if (i3 == 0) {
                    hm5.M(obj3);
                    Boolean bool = (Boolean) obj;
                    bool.getClass();
                    mmr0 mmr0Var = new mmr0(new Integer(i), bool);
                    au00Var.b = 1;
                    if (((vr20) obj2).emit(mmr0Var, au00Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i3 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj3);
                }
                return rih1Var;
            case 1:
                if (lnmVar instanceof nyg0) {
                    nyg0Var = (nyg0) lnmVar;
                    int i4 = nyg0Var.b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        nyg0Var.b = i4 - Integer.MIN_VALUE;
                    } else {
                        nyg0Var = new nyg0(this, lnmVar);
                    }
                } else {
                    nyg0Var = new nyg0(this, lnmVar);
                }
                Object obj4 = nyg0Var.a;
                int i5 = nyg0Var.b;
                if (i5 == 0) {
                    hm5.M(obj4);
                    vr20 vr20Var = (vr20) obj2;
                    List list = (List) obj;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (((qtb0) it.next()).a == i) {
                                nyg0Var.b = 1;
                                if (vr20Var.emit(obj, nyg0Var) == d9nVar) {
                                    return d9nVar;
                                }
                            }
                        }
                    }
                } else {
                    if (i5 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj4);
                }
                return rih1Var;
            case 2:
                if (lnmVar instanceof xg81) {
                    xg81Var = (xg81) lnmVar;
                    int i6 = xg81Var.b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        xg81Var.b = i6 - Integer.MIN_VALUE;
                    } else {
                        xg81Var = new xg81(this, lnmVar);
                    }
                } else {
                    xg81Var = new xg81(this, lnmVar);
                }
                Object obj5 = xg81Var.a;
                int i7 = xg81Var.b;
                if (i7 == 0) {
                    hm5.M(obj5);
                    vr20 vr20Var2 = (vr20) obj2;
                    kh81 kh81Var = (kh81) obj;
                    mmr0 mmr0Var2 = kh81Var != null ? new mmr0(new Integer(i), kh81Var) : null;
                    xg81Var.b = 1;
                    if (vr20Var2.emit(mmr0Var2, xg81Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i7 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj5);
                }
                return rih1Var;
            default:
                ((iu30) obj2).invoke(new Float(1.0f - yoi1.o(((Number) obj).floatValue() / i, 0.0f, 1.0f)));
                return rih1Var;
        }
    }

    public /* synthetic */ bu00(vr20 vr20Var, int i, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = i;
    }
}
