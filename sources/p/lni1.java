package p;

import io.reactivex.rxjava3.subjects.CompletableSubject;
import io.reactivex.rxjava3.subjects.SingleSubject;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lni1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ nni1 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lni1(nni1 nni1Var, String str, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = nni1Var;
        this.d = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new lni1(this.c, this.d, lnmVar, (byte) 0);
            default:
                return new lni1(this.c, this.d, lnmVar, (byte) 1);
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

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        String str = this.d;
        d9n d9nVar = d9n.a;
        nni1 nni1Var = this.c;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    CompletableSubject completableSubjectA = nni1Var.a.a(str);
                    this.b = true;
                    if (fc11.i(completableSubjectA, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    if (nni1Var.e == null) {
                        SingleSubject singleSubjectC = nni1Var.a.c(new gjo0(new ilh1(str, nni1Var, (byte) 6), new lxh1(nni1Var, (byte) 2)));
                        this.b = true;
                        obj = fc11.j(singleSubjectC, this);
                        if (obj == d9nVar) {
                            return d9nVar;
                        }
                    }
                    return rih1Var;
                }
                if (!z2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                r981 r981Var = (s981) obj;
                r981 r981Var2 = r981Var instanceof r981 ? r981Var : null;
                String str2 = r981Var2 != null ? r981Var2.a : null;
                nni1Var.e = str2;
                if (str2 != null) {
                    ymi1 ymi1Var = (ymi1) nni1Var.d.getValue();
                    i8h1 i8h1Var = ymi1Var.a;
                    brl0 brl0Var = ymi1Var.c;
                    brl0Var.getClass();
                    x6h1 x6h1VarC = brl0Var.b.c();
                    x6h1VarC.i.add(new a7h1("qr_code_overlay", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = true;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    k7h1 k7h1Var = new k7h1();
                    ((xjn) k7h1Var).a = y6h1VarA;
                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                    k7h1Var.e = brl0Var.c;
                    i8h1Var.f(k7h1Var.a(), (Set) null);
                }
                return rih1Var;
        }
    }
}
