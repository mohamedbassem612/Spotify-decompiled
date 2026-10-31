package p;

import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class c54 {
    public final String a;
    public final String b;
    public final String c;
    public final grw0 d;
    public final ArrayList e;

    public c54(String str, String str2, String str3, grw0 grw0Var, ArrayList arrayList) {
        String str4 = Build.MANUFACTURER;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = grw0Var;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c54)) {
            return false;
        }
        c54 c54Var = (c54) obj;
        if (!this.a.equals(c54Var.a) || !u890.j(this.b, c54Var.b) || !u890.j(this.c, c54Var.c)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return u890.j(str, str) && this.d.equals(c54Var.d) && this.e.equals(c54Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, Build.MANUFACTURER)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.a + ", versionName=" + this.b + ", appBuildVersion=" + this.c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.e + ')';
    }
}
