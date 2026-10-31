package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J8\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\b\u0010\tJ \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\f\u0010\rJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000e\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lp/kq71;", "", "", "link", "type", "playingFrom", "Lp/sy21;", "Lp/uz21;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "c", "(Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "d", "(Ljava/lang/String;Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "e", "src_main_java_com_spotify_share_shareables_impl-impl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface kq71 {
    static /* synthetic */ Object a(kq71 kq71Var, String str, String str2, lnm lnmVar, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: getPlaylistSticker");
            return null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return kq71Var.d(str, str2, lnmVar);
    }

    static /* synthetic */ Object f(kq71 kq71Var, String str, String str2, String str3, lnm lnmVar, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: getSticker");
            return null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return kq71Var.b(str, str2, str3, lnmVar);
    }

    @ay30("shareables/sticker/{link}")
    Object b(@t8s0("link") String str, @u0z0("type") String str2, @u0z0("playingFrom") String str3, lnm<? super sy21<uz21>> lnmVar);

    @ay30("/shareables/sticker/reserved/{link}")
    Object c(@t8s0("link") String str, lnm<? super sy21<uz21>> lnmVar);

    @ay30("/shareables/sticker/playlist-with-tracks/{link}")
    Object d(@t8s0("link") String str, @u0z0("type") String str2, lnm<? super sy21<uz21>> lnmVar);

    @ay30("/shareables/sticker/themed/{link}")
    Object e(@t8s0("link") String str, lnm<? super sy21<uz21>> lnmVar);
}
