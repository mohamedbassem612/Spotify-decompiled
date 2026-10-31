package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nt7 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public iu30 b;
    public wkt c;
    public boolean d;
    public final /* synthetic */ wkt e;
    public final /* synthetic */ iu30 f;
    public final /* synthetic */ xwa g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nt7(wkt wktVar, iu30 iu30Var, xwa xwaVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = wktVar;
        this.f = iu30Var;
        this.g = xwaVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new nt7(this.e, this.f, this.g, lnmVar, (byte) 0);
            default:
                return new nt7(this.e, this.f, this.g, lnmVar, (byte) 1);
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
        rih1 rih1Var = rih1.a;
        xwa xwaVar = this.g;
        iu30 iu30Var = this.f;
        wkt wktVar = this.e;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.d;
                if (!z) {
                    hm5.M(obj);
                    if (wktVar == null) {
                        return rih1Var;
                    }
                    vwa[] vwaVarArr = {new vwa()};
                    this.b = iu30Var;
                    this.c = wktVar;
                    this.d = true;
                    obj = xwaVar.a(vwaVarArr, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wktVar = this.c;
                    iu30Var = this.b;
                    hm5.M(obj);
                }
                iu30Var.invoke(new ft7(((wwa) o7h.V0((List) obj)).b, wktVar));
                return rih1Var;
            default:
                boolean z2 = this.d;
                if (!z2) {
                    hm5.M(obj);
                    if (wktVar == null) {
                        return rih1Var;
                    }
                    vwa[] vwaVarArr2 = {new vwa()};
                    this.b = iu30Var;
                    this.c = wktVar;
                    this.d = true;
                    obj = xwaVar.a(vwaVarArr2, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wktVar = this.c;
                    iu30Var = this.b;
                    hm5.M(obj);
                }
                iu30Var.invoke(new n2e1(((wwa) o7h.V0((List) obj)).b, wktVar));
                return rih1Var;
        }
    }
}
