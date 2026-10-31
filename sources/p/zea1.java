package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\u0007J*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lp/zea1;", "", "", "trackUri", "Lp/sy21;", "Lp/uz21;", "c", "(Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "artistUri", "a", "collaboratorId", "b", "(Ljava/lang/String;Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_songdna_sharemenuimpl-sharemenuimpl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface zea1 {
    @ay30("shareables/sticker/artist-dna/{artistUri}")
    Object a(@t8s0("artistUri") String str, lnm<? super sy21<uz21>> lnmVar);

    @ay30("shareables/sticker/artist-blend-dna/{artistUri}")
    Object b(@t8s0("artistUri") String str, @u0z0("collabArtistUri") String str2, lnm<? super sy21<uz21>> lnmVar);

    @ay30("shareables/sticker/song-dna/{trackUri}")
    Object c(@t8s0("trackUri") String str, lnm<? super sy21<uz21>> lnmVar);
}
