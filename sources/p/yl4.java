package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum yl4 implements z0z {
    /* JADX INFO: Fake field, exist only in values array */
    LOW("low"),
    MEDIUM("medium"),
    /* JADX INFO: Fake field, exist only in values array */
    HIGH("high"),
    /* JADX INFO: Fake field, exist only in values array */
    VERY_HIGH("very_high");

    public final String a;

    yl4(String str) {
        this.a = str;
    }

    @Override // p.z0z
    public final String value() {
        return this.a;
    }
}
