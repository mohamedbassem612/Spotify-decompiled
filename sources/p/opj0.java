package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum opj0 {
    Counter("counter"),
    UpDownCounter("up_down_counter"),
    Gauge("gauge");

    public final String a;

    opj0(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
