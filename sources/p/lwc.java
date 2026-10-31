package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class lwc implements nwc {
    public final String a;

    public lwc(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lwc) && u890.j(this.a, ((lwc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
