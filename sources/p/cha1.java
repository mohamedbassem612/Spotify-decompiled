package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cha1 {
    public final rih1 a = rih1.a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cha1) && this.a == ((cha1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
