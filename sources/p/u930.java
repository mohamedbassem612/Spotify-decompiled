package p;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class u930 {
    public static final ydf0 a = new ydf0(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final jv81 d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, (BlockingQueue<Runnable>) new LinkedBlockingDeque(), (ThreadFactory) new t550((byte) 5));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new jv81(0);
    }

    public static String a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((o930) list.get(i2)).g);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    public static t930 b(String str, Context context, List list, int i) {
        int i2;
        Typeface typefaceE0;
        ydf0 ydf0Var = a;
        Trace.beginSection("getFontSync");
        try {
            Typeface typeface = (Typeface) ydf0Var.c(str);
            if (typeface != null) {
                t930 t930Var = new t930(typeface);
                Trace.endSection();
                return t930Var;
            }
            try {
                na30 na30VarA = n930.a(context, list);
                List list2 = na30VarA.a;
                boolean z = na30VarA.b;
                if (!z) {
                    oa30[] oa30VarArrD = na30VarA.d();
                    if (oa30VarArrD == null || oa30VarArrD.length == 0) {
                        i2 = 1;
                    } else {
                        int length = oa30VarArrD.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                i2 = 0;
                                break;
                            }
                            int i4 = oa30VarArrD[i3].f;
                            if (i4 != 0) {
                                if (i4 >= 0) {
                                    i2 = i4;
                                    break;
                                }
                                i2 = -3;
                                break;
                            }
                            i3++;
                        }
                    }
                } else {
                    if (!z) {
                        i2 = -3;
                        break;
                    }
                    i2 = -2;
                }
                if (i2 != 0) {
                    t930 t930Var2 = new t930(i2);
                    Trace.endSection();
                    return t930Var2;
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    oa30[] oa30VarArrD2 = na30VarA.d();
                    k9 k9Var = s1h1.a;
                    Trace.beginSection("TypefaceCompat.createFromFontInfo");
                    try {
                        typefaceE0 = s1h1.a.E0(context, oa30VarArrD2, i);
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    k9 k9Var2 = s1h1.a;
                    Trace.beginSection("TypefaceCompat.createFromFontInfoWithFallback");
                    try {
                        typefaceE0 = s1h1.a.F0(context, list2, i);
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                if (typefaceE0 == null) {
                    t930 t930Var3 = new t930(-3);
                    Trace.endSection();
                    return t930Var3;
                }
                ydf0Var.d(str, typefaceE0);
                t930 t930Var4 = new t930(typefaceE0);
                Trace.endSection();
                return t930Var4;
            } catch (PackageManager.NameNotFoundException unused) {
                t930 t930Var5 = new t930(-1);
                Trace.endSection();
                return t930Var5;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }
}
