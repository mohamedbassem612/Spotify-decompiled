package p;

import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateRequest;
import java.io.InputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class u4l extends g implements v2j0 {
    @Override // com.google.protobuf.g, p.r2j0
    public final /* bridge */ /* synthetic */ s2j0 build() {
        return build();
    }

    @Override // com.google.protobuf.g, p.r2j0
    public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
        return super.buildPartial();
    }

    @Override // com.google.protobuf.g
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ r2j0 mo0clear() {
        return mo0clear();
    }

    @Override // com.google.protobuf.g
    /* JADX INFO: renamed from: clone */
    public final /* bridge */ /* synthetic */ Object mo3clone() {
        return super.mo1clone();
    }

    @Override // com.google.protobuf.g, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.g, p.r8
    public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
        return super.internalMergeFrom((h) s8Var);
    }

    @Override // com.google.protobuf.g, p.r8, p.r2j0
    public final /* bridge */ /* synthetic */ r8 mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(boolean z) {
        copyOnWrite();
        ConnectMessages$StateRequest connectMessages$StateRequest = (ConnectMessages$StateRequest) this.instance;
        int i = ConnectMessages$StateRequest.SHOW_OFFLINE_DEVICES_IN_CORE_FIELD_NUMBER;
        connectMessages$StateRequest.o(z);
    }

    public final void q() {
        copyOnWrite();
        ConnectMessages$StateRequest connectMessages$StateRequest = (ConnectMessages$StateRequest) this.instance;
        int i = ConnectMessages$StateRequest.SHOW_OFFLINE_DEVICES_IN_CORE_FIELD_NUMBER;
        connectMessages$StateRequest.p();
    }

    public final void r(boolean z) {
        copyOnWrite();
        ConnectMessages$StateRequest connectMessages$StateRequest = (ConnectMessages$StateRequest) this.instance;
        int i = ConnectMessages$StateRequest.SHOW_OFFLINE_DEVICES_IN_CORE_FIELD_NUMBER;
        connectMessages$StateRequest.q(z);
    }

    public final void s(boolean z) {
        copyOnWrite();
        ConnectMessages$StateRequest connectMessages$StateRequest = (ConnectMessages$StateRequest) this.instance;
        int i = ConnectMessages$StateRequest.SHOW_OFFLINE_DEVICES_IN_CORE_FIELD_NUMBER;
        connectMessages$StateRequest.r(z);
    }

    public final void t(boolean z) {
        copyOnWrite();
        ConnectMessages$StateRequest connectMessages$StateRequest = (ConnectMessages$StateRequest) this.instance;
        int i = ConnectMessages$StateRequest.SHOW_OFFLINE_DEVICES_IN_CORE_FIELD_NUMBER;
        connectMessages$StateRequest.s(z);
    }

    @Override // com.google.protobuf.g
    /* JADX INFO: renamed from: clone */
    public final /* bridge */ /* synthetic */ r8 mo2clone() {
        return super.mo1clone();
    }

    @Override // com.google.protobuf.g, p.r8
    /* JADX INFO: renamed from: mergeFrom */
    public final /* bridge */ /* synthetic */ r8 mo4mergeFrom(byte[] bArr, int i, int i2) {
        return super.mo4mergeFrom(bArr, i, i2);
    }

    @Override // com.google.protobuf.g
    /* JADX INFO: renamed from: clone */
    public final /* bridge */ /* synthetic */ r2j0 mo2clone() {
        return super.mo1clone();
    }

    @Override // com.google.protobuf.g, p.r8
    /* JADX INFO: renamed from: mergeFrom */
    public final /* bridge */ /* synthetic */ r8 mo5mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
        return super.mo5mergeFrom(bArr, i, i2, uz00Var);
    }

    @Override // p.r8
    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
        return super.mergeFrom(inputStream);
    }

    @Override // p.r8
    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
        return super.mergeFrom(inputStream, uz00Var);
    }

    @Override // p.r8
    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
        return super.mergeFrom(phcVar);
    }

    @Override // p.r8
    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
        return super.mergeFrom(phcVar, uz00Var);
    }

    @Override // p.r8
    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
        return super.mergeFrom(lwgVar);
    }

    @Override // com.google.protobuf.g, p.r2j0
    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    @Override // p.r8, p.r2j0
    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
        return super.mergeFrom(s2j0Var);
    }

    @Override // p.r8
    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
        return super.mergeFrom(bArr);
    }

    @Override // com.google.protobuf.g
    /* JADX INFO: renamed from: mergeFrom */
    public final /* bridge */ /* synthetic */ r2j0 mo4mergeFrom(byte[] bArr, int i, int i2) {
        return super.mo4mergeFrom(bArr, i, i2);
    }

    @Override // com.google.protobuf.g
    /* JADX INFO: renamed from: mergeFrom */
    public final /* bridge */ /* synthetic */ r2j0 mo5mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
        return super.mo5mergeFrom(bArr, i, i2, uz00Var);
    }

    @Override // p.r8
    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
        return super.mergeFrom(bArr, uz00Var);
    }
}
