package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class axn {
    public final String a;

    public axn(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof axn) && this.a.equals(((axn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
