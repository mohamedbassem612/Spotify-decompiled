package p;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wt41 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xtb0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wt41(xtb0 xtb0Var, byte b) {
        super(0);
        this.a = b;
        this.b = xtb0Var;
    }

    public final Object invoke() {
        Object next;
        Object next2;
        byte b = this.a;
        qtb0 qtb0Var = null;
        Object obj = null;
        Object obj2 = null;
        z = false;
        boolean z = false;
        xtb0 xtb0Var = this.b;
        switch (b) {
            case 0:
                return Integer.valueOf(xtb0Var.h().o);
            case 1:
                ptb0 ptb0VarH = xtb0Var.h();
                Integer numValueOf = Integer.valueOf(ptb0VarH.o);
                qtb0 qtb0Var2 = (qtb0) o7h.C0(ptb0VarH.l);
                return new mmr0(numValueOf, Integer.valueOf(qtb0Var2 != null ? qtb0Var2.a : -1));
            case 2:
                return Boolean.valueOf(!xtb0Var.c());
            case 3:
                return xtb0Var.h().l;
            case 4:
                return xtb0Var.h().l;
            case 5:
                return Boolean.valueOf(xtb0Var.j.b());
            case 6:
                Float fValueOf = Float.valueOf(-1.0f);
                ptb0 ptb0VarH2 = xtb0Var.h();
                List list = ptb0VarH2.l;
                if (list.isEmpty()) {
                    return fValueOf;
                }
                float fG = ((int) (ptb0VarH2.g() >> 32)) / 2.0f;
                float fAbs = Math.abs(ptb0VarH2.m);
                List list2 = list;
                Iterator it = list2.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        qtb0 qtb0Var3 = (qtb0) next;
                        float fAbs2 = Math.abs(((qtb0Var3.q / 2.0f) + (qtb0Var3.p + fAbs)) - fG);
                        do {
                            Object next3 = it.next();
                            qtb0 qtb0Var4 = (qtb0) next3;
                            float fAbs3 = Math.abs(((qtb0Var4.q / 2.0f) + (qtb0Var4.p + fAbs)) - fG);
                            if (Float.compare(fAbs2, fAbs3) > 0) {
                                next = next3;
                                fAbs2 = fAbs3;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                qtb0 qtb0Var5 = (qtb0) next;
                if (qtb0Var5 == null) {
                    return fValueOf;
                }
                int i = qtb0Var5.a;
                float f = (qtb0Var5.q / 2.0f) + qtb0Var5.p + fAbs;
                float f2 = fG - f;
                if (f2 > 0.0f) {
                    for (Object obj3 : list2) {
                        if (((qtb0) obj3).a == i + 1) {
                            obj = obj3;
                            qtb0Var = (qtb0) obj;
                        }
                    }
                    qtb0Var = (qtb0) obj;
                } else if (f2 < 0.0f) {
                    for (Object obj4 : list2) {
                        if (((qtb0) obj4).a == i - 1) {
                            obj2 = obj4;
                            qtb0Var = (qtb0) obj2;
                        }
                    }
                    qtb0Var = (qtb0) obj2;
                }
                if (qtb0Var == null) {
                    return Float.valueOf(i);
                }
                float fAbs4 = Math.abs(((qtb0Var.q / 2.0f) + (fAbs + qtb0Var.p)) - f);
                if (fAbs4 == 0.0f) {
                    return Float.valueOf(i);
                }
                float fAbs5 = Math.abs(f2) / fAbs4;
                return Float.valueOf(qtb0Var.a > i ? i + fAbs5 : i - fAbs5);
            case 7:
                return Integer.valueOf(xtb0Var.h().o);
            case 8:
                return new yr80(xtb0Var.h().g());
            case 9:
                ptb0 ptb0VarH3 = xtb0Var.h();
                int i2 = ptb0VarH3.o;
                qtb0 qtb0Var6 = (qtb0) o7h.C0(ptb0VarH3.l);
                return new mmr0(Integer.valueOf(qtb0Var6 != null ? qtb0Var6.a : 0), Integer.valueOf(i2));
            case 10:
                return Boolean.valueOf(xtb0Var.j.b());
            case 11:
                return new mmr0(Integer.valueOf(((err0) xtb0Var.e.b).s()), xtb0Var.h().l);
            case 12:
                List list3 = xtb0Var.h().l;
                if (list3.isEmpty()) {
                    return null;
                }
                int iG = ((int) (xtb0Var.h().g() >> 32)) / 2;
                int iAbs = Math.abs(xtb0Var.h().m);
                Iterator it2 = list3.iterator();
                if (it2.hasNext()) {
                    next2 = it2.next();
                    if (it2.hasNext()) {
                        qtb0 qtb0Var7 = (qtb0) next2;
                        int iAbs2 = Math.abs(((qtb0Var7.q / 2) + (qtb0Var7.p + iAbs)) - iG);
                        do {
                            Object next4 = it2.next();
                            qtb0 qtb0Var8 = (qtb0) next4;
                            int iAbs3 = Math.abs(((qtb0Var8.q / 2) + (qtb0Var8.p + iAbs)) - iG);
                            if (iAbs2 > iAbs3) {
                                next2 = next4;
                                iAbs2 = iAbs3;
                            }
                        } while (it2.hasNext());
                    }
                } else {
                    next2 = null;
                }
                qtb0 qtb0Var9 = (qtb0) next2;
                if (qtb0Var9 != null) {
                    return Integer.valueOf(qtb0Var9.a);
                }
                return null;
            case 13:
                return Integer.valueOf(((err0) xtb0Var.e.b).s());
            case 14:
                return xtb0Var.h().l;
            case 15:
                return Integer.valueOf(((err0) xtb0Var.e.b).s());
            default:
                qtb0 qtb0Var10 = (qtb0) o7h.C0(xtb0Var.h().l);
                int i3 = xtb0Var.h().o;
                if (qtb0Var10 != null && qtb0Var10.a >= i3 - 3) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
