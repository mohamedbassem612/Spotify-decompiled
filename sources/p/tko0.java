package p;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tko0 extends wko0 {
    public final int a;
    public final String b;

    public tko0(int i, String str) {
        this.a = i;
        this.b = dko0.e(str);
    }

    @Override // p.wko0
    public final void a(Bundle bundle) {
        bundle.putInt("value", this.a);
        bundle.putString("unit", this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tko0)) {
            return false;
        }
        tko0 tko0Var = (tko0) obj;
        if (this == tko0Var) {
            return true;
        }
        return this.a == tko0Var.a && Objects.equals(this.b, tko0Var.b);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(tko0.class.getSimpleName());
        sb.append("{mValue=");
        sb.append(this.a);
        sb.append(", mUnit=");
        return l1d.n(this.b, "}", sb);
    }
}
