package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fe0 {
    public static final /* synthetic */ mma0[] j = {new een0(fe0.class, "isSuppressed", "isSuppressed()Z", 0), new een0(fe0.class, "shouldShow", "getShouldShow()Z", 0), new een0(fe0.class, "bannerTicket", "getBannerTicket()Lcom/spotify/banner/api/BannerTicket;", 0)};
    public final ge0 a;
    public final y6a b;
    public final ilh1 c;
    public final vi11 d;
    public final bih1 e;
    public final rku f;
    public final be0 g;
    public final ce0 h;
    public final de0 i;

    public fe0(ge0 ge0Var, y6a y6aVar, ilh1 ilh1Var, vi11 vi11Var, bih1 bih1Var) {
        this.a = ge0Var;
        this.b = y6aVar;
        this.c = ilh1Var;
        this.d = vi11Var;
        this.e = bih1Var;
        new wdx0((byte) 29);
        this.f = new rku();
        this.g = new be0(this);
        this.h = new ce0(this);
        this.i = new de0((byte) 0);
    }

    public final void a(z7a z7aVar) {
        this.i.c(j[2], this, z7aVar);
    }

    public final void b() {
        mma0[] mma0VarArr = j;
        mma0 mma0Var = mma0VarArr[1];
        if (((Boolean) ((sgp0) this.h).a).booleanValue()) {
            mma0 mma0Var2 = mma0VarArr[0];
            if (!((Boolean) ((sgp0) this.g).a).booleanValue()) {
                mma0 mma0Var3 = mma0VarArr[2];
                if (((z7a) ((sgp0) this.i).a) == null) {
                    a(y6a.d(this.b, new n5a((Integer) null, new ymm0(this, (byte) 3), (String) null, (Integer) null, (clv) null, (List) null, new ee0(this, (byte) 1), l5a.a, 470), true, 4));
                    return;
                }
                return;
            }
        }
        a(null);
    }
}
