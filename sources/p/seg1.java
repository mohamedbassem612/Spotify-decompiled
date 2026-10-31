package p;

import android.animation.ValueAnimator;
import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.compose.ui.platform.ComposeView;
import androidx.viewpager.widget.ViewPager;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.play.core.splitcompat.SplitCompat;
import com.spotify.adsdisplay.uiusecases.videocontrolsoverlay.VideoControlsOverlayView;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class seg1 implements Runnable {
    public final /* synthetic */ byte a;
    public Object b;

    @Override // java.lang.Runnable
    public final void run() {
        gyn1 gyn1Var;
        avn1 avn1Var;
        boolean zIsEmpty;
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        switch (this.a) {
            case 0:
                ShimmerFrameLayout shimmerFrameLayout = ((teg1) this.b).d;
                if (shimmerFrameLayout.c) {
                    shimmerFrameLayout.e();
                    shimmerFrameLayout.c = false;
                    shimmerFrameLayout.invalidate();
                    return;
                }
                return;
            case 1:
                ((kt91) ((dlg1) this.b).a).b();
                return;
            case 2:
                EditText editText = (EditText) this.b;
                ((InputMethodManager) editText.getContext().getSystemService("input_method")).showSoftInput(editText, 1);
                return;
            case 3:
                VideoControlsOverlayView videoControlsOverlayView = (VideoControlsOverlayView) this.b;
                int i = VideoControlsOverlayView.h;
                videoControlsOverlayView.a();
                return;
            case 4:
                ((ValueAnimator) this.b).start();
                return;
            case 5:
                ((k8k1) this.b).o(0);
                return;
            case 6:
                ((zck1) this.b).w();
                return;
            case 7:
                ((ViewPager) this.b).setScrollState(0);
                return;
            case 8:
                uhk1 uhk1Var = (uhk1) this.b;
                uhk1Var.a = false;
                if (((ComposeView) uhk1Var.b).getParent() != null) {
                    uhk1Var.e();
                    return;
                }
                return;
            case 9:
                vik1 vik1Var = (vik1) this.b;
                vik1Var.o = false;
                if (vik1Var.c == null || u890.j(vik1Var.v, Boolean.FALSE)) {
                    return;
                }
                vik1Var.n = vik1Var.b.c();
                vik1Var.c();
                return;
            case 10:
                okk1 okk1Var = (okk1) this.b;
                tr80 tr80Var = okk1Var.e;
                okk1Var.e = null;
                if (tr80Var == null) {
                    okk1Var.f = false;
                    return;
                } else {
                    okk1Var.c.invoke(tr80Var);
                    okk1.h.postDelayed(this, okk1Var.b);
                    return;
                }
            case 11:
                ijl1 ijl1Var = (ijl1) this.b;
                mma0[] mma0VarArr = ijl1.U1;
                if (ijl1Var.a1() == fjl1.b) {
                    ijl1Var.S1.onNext(Boolean.FALSE);
                    ijl1Var.k1();
                    ijl1Var.Y0(fjl1.c);
                    return;
                }
                return;
            case 12:
                ((h8n1) this.b).a();
                return;
            case 13:
                xaa xaaVar = ((h8n1) ((dmj1) this.b).b).l;
                xaaVar.d(xaaVar.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 14:
                ((s8n1) this.b).r.I(new lal(4, (PendingIntent) null, (String) null));
                return;
            case 15:
                mon1 mon1Var = (mon1) this.b;
                synchronized (mon1.i) {
                    try {
                        if (mon1Var.b()) {
                            mon1Var.f(15);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 16:
                try {
                    ((gsa) ((bym1) this.b).c).H.b();
                    return;
                } catch (Throwable unused) {
                    vsn1.i("BillingClient");
                    return;
                }
            case 17:
                esn1 esn1Var = (esn1) this.b;
                gsa gsaVar = esn1Var.e;
                gsaVar.K(0);
                iua iuaVar = iyn1.i;
                gsaVar.J(24, esn1Var.d, iuaVar);
                esn1Var.d(iuaVar);
                return;
            case 18:
                ytn1 ytn1Var = (ytn1) this.b;
                pue0 pue0Var = ytn1.g;
                pue0Var.c("transfer with type = %d has timed out", new Object[]{0});
                pue0Var.a("notify failed transfer with type = %d, reason = %d", new Object[]{0, 101});
                for (hvo1 hvo1Var : new HashSet(ytn1Var.b)) {
                    switch (hvo1Var.a) {
                        case 0:
                            pue0 pue0Var2 = txo1.i;
                            txo1.i.a("onTransferFailed with type = %d and reason = %d", new Object[]{0, 101});
                            txo1 txo1Var = (txo1) hvo1Var.b;
                            txo1Var.o();
                            c1p1 c1p1Var = txo1Var.c;
                            qzo1 qzo1Var = txo1Var.g;
                            emo1 emo1Var = txo1Var.a;
                            q4p1 q4p1VarF = c1p1Var.f(qzo1Var);
                            s3p1 s3p1VarN = v3p1.n(q4p1VarF.d());
                            s3p1VarN.a();
                            ((yhp1) s3p1VarN).b.w();
                            s3p1VarN.a();
                            ((yhp1) s3p1VarN).b.x();
                            q4p1VarF.e(s3p1VarN.b());
                            emo1Var.a(q4p1VarF.b(), 232);
                            break;
                        default:
                            ftn1 ftn1Var = new ftn1(11);
                            ftn1Var.b = 101;
                            e821 e821Var = (e821) hvo1Var.b;
                            ftn1Var.c = Boolean.valueOf(((son1) e821Var.a).m == 2);
                            e821Var.z(new dwn1(ftn1Var));
                            break;
                    }
                }
                ytn1Var.a();
                return;
            case 19:
                yyn1 yyn1Var = (yyn1) this.b;
                if (yyn1Var == null || (gyn1Var = yyn1Var.h) == null) {
                    return;
                }
                this.b = null;
                if (gyn1Var.isDone()) {
                    Object obj = ((nvn1) yyn1Var).a;
                    if (obj == null) {
                        if (gyn1Var.isDone()) {
                            if (nvn1.g.V(yyn1Var, (Object) null, yyn1.h(gyn1Var))) {
                                yyn1.j(yyn1Var);
                                return;
                            }
                            return;
                        }
                        yun1 yun1Var = new yun1(yyn1Var, gyn1Var);
                        if (nvn1.g.V(yyn1Var, (Object) null, yun1Var)) {
                            try {
                                gyn1Var.c(yun1Var, hwn1.a);
                                return;
                            } catch (Throwable th2) {
                                try {
                                    avn1Var = new avn1(th2);
                                    break;
                                } catch (Error | Exception unused2) {
                                    avn1Var = avn1.b;
                                }
                                nvn1.g.V(yyn1Var, yun1Var, avn1Var);
                                return;
                            }
                        }
                        obj = ((nvn1) yyn1Var).a;
                    }
                    if (obj instanceof xun1) {
                        gyn1Var.cancel(((xun1) obj).a);
                        return;
                    }
                    return;
                }
                try {
                    ScheduledFuture scheduledFuture = yyn1Var.i;
                    yyn1Var.i = null;
                    String str = "Timed out";
                    if (scheduledFuture != null) {
                        try {
                            long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                            if (jAbs > 10) {
                                str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                            }
                        } catch (Throwable th3) {
                            if (nvn1.g.V(yyn1Var, (Object) null, new avn1(new syn1(str)))) {
                                yyn1.j(yyn1Var);
                            }
                            throw th3;
                        }
                    }
                    if (nvn1.g.V(yyn1Var, (Object) null, new avn1(new syn1(str + ": " + gyn1Var.toString())))) {
                        yyn1.j(yyn1Var);
                    }
                    gyn1Var.cancel(true);
                    return;
                } catch (Throwable th4) {
                    gyn1Var.cancel(true);
                    throw th4;
                }
            case 20:
                j4o1 j4o1Var = (j4o1) this.b;
                synchronized (j4o1Var.h) {
                    zIsEmpty = j4o1Var.e.isEmpty();
                    break;
                }
                if (zIsEmpty || j4o1Var.i || (connectivityManager = j4o1Var.c) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                    throw null;
                }
                activeNetworkInfo.isConnected();
                throw null;
            case 21:
                synchronized (((afo1) this.b).c) {
                    ((z1q0) ((afo1) this.b).d).c();
                    break;
                }
                return;
            case 22:
                txo1 txo1Var2 = (txo1) this.b;
                qzo1 qzo1Var2 = txo1Var2.g;
                if (qzo1Var2 != null) {
                    txo1Var2.a.a(txo1Var2.c.a(qzo1Var2), 223);
                }
                txo1Var2.e.postDelayed(txo1Var2.d, 300000L);
                return;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                Context context = (Context) this.b;
                int i2 = SplitCompat.zza;
                try {
                    com.google.android.play.core.splitinstall.zzx.zzg(context).zzc(true);
                    return;
                } catch (SecurityException unused3) {
                    return;
                }
            case 24:
                try {
                    SplitCompat.zza((SplitCompat) this.b).b();
                    return;
                } catch (Exception unused4) {
                    return;
                }
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                ((a8p1) this.b).k(false);
                return;
            default:
                q5p1 q5p1Var = (q5p1) this.b;
                SharedPreferences sharedPreferences = q5p1Var.b;
                HashSet hashSet = q5p1Var.f;
                if (hashSet.isEmpty()) {
                    return;
                }
                HashSet hashSet2 = q5p1Var.g;
                long j = true != hashSet2.equals(hashSet) ? 86400000L : 172800000L;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j2 = q5p1Var.h;
                if (j2 == 0 || jCurrentTimeMillis - j2 >= j) {
                    q5p1.i.a("Upload the feature usage report.", new Object[0]);
                    h3p1 h3p1VarM = k3p1.m();
                    h3p1VarM.e(q5p1.j);
                    h3p1VarM.d(q5p1Var.c);
                    k3p1 k3p1VarB = h3p1VarM.b();
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(hashSet);
                    q2p1 q2p1VarM = s2p1.m();
                    q2p1VarM.a();
                    ((yhp1) q2p1VarM).b.o(arrayList);
                    q2p1VarM.a();
                    ((yhp1) q2p1VarM).b.n(k3p1VarB);
                    s2p1 s2p1VarB = q2p1VarM.b();
                    q4p1 q4p1VarN = t4p1.n();
                    q4p1VarN.a();
                    ((yhp1) q4p1VarN).b.z(s2p1VarB);
                    q5p1Var.a.a(q4p1VarN.b(), 243);
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    if (!hashSet2.equals(hashSet)) {
                        hashSet2.clear();
                        hashSet2.addAll(hashSet);
                        Iterator it = hashSet2.iterator();
                        while (it.hasNext()) {
                            String string = Integer.toString(((y1p1) it.next()).a);
                            String strM = l1d.m("feature_usage_timestamp_reported_feature_", string);
                            if (!sharedPreferences.contains(strM)) {
                                strM = l1d.m("feature_usage_timestamp_detected_feature_", string);
                            }
                            String strM2 = l1d.m("feature_usage_timestamp_reported_feature_", string);
                            if (!TextUtils.equals(strM, strM2)) {
                                long j3 = sharedPreferences.getLong(strM, 0L);
                                editorEdit.remove(strM);
                                if (j3 != 0) {
                                    editorEdit.putLong(strM2, j3);
                                }
                            }
                        }
                    }
                    q5p1Var.h = jCurrentTimeMillis;
                    editorEdit.putLong("feature_usage_last_report_time", jCurrentTimeMillis).apply();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ seg1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
