package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public enum sko1 implements tfn1 {
    /* JADX INFO: Fake field, exist only in values array */
    SOURCE_UNKNOWN(0),
    BITMAP(1),
    BYTEARRAY(2),
    BYTEBUFFER(3),
    FILEPATH(4),
    ANDROID_MEDIA_IMAGE(5);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    sko1(int i) {
        this.a = i;
    }

    @Override // p.tfn1
    public final int zza() {
        return this.a;
    }
}
