package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h38 extends a8d1 implements vu30 {
    public vgn0 a;
    public ty60 b;
    public int c;
    public int d;
    public byte e;
    public final /* synthetic */ ty60 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h38(ty60 ty60Var, lnm lnmVar) {
        super(2, lnmVar);
        this.f = ty60Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new h38(this.f, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0057 A[Catch: all -> 0x001b, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x001b, blocks: (B:7:0x0016, B:19:0x0047, B:24:0x0057), top: B:31:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    /* JADX WARN: Code duplicated, block: B:33:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0071 A[SYNTHETIC] */
    public final Object invokeSuspend(Object obj) {
        vgn0 vgn0Var;
        ty60 ty60Var;
        int i;
        int i2;
        int i3;
        d38 d38Var;
        Object obj2;
        Object objY;
        byte b = this.e;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            ty60 ty60Var2 = this.f;
            vgn0Var = ty60Var2.e;
            this.a = vgn0Var;
            this.b = ty60Var2;
            this.c = 0;
            this.e = (byte) 1;
            if (vgn0Var.a(this) != d9nVar) {
                ty60Var = ty60Var2;
                i = 0;
            }
            return d9nVar;
        }
        if (b != 1) {
            if (b != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i4 = this.d;
            i3 = this.c;
            ty60Var = this.b;
            vgn0Var = this.a;
            try {
                hm5.M(obj);
                i2 = i4;
                do {
                    d38Var = (d38) ty60Var.d.poll();
                    obj2 = rih1.a;
                    if (d38Var == null) {
                        vgn0Var.c((Object) null);
                        return obj2;
                    }
                    this.a = vgn0Var;
                    this.b = ty60Var;
                    this.c = i3;
                    this.d = i2;
                    this.e = (byte) 2;
                    objY = fn31.Y(geo0.b, new a38(d38Var.d, d38Var, null), this);
                    if (objY == d9nVar) {
                        obj2 = objY;
                    }
                } while (obj2 != d9nVar);
                return d9nVar;
            } catch (Throwable th) {
                vgn0Var.c((Object) null);
                throw th;
            }
        }
        i = this.c;
        ty60Var = this.b;
        vgn0Var = this.a;
        hm5.M(obj);
        i2 = 0;
        i3 = i;
        do {
            d38Var = (d38) ty60Var.d.poll();
            obj2 = rih1.a;
            if (d38Var == null) {
                vgn0Var.c((Object) null);
                return obj2;
            }
            this.a = vgn0Var;
            this.b = ty60Var;
            this.c = i3;
            this.d = i2;
            this.e = (byte) 2;
            objY = fn31.Y(geo0.b, new a38(d38Var.d, d38Var, null), this);
            if (objY == d9nVar) {
                obj2 = objY;
            }
        } while (obj2 != d9nVar);
        return d9nVar;
    }
}
