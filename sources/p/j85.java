package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum j85 implements z0z {
    LOCAL_EXTRACTION("local_extraction"),
    /* JADX INFO: Fake field, exist only in values array */
    EXTENDED_METADATA("extended_metadata"),
    /* JADX INFO: Fake field, exist only in values array */
    DIRECT_IMAGE_METADATA("direct_image_metadata");

    public final String a;

    j85(String str) {
        this.a = str;
    }

    @Override // p.z0z
    public final String value() {
        return this.a;
    }
}
