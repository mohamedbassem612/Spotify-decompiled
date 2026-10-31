package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class w421 implements a521 {
    public final String a;

    public w421(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w421) && u890.j(this.a, ((w421) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
