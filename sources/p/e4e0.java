package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e4e0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public boolean b;
    public final /* synthetic */ dxy c;
    public final /* synthetic */ String d;
    public final /* synthetic */ w4k1 e;
    public final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4e0(dxy dxyVar, String str, w4k1 w4k1Var, long j, lnm lnmVar) {
        super(2, lnmVar);
        this.c = dxyVar;
        this.d = str;
        this.e = w4k1Var;
        this.f = j;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new e4e0(this.c, this.e, this.d, this.f, lnmVar);
            default:
                return new e4e0(this.c, this.d, this.e, this.f, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        jl71 jl71Var = (jl71) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(jl71Var, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objY;
        byte b = this.a;
        dxy dxyVar = this.c;
        d9n d9nVar = d9n.a;
        w4k1 w4k1Var = this.e;
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
                ptf1 ptf1Var = (ptf1) dxyVar.b;
                boolean z2 = w4k1Var.d;
                this.b = true;
                Object objJ = ptf1Var.j(this.f, this.d, this, z2);
                return objJ == d9nVar ? d9nVar : objJ;
            default:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    vi11 vi11Var = (vi11) dxyVar.c;
                    String strB = w4k1Var.a.a.b.b();
                    Uri uri = w4k1Var.b;
                    this.b = true;
                    objY = vi11Var.y(this.d, strB, uri, this.f, this);
                    if (objY == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objY = ((e331) obj).a;
                }
                return new e331(objY);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4e0(dxy dxyVar, w4k1 w4k1Var, String str, long j, lnm lnmVar) {
        super(2, lnmVar);
        this.c = dxyVar;
        this.e = w4k1Var;
        this.d = str;
        this.f = j;
    }
}
