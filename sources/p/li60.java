package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class li60 {
    public final String a;

    public li60(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof li60) && this.a.equals(((li60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
