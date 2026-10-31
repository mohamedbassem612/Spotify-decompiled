package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class eat extends iat {
    public final String a;

    public eat(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eat) && this.a.equals(((eat) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
