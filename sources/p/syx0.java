package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class syx0 implements uyx0 {
    public final String a;

    public syx0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof syx0) && this.a.equals(((syx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
