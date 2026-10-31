package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rd0 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ vr20 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rd0(String str, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.d = str;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.d;
        vr20 vr20Var = (vr20) obj;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                rd0 rd0Var = new rd0(str, lnmVar, (byte) 0);
                rd0Var.c = vr20Var;
                return rd0Var.invokeSuspend(rih1Var);
            case 1:
                rd0 rd0Var2 = new rd0(str, lnmVar, (byte) 1);
                rd0Var2.c = vr20Var;
                return rd0Var2.invokeSuspend(rih1Var);
            case 2:
                rd0 rd0Var3 = new rd0(str, lnmVar, (byte) 2);
                rd0Var3.c = vr20Var;
                return rd0Var3.invokeSuspend(rih1Var);
            case 3:
                rd0 rd0Var4 = new rd0(str, lnmVar, (byte) 3);
                rd0Var4.c = vr20Var;
                return rd0Var4.invokeSuspend(rih1Var);
            case 4:
                rd0 rd0Var5 = new rd0(str, lnmVar, (byte) 4);
                rd0Var5.c = vr20Var;
                return rd0Var5.invokeSuspend(rih1Var);
            default:
                rd0 rd0Var6 = new rd0(str, lnmVar, (byte) 5);
                rd0Var6.c = vr20Var;
                return rd0Var6.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        z6x z6xVar = z6x.a;
        String str = this.d;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                vr20 vr20Var = this.c;
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    return vr20Var.emit(z6xVar, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                vr20 vr20Var2 = this.c;
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                str.getClass();
                z79 z79Var = new z79(str);
                this.c = null;
                this.b = true;
                return vr20Var2.emit(z79Var, this) == d9nVar ? d9nVar : rih1Var;
            case 2:
                vr20 vr20Var3 = this.c;
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                x5s0 x5s0Var = new x5s0(1, 12, str, (ArrayList) null);
                this.c = null;
                this.b = true;
                return vr20Var3.emit(x5s0Var, this) == d9nVar ? d9nVar : rih1Var;
            case 3:
                vr20 vr20Var4 = this.c;
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mmr0 mmr0Var = new mmr0(str, cji0.a);
                this.c = null;
                this.b = true;
                return vr20Var4.emit(mmr0Var, this) == d9nVar ? d9nVar : rih1Var;
            case 4:
                vr20 vr20Var5 = this.c;
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                jv01 jv01Var = new jv01(null, str, false, false);
                this.c = null;
                this.b = true;
                return vr20Var5.emit(jv01Var, this) == d9nVar ? d9nVar : rih1Var;
            default:
                vr20 vr20Var6 = this.c;
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ls51 ls51Var = new ls51(str, z6xVar);
                this.c = null;
                this.b = true;
                return vr20Var6.emit(ls51Var, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
