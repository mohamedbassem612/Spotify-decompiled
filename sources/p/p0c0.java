package p;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p0c0 extends a8d1 implements vu30 {
    public final /* synthetic */ String X;
    public s2t a;
    public l2t b;
    public Bitmap c;
    public Bitmap d;
    public long e;
    public byte f;
    public /* synthetic */ Object g;
    public final /* synthetic */ long h;
    public final /* synthetic */ jxc1 i;
    public final /* synthetic */ gw70 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0c0(long j, jxc1 jxc1Var, gw70 gw70Var, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.h = j;
        this.i = jxc1Var;
        this.t = gw70Var;
        this.X = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        p0c0 p0c0Var = new p0c0(this.h, this.i, this.t, this.X, lnmVar);
        p0c0Var.g = obj;
        return p0c0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0102  */
    /* JADX WARN: Code duplicated, block: B:40:0x011f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0147 A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0115, code lost:
    
        if (r2 == r8) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.p0c0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
