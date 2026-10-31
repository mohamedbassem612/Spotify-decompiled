package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public enum b9j0 implements ohy0 {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(0),
    DATA_MESSAGE(1),
    /* JADX INFO: Fake field, exist only in values array */
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    b9j0(int i) {
        this.a = i;
    }

    public final int getNumber() {
        return this.a;
    }
}
