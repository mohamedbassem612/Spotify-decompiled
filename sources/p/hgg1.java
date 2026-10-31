package p;

import android.content.Context;
import android.os.Build;
import android.os.Looper;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hgg1 {
    public static final bg11 q;
    public final Context a;
    public String b;
    public String c;
    public zfg1 d;
    public boolean e;
    public final bg11 f;
    public final boolean g;
    public final long h;
    public final h9d0 i;
    public z57 j;
    public final hfb k;
    public final yys l;
    public twr m;
    public zgn0 n;
    public final Looper o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vnr f63p;

    static {
        w280 w280Var = b380.b;
        Object[] objArr = {0, 90, 180, 270};
        i8p1.m(objArr);
        q = b380.l(4, objArr);
    }

    public hgg1(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.h = kgg1.w;
        w280 w280Var = b380.b;
        bg11 bg11Var = bg11.e;
        this.k = new hfb((byte) 6);
        this.l = new yys(false, null, null, null, 0, true, true);
        this.m = new twr(new oi(applicationContext));
        this.n = new acs();
        Looper looperD = zoi1.D();
        this.o = looperD;
        this.i = new h9d0(looperD);
        if (Build.VERSION.SDK_INT >= 35) {
            this.g = true;
            this.f63p = new vnr(context);
        }
        this.f = q;
    }
}
