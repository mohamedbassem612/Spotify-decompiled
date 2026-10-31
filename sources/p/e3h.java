package p;

import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.InputStream;
import spotify.collection.esperanto.proto.CollectionArtistDecorationPolicy;
import spotify.collection.esperanto.proto.CollectionDecorateRequest;
import spotify.collection.esperanto.proto.CollectionEpisodeDecorationPolicy;
import spotify.collection.esperanto.proto.CollectionShowDecorationPolicy;
import spotify.collection.esperanto.proto.CollectionTrackDecorationPolicy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class e3h extends g implements v2j0 {
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
    public final /* bridge */ /* synthetic */ r8 m134mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(Iterable iterable) {
        copyOnWrite();
        CollectionDecorateRequest collectionDecorateRequest = (CollectionDecorateRequest) ((g) this).instance;
        int i = CollectionDecorateRequest.URI_FIELD_NUMBER;
        collectionDecorateRequest.n(iterable);
    }

    public final void q(String str) {
        copyOnWrite();
        CollectionDecorateRequest collectionDecorateRequest = (CollectionDecorateRequest) ((g) this).instance;
        int i = CollectionDecorateRequest.URI_FIELD_NUMBER;
        collectionDecorateRequest.o(str);
    }

    public final void r(CollectionArtistDecorationPolicy collectionArtistDecorationPolicy) {
        copyOnWrite();
        CollectionDecorateRequest collectionDecorateRequest = (CollectionDecorateRequest) ((g) this).instance;
        int i = CollectionDecorateRequest.URI_FIELD_NUMBER;
        collectionDecorateRequest.q(collectionArtistDecorationPolicy);
    }

    public final void s(String str) {
        copyOnWrite();
        CollectionDecorateRequest collectionDecorateRequest = (CollectionDecorateRequest) ((g) this).instance;
        int i = CollectionDecorateRequest.URI_FIELD_NUMBER;
        collectionDecorateRequest.r(str);
    }

    public final void t(k3h k3hVar) {
        copyOnWrite();
        CollectionDecorateRequest collectionDecorateRequest = (CollectionDecorateRequest) ((g) this).instance;
        CollectionEpisodeDecorationPolicy collectionEpisodeDecorationPolicy = (CollectionEpisodeDecorationPolicy) k3hVar.build();
        int i = CollectionDecorateRequest.URI_FIELD_NUMBER;
        collectionDecorateRequest.s(collectionEpisodeDecorationPolicy);
    }

    public final void u(CollectionEpisodeDecorationPolicy collectionEpisodeDecorationPolicy) {
        copyOnWrite();
        CollectionDecorateRequest collectionDecorateRequest = (CollectionDecorateRequest) ((g) this).instance;
        int i = CollectionDecorateRequest.URI_FIELD_NUMBER;
        collectionDecorateRequest.s(collectionEpisodeDecorationPolicy);
    }

    public final void v(c7h c7hVar) {
        copyOnWrite();
        CollectionDecorateRequest collectionDecorateRequest = (CollectionDecorateRequest) ((g) this).instance;
        CollectionShowDecorationPolicy collectionShowDecorationPolicy = (CollectionShowDecorationPolicy) c7hVar.build();
        int i = CollectionDecorateRequest.URI_FIELD_NUMBER;
        collectionDecorateRequest.t(collectionShowDecorationPolicy);
    }

    public final void w(CollectionShowDecorationPolicy collectionShowDecorationPolicy) {
        copyOnWrite();
        CollectionDecorateRequest collectionDecorateRequest = (CollectionDecorateRequest) ((g) this).instance;
        int i = CollectionDecorateRequest.URI_FIELD_NUMBER;
        collectionDecorateRequest.t(collectionShowDecorationPolicy);
    }

    public final void x(k7h k7hVar) {
        copyOnWrite();
        CollectionDecorateRequest collectionDecorateRequest = (CollectionDecorateRequest) ((g) this).instance;
        CollectionTrackDecorationPolicy collectionTrackDecorationPolicy = (CollectionTrackDecorationPolicy) k7hVar.build();
        int i = CollectionDecorateRequest.URI_FIELD_NUMBER;
        collectionDecorateRequest.u(collectionTrackDecorationPolicy);
    }

    public final void y(CollectionTrackDecorationPolicy collectionTrackDecorationPolicy) {
        copyOnWrite();
        CollectionDecorateRequest collectionDecorateRequest = (CollectionDecorateRequest) ((g) this).instance;
        int i = CollectionDecorateRequest.URI_FIELD_NUMBER;
        collectionDecorateRequest.u(collectionTrackDecorationPolicy);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m133clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m135mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m132clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m136mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
