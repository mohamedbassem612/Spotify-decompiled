package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class by21 extends jy21 {
    public final String a;

    public by21(String str) {
        this.a = str;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof by21) && this.a.equals(((by21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
