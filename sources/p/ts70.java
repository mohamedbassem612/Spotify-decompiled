package p;

import android.net.Uri;
import java.io.File;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ts70 {
    public final File a;
    public final gou b;

    public ts70(File file, gou gouVar) {
        this.a = file;
        this.b = gouVar;
    }

    public final Uri a() {
        File m231Var;
        try {
            File file = new File(this.a, "vtec");
            if (!file.exists()) {
                file.mkdirs();
            }
            m231Var = File.createTempFile("vtec_upload_image", ".jpg", file);
            m231Var.deleteOnExit();
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (m231Var instanceof m231) {
            m231Var = null;
        }
        File file2 = m231Var;
        if (file2 != null) {
            return (Uri) this.b.invoke(file2);
        }
        return null;
    }
}
