package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gg1 {
    public final String a;

    public gg1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gg1) && this.a.equals(((gg1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
