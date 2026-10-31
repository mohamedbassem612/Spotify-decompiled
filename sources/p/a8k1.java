package p;

import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class a8k1 {
    public static final ArrayList d = new ArrayList();
    public WeakHashMap a;
    public SparseArray b;
    public WeakReference c;

    public static a8k1 a(View view) {
        a8k1 a8k1Var = (a8k1) view.getTag(2131431211);
        if (a8k1Var != null) {
            return a8k1Var;
        }
        a8k1 a8k1Var2 = new a8k1();
        a8k1Var2.a = null;
        a8k1Var2.b = null;
        a8k1Var2.c = null;
        view.setTag(2131431211, a8k1Var2);
        return a8k1Var2;
    }

    public final boolean b(View view, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = this.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = d;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    try {
                        if (this.a == null) {
                            this.a = new WeakHashMap();
                        }
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ArrayList arrayList2 = d;
                            View view2 = (View) ((WeakReference) arrayList2.get(size)).get();
                            if (view2 == null) {
                                arrayList2.remove(size);
                            } else {
                                this.a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    this.a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        View viewC = c(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewC != null && !KeyEvent.isModifierKey(keyCode)) {
                SparseArray sparseArray = this.b;
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    this.b = sparseArray;
                }
                sparseArray.put(keyCode, new WeakReference(viewC));
            }
        }
        return viewC != null;
    }

    public final View c(View view) {
        int size;
        WeakHashMap weakHashMap = this.a;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View viewC = c(viewGroup.getChildAt(childCount));
                    if (viewC != null) {
                        return viewC;
                    }
                }
            }
            ArrayList arrayList = (ArrayList) view.getTag(2131431212);
            if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                arrayList.get(size).getClass();
                bhn0.d();
            }
        }
        return null;
    }
}
