package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cvb1 implements dvb1 {
    public final evb1 a;

    public cvb1(evb1 evb1Var) {
        this.a = evb1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cvb1) && this.a.equals(((cvb1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
