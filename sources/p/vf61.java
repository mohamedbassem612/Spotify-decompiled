package p;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vf61 implements Init, Function, BiFunction, jrn0, Predicate, Producer, np80, Function3 {
    public final /* synthetic */ byte a;
    public static final vf61 b = new vf61(0);
    public static final long[] c = {300000, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};
    public static final vf61 d = new vf61(1);
    public static final vf61 e = new vf61(2);
    public static final vf61 f = new vf61(3);
    public static final vf61 g = new vf61(4);
    public static final vf61 h = new vf61(5);
    public static final vf61 i = new vf61(6);
    public static final vf61 t = new vf61(7);
    public static final vf61 X = new vf61(8);
    public static final vf61 Y = new vf61(9);
    public static final vf61 Z = new vf61(10);
    public static final vf61 N0 = new vf61(11);
    public static final vf61 O0 = new vf61(12);
    public static final vf61 P0 = new vf61(13);
    public static final vf61 Q0 = new vf61(14);
    public static final vf61 R0 = new vf61(15);
    public static final vf61 S0 = new vf61(16);
    public static final /* synthetic */ vf61 T0 = new vf61(17);
    public static final vf61 U0 = new vf61(18);
    public static final vf61 V0 = new vf61(19);
    public static final vf61 W0 = new vf61(20);
    public static final vf61 X0 = new vf61(21);
    public static final vf61 Y0 = new vf61(22);
    public static final vf61 Z0 = new vf61(23);
    public static final vf61 a1 = new vf61(24);
    public static final vf61 b1 = new vf61(25);
    public static final vf61 c1 = new vf61(26);
    public static final vf61 d1 = new vf61(27);
    public static final vf61 e1 = new vf61(28);
    public static final /* synthetic */ vf61 f1 = new vf61(29);

    public /* synthetic */ vf61(byte b2) {
        this.a = b2;
    }

    public static final void a(String str, String str2) {
        if (dhn.a.contains(vf61.class)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("fb_mobile_launch_source", "Unclassified");
            ouz ouzVarJ = mod.j(str, str2);
            ouzVarJ.n(bundle, "fb_mobile_activate_app");
            if (mod.n() != 2) {
                ouzVarJ.k();
            }
        } catch (Throwable th) {
            dhn.a(vf61.class, th);
        }
    }

    public static final void c(String str, t01 t01Var, String str2) {
        Set set = dhn.a;
        if (set.contains(vf61.class) || t01Var == null) {
            return;
        }
        try {
            long jLongValue = t01Var.p().longValue();
            vf61 vf61Var = b;
            if (jLongValue < 0) {
                vf61Var.b();
                jLongValue = 0;
            }
            long jS = t01Var.s();
            if (jS < 0) {
                vf61Var.b();
                jS = 0;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("fb_mobile_app_interruptions", t01Var.q());
            Locale locale = Locale.ROOT;
            int i2 = 0;
            if (!set.contains(vf61.class)) {
                int i3 = 0;
                while (true) {
                    try {
                        long[] jArr = c;
                        if (i3 >= 19 || jArr[i3] >= jLongValue) {
                            break;
                        } else {
                            i3++;
                        }
                    } catch (Throwable th) {
                        dhn.a(vf61.class, th);
                    }
                }
                i2 = i3;
            }
            bundle.putString("fb_mobile_time_between_sessions", String.format(locale, "session_quanta_%d", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1)));
            nql nqlVarT = t01Var.t();
            bundle.putString("fb_mobile_launch_source", nqlVarT != null ? nqlVarT.toString() : "Unclassified");
            Long lR = t01Var.r();
            bundle.putLong("_logTime", (lR != null ? lR.longValue() : 0L) / 1000);
            mod.j(str, str2).o("fb_mobile_deactivate_app", jS / 1000.0d, bundle);
        } catch (Throwable th2) {
            dhn.a(vf61.class, th2);
        }
    }

    public Object apply(Object obj) {
        boolean z = false;
        switch (this.a) {
            case 2:
                return Boolean.valueOf(((zpd) obj) == zpd.PROJECTED);
            case 3:
                return Boolean.valueOf(!x0d.c(1).equals((String) obj));
            case 5:
                return new wpb(1, ((lpb) obj).a());
            case 8:
                jn41 jn41Var = (ln41) obj;
                if (!(jn41Var instanceof jn41)) {
                    return c141.a;
                }
                vuk vukVar = (vuk) jn41Var.a;
                return new b141(vukVar.f(), vukVar.e(), vukVar.d());
            case 9:
                PlayerState playerState = (PlayerState) obj;
                if (playerState.isPlaying() && !playerState.isPaused()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 13:
                return Boolean.valueOf(yto.j((String) ((Map) obj).get("allow-advertising-id-transmission")));
            case 18:
                return xa50.valueOf((String) obj);
            case 19:
                ContextTrack contextTrack = (ContextTrack) ((PlayerState) obj).track().h();
                return Boolean.valueOf(contextTrack != null ? l4o1.E(contextTrack) : false);
            case 22:
                return new i5w0((PlayerState) obj);
            case 25:
                return yuo0.a;
            default:
                return uap1.f(((csp0) obj).a().a());
        }
    }

    public void b() {
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            fza fzaVar = oue0.a;
            fza.e(zue0.c);
        } catch (Throwable th) {
            dhn.a(this, th);
        }
    }

    public First e0(Object obj) {
        return First.b((q41) obj);
    }

    public Object get() {
        WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.a;
        return new ImmediateWorkRunner();
    }

    public irn0 l(Intent intent, th61 th61Var) {
        switch (this.a) {
            case 6:
                Set set = s4b1.f;
                return lfb.j(uic.x("spotify:genre:0JQ5DAudkNjCgYMM0TZXDw"));
            default:
                return new frn0((Bundle) null, qcb0.class);
        }
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        return new h1u0((PlayerState) obj, (spq0) obj2, (spq0) obj3);
    }

    public boolean test(Object obj) {
        l0l l0lVar;
        switch (this.a) {
            case 10:
                th61 th61Var = (th61) obj;
                return th61Var.b && !th61Var.d;
            case 11:
                return u890.j(((Intent) obj).getAction(), "android.net.conn.RESTRICT_BACKGROUND_CHANGED");
            case 16:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                return bool.booleanValue();
            case 21:
                return ((th61) obj).b;
            default:
                spq0 spq0Var = (spq0) obj;
                k0u k0uVar = (k0u) spq0Var.h();
                if (k0uVar == null || (l0lVar = k0uVar.b) == null || !l0lVar.l()) {
                    k0u k0uVar2 = (k0u) spq0Var.h();
                    if ((k0uVar2 != null ? k0uVar2.b : null) != null) {
                        return false;
                    }
                }
                return true;
        }
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 4:
                return new zd9(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
            case 7:
                return sqg0.O((Map) obj, (Map) obj2);
            default:
                return new mmr0((k8c0) obj, (ypq0) obj2);
        }
    }
}
