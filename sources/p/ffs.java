package p;

import com.spotify.libs.connect.events.proto.PlaybackGrabbingResult;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ffs {
    public final efs a;

    public ffs(efs efsVar) {
        this.a = efsVar;
    }

    public final void a(k650 k650Var, l650 l650Var, Map map) {
        luq0 luq0Var;
        int i;
        up7 up7Var;
        char c;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        char c2 = l650Var == l650.a ? (char) 2 : (char) 1;
        char c3 = k650Var.a() ? (char) 2 : (char) 1;
        char c4 = k650Var.e() ? (char) 2 : (char) 1;
        if (k650Var.d()) {
            luq0Var = luq0.c;
        } else {
            kx7 kx7VarB = k650Var.b();
            luq0Var = kx7VarB != null ? kx7VarB.d : null;
        }
        if (k650Var.d()) {
            i = 3;
        } else {
            kx7 kx7VarB2 = k650Var.b();
            i = (kx7VarB2 == null || (up7Var = kx7VarB2.e) == null) ? 0 : up7Var.a;
        }
        if (k650Var instanceof xi5) {
            c = 1;
        } else {
            if (!(k650Var instanceof sa0)) {
                eg.o();
                return;
            }
            c = 2;
        }
        String strY0 = o7h.y0(map.entrySet(), ", ", "[", "]", c6s.a1, 24);
        String strD = k650Var.c().d();
        f0u type = k650Var.c().getType();
        efs efsVar = this.a;
        efsVar.getClass();
        k0u0 k0u0VarN = PlaybackGrabbingResult.n();
        if (c2 == 1) {
            str = "do_not_grab";
        } else {
            if (c2 != 2) {
                throw null;
            }
            str = "grab";
        }
        k0u0VarN.v(str);
        k0u0VarN.n(strD);
        String strName = type.name();
        Locale locale = Locale.ROOT;
        k0u0VarN.q(strName.toLowerCase(locale));
        if (c3 == 1) {
            str2 = "background";
        } else {
            if (c3 != 2) {
                throw null;
            }
            str2 = "foreground";
        }
        k0u0VarN.r(str2);
        if (c4 == 1) {
            str3 = "paused";
        } else {
            if (c4 != 2) {
                throw null;
            }
            str3 = "playing";
        }
        k0u0VarN.x(str3);
        if (c == 1) {
            str4 = "app_became_foreground";
        } else {
            if (c != 2) {
                throw null;
            }
            str4 = "active_audio_output_changed";
        }
        k0u0VarN.w(str4);
        k0u0VarN.u(strY0);
        if (luq0Var != null) {
            k0u0VarN.t(luq0Var.name().toLowerCase(locale));
        }
        if (i != 0) {
            switch (i) {
                case 1:
                    str5 = "APP";
                    break;
                case 2:
                    str5 = "CAR";
                    break;
                case 3:
                    str5 = "HEADPHONES";
                    break;
                case 4:
                    str5 = "SPEAKER";
                    break;
                case 5:
                    str5 = "WEARABLE";
                    break;
                case 6:
                    str5 = "GLASSES";
                    break;
                case 7:
                    str5 = "UNKNOWN";
                    break;
                default:
                    throw null;
            }
            k0u0VarN.s(str5.toLowerCase(locale));
        }
        efsVar.a.a(k0u0VarN.build());
    }
}
