package p;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import androidx.viewpager.widget.ViewPager;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zdc extends rf {
    public final /* synthetic */ byte a;

    public zdc(ViewPager viewPager) {
        this.a = (byte) 22;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.a) {
            case 16:
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                break;
            case 22:
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                accessibilityEvent.setClassName(ViewPager.class.getName());
                accessibilityEvent.setScrollable(false);
                accessibilityEvent.getEventType();
                break;
            default:
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                break;
        }
    }

    public final void onInitializeAccessibilityNodeInfo(View view, kg kgVar) {
        int scrollRange;
        switch (this.a) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(view, kgVar);
                kgVar.l(Button.class.getName());
                break;
            case 1:
                super.onInitializeAccessibilityNodeInfo(view, kgVar);
                kgVar.l("android.widget.Button");
                break;
            case 2:
                super.onInitializeAccessibilityNodeInfo(view, kgVar);
                kgVar.l("android.widget.Button");
                break;
            case 3:
                super.onInitializeAccessibilityNodeInfo(view, kgVar);
                kgVar.l("android.widget.Button");
                break;
            case 4:
                super.onInitializeAccessibilityNodeInfo(view, kgVar);
                kgVar.l("android.widget.Button");
                break;
            case 5:
                super.onInitializeAccessibilityNodeInfo(view, kgVar);
                kgVar.l("android.widget.Button");
                break;
            case 6:
                super.onInitializeAccessibilityNodeInfo(view, kgVar);
                kgVar.l("android.widget.Button");
                break;
            case 7:
                super.onInitializeAccessibilityNodeInfo(view, kgVar);
                kgVar.p(true);
                break;
            case 8:
                super.onInitializeAccessibilityNodeInfo(view, kgVar);
                WeakHashMap weakHashMap = b8k1.a;
                if (view.getImportantForAccessibility() == 4 || view.getImportantForAccessibility() == 2) {
                    kgVar.b = -1;
                    kgVar.a.setParent(null);
                }
                break;
            case 9:
                super.onInitializeAccessibilityNodeInfo(view, kgVar);
                kgVar.l("android.widget.Button");
                break;
            case 10:
                super.onInitializeAccessibilityNodeInfo(view, kgVar);
                kgVar.p(true);
                break;
            case 11:
                super.onInitializeAccessibilityNodeInfo(view, kgVar);
                kgVar.a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", "heading");
                break;
            case 12:
                super.onInitializeAccessibilityNodeInfo(view, kgVar);
                AccessibilityNodeInfo accessibilityNodeInfo = kgVar.a;
                accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", "heading");
                kgVar.b(fg.g);
                accessibilityNodeInfo.setSelected(false);
                break;
            case 13:
                super.onInitializeAccessibilityNodeInfo(view, kgVar);
                fg fgVar = fg.h;
                AccessibilityNodeInfo accessibilityNodeInfo2 = kgVar.a;
                accessibilityNodeInfo2.removeAction((AccessibilityNodeInfo.AccessibilityAction) fgVar.a);
                accessibilityNodeInfo2.setLongClickable(false);
                break;
            case 14:
                super.onInitializeAccessibilityNodeInfo(view, kgVar);
                kgVar.m((x5j1) null);
                break;
            case 15:
                super.onInitializeAccessibilityNodeInfo(view, kgVar);
                kgVar.l("android.widget.Button");
                break;
            case 16:
                super.onInitializeAccessibilityNodeInfo(view, kgVar);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                kgVar.l(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    kgVar.t(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        kgVar.b(fg.l);
                        kgVar.b(fg.p);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        kgVar.b(fg.k);
                        kgVar.b(fg.r);
                    }
                    break;
                }
                break;
            case 17:
                super.onInitializeAccessibilityNodeInfo(view, kgVar);
                kgVar.l("android.widget.Button");
                break;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                super.onInitializeAccessibilityNodeInfo(view, kgVar);
                kgVar.l("android.widget.Button");
                break;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                super.onInitializeAccessibilityNodeInfo(view, kgVar);
                kgVar.p(true);
                break;
            case 20:
                super.onInitializeAccessibilityNodeInfo(view, kgVar);
                kgVar.p(true);
                kgVar.a.setSelected(false);
                kgVar.b(fg.g);
                break;
            case 21:
                super.onInitializeAccessibilityNodeInfo(view, kgVar);
                kgVar.l("android.widget.Button");
                break;
            case 22:
                super.onInitializeAccessibilityNodeInfo(view, kgVar);
                kgVar.l(ViewPager.class.getName());
                kgVar.t(false);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(view, kgVar);
                kgVar.l("android.widget.Button");
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0097  */
    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        int iMin;
        switch (this.a) {
            case 16:
                if (super.performAccessibilityAction(view, i, bundle)) {
                    return true;
                }
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                if (nestedScrollView.isEnabled()) {
                    int height = nestedScrollView.getHeight();
                    Rect rect = new Rect();
                    if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                        height = rect.height();
                    }
                    if (i == 4096) {
                        iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                        if (iMin != nestedScrollView.getScrollY()) {
                            nestedScrollView.C(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
                            return true;
                        }
                    } else if (i == 8192 || i == 16908344) {
                        int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                        if (iMax != nestedScrollView.getScrollY()) {
                            nestedScrollView.C(0 - nestedScrollView.getScrollX(), iMax - nestedScrollView.getScrollY(), true);
                            return true;
                        }
                    } else if (i == 16908346) {
                        iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                        if (iMin != nestedScrollView.getScrollY()) {
                            nestedScrollView.C(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
                            return true;
                        }
                    }
                }
                return false;
            case 22:
                return super.performAccessibilityAction(view, i, bundle);
            default:
                return super.performAccessibilityAction(view, i, bundle);
        }
    }
}
