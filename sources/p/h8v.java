package p;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class h8v extends rf {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Object b;

    public h8v(m8v m8vVar) {
        this.b = m8vVar;
        new Rect();
    }

    @Override // p.rf
    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.a) {
            case 0:
                m8v m8vVar = (m8v) this.b;
                if (accessibilityEvent.getEventType() != 32) {
                    return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
                }
                accessibilityEvent.getText();
                View viewE = m8vVar.e();
                if (viewE != null) {
                    int iG = m8vVar.g(viewE);
                    WeakHashMap weakHashMap = b8k1.a;
                    qpn1.k(iG, m8vVar.getLayoutDirection());
                }
                return true;
            default:
                return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // p.rf
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.a) {
            case 0:
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
                break;
            default:
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                break;
        }
    }

    @Override // p.rf
    public final void onInitializeAccessibilityNodeInfo(View view, kg kgVar) {
        switch (this.a) {
            case 0:
                int[] iArr = m8v.f1;
                super.onInitializeAccessibilityNodeInfo(view, kgVar);
                kgVar.l("androidx.drawerlayout.widget.DrawerLayout");
                AccessibilityNodeInfo accessibilityNodeInfo = kgVar.a;
                accessibilityNodeInfo.setFocusable(false);
                accessibilityNodeInfo.setFocused(false);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) fg.e.a);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) fg.f.a);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(view, kgVar);
                zbh0 zbh0Var = (zbh0) this.b;
                kgVar.q(zbh0.Y0(zbh0Var).getVisibility() == 0 ? zbh0Var.l0(2131958976) : zbh0Var.l0(2131958974));
                break;
        }
    }

    @Override // p.rf
    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        switch (this.a) {
            case 0:
                int[] iArr = m8v.f1;
                break;
        }
        return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public h8v(zbh0 zbh0Var) {
        this.b = zbh0Var;
    }
}
