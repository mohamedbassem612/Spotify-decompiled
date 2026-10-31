package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class eu60 extends ru60 {
    public final String a;

    public eu60(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eu60) && u890.j(this.a, ((eu60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
