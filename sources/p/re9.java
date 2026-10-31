package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class re9 {
    public final String a;
    public final ei9 b;
    public final fi9 c;
    public final Set d;

    public re9(String str, ei9 ei9Var, fi9 fi9Var, Set set) {
        this.a = str;
        this.b = ei9Var;
        this.c = fi9Var;
        this.d = set;
    }

    public final String a() {
        return this.a;
    }

    public final ei9 b() {
        return this.b;
    }

    public final Set c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re9)) {
            return false;
        }
        re9 re9Var = (re9) obj;
        return u890.j(this.a, re9Var.a) && this.b.equals(re9Var.b) && this.c == re9Var.c && this.d.equals(re9Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
