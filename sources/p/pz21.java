package p;

import j$.time.Duration;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class pz21 implements rz21 {
    public final Duration a;

    public pz21(Duration duration) {
        this.a = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pz21) && this.a.equals(((pz21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
