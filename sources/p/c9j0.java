package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public enum c9j0 implements ohy0 {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_OS(0),
    ANDROID(1),
    /* JADX INFO: Fake field, exist only in values array */
    IOS(2),
    /* JADX INFO: Fake field, exist only in values array */
    WEB(3);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    c9j0(int i) {
        this.a = i;
    }

    public final int getNumber() {
        return this.a;
    }
}
