package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.widget.AppCompatEditText;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class b8k1 {
    public static WeakHashMap a = null;
    public static Field b = null;
    public static boolean c = false;
    public static final int[] d = {2131427379, 2131427380, 2131427391, 2131427402, 2131427405, 2131427406, 2131427407, 2131427408, 2131427409, 2131427410, 2131427381, 2131427382, 2131427383, 2131427384, 2131427385, 2131427386, 2131427387, 2131427388, 2131427389, 2131427390, 2131427392, 2131427393, 2131427394, 2131427395, 2131427396, 2131427397, 2131427398, 2131427399, 2131427400, 2131427401, 2131427403, 2131427404};
    public static final n7k1 e = new n7k1();

    public static int a(View view, CharSequence charSequence, sh shVar) {
        int iA;
        ArrayList arrayListF = f(view);
        int i = 0;
        while (true) {
            if (i >= arrayListF.size()) {
                int i2 = -1;
                for (int i3 = 0; i3 < 32 && i2 == -1; i3++) {
                    int i4 = d[i3];
                    boolean z = true;
                    for (int i5 = 0; i5 < arrayListF.size(); i5++) {
                        z &= ((fg) arrayListF.get(i5)).a() != i4;
                    }
                    if (z) {
                        i2 = i4;
                    }
                }
                iA = i2;
                break;
            }
            if (TextUtils.equals(charSequence, ((AccessibilityNodeInfo.AccessibilityAction) ((fg) arrayListF.get(i)).a).getLabel())) {
                iA = ((fg) arrayListF.get(i)).a();
                break;
            }
            i++;
        }
        if (iA != -1) {
            fg fgVar = new fg(null, iA, charSequence, shVar, null);
            View.AccessibilityDelegate accessibilityDelegateE = e(view);
            rf rfVar = accessibilityDelegateE == null ? null : accessibilityDelegateE instanceof qf ? ((qf) accessibilityDelegateE).a : new rf(accessibilityDelegateE);
            if (rfVar == null) {
                rfVar = new rf();
            }
            p(view, rfVar);
            l(view, fgVar.a());
            f(view).add(fgVar);
            h(view, 0);
        }
        return iA;
    }

    public static void b(View view, ViewGroup viewGroup) {
        viewGroup.getOverlay().add(view);
        ((View) view.getParent()).setTag(2131431626, viewGroup);
    }

    public static oek1 c(View view) {
        WeakHashMap weakHashMap = a;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            a = weakHashMap;
        }
        oek1 oek1Var = (oek1) weakHashMap.get(view);
        if (oek1Var != null) {
            return oek1Var;
        }
        oek1 oek1Var2 = new oek1(view);
        a.put(view, oek1Var2);
        return oek1Var2;
    }

    public static hsl1 d(View view, hsl1 hsl1Var) {
        WindowInsets windowInsetsF = hsl1Var.f();
        if (windowInsetsF != null) {
            WindowInsets windowInsetsA = Build.VERSION.SDK_INT >= 30 ? x7k1.a(view, windowInsetsF) : p7k1.a(view, windowInsetsF);
            if (!windowInsetsA.equals(windowInsetsF)) {
                return hsl1.g(view, windowInsetsA);
            }
        }
        return hsl1Var;
    }

    public static View.AccessibilityDelegate e(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return w7k1.a(view);
        }
        if (c) {
            return null;
        }
        if (b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                c = true;
                return null;
            }
        }
        try {
            Object obj = b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            c = true;
            return null;
        }
    }

    public static ArrayList f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(2131431194);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(2131431194, arrayList2);
        return arrayList2;
    }

    public static String[] g(AppCompatEditText appCompatEditText) {
        return Build.VERSION.SDK_INT >= 31 ? y7k1.a(appCompatEditText) : (String[]) appCompatEditText.getTag(2131431205);
    }

    public static void h(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = ((CharSequence) new m7k1((byte) 0).d(view)) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add((CharSequence) new m7k1((byte) 0).d(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError unused) {
                        view.getParent().getClass();
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add((CharSequence) new m7k1((byte) 0).d(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static hsl1 i(View view, hsl1 hsl1Var) {
        WindowInsets windowInsetsF = hsl1Var.f();
        if (windowInsetsF != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsetsF);
            if (!windowInsetsOnApplyWindowInsets.equals(windowInsetsF)) {
                return hsl1.g(view, windowInsetsOnApplyWindowInsets);
            }
        }
        return hsl1Var;
    }

    public static ful j(AppCompatEditText appCompatEditText, ful fulVar) {
        zee1 zee1Var = appCompatEditText.d;
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(fulVar);
            appCompatEditText.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return y7k1.b(appCompatEditText, fulVar);
        }
        y7q0 y7q0Var = (y7q0) appCompatEditText.getTag(2131431204);
        if (y7q0Var == null) {
            return zee1Var.a(appCompatEditText, fulVar);
        }
        ful fulVarA = y7q0Var.a(appCompatEditText, fulVar);
        if (fulVarA == null) {
            return null;
        }
        return zee1Var.a(appCompatEditText, fulVarA);
    }

    public static void k(View view, int i) {
        l(view, i);
        h(view, 0);
    }

    public static void l(View view, int i) {
        ArrayList arrayListF = f(view);
        for (int i2 = 0; i2 < arrayListF.size(); i2++) {
            if (((fg) arrayListF.get(i2)).a() == i) {
                arrayListF.remove(i2);
                return;
            }
        }
    }

    public static void m(View view, fg fgVar, CharSequence charSequence, sh shVar) {
        rf rfVar;
        if (shVar == null && charSequence == null) {
            k(view, fgVar.a());
            return;
        }
        fg fgVar2 = new fg(null, fgVar.b, charSequence, shVar, fgVar.c);
        View.AccessibilityDelegate accessibilityDelegateE = e(view);
        if (accessibilityDelegateE == null) {
            rfVar = null;
        } else {
            rfVar = accessibilityDelegateE instanceof qf ? ((qf) accessibilityDelegateE).a : new rf(accessibilityDelegateE);
        }
        if (rfVar == null) {
            rfVar = new rf();
        }
        p(view, rfVar);
        l(view, fgVar2.a());
        f(view).add(fgVar2);
        h(view, 0);
    }

    public static View n(View view, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (View) v7k1.d(view, i);
        }
        View viewFindViewById = view.findViewById(i);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        hhg1.n("ID does not reference a View inside this View");
        return null;
    }

    public static void o(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            w7k1.b(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void p(View view, rf rfVar) {
        if (rfVar == null && (e(view) instanceof qf)) {
            rfVar = new rf();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(rfVar == null ? null : rfVar.getBridge());
    }

    public static void q(View view, boolean z) {
        new m7k1((byte) 2).e(view, Boolean.valueOf(z));
    }

    public static void r(View view, CharSequence charSequence) {
        boolean z = false;
        new m7k1((byte) 0).e(view, charSequence);
        n7k1 n7k1Var = e;
        if (charSequence == null) {
            n7k1Var.a.remove(view);
            view.removeOnAttachStateChangeListener(n7k1Var);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(n7k1Var);
            return;
        }
        WeakHashMap weakHashMap = n7k1Var.a;
        if (view.isShown() && view.getWindowVisibility() == 0) {
            z = true;
        }
        weakHashMap.put(view, Boolean.valueOf(z));
        view.addOnAttachStateChangeListener(n7k1Var);
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(n7k1Var);
        }
    }

    public static void s(View view, String[] strArr, y7q0 y7q0Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            y7k1.c(view, strArr, y7q0Var);
            return;
        }
        if (strArr.length == 0) {
            strArr = null;
        }
        boolean z = false;
        o0c.k("When the listener is set, MIME types must also be set", strArr != null);
        if (strArr != null) {
            for (String str : strArr) {
                if (str.startsWith("*")) {
                    z = true;
                    break;
                }
            }
            o0c.k("A MIME type set here must not start with *: " + Arrays.toString(strArr), !z);
        }
        view.setTag(2131431205, strArr);
        view.setTag(2131431204, y7q0Var);
    }

    public static void t(View view, CharSequence charSequence) {
        new m7k1((byte) 1).e(view, charSequence);
    }
}
