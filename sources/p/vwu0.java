package p;

import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistAlbumDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import com.spotify.playlist.policy.proto.UserDecorationPolicy;
import java.io.InputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vwu0 extends g implements v2j0 {
    public final void A() {
        copyOnWrite();
        PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy = (PlaylistTrackDecorationPolicy) ((g) this).instance;
        int i = PlaylistTrackDecorationPolicy.TRACK_FIELD_NUMBER;
        playlistTrackDecorationPolicy.B();
    }

    public final void B() {
        copyOnWrite();
        PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy = (PlaylistTrackDecorationPolicy) ((g) this).instance;
        int i = PlaylistTrackDecorationPolicy.TRACK_FIELD_NUMBER;
        playlistTrackDecorationPolicy.C();
    }

    public final void C(TrackDecorationPolicy.Builder builder) {
        copyOnWrite();
        PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy = (PlaylistTrackDecorationPolicy) ((g) this).instance;
        TrackDecorationPolicy trackDecorationPolicy = (TrackDecorationPolicy) builder.build();
        int i = PlaylistTrackDecorationPolicy.TRACK_FIELD_NUMBER;
        playlistTrackDecorationPolicy.D(trackDecorationPolicy);
    }

    public final void D(TrackDecorationPolicy trackDecorationPolicy) {
        copyOnWrite();
        PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy = (PlaylistTrackDecorationPolicy) ((g) this).instance;
        int i = PlaylistTrackDecorationPolicy.TRACK_FIELD_NUMBER;
        playlistTrackDecorationPolicy.D(trackDecorationPolicy);
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
    public final /* bridge */ /* synthetic */ r8 m477mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n() {
        copyOnWrite();
        PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy = (PlaylistTrackDecorationPolicy) ((g) this).instance;
        int i = PlaylistTrackDecorationPolicy.TRACK_FIELD_NUMBER;
        playlistTrackDecorationPolicy.s();
    }

    public final void q(UserDecorationPolicy userDecorationPolicy) {
        copyOnWrite();
        PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy = (PlaylistTrackDecorationPolicy) ((g) this).instance;
        int i = PlaylistTrackDecorationPolicy.TRACK_FIELD_NUMBER;
        playlistTrackDecorationPolicy.t(userDecorationPolicy);
    }

    public final void r(PlaylistAlbumDecorationPolicy playlistAlbumDecorationPolicy) {
        copyOnWrite();
        PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy = (PlaylistTrackDecorationPolicy) ((g) this).instance;
        int i = PlaylistTrackDecorationPolicy.TRACK_FIELD_NUMBER;
        playlistTrackDecorationPolicy.u(playlistAlbumDecorationPolicy);
    }

    public final void s(dgu0 dgu0Var) {
        copyOnWrite();
        PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy = (PlaylistTrackDecorationPolicy) ((g) this).instance;
        PlaylistAlbumDecorationPolicy playlistAlbumDecorationPolicy = (PlaylistAlbumDecorationPolicy) dgu0Var.build();
        int i = PlaylistTrackDecorationPolicy.TRACK_FIELD_NUMBER;
        playlistTrackDecorationPolicy.u(playlistAlbumDecorationPolicy);
    }

    public final void t(ArtistDecorationPolicy.Builder builder) {
        copyOnWrite();
        PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy = (PlaylistTrackDecorationPolicy) ((g) this).instance;
        ArtistDecorationPolicy artistDecorationPolicy = (ArtistDecorationPolicy) builder.build();
        int i = PlaylistTrackDecorationPolicy.TRACK_FIELD_NUMBER;
        playlistTrackDecorationPolicy.v(artistDecorationPolicy);
    }

    public final void u(ArtistDecorationPolicy artistDecorationPolicy) {
        copyOnWrite();
        PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy = (PlaylistTrackDecorationPolicy) ((g) this).instance;
        int i = PlaylistTrackDecorationPolicy.TRACK_FIELD_NUMBER;
        playlistTrackDecorationPolicy.v(artistDecorationPolicy);
    }

    public final void v(boolean z) {
        copyOnWrite();
        PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy = (PlaylistTrackDecorationPolicy) ((g) this).instance;
        int i = PlaylistTrackDecorationPolicy.TRACK_FIELD_NUMBER;
        playlistTrackDecorationPolicy.w(z);
    }

    public final void w() {
        copyOnWrite();
        PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy = (PlaylistTrackDecorationPolicy) ((g) this).instance;
        int i = PlaylistTrackDecorationPolicy.TRACK_FIELD_NUMBER;
        playlistTrackDecorationPolicy.x();
    }

    public final void x() {
        copyOnWrite();
        PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy = (PlaylistTrackDecorationPolicy) ((g) this).instance;
        int i = PlaylistTrackDecorationPolicy.TRACK_FIELD_NUMBER;
        playlistTrackDecorationPolicy.y();
    }

    public final void y() {
        copyOnWrite();
        PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy = (PlaylistTrackDecorationPolicy) ((g) this).instance;
        int i = PlaylistTrackDecorationPolicy.TRACK_FIELD_NUMBER;
        playlistTrackDecorationPolicy.z();
    }

    public final void z() {
        copyOnWrite();
        PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy = (PlaylistTrackDecorationPolicy) ((g) this).instance;
        int i = PlaylistTrackDecorationPolicy.TRACK_FIELD_NUMBER;
        playlistTrackDecorationPolicy.A();
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m476clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m478mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m475clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m479mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
