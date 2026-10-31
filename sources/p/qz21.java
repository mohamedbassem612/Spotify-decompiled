package p;

import j$.time.Duration;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qz21 implements sz21 {
    public final Duration a;

    public qz21(Duration duration) {
        this.a = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qz21) && this.a.equals(((qz21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
