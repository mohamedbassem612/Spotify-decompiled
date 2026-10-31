package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ioh implements iph {
    public final String a;

    public ioh(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ioh) && this.a.equals(((ioh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
