package androidx.compose.ui.text.style;

import p.c13;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class BaselineShift {
    public final float a;

    public final boolean equals(Object obj) {
        if (obj instanceof BaselineShift) {
            return Float.compare(this.a, ((BaselineShift) obj).a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return c13.h("BaselineShift(multiplier=", this.a, ")");
    }
}
