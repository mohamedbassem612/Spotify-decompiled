package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gnd extends ind {
    public final String a;

    public gnd(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gnd) && this.a.equals(((gnd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
