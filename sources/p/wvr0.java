package p;

import android.net.Uri;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wvr0 extends hab0 implements iu30 {
    public static final wvr0 N0;
    public static final wvr0 O0;
    public static final wvr0 P0;
    public static final wvr0 Q0;
    public static final wvr0 R0;
    public static final wvr0 S0;
    public static final wvr0 T0;
    public static final wvr0 U0;
    public static final wvr0 V0;
    public static final wvr0 W0;
    public static final wvr0 X;
    public static final wvr0 X0;
    public static final wvr0 Y;
    public static final wvr0 Y0;
    public static final wvr0 Z;
    public static final wvr0 Z0;
    public static final wvr0 a1;
    public static final wvr0 b;
    public static final wvr0 b1;
    public static final wvr0 c;
    public static final wvr0 c1;
    public static final wvr0 d;
    public static final wvr0 d1;
    public static final wvr0 e;
    public static final wvr0 e1;
    public static final wvr0 f;
    public static final wvr0 g;
    public static final wvr0 h;
    public static final wvr0 i;
    public static final wvr0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new wvr0(i2, (byte) 0);
        c = new wvr0(i2, (byte) 1);
        d = new wvr0(i2, (byte) 2);
        e = new wvr0(i2, (byte) 3);
        f = new wvr0(i2, (byte) 4);
        g = new wvr0(i2, (byte) 5);
        h = new wvr0(i2, (byte) 6);
        i = new wvr0(i2, (byte) 7);
        t = new wvr0(i2, (byte) 8);
        X = new wvr0(i2, (byte) 9);
        Y = new wvr0(i2, (byte) 10);
        Z = new wvr0(i2, (byte) 11);
        N0 = new wvr0(i2, (byte) 12);
        O0 = new wvr0(i2, (byte) 13);
        P0 = new wvr0(i2, (byte) 14);
        Q0 = new wvr0(i2, (byte) 15);
        R0 = new wvr0(i2, (byte) 16);
        S0 = new wvr0(i2, (byte) 17);
        T0 = new wvr0(i2, (byte) 18);
        U0 = new wvr0(i2, (byte) 19);
        V0 = new wvr0(i2, (byte) 20);
        W0 = new wvr0(i2, (byte) 21);
        X0 = new wvr0(i2, (byte) 22);
        Y0 = new wvr0(i2, (byte) 23);
        Z0 = new wvr0(i2, (byte) 24);
        a1 = new wvr0(i2, (byte) 25);
        b1 = new wvr0(i2, (byte) 26);
        c1 = new wvr0(i2, (byte) 27);
        d1 = new wvr0(i2, (byte) 28);
        e1 = new wvr0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wvr0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                b261.c((e261) obj);
                return rih1Var;
            case 1:
                b261.t((e261) obj, 0);
                return rih1Var;
            case 2:
                b261.c((e261) obj);
                return rih1Var;
            case 3:
                b261.c((e261) obj);
                return rih1Var;
            case 4:
                b261.c((e261) obj);
                return rih1Var;
            case 5:
                return rih1Var;
            case 6:
                return rih1Var;
            case 7:
                return ((wxr0) obj).getUri();
            case 8:
                return ((wxr0) obj).getUri();
            case 9:
                wxr0 wxr0Var = (wxr0) obj;
                String uri = wxr0Var.getUri();
                if (flo1.h(wxr0Var)) {
                    return uri;
                }
                return null;
            case 10:
                wxr0 wxr0Var2 = (wxr0) obj;
                String uri2 = wxr0Var2.getUri();
                if (flo1.h(wxr0Var2)) {
                    return uri2;
                }
                return null;
            case 11:
                if (flo1.h((wxr0) obj)) {
                    return "obfuscate-restricted-tracks";
                }
                return null;
            case 12:
                return ((ho70) obj).a;
            case 13:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 14:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 15:
                return Boolean.valueOf(obj instanceof jo70);
            case 16:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 17:
                return Boolean.valueOf(obj instanceof hll);
            case 18:
                return (k1r) obj;
            case 19:
                return Boolean.valueOf(obj instanceof qfd);
            case 20:
                return (k1r) obj;
            case 21:
                return Boolean.valueOf(obj instanceof String);
            case 22:
                return (k1r) obj;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                tyr0 tyr0Var = (tyr0) obj;
                return new uyr0(jmo1.o(tyr0Var), 3, tyr0Var.a, tyr0Var.b, tyr0Var.c, tyr0Var.d, tyr0Var.e, tyr0Var.f, tyr0Var.g, tyr0Var.j);
            case 24:
                t1s0 t1s0Var = ((b2s0) obj).c;
                return h5p1.s(t1s0Var.k(), t1s0Var.d(), t1s0Var.j(), d2s0.h);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new c2s0((b2s0) obj, (a2s0) null);
            case 26:
                b261.d((e261) obj);
                return rih1Var;
            case 27:
                return new i46(((w2s0) obj).b, (byte) 1);
            case 28:
                List listQ0 = ihc1.Q0((String) obj, new String[]{"="}, 0, 6);
                String str = (String) o7h.q0(listQ0);
                String string = (String) o7h.A0(listQ0);
                if (u890.j(str, "imageUri")) {
                    string = Uri.encode(string).toString();
                }
                return xcg1.i(str, "=", string);
            default:
                evs0 evs0VarK = ((kb61) obj).K();
                ReentrantLock reentrantLock = evs0VarK.f;
                reentrantLock.lock();
                try {
                    if (evs0VarK.d == null) {
                        n57.e("Called outside of the lifecycle");
                    }
                    CompletableFromAction completableFromAction = new CompletableFromAction(new cvs0(evs0VarK, (byte) 1));
                    w9u0 w9u0Var = evs0VarK.d;
                    w9u0Var.getClass();
                    evs0VarK.e.a(completableFromAction.c(w9u0Var.a(new g9u0("PiPPlayerService", false)).ignoreElement()).subscribe());
                    return rih1Var;
                } finally {
                    reentrantLock.unlock();
                }
        }
    }
}
