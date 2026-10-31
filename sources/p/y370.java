package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class y370 implements z370 {
    public final String a;

    public y370(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y370) && this.a.equals(((y370) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
