package p;

import android.net.Uri;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class soh0 {
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f136p;
    public final Uri a;
    public final String b;
    public final poh0 c;
    public final joh0 d;
    public final List e;
    public final String f;
    public final b380 g;
    public final long h;

    static {
        String str = zoi1.a;
        i = Integer.toString(0, 36);
        j = Integer.toString(1, 36);
        k = Integer.toString(2, 36);
        l = Integer.toString(3, 36);
        m = Integer.toString(4, 36);
        n = Integer.toString(5, 36);
        o = Integer.toString(6, 36);
        f136p = Integer.toString(7, 36);
    }

    public soh0(Uri uri, String str, poh0 poh0Var, joh0 joh0Var, List list, String str2, b380 b380Var, long j2) {
        this.a = uri;
        this.b = asj0.p(str);
        this.c = poh0Var;
        this.d = joh0Var;
        this.e = list;
        this.f = str2;
        this.g = b380Var;
        v280 v280VarM = b380.m();
        for (int i2 = 0; i2 < b380Var.size(); i2++) {
            voh0 voh0Var = (voh0) b380Var.get(i2);
            av7 av7Var = new av7();
            av7Var.c = voh0Var.a;
            av7Var.d = voh0Var.b;
            av7Var.e = voh0Var.c;
            av7Var.a = voh0Var.d;
            av7Var.b = voh0Var.e;
            av7Var.f = voh0Var.f;
            av7Var.g = voh0Var.g;
            v280VarM.c(new uoh0(av7Var));
        }
        v280VarM.g();
        this.h = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof soh0)) {
            return false;
        }
        soh0 soh0Var = (soh0) obj;
        if (!this.a.equals(soh0Var.a) || !Objects.equals(this.b, soh0Var.b) || !Objects.equals(this.c, soh0Var.c) || !Objects.equals(this.d, soh0Var.d) || !this.e.equals(soh0Var.e) || !Objects.equals(this.f, soh0Var.f)) {
            return false;
        }
        b380 b380Var = soh0Var.g;
        b380 b380Var2 = this.g;
        b380Var2.getClass();
        return z1p1.j(b380Var2, b380Var) && this.h == soh0Var.h;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        poh0 poh0Var = this.c;
        int iHashCode3 = (iHashCode2 + (poh0Var == null ? 0 : poh0Var.hashCode())) * 31;
        joh0 joh0Var = this.d;
        int iHashCode4 = (this.e.hashCode() + ((iHashCode3 + (joh0Var == null ? 0 : joh0Var.hashCode())) * 31)) * 31;
        String str2 = this.f;
        return (int) ((((long) ((this.g.hashCode() + ((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31)) * 31) + this.h);
    }
}
