package androidx.core.view.insets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import app.p000rive.runtime.kotlin.R;
import java.util.ArrayList;
import java.util.List;
import p.eg;
import p.f4i1;
import p.hhg1;
import p.nk80;
import p.pdd1;
import p.v241;
import p.wey0;
import p.xey0;
import p.xmu0;
import p.y9h;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class ProtectionLayout extends FrameLayout {
    public static final Object c = new Object();
    public final ArrayList a;
    public xey0 b;

    public ProtectionLayout(Context context, List<y9h> list) {
        super(context);
        this.a = new ArrayList();
        setProtections(list);
    }

    private pdd1 getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof pdd1) {
            return (pdd1) tag;
        }
        pdd1 pdd1Var = new pdd1(viewGroup);
        viewGroup.setTag(R.id.tag_system_bar_state_monitor, pdd1Var);
        return pdd1Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x009f  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b3 A[LOOP:0: B:7:0x0028->B:27:0x00b3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x00bc A[SYNTHETIC] */
    public final void a() {
        int i;
        int i2;
        int i3;
        FrameLayout.LayoutParams layoutParams;
        View view;
        xmu0 xmu0Var;
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            b();
            return;
        }
        pdd1 orInstallSystemBarStateMonitor = getOrInstallSystemBarStateMonitor();
        b();
        this.b = new xey0(orInstallSystemBarStateMonitor, arrayList);
        int childCount = getChildCount();
        int size = this.b.a.size();
        for (int i4 = 0; i4 < size; i4++) {
            y9h y9hVar = (y9h) this.b.a.get(i4);
            Context context = getContext();
            int i5 = i4 + childCount;
            wey0 wey0Var = y9hVar.b;
            byte b = y9hVar.a;
            int i6 = -1;
            if (b != 1) {
                if (b == 2) {
                    i3 = wey0Var.b;
                    i2 = 48;
                } else if (b == 4) {
                    i = wey0Var.a;
                    i2 = 5;
                } else if (b != 8) {
                    hhg1.n(f4i1.c(b, "Unexpected side: "));
                    return;
                } else {
                    i3 = wey0Var.b;
                    i2 = 80;
                }
                layoutParams = new FrameLayout.LayoutParams(i6, i3, i2);
                nk80 nk80Var = wey0Var.c;
                layoutParams.leftMargin = nk80Var.a;
                layoutParams.topMargin = nk80Var.b;
                layoutParams.rightMargin = nk80Var.c;
                layoutParams.bottomMargin = nk80Var.d;
                view = new View(context);
                view.setTag(c);
                view.setTranslationX(wey0Var.f);
                view.setTranslationY(wey0Var.g);
                view.setAlpha(wey0Var.h);
                view.setVisibility(wey0Var.d ? 0 : 8);
                view.setBackground(wey0Var.e);
                xmu0Var = new xmu0(layoutParams, view, (byte) 27);
                if (wey0Var.i == null) {
                    eg.m("Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?");
                    return;
                } else {
                    wey0Var.i = xmu0Var;
                    addView(view, i5, layoutParams);
                }
            } else {
                i = wey0Var.a;
                i2 = 3;
            }
            i6 = i;
            i3 = -1;
            layoutParams = new FrameLayout.LayoutParams(i6, i3, i2);
            nk80 nk80Var2 = wey0Var.c;
            layoutParams.leftMargin = nk80Var2.a;
            layoutParams.topMargin = nk80Var2.b;
            layoutParams.rightMargin = nk80Var2.c;
            layoutParams.bottomMargin = nk80Var2.d;
            view = new View(context);
            view.setTag(c);
            view.setTranslationX(wey0Var.f);
            view.setTranslationY(wey0Var.g);
            view.setAlpha(wey0Var.h);
            view.setVisibility(wey0Var.d ? 0 : 8);
            view.setBackground(wey0Var.e);
            xmu0Var = new xmu0(layoutParams, view, (byte) 27);
            if (wey0Var.i == null) {
                eg.m("Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?");
                return;
            } else {
                wey0Var.i = xmu0Var;
                addView(view, i5, layoutParams);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != c) {
            xey0 xey0Var = this.b;
            int childCount = getChildCount() - (xey0Var != null ? xey0Var.a.size() : 0);
            if (i > childCount || i < 0) {
                i = childCount;
            }
        }
        super.addView(view, i, layoutParams);
    }

    public final void b() {
        xey0 xey0Var;
        if (this.b != null) {
            removeViews(getChildCount() - this.b.a.size(), this.b.a.size());
            int size = this.b.a.size();
            int i = 0;
            while (true) {
                xey0Var = this.b;
                if (i >= size) {
                    break;
                }
                ((y9h) xey0Var.a.get(i)).b.i = null;
                i++;
            }
            ArrayList arrayList = xey0Var.a;
            if (!xey0Var.f) {
                xey0Var.f = true;
                xey0Var.b.b.remove(xey0Var);
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    ((y9h) arrayList.get(size2)).e = null;
                }
                arrayList.clear();
            }
            this.b = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof pdd1) {
            pdd1 pdd1Var = (pdd1) tag;
            if (pdd1Var.b.isEmpty()) {
                pdd1Var.a.post(new v241(pdd1Var, (byte) 13));
                viewGroup.setTag(R.id.tag_system_bar_state_monitor, null);
            }
        }
    }

    public void setProtections(List<y9h> list) {
        ArrayList arrayList = this.a;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            a();
            requestApplyInsets();
        }
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new ArrayList();
    }

    public ProtectionLayout(Context context) {
        super(context);
        this.a = new ArrayList();
    }
}
