package p;

import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import com.spotify.player.esperanto.proto.EsOptional;
import com.spotify.stream_reporting_attribution.proto.StreamReportingAttributionOuterClass;
import java.io.InputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class coz extends g implements v2j0 {
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
    public final /* bridge */ /* synthetic */ r8 m1069mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(String str) {
        copyOnWrite();
        EsLoggingParams$LoggingParams esLoggingParams$LoggingParams = (EsLoggingParams$LoggingParams) ((g) this).instance;
        int i = EsLoggingParams$LoggingParams.COMMAND_INITIATED_TIME_FIELD_NUMBER;
        esLoggingParams$LoggingParams.n(str);
    }

    public final void q(String str) {
        copyOnWrite();
        EsLoggingParams$LoggingParams esLoggingParams$LoggingParams = (EsLoggingParams$LoggingParams) ((g) this).instance;
        int i = EsLoggingParams$LoggingParams.COMMAND_INITIATED_TIME_FIELD_NUMBER;
        esLoggingParams$LoggingParams.o(str);
    }

    public final void r(String str) {
        copyOnWrite();
        EsLoggingParams$LoggingParams esLoggingParams$LoggingParams = (EsLoggingParams$LoggingParams) ((g) this).instance;
        int i = EsLoggingParams$LoggingParams.COMMAND_INITIATED_TIME_FIELD_NUMBER;
        esLoggingParams$LoggingParams.s(str);
    }

    public final void s(EsOptional.OptionalInt64 optionalInt64) {
        copyOnWrite();
        EsLoggingParams$LoggingParams esLoggingParams$LoggingParams = (EsLoggingParams$LoggingParams) ((g) this).instance;
        int i = EsLoggingParams$LoggingParams.COMMAND_INITIATED_TIME_FIELD_NUMBER;
        esLoggingParams$LoggingParams.t(optionalInt64);
    }

    public final void t(qpz qpzVar) {
        copyOnWrite();
        EsLoggingParams$LoggingParams esLoggingParams$LoggingParams = (EsLoggingParams$LoggingParams) ((g) this).instance;
        EsOptional.OptionalInt64 optionalInt64 = (EsOptional.OptionalInt64) qpzVar.build();
        int i = EsLoggingParams$LoggingParams.COMMAND_INITIATED_TIME_FIELD_NUMBER;
        esLoggingParams$LoggingParams.t(optionalInt64);
    }

    public final void u(bec1 bec1Var) {
        copyOnWrite();
        EsLoggingParams$LoggingParams esLoggingParams$LoggingParams = (EsLoggingParams$LoggingParams) ((g) this).instance;
        StreamReportingAttributionOuterClass.StreamReportingAttribution streamReportingAttribution = (StreamReportingAttributionOuterClass.StreamReportingAttribution) bec1Var.build();
        int i = EsLoggingParams$LoggingParams.COMMAND_INITIATED_TIME_FIELD_NUMBER;
        esLoggingParams$LoggingParams.u(streamReportingAttribution);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m1068clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m1070mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m1067clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m1071mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
