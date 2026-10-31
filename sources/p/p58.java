package p;

import android.content.res.Resources;
import android.os.Build;
import android.util.Base64;
import java.util.Objects;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class p58 implements v0d1 {
    public final /* synthetic */ byte a;

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    public final Object get() {
        int dimensionPixelSize;
        switch (this.a) {
            case 0:
                return Boolean.valueOf(Build.VERSION.SDK_INT > 37 && Objects.equals(zoi1.K("persist.audio.compressed_offload_implicit_aac"), "false"));
            case 1:
                return yoi1.F(Executors.newSingleThreadExecutor());
            case 2:
                Resources system = Resources.getSystem();
                try {
                    dimensionPixelSize = system.getDimensionPixelSize(system.getIdentifier("notification_right_icon_size", "dimen", "android"));
                    if (Build.VERSION.SDK_INT < 31) {
                        dimensionPixelSize = Integer.max(Integer.max(dimensionPixelSize, system.getDimensionPixelSize(system.getIdentifier("notification_media_image_max_width", "dimen", "android"))), system.getDimensionPixelSize(system.getIdentifier("notification_media_image_max_height", "dimen", "android")));
                    }
                    break;
                } catch (Resources.NotFoundException unused) {
                    dimensionPixelSize = (int) ((Build.VERSION.SDK_INT < 31 ? 280 : 48) * system.getDisplayMetrics().density);
                }
                return Integer.valueOf(dimensionPixelSize);
            case 3:
                byte[] bArr = new byte[12];
                hfs.i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            case 4:
                return new h6s();
            case 5:
                return new h6s();
            case 6:
                String strK = zoi1.K("ro.vendor.api_level");
                if (strK == null) {
                    strK = "";
                }
                return bmq0.h0(strK);
            case 7:
                Resources system2 = Resources.getSystem();
                int dimensionPixelSize2 = system2.getDisplayMetrics().widthPixels;
                try {
                    dimensionPixelSize2 = system2.getDimensionPixelSize(system2.getIdentifier("config_mediaMetadataBitmapMaxSize", "dimen", "android"));
                    break;
                } catch (Resources.NotFoundException unused2) {
                }
                return Integer.valueOf(dimensionPixelSize2);
            case 8:
                return yys.class;
            default:
                throw new IllegalStateException();
        }
    }
}
