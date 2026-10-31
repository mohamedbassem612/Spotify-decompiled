package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mef0 implements ref0 {
    public final String a;

    public mef0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mef0) && this.a.equals(((mef0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
