package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x061 extends AppCompatImageView implements tlv {
    public final idd1 d;
    public final idd1 e;

    /* JADX WARN: Multi-variable type inference failed */
    public x061(Context context) {
        super(context, (AttributeSet) null, 0);
        setVisibility(8);
        this.d = new idd1(new qnd0(context, (byte) 17));
        this.e = new idd1(new qnd0(context, (byte) 16));
    }

    private final Drawable getNotSelectedDrawable() {
        return (Drawable) this.e.getValue();
    }

    private final Drawable getSelectedDrawable() {
        return (Drawable) this.d.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void f(zw51 zw51Var) {
        Drawable selectedDrawable;
        setTag(2131430920, zw51Var);
        setVisibility(zw51Var == zw51.a ? 8 : 0);
        int iOrdinal = zw51Var.ordinal();
        if (iOrdinal == 1) {
            setSelected(true);
            selectedDrawable = getSelectedDrawable();
        } else if (iOrdinal != 2) {
            selectedDrawable = null;
        } else {
            setSelected(false);
            selectedDrawable = getNotSelectedDrawable();
        }
        setImageDrawable(selectedDrawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super/*android.view.View*/.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setChecked(isSelected());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super/*android.view.View*/.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(isSelected());
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
    }
}
