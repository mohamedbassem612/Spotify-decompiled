package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cp0 implements dp0 {
    public final String a;
    public final List b;

    public cp0(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cp0)) {
            return false;
        }
        cp0 cp0Var = (cp0) obj;
        return u890.j(this.a, cp0Var.a) && this.b.equals(cp0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
