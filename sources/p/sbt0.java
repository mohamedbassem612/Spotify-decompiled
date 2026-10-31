package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sbt0 implements tbt0 {
    public final int a;

    public sbt0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sbt0) && this.a == ((sbt0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
