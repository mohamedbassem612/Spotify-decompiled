package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rx10 implements xx10 {
    public final String a;

    public rx10(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rx10) && u890.j(this.a, ((rx10) obj).a);
    }

    public final String getEventId() {
        return "brand_survey_info_tapped";
    }

    public final int hashCode() {
        return this.a.hashCode() + 1731393648;
    }
}
