package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Process;
import android.util.Base64;
import android.view.View;
import androidx.car.app.navigation.model.Maneuver;
import com.spotify.profile.editprofile.pictureselection.PictureSelectionActivity;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sra implements Callable {
    public final /* synthetic */ byte a;
    public final Object b;

    public sra(View view) {
        this.a = (byte) 26;
        this.b = new WeakReference(view);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        i5w0 i5w0Var;
        InputStream inputStreamOpenInputStream;
        int iU;
        l420[] l420VarArrC;
        byte b = this.a;
        uov0 uov0Var = tov0.a;
        Uri uriFromFile = null;
        rih1 rih1Var = rih1.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                s141 s141Var = ((esa) obj).a;
                s141Var.a.u(new vqv0(s141Var, (byte) 27));
                return rih1Var;
            case 1:
                return chs.d((chs) obj);
            case 2:
                return new rlv(((qlv) obj).a);
            case 3:
                return Long.valueOf(((h1y) obj).a.b());
            case 4:
                Bitmap bitmapV = wgo1.v((String) obj);
                if (bitmapV != null) {
                    return bitmapV;
                }
                hhg1.n("Required value was null.");
                return null;
            case 5:
                dt50 dt50Var = (dt50) obj;
                int i = dt50Var.f;
                String str = dt50Var.b;
                String str2 = dt50Var.c;
                if (dt50Var == dt50.h) {
                    return new ek40(str2, str, i == 3);
                }
                return new dk40(str2, str, dt50Var.d, dt50Var.e, i == 3, str);
            case 6:
                ((Runnable) obj).run();
                return null;
            case 7:
                return Boolean.valueOf(((jde0) obj).a.h(kde0.a, false));
            case 8:
                orj0 orj0Var = (orj0) obj;
                uov0 uov0Var2 = (uov0) orj0.b(System.getProperty("ro.odm.csc.spotify.music.partnerid"), new nrj0(orj0Var, (byte) 0));
                if (uov0Var2 != null) {
                    return uov0Var2;
                }
                uov0 uov0Var3 = (uov0) orj0.b(((zov0) orj0Var.c).e("ro.odm.csc.spotify.music.partnerid"), new r7j0(orj0Var, (byte) 11));
                return uov0Var3 != null ? uov0Var3 : uov0Var;
            case 9:
                yi7 yi7Var = (yi7) obj;
                yi7Var.e.set(true);
                try {
                    Process.setThreadPriority(10);
                    yi7Var.a();
                    Binder.flushPendingCommands();
                    yi7Var.b(null);
                    return null;
                } catch (Throwable th) {
                    try {
                        yi7Var.d.set(true);
                        throw th;
                    } catch (Throwable th2) {
                        yi7Var.b(null);
                        throw th2;
                    }
                }
            case 10:
                fkp0 fkp0Var = (fkp0) obj;
                ima1 ima1Var = (dma1) fkp0Var.e.getValue();
                long jB = fkp0Var.a.b();
                bma1 bma1Var = t0c0.p;
                bma1 bma1Var2 = t0c0.o;
                if (!ima1Var.n(bma1Var)) {
                    hma1 hma1VarEdit = ima1Var.edit();
                    hma1VarEdit.c(bma1Var, jB);
                    hma1VarEdit.h();
                } else if (jB >= ima1Var.j(bma1Var) + 1209600000) {
                    hma1 hma1VarEdit2 = ima1Var.edit();
                    hma1VarEdit2.a(bma1Var2, true);
                    hma1VarEdit2.h();
                }
                return rih1Var;
            case 11:
                ((bxp0) obj).c(true);
                return rih1Var;
            case 12:
                qlr0 qlr0Var = (qlr0) obj;
                if (qlr0.e.contains(Build.BRAND.toLowerCase(Locale.ENGLISH))) {
                    return new olr0(uov0Var);
                }
                ima1 ima1Var2 = qlr0Var.a.a;
                bma1 bma1Var3 = rlr0.b;
                if (ima1Var2.n(bma1Var3)) {
                    String strF = ima1Var2.f(bma1Var3);
                    if (strF == null) {
                        eg.m("Required value was null.");
                        return null;
                    }
                    i5w0Var = new i5w0(strF);
                } else {
                    i5w0Var = j5.a;
                }
                if (!i5w0Var.c()) {
                    return nlr0.a;
                }
                String str3 = (String) i5w0Var.b();
                if (str3 != null && str3.length() != 0) {
                    uov0Var = new uov0(str3, str3, false);
                }
                return new olr0(uov0Var);
            case 13:
                PictureSelectionActivity pictureSelectionActivity = (PictureSelectionActivity) obj;
                st60 st60Var = pictureSelectionActivity.i1;
                if (st60Var == null) {
                    u890.C("imageFileHelper");
                    throw null;
                }
                Uri uri = pictureSelectionActivity.r1;
                uri.getClass();
                dg30 dg30Var = (dg30) st60Var.d;
                InputStream inputStreamOpenInputStream2 = dg30Var.getContentResolver().openInputStream(uri);
                if (inputStreamOpenInputStream2 != null) {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeStream(inputStreamOpenInputStream2, null, options);
                    inputStreamOpenInputStream2.close();
                    InputStream inputStreamOpenInputStream3 = dg30Var.getContentResolver().openInputStream(uri);
                    if (inputStreamOpenInputStream3 != null) {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        int i2 = 1;
                        while (((options.outWidth / 2) / i2) * ((options.outHeight / 2) / i2) >= 4000000) {
                            i2 *= 2;
                            break;
                        }
                        options2.inSampleSize = i2;
                        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream3, null, options2);
                        inputStreamOpenInputStream3.close();
                        if (bitmapDecodeStream != null && (inputStreamOpenInputStream = dg30Var.getContentResolver().openInputStream(uri)) != null) {
                            sm00 sm00Var = new sm00(inputStreamOpenInputStream);
                            inputStreamOpenInputStream.close();
                            int i3 = sm00Var.i(1, "Orientation");
                            Matrix matrix = new Matrix();
                            int width = bitmapDecodeStream.getWidth();
                            int height = bitmapDecodeStream.getHeight();
                            int i4 = 2000;
                            if (width > 2000 || height > 2000) {
                                float f = width;
                                float f2 = height;
                                float f3 = f / f2;
                                if (1.0f > f3) {
                                    int iU2 = jch0.U(2000.0f * f3);
                                    iU = 2000;
                                    i4 = iU2;
                                } else {
                                    iU = jch0.U(2000.0f / f3);
                                }
                                matrix.setScale(i4 / f, iU / f2);
                            }
                            g2p1.J(matrix, i3);
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrix, true);
                            if (bitmapCreateBitmap != null) {
                                File fileQ = st60Var.q(true);
                                if (fileQ == null) {
                                    fileQ = null;
                                } else {
                                    r420 r420VarL = ((oi) st60Var.c).l(fileQ);
                                    bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, r420VarL);
                                    r420VarL.close();
                                }
                                if (fileQ != null) {
                                    uriFromFile = Uri.fromFile(fileQ);
                                }
                            }
                        }
                    }
                }
                uriFromFile.getClass();
                return uriFromFile;
            case 14:
                hma1 hma1VarEdit3 = ((dma1) ((tku0) obj).e.getValue()).edit();
                hma1VarEdit3.a(t0c0.l, true);
                hma1VarEdit3.h();
                return rih1Var;
            case 15:
                hma1 hma1VarEdit4 = ((dma1) ((tku0) obj).e.getValue()).edit();
                hma1VarEdit4.a(t0c0.m, true);
                hma1VarEdit4.h();
                return rih1Var;
            case 16:
                b7w0[] b7w0VarArrValues = b7w0.values();
                c7w0 c7w0Var = (c7w0) obj;
                ArrayList arrayList = new ArrayList(b7w0VarArrValues.length);
                for (b7w0 b7w0Var : b7w0VarArrValues) {
                    String string = c7w0Var.a.getString(b7w0Var.a);
                    float[] fArr = b7w0Var.b;
                    ArrayList arrayList2 = new ArrayList(6);
                    int i5 = 0;
                    int i6 = 0;
                    while (i5 < 6) {
                        arrayList2.add(new n620(l1d.H(6)[i6], fArr[i5]));
                        i5++;
                        i6++;
                    }
                    arrayList.add(new r6w0(string, arrayList2));
                }
                return o7h.a1(arrayList, new ktg0((byte) 14));
            case 17:
                return ((bvw0) obj).a.a();
            case 18:
                dt50 dt50Var2 = (dt50) f46.n0(((eqy0) obj).a.l(fqy0.a, fqy0.b.ordinal()), dt50.values());
                return dt50Var2 == null ? dt50.g : dt50Var2;
            case 19:
                return (List) qyo1.x(((rrz0) ((xaz0) obj).b).a, true, false, new ldz0(1, (byte) 5));
            case 20:
                return ((gn01) obj).a();
            case 21:
                Date date = xd.Y;
                return new md50(fuo1.s(), "me", (Bundle) obj, a370.a, (id50) null, 48).c();
            case 22:
                return Boolean.valueOf(((dma1) ((zgz0) obj).b).h(lu71.a, true));
            case 23:
                return Boolean.valueOf(((c6b1) obj).c.h(c6b1.f, false));
            case 24:
                return upn1.k(((q7b1) obj).b.a);
            case 25:
                nma0 nma0Var = nrb1.c;
                nrb1 nrb1Var = (nrb1) obj;
                Context context = nrb1Var.b;
                nfa0 nfa0Var = nrb1Var.a;
                File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/" + context.getResources().getResourceEntryName(2131886091) + ".json");
                try {
                    InputStream fileInputStream = file.exists() ? new FileInputStream(file) : context.getResources().openRawResource(2131886091);
                    fileInputStream.getClass();
                    List list = (List) nfa0Var.a(new String(o0c.K(fileInputStream), nne.a), nrb1.c);
                    return list == null ? z6x.a : list;
                } catch (IOException e) {
                    throw new IOException("Failed to load RAW resource #2131886091", e);
                }
            case 26:
                View view = (View) ((WeakReference) obj).get();
                if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                    return "";
                }
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                view.draw(new Canvas(bitmapCreateBitmap2));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap2.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
                return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return flk1.b((flk1) obj);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                orj0 orj0Var2 = (orj0) obj;
                String strA = hlk1.a();
                if (jhc1.F(strA) || (l420VarArrC = ((cpv0) ((dpv0) orj0Var2.c)).a.k(strA).c(new glk1())) == null || l420VarArrC.length == 0) {
                    return uov0Var;
                }
                l420 l420Var = l420VarArrC[0];
                String strSubstring = l420Var.b.getName().substring(16, l420Var.b.getName().length() - 4);
                return new uov0(strSubstring, strSubstring, false);
            default:
                return new e331(((h5l1) obj).a.b());
        }
    }

    public /* synthetic */ sra(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj2;
    }

    public /* synthetic */ sra(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
