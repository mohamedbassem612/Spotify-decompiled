package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xvh1 {
    public final String a;

    public xvh1(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xvh1) && this.a.equals(((xvh1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
