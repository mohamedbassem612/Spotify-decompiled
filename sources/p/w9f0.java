package p;

import android.content.res.Resources;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.ObservableSource;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w9f0 implements iu30 {
    public final /* synthetic */ byte a = 0;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public w9f0(jr2 jr2Var, cs2 cs2Var, zq00 zq00Var, Flowable flowable, Resources resources, or4 or4Var, mr4 mr4Var) {
        b3s b3sVar = b3s.c;
        this.b = jr2Var;
        this.c = cs2Var;
        this.d = zq00Var;
        this.e = flowable;
        this.f = resources;
        this.g = or4Var;
        this.h = mr4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(lnm lnmVar) {
        v9f0 v9f0Var;
        if (lnmVar instanceof v9f0) {
            v9f0Var = (v9f0) lnmVar;
            int i = v9f0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                v9f0Var.c = i - Integer.MIN_VALUE;
            } else {
                v9f0Var = new v9f0(this, lnmVar);
            }
        } else {
            v9f0Var = new v9f0(this, lnmVar);
        }
        Object obj = v9f0Var.a;
        int i2 = v9f0Var.c;
        rih1 rih1Var = rih1.a;
        if (i2 != 0) {
            if (i2 == 1) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        if (((l9f0) this.c).b()) {
            jge jgeVarE = hu20.e(yoi1.g((ObservableSource) ((b9o) this.b).invoke()), new u9f0(null, this, (byte) 0));
            e9c0 e9c0Var = new e9c0(this, (lnm) null, (byte) 21);
            v9f0Var.c = 1;
            Object objQ = l4p1.q(jgeVarE, e9c0Var, v9f0Var);
            d9n d9nVar = d9n.a;
            if (objQ == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return a((lnm) obj);
            default:
                return new m441(new hl1(this, (lnm) null));
        }
    }

    public w9f0(b9o b9oVar, l9f0 l9f0Var, q8n q8nVar, hgo hgoVar, w6e0 w6e0Var, j2e0 j2e0Var, iur iurVar) {
        this.b = b9oVar;
        this.c = l9f0Var;
        this.d = q8nVar;
        this.e = hgoVar;
        this.f = w6e0Var;
        this.g = j2e0Var;
        this.h = iurVar;
    }
}
