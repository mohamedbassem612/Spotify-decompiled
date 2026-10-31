package p;

import com.google.android.recaptcha.internal.zzhm;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class g1o1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ dzp0 c;
    public final /* synthetic */ xmn1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1o1(dzp0 dzp0Var, xmn1 xmn1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = dzp0Var;
        this.d = xmn1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        xmn1 xmn1Var = this.d;
        dzp0 dzp0Var = this.c;
        switch (b) {
            case 0:
                return new g1o1(dzp0Var, xmn1Var, lnmVar, (byte) 0);
            default:
                return new g1o1(dzp0Var, xmn1Var, lnmVar, (byte) 1);
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
        xmn1 xmn1Var = this.d;
        dzp0 dzp0Var = this.c;
        nwo1 nwo1Var = d9n.a;
        switch (b) {
            case 0:
                try {
                    if (this.b) {
                        hm5.M(obj);
                    } else {
                        hm5.M(obj);
                        bym1 bym1Var = (bym1) dzp0Var.c;
                        this.b = true;
                        obj = bym1Var.f(xmn1Var, this);
                        if (obj == nwo1Var) {
                            return nwo1Var;
                        }
                    }
                    return (ymn1) obj;
                } catch (Exception e) {
                    throw dzp0.h(dzp0Var, e);
                }
            default:
                boolean z = this.b;
                hm5.M(obj);
                if (z) {
                    return obj;
                }
                g1o1 g1o1Var = new g1o1(dzp0Var, xmn1Var, null, (byte) 0);
                this.b = true;
                nwo1 nwo1Var2 = new nwo1(64, g1o1Var, (Integer) null);
                return nwo1Var2 != nwo1Var ? nwo1Var2 : nwo1Var;
        }
    }
}
