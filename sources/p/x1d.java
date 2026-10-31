package p;

import android.content.Context;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class x1d {
    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.camera.core.InitializationException */
    public static ic9 a(Context context, Object obj, LinkedHashSet linkedHashSet) throws InitializationException {
        try {
            return new ic9(context, obj, linkedHashSet);
        } catch (CameraUnavailableException e) {
            throw new InitializationException(e);
        }
    }
}
