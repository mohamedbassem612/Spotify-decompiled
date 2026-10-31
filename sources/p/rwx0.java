package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rwx0 {
    public final String a;
    public final int b;
    public final Function0 c;

    public rwx0(int i, String str, Function0 function0) {
        this.a = str;
        this.b = i;
        this.c = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rwx0)) {
            return false;
        }
        rwx0 rwx0Var = (rwx0) obj;
        return u890.j(this.a, rwx0Var.a) && this.b == rwx0Var.b && u890.j(this.c, rwx0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
