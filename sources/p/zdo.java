package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zdo implements aeo {
    public final String a;

    public zdo(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zdo) && this.a.equals(((zdo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
