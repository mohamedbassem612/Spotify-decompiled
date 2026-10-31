package p;

import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import com.spotify.base.java.logging.Logger;
import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zxa {
    public final Context a;
    public final gya b;
    public final eyh0 c;
    public final o771 d;
    public final iyu e;

    public zxa(Context context, gya gyaVar, eyh0 eyh0Var, o771 o771Var, iyu iyuVar) {
        this.a = context;
        this.b = gyaVar;
        this.c = eyh0Var;
        this.d = o771Var;
        this.e = iyuVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Comparable a(String str, onm onmVar) {
        vxa vxaVar;
        if (onmVar instanceof vxa) {
            vxaVar = (vxa) onmVar;
            int i = vxaVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vxaVar.c = i - Integer.MIN_VALUE;
            } else {
                vxaVar = new vxa(this, onmVar);
            }
        } else {
            vxaVar = new vxa(this, onmVar);
        }
        Object objR = vxaVar.a;
        int i2 = vxaVar.c;
        if (i2 == 0) {
            hm5.M(objR);
            vxaVar.c = 1;
            ohd ohdVar = new ohd(1, aym.t(vxaVar));
            ohdVar.t();
            MediaScannerConnection.scanFile(this.a.getApplicationContext(), new String[]{str}, null, new wxa(ohdVar, (byte) 0));
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
        eg.m("Failed to scan saved image file");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00b5 A[Catch: Exception -> 0x0061, TryCatch #4 {Exception -> 0x0061, blocks: (B:64:0x0121, B:76:0x0149, B:75:0x0146, B:27:0x005b, B:49:0x00df, B:32:0x0068, B:42:0x00b5, B:43:0x00b9, B:44:0x00c0, B:35:0x0075, B:38:0x007f, B:45:0x00c1, B:68:0x012c, B:70:0x0134, B:72:0x013a), top: B:87:0x002f, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b9 A[Catch: Exception -> 0x0061, TryCatch #4 {Exception -> 0x0061, blocks: (B:64:0x0121, B:76:0x0149, B:75:0x0146, B:27:0x005b, B:49:0x00df, B:32:0x0068, B:42:0x00b5, B:43:0x00b9, B:44:0x00c0, B:35:0x0075, B:38:0x007f, B:45:0x00c1, B:68:0x012c, B:70:0x0134, B:72:0x013a), top: B:87:0x002f, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0101  */
    /* JADX WARN: Code duplicated, block: B:53:0x0102  */
    /* JADX WARN: Code duplicated, block: B:55:0x0105  */
    /* JADX WARN: Code duplicated, block: B:56:0x0106  */
    /* JADX WARN: Code duplicated, block: B:58:0x0109  */
    /* JADX WARN: Code duplicated, block: B:59:0x010a A[Catch: Exception -> 0x0128, PHI: r1 r9
      0x010a: PHI (r1v17 p.l420) = (r1v15 p.l420), (r1v25 p.l420) binds: [B:57:0x0107, B:23:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x010a: PHI (r9v4 android.graphics.Bitmap) = (r9v3 android.graphics.Bitmap), (r9v6 android.graphics.Bitmap) binds: [B:57:0x0107, B:23:0x0050] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {Exception -> 0x0128, blocks: (B:59:0x010a, B:50:0x00e1), top: B:81:0x00e1 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x011d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0134 A[Catch: Exception -> 0x0145, TryCatch #2 {Exception -> 0x0145, blocks: (B:68:0x012c, B:70:0x0134, B:72:0x013a), top: B:83:0x012c, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:88:? A[ADDED_TO_REGION, Catch: Exception -> 0x0061, REMOVE, SYNTHETIC, TRY_LEAVE, TryCatch #4 {Exception -> 0x0061, blocks: (B:64:0x0121, B:76:0x0149, B:75:0x0146, B:27:0x005b, B:49:0x00df, B:32:0x0068, B:42:0x00b5, B:43:0x00b9, B:44:0x00c0, B:35:0x0075, B:38:0x007f, B:45:0x00c1, B:68:0x012c, B:70:0x0134, B:72:0x013a), top: B:87:0x002f, inners: #2 }] */
    public final Object b(Bitmap bitmap, onm onmVar) throws Exception {
        xxa xxaVar;
        Bitmap bitmap2;
        Bitmap bitmap3;
        Uri uri;
        l420 l420Var;
        Object objY;
        l420 l420Var2;
        Comparable comparableA;
        Exception exc;
        if (onmVar instanceof xxa) {
            xxaVar = (xxa) onmVar;
            int i = xxaVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                xxaVar.e = i - Integer.MIN_VALUE;
            } else {
                xxaVar = new xxa(this, onmVar);
            }
        } else {
            xxaVar = new xxa(this, onmVar);
        }
        Object objY2 = xxaVar.c;
        int i2 = xxaVar.e;
        rih1 rih1Var = rih1.a;
        gya gyaVar = this.b;
        jyu jyuVar = this.e;
        Comparable comparable = d9n.a;
        try {
            if (i2 == 0) {
                hm5.M(objY2);
                jyuVar.a();
                int i3 = Build.VERSION.SDK_INT;
                eyh0 eyh0Var = this.c;
                if (i3 >= 29) {
                    String strH = eyh0.h(".png");
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("_display_name", strH);
                    contentValues.put("mime_type", "image/png");
                    contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
                    xxaVar.a = null;
                    xxaVar.b = null;
                    xxaVar.e = 1;
                    objY2 = fn31.Y(gyaVar.d, new el0(gyaVar, contentValues, bitmap, (lnm) null, (byte) 10), xxaVar);
                    if (objY2 == comparable) {
                    }
                    if (objY2 != null) {
                        throw new IllegalStateException("Failed to save image to MediaStore");
                    }
                    uri = (Uri) objY2;
                } else {
                    bitmap2 = null;
                    String strH2 = eyh0.h(".png");
                    xxaVar.a = bitmap;
                    xxaVar.e = 2;
                    objY2 = fn31.Y((q8n) eyh0Var.d, new lm61(eyh0Var, strH2, bitmap2, (byte) 9), xxaVar);
                    if (objY2 != comparable) {
                        bitmap3 = bitmap;
                        l420Var = (l420) objY2;
                        xxaVar.a = bitmap2;
                        xxaVar.b = l420Var;
                        xxaVar.e = 3;
                        objY = fn31.Y((q8n) gyaVar.f.b, new y160(gyaVar.b.a.l(l420Var), bitmap3, bitmap2, (byte) 6), xxaVar);
                        if (objY == comparable) {
                            objY = rih1Var;
                        }
                        if (objY == comparable) {
                            objY = rih1Var;
                        }
                        if (objY == comparable) {
                            String absolutePath = l420Var.b.getAbsolutePath();
                            xxaVar.a = bitmap2;
                            xxaVar.b = l420Var;
                            xxaVar.e = 4;
                            comparableA = a(absolutePath, xxaVar);
                            if (comparableA != comparable) {
                                l420Var2 = l420Var;
                                objY2 = comparableA;
                                uri = (Uri) objY2;
                            }
                        }
                    }
                }
                return comparable;
            }
            if (i2 == 1) {
                String str = xxaVar.b;
                hm5.M(objY2);
                if (objY2 != null) {
                    throw new IllegalStateException("Failed to save image to MediaStore");
                }
                uri = (Uri) objY2;
            } else {
                if (i2 == 2) {
                    bitmap3 = xxaVar.a;
                    hm5.M(objY2);
                    bitmap2 = null;
                    l420Var = (l420) objY2;
                    try {
                        xxaVar.a = bitmap2;
                        xxaVar.b = l420Var;
                        xxaVar.e = 3;
                        objY = fn31.Y((q8n) gyaVar.f.b, new y160(gyaVar.b.a.l(l420Var), bitmap3, bitmap2, (byte) 6), xxaVar);
                        if (objY == comparable) {
                            objY = rih1Var;
                        }
                        if (objY == comparable) {
                            objY = rih1Var;
                        }
                        if (objY == comparable) {
                            String absolutePath2 = l420Var.b.getAbsolutePath();
                            xxaVar.a = bitmap2;
                            xxaVar.b = l420Var;
                            xxaVar.e = 4;
                            comparableA = a(absolutePath2, xxaVar);
                            if (comparableA != comparable) {
                                l420Var2 = l420Var;
                                objY2 = comparableA;
                                uri = (Uri) objY2;
                            }
                        }
                        return comparable;
                    } catch (Exception e) {
                        e = e;
                        l420Var2 = l420Var;
                        exc = e;
                        if (l420Var2.b.exists()) {
                            throw exc;
                        }
                        throw exc;
                    }
                }
                if (i2 == 3) {
                    l420 l420Var3 = xxaVar.b;
                    try {
                        hm5.M(objY2);
                        l420Var = l420Var3;
                        bitmap2 = null;
                        String absolutePath3 = l420Var.b.getAbsolutePath();
                        xxaVar.a = bitmap2;
                        xxaVar.b = l420Var;
                        xxaVar.e = 4;
                        comparableA = a(absolutePath3, xxaVar);
                        if (comparableA != comparable) {
                            l420Var2 = l420Var;
                            objY2 = comparableA;
                            uri = (Uri) objY2;
                        }
                        return comparable;
                    } catch (Exception e2) {
                        exc = e2;
                        l420Var2 = l420Var3;
                        if (l420Var2.b.exists()) {
                            throw exc;
                        }
                        throw exc;
                    }
                }
                if (i2 != 4) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                l420Var2 = xxaVar.b;
                try {
                    hm5.M(objY2);
                    uri = (Uri) objY2;
                } catch (Exception e3) {
                    e = e3;
                    exc = e;
                    try {
                        if (l420Var2.b.exists() || l420Var2.delete()) {
                            throw exc;
                        }
                        j2h1.h(exc, new IllegalStateException("Failed to delete incomplete image file"));
                        throw exc;
                    } catch (Exception e4) {
                        j2h1.h(exc, e4);
                        throw exc;
                    }
                }
            }
            jyuVar.b(uri, "image/png");
            return rih1Var;
        } catch (Exception e5) {
            jyuVar.b.cancel(2131962276);
            throw e5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object c(Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i, onm onmVar) {
        yxa yxaVar;
        Bitmap bitmap2;
        Bitmap.CompressFormat compressFormat2;
        int i2;
        if (onmVar instanceof yxa) {
            yxaVar = (yxa) onmVar;
            int i3 = yxaVar.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                yxaVar.f = i3 - Integer.MIN_VALUE;
            } else {
                yxaVar = new yxa(this, onmVar);
            }
        } else {
            yxaVar = new yxa(this, onmVar);
        }
        Object objA = yxaVar.d;
        int i4 = yxaVar.f;
        d9n d9nVar = d9n.a;
        try {
            if (i4 == 0) {
                hm5.M(objA);
                String str = uxa.a[compressFormat.ordinal()] == 1 ? ".jpg" : ".png";
                o771 o771Var = this.d;
                yxaVar.a = bitmap;
                yxaVar.b = compressFormat;
                yxaVar.c = i;
                yxaVar.f = 1;
                objA = n771.a(o771Var, str, yxaVar);
                if (objA != d9nVar) {
                    bitmap2 = bitmap;
                    compressFormat2 = compressFormat;
                    i2 = i;
                }
            }
            if (i4 != 1) {
                if (i4 == 2) {
                    hm5.M(objA);
                    return objA;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i5 = yxaVar.c;
            Bitmap.CompressFormat compressFormat3 = yxaVar.b;
            Bitmap bitmap3 = yxaVar.a;
            hm5.M(objA);
            i2 = i5;
            compressFormat2 = compressFormat3;
            bitmap2 = bitmap3;
            l420 l420Var = (l420) objA;
            yxaVar.a = null;
            yxaVar.b = null;
            yxaVar.c = i2;
            yxaVar.f = 2;
            gya gyaVar = this.b;
            Object objY = fn31.Y(gyaVar.d, new yi3(gyaVar, l420Var, bitmap2, compressFormat2, i2, (lnm) null), yxaVar);
            return objY == d9nVar ? d9nVar : objY;
        } catch (IOException e) {
            Logger.e(e, "Failed to create temporary bitmap file", new Object[0]);
            return null;
        }
    }
}
