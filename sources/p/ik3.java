package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ik3 implements kk3, lk3 {
    public final String a;

    public ik3(String str) {
        this.a = str;
    }

    public final String d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ik3) && this.a.equals(((ik3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
