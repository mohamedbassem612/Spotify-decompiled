package p;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wpe1 {
    public final int a;
    public final TimeUnit b;

    public wpe1(int i, TimeUnit timeUnit) {
        this.a = i;
        this.b = timeUnit;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wpe1)) {
            return false;
        }
        wpe1 wpe1Var = (wpe1) obj;
        return this.a == wpe1Var.a && this.b == wpe1Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
