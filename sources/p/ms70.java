package p;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ms70 implements Closeable {
    public final URL a;
    public volatile Future b;
    public hfp1 c;

    public ms70(URL url) {
        this.a = url;
    }

    public static ms70 c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new ms70(new URL(str));
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    public final Bitmap a() throws IOException {
        boolean zIsLoggable = Log.isLoggable("FirebaseMessaging", 4);
        URL url = this.a;
        if (zIsLoggable) {
            Objects.toString(url);
        }
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
            k220.i("Content-Length exceeds max size of 1048576");
            return null;
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        try {
            byte[] bArrN = hm5.N(new ugc(inputStream));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                Objects.toString(url);
            }
            if (bArrN.length > 1048576) {
                k220.i("Image exceeds max size of 1048576");
                return null;
            }
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrN, 0, bArrN.length);
            if (bitmapDecodeByteArray == null) {
                hhg1.l(url, "Failed to decode image: ");
                return null;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Objects.toString(url);
            }
            return bitmapDecodeByteArray;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.cancel(true);
    }

    public final hfp1 d() {
        hfp1 hfp1Var = this.c;
        zod.s(hfp1Var);
        return hfp1Var;
    }

    public final void e(ExecutorService executorService) {
        bsd1 bsd1Var = new bsd1();
        this.b = executorService.submit(new ag20(this, bsd1Var, (byte) 8));
        this.c = bsd1Var.a;
    }
}
