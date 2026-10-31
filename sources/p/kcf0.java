package p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class kcf0 {
    public static final HashMap a = new HashMap();
    public static final HashSet b = new HashSet();
    public static final byte[] c = {80, 75, 3, 4};
    public static final byte[] d = {31, -117, 8};

    public static qdf0 a(String str, Callable callable, Runnable runnable) {
        fcf0 fcf0VarA = str == null ? null : gcf0.b.a(str);
        qdf0 qdf0Var = fcf0VarA != null ? new qdf0(fcf0VarA) : null;
        HashMap map = a;
        if (str != null && map.containsKey(str)) {
            qdf0Var = (qdf0) map.get(str);
        }
        if (qdf0Var != null) {
            if (runnable != null) {
                runnable.run();
            }
            return qdf0Var;
        }
        qdf0 qdf0Var2 = new qdf0(callable);
        if (str != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            qdf0Var2.b(new jcf0(str, atomicBoolean, (byte) 0));
            qdf0Var2.a(new jcf0(str, atomicBoolean, (byte) 1));
            if (!atomicBoolean.get()) {
                map.put(str, qdf0Var2);
                if (map.size() == 1) {
                    k();
                }
            }
        }
        return qdf0Var2;
    }

    public static odf0 b(Context context, String str, String str2) {
        fcf0 fcf0VarA = str2 == null ? null : gcf0.b.a(str2);
        if (fcf0VarA != null) {
            return new odf0(fcf0VarA);
        }
        try {
            ff01 ff01VarG = sj1.g(si1.v(context.getAssets().open(str)));
            if (j(ff01VarG, c).booleanValue()) {
                return h(context, new ZipInputStream(new ef01(ff01VarG)), str2);
            }
            return j(ff01VarG, d).booleanValue() ? c(new GZIPInputStream(new ef01(ff01VarG)), str2) : c(new ef01(ff01VarG), str2);
        } catch (IOException e) {
            return new odf0(e);
        }
    }

    public static odf0 c(InputStream inputStream, String str) {
        ff01 ff01VarG = sj1.g(si1.v(inputStream));
        String[] strArr = eha0.e;
        return d(new nha0(ff01VarG), str, true);
    }

    public static odf0 d(nha0 nha0Var, String str, boolean z) {
        try {
            fcf0 fcf0VarA = str == null ? null : gcf0.b.a(str);
            if (fcf0VarA != null) {
                return new odf0(fcf0VarA);
            }
            fcf0 fcf0VarA2 = lcf0.a(nha0Var);
            if (str != null) {
                gcf0.b.a.d(str, fcf0VarA2);
            }
            return new odf0(fcf0VarA2);
        } catch (Exception e) {
            return new odf0(e);
        } finally {
            if (z) {
                qpi1.b(nha0Var);
            }
        }
    }

    public static qdf0 e(int i, Context context, String str) {
        return a(str, new icf0(new WeakReference(context), context.getApplicationContext(), i, str), null);
    }

    public static odf0 f(int i, Context context, String str) {
        fcf0 fcf0VarA = str == null ? null : gcf0.b.a(str);
        if (fcf0VarA != null) {
            return new odf0(fcf0VarA);
        }
        try {
            ff01 ff01VarG = sj1.g(si1.v(context.getResources().openRawResource(i)));
            if (j(ff01VarG, c).booleanValue()) {
                return h(context, new ZipInputStream(new ef01(ff01VarG)), str);
            }
            if (!j(ff01VarG, d).booleanValue()) {
                return c(new ef01(ff01VarG), str);
            }
            try {
                return c(new GZIPInputStream(new ef01(ff01VarG)), str);
            } catch (IOException e) {
                return new odf0(e);
            }
        } catch (Resources.NotFoundException e2) {
            return new odf0(e2);
        }
    }

    public static qdf0 g(Context context, String str, String str2) {
        return a(str2, new hcf0(context, str, str2, (byte) 0), null);
    }

    public static odf0 h(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return i(context, zipInputStream, str);
        } finally {
            qpi1.b(zipInputStream);
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0114 A[Catch: IOException -> 0x0295, TryCatch #1 {IOException -> 0x0295, blocks: (B:7:0x0017, B:9:0x001d, B:12:0x0026, B:14:0x0032, B:60:0x0144, B:15:0x0037, B:17:0x0043, B:18:0x0048, B:20:0x0054, B:21:0x006b, B:24:0x0075, B:26:0x007d, B:28:0x0085, B:31:0x008f, B:33:0x0097, B:36:0x00a0, B:37:0x00a5, B:55:0x010a, B:57:0x0114, B:58:0x0131, B:54:0x00e9, B:59:0x0135, B:5:0x000f, B:38:0x00c3, B:47:0x00dc, B:53:0x00e8, B:52:0x00e5), top: B:114:0x000f, inners: #4 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:57:0x0114, please report this as an issue */
    public static odf0 i(Context context, ZipInputStream zipInputStream, String str) {
        fcf0 fcf0VarA;
        hdf0 hdf0Var;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            fcf0VarA = null;
        } else {
            try {
                fcf0VarA = gcf0.b.a(str);
            } catch (IOException e) {
                return new odf0(e);
            }
        }
        if (fcf0VarA != null) {
            return new odf0(fcf0VarA);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        fcf0 fcf0Var = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                ff01 ff01VarG = sj1.g(si1.v(zipInputStream));
                String[] strArr = eha0.e;
                fcf0Var = d(new nha0(ff01VarG), null, false).a;
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                String[] strArrSplit = name.split("/");
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split("/");
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                File file = new File(context.getCacheDir(), str2);
                new FileOutputStream(file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int i = zipInputStream.read(bArr);
                            if (i == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, i);
                        }
                        fileOutputStream.flush();
                        fileOutputStream.close();
                    } catch (Throwable th) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable unused) {
                    nue0.d("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ");
                    Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                    if (!file.delete()) {
                        nue0.c("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                    }
                    map2.put(str3, typefaceCreateFromFile);
                    nextEntry = zipInputStream.getNextEntry();
                }
                Typeface typefaceCreateFromFile2 = Typeface.createFromFile(file);
                if (!file.delete()) {
                    nue0.c("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                }
                map2.put(str3, typefaceCreateFromFile2);
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (fcf0Var == null) {
            return new odf0(new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            String str4 = (String) entry.getKey();
            Iterator it = ((HashMap) fcf0Var.c()).values().iterator();
            do {
                if (!it.hasNext()) {
                    hdf0Var = null;
                    break;
                }
                hdf0Var = (hdf0) it.next();
            } while (!hdf0Var.b().equals(str4));
            if (hdf0Var != null) {
                hdf0Var.f(qpi1.e((Bitmap) entry.getValue(), hdf0Var.e(), hdf0Var.c()));
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z = false;
            for (z830 z830Var : fcf0Var.f.values()) {
                if (z830Var.a().equals(entry2.getKey())) {
                    z830Var.c((Typeface) entry2.getValue());
                    z = true;
                }
            }
            if (!z) {
                nue0.c("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator it2 = ((HashMap) fcf0Var.c()).entrySet().iterator();
            while (it2.hasNext()) {
                hdf0 hdf0Var2 = (hdf0) ((Map.Entry) it2.next()).getValue();
                if (hdf0Var2 == null) {
                    return null;
                }
                String strB = hdf0Var2.b();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (strB.startsWith("data:") && strB.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(strB.substring(strB.indexOf(44) + 1), 0);
                        hdf0Var2.f(qpi1.e(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options), hdf0Var2.e(), hdf0Var2.c()));
                    } catch (IllegalArgumentException unused2) {
                        nue0.d("data URL did not have correct base64 format.");
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            gcf0.b.a.d(str, fcf0Var);
        }
        return new odf0(fcf0Var);
    }

    public static Boolean j(ff01 ff01Var, byte[] bArr) {
        try {
            ff01 ff01VarPeek = ff01Var.peek();
            for (byte b2 : bArr) {
                if (ff01VarPeek.d() != b2) {
                    return Boolean.FALSE;
                }
            }
            ff01VarPeek.close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            nue0.b();
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused2) {
            return Boolean.FALSE;
        }
    }

    public static void k() {
        ArrayList arrayList = new ArrayList(b);
        if (arrayList.size() <= 0) {
            return;
        }
        pze0.m(arrayList.get(0));
        throw null;
    }

    public static String l(Context context, int i) {
        return gvg.l(new StringBuilder("rawRes"), (context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_", i);
    }
}
