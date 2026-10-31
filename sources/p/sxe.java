package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sxe implements nye {
    public final String a;

    public sxe(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sxe) && u890.j(this.a, ((sxe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
