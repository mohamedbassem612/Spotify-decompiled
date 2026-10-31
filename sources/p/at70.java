package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class at70 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ nl9 c;
    public final /* synthetic */ ven0 d;
    public final /* synthetic */ ven0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ at70(nl9 nl9Var, ven0 ven0Var, ven0 ven0Var2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = nl9Var;
        this.d = ven0Var;
        this.e = ven0Var2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new at70(this.c, this.d, this.e, lnmVar, (byte) 0);
            default:
                return new at70(this.c, this.d, this.e, lnmVar, (byte) 1);
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
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0055  */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.e;
        ven0 ven0Var2 = this.d;
        nl9 nl9Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    Set set = s4b1.f;
                    if (uic.x((String) ven0Var2.getValue()).c != blc0.Pg) {
                        return rih1Var;
                    }
                    uu00 uu00Var = (uu00) nl9Var.i;
                    String str = (String) ven0Var2.getValue();
                    this.b = true;
                    obj = blo1.t(uu00Var, str, mdz.class, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                mdz mdzVar = (mdz) obj;
                if (mdzVar == null) {
                    return rih1Var;
                }
                ven0Var.setValue(mdzVar.c);
                return rih1Var;
            default:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    uu00 uu00Var2 = (uu00) nl9Var.i;
                    String str2 = (String) ven0Var2.getValue();
                    this.b = true;
                    obj = blo1.t(uu00Var2, str2, ddz.class, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ddz ddzVar = (ddz) obj;
                if (ddzVar != null) {
                    cdz cdzVar = (cdz) o7h.s0(ddzVar.b);
                    z = (cdzVar != null && cdzVar.e) ^ true;
                }
                ven0Var.setValue(Boolean.valueOf(z));
                return rih1Var;
        }
    }
}
