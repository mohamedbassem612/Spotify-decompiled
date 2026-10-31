package p;

import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistEpisodeDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import java.io.InputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hru0 extends g implements v2j0 {
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
    public final /* bridge */ /* synthetic */ r8 m196mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final PlaylistEpisodeDecorationPolicy n() {
        return ((PlaylistRequestDecorationPolicy) ((g) this).instance).o();
    }

    public final PlaylistItemDecorationPolicy q() {
        return ((PlaylistRequestDecorationPolicy) ((g) this).instance).p();
    }

    public final PlaylistTrackDecorationPolicy r() {
        return ((PlaylistRequestDecorationPolicy) ((g) this).instance).r();
    }

    public final void s(PlaylistEpisodeDecorationPolicy playlistEpisodeDecorationPolicy) {
        copyOnWrite();
        PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy = (PlaylistRequestDecorationPolicy) ((g) this).instance;
        int i = PlaylistRequestDecorationPolicy.PLAYLIST_FIELD_NUMBER;
        playlistRequestDecorationPolicy.u(playlistEpisodeDecorationPolicy);
    }

    public final void t(llu0 llu0Var) {
        copyOnWrite();
        PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy = (PlaylistRequestDecorationPolicy) ((g) this).instance;
        PlaylistEpisodeDecorationPolicy playlistEpisodeDecorationPolicy = (PlaylistEpisodeDecorationPolicy) llu0Var.build();
        int i = PlaylistRequestDecorationPolicy.PLAYLIST_FIELD_NUMBER;
        playlistRequestDecorationPolicy.u(playlistEpisodeDecorationPolicy);
    }

    public final void u(PlaylistItemDecorationPolicy playlistItemDecorationPolicy) {
        copyOnWrite();
        PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy = (PlaylistRequestDecorationPolicy) ((g) this).instance;
        int i = PlaylistRequestDecorationPolicy.PLAYLIST_FIELD_NUMBER;
        playlistRequestDecorationPolicy.v(playlistItemDecorationPolicy);
    }

    public final void v(iou0 iou0Var) {
        copyOnWrite();
        PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy = (PlaylistRequestDecorationPolicy) ((g) this).instance;
        PlaylistItemDecorationPolicy playlistItemDecorationPolicy = (PlaylistItemDecorationPolicy) iou0Var.build();
        int i = PlaylistRequestDecorationPolicy.PLAYLIST_FIELD_NUMBER;
        playlistRequestDecorationPolicy.v(playlistItemDecorationPolicy);
    }

    public final void w(PlaylistDecorationPolicy playlistDecorationPolicy) {
        copyOnWrite();
        PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy = (PlaylistRequestDecorationPolicy) ((g) this).instance;
        int i = PlaylistRequestDecorationPolicy.PLAYLIST_FIELD_NUMBER;
        playlistRequestDecorationPolicy.w(playlistDecorationPolicy);
    }

    public final void x(sku0 sku0Var) {
        copyOnWrite();
        PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy = (PlaylistRequestDecorationPolicy) ((g) this).instance;
        PlaylistDecorationPolicy playlistDecorationPolicy = (PlaylistDecorationPolicy) sku0Var.build();
        int i = PlaylistRequestDecorationPolicy.PLAYLIST_FIELD_NUMBER;
        playlistRequestDecorationPolicy.w(playlistDecorationPolicy);
    }

    public final void y(PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy) {
        copyOnWrite();
        PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy = (PlaylistRequestDecorationPolicy) ((g) this).instance;
        int i = PlaylistRequestDecorationPolicy.PLAYLIST_FIELD_NUMBER;
        playlistRequestDecorationPolicy.x(playlistTrackDecorationPolicy);
    }

    public final void z(vwu0 vwu0Var) {
        copyOnWrite();
        PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy = (PlaylistRequestDecorationPolicy) ((g) this).instance;
        PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy = (PlaylistTrackDecorationPolicy) vwu0Var.build();
        int i = PlaylistRequestDecorationPolicy.PLAYLIST_FIELD_NUMBER;
        playlistRequestDecorationPolicy.x(playlistTrackDecorationPolicy);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m195clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m197mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m194clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m198mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
