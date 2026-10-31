package p;

import android.content.Context;
import android.hardware.camera2.CaptureRequest;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk;
import androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.Restrictions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wgz0 implements Function, xyz0, Function4, BiFunction, owg1, rb {
    public final /* synthetic */ byte a;
    public boolean b;

    public wgz0(byte b) {
        this.a = b;
        switch (b) {
            case 9:
                this.b = tvt.a.m(SurfaceOrderQuirk.class) != null;
                break;
            case 10:
                this.b = vvt.a.m(TorchIsClosedAfterImageCapturingQuirk.class) != null;
                break;
            default:
                this.b = ((StillCaptureFlashStopRepeatingQuirk) vvt.a.m(StillCaptureFlashStopRepeatingQuirk.class)) != null;
                break;
        }
    }

    public static wnd c(wnd wndVar) {
        vnd vndVar = new vnd();
        vndVar.b = wndVar.c;
        Iterator it = Collections.unmodifiableList(wndVar.a).iterator();
        while (it.hasNext()) {
            ((HashSet) vndVar.c).add((j2t) it.next());
        }
        vndVar.i(wndVar.b);
        xdn0 xdn0VarD = xdn0.d();
        xdn0VarD.r(z1d.J(CaptureRequest.FLASH_MODE), 0);
        vndVar.i(new z1d(eqq0.b(xdn0VarD), (byte) 9));
        return vndVar.j();
    }

    public Object N(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = -1;
        switch (this.a) {
            case 3:
                ContextTrack contextTrack = (ContextTrack) obj;
                Long l = (Long) obj2;
                Long l2 = (Long) obj4;
                boolean zIsEmpty = ((Restrictions) obj3).disallowSeekingReasons().isEmpty();
                contextTrack.getClass();
                boolean z = (!l4o1.G(contextTrack) || l2.longValue() == -1 || this.b) ? false : true;
                String strUri = contextTrack.uri();
                l.getClass();
                long jLongValue2 = l.longValue();
                if (!z) {
                    l2 = -1L;
                }
                return new hs51(jLongValue2, l2.longValue(), strUri, zIsEmpty);
            default:
                ContextTrack contextTrack2 = (ContextTrack) obj;
                Long l3 = (Long) obj2;
                Long l4 = (Long) obj4;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                long jLongValue3 = l3.longValue();
                String strUri2 = contextTrack2.uri();
                if (!this.b) {
                    Long lValueOf = Long.valueOf(l3.longValue() + l4.longValue());
                    if (l4.longValue() == -1 || !l4o1.G(contextTrack2)) {
                        lValueOf = null;
                    }
                    if (lValueOf != null) {
                        jLongValue = lValueOf.longValue();
                    }
                }
                return new ms51(jLongValue3, jLongValue, strUri2, zBooleanValue);
        }
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("androidx.browser.trusted.displaymode.KEY_ID", 1);
        bundle.putBoolean("androidx.browser.trusted.displaymode.KEY_STICKY", this.b);
        bundle.putInt("androidx.browser.trusted.displaymode.KEY_CUTOUT_MODE", 0);
        return bundle;
    }

    public boolean accept(Object obj) {
        iw81 iw81Var = (iw81) obj;
        if (this.b) {
            return false;
        }
        nyu0 nyu0VarC = oxu0.a.c(iw81Var.b);
        return ((nyu0VarC instanceof nyu0 ? nyu0VarC : null) == null || ton1.v(iw81Var.a) == null) ? false : true;
    }

    public Object apply(Object obj) {
        List list;
        ArrayList arrayList = null;
        switch (this.a) {
            case 0:
                boolean z = this.b;
                for (l0l l0lVar : (List) obj) {
                    if (z ? l0lVar.l() : l0lVar.isActive()) {
                        return l0lVar.d();
                    }
                }
                bhn0.t("Collection contains no element matching the predicate.");
                return null;
            case 1:
            default:
                boolean z2 = this.b;
                return new sm81(z2, ((Boolean) obj).booleanValue(), z2, false);
            case 2:
                wsc0 wsc0Var = (wsc0) ((py21) obj).c();
                if (wsc0Var != null && (list = wsc0Var.e) != null) {
                    List<zuc0> list2 = list;
                    boolean z3 = this.b;
                    arrayList = new ArrayList(q7h.U(list2, 10));
                    for (zuc0 zuc0Var : list2) {
                        arrayList.add(new em01(zuc0Var.c, z3 || zuc0Var.l));
                    }
                }
                return arrayList == null ? z6x.a : arrayList;
        }
    }

    public long b(b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(-1998032456);
        uwr uwrVar = cbx.a;
        long j = cbx.a(x340Var).a.c;
        x340Var.r(false);
        return j;
    }

    public long d(boolean z, b0k b0kVar) {
        long jC;
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(349765255);
        if (z) {
            x340Var.i0(266128398);
            uwr uwrVar = cbx.a;
            jC = cbx.a(x340Var).a.c;
            x340Var.r(false);
        } else {
            x340Var.i0(266179424);
            uwr uwrVar2 = cbx.a;
            jC = cbx.a(x340Var).a.a.c();
            x340Var.r(false);
        }
        x340Var.r(false);
        return jC;
    }

    public boolean e(ArrayList arrayList, boolean z) {
        if (!this.b || !z) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) ((CaptureRequest) it.next()).get(CaptureRequest.FLASH_MODE);
            if (num != null && num.intValue() == 2) {
                return true;
            }
        }
        return false;
    }

    public void f(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
    }

    public boolean g(int i) {
        return this.b && i == 0;
    }

    public long h(boolean z, b0k b0kVar) {
        long jC;
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(834387397);
        if (z) {
            x340Var.i0(-2035684030);
            uwr uwrVar = cbx.a;
            jC = cbx.a(x340Var).a.a.c();
            x340Var.r(false);
        } else {
            x340Var.i0(-2035619984);
            uwr uwrVar2 = cbx.a;
            jC = cbx.a(x340Var).a.c;
            x340Var.r(false);
        }
        x340Var.r(false);
        return jC;
    }

    public boolean i(ArrayList arrayList, boolean z) {
        if (!this.b || !z) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) ((CaptureRequest) it.next()).get(CaptureRequest.CONTROL_AE_MODE)).intValue();
            if (iIntValue == 2 || iIntValue == 3) {
                return true;
            }
        }
        return false;
    }

    public /* synthetic */ wgz0(Object obj, boolean z, byte b) {
        this.a = b;
        this.b = z;
    }

    public wgz0(s75 s75Var) {
        this.a = (byte) 13;
        this.b = s75Var.b();
        s75Var.d();
        s75Var.c();
        s75Var.a();
    }

    public wgz0(g4r g4rVar) {
        this.a = (byte) 5;
        this.b = g4rVar.l(Preview3AThreadCrashQuirk.class);
    }

    public /* synthetic */ wgz0(byte b, boolean z) {
        this.a = b;
        this.b = z;
    }

    public wgz0(Context context, Looper looper, rdd1 rdd1Var) {
        this.a = (byte) 14;
        new khc(context.getApplicationContext(), (byte) 29);
        rdd1Var.a(looper, (Handler.Callback) null);
        rdd1Var.a(Looper.getMainLooper(), (Handler.Callback) null);
    }

    public Object apply(Object obj, Object obj2) {
        boolean z = this.b;
        return new sm81(z, ((Boolean) obj2).booleanValue(), z, ((Boolean) obj).booleanValue());
    }
}
