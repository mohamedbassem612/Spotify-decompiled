package p;

import android.net.Uri;
import android.os.Parcel;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract /* synthetic */ class hrt {
    public static final String a(int i) {
        if (i == 1) {
            return "tny_load";
        }
        if (i == 2) {
            return "p2p_load";
        }
        if (i == 3) {
            return "settings_change";
        }
        if (i == 4) {
            return "periodic_update";
        }
        if (i == 5) {
            return "authorization_change";
        }
        throw null;
    }

    public static final String b(int i) {
        return d(i);
    }

    public static final FontFamily c(int i, FontWeight fontWeight, int i2, b0k b0kVar) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        if (((Boolean) x340Var.k(cn80.a)).booleanValue()) {
            x340Var.i0(249206358);
            x340Var.r(false);
            return i2 == 1 ? FontFamily.b : FontFamily.d;
        }
        x340Var.i0(249326917);
        int iC = l1d.C(i);
        if (iC == 0) {
            i3 = 2131296259;
        } else if (iC == 1) {
            i3 = 2131296269;
        } else if (iC == 2) {
            i3 = 2131296262;
        } else if (iC == 3) {
            i3 = 2131296274;
        } else {
            if (iC != 4) {
                eg.o();
                return null;
            }
            i3 = 2131296277;
        }
        FontFamily fontFamilyA = zix.a(i3, fontWeight, i2, x340Var);
        x340Var.r(false);
        return fontFamilyA;
    }

    public static /* synthetic */ String d(int i) {
        switch (i) {
            case 1:
                return "email_already_exist";
            case 2:
                return "signup_terms";
            case 3:
                return "signup_policy";
            case 4:
                return "facebook_login_error";
            case 5:
                return "google_login_error";
            case 6:
                return "no_network_error";
            case 7:
                return "unknown_error";
            case 8:
                return "no_network_retry_error";
            case 9:
                return "reset_password_get_help";
            case 10:
                return "phone_number_error";
            case 11:
                return "phone_number_invalid_number";
            case 12:
                return "phone_number_resend_too_early";
            case 13:
                return "phone_nubmer_timeout";
            case 14:
                return "phone_nubmer_too_many_tries";
            case 15:
                return "phone_nubmer_try_again_later";
            case 16:
                return "retry_facebook";
            case 17:
                return "google_registration_disabled_popup";
            case 18:
                return "facebook_registration_disabled_popup";
            case 19:
                return "email_not_linked";
            case 20:
                return "none";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String e(int i) {
        switch (i) {
            case 1:
                return "embedded_start";
            case 2:
                return "embedded_end";
            case 3:
                return "expanded_start";
            case 4:
                return "expanded_end";
            case 5:
                return "embedded_loaded";
            case 6:
                return "npv_pause";
            case 7:
                return "npv_refresh";
            case 8:
                return "embedded_viewability";
            case 9:
                return "interrupt";
            case 10:
                return "lost_missing_required_views";
            case 11:
                return "lost_user_left_npv_early";
            case 12:
                return "no_demand_delay_completed";
            case 13:
                return "render_delay_start";
            case 14:
                return "render_delay_complete";
            case 15:
                return "npv_resume";
            case 16:
                return "terminated_on_resume";
            default:
                throw null;
        }
    }

    public static float f(DrawScope drawScope, float f) {
        return Size.e(drawScope.j()) / f;
    }

    public static int g(int i, int i2, vu30 vu30Var) {
        return (vu30Var.hashCode() + i) * i2;
    }

    public static int h(Uri uri, int i, int i2) {
        return (uri.hashCode() + i) * i2;
    }

    public static int i(d8r0 d8r0Var, int i, int i2) {
        return (d8r0Var.hashCode() + i) * i2;
    }

    public static ArrayList j(Object obj) {
        hm5.M(obj);
        return new ArrayList();
    }

    public static void k(int i, xu30 xu30Var, h2c h2cVar, x340 x340Var, boolean z) {
        xu30Var.invoke(h2cVar, x340Var, Integer.valueOf(i));
        x340Var.r(z);
    }

    public static void l(Parcel parcel, int i, Integer num) {
        parcel.writeInt(i);
        parcel.writeInt(num.intValue());
    }

    public static void m(p3v p3vVar, String str, dhl dhlVar, p3v p3vVar2, String str2) {
        dhlVar.g(new e5u(p3vVar, str));
        dhlVar.f(new e5u(p3vVar2, str2));
    }

    public static /* synthetic */ void n(m4w m4wVar) throws Exception {
        boolean zIsTerminated;
        if (m4wVar instanceof AutoCloseable) {
            m4wVar.close();
            return;
        }
        if (!(m4wVar instanceof ExecutorService)) {
            bhn0.q();
            return;
        }
        ExecutorService executorService = (ExecutorService) m4wVar;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static void o(cwh0 cwh0Var, float f, float f2, float f3, float f4) {
        cwh0Var.e();
        cwh0Var.l(f, f2);
        cwh0Var.j(f3, f4);
    }

    public static /* synthetic */ boolean p(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = vfu.h;
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, null)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean q(Object obj, Throwable th) {
        jm jmVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = vfu.h;
        do {
            jmVar = hr80.b;
            if (atomicReferenceFieldUpdater.compareAndSet(obj, jmVar, th)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(obj) == jmVar);
        return false;
    }

    public static /* synthetic */ boolean r(AtomicReference atomicReference, Disposable disposable) {
        while (!atomicReference.compareAndSet(null, disposable)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean s(vfu vfuVar, Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = vfu.h;
        while (!atomicReferenceFieldUpdater.compareAndSet(vfuVar, th, null)) {
            if (atomicReferenceFieldUpdater.get(vfuVar) != th) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean t(vfu vfuVar, ohd ohdVar) {
        jm jmVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = vfu.h;
        do {
            jmVar = hr80.b;
            if (atomicReferenceFieldUpdater.compareAndSet(vfuVar, jmVar, ohdVar)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(vfuVar) == jmVar);
        return false;
    }

    public static void u(cwh0 cwh0Var, float f, float f2, float f3, float f4) {
        cwh0Var.e();
        cwh0Var.l(f, f2);
        cwh0Var.v(f3);
        cwh0Var.i(f4);
    }

    public static /* synthetic */ String v(int i) {
        if (i == 1) {
            return "GRANTED_FINE";
        }
        if (i == 2) {
            return "GRANTED_COARSE";
        }
        if (i == 3) {
            return "NEVER_ASKED";
        }
        if (i == 4) {
            return "TEMPORARILY_DENIED";
        }
        if (i == 5) {
            return "PERMANENTLY_DENIED";
        }
        throw null;
    }

    public static /* synthetic */ String w(int i) {
        switch (i) {
            case 1:
                return "CONNECTING";
            case 2:
                return "INCOMPATIBLE";
            case 3:
                return "UNAVAILABLE";
            case 4:
                return "LOGGED_IN";
            case 5:
                return "NOT_LOGGED_IN";
            case 6:
                return "PREMIUM_REQUIRED";
            case 7:
                return "NOT_INSTALLED";
            case 8:
                return "UNSUPPORTED_URI";
            case 9:
                return "SLEEPING";
            case 10:
                return "NOT_AUTHORIZED";
            case 11:
                return "AD_PLAYING";
            case 12:
                return "NARRATION";
            case 13:
                return "TIMED_OUT_WAKEUP";
            case 14:
                return "WAKING_UP";
            case 15:
                return "NOT_LOADED";
            case 16:
                return "WOL";
            case 17:
                return "BUSY";
            case 18:
                return "INSTALLATION_AVAILABLE";
            case 19:
                return "INSTALLING";
            case 20:
                return "MANAGED_ACCOUNT_ON_DISALLOWED_DEVICE";
            case 21:
                return "UNSUPPORTED_VERSION";
            case 22:
                return "UNKNOWN";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String x(int i) {
        if (i == 1) {
            return "FilterRow";
        }
        if (i == 2) {
            return "ClearButton";
        }
        if (i == 3) {
            return "PrimaryFilter";
        }
        if (i == 4) {
            return "SecondaryFilter";
        }
        if (i == 5) {
            return "MoreFilters";
        }
        throw null;
    }

    public static /* synthetic */ int y(String str) {
        if (str == null) {
            bhn0.i("Name is null");
            return 0;
        }
        if (str.equals("CONNECTING")) {
            return 1;
        }
        if (str.equals("INCOMPATIBLE")) {
            return 2;
        }
        if (str.equals("UNAVAILABLE")) {
            return 3;
        }
        if (str.equals("LOGGED_IN")) {
            return 4;
        }
        if (str.equals("NOT_LOGGED_IN")) {
            return 5;
        }
        if (str.equals("PREMIUM_REQUIRED")) {
            return 6;
        }
        if (str.equals("NOT_INSTALLED")) {
            return 7;
        }
        if (str.equals("UNSUPPORTED_URI")) {
            return 8;
        }
        if (str.equals("SLEEPING")) {
            return 9;
        }
        if (str.equals("NOT_AUTHORIZED")) {
            return 10;
        }
        if (str.equals("AD_PLAYING")) {
            return 11;
        }
        if (str.equals("NARRATION")) {
            return 12;
        }
        if (str.equals("TIMED_OUT_WAKEUP")) {
            return 13;
        }
        if (str.equals("WAKING_UP")) {
            return 14;
        }
        if (str.equals("NOT_LOADED")) {
            return 15;
        }
        if (str.equals("WOL")) {
            return 16;
        }
        if (str.equals("BUSY")) {
            return 17;
        }
        if (str.equals("INSTALLATION_AVAILABLE")) {
            return 18;
        }
        if (str.equals("INSTALLING")) {
            return 19;
        }
        if (str.equals("MANAGED_ACCOUNT_ON_DISALLOWED_DEVICE")) {
            return 20;
        }
        if (str.equals("UNSUPPORTED_VERSION")) {
            return 21;
        }
        if (str.equals("UNKNOWN")) {
            return 22;
        }
        hhg1.n("No enum constant com.spotify.connect.core.model.DeviceState.".concat(str));
        return 0;
    }
}
