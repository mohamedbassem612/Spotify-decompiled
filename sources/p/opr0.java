package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class opr0 extends fho1 {
    public final String d;
    public final boolean e;

    public opr0(String str, boolean z) {
        Objects.requireNonNull(str, "name == null");
        this.d = str;
        this.e = z;
    }

    public final void l(un21 un21Var, Object obj) {
        String str;
        if (obj == null || (str = (String) rbc.b.g(obj)) == null) {
            return;
        }
        be30 be30Var = un21Var.j;
        String str2 = this.d;
        if (this.e) {
            be30Var.b(str2, str);
        } else {
            be30Var.a(str2, str);
        }
    }
}
