package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tmi1 implements xmi1 {
    public final String a;

    public tmi1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tmi1) && this.a.equals(((tmi1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
