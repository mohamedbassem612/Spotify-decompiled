package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qn60 implements tn60 {
    public final String a;

    public qn60(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qn60) && u890.j(this.a, ((qn60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
