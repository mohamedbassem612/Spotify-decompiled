package p;

import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.recently_played_esperanto.proto.GetRecentlyPlayedRequest;
import com.spotify.recently_played_esperanto.proto.RecentlyPlayedAlbumDecorationPolicy;
import com.spotify.recently_played_esperanto.proto.RecentlyPlayedArtistDecorationPolicy;
import com.spotify.recently_played_esperanto.proto.RecentlyPlayedCollectionTracksDecorationPolicy;
import com.spotify.recently_played_esperanto.proto.RecentlyPlayedEpisodeDecorationPolicy;
import com.spotify.recently_played_esperanto.proto.RecentlyPlayedPlaylistDecorationPolicy;
import com.spotify.recently_played_esperanto.proto.RecentlyPlayedProfileDecorationPolicy;
import com.spotify.recently_played_esperanto.proto.RecentlyPlayedShowDecorationPolicy;
import com.spotify.recently_played_esperanto.proto.RecentlyPlayedTrackDecorationPolicy;
import java.io.InputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jp40 extends g implements v2j0 {
    public final void A(boolean z) {
        copyOnWrite();
        GetRecentlyPlayedRequest getRecentlyPlayedRequest = (GetRecentlyPlayedRequest) ((g) this).instance;
        int i = GetRecentlyPlayedRequest.LIMIT_FIELD_NUMBER;
        getRecentlyPlayedRequest.z(z);
    }

    public final void B(boolean z) {
        copyOnWrite();
        GetRecentlyPlayedRequest getRecentlyPlayedRequest = (GetRecentlyPlayedRequest) ((g) this).instance;
        int i = GetRecentlyPlayedRequest.LIMIT_FIELD_NUMBER;
        getRecentlyPlayedRequest.A(z);
    }

    public final void C() {
        copyOnWrite();
        GetRecentlyPlayedRequest getRecentlyPlayedRequest = (GetRecentlyPlayedRequest) ((g) this).instance;
        int i = GetRecentlyPlayedRequest.LIMIT_FIELD_NUMBER;
        getRecentlyPlayedRequest.B();
    }

    public final void D(RecentlyPlayedPlaylistDecorationPolicy recentlyPlayedPlaylistDecorationPolicy) {
        copyOnWrite();
        GetRecentlyPlayedRequest getRecentlyPlayedRequest = (GetRecentlyPlayedRequest) ((g) this).instance;
        int i = GetRecentlyPlayedRequest.LIMIT_FIELD_NUMBER;
        getRecentlyPlayedRequest.C(recentlyPlayedPlaylistDecorationPolicy);
    }

    public final void E(RecentlyPlayedProfileDecorationPolicy recentlyPlayedProfileDecorationPolicy) {
        copyOnWrite();
        GetRecentlyPlayedRequest getRecentlyPlayedRequest = (GetRecentlyPlayedRequest) ((g) this).instance;
        int i = GetRecentlyPlayedRequest.LIMIT_FIELD_NUMBER;
        getRecentlyPlayedRequest.D(recentlyPlayedProfileDecorationPolicy);
    }

    public final void F(RecentlyPlayedShowDecorationPolicy recentlyPlayedShowDecorationPolicy) {
        copyOnWrite();
        GetRecentlyPlayedRequest getRecentlyPlayedRequest = (GetRecentlyPlayedRequest) ((g) this).instance;
        int i = GetRecentlyPlayedRequest.LIMIT_FIELD_NUMBER;
        getRecentlyPlayedRequest.E(recentlyPlayedShowDecorationPolicy);
    }

    public final void G(RecentlyPlayedTrackDecorationPolicy recentlyPlayedTrackDecorationPolicy) {
        copyOnWrite();
        GetRecentlyPlayedRequest getRecentlyPlayedRequest = (GetRecentlyPlayedRequest) ((g) this).instance;
        int i = GetRecentlyPlayedRequest.LIMIT_FIELD_NUMBER;
        getRecentlyPlayedRequest.F(recentlyPlayedTrackDecorationPolicy);
    }

    public final void H() {
        copyOnWrite();
        GetRecentlyPlayedRequest getRecentlyPlayedRequest = (GetRecentlyPlayedRequest) ((g) this).instance;
        int i = GetRecentlyPlayedRequest.LIMIT_FIELD_NUMBER;
        getRecentlyPlayedRequest.G();
    }

    public final /* bridge */ /* synthetic */ s2j0 build() {
        return build();
    }

    public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
        return super.buildPartial();
    }

    public final /* bridge */ /* synthetic */ r2j0 clear() {
        return clear();
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return super.clone();
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
        return super.internalMergeFrom((h) s8Var);
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m496mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(RecentlyPlayedAlbumDecorationPolicy recentlyPlayedAlbumDecorationPolicy) {
        copyOnWrite();
        GetRecentlyPlayedRequest getRecentlyPlayedRequest = (GetRecentlyPlayedRequest) ((g) this).instance;
        int i = GetRecentlyPlayedRequest.LIMIT_FIELD_NUMBER;
        getRecentlyPlayedRequest.o(recentlyPlayedAlbumDecorationPolicy);
    }

    public final void q(RecentlyPlayedArtistDecorationPolicy recentlyPlayedArtistDecorationPolicy) {
        copyOnWrite();
        GetRecentlyPlayedRequest getRecentlyPlayedRequest = (GetRecentlyPlayedRequest) ((g) this).instance;
        int i = GetRecentlyPlayedRequest.LIMIT_FIELD_NUMBER;
        getRecentlyPlayedRequest.p(recentlyPlayedArtistDecorationPolicy);
    }

    public final void r(RecentlyPlayedCollectionTracksDecorationPolicy recentlyPlayedCollectionTracksDecorationPolicy) {
        copyOnWrite();
        GetRecentlyPlayedRequest getRecentlyPlayedRequest = (GetRecentlyPlayedRequest) ((g) this).instance;
        int i = GetRecentlyPlayedRequest.LIMIT_FIELD_NUMBER;
        getRecentlyPlayedRequest.q(recentlyPlayedCollectionTracksDecorationPolicy);
    }

    public final void s(RecentlyPlayedEpisodeDecorationPolicy recentlyPlayedEpisodeDecorationPolicy) {
        copyOnWrite();
        GetRecentlyPlayedRequest getRecentlyPlayedRequest = (GetRecentlyPlayedRequest) ((g) this).instance;
        int i = GetRecentlyPlayedRequest.LIMIT_FIELD_NUMBER;
        getRecentlyPlayedRequest.r(recentlyPlayedEpisodeDecorationPolicy);
    }

    public final void t(boolean z) {
        copyOnWrite();
        GetRecentlyPlayedRequest getRecentlyPlayedRequest = (GetRecentlyPlayedRequest) ((g) this).instance;
        int i = GetRecentlyPlayedRequest.LIMIT_FIELD_NUMBER;
        getRecentlyPlayedRequest.s(z);
    }

    public final void u(boolean z) {
        copyOnWrite();
        GetRecentlyPlayedRequest getRecentlyPlayedRequest = (GetRecentlyPlayedRequest) ((g) this).instance;
        int i = GetRecentlyPlayedRequest.LIMIT_FIELD_NUMBER;
        getRecentlyPlayedRequest.t(z);
    }

    public final void v(boolean z) {
        copyOnWrite();
        GetRecentlyPlayedRequest getRecentlyPlayedRequest = (GetRecentlyPlayedRequest) ((g) this).instance;
        int i = GetRecentlyPlayedRequest.LIMIT_FIELD_NUMBER;
        getRecentlyPlayedRequest.u(z);
    }

    public final void w(boolean z) {
        copyOnWrite();
        GetRecentlyPlayedRequest getRecentlyPlayedRequest = (GetRecentlyPlayedRequest) ((g) this).instance;
        int i = GetRecentlyPlayedRequest.LIMIT_FIELD_NUMBER;
        getRecentlyPlayedRequest.v(z);
    }

    public final void x(boolean z) {
        copyOnWrite();
        GetRecentlyPlayedRequest getRecentlyPlayedRequest = (GetRecentlyPlayedRequest) ((g) this).instance;
        int i = GetRecentlyPlayedRequest.LIMIT_FIELD_NUMBER;
        getRecentlyPlayedRequest.w(z);
    }

    public final void y(boolean z) {
        copyOnWrite();
        GetRecentlyPlayedRequest getRecentlyPlayedRequest = (GetRecentlyPlayedRequest) ((g) this).instance;
        int i = GetRecentlyPlayedRequest.LIMIT_FIELD_NUMBER;
        getRecentlyPlayedRequest.x(z);
    }

    public final void z(boolean z) {
        copyOnWrite();
        GetRecentlyPlayedRequest getRecentlyPlayedRequest = (GetRecentlyPlayedRequest) ((g) this).instance;
        int i = GetRecentlyPlayedRequest.LIMIT_FIELD_NUMBER;
        getRecentlyPlayedRequest.y(z);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m495clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m497mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m494clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m498mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
        return super.mergeFrom(bArr, i, i2, uz00Var);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
        return super/*p.r8*/.mergeFrom(inputStream);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
        return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
        return super/*p.r8*/.mergeFrom(phcVar);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
        return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
        return super/*p.r8*/.mergeFrom(lwgVar);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
        return super/*p.r8*/.mergeFrom(s2j0Var);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
        return super/*p.r8*/.mergeFrom(bArr);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
        return super.mergeFrom(bArr, i, i2, uz00Var);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
        return super/*p.r8*/.mergeFrom(bArr, uz00Var);
    }
}
