package p;

import android.app.Application;
import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.base.java.logging.Logger;
import com.spotify.login.signupapi.services.model.MarketingMessagesOption;
import com.spotify.login.signupapi.services.model.PrivacyPolicyAcceptance;
import com.spotify.login.signupapi.services.model.TermsConditionAcceptance;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.ContextTrack;
import com.spotify.signup.signup.v2.proto.GetSignupFlagsResponse;
import com.spotify.signup.signup.v2.proto.ValidateAccountResponse;
import com.spotify.tap.go.socket.SocketIo;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function4;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import org.chromium.net.CronetEngine;
import org.chromium.net.impl.JavaCronetProvider;
import spotify.socialgraph.esperanto.proto.FollowResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class r3x0 implements Init, Function, Predicate, Function4, sga1, BiFunction, cxf1, fsc1, du11, h271 {
    public static lqo1 b1;
    public final /* synthetic */ byte a;
    public static final r3x0 b = new r3x0(0);
    public static final r3x0 c = new r3x0(1);
    public static final r3x0 d = new r3x0(2);
    public static final r3x0 e = new r3x0(3);
    public static final r3x0 f = new r3x0(4);
    public static final r3x0 g = new r3x0(5);
    public static final r3x0 h = new r3x0(6);
    public static final r3x0 i = new r3x0(7);
    public static final r3x0 t = new r3x0(8);
    public static final r3x0 X = new r3x0(9);
    public static final /* synthetic */ r3x0 Y = new r3x0(10);
    public static final r3x0 Z = new r3x0(11);
    public static final r3x0 N0 = new r3x0(12);
    public static final r3x0 O0 = new r3x0(13);
    public static final r3x0 P0 = new r3x0(14);
    public static final r3x0 Q0 = new r3x0(15);
    public static final r3x0 R0 = new r3x0(16);
    public static final r3x0 S0 = new r3x0(17);
    public static final r3x0 T0 = new r3x0(18);
    public static final r3x0 U0 = new r3x0(19);
    public static final r3x0 V0 = new r3x0(20);
    public static final r3x0 W0 = new r3x0(21);
    public static final r3x0 X0 = new r3x0(22);
    public static final r3x0 Y0 = new r3x0(23);
    public static final r3x0 Z0 = new r3x0(24);
    public static final r3x0 a1 = new r3x0(25);
    public static final r3x0 c1 = new r3x0(26);
    public static final /* synthetic */ r3x0 d1 = new r3x0(27);

    public /* synthetic */ r3x0(byte b2) {
        this.a = b2;
    }

    public static nyk0 d(String str, r6h1 r6h1Var) {
        List listB;
        a7h1 a7h1Var;
        y6h1 y6h1Var = (y6h1) o7h.C0(r6h1Var.a);
        return new nyk0((y6h1Var == null || (listB = y6h1Var.b()) == null || (a7h1Var = (a7h1) o7h.C0(listB)) == null) ? null : a7h1Var.d, str, r6h1Var);
    }

    public Object N(Object obj, Object obj2, Object obj3, Object obj4) {
        String str = (String) obj;
        String str2 = (String) obj2;
        km91 km91Var = (km91) obj3;
        str.getClass();
        str2.getClass();
        return new cm91(str, str2, (sp91) obj4, km91Var.a, km91Var.b);
    }

    public w7h1 a(r6h1 r6h1Var, unb1 unb1Var, String str) {
        return d(str, r6h1Var).g();
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 2:
                String message = ((Throwable) obj).getMessage();
                if (message == null) {
                    message = "";
                }
                return new w7z0(message);
            case 3:
            case 5:
            case 10:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                return new f5e0((flb1) obj);
            case 4:
                return (ContextTrack) ((spq0) obj).b();
            case 6:
                return new p1n1(((Boolean) obj).booleanValue());
            case 7:
                return (List) obj;
            case 8:
                return ((djo) obj).c();
            case 9:
                Throwable th = (Throwable) obj;
                if ((th instanceof SocketIo.ConnectionException) || (th instanceof SocketIo.CommandReadException)) {
                    return Observable.empty();
                }
                Logger.e(th, "Go: Error in Session", new Object[0]);
                th.getClass();
                return Observable.error(th);
            case 11:
                GetSignupFlagsResponse getSignupFlagsResponse = (GetSignupFlagsResponse) obj;
                Parcelable.Creator creator = fo81.CREATOR;
                return Observable.just(new dq81(new fo81(getSignupFlagsResponse.o(), getSignupFlagsResponse.z(), getSignupFlagsResponse.A(), getSignupFlagsResponse.B(), getSignupFlagsResponse.s(), getSignupFlagsResponse.t(), getSignupFlagsResponse.q(), getSignupFlagsResponse.v(), TermsConditionAcceptance.Companion.fromString(getSignupFlagsResponse.y()), PrivacyPolicyAcceptance.Companion.fromString(getSignupFlagsResponse.r()), MarketingMessagesOption.Companion.fromString(getSignupFlagsResponse.x()), getSignupFlagsResponse.w(), getSignupFlagsResponse.u(), getSignupFlagsResponse.p(), 144)));
            case 12:
                ValidateAccountResponse validateAccountResponse = (ValidateAccountResponse) obj;
                int iO = validateAccountResponse.o();
                int i2 = iO == 0 ? -1 : fr81.b[l1d.C(iO)];
                if (i2 == 1) {
                    return new e320(new r0c0((String) null, true, false, false));
                }
                if (i2 != 2) {
                    return new e320(new r0c0((String) null, false, true, false));
                }
                int iP = validateAccountResponse.n().p();
                int i3 = iP != 0 ? fr81.a[l1d.C(iP)] : -1;
                if (i3 != 1) {
                    return i3 != 2 ? new e320(new r0c0((String) null, false, false, false)) : new e320(new r0c0((String) null, false, false, true));
                }
                return new e320(new r0c0(o7h.y0(validateAccountResponse.n().o().o(), "\n", (String) null, (String) null, er81.b, 30), false, false, false));
            case 14:
                byte[] bArr = (byte[]) obj;
                try {
                    return FollowResponse.o(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as spotify.socialgraph.esperanto.proto.FollowResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 16:
                return new f7c1((u6c1) obj);
            case 21:
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new zab0((String) it.next()));
                }
                return new e331(arrayList);
        }
    }

    public Object b(u171 u171Var) {
        Long lValueOf;
        qz61 qz61Var = u171Var.a;
        xsd xsdVar = qz61Var.c;
        if (xsdVar instanceof xsd) {
            lValueOf = Long.valueOf(xsdVar.a.b);
        } else {
            if (!u890.j(xsdVar, ysd.a)) {
                hhg1.n("Expected Timestamp or Unknown card data");
                return null;
            }
            lValueOf = null;
        }
        String strZ = qz61Var.b.z();
        if (strZ != null) {
            return new sr7(lValueOf, strZ);
        }
        hhg1.n("Required value was null.");
        return null;
    }

    public w7h1 c(r6h1 r6h1Var, unb1 unb1Var, String str) {
        return d(str, r6h1Var).h(str);
    }

    public hfp1 e(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i2 = ny31.h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? o0c.z(bundle) : o0c.z((Object) null);
    }

    public First e0(Object obj) {
        switch (this.a) {
            case 0:
                return First.b((z6x0) obj);
            case 1:
                return First.b((t67) obj);
            case 2:
            default:
                return First.b((czj1) obj);
            case 3:
                return First.b((m901) obj);
        }
    }

    public Object f(Application application, String str, y5b1 y5b1Var) {
        CronetEngine cronetEngineBuild;
        lqo1 lqo1Var;
        pjo1 pjo1Var = new pjo1();
        qeh1 qeh1Var = new qeh1(pjo1Var, (byte) 19);
        dmj1 dmj1Var = new dmj1(pjo1Var, (byte) 15);
        tx txVar = new tx((byte) 2);
        try {
            cronetEngineBuild = new CronetEngine.Builder(application).build();
            cronetEngineBuild.getClass();
        } catch (IllegalStateException unused) {
            cronetEngineBuild = new JavaCronetProvider(application).createBuilder().build();
            cronetEngineBuild.getClass();
        } catch (UnsatisfiedLinkError unused2) {
            cronetEngineBuild = new JavaCronetProvider(application).createBuilder().build();
            cronetEngineBuild.getClass();
        }
        lyo1 lyo1Var = new lyo1(txVar, cronetEngineBuild, Executors.newCachedThreadPool(new gko1((Integer) null, "rC")));
        exo1 exo1Var = new exo1(lyo1Var);
        exo1 exo1Var2 = new exo1(lyo1Var);
        utw0 utw0Var = new utw0(lyo1Var);
        brk1 brk1Var = new brk1();
        y1t0 y1t0Var = new y1t0(new zxl1(brk1Var, lyo1Var, (byte) 24), (byte) 25);
        y1t0 y1t0Var2 = new y1t0(lyo1Var, (byte) 26);
        fqn1 fqn1Var = new fqn1(y1t0Var, qeh1Var, new f2g1(application));
        x15 x15Var = new x15(application);
        yuo1 yuo1Var = new yuo1(fqn1Var, new yds(application, x15Var), new z8c());
        den1 den1Var = new den1();
        y1t0 y1t0Var3 = new y1t0(new ae(application), (byte) 27);
        a6n1 a6n1Var = new a6n1(application);
        vfo1 vfo1Var = new vfo1(y1t0Var2, a6n1Var, qeh1Var);
        n5n1 n5n1VarS = u890.s(application);
        ghk1 ghk1Var = new ghk1(new svh0((byte) 25), (byte) 9);
        utw0 utw0Var2 = new utw0((byte) 27);
        aje0 aje0Var = new aje0(application, mz40.b);
        yyo1 yyo1Var = new yyo1(a6n1Var, utw0Var2);
        int i2 = sln1.zza;
        fqn1 fqn1Var2 = new fqn1(yyo1Var, new uyo1(y1t0Var3, utw0Var2, "exkbkpfn", 58, 56, 60, 71, rin1.k(sln1.class)), new bzo1(a6n1Var, utw0Var2), false, (byte) 10);
        elo1 elo1Var = new elo1(application, aje0Var, fqn1Var2);
        dzp0 dzp0Var = new dzp0(new bym1(brk1Var, lyo1Var, (byte) 12), x15Var, qeh1Var);
        bym1 bym1Var = new bym1(application, aje0Var, (byte) 11);
        bz11 bz11Var = new bz11();
        bz11Var.a = application;
        bz11Var.j = vfo1Var;
        bz11Var.k = qeh1Var;
        bz11Var.b = n5n1VarS;
        bz11Var.c = ghk1Var;
        bz11Var.d = fqn1Var2;
        bz11Var.h = aje0Var;
        bz11Var.e = dzp0Var;
        bz11Var.f = bym1Var;
        bz11Var.g = brk1Var;
        bz11Var.i = utw0Var;
        rlf1 rlf1Var = new rlf1(application, qeh1Var, bz11Var, new aen1((byte) 3), yuo1Var, den1Var, vfo1Var, fqn1Var2, new alg1(exo1Var2, brk1Var, fqn1Var2, qeh1Var, x15Var), new cik1(brk1Var, exo1Var, x15Var, qeh1Var), elo1Var, brk1Var, dmj1Var);
        synchronized (this) {
            try {
                lqo1Var = b1;
                if (lqo1Var == null) {
                    lqo1Var = new lqo1(application, rlf1Var);
                }
                if (b1 == null) {
                    b1 = lqo1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fn31.Y(((qeh1) ((rlf1) lqo1Var.b).l).a().a, new zpo1(lqo1Var, i2x0.Y0, str, (lnm) null), y5b1Var);
    }

    public w7h1 g(String str, r6h1 r6h1Var) {
        return d(str, r6h1Var).j(str);
    }

    public w7h1 h(String str, r6h1 r6h1Var) {
        return d(str, r6h1Var).i(str);
    }

    public Object s(t171 t171Var) {
        throw new UnsupportedOperationException("Chat preview input not supported for audio content cards");
    }

    public Object t(v171 v171Var) {
        throw new UnsupportedOperationException("URI input not supported for audio content cards");
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 5:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                return bool.booleanValue();
            default:
                return !((uv00) obj).f;
        }
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 17:
                return Boolean.valueOf(((Boolean) obj).booleanValue() && !((Boolean) obj2).booleanValue());
            case 18:
                return new mmr0((md2) obj, (px3) obj2);
            default:
                return new ypm1(((Boolean) obj).booleanValue(), (xpm1) obj2);
        }
    }
}
