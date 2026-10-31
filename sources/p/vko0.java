package p;

import android.os.Bundle;
import j$.time.LocalTime;
import j$.time.temporal.ChronoUnit;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vko0 extends wko0 {
    public final LocalTime a;

    public vko0(LocalTime localTime) {
        this.a = localTime.truncatedTo(ChronoUnit.SECONDS);
    }

    @Override // p.wko0
    public final void a(Bundle bundle) {
        bundle.putLong("value", this.a.toSecondOfDay());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vko0)) {
            return false;
        }
        vko0 vko0Var = (vko0) obj;
        if (this == vko0Var) {
            return true;
        }
        return Objects.equals(this.a, vko0Var.a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    public final String toString() {
        return vko0.class.getSimpleName() + "{mValue=" + this.a + "}";
    }
}
