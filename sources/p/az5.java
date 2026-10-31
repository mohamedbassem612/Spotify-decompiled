package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class az5 implements dz5 {
    public final String a;

    public az5(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof az5) && u890.j(this.a, ((az5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
