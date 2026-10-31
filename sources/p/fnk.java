package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\u0006J\u001a\u0010\n\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lp/fnk;", "", "", "artistId", "Lp/cok;", "c", "(Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "friendId", "Lp/rih1;", "b", "a", "src_main_java_com_spotify_ontour_concertfriendmatcherimpl-concertfriendmatcherimpl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface fnk {
    @juo("concerts-friend-matcher/v1/blocked-friends/{friend_id}")
    Object a(@t8s0("friend_id") String str, lnm<? super rih1> lnmVar);

    @wyq0("concerts-friend-matcher/v1/blocked-friends/{friend_id}")
    Object b(@t8s0("friend_id") String str, lnm<? super rih1> lnmVar);

    @ay30("concerts-friend-matcher/v1/matches/{artist_id}")
    Object c(@t8s0("artist_id") String str, lnm<? super cok> lnmVar);
}
