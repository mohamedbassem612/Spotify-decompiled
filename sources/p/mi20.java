package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mi20 {
    public final UUID a;
    public final String b;
    public final long c;
    public final qm81 d;

    public mi20(UUID uuid, String str, long j, qm81 qm81Var) {
        this.a = uuid;
        this.b = str;
        this.c = j;
        this.d = qm81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mi20)) {
            return false;
        }
        mi20 mi20Var = (mi20) obj;
        return u890.j(this.a, mi20Var.a) && u890.j(this.b, mi20Var.b) && this.c == mi20Var.c && this.d == mi20Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.f(cy30.d(this.a.hashCode() * 31, 31, this.b), this.c, 31);
    }
}
