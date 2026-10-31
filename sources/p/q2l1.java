package p;

import android.util.ArrayMap;
import android.webkit.JavascriptInterface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class q2l1 {
    public final ArrayMap a = new ArrayMap();

    @JavascriptInterface
    public final void clear() {
        this.a.clear();
    }

    @JavascriptInterface
    public final String getItem(String str) {
        return (String) this.a.get(str);
    }

    @JavascriptInterface
    public final int getLength() {
        return this.a.size();
    }

    @JavascriptInterface
    public final String key(int i) {
        return (String) this.a.keyAt(i);
    }

    @JavascriptInterface
    public final void removeItem(String str) {
        this.a.remove(str);
    }

    @JavascriptInterface
    public final void setItem(String str, String str2) {
        this.a.put(str, str2);
    }
}
