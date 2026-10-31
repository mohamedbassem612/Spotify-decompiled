package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum bpt {
    SMARTPHONE(3),
    TABLET(2),
    SMARTWATCH(13),
    AUTOMOBILE(12),
    COMPUTER(1),
    UNKNOWN(0);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    bpt(int i) {
        this.a = i;
    }
}
