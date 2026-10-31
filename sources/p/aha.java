package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class aha extends fha {
    public final hha a;

    public aha(hha hhaVar) {
        this.a = hhaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aha) && this.a.equals(((aha) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
