package p;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ca4 extends rf {
    public final /* synthetic */ ha4 a;
    public final /* synthetic */ hmb0 b;
    public final /* synthetic */ ha4 c;

    public ca4(ha4 ha4Var, hmb0 hmb0Var, ha4 ha4Var2) {
        this.a = ha4Var;
        this.b = hmb0Var;
        this.c = ha4Var2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    @Override // p.rf
    public final void onInitializeAccessibilityNodeInfo(View view, kg kgVar) {
        super.onInitializeAccessibilityNodeInfo(view, kgVar);
        AccessibilityNodeInfo accessibilityNodeInfo = kgVar.a;
        ha4 ha4Var = this.a;
        pa4 pa4Var = ha4Var.Z0;
        if (pa4Var.m()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        }
        hmb0 hmb0Var = this.b;
        hmb0 hmb0VarV = hmb0Var.v();
        while (true) {
            if (hmb0VarV == null) {
                hmb0VarV = null;
                break;
            } else if (hmb0VarV.e1.k(8)) {
                break;
            } else {
                hmb0VarV = hmb0VarV.v();
            }
        }
        Integer numValueOf = hmb0VarV != null ? Integer.valueOf(hmb0VarV.b) : null;
        if (numValueOf != null) {
            if (numValueOf.intValue() == ha4Var.getSemanticsOwner().a().f) {
                numValueOf = -1;
            }
        } else {
            numValueOf = -1;
        }
        int iIntValue = numValueOf.intValue();
        kgVar.b = iIntValue;
        ha4 ha4Var2 = this.c;
        accessibilityNodeInfo.setParent(ha4Var2, iIntValue);
        int i = hmb0Var.b;
        int iD = pa4Var.Y0.d(i);
        if (iD != -1) {
            k75 k75VarQ = flo1.q(ha4Var.getAndroidViewsHandler$ui(), iD);
            if (k75VarQ != null) {
                accessibilityNodeInfo.setTraversalBefore(k75VarQ);
            } else {
                accessibilityNodeInfo.setTraversalBefore(ha4Var2, iD);
            }
            ha4Var.b(i, accessibilityNodeInfo, pa4Var.a1);
        }
        int iD2 = pa4Var.Z0.d(i);
        if (iD2 != -1) {
            k75 k75VarQ2 = flo1.q(ha4Var.getAndroidViewsHandler$ui(), iD2);
            if (k75VarQ2 != null) {
                accessibilityNodeInfo.setTraversalAfter(k75VarQ2);
            } else {
                accessibilityNodeInfo.setTraversalAfter(ha4Var2, iD2);
            }
            ha4Var.b(i, accessibilityNodeInfo, pa4Var.b1);
        }
    }
}
