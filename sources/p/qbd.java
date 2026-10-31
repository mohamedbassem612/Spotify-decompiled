package p;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qbd implements pbd, f961 {
    public final Context a;

    public qbd(Context context) {
        this.a = context;
    }

    public final Boolean a(String str) throws IOException {
        boolean zExists;
        if (Build.VERSION.SDK_INT >= 29) {
            Cursor cursorQuery = this.a.getContentResolver().query(MediaStore.Downloads.EXTERNAL_CONTENT_URI, new String[]{"_id"}, "_display_name = ?", new String[]{str}, null);
            zExists = false;
            if (cursorQuery != null) {
                try {
                    zExists = cursorQuery.getCount() > 0;
                    cursorQuery.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        u890.p(cursorQuery, th);
                        throw th2;
                    }
                }
            }
        } else {
            zExists = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), str).exists();
        }
        return Boolean.valueOf(zExists);
    }

    public final obd b(String str, byte[] bArr) throws IOException {
        rih1 m231Var;
        int i = Build.VERSION.SDK_INT;
        nbd nbdVar = nbd.a;
        Context context = this.a;
        if (i < 29) {
            if (x74.j(context, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                return mbd.a;
            }
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
            externalStoragePublicDirectory.mkdirs();
            File file = new File(externalStoragePublicDirectory, str);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
                MediaScannerConnection.scanFile(context, new String[]{file.getAbsolutePath()}, new String[]{"image/jpeg"}, null);
                return nbdVar;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    u890.p(fileOutputStream, th);
                    throw th2;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", "image/jpeg");
        contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
        Uri uriInsert = context.getContentResolver().insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
        if (uriInsert == null) {
            return new lbd(new IllegalStateException("Failed to insert into MediaStore for ".concat(str)));
        }
        OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uriInsert);
        try {
            if (outputStreamOpenOutputStream == null) {
                context.getContentResolver().delete(uriInsert, null, null);
                return new lbd(new IllegalStateException("Failed to open output stream for ".concat(str)));
            }
            try {
                outputStreamOpenOutputStream.write(bArr);
                outputStreamOpenOutputStream.close();
                m231Var = rih1.a;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    u890.p(outputStreamOpenOutputStream, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            m231Var = new m231(th5);
        }
        Throwable thA = e331.a(m231Var);
        if (thA == null) {
            return nbdVar;
        }
        context.getContentResolver().delete(uriInsert, null, null);
        return new lbd(thA);
    }

    public final Object getApi() {
        return this;
    }

    public final void shutdown() {
    }
}
