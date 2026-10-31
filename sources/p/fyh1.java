package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fyh1 {
    public final Context a;
    public final q8n b;

    public /* synthetic */ fyh1(Context context, q8n q8nVar) {
        this.a = context;
        this.b = q8nVar;
    }

    public static Bitmap a(int i, Bitmap bitmap) {
        Matrix matrix = new Matrix();
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setScale(1.0f, -1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(270.0f);
                break;
            default:
                return bitmap;
        }
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static Bitmap c(File file) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            return null;
        }
        int i = 1;
        while (true) {
            int i2 = i * 2;
            if (Math.max(options.outWidth, options.outHeight) / i2 < 1600) {
                break;
            }
            i = i2;
        }
        String absolutePath = file.getAbsolutePath();
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inSampleSize = i;
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(absolutePath, options2);
        if (bitmapDecodeFile == null) {
            return null;
        }
        float fMax = 1600.0f / Math.max(bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight());
        if (fMax > 1.0f) {
            fMax = 1.0f;
        }
        if (fMax == 1.0f) {
            return bitmapDecodeFile;
        }
        int width = (int) (bitmapDecodeFile.getWidth() * fMax);
        if (width < 1) {
            width = 1;
        }
        int height = (int) (bitmapDecodeFile.getHeight() * fMax);
        if (height < 1) {
            height = 1;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeFile, width, height, true);
        bitmapDecodeFile.recycle();
        return bitmapCreateScaledBitmap;
    }

    public static void d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (file.exists() && !file.delete()) {
                Logger.d(l1d.m("Failed to delete feedback attachment: ", file.getName()), new Object[0]);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00b6 A[Catch: all -> 0x0098, Exception -> 0x009a, TRY_ENTER, TryCatch #4 {Exception -> 0x009a, blocks: (B:3:0x0033, B:16:0x005e, B:20:0x0067, B:25:0x007c, B:31:0x0094, B:36:0x009c, B:48:0x00b6, B:49:0x00b9, B:50:0x00bc, B:62:0x00cc, B:63:0x00cf), top: B:79:0x0033, outer: #5 }] */
    public File b(Uri uri) {
        int i;
        boolean z;
        UUID uuidRandomUUID = UUID.randomUUID();
        Context context = this.a;
        File file = new File(context.getCacheDir(), eqq.m("feedback_source_", uuidRandomUUID));
        File file2 = new File(context.getCacheDir(), "feedback_" + uuidRandomUUID + ".jpg");
        try {
            try {
                InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                if (inputStreamOpenInputStream == null) {
                    file.delete();
                    return null;
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[8192];
                        long j = 0;
                        while (true) {
                            int i2 = inputStreamOpenInputStream.read(bArr);
                            i = 1;
                            if (i2 < 0) {
                                z = true;
                                break;
                            }
                            j += (long) i2;
                            if (j > 20971520) {
                                z = false;
                                break;
                            }
                            fileOutputStream.write(bArr, 0, i2);
                            try {
                                throw th;
                            } catch (Throwable th) {
                                u890.p(inputStreamOpenInputStream, th);
                                throw th;
                            }
                        }
                        fileOutputStream.close();
                        inputStreamOpenInputStream.close();
                        if (!z) {
                            file.delete();
                            return null;
                        }
                        Bitmap bitmapC = c(file);
                        if (bitmapC == null) {
                            file.delete();
                            return null;
                        }
                        try {
                            i = new sm00(file).i(1, "Orientation");
                        } catch (Exception unused) {
                        }
                        Bitmap bitmapA = a(i, bitmapC);
                        try {
                            FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                            try {
                                if (!bitmapA.compress(Bitmap.CompressFormat.JPEG, 85, fileOutputStream2)) {
                                    throw new IllegalStateException("Check failed.");
                                }
                                fileOutputStream2.close();
                                if (bitmapA != bitmapC) {
                                    bitmapA.recycle();
                                }
                                bitmapC.recycle();
                                file.delete();
                                return file2;
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    u890.p(fileOutputStream2, th2);
                                    throw th3;
                                }
                            }
                        } catch (Throwable th4) {
                            if (bitmapA != bitmapC) {
                                bitmapA.recycle();
                            }
                            bitmapC.recycle();
                            throw th4;
                        }
                        if (bitmapA != bitmapC) {
                            bitmapA.recycle();
                        }
                        bitmapC.recycle();
                        throw th4;
                    } catch (Throwable th5) {
                        try {
                            throw th5;
                        } catch (Throwable th6) {
                            u890.p(fileOutputStream, th5);
                            throw th6;
                        }
                    }
                } catch (Throwable th7) {
                    throw th7;
                }
            } catch (Exception e) {
                file2.delete();
                Logger.e(e, "Failed to copy feedback attachment", new Object[0]);
                file.delete();
                return null;
            }
        } catch (Throwable th8) {
            file.delete();
            throw th8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(String str, onm onmVar) {
        eyh1 eyh1Var;
        if (onmVar instanceof eyh1) {
            eyh1Var = (eyh1) onmVar;
            int i = eyh1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                eyh1Var.c = i - Integer.MIN_VALUE;
            } else {
                eyh1Var = new eyh1(this, onmVar);
            }
        } else {
            eyh1Var = new eyh1(this, onmVar);
        }
        Object objY = eyh1Var.a;
        int i2 = eyh1Var.c;
        if (i2 == 0) {
            hm5.M(objY);
            kwb1 kwb1Var = new kwb1(this, str, (lnm) null, (byte) 23);
            eyh1Var.c = 1;
            objY = fn31.Y(this.b, kwb1Var, eyh1Var);
            d9n d9nVar = d9n.a;
            if (objY == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objY);
        }
        return objY;
    }

    public fyh1(Context context, q8n q8nVar, f95 f95Var) {
        this.a = context;
        this.b = q8nVar;
    }
}
