package p;

import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.cosmos.util.policy.proto.EpisodeCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodePlayedStateDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodeSyncDecorationPolicy;
import com.spotify.show_esperanto.proto.HeaderPolicy;
import com.spotify.show_esperanto.proto.ListPolicy;
import java.io.InputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class u0d0 extends g implements v2j0 {
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
    public final /* bridge */ /* synthetic */ r8 m803mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(EpisodeCollectionDecorationPolicy episodeCollectionDecorationPolicy) {
        copyOnWrite();
        ListPolicy listPolicy = (ListPolicy) ((g) this).instance;
        int i = ListPolicy.EPISODE_POLICY_FIELD_NUMBER;
        listPolicy.o(episodeCollectionDecorationPolicy);
    }

    public final void q(EpisodePlayedStateDecorationPolicy episodePlayedStateDecorationPolicy) {
        copyOnWrite();
        ListPolicy listPolicy = (ListPolicy) ((g) this).instance;
        int i = ListPolicy.EPISODE_POLICY_FIELD_NUMBER;
        listPolicy.p(episodePlayedStateDecorationPolicy);
    }

    public final void r(EpisodeDecorationPolicy episodeDecorationPolicy) {
        copyOnWrite();
        ListPolicy listPolicy = (ListPolicy) ((g) this).instance;
        int i = ListPolicy.EPISODE_POLICY_FIELD_NUMBER;
        listPolicy.q(episodeDecorationPolicy);
    }

    public final void s(EpisodeSyncDecorationPolicy episodeSyncDecorationPolicy) {
        copyOnWrite();
        ListPolicy listPolicy = (ListPolicy) ((g) this).instance;
        int i = ListPolicy.EPISODE_POLICY_FIELD_NUMBER;
        listPolicy.r(episodeSyncDecorationPolicy);
    }

    public final void t(HeaderPolicy headerPolicy) {
        copyOnWrite();
        ListPolicy listPolicy = (ListPolicy) ((g) this).instance;
        int i = ListPolicy.EPISODE_POLICY_FIELD_NUMBER;
        listPolicy.s(headerPolicy);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m802clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m804mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m801clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m805mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
