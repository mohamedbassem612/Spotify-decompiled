package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w0f1 extends z0f1 {
    public final String a;

    public w0f1(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w0f1) && this.a.equals(((w0f1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
