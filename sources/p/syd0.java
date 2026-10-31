package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class syd0 implements azd0 {
    public final String a;

    public syd0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof syd0) && this.a.equals(((syd0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
