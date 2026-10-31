package p;

import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.adsinternal.adscommon.events.proto.AdError;
import java.io.InputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wn0 extends g implements v2j0 {
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
    public final /* bridge */ /* synthetic */ r8 m806mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(String str) {
        copyOnWrite();
        AdError adError = (AdError) ((g) this).instance;
        int i = AdError.REQUEST_TYPE_FIELD_NUMBER;
        adError.o(str);
    }

    public final void q(String str) {
        copyOnWrite();
        AdError adError = (AdError) ((g) this).instance;
        int i = AdError.REQUEST_TYPE_FIELD_NUMBER;
        adError.p(str);
    }

    public final void r(String str) {
        copyOnWrite();
        AdError adError = (AdError) ((g) this).instance;
        int i = AdError.REQUEST_TYPE_FIELD_NUMBER;
        adError.q(str);
    }

    public final void s(String str) {
        copyOnWrite();
        AdError adError = (AdError) ((g) this).instance;
        int i = AdError.REQUEST_TYPE_FIELD_NUMBER;
        adError.r(str);
    }

    public final void t(String str) {
        copyOnWrite();
        AdError adError = (AdError) ((g) this).instance;
        int i = AdError.REQUEST_TYPE_FIELD_NUMBER;
        adError.s(str);
    }

    public final void u(String str) {
        copyOnWrite();
        AdError adError = (AdError) ((g) this).instance;
        int i = AdError.REQUEST_TYPE_FIELD_NUMBER;
        adError.t(str);
    }

    public final void v(String str) {
        copyOnWrite();
        AdError adError = (AdError) ((g) this).instance;
        int i = AdError.REQUEST_TYPE_FIELD_NUMBER;
        adError.u(str);
    }

    public final void w(String str) {
        copyOnWrite();
        AdError adError = (AdError) ((g) this).instance;
        int i = AdError.REQUEST_TYPE_FIELD_NUMBER;
        adError.v(str);
    }

    public final void x(String str) {
        copyOnWrite();
        AdError adError = (AdError) ((g) this).instance;
        int i = AdError.REQUEST_TYPE_FIELD_NUMBER;
        adError.w(str);
    }

    public final void y(String str) {
        copyOnWrite();
        AdError adError = (AdError) ((g) this).instance;
        int i = AdError.REQUEST_TYPE_FIELD_NUMBER;
        adError.x(str);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m805clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m807mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m804clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m808mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
