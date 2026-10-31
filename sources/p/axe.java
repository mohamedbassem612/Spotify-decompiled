package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class axe implements nye {
    public final String a;

    public axe(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof axe) && u890.j(this.a, ((axe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
