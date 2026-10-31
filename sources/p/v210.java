package p;

import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.externalintegration.loggingservice.events.proto.ExternalAccessoryRemoteInteraction;
import java.io.InputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class v210 extends g implements v2j0 {
    public final void A(String str) {
        copyOnWrite();
        ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction = (ExternalAccessoryRemoteInteraction) ((g) this).instance;
        int i = ExternalAccessoryRemoteInteraction.ACTION_FIELD_NUMBER;
        externalAccessoryRemoteInteraction.y(str);
    }

    public final void B(String str) {
        copyOnWrite();
        ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction = (ExternalAccessoryRemoteInteraction) ((g) this).instance;
        int i = ExternalAccessoryRemoteInteraction.ACTION_FIELD_NUMBER;
        externalAccessoryRemoteInteraction.z(str);
    }

    public final void C(String str) {
        copyOnWrite();
        ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction = (ExternalAccessoryRemoteInteraction) ((g) this).instance;
        int i = ExternalAccessoryRemoteInteraction.ACTION_FIELD_NUMBER;
        externalAccessoryRemoteInteraction.A(str);
    }

    public final void D(String str) {
        copyOnWrite();
        ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction = (ExternalAccessoryRemoteInteraction) ((g) this).instance;
        int i = ExternalAccessoryRemoteInteraction.ACTION_FIELD_NUMBER;
        externalAccessoryRemoteInteraction.B(str);
    }

    public final void E(String str) {
        copyOnWrite();
        ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction = (ExternalAccessoryRemoteInteraction) ((g) this).instance;
        int i = ExternalAccessoryRemoteInteraction.ACTION_FIELD_NUMBER;
        externalAccessoryRemoteInteraction.C(str);
    }

    public final void F(String str) {
        copyOnWrite();
        ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction = (ExternalAccessoryRemoteInteraction) ((g) this).instance;
        int i = ExternalAccessoryRemoteInteraction.ACTION_FIELD_NUMBER;
        externalAccessoryRemoteInteraction.setVersion(str);
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
    public final /* bridge */ /* synthetic */ r8 m1126mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final String n() {
        return ((ExternalAccessoryRemoteInteraction) ((g) this).instance).n();
    }

    public final boolean q() {
        return ((ExternalAccessoryRemoteInteraction) ((g) this).instance).o();
    }

    public final void r(String str) {
        copyOnWrite();
        ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction = (ExternalAccessoryRemoteInteraction) ((g) this).instance;
        int i = ExternalAccessoryRemoteInteraction.ACTION_FIELD_NUMBER;
        externalAccessoryRemoteInteraction.q(str);
    }

    public final void s(String str) {
        copyOnWrite();
        ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction = (ExternalAccessoryRemoteInteraction) ((g) this).instance;
        int i = ExternalAccessoryRemoteInteraction.ACTION_FIELD_NUMBER;
        externalAccessoryRemoteInteraction.r(str);
    }

    public final void t(String str) {
        copyOnWrite();
        ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction = (ExternalAccessoryRemoteInteraction) ((g) this).instance;
        int i = ExternalAccessoryRemoteInteraction.ACTION_FIELD_NUMBER;
        externalAccessoryRemoteInteraction.s(str);
    }

    public final void u(String str) {
        copyOnWrite();
        ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction = (ExternalAccessoryRemoteInteraction) ((g) this).instance;
        int i = ExternalAccessoryRemoteInteraction.ACTION_FIELD_NUMBER;
        externalAccessoryRemoteInteraction.t(str);
    }

    public final void v(String str) {
        copyOnWrite();
        ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction = (ExternalAccessoryRemoteInteraction) ((g) this).instance;
        int i = ExternalAccessoryRemoteInteraction.ACTION_FIELD_NUMBER;
        externalAccessoryRemoteInteraction.u(str);
    }

    public final void w(String str) {
        copyOnWrite();
        ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction = (ExternalAccessoryRemoteInteraction) ((g) this).instance;
        int i = ExternalAccessoryRemoteInteraction.ACTION_FIELD_NUMBER;
        externalAccessoryRemoteInteraction.v(str);
    }

    public final void x(String str) {
        copyOnWrite();
        ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction = (ExternalAccessoryRemoteInteraction) ((g) this).instance;
        int i = ExternalAccessoryRemoteInteraction.ACTION_FIELD_NUMBER;
        externalAccessoryRemoteInteraction.setClientId(str);
    }

    public final void y(String str) {
        copyOnWrite();
        ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction = (ExternalAccessoryRemoteInteraction) ((g) this).instance;
        int i = ExternalAccessoryRemoteInteraction.ACTION_FIELD_NUMBER;
        externalAccessoryRemoteInteraction.w(str);
    }

    public final void z(String str) {
        copyOnWrite();
        ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction = (ExternalAccessoryRemoteInteraction) ((g) this).instance;
        int i = ExternalAccessoryRemoteInteraction.ACTION_FIELD_NUMBER;
        externalAccessoryRemoteInteraction.x(str);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m1125clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m1127mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m1124clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m1128mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
