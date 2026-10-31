package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zww0 implements ixw0 {
    public final String a;

    public zww0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zww0) && this.a.equals(((zww0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
