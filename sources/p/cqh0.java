package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cqh0 {
    public Bundle a;
    public Bundle b;

    public static Bundle a(Bundle... bundleArr) {
        Bundle bundle = new Bundle();
        for (Bundle bundle2 : bundleArr) {
            bundle.putAll(bundle2);
        }
        return bundle;
    }
}
