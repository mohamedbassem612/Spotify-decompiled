package p;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xf extends rf {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xf(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.a) {
            case 3:
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.b).d);
                break;
            default:
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                break;
        }
    }

    public final void onInitializeAccessibilityNodeInfo(View view, kg kgVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(view, kgVar);
                y6v0 y6v0Var = (y6v0) obj;
                kgVar.b(new fg(16, y6v0Var.a.getResources().getString(y6v0Var.e.isChecked() ? 2131960209 : 2131960210)));
                break;
            case 1:
                super.onInitializeAccessibilityNodeInfo(view, kgVar);
                kgVar.a(1048576);
                kgVar.a.setDismissable(true);
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo = kgVar.a;
                super.onInitializeAccessibilityNodeInfo(view, kgVar);
                if (((cwb) obj).t) {
                    kgVar.a(1048576);
                    accessibilityNodeInfo.setDismissable(true);
                } else {
                    accessibilityNodeInfo.setDismissable(false);
                }
                break;
            case 3:
                super.onInitializeAccessibilityNodeInfo(view, kgVar);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                boolean z = checkableImageButton.e;
                AccessibilityNodeInfo accessibilityNodeInfo2 = kgVar.a;
                accessibilityNodeInfo2.setCheckable(z);
                accessibilityNodeInfo2.setChecked(checkableImageButton.d);
                break;
            case 4:
                super.onInitializeAccessibilityNodeInfo(view, kgVar);
                kgVar.b(new fg(16, ((uhs) obj).a.getString(2131960392)));
                break;
            case 5:
                super.onInitializeAccessibilityNodeInfo(view, kgVar);
                kgVar.b(new fg(16, ((ImageView) obj).getContext().getString(2131958596)));
                kgVar.l("android.widget.Button");
                break;
            case 6:
                super.onInitializeAccessibilityNodeInfo(view, kgVar);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i = MaterialButtonToggleGroup.N0;
                int i2 = -1;
                if (view instanceof MaterialButton) {
                    int i3 = 0;
                    for (int i4 = 0; i4 < materialButtonToggleGroup.getChildCount(); i4++) {
                        if (materialButtonToggleGroup.getChildAt(i4) == view) {
                            i2 = i3;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i4) instanceof MaterialButton) && materialButtonToggleGroup.c(i4)) {
                                i3++;
                            }
                        }
                    }
                }
                kgVar.n(jg.b(((MaterialButton) view).R0, 0, 1, i2, 1));
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(view, kgVar);
                kgVar.a.setCheckable(((NavigationMenuItemView) obj).a1);
                break;
        }
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                if (i != 1048576) {
                    return super.performAccessibilityAction(view, i, bundle);
                }
                ((kda) obj).b(3);
                return true;
            case 2:
                if (i == 1048576) {
                    cwb cwbVar = (cwb) obj;
                    if (cwbVar.t) {
                        cwbVar.cancel();
                        return true;
                    }
                }
                return super.performAccessibilityAction(view, i, bundle);
            default:
                return super.performAccessibilityAction(view, i, bundle);
        }
    }
}
