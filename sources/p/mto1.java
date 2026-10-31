package p;

import com.google.android.recaptcha.internal.zzhm;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mto1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ cik1 c;
    public final /* synthetic */ tmn1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mto1(cik1 cik1Var, tmn1 tmn1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = cik1Var;
        this.d = tmn1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        tmn1 tmn1Var = this.d;
        cik1 cik1Var = this.c;
        switch (b) {
            case 0:
                return new mto1(cik1Var, tmn1Var, lnmVar, (byte) 0);
            default:
                return new mto1(cik1Var, tmn1Var, lnmVar, (byte) 1);
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((rvo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzhm */
    public final Object invokeSuspend(Object obj) throws zzhm {
        byte b = this.a;
        tmn1 tmn1Var = this.d;
        cik1 cik1Var = this.c;
        nwo1 nwo1Var = d9n.a;
        switch (b) {
            case 0:
                try {
                    if (this.b) {
                        hm5.M(obj);
                    } else {
                        hm5.M(obj);
                        exo1 exo1VarU = cik1.u(cik1Var);
                        brk1 brk1VarT = cik1.t(cik1Var);
                        this.b = true;
                        obj = exo1VarU.b(brk1VarT, tmn1Var, this);
                        if (obj == nwo1Var) {
                            return nwo1Var;
                        }
                    }
                    return (umn1) obj;
                } catch (Exception e) {
                    throw cik1.q(cik1Var, e);
                }
            default:
                boolean z = this.b;
                hm5.M(obj);
                if (z) {
                    return obj;
                }
                mto1 mto1Var = new mto1(cik1Var, tmn1Var, null, (byte) 0);
                this.b = true;
                nwo1 nwo1Var2 = new nwo1(48, mto1Var, (Integer) null);
                return nwo1Var2 != nwo1Var ? nwo1Var2 : nwo1Var;
        }
    }
}
