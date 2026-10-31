package com.spotify.endless.sessionstarter;

import android.os.Bundle;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.MobiusAndroid;
import com.spotify.mobius.extras.Connectables;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.ObservableSource;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import p.a2k;
import p.a4c0;
import p.b4c0;
import p.b7r0;
import p.c4c0;
import p.d4c0;
import p.dir0;
import p.dp5;
import p.gvg;
import p.h3c0;
import p.i3c0;
import p.idd1;
import p.j3c0;
import p.j4c0;
import p.k3c0;
import p.k4c0;
import p.kx40;
import p.l3c0;
import p.m3c0;
import p.mir0;
import p.n4c0;
import p.o3c0;
import p.o6x;
import p.ou80;
import p.ozx;
import p.p3c0;
import p.p6r0;
import p.q3c0;
import p.qir0;
import p.rg30;
import p.t3b1;
import p.u890;
import p.vji1;
import p.y6r0;
import p.yoi1;
import p.yon1;
import p.z3c0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/spotify/endless/sessionstarter/EndlessActivity;", "Lp/t3b1;", "Lp/dir0;", "Lp/vji1;", "<init>", "()V", "src_main_java_com_spotify_endless_sessionstarter-sessionstarter"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EndlessActivity extends t3b1 implements dir0, vji1 {
    public static final /* synthetic */ int m1 = 0;
    public MobiusLoop.Controller f1;
    public c4c0 g1;
    public k4c0 h1;
    public n4c0 i1;
    public a2k j1;
    public b7r0 k1;
    public final idd1 l1 = new idd1(new ozx(this, (byte) 0));

    /* JADX WARN: Multi-variable type inference failed */
    public final mir0 c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarG1 = yon1.G1("ENDLESS_FEED", "endless-feed", 512, "endless-feed");
        String stringExtra = getIntent().getStringExtra("com.spotify.endless.sessionstarter.KEY_EXTRA_DEEPLINK");
        if (stringExtra == null) {
            stringExtra = "";
        }
        return new mir0(kx40.g(p6r0VarG1, new qir0(stringExtra), 4));
    }

    public final rg30 l0() {
        a2k a2kVar = this.j1;
        if (a2kVar != null) {
            return a2kVar;
        }
        u890.C("fragmentFactory");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624002);
        getWindow().addFlags(67108864);
        c4c0 c4c0Var = this.g1;
        if (c4c0Var == null) {
            u890.C("lexInjector");
            throw null;
        }
        ou80 ou80Var = (ou80) this.l1.getValue();
        b7r0 b7r0Var = this.k1;
        if (b7r0Var == null) {
            u890.C("pageInstanceIdentifierProvider");
            throw null;
        }
        y6r0 y6r0Var = b7r0Var.get();
        a4c0 a4c0Var = new a4c0();
        q3c0 q3c0Var = c4c0Var.a;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(h3c0.class, new o3c0(q3c0Var, (byte) 0));
        subtypeEffectHandlerBuilderC.g(i3c0.class, new o3c0(q3c0Var, (byte) 1));
        subtypeEffectHandlerBuilderC.g(l3c0.class, new o3c0(q3c0Var, (byte) 2));
        subtypeEffectHandlerBuilderC.g(m3c0.class, new o3c0(q3c0Var, (byte) 3));
        subtypeEffectHandlerBuilderC.c(j3c0.class, new p3c0(q3c0Var, (byte) 0));
        subtypeEffectHandlerBuilderC.c(k3c0.class, new p3c0(q3c0Var, (byte) 1));
        MobiusLoop.Controller controllerB = MobiusAndroid.b(gvg.d("Lex-Experiments", Mobius.d(a4c0Var, RxConnectables.a(subtypeEffectHandlerBuilderC.h()))).h(RxEventSources.a(new ObservableSource[]{yoi1.i(c4c0Var.b.c(), o6x.a).distinctUntilChanged().map(b4c0.a)})), new d4c0(j4c0.c, true, ou80Var, y6r0Var), z3c0.a);
        this.f1 = controllerB;
        k4c0 k4c0Var = this.h1;
        if (k4c0Var == null) {
            u890.C("viewMapper");
            throw null;
        }
        dp5 dp5Var = new dp5(k4c0Var, (byte) 16);
        n4c0 n4c0Var = this.i1;
        if (n4c0Var != null) {
            controllerB.c(Connectables.a(dp5Var, n4c0Var));
        } else {
            u890.C("views");
            throw null;
        }
    }

    public final void onDestroy() {
        super/*p.dac0*/.onDestroy();
        MobiusLoop.Controller controller = this.f1;
        if (controller != null) {
            controller.disconnect();
        } else {
            u890.C("controller");
            throw null;
        }
    }

    public final void onPause() {
        super/*p.dac0*/.onPause();
        MobiusLoop.Controller controller = this.f1;
        if (controller != null) {
            controller.stop();
        } else {
            u890.C("controller");
            throw null;
        }
    }

    public final void onResume() {
        super/*p.dac0*/.onResume();
        MobiusLoop.Controller controller = this.f1;
        if (controller != null) {
            controller.start();
        } else {
            u890.C("controller");
            throw null;
        }
    }
}
