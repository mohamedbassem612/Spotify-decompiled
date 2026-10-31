package p;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.cloudmessaging.zzq;
import com.google.android.play.core.splitcompat.SplitCompat;
import com.google.mlkit.common.MlKitException;
import com.spotify.wear.wearabledatalayer.SpotifyWearableListenerService;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mqh1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public mqh1(c0u0 c0u0Var, String str, long j, long j2) {
        this.a = (byte) 3;
        this.b = c0u0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zf70 zf70Var;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = true;
        switch (this.a) {
            case 0:
                km61.a((km61) this.b, "bulkRedownloadCellularAllowed", (Bundle) this.c, false, 4);
                return;
            case 1:
                EditText editText = (EditText) this.b;
                editText.requestFocus();
                editText.setSelection(editText.getText().length());
                ((InputMethodManager) ((Context) this.c).getSystemService("input_method")).showSoftInput(editText, 1);
                return;
            case 2:
                cej1 cej1Var = (cej1) this.b;
                cej1Var.t = false;
                RecyclerView recyclerView = (RecyclerView) this.c;
                if (recyclerView.getChildCount() == 0 || recyclerView.getLayoutParams().height != -2) {
                    ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                    if (layoutParams == null) {
                        bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        return;
                    }
                    layoutParams.height = -2;
                    recyclerView.setLayoutParams(layoutParams);
                    cej1Var.e.a.requestLayout();
                    return;
                }
                return;
            case 3:
                ((c0u0) this.b).c((String) this.c);
                return;
            case 4:
                ((abk1) this.c).onScrollChanged();
                return;
            case 5:
                vik1 vik1Var = (vik1) this.c;
                vik1Var.g = true;
                vik1Var.c();
                return;
            case 6:
                gdl1 gdl1Var = (gdl1) this.b;
                if (gdl1Var.getHeight() == 0) {
                    return;
                }
                gdl1.a(gdl1Var).cancel();
                gdl1.a(gdl1Var).removeAllUpdateListeners();
                gdl1Var.d();
                gdl1Var.h();
                gdl1.a(gdl1Var).start();
                ((edl1) this.c).getClass();
                gdl1Var.setTag("Dashed line color: #ffffff");
                return;
            case 7:
                ((x8c0) this.b).a((s760) this.c);
                return;
            case 8:
                lal lalVar = (lal) this.b;
                kl1 kl1Var = (kl1) this.c;
                pz40 pz40Var = (pz40) kl1Var.f;
                xaa xaaVar = (px40) kl1Var.b;
                h8n1 h8n1Var = (h8n1) pz40Var.t.get((gi5) kl1Var.c);
                if (h8n1Var == null) {
                    return;
                }
                if (!lalVar.j()) {
                    h8n1Var.l(lalVar, (RuntimeException) null);
                    return;
                }
                kl1Var.a = true;
                if (xaaVar.B()) {
                    if (!kl1Var.a || (zf70Var = (zf70) kl1Var.d) == null) {
                        return;
                    }
                    xaaVar.m(zf70Var, (Set) kl1Var.e);
                    return;
                }
                try {
                    xaaVar.m((zf70) null, xaaVar.B() ? ((px40) xaaVar).z : Collections.EMPTY_SET);
                    return;
                } catch (SecurityException unused) {
                    xaaVar.d("Failed to get service from broker.");
                    h8n1Var.l(new lal(10, (PendingIntent) null, (String) null), (RuntimeException) null);
                    return;
                }
            case 9:
                s8n1 s8n1Var = (s8n1) this.c;
                k9n1 k9n1Var = (k9n1) this.b;
                lal lalVar2 = k9n1Var.b;
                if (lalVar2.j()) {
                    v9n1 v9n1Var = k9n1Var.c;
                    zod.s(v9n1Var);
                    lal lalVar3 = v9n1Var.c;
                    if (!lalVar3.j()) {
                        String strValueOf = String.valueOf(lalVar3);
                        new Exception();
                        "Sign-in succeeded with resolve account failure: ".concat(strValueOf);
                        s8n1Var.r.I(lalVar3);
                        s8n1Var.q.c();
                        return;
                    }
                    kl1 kl1Var2 = s8n1Var.r;
                    IBinder iBinder = v9n1Var.b;
                    zf70 zf70VarB1 = iBinder == null ? null : ok.b1(iBinder);
                    Set set = s8n1Var.o;
                    kl1Var2.getClass();
                    if (zf70VarB1 == null || set == null) {
                        new Exception();
                        kl1Var2.I(new lal(4, (PendingIntent) null, (String) null));
                    } else {
                        kl1Var2.d = zf70VarB1;
                        kl1Var2.e = set;
                        if (kl1Var2.a) {
                            ((px40) kl1Var2.b).m(zf70VarB1, set);
                        }
                    }
                } else {
                    s8n1Var.r.I(lalVar2);
                }
                s8n1Var.q.c();
                return;
            case 10:
                SpotifyWearableListenerService spotifyWearableListenerServiceB1 = ((pgn1) this.c).b1("onChannelEvent");
                if (spotifyWearableListenerServiceB1 == null) {
                    return;
                }
                orn1 orn1Var = (orn1) this.b;
                orn1Var.j(spotifyWearableListenerServiceB1);
                orn1Var.j(spotifyWearableListenerServiceB1.h);
                return;
            case 11:
                gsa gsaVar = (gsa) this.b;
                iua iuaVar = (iua) this.c;
                s141 s141Var = (s141) gsaVar.h.c;
                uhk1 uhk1Var = gsaVar.h;
                if (s141Var != null) {
                    ((s141) uhk1Var.c).c(iuaVar, (List) null);
                    return;
                } else {
                    int i = vsn1.a;
                    Log.isLoggable("BillingClient", 5);
                    return;
                }
            case 12:
                Future future = (Future) this.b;
                if (future.isDone() || future.isCancelled()) {
                    return;
                }
                Runnable runnable = (Runnable) this.c;
                future.cancel(true);
                int i2 = vsn1.a;
                Log.isLoggable("BillingClient", 5);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 13:
                c8n1 c8n1Var = (c8n1) this.b;
                ftn1 ftn1Var = (ftn1) this.c;
                if (ftn1Var.a > 0) {
                    Bundle bundle = (Bundle) ftn1Var.c;
                    c8n1Var.b(bundle != null ? bundle.getBundle("ConnectionlessLifecycleHelper") : null);
                }
                if (ftn1Var.a >= 2) {
                    c8n1Var.b = true;
                    c8n1Var.d();
                }
                if (ftn1Var.a >= 3) {
                    c8n1Var.d();
                }
                if (ftn1Var.a >= 4) {
                    c8n1Var.c();
                    return;
                }
                return;
            case 14:
                arn1 arn1Var = ((uqn1) this.b).l;
                jdn1 jdn1Var = (jdn1) this.c;
                zdp1 zdp1Var = arn1Var.E;
                yz5 yz5Var = jdn1Var.d;
                kkn1 kkn1Var = jdn1Var.f;
                if (!o4e.c(yz5Var, arn1Var.u)) {
                    arn1Var.u = yz5Var;
                    zdp1Var.c();
                }
                double d = jdn1Var.a;
                if (Double.isNaN(d) || Math.abs(d - arn1Var.w) <= 1.0E-7d) {
                    z = false;
                } else {
                    arn1Var.w = d;
                    z = true;
                }
                boolean z6 = jdn1Var.b;
                if (z6 != arn1Var.x) {
                    arn1Var.x = z6;
                    z = true;
                }
                pue0 pue0Var = arn1.H;
                pue0Var.a("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[]{Boolean.valueOf(z), Boolean.valueOf(arn1Var.n)});
                if (zdp1Var != null && (z || arn1Var.n)) {
                    zdp1Var.f();
                }
                Double.isNaN(jdn1Var.g);
                int i3 = jdn1Var.c;
                if (i3 != arn1Var.y) {
                    arn1Var.y = i3;
                    z2 = true;
                } else {
                    z2 = false;
                }
                pue0Var.a("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[]{Boolean.valueOf(z2), Boolean.valueOf(arn1Var.n)});
                if (zdp1Var != null && (z2 || arn1Var.n)) {
                    zdp1Var.a();
                }
                int i4 = jdn1Var.e;
                if (i4 != arn1Var.z) {
                    arn1Var.z = i4;
                } else {
                    z5 = false;
                }
                pue0Var.a("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[]{Boolean.valueOf(z5), Boolean.valueOf(arn1Var.n)});
                if (zdp1Var != null && (z5 || arn1Var.n)) {
                    zdp1Var.e();
                }
                if (!o4e.c(arn1Var.A, kkn1Var)) {
                    arn1Var.A = kkn1Var;
                }
                arn1Var.n = false;
                return;
            case 15:
                gsa gsaVar2 = (gsa) this.b;
                zb10 zb10Var = (zb10) this.c;
                iua iuaVar2 = iyn1.i;
                gsaVar2.T(24, 9, iuaVar2);
                vrn1 vrn1Var = dsn1.b;
                zb10Var.a(iuaVar2, ttn1.e);
                return;
            case 16:
                Callable callable = (Callable) this.b;
                bsd1 bsd1Var = (bsd1) this.c;
                try {
                    bsd1Var.b(callable.call());
                    return;
                } catch (MlKitException e) {
                    bsd1Var.a(e);
                    return;
                } catch (Exception e2) {
                    bsd1Var.a(new MlKitException("Internal error has occurred when executing ML Kit tasks", e2));
                    return;
                }
            case 17:
                fvo1 fvo1Var = (fvo1) this.b;
                int i5 = ((a1p1) this.c).a;
                synchronized (fvo1Var) {
                    a1p1 a1p1Var = (a1p1) fvo1Var.e.get(i5);
                    if (a1p1Var != null) {
                        fvo1Var.e.remove(i5);
                        a1p1Var.c(new zzq("Timed out waiting for response", null));
                        fvo1Var.c();
                    }
                    break;
                }
                return;
            case 18:
                try {
                    SplitCompat.zzc((SplitCompat) this.c, (HashSet) this.b);
                    return;
                } catch (Exception unused2) {
                    return;
                }
            case 19:
                sgp1 sgp1Var = (sgp1) this.b;
                jdn1 jdn1Var2 = (jdn1) this.c;
                zdp1 zdp1Var2 = sgp1Var.D;
                yz5 yz5Var2 = jdn1Var2.d;
                kkn1 kkn1Var2 = jdn1Var2.f;
                if (!o4e.c(yz5Var2, sgp1Var.B)) {
                    sgp1Var.B = yz5Var2;
                    zdp1Var2.c();
                }
                double d2 = jdn1Var2.a;
                if (Double.isNaN(d2) || Math.abs(d2 - sgp1Var.L) <= 1.0E-7d) {
                    z3 = false;
                } else {
                    sgp1Var.L = d2;
                    z3 = true;
                }
                boolean z7 = jdn1Var2.b;
                if (z7 != sgp1Var.I) {
                    sgp1Var.I = z7;
                    z3 = true;
                }
                Double.isNaN(jdn1Var2.g);
                pue0 pue0Var2 = sgp1.T;
                pue0Var2.a("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[]{Boolean.valueOf(z3), Boolean.valueOf(sgp1Var.K)});
                if (zdp1Var2 != null && (z3 || sgp1Var.K)) {
                    zdp1Var2.f();
                }
                int i6 = jdn1Var2.c;
                if (i6 != sgp1Var.N) {
                    sgp1Var.N = i6;
                    z4 = true;
                } else {
                    z4 = false;
                }
                pue0Var2.a("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[]{Boolean.valueOf(z4), Boolean.valueOf(sgp1Var.K)});
                if (zdp1Var2 != null && (z4 || sgp1Var.K)) {
                    zdp1Var2.a();
                }
                int i7 = jdn1Var2.e;
                if (i7 != sgp1Var.O) {
                    sgp1Var.O = i7;
                } else {
                    z5 = false;
                }
                pue0Var2.a("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[]{Boolean.valueOf(z5), Boolean.valueOf(sgp1Var.K)});
                if (zdp1Var2 != null && (z5 || sgp1Var.K)) {
                    zdp1Var2.e();
                }
                if (!o4e.c(sgp1Var.M, kkn1Var2)) {
                    sgp1Var.M = kkn1Var2;
                }
                sgp1Var.K = false;
                return;
            default:
                sgp1 sgp1Var2 = (sgp1) this.b;
                String str = ((fbn1) this.c).a;
                if (o4e.c(str, sgp1Var2.H)) {
                    z5 = false;
                } else {
                    sgp1Var2.H = str;
                }
                sgp1.T.a("hasChanged=%b, mFirstApplicationStatusUpdate=%b", new Object[]{Boolean.valueOf(z5), Boolean.valueOf(sgp1Var2.J)});
                zdp1 zdp1Var3 = sgp1Var2.D;
                if (zdp1Var3 != null && (z5 || sgp1Var2.J)) {
                    zdp1Var3.d();
                }
                sgp1Var2.J = false;
                return;
        }
    }

    public /* synthetic */ mqh1(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.b = obj2;
        this.c = obj;
    }

    public /* synthetic */ mqh1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ mqh1(efp1 efp1Var, sgp1 sgp1Var, u9 u9Var, byte b) {
        this.a = b;
        this.b = sgp1Var;
        this.c = u9Var;
    }
}
