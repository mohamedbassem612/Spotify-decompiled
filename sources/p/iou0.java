package p;

import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.playlist.policy.proto.ItemCurationStatePolicy;
import com.spotify.playlist.policy.proto.ItemMetadataPolicy;
import com.spotify.playlist.policy.proto.ItemOfflineStateDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.UserDecorationPolicy;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class iou0 extends g implements v2j0 {
    public final void A() {
        copyOnWrite();
        PlaylistItemDecorationPolicy playlistItemDecorationPolicy = (PlaylistItemDecorationPolicy) ((g) this).instance;
        int i = PlaylistItemDecorationPolicy.URI_FIELD_NUMBER;
        playlistItemDecorationPolicy.E();
    }

    public final void B() {
        copyOnWrite();
        PlaylistItemDecorationPolicy playlistItemDecorationPolicy = (PlaylistItemDecorationPolicy) ((g) this).instance;
        int i = PlaylistItemDecorationPolicy.URI_FIELD_NUMBER;
        playlistItemDecorationPolicy.F();
    }

    public final void C() {
        copyOnWrite();
        PlaylistItemDecorationPolicy playlistItemDecorationPolicy = (PlaylistItemDecorationPolicy) ((g) this).instance;
        int i = PlaylistItemDecorationPolicy.URI_FIELD_NUMBER;
        playlistItemDecorationPolicy.G();
    }

    public final void D(boolean z) {
        copyOnWrite();
        PlaylistItemDecorationPolicy playlistItemDecorationPolicy = (PlaylistItemDecorationPolicy) ((g) this).instance;
        int i = PlaylistItemDecorationPolicy.URI_FIELD_NUMBER;
        playlistItemDecorationPolicy.H(z);
    }

    public final void E() {
        copyOnWrite();
        PlaylistItemDecorationPolicy playlistItemDecorationPolicy = (PlaylistItemDecorationPolicy) ((g) this).instance;
        int i = PlaylistItemDecorationPolicy.URI_FIELD_NUMBER;
        playlistItemDecorationPolicy.I();
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
    public final /* bridge */ /* synthetic */ r8 m206mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(Iterable iterable) {
        copyOnWrite();
        PlaylistItemDecorationPolicy playlistItemDecorationPolicy = (PlaylistItemDecorationPolicy) ((g) this).instance;
        int i = PlaylistItemDecorationPolicy.URI_FIELD_NUMBER;
        playlistItemDecorationPolicy.n(iterable);
    }

    public final List q() {
        return Collections.unmodifiableList(((PlaylistItemDecorationPolicy) ((g) this).instance).r());
    }

    public final void r() {
        copyOnWrite();
        PlaylistItemDecorationPolicy playlistItemDecorationPolicy = (PlaylistItemDecorationPolicy) ((g) this).instance;
        int i = PlaylistItemDecorationPolicy.URI_FIELD_NUMBER;
        playlistItemDecorationPolicy.w();
    }

    public final void s(UserDecorationPolicy userDecorationPolicy) {
        copyOnWrite();
        PlaylistItemDecorationPolicy playlistItemDecorationPolicy = (PlaylistItemDecorationPolicy) ((g) this).instance;
        int i = PlaylistItemDecorationPolicy.URI_FIELD_NUMBER;
        playlistItemDecorationPolicy.x(userDecorationPolicy);
    }

    public final void t(boolean z) {
        copyOnWrite();
        PlaylistItemDecorationPolicy playlistItemDecorationPolicy = (PlaylistItemDecorationPolicy) ((g) this).instance;
        int i = PlaylistItemDecorationPolicy.URI_FIELD_NUMBER;
        playlistItemDecorationPolicy.y(z);
    }

    public final void u(dj90 dj90Var) {
        copyOnWrite();
        PlaylistItemDecorationPolicy playlistItemDecorationPolicy = (PlaylistItemDecorationPolicy) ((g) this).instance;
        ItemCurationStatePolicy itemCurationStatePolicy = (ItemCurationStatePolicy) dj90Var.build();
        int i = PlaylistItemDecorationPolicy.URI_FIELD_NUMBER;
        playlistItemDecorationPolicy.z(itemCurationStatePolicy);
    }

    public final void v() {
        copyOnWrite();
        PlaylistItemDecorationPolicy playlistItemDecorationPolicy = (PlaylistItemDecorationPolicy) ((g) this).instance;
        int i = PlaylistItemDecorationPolicy.URI_FIELD_NUMBER;
        playlistItemDecorationPolicy.A();
    }

    public final void w(nl90 nl90Var) {
        copyOnWrite();
        PlaylistItemDecorationPolicy playlistItemDecorationPolicy = (PlaylistItemDecorationPolicy) ((g) this).instance;
        ItemMetadataPolicy itemMetadataPolicy = (ItemMetadataPolicy) nl90Var.build();
        int i = PlaylistItemDecorationPolicy.URI_FIELD_NUMBER;
        playlistItemDecorationPolicy.B(itemMetadataPolicy);
    }

    public final void x() {
        copyOnWrite();
        PlaylistItemDecorationPolicy playlistItemDecorationPolicy = (PlaylistItemDecorationPolicy) ((g) this).instance;
        int i = PlaylistItemDecorationPolicy.URI_FIELD_NUMBER;
        playlistItemDecorationPolicy.C();
    }

    public final void y(ItemOfflineStateDecorationPolicy itemOfflineStateDecorationPolicy) {
        copyOnWrite();
        PlaylistItemDecorationPolicy playlistItemDecorationPolicy = (PlaylistItemDecorationPolicy) ((g) this).instance;
        int i = PlaylistItemDecorationPolicy.URI_FIELD_NUMBER;
        playlistItemDecorationPolicy.D(itemOfflineStateDecorationPolicy);
    }

    public final void z(ol90 ol90Var) {
        copyOnWrite();
        PlaylistItemDecorationPolicy playlistItemDecorationPolicy = (PlaylistItemDecorationPolicy) ((g) this).instance;
        ItemOfflineStateDecorationPolicy itemOfflineStateDecorationPolicy = (ItemOfflineStateDecorationPolicy) ol90Var.build();
        int i = PlaylistItemDecorationPolicy.URI_FIELD_NUMBER;
        playlistItemDecorationPolicy.D(itemOfflineStateDecorationPolicy);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m205clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m207mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m204clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m208mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
