package p;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import java.lang.reflect.Method;
import org.chromium.net.ApiVersion;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class f8o {
    public static final mz40 a = mz40.b;
    public static final Object b = new Object();
    public static gjv c = null;
    public static String d = "0";

    public static void a(Context context) {
        gjv gjvVar;
        Object obj = b;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    gjvVar = c;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (gjvVar != null) {
            return;
        }
        zod.t(context, "Context must not be null");
        ClassLoader classLoader = f8o.class.getClassLoader();
        zod.s(classLoader);
        try {
            classLoader.loadClass("org.chromium.net.CronetEngine");
            int apiLevel = ApiVersion.getApiLevel();
            mz40 mz40Var = a;
            mz40Var.getClass();
            h450.a(context);
            try {
                gjv gjvVarC = gjv.c(context, gjv.b, "com.google.android.gms.cronet_dynamite");
                try {
                    Class<?> clsLoadClass = gjvVarC.a.getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                    if (clsLoadClass.getClassLoader() == f8o.class.getClassLoader()) {
                        throw new GooglePlayServicesNotAvailableException(8);
                    }
                    Method method = clsLoadClass.getMethod("getApiLevel", null);
                    Method method2 = clsLoadClass.getMethod("getCronetVersion", null);
                    Integer num = (Integer) method.invoke(null, null);
                    zod.s(num);
                    int iIntValue = num.intValue();
                    String str = (String) method2.invoke(null, null);
                    zod.s(str);
                    d = str;
                    if (apiLevel <= iIntValue) {
                        c = gjvVarC;
                        return;
                    }
                    if (mz40Var.a(2, context, "cr") == null) {
                        throw new GooglePlayServicesNotAvailableException(2);
                    }
                    String str2 = d;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 174);
                    sb.append("Google Play Services update is required. The API Level of the client is ");
                    sb.append(apiLevel);
                    sb.append(". The API Level of the implementation is ");
                    sb.append(iIntValue);
                    sb.append(". The Cronet implementation version is ");
                    sb.append(str2);
                    throw new GooglePlayServicesRepairableException(sb.toString());
                } catch (Exception e) {
                    throw ((GooglePlayServicesNotAvailableException) new GooglePlayServicesNotAvailableException(8).initCause(e));
                }
            } catch (DynamiteModule$LoadingException e2) {
                throw ((GooglePlayServicesNotAvailableException) new GooglePlayServicesNotAvailableException(8).initCause(e2));
            }
        } catch (ClassNotFoundException e3) {
            throw ((GooglePlayServicesNotAvailableException) new GooglePlayServicesNotAvailableException(10).initCause(e3));
        }
    }
}
