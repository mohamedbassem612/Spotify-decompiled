package p;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class v320 extends tv30 implements vu30 {
    public static final v320 a = new v320(2, k1u.class, "copyReportPayload", "copyReportPayload(Ljava/io/File;Ljava/io/File;)V", 1);

    public final Object invoke(Object obj, Object obj2) throws IOException {
        File file = (File) obj2;
        FileInputStream fileInputStream = new FileInputStream((File) obj);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                o0c.w(fileInputStream, fileOutputStream);
                fileOutputStream.getFD().sync();
                fileOutputStream.close();
                fileInputStream.close();
                return rih1.a;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    u890.p(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                u890.p(fileInputStream, th3);
                throw th4;
            }
        }
    }
}
