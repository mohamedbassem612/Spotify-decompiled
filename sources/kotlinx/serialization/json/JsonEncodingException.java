package kotlinx.serialization.json;

import kotlin.Metadata;
import p.ihc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/JsonEncodingException;", "Lkotlinx/serialization/json/JsonException;", "kotlinx-serialization-json"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class JsonEncodingException extends JsonException {
    public JsonEncodingException(String str, String str2) {
        super(str.concat((str2 == null || ihc1.y0(str2)) ? "" : "\n".concat(str2)));
    }

    public /* synthetic */ JsonEncodingException(int i, String str, String str2) {
        this(str, (i & 4) != 0 ? null : "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
    }
}
