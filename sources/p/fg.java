package p;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fg {
    public static final fg e = new fg(1, (CharSequence) null);
    public static final fg f = new fg(2, (CharSequence) null);
    public static final fg g;
    public static final fg h;
    public static final fg i;
    public static final fg j;
    public static final fg k;
    public static final fg l;
    public static final fg m;
    public static final fg n;
    public static final fg o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final fg f35p;
    public static final fg q;
    public static final fg r;
    public static final fg s;
    public final Object a;
    public final int b;
    public final Class c;
    public final sh d;

    static {
        new fg(4, (CharSequence) null);
        new fg(8, (CharSequence) null);
        g = new fg(16, (CharSequence) null);
        h = new fg(32, (CharSequence) null);
        i = new fg(64, (CharSequence) null);
        j = new fg(128, (CharSequence) null);
        new fg(lh.class, 256);
        new fg(lh.class, NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS);
        new fg(mh.class, 1024);
        new fg(mh.class, 2048);
        k = new fg(4096, (CharSequence) null);
        l = new fg(8192, (CharSequence) null);
        new fg(16384, (CharSequence) null);
        new fg(32768, (CharSequence) null);
        new fg(65536, (CharSequence) null);
        new fg(qh.class, 131072);
        m = new fg(262144, (CharSequence) null);
        n = new fg(524288, (CharSequence) null);
        o = new fg(1048576, (CharSequence) null);
        new fg(rh.class, 2097152);
        new fg(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new fg(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, oh.class);
        f35p = new fg(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        q = new fg(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        r = new fg(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        s = new fg(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        int i2 = Build.VERSION.SDK_INT;
        new fg(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        new fg(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        new fg(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        new fg(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        new fg(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new fg(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, ph.class);
        new fg(i2 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, nh.class);
        new fg(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
        new fg(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        new fg(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new fg(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new fg(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new fg(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new fg(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new fg(i2 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        new fg(i2 >= 34 ? sf.l() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        new fg(kbc.a() ? ig.c() : null, R.id.ALT, null, null, null);
    }

    public fg(Object obj, int i2, CharSequence charSequence, sh shVar, Class cls) {
        this.b = i2;
        this.d = shVar;
        if (obj == null) {
            this.a = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
        } else {
            this.a = obj;
        }
        this.c = cls;
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof fg)) {
            return false;
        }
        Object obj2 = ((fg) obj).a;
        Object obj3 = this.a;
        if (obj3 == null) {
            return obj2 == null;
        }
        return obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strD = kg.d(this.b);
        if (strD.equals("ACTION_UNKNOWN")) {
            Object obj = this.a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strD = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(strD);
        return sb.toString();
    }

    public fg(Class cls, int i2) {
        this(null, i2, null, null, cls);
    }

    public fg(int i2, CharSequence charSequence) {
        this(null, i2, charSequence, null, null);
    }
}
