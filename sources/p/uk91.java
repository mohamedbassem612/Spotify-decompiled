package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class uk91 extends yk91 {
    public final String a;

    public uk91(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uk91) && u890.j(this.a, ((uk91) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
