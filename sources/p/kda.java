package p;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class kda {
    public final ViewGroup a;
    public final Context b;
    public final jda c;
    public final SnackbarContentLayout d;
    public int e;
    public final Rect g;
    public int h;
    public int i;
    public int j;
    public int k;
    public ArrayList l;
    public br91 m;
    public final AccessibilityManager n;
    public static final int[] q = {2130970260};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Handler f19p = new Handler(Looper.getMainLooper(), new cda());
    public final dda f = new dda(this, 0);
    public final eda o = new eda(this);

    public kda(Context context, ViewGroup viewGroup, View view, SnackbarContentLayout snackbarContentLayout) {
        if (view == null) {
            hhg1.n("Transient bottom bar must have non-null content");
            throw null;
        }
        if (snackbarContentLayout == null) {
            hhg1.n("Transient bottom bar must have non-null callback");
            throw null;
        }
        this.a = viewGroup;
        this.d = snackbarContentLayout;
        this.b = context;
        blo1.o(context, blo1.a, "Theme.AppCompat");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(q);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        jda jdaVar = (jda) layoutInflaterFrom.inflate(resourceId != -1 ? 2131625271 : 2131624530, viewGroup, false);
        this.c = jdaVar;
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout2 = (SnackbarContentLayout) view;
            float actionTextColorAlpha = jdaVar.getActionTextColorAlpha();
            if (actionTextColorAlpha != 1.0f) {
                snackbarContentLayout2.b.setTextColor(ago1.s(xfo1.r(snackbarContentLayout2, 2130969040), snackbarContentLayout2.b.getCurrentTextColor(), actionTextColorAlpha));
            }
            snackbarContentLayout2.setMaxInlineActionWidth(jdaVar.getMaxInlineActionWidth());
        }
        jdaVar.addView(view);
        ViewGroup.LayoutParams layoutParams = jdaVar.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.g = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
        WeakHashMap weakHashMap = b8k1.a;
        jdaVar.setAccessibilityLiveRegion(1);
        jdaVar.setImportantForAccessibility(1);
        jdaVar.setFitsSystemWindows(true);
        r7k1.c(jdaVar, new fp8(this, (byte) 4));
        b8k1.p(jdaVar, new xf(this, (byte) 1));
        this.n = (AccessibilityManager) context.getSystemService("accessibility");
    }

    public final void a(gda gdaVar) {
        ArrayList arrayList = this.l;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.l = arrayList;
        }
        arrayList.add(gdaVar);
    }

    public final void b(int i) {
        ua91 ua91VarF = ua91.F();
        eda edaVar = this.o;
        synchronized (ua91VarF.b) {
            try {
                if (ua91VarF.L(edaVar)) {
                    ua91VarF.w((et91) ua91VarF.d, i);
                } else {
                    et91 et91Var = (et91) ua91VarF.e;
                    if (et91Var != null && et91Var.a.get() == edaVar) {
                        ua91VarF.w((et91) ua91VarF.e, i);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(int i) {
        ua91 ua91VarF = ua91.F();
        eda edaVar = this.o;
        synchronized (ua91VarF.b) {
            try {
                if (ua91VarF.L(edaVar)) {
                    ua91VarF.d = null;
                    if (((et91) ua91VarF.e) != null) {
                        ua91VarF.U();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayList = this.l;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((gda) this.l.get(size)).a(this, i);
            }
        }
        ViewParent parent = this.c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.c);
        }
    }

    public final void d() {
        ua91 ua91VarF = ua91.F();
        eda edaVar = this.o;
        synchronized (ua91VarF.b) {
            try {
                if (ua91VarF.L(edaVar)) {
                    ua91VarF.S((et91) ua91VarF.d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayList = this.l;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((gda) this.l.get(size)).b(this);
            }
        }
    }

    public final void e() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        byte b = 1;
        AccessibilityManager accessibilityManager = this.n;
        boolean z = accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty());
        jda jdaVar = this.c;
        if (z) {
            jdaVar.post(new dda(this, b));
            return;
        }
        if (jdaVar.getParent() != null) {
            jdaVar.setVisibility(0);
        }
        d();
    }

    public final void f() {
        Rect rect;
        jda jdaVar = this.c;
        ViewGroup.LayoutParams layoutParams = jdaVar.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (rect = this.g) == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = rect.bottom + this.h;
        marginLayoutParams.leftMargin = rect.left + this.i;
        marginLayoutParams.rightMargin = rect.right + this.j;
        jdaVar.requestLayout();
        if (Build.VERSION.SDK_INT < 29 || this.k <= 0) {
            return;
        }
        h3n layoutParams2 = jdaVar.getLayoutParams();
        if ((layoutParams2 instanceof h3n) && (layoutParams2.a instanceof SwipeDismissBehavior)) {
            dda ddaVar = this.f;
            jdaVar.removeCallbacks(ddaVar);
            jdaVar.post(ddaVar);
        }
    }
}
