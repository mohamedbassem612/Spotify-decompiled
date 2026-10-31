package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ban extends fan {
    public final String a;

    public ban(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ban) && u890.j(this.a, ((ban) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
