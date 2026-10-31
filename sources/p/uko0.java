package p;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class uko0 extends wko0 {
    public final String a;
    public final String b;

    public uko0(String str, String str2) {
        Objects.requireNonNull(str);
        this.a = dko0.e(str);
        this.b = dko0.e(str2);
    }

    @Override // p.wko0
    public final void a(Bundle bundle) {
        bundle.putString("value", this.a);
        bundle.putString("unit", this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof uko0)) {
            return false;
        }
        uko0 uko0Var = (uko0) obj;
        if (this == uko0Var) {
            return true;
        }
        return Objects.equals(this.a, uko0Var.a) && Objects.equals(this.b, uko0Var.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(uko0.class.getSimpleName());
        sb.append("{mValue=");
        sb.append(this.a);
        sb.append(", mUnit=");
        return l1d.n(this.b, "}", sb);
    }
}
