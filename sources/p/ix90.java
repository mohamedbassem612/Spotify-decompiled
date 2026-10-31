package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ix90 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final c380 e;

    public ix90(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = mqo1.A(Collections.singletonList(new phx(10, 0L, str2 == null ? "" : str2, (String) null, str3)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ix90)) {
            return false;
        }
        ix90 ix90Var = (ix90) obj;
        return u890.j(this.a, ix90Var.a) && u890.j(this.b, ix90Var.b) && u890.j(this.c, ix90Var.c) && this.d == ix90Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.d) + cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }
}
