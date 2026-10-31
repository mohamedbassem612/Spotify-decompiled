package p;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class n2g extends os00 {
    public final /* synthetic */ Chip a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n2g(Chip chip, Chip chip2) {
        super(chip2);
        this.a = chip;
    }

    public final int getVirtualViewAt(float f, float f2) {
        Rect rect = Chip.Y0;
        Chip chip = this.a;
        return (chip.e() && chip.getCloseIconTouchBounds().contains(f, f2)) ? 1 : 0;
    }

    public final void getVisibleVirtualViews(List list) {
        q3g q3gVar;
        ArrayList arrayList = (ArrayList) list;
        arrayList.add(0);
        Rect rect = Chip.Y0;
        Chip chip = this.a;
        if (!chip.e() || (q3gVar = chip.e) == null || !q3gVar.k1 || chip.h == null) {
            return;
        }
        arrayList.add(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, com.google.android.material.chip.Chip] */
    public final boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
        boolean z = false;
        if (i2 == 16) {
            ?? r1 = this.a;
            if (i == 0) {
                return r1.performClick();
            }
            if (i == 1) {
                r1.playSoundEffect(0);
                View.OnClickListener onClickListener = r1.h;
                if (onClickListener != 0) {
                    onClickListener.onClick(r1);
                    z = true;
                }
                if (r1.U0) {
                    r1.T0.sendEventForVirtualView(1, 1);
                }
            }
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View, android.widget.TextView, com.google.android.material.chip.Chip] */
    public final void onPopulateNodeForHost(kg kgVar) {
        ?? r2 = this.a;
        q3g q3gVar = r2.e;
        kgVar.a.setCheckable(q3gVar != null && q3gVar.q1);
        kgVar.a.setClickable(r2.isClickable());
        kgVar.l(r2.getAccessibilityClassName());
        kgVar.w(r2.getText());
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [android.view.View, android.widget.TextView, com.google.android.material.chip.Chip] */
    public final void onPopulateNodeForVirtualView(int i, kg kgVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = kgVar.a;
        if (i != 1) {
            kgVar.o("");
            accessibilityNodeInfo.setBoundsInParent(Chip.Y0);
            return;
        }
        ?? r4 = this.a;
        CharSequence closeIconContentDescription = r4.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            kgVar.o(closeIconContentDescription);
        } else {
            CharSequence text = r4.getText();
            kgVar.o(r4.getContext().getString(2131958943, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(r4.getCloseIconTouchBoundsInt());
        kgVar.b(fg.g);
        accessibilityNodeInfo.setEnabled(r4.isEnabled());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, com.google.android.material.chip.Chip] */
    public final void onVirtualViewKeyboardFocusChanged(int i, boolean z) {
        if (i == 1) {
            ?? r1 = this.a;
            r1.P0 = z;
            r1.refreshDrawableState();
        }
    }
}
