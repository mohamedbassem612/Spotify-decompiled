package p;

import com.spotify.player.model.PlayerState;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xoh1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public Object c;
    public Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xoh1(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                xoh1 xoh1Var = new xoh1((yoh1) this.d, (moh1) obj2, lnmVar, (byte) 0);
                xoh1Var.c = obj;
                return xoh1Var;
            case 1:
                xoh1 xoh1Var2 = new xoh1((orh1) this.d, (krh1) obj2, lnmVar, (byte) 1);
                xoh1Var2.c = obj;
                return xoh1Var2;
            case 2:
                xoh1 xoh1Var3 = new xoh1((e8i1) this.d, (z7i1) obj2, lnmVar, (byte) 2);
                xoh1Var3.c = obj;
                return xoh1Var3;
            case 3:
                return new xoh1((w9i1) this.c, (String) this.d, (qx10) obj2, lnmVar, (byte) 3);
            case 4:
                xoh1 xoh1Var4 = new xoh1((wei1) this.d, (PlayerState) obj2, lnmVar, (byte) 4);
                xoh1Var4.c = obj;
                return xoh1Var4;
            case 5:
                xoh1 xoh1Var5 = new xoh1((bnj1) obj2, lnmVar, (byte) 5);
                xoh1Var5.c = obj;
                return xoh1Var5;
            case 6:
                xoh1 xoh1Var6 = new xoh1((wok1) obj2, lnmVar, (byte) 6);
                xoh1Var6.c = obj;
                return xoh1Var6;
            case 7:
                return new xoh1((pvk1) this.d, (jvk1) obj2, lnmVar, (byte) 7);
            case 8:
                xoh1 xoh1Var7 = new xoh1((hil1) this.d, (m441) obj2, lnmVar, (byte) 8);
                xoh1Var7.c = obj;
                return xoh1Var7;
            case 9:
                return new xoh1((sxl1) this.c, (z8d0) this.d, (tvl1) obj2, lnmVar, (byte) 9);
            case 10:
                xoh1 xoh1Var8 = new xoh1((y4m1) this.d, (bma1) obj2, lnmVar, (byte) 10);
                xoh1Var8.c = obj;
                return xoh1Var8;
            case 11:
                xoh1 xoh1Var9 = new xoh1((hw2) this.d, (String) obj2, lnmVar, (byte) 11);
                xoh1Var9.c = obj;
                return xoh1Var9;
            case 12:
                return new xoh1((lbm1) this.c, (String) this.d, (ven0) obj2, lnmVar, (byte) 12);
            case 13:
                xoh1 xoh1Var10 = new xoh1((cik1) this.d, (ArrayList) obj2, lnmVar, (byte) 13);
                xoh1Var10.c = obj;
                return xoh1Var10;
            case 14:
                return new xoh1((ieo1) this.d, (cnn1) obj2, lnmVar, (byte) 14);
            case 15:
                xoh1 xoh1Var11 = new xoh1((ieo1) obj2, lnmVar, (byte) 15);
                xoh1Var11.c = obj;
                return xoh1Var11;
            case 16:
                return new xoh1((zwo1) this.d, (vfo1) obj2, lnmVar, (byte) 16);
            default:
                xoh1 xoh1Var12 = new xoh1((elo1) obj2, lnmVar, (byte) 17);
                xoh1Var12.c = obj;
                return xoh1Var12;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((mmr0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((rvo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((zwo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((zwo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzhm */
    /* JADX WARN: Code duplicated, block: B:123:0x02ae A[PHI: r1 r2
      0x02ae: PHI (r1v4 ??) = (r1v31 ??), (r1v32 ??), (r1v33 ??) binds: [B:118:0x02a2, B:111:0x0284, B:115:0x0291] A[DONT_GENERATE, DONT_INLINE]
      0x02ae: PHI (r2v78 p.vfo1) = (r2v77 p.vfo1), (r2v75 p.vfo1), (r2v75 p.vfo1) binds: [B:118:0x02a2, B:111:0x0284, B:115:0x0291] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:318:0x0697  */
    /* JADX WARN: Code duplicated, block: B:320:0x06a9  */
    /* JADX WARN: Code duplicated, block: B:322:0x06b9  */
    /* JADX WARN: Code duplicated, block: B:324:0x06c1  */
    /* JADX WARN: Code duplicated, block: B:326:0x06c7  */
    /* JADX WARN: Code duplicated, block: B:328:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:346:0x0711  */
    /* JADX WARN: Code duplicated, block: B:350:0x0720  */
    /* JADX WARN: Code duplicated, block: B:352:0x0726  */
    /* JADX WARN: Code duplicated, block: B:391:0x07d4  */
    /* JADX WARN: Code duplicated, block: B:443:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:472:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:475:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:476:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:483:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:484:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01d0, code lost:
    
        if (r0 != r11) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x020a, code lost:
    
        if (((p.qwo1) r5).a.invoke((java.lang.Object) r0, (java.lang.Object) r1) == r11) goto L97;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v108, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v116, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v161 */
    /* JADX WARN: Type inference failed for: r0v162 */
    /* JADX WARN: Type inference failed for: r12v7, types: [p.wok1] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, p.a8d1, p.lnm, p.onm, p.xoh1] */
    /* JADX WARN: Type inference failed for: r1v2, types: [p.xoh1] */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v114 */
    /* JADX WARN: Type inference failed for: r2v115 */
    /* JADX WARN: Type inference failed for: r2v116 */
    /* JADX WARN: Type inference failed for: r2v117 */
    /* JADX WARN: Type inference failed for: r2v80 */
    /* JADX WARN: Type inference failed for: r2v82, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v84, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v90 */
    /* JADX WARN: Type inference failed for: r2v95 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:123:0x02ae -> B:425:0x02af). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:356:0x0737 -> B:316:0x068d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.xoh1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xoh1(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xoh1(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
    }
}
