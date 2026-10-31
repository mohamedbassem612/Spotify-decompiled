package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum ho4 implements z0z {
    DAILY_MIX("daily_mix"),
    /* JADX INFO: Fake field, exist only in values array */
    SEED_MIX_ARTIST("seed_mix_artist"),
    /* JADX INFO: Fake field, exist only in values array */
    SEED_MIX_GENRE("seed_mix_genre"),
    /* JADX INFO: Fake field, exist only in values array */
    SEED_MIX_DECADE("seed_mix_decade");

    public final String a;

    ho4(String str) {
        this.a = str;
    }

    @Override // p.z0z
    public final String value() {
        return this.a;
    }
}
