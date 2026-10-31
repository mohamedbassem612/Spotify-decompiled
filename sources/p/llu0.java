package p;

import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.cosmos.util.policy.proto.EpisodeCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodePlayedStateDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodeSyncDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ShowDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistEpisodeDecorationPolicy;
import com.spotify.playlist.policy.proto.UserDecorationPolicy;
import java.io.InputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class llu0 extends g implements v2j0 {
    public final void A() {
        copyOnWrite();
        PlaylistEpisodeDecorationPolicy playlistEpisodeDecorationPolicy = (PlaylistEpisodeDecorationPolicy) ((g) this).instance;
        int i = PlaylistEpisodeDecorationPolicy.EPISODE_FIELD_NUMBER;
        playlistEpisodeDecorationPolicy.A();
    }

    public final void B(EpisodeSyncDecorationPolicy.Builder builder) {
        copyOnWrite();
        PlaylistEpisodeDecorationPolicy playlistEpisodeDecorationPolicy = (PlaylistEpisodeDecorationPolicy) ((g) this).instance;
        EpisodeSyncDecorationPolicy episodeSyncDecorationPolicy = (EpisodeSyncDecorationPolicy) builder.build();
        int i = PlaylistEpisodeDecorationPolicy.EPISODE_FIELD_NUMBER;
        playlistEpisodeDecorationPolicy.B(episodeSyncDecorationPolicy);
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
    public final /* bridge */ /* synthetic */ r8 m261mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n() {
        copyOnWrite();
        PlaylistEpisodeDecorationPolicy playlistEpisodeDecorationPolicy = (PlaylistEpisodeDecorationPolicy) ((g) this).instance;
        int i = PlaylistEpisodeDecorationPolicy.EPISODE_FIELD_NUMBER;
        playlistEpisodeDecorationPolicy.s();
    }

    public final void q(UserDecorationPolicy userDecorationPolicy) {
        copyOnWrite();
        PlaylistEpisodeDecorationPolicy playlistEpisodeDecorationPolicy = (PlaylistEpisodeDecorationPolicy) ((g) this).instance;
        int i = PlaylistEpisodeDecorationPolicy.EPISODE_FIELD_NUMBER;
        playlistEpisodeDecorationPolicy.t(userDecorationPolicy);
    }

    public final void r(EpisodeCollectionDecorationPolicy.Builder builder) {
        copyOnWrite();
        PlaylistEpisodeDecorationPolicy playlistEpisodeDecorationPolicy = (PlaylistEpisodeDecorationPolicy) ((g) this).instance;
        EpisodeCollectionDecorationPolicy episodeCollectionDecorationPolicy = (EpisodeCollectionDecorationPolicy) builder.build();
        int i = PlaylistEpisodeDecorationPolicy.EPISODE_FIELD_NUMBER;
        playlistEpisodeDecorationPolicy.u(episodeCollectionDecorationPolicy);
    }

    public final void s(EpisodeDecorationPolicy.Builder builder) {
        copyOnWrite();
        PlaylistEpisodeDecorationPolicy playlistEpisodeDecorationPolicy = (PlaylistEpisodeDecorationPolicy) ((g) this).instance;
        EpisodeDecorationPolicy episodeDecorationPolicy = (EpisodeDecorationPolicy) builder.build();
        int i = PlaylistEpisodeDecorationPolicy.EPISODE_FIELD_NUMBER;
        playlistEpisodeDecorationPolicy.v(episodeDecorationPolicy);
    }

    public final void t(EpisodeDecorationPolicy episodeDecorationPolicy) {
        copyOnWrite();
        PlaylistEpisodeDecorationPolicy playlistEpisodeDecorationPolicy = (PlaylistEpisodeDecorationPolicy) ((g) this).instance;
        int i = PlaylistEpisodeDecorationPolicy.EPISODE_FIELD_NUMBER;
        playlistEpisodeDecorationPolicy.v(episodeDecorationPolicy);
    }

    public final void u() {
        copyOnWrite();
        PlaylistEpisodeDecorationPolicy playlistEpisodeDecorationPolicy = (PlaylistEpisodeDecorationPolicy) ((g) this).instance;
        int i = PlaylistEpisodeDecorationPolicy.EPISODE_FIELD_NUMBER;
        playlistEpisodeDecorationPolicy.w();
    }

    public final void v(EpisodePlayedStateDecorationPolicy.Builder builder) {
        copyOnWrite();
        PlaylistEpisodeDecorationPolicy playlistEpisodeDecorationPolicy = (PlaylistEpisodeDecorationPolicy) ((g) this).instance;
        EpisodePlayedStateDecorationPolicy episodePlayedStateDecorationPolicy = (EpisodePlayedStateDecorationPolicy) builder.build();
        int i = PlaylistEpisodeDecorationPolicy.EPISODE_FIELD_NUMBER;
        playlistEpisodeDecorationPolicy.x(episodePlayedStateDecorationPolicy);
    }

    public final void w(EpisodePlayedStateDecorationPolicy episodePlayedStateDecorationPolicy) {
        copyOnWrite();
        PlaylistEpisodeDecorationPolicy playlistEpisodeDecorationPolicy = (PlaylistEpisodeDecorationPolicy) ((g) this).instance;
        int i = PlaylistEpisodeDecorationPolicy.EPISODE_FIELD_NUMBER;
        playlistEpisodeDecorationPolicy.x(episodePlayedStateDecorationPolicy);
    }

    public final void x() {
        copyOnWrite();
        PlaylistEpisodeDecorationPolicy playlistEpisodeDecorationPolicy = (PlaylistEpisodeDecorationPolicy) ((g) this).instance;
        int i = PlaylistEpisodeDecorationPolicy.EPISODE_FIELD_NUMBER;
        playlistEpisodeDecorationPolicy.y();
    }

    public final void y(ShowDecorationPolicy.Builder builder) {
        copyOnWrite();
        PlaylistEpisodeDecorationPolicy playlistEpisodeDecorationPolicy = (PlaylistEpisodeDecorationPolicy) ((g) this).instance;
        ShowDecorationPolicy showDecorationPolicy = (ShowDecorationPolicy) builder.build();
        int i = PlaylistEpisodeDecorationPolicy.EPISODE_FIELD_NUMBER;
        playlistEpisodeDecorationPolicy.z(showDecorationPolicy);
    }

    public final void z(ShowDecorationPolicy showDecorationPolicy) {
        copyOnWrite();
        PlaylistEpisodeDecorationPolicy playlistEpisodeDecorationPolicy = (PlaylistEpisodeDecorationPolicy) ((g) this).instance;
        int i = PlaylistEpisodeDecorationPolicy.EPISODE_FIELD_NUMBER;
        playlistEpisodeDecorationPolicy.z(showDecorationPolicy);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m260clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m262mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m259clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m263mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
