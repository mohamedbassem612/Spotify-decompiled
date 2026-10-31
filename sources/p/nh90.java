package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nh90 implements ni90 {
    public final String a;

    public nh90(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nh90) && this.a.equals(((nh90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
