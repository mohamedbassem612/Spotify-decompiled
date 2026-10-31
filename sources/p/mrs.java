package p;

import android.content.Context;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mrs extends a8d1 implements bv30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ boolean b;
    public /* synthetic */ boolean c;
    public /* synthetic */ boolean d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mrs(Object obj, lnm lnmVar, byte b) {
        super(5, lnmVar);
        this.a = b;
        this.f = obj;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj6 = this.f;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
                mrs mrsVar = new mrs((zfr) obj6, (lnm) obj5, (byte) 0);
                mrsVar.b = zBooleanValue;
                mrsVar.c = zBooleanValue2;
                mrsVar.d = zBooleanValue3;
                mrsVar.e = (String) obj4;
                return mrsVar.invokeSuspend(rih1Var);
            case 1:
                boolean zBooleanValue4 = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue5 = ((Boolean) obj3).booleanValue();
                boolean zBooleanValue6 = ((Boolean) obj4).booleanValue();
                mrs mrsVar2 = new mrs((a0z0) obj6, (lnm) obj5, (byte) 1);
                mrsVar2.e = (qzy0) obj;
                mrsVar2.b = zBooleanValue4;
                mrsVar2.c = zBooleanValue5;
                mrsVar2.d = zBooleanValue6;
                return mrsVar2.invokeSuspend(rih1Var);
            default:
                boolean zBooleanValue7 = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue8 = ((Boolean) obj3).booleanValue();
                boolean zBooleanValue9 = ((Boolean) obj4).booleanValue();
                mrs mrsVar3 = new mrs((ju51) obj6, (lnm) obj5, (byte) 2);
                mrsVar3.e = (Set) obj;
                mrsVar3.b = zBooleanValue7;
                mrsVar3.c = zBooleanValue8;
                mrsVar3.d = zBooleanValue9;
                return mrsVar3.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        l4a0 l4a0Var;
        fg91 fg91VarA;
        byte b = this.a;
        Object obj2 = this.f;
        switch (b) {
            case 0:
                boolean z = this.b;
                boolean z2 = this.c;
                boolean z3 = this.d;
                String str = (String) this.e;
                hm5.M(obj);
                boolean z4 = ((no4) ((b0a0) ((zfr) obj2).b).a.get()).I() && z3;
                String upperCase = str.toUpperCase(Locale.ROOT);
                if (upperCase.equals("BASIC")) {
                    l4a0Var = l4a0.a;
                } else {
                    l4a0Var = upperCase.equals("EXPANDED") ? l4a0.b : l4a0.c;
                }
                return new c5a1(z, z2, z4, l4a0Var);
            case 1:
                qzy0 qzy0Var = (qzy0) this.e;
                boolean z5 = this.b;
                boolean z6 = this.c;
                boolean z7 = this.d;
                hm5.M(obj);
                int i = qzy0Var == null ? -1 : zzy0.a[qzy0Var.ordinal()];
                if (i != -1) {
                    if (i != 1) {
                        if (i == 2) {
                            return z6 ? rzy0.f : rzy0.e;
                        }
                        if (i == 3) {
                            a0z0 a0z0Var = (a0z0) obj2;
                            return (a0z0Var.a && ((kz4) ((m7y0) a0z0Var.d).b).b()) ? rzy0.h : rzy0.g;
                        }
                        eg.o();
                        return null;
                    }
                    if (z7) {
                        return rzy0.d;
                    }
                    if (z5) {
                        return rzy0.b;
                    }
                    if (z6) {
                        return rzy0.c;
                    }
                }
                return rzy0.a;
            default:
                Set set = (Set) this.e;
                boolean z8 = this.b;
                boolean z9 = this.c;
                boolean z10 = this.d;
                hm5.M(obj);
                boolean z11 = !set.isEmpty();
                if (set.isEmpty()) {
                    fg91VarA = fg91.b;
                } else {
                    Context context = ((ju51) obj2).e;
                    smc0 smc0VarN = k4p1.n();
                    if (!z10) {
                        smc0VarN.add(new zqb("add_to_playlist", context.getString(2131961599)));
                    }
                    if (z9) {
                        smc0VarN.add(new zqb("add_to_queue", context.getString(2131961600)));
                    }
                    if (z8) {
                        smc0VarN.add(new zqb("remove", context.getString(2131961601)));
                    }
                    fg91VarA = mqo1.A(k4p1.k(smc0VarN));
                }
                return new rrb(2, fg91VarA, z11);
        }
    }
}
