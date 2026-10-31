package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public enum l3l implements z0z {
    /* JADX INFO: Fake field, exist only in values array */
    CLASSIC_CAST("classic_cast"),
    /* JADX INFO: Fake field, exist only in values array */
    CAST_BASIC("cast_basic"),
    /* JADX INFO: Fake field, exist only in values array */
    CLASSIC_CAST_WITH_GOOGLE_OUTPUT_SWITCHER("classic_cast_with_google_output_switcher"),
    CAST_BASIC_WITH_GOOGLE_OUTPUT_SWITCHER("cast_basic_with_google_output_switcher"),
    /* JADX INFO: Fake field, exist only in values array */
    STREAM_EXPANSION_GOOGLE_OUTPUT_SWITCHER_WITH_BRAND_CHECK("stream_expansion_google_output_switcher_with_brand_check"),
    /* JADX INFO: Fake field, exist only in values array */
    STREAM_EXPANSION_V2_GOOGLE_OUTPUT_SWITCHER_WITH_BRAND_CHECK("stream_expansion_v2_google_output_switcher_with_brand_check");

    public final String a;

    l3l(String str) {
        this.a = str;
    }

    public final String value() {
        return this.a;
    }
}
