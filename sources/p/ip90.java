package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ip90 {
    public final String a;

    public static final boolean a(String str, String str2) {
        return u890.j(str, str2);
    }

    public static int b(String str) {
        return str.hashCode();
    }

    public final /* synthetic */ String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ip90) {
            return this.a.equals(((ip90) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f4i1.f("ConnectStateIdentifier(value=", this.a, ")");
    }
}
