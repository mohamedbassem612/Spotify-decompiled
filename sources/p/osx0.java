package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class osx0 extends ktx0 {
    public final String a;

    public osx0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof osx0) && this.a.equals(((osx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
