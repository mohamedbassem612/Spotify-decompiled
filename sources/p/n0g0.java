package p;

import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import com.spotify.mobius.Connection;
import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class n0g0 extends tv30 implements Function0 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0g0(Object obj, byte b) {
        super(0, obj, fpa.class, "create", "create()Lcom/spotify/betamax/player/TrackerManager;", 0);
        this.a = b;
        switch (b) {
            case 22:
                super(0, obj, akr.class, "closeBottomSheet", "closeBottomSheet()V", 0);
                break;
            case 23:
                super(0, obj, akr.class, "closeBottomSheet", "closeBottomSheet()V", 0);
                break;
            case 24:
            case 25:
            default:
                break;
            case 26:
                super(0, obj, pwn0.class, "popFragment", "popFragment()V", 0);
                break;
        }
    }

    public final Object invoke() {
        tv80 tv80VarM;
        byte b = this.a;
        String strA = null;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return (n1n0) ((kly0) ((lyc) this).receiver).get();
            case 1:
                f6h0 f6h0Var = (f6h0) ((lyc) this).receiver;
                if (!f6h0Var.r) {
                }
                return null;
            case 2:
                ((rdd1) ((lyc) this).receiver).getClass();
                return Long.valueOf(SystemClock.elapsedRealtime());
            case 3:
                oqh0 oqh0Var = (oqh0) ((lyc) this).receiver;
                iqh0 iqh0Var = oqh0Var.n().a;
                iqh0Var.C();
                ixh0 ixh0Var = ((fzh0) iqh0Var).x;
                ixh0 ixh0VarA = ixh0Var != null ? iqh0Var.A(ixh0Var) : null;
                if (ixh0VarA != null) {
                    oqh0Var.k.getClass();
                    strA = v8l.a(ixh0VarA);
                }
                int i = Build.VERSION.SDK_INT;
                if (31 > i || i >= 33) {
                    return strA;
                }
                if (strA == null) {
                    n57.s("Package name is not available, using last-known package");
                    return oqh0Var.s;
                }
                oqh0Var.s = strA;
                return strA;
            case 4:
                return ((pk00) ((lyc) this).receiver).a();
            case 5:
                return ((pk00) ((lyc) this).receiver).a();
            case 6:
                return ((pk00) ((lyc) this).receiver).a();
            case 7:
                return ((pk00) ((lyc) this).receiver).a();
            case 8:
                arj0 arj0Var = (arj0) ((lyc) this).receiver;
                arj0Var.getClass();
                String strT = pro1.t("djVoiceImprovements");
                gms0 gms0Var = arj0Var.k;
                drj0 drj0Var = arj0Var.h;
                bqk0 bqk0Var = (bqk0) drj0Var.c;
                i8h1 i8h1Var = (i8h1) drj0Var.b;
                b7x b7xVar = b7x.a;
                if (gms0Var == gms0.d) {
                    x6h1 x6h1VarC = bqk0Var.b.c();
                    x6h1VarC.i.add(new a7h1("declined_mic_access_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = true;
                    x6h1 x6h1VarC2 = x6h1VarC.a().c();
                    x6h1VarC2.i.add(new a7h1("voice_data_storage_label", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = true;
                    tv80VarM = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strT)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                } else {
                    x6h1 x6h1VarC3 = bqk0Var.b.c();
                    x6h1VarC3.i.add(new a7h1("allow_mic_permission_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = true;
                    x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                    x6h1VarC4.i.add(new a7h1("voice_data_storage_label", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = true;
                    tv80VarM = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strT)), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                }
                arj0Var.d.a(strT, tv80VarM, (Bundle) null);
                return rih1Var;
            case 9:
                ((Connection) ((lyc) this).receiver).dispose();
                return rih1Var;
            case 10:
                return new y2g1(((fpa) ((lyc) this).receiver).a);
            case 11:
                return ((pk00) ((lyc) this).receiver).a();
            case 12:
                return ((pk00) ((lyc) this).receiver).a();
            case 13:
                ((akr) ((lyc) this).receiver).d();
                return rih1Var;
            case 14:
                ((akr) ((lyc) this).receiver).d();
                return rih1Var;
            case 15:
                ((twn0) ((lyc) this).receiver).j();
                return rih1Var;
            case 16:
                ((twn0) ((lyc) this).receiver).g();
                return rih1Var;
            case 17:
                ((twn0) ((lyc) this).receiver).g();
                return rih1Var;
            case 18:
                ((twn0) ((lyc) this).receiver).j();
                return rih1Var;
            case 19:
                ((twn0) ((lyc) this).receiver).j();
                return rih1Var;
            case 20:
                ((twn0) ((lyc) this).receiver).g();
                return rih1Var;
            case 21:
                ((twn0) ((lyc) this).receiver).g();
                return rih1Var;
            case 22:
                ((akr) ((lyc) this).receiver).d();
                return rih1Var;
            case 23:
                ((akr) ((lyc) this).receiver).d();
                return rih1Var;
            case 24:
                ((twn0) ((lyc) this).receiver).j();
                return rih1Var;
            case 25:
                ((twn0) ((lyc) this).receiver).g();
                return rih1Var;
            case 26:
                ((pwn0) ((lyc) this).receiver).f();
                return rih1Var;
            case 27:
                twn0 twn0Var = (a761) ((lyc) this).receiver;
                if (twn0Var.d.b()) {
                    twn0Var.k();
                    return rih1Var;
                }
                eg.m("Immediate pop requires an active navigation operation");
                return null;
            case 28:
                return Long.valueOf(((yqg) ((lyc) this).receiver).b());
            default:
                return Long.valueOf(((yqg) ((lyc) this).receiver).b());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0g0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0g0(akr akrVar, byte b) {
        super(0, akrVar, akr.class, "closeBottomSheet", "closeBottomSheet()V", 0);
        this.a = b;
        switch (b) {
            case 14:
                super(0, akrVar, akr.class, "closeBottomSheet", "closeBottomSheet()V", 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0g0(twn0 twn0Var, byte b) {
        super(0, twn0Var, twn0.class, "onBottomSheetDismissed", "onBottomSheetDismissed$src_main_java_com_spotify_ubi_model_model()V", 0);
        this.a = b;
        switch (b) {
            case 19:
                super(0, twn0Var, twn0.class, "onBottomSheetDismissed", "onBottomSheetDismissed$src_main_java_com_spotify_ubi_model_model()V", 0);
                break;
            case 20:
                super(0, twn0Var, twn0.class, "notifyCurrentFragmentChanged", "notifyCurrentFragmentChanged()V", 0);
                break;
            case 21:
                super(0, twn0Var, twn0.class, "notifyCurrentFragmentChanged", "notifyCurrentFragmentChanged()V", 0);
                break;
            default:
                break;
        }
    }
}
