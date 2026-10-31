package p;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mvy0 {
    public final Context a;
    public final yqg b;
    public final xmu0 c;
    public final xgn0 d = ygn0.a();
    public final idd1 e = new idd1(new h2y0(this, (byte) 19));

    public mvy0(Context context, yqg yqgVar, xmu0 xmu0Var) {
        this.a = context;
        this.b = yqgVar;
        this.c = xmu0Var;
    }

    public static long a(String str) {
        try {
            String str2 = (String) o7h.C0(ihc1.Q0(ihc1.Z0(ihc1.H0(str, "push_media"), "."), new String[]{"_"}, 0, 6));
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return 0L;
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00de A[Catch: all -> 0x013e, TryCatch #4 {all -> 0x013e, blocks: (B:32:0x00c9, B:34:0x00d7, B:53:0x010f, B:55:0x011e, B:57:0x0124, B:38:0x00de, B:41:0x00e3, B:52:0x010c, B:44:0x00eb, B:46:0x00f5, B:50:0x0107), top: B:75:0x00c9, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:52:0x010c A[Catch: all -> 0x013e, TryCatch #4 {all -> 0x013e, blocks: (B:32:0x00c9, B:34:0x00d7, B:53:0x010f, B:55:0x011e, B:57:0x0124, B:38:0x00de, B:41:0x00e3, B:52:0x010c, B:44:0x00eb, B:46:0x00f5, B:50:0x0107), top: B:75:0x00c9, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0140  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [p.q520] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    public final Comparable b(String str, int i, String str2, q520 q520Var, onm onmVar) throws Throwable {
        lvy0 lvy0Var;
        File file;
        String str3;
        ujm1 ujm1Var;
        xgn0 xgn0Var;
        String str4;
        xgn0 xgn0Var2;
        File[] fileArrListFiles;
        File file2;
        Uri uriForFile;
        int i2 = i;
        File file3 = q520Var;
        Context context = this.a;
        if (onmVar instanceof lvy0) {
            lvy0Var = (lvy0) onmVar;
            int i3 = lvy0Var.h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lvy0Var.h = i3 - Integer.MIN_VALUE;
            } else {
                lvy0Var = new lvy0(this, onmVar);
            }
        } else {
            lvy0Var = new lvy0(this, onmVar);
        }
        Object obj = lvy0Var.f;
        int i4 = lvy0Var.h;
        idd1 idd1Var = this.e;
        int i5 = 1;
        d9n d9nVar = d9n.a;
        try {
            if (i4 == 0) {
                hm5.M(obj);
                String strH = pze0.h(this.b.b(), file3.a, l1d.s(i2, "push_media_", nhc1.W(str, "_", ""), "_", "_"));
                File file4 = new File((File) idd1Var.getValue(), "temp_" + UUID.randomUUID() + file3.a);
                try {
                    xmu0 xmu0Var = this.c;
                    lvy0Var.a = strH;
                    lvy0Var.b = file4;
                    lvy0Var.e = i2;
                    lvy0Var.h = 1;
                    Object objK = xmu0Var.k(file4, str2, lvy0Var);
                    if (objK != d9nVar) {
                        obj = objK;
                        file = file4;
                        str3 = strH;
                    }
                    return d9nVar;
                } catch (IllegalArgumentException unused) {
                    file3 = file4;
                    file3.delete();
                    return null;
                } catch (Throwable th) {
                    th = th;
                    file3 = file4;
                    file3.delete();
                    throw th;
                }
            }
            if (i4 == 1) {
                i2 = lvy0Var.e;
                File file5 = lvy0Var.b;
                str3 = lvy0Var.a;
                hm5.M(obj);
                file = file5;
            } else {
                if (i4 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xgn0Var = lvy0Var.d;
                ujm1 ujm1Var2 = lvy0Var.c;
                File file6 = lvy0Var.b;
                str4 = lvy0Var.a;
                hm5.M(obj);
                ujm1Var = ujm1Var2;
                file3 = file6;
            }
            xgn0Var2 = xgn0Var;
            try {
                fileArrListFiles = ((File) idd1Var.getValue()).listFiles(kvy0.b);
                if (fileArrListFiles != null || fileArrListFiles.length >= 5) {
                    if (fileArrListFiles == null && fileArrListFiles.length != 0) {
                        file2 = fileArrListFiles[0];
                        int length = fileArrListFiles.length - 1;
                        if (length != 0) {
                            long jA = a(file2.getName());
                            if (1 <= length) {
                                while (true) {
                                    File file7 = fileArrListFiles[i5];
                                    long jA2 = a(file7.getName());
                                    if (jA > jA2) {
                                        file2 = file7;
                                        jA = jA2;
                                    }
                                    if (i5 == length) {
                                        break;
                                    }
                                    i5++;
                                }
                            }
                        }
                    } else {
                        file2 = null;
                    }
                    if (file2 != null) {
                        file2.delete();
                    }
                }
                File file8 = new File((File) idd1Var.getValue(), str4);
                if ((ujm1Var instanceof tjm1) || !file3.renameTo(file8)) {
                    uriForFile = null;
                } else {
                    uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".pushnotificationsv2", file8);
                }
                xgn0Var2.c((Object) null);
                file3.delete();
                return uriForFile;
            } catch (Throwable th2) {
                xgn0Var2.c((Object) null);
                throw th2;
            }
            ujm1Var = (ujm1) obj;
            xgn0Var = this.d;
            lvy0Var.a = str3;
            lvy0Var.b = file;
            lvy0Var.c = ujm1Var;
            lvy0Var.d = xgn0Var;
            lvy0Var.e = i2;
            lvy0Var.h = 2;
            if (xgn0Var.a(lvy0Var) != d9nVar) {
                str4 = str3;
                file3 = file;
                xgn0Var2 = xgn0Var;
                fileArrListFiles = ((File) idd1Var.getValue()).listFiles(kvy0.b);
                if (fileArrListFiles != null) {
                    if (fileArrListFiles == null) {
                        file2 = null;
                    } else {
                        file2 = null;
                    }
                    if (file2 != null) {
                        file2.delete();
                    }
                } else {
                    if (fileArrListFiles == null) {
                        file2 = null;
                    } else {
                        file2 = null;
                    }
                    if (file2 != null) {
                        file2.delete();
                    }
                }
                File file9 = new File((File) idd1Var.getValue(), str4);
                if (ujm1Var instanceof tjm1) {
                    uriForFile = null;
                } else {
                    uriForFile = null;
                }
                xgn0Var2.c((Object) null);
                file3.delete();
                return uriForFile;
            }
            return d9nVar;
        } catch (IllegalArgumentException unused2) {
            file3.delete();
            return null;
        } catch (Throwable th3) {
            th = th3;
            file3.delete();
            throw th;
        }
    }
}
