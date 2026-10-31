package p;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n0c0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0c0(Bitmap bitmap, Bitmap bitmap2, long j, Bitmap bitmap3, long j2, jxc1 jxc1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.d = bitmap;
        this.e = bitmap2;
        this.b = j;
        this.f = bitmap3;
        this.c = j2;
        this.g = jxc1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new n0c0((Bitmap) this.d, (Bitmap) this.e, this.b, (Bitmap) this.f, this.c, (jxc1) this.g, lnmVar);
            default:
                return new n0c0((String) this.d, this.b, this.c, (izy0) this.e, (dzy0) this.f, (fzy0) this.g, lnmVar);
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
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        long j = this.c;
        long j2 = this.b;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                jxc1 jxc1Var = (jxc1) obj2;
                hm5.M(obj);
                Bitmap bitmap = (Bitmap) obj4;
                Bitmap bitmapY = wpo1.y((Bitmap) obj5, bitmap, j2);
                Bitmap bitmap2 = (Bitmap) obj3;
                Bitmap bitmapY2 = bitmap2 != null ? wpo1.y(bitmap2, bitmap, j) : null;
                tp70 tp70Var = new tp70(bitmapY);
                v660 v660Var = jxc1Var.a;
                return new jxc1(new v660(v660Var.a, v660Var.b, bitmapY2 != null ? new tp70(bitmapY2) : null, v660Var.d), tp70Var, jxc1Var.c, jxc1Var.d, jxc1Var.e, jxc1Var.f, jxc1Var.g, jxc1Var.h, jxc1Var.i, jxc1Var.t, jxc1Var.X, null);
            default:
                hm5.M(obj);
                return wgo1.u((String) obj5, z4p1.G(j2), z4p1.G(j), (izy0) obj4, (dzy0) obj3, (fzy0) obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0c0(String str, long j, long j2, izy0 izy0Var, dzy0 dzy0Var, fzy0 fzy0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.d = str;
        this.b = j;
        this.c = j2;
        this.e = izy0Var;
        this.f = dzy0Var;
        this.g = fzy0Var;
    }
}
