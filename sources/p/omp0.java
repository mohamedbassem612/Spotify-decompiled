package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class omp0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final Function0 f;

    public omp0(String str, String str2, String str3, String str4, boolean z, Function0 function0) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof omp0)) {
            return false;
        }
        omp0 omp0Var = (omp0) obj;
        return u890.j(this.a, omp0Var.a) && u890.j(this.b, omp0Var.b) && u890.j(this.c, omp0Var.c) && this.d.equals(omp0Var.d) && this.e == omp0Var.e && u890.j(this.f, omp0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + xcg1.g(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
