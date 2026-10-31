package p;

import com.google.protobuf.FieldMask;
import com.spotify.profileprivacy.proto.v1.SetProfilePrivacyRequest;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class e581 implements b581, m2r {
    public final fdx0 a;
    public final Observable b;
    public final jmq c;
    public final bge d;

    public e581(fdx0 fdx0Var, Observable observable) {
        this.a = fdx0Var;
        this.b = observable;
        jmq jmqVar = new jmq(this);
        this.c = jmqVar;
        this.d = (bge) jmqVar.c;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0097  */
    /* JADX WARN: Code duplicated, block: B:30:0x009c  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(boolean z, onm onmVar) {
        d581 d581Var;
        fdx0 fdx0Var;
        SetProfilePrivacyRequest.Builder builder;
        boolean z2;
        if (onmVar instanceof d581) {
            d581Var = (d581) onmVar;
            int i = d581Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                d581Var.f = i - Integer.MIN_VALUE;
            } else {
                d581Var = new d581(this, onmVar);
            }
        } else {
            d581Var = new d581(this, onmVar);
        }
        Object objA = d581Var.d;
        int i2 = d581Var.f;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objA);
            SetProfilePrivacyRequest.Builder builderNewBuilder = SetProfilePrivacyRequest.newBuilder();
            fdx0Var = this.a;
            d581Var.b = fdx0Var;
            d581Var.c = builderNewBuilder;
            d581Var.a = z;
            d581Var.f = 1;
            Object objL = fc11.l(this.b, 1, (Object) null, d581Var);
            if (objL != d9nVar) {
                objA = objL;
                builder = builderNewBuilder;
            }
            return d9nVar;
        }
        if (i2 == 1) {
            z = d581Var.a;
            builder = d581Var.c;
            fdx0Var = d581Var.b;
            hm5.M(objA);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = d581Var.a;
            hm5.M(objA);
        }
        if (!((sy21) objA).a.Q0) {
            objA = null;
        }
        if (((sy21) objA) != null) {
            return Boolean.valueOf(z2);
        }
        return null;
        SetProfilePrivacyRequest.Builder showFollows = builder.setUsername((String) objA).setShowFollows(z);
        h220 h220VarQ = FieldMask.q();
        h220VarQ.q("show_follows");
        SetProfilePrivacyRequest setProfilePrivacyRequest = (SetProfilePrivacyRequest) showFollows.setMask((FieldMask) h220VarQ.build()).build();
        d581Var.b = null;
        d581Var.c = null;
        d581Var.a = z;
        d581Var.f = 2;
        objA = fdx0Var.a(setProfilePrivacyRequest, d581Var);
        if (objA != d9nVar) {
            z2 = z;
            if (!((sy21) objA).a.Q0) {
                objA = null;
            }
            if (((sy21) objA) != null) {
                return Boolean.valueOf(z2);
            }
            return null;
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        if (r8 == r5) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(p.onm r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof p.c581
            if (r0 == 0) goto L13
            r0 = r8
            p.c581 r0 = (p.c581) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.c581 r0 = new p.c581
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r8)
            goto L6d
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r4
        L31:
            com.spotify.profileprivacy.proto.v1.GetProfilePrivacyRequest$Builder r7 = r0.b
            p.fdx0 r1 = r0.a
            p.hm5.M(r8)
            goto L54
        L39:
            p.hm5.M(r8)
            com.spotify.profileprivacy.proto.v1.GetProfilePrivacyRequest$Builder r8 = com.spotify.profileprivacy.proto.v1.GetProfilePrivacyRequest.newBuilder()
            p.fdx0 r1 = r7.a
            r0.a = r1
            r0.b = r8
            r0.e = r3
            io.reactivex.rxjava3.core.Observable r7 = r7.b
            java.lang.Object r7 = p.fc11.l(r7, r3, r4, r0)
            if (r7 != r5) goto L51
            goto L6c
        L51:
            r6 = r8
            r8 = r7
            r7 = r6
        L54:
            java.lang.String r8 = (java.lang.String) r8
            com.spotify.profileprivacy.proto.v1.GetProfilePrivacyRequest$Builder r7 = r7.setUsername(r8)
            com.google.protobuf.h r7 = r7.build()
            com.spotify.profileprivacy.proto.v1.GetProfilePrivacyRequest r7 = (com.spotify.profileprivacy.proto.v1.GetProfilePrivacyRequest) r7
            r0.a = r4
            r0.b = r4
            r0.e = r2
            java.lang.Object r8 = r1.b(r7, r0)
            if (r8 != r5) goto L6d
        L6c:
            return r5
        L6d:
            r7 = r8
            p.sy21 r7 = (p.sy21) r7
            p.ry21 r7 = r7.a
            boolean r7 = r7.Q0
            if (r7 == 0) goto L77
            goto L78
        L77:
            r8 = r4
        L78:
            p.sy21 r8 = (p.sy21) r8
            if (r8 == 0) goto L8b
            java.lang.Object r7 = r8.b
            com.spotify.profileprivacy.proto.v1.GetProfilePrivacyResponse r7 = (com.spotify.profileprivacy.proto.v1.GetProfilePrivacyResponse) r7
            if (r7 == 0) goto L8b
            boolean r7 = r7.getShowFollows()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        L8b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.e581.b(p.onm):java.lang.Object");
    }
}
