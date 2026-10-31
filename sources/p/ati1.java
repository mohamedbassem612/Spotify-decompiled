package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ati1 {
    public final String a;

    public ati1(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ati1) && this.a.equals(((ati1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
