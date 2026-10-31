package p;

import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.cosmos.util.policy.proto.AlbumDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.AlbumSyncDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicy;
import com.spotify.recently_played_esperanto.proto.RecentlyPlayedAlbumDecorationPolicy;
import java.io.InputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ho01 extends g implements v2j0 {
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
    public final /* bridge */ /* synthetic */ r8 m395mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(AlbumDecorationPolicy albumDecorationPolicy) {
        copyOnWrite();
        RecentlyPlayedAlbumDecorationPolicy recentlyPlayedAlbumDecorationPolicy = (RecentlyPlayedAlbumDecorationPolicy) ((g) this).instance;
        int i = RecentlyPlayedAlbumDecorationPolicy.SYNC_POLICY_FIELD_NUMBER;
        recentlyPlayedAlbumDecorationPolicy.o(albumDecorationPolicy);
    }

    public final void q(ArtistDecorationPolicy artistDecorationPolicy) {
        copyOnWrite();
        RecentlyPlayedAlbumDecorationPolicy recentlyPlayedAlbumDecorationPolicy = (RecentlyPlayedAlbumDecorationPolicy) ((g) this).instance;
        int i = RecentlyPlayedAlbumDecorationPolicy.SYNC_POLICY_FIELD_NUMBER;
        recentlyPlayedAlbumDecorationPolicy.p(artistDecorationPolicy);
    }

    public final void r(AlbumSyncDecorationPolicy albumSyncDecorationPolicy) {
        copyOnWrite();
        RecentlyPlayedAlbumDecorationPolicy recentlyPlayedAlbumDecorationPolicy = (RecentlyPlayedAlbumDecorationPolicy) ((g) this).instance;
        int i = RecentlyPlayedAlbumDecorationPolicy.SYNC_POLICY_FIELD_NUMBER;
        recentlyPlayedAlbumDecorationPolicy.q(albumSyncDecorationPolicy);
    }

    public final void s() {
        copyOnWrite();
        RecentlyPlayedAlbumDecorationPolicy recentlyPlayedAlbumDecorationPolicy = (RecentlyPlayedAlbumDecorationPolicy) ((g) this).instance;
        int i = RecentlyPlayedAlbumDecorationPolicy.SYNC_POLICY_FIELD_NUMBER;
        recentlyPlayedAlbumDecorationPolicy.r();
    }

    public final void t() {
        copyOnWrite();
        RecentlyPlayedAlbumDecorationPolicy recentlyPlayedAlbumDecorationPolicy = (RecentlyPlayedAlbumDecorationPolicy) ((g) this).instance;
        int i = RecentlyPlayedAlbumDecorationPolicy.SYNC_POLICY_FIELD_NUMBER;
        recentlyPlayedAlbumDecorationPolicy.s();
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m394clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m396mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m393clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m397mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
