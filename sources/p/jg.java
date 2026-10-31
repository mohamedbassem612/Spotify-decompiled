package p;

import android.view.accessibility.AccessibilityNodeInfo;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jg implements Function {
    public final Object a;

    public /* synthetic */ jg(Object obj) {
        this.a = obj;
    }

    public static jg b(boolean z, int i, int i2, int i3, int i4) {
        return new jg(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z));
    }

    public boolean a() {
        return ((AccessibilityNodeInfo.CollectionItemInfo) this.a).isHeading();
    }

    public Object apply(Object obj) {
        return this.a;
    }
}
