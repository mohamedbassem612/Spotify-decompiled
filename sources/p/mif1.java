package p;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.protobuf.UninitializedMessageException;
import androidx.datastore.preferences.protobuf.e;
import com.comscore.android.HostApplicationState;
import com.google.protobuf.Empty;
import com.spotify.home.explicitfeedback.proto.FeedbackList;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;
import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService;
import com.spotify.player.model.PlayerState;
import com.spotify.prefs.esperanto.proto.EsPrefs;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.io.FileInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mif1 implements Predicate, Function, BiFunction, jrn0, Producer, Function3, e761 {
    public static long c;
    public static Method d;
    public static Method e;
    public static Method f;
    public static Method g;
    public final /* synthetic */ byte a;
    public static final mif1 b = new mif1(0);
    public static final mif1 h = new mif1(1);
    public static final mif1 i = new mif1(2);
    public static final mif1 t = new mif1(3);
    public static final mif1 X = new mif1(4);
    public static final mif1 Y = new mif1(5);
    public static final mif1 Z = new mif1(6);
    public static final mif1 N0 = new mif1(7);
    public static final mif1 O0 = new mif1(8);
    public static final as80 P0 = new as80((byte) 1);
    public static final h6m Q0 = new h6m();
    public static final as80 R0 = new as80((byte) 3);
    public static final as80 S0 = new as80((byte) 4);
    public static final as80 T0 = new as80((byte) 5);
    public static final on20 U0 = new on20();
    public static final as80 V0 = new as80((byte) 2);
    public static final mif1 W0 = new mif1(10);
    public static final mif1 X0 = new mif1(11);
    public static final mif1 Y0 = new mif1(12);
    public static final mif1 Z0 = new mif1(13);
    public static final mif1 a1 = new mif1(14);
    public static final mif1 b1 = new mif1(15);
    public static final mif1 c1 = new mif1(16);
    public static final mif1 d1 = new mif1(17);
    public static final mif1 e1 = new mif1(18);
    public static final /* synthetic */ mif1 f1 = new mif1(19);
    public static final mif1 g1 = new mif1(20);
    public static final mif1 h1 = new mif1(21);
    public static final mif1 i1 = new mif1(22);
    public static final mif1 j1 = new mif1(23);
    public static final mif1 k1 = new mif1(25);
    public static final mif1 l1 = new mif1(26);
    public static final mif1 m1 = new mif1(27);
    public static final mif1 n1 = new mif1(28);
    public static final mif1 o1 = new mif1(29);

    public /* synthetic */ mif1(byte b2) {
        this.a = b2;
    }

    public static final void d(String str, int i2) throws Throwable {
        if (Build.VERSION.SDK_INT >= 29) {
            d55.a(j(str), i2);
            return;
        }
        String strJ = j(str);
        try {
            Method method = e;
            if (method == null) {
                method = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                e = method;
            }
            if (method == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            method.invoke(null, Long.valueOf(c), strJ, Integer.valueOf(i2));
        } catch (Exception e2) {
            f(e2);
        }
    }

    public static final void e(String str, int i2) throws Throwable {
        if (Build.VERSION.SDK_INT >= 29) {
            d55.c(j(str), i2);
            return;
        }
        String strJ = j(str);
        try {
            Method method = f;
            if (method == null) {
                method = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                f = method;
            }
            if (method == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            method.invoke(null, Long.valueOf(c), strJ, Integer.valueOf(i2));
        } catch (Exception e2) {
            f(e2);
        }
    }

    public static void f(Exception exc) throws Throwable {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = ((InvocationTargetException) exc).getCause();
            if (cause instanceof RuntimeException) {
                throw cause;
            }
            eg.j(cause);
        }
    }

    public static final boolean g() throws Throwable {
        if (Build.VERSION.SDK_INT >= 29) {
            return d55.e();
        }
        try {
            Method method = d;
            if (method == null) {
                c = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                method = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                d = method;
            }
            if (method != null) {
                return ((Boolean) method.invoke(null, Long.valueOf(c))).booleanValue();
            }
            throw new IllegalArgumentException("Required value was null.");
        } catch (Exception e2) {
            f(e2);
            return false;
        }
    }

    public static final void h(int i2, String str) throws Throwable {
        if (Build.VERSION.SDK_INT >= 29) {
            d55.h(i2, j(str));
            return;
        }
        String strJ = j(str);
        try {
            Method method = g;
            if (method == null) {
                method = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
                g = method;
            }
            if (method == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            method.invoke(null, Long.valueOf(c), strJ, Integer.valueOf(i2));
        } catch (Exception e2) {
            f(e2);
        }
    }

    public static boolean i(nsn0 nsn0Var, kyn0 kyn0Var) {
        if (!(nsn0Var instanceof esn0) || kyn0Var == null) {
            return false;
        }
        esn0 esn0Var = kyn0Var.a;
        if (esn0Var instanceof fsn0) {
            return true;
        }
        return (esn0Var instanceof esn0) && esn0Var.a.equals(((esn0) nsn0Var).a);
    }

    public static String j(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    @Override // p.e761
    public Object a() {
        return j82.C();
    }

    public Object apply(Object obj) {
        boolean z = false;
        Object obj2 = null;
        switch (this.a) {
            case 2:
                return Boolean.valueOf(((ik4) obj).a);
            case 3:
            case 4:
            case 9:
            case 10:
            case 14:
            case 19:
            case 20:
            case 21:
            default:
                byte[] bArr = (byte[]) obj;
                try {
                    return PlaybackSettingsEsperantoService.GetSettingsResponse.r(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService.GetSettingsResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 5:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    Message message = ((tug1) it.next()).c;
                    if (message != null) {
                        arrayList.add(message);
                    }
                }
                return arrayList;
            case 6:
                spq0 spq0Var = (spq0) obj;
                return Boolean.valueOf(!spq0Var.c() || ((l0l) spq0Var.b()).l());
            case 7:
                PlayerState playerState = (PlayerState) obj;
                if (playerState.isPlaying() && !playerState.isPaused()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 8:
                return new n0l((c7l) obj);
            case 11:
                return ((Boolean) obj).booleanValue() ? h06.a : h06.b;
            case 12:
                return ((c7l) obj).c;
            case 13:
                return new sou(((wou) obj).a());
            case 15:
                return Boolean.valueOf(((EsPrefs.Value) obj).n());
            case 16:
                return new eyt0((PlayerState) obj);
            case 17:
                return FeedbackList.s((byte[]) obj);
            case 18:
                for (Object obj3 : (List) obj) {
                    if (((l0l) obj3).l()) {
                        obj2 = obj3;
                        return spq0.a(obj2);
                    }
                }
                return spq0.a(obj2);
            case 22:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return Empty.q(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // p.e761
    public Object b(FileInputStream fileInputStream) throws CorruptionException, NoWhenBranchMatchedException {
        tnv0 tnv0VarP = lm5.p(fileInputStream);
        cen0 cen0VarD = j82.D(new nnv0[0]);
        for (Map.Entry entry : tnv0VarP.i().entrySet()) {
            String str = (String) entry.getKey();
            xnv0 xnv0Var = (xnv0) entry.getValue();
            int iQ = xnv0Var.q();
            switch (iQ == 0 ? -1 : ynv0.a[l1d.C(iQ)]) {
                case HostApplicationState.UNKNOWN /* -1 */:
                    throw new CorruptionException("Value case is null.", null);
                case 0:
                default:
                    eg.o();
                    return null;
                case 1:
                    cen0VarD.a(rc2.o(str), Boolean.valueOf(xnv0Var.i()));
                    break;
                case 2:
                    cen0VarD.a(rc2.v(str), Float.valueOf(xnv0Var.l()));
                    break;
                case 3:
                    cen0VarD.a(rc2.s(str), Double.valueOf(xnv0Var.k()));
                    break;
                case 4:
                    cen0VarD.a(rc2.A(str), Integer.valueOf(xnv0Var.m()));
                    break;
                case 5:
                    cen0VarD.a(rc2.B(str), Long.valueOf(xnv0Var.n()));
                    break;
                case 6:
                    cen0VarD.a(rc2.H(str), xnv0Var.o());
                    break;
                case 7:
                    cen0VarD.a(rc2.I(str), o7h.p1(xnv0Var.p().l()));
                    break;
                case 8:
                    throw new CorruptionException("Value not set.", null);
            }
        }
        return cen0VarD.c();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.UninitializedMessageException */
    @Override // p.e761
    public void c(Object obj, v091 v091Var) throws UninitializedMessageException {
        e eVarA;
        Map mapUnmodifiableMap = Collections.unmodifiableMap(((cen0) obj).a);
        rnv0 rnv0VarK = tnv0.k();
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            mnv0 mnv0Var = (mnv0) entry.getKey();
            Object value = entry.getValue();
            String str = mnv0Var.a;
            if (value instanceof Boolean) {
                wnv0 wnv0VarR = xnv0.r();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                wnv0VarR.d();
                ((xnv0) wnv0VarR.b).s(zBooleanValue);
                eVarA = wnv0VarR.a();
            } else if (value instanceof Float) {
                wnv0 wnv0VarR2 = xnv0.r();
                float fFloatValue = ((Number) value).floatValue();
                wnv0VarR2.d();
                ((xnv0) wnv0VarR2.b).u(fFloatValue);
                eVarA = wnv0VarR2.a();
            } else if (value instanceof Double) {
                wnv0 wnv0VarR3 = xnv0.r();
                double dDoubleValue = ((Number) value).doubleValue();
                wnv0VarR3.d();
                ((xnv0) wnv0VarR3.b).t(dDoubleValue);
                eVarA = wnv0VarR3.a();
            } else if (value instanceof Integer) {
                wnv0 wnv0VarR4 = xnv0.r();
                int iIntValue = ((Number) value).intValue();
                wnv0VarR4.d();
                ((xnv0) wnv0VarR4.b).v(iIntValue);
                eVarA = wnv0VarR4.a();
            } else if (value instanceof Long) {
                wnv0 wnv0VarR5 = xnv0.r();
                long jLongValue = ((Number) value).longValue();
                wnv0VarR5.d();
                ((xnv0) wnv0VarR5.b).w(jLongValue);
                eVarA = wnv0VarR5.a();
            } else if (value instanceof String) {
                wnv0 wnv0VarR6 = xnv0.r();
                wnv0VarR6.d();
                ((xnv0) wnv0VarR6.b).x((String) value);
                eVarA = wnv0VarR6.a();
            } else {
                if (!(value instanceof Set)) {
                    eg.m(u890.A(value.getClass().getName(), "PreferencesSerializer does not support type: "));
                    return;
                }
                wnv0 wnv0VarR7 = xnv0.r();
                unv0 unv0VarM = vnv0.m();
                unv0VarM.g((Set) value);
                wnv0VarR7.d();
                ((xnv0) wnv0VarR7.b).y(unv0VarM);
                eVarA = wnv0VarR7.a();
            }
            rnv0VarK.getClass();
            str.getClass();
            rnv0VarK.d();
            ((tnv0) rnv0VarK.b).j().put(str, (xnv0) eVarA);
        }
        tnv0 tnv0Var = (tnv0) rnv0VarK.a();
        qwg qwgVar = new qwg(v091Var, qwg.I0(tnv0Var.a()));
        tnv0Var.c(qwgVar);
        if (qwgVar.n > 0) {
            qwgVar.W0();
        }
    }

    public Object get() {
        WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.a;
        return new ImmediateWorkRunner();
    }

    public irn0 l(Intent intent, th61 th61Var) {
        switch (this.a) {
            case 14:
                return new hrn0(v0w.class, new w0w(th61Var.a), a6w0.a);
            default:
                return new frn0((Bundle) null, qvo0.class);
        }
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        return Boolean.valueOf(((Boolean) obj).booleanValue() || ((Boolean) obj2).booleanValue() || !((Boolean) obj3).booleanValue());
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 1:
                return ((spq0) obj).c();
            case 20:
                return ((th61) obj).b;
            case 21:
                th61 th61Var = (th61) obj;
                return (th61Var.c || th61Var.d) ? false : true;
            default:
                return !((wv00) ((uv00) obj)).f;
        }
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 3:
                return Boolean.valueOf(((Boolean) obj).booleanValue() && ((Boolean) obj2).booleanValue());
            default:
                we9 we9Var = (we9) obj;
                return new we9((qg9) obj2, we9Var.b, we9Var.c);
        }
    }
}
