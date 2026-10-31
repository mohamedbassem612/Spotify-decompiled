package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mnb1 implements job1 {
    public final String a;

    public mnb1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mnb1) && u890.j(this.a, ((mnb1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
