package okhttp3.internal.platform;

import android.content.Context;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.util.List;
import kotlin.Metadata;
import p.cd80;
import p.ebm;
import p.nct0;
import p.z6x;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/platform/PlatformInitializer;", "Lp/cd80;", "Lp/nct0;", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class PlatformInitializer implements cd80 {
    public final Object create(Context context) {
        nct0 nct0Var = nct0.a;
        Object obj = nct0.a;
        ebm ebmVar = obj != null ? (ebm) obj : null;
        if (ebmVar != null) {
            ebmVar.b(context);
        }
        return nct0.a;
    }

    public final List dependencies() {
        return z6x.a;
    }
}
