package p;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qf extends View.AccessibilityDelegate {
    public final rf a;

    public qf(rf rfVar) {
        this.a = rfVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        ng accessibilityNodeProvider = this.a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return (AccessibilityNodeProvider) accessibilityNodeProvider.getProvider();
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        int iKeyAt;
        kg kgVar = new kg(accessibilityNodeInfo);
        WeakHashMap weakHashMap = b8k1.a;
        Boolean bool = (Boolean) new l7k1().d(view);
        kgVar.s(bool != null && bool.booleanValue());
        Boolean bool2 = (Boolean) new m7k1((byte) 2).d(view);
        kgVar.p(bool2 != null && bool2.booleanValue());
        kgVar.r((CharSequence) new m7k1((byte) 0).d(view));
        kgVar.v((CharSequence) new m7k1((byte) 1).d(view));
        this.a.onInitializeAccessibilityNodeInfo(view, kgVar);
        CharSequence text = accessibilityNodeInfo.getText();
        if (Build.VERSION.SDK_INT < 26) {
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view.getTag(2131431195);
            if (sparseArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < sparseArray.size(); i++) {
                    if (((WeakReference) sparseArray.valueAt(i)).get() == null) {
                        arrayList.add(Integer.valueOf(i));
                    }
                }
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    sparseArray.remove(((Integer) arrayList.get(i2)).intValue());
                }
            }
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", 2131427376);
                SparseArray sparseArray2 = (SparseArray) view.getTag(2131431195);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    view.setTag(2131431195, sparseArray2);
                }
                for (int i3 = 0; i3 < clickableSpanArr.length; i3++) {
                    ClickableSpan clickableSpan = clickableSpanArr[i3];
                    int i4 = 0;
                    while (true) {
                        if (i4 >= sparseArray2.size()) {
                            iKeyAt = kg.d;
                            kg.d = iKeyAt + 1;
                            break;
                        } else {
                            if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i4)).get())) {
                                iKeyAt = sparseArray2.keyAt(i4);
                                break;
                            }
                            i4++;
                        }
                    }
                    sparseArray2.put(iKeyAt, new WeakReference(clickableSpanArr[i3]));
                    ClickableSpan clickableSpan2 = clickableSpanArr[i3];
                    Spanned spanned = (Spanned) text;
                    kgVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    kgVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    kgVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    kgVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(iKeyAt));
                }
            }
        }
        List<fg> actionList = rf.getActionList(view);
        for (int i5 = 0; i5 < actionList.size(); i5++) {
            kgVar.b(actionList.get(i5));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.a.performAccessibilityAction(view, i, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.a.sendAccessibilityEvent(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
