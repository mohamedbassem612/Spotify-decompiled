package p;

import android.os.Build;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dh2 extends hab0 implements iu30 {
    public static final dh2 a = new dh2(1);

    public final Object invoke(Object obj) {
        Bundle bundle = (Bundle) obj;
        zg2 parcelable = Build.VERSION.SDK_INT >= 33 ? (zg2) bundle.getParcelable("ageEntryElementState", zg2.class) : bundle.getParcelable("ageEntryElementState");
        return parcelable == null ? new zg2() : parcelable;
    }
}
