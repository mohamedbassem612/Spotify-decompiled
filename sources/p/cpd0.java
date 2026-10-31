package p;

import com.spotify.liveeventslocation.v1.locationsuggest.LocationSuggestRequest;
import com.spotify.liveeventslocation.v1.locationsuggest.LocationSuggestResponse;
import com.spotify.liveeventslocation.v1.userlocation.DeleteUserLocationRequest;
import com.spotify.liveeventslocation.v1.userlocation.GetUserLocationRequest;
import com.spotify.liveeventslocation.v1.userlocation.GetUserLocationResponse;
import com.spotify.liveeventslocation.v1.userlocation.StoreUserLocationRequest;
import com.spotify.liveeventslocation.v1.userlocation.StoreUserLocationResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lp/cpd0;", "", "Lcom/spotify/liveeventslocation/v1/locationsuggest/LocationSuggestRequest;", "request", "Lcom/spotify/liveeventslocation/v1/locationsuggest/LocationSuggestResponse;", "d", "(Lcom/spotify/liveeventslocation/v1/locationsuggest/LocationSuggestRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/liveeventslocation/v1/userlocation/GetUserLocationRequest;", "Lcom/spotify/liveeventslocation/v1/userlocation/GetUserLocationResponse;", "a", "(Lcom/spotify/liveeventslocation/v1/userlocation/GetUserLocationRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/liveeventslocation/v1/userlocation/StoreUserLocationRequest;", "Lcom/spotify/liveeventslocation/v1/userlocation/StoreUserLocationResponse;", "b", "(Lcom/spotify/liveeventslocation/v1/userlocation/StoreUserLocationRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/liveeventslocation/v1/userlocation/DeleteUserLocationRequest;", "Lp/sy21;", "Ljava/lang/Void;", "c", "(Lcom/spotify/liveeventslocation/v1/userlocation/DeleteUserLocationRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_liveevents_datasource-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface cpd0 {
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("live-events-location/spotify.liveeventslocation.v1.UserLocationService/GetUserLocation")
    Object a(@elb GetUserLocationRequest getUserLocationRequest, lnm<? super GetUserLocationResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("live-events-location/spotify.liveeventslocation.v1.UserLocationService/StoreUserLocation")
    Object b(@elb StoreUserLocationRequest storeUserLocationRequest, lnm<? super StoreUserLocationResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("live-events-location/spotify.liveeventslocation.v1.UserLocationService/DeleteUserLocation")
    Object c(@elb DeleteUserLocationRequest deleteUserLocationRequest, lnm<? super sy21<Void>> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("live-events-location/spotify.liveeventslocation.v1.LocationSuggestService/Suggest")
    Object d(@elb LocationSuggestRequest locationSuggestRequest, lnm<? super LocationSuggestResponse> lnmVar);
}
