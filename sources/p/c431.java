package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class c431 {
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final Bundle e;

    public c431(String str, int i, int i2, String str2, Bundle bundle) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c431)) {
            return false;
        }
        c431 c431Var = (c431) obj;
        return u890.j(this.a, c431Var.a) && this.b == c431Var.b && this.c == c431Var.c && u890.j(this.d, c431Var.d) && u890.j(this.e, c431Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int iF = kaa0.f(this.c, kaa0.f(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        String str2 = this.d;
        int iHashCode = (iF + (str2 == null ? 0 : str2.hashCode())) * 31;
        Bundle bundle = this.e;
        return iHashCode + (bundle != null ? bundle.hashCode() : 0);
    }
}
