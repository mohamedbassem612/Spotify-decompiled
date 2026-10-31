package p;

import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xz5 {
    public final String a;
    public final c54 b;

    public xz5(String str, c54 c54Var) {
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        this.a = str;
        this.b = c54Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xz5)) {
            return false;
        }
        xz5 xz5Var = (xz5) obj;
        if (!u890.j(this.a, xz5Var.a)) {
            return false;
        }
        String str = Build.MODEL;
        if (!u890.j(str, str)) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        return u890.j(str2, str2) && this.b.equals(xz5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((ase0.LOG_ENVIRONMENT_PROD.hashCode() + cy30.d((((Build.MODEL.hashCode() + (this.a.hashCode() * 31)) * 31) + 47594039) * 31, 31, Build.VERSION.RELEASE)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=2.0.1, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + ase0.LOG_ENVIRONMENT_PROD + ", androidAppInfo=" + this.b + ')';
    }
}
