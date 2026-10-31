package p;

import com.spotify.bluejay.data.api.AttachmentUploadException;
import com.spotify.personalizedepisodes.contentservice.v1.ContentServiceError;
import com.spotify.personalizedepisodes.contentservice.v1.GetAttachmentStatusResponse;
import com.spotify.personalizedepisodes.contentservice.v1.ImageAttachmentMetadata;
import com.spotify.personalizedepisodes.contentservice.v1.PdfAttachmentMetadata;
import com.spotify.personalizedepisodes.contentservice.v1.UploadAttachmentRequest;
import com.spotify.personalizedepisodes.contentservice.v1.UploadAttachmentResponse;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ik7 implements dk7 {
    public final ll7 a;
    public final el7 b;

    public ik7(ll7 ll7Var, el7 el7Var) {
        this.a = ll7Var;
        this.b = el7Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: retrofit2.HttpException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) throws HttpException {
        fk7 fk7Var;
        if (onmVar instanceof fk7) {
            fk7Var = (fk7) onmVar;
            int i = fk7Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fk7Var.c = i - Integer.MIN_VALUE;
            } else {
                fk7Var = new fk7(this, onmVar);
            }
        } else {
            fk7Var = new fk7(this, onmVar);
        }
        Object objB = fk7Var.a;
        int i2 = fk7Var.c;
        String message = null;
        if (i2 == 0) {
            hm5.M(objB);
            fk7Var.c = 1;
            objB = this.a.b(str, fk7Var);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objB);
        }
        sy21 sy21Var = (sy21) objB;
        if (!sy21Var.a.Q0) {
            throw new HttpException(sy21Var);
        }
        Object obj = sy21Var.b;
        if (obj == null) {
            hhg1.n("Response body is null for successful get attachment status response");
            return null;
        }
        GetAttachmentStatusResponse getAttachmentStatusResponse = (GetAttachmentStatusResponse) obj;
        int i3 = ek7.a[getAttachmentStatusResponse.o().ordinal()];
        if (i3 == 1) {
            return il7.a;
        }
        if (i3 != 2) {
            return gl7.a;
        }
        if (getAttachmentStatusResponse.p() && !ihc1.y0(getAttachmentStatusResponse.n().getMessage())) {
            message = getAttachmentStatusResponse.n().getMessage();
        }
        return new hl7(message);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.bluejay.data.api.AttachmentUploadException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: retrofit2.HttpException */
    /* JADX WARN: Code duplicated, block: B:51:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(wvh1 wvh1Var, onm onmVar) throws HttpException, AttachmentUploadException {
        gk7 gk7Var;
        UploadAttachmentResponse uploadAttachmentResponse;
        sy21 sy21Var;
        if (onmVar instanceof gk7) {
            gk7Var = (gk7) onmVar;
            int i = gk7Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                gk7Var.e = i - Integer.MIN_VALUE;
            } else {
                gk7Var = new gk7(this, onmVar);
            }
        } else {
            gk7Var = new gk7(this, onmVar);
        }
        Object objC = gk7Var.c;
        int i2 = gk7Var.e;
        d9n d9nVar = d9n.a;
        if (i2 != 0) {
            if (i2 == 1) {
                wvh1Var = gk7Var.a;
                hm5.M(objC);
            } else {
                if (i2 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uploadAttachmentResponse = gk7Var.b;
                hm5.M(objC);
            }
            sy21Var = (sy21) objC;
            if (sy21Var.a.Q0) {
                return new xvh1(uploadAttachmentResponse.n());
            }
            throw new HttpException(sy21Var);
        }
        hm5.M(objC);
        vvh1 vvh1VarN = UploadAttachmentRequest.n();
        vvh1VarN.n(wvh1Var.a);
        vvh1VarN.q(wvh1Var.b);
        uk7 uk7Var = wvh1Var.d;
        if (uk7Var instanceof tk7) {
            mes0 mes0VarN = PdfAttachmentMetadata.n();
            tk7 tk7Var = (tk7) uk7Var;
            Integer num = tk7Var.a;
            if (num != null) {
                mes0VarN.q(num.intValue());
            }
            Integer num2 = tk7Var.b;
            if (num2 != null) {
                mes0VarN.n(num2.intValue());
            }
            vvh1VarN.s(mes0VarN);
        } else {
            if (!(uk7Var instanceof sk7)) {
                eg.o();
                return null;
            }
            vvh1VarN.r(ImageAttachmentMetadata.n());
        }
        UploadAttachmentRequest uploadAttachmentRequestBuild = vvh1VarN.build();
        gk7Var.a = wvh1Var;
        gk7Var.e = 1;
        objC = this.a.c(uploadAttachmentRequestBuild, gk7Var);
        if (objC != d9nVar) {
        }
        return d9nVar;
        sy21 sy21Var2 = (sy21) objC;
        ry21 ry21Var = sy21Var2.a;
        String str = ry21Var.c;
        int i3 = ry21Var.d;
        if (!ry21Var.Q0) {
            uz21 uz21Var = sy21Var2.c;
            byte[] bArrC = uz21Var != null ? uz21Var.c() : null;
            if (bArrC == null) {
                throw new AttachmentUploadException(i3, "", str);
            }
            try {
                ContentServiceError contentServiceErrorQ = ContentServiceError.q(bArrC);
                throw new AttachmentUploadException(i3, contentServiceErrorQ.p(), contentServiceErrorQ.getMessage());
            } catch (Exception unused) {
                throw new AttachmentUploadException(i3, "", str);
            }
        }
        Object obj = sy21Var2.b;
        if (obj == null) {
            hhg1.n("Response body is null for successful upload attachment metadata response");
            return null;
        }
        UploadAttachmentResponse uploadAttachmentResponse2 = (UploadAttachmentResponse) obj;
        String strO = uploadAttachmentResponse2.o();
        String str2 = wvh1Var.a;
        tn21 tn21Var = wvh1Var.c;
        gk7Var.a = null;
        gk7Var.b = uploadAttachmentResponse2;
        gk7Var.e = 2;
        Object objA = this.b.a(strO, str2, tn21Var, gk7Var);
        if (objA != d9nVar) {
            objC = objA;
            uploadAttachmentResponse = uploadAttachmentResponse2;
            sy21Var = (sy21) objC;
            if (sy21Var.a.Q0) {
                return new xvh1(uploadAttachmentResponse.n());
            }
            throw new HttpException(sy21Var);
        }
        return d9nVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: retrofit2.HttpException */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        if (p.hap1.j(r5, r0) == r4) goto L28;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0072 -> B:29:0x0075). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r9, p.onm r10) throws retrofit2.HttpException {
        /*
            r8 = this;
            boolean r0 = r10 instanceof p.hk7
            if (r0 == 0) goto L13
            r0 = r10
            p.hk7 r0 = (p.hk7) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.hk7 r0 = new p.hk7
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            p.d9n r4 = p.d9n.a
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2e
            int r9 = r0.b
            java.lang.String r1 = r0.a
            p.hm5.M(r10)
            goto L75
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            r8 = 0
            return r8
        L35:
            int r9 = r0.b
            java.lang.String r1 = r0.a
            p.hm5.M(r10)
            goto L52
        L3d:
            p.hm5.M(r10)
            r10 = 0
        L41:
            r0.a = r9
            r0.b = r10
            r0.e = r3
            java.lang.Object r1 = r8.a(r9, r0)
            if (r1 != r4) goto L4e
            goto L74
        L4e:
            r7 = r1
            r1 = r9
            r9 = r10
            r10 = r7
        L52:
            p.jl7 r10 = (p.jl7) r10
            boolean r5 = r10 instanceof p.gl7
            if (r5 == 0) goto L79
            r5 = 3
            if (r9 < r5) goto L5c
            goto L79
        L5c:
            p.ytw0 r10 = p.jfv.b
            int r10 = r9 + 1
            int r10 = r3 << r10
            p.ngv r5 = p.ngv.e
            long r5 = p.fdg1.k0(r10, r5)
            r0.a = r1
            r0.b = r9
            r0.e = r2
            java.lang.Object r10 = p.hap1.j(r5, r0)
            if (r10 != r4) goto L75
        L74:
            return r4
        L75:
            int r10 = r9 + 1
            r9 = r1
            goto L41
        L79:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ik7.c(java.lang.String, p.onm):java.lang.Object");
    }
}
