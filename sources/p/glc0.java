package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class glc0 {
    public final kly0 a;
    public final kly0 b;
    public final kly0 c;
    public final kly0 d;
    public final kly0 e;
    public final kly0 f;
    public final kly0 g;
    public final kly0 h;

    public glc0(jly0 jly0Var, jly0 jly0Var2, jly0 jly0Var3, jly0 jly0Var4, jly0 jly0Var5, jly0 jly0Var6, jly0 jly0Var7, jly0 jly0Var8) {
        this.a = jly0Var;
        this.b = jly0Var2;
        this.c = jly0Var3;
        this.d = jly0Var4;
        this.e = jly0Var5;
        this.f = jly0Var6;
        this.g = jly0Var7;
        this.h = jly0Var8;
    }

    public final flc0 a(Set set) {
        flc0 flc0Var;
        if (set.isEmpty()) {
            return (flc0) this.g.get();
        }
        int size = set.size();
        kly0 kly0Var = this.e;
        kly0 kly0Var2 = this.h;
        if (size != 1) {
            if (set.equals(hlc0.a)) {
                return (flc0) kly0Var.get();
            }
            return set.equals(hlc0.b) ? (flc0) this.f.get() : (flc0) kly0Var2.get();
        }
        int iOrdinal = ((blc0) o7h.U0(set)).ordinal();
        if (iOrdinal == 166) {
            flc0Var = (flc0) this.d.get();
        } else if (iOrdinal == 416) {
            flc0Var = (flc0) kly0Var.get();
        } else if (iOrdinal == 652) {
            flc0Var = (flc0) this.c.get();
        } else if (iOrdinal != 844) {
            flc0Var = iOrdinal != 926 ? (flc0) kly0Var2.get() : (flc0) this.a.get();
        } else {
            flc0Var = (flc0) this.b.get();
        }
        flc0Var.getClass();
        return flc0Var;
    }
}
