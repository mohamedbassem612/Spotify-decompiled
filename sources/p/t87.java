package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class t87 {
    public final boolean a;

    public final boolean equals(Object obj) {
        if (obj instanceof t87) {
            return this.a == ((t87) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return "PersonalizedRecommendationsDisabled(value=" + this.a + ")";
    }
}
