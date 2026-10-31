package p;

import com.spotify.authentication.tokenexchangeesperanto.EsTokenExchange;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableError;
import j$.util.Base64;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import spotify.your_library.esperanto.proto.YourLibraryResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kcx0 implements Function, Predicate, BiFunction, t2n, com.spotify.mobius.functions.BiFunction, Function3, au11, wv91, Init {
    public final /* synthetic */ byte a;
    public static final kcx0 b = new kcx0(0);
    public static final kcx0 c = new kcx0(1);
    public static final kcx0 d = new kcx0(2);
    public static final kcx0 e = new kcx0(3);
    public static final kcx0 f = new kcx0(4);
    public static final kcx0 g = new kcx0(5);
    public static final kcx0 h = new kcx0(6);
    public static final kcx0 i = new kcx0(7);
    public static final kcx0 t = new kcx0(8);
    public static final kcx0 X = new kcx0(9);
    public static final kcx0 Y = new kcx0(10);
    public static final kcx0 Z = new kcx0(11);
    public static final kcx0 N0 = new kcx0(12);
    public static final kcx0 O0 = new kcx0(13);
    public static final kcx0 P0 = new kcx0(14);
    public static final kcx0 Q0 = new kcx0(15);
    public static final kcx0 R0 = new kcx0(16);
    public static final kcx0 S0 = new kcx0(17);
    public static final kcx0 T0 = new kcx0(18);
    public static final kcx0 U0 = new kcx0(19);
    public static final kcx0 V0 = new kcx0(20);
    public static final kcx0 W0 = new kcx0(21);
    public static final kcx0 X0 = new kcx0(22);
    public static final kcx0 Y0 = new kcx0(23);
    public static final kcx0 Z0 = new kcx0(24);
    public static final kcx0 a1 = new kcx0(25);
    public static final kcx0 b1 = new kcx0(26);

    public /* synthetic */ kcx0(byte b2) {
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(iud iudVar, wh71 wh71Var, onm onmVar) {
        dz9 dz9Var;
        if (onmVar instanceof dz9) {
            dz9Var = (dz9) onmVar;
            int i2 = dz9Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dz9Var.c = i2 - Integer.MIN_VALUE;
            } else {
                dz9Var = new dz9(this, onmVar);
            }
        } else {
            dz9Var = new dz9(this, onmVar);
        }
        Object obj = dz9Var.a;
        int i3 = dz9Var.c;
        if (i3 != 0) {
            if (i3 == 1) {
                hm5.M(obj);
                return null;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        if (iudVar instanceof aud) {
            return new xz9(((aud) iudVar).a);
        }
        if (iudVar instanceof ztd) {
            ztd ztdVar = (ztd) iudVar;
            dlw0 dlw0Var = new dlw0(ztdVar.b, ztdVar.c);
            dz9Var.c = 1;
            Object objA = wh71Var.a(dlw0Var, dz9Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else if (iudVar instanceof dud) {
            a9d1 a9d1Var = ((dud) iudVar).a;
            a9d1 a9d1Var2 = a9d1Var instanceof a9d1 ? a9d1Var : null;
            if (a9d1Var2 != null) {
                return new yz9(a9d1Var2.a);
            }
        }
        return null;
    }

    public Object apply(Object obj) {
        CompletableError completableErrorJ;
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) obj;
                Logger.e(th, "Failed to load profile for user", new Object[0]);
                return new wae0(th);
            case 1:
                return crn0.a;
            case 2:
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 12:
            case 13:
            case 15:
            case 16:
            default:
                return ((Boolean) obj).booleanValue() ? Observable.just(Boolean.TRUE) : Observable.just(Boolean.FALSE).delay(200L, TimeUnit.MILLISECONDS);
            case 3:
                ly21 ly21Var = (py21) obj;
                if (ly21Var instanceof ly21) {
                    completableErrorJ = Completable.j(new Throwable(ly21Var.a.b()));
                } else {
                    if (!(ly21Var instanceof oy21)) {
                        eg.o();
                        return null;
                    }
                    completableErrorJ = CompletableEmpty.a;
                }
                return completableErrorJ;
            case 5:
                return ((th61) obj).a;
            case 8:
                return (ContextTrack) ((spq0) obj).b();
            case 10:
                return Boolean.valueOf(((iam) obj).a == 8);
            case 14:
                return new e3a1(((gbl) obj) != gbl.f);
            case 17:
                byte[] bArr = (byte[]) obj;
                try {
                    return EsTokenExchange.TokenExchangeResponse.q(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.authentication.tokenexchangeesperanto.EsTokenExchange.TokenExchangeResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 18:
                return Integer.valueOf((int) ((Long) obj).longValue());
            case 19:
                pig1 pig1Var = (pig1) obj;
                return new ulg1(pig1Var.b, pig1Var.a);
            case 20:
                n57.t("Error while trying to fetch availability state.", (Throwable) obj);
                Set set = s4b1.f;
                return new ern0(uic.x(nik1.z0.a));
            case 21:
                return Boolean.valueOf(!((Set) obj).isEmpty());
            case 22:
                return new wrk1(((Boolean) obj).booleanValue() ? 1 : 2);
        }
    }

    public First e0(Object obj) {
        return First.b(bb1.a((bb1) obj, (String) null, (List) null, (List) null, false, false, false, (String) null, new mlr0(3), lqs0.d, (String) null, 11071));
    }

    public Object g(Object obj) {
        return Integer.valueOf(((uz21) obj).f());
    }

    public lu11 k(fe00 fe00Var, unb1 unb1Var) {
        if (fe00Var.equals(be00.a)) {
            return eu11.a;
        }
        if (fe00Var.equals(ce00.a)) {
            return iu11.a;
        }
        return null;
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        List list = (List) obj2;
        return new sm81(list.contains(new ll81("plus")), ((Boolean) obj3).booleanValue(), list.contains(new ll81("minus")), ((Boolean) obj).booleanValue());
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 2:
                return !((uv00) obj).f;
            case 6:
                return !((uv00) obj).f;
            case 9:
                return !((uv00) obj).f;
            case 12:
                return ((w181) obj).a;
            default:
                return !((YourLibraryResponse) obj).q().r();
        }
    }

    public String toString() {
        switch (this.a) {
            case 16:
                return "StructuralEqualityPolicy";
            default:
                return super.toString();
        }
    }

    public boolean x(Object obj, Object obj2) {
        return u890.j(obj, obj2);
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 4:
                return new s810((PlayerState) obj, ((Boolean) obj2).booleanValue());
            default:
                return qq81.a((qq81) obj, null, null, null, null, (id40) obj2, null, false, null, null, 0, null, 16367);
        }
    }
}
