package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ge60 implements ie60 {
    public final String a;

    public ge60(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ge60) && this.a.equals(((ge60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
