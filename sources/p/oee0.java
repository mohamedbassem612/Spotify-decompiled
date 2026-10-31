package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class oee0 {
    public final String a;

    public oee0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oee0) && u890.j(this.a, ((oee0) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(false) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
