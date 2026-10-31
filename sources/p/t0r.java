package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t0r extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ w0r c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0r(w0r w0rVar, String str, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = w0rVar;
        this.d = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        String str = this.d;
        w0r w0rVar = this.c;
        switch (b) {
            case 0:
                return new t0r(w0rVar, str, lnmVar, (byte) 0);
            default:
                return new t0r(w0rVar, str, lnmVar, (byte) 1);
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
        lo7 lo7Var;
        lh7 lh7Var;
        byte b = this.a;
        String str = this.d;
        d9n d9nVar = d9n.a;
        w0r w0rVar = this.c;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    Object objC = w0rVar.c(str, this);
                    return objC == d9nVar ? d9nVar : objC;
                }
                if (z) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                ay8 ay8VarF = d3p1.F((d0r) w0rVar.a.getValue(), w0rVar.b, str);
                jte jteVar = new jte(2, (lnm) null, (byte) 13);
                this.b = true;
                obj = b5p1.j(ay8VarF, jteVar, this);
                if (obj == d9nVar) {
                    return d9nVar;
                }
                i1r i1rVar = (k1r) obj;
                i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                if (i1rVar2 != null && (lo7Var = (lo7) i1rVar2.a) != null && (lh7Var = (lh7) o7h.s0(lo7Var.a)) != null) {
                    return lh7Var.a;
                }
                return null;
        }
    }
}
