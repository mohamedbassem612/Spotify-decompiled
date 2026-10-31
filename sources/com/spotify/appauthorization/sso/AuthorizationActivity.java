package com.spotify.appauthorization.sso;

import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Metadata;
import p.aq8;
import p.ar8;
import p.b8k1;
import p.br8;
import p.bv40;
import p.cr8;
import p.d6d1;
import p.dh30;
import p.dr8;
import p.eg;
import p.er8;
import p.fr8;
import p.gr8;
import p.hur;
import p.ihc1;
import p.l1d;
import p.lag;
import p.nbr;
import p.nhz;
import p.o6x;
import p.o9x0;
import p.oq8;
import p.p9w;
import p.ps4;
import p.qdd1;
import p.r7k1;
import p.rku;
import p.ro30;
import p.rp;
import p.rr6;
import p.s9x0;
import p.spq0;
import p.t2b;
import p.t3b1;
import p.t4d1;
import p.tg;
import p.tq8;
import p.u2f0;
import p.u890;
import p.u9x0;
import p.vbx0;
import p.vq8;
import p.wq8;
import p.xq8;
import p.yoi1;
import p.yq8;
import p.zlv;
import p.zq8;
import p.zwz0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/appauthorization/sso/AuthorizationActivity;", "Lp/t3b1;", "Lp/gr8;", "Lcom/spotify/mobius/Connectable;", "Lp/tq8;", "Lp/oq8;", "<init>", "()V", "src_main_java_com_spotify_appauthorization_sso-sso"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AuthorizationActivity extends t3b1 implements gr8, Connectable<tq8, oq8> {
    public static final /* synthetic */ int t1 = 0;
    public vq8 f1;
    public boolean g1;
    public wq8 h1;
    public final rku i1 = new rku();
    public String j1 = "";
    public MobiusLoop.Controller k1;
    public zq8 l1;
    public BehaviorSubject m1;
    public dh30 n1;
    public nbr o1;
    public PublishSubject p1;
    public lag q1;
    public u2f0 r1;
    public hur s1;

    public final Connection L(Consumer consumer) {
        return new rp(this, (byte) 10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o0(fr8 fr8Var) {
        PublishSubject publishSubject = this.p1;
        if (publishSubject == null) {
            u890.C("authResultPublisher");
            throw null;
        }
        if (publishSubject.a()) {
            PublishSubject publishSubject2 = this.p1;
            if (publishSubject2 == null) {
                u890.C("authResultPublisher");
                throw null;
            }
            publishSubject2.onNext(new xq8(this.h1, fr8Var));
        }
        if (fr8Var instanceof ar8) {
            ar8 ar8Var = (ar8) fr8Var;
            vq8 vq8Var = this.f1;
            if (vq8Var == null) {
                u890.C("protocol");
                throw null;
            }
            Bundle bundleC = vq8Var.c(ar8Var.a, ar8Var.d, ar8Var.c, ar8Var.b);
            if (isFinishing()) {
                return;
            }
            lag lagVar = this.q1;
            if (lagVar == null) {
                u890.C("clientAuthLogger");
                throw null;
            }
            String callingPackage = getCallingPackage();
            lagVar.l(callingPackage != null ? callingPackage : "unknown_package_name");
            vq8 vq8Var2 = this.f1;
            if (vq8Var2 == null) {
                u890.C("protocol");
                throw null;
            }
            setResult(-1, vq8Var2.f(bundleC));
            finish();
            return;
        }
        if (!(fr8Var instanceof br8)) {
            if (fr8Var instanceof cr8) {
                p0(nhz.t, null, null);
                return;
            }
            if (fr8Var instanceof dr8) {
                dr8 dr8Var = (dr8) fr8Var;
                p0(dr8Var.a, dr8Var.b, dr8Var.c);
                return;
            } else if (fr8Var instanceof er8) {
                p0(nhz.Y, null, ((er8) fr8Var).b);
                return;
            } else {
                eg.o();
                return;
            }
        }
        br8 br8Var = (br8) fr8Var;
        vq8 vq8Var3 = this.f1;
        if (vq8Var3 == null) {
            u890.C("protocol");
            throw null;
        }
        Bundle bundleE = vq8Var3.e(br8Var.a, br8Var.c, br8Var.b);
        if (isFinishing()) {
            return;
        }
        lag lagVar2 = this.q1;
        if (lagVar2 == null) {
            u890.C("clientAuthLogger");
            throw null;
        }
        String callingPackage2 = getCallingPackage();
        lagVar2.l(callingPackage2 != null ? callingPackage2 : "unknown_package_name");
        vq8 vq8Var4 = this.f1;
        if (vq8Var4 == null) {
            u890.C("protocol");
            throw null;
        }
        spq0 spq0VarA = vq8Var4.a(Uri.parse(this.j1), br8Var);
        if (spq0VarA.c() && this.j1.length() > 0) {
            try {
                startActivity(new Intent("android.intent.action.VIEW", (Uri) spq0VarA.b()));
            } catch (ActivityNotFoundException e) {
                Logger.d(l1d.m("Failed to launch browser: ", e.getMessage()), new Object[0]);
            }
        }
        vq8 vq8Var5 = this.f1;
        if (vq8Var5 == null) {
            u890.C("protocol");
            throw null;
        }
        setResult(-1, vq8Var5.f(bundleE));
        finish();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == 0) {
            if (i == 1337) {
                Logger.d("The Login flow was canceled", new Object[0]);
            }
            o0(new dr8(nhz.N0, null, null));
        }
        super/*p.dac0*/.onActivityResult(i, i2, intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        this.g1 = true;
        super/*android.app.Activity*/.onAttachedToWindow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) throws Exception {
        vbx0 u9x0Var;
        qdd1 qdd1Var = new qdd1(0, 0, 2, d6d1.U0);
        zlv.a(this, qdd1Var, qdd1Var);
        super.onCreate(bundle);
        aq8.v(J(), this, new rr6(this, (byte) 28), 2);
        String callingPackage = getCallingPackage();
        if (callingPackage != null) {
            nbr nbrVar = this.o1;
            if (nbrVar == null) {
                u890.C("deepLinkAttributionTrackersController");
                throw null;
            }
            nbrVar.a((Intent) null, Uri.parse(callingPackage));
        }
        MobiusLoop.Controller controller = this.k1;
        if (controller == null) {
            u890.C("controller");
            throw null;
        }
        controller.c(this);
        Intent intent = getIntent();
        String strH = t2b.h(intent);
        if ("1".equals(strH)) {
            u9x0Var = new vbx0((byte) 29);
        } else if ("sonos-v1".equals(strH)) {
            u9x0Var = new bv40((byte) 24);
        } else if ("google-assistant-v1".equals(strH)) {
            u9x0Var = new o9x0((byte) 29);
        } else if ("com.spotify.sso.action.START_GOOGLE_AUTH_FLOW_V1".equals(intent.getAction())) {
            u9x0Var = new s9x0((byte) 29);
        } else {
            u9x0Var = (intent.getDataString() == null || !t2b.i(intent.getDataString())) ? null : new u9x0((byte) 29);
        }
        if (u9x0Var == null) {
            Logger.d("The in-app protocol has not been set", new Object[0]);
            if (!isFinishing()) {
                setResult(-2);
                finish();
            }
        } else {
            this.f1 = u9x0Var;
        }
        BehaviorSubject behaviorSubject = this.m1;
        if (behaviorSubject == null) {
            u890.C("authInProgressPublisher");
            throw null;
        }
        behaviorSubject.onNext(new yq8(true));
        try {
            setContentView(2131624015);
            View viewFindViewById = findViewById(2131431059);
            p9w p9wVar = p9w.X;
            WeakHashMap weakHashMap = b8k1.a;
            r7k1.c(viewFindViewById, p9wVar);
        } catch (Exception e) {
            if (e.getMessage() != null) {
                String message = e.getMessage();
                message.getClass();
                if (ihc1.h0(message.toLowerCase(Locale.ROOT), "webview", false)) {
                    o0(new dr8(nhz.h, "The system WebView is not available right now or is being updated. Try again later", ""));
                }
            }
            throw e;
        }
        hur hurVar = this.s1;
        if (hurVar != null) {
            hurVar.w();
        } else {
            u890.C("authorizationLoadingIndicator");
            throw null;
        }
    }

    public final void onDestroy() {
        MobiusLoop.Controller controller = this.k1;
        if (controller == null) {
            u890.C("controller");
            throw null;
        }
        controller.disconnect();
        nbr nbrVar = this.o1;
        if (nbrVar == null) {
            u890.C("deepLinkAttributionTrackersController");
            throw null;
        }
        nbrVar.b.g();
        BehaviorSubject behaviorSubject = this.m1;
        if (behaviorSubject == null) {
            u890.C("authInProgressPublisher");
            throw null;
        }
        behaviorSubject.onNext(new yq8(false));
        hur hurVar = this.s1;
        if (hurVar == null) {
            u890.C("authorizationLoadingIndicator");
            throw null;
        }
        ProgressDialog progressDialog = (ProgressDialog) hurVar.c;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        super/*p.dac0*/.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        this.g1 = false;
        super/*android.app.Activity*/.onDetachedFromWindow();
    }

    public final void onPause() {
        super/*p.dac0*/.onPause();
        this.i1.a();
        MobiusLoop.Controller controller = this.k1;
        if (controller != null) {
            controller.stop();
        } else {
            u890.C("controller");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onResume() {
        super/*p.dac0*/.onResume();
        MobiusLoop.Controller controller = this.k1;
        if (controller == null) {
            u890.C("controller");
            throw null;
        }
        controller.start();
        dh30 dh30Var = this.n1;
        if (dh30Var == null) {
            u890.C("intentToRequestConverter");
            throw null;
        }
        Intent intent = getIntent();
        if (intent == null) {
            eg.m("Required value was null.");
        } else {
            this.i1.b(yoi1.i(((zwz0) dh30Var.b).c(), o6x.a).take(1L).singleOrError().map(new ro30(dh30Var, intent, (byte) 27)).flatMapCompletable(new t4d1(this, (byte) 23)).subscribe(ps4.e, new tg(this, (byte) 24)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p0(nhz nhzVar, String str, String str2) {
        if (isFinishing()) {
            return;
        }
        Logger.d(nhzVar.a, new Object[0]);
        lag lagVar = this.q1;
        if (lagVar == null) {
            u890.C("clientAuthLogger");
            throw null;
        }
        String callingPackage = getCallingPackage();
        if (callingPackage == null) {
            callingPackage = "unknown_package_name";
        }
        lagVar.j(callingPackage, nhzVar.a + ": " + str);
        vq8 vq8Var = this.f1;
        if (vq8Var == null) {
            u890.C("protocol");
            throw null;
        }
        spq0 spq0VarH = vq8Var.h(Uri.parse(this.j1), nhzVar, str);
        if (spq0VarH.c() && this.j1.length() > 0) {
            try {
                startActivity(new Intent("android.intent.action.VIEW", (Uri) spq0VarH.b()));
            } catch (ActivityNotFoundException e) {
                Logger.d(l1d.m("Failed to launch browser: ", e.getMessage()), new Object[0]);
            }
        }
        int i = nhzVar != nhz.N0 ? -2 : 0;
        vq8 vq8Var2 = this.f1;
        if (vq8Var2 == null) {
            u890.C("protocol");
            throw null;
        }
        setResult(i, vq8Var2.d(nhzVar, str, str2));
        finish();
    }
}
