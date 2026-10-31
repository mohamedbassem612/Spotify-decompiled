package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class pym1 {
    public final String a;

    public pym1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pym1) && this.a.equals(((pym1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
