package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fdl implements gdl {
    public final boolean a;

    public fdl(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fdl) && this.a == ((fdl) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
