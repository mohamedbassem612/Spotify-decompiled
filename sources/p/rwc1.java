package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rwc1 implements uwc1 {
    public final String a;

    public rwc1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rwc1) && u890.j(this.a, ((rwc1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
