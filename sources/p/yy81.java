package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class yy81 extends a8d1 implements vu30 {
    public Object a;
    public xgn0 b;
    public az81 c;
    public int d;
    public byte e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ az81 g;
    public final /* synthetic */ short h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public yy81(boolean z, az81 az81Var, int i, int i2, lnm lnmVar) {
        super(2, lnmVar);
        this.f = z;
        this.g = az81Var;
        this.h = i;
        this.i = i2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new yy81(this.f, this.g, this.h, this.i, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0087 A[Catch: all -> 0x0093, TryCatch #0 {all -> 0x0093, blocks: (B:30:0x0075, B:32:0x0079, B:34:0x007d, B:35:0x007f, B:37:0x0087, B:39:0x008f), top: B:61:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x008f A[Catch: all -> 0x0093, TRY_LEAVE, TryCatch #0 {all -> 0x0093, blocks: (B:30:0x0075, B:32:0x0079, B:34:0x007d, B:35:0x007f, B:37:0x0087, B:39:0x008f), top: B:61:0x0075 }] */
    public final Object invokeSuspend(Object obj) throws Throwable {
        az81 az81Var;
        xgn0 xgn0Var;
        Throwable th;
        int i;
        az81 az81Var2;
        Object obj2;
        xgn0 xgn0Var2;
        int i2;
        iti1 iti1Var;
        iu30 iu30Var;
        d9n d9nVar = d9n.a;
        byte b = this.e;
        try {
            if (b == 0) {
                hm5.M(obj);
                boolean z = this.f;
                f0f1 f0f1Var = this.g.a;
                if (z) {
                    short s = this.h;
                    this.e = (byte) 1;
                    obj = f0f1Var.d(s, this);
                    if (obj == d9nVar) {
                    }
                } else {
                    short s2 = this.h;
                    this.e = (byte) 2;
                    obj = f0f1Var.c(s2);
                    if (obj != d9nVar) {
                    }
                }
                return d9nVar;
            }
            if (b == 1 || b == 2) {
                hm5.M(obj);
            } else {
                if (b == 3) {
                    i = this.d;
                    az81Var = this.c;
                    xgn0Var = this.b;
                    th = (Throwable) this.a;
                    hm5.M(obj);
                    try {
                        iti1 iti1Var2 = az81Var.j;
                        if (iti1Var2 != null && iti1Var2.b == i) {
                            az81Var.j = null;
                        }
                        throw th;
                    } finally {
                        xgn0Var.c((Object) null);
                    }
                }
                if (b != 4) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = this.d;
                az81Var2 = this.c;
                xgn0Var2 = this.b;
                obj2 = this.a;
                hm5.M(obj);
            }
            try {
                iti1Var = az81Var2.j;
                if (iti1Var != null && iti1Var.b == i2) {
                    az81Var2.j = null;
                }
                if (az81Var2.g.get() == i2) {
                    az81Var2.f = obj2;
                    az81Var2.h = i2;
                    iu30Var = az81Var2.d;
                    if (iu30Var != null) {
                        iu30Var.invoke(obj2);
                    }
                }
                return obj2;
            } finally {
                xgn0Var2.c((Object) null);
            }
            az81Var2 = this.g;
            xgn0 xgn0Var3 = az81Var2.i;
            int i3 = this.i;
            this.a = obj;
            this.b = xgn0Var3;
            this.c = az81Var2;
            this.d = i3;
            this.e = (byte) 4;
            if (xgn0Var3.a(this) != d9nVar) {
                obj2 = obj;
                xgn0Var2 = xgn0Var3;
                i2 = i3;
                iti1Var = az81Var2.j;
                if (iti1Var != null) {
                    az81Var2.j = null;
                }
                if (az81Var2.g.get() == i2) {
                    az81Var2.f = obj2;
                    az81Var2.h = i2;
                    iu30Var = az81Var2.d;
                    if (iu30Var != null) {
                        iu30Var.invoke(obj2);
                    }
                }
                return obj2;
            }
        } catch (Throwable th2) {
            az81Var = this.g;
            xgn0Var = az81Var.i;
            int i4 = this.i;
            this.a = th2;
            this.b = xgn0Var;
            this.c = az81Var;
            this.d = i4;
            this.e = (byte) 3;
            if (xgn0Var.a(this) != d9nVar) {
                th = th2;
                i = i4;
            }
            return d9nVar;
        }
        return d9nVar;
    }
}
