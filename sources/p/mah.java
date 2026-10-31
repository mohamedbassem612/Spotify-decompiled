package p;

import androidx.compose.ui.graphics.Brush;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mah implements j8e1 {
    public final long a;

    public mah(long j) {
        this.a = j;
        if (j != 16) {
            return;
        }
        rf80.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // p.j8e1
    public final long a() {
        return this.a;
    }

    @Override // p.j8e1
    public final float b() {
        return u7h.c(this.a);
    }

    @Override // p.j8e1
    public final Brush c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mah)) {
            return false;
        }
        long j = ((mah) obj).a;
        int i = u7h.l;
        return z4h1.b(this.a, j);
    }

    public final int hashCode() {
        int i = u7h.l;
        return z4h1.c(this.a);
    }

    public final String toString() {
        return f4i1.f("ColorStyle(value=", u7h.h(this.a), ")");
    }
}
