package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class q291 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ vu30 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ x291 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q291(int i, long j, vu30 vu30Var, x291 x291Var) {
        super(2);
        this.d = x291Var;
        this.c = j;
        this.b = vu30Var;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:12:0x0038  */
    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    public final Object invoke(Object obj, Object obj2) {
        r291 r291Var;
        x340 x340Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                vu30 vu30Var = this.b;
                tgp1.d(1, this.c, (b0k) obj, vu30Var, this.d);
                return rih1Var;
            default:
                x340 x340Var2 = (b0k) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    x340 x340Var3 = x340Var2;
                    if (x340Var3.H()) {
                        x340Var3.b0();
                    } else {
                        r291Var = r291.a;
                        x340Var = x340Var2;
                        x340Var.j0(578571862);
                        x340Var.j0(-548224868);
                        if (x340Var.a instanceof i06) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.g0();
                        if (x340Var.S) {
                            x340Var.l(r291Var);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(new s3v(this.c), x340Var, yd81.Y);
                        nko1.H(this.d, x340Var, yd81.Z);
                        us71.k(0, this.b, x340Var, true, false);
                        x340Var.r(false);
                    }
                } else {
                    r291Var = r291.a;
                    x340Var = x340Var2;
                    x340Var.j0(578571862);
                    x340Var.j0(-548224868);
                    if (x340Var.a instanceof i06) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.g0();
                    if (x340Var.S) {
                        x340Var.l(r291Var);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(new s3v(this.c), x340Var, yd81.Y);
                    nko1.H(this.d, x340Var, yd81.Z);
                    us71.k(0, this.b, x340Var, true, false);
                    x340Var.r(false);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q291(vu30 vu30Var, long j, x291 x291Var) {
        super(2);
        this.b = vu30Var;
        this.c = j;
        this.d = x291Var;
    }
}
