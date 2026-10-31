package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pc3 {
    public final String a;

    public pc3(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pc3) && this.a.equals(((pc3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
