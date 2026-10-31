package p;

import com.spotify.gamesservice.musicguesser.v1.CompleteGameRequest;
import com.spotify.gamesservice.musicguesser.v1.GameResultsPage;
import com.spotify.gamesservice.musicguesser.v1.GetDailyIntroResponse;
import com.spotify.gamesservice.musicguesser.v1.GetGameResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H§@¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00012\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\tJ*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00012\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00012\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u000f\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lp/h3n0;", "Lp/sy21;", "Lcom/spotify/gamesservice/musicguesser/v1/GetDailyIntroResponse;", "d", "(Lp/lnm;)Ljava/lang/Object;", "", "gameId", "Lcom/spotify/gamesservice/musicguesser/v1/GetGameResponse;", "a", "(Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/gamesservice/musicguesser/v1/CompleteGameRequest;", "request", "Lcom/spotify/gamesservice/musicguesser/v1/GameResultsPage;", "c", "(Ljava/lang/String;Lcom/spotify/gamesservice/musicguesser/v1/CompleteGameRequest;Lp/lnm;)Ljava/lang/Object;", "b", "src_main_java_com_spotify_games_musicguesser_network_service-service"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface h3n0 {
    @ay30("games-service/music-guesser/v1/games/{game_id}")
    @u360({"Accept: application/protobuf"})
    Object a(@t8s0("game_id") String str, lnm<? super sy21<GetGameResponse>> lnmVar);

    @ay30("games-service/music-guesser/v1/games/{game_id}/results")
    @u360({"Accept: application/protobuf"})
    Object b(@t8s0("game_id") String str, lnm<? super sy21<GameResultsPage>> lnmVar);

    @u360({"Accept: application/protobuf", "Content-Type: application/protobuf"})
    @wyq0("games-service/music-guesser/v1/games/{game_id}/complete")
    Object c(@t8s0("game_id") String str, @elb CompleteGameRequest completeGameRequest, lnm<? super sy21<GameResultsPage>> lnmVar);

    @ay30("games-service/music-guesser/v1/games/daily/intro")
    @u360({"Accept: application/protobuf"})
    Object d(lnm<? super sy21<GetDailyIntroResponse>> lnmVar);
}
