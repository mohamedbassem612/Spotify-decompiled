package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hqf1 extends jqf1 {
    public final String a;

    public hqf1(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hqf1) && this.a.equals(((hqf1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
