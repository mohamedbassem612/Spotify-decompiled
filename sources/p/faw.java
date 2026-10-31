package p;

import j$.time.Duration;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class faw {
    public final Duration a;
    public final String b;

    public faw(Duration duration, String str) {
        this.a = duration;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof faw)) {
            return false;
        }
        faw fawVar = (faw) obj;
        return this.a.equals(fawVar.a) && this.b.equals(fawVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
