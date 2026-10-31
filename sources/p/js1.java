package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class js1 implements bt1 {
    public final String a;

    public js1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof js1) && this.a.equals(((js1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
