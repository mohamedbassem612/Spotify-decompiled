package org.chromium.net.httpflags;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.os.Trace;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import p.c8o;
import p.eo41;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class HttpFlagsLoader {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final String FLAGS_FILE_DIR_NAME = "app_httpflags";
    static final String FLAGS_FILE_NAME = "flags.binarypb";
    static final String FLAGS_FILE_PROVIDER_INTENT_ACTION = "android.net.http.FLAGS_FILE_PROVIDER";
    public static final String LOG_FLAG_NAME = "Cronet_log_me";
    public static final String TAG = "HttpFlagsLoader";
    private static ResolvedFlags sHttpFlags;
    private static final Object sLock = new Object();
    private static String sVersion;

    private HttpFlagsLoader() {
    }

    public static void flushHttpFlags() {
        sHttpFlags = null;
        sVersion = null;
    }

    private static File getFlagsFileFromProvider(ApplicationInfo applicationInfo) {
        return new File(new File(new File(applicationInfo.deviceProtectedDataDir), FLAGS_FILE_DIR_NAME), FLAGS_FILE_NAME);
    }

    public static ResolvedFlags getHttpFlags(Context context, String str, boolean z, boolean z2) {
        synchronized (sLock) {
            try {
                String str2 = sVersion;
                if (str2 != null && !str.equals(str2)) {
                    throw new IllegalStateException("getHttpFlags() called multiple times with different versions");
                }
                ResolvedFlags resolvedFlags = sHttpFlags;
                if (resolvedFlags != null) {
                    return resolvedFlags;
                }
                sVersion = str;
                eo41.a("HttpFlagsLoader#getHttpFlags loading flags");
                try {
                    Flags flagsLoad = !c8o.p(context).getBoolean("android.net.http.ReadHttpFlags", true) ? null : load(context);
                    if (flagsLoad == null) {
                        flagsLoad = (Flags) Flags.newBuilder().build();
                    }
                    ResolvedFlags resolvedFlagsResolve = ResolvedFlags.resolve(flagsLoad, context.getPackageName(), str, z2);
                    sHttpFlags = resolvedFlagsResolve;
                    ResolvedFlags.Value value = resolvedFlagsResolve.flags().get(LOG_FLAG_NAME);
                    if (value != null) {
                        value.getStringValue();
                    }
                    ResolvedFlags resolvedFlags2 = sHttpFlags;
                    Trace.endSection();
                    return resolvedFlags2;
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private static ApplicationInfo getProviderApplicationInfo(Context context) {
        eo41.a("HttpFlagsLoader#getProviderApplicationInfo");
        try {
            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(new Intent(FLAGS_FILE_PROVIDER_INTENT_ACTION), 1048576);
            if (resolveInfoResolveService == null) {
                Trace.endSection();
                return null;
            }
            ApplicationInfo applicationInfo = resolveInfoResolveService.serviceInfo.applicationInfo;
            Trace.endSection();
            return applicationInfo;
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static Flags load(Context context) {
        try {
            ApplicationInfo providerApplicationInfo = getProviderApplicationInfo(context);
            if (providerApplicationInfo == null) {
                return null;
            }
            new StringBuilder("Found application exporting HTTP flags: ").append(providerApplicationInfo.packageName);
            File flagsFileFromProvider = getFlagsFileFromProvider(providerApplicationInfo);
            new StringBuilder("HTTP flags file path: ").append(flagsFileFromProvider.getAbsolutePath());
            Flags flagsLoadFlagsFile = loadFlagsFile(flagsFileFromProvider);
            if (flagsLoadFlagsFile == null) {
                return null;
            }
            new StringBuilder("Successfully loaded HTTP flags: ").append(flagsLoadFlagsFile);
            return flagsLoadFlagsFile;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    private static Flags loadFlagsFile(File file) {
        eo41.a("HttpFlagsLoader#loadFlagsFile");
        try {
            try {
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        Flags delimitedFrom = Flags.parseDelimitedFrom(fileInputStream);
                        fileInputStream.close();
                        Trace.endSection();
                        return delimitedFrom;
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (FileNotFoundException unused) {
                file.getPath();
                Trace.endSection();
                return null;
            }
        } catch (IOException e) {
            throw new RuntimeException("Unable to read HTTP flags file", e);
        }
    }
}
