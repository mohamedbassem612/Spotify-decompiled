package p;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.media3.transformer.ExportException;
import com.facebook.shimmer.ShimmerFrameLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class v241 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v241(vv81 vv81Var) {
        this.a = (byte) 6;
        f280 f280Var = f280.b;
        this.b = vv81Var;
    }

    private final void a() {
        kgg1 kgg1Var = (kgg1) ((ifb1) this.b).b;
        long j = kgg1Var.f;
        LinkedHashMap linkedHashMap = x8r.a;
        synchronized (x8r.class) {
        }
        Locale locale = Locale.US;
        ExportException exportException = new ExportException("Muxer error", new IllegalStateException(gvg.f(j, "Abort: no output sample written in the last ", " milliseconds. DebugTrace: \"Tracing disabled\"")), 7002, 0);
        myr myrVar = kgg1Var.q;
        if (myrVar == null) {
            kgg1Var.o.c(new bt00().a(), exportException);
            return;
        }
        pgg1 pgg1Var = myrVar.r;
        pgg1Var.getClass();
        pgg1Var.c(exportException);
    }

    @Override // java.lang.Runnable
    public final void run() {
        View viewFindFocus;
        boolean z = true;
        Boolean bool = null;
        Map mapUnmodifiableMap = null;
        String str = null;
        int i = 0;
        switch (this.a) {
            case 0:
                nt21 nt21Var = (nt21) this.b;
                ((erw0) nt21Var.b).f();
                ((ExecutorService) nt21Var.c).execute(new k((byte) 14));
                return;
            case 1:
                q561 q561Var = (q561) this.b;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(16, 16, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.eraseColor(-16777216);
                q561Var.i(bitmapCreateBitmap);
                return;
            case 2:
                ((o561) this.b).a();
                return;
            case 3:
                p561 p561Var = (p561) this.b;
                try {
                    if (p561Var.d.v) {
                        return;
                    }
                    p561Var.d.h();
                    p561Var.c += p561Var.d.x;
                    p561Var.d.n.release();
                    q561 q561Var2 = p561Var.d;
                    q561Var2.l = false;
                    int i2 = q561Var2.m + 1;
                    q561Var2.m = i2;
                    bg11 bg11Var = q561Var2.a;
                    if (i2 == bg11Var.d) {
                        q561Var2.m = 0;
                        q561Var2.r++;
                    } else {
                        i = i2;
                    }
                    e4w e4wVar = (e4w) bg11Var.get(i);
                    q561 q561Var3 = p561Var.d;
                    nt21 nt21Var2 = q561Var3.c;
                    Looper looperMyLooper = Looper.myLooper();
                    looperMyLooper.getClass();
                    q561 q561Var4 = p561Var.d;
                    q561Var3.n = nt21Var2.e(e4wVar, looperMyLooper, q561Var4, q561Var4.d);
                    p561Var.d.n.start();
                    return;
                } catch (RuntimeException e) {
                    p561Var.d.b(ExportException.a(1000, e));
                    return;
                }
            case 4:
                ((xen0) this.b).e();
                return;
            case 5:
                r961 r961Var = (r961) this.b;
                synchronized (((ArrayDeque) r961Var.c)) {
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) r961Var.b).edit();
                    StringBuilder sb = new StringBuilder();
                    Iterator it = ((ArrayDeque) r961Var.c).iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                        sb.append(",");
                    }
                    editorEdit.putString("topic_operation_queue", sb.toString()).commit();
                    break;
                }
                return;
            case 6:
                vv81 vv81Var = (vv81) this.b;
                f280 f280Var = f280.b;
                String str2 = zoi1.a;
                Set set = vv81Var.e;
                set.remove(f280Var);
                if (set.isEmpty()) {
                    vv81Var.u1(((x5b1) vv81Var).l, false, false);
                    return;
                }
                return;
            case 7:
                w360 w360Var = (w360) this.b;
                ((ez81) w360Var.b).d.d(w360Var.a);
                return;
            case 8:
                ShimmerFrameLayout shimmerFrameLayout = ((h491) this.b).b;
                if (shimmerFrameLayout == null || !shimmerFrameLayout.c) {
                    return;
                }
                shimmerFrameLayout.e();
                shimmerFrameLayout.c = false;
                shimmerFrameLayout.invalidate();
                return;
            case 9:
                View view = (View) this.b;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            case 10:
                kxa1 kxa1Var = (kxa1) this.b;
                int i3 = kxa1.O0;
                Surface surface = kxa1Var.h;
                if (surface != null) {
                    Iterator it2 = kxa1Var.a.iterator();
                    while (it2.hasNext()) {
                        ((so00) it2.next()).a.D1(null);
                    }
                }
                SurfaceTexture surfaceTexture = kxa1Var.g;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                kxa1Var.g = null;
                kxa1Var.h = null;
                return;
            case 11:
                jev jevVar = (jev) ((lvc1) this.b).d;
                if (jevVar != null) {
                    Iterator it3 = jevVar.values().iterator();
                    while (it3.hasNext()) {
                        ((n3d1) it3.next()).b();
                    }
                    return;
                }
                return;
            case 12:
                ((k65) this.b).a();
                return;
            case 13:
                ndd1 ndd1Var = ((pdd1) this.b).a;
                ViewParent parent = ndd1Var.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(ndd1Var);
                    return;
                }
                return;
            case 14:
                ((hpd1) this.b).c();
                return;
            case 15:
                b9e1 b9e1Var = (b9e1) this.b;
                st60 st60Var = b9e1Var.b;
                b9e1Var.n = null;
                bfn0 bfn0Var = b9e1Var.m;
                View view2 = b9e1Var.a;
                if (!view2.isFocused() && (viewFindFocus = view2.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                    bfn0Var.g();
                    return;
                }
                Object[] objArr = bfn0Var.a;
                int i4 = bfn0Var.c;
                Boolean boolValueOf = null;
                for (int i5 = 0; i5 < i4; i5++) {
                    a9e1 a9e1Var = (a9e1) objArr[i5];
                    int iOrdinal = a9e1Var.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            bool = Boolean.FALSE;
                        } else if (iOrdinal != 2 && iOrdinal != 3) {
                            eg.o();
                            return;
                        } else if (!u890.j(bool, Boolean.FALSE)) {
                            boolValueOf = Boolean.valueOf(a9e1Var == a9e1.c);
                        }
                    } else {
                        bool = Boolean.TRUE;
                    }
                    boolValueOf = bool;
                }
                bfn0Var.g();
                if (u890.j(bool, Boolean.TRUE)) {
                    st60Var.E();
                }
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        ((up41) st60Var.c).s();
                    } else {
                        ((up41) st60Var.c).l();
                    }
                }
                if (u890.j(bool, Boolean.FALSE)) {
                    st60Var.E();
                    return;
                }
                return;
            case 16:
                ((HandlerThread) this.b).quitSafely();
                return;
            case 17:
                mxa1 mxa1Var = (mxa1) this.b;
                synchronized (((AtomicMarkableReference) mxa1Var.h)) {
                    try {
                        if (((AtomicMarkableReference) mxa1Var.h).isMarked()) {
                            str = (String) ((AtomicMarkableReference) mxa1Var.h).getReference();
                            ((AtomicMarkableReference) mxa1Var.h).set(str, false);
                        } else {
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (z) {
                    ((dij0) mxa1Var.b).i((String) mxa1Var.c, str);
                    return;
                }
                return;
            case 18:
                wh41 wh41Var = (wh41) this.b;
                ((AtomicReference) wh41Var.d).set(null);
                synchronized (wh41Var) {
                    if (((AtomicMarkableReference) wh41Var.c).isMarked()) {
                        ava0 ava0Var = (ava0) ((AtomicMarkableReference) wh41Var.c).getReference();
                        synchronized (ava0Var) {
                            mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(ava0Var.a));
                        }
                        AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) wh41Var.c;
                        atomicMarkableReference.set((ava0) atomicMarkableReference.getReference(), false);
                    }
                }
                if (mapUnmodifiableMap != null) {
                    mxa1 mxa1Var2 = (mxa1) wh41Var.e;
                    ((dij0) mxa1Var2.b).h((String) mxa1Var2.c, mapUnmodifiableMap, wh41Var.b);
                    return;
                }
                return;
            case 19:
                tck1 tck1Var = (tck1) this.b;
                if (dhn.a.contains(tck1.class)) {
                    return;
                }
                try {
                    WeakReference weakReference = tck1Var.a;
                    View viewK = jm5.k((Activity) weakReference.get());
                    Activity activity = (Activity) weakReference.get();
                    if (viewK != null && activity != null) {
                        for (View view3 : dtc1.a(viewK)) {
                            if (!j561.c(view3)) {
                                String strD = dtc1.d(view3);
                                if (strD.length() > 0 && strD.length() <= 300) {
                                    HashSet hashSet = yck1.e;
                                    s9p1.B(view3, viewK, activity.getLocalClassName());
                                }
                            }
                        }
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                } catch (Throwable th2) {
                    dhn.a(tck1.class, th2);
                    return;
                }
            case 20:
                a();
                return;
            case 21:
                jvl1 jvl1Var = (jvl1) this.b;
                jvl1Var.a.getAction();
                jvl1Var.b.d((Object) null);
                return;
            default:
                cik1 cik1Var = (cik1) this.b;
                ((c441) cik1Var.e).g(new iyh1(cik1Var, (byte) 18));
                return;
        }
    }

    public /* synthetic */ v241(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
