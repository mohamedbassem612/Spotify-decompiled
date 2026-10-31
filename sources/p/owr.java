package p;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class owr extends l7c {
    public final Signature[] o(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
