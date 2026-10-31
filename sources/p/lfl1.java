package p;

import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lfl1 {
    public static final /* synthetic */ mma0[] m = {new een0(lfl1.class, "bannerModel", "getBannerModel()Lcom/spotify/carmobile/wazesdk/model/WazeBannerModel;", 0), new een0(lfl1.class, "bannerTicket", "getBannerTicket()Lcom/spotify/banner/api/BannerTicket;", 0), new een0(lfl1.class, "bannerContent", "getBannerContent()Ljava/lang/ref/WeakReference;", 0)};
    public final d341 a;
    public final sfl1 b;
    public final y6a c;
    public final o2b1 d;
    public final qfl1 e;
    public final bxn0 f;
    public final t8r0 g;
    public final CompositeDisposable h = new CompositeDisposable();
    public final ifl1 i = new ifl1((Object) new tak1(this, (byte) 20), (byte) 0);
    public final be0 j = new be0(this, (byte) 6);
    public final kfl1 k = new kfl1(null);
    public final ce0 l = new ce0(this, (byte) 23);

    public lfl1(d341 d341Var, sfl1 sfl1Var, y6a y6aVar, o2b1 o2b1Var, qfl1 qfl1Var, bxn0 bxn0Var, t8r0 t8r0Var) {
        this.a = d341Var;
        this.b = sfl1Var;
        this.c = y6aVar;
        this.d = o2b1Var;
        this.e = qfl1Var;
        this.f = bxn0Var;
        this.g = t8r0Var;
    }

    public final void a() {
        hfl1 hfl1Var;
        mma0[] mma0VarArr = m;
        mma0 mma0Var = mma0VarArr[0];
        jfl1 jfl1Var = (jfl1) ((sgp0) this.j).a;
        if (jfl1Var == null) {
            return;
        }
        mma0 mma0Var2 = mma0VarArr[2];
        WeakReference weakReference = (WeakReference) ((sgp0) this.l).a;
        if (weakReference == null || (hfl1Var = (hfl1) weakReference.get()) == null) {
            return;
        }
        hfl1Var.a(jfl1Var);
    }
}
