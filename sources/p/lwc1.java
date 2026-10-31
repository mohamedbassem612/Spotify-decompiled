package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lwc1 {
    public final String a;

    public /* synthetic */ lwc1(String str) {
        this.a = str;
    }

    public static final /* synthetic */ lwc1 a(String str) {
        return new lwc1(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lwc1) {
            return u890.j(this.a, ((lwc1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f4i1.f("SuggestionTriggerId(value=", this.a, ")");
    }
}
