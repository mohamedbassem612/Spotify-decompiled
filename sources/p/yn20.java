package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum yn20 {
    NONE(0),
    ONGOING_SESSION(1),
    /* JADX INFO: Fake field, exist only in values array */
    MANAGED_SESSION_BY_HOST(3),
    SUGGESTED_DEVICE(4);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    yn20(int i) {
        this.a = i;
    }
}
