package p;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.car.app.model.Alert;
import app.p000rive.semantics.SemanticState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class os00 extends rf {
    private static final String DEFAULT_CLASS_NAME = "android.view.View";
    public static final int HOST_ID = -1;
    public static final int INVALID_ID = Integer.MIN_VALUE;
    private static final Rect INVALID_PARENT_BOUNDS = new Rect(Alert.DURATION_SHOW_INDEFINITELY, Alert.DURATION_SHOW_INDEFINITELY, INVALID_ID, INVALID_ID);
    private static final xz20 NODE_ADAPTER = new hfb((byte) 10);
    private static final yz20 SPARSE_VALUES_ADAPTER = new lfb((byte) 10);
    private final View mHost;
    private final AccessibilityManager mManager;
    private ns00 mNodeProvider;
    private final Rect mTempScreenRect = new Rect();
    private final Rect mTempParentRect = new Rect();
    private final Rect mTempVisibleRect = new Rect();
    private final int[] mTempGlobalRect = new int[2];
    int mAccessibilityFocusedVirtualViewId = INVALID_ID;
    int mKeyboardFocusedVirtualViewId = INVALID_ID;
    private int mHoveredVirtualViewId = INVALID_ID;

    public os00(View view) {
        this.mHost = view;
        this.mManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap weakHashMap = b8k1.a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public final AccessibilityEvent a(int i, int i2) {
        if (i == -1) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            this.mHost.onInitializeAccessibilityEvent(accessibilityEventObtain);
            return accessibilityEventObtain;
        }
        AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain(i2);
        kg kgVarObtainAccessibilityNodeInfo = obtainAccessibilityNodeInfo(i);
        accessibilityEventObtain2.getText().add(kgVarObtainAccessibilityNodeInfo.g());
        AccessibilityNodeInfo accessibilityNodeInfo = kgVarObtainAccessibilityNodeInfo.a;
        accessibilityEventObtain2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityEventObtain2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityEventObtain2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityEventObtain2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityEventObtain2.setChecked(accessibilityNodeInfo.isChecked());
        onPopulateEventForVirtualView(i, accessibilityEventObtain2);
        if (accessibilityEventObtain2.getText().isEmpty() && accessibilityEventObtain2.getContentDescription() == null) {
            jah.g("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            return null;
        }
        accessibilityEventObtain2.setClassName(accessibilityNodeInfo.getClassName());
        accessibilityEventObtain2.setSource(this.mHost, i);
        accessibilityEventObtain2.setPackageName(this.mHost.getContext().getPackageName());
        return accessibilityEventObtain2;
    }

    public final kg b(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        kg kgVar = new kg(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        kgVar.l(DEFAULT_CLASS_NAME);
        Rect rect = INVALID_PARENT_BOUNDS;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        View view = this.mHost;
        kgVar.b = -1;
        accessibilityNodeInfoObtain.setParent(view);
        onPopulateNodeForVirtualView(i, kgVar);
        if (kgVar.g() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            jah.g("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
            return null;
        }
        kgVar.f(this.mTempParentRect);
        if (this.mTempParentRect.equals(rect)) {
            jah.g("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
            return null;
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            jah.g("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        if ((actions & SemanticState.Focused) != 0) {
            jah.g("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        accessibilityNodeInfoObtain.setPackageName(this.mHost.getContext().getPackageName());
        View view2 = this.mHost;
        kgVar.c = i;
        accessibilityNodeInfoObtain.setSource(view2, i);
        if (this.mAccessibilityFocusedVirtualViewId == i) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            kgVar.a(SemanticState.Focused);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            kgVar.a(64);
        }
        boolean z = this.mKeyboardFocusedVirtualViewId == i;
        if (z) {
            kgVar.a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            kgVar.a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z);
        this.mHost.getLocationOnScreen(this.mTempGlobalRect);
        accessibilityNodeInfoObtain.getBoundsInScreen(this.mTempScreenRect);
        if (this.mTempScreenRect.equals(rect)) {
            kgVar.f(this.mTempScreenRect);
            if (kgVar.b != -1) {
                kg kgVar2 = new kg(AccessibilityNodeInfo.obtain());
                for (int i2 = kgVar.b; i2 != -1; i2 = kgVar2.b) {
                    View view3 = this.mHost;
                    kgVar2.b = -1;
                    AccessibilityNodeInfo accessibilityNodeInfo = kgVar2.a;
                    accessibilityNodeInfo.setParent(view3, -1);
                    accessibilityNodeInfo.setBoundsInParent(INVALID_PARENT_BOUNDS);
                    onPopulateNodeForVirtualView(i2, kgVar2);
                    kgVar2.f(this.mTempParentRect);
                    Rect rect2 = this.mTempScreenRect;
                    Rect rect3 = this.mTempParentRect;
                    rect2.offset(rect3.left, rect3.top);
                }
            }
            this.mTempScreenRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
        }
        if (this.mHost.getLocalVisibleRect(this.mTempVisibleRect)) {
            this.mTempVisibleRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
            if (this.mTempScreenRect.intersect(this.mTempVisibleRect)) {
                Rect rect4 = this.mTempScreenRect;
                AccessibilityNodeInfo accessibilityNodeInfo2 = kgVar.a;
                accessibilityNodeInfo2.setBoundsInScreen(rect4);
                Rect rect5 = this.mTempScreenRect;
                if (rect5 != null && !rect5.isEmpty() && this.mHost.getWindowVisibility() == 0) {
                    Object parent = this.mHost.getParent();
                    while (parent instanceof View) {
                        View view4 = (View) parent;
                        if (view4.getAlpha() > 0.0f && view4.getVisibility() == 0) {
                            parent = view4.getParent();
                        }
                    }
                    if (parent != null) {
                        accessibilityNodeInfo2.setVisibleToUser(true);
                    }
                }
            }
        }
        return kgVar;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x013f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0199  */
    public final boolean c(int i, Rect rect) {
        Object obj;
        kg kgVar;
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        ina1 ina1Var = new ina1(0);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ina1Var.e(((Integer) arrayList.get(i2)).intValue(), b(((Integer) arrayList.get(i2)).intValue()));
        }
        int i3 = this.mKeyboardFocusedVirtualViewId;
        int iD = INVALID_ID;
        kg kgVar2 = i3 == Integer.MIN_VALUE ? null : (kg) dio1.r(ina1Var, i3);
        int i4 = -1;
        if (i == 1 || i == 2) {
            View view = this.mHost;
            WeakHashMap weakHashMap = b8k1.a;
            boolean z = view.getLayoutDirection() == 1;
            lfb lfbVar = SPARSE_VALUES_ADAPTER;
            xz20 xz20Var = NODE_ADAPTER;
            lfbVar.getClass();
            int iG = ina1Var.g();
            ArrayList arrayList2 = new ArrayList(iG);
            for (int i5 = 0; i5 < iG; i5++) {
                arrayList2.add((kg) ina1Var.h(i5));
            }
            Collections.sort(arrayList2, new zz20(z, xz20Var));
            if (i == 1) {
                int size = arrayList2.size();
                if (kgVar2 != null) {
                    size = arrayList2.indexOf(kgVar2);
                }
                int i6 = size - 1;
                if (i6 >= 0) {
                    obj = arrayList2.get(i6);
                } else {
                    obj = null;
                }
            } else {
                if (i != 2) {
                    hhg1.n("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                    return false;
                }
                int size2 = arrayList2.size();
                int iLastIndexOf = (kgVar2 == null ? -1 : arrayList2.lastIndexOf(kgVar2)) + 1;
                if (iLastIndexOf < size2) {
                    obj = arrayList2.get(iLastIndexOf);
                } else {
                    obj = null;
                }
            }
            kgVar = (kg) obj;
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                hhg1.n("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            Rect rect2 = new Rect();
            int i7 = this.mKeyboardFocusedVirtualViewId;
            if (i7 != Integer.MIN_VALUE) {
                obtainAccessibilityNodeInfo(i7).f(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                View view2 = this.mHost;
                int width = view2.getWidth();
                int height = view2.getHeight();
                if (i == 17) {
                    rect2.set(width, 0, width, height);
                } else if (i == 33) {
                    rect2.set(0, height, width, height);
                } else if (i == 66) {
                    rect2.set(-1, 0, -1, height);
                } else {
                    if (i != 130) {
                        hhg1.n("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                    rect2.set(0, -1, width, -1);
                }
            }
            lfb lfbVar2 = SPARSE_VALUES_ADAPTER;
            hfb hfbVar = NODE_ADAPTER;
            Rect rect3 = new Rect(rect2);
            if (i == 17) {
                rect3.offset(rect2.width() + 1, 0);
            } else if (i == 33) {
                rect3.offset(0, rect2.height() + 1);
            } else if (i == 66) {
                rect3.offset(-(rect2.width() + 1), 0);
            } else {
                if (i != 130) {
                    hhg1.n("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    return false;
                }
                rect3.offset(0, -(rect2.height() + 1));
            }
            lfbVar2.getClass();
            int iG2 = ina1Var.g();
            Rect rect4 = new Rect();
            kgVar = null;
            for (int i8 = 0; i8 < iG2; i8++) {
                kg kgVar3 = (kg) ina1Var.h(i8);
                if (kgVar3 != kgVar2) {
                    hfbVar.getClass();
                    kgVar3.f(rect4);
                    if (eth.A(i, rect2, rect4)) {
                        if (!eth.A(i, rect2, rect3) || eth.e(i, rect2, rect4, rect3)) {
                            rect3.set(rect4);
                            kgVar = kgVar3;
                        } else if (!eth.e(i, rect2, rect3, rect4)) {
                            int iK = eth.K(i, rect2, rect4);
                            int iL = eth.L(i, rect2, rect4);
                            int i9 = (iL * iL) + (iK * 13 * iK);
                            int iK2 = eth.K(i, rect2, rect3);
                            int iL2 = eth.L(i, rect2, rect3);
                            if (i9 < (iL2 * iL2) + (iK2 * 13 * iK2)) {
                                rect3.set(rect4);
                                kgVar = kgVar3;
                            }
                        }
                    }
                }
            }
        }
        kg kgVar4 = kgVar;
        if (kgVar4 != null) {
            if (ina1Var.a) {
                dio1.l(ina1Var);
            }
            int i10 = ina1Var.d;
            for (int i11 = 0; i11 < i10; i11++) {
                if (ina1Var.c[i11] == kgVar4) {
                    i4 = i11;
                    break;
                }
            }
            iD = ina1Var.d(i4);
        }
        return requestKeyboardFocusForVirtualView(iD);
    }

    public final boolean clearKeyboardFocusForVirtualView(int i) {
        if (this.mKeyboardFocusedVirtualViewId != i) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = INVALID_ID;
        onVirtualViewKeyboardFocusChanged(i, false);
        sendEventForVirtualView(i, 8);
        return true;
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.mManager.isEnabled() || !this.mManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int virtualViewAt = getVirtualViewAt(motionEvent.getX(), motionEvent.getY());
            int i2 = this.mHoveredVirtualViewId;
            if (i2 != virtualViewAt) {
                this.mHoveredVirtualViewId = virtualViewAt;
                sendEventForVirtualView(virtualViewAt, SemanticState.Focused);
                sendEventForVirtualView(i2, SemanticState.Hidden);
            }
            if (virtualViewAt == Integer.MIN_VALUE) {
                return false;
            }
        } else {
            if (action != 10 || (i = this.mHoveredVirtualViewId) == Integer.MIN_VALUE) {
                return false;
            }
            if (i != Integer.MIN_VALUE) {
                this.mHoveredVirtualViewId = INVALID_ID;
                sendEventForVirtualView(INVALID_ID, SemanticState.Focused);
                sendEventForVirtualView(i, SemanticState.Hidden);
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i;
        int i2 = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i3 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i3 = 33;
                                } else if (keyCode == 21) {
                                    i3 = 17;
                                } else if (keyCode != 22) {
                                    i3 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z = false;
                                while (i2 < repeatCount && c(i3, null)) {
                                    i2++;
                                    z = true;
                                }
                                return z;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                i = this.mKeyboardFocusedVirtualViewId;
                                if (i != Integer.MIN_VALUE) {
                                    onPerformActionForVirtualView(i, 16, null);
                                }
                                return true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    i = this.mKeyboardFocusedVirtualViewId;
                    if (i != Integer.MIN_VALUE) {
                        onPerformActionForVirtualView(i, 16, null);
                    }
                    return true;
                }
            } else {
                if (keyEvent.hasNoModifiers()) {
                    return c(2, null);
                }
                if (keyEvent.hasModifiers(1)) {
                    return c(1, null);
                }
            }
        }
        return false;
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.mAccessibilityFocusedVirtualViewId;
    }

    public ng getAccessibilityNodeProvider(View view) {
        ns00 ns00Var = this.mNodeProvider;
        if (ns00Var != null) {
            return ns00Var;
        }
        ns00 ns00Var2 = new ns00(this);
        this.mNodeProvider = ns00Var2;
        return ns00Var2;
    }

    @Deprecated
    public int getFocusedVirtualView() {
        return getAccessibilityFocusedVirtualViewId();
    }

    public final int getKeyboardFocusedVirtualViewId() {
        return this.mKeyboardFocusedVirtualViewId;
    }

    public abstract int getVirtualViewAt(float f, float f2);

    public abstract void getVisibleVirtualViews(List list);

    public final void invalidateRoot() {
        invalidateVirtualView(-1, 1);
    }

    public final void invalidateVirtualView(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventA = a(i, SemanticState.Modal);
        accessibilityEventA.setContentChangeTypes(i2);
        parent.requestSendAccessibilityEvent(this.mHost, accessibilityEventA);
    }

    public kg obtainAccessibilityNodeInfo(int i) {
        if (i != -1) {
            return b(i);
        }
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(this.mHost);
        kg kgVar = new kg(accessibilityNodeInfoObtain);
        View view = this.mHost;
        WeakHashMap weakHashMap = b8k1.a;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            jah.g("Views cannot have both real and virtual children");
            return null;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            kgVar.a.addChild(this.mHost, ((Integer) arrayList.get(i2)).intValue());
        }
        return kgVar;
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int i2 = this.mKeyboardFocusedVirtualViewId;
        if (i2 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i2);
        }
        if (z) {
            c(i, rect);
        }
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        onPopulateEventForHost(accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(View view, kg kgVar) {
        super.onInitializeAccessibilityNodeInfo(view, kgVar);
        onPopulateNodeForHost(kgVar);
    }

    public abstract boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle);

    public abstract void onPopulateNodeForVirtualView(int i, kg kgVar);

    public boolean performAction(int i, int i2, Bundle bundle) {
        int i3;
        if (i == -1) {
            View view = this.mHost;
            WeakHashMap weakHashMap = b8k1.a;
            return view.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 1) {
            return requestKeyboardFocusForVirtualView(i);
        }
        if (i2 == 2) {
            return clearKeyboardFocusForVirtualView(i);
        }
        if (i2 != 64) {
            if (i2 != 128) {
                return onPerformActionForVirtualView(i, i2, bundle);
            }
            if (this.mAccessibilityFocusedVirtualViewId != i) {
                return false;
            }
            this.mAccessibilityFocusedVirtualViewId = INVALID_ID;
            this.mHost.invalidate();
            sendEventForVirtualView(i, 65536);
            return true;
        }
        if (!this.mManager.isEnabled() || !this.mManager.isTouchExplorationEnabled() || (i3 = this.mAccessibilityFocusedVirtualViewId) == i) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.mAccessibilityFocusedVirtualViewId = INVALID_ID;
            this.mHost.invalidate();
            sendEventForVirtualView(i3, 65536);
        }
        this.mAccessibilityFocusedVirtualViewId = i;
        this.mHost.invalidate();
        sendEventForVirtualView(i, 32768);
        return true;
    }

    public final boolean requestKeyboardFocusForVirtualView(int i) {
        int i2;
        if ((!this.mHost.isFocused() && !this.mHost.requestFocus()) || (i2 = this.mKeyboardFocusedVirtualViewId) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = i;
        onVirtualViewKeyboardFocusChanged(i, true);
        sendEventForVirtualView(i, 8);
        return true;
    }

    public final boolean sendEventForVirtualView(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.mHost, a(i, i2));
    }

    public void onPopulateEventForHost(AccessibilityEvent accessibilityEvent) {
    }

    public void onPopulateNodeForHost(kg kgVar) {
    }

    public final void invalidateVirtualView(int i) {
        invalidateVirtualView(i, 0);
    }

    public void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityEvent) {
    }

    public void onVirtualViewKeyboardFocusChanged(int i, boolean z) {
    }
}
