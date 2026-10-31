package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class aoh implements iph {
    public final String a;

    public aoh(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aoh) && this.a.equals(((aoh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
