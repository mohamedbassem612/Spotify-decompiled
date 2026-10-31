package p;

import com.comscore.android.id.IdHelperAndroid;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public enum gbl {
    e("CONNECTION_TYPE_UNKNOWN", "unknown", false, true),
    f("CONNECTION_TYPE_NONE", IdHelperAndroid.NO_ID_AVAILABLE, false, true),
    g("CONNECTION_TYPE_GPRS", "gprs", true, false),
    h("CONNECTION_TYPE_EDGE", "edge", true, false),
    i("CONNECTION_TYPE_3G", "3g", true, false),
    t("CONNECTION_TYPE_4G", "4g", true, false),
    X("CONNECTION_TYPE_WLAN", "wlan", false, false),
    Y("CONNECTION_TYPE_ETHERNET", "ethernet", false, false),
    Z("CONNECTION_TYPE_COMPANION_PROXY", "companion_proxy", true, false);

    public final int a;
    public final boolean b;
    public final boolean c;
    public final String d;

    gbl(String str, String str2, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = str2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.d;
    }
}
