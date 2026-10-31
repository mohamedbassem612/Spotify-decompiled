package p;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class n930 {
    public static final ydf0 a = new ydf0(2);
    public static final fhn b = new fhn((byte) 2);

    public static na30 a(Context context, List list) {
        String str;
        Typeface typefaceC;
        Trace.beginSection("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                o930 o930Var = (o930) list.get(i);
                if (Build.VERSION.SDK_INT < 31 || (typefaceC = s1h1.c((str = o930Var.e))) == null || s1h1.d(typefaceC) == null) {
                    ProviderInfo providerInfoB = b(context.getPackageManager(), o930Var, context.getResources());
                    if (providerInfoB == null) {
                        return na30.a();
                    }
                    arrayList.add(c(context, o930Var, providerInfoB.authority));
                } else {
                    arrayList.add(new oa30[]{new oa30(str, o930Var.f)});
                }
            }
            return na30.b(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, o930 o930Var, Resources resources) {
        fhn fhnVar = b;
        ydf0 ydf0Var = a;
        Trace.beginSection("FontProvider.getProvider");
        try {
            List listH = o930Var.d;
            String str = o930Var.a;
            String str2 = o930Var.b;
            if (listH == null) {
                listH = s8p1.H(0, resources);
            }
            m930 m930Var = new m930();
            m930Var.a = str;
            m930Var.b = str2;
            m930Var.c = listH;
            ProviderInfo providerInfo = (ProviderInfo) ydf0Var.c(m930Var);
            if (providerInfo != null) {
                Trace.endSection();
                return providerInfo;
            }
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, fhnVar);
            for (int i = 0; i < listH.size(); i++) {
                ArrayList arrayList2 = new ArrayList((Collection) listH.get(i));
                Collections.sort(arrayList2, fhnVar);
                if (arrayList.size() == arrayList2.size()) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= arrayList.size()) {
                            ydf0Var.d(m930Var, providerInfoResolveContentProvider);
                            Trace.endSection();
                            return providerInfoResolveContentProvider;
                        }
                        if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            Trace.endSection();
            return null;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public static oa30[] c(Context context, o930 o930Var, String str) {
        Trace.beginSection("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            hl00 hl00VarK = hl00.k(context, uriBuild);
            Cursor cursorP = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                Trace.beginSection("ContentQueryWrapper.query");
                try {
                    String str2 = o930Var.f;
                    String str3 = o930Var.c;
                    cursorP = hl00VarK.p(uriBuild, strArr, (str2 == null || dv20.n(str2)) ? new String[]{str3} : new String[]{str3, "VF"});
                    Trace.endSection();
                    if (cursorP != null && cursorP.getCount() > 0) {
                        int columnIndex = cursorP.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursorP.getColumnIndex("_id");
                        int columnIndex3 = cursorP.getColumnIndex("file_id");
                        int columnIndex4 = cursorP.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorP.getColumnIndex("font_weight");
                        int columnIndex6 = cursorP.getColumnIndex("font_italic");
                        while (cursorP.moveToNext()) {
                            int i = columnIndex != -1 ? cursorP.getInt(columnIndex) : 0;
                            ArrayList arrayList3 = arrayList2;
                            arrayList3.add(new oa30(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorP.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorP.getLong(columnIndex3)), columnIndex4 != -1 ? cursorP.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorP.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorP.getInt(columnIndex6) == 1, o930Var.f, i));
                            arrayList2 = arrayList3;
                        }
                        arrayList = arrayList2;
                    }
                    if (cursorP != null) {
                        cursorP.close();
                    }
                    hl00VarK.e();
                    return (oa30[]) arrayList.toArray(new oa30[0]);
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                if (cursorP != null) {
                    cursorP.close();
                }
                hl00VarK.e();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }
}
