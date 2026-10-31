package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kqt0 {
    public final String a;
    public final String b;
    public final String c;
    public final Function0 d;

    public kqt0(String str, String str2, String str3, Function0 function0) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kqt0)) {
            return false;
        }
        kqt0 kqt0Var = (kqt0) obj;
        return u890.j(this.a, kqt0Var.a) && u890.j(this.b, kqt0Var.b) && u890.j(this.c, kqt0Var.c) && u890.j(this.d, kqt0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
