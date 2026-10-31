package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yby {
    public final vby a;

    public yby(vby vbyVar) {
        this.a = vbyVar;
    }

    public final vby a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yby) && this.a.equals(((yby) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
