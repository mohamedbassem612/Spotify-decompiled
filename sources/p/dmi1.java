package p;

import com.spotify.usersnearby.v1.AddUserRequest;
import com.spotify.usersnearby.v1.AddUserResponse;
import com.spotify.usersnearby.v1.CheckinRequest;
import com.spotify.usersnearby.v1.CreateSessionRequest;
import com.spotify.usersnearby.v1.CreateSessionResponse;
import com.spotify.usersnearby.v1.DismissUsersRequest;
import com.spotify.usersnearby.v1.ResolveTokenRequest;
import com.spotify.usersnearby.v1.ResolveTokenResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0014\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Lp/dmi1;", "", "Lcom/spotify/usersnearby/v1/CreateSessionRequest;", "request", "Lcom/spotify/usersnearby/v1/CreateSessionResponse;", "d", "(Lcom/spotify/usersnearby/v1/CreateSessionRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/usersnearby/v1/ResolveTokenRequest;", "Lcom/spotify/usersnearby/v1/ResolveTokenResponse;", "a", "(Lcom/spotify/usersnearby/v1/ResolveTokenRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/usersnearby/v1/AddUserRequest;", "Lcom/spotify/usersnearby/v1/AddUserResponse;", "e", "(Lcom/spotify/usersnearby/v1/AddUserRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/usersnearby/v1/CheckinRequest;", "Lp/rih1;", "b", "(Lcom/spotify/usersnearby/v1/CheckinRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/usersnearby/v1/DismissUsersRequest;", "c", "(Lcom/spotify/usersnearby/v1/DismissUsersRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_usersnearby_data_impl-impl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface dmi1 {
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("users-nearby-service/resolve-token")
    Object a(@elb ResolveTokenRequest resolveTokenRequest, lnm<? super ResolveTokenResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("users-nearby-service/checkin")
    Object b(@elb CheckinRequest checkinRequest, lnm<? super rih1> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("users-nearby-service/dismiss-users")
    Object c(@elb DismissUsersRequest dismissUsersRequest, lnm<? super rih1> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("users-nearby-service/create-session")
    Object d(@elb CreateSessionRequest createSessionRequest, lnm<? super CreateSessionResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("users-nearby-service/add-user")
    Object e(@elb AddUserRequest addUserRequest, lnm<? super AddUserResponse> lnmVar);
}
