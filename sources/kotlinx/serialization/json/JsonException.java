package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/serialization/json/JsonException;", "Lkotlinx/serialization/SerializationException;", "Lkotlinx/serialization/json/JsonDecodingException;", "Lkotlinx/serialization/json/JsonEncodingException;", "kotlinx-serialization-json"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class JsonException extends SerializationException {
    public final String a;

    public JsonException(String str) {
        super(str);
        this.a = str;
    }

    /* JADX INFO: renamed from: getMessage, reason: from getter */
    public final String getA() {
        return this.a;
    }
}
