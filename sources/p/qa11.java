package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qa11 implements ra11 {
    public final String a;

    public qa11(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qa11) && u890.j(this.a, ((qa11) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
