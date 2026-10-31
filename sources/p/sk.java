package p;

import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.kidsview.v2.proto.AccountControls;
import com.spotify.kidsview.v2.proto.VideoControls;
import java.io.InputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sk extends g implements v2j0 {
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
    public final /* bridge */ /* synthetic */ r8 m670mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(boolean z) {
        copyOnWrite();
        AccountControls accountControls = (AccountControls) ((g) this).instance;
        int i = AccountControls.ALLOW_EXPLICIT_CONTENT_FIELD_NUMBER;
        accountControls.B(z);
    }

    public final void q(boolean z) {
        copyOnWrite();
        AccountControls accountControls = (AccountControls) ((g) this).instance;
        int i = AccountControls.ALLOW_EXPLICIT_CONTENT_FIELD_NUMBER;
        accountControls.C(z);
    }

    public final void r(boolean z) {
        copyOnWrite();
        AccountControls accountControls = (AccountControls) ((g) this).instance;
        int i = AccountControls.ALLOW_EXPLICIT_CONTENT_FIELD_NUMBER;
        accountControls.D(z);
    }

    public final void s(boolean z) {
        copyOnWrite();
        AccountControls accountControls = (AccountControls) ((g) this).instance;
        int i = AccountControls.ALLOW_EXPLICIT_CONTENT_FIELD_NUMBER;
        accountControls.E(z);
    }

    public final void t(boolean z) {
        copyOnWrite();
        AccountControls accountControls = (AccountControls) ((g) this).instance;
        int i = AccountControls.ALLOW_EXPLICIT_CONTENT_FIELD_NUMBER;
        accountControls.F(z);
    }

    public final void u(boolean z) {
        copyOnWrite();
        AccountControls accountControls = (AccountControls) ((g) this).instance;
        int i = AccountControls.ALLOW_EXPLICIT_CONTENT_FIELD_NUMBER;
        accountControls.G(z);
    }

    public final void v(VideoControls videoControls) {
        copyOnWrite();
        AccountControls accountControls = (AccountControls) ((g) this).instance;
        int i = AccountControls.ALLOW_EXPLICIT_CONTENT_FIELD_NUMBER;
        accountControls.H(videoControls);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m669clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m671mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m668clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m672mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
