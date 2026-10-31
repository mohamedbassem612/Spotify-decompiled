package defpackage;

import p.a8d1;
import p.c9n;
import p.d9n;
import p.eg;
import p.hm5;
import p.lnm;
import p.rih1;
import p.vu30;
import p.vy71;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ vy71 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(vy71 vy71Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = vy71Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        vy71 vy71Var = this.c;
        switch (b) {
            case 0:
                return new g(vy71Var, lnmVar, (byte) 0);
            case 1:
                return new g(vy71Var, lnmVar, (byte) 1);
            case 2:
                return new g(vy71Var, lnmVar, (byte) 2);
            case 3:
                return new g(vy71Var, lnmVar, (byte) 3);
            case 4:
                return new g(vy71Var, lnmVar, (byte) 4);
            case 5:
                return new g(vy71Var, lnmVar, (byte) 5);
            case 6:
                return new g(vy71Var, lnmVar, (byte) 6);
            case 7:
                return new g(vy71Var, lnmVar, (byte) 7);
            case 8:
                return new g(vy71Var, lnmVar, (byte) 8);
            case 9:
                return new g(vy71Var, lnmVar, (byte) 9);
            case 10:
                return new g(vy71Var, lnmVar, (byte) 10);
            case 11:
                return new g(vy71Var, lnmVar, (byte) 11);
            case 12:
                return new g(vy71Var, lnmVar, (byte) 12);
            case 13:
                return new g(vy71Var, lnmVar, (byte) 13);
            case 14:
                return new g(vy71Var, lnmVar, (byte) 14);
            case 15:
                return new g(vy71Var, lnmVar, (byte) 15);
            case 16:
                return new g(vy71Var, lnmVar, (byte) 16);
            case 17:
                return new g(vy71Var, lnmVar, (byte) 17);
            case 18:
                return new g(vy71Var, lnmVar, (byte) 18);
            case 19:
                return new g(vy71Var, lnmVar, (byte) 19);
            case 20:
                return new g(vy71Var, lnmVar, (byte) 20);
            default:
                return new g(vy71Var, lnmVar, (byte) 21);
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
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vy71 vy71Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    return vy71Var.h(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    return vy71Var.h(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z2) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    this.b = true;
                    return vy71Var.h(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z3) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    this.b = true;
                    return vy71Var.h(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z4) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    this.b = true;
                    return vy71Var.h(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z5) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    this.b = true;
                    return vy71Var.b(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z6) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                boolean z7 = this.b;
                if (!z7) {
                    hm5.M(obj);
                    this.b = true;
                    return vy71Var.k(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z7) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                boolean z8 = this.b;
                if (!z8) {
                    hm5.M(obj);
                    this.b = true;
                    return vy71Var.b(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z8) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                boolean z9 = this.b;
                if (!z9) {
                    hm5.M(obj);
                    this.b = true;
                    return vy71Var.j(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z9) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                boolean z10 = this.b;
                if (!z10) {
                    hm5.M(obj);
                    this.b = true;
                    return vy71Var.h(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z10) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                boolean z11 = this.b;
                if (!z11) {
                    hm5.M(obj);
                    this.b = true;
                    return vy71Var.h(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z11) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                boolean z12 = this.b;
                if (!z12) {
                    hm5.M(obj);
                    this.b = true;
                    return vy71Var.j(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z12) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                boolean z13 = this.b;
                if (!z13) {
                    hm5.M(obj);
                    this.b = true;
                    return vy71Var.h(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z13) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                boolean z14 = this.b;
                if (!z14) {
                    hm5.M(obj);
                    this.b = true;
                    return vy71Var.k(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z14) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                boolean z15 = this.b;
                if (!z15) {
                    hm5.M(obj);
                    this.b = true;
                    return vy71Var.h(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z15) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                boolean z16 = this.b;
                if (!z16) {
                    hm5.M(obj);
                    this.b = true;
                    return vy71Var.b(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z16) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 16:
                boolean z17 = this.b;
                if (!z17) {
                    hm5.M(obj);
                    this.b = true;
                    return vy71Var.k(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z17) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 17:
                boolean z18 = this.b;
                if (!z18) {
                    hm5.M(obj);
                    this.b = true;
                    return vy71Var.b(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z18) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 18:
                boolean z19 = this.b;
                if (!z19) {
                    hm5.M(obj);
                    this.b = true;
                    return vy71Var.j(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z19) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 19:
                boolean z20 = this.b;
                if (!z20) {
                    hm5.M(obj);
                    this.b = true;
                    return vy71Var.k(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z20) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 20:
                boolean z21 = this.b;
                if (!z21) {
                    hm5.M(obj);
                    this.b = true;
                    return vy71Var.h(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z21) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z22 = this.b;
                if (!z22) {
                    hm5.M(obj);
                    this.b = true;
                    return vy71Var.h(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z22) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
