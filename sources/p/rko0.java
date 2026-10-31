package p;

import android.os.Bundle;
import j$.time.LocalDate;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rko0 extends wko0 {
    public final LocalDate a;
    public final int b;

    public rko0(int i, LocalDate localDate) {
        this.a = localDate;
        o0c.m(i >= 0 && i <= 2, "Invalid format: %s", new Object[]{Integer.valueOf(i)});
        this.b = i;
    }

    @Override // p.wko0
    public final void a(Bundle bundle) {
        bundle.putLong("value", this.a.toEpochDay());
        bundle.putInt("format", this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rko0)) {
            return false;
        }
        rko0 rko0Var = (rko0) obj;
        if (this == rko0Var) {
            return true;
        }
        return this.a.equals(rko0Var.a) && this.b == rko0Var.b;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(rko0.class.getSimpleName());
        sb.append("{mValue=");
        sb.append(this.a);
        sb.append(", mFormat=");
        return gvg.j(sb, this.b, "}");
    }
}
