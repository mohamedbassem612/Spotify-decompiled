package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class j861 {
    public final String a;

    public j861(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j861) && u890.j(this.a, ((j861) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
