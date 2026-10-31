package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ffw0 extends a8d1 implements vu30 {
    public boolean a;
    public boolean b;
    public int c;
    public int d;
    public byte e;
    public /* synthetic */ Object f;
    public final /* synthetic */ gfw0 g;
    public final /* synthetic */ sbw0 h;
    public final /* synthetic */ c9n i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffw0(gfw0 gfw0Var, sbw0 sbw0Var, c9n c9nVar, lnm lnmVar) {
        super(2, lnmVar);
        this.g = gfw0Var;
        this.h = sbw0Var;
        this.i = c9nVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        ffw0 ffw0Var = new ffw0(this.g, this.h, this.i, lnmVar);
        ffw0Var.f = obj;
        return ffw0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((maw0) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0123 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:68:0x0124 A[RETURN] */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        zau0 zau0Var;
        abu0 abu0Var;
        boolean z3;
        int i;
        boolean z4;
        int i2;
        boolean z5;
        int i3;
        boolean z6;
        int i4;
        gfw0 gfw0Var = this.g;
        bpb1 bpb1Var = gfw0Var.u;
        maw0 maw0Var = (maw0) this.f;
        byte b = this.e;
        d9n d9nVar = rih1.a;
        sbw0 sbw0Var = this.h;
        d9n d9nVar2 = d9n.a;
        switch (b) {
            case 0:
                hm5.M(obj);
                boolean z7 = maw0Var.a;
                boolean z8 = maw0Var.b;
                if (z8 && gfw0Var.K == 1 && gfw0Var.D && gfw0Var.E) {
                    int i5 = (sbw0Var.g && gfw0Var.h.a()) ? 1 : 0;
                    int i6 = (i5 == 0 && sbw0Var.i) ? 0 : 1;
                    if (z7 && i6 == 0) {
                        this.f = null;
                        this.a = z7;
                        this.b = z8;
                        this.c = i5;
                        this.d = i6;
                        this.e = (byte) 1;
                        if (gfw0Var.u(this.h, this.i, null, false, this) != d9nVar2) {
                            return d9nVar;
                        }
                    } else if (i6 != 0) {
                        this.f = null;
                        this.a = z7;
                        this.b = z8;
                        this.c = i5;
                        this.d = i6;
                        this.e = (byte) 2;
                        bpb1Var.emit(sbw0Var, this);
                        if (d9nVar != d9nVar2) {
                            int i7 = i5;
                            z5 = z8;
                            i3 = i7;
                            z6 = z7;
                            i4 = i6;
                            this.f = null;
                            this.a = z6;
                            this.b = z5;
                            this.c = i3;
                            this.d = i4;
                            this.e = (byte) 3;
                            if (gfw0Var.n(this) != d9nVar2) {
                                return d9nVar;
                            }
                        }
                    } else {
                        this.f = null;
                        this.a = z7;
                        this.b = z8;
                        this.c = i5;
                        this.d = i6;
                        this.e = (byte) 4;
                        bpb1Var.emit(sbw0Var, this);
                        if (d9nVar != d9nVar2) {
                            int i8 = i5;
                            z3 = z8;
                            i = i8;
                            z4 = z7;
                            i2 = i6;
                            this.f = null;
                            this.a = z4;
                            this.b = z3;
                            this.c = i;
                            this.d = i2;
                            this.e = (byte) 5;
                            if (gfw0Var.k(sbw0Var, this.i, this) != d9nVar2) {
                                return d9nVar;
                            }
                        }
                    }
                } else {
                    if (z8 && (zau0Var = gfw0Var.s) != null && (abu0Var = gfw0Var.b) != null) {
                        abu0Var.b(zau0Var);
                    }
                    this.f = null;
                    this.a = z7;
                    this.b = z8;
                    this.e = (byte) 6;
                    bpb1Var.emit((Object) null, this);
                    if (d9nVar != d9nVar2) {
                        z = z8;
                        z2 = z7;
                        this.f = null;
                        this.a = z2;
                        this.b = z;
                        this.e = (byte) 7;
                        if (gfw0Var.n(this) != d9nVar2) {
                            return d9nVar;
                        }
                    }
                }
                return d9nVar2;
            case 1:
                hm5.M(obj);
                return d9nVar;
            case 2:
                i4 = this.d;
                i3 = this.c;
                z5 = this.b;
                z6 = this.a;
                hm5.M(obj);
                this.f = null;
                this.a = z6;
                this.b = z5;
                this.c = i3;
                this.d = i4;
                this.e = (byte) 3;
                if (gfw0Var.n(this) != d9nVar2) {
                    return d9nVar2;
                }
                return d9nVar;
            case 3:
                hm5.M(obj);
                return d9nVar;
            case 4:
                i2 = this.d;
                i = this.c;
                z3 = this.b;
                z4 = this.a;
                hm5.M(obj);
                this.f = null;
                this.a = z4;
                this.b = z3;
                this.c = i;
                this.d = i2;
                this.e = (byte) 5;
                if (gfw0Var.k(sbw0Var, this.i, this) != d9nVar2) {
                    return d9nVar2;
                }
                return d9nVar;
            case 5:
                hm5.M(obj);
                return d9nVar;
            case 6:
                z = this.b;
                z2 = this.a;
                hm5.M(obj);
                this.f = null;
                this.a = z2;
                this.b = z;
                this.e = (byte) 7;
                if (gfw0Var.n(this) != d9nVar2) {
                    return d9nVar2;
                }
                return d9nVar;
            case 7:
                hm5.M(obj);
                return d9nVar;
            default:
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
