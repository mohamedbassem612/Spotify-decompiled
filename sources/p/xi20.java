package p;

import android.content.Context;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import j$.util.Base64;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xi20 implements v0i, Function, Predicate, luo, Function3, mog0, Init, BiPredicate, Producer, BiFunction, s2i1 {
    public static m1f0 Z;
    public final /* synthetic */ byte a;
    public static final xi20 b = new xi20(0);
    public static final xi20 c = new xi20(1);
    public static final xi20 d = new xi20(2);
    public static final xi20 e = new xi20(3);
    public static final xi20 f = new xi20(4);
    public static final xi20 g = new xi20(5);
    public static final xi20 h = new xi20(6);
    public static final xi20 i = new xi20(7);
    public static final xi20 t = new xi20(8);
    public static final xi20 X = new xi20(9);
    public static final xi20 Y = new xi20(10);
    public static final xi20 N0 = new xi20(11);
    public static final xi20 O0 = new xi20(12);
    public static final xi20 P0 = new xi20(13);
    public static final xi20 Q0 = new xi20(14);
    public static final xi20 R0 = new xi20(15);
    public static final xi20 S0 = new xi20(16);
    public static final xi20 T0 = new xi20(17);
    public static final xi20 U0 = new xi20(18);
    public static final xi20 V0 = new xi20(19);
    public static final xi20 W0 = new xi20(20);
    public static final xi20 X0 = new xi20(21);
    public static final xi20 Y0 = new xi20(22);
    public static final xi20 Z0 = new xi20(23);
    public static final xi20 a1 = new xi20(24);
    public static final xi20 b1 = new xi20(25);
    public static final xi20 c1 = new xi20(26);
    public static final xi20 d1 = new xi20(27);
    public static final xi20 e1 = new xi20(28);
    public static final xi20 f1 = new xi20(29);

    public /* synthetic */ xi20(byte b2) {
        this.a = b2;
    }

    @Override // p.mog0
    public void a(nog0 nog0Var, log0 log0Var, Object obj) {
        ((zog0) log0Var).b = obj;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                return Boolean.valueOf(((vir0) obj) instanceof sir0);
            case 2:
                Throwable th = (Throwable) obj;
                Logger.e(th, "Assisted Curation Genres Loader: failed to parse genres: %s", new Object[]{th.getMessage()});
                return z6x.a;
            case 3:
                return ((feh) obj) instanceof ceh ? bjo.a : new ajo(3);
            case 4:
                return ((th61) obj).a;
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case grn1.d /* 12 */:
            case 14:
            case 15:
            case 16:
            case 17:
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
            case 23:
            case 26:
            default:
                return (eww0) ((spq0) obj).b();
            case 9:
                return new ed7("", (String) null, "", false, ((o451) obj).a, (List) null, 42);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return new ung1((a9h) obj);
            case 13:
                vqi0 vqi0Var = (vqi0) obj;
                return new lqi0(vqi0Var.d, vqi0Var.e, vqi0Var.a, vqi0Var.b, vqi0Var.c, vqi0Var.g);
            case 18:
                byte[] bArr = (byte[]) obj;
                try {
                    return EsOffline.GetContextsResponse.r(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.offline_esperanto.proto.EsOffline.GetContextsResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 19:
                return CompletableEmpty.a;
            case 21:
                sfw sfwVar = (sfw) obj;
                return Observable.just(sfwVar).delay(sfwVar.a.toMillis(), TimeUnit.MILLISECONDS).map(rh20.W0);
            case 22:
                rum1 rum1Var = (vum1) obj;
                return rum1Var instanceof rum1 ? Maybe.e(new nq3(rum1Var.a)) : MaybeEmpty.a;
            case 24:
                return new wae0((Throwable) obj);
            case 25:
                return (String) ((spq0) obj).b();
            case 27:
                return Boolean.valueOf(((bbz0) obj).a);
            case 28:
                return Boolean.TRUE;
        }
    }

    @Override // p.mog0
    public rog0 b() {
        return rog0.a;
    }

    @Override // p.mog0
    public log0 c(nog0 nog0Var, Object obj, int i2, log0 log0Var) {
        apg0 apg0Var = (apg0) nog0Var;
        zog0 zog0Var = (zog0) log0Var;
        return zog0Var == null ? new zog0(apg0Var.h, obj, i2) : new yog0(apg0Var.h, obj, i2, zog0Var);
    }

    @Override // p.mog0
    public log0 d(nog0 nog0Var, log0 log0Var, log0 log0Var2) {
        apg0 apg0Var = (apg0) nog0Var;
        zog0 zog0Var = (zog0) log0Var;
        zog0 zog0Var2 = (zog0) log0Var2;
        T t2 = zog0Var.get();
        if (t2 == 0) {
            return null;
        }
        int i2 = zog0Var.a;
        zog0 zog0Var3 = zog0Var2 == null ? new zog0(apg0Var.h, t2, i2) : new yog0(apg0Var.h, t2, i2, zog0Var2);
        zog0Var3.b = zog0Var.b;
        return zog0Var3;
    }

    public Iterable e(Object obj) {
        mma0[] mma0VarArr = oia0.h;
        return ((jyc) obj).a().l();
    }

    public First e0(Object obj) {
        s1m1 s1m1Var = (s1m1) obj;
        s1m1Var.getClass();
        if (s1m1Var.b != 1) {
            return First.b(s1m1Var);
        }
        s1m1 s1m1VarA = s1m1.a(s1m1Var, 2, 0, (Long) null, (i5u0) null, (wa0) null, (e58) null, (String) null, 0, (String) null, false, (String) null, false, (List) null, 0, (List) null, (Integer) null, false, 0, 8388605);
        g0m1 a0m1Var = new a0m1(2);
        String str = s1m1Var.a;
        String str2 = s1m1Var.u;
        xvj1.x(s1m1Var.t.a);
        return First.c(s1m1VarA, f46.S0(new g0m1[]{a0m1Var, new xzl1(str, str2, "RUNNING".toLowerCase(Locale.ROOT))}));
    }

    @Override // p.mog0
    public rog0 f() {
        return rog0.b;
    }

    public synchronized m1f0 g(Context context) {
        m1f0 m1f0Var;
        if (context == null) {
            try {
                context = wf10.a();
            } catch (Throwable th) {
                throw th;
            }
        }
        m1f0Var = Z;
        if (m1f0Var == null) {
            m1f0Var = new m1f0(context, wf10.b());
            Z = m1f0Var;
        }
        return m1f0Var;
    }

    public Object get() {
        WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.a;
        return new ImmediateWorkRunner();
    }

    @Override // p.mog0
    public nog0 h(ipg0 ipg0Var, int i2) {
        return new apg0(ipg0Var, i2);
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        String str3 = (String) linkedHashMap.get("playlist_id");
        if (str3 == null || str3.length() != 22) {
            return null;
        }
        int length = str3.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str3.charAt(i2);
            if (('a' > cCharAt || cCharAt >= '{') && (('A' > cCharAt || cCharAt >= '[') && ('0' > cCharAt || cCharAt >= ':'))) {
                return null;
            }
        }
        return new myu0(str3, xkg0Var, str2, str);
    }

    public Object m(dxy dxyVar) {
        return qgo1.q((Executor) dxyVar.d(new lzy0(fw9.class, Executor.class)));
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj;
        bool.getClass();
        Boolean bool2 = (Boolean) obj3;
        bool2.getClass();
        return new yvg1(bool, (Boolean) obj2, bool2);
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 5:
                return ((spq0) obj).c();
            case 15:
                return ((th61) obj).b;
            default:
                return !(((wu21) obj) instanceof uu21);
        }
    }

    public boolean test(Object obj, Object obj2) {
        PlayerState playerState = (PlayerState) obj;
        PlayerState playerState2 = (PlayerState) obj2;
        return u890.j(playerState.track(), playerState2.track()) && o4p1.s(playerState) == o4p1.s(playerState2);
    }

    public Object apply(Object obj, Object obj2) {
        return (th61) obj2;
    }
}
