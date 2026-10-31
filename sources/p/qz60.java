package p;

import com.spotify.adsdisplay.elementimpl.htmlad.events.proto.HTMLAdNavigationEvent;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qz60 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ c070 a;

    public qz60(c070 c070Var) {
        this.a = c070Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        String str;
        String str2;
        String str3;
        String str4;
        gz60 gz60Var = (gz60) obj;
        or50 or50VarN = HTMLAdNavigationEvent.n();
        or50VarN.s();
        or50VarN.n(gz60Var.a.a());
        fq0 fq0Var = gz60Var.a;
        or50VarN.x(fq0Var.h());
        or50VarN.t(fq0Var.k());
        or50VarN.r(gz60Var.b);
        or50VarN.A(ihc1.c1(4600, gz60Var.c));
        int i = gz60Var.d;
        if (i == 1) {
            str = "allowed";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "blocked";
        }
        or50VarN.w(str);
        int i2 = gz60Var.f;
        if (i2 == 1) {
            str2 = "user_activated";
        } else if (i2 == 2) {
            str2 = "redirect";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str2 = "programmatic";
        }
        or50VarN.v(str2);
        int i3 = gz60Var.g;
        if (i3 == 1) {
            str3 = "direct";
        } else {
            if (i3 != 2) {
                throw null;
            }
            str3 = "window_open";
        }
        or50VarN.u(str3);
        int i4 = gz60Var.e;
        if (i4 != 0) {
            if (i4 == 1) {
                str4 = "scheme_not_allowed";
            } else if (i4 == 2) {
                str4 = "no_user_gesture";
            } else {
                if (i4 != 3) {
                    throw null;
                }
                str4 = "dedup";
            }
            or50VarN.q(str4);
        }
        Float f = gz60Var.h;
        if (f != null) {
            or50VarN.y(f.floatValue());
        }
        Float f2 = gz60Var.i;
        if (f2 != null) {
            or50VarN.z(f2.floatValue());
        }
        this.a.c.a(or50VarN.build());
        return rih1.a;
    }
}
