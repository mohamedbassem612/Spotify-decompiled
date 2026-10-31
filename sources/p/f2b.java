package p;

import androidx.compose.ui.graphics.ColorFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class f2b extends ColorFilter {
    public final long b;
    public final int c;

    public f2b(long j, int i) {
        super(bs51.i(i, j));
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2b)) {
            return false;
        }
        f2b f2bVar = (f2b) obj;
        long j = f2bVar.b;
        int i = u7h.l;
        return z4h1.b(this.b, j) && jm5.j(this.c, f2bVar.c);
    }

    public final int hashCode() {
        int i = u7h.l;
        return jm5.l(this.c) + (z4h1.c(this.b) * 31);
    }

    public final String toString() {
        return cy30.p("BlendModeColorFilter(color=", u7h.h(this.b), ", blendMode=", jm5.q(this.c), ")");
    }
}
