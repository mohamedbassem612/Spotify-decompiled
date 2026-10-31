package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/et00;", "Lp/uim0;", "Lp/ft00;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class et00 extends uim0 {
    public final e45 a;

    public et00(e45 e45Var) {
        this.a = e45Var;
    }

    public final pim0 a() {
        ft00 ft00Var = new ft00();
        ft00Var.O0 = this.a;
        return ft00Var;
    }

    public final void b(pim0 pim0Var) {
        ((ft00) pim0Var).O0 = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof et00) {
            return this.a == ((et00) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
