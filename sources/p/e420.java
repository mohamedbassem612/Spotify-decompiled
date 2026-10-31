package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public enum e420 {
    JSON(".json"),
    ZIP(".zip"),
    GZIP(".gz");

    public final String a;

    e420(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
