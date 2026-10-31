package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.allboarding.entrypoint.EntryPoint;
import com.spotify.genalpha.accountselectionimpl.AccountSelectionActivity;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.functions.Consumer;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dj8 extends zf30 {
    public final vq6 F1;
    public p181 G1;
    public q181 H1;
    public fmy0 I1;
    public kg0 J1;
    public an3 K1;
    public dms0 L1;
    public mr20 M1;
    public ohv0 N1;
    public ryf O1;
    public q5o P1;
    public kgv0 Q1;
    public uf90 R1;
    public y1t0 S1;
    public bdr U1;
    public boolean V1;
    public boolean W1;
    public final CompositeDisposable T1 = new CompositeDisposable();
    public int Z1 = 1;
    public final pf30 X1 = a0(new xi8(this, 0), new e1r0((byte) 5));
    public final pf30 Y1 = a0(new cj8(this, (byte) 0), new e1r0((byte) 5));

    public dj8(vq6 vq6Var) {
        this.F1 = vq6Var;
    }

    public final void F0(Bundle bundle) {
        bundle.putBoolean("onboardingDestination", this.V1);
        bundle.putBoolean("authenticatedDestinationHandled", this.W1);
    }

    public final void I0(View view, Bundle bundle) {
        if (bundle == null) {
            String string = O0().getString("referringDeeplink");
            if (ggo1.K(string) == null && string != null && string.length() != 0) {
                this.U1 = new bdr(string, O0().getString("referrer"));
            }
        } else {
            this.V1 = bundle.getBoolean("onboardingDestination");
            this.W1 = bundle.getBoolean("authenticatedDestinationHandled");
        }
        if (this.W1) {
            return;
        }
        c921.y(cto1.q(this), (o8n) null, 0, new k96(this, (lnm) null, (byte) 17), 3);
    }

    public final void Y0() {
        Single singleOnErrorReturnItem;
        if (O0().getBoolean("isAfterRegistration")) {
            b1();
            return;
        }
        kgv0 kgv0Var = this.Q1;
        if (kgv0Var == null) {
            u890.C("postAuthenticationAccountSelectionProvider");
            throw null;
        }
        Single singleFlatMap = kgv0Var.a.a.filter(mi10.d1).map(si10.d1).map(xi10.d1).firstOrError().flatMap(new l1p0(kgv0Var, (byte) 20));
        Boolean bool = Boolean.FALSE;
        Single singleOnErrorReturnItem2 = singleFlatMap.onErrorReturnItem(bool);
        p181 p181Var = this.G1;
        if (p181Var == null) {
            u890.C("shouldShowAllBoardingAfterLoginUseCase");
            throw null;
        }
        dms0 dms0Var = this.L1;
        if (dms0Var == null) {
            u890.C("sourceIntentRepository");
            throw null;
        }
        String dataString = dms0Var.a().getDataString();
        p181Var.b.getClass();
        if (nbc.o(dataString)) {
            singleOnErrorReturnItem = Single.just(bool);
            singleOnErrorReturnItem.getClass();
        } else {
            singleOnErrorReturnItem = p181Var.a.b("taste-onboarding-signin-eligible").firstOrError().map(e4x0.X).onErrorReturnItem(bool);
            singleOnErrorReturnItem.getClass();
        }
        this.T1.b(Single.zip(singleOnErrorReturnItem2, singleOnErrorReturnItem, new ymm0(this, (byte) 27)).subscribe((Consumer) new xu(this, (byte) 5)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Z0(onm onmVar) {
        zi8 zi8Var;
        if (onmVar instanceof zi8) {
            zi8Var = (zi8) onmVar;
            int i = zi8Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zi8Var.c = i - Integer.MIN_VALUE;
            } else {
                zi8Var = new zi8(this, onmVar);
            }
        } else {
            zi8Var = new zi8(this, onmVar);
        }
        Object objI = zi8Var.a;
        int i2 = zi8Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objI);
                mr20 mr20Var = this.M1;
                if (mr20Var == null) {
                    u890.C("sessionRuntimeDependencies");
                    throw null;
                }
                huz huzVarV = r4p1.v(new hs6(mr20Var, (byte) 4), fdg1.k0(1, ngv.SECONDS));
                zi8Var.c = 1;
                objI = b5p1.i(huzVarV, zi8Var);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objI);
            }
            return ((dh61) objI).a;
        } catch (TimeoutCancellationException unused) {
            ohv0 ohv0Var = this.N1;
            if (ohv0Var != null) {
                ohv0Var.a(new jhv0("authenticated", "session_properties_timeout", 12, (String) null));
                return null;
            }
            u890.C("preAuthUbiTracker");
            throw null;
        }
    }

    public final void a1(wi8 wi8Var) {
        Uri uri;
        int i;
        this.W1 = true;
        int iOrdinal = wi8Var.ordinal();
        if (iOrdinal == 0) {
            if (N0().getIntent().getBooleanExtra("extra_finish_on_auth", false)) {
                N0().finishAndRemoveTask();
                return;
            }
            fmy0 fmy0Var = this.I1;
            if (fmy0Var == null) {
                u890.C("psesApi");
                throw null;
            }
            if ((!fmy0Var.b().k && c2p1.w()) || N0().getIntent().getBooleanExtra("skipHomeNavigation", false)) {
                dg30 dg30VarN0 = N0();
                if (dg30VarN0.getIntent().getBooleanExtra("startMainActivityAfterLogin", true)) {
                    dg30VarN0.runOnUiThread(new aj8(this, dg30VarN0));
                }
                dg30VarN0.runOnUiThread(new aj8(dg30VarN0));
                return;
            }
            kg0 kg0Var = this.J1;
            if (kg0Var != null) {
                kg0Var.b(new sjt(this.U1, false, O0().getBoolean("isAfterRegistration"), 2));
                return;
            } else {
                u890.C("zeroNavigator");
                throw null;
            }
        }
        pf30 pf30Var = this.X1;
        if (iOrdinal == 1) {
            if (this.Q1 == null) {
                u890.C("postAuthenticationAccountSelectionProvider");
                throw null;
            }
            Context contextP0 = P0();
            dms0 dms0Var = this.L1;
            if (dms0Var == null) {
                u890.C("sourceIntentRepository");
                throw null;
            }
            Intent intentA = dms0Var.a();
            int i2 = AccountSelectionActivity.i1;
            pf30Var.a(cyo1.n(contextP0, intentA));
            dg30 dg30VarF0 = f0();
            if (dg30VarF0 != null) {
                dg30VarF0.overridePendingTransition(2130772036, 2130772037);
                return;
            }
            return;
        }
        if (iOrdinal == 2) {
            this.V1 = true;
            an3 an3Var = this.K1;
            if (an3Var == null) {
                u890.C("allBoardingIntentBuilder");
                throw null;
            }
            pf30Var.a(an3Var.a(N0(), EntryPoint.SIGNUP));
            dg30 dg30VarF1 = f0();
            if (dg30VarF1 != null) {
                dg30VarF1.overridePendingTransition(2130772036, 2130772037);
                return;
            }
            return;
        }
        if (iOrdinal != 3) {
            eg.o();
            return;
        }
        ohv0 ohv0Var = this.N1;
        if (ohv0Var == null) {
            u890.C("preAuthUbiTracker");
            throw null;
        }
        ohv0Var.a(new khv0("authenticated", 4, null, "premium_upsell_launched"));
        ryf ryfVar = this.O1;
        if (ryfVar == null) {
            u890.C("checkoutWebViewLauncher");
            throw null;
        }
        Context contextP1 = P0();
        y1t0 y1t0Var = this.S1;
        if (y1t0Var == null) {
            u890.C("premiumUpsellURI");
            throw null;
        }
        int iC = l1d.C(this.Z1);
        if (iC == 0) {
            eg.m("Upsell cannot be disabled when trying to start");
            return;
        }
        if (iC == 1) {
            uri = Uri.parse("https://spotify.com/signup/welcome-to-spotify");
        } else {
            if (iC != 2) {
                eg.o();
                return;
            }
            uri = Uri.parse("https://spotify.com/signup/your-listening-experience");
        }
        Uri uriBuild = uri.buildUpon().appendQueryParameter("source", "mobile").appendQueryParameter("forward_url", "https://www.spotify.com/mobile/close").appendQueryParameter("flow_id", ((x2g1) y1t0Var.b).a.b()).build();
        uriBuild.toString();
        int iC2 = l1d.C(this.Z1);
        if (iC2 == 0) {
            eg.m("Upsell cannot be disabled when trying to start");
            return;
        }
        if (iC2 == 1) {
            i = 2131960366;
        } else {
            if (iC2 != 2) {
                eg.o();
                return;
            }
            i = 2131960367;
        }
        this.Y1.a(ryfVar.a(contextP1, new lyf(rxf.b, new gyf(l0(i)), uriBuild)));
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    public final void b1() {
        wi8 wi8Var;
        if (this.Z1 != 1) {
            wi8Var = wi8.d;
        } else {
            fmy0 fmy0Var = this.I1;
            if (fmy0Var == null) {
                u890.C("psesApi");
                throw null;
            }
            if (fmy0Var.b().i) {
                wi8Var = wi8.a;
            } else {
                if (this.R1 == null) {
                    u890.C("isParentalConsentDeeplinkUseCase");
                    throw null;
                }
                bdr bdrVar = this.U1;
                String strA = bdrVar != null ? bdrVar.a() : null;
                if (strA != null && ihc1.h0(strA, "https://www.spotify.com/account/parental-consent", false)) {
                    wi8Var = wi8.a;
                } else {
                    if (this.H1 == null) {
                        u890.C("shouldShowAllBoardingAfterSignupUseCase");
                        throw null;
                    }
                    dms0 dms0Var = this.L1;
                    if (dms0Var == null) {
                        u890.C("sourceIntentRepository");
                        throw null;
                    }
                    if (nbc.o(dms0Var.a().getDataString())) {
                        wi8Var = wi8.a;
                    } else {
                        wi8Var = wi8.c;
                    }
                }
            }
        }
        a1(wi8Var);
    }

    public final void v0(Context context) {
        this.F1.f(this);
        super.v0(context);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(2131624659, viewGroup, false);
    }

    public final void z0() {
        this.T1.g();
        ((zf30) this).h1 = true;
    }
}
