package p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.base.java.logging.Logger;
import com.spotify.mainlayout.ui.view.containers.MainLayoutFragmentContainerView;
import com.spotify.marquee.marquee.learnmore.LearnMoreWebActivity;
import com.spotify.mobius.coroutines.DispatcherWorker;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tzf0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tzf0(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r8v14, types: [android.view.View, com.spotify.mainlayout.ui.view.MainLayout] */
    public final Object invoke() {
        dma1 dma1Var;
        c7p0 c7p0Var = null;
        switch (this.a) {
            case 0:
                return z1a1.b(((vzf0) this.b).a.getContext());
            case 1:
                return new p0g0((v0g0) this.b);
            case 2:
                return new View(((z0g0) this.b).a.getContext());
            case 3:
                ?? r8 = ((d1g0) this.b).a;
                MainLayoutFragmentContainerView fragmentContainer = r8.getFragmentContainer();
                ViewGroup fragmentOverlayContainer = r8.getFragmentOverlayContainer();
                Resources resources = r8.getContext().getResources();
                ThreadLocal threadLocal = qx21.a;
                return new cvq0(fragmentContainer, fragmentOverlayContainer, resources.getColor(2131101505, null), r8.getContext().getResources().getColor(2131102457, null));
            case 4:
                e1g0 e1g0Var = (e1g0) this.b;
                ynb0 ynb0Var = e1g0Var.a;
                if (!e1g0Var.b) {
                    ynb0Var = null;
                }
                if (ynb0Var != null && (dma1Var = (dma1) ynb0Var.get()) != null) {
                    c7p0Var = (c7p0) e1g0.g.get(Integer.valueOf(dma1Var.l(e1g0.e, -1)));
                }
                if (c7p0Var == null) {
                    c7p0Var = e1g0.f;
                }
                return gio1.b(c7p0Var);
            case 5:
                return z1a1.b(((r1g0) this.b).a.getContext());
            case 6:
                return ((Activity) ((o3e0) this.b).b).getString(2131961881);
            case 7:
                return flo1.l(((f3g0) this.b).f, guo1.B());
            case 8:
                s4g0 s4g0Var = (s4g0) this.b;
                xab1 xab1Var = s4g0Var.f;
                if (xab1Var == null || !xab1Var.isActive()) {
                    s4g0Var.f = fn31.T(s4g0Var.c, (o8n) null, 0, new p6d0(s4g0Var, (lnm) null, (byte) 27), 3);
                }
                return rih1.a;
            case 9:
                return (i8h1) ((blp) ((ur00) this.b).e).get();
            case 10:
                ((fbg0) this.b).a.e();
                return rih1.a;
            case 11:
                ((jdg0) this.b).a.e();
                return rih1.a;
            case 12:
                return (i8h1) ((ikp) ((o3e0) this.b).b).get();
            case 13:
                return new gjj1(6, Boolean.valueOf(((ueg0) this.b).h), (Boolean) null, (Boolean) null);
            case 14:
                return new gjj1(5, (Boolean) null, Boolean.valueOf(((teg0) this.b).h), (Boolean) null);
            case 15:
                return new gjj1(3, (Boolean) null, (Boolean) null, Boolean.valueOf(((veg0) this.b).h));
            case 16:
                return (i8h1) ((ikp) ((o3e0) this.b).b).get();
            case 17:
                atg0 atg0Var = (atg0) this.b;
                luk lukVar = atg0Var.b;
                if (lukVar != null) {
                    return (atg0) lukVar.e(new d26(atg0Var, (byte) 23));
                }
                return null;
            case 18:
                bvg0 bvg0Var = (bvg0) this.b;
                cyg0 cyg0Var = bvg0Var.Y1;
                if (cyg0Var == null) {
                    u890.C("marqueeUbiLogger");
                    throw null;
                }
                String str = bvg0Var.b2;
                if (str == null) {
                    u890.C("adId");
                    throw null;
                }
                cyg0Var.c(3, "https://sponsored-recommendations.spotify.com/", str);
                dg30 dg30VarF0 = bvg0Var.f0();
                if (dg30VarF0 != null) {
                    int i = LearnMoreWebActivity.g1;
                    bvg0Var.X0(new Intent((Context) dg30VarF0, (Class<?>) LearnMoreWebActivity.class));
                }
                return rih1.a;
            case 19:
                byg0 byg0Var = (byg0) this.b;
                byg0Var.i.k(byg0Var.f6p);
                return rih1.a;
            case 20:
                p7h0 p7h0Var = ((n7h0) this.b).k;
                p7h0Var.Y = false;
                p7h0Var.Z = false;
                return rih1.a;
            case 21:
                return Boolean.valueOf(((ryx) this.b).a.isVisible());
            case 22:
                return new DispatcherWorker((q8n) ((ldo) this.b).d);
            case 23:
                dxy dxyVar = (dxy) this.b;
                Single singleCompose = Single.create(new a0b((byte) 7)).compose(d710.O0);
                l811 l811Var = new l811();
                return ((BehaviorSubject) dxyVar.e).debounce(1000L, TimeUnit.MILLISECONDS, (Scheduler) dxyVar.d).observeOn((Scheduler) dxyVar.c).distinctUntilChanged(new eea0(new gpc(l811Var, (byte) 3), (byte) 18)).switchMap(new o3e0(singleCompose, dxyVar, l811Var, (byte) 20));
            case 24:
                ((is3) this.b).run();
                return rih1.a;
            case 25:
                msh0 msh0Var = ((bth0) this.b).d.c;
                if (msh0Var != null) {
                    msh0Var.invoke();
                }
                return rih1.a;
            case 26:
                nwh0 nwh0Var = (nwh0) this.b;
                llm llmVar = nwh0Var.g;
                if (llmVar != null) {
                    fn31.T(llmVar, (o8n) null, 0, new l4f0(nwh0Var, (lnm) null, (byte) 7), 3);
                    return rih1.a;
                }
                u890.C("scope");
                throw null;
            case 27:
                ((xwh0) this.b).b();
                return rih1.a;
            case 28:
                boolean zH = ((j0i0) this.b).a.h(k0i0.b, false);
                Boolean boolValueOf = Boolean.valueOf(zH);
                Logger.b("Read cached value ONCE for this session: " + zH, new Object[0]);
                return boolValueOf;
            default:
                return String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(((Context) ((pbq) this.b).f).getColor(2131101410) & 16777215)}, 1));
        }
    }
}
