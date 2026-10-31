package p;

import android.os.Bundle;
import androidx.lifecycle.LifecycleDestroyedException;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.bluejay.confirmgenerationpage.effecthandler.AttachmentNotSafeException;
import com.spotify.bluejay.data.api.GenerationServiceException;
import com.spotify.mobius.MobiusLoop;
import java.util.Set;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m2a0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m2a0(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        if (r9 == r7) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        if (r9 == r7) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006a, code lost:
    
        if (r9 == r7) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object e(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.d
            p.blc0 r0 = (p.blc0) r0
            byte r1 = r8.b
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L24
            if (r1 == r4) goto L20
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L16
            p.hm5.M(r9)
            goto L6d
        L16:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r5
        L1c:
            p.hm5.M(r9)
            goto L59
        L20:
            p.hm5.M(r9)
            goto L42
        L24:
            p.hm5.M(r9)
            java.lang.Object r9 = r8.c
            p.n6i0 r9 = (p.n6i0) r9
            p.u3i0 r1 = r9.e
            p.q3i0 r1 = r1.b
            boolean r6 = r1 instanceof p.o3i0
            p.d9n r7 = p.d9n.a
            if (r6 == 0) goto L48
            p.o3i0 r1 = (p.o3i0) r1
            java.lang.String r0 = r1.a
            r8.b = r4
            java.lang.Object r9 = r9.r(r0, r8)
            if (r9 != r7) goto L42
            goto L6c
        L42:
            p.mmr0 r8 = new p.mmr0
            r8.<init>(r9, r5)
            return r8
        L48:
            boolean r4 = r1 instanceof p.n3i0
            if (r4 == 0) goto L5c
            p.n3i0 r1 = (p.n3i0) r1
            p.t3i0 r1 = r1.a
            r8.b = r3
            java.io.Serializable r9 = r9.s(r1, r0, r8)
            if (r9 != r7) goto L59
            goto L6c
        L59:
            p.mmr0 r9 = (p.mmr0) r9
            return r9
        L5c:
            boolean r3 = r1 instanceof p.p3i0
            if (r3 == 0) goto L70
            p.p3i0 r1 = (p.p3i0) r1
            p.t3i0 r1 = r1.a
            r8.b = r2
            java.io.Serializable r9 = r9.s(r1, r0, r8)
            if (r9 != r7) goto L6d
        L6c:
            return r7
        L6d:
            p.mmr0 r9 = (p.mmr0) r9
            return r9
        L70:
            p.eg.o()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.m2a0.e(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a7  */
    private final Object g(Object obj) {
        Object objA;
        ou80 ou80Var;
        j9k0 j9k0Var = (j9k0) this.c;
        byte b = this.b;
        String str = null;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            f1n0 f1n0Var = j9k0Var.f;
            this.b = (byte) 1;
            if (f1n0Var.a(this) != d9nVar) {
            }
        }
        if (b != 1) {
            if (b == 2) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        ahk0 ahk0Var = j9k0Var.g;
        f1n0 f1n0Var2 = ahk0Var.b;
        String str2 = j9k0Var.b.a;
        tv80 tv80Var = (tv80) this.d;
        this.b = (byte) 2;
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(str2);
        v5b1 v5b1Var = s4b1VarX.d;
        if (!u890.j(v5b1Var != null ? v5b1Var.getType() : null, nyu0.e)) {
            if (!u890.j(v5b1Var != null ? v5b1Var.getType() : null, wyu0.f)) {
                ncn0.d(s4b1VarX, " URI is not supported, only Playlist URIs are supported.");
                return null;
            }
        }
        dwn0 dwn0Var = new dwn0("spotify:internal:playlist-mixing-reorder-overview:".concat(s4b1VarX.h()), "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80Var != null ? new bwn0(tv80Var) : null);
        if (f1n0Var2.a.j(ahk0Var.a)) {
            objA = f1n0Var2.c(dwn0Var, null, this);
            if (objA != d9nVar) {
                objA = rih1Var;
            }
        } else {
            b1r0 b1r0Var = ahk0Var.c;
            if (tv80Var != null && (ou80Var = tv80Var.a) != null) {
                str = ou80Var.a;
            }
            objA = b1r0.a(b1r0Var, dwn0Var.a, str, (Bundle) null, this, 12);
            if (objA != d9nVar) {
                objA = rih1Var;
            }
        }
        return objA == d9nVar ? d9nVar : rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003e A[Catch: all -> 0x001c, TryCatch #0 {all -> 0x001c, blocks: (B:7:0x0016, B:18:0x0034, B:20:0x003e, B:24:0x004e, B:15:0x0029), top: B:32:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:22:0x004a  */
    /* JADX WARN: Code duplicated, block: B:23:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
    
        if (r1.d(r2, r3, r4, r5, r6) == r10) goto L26;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006c -> B:9:0x001a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object h(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.d
            r1 = r0
            p.wnm0 r1 = (p.wnm0) r1
            byte r0 = r12.b
            r7 = 0
            r8 = 2
            r9 = 1
            p.d9n r10 = p.d9n.a
            if (r0 == 0) goto L2d
            if (r0 == r9) goto L25
            if (r0 != r8) goto L1f
            java.lang.Object r0 = r12.c
            p.c9n r0 = (p.c9n) r0
            p.hm5.M(r13)     // Catch: java.lang.Throwable -> L1c
            r6 = r12
        L1a:
            r13 = r0
            goto L6f
        L1c:
            r0 = move-exception
            r12 = r0
            goto L76
        L1f:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r12)
            return r7
        L25:
            java.lang.Object r0 = r12.c
            p.c9n r0 = (p.c9n) r0
            p.hm5.M(r13)     // Catch: java.lang.Throwable -> L1c
            goto L4e
        L2d:
            p.hm5.M(r13)
            java.lang.Object r13 = r12.c
            p.c9n r13 = (p.c9n) r13
        L34:
            p.o8n r0 = r13.J()     // Catch: java.lang.Throwable -> L1c
            boolean r0 = p.op71.C(r0)     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L71
            p.bbc r0 = r1.g     // Catch: java.lang.Throwable -> L1c
            r12.c = r13     // Catch: java.lang.Throwable -> L1c
            r12.b = r9     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r0 = r0.r(r12)     // Catch: java.lang.Throwable -> L1c
            if (r0 != r10) goto L4b
            goto L6e
        L4b:
            r11 = r0
            r0 = r13
            r13 = r11
        L4e:
            r3 = r13
            p.snm0 r3 = (p.snm0) r3     // Catch: java.lang.Throwable -> L1c
            p.wat r13 = r1.c     // Catch: java.lang.Throwable -> L1c
            r2 = 1086324736(0x40c00000, float:6.0)
            float r4 = r13.X0(r2)     // Catch: java.lang.Throwable -> L1c
            p.wat r13 = r1.c     // Catch: java.lang.Throwable -> L1c
            r2 = 1065353216(0x3f800000, float:1.0)
            float r5 = r13.X0(r2)     // Catch: java.lang.Throwable -> L1c
            p.du41 r2 = r1.a     // Catch: java.lang.Throwable -> L1c
            r12.c = r0     // Catch: java.lang.Throwable -> L1c
            r12.b = r8     // Catch: java.lang.Throwable -> L1c
            r6 = r12
            java.lang.Object r12 = r1.d(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L1c
            if (r12 != r10) goto L1a
        L6e:
            return r10
        L6f:
            r12 = r6
            goto L34
        L71:
            r1.h = r7
            p.rih1 r12 = p.rih1.a
            return r12
        L76:
            r1.h = r7
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p.m2a0.h(java.lang.Object):java.lang.Object");
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                return new m2a0((o2a0) this.c, (k2a0) obj2, lnmVar, (byte) 0);
            case 1:
                return new m2a0((pt) this.c, (iu30) obj2, lnmVar, (byte) 1);
            case 2:
                return new m2a0((hl00) this.c, (String) obj2, lnmVar, (byte) 2);
            case 3:
                m2a0 m2a0Var = new m2a0((chb0) obj2, lnmVar, (byte) 3);
                m2a0Var.c = obj;
                return m2a0Var;
            case 4:
                return new m2a0((hvk) this.c, (wp20) obj2, lnmVar, (byte) 4);
            case 5:
                return new m2a0((bxb0) this.c, (String) obj2, lnmVar, (byte) 5);
            case 6:
                m2a0 m2a0Var2 = new m2a0((haa0) obj2, lnmVar, (byte) 6);
                m2a0Var2.c = obj;
                return m2a0Var2;
            case 7:
                m2a0 m2a0Var3 = new m2a0((r3d0) obj2, lnmVar, (byte) 7);
                m2a0Var3.c = obj;
                return m2a0Var3;
            case 8:
                return new m2a0((sdd0) this.c, (tdd0) obj2, lnmVar, (byte) 8);
            case 9:
                m2a0 m2a0Var4 = new m2a0((vdd0) obj2, lnmVar, (byte) 9);
                m2a0Var4.c = obj;
                return m2a0Var4;
            case 10:
                m2a0 m2a0Var5 = new m2a0((hfd0) obj2, lnmVar, (byte) 10);
                m2a0Var5.c = obj;
                return m2a0Var5;
            case 11:
                m2a0 m2a0Var6 = new m2a0((hgd0) obj2, lnmVar, (byte) 11);
                m2a0Var6.c = obj;
                return m2a0Var6;
            case 12:
                m2a0 m2a0Var7 = new m2a0((haa0) obj2, lnmVar, (byte) 12);
                m2a0Var7.c = obj;
                return m2a0Var7;
            case 13:
                m2a0 m2a0Var8 = new m2a0((m3e0) obj2, lnmVar, (byte) 13);
                m2a0Var8.c = obj;
                return m2a0Var8;
            case 14:
                return new m2a0((b6e0) this.c, (k8g1) obj2, lnmVar, (byte) 14);
            case 15:
                return new m2a0((zd1) obj2, lnmVar, (byte) 15);
            case 16:
                return new m2a0((oie0) this.c, (String) obj2, lnmVar, (byte) 16);
            case 17:
                return new m2a0((yon) this.c, (bxg0) obj2, lnmVar, (byte) 17);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new m2a0((jqf0) this.c, (ypf0) obj2, lnmVar, (byte) 18);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                m2a0 m2a0Var9 = new m2a0((ozf0) obj2, lnmVar, (byte) 19);
                m2a0Var9.c = obj;
                return m2a0Var9;
            case 20:
                return new m2a0((s4g0) this.c, (Set) obj2, lnmVar, (byte) 20);
            case 21:
                return new m2a0((faa0) this.c, (s4g0) obj2, lnmVar, (byte) 21);
            case 22:
                m2a0 m2a0Var10 = new m2a0((eeg0) obj2, lnmVar, (byte) 22);
                m2a0Var10.c = obj;
                return m2a0Var10;
            case 23:
                return new m2a0((faa0) this.c, (vug0) obj2, lnmVar, (byte) 23);
            case 24:
                m2a0 m2a0Var11 = new m2a0((be91) obj2, lnmVar, (byte) 24);
                m2a0Var11.c = obj;
                return m2a0Var11;
            case 25:
                return new m2a0((n6i0) this.c, (blc0) obj2, lnmVar, (byte) 25);
            case 26:
                return new m2a0((j9k0) this.c, (tv80) obj2, lnmVar, (byte) 26);
            case 27:
                m2a0 m2a0Var12 = new m2a0((MobiusLoop) obj2, lnmVar, (byte) 27);
                m2a0Var12.c = obj;
                return m2a0Var12;
            case 28:
                m2a0 m2a0Var13 = new m2a0((wnm0) obj2, lnmVar, (byte) 28);
                m2a0Var13.c = obj;
                return m2a0Var13;
            default:
                m2a0 m2a0Var14 = new m2a0((q6n0) obj2, lnmVar, (byte) 29);
                m2a0Var14.c = obj;
                return m2a0Var14;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.lifecycle.LifecycleDestroyedException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.bluejay.confirmgenerationpage.effecthandler.AttachmentNotSafeException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.bluejay.data.api.GenerationServiceException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: retrofit2.HttpException */
    public final Object invoke(Object obj, Object obj2) throws GenerationServiceException, LifecycleDestroyedException, AttachmentNotSafeException, HttpException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((mmr0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((mmr0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 17:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9n.a;
            case 28:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.lifecycle.LifecycleDestroyedException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.bluejay.confirmgenerationpage.effecthandler.AttachmentNotSafeException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.bluejay.data.api.GenerationServiceException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: retrofit2.HttpException */
    /* JADX WARN: Code duplicated, block: B:304:0x0599  */
    /* JADX WARN: Code duplicated, block: B:306:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:309:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:463:0x082b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:464:0x082d  */
    /* JADX WARN: Code duplicated, block: B:465:0x0835  */
    /* JADX WARN: Code duplicated, block: B:466:0x0839  */
    /* JADX WARN: Code duplicated, block: B:468:0x083f  */
    /* JADX WARN: Code duplicated, block: B:472:0x0858  */
    /* JADX WARN: Code duplicated, block: B:478:0x0876  */
    /* JADX WARN: Code duplicated, block: B:482:0x0893  */
    /* JADX WARN: Code duplicated, block: B:548:0x09f7  */
    /* JADX WARN: Code duplicated, block: B:619:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:310:0x05be -> B:304:0x0599). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) throws com.spotify.bluejay.data.api.GenerationServiceException, androidx.lifecycle.LifecycleDestroyedException, com.spotify.bluejay.confirmgenerationpage.effecthandler.AttachmentNotSafeException, retrofit2.HttpException {
        /*
            Method dump skipped, instruction units count: 2660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.m2a0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m2a0(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
    }
}
