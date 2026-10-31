package p;

import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.player.esperanto.proto.EsContext;
import com.spotify.player.esperanto.proto.EsLoggingParams;
import com.spotify.player.esperanto.proto.EsPlayOptions;
import com.spotify.player.esperanto.proto.EsPlayOrigin;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions;
import java.io.InputStream;
import spotify.playlist.esperanto.proto.PlaylistPlayRequest;
import spotify.playlist.esperanto.proto.PlaylistQuery;
import spotify.playlist.esperanto.proto.Signal;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hqu0 extends g implements v2j0 {
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
    public final /* bridge */ /* synthetic */ r8 m955mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(cmz cmzVar) {
        copyOnWrite();
        PlaylistPlayRequest playlistPlayRequest = (PlaylistPlayRequest) ((g) this).instance;
        EsContext.Context context = (EsContext.Context) cmzVar.build();
        int i = PlaylistPlayRequest.PLAYLIST_QUERY_FIELD_NUMBER;
        playlistPlayRequest.o(context);
    }

    public final void q(EsLoggingParams.LoggingParams loggingParams) {
        copyOnWrite();
        PlaylistPlayRequest playlistPlayRequest = (PlaylistPlayRequest) ((g) this).instance;
        int i = PlaylistPlayRequest.PLAYLIST_QUERY_FIELD_NUMBER;
        playlistPlayRequest.p(loggingParams);
    }

    public final void r(EsPlayOptions.PlayOptions playOptions) {
        copyOnWrite();
        PlaylistPlayRequest playlistPlayRequest = (PlaylistPlayRequest) ((g) this).instance;
        int i = PlaylistPlayRequest.PLAYLIST_QUERY_FIELD_NUMBER;
        playlistPlayRequest.q(playOptions);
    }

    public final void s(EsPlayOrigin.PlayOrigin playOrigin) {
        copyOnWrite();
        PlaylistPlayRequest playlistPlayRequest = (PlaylistPlayRequest) ((g) this).instance;
        int i = PlaylistPlayRequest.PLAYLIST_QUERY_FIELD_NUMBER;
        playlistPlayRequest.r(playOrigin);
    }

    public final void t(PlaylistQuery playlistQuery) {
        copyOnWrite();
        PlaylistPlayRequest playlistPlayRequest = (PlaylistPlayRequest) ((g) this).instance;
        int i = PlaylistPlayRequest.PLAYLIST_QUERY_FIELD_NUMBER;
        playlistPlayRequest.s(playlistQuery);
    }

    public final void u(EsPreparePlayOptions.PreparePlayOptions preparePlayOptions) {
        copyOnWrite();
        PlaylistPlayRequest playlistPlayRequest = (PlaylistPlayRequest) ((g) this).instance;
        int i = PlaylistPlayRequest.PLAYLIST_QUERY_FIELD_NUMBER;
        playlistPlayRequest.t(preparePlayOptions);
    }

    public final void v(Signal signal) {
        copyOnWrite();
        PlaylistPlayRequest playlistPlayRequest = (PlaylistPlayRequest) ((g) this).instance;
        int i = PlaylistPlayRequest.PLAYLIST_QUERY_FIELD_NUMBER;
        playlistPlayRequest.u(signal);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m954clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m956mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m953clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m957mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
