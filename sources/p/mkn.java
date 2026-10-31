package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mkn implements okn {
    public final String a;

    public mkn(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mkn) && u890.j(this.a, ((mkn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
