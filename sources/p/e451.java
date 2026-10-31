package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class e451 {
    public final String a;

    public e451(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e451) && this.a.equals(((e451) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
