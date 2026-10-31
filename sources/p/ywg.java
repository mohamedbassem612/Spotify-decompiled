package p;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ywg implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {
    public final WeakReference a;
    public ArrayList b;
    public final HashSet c;
    public final String d;

    public ywg(View view, Handler handler, HashSet hashSet, String str) {
        this.a = new WeakReference(view);
        this.c = hashSet;
        this.d = str;
        handler.postDelayed(this, 200L);
    }

    public final void a(xwg xwgVar, View view, p700 p700Var) {
        View viewA = xwgVar.a();
        if (viewA == null) {
            return;
        }
        String str = xwgVar.b;
        View.OnClickListener onClickListenerF = ibk1.f(viewA);
        boolean z = (onClickListenerF instanceof swg) && ((swg) onClickListenerF).e;
        HashSet hashSet = this.c;
        if (hashSet.contains(str) || z) {
            return;
        }
        swg swgVar = null;
        if (!dhn.a.contains(uwg.class)) {
            try {
                swg swgVar2 = new swg();
                swgVar2.a = p700Var;
                swgVar2.b = new WeakReference(viewA);
                swgVar2.c = new WeakReference(view);
                swgVar2.d = ibk1.f(viewA);
                swgVar2.e = true;
                swgVar = swgVar2;
            } catch (Throwable th) {
                dhn.a(uwg.class, th);
            }
        }
        viewA.setOnClickListener(swgVar);
        hashSet.add(str);
    }

    public final void b(xwg xwgVar, View view, p700 p700Var) {
        AdapterView adapterView = (AdapterView) xwgVar.a();
        if (adapterView == null) {
            return;
        }
        String str = xwgVar.b;
        AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
        boolean z = (onItemClickListener instanceof twg) && ((twg) onItemClickListener).e;
        HashSet hashSet = this.c;
        if (hashSet.contains(str) || z) {
            return;
        }
        twg twgVar = null;
        if (!dhn.a.contains(uwg.class)) {
            try {
                twg twgVar2 = new twg();
                twgVar2.a = p700Var;
                twgVar2.b = new WeakReference(adapterView);
                twgVar2.c = new WeakReference(view);
                twgVar2.d = adapterView.getOnItemClickListener();
                twgVar2.e = true;
                twgVar = twgVar2;
            } catch (Throwable th) {
                dhn.a(uwg.class, th);
            }
        }
        adapterView.setOnItemClickListener(twgVar);
        hashSet.add(str);
    }

    public final void c() {
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            WeakReference weakReference = this.a;
            if (weakReference.get() != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    p700 p700Var = (p700) arrayList.get(i);
                    View view = (View) weakReference.get();
                    if (p700Var != null) {
                        String str = p700Var.d;
                        if (view != null) {
                            int length = str.length();
                            String str2 = this.d;
                            if (length == 0 || str.equals(str2)) {
                                List listUnmodifiableList = Collections.unmodifiableList(p700Var.b);
                                if (listUnmodifiableList.size() <= 25) {
                                    for (xwg xwgVar : o2p1.h(view, listUnmodifiableList, 0, -1, str2)) {
                                        try {
                                            View viewA = xwgVar.a();
                                            if (viewA != null) {
                                                View viewA2 = ibk1.a(viewA);
                                                if (viewA2 != null && ibk1.a.l(viewA, viewA2)) {
                                                    HashSet hashSet = this.c;
                                                    View viewA3 = xwgVar.a();
                                                    if (viewA3 != null) {
                                                        String str3 = xwgVar.b;
                                                        boolean z = ibk1.g(viewA3) instanceof ooz0;
                                                        if (!hashSet.contains(str3) && !z) {
                                                            ooz0 ooz0Var = null;
                                                            if (!dhn.a.contains(poz0.class)) {
                                                                try {
                                                                    ooz0Var = new ooz0(p700Var, view, viewA3);
                                                                } catch (Throwable th) {
                                                                    dhn.a(poz0.class, th);
                                                                }
                                                            }
                                                            viewA3.setOnTouchListener(ooz0Var);
                                                            hashSet.add(str3);
                                                        }
                                                    }
                                                } else if (!nhc1.Y(viewA.getClass().getName(), "com.facebook.react", false)) {
                                                    if (!(viewA instanceof AdapterView)) {
                                                        a(xwgVar, view, p700Var);
                                                    } else if (viewA instanceof ListView) {
                                                        b(xwgVar, view, p700Var);
                                                    }
                                                }
                                            }
                                        } catch (Exception unused) {
                                            dhn.a.contains(zwg.class);
                                            wf10 wf10Var = wf10.a;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        c();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        c();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            c120 c120VarB = g120.b(wf10.b());
            if (c120VarB != null && c120VarB.g) {
                JSONArray jSONArray = c120VarB.h;
                ArrayList arrayList = new ArrayList();
                if (jSONArray != null) {
                    try {
                        int length = jSONArray.length();
                        for (int i = 0; i < length; i++) {
                            arrayList.add(i1o1.q(jSONArray.getJSONObject(i)));
                        }
                    } catch (IllegalArgumentException | JSONException unused) {
                    }
                }
                this.b = arrayList;
                View view = (View) this.a.get();
                if (view == null) {
                    return;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnGlobalLayoutListener(this);
                    viewTreeObserver.addOnScrollChangedListener(this);
                }
                c();
            }
        } catch (Throwable th) {
            dhn.a(this, th);
        }
    }
}
