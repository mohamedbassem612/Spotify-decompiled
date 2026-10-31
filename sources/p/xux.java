package p;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class xux {
    public static final kiv a = mod.t(xzu.d1);

    public static final wux a(b0k b0kVar) {
        Configuration configuration = (Configuration) ((x340) b0kVar).k(AndroidCompositionLocals_androidKt.a);
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i > 0 && i2 > 0) {
            return i < 600 ? avx.a : zux.a();
        }
        Logger.d("EncoreLayoutTheme: Invalid screen dimensions (%dx%d), falling back to SmallDevices", Integer.valueOf(i), Integer.valueOf(i2));
        return avx.a;
    }
}
