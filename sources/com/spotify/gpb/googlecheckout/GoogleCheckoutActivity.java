package com.spotify.gpb.googlecheckout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.mobius.android.MobiusLoopViewModel;
import java.util.Collections;
import java.util.UUID;
import java.util.WeakHashMap;
import kotlin.Metadata;
import p.a0b;
import p.a7h1;
import p.ae41;
import p.b2r0;
import p.b7x;
import p.b8k1;
import p.bck1;
import p.bhn0;
import p.bk20;
import p.bwf;
import p.d6d1;
import p.e050;
import p.e821;
import p.een0;
import p.eg;
import p.f050;
import p.f250;
import p.fdg1;
import p.fza;
import p.g250;
import p.gid;
import p.gik1;
import p.h050;
import p.i3o1;
import p.idd1;
import p.kl1;
import p.l050;
import p.l150;
import p.lir0;
import p.m050;
import p.m5n1;
import p.mir0;
import p.mma0;
import p.mzo;
import p.n050;
import p.p150;
import p.pf61;
import p.qdd1;
import p.r6h1;
import p.r7k1;
import p.rc11;
import p.s050;
import p.t050;
import p.u150;
import p.u890;
import p.uba;
import p.w7h1;
import p.x150;
import p.x6h1;
import p.x7h1;
import p.xj61;
import p.y050;
import p.y6h1;
import p.z7h1;
import p.zlv;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/spotify/gpb/googlecheckout/GoogleCheckoutActivity;", "Lp/mzo;", "Lp/lir0;", "Lp/bwf;", "<init>", "()V", "p/fza", "p/e1r0", "src_main_java_com_spotify_gpb_googlecheckout-googlecheckout"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class GoogleCheckoutActivity extends mzo implements lir0, bwf {
    public l150 b1;
    public b2r0 c1;
    public gik1 d1;
    public pf61 e1;
    public final idd1 f1 = new idd1(new e050(this, (byte) 0));
    public final bck1 g1 = new bck1(rc11.a.b(MobiusLoopViewModel.class), new e050(this, (byte) 1), new e050(this, (byte) 3), new e050(this, (byte) 2));
    public final e821 h1;
    public gid i1;
    public static final /* synthetic */ mma0[] k1 = {new een0(GoogleCheckoutActivity.class, "shownError", "getShownError()Lcom/spotify/gpb/googlecheckout/GoogleCheckoutPageViewState$Error;", 0)};
    public static final fza j1 = new fza((byte) 12);

    public GoogleCheckoutActivity() {
        h050 h050Var = h050.b;
        ae41 ae41Var = ae41.b;
        kl1 kl1Var = ae41Var.a;
        this.h1 = fdg1.W(this, x150.Companion.serializer(), ae41Var, h050Var);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void K(String str) {
        int iHashCode = str.hashCode();
        mma0[] mma0VarArr = k1;
        e821 e821Var = this.h1;
        b7x b7xVar = b7x.a;
        t050 t050Var = t050.a;
        switch (iHashCode) {
            case -2062359205:
                if (str.equals("TAG_GENERIC_ERROR")) {
                    x150 x150Var = (x150) e821Var.m(this, mma0VarArr[0]);
                    u150 u150Var = x150Var instanceof u150 ? (u150) x150Var : null;
                    if (u150Var != null) {
                        if (!u150Var.a) {
                            n0().U(t050Var);
                        } else {
                            n0().U(y050.a);
                        }
                    }
                    break;
                }
                break;
            case -1798328102:
                if (str.equals("TAG_WRONG_GOOGLE_USER")) {
                    n0().U(t050Var);
                    break;
                }
                break;
            case 80000762:
                if (str.equals("TAG_OTHER_USER_SUBSCRIBED")) {
                    n0().U(t050Var);
                    break;
                }
                break;
            case 231893324:
                if (str.equals("TAG_CHANGE_COUNTRY")) {
                    x150 x150Var2 = (x150) e821Var.m(this, mma0VarArr[0]);
                    p150 p150Var = x150Var2 instanceof p150 ? (p150) x150Var2 : null;
                    if (p150Var != null) {
                        UUID uuidB = l0().b();
                        y6h1 y6h1Var = y6h1.i;
                        x6h1 x6h1VarI = i3o1.i();
                        x6h1VarI.h = "music";
                        x6h1VarI.a = "mobile-checkout-dialogs";
                        x6h1VarI.f = "3.0.0";
                        x6h1VarI.g = "22.0.0";
                        x6h1VarI.b = uuidB.toString();
                        x6h1 x6h1VarC = x6h1VarI.a().c();
                        x6h1VarC.i.add(new a7h1("switch_country_dialog", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC.j = true;
                        y6h1 y6h1VarA = x6h1VarC.a();
                        uba ubaVarM0 = m0();
                        String str2 = p150Var.b;
                        x6h1 x6h1VarC2 = y6h1VarA.c();
                        x6h1VarC2.i.add(new a7h1("switch_to_country_button", str2, (Integer) null, (String) null, (String) null));
                        x6h1VarC2.j = false;
                        ubaVarM0.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "")), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                        n0().U(s050.a);
                    }
                    break;
                }
                break;
            case 740791964:
                if (str.equals("TAG_COUNTRY_MISMATCH")) {
                    UUID uuidB2 = l0().b();
                    y6h1 y6h1Var2 = y6h1.i;
                    x6h1 x6h1VarI2 = i3o1.i();
                    x6h1VarI2.h = "music";
                    x6h1VarI2.a = "mobile-checkout-dialogs";
                    x6h1VarI2.f = "3.0.0";
                    x6h1VarI2.g = "22.0.0";
                    x6h1VarI2.b = uuidB2.toString();
                    x6h1 x6h1VarC3 = x6h1VarI2.a().c();
                    x6h1VarC3.i.add(new a7h1("country_mismatch_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = true;
                    y6h1 y6h1VarA2 = x6h1VarC3.a();
                    uba ubaVarM1 = m0();
                    x6h1 x6h1VarC4 = y6h1VarA2.c();
                    x6h1VarC4.i.add(new a7h1("go_back_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    ubaVarM1.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    n0().U(t050Var);
                    break;
                }
                break;
        }
    }

    public final mir0 c() {
        return new mir0(m0().a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void finish() {
        super/*android.app.Activity*/.finish();
        overridePendingTransition(0, 2130772010);
    }

    public final pf61 l0() {
        pf61 pf61Var = this.e1;
        if (pf61Var != null) {
            return pf61Var;
        }
        u890.C("sessionIdProvider");
        throw null;
    }

    public final b2r0 m0() {
        b2r0 b2r0Var = this.c1;
        if (b2r0Var != null) {
            return b2r0Var;
        }
        u890.C("ubiLogger");
        throw null;
    }

    public final MobiusLoopViewModel n0() {
        return (MobiusLoopViewModel) this.g1.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o0(n050 n050Var) {
        if (n050Var instanceof m050) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((m050) n050Var).a)));
            return;
        }
        if (!(n050Var instanceof l050)) {
            eg.o();
            return;
        }
        g250 g250Var = ((l050) n050Var).a;
        int i = g250Var instanceof f250 ? -1 : 0;
        j1.getClass();
        Intent intent = new Intent();
        intent.putExtra("EXTRA_CHECKOUT_RESULT", g250Var);
        setResult(i, intent);
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        byte b = 0;
        byte b2 = 2;
        qdd1 qdd1Var = new qdd1(0, 0, 2, d6d1.U0);
        zlv.a(this, qdd1Var, qdd1Var);
        super.onCreate(bundle);
        ConstraintLayout constraintLayoutInflate = getLayoutInflater().inflate(2131623997, (ViewGroup) null, false);
        int i = 2131428418;
        View viewT = m5n1.t(constraintLayoutInflate, 2131428418);
        if (viewT != null) {
            int i2 = 2131428340;
            TextView textView = (TextView) m5n1.t(viewT, 2131428340);
            if (textView != null) {
                i2 = 2131430208;
                TextView textView2 = (TextView) m5n1.t(viewT, 2131430208);
                if (textView2 != null) {
                    i2 = 2131430509;
                    TextView textView3 = (TextView) m5n1.t(viewT, 2131430509);
                    if (textView3 != null) {
                        i2 = 2131430650;
                        TextView textView4 = (TextView) m5n1.t(viewT, 2131430650);
                        if (textView4 != null) {
                            i2 = 2131431527;
                            TextView textView5 = (TextView) m5n1.t(viewT, 2131431527);
                            if (textView5 != null) {
                                a0b a0bVar = new a0b((LinearLayout) viewT, textView, textView2, textView3, textView4, textView5);
                                i = 2131429838;
                                ProgressBar progressBar = (ProgressBar) m5n1.t(constraintLayoutInflate, 2131429838);
                                if (progressBar != null) {
                                    ConstraintLayout constraintLayout = constraintLayoutInflate;
                                    this.i1 = new gid(constraintLayout, a0bVar, progressBar);
                                    setContentView(constraintLayout);
                                    n0().b.f(this, new f050(this, b));
                                    n0().c.a(this, new f050(this, (byte) 1), new f050(this, b2));
                                    if (bundle == null) {
                                        overridePendingTransition(2130772007, 0);
                                    }
                                    gid gidVar = this.i1;
                                    if (gidVar == null) {
                                        u890.C("viewBinding");
                                        throw null;
                                    }
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) gidVar.b;
                                    bk20 bk20Var = bk20.c;
                                    WeakHashMap weakHashMap = b8k1.a;
                                    r7k1.c(constraintLayout2, bk20Var);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            bhn0.i("Missing required view with ID: ".concat(viewT.getResources().getResourceName(i2)));
            return;
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
    }

    public final void t(String str) {
        if (str.equals("TAG_CHANGE_COUNTRY")) {
            UUID uuidB = l0().b();
            y6h1 y6h1Var = y6h1.i;
            x6h1 x6h1VarI = i3o1.i();
            x6h1VarI.h = "music";
            x6h1VarI.a = "mobile-checkout-dialogs";
            x6h1VarI.f = "3.0.0";
            x6h1VarI.g = "22.0.0";
            x6h1VarI.b = uuidB.toString();
            x6h1 x6h1VarC = x6h1VarI.a().c();
            x6h1VarC.i.add(new a7h1("switch_country_dialog", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = true;
            y6h1 y6h1VarA = x6h1VarC.a();
            uba ubaVarM0 = m0();
            x6h1 x6h1VarC2 = y6h1VarA.c();
            x6h1VarC2.i.add(new a7h1("go_back_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            y6h1 y6h1VarA2 = x6h1VarC2.a();
            b7x b7xVar = b7x.a;
            ubaVarM0.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null);
            n0().U(t050.a);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void x(String str) {
        switch (str.hashCode()) {
            case -2062359205:
                if (!str.equals("TAG_GENERIC_ERROR")) {
                    return;
                }
                break;
            case -1798328102:
                if (!str.equals("TAG_WRONG_GOOGLE_USER")) {
                    return;
                }
                break;
            case 80000762:
                if (!str.equals("TAG_OTHER_USER_SUBSCRIBED")) {
                    return;
                }
                break;
            case 231893324:
                if (!str.equals("TAG_CHANGE_COUNTRY")) {
                    return;
                }
                break;
            case 740791964:
                if (!str.equals("TAG_COUNTRY_MISMATCH")) {
                    return;
                }
                break;
            default:
                return;
        }
        n0().U(t050.a);
    }
}
