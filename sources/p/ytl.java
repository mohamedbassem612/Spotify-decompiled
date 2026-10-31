package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ytl implements aul {
    public final int a;

    public ytl(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ytl) && this.a == ((ytl) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
