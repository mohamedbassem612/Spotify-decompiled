package p;

import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.InputStream;
import spotify.your_library.esperanto.proto.YourLibraryRequest;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;
import spotify.your_library.proto.YourLibraryConfig;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gvm1 extends g implements v2j0 {
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
    public final /* bridge */ /* synthetic */ r8 m925mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(hvm1 hvm1Var) {
        copyOnWrite();
        YourLibraryRequest yourLibraryRequest = (YourLibraryRequest) ((g) this).instance;
        YourLibraryRequestHeader yourLibraryRequestHeader = (YourLibraryRequestHeader) hvm1Var.build();
        int i = YourLibraryRequest.HEADER_FIELD_NUMBER;
        yourLibraryRequest.p(yourLibraryRequestHeader);
    }

    public final void q(YourLibraryRequestHeader yourLibraryRequestHeader) {
        copyOnWrite();
        YourLibraryRequest yourLibraryRequest = (YourLibraryRequest) ((g) this).instance;
        int i = YourLibraryRequest.HEADER_FIELD_NUMBER;
        yourLibraryRequest.p(yourLibraryRequestHeader);
    }

    public final void r(psm1 psm1Var) {
        copyOnWrite();
        YourLibraryRequest yourLibraryRequest = (YourLibraryRequest) ((g) this).instance;
        YourLibraryConfig.YourLibraryPredefinedPlaylistConfigs yourLibraryPredefinedPlaylistConfigs = (YourLibraryConfig.YourLibraryPredefinedPlaylistConfigs) psm1Var.build();
        int i = YourLibraryRequest.HEADER_FIELD_NUMBER;
        yourLibraryRequest.q(yourLibraryPredefinedPlaylistConfigs);
    }

    public final void s(YourLibraryConfig.YourLibraryPredefinedPlaylistConfigs yourLibraryPredefinedPlaylistConfigs) {
        copyOnWrite();
        YourLibraryRequest yourLibraryRequest = (YourLibraryRequest) ((g) this).instance;
        int i = YourLibraryRequest.HEADER_FIELD_NUMBER;
        yourLibraryRequest.q(yourLibraryPredefinedPlaylistConfigs);
    }

    public final void t(int i) {
        copyOnWrite();
        YourLibraryRequest yourLibraryRequest = (YourLibraryRequest) ((g) this).instance;
        int i2 = YourLibraryRequest.HEADER_FIELD_NUMBER;
        yourLibraryRequest.r(i);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m924clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m926mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m923clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m927mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
