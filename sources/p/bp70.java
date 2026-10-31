package p;

import android.view.View;
import io.reactivex.rxjava3.internal.operators.completable.CompletablePeek;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bp70 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 2;
    public boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp70(bju bjuVar, int i, String str, gw70 gw70Var, boolean z, lnm lnmVar) {
        super(2, lnmVar);
        this.e = bjuVar;
        this.d = i;
        this.g = str;
        this.f = gw70Var;
        this.c = z;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.f;
        Object obj3 = this.g;
        switch (b) {
            case 0:
                bp70 bp70Var = new bp70((st60) obj2, (String) obj3, this.c, this.d, lnmVar);
                bp70Var.e = obj;
                return bp70Var;
            case 1:
                return new bp70(this.c, (o95) this.e, this.d, (c9n) obj2, (ven0) obj3, lnmVar);
            default:
                boolean z = this.c;
                return new bp70((bju) this.e, this.d, (String) obj3, (gw70) obj2, z, lnmVar);
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
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        m231 m231Var;
        int i;
        byte b = this.a;
        m231 m231Var2 = rih1.a;
        boolean z = this.c;
        Object obj2 = this.f;
        Object obj3 = this.g;
        int i2 = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                st60 st60Var = (st60) obj2;
                boolean z2 = this.b;
                try {
                    if (z2) {
                        if (z2) {
                            hm5.M(obj);
                        } else {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                        }
                        return null;
                    }
                    hm5.M(obj);
                    CompletablePeek completablePeekD = ((sun) st60Var.d).d((String) obj3, z);
                    this.e = null;
                    this.b = true;
                    if (fc11.i(completablePeekD, this) == d9nVar) {
                        return d9nVar;
                    }
                    m231Var = m231Var2;
                    break;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                if (m231Var instanceof m231) {
                    return m231Var2;
                }
                int iC = l1d.C(i2);
                if (iC == 0) {
                    i = z ? 2131956650 : 2131956652;
                } else {
                    if (iC != 1) {
                        eg.o();
                        return null;
                    }
                    i = z ? 2131956649 : 2131956651;
                }
                ((kt91) st60Var.b).k(new er91((fs91) null, ((dg30) st60Var.c).getString(i), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return m231Var2;
            case 1:
                c9n c9nVar = (c9n) obj2;
                ven0 ven0Var = (ven0) obj3;
                o95 o95Var = (o95) this.e;
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    if (!z) {
                        if (!((Boolean) ven0Var.getValue()).booleanValue()) {
                            return m231Var2;
                        }
                        fn31.T(c9nVar, (o8n) null, 0, new skk0(o95Var, i2, null, (byte) 0), 3);
                        ven0Var.setValue(Boolean.FALSE);
                        return m231Var2;
                    }
                    Float f = new Float(i2);
                    this.b = true;
                    if (o95Var.g(f, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                fn31.T(c9nVar, (o8n) null, 0, new b(o95Var, (lnm) null, (byte) 15), 3);
                ven0Var.setValue(Boolean.TRUE);
                return m231Var2;
            default:
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bju bjuVar = (bju) this.e;
                String strC = f4i1.c(i2, "backgroundOverlay_");
                eed eedVar = new eed((String) obj3, (gw70) obj2, z, (lnm) null);
                this.b = true;
                Object objC = bjuVar.c(strC, eedVar, this);
                return objC == d9nVar ? d9nVar : objC;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp70(st60 st60Var, String str, boolean z, int i, lnm lnmVar) {
        super(2, lnmVar);
        this.f = st60Var;
        this.g = str;
        this.c = z;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp70(boolean z, o95 o95Var, int i, c9n c9nVar, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = z;
        this.e = o95Var;
        this.d = i;
        this.f = c9nVar;
        this.g = ven0Var;
    }
}
