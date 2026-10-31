package p;

import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.personalizedepisodes.contentservice.v1.ImageAttachmentMetadata;
import com.spotify.personalizedepisodes.contentservice.v1.PdfAttachmentMetadata;
import com.spotify.personalizedepisodes.contentservice.v1.UploadAttachmentRequest;
import java.io.InputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vvh1 extends g implements v2j0 {
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
    public final /* bridge */ /* synthetic */ r8 m1631mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(String str) {
        copyOnWrite();
        UploadAttachmentRequest uploadAttachmentRequest = (UploadAttachmentRequest) ((g) this).instance;
        int i = UploadAttachmentRequest.CONTENT_TYPE_FIELD_NUMBER;
        uploadAttachmentRequest.o(str);
    }

    public final void q(long j) {
        copyOnWrite();
        UploadAttachmentRequest uploadAttachmentRequest = (UploadAttachmentRequest) ((g) this).instance;
        int i = UploadAttachmentRequest.CONTENT_TYPE_FIELD_NUMBER;
        uploadAttachmentRequest.p(j);
    }

    public final void r(ImageAttachmentMetadata imageAttachmentMetadata) {
        copyOnWrite();
        UploadAttachmentRequest uploadAttachmentRequest = (UploadAttachmentRequest) ((g) this).instance;
        int i = UploadAttachmentRequest.CONTENT_TYPE_FIELD_NUMBER;
        uploadAttachmentRequest.q(imageAttachmentMetadata);
    }

    public final void s(mes0 mes0Var) {
        copyOnWrite();
        UploadAttachmentRequest uploadAttachmentRequest = (UploadAttachmentRequest) ((g) this).instance;
        PdfAttachmentMetadata pdfAttachmentMetadata = (PdfAttachmentMetadata) mes0Var.build();
        int i = UploadAttachmentRequest.CONTENT_TYPE_FIELD_NUMBER;
        uploadAttachmentRequest.r(pdfAttachmentMetadata);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m1630clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m1632mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m1629clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m1633mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
