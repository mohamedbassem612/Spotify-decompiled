package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xa40 extends v8r {
    public final String e;

    public xa40(String str) {
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xa40) && this.e.equals(((xa40) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
