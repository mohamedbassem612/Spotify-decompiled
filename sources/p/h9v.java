package p;

import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import com.spotify.base.java.logging.Logger;
import com.spotify.betamax.common.drm.DrmUtil$UnexpectedDrmException;
import java.util.Collections;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class h9v {
    public static final UUID a;
    public static final UUID b;

    static {
        UUID uuidFromString = UUID.fromString("edef8ba9-79d6-4ace-a3c8-27dcd51d21ed");
        a = uuidFromString;
        b = UUID.fromString("d4a32b78-46e3-4a7b-9f2c-7e1b5c8d0e9a");
        Collections.singleton(uuidFromString);
    }

    public static ao00 a() {
        String str = ".";
        UUID uuid = a;
        int i = 2;
        while (i > 0) {
            i--;
            try {
                return i9v.a();
            } catch (UnsupportedDrmException e) {
                Logger.e(e, "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + str, new Object[0]);
                return new hwb((byte) 8);
            } catch (DrmUtil$UnexpectedDrmException unused) {
            } catch (Exception e2) {
                Logger.e(e2, "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + str, new Object[0]);
                return new hwb((byte) 8);
            }
        }
        return new hwb((byte) 8);
    }

    public static ok30 b() throws UnsupportedDrmException {
        try {
            ok30 ok30Var = new ok30(a);
            MediaDrm mediaDrm = ok30Var.b;
            if (!"L3".equals(mediaDrm.getPropertyString("securityLevel"))) {
                mediaDrm.setPropertyString("securityLevel", "L3");
            }
            return ok30Var;
        } catch (UnsupportedSchemeException e) {
            throw new UnsupportedDrmException(e);
        } catch (Exception e2) {
            throw new UnsupportedDrmException(e2);
        }
    }
}
