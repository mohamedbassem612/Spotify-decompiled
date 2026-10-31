package p;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.provider.MediaStore;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class n58 {
    public final Object a;
    public final Object b;
    public final Object c;

    public n58(o58 o58Var) {
        this.c = o58Var;
        Handler handlerR = zoi1.r((lkh0) null);
        this.a = handlerR;
        m58 m58Var = new m58(this);
        this.b = m58Var;
        o58Var.a.registerStreamEventCallback(new zrk(handlerR, (byte) 0), m58Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public Object a(File file, onm onmVar) throws Exception {
        akj1 akj1Var;
        jyu jyuVar = (iyu) this.b;
        if (onmVar instanceof akj1) {
            akj1Var = (akj1) onmVar;
            int i = akj1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                akj1Var.c = i - Integer.MIN_VALUE;
            } else {
                akj1Var = new akj1(this, onmVar);
            }
        } else {
            akj1Var = new akj1(this, onmVar);
        }
        Object obj = akj1Var.a;
        int i2 = akj1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                String strH = eyh0.h(".mp4");
                jyuVar.a();
                q8n q8nVar = (q8n) this.c;
                vxg1 vxg1Var = new vxg1(this, file, strH, (lnm) null, (byte) 17);
                akj1Var.c = 1;
                Object objY = fn31.Y(q8nVar, vxg1Var, akj1Var);
                d9n d9nVar = d9n.a;
                if (objY == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            return rih1.a;
        } catch (Exception e) {
            jyuVar.b.cancel(2131962276);
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(File file, String str, onm onmVar) throws Exception {
        bkj1 bkj1Var;
        File file2;
        if (onmVar instanceof bkj1) {
            bkj1Var = (bkj1) onmVar;
            int i = bkj1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bkj1Var.d = i - Integer.MIN_VALUE;
            } else {
                bkj1Var = new bkj1(this, onmVar);
            }
        } else {
            bkj1Var = new bkj1(this, onmVar);
        }
        Object obj = bkj1Var.b;
        int i2 = bkj1Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            File file3 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), str);
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    try {
                        o0c.w(fileInputStream, fileOutputStream);
                        fileOutputStream.close();
                        fileInputStream.close();
                        bkj1Var.a = file3;
                        bkj1Var.d = 1;
                        Comparable comparableD = d(file3, bkj1Var);
                        Comparable comparable = d9n.a;
                        return comparableD == comparable ? comparable : comparableD;
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
            } catch (Exception e) {
                e = e;
                file2 = file3;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            file2 = bkj1Var.a;
            try {
                hm5.M(obj);
                return obj;
            } catch (Exception e2) {
                e = e2;
            }
        }
        if (file2.exists() && !file2.delete()) {
            j2h1.h(e, new IllegalStateException("Failed to delete incomplete video file"));
        }
        throw e;
    }

    public Uri c(File file, String str) throws Exception {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", "video/mp4");
        contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
        ContentResolver contentResolver = ((Context) this.a).getApplicationContext().getContentResolver();
        Uri uriInsert = contentResolver.insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
        if (uriInsert == null) {
            eg.m("Failed to create MediaStore entry for video");
            return null;
        }
        try {
            OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
            if (outputStreamOpenOutputStream == null) {
                throw new IllegalStateException("Failed to open output stream for video MediaStore entry");
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    o0c.w(fileInputStream, outputStreamOpenOutputStream);
                    fileInputStream.close();
                    outputStreamOpenOutputStream.close();
                    return uriInsert;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        u890.p(fileInputStream, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    u890.p(outputStreamOpenOutputStream, th3);
                    throw th4;
                }
            }
        } catch (Exception e) {
            try {
                contentResolver.delete(uriInsert, null, null);
            } catch (Exception e2) {
                j2h1.h(e, e2);
            }
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Comparable d(File file, onm onmVar) {
        ckj1 ckj1Var;
        if (onmVar instanceof ckj1) {
            ckj1Var = (ckj1) onmVar;
            int i = ckj1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ckj1Var.c = i - Integer.MIN_VALUE;
            } else {
                ckj1Var = new ckj1(this, onmVar);
            }
        } else {
            ckj1Var = new ckj1(this, onmVar);
        }
        Object objR = ckj1Var.a;
        int i2 = ckj1Var.c;
        if (i2 == 0) {
            hm5.M(objR);
            ckj1Var.c = 1;
            ohd ohdVar = new ohd(1, aym.t(ckj1Var));
            ohdVar.t();
            MediaScannerConnection.scanFile(((Context) this.a).getApplicationContext(), new String[]{file.getAbsolutePath()}, new String[]{"video/mp4"}, new wxa(ohdVar, (byte) 1));
            objR = ohdVar.r();
            d9n d9nVar = d9n.a;
            if (objR == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objR);
        }
        Uri uri = (Uri) objR;
        if (uri != null) {
            return uri;
        }
        eg.m("Failed to scan downloaded video file");
        return null;
    }

    public void e() {
        ((o58) this.c).a.unregisterStreamEventCallback((m58) this.b);
        ((Handler) this.a).removeCallbacksAndMessages(null);
    }

    public n58(Context context, eyh0 eyh0Var, iyu iyuVar, q8n q8nVar) {
        this.a = context;
        this.b = iyuVar;
        this.c = q8nVar;
    }
}
