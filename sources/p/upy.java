package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class upy implements xpy {
    public final String a;

    public upy(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof upy) && this.a.equals(((upy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
