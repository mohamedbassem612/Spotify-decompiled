package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pn60 implements tn60 {
    public final String a;

    public pn60(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pn60) && u890.j(this.a, ((pn60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
