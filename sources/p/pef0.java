package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pef0 implements ref0 {
    public final a9h a;

    public pef0(a9h a9hVar) {
        this.a = a9hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pef0) && this.a.equals(((pef0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
