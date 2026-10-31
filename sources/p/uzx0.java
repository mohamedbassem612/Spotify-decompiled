package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class uzx0 implements vzx0 {
    public final String a;

    public uzx0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uzx0) && this.a.equals(((uzx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
