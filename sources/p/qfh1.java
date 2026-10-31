package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.widgets.recommendationswidget.events.proto.NpvRecommendationsWidgetErrorNonAuth;
import com.spotify.widgets.widgetstate.WidgetState;
import java.util.concurrent.TimeoutException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qfh1 extends a8d1 implements vu30 {
    public aap0 a;
    public byte b;
    public final /* synthetic */ rfh1 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qfh1(rfh1 rfh1Var, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.c = rfh1Var;
        this.d = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new qfh1(this.c, this.d, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        aap0 aap0Var;
        Throwable th;
        aap0 aap0Var2;
        TimeoutCancellationException e;
        rfh1 rfh1Var = this.c;
        boolean z = rfh1Var.e;
        hlr hlrVar = rfh1Var.b;
        byte b = this.b;
        z6x z6xVar = z6x.a;
        String str = this.d;
        d9n d9nVar = d9n.a;
        try {
            if (b == 0) {
                hm5.M(obj);
                this.b = (byte) 1;
                obj = rfh1Var.a(str, this);
                if (obj != d9nVar) {
                }
                return d9nVar;
            }
            if (b != 1) {
                if (b != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aap0Var2 = this.a;
                try {
                    hm5.M(obj);
                    return (WidgetState.Unauthenticated) obj;
                } catch (TimeoutCancellationException e2) {
                    e = e2;
                    hlrVar.c(str, new TimeoutException(e.getMessage()));
                    Logger.l(e, "Unauthenticated recommendations timed out", new Object[0]);
                    return new WidgetState.Unauthenticated(z6xVar, aap0Var2.a(), str, z);
                } catch (Throwable th2) {
                    th = th2;
                    i9p0 i9p0VarN = NpvRecommendationsWidgetErrorNonAuth.n();
                    i9p0VarN.q("RECOMMENDATIONS_ERROR");
                    i9p0VarN.s(str);
                    i9p0VarN.r(j2h1.I(th));
                    i9p0VarN.n();
                    hlrVar.a.a(i9p0VarN.build());
                    Logger.l(th, "Failed to fetch unauthenticated recommendations", new Object[0]);
                    return new WidgetState.Unauthenticated(z6xVar, aap0Var2.a(), str, z);
                }
            }
            hm5.M(obj);
            long j = tfh1.a;
            pfh1 pfh1Var = new pfh1(rfh1Var, aap0Var, str, null);
            this.a = aap0Var;
            this.b = (byte) 2;
            Object objN = rc2.N(j, pfh1Var, this);
            if (objN != d9nVar) {
                obj = objN;
                aap0Var2 = aap0Var;
                return (WidgetState.Unauthenticated) obj;
            }
            return d9nVar;
        } catch (TimeoutCancellationException e3) {
            e = e3;
            aap0Var2 = aap0Var;
            hlrVar.c(str, new TimeoutException(e.getMessage()));
            Logger.l(e, "Unauthenticated recommendations timed out", new Object[0]);
            return new WidgetState.Unauthenticated(z6xVar, aap0Var2.a(), str, z);
        } catch (Throwable th3) {
            th = th3;
            aap0Var2 = aap0Var;
            i9p0 i9p0VarN2 = NpvRecommendationsWidgetErrorNonAuth.n();
            i9p0VarN2.q("RECOMMENDATIONS_ERROR");
            i9p0VarN2.s(str);
            i9p0VarN2.r(j2h1.I(th));
            i9p0VarN2.n();
            hlrVar.a.a(i9p0VarN2.build());
            Logger.l(th, "Failed to fetch unauthenticated recommendations", new Object[0]);
            return new WidgetState.Unauthenticated(z6xVar, aap0Var2.a(), str, z);
        }
        aap0Var = (aap0) obj;
    }
}
