package p;

import j$.time.Instant;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vpz0 implements xpz0 {
    public final Instant a;
    public final boolean b;

    public vpz0(Instant instant, boolean z) {
        this.a = instant;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vpz0)) {
            return false;
        }
        vpz0 vpz0Var = (vpz0) obj;
        return u890.j(this.a, vpz0Var.a) && this.b == vpz0Var.b;
    }

    public final int hashCode() {
        Instant instant = this.a;
        return Boolean.hashCode(this.b) + ((instant == null ? 0 : instant.hashCode()) * 31);
    }
}
