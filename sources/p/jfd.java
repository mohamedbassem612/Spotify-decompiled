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
public final class jfd implements ifd, f961 {
    public final Context a;

    public jfd(Context context) {
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

    public final hfd b(g3r g3rVar, String str) throws IOException {
        Long m231Var;
        hfd efdVar;
        int i = Build.VERSION.SDK_INT;
        hfd efdVar2 = gfd.a;
        Context context = this.a;
        if (i < 29) {
            if (x74.j(context, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                return ffd.a;
            }
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
            externalStoragePublicDirectory.mkdirs();
            File file = new File(externalStoragePublicDirectory, str);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                try {
                    o0c.w(g3rVar, fileOutputStream);
                    g3rVar.close();
                    fileOutputStream.close();
                    MediaScannerConnection.scanFile(context, new String[]{file.getAbsolutePath()}, new String[]{"video/mp4"}, null);
                    return efdVar2;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        u890.p(g3rVar, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    u890.p(fileOutputStream, th3);
                    throw th4;
                }
            }
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", str);
            contentValues.put("mime_type", "video/mp4");
            contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
            Uri uriInsert = context.getContentResolver().insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
            if (uriInsert == null) {
                efdVar = new efd(new IllegalStateException("Failed to insert into MediaStore for ".concat(str)));
            } else {
                OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uriInsert);
                try {
                    if (outputStreamOpenOutputStream == null) {
                        context.getContentResolver().delete(uriInsert, null, null);
                        efdVar = new efd(new IllegalStateException("Failed to open output stream for ".concat(str)));
                    } else {
                        try {
                            long jW = o0c.w(g3rVar, outputStreamOpenOutputStream);
                            outputStreamOpenOutputStream.close();
                            m231Var = Long.valueOf(jW);
                            Throwable thA = e331.a(m231Var);
                            if (thA == null) {
                                m231Var.longValue();
                            } else {
                                context.getContentResolver().delete(uriInsert, null, null);
                                efdVar2 = new efd(thA);
                            }
                            efdVar = efdVar2;
                        } catch (Throwable th5) {
                            try {
                                throw th5;
                            } catch (Throwable th6) {
                                u890.p(outputStreamOpenOutputStream, th5);
                                throw th6;
                            }
                        }
                    }
                } catch (Throwable th7) {
                    m231Var = new m231(th7);
                }
            }
            g3rVar.close();
            return efdVar;
        } catch (Throwable th8) {
            try {
                throw th8;
            } catch (Throwable th9) {
                u890.p(g3rVar, th8);
                throw th9;
            }
        }
    }

    public final Object getApi() {
        return this;
    }

    public final void shutdown() {
    }
}
