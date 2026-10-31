package p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J4\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lp/tig;", "", "", "provider", "voice", "ssml", "Lp/sy21;", "Lp/uz21;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_fitness_workoutimpl-workoutimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public interface tig {
    @ay30("client-tts/v1/ssml/{provider}/mp3/{voice}/{ssml}")
    Object a(@t8s0("provider") String str, @t8s0("voice") String str2, @t8s0(encoded = true, value = "ssml") String str3, lnm<? super sy21<uz21>> lnmVar);
}
