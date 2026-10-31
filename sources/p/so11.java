package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class so11 {
    public final Long a;

    public so11(Long l) {
        this.a = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof so11) && this.a.equals(((so11) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
