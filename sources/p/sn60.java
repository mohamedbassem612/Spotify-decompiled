package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sn60 implements tn60 {
    public final String a;

    public sn60(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sn60) && u890.j(this.a, ((sn60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
