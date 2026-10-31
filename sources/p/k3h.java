package p;

import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.cosmos.util.policy.proto.EpisodeCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodePlayedStateDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodeSyncDecorationPolicy;
import java.io.InputStream;
import spotify.collection.esperanto.proto.CollectionEpisodeDecorationPolicy;
import spotify.collection.esperanto.proto.CollectionShowDecorationPolicy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k3h extends g implements v2j0 {
    public k3h() {
        super(CollectionEpisodeDecorationPolicy.n());
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

    public final void n(EpisodeCollectionDecorationPolicy episodeCollectionDecorationPolicy) {
        copyOnWrite();
        CollectionEpisodeDecorationPolicy collectionEpisodeDecorationPolicy = ((g) this).instance;
        int i = CollectionEpisodeDecorationPolicy.EPISODE_POLICY_FIELD_NUMBER;
        collectionEpisodeDecorationPolicy.p(episodeCollectionDecorationPolicy);
    }

    public final void q() {
        copyOnWrite();
        CollectionEpisodeDecorationPolicy collectionEpisodeDecorationPolicy = ((g) this).instance;
        int i = CollectionEpisodeDecorationPolicy.EPISODE_POLICY_FIELD_NUMBER;
        collectionEpisodeDecorationPolicy.q();
    }

    public final void r(EpisodeDecorationPolicy episodeDecorationPolicy) {
        copyOnWrite();
        CollectionEpisodeDecorationPolicy collectionEpisodeDecorationPolicy = ((g) this).instance;
        int i = CollectionEpisodeDecorationPolicy.EPISODE_POLICY_FIELD_NUMBER;
        collectionEpisodeDecorationPolicy.r(episodeDecorationPolicy);
    }

    public final void s(EpisodePlayedStateDecorationPolicy.Builder builder) {
        copyOnWrite();
        CollectionEpisodeDecorationPolicy collectionEpisodeDecorationPolicy = ((g) this).instance;
        EpisodePlayedStateDecorationPolicy episodePlayedStateDecorationPolicyBuild = builder.build();
        int i = CollectionEpisodeDecorationPolicy.EPISODE_POLICY_FIELD_NUMBER;
        collectionEpisodeDecorationPolicy.s(episodePlayedStateDecorationPolicyBuild);
    }

    public final void t(EpisodePlayedStateDecorationPolicy episodePlayedStateDecorationPolicy) {
        copyOnWrite();
        CollectionEpisodeDecorationPolicy collectionEpisodeDecorationPolicy = ((g) this).instance;
        int i = CollectionEpisodeDecorationPolicy.EPISODE_POLICY_FIELD_NUMBER;
        collectionEpisodeDecorationPolicy.s(episodePlayedStateDecorationPolicy);
    }

    public final void u(CollectionShowDecorationPolicy collectionShowDecorationPolicy) {
        copyOnWrite();
        CollectionEpisodeDecorationPolicy collectionEpisodeDecorationPolicy = ((g) this).instance;
        int i = CollectionEpisodeDecorationPolicy.EPISODE_POLICY_FIELD_NUMBER;
        collectionEpisodeDecorationPolicy.t(collectionShowDecorationPolicy);
    }

    public final void v(EpisodeSyncDecorationPolicy episodeSyncDecorationPolicy) {
        copyOnWrite();
        CollectionEpisodeDecorationPolicy collectionEpisodeDecorationPolicy = ((g) this).instance;
        int i = CollectionEpisodeDecorationPolicy.EPISODE_POLICY_FIELD_NUMBER;
        collectionEpisodeDecorationPolicy.u(episodeSyncDecorationPolicy);
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
