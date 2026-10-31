package p;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class koj0 implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public static final HashMap e = new HashMap();
    public final WeakReference c;
    public final LinkedHashSet a = new LinkedHashSet();
    public final Handler b = new Handler(Looper.getMainLooper());
    public final AtomicBoolean d = new AtomicBoolean(false);

    public koj0(Activity activity) {
        this.c = new WeakReference(activity);
    }

    /* JADX INFO: Removed unreachable split cross block B:23:0x0034 */
    public final void a(View view) {
        Set set = dhn.a;
        if (set.contains(this)) {
            return;
        }
        try {
            zyh0 zyh0Var = new zyh0((Object) view, (Object) this, (byte) 8);
            if (!set.contains(this)) {
                try {
                    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        zyh0Var.run();
                    } else {
                        this.b.post(zyh0Var);
                    }
                } catch (Throwable th) {
                    dhn.a(this, th);
                }
            }
        } catch (Throwable th2) {
            dhn.a(this, th2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6 A[SYNTHETIC] */
    public final void b(View view) {
        String str;
        String str2;
        boolean zMatches;
        LinkedHashSet linkedHashSet = this.a;
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            String lowerCase = ihc1.e1(((EditText) view).getText().toString()).toString().toLowerCase();
            if (lowerCase.length() != 0 && !linkedHashSet.contains(lowerCase) && lowerCase.length() <= 100) {
                linkedHashSet.add(lowerCase);
                HashMap map = new HashMap();
                ArrayList arrayListC = olj0.c(view);
                CopyOnWriteArraySet copyOnWriteArraySet = tmj0.d;
                ArrayList arrayListB = null;
                for (tmj0 tmj0Var : czo1.h()) {
                    String strReplaceAll = "r2".equals(tmj0Var.c()) ? Pattern.compile("[^\\d.]").matcher(lowerCase).replaceAll("") : lowerCase;
                    if (dhn.a.contains(tmj0Var)) {
                        str = null;
                    } else {
                        try {
                            str = tmj0Var.b;
                        } catch (Throwable th) {
                            dhn.a(tmj0Var, th);
                            str = null;
                        }
                    }
                    if (str.length() > 0) {
                        if (dhn.a.contains(tmj0Var)) {
                            str2 = null;
                            zMatches = false;
                            if (!dhn.a.contains(olj0.class)) {
                                try {
                                    zMatches = Pattern.compile(str2).matcher(strReplaceAll).matches();
                                } catch (Throwable th2) {
                                    dhn.a(olj0.class, th2);
                                }
                            }
                            if (!zMatches) {
                            }
                        } else {
                            try {
                                str2 = tmj0Var.b;
                            } catch (Throwable th3) {
                                dhn.a(tmj0Var, th3);
                                str2 = null;
                            }
                            zMatches = false;
                            if (!dhn.a.contains(olj0.class)) {
                                zMatches = Pattern.compile(str2).matcher(strReplaceAll).matches();
                            }
                            if (!zMatches) {
                            }
                        }
                    }
                    if (olj0.e(arrayListC, tmj0Var.b())) {
                        d0p1.g0(map, tmj0Var.c(), strReplaceAll);
                    } else {
                        if (arrayListB == null) {
                            arrayListB = olj0.b(view);
                        }
                        if (olj0.e(arrayListB, tmj0Var.b())) {
                            d0p1.g0(map, tmj0Var.c(), strReplaceAll);
                        }
                    }
                }
                mod.s(map);
            }
        } catch (Throwable th4) {
            dhn.a(this, th4);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (dhn.a.contains(this)) {
            return;
        }
        if (view != null) {
            try {
                a(view);
            } catch (Throwable th) {
                dhn.a(this, th);
                return;
            }
        }
        if (view2 != null) {
            a(view2);
        }
    }
}
