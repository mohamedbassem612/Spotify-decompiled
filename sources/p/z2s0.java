package p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import io.reactivex.rxjava3.core.Single;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\bg\u0018\u0000 \u00062\u00020\u0001:\u0001\fJ\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0006\u0010\u0005J+\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00070\u00022\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H'¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lp/z2s0;", "", "Lio/reactivex/rxjava3/core/Single;", "Lp/w2s0;", "c", "()Lio/reactivex/rxjava3/core/Single;", "a", "", "", "categoryIds", "b", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/Single;", "p/y2s0", "src_main_java_com_spotify_partnerapps_domain-domain"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public interface z2s0 {
    public static final y2s0 a = y2s0.a;
    public static final String b = "navigation";
    public static final String c = "voice-assistants";
    public static final String d = "samsung";

    @ay30("partner-client-integrations/v2/categories/voice-assistants")
    Single<w2s0> a();

    @ay30("partner-client-integrations/v2/categories")
    Single<List<w2s0>> b(@u0z0("categoryId") List<String> categoryIds);

    @ay30("partner-client-integrations/v2/categories/navigation")
    Single<w2s0> c();
}
