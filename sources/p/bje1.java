package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bje1 implements fje1 {
    public final String a;

    public bje1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bje1) && this.a.equals(((bje1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
