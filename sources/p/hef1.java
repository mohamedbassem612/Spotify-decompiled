package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hef1 implements jef1 {
    public final String a;

    public hef1(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hef1) && this.a.equals(((hef1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
