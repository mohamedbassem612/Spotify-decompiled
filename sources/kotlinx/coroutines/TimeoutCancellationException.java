package kotlinx.coroutines;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import p.faa0;
import p.hve1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/TimeoutCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class TimeoutCancellationException extends CancellationException {
    public final transient faa0 a;

    public TimeoutCancellationException(String str, hve1 hve1Var) {
        super(str);
        this.a = hve1Var;
    }
}
