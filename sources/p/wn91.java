package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wn91 {
    public final String a;
    public final dj71 b;
    public final qv61 c;

    public wn91(String str, dj71 dj71Var, qv61 qv61Var) {
        this.a = str;
        this.b = dj71Var;
        this.c = qv61Var;
    }

    public final vu30 a() {
        return this.b;
    }

    public final Function0 b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wn91) {
            wn91 wn91Var = (wn91) obj;
            return u890.j(this.a, wn91Var.a) && this.b == wn91Var.b && this.c == wn91Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
