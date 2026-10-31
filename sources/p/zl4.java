package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum zl4 implements z0z {
    /* JADX INFO: Fake field, exist only in values array */
    LOW("low"),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIUM("medium"),
    HIGH("high"),
    /* JADX INFO: Fake field, exist only in values array */
    VERY_HIGH("very_high");

    public final String a;

    zl4(String str) {
        this.a = str;
    }

    @Override // p.z0z
    public final String value() {
        return this.a;
    }
}
