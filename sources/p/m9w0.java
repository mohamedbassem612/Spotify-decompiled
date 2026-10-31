package p;

import com.spotify.personalizedepisodes.contentservice.v1.GetPresetResponse;
import com.spotify.personalizedepisodes.contentservice.v1.ListPresetsResponse;
import com.spotify.personalizedepisodes.contentservice.v1.PersonalizePresetResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\f\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lp/m9w0;", "", "Lp/sy21;", "Lcom/spotify/personalizedepisodes/contentservice/v1/ListPresetsResponse;", "c", "(Lp/lnm;)Ljava/lang/Object;", "", "presetId", "Lcom/spotify/personalizedepisodes/contentservice/v1/GetPresetResponse;", "b", "(Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/personalizedepisodes/contentservice/v1/PersonalizePresetResponse;", "a", "src_main_java_com_spotify_bluejay_data_impl-presets_data_module"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface m9w0 {
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("personalized-episodes/v1/content/presets/{preset_id}/personalize")
    Object a(@t8s0("preset_id") String str, lnm<? super sy21<PersonalizePresetResponse>> lnmVar);

    @ay30("personalized-episodes/v1/content/presets/{preset_id}")
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    Object b(@t8s0("preset_id") String str, lnm<? super sy21<GetPresetResponse>> lnmVar);

    @ay30("personalized-episodes/v1/content/presets")
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    Object c(lnm<? super sy21<ListPresetsResponse>> lnmVar);
}
