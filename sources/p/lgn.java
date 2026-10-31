package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class lgn implements ugn {
    public final String a;

    public lgn(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lgn) && u890.j(this.a, ((lgn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
