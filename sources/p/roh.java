package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class roh implements iph {
    public final String a;

    public roh(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof roh) && this.a.equals(((roh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
