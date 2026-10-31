package com.spotify.ageverification.dialog.view;

import android.os.Bundle;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.MobiusAndroid;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import p.a21;
import p.a7h1;
import p.el2;
import p.gid;
import p.gw70;
import p.h0i;
import p.hrr0;
import p.i8h1;
import p.j2i;
import p.jik1;
import p.k7h1;
import p.kk2;
import p.ku1;
import p.kx40;
import p.lik1;
import p.lzn0;
import p.mir0;
import p.n6r0;
import p.nik1;
import p.o6r0;
import p.om2;
import p.p6r0;
import p.pm2;
import p.py9;
import p.rk2;
import p.sm2;
import p.t3b1;
import p.tg;
import p.u890;
import p.v8r;
import p.vm2;
import p.x6h1;
import p.xjn;
import p.xk2;
import p.xl2;
import p.y6h1;
import p.yk2;
import p.yl2;
import p.yon1;
import p.zk2;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/spotify/ageverification/dialog/view/AgeVerificationDialogActivity;", "Lp/t3b1;", "", "Lp/jik1;", "Lp/o6r0;", "<init>", "()V", "p/tx9", "src_main_java_com_spotify_ageverification_dialog-dialog"}, k = 1, mv = {2, 3, SplitInstallErrorCode.NO_ERROR}, xi = 48)
public final class AgeVerificationDialogActivity extends t3b1 implements jik1, o6r0 {
    public static final /* synthetic */ int n1 = 0;
    public yl2 f1;
    public gid g1;
    public gw70 h1;
    public lzn0 i1;
    public Scheduler j1;
    public MobiusLoop.Controller k1;
    public final hrr0 l1 = v8r.q((Object) null);
    public Consumer m1;

    public final mir0 c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new mir0(kx40.g(yon1.G1("AGE_VERIFICATION", "age-verification", 136, "age-verification"), nik1.V0.a(), 4));
    }

    public final n6r0 e() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.G1("AGE_VERIFICATION", "age-verification", 136, "age-verification");
    }

    public final lik1 getViewUri() {
        return nik1.V0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        extras.getClass();
        if (extras.getString("EXTRA_ENTITY_URI") == null) {
            finish();
            return;
        }
        String string = extras.getString("EXTRA_ENTITY_URI");
        string.getClass();
        rk2 rk2Var = new rk2(1, string, extras.getString("EXTRA_COVER_ART_URI"), getResources().getColor(2131101503), 2131952100, 2131952099, 0, 0, null, true);
        this.l1.setValue(rk2Var);
        gid gidVar = this.g1;
        if (gidVar == null) {
            u890.C("logger");
            throw null;
        }
        i8h1 i8h1Var = (i8h1) gidVar.b;
        py9 py9Var = (py9) gidVar.c;
        x6h1 x6h1VarC = py9Var.c.c();
        x6h1VarC.i.add(new a7h1("age_verification_popup", (String) null, (Integer) null, string, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).b = py9Var.b;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        i8h1Var.f(k7h1Var.a(), (Set) null);
        byte b = 2;
        ku1 ku1Var = new ku1(this, b);
        lzn0 lzn0Var = this.i1;
        if (lzn0Var == null) {
            u890.C("navigator");
            throw null;
        }
        yl2 yl2Var = this.f1;
        if (yl2Var == null) {
            u890.C("ageVerificationEndpoint");
            throw null;
        }
        Scheduler scheduler = this.j1;
        if (scheduler == null) {
            u890.C("mainScheduler");
            throw null;
        }
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(yk2.class, new xl2(yl2Var, string, (byte) 0));
        subtypeEffectHandlerBuilderC.g(el2.class, new xl2(yl2Var, string, (byte) 1));
        subtypeEffectHandlerBuilderC.c(xk2.class, new tg(this, (byte) 14));
        subtypeEffectHandlerBuilderC.d(zk2.class, new a21(lzn0Var, this, (byte) 3), scheduler);
        ObservableTransformer observableTransformerH = subtypeEffectHandlerBuilderC.h();
        gid gidVar2 = this.g1;
        if (gidVar2 == null) {
            u890.C("logger");
            throw null;
        }
        MobiusLoop.Controller controllerB = MobiusAndroid.b(Mobius.d(pm2.a, RxConnectables.a(observableTransformerH)).f(new sm2(gidVar2)), new vm2(rk2Var), om2.a);
        controllerB.c(ku1Var);
        this.k1 = controllerB;
        h0i.a(this, new j2i(-1626926022, new kk2(this, b), true));
    }

    public final void onDestroy() {
        MobiusLoop.Controller controller = this.k1;
        if (controller == null) {
            u890.C("controller");
            throw null;
        }
        controller.disconnect();
        super/*p.dac0*/.onDestroy();
    }

    public final void onPause() {
        MobiusLoop.Controller controller = this.k1;
        if (controller == null) {
            u890.C("controller");
            throw null;
        }
        controller.stop();
        super/*p.dac0*/.onPause();
    }

    public final void onResume() {
        MobiusLoop.Controller controller = this.k1;
        if (controller == null) {
            u890.C("controller");
            throw null;
        }
        controller.start();
        super/*p.dac0*/.onResume();
    }
}
