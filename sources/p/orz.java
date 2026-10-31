package p;

import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.player.esperanto.proto.EsCommandOptions$CommandOptions;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import com.spotify.player.esperanto.proto.EsOptional$OptionalBoolean;
import com.spotify.player.esperanto.proto.EsSetOptions$SetOptionsRequest;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class orz extends g implements v2j0 {
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
    public final /* bridge */ /* synthetic */ r8 m1425mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(Map map) {
        copyOnWrite();
        EsSetOptions$SetOptionsRequest esSetOptions$SetOptionsRequest = (EsSetOptions$SetOptionsRequest) ((g) this).instance;
        int i = EsSetOptions$SetOptionsRequest.REPEATING_TRACK_FIELD_NUMBER;
        esSetOptions$SetOptionsRequest.n().putAll(map);
    }

    public final void q(EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
        copyOnWrite();
        EsSetOptions$SetOptionsRequest esSetOptions$SetOptionsRequest = (EsSetOptions$SetOptionsRequest) ((g) this).instance;
        int i = EsSetOptions$SetOptionsRequest.REPEATING_TRACK_FIELD_NUMBER;
        esSetOptions$SetOptionsRequest.p(esLoggingParams$LoggingParams);
    }

    public final void r(EsCommandOptions$CommandOptions esCommandOptions$CommandOptions) {
        copyOnWrite();
        EsSetOptions$SetOptionsRequest esSetOptions$SetOptionsRequest = (EsSetOptions$SetOptionsRequest) ((g) this).instance;
        int i = EsSetOptions$SetOptionsRequest.REPEATING_TRACK_FIELD_NUMBER;
        esSetOptions$SetOptionsRequest.q(esCommandOptions$CommandOptions);
    }

    public final void s(float f) {
        copyOnWrite();
        EsSetOptions$SetOptionsRequest esSetOptions$SetOptionsRequest = (EsSetOptions$SetOptionsRequest) ((g) this).instance;
        int i = EsSetOptions$SetOptionsRequest.REPEATING_TRACK_FIELD_NUMBER;
        esSetOptions$SetOptionsRequest.r(f);
    }

    public final void t(EsOptional$OptionalBoolean esOptional$OptionalBoolean) {
        copyOnWrite();
        EsSetOptions$SetOptionsRequest esSetOptions$SetOptionsRequest = (EsSetOptions$SetOptionsRequest) ((g) this).instance;
        int i = EsSetOptions$SetOptionsRequest.REPEATING_TRACK_FIELD_NUMBER;
        esSetOptions$SetOptionsRequest.s(esOptional$OptionalBoolean);
    }

    public final void u(EsOptional$OptionalBoolean esOptional$OptionalBoolean) {
        copyOnWrite();
        EsSetOptions$SetOptionsRequest esSetOptions$SetOptionsRequest = (EsSetOptions$SetOptionsRequest) ((g) this).instance;
        int i = EsSetOptions$SetOptionsRequest.REPEATING_TRACK_FIELD_NUMBER;
        esSetOptions$SetOptionsRequest.t(esOptional$OptionalBoolean);
    }

    public final void v(EsOptional$OptionalBoolean esOptional$OptionalBoolean) {
        copyOnWrite();
        EsSetOptions$SetOptionsRequest esSetOptions$SetOptionsRequest = (EsSetOptions$SetOptionsRequest) ((g) this).instance;
        int i = EsSetOptions$SetOptionsRequest.REPEATING_TRACK_FIELD_NUMBER;
        esSetOptions$SetOptionsRequest.u(esOptional$OptionalBoolean);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m1424clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m1426mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m1423clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m1427mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
