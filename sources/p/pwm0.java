package p;

import com.spotify.wrapped.v1.proto.StoryCard;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pwm0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pwm0(Integer num, j7s j7sVar, ven0 ven0Var, ven0 ven0Var2, iu30 iu30Var, rk41 rk41Var, ven0 ven0Var3, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 4;
        this.b = num;
        this.c = j7sVar;
        this.f = ven0Var;
        this.g = ven0Var2;
        this.d = iu30Var;
        this.e = rk41Var;
        this.h = ven0Var3;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.h;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.c;
        switch (b) {
            case 0:
                pwm0 pwm0Var = new pwm0(obj7, obj4, obj3, obj6, obj5, obj2, lnmVar, (byte) 0);
                pwm0Var.b = obj;
                return pwm0Var;
            case 1:
                pwm0 pwm0Var2 = new pwm0(obj7, obj4, obj3, obj6, obj5, obj2, lnmVar, (byte) 1);
                pwm0Var2.b = obj;
                return pwm0Var2;
            case 2:
                pwm0 pwm0Var3 = new pwm0((o0i) obj7, (obl1) obj4, (ven0) obj6, (sd5) obj3, (ven0) obj5, (ven0) obj2, lnmVar);
                pwm0Var3.b = obj;
                return pwm0Var3;
            case 3:
                return new pwm0((le81) this.b, (pda1) obj7, (String) obj4, (Set) obj3, (kkw0) obj2, (ven0) obj6, (ven0) obj5, lnmVar);
            default:
                return new pwm0((Integer) this.b, (j7s) obj7, (ven0) obj6, (ven0) obj5, (iu30) obj4, (rk41) obj3, (ven0) obj2, lnmVar);
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
                break;
            case 1:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 2:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 3:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        rx7 rx7Var;
        byte b = this.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.c;
        Object obj7 = this.h;
        switch (b) {
            case 0:
                c9n c9nVar = (c9n) this.b;
                hm5.M(obj);
                fn31.T(c9nVar, (o8n) null, 0, new af0((m0t) obj6, (clj1) obj3, (q9l1) obj2, (ven0) obj5, (ven0) obj4, (ven0) obj7, (lnm) null, (byte) 17), 3);
                break;
            case 1:
                c9n c9nVar2 = (c9n) this.b;
                hm5.M(obj);
                knn0 knn0Var = (knn0) obj5;
                fn31.T(c9nVar2, (o8n) null, 0, new ofk0((en70) obj6, (lik1) obj3, (fvn0) obj2, knn0Var, (lnm) null, (byte) 7), 3);
                fn31.T(c9nVar2, (o8n) null, 0, new m3n0((war0) obj4, knn0Var, (lnm) null, (byte) 10), 3);
                fn31.T(c9nVar2, (o8n) null, 0, new m3n0((mr20) obj7, knn0Var, (lnm) null, (byte) 11), 3);
                break;
            case 2:
                c9n c9nVar3 = (c9n) this.b;
                hm5.M(obj);
                o0i o0iVar = (o0i) obj6;
                obl1 obl1Var = (obl1) obj3;
                fn31.T(c9nVar3, (o8n) null, 0, new glu0(o0iVar, obl1Var, (ven0) obj5, (lnm) null, (byte) 25), 3);
                fn31.T(c9nVar3, (o8n) null, 0, new glu0(o0iVar, (sd5) obj2, (ven0) obj4, (lnm) null, (byte) 26), 3);
                fn31.T(c9nVar3, (o8n) null, 0, new b201(obl1Var, (ven0) obj7, (lnm) null, (byte) 4), 3);
                break;
            case 3:
                ven0 ven0Var = (ven0) obj4;
                pda1 pda1Var = (pda1) obj6;
                ven0 ven0Var2 = (ven0) obj5;
                hm5.M(obj);
                le81 le81Var = (le81) this.b;
                boolean z2 = (le81Var == null || ((le81) ven0Var2.getValue()) == null || le81Var.equals((le81) ven0Var2.getValue())) ? false : true;
                if (u890.j(pda1Var.d(), (String) ven0Var.getValue()) && !z2) {
                    z = false;
                }
                ven0Var.setValue(pda1Var.d());
                ven0Var2.setValue(le81Var);
                String str = (String) obj3;
                if (str != null) {
                    boolean zContains = ((Set) obj2).contains(str);
                    if (z || !zContains) {
                        kkw0 kkw0Var = (kkw0) obj7;
                        fn31.T(kkw0Var.b, (o8n) null, 0, new glu0(kkw0Var, (lnm) null, (byte) 12), 3);
                    }
                }
                break;
            default:
                ven0 ven0Var3 = (ven0) obj7;
                j7s j7sVar = (j7s) obj6;
                hm5.M(obj);
                Integer num = (Integer) this.b;
                if (num != null) {
                    pxg1 pxg1Var = acf1.a;
                    ((ven0) obj5).setValue(num);
                    StoryCard storyCard = ((wgm1) ((ven0) obj4).getValue()).a;
                    if (u890.j(storyCard != null ? storyCard.getId() : null, (String) j7sVar.c)) {
                        tnu0 tnu0Var = (tnu0) o7h.t0(num.intValue() - 1, (List) j7sVar.f);
                        if (tnu0Var != null && (rx7Var = tnu0Var.h) != null) {
                            ((iu30) obj3).invoke(num);
                            ((xgm1) ((rk41) obj2).c).a(new lgm1(rx7Var.a, rx7Var.b, rx7Var.c));
                        }
                    }
                }
                pxg1 pxg1Var2 = acf1.a;
                ven0Var3.setValue(Integer.valueOf(((Number) ven0Var3.getValue()).intValue() + 1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pwm0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
        this.h = obj6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pwm0(o0i o0iVar, obl1 obl1Var, ven0 ven0Var, sd5 sd5Var, ven0 ven0Var2, ven0 ven0Var3, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 2;
        this.c = o0iVar;
        this.d = obl1Var;
        this.f = ven0Var;
        this.e = sd5Var;
        this.g = ven0Var2;
        this.h = ven0Var3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pwm0(le81 le81Var, pda1 pda1Var, String str, Set set, kkw0 kkw0Var, ven0 ven0Var, ven0 ven0Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 3;
        this.b = le81Var;
        this.c = pda1Var;
        this.d = str;
        this.e = set;
        this.h = kkw0Var;
        this.f = ven0Var;
        this.g = ven0Var2;
    }
}
