package p;

import android.os.AsyncTask;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class b420 extends AsyncTask {
    public final String a;
    public final File b;
    public final a420 c;

    public b420(String str, File file, a420 a420Var) {
        this.a = str;
        this.b = file;
        this.c = a420Var;
    }

    public final Boolean a() {
        try {
            if (dhn.a.contains(this)) {
                return null;
            }
            try {
                URL url = new URL(this.a);
                int contentLength = url.openConnection().getContentLength();
                DataInputStream dataInputStream = new DataInputStream(url.openStream());
                byte[] bArr = new byte[contentLength];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.b));
                dataOutputStream.write(bArr);
                dataOutputStream.flush();
                dataOutputStream.close();
                return Boolean.TRUE;
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        } catch (Throwable th) {
            dhn.a(this, th);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        if (dhn.a.contains(this)) {
            return null;
        }
        try {
            return a();
        } catch (Throwable th) {
            dhn.a(this, th);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Set set = dhn.a;
        if (set.contains(this)) {
            return;
        }
        try {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            if (!set.contains(this) && zBooleanValue) {
                try {
                    this.c.b(this.b);
                } catch (Throwable th) {
                    dhn.a(this, th);
                }
            }
        } catch (Throwable th2) {
            dhn.a(this, th2);
        }
    }
}
