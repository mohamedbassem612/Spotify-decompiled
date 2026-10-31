package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum kij0 implements v190 {
    OGG_VORBIS_96(0),
    OGG_VORBIS_160(1),
    OGG_VORBIS_320(2),
    MP3_256(3),
    MP3_320(4),
    MP3_160(5),
    MP3_96(6),
    MP3_160_ENC(7),
    AAC_24(8),
    AAC_48(9),
    FLAC_FLAC(16),
    XHE_AAC_24(18),
    XHE_AAC_16(19),
    XHE_AAC_12(20),
    FLAC_FLAC_24BIT(22),
    PHONO_LOW(54),
    PHONO_HIGH(55),
    PHONO_CLEAR(56),
    FLAC_FLAC_PETREL(57);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    kij0(int i) {
        this.a = i;
    }

    public final int getNumber() {
        return this.a;
    }
}
