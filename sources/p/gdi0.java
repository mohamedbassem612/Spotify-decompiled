package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gdi0 implements idi0 {
    public final String a;

    public gdi0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gdi0) && this.a.equals(((gdi0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
