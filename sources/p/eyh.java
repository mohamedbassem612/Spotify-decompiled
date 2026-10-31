package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class eyh {
    public final String a;

    public eyh(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eyh) && u890.j(this.a, ((eyh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
