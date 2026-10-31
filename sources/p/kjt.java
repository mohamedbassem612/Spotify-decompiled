package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kjt implements dkt {
    public final String a;

    public kjt(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kjt) && u890.j(this.a, ((kjt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
