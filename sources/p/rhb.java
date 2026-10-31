package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public enum rhb {
    /* JADX INFO: Fake field, exist only in values array */
    HIGH(3),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIUM(2),
    LOW(1),
    /* JADX INFO: Fake field, exist only in values array */
    ULTRA_LOW(0);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    rhb(int i) {
        this.a = i;
    }
}
