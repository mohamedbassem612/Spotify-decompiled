package p;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class dhe0 {
    public static final kiv a = new kiv(wce0.b1, (byte) 1);

    public static final int a(b0k b0kVar) {
        int i = ((Configuration) ((x340) b0kVar).k(AndroidCompositionLocals_androidKt.a)).screenHeightDp;
        if (i < 731 && 720 <= i) {
            return 1;
        }
        if (i >= 869 || 731 > i) {
            return (869 > i || i >= Integer.MAX_VALUE) ? 4 : 3;
        }
        return 2;
    }
}
