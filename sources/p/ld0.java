package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ld0 implements md0 {
    public final String a;

    public ld0(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ld0) && this.a.equals(((ld0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
