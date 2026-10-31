package p;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class u431 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public boolean b;
    public final /* synthetic */ h631 c;
    public final /* synthetic */ k811 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u431(k811 k811Var, h631 h631Var, lnm lnmVar) {
        super(2, lnmVar);
        this.d = k811Var;
        this.c = h631Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        k811 k811Var = this.d;
        h631 h631Var = this.c;
        switch (b) {
            case 0:
                return new u431(k811Var, h631Var, lnmVar);
            default:
                return new u431(h631Var, k811Var, lnmVar);
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
        k811 k811Var = this.d;
        h631 h631Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ob01 ob01Var = new ob01(k811Var, h631Var, null, (byte) 7);
                this.b = true;
                Object objG = aq8.G(3, ob01Var, this);
                return objG == d9nVar ? d9nVar : objG;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return (Bitmap) obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                String str = h631Var.a;
                if (str != null) {
                    if (h631Var.f.a().length() <= 0) {
                        str = null;
                    }
                    if (str != null) {
                        this.b = true;
                        obj = k811Var.w(str, this);
                        if (obj == d9nVar) {
                            return d9nVar;
                        }
                        return (Bitmap) obj;
                    }
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u431(h631 h631Var, k811 k811Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = h631Var;
        this.d = k811Var;
    }
}
