package p;

import android.content.Context;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oap0 extends hab0 implements Function0 {
    public final /* synthetic */ qbp0 X;
    public final /* synthetic */ qbp0 a;
    public final /* synthetic */ qbp0 b;
    public final /* synthetic */ qbp0 c;
    public final /* synthetic */ qbp0 d;
    public final /* synthetic */ qbp0 e;
    public final /* synthetic */ qbp0 f;
    public final /* synthetic */ qbp0 g;
    public final /* synthetic */ qbp0 h;
    public final /* synthetic */ qbp0 i;
    public final /* synthetic */ qbp0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oap0(qbp0 qbp0Var, qbp0 qbp0Var2, qbp0 qbp0Var3, qbp0 qbp0Var4, qbp0 qbp0Var5, qbp0 qbp0Var6, qbp0 qbp0Var7, qbp0 qbp0Var8, qbp0 qbp0Var9, qbp0 qbp0Var10, qbp0 qbp0Var11) {
        super(0);
        this.a = qbp0Var;
        this.b = qbp0Var2;
        this.c = qbp0Var3;
        this.d = qbp0Var4;
        this.e = qbp0Var5;
        this.f = qbp0Var6;
        this.g = qbp0Var7;
        this.h = qbp0Var8;
        this.i = qbp0Var9;
        this.t = qbp0Var10;
        this.X = qbp0Var11;
    }

    public final Object invoke() {
        q8n q8nVar = (q8n) this.a.invoke();
        q8n q8nVar2 = (q8n) this.b.invoke();
        ov20 ov20Var = (ov20) this.c.invoke();
        r241 r241Var = (r241) this.d.invoke();
        RetrofitMaker retrofitMaker = (RetrofitMaker) this.e.invoke();
        dma1 dma1Var = (dma1) this.f.invoke();
        yqg yqgVar = (yqg) this.g.invoke();
        luk lukVar = (luk) this.h.invoke();
        y6a y6aVar = (y6a) this.i.invoke();
        i8h1 i8h1Var = (i8h1) this.t.invoke();
        Context context = (Context) this.X.invoke();
        b2b0 b2b0Var = (b2b0) retrofitMaker.createWebgateService(b2b0.class, "android-genalphablocking-allowlistingnotificationsdaemon");
        ay3 ay3Var = new ay3(dma1Var);
        ek4 ek4Var = new ek4(false, false, false, false, false, false, false, false, (tgp0) null, lukVar);
        b2b0Var.getClass();
        return new yx3(q8nVar, q8nVar2, ov20Var, b2b0Var, r241Var, ay3Var, yqgVar, y6aVar, i8h1Var, context.getResources(), ek4Var.c());
    }
}
