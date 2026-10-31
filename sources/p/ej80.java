package p;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ej80 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ Uri c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ej80(Context context, Uri uri, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = context;
        this.c = uri;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new ej80(this.b, this.c, lnmVar, (byte) 0);
            case 1:
                return new ej80(this.b, this.c, lnmVar, (byte) 1);
            case 2:
                return new ej80(this.b, this.c, lnmVar, (byte) 2);
            case 3:
                return new ej80(this.b, this.c, lnmVar, (byte) 3);
            default:
                return new ej80(this.b, this.c, lnmVar, (byte) 4);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Code duplicated, block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:78:0x0119  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final Object invokeSuspend(Object obj) throws Throwable {
        long j;
        oqj1 oqj1Var;
        Long lD0;
        byte b = this.a;
        int i = 1;
        long j2 = 0;
        File file = 0;
        j2 = 0;
        Uri uri = this.c;
        Bitmap bitmapDecodeStream = null;
        Context context = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                ContentResolver contentResolver = context.getContentResolver();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                if (inputStreamOpenInputStream != null) {
                    try {
                        BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                        inputStreamOpenInputStream.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            u890.p(inputStreamOpenInputStream, th);
                            throw th2;
                        }
                    }
                }
                while (true) {
                    int i2 = i * 2;
                    if (Math.max(options.outWidth, options.outHeight) / i2 < 256) {
                        options.inSampleSize = i;
                        options.inJustDecodeBounds = false;
                        InputStream inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                        if (inputStreamOpenInputStream2 != null) {
                            try {
                                bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream2, null, options);
                                inputStreamOpenInputStream2.close();
                            } catch (Throwable th3) {
                                try {
                                    throw th3;
                                } catch (Throwable th4) {
                                    u890.p(inputStreamOpenInputStream2, th3);
                                    throw th4;
                                }
                            }
                        }
                        return bitmapDecodeStream;
                    }
                    i = i2;
                }
                break;
            case 1:
                hm5.M(obj);
                ContentResolver contentResolver2 = context.getContentResolver();
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inJustDecodeBounds = true;
                InputStream inputStreamOpenInputStream3 = contentResolver2.openInputStream(uri);
                if (inputStreamOpenInputStream3 != null) {
                    try {
                        BitmapFactory.decodeStream(inputStreamOpenInputStream3, null, options2);
                        inputStreamOpenInputStream3.close();
                    } catch (Throwable th5) {
                        try {
                            throw th5;
                        } catch (Throwable th6) {
                            u890.p(inputStreamOpenInputStream3, th5);
                            throw th6;
                        }
                    }
                }
                while (true) {
                    int i3 = i * 2;
                    if (Math.max(options2.outWidth, options2.outHeight) / i3 < 512) {
                        options2.inSampleSize = i;
                        options2.inJustDecodeBounds = false;
                        InputStream inputStreamOpenInputStream4 = contentResolver2.openInputStream(uri);
                        if (inputStreamOpenInputStream4 != null) {
                            try {
                                bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream4, null, options2);
                                inputStreamOpenInputStream4.close();
                            } catch (Throwable th7) {
                                try {
                                    throw th7;
                                } catch (Throwable th8) {
                                    u890.p(inputStreamOpenInputStream4, th7);
                                    throw th8;
                                }
                            }
                        }
                        return bitmapDecodeStream;
                    }
                    i = i3;
                }
                break;
            case 2:
                hm5.M(obj);
                try {
                    Cursor cursorQuery = context.getContentResolver().query(this.c, new String[]{"_size"}, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_size");
                                if (!cursorQuery.isNull(columnIndexOrThrow)) {
                                    j = cursorQuery.getLong(columnIndexOrThrow);
                                } else {
                                    j = 0;
                                }
                            } else {
                                j = 0;
                            }
                            cursorQuery.close();
                            j2 = j;
                            break;
                        } catch (Throwable th9) {
                            try {
                                throw th9;
                            } catch (Throwable th10) {
                                u890.p(cursorQuery, th9);
                                throw th10;
                            }
                        }
                    }
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception unused) {
                }
                return new Long(j2);
            case 3:
                hm5.M(obj);
                try {
                    try {
                        try {
                            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                            try {
                                mediaMetadataRetriever.setDataSource(context, uri);
                                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
                                long jLongValue = ((strExtractMetadata == null || (lD0 = nhc1.d0(10, strExtractMetadata)) == null) ? 0L : lD0.longValue()) / 1000;
                                Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(0L);
                                try {
                                    if (frameAtTime != null) {
                                        try {
                                            File fileCreateTempFile = File.createTempFile("video_thumb_", ".jpg", context.getCacheDir());
                                            try {
                                                fileCreateTempFile.getClass();
                                                FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                                                try {
                                                    frameAtTime.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
                                                    fileOutputStream.close();
                                                    oqj1Var = new oqj1(Uri.fromFile(fileCreateTempFile).toString(), jLongValue);
                                                    frameAtTime.recycle();
                                                } catch (Throwable th11) {
                                                    try {
                                                        throw th11;
                                                    } catch (Throwable th12) {
                                                        u890.p(fileOutputStream, th11);
                                                        throw th12;
                                                    }
                                                }
                                            } catch (Throwable th13) {
                                                th = th13;
                                                frameAtTime.recycle();
                                                throw th;
                                            }
                                        } catch (Throwable th14) {
                                            th = th14;
                                        }
                                    } else {
                                        oqj1Var = null;
                                    }
                                    mediaMetadataRetriever.release();
                                    return oqj1Var;
                                } catch (Throwable th15) {
                                    th = th15;
                                    mediaMetadataRetriever.release();
                                    throw th;
                                }
                            } catch (Throwable th16) {
                                th = th16;
                            }
                        } catch (Exception unused2) {
                            file = 0;
                            if (file != 0) {
                                return null;
                            }
                            file.delete();
                            return null;
                        }
                    } catch (CancellationException e2) {
                        throw e2;
                    }
                } catch (Exception unused3) {
                    if (file != 0) {
                        return null;
                    }
                    file.delete();
                    return null;
                }
                break;
            default:
                hm5.M(obj);
                try {
                    MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
                    try {
                        mediaMetadataRetriever2.setDataSource(context, uri);
                        Bitmap frameAtTime2 = mediaMetadataRetriever2.getFrameAtTime(0L);
                        if (frameAtTime2 == null) {
                            frameAtTime2 = null;
                        } else if (frameAtTime2.getWidth() > 256 || frameAtTime2.getHeight() > 256) {
                            float fMax = 256.0f / Math.max(frameAtTime2.getWidth(), frameAtTime2.getHeight());
                            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(frameAtTime2, (int) (frameAtTime2.getWidth() * fMax), (int) (frameAtTime2.getHeight() * fMax), true);
                            if (bitmapCreateScaledBitmap != frameAtTime2) {
                                frameAtTime2.recycle();
                            }
                            frameAtTime2 = bitmapCreateScaledBitmap;
                            break;
                        }
                        mediaMetadataRetriever2.release();
                        return frameAtTime2;
                    } catch (Throwable th17) {
                        mediaMetadataRetriever2.release();
                        throw th17;
                    }
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Exception unused4) {
                    return null;
                }
        }
    }
}
