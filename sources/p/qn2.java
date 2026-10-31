package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qn2 implements tn2 {
    public final String a;

    public qn2(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qn2) && u890.j(this.a, ((qn2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
