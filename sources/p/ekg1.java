package p;

import com.spotify.automix.proto.TransitionOuterClass$AutomationCurves;
import com.spotify.automix.proto.TransitionOuterClass$BlockSequence;
import com.spotify.automix.proto.TransitionOuterClass$EqCurveOverrides;
import com.spotify.automix.proto.TransitionOuterClass$EqStyle;
import com.spotify.automix.proto.TransitionOuterClass$FilterCurveOverrides;
import com.spotify.automix.proto.TransitionOuterClass$FilterFxStyle;
import com.spotify.automix.proto.TransitionOuterClass$FxCurveOverrides;
import com.spotify.automix.proto.TransitionOuterClass$FxStyle;
import com.spotify.automix.proto.TransitionOuterClass$JogwheelStyle;
import com.spotify.automix.proto.TransitionOuterClass$LoopingStyle;
import com.spotify.automix.proto.TransitionOuterClass$Preset;
import com.spotify.automix.proto.TransitionOuterClass$VolumeStyle;
import java.io.InputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ekg1 extends com.google.protobuf.g implements v2j0 {
    public final void A(TransitionOuterClass$BlockSequence transitionOuterClass$BlockSequence) {
        copyOnWrite();
        TransitionOuterClass$Preset transitionOuterClass$Preset = (TransitionOuterClass$Preset) ((com.google.protobuf.g) this).instance;
        int i = TransitionOuterClass$Preset.ID_FIELD_NUMBER;
        transitionOuterClass$Preset.f0(transitionOuterClass$BlockSequence);
    }

    public final void B(TransitionOuterClass$LoopingStyle transitionOuterClass$LoopingStyle) {
        copyOnWrite();
        TransitionOuterClass$Preset transitionOuterClass$Preset = (TransitionOuterClass$Preset) ((com.google.protobuf.g) this).instance;
        int i = TransitionOuterClass$Preset.ID_FIELD_NUMBER;
        transitionOuterClass$Preset.g0(transitionOuterClass$LoopingStyle);
    }

    public final void C(TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves) {
        copyOnWrite();
        TransitionOuterClass$Preset transitionOuterClass$Preset = (TransitionOuterClass$Preset) ((com.google.protobuf.g) this).instance;
        int i = TransitionOuterClass$Preset.ID_FIELD_NUMBER;
        transitionOuterClass$Preset.h0(transitionOuterClass$AutomationCurves);
    }

    public final void D(TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves) {
        copyOnWrite();
        TransitionOuterClass$Preset transitionOuterClass$Preset = (TransitionOuterClass$Preset) ((com.google.protobuf.g) this).instance;
        int i = TransitionOuterClass$Preset.ID_FIELD_NUMBER;
        transitionOuterClass$Preset.i0(transitionOuterClass$AutomationCurves);
    }

    public final void E(TransitionOuterClass$VolumeStyle transitionOuterClass$VolumeStyle) {
        copyOnWrite();
        TransitionOuterClass$Preset transitionOuterClass$Preset = (TransitionOuterClass$Preset) ((com.google.protobuf.g) this).instance;
        int i = TransitionOuterClass$Preset.ID_FIELD_NUMBER;
        transitionOuterClass$Preset.j0(transitionOuterClass$VolumeStyle);
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
        return super.internalMergeFrom((com.google.protobuf.h) s8Var);
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m150mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(TransitionOuterClass$EqCurveOverrides transitionOuterClass$EqCurveOverrides) {
        copyOnWrite();
        TransitionOuterClass$Preset transitionOuterClass$Preset = (TransitionOuterClass$Preset) ((com.google.protobuf.g) this).instance;
        int i = TransitionOuterClass$Preset.ID_FIELD_NUMBER;
        transitionOuterClass$Preset.U(transitionOuterClass$EqCurveOverrides);
    }

    public final void q(TransitionOuterClass$EqCurveOverrides transitionOuterClass$EqCurveOverrides) {
        copyOnWrite();
        TransitionOuterClass$Preset transitionOuterClass$Preset = (TransitionOuterClass$Preset) ((com.google.protobuf.g) this).instance;
        int i = TransitionOuterClass$Preset.ID_FIELD_NUMBER;
        transitionOuterClass$Preset.V(transitionOuterClass$EqCurveOverrides);
    }

    public final void r(TransitionOuterClass$EqStyle transitionOuterClass$EqStyle) {
        copyOnWrite();
        TransitionOuterClass$Preset transitionOuterClass$Preset = (TransitionOuterClass$Preset) ((com.google.protobuf.g) this).instance;
        int i = TransitionOuterClass$Preset.ID_FIELD_NUMBER;
        transitionOuterClass$Preset.W(transitionOuterClass$EqStyle);
    }

    public final void s(TransitionOuterClass$FilterFxStyle transitionOuterClass$FilterFxStyle) {
        copyOnWrite();
        TransitionOuterClass$Preset transitionOuterClass$Preset = (TransitionOuterClass$Preset) ((com.google.protobuf.g) this).instance;
        int i = TransitionOuterClass$Preset.ID_FIELD_NUMBER;
        transitionOuterClass$Preset.X(transitionOuterClass$FilterFxStyle);
    }

    public final void t(TransitionOuterClass$FilterCurveOverrides transitionOuterClass$FilterCurveOverrides) {
        copyOnWrite();
        TransitionOuterClass$Preset transitionOuterClass$Preset = (TransitionOuterClass$Preset) ((com.google.protobuf.g) this).instance;
        int i = TransitionOuterClass$Preset.ID_FIELD_NUMBER;
        transitionOuterClass$Preset.Y(transitionOuterClass$FilterCurveOverrides);
    }

    public final void u(TransitionOuterClass$FilterCurveOverrides transitionOuterClass$FilterCurveOverrides) {
        copyOnWrite();
        TransitionOuterClass$Preset transitionOuterClass$Preset = (TransitionOuterClass$Preset) ((com.google.protobuf.g) this).instance;
        int i = TransitionOuterClass$Preset.ID_FIELD_NUMBER;
        transitionOuterClass$Preset.Z(transitionOuterClass$FilterCurveOverrides);
    }

    public final void v(TransitionOuterClass$FxCurveOverrides transitionOuterClass$FxCurveOverrides) {
        copyOnWrite();
        TransitionOuterClass$Preset transitionOuterClass$Preset = (TransitionOuterClass$Preset) ((com.google.protobuf.g) this).instance;
        int i = TransitionOuterClass$Preset.ID_FIELD_NUMBER;
        transitionOuterClass$Preset.a0(transitionOuterClass$FxCurveOverrides);
    }

    public final void w(TransitionOuterClass$FxCurveOverrides transitionOuterClass$FxCurveOverrides) {
        copyOnWrite();
        TransitionOuterClass$Preset transitionOuterClass$Preset = (TransitionOuterClass$Preset) ((com.google.protobuf.g) this).instance;
        int i = TransitionOuterClass$Preset.ID_FIELD_NUMBER;
        transitionOuterClass$Preset.b0(transitionOuterClass$FxCurveOverrides);
    }

    public final void x(TransitionOuterClass$FxStyle transitionOuterClass$FxStyle) {
        copyOnWrite();
        TransitionOuterClass$Preset transitionOuterClass$Preset = (TransitionOuterClass$Preset) ((com.google.protobuf.g) this).instance;
        int i = TransitionOuterClass$Preset.ID_FIELD_NUMBER;
        transitionOuterClass$Preset.c0(transitionOuterClass$FxStyle);
    }

    public final void y(int i) {
        copyOnWrite();
        TransitionOuterClass$Preset transitionOuterClass$Preset = (TransitionOuterClass$Preset) ((com.google.protobuf.g) this).instance;
        int i2 = TransitionOuterClass$Preset.ID_FIELD_NUMBER;
        transitionOuterClass$Preset.d0(i);
    }

    public final void z(TransitionOuterClass$JogwheelStyle transitionOuterClass$JogwheelStyle) {
        copyOnWrite();
        TransitionOuterClass$Preset transitionOuterClass$Preset = (TransitionOuterClass$Preset) ((com.google.protobuf.g) this).instance;
        int i = TransitionOuterClass$Preset.ID_FIELD_NUMBER;
        transitionOuterClass$Preset.e0(transitionOuterClass$JogwheelStyle);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m149clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m151mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m148clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m152mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
