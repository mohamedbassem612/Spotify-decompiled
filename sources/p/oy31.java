package p;

import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;
import spotify.party.orchestra.v1.Rsvp$GetRsvpStatusRequest;
import spotify.party.orchestra.v1.Rsvp$RsvpFreeRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lp/oy31;", "", "Lspotify/party/orchestra/v1/Rsvp$RsvpFreeRequest;", "request", "Lio/reactivex/rxjava3/core/Single;", "a", "(Lspotify/party/orchestra/v1/Rsvp$RsvpFreeRequest;)Lio/reactivex/rxjava3/core/Single;", "Lspotify/party/orchestra/v1/Rsvp$GetRsvpStatusRequest;", "b", "(Lspotify/party/orchestra/v1/Rsvp$GetRsvpStatusRequest;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_liveroom_livestreampagefragment-livestreampagefragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface oy31 {
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("party-orchestra/spotify.party.orchestra.v1.PartyService/RegisterFreeRsvp")
    Single<Object> a(@elb Rsvp$RsvpFreeRequest request);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("party-orchestra/spotify.party.orchestra.v1.PartyService/GetRsvpStatus")
    Single<Object> b(@elb Rsvp$GetRsvpStatusRequest request);
}
