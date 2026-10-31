package com.spotify.externalintegration.service.provider;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import com.spotify.base.java.logging.Logger;
import com.spotify.externalintegration.service.events.proto.MediaProviderAccessDeniedNonAuth;
import java.util.regex.Pattern;
import p.c2u;
import p.eg;
import p.iuh0;
import p.kuh0;
import p.nhc1;
import p.pob;
import p.pw3;
import p.q8p;
import p.szc;
import p.t2j0;
import p.u9e;
import p.v9e;
import p.ve4;
import p.ynb0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class MediaProvider extends q8p {
    public ynb0 a;
    public ynb0 b;
    public ynb0 c;
    public ynb0 d;
    public ynb0 e;
    public ynb0 f;

    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String[] getStreamTypes(Uri uri, String str) {
        return ((kuh0) this.c.get()).a(uri, getCallingPackage()).l();
    }

    public final String getType(Uri uri) {
        return (uri.getPathSegments().size() <= 0 || !"canvas".equals(uri.getPathSegments().get(0))) ? "image/png" : "video/mp4";
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final boolean onCreate() {
        super.onCreate();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0062  */
    /* JADX WARN: Code duplicated, block: B:23:0x006d A[LOOP:1: B:19:0x0060->B:23:0x006d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:58:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        boolean z;
        PackageManager packageManager;
        String[] packagesForUid;
        int length;
        int i;
        String queryParameter;
        boolean zFind;
        boolean z2 = false;
        Logger.g("MediaProvider opening file.", new Object[0]);
        Context context = getContext();
        if (context == null) {
            return null;
        }
        pw3 pw3Var = (pw3) this.b.get();
        int callingUid = Binder.getCallingUid();
        String[] packagesForUid2 = context.getPackageManager().getPackagesForUid(callingUid);
        if (packagesForUid2 != null) {
            String name = getClass().getName();
            int length2 = packagesForUid2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    if (((ve4) this.d.get()).a() && (packagesForUid = (packageManager = context.getPackageManager()).getPackagesForUid(callingUid)) != null) {
                        length = packagesForUid.length;
                        i = 0;
                        while (true) {
                            if (i < length) {
                                if (packageManager.checkPermission("android.permission.BIND_APPWIDGET", packagesForUid[i]) != 0) {
                                    i++;
                                }
                            }
                        }
                    }
                    z = false;
                } else if (!pw3Var.a(context, new szc(packagesForUid2[i2], callingUid, name))) {
                    i2++;
                }
                z = true;
            }
        } else {
            if (((ve4) this.d.get()).a()) {
                length = packagesForUid.length;
                i = 0;
                while (true) {
                    if (i < length) {
                        if (packageManager.checkPermission("android.permission.BIND_APPWIDGET", packagesForUid[i]) != 0) {
                            z = true;
                        } else {
                            i++;
                        }
                    }
                }
            }
            z = false;
        }
        if (((u9e) this.e.get()).a()) {
            ((v9e) this.f.get()).getClass();
            String path = uri.getPath();
            if (path == null) {
                queryParameter = uri.getQueryParameter("cdn");
                if (queryParameter != null || queryParameter.length() == 0 || v9e.b.matcher(queryParameter).find()) {
                    zFind = false;
                } else {
                    zFind = v9e.a.matcher(queryParameter).find();
                }
            } else {
                if (nhc1.Y(path, "/", false)) {
                    path = path.substring(1);
                }
                Pattern pattern = v9e.a;
                if (pob.b(path)) {
                    zFind = true;
                } else {
                    queryParameter = uri.getQueryParameter("cdn");
                    if (queryParameter != null) {
                        zFind = false;
                    } else {
                        zFind = false;
                    }
                }
            }
            if (zFind) {
                z2 = true;
            }
        }
        if (z || z2) {
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                eg.m("Image loading should not happen on the main thread.");
                return null;
            }
            kuh0 kuh0Var = (kuh0) this.c.get();
            String callingPackage = getCallingPackage();
            return kuh0Var.a(uri, callingPackage).c(uri, context.getCacheDir(), callingPackage);
        }
        t2j0 t2j0Var = (t2j0) this.a.get();
        iuh0 iuh0VarN = MediaProviderAccessDeniedNonAuth.n();
        iuh0VarN.n(String.valueOf(getCallingPackage()));
        iuh0VarN.q(String.valueOf(uri.getQueryParameter("cdn")));
        iuh0VarN.r(c2u.a().toString());
        t2j0Var.a(iuh0VarN.build());
        return super/*android.content.ContentProvider*/.openFile(uri, str);
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
