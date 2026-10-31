package com.spotify.login.loginflowimpl;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import p.a0m;
import p.a2k;
import p.ai30;
import p.b8k1;
import p.bj01;
import p.bjt;
import p.bm8;
import p.bwe0;
import p.c5l1;
import p.c921;
import p.ckt;
import p.cm8;
import p.dg30;
import p.dp21;
import p.eb80;
import p.f0i;
import p.f1f0;
import p.gj5;
import p.gp41;
import p.hid0;
import p.hj01;
import p.ifl1;
import p.ila0;
import p.j1e1;
import p.jgu;
import p.kbb;
import p.kg0;
import p.khv0;
import p.kuw0;
import p.lir0;
import p.lmw;
import p.lt50;
import p.mir0;
import p.myo1;
import p.nhc;
import p.nyo1;
import p.ohv0;
import p.opn0;
import p.ppn0;
import p.r7k1;
import p.spq0;
import p.tac0;
import p.th30;
import p.u890;
import p.wwe0;
import p.yl8;
import p.yve0;
import p.z0d1;
import p.zit;
import p.zso1;
import p.zve0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/spotify/login/loginflowimpl/LoginActivity;", "Lp/gj5;", "Lp/lt50;", "Lp/lir0;", "<init>", "()V", "src_main_java_com_spotify_login_loginflowimpl-loginflowimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class LoginActivity extends gj5 implements lt50, lir0 {
    public static final /* synthetic */ int p1 = 0;
    public a2k a1;
    public kg0 b1;
    public jgu c1;
    public f1f0 d1;
    public a0m e1;
    public dp21 f1;
    public spq0 g1;
    public ohv0 h1;
    public hj01 i1;
    public gp41 j1;
    public bwe0 k1;
    public ppn0 l1;
    public mir0 n1;
    public final CompositeDisposable m1 = new CompositeDisposable();
    public final zve0 o1 = new zve0(this, 0);

    @Override // p.lir0
    public final mir0 c() {
        mir0 mir0Var = this.n1;
        if (mir0Var != null) {
            return mir0Var;
        }
        u890.C("pageViewObservable");
        throw null;
    }

    @Override // p.lt50
    public final jgu f() {
        jgu jguVar = this.c1;
        if (jguVar != null) {
            return jguVar;
        }
        u890.C("androidInjector");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void finish() {
        dp21 dp21Var = this.f1;
        if (dp21Var == null) {
            u890.C("requestIdProvider");
            throw null;
        }
        dp21Var.a("");
        super/*android.app.Activity*/.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        if (bundle != null || myo1.r(getIntent().getData())) {
            setTheme(2132018158);
        } else {
            setTheme(2132018165);
        }
        j1e1.q(this);
        lmw lmwVar = ((dg30) this).U0;
        ai30 ai30VarT = lmwVar.t();
        a2k a2kVar = this.a1;
        if (a2kVar == null) {
            u890.C("compositeFragmentFactory");
            throw null;
        }
        ((th30) ai30VarT).B = a2kVar;
        super/*p.dg30*/.onCreate(bundle);
        this.n1 = nhc.p(new eb80(this, (byte) 19));
        getWindow().setFlags(8192, 8192);
        setContentView(2131624003);
        if (this.g1 == null) {
            u890.C("logViewer");
            throw null;
        }
        ImageView imageView = (ImageView) findViewById(2131427670);
        imageView.setOnClickListener(new hid0(this, (byte) 1));
        ((th30) lmwVar.t()).p.K(this.o1, false);
        ((th30) lmwVar.t()).o.add(new yve0(this, imageView));
        imageView.setVisibility(lmwVar.t().G("flow_fragment") instanceof z0d1 ? 0 : 8);
        setVisible(false);
        ConstraintLayout constraintLayoutFindViewById = findViewById(2131429851);
        kuw0 kuw0Var = new kuw0((byte) 15);
        WeakHashMap weakHashMap = b8k1.a;
        r7k1.c(constraintLayoutFindViewById, kuw0Var);
        hj01 hj01Var = this.i1;
        if (hj01Var == null) {
            u890.C("recaptchaLoginActionToken");
            throw null;
        }
        gp41 gp41Var = this.j1;
        if (gp41Var == null) {
            u890.C("screenIdentifier");
            throw null;
        }
        tac0 tac0Var = ((f0i) this).a;
        c921.y(zso1.H(tac0Var), hj01Var.c, 0, new bj01(hj01Var, gp41Var, tac0Var, null), 2);
        if (bundle == null) {
            Intent intent = getIntent();
            dp21 dp21Var = this.f1;
            if (dp21Var == null) {
                u890.C("requestIdProvider");
                throw null;
            }
            dp21Var.a("-1");
            if (intent.getBooleanExtra("previously_logged_in", false)) {
                f1f0 f1f0Var = this.d1;
                if (f1f0Var == null) {
                    u890.C("loginFlowOriginProvider");
                    throw null;
                }
                f1f0Var.b = true;
            }
            kg0 kg0Var = this.b1;
            if (kg0Var == null) {
                u890.C("zeroNavigator");
                throw null;
            }
            kg0Var.c(new ckt(3), new ifl1((Object) null, (byte) 25), false);
            Intent intent2 = (Intent) ila0.s(intent, "intent", Intent.class);
            if (intent2 != null) {
                Set set = c5l1.S1;
                if (kbb.I(intent)) {
                    return;
                }
                a0m a0mVar = this.e1;
                if (a0mVar != null) {
                    a0mVar.g(this, intent2);
                } else {
                    u890.C("deeplinkNonAuthLogger");
                    throw null;
                }
            }
        }
    }

    public final void onDestroy() {
        ai30 ai30VarT = ((dg30) this).U0.t();
        ((th30) ai30VarT).p.M(this.o1);
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onNewIntent(Intent intent) {
        super/*p.g0i*/.onNewIntent(intent);
        Uri data = intent.getData();
        String str = null;
        Object[] objArr = 0;
        nyo1 nyo1VarS = data != null ? myo1.s(data) : null;
        if (nyo1VarS instanceof yl8) {
            kg0 kg0Var = this.b1;
            if (kg0Var == null) {
                u890.C("zeroNavigator");
                throw null;
            }
            yl8 yl8Var = (yl8) nyo1VarS;
            kg0Var.c(new zit(new wwe0(yl8Var.p(), yl8Var.o())), new ifl1((Object) null, (byte) 25), false);
            return;
        }
        if (nyo1VarS instanceof cm8) {
            kg0 kg0Var2 = this.b1;
            if (kg0Var2 != null) {
                kg0Var2.c(new bjt(((cm8) nyo1VarS).o()), new ifl1((Object) null, (byte) 25), false);
                return;
            } else {
                u890.C("zeroNavigator");
                throw null;
            }
        }
        if (!(nyo1VarS instanceof bm8)) {
            ohv0 ohv0Var = this.h1;
            if (ohv0Var == null) {
                u890.C("preAuthUbiTracker");
                throw null;
            }
            ohv0Var.a(new khv0(str, 5, objArr == true ? 1 : 0, "login_activity_refresh_with_unsupported_uri"));
            finish();
            return;
        }
        if (this.l1 == null) {
            u890.C("naverOAuthResultManager");
            throw null;
        }
        bm8 bm8Var = (bm8) nyo1VarS;
        opn0 opn0Var = new opn0(bm8Var.o(), bm8Var.r(), bm8Var.p(), bm8Var.q());
        ppn0.c = 1;
        ppn0.b.onNext(opn0Var);
    }

    public final void onStop() {
        this.m1.g();
        super.onStop();
    }
}
