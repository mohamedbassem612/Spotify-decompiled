package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public enum a9j0 implements ohy0 {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    /* JADX INFO: Fake field, exist only in values array */
    MESSAGE_OPEN(2);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    a9j0(int i) {
        this.a = i;
    }

    public final int getNumber() {
        return this.a;
    }
}
