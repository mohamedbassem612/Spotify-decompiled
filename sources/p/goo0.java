package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class goo0 extends ioo0 {
    public final String a;

    public goo0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof goo0) && u890.j(this.a, ((goo0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
