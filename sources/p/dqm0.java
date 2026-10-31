package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dqm0 implements fqm0 {
    public final String a;

    public dqm0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dqm0) && this.a.equals(((dqm0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
