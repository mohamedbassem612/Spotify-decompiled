package p;

import androidx.car.app.model.Alert;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class c6e1 implements e6e1 {
    public final int b;
    public final int c;

    public c6e1(int i, int i2) {
        this.b = i;
        this.c = i2;
        boolean z = false;
        if (1 <= i && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        tf80.a("Expected 1 ≤ minHeightInLines ≤ maxHeightInLines, were " + i + ", " + i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c6e1.class != obj.getClass()) {
            return false;
        }
        c6e1 c6e1Var = (c6e1) obj;
        return this.b == c6e1Var.b && this.c == c6e1Var.c;
    }

    public final int hashCode() {
        return (this.b * 31) + this.c;
    }

    public final String toString() {
        return l1d.j(this.b, this.c, "MultiLine(minHeightInLines=", ", maxHeightInLines=", ")");
    }

    public /* synthetic */ c6e1(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 1 : i, (i3 & 2) != 0 ? Alert.DURATION_SHOW_INDEFINITELY : i2);
    }
}
