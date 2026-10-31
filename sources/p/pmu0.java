package p;

import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.io.InputStream;
import spotify.playlist.esperanto.proto.PlaylistGetRequest;
import spotify.playlist.esperanto.proto.PlaylistQuery;
import spotify.playlist.esperanto.proto.d;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pmu0 extends g implements v2j0 {
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
    public final /* bridge */ /* synthetic */ r8 m352mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy) {
        copyOnWrite();
        PlaylistGetRequest playlistGetRequest = (PlaylistGetRequest) ((g) this).instance;
        int i = PlaylistGetRequest.URI_FIELD_NUMBER;
        playlistGetRequest.o(playlistRequestDecorationPolicy);
    }

    public final void q(hru0 hru0Var) {
        copyOnWrite();
        PlaylistGetRequest playlistGetRequest = (PlaylistGetRequest) ((g) this).instance;
        PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy = (PlaylistRequestDecorationPolicy) hru0Var.build();
        int i = PlaylistGetRequest.URI_FIELD_NUMBER;
        playlistGetRequest.o(playlistRequestDecorationPolicy);
    }

    public final void r(d dVar) {
        copyOnWrite();
        PlaylistGetRequest playlistGetRequest = (PlaylistGetRequest) ((g) this).instance;
        PlaylistQuery playlistQuery = (PlaylistQuery) dVar.build();
        int i = PlaylistGetRequest.URI_FIELD_NUMBER;
        playlistGetRequest.p(playlistQuery);
    }

    public final void s(PlaylistQuery playlistQuery) {
        copyOnWrite();
        PlaylistGetRequest playlistGetRequest = (PlaylistGetRequest) ((g) this).instance;
        int i = PlaylistGetRequest.URI_FIELD_NUMBER;
        playlistGetRequest.p(playlistQuery);
    }

    public final void t(String str) {
        copyOnWrite();
        PlaylistGetRequest playlistGetRequest = (PlaylistGetRequest) ((g) this).instance;
        int i = PlaylistGetRequest.URI_FIELD_NUMBER;
        playlistGetRequest.q(str);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m351clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m353mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m350clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m354mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
