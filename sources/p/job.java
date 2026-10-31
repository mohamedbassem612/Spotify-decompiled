package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class job implements kob {
    public final String a;

    public job(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof job) && this.a.equals(((job) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
