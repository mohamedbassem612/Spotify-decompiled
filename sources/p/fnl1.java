package p;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import app.p000rive.semantics.SemanticState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fnl1 extends rf {
    public final ConstraintLayout a;
    public final RecyclerView b;
    public final idd1 c = new idd1(new enl1(this, (byte) 2));

    public fnl1(ConstraintLayout constraintLayout, RecyclerView recyclerView, bnl1 bnl1Var) {
        this.a = constraintLayout;
        this.b = recyclerView;
        b8k1.p(constraintLayout, this);
        constraintLayout.setAccessibilityLiveRegion(1);
        zml1 zml1Var = bnl1Var.a;
        byte b = zml1Var.a;
        short s = zml1Var.b;
        inl1 inl1VarA = a();
        byte b2 = zml1Var.d;
        int iP = yoi1.p((b2 - inl1VarA.d) / inl1VarA.f, 0, inl1VarA.e() - 1);
        iu30 iu30Var = bnl1Var.b.b;
        b8k1.a(recyclerView.getRootView(), constraintLayout.getContext().getString(2131954594, iu30Var.invoke(Integer.valueOf(b2))), new rim(new gf6(this, iP, (byte) 15)));
        b8k1.a(recyclerView.getRootView(), constraintLayout.getContext().getString(2131954593, iu30Var.invoke(Integer.valueOf(b))), new rim(new enl1(this, (byte) 0)));
        b8k1.a(recyclerView.getRootView(), constraintLayout.getContext().getString(2131954592, iu30Var.invoke(Integer.valueOf(s))), new rim(new enl1(this, (byte) 1)));
    }

    public final inl1 a() {
        return (inl1) this.c.getValue();
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.SeekBar");
        accessibilityEvent.setScrollable(true);
    }

    public final void onInitializeAccessibilityNodeInfo(View view, kg kgVar) {
        super.onInitializeAccessibilityNodeInfo(view, kgVar);
        kgVar.l("android.widget.SeekBar");
        kgVar.t(true);
        if (a().i >= 0) {
            kgVar.a(SemanticState.Multiline);
        }
        if (a().i <= a().e()) {
            kgVar.a(SemanticState.Obscured);
        }
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (!super.performAccessibilityAction(view, i, bundle)) {
            RecyclerView recyclerView = this.b;
            if (i == 4096) {
                int i2 = a().i + 1;
                if (i2 >= 0 && i2 < a().e()) {
                    inl1 inl1VarA = a();
                    if (inl1VarA.i != i2) {
                        inl1VarA.i = i2;
                        inl1VarA.h();
                    }
                    recyclerView.u0(i2);
                }
            } else {
                if (i != 8192) {
                    return false;
                }
                int i3 = a().i - 1;
                if (i3 >= 0 && i3 < a().e()) {
                    inl1 inl1VarA2 = a();
                    if (inl1VarA2.i != i3) {
                        inl1VarA2.i = i3;
                        inl1VarA2.h();
                    }
                    recyclerView.u0(i3);
                    return true;
                }
            }
        }
        return true;
    }
}
