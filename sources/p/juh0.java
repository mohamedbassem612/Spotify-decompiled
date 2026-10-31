package p;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public interface juh0 {
    ParcelFileDescriptor c(Uri uri, File file, String str);

    default String[] l() {
        return new String[]{"image/png"};
    }
}
