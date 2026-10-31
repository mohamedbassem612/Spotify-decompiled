package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ba5 extends a8d1 implements vu30 {
    public byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ kbf0 d;
    public final /* synthetic */ fcf0 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ float h;
    public final /* synthetic */ bcf0 i;
    public final /* synthetic */ ven0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba5(boolean z, boolean z2, kbf0 kbf0Var, fcf0 fcf0Var, int i, boolean z3, float f, bcf0 bcf0Var, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.b = z;
        this.c = z2;
        this.d = kbf0Var;
        this.e = fcf0Var;
        this.f = i;
        this.g = z3;
        this.h = f;
        this.i = bcf0Var;
        this.t = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new ba5(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005a  */
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        kbf0 kbf0Var = this.d;
        ven0 ven0Var = this.t;
        rih1 rih1Var = rih1.a;
        boolean z = this.b;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            if (z && !((Boolean) ven0Var.getValue()).booleanValue() && this.c) {
                this.a = (byte) 1;
                fcf0 fcf0VarD = kbf0Var.d();
                bcf0 bcf0VarC = kbf0Var.c();
                float fI = kbf0Var.i();
                float fB = 0.0f;
                if (fI < 0.0f && fcf0VarD == null) {
                    fB = 1.0f;
                } else if (fcf0VarD != null) {
                    if (fI < 0.0f) {
                        if (bcf0VarC != null) {
                            fB = bcf0VarC.a(fcf0VarD);
                        } else {
                            fB = 1.0f;
                        }
                    } else if (bcf0VarC != null) {
                        fB = bcf0VarC.b(fcf0VarD);
                    }
                }
                Object objY = lvx.y(kbf0Var, (fcf0) null, fB, this, 9);
                if (objY != d9nVar) {
                    objY = rih1Var;
                }
                if (objY != d9nVar) {
                }
            }
            return d9nVar;
        }
        if (b != 1) {
            if (b == 2) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        ven0Var.setValue(Boolean.valueOf(z));
        if (z) {
            float f = kbf0Var.f();
            this.a = (byte) 2;
            if (lvx.e(kbf0Var, this.e, this.f, this.g, this.h, this.i, f, false, this, 514) == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
    }
}
