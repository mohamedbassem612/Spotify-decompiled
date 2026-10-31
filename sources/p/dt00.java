package p;

import androidx.media3.transformer.ExportException;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dt00 {
    public final long a;
    public final long b;
    public final int c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;
    public final int h;
    public final x8h i;
    public final int j;
    public final int k;
    public final int l;
    public final String m;
    public final String n;
    public final byte o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ExportException f42p;
    public final b380 q;

    /* JADX WARN: Multi-variable type inference failed */
    public dt00(bg11 bg11Var, long j, long j2, int i, int i2, int i3, String str, String str2, int i4, x8h x8hVar, int i5, int i6, int i7, String str3, String str4, int i8, ExportException exportException) {
        this.q = bg11Var;
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = str;
        this.g = str2;
        this.h = i4;
        this.i = x8hVar;
        this.j = i5;
        this.k = i6;
        this.l = i7;
        this.m = str3;
        this.n = str4;
        this.o = i8;
        this.f42p = exportException;
        a(str2, i8, bg11Var, 1);
        a(str4, i8, bg11Var, 2);
    }

    public static void a(String str, int i, bg11 bg11Var, int i2) {
        if (str == null || i == 1) {
            return;
        }
        char c = 0;
        w280 w280VarR = bg11Var.r(0);
        while (w280VarR.hasNext()) {
            ct00 ct00Var = (ct00) w280VarR.next();
            if ((i2 == 1 ? ct00Var.d : ct00Var.e) == null) {
                if (c == 1) {
                    return;
                } else {
                    c = 2;
                }
            } else if (c == 2) {
                return;
            } else {
                c = 1;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dt00)) {
            return false;
        }
        dt00 dt00Var = (dt00) obj;
        return Objects.equals(this.q, dt00Var.q) && this.a == dt00Var.a && this.b == dt00Var.b && this.c == dt00Var.c && this.d == dt00Var.d && this.e == dt00Var.e && Objects.equals(this.f, dt00Var.f) && Objects.equals(this.g, dt00Var.g) && this.h == dt00Var.h && Objects.equals(this.i, dt00Var.i) && this.j == dt00Var.j && this.k == dt00Var.k && this.l == dt00Var.l && Objects.equals(this.m, dt00Var.m) && Objects.equals(this.n, dt00Var.n) && this.o == dt00Var.o && this.f42p == dt00Var.f42p;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f42p) + ((((Objects.hashCode(this.n) + ((Objects.hashCode(this.m) + ((((((((Objects.hashCode(this.i) + ((((Objects.hashCode(this.g) + ((Objects.hashCode(this.f) + (((((((((((Objects.hashCode(this.q) * 31) + ((int) this.a)) * 31) + ((int) this.b)) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31)) * 31)) * 31) + this.h) * 31)) * 31) + this.j) * 31) + this.k) * 31) + this.l) * 31)) * 31)) * 31) + this.o) * 31);
    }
}
