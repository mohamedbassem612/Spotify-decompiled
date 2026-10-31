package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Build;
import app.p000rive.semantics.SemanticState;
import com.spotify.base.java.logging.Logger;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class n080 implements j080 {
    public final Context a;
    public final q8n b;

    public n080(Context context, q8n q8nVar) {
        this.a = context;
        this.b = q8nVar;
    }

    public static void b(Bitmap bitmap, File file, int i) throws Exception {
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file), SemanticState.Multiline);
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, i, bufferedOutputStream);
                bufferedOutputStream.close();
                file.getAbsolutePath();
                file.length();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    u890.p(bufferedOutputStream, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            file.delete();
            throw e;
        }
    }

    public final Bitmap a(String str) throws IOException {
        int i;
        int i2;
        Uri uri = Uri.parse(str);
        int i3 = Build.VERSION.SDK_INT;
        Context context = this.a;
        if (i3 >= 28) {
            return ImageDecoder.decodeBitmap(ImageDecoder.createSource(context.getContentResolver(), uri), new k080(this));
        }
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
        if (inputStreamOpenInputStream == null) {
            hhg1.n(h4b1.d(uri, "Unable to open image: "));
            return null;
        }
        try {
            byte[] bArrK = o0c.K(inputStreamOpenInputStream);
            inputStreamOpenInputStream.close();
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrK);
                try {
                    i = new sm00(byteArrayInputStream).i(1, "Orientation");
                    byteArrayInputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        u890.p(byteArrayInputStream, th);
                        throw th2;
                    }
                }
            } catch (Exception e) {
                Logger.e(e, l1d.m("Error reading EXIF orientation: ", e.getMessage()), new Object[0]);
                i = 1;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArrK, 0, bArrK.length, options);
            int iMax = Math.max(options.outWidth, options.outHeight);
            if (iMax <= 3072) {
                i2 = 1;
            } else {
                i2 = 1;
                while (iMax / i2 > 3072) {
                    i2 *= 2;
                }
            }
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inSampleSize = i2;
            options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrK, 0, bArrK.length, options2);
            if (bitmapDecodeByteArray == null) {
                hhg1.n(h4b1.d(uri, "Unable to decode image: "));
                return null;
            }
            if (i == 0 || i == 1) {
                return bitmapDecodeByteArray;
            }
            Matrix matrix = new Matrix();
            switch (i) {
                case 2:
                    matrix.preScale(-1.0f, 1.0f);
                    break;
                case 3:
                    matrix.postRotate(180.0f);
                    break;
                case 4:
                    matrix.preScale(1.0f, -1.0f);
                    break;
                case 5:
                    matrix.postRotate(90.0f);
                    matrix.preScale(-1.0f, 1.0f);
                    break;
                case 6:
                    matrix.postRotate(90.0f);
                    break;
                case 7:
                    matrix.postRotate(-90.0f);
                    matrix.preScale(-1.0f, 1.0f);
                    break;
                case 8:
                    matrix.postRotate(270.0f);
                    break;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, true);
            bitmapDecodeByteArray.recycle();
            return bitmapCreateBitmap;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                u890.p(inputStreamOpenInputStream, th3);
                throw th4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, dx70 dx70Var, c5a c5aVar, onm onmVar) {
        l080 l080Var;
        if (onmVar instanceof l080) {
            l080Var = (l080) onmVar;
            int i = l080Var.c;
            if ((i & os00.INVALID_ID) != 0) {
                l080Var.c = i - os00.INVALID_ID;
            } else {
                l080Var = new l080(this, onmVar);
            }
        } else {
            l080Var = new l080(this, onmVar);
        }
        Object objY = l080Var.a;
        int i2 = l080Var.c;
        if (i2 == 0) {
            hm5.M(objY);
            m080 m080Var = new m080(c5aVar, this, str, dx70Var, null);
            l080Var.c = 1;
            objY = fn31.Y(this.b, m080Var, l080Var);
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
        return ((e331) objY).a;
    }
}
