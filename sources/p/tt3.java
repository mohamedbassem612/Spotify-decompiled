package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tt3 implements ut3 {
    public final String a;

    public tt3(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tt3) && this.a.equals(((tt3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
