package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zy21 implements sz21 {
    public final String a;

    public zy21(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zy21) && this.a.equals(((zy21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
