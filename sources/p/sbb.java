package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sbb implements vbb {
    public final String a;

    public sbb(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sbb) && u890.j(this.a, ((sbb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
