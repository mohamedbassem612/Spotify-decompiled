package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class r0w0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ s880 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0w0(s880 s880Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = s880Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        s880 s880Var = this.c;
        switch (b) {
            case 0:
                return new r0w0(s880Var, lnmVar, (byte) 0);
            default:
                return new r0w0(s880Var, lnmVar, (byte) 1);
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
        s880 s880Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    if (s880Var.n(this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                this.b = true;
                ohd ohdVar = new ohd(1, aym.t(this));
                ohdVar.t();
                c78 c78Var = new c78(s880Var, ohdVar, (byte) 4);
                kt91 kt91Var = (kt91) s880Var.h;
                if (kt91Var != null) {
                    kt91Var.a(c78Var);
                }
                ohdVar.n(new hzu0(s880Var, c78Var, (byte) 15));
                Object objR = ohdVar.r();
                return objR == d9nVar ? d9nVar : objR;
        }
    }
}
