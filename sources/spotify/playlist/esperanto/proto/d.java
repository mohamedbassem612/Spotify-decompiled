package spotify.playlist.esperanto.proto;

import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.InputStream;
import java.util.ArrayList;
import p.lwg;
import p.phc;
import p.r2j0;
import p.r8;
import p.s2j0;
import p.s8;
import p.uz00;
import p.v2j0;
import p.vqu0;
import p.wqu0;
import p.yvu0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class d extends g implements v2j0 {
    public final void A(wqu0 wqu0Var) {
        copyOnWrite();
        PlaylistQuery playlistQuery = (PlaylistQuery) ((g) this).instance;
        PlaylistRange playlistRange = (PlaylistRange) wqu0Var.build();
        int i = PlaylistQuery.BOOL_PREDICATES_FIELD_NUMBER;
        playlistQuery.E(playlistRange);
    }

    public final void B(PlaylistRange playlistRange) {
        copyOnWrite();
        PlaylistQuery playlistQuery = (PlaylistQuery) ((g) this).instance;
        int i = PlaylistQuery.BOOL_PREDICATES_FIELD_NUMBER;
        playlistQuery.E(playlistRange);
    }

    public final void C(boolean z) {
        copyOnWrite();
        PlaylistQuery playlistQuery = (PlaylistQuery) ((g) this).instance;
        int i = PlaylistQuery.BOOL_PREDICATES_FIELD_NUMBER;
        playlistQuery.F(z);
    }

    public final void D(vqu0 vqu0Var) {
        copyOnWrite();
        PlaylistQuery playlistQuery = (PlaylistQuery) ((g) this).instance;
        int i = PlaylistQuery.BOOL_PREDICATES_FIELD_NUMBER;
        playlistQuery.G(vqu0Var);
    }

    public final void E(yvu0 yvu0Var) {
        copyOnWrite();
        PlaylistQuery playlistQuery = (PlaylistQuery) ((g) this).instance;
        int i = PlaylistQuery.BOOL_PREDICATES_FIELD_NUMBER;
        playlistQuery.H(yvu0Var);
    }

    public final void F(String str) {
        copyOnWrite();
        PlaylistQuery playlistQuery = (PlaylistQuery) ((g) this).instance;
        int i = PlaylistQuery.BOOL_PREDICATES_FIELD_NUMBER;
        playlistQuery.I(str);
    }

    public final void G(int i) {
        copyOnWrite();
        PlaylistQuery playlistQuery = (PlaylistQuery) ((g) this).instance;
        int i2 = PlaylistQuery.BOOL_PREDICATES_FIELD_NUMBER;
        playlistQuery.J(i);
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
    public final /* bridge */ /* synthetic */ r8 m578mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(ArrayList arrayList) {
        copyOnWrite();
        PlaylistQuery playlistQuery = (PlaylistQuery) ((g) this).instance;
        int i = PlaylistQuery.BOOL_PREDICATES_FIELD_NUMBER;
        playlistQuery.n(arrayList);
    }

    public final void q(ArrayList arrayList) {
        copyOnWrite();
        PlaylistQuery playlistQuery = (PlaylistQuery) ((g) this).instance;
        int i = PlaylistQuery.BOOL_PREDICATES_FIELD_NUMBER;
        playlistQuery.o(arrayList);
    }

    public final void r(Iterable iterable) {
        copyOnWrite();
        PlaylistQuery playlistQuery = (PlaylistQuery) ((g) this).instance;
        int i = PlaylistQuery.BOOL_PREDICATES_FIELD_NUMBER;
        playlistQuery.p(iterable);
    }

    public final void s(Iterable iterable) {
        copyOnWrite();
        PlaylistQuery playlistQuery = (PlaylistQuery) ((g) this).instance;
        int i = PlaylistQuery.BOOL_PREDICATES_FIELD_NUMBER;
        playlistQuery.q(iterable);
    }

    public final void t(ArrayList arrayList) {
        copyOnWrite();
        PlaylistQuery playlistQuery = (PlaylistQuery) ((g) this).instance;
        int i = PlaylistQuery.BOOL_PREDICATES_FIELD_NUMBER;
        playlistQuery.r(arrayList);
    }

    public final void u(PlaylistQuery.AttributeFilter attributeFilter) {
        copyOnWrite();
        PlaylistQuery playlistQuery = (PlaylistQuery) ((g) this).instance;
        int i = PlaylistQuery.BOOL_PREDICATES_FIELD_NUMBER;
        playlistQuery.s(attributeFilter);
    }

    public final void v() {
        copyOnWrite();
        PlaylistQuery playlistQuery = (PlaylistQuery) ((g) this).instance;
        int i = PlaylistQuery.BOOL_PREDICATES_FIELD_NUMBER;
        playlistQuery.z();
    }

    public final void w(boolean z) {
        copyOnWrite();
        PlaylistQuery playlistQuery = (PlaylistQuery) ((g) this).instance;
        int i = PlaylistQuery.BOOL_PREDICATES_FIELD_NUMBER;
        playlistQuery.A(z);
    }

    public final void x(String str) {
        copyOnWrite();
        PlaylistQuery playlistQuery = (PlaylistQuery) ((g) this).instance;
        int i = PlaylistQuery.BOOL_PREDICATES_FIELD_NUMBER;
        playlistQuery.B(str);
    }

    public final void y(boolean z) {
        copyOnWrite();
        PlaylistQuery playlistQuery = (PlaylistQuery) ((g) this).instance;
        int i = PlaylistQuery.BOOL_PREDICATES_FIELD_NUMBER;
        playlistQuery.C(z);
    }

    public final void z(String str) {
        copyOnWrite();
        PlaylistQuery playlistQuery = (PlaylistQuery) ((g) this).instance;
        int i = PlaylistQuery.BOOL_PREDICATES_FIELD_NUMBER;
        playlistQuery.D(str);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m577clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m579mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m576clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m580mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
