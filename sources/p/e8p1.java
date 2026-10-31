package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public enum e8p1 implements swn1 {
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_UNKNOWN(0),
    LATIN(1),
    /* JADX INFO: Fake field, exist only in values array */
    LATIN_AND_CHINESE(2),
    /* JADX INFO: Fake field, exist only in values array */
    LATIN_AND_DEVANAGARI(3),
    /* JADX INFO: Fake field, exist only in values array */
    LATIN_AND_JAPANESE(4),
    /* JADX INFO: Fake field, exist only in values array */
    LATIN_AND_KOREAN(5),
    /* JADX INFO: Fake field, exist only in values array */
    CREDIT_CARD(6),
    /* JADX INFO: Fake field, exist only in values array */
    DOCUMENT(7),
    /* JADX INFO: Fake field, exist only in values array */
    PIXEL_AI(8);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    e8p1(int i) {
        this.a = i;
    }

    @Override // p.swn1
    public final int zza() {
        return this.a;
    }
}
