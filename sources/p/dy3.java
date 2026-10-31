package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dy3 implements ey3 {
    public final String a;

    public dy3(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dy3) && this.a.equals(((dy3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
