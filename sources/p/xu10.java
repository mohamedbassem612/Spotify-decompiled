package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xu10 implements rv10 {
    public final String a;

    public xu10(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xu10) && u890.j(this.a, ((xu10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
