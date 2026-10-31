package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dwe1 implements fwe1 {
    public final String a;

    public dwe1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dwe1) && this.a.equals(((dwe1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
