package p;

import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.cosmos.util.policy.proto.ArtistCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackPlayedStateDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackSyncDecorationPolicy;
import java.io.InputStream;
import spotify.collection.esperanto.proto.CollectionAlbumDecorationPolicy;
import spotify.collection.esperanto.proto.CollectionTrackDecorationPolicy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class k7h extends g implements v2j0 {
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
    public final /* bridge */ /* synthetic */ r8 m241mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(CollectionAlbumDecorationPolicy collectionAlbumDecorationPolicy) {
        copyOnWrite();
        CollectionTrackDecorationPolicy collectionTrackDecorationPolicy = (CollectionTrackDecorationPolicy) ((g) this).instance;
        int i = CollectionTrackDecorationPolicy.COLLECTION_POLICY_FIELD_NUMBER;
        collectionTrackDecorationPolicy.o(collectionAlbumDecorationPolicy);
    }

    public final void q(ArtistCollectionDecorationPolicy.Builder builder) {
        copyOnWrite();
        CollectionTrackDecorationPolicy collectionTrackDecorationPolicy = (CollectionTrackDecorationPolicy) ((g) this).instance;
        ArtistCollectionDecorationPolicy artistCollectionDecorationPolicy = (ArtistCollectionDecorationPolicy) builder.build();
        int i = CollectionTrackDecorationPolicy.COLLECTION_POLICY_FIELD_NUMBER;
        collectionTrackDecorationPolicy.p(artistCollectionDecorationPolicy);
    }

    public final void r(ArtistDecorationPolicy.Builder builder) {
        copyOnWrite();
        CollectionTrackDecorationPolicy collectionTrackDecorationPolicy = (CollectionTrackDecorationPolicy) ((g) this).instance;
        ArtistDecorationPolicy artistDecorationPolicy = (ArtistDecorationPolicy) builder.build();
        int i = CollectionTrackDecorationPolicy.COLLECTION_POLICY_FIELD_NUMBER;
        collectionTrackDecorationPolicy.q(artistDecorationPolicy);
    }

    public final void s(ArtistDecorationPolicy artistDecorationPolicy) {
        copyOnWrite();
        CollectionTrackDecorationPolicy collectionTrackDecorationPolicy = (CollectionTrackDecorationPolicy) ((g) this).instance;
        int i = CollectionTrackDecorationPolicy.COLLECTION_POLICY_FIELD_NUMBER;
        collectionTrackDecorationPolicy.q(artistDecorationPolicy);
    }

    public final void t(TrackCollectionDecorationPolicy.Builder builder) {
        copyOnWrite();
        CollectionTrackDecorationPolicy collectionTrackDecorationPolicy = (CollectionTrackDecorationPolicy) ((g) this).instance;
        TrackCollectionDecorationPolicy trackCollectionDecorationPolicy = (TrackCollectionDecorationPolicy) builder.build();
        int i = CollectionTrackDecorationPolicy.COLLECTION_POLICY_FIELD_NUMBER;
        collectionTrackDecorationPolicy.r(trackCollectionDecorationPolicy);
    }

    public final void u(TrackCollectionDecorationPolicy trackCollectionDecorationPolicy) {
        copyOnWrite();
        CollectionTrackDecorationPolicy collectionTrackDecorationPolicy = (CollectionTrackDecorationPolicy) ((g) this).instance;
        int i = CollectionTrackDecorationPolicy.COLLECTION_POLICY_FIELD_NUMBER;
        collectionTrackDecorationPolicy.r(trackCollectionDecorationPolicy);
    }

    public final void v(TrackPlayedStateDecorationPolicy.Builder builder) {
        copyOnWrite();
        CollectionTrackDecorationPolicy collectionTrackDecorationPolicy = (CollectionTrackDecorationPolicy) ((g) this).instance;
        TrackPlayedStateDecorationPolicy trackPlayedStateDecorationPolicy = (TrackPlayedStateDecorationPolicy) builder.build();
        int i = CollectionTrackDecorationPolicy.COLLECTION_POLICY_FIELD_NUMBER;
        collectionTrackDecorationPolicy.s(trackPlayedStateDecorationPolicy);
    }

    public final void w(TrackPlayedStateDecorationPolicy trackPlayedStateDecorationPolicy) {
        copyOnWrite();
        CollectionTrackDecorationPolicy collectionTrackDecorationPolicy = (CollectionTrackDecorationPolicy) ((g) this).instance;
        int i = CollectionTrackDecorationPolicy.COLLECTION_POLICY_FIELD_NUMBER;
        collectionTrackDecorationPolicy.s(trackPlayedStateDecorationPolicy);
    }

    public final void x(TrackSyncDecorationPolicy trackSyncDecorationPolicy) {
        copyOnWrite();
        CollectionTrackDecorationPolicy collectionTrackDecorationPolicy = (CollectionTrackDecorationPolicy) ((g) this).instance;
        int i = CollectionTrackDecorationPolicy.COLLECTION_POLICY_FIELD_NUMBER;
        collectionTrackDecorationPolicy.t(trackSyncDecorationPolicy);
    }

    public final void y(TrackDecorationPolicy.Builder builder) {
        copyOnWrite();
        CollectionTrackDecorationPolicy collectionTrackDecorationPolicy = (CollectionTrackDecorationPolicy) ((g) this).instance;
        TrackDecorationPolicy trackDecorationPolicy = (TrackDecorationPolicy) builder.build();
        int i = CollectionTrackDecorationPolicy.COLLECTION_POLICY_FIELD_NUMBER;
        collectionTrackDecorationPolicy.u(trackDecorationPolicy);
    }

    public final void z(TrackDecorationPolicy trackDecorationPolicy) {
        copyOnWrite();
        CollectionTrackDecorationPolicy collectionTrackDecorationPolicy = (CollectionTrackDecorationPolicy) ((g) this).instance;
        int i = CollectionTrackDecorationPolicy.COLLECTION_POLICY_FIELD_NUMBER;
        collectionTrackDecorationPolicy.u(trackDecorationPolicy);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m240clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m242mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m239clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m243mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
