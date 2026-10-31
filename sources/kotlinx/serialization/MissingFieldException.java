package kotlinx.serialization;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/MissingFieldException;", "Lkotlinx/serialization/SerializationException;", "kotlinx-serialization-core"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class MissingFieldException extends SerializationException {
    public final ArrayList a;
    public final String b;

    public MissingFieldException(String str, Throwable th, ArrayList arrayList, String str2) {
        super(str, th);
        this.a = arrayList;
        this.b = str2;
    }
}
