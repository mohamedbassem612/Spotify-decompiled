package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class eaq0 extends jaq0 {
    public final String a;

    public eaq0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eaq0) && this.a.equals(((eaq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
