package p;

import com.comscore.android.id.IdHelperAndroid;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public enum of4 implements z0z {
    NONE(IdHelperAndroid.NO_ID_AVAILABLE),
    /* JADX INFO: Fake field, exist only in values array */
    DIRECT("direct"),
    /* JADX INFO: Fake field, exist only in values array */
    ALERT("alert"),
    /* JADX INFO: Fake field, exist only in values array */
    ALERT_VIA_SETTINGS("alertViaSettings");

    public final String a;

    of4(String str) {
        this.a = str;
    }

    public final String value() {
        return this.a;
    }
}
