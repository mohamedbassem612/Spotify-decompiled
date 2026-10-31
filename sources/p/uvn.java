package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uvn implements xvn {
    public final String a;

    public uvn(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uvn) && this.a.equals(((uvn) obj).a);
    }

    public final String getContextUri() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
