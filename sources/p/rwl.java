package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rwl implements twl {
    public final String a;

    public rwl(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rwl) && this.a.equals(((rwl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
