package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class thc {
    public final /* synthetic */ byte a;
    public final String b;
    public final String c;
    public final Serializable d;

    public /* synthetic */ thc(String str, String str2, Serializable serializable, byte b) {
        this.a = b;
        this.b = str;
        this.c = str2;
        this.d = serializable;
    }

    public final InputStream a() {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                byte[] bArr = (byte[]) obj;
                if (bArr == null || bArr.length == 0) {
                    return null;
                }
                return new ByteArrayInputStream(bArr);
            default:
                File file = (File) obj;
                if (!file.exists() || !file.isFile()) {
                    return null;
                }
                try {
                    return new FileInputStream(file);
                } catch (FileNotFoundException unused) {
                    return null;
                }
        }
    }
}
