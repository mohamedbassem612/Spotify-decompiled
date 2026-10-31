package p;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class js extends a8d1 implements bv30 {
    public final /* synthetic */ byte a;
    public Object b;
    public byte c;
    public /* synthetic */ Object d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ js(Object obj, lnm lnmVar, byte b) {
        super(5, lnmVar);
        this.a = b;
        this.f = obj;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00be A[PHI: r4 r6 r12
      0x00be: PHI (r4v7 p.owj0) = (r4v6 p.owj0), (r4v1 p.owj0) binds: [B:32:0x00ba, B:9:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x00be: PHI (r6v6 p.js) = (r6v4 p.js), (r6v7 p.js) binds: [B:32:0x00ba, B:9:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x00be: PHI (r12v17 java.lang.Object) = (r12v16 java.lang.Object), (r12v24 java.lang.Object) binds: [B:32:0x00ba, B:9:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:43:0x00da A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x0177 A[PHI: r6
      0x0177: PHI (r6v10 p.js) = (r6v8 p.js), (r6v11 p.js) binds: [B:67:0x0173, B:6:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
    
        if (r12.d(r7, r11, r0) == r10) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ed, code lost:
    
        if (r1.j(r11, r6) == r10) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x010f, code lost:
    
        if (r1.i(r4, false, r11, false, r6) == r10) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x019d, code lost:
    
        if (r1.i(r4, true, r4, r5, r6) == r10) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01dc, code lost:
    
        if (r1.i(r4, false, r11, false, r6) == r10) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01fb, code lost:
    
        if (r12.c(r7, p.x8k0.a, r11, r6) == r10) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object e(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.js.e(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00cc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:0x00cd A[RETURN] */
    private final Object g(Object obj) {
        gqo0 gqo0Var = ((loo0) this.f).b;
        goo0 goo0Var = (ioo0) this.b;
        eoo0 eoo0Var = (eoo0) this.e;
        tqw tqwVar = (tqw) this.d;
        byte b = this.c;
        rih1 rih1Var = rih1.a;
        if (b != 0) {
            if (b == 1) {
                hm5.M(obj);
                return rih1Var;
            }
            if (b == 2) {
                hm5.M(obj);
                return rih1Var;
            }
            if (b == 3) {
                hm5.M(obj);
                return rih1Var;
            }
            if (b == 4) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        boolean zJ = u890.j(eoo0Var, coo0.a);
        d9n d9nVar = d9n.a;
        if (zJ) {
            this.b = null;
            this.e = null;
            this.d = null;
            this.c = (byte) 1;
            if (gqo0Var.f(this) == d9nVar) {
                return d9nVar;
            }
            return rih1Var;
        }
        if (!u890.j(eoo0Var, doo0.a)) {
            eg.o();
            return null;
        }
        if (goo0Var instanceof hoo0) {
            tv80 tv80VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
            this.b = null;
            this.e = null;
            this.d = null;
            this.c = (byte) 2;
            Object objG = gqo0Var.g((String) null, gqo0.r, tv80VarY, this);
            if (objG != d9nVar) {
                objG = rih1Var;
            }
            if (objG == d9nVar) {
                return d9nVar;
            }
            return rih1Var;
        }
        if (goo0Var instanceof goo0) {
            String str = goo0Var.a;
            tv80 tv80VarY2 = tqwVar != null ? n3o1.y(tqwVar) : null;
            this.b = null;
            this.e = null;
            this.d = null;
            this.c = (byte) 3;
            gqo0Var.getClass();
            Object objG2 = gqo0Var.g(str, pcf.d(6, str, (String) null), tv80VarY2, this);
            if (objG2 != d9nVar) {
                objG2 = rih1Var;
            }
            if (objG2 == d9nVar) {
                return d9nVar;
            }
            return rih1Var;
        }
        if (!(goo0Var instanceof foo0)) {
            eg.o();
            return null;
        }
        tv80 tv80VarY3 = tqwVar != null ? n3o1.y(tqwVar) : null;
        this.b = null;
        this.e = null;
        this.d = null;
        this.c = (byte) 4;
        Object objG3 = gqo0Var.g((String) null, gqo0.s, tv80VarY3, this);
        if (objG3 != d9nVar) {
            objG3 = rih1Var;
        }
        if (objG3 == d9nVar) {
            return d9nVar;
        }
        return rih1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00de, code lost:
    
        if (r1.b(r4, r18) == r11) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object h(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.js.h(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a9  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        if (r13.invoke(r0, r12) == r11) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
    
        if (r0.c(r13, r1, r12) == r11) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bd, code lost:
    
        if (r0.b(r13, r8, r1, r12) == r11) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bf, code lost:
    
        return r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object i(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f
            r3 = r0
            p.w2s r3 = (p.w2s) r3
            java.lang.Object r0 = r3.e
            p.kwn r0 = (p.kwn) r0
            java.lang.Object r1 = r12.b
            r2 = r1
            p.qr11 r2 = (p.qr11) r2
            java.lang.Object r1 = r12.e
            p.kr11 r1 = (p.kr11) r1
            java.lang.Object r4 = r12.d
            p.tqw r4 = (p.tqw) r4
            byte r5 = r12.c
            r6 = 0
            r7 = 3
            r8 = 2
            r9 = 1
            if (r5 == 0) goto L30
            if (r5 == r9) goto L2b
            if (r5 == r8) goto L2b
            if (r5 != r7) goto L25
            goto L2b
        L25:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r12)
            return r6
        L2b:
            p.hm5.M(r13)
            goto Lc0
        L30:
            p.hm5.M(r13)
            r5 = 0
            if (r4 == 0) goto L3b
            p.tv80 r13 = p.n3o1.y(r4)
            goto L3c
        L3b:
            r13 = r5
        L3c:
            if (r13 == 0) goto L41
            p.ou80 r4 = r13.a
            goto L42
        L41:
            r4 = r5
        L42:
            p.hr11 r10 = p.hr11.a
            boolean r10 = p.u890.j(r1, r10)
            p.d9n r11 = p.d9n.a
            if (r10 == 0) goto L61
            java.lang.Object r13 = r3.b
            p.vu30 r13 = (p.vu30) r13
            java.lang.String r0 = r2.a
            r12.b = r5
            r12.e = r5
            r12.d = r5
            r12.c = r9
            java.lang.Object r12 = r13.invoke(r0, r12)
            if (r12 != r11) goto Lc0
            goto Lbf
        L61:
            p.ir11 r10 = p.ir11.a
            boolean r10 = p.u890.j(r1, r10)
            if (r10 == 0) goto L80
            java.lang.String r13 = r2.a
            if (r4 == 0) goto L70
            java.lang.String r1 = r4.a
            goto L71
        L70:
            r1 = r5
        L71:
            r12.b = r5
            r12.e = r5
            r12.d = r5
            r12.c = r8
            java.lang.Object r12 = r0.c(r13, r1, r12)
            if (r12 != r11) goto Lc0
            goto Lbf
        L80:
            boolean r8 = r1 instanceof p.jr11
            if (r8 == 0) goto Lc3
            p.jr11 r1 = (p.jr11) r1
            p.id2 r1 = r1.a
            boolean r6 = r1 instanceof p.gd2
            if (r6 == 0) goto La1
            p.gd2 r1 = (p.gd2) r1
            boolean r6 = r1.a
            if (r6 == 0) goto La1
            java.lang.Object r12 = r3.t
            p.vb2 r12 = (p.vb2) r12
            p.db2 r0 = new p.db2
            int r1 = r1.b
            r0.<init>(r1)
            p.vb2.b(r12, r0, r9, r13)
            goto Lc0
        La1:
            java.lang.String r13 = r2.a
            if (r4 == 0) goto La9
            java.lang.String r1 = r4.a
            r8 = r1
            goto Laa
        La9:
            r8 = r5
        Laa:
            p.l24 r1 = new p.l24
            r6 = 24
            r1.<init>(r2, r3, r4, r5, r6)
            r12.b = r5
            r12.e = r5
            r12.d = r5
            r12.c = r7
            java.lang.Object r12 = r0.b(r13, r8, r1, r12)
            if (r12 != r11) goto Lc0
        Lbf:
            return r11
        Lc0:
            p.rih1 r12 = p.rih1.a
            return r12
        Lc3:
            p.eg.o()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.js.i(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0093  */
    /* JADX WARN: Code duplicated, block: B:31:0x0099  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ce  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e5, code lost:
    
        if (p.fn31.Y(r14, r1, r13) == r12) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object j(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.js.j(java.lang.Object):java.lang.Object");
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj6 = this.f;
        switch (b) {
            case 0:
                js jsVar = new js((rwj) obj6, (lnm) obj5, (byte) 0);
                jsVar.e = (fs) obj3;
                jsVar.d = (tqw) obj4;
                return jsVar.invokeSuspend(rih1Var);
            case 1:
                js jsVar2 = new js((yxb0) obj6, (lnm) obj5, (byte) 1);
                jsVar2.e = (ks) obj3;
                jsVar2.d = (tqw) obj4;
                return jsVar2.invokeSuspend(rih1Var);
            case 2:
                js jsVar3 = new js((z72) obj6, (lnm) obj5, (byte) 2);
                jsVar3.e = (r72) obj3;
                jsVar3.d = (tqw) obj4;
                return jsVar3.invokeSuspend(rih1Var);
            case 3:
                js jsVar4 = new js((l63) obj6, (lnm) obj5, (byte) 3);
                jsVar4.b = (i63) obj2;
                jsVar4.e = (f63) obj3;
                jsVar4.d = (tqw) obj4;
                return jsVar4.invokeSuspend(rih1Var);
            case 4:
                js jsVar5 = new js((sbk) obj6, (lnm) obj5, (byte) 4);
                jsVar5.b = (nbk) obj;
                jsVar5.e = (mbk) obj3;
                jsVar5.d = (tqw) obj4;
                return jsVar5.invokeSuspend(rih1Var);
            case 5:
                js jsVar6 = new js((wek) obj6, (lnm) obj5, (byte) 5);
                jsVar6.b = (uek) obj2;
                jsVar6.e = (rek) obj3;
                jsVar6.d = (tqw) obj4;
                return jsVar6.invokeSuspend(rih1Var);
            case 6:
                js jsVar7 = new js((n0o) obj6, (lnm) obj5, (byte) 6);
                jsVar7.b = (c0o) obj;
                jsVar7.e = (a0o) obj3;
                jsVar7.d = (tqw) obj4;
                return jsVar7.invokeSuspend(rih1Var);
            case 7:
                js jsVar8 = new js((ujo) obj6, (lnm) obj5, (byte) 7);
                jsVar8.b = (rjo) obj;
                jsVar8.e = (pjo) obj3;
                jsVar8.d = (tqw) obj4;
                return jsVar8.invokeSuspend(rih1Var);
            case 8:
                js jsVar9 = new js((hko) obj6, (lnm) obj5, (byte) 8);
                jsVar9.b = (yjo) obj;
                jsVar9.e = (wjo) obj3;
                jsVar9.d = (tqw) obj4;
                return jsVar9.invokeSuspend(rih1Var);
            case 9:
                js jsVar10 = new js((el9) obj6, (lnm) obj5, (byte) 9);
                jsVar10.b = (d5w) obj;
                jsVar10.e = (c5w) obj3;
                jsVar10.d = (tqw) obj4;
                return jsVar10.invokeSuspend(rih1Var);
            case 10:
                js jsVar11 = new js((ng20) obj6, (lnm) obj5, (byte) 10);
                jsVar11.b = (o330) obj;
                jsVar11.e = (v330) obj2;
                jsVar11.d = (l330) obj3;
                return jsVar11.invokeSuspend(rih1Var);
            case 11:
                js jsVar12 = new js((jvu) obj6, (lnm) obj5, (byte) 11);
                jsVar12.b = (k430) obj;
                jsVar12.e = (r430) obj3;
                jsVar12.d = (tqw) obj4;
                return jsVar12.invokeSuspend(rih1Var);
            case 12:
                js jsVar13 = new js((h730) obj6, (lnm) obj5, (byte) 12);
                jsVar13.b = (d730) obj;
                jsVar13.e = (b730) obj3;
                jsVar13.d = (tqw) obj4;
                return jsVar13.invokeSuspend(rih1Var);
            case 13:
                js jsVar14 = new js((xw90) obj6, (lnm) obj5, (byte) 13);
                jsVar14.b = (lx90) obj2;
                jsVar14.e = (dx90) obj3;
                jsVar14.d = (tqw) obj4;
                return jsVar14.invokeSuspend(rih1Var);
            case 14:
                js jsVar15 = new js((mbc0) obj6, (lnm) obj5, (byte) 14);
                jsVar15.b = (unb1) obj2;
                jsVar15.e = (fe00) obj3;
                jsVar15.d = (tqw) obj4;
                return jsVar15.invokeSuspend(rih1Var);
            case 15:
                js jsVar16 = new js((exj0) obj6, (lnm) obj5, (byte) 15);
                jsVar16.b = (owj0) obj2;
                jsVar16.e = (mwj0) obj3;
                jsVar16.d = (tqw) obj4;
                return jsVar16.invokeSuspend(rih1Var);
            case 16:
                js jsVar17 = new js((loo0) obj6, (lnm) obj5, (byte) 16);
                jsVar17.b = (ioo0) obj;
                jsVar17.e = (eoo0) obj3;
                jsVar17.d = (tqw) obj4;
                return jsVar17.invokeSuspend(rih1Var);
            case 17:
                js jsVar18 = new js((z72) obj6, (lnm) obj5, (byte) 17);
                jsVar18.e = (n7p0) obj3;
                jsVar18.d = (tqw) obj4;
                return jsVar18.invokeSuspend(rih1Var);
            case 18:
                js jsVar19 = new js((w2s) obj6, (lnm) obj5, (byte) 18);
                jsVar19.b = (qr11) obj;
                jsVar19.e = (kr11) obj3;
                jsVar19.d = (tqw) obj4;
                return jsVar19.invokeSuspend(rih1Var);
            case 19:
                js jsVar20 = new js((hc41) obj6, (lnm) obj5, (byte) 19);
                jsVar20.b = (bc41) obj;
                jsVar20.e = (zb41) obj3;
                jsVar20.d = (tqw) obj4;
                return jsVar20.invokeSuspend(rih1Var);
            case 20:
                js jsVar21 = new js((et90) obj6, (lnm) obj5, (byte) 20);
                jsVar21.b = (bd61) obj2;
                jsVar21.e = (zc61) obj3;
                jsVar21.d = (tqw) obj4;
                return jsVar21.invokeSuspend(rih1Var);
            default:
                js jsVar22 = new js((skg1) obj6, (lnm) obj5, (byte) 21);
                jsVar22.b = (nkg1) obj;
                jsVar22.e = (okg1) obj2;
                jsVar22.d = (mkg1) obj3;
                return jsVar22.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:472:0x08a2 A[Catch: all -> 0x0849, TryCatch #0 {all -> 0x0849, blocks: (B:444:0x0844, B:451:0x0856, B:478:0x08d1, B:452:0x085d, B:470:0x089e, B:472:0x08a2, B:474:0x08c5, B:475:0x08c8, B:459:0x0871, B:461:0x087b, B:463:0x0881, B:465:0x0889, B:467:0x088d), top: B:546:0x083c }] */
    /* JADX WARN: Code duplicated, block: B:474:0x08c5 A[Catch: all -> 0x0849, TryCatch #0 {all -> 0x0849, blocks: (B:444:0x0844, B:451:0x0856, B:478:0x08d1, B:452:0x085d, B:470:0x089e, B:472:0x08a2, B:474:0x08c5, B:475:0x08c8, B:459:0x0871, B:461:0x087b, B:463:0x0881, B:465:0x0889, B:467:0x088d), top: B:546:0x083c }] */
    /* JADX WARN: Code duplicated, block: B:477:0x08d0  */
    /* JADX WARN: Code duplicated, block: B:503:0x0958  */
    /* JADX WARN: Code duplicated, block: B:504:0x0960  */
    /* JADX WARN: Code duplicated, block: B:509:0x0977  */
    /* JADX WARN: Code duplicated, block: B:510:0x097f  */
    /* JADX WARN: Code duplicated, block: B:533:0x0a05  */
    /* JADX WARN: Code duplicated, block: B:534:0x0a0d  */
    /* JADX WARN: Code duplicated, block: B:539:0x0a24  */
    /* JADX WARN: Code duplicated, block: B:540:0x0a2c  */
    /* JADX WARN: Code duplicated, block: B:596:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:599:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:600:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:603:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:604:? A[RETURN, SYNTHETIC] */
    public final Object invokeSuspend(Object obj) {
        tv80 tv80VarD;
        Object objI;
        Object objA;
        Single singleD;
        tv80 tv80VarD2;
        Object objI2;
        Object objA2;
        Single singleD2;
        Object objA3;
        ou80 ou80Var;
        bbc bbcVar;
        fq2 fq2Var;
        Object objL;
        u72 u72Var;
        iu30 iu30Var;
        Object objH;
        Object objB;
        pp90 pp90VarB;
        ou80 ou80Var2;
        byte b = this.a;
        d9n d9nVar = d9n.a;
        Object obj2 = this.f;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                rwj rwjVar = (rwj) obj2;
                lzn0 lzn0Var = (lzn0) rwjVar.g;
                kw kwVar = (kw) rwjVar.e;
                fs fsVar = (fs) this.e;
                tqw tqwVar = (tqw) this.d;
                byte b2 = this.c;
                if (b2 == 0) {
                    hm5.M(obj);
                    tv80VarD = cvl1.d(tqwVar);
                    if (fsVar == null) {
                        eg.o();
                        return null;
                    }
                    this.e = null;
                    this.d = null;
                    this.b = tv80VarD;
                    this.c = (byte) 1;
                    objI = b5p1.i(kwVar.d.a(), this);
                    if (objI == d9nVar) {
                        return d9nVar;
                    }
                    if (((Boolean) objI).booleanValue()) {
                        lzn0Var.a(nik1.o5.a, tv80VarD, (Bundle) null);
                    } else {
                        this.e = null;
                        this.d = null;
                        this.b = tv80VarD;
                        this.c = (byte) 2;
                        objA = kwVar.a(this);
                        if (objA == d9nVar) {
                            return d9nVar;
                        }
                        if (((Boolean) objA).booleanValue()) {
                            lzn0Var.a(nik1.n5.a, tv80VarD, (Bundle) null);
                        } else {
                            singleD = ((jq) rwjVar.d).d(tv80VarD.a.a);
                            this.e = null;
                            this.d = null;
                            this.b = null;
                            this.c = (byte) 3;
                            if (fc11.j(singleD, this) == d9nVar) {
                                return d9nVar;
                            }
                        }
                    }
                } else if (b2 == 1) {
                    tv80 tv80Var = (tv80) this.b;
                    hm5.M(obj);
                    tv80VarD = tv80Var;
                    objI = obj;
                    if (((Boolean) objI).booleanValue()) {
                        lzn0Var.a(nik1.o5.a, tv80VarD, (Bundle) null);
                    } else {
                        this.e = null;
                        this.d = null;
                        this.b = tv80VarD;
                        this.c = (byte) 2;
                        objA = kwVar.a(this);
                        if (objA == d9nVar) {
                            return d9nVar;
                        }
                        if (((Boolean) objA).booleanValue()) {
                            lzn0Var.a(nik1.n5.a, tv80VarD, (Bundle) null);
                        } else {
                            singleD = ((jq) rwjVar.d).d(tv80VarD.a.a);
                            this.e = null;
                            this.d = null;
                            this.b = null;
                            this.c = (byte) 3;
                            if (fc11.j(singleD, this) == d9nVar) {
                                return d9nVar;
                            }
                        }
                    }
                } else if (b2 == 2) {
                    tv80 tv80Var2 = (tv80) this.b;
                    hm5.M(obj);
                    tv80VarD = tv80Var2;
                    objA = obj;
                    if (((Boolean) objA).booleanValue()) {
                        lzn0Var.a(nik1.n5.a, tv80VarD, (Bundle) null);
                    } else {
                        singleD = ((jq) rwjVar.d).d(tv80VarD.a.a);
                        this.e = null;
                        this.d = null;
                        this.b = null;
                        this.c = (byte) 3;
                        if (fc11.j(singleD, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (b2 != 3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            case 1:
                yxb0 yxb0Var = (yxb0) obj2;
                lzn0 lzn0Var2 = (lzn0) yxb0Var.c;
                kw kwVar2 = (kw) yxb0Var.e;
                ks ksVar = (ks) this.e;
                tqw tqwVar2 = (tqw) this.d;
                byte b3 = this.c;
                if (b3 == 0) {
                    hm5.M(obj);
                    tv80VarD2 = cvl1.d(tqwVar2);
                    if (ksVar == null) {
                        eg.o();
                        return null;
                    }
                    this.e = null;
                    this.d = null;
                    this.b = tv80VarD2;
                    this.c = (byte) 1;
                    objI2 = b5p1.i(kwVar2.d.a(), this);
                    if (objI2 == d9nVar) {
                        return d9nVar;
                    }
                    if (((Boolean) objI2).booleanValue()) {
                        lzn0Var2.a(nik1.o5.a, tv80VarD2, (Bundle) null);
                    } else {
                        this.e = null;
                        this.d = null;
                        this.b = tv80VarD2;
                        this.c = (byte) 2;
                        objA2 = kwVar2.a(this);
                        if (objA2 == d9nVar) {
                            return d9nVar;
                        }
                        if (((Boolean) objA2).booleanValue()) {
                            lzn0Var2.a(nik1.n5.a, tv80VarD2, (Bundle) null);
                        } else {
                            singleD2 = ((jq) yxb0Var.d).d(tv80VarD2.a.a);
                            this.e = null;
                            this.d = null;
                            this.b = null;
                            this.c = (byte) 3;
                            if (fc11.j(singleD2, this) == d9nVar) {
                                return d9nVar;
                            }
                        }
                    }
                } else if (b3 == 1) {
                    tv80 tv80Var3 = (tv80) this.b;
                    hm5.M(obj);
                    tv80VarD2 = tv80Var3;
                    objI2 = obj;
                    if (((Boolean) objI2).booleanValue()) {
                        lzn0Var2.a(nik1.o5.a, tv80VarD2, (Bundle) null);
                    } else {
                        this.e = null;
                        this.d = null;
                        this.b = tv80VarD2;
                        this.c = (byte) 2;
                        objA2 = kwVar2.a(this);
                        if (objA2 == d9nVar) {
                            return d9nVar;
                        }
                        if (((Boolean) objA2).booleanValue()) {
                            lzn0Var2.a(nik1.n5.a, tv80VarD2, (Bundle) null);
                        } else {
                            singleD2 = ((jq) yxb0Var.d).d(tv80VarD2.a.a);
                            this.e = null;
                            this.d = null;
                            this.b = null;
                            this.c = (byte) 3;
                            if (fc11.j(singleD2, this) == d9nVar) {
                                return d9nVar;
                            }
                        }
                    }
                } else if (b3 == 2) {
                    tv80 tv80Var4 = (tv80) this.b;
                    hm5.M(obj);
                    tv80VarD2 = tv80Var4;
                    objA2 = obj;
                    if (((Boolean) objA2).booleanValue()) {
                        lzn0Var2.a(nik1.n5.a, tv80VarD2, (Bundle) null);
                    } else {
                        singleD2 = ((jq) yxb0Var.d).d(tv80VarD2.a.a);
                        this.e = null;
                        this.d = null;
                        this.b = null;
                        this.c = (byte) 3;
                        if (fc11.j(singleD2, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (b3 != 3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            case 2:
                z72 z72Var = (z72) obj2;
                xgn0 xgn0Var = (xgn0) z72Var.Z;
                r72 r72Var = (r72) this.e;
                tqw tqwVar3 = (tqw) this.d;
                byte b4 = this.c;
                try {
                    if (b4 != 0) {
                        if (b4 == 1) {
                            hm5.M(obj);
                            objA3 = obj;
                            if (!(objA3 instanceof loe)) {
                                bbcVar = (bbc) z72Var.Y;
                                fq2 fq2Var2 = (yo2) z72Var.t;
                                String str = (String) z72Var.e;
                                this.e = null;
                                this.d = null;
                                this.b = bbcVar;
                                this.c = (byte) 2;
                                fq2Var = fq2Var2;
                                if (fq2Var.s.a.getValue() instanceof hre) {
                                    fq2Var.i();
                                }
                                objL = fq2Var2.L(str, this);
                                if (objL == d9nVar) {
                                    return d9nVar;
                                }
                                u72Var = new u72((String) objL);
                                this.e = null;
                                this.d = null;
                                this.b = null;
                                this.c = (byte) 3;
                                if (bbcVar.b(u72Var, this) == d9nVar) {
                                    return d9nVar;
                                }
                            }
                        } else if (b4 == 2) {
                            bbcVar = (bbc) this.b;
                            hm5.M(obj);
                            objL = obj;
                            u72Var = new u72((String) objL);
                            this.e = null;
                            this.d = null;
                            this.b = null;
                            this.c = (byte) 3;
                            if (bbcVar.b(u72Var, this) == d9nVar) {
                                return d9nVar;
                            }
                        } else {
                            if (b4 != 3) {
                                eg.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            hm5.M(obj);
                        }
                        xgn0Var.c((Object) null);
                    } else {
                        hm5.M(obj);
                        if (r72Var == null) {
                            eg.o();
                            return null;
                        }
                        if (xgn0Var.g()) {
                            if (((pe) z72Var.g).e()) {
                                z72Var.h(tqwVar3);
                            } else {
                                String str2 = (tqwVar3 == null || (ou80Var = n3o1.y(tqwVar3).a) == null) ? null : ou80Var.a;
                                joe joeVar = (joe) z72Var.h;
                                this.e = null;
                                this.d = null;
                                this.c = (byte) 1;
                                objA3 = joeVar.a(str2, this);
                                if (objA3 == d9nVar) {
                                    return d9nVar;
                                }
                                if (!(objA3 instanceof loe)) {
                                    bbcVar = (bbc) z72Var.Y;
                                    fq2 fq2Var3 = (yo2) z72Var.t;
                                    String str3 = (String) z72Var.e;
                                    this.e = null;
                                    this.d = null;
                                    this.b = bbcVar;
                                    this.c = (byte) 2;
                                    fq2Var = fq2Var3;
                                    if (fq2Var.s.a.getValue() instanceof hre) {
                                        fq2Var.i();
                                    }
                                    objL = fq2Var3.L(str3, this);
                                    if (objL == d9nVar) {
                                        return d9nVar;
                                    }
                                    u72Var = new u72((String) objL);
                                    this.e = null;
                                    this.d = null;
                                    this.b = null;
                                    this.c = (byte) 3;
                                    if (bbcVar.b(u72Var, this) == d9nVar) {
                                        return d9nVar;
                                    }
                                }
                            }
                            xgn0Var.c((Object) null);
                        }
                    }
                    return rih1Var;
                } catch (Throwable th) {
                    xgn0Var.c((Object) null);
                    throw th;
                }
            case 3:
                l63 l63Var = (l63) obj2;
                i63 i63Var = (i63) this.b;
                f63 f63Var = (f63) this.e;
                tqw tqwVar4 = (tqw) this.d;
                byte b5 = this.c;
                if (b5 != 0) {
                    if (b5 == 1 || b5 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (u890.j(f63Var, d63.a)) {
                    if (tqwVar4 != null) {
                        l63Var.a.a(i63Var.d, n3o1.y(tqwVar4), (Bundle) null);
                    }
                } else {
                    if (!u890.j(f63Var, e63.a)) {
                        eg.o();
                        return null;
                    }
                    if (i63Var.e && tqwVar4 != null) {
                        tv80 tv80VarY = n3o1.y(tqwVar4);
                        boolean z = i63Var.f;
                        u9u0 u9u0Var = l63Var.b;
                        if (z) {
                            this.b = null;
                            this.e = null;
                            this.d = null;
                            this.c = (byte) 1;
                            if (u9u0Var.c(tv80VarY, this) == d9nVar) {
                                return d9nVar;
                            }
                        } else {
                            String str4 = i63Var.d;
                            this.b = null;
                            this.e = null;
                            this.d = null;
                            this.c = (byte) 2;
                            if (u9u0Var.d(str4, tv80VarY, this) == d9nVar) {
                                return d9nVar;
                            }
                        }
                    }
                }
                return rih1Var;
            case 4:
                sbk sbkVar = (sbk) obj2;
                nbk nbkVar = (nbk) this.b;
                mbk mbkVar = (mbk) this.e;
                tqw tqwVar5 = (tqw) this.d;
                byte b6 = this.c;
                if (b6 != 0) {
                    if (b6 == 1 || b6 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (u890.j(mbkVar, jbk.a)) {
                    if (nbkVar.k && (iu30Var = nbkVar.i) != null) {
                        iu30Var.invoke(tqwVar5 != null ? n3o1.y(tqwVar5) : null);
                    }
                } else if (u890.j(mbkVar, hbk.a)) {
                    ((lzn0) sbkVar.d).e();
                } else if (u890.j(mbkVar, lbk.a)) {
                    ((y1t0) sbkVar.e).l(nbkVar.a, "ConcertCampaignPage", tqwVar5 != null ? n3o1.y(tqwVar5) : null);
                } else if (u890.j(mbkVar, ibk.a)) {
                    Function0 function0 = nbkVar.h;
                    String str5 = nbkVar.a;
                    if (function0 != null) {
                        function0.invoke();
                    } else {
                        igm igmVar = new igm(nbkVar.b, new wfm(Uri.parse(nbkVar.d), yfm.c), (String) null, 4);
                        smc0 smc0VarN = k4p1.n();
                        gbk gbkVar = nbkVar.f;
                        if (gbkVar != null) {
                            smc0VarN.add(e6p1.h(new gmj(nbkVar, gbkVar, (byte) 11)));
                        }
                        smc0VarN.add(((f971) sbkVar.g).a(str5, z6x.a, null));
                        kjm kjmVar = new kjm(igmVar, k4p1.k(smc0VarN), 4);
                        i4q i4qVar = (i4q) sbkVar.f;
                        Parcelable.Creator creator = lik1.CREATOR;
                        mfm.c(i4qVar.a(new lik1(str5)), kjmVar, (p6r0) null, (bjm) null, tqwVar5 != null ? n3o1.y(tqwVar5) : null, 22);
                    }
                } else {
                    if (!(mbkVar instanceof kbk)) {
                        eg.o();
                        return null;
                    }
                    boolean z2 = ((kbk) mbkVar).a;
                    sd41 sd41Var = (sd41) sbkVar.h;
                    if (z2) {
                        Completable completableA = sd41.a(sd41Var, nbkVar.a, (tv80) null, 6);
                        this.b = null;
                        this.e = null;
                        this.d = null;
                        this.c = (byte) 1;
                        if (fc11.i(completableA, this) == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        Completable completableB = sd41.b(sd41Var, nbkVar.a, (tv80) null, 6);
                        this.b = null;
                        this.e = null;
                        this.d = null;
                        this.c = (byte) 2;
                        if (fc11.i(completableB, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                }
                return rih1Var;
            case 5:
                wek wekVar = (wek) obj2;
                uek uekVar = (uek) this.b;
                rek rekVar = (rek) this.e;
                tqw tqwVar6 = (tqw) this.d;
                byte b7 = this.c;
                if (b7 != 0) {
                    if (b7 == 1 || b7 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (u890.j(rekVar, oek.a)) {
                    if (tqwVar6 != null) {
                        wekVar.a.a(uekVar.a, n3o1.y(tqwVar6), (Bundle) null);
                    }
                } else if (u890.j(rekVar, pek.a)) {
                    boolean z3 = uekVar.h;
                    String str6 = uekVar.a;
                    sd41 sd41Var2 = wekVar.b;
                    if (z3) {
                        Completable completableA2 = sd41.a(sd41Var2, str6, (tv80) null, 6);
                        this.b = null;
                        this.e = null;
                        this.d = null;
                        this.c = (byte) 1;
                        if (fc11.i(completableA2, this) == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        Completable completableB2 = sd41.b(sd41Var2, str6, (tv80) null, 6);
                        this.b = null;
                        this.e = null;
                        this.d = null;
                        this.c = (byte) 2;
                        if (fc11.i(completableB2, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (!u890.j(rekVar, qek.a)) {
                        eg.o();
                        return null;
                    }
                    tv80 tv80VarY2 = tqwVar6 != null ? n3o1.y(tqwVar6) : null;
                    xgc xgcVar = wek.Z;
                    Parcelable.Creator creator2 = lik1.CREATOR;
                    lik1 lik1Var = new lik1(uekVar.a);
                    zpk zpkVar = wekVar.e;
                    String str7 = uekVar.a;
                    Observable observableA = zpkVar.a(lik1Var, str7, str7, uekVar.b, uekVar.d, new ypk(wekVar.g.f, false, (String) null, (List) null, (smc0) null, 242), uekVar.c);
                    mfm mfmVarA = wekVar.f.a(lik1Var);
                    AtomicReferenceArray atomicReferenceArray = p6r0.e;
                    mfm.b(mfmVarA, observableA, yon1.N0(), (bjm) null, tv80VarY2, 20);
                }
                return rih1Var;
            case 6:
                f1n0 f1n0Var = (f1n0) ((n0o) obj2).e;
                c0o c0oVar = (c0o) this.b;
                zzn zznVar = (a0o) this.e;
                tqw tqwVar7 = (tqw) this.d;
                byte b8 = this.c;
                if (b8 != 0) {
                    if (b8 == 1 || b8 == 2 || b8 == 3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                tv80 tv80VarD3 = cvl1.d(tqwVar7);
                if (zznVar instanceof zzn) {
                    String str8 = zznVar.a;
                    this.b = null;
                    this.e = null;
                    this.d = null;
                    this.c = (byte) 1;
                    if (f1n0.f(f1n0Var, str8, tv80VarD3, this) == d9nVar) {
                        return d9nVar;
                    }
                } else if (zznVar instanceof xzn) {
                    String str9 = ((xzn) zznVar).a;
                    this.b = null;
                    this.e = null;
                    this.d = null;
                    this.c = (byte) 2;
                    if (f1n0.f(f1n0Var, str9, tv80VarD3, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!u890.j(zznVar, yzn.a)) {
                        eg.o();
                        return null;
                    }
                    Set set = s4b1.f;
                    String strZ = uic.x("spotify:playlist-participants:".concat(uic.x(c0oVar.b).h())).z();
                    if (strZ != null) {
                        this.b = null;
                        this.e = null;
                        this.d = null;
                        this.c = (byte) 3;
                        if (f1n0.f(f1n0Var, strZ, tv80VarD3, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                }
                return rih1Var;
            case 7:
                hvm hvmVar = hvm.b;
                d0r d0rVar = ((ujo) obj2).b;
                rjo rjoVar = (rjo) this.b;
                pjo pjoVar = (pjo) this.e;
                tqw tqwVar8 = (tqw) this.d;
                byte b9 = this.c;
                if (b9 != 0) {
                    if (b9 == 1 || b9 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                int iOrdinal = pjoVar.ordinal();
                if (iOrdinal == 0) {
                    String str10 = rjoVar.a;
                    yy yyVar = new yy(tqwVar8 != null ? n3o1.y(tqwVar8) : null);
                    this.b = null;
                    this.e = null;
                    this.d = null;
                    this.c = (byte) 1;
                    if (d0r.d(d0rVar, hvmVar, str10, yyVar, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    String str11 = rjoVar.a;
                    w00 w00Var = new w00(rjoVar.b);
                    this.b = null;
                    this.e = null;
                    this.d = null;
                    this.c = (byte) 2;
                    if (d0r.d(d0rVar, hvmVar, str11, w00Var, this) == d9nVar) {
                        return d9nVar;
                    }
                }
                return rih1Var;
            case 8:
                hko hkoVar = (hko) obj2;
                yjo yjoVar = (yjo) this.b;
                wjo wjoVar = (wjo) this.e;
                tqw tqwVar9 = (tqw) this.d;
                byte b10 = this.c;
                if (b10 != 0) {
                    if (b10 == 1 || b10 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                int iOrdinal2 = wjoVar.ordinal();
                if (iOrdinal2 == 0) {
                    kko kkoVar = hkoVar.d;
                    String str12 = yjoVar.c;
                    tv80 tv80VarY3 = tqwVar9 != null ? n3o1.y(tqwVar9) : null;
                    this.b = null;
                    this.e = null;
                    this.d = null;
                    this.c = (byte) 1;
                    if (kkoVar.b(str12, tv80VarY3, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (iOrdinal2 != 1) {
                        eg.o();
                        return null;
                    }
                    ijr ijrVar = hkoVar.b;
                    String str13 = yjoVar.c;
                    String str14 = yjoVar.b;
                    this.b = null;
                    this.e = null;
                    this.d = null;
                    this.c = (byte) 2;
                    if (ijrVar.f(str13, str14, this) == d9nVar) {
                        return d9nVar;
                    }
                }
                return rih1Var;
            case 9:
                f1n0 f1n0Var2 = (f1n0) ((el9) obj2).g;
                d5w d5wVar = (d5w) this.b;
                a5w a5wVar = (c5w) this.e;
                tqw tqwVar10 = (tqw) this.d;
                byte b11 = this.c;
                if (b11 != 0) {
                    if (b11 == 1 || b11 == 2 || b11 == 3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                tv80 tv80VarD4 = cvl1.d(tqwVar10);
                if (a5wVar instanceof a5w) {
                    String str15 = a5wVar.a;
                    this.b = null;
                    this.e = null;
                    this.d = null;
                    this.c = (byte) 1;
                    if (f1n0.f(f1n0Var2, str15, tv80VarD4, this) == d9nVar) {
                        return d9nVar;
                    }
                } else if (u890.j(a5wVar, z4w.a)) {
                    Set set2 = s4b1.f;
                    String strZ2 = uic.x("spotify:playlist-participants:".concat(uic.x(d5wVar.a).h())).z();
                    if (strZ2 != null) {
                        this.b = null;
                        this.e = null;
                        this.d = null;
                        this.c = (byte) 2;
                        if (f1n0.f(f1n0Var2, strZ2, tv80VarD4, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (!(a5wVar instanceof b5w)) {
                        eg.o();
                        return null;
                    }
                    Set set3 = s4b1.f;
                    String string = new Uri.Builder().encodedPath("spotify:internal:playlist-editors-picker:".concat(uic.x(d5wVar.a).h())).appendQueryParameter("editor_usernames", nfa0.d.b(new r36(chc1.a, (byte) 0), ((b5w) a5wVar).a)).build().toString();
                    this.b = null;
                    this.e = null;
                    this.d = null;
                    this.c = (byte) 3;
                    if (f1n0.f(f1n0Var2, string, tv80VarD4, this) == d9nVar) {
                        return d9nVar;
                    }
                }
                return rih1Var;
            case 10:
                sd41 sd41Var3 = (sd41) ((ng20) obj2).b;
                o330 o330Var = (o330) this.b;
                v330 v330Var = (v330) this.e;
                l330 l330Var = (l330) this.d;
                byte b12 = this.c;
                if (b12 != 0) {
                    if (b12 == 1 || b12 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (u890.j(l330Var, l330.a)) {
                    if (u890.j(v330Var, r330.a)) {
                        Completable completableA3 = sd41.a(sd41Var3, o330Var.a, (tv80) null, 6);
                        this.b = null;
                        this.e = null;
                        this.d = null;
                        this.c = (byte) 1;
                        if (fc11.i(completableA3, this) == d9nVar) {
                            return d9nVar;
                        }
                    } else if (u890.j(v330Var, u330.a)) {
                        Completable completableB3 = sd41.b(sd41Var3, o330Var.a, (tv80) null, 6);
                        this.b = null;
                        this.e = null;
                        this.d = null;
                        this.c = (byte) 2;
                        if (fc11.i(completableB3, this) == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        eg.o();
                    }
                    return rih1Var;
                }
                eg.o();
                return null;
            case 11:
                jvu jvuVar = (jvu) obj2;
                k430 k430Var = (k430) this.b;
                r430 r430Var = (r430) this.e;
                tqw tqwVar11 = (tqw) this.d;
                byte b13 = this.c;
                if (b13 != 0) {
                    if (b13 == 1 || b13 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                tv80 tv80VarY4 = tqwVar11 != null ? n3o1.y(tqwVar11) : null;
                if (u890.j(r430Var, p430.a)) {
                    this.b = null;
                    this.e = null;
                    this.d = null;
                    this.c = (byte) 1;
                    if (jvuVar.J(k430Var, b530.a, tv80VarY4, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!(r430Var instanceof q430)) {
                        eg.o();
                        return null;
                    }
                    if (((q430) r430Var).a) {
                        this.b = null;
                        this.e = null;
                        this.d = null;
                        this.c = (byte) 2;
                        if (jvuVar.J(k430Var, c530.a, tv80VarY4, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                }
                return rih1Var;
            case 12:
                ccc0 ccc0Var = ((h730) obj2).b;
                d730 d730Var = (d730) this.b;
                b730 b730Var = (b730) this.e;
                tqw tqwVar12 = (tqw) this.d;
                byte b14 = this.c;
                if (b14 == 0) {
                    hm5.M(obj);
                    ubc0 ubc0Var = tqwVar12 != null ? new ubc0(n3o1.y(tqwVar12)) : null;
                    if (u890.j(b730Var, z630.a)) {
                        String str16 = d730Var.a;
                        this.b = null;
                        this.e = null;
                        this.d = null;
                        this.c = (byte) 1;
                        objB = ccc0.b(ccc0Var, str16, false, ubc0Var, this, 2);
                        if (objB == d9nVar) {
                            return d9nVar;
                        }
                        ((Boolean) objB).getClass();
                    } else {
                        if (!u890.j(b730Var, a730.a)) {
                            eg.o();
                            return null;
                        }
                        String str17 = d730Var.a;
                        this.b = null;
                        this.e = null;
                        this.d = null;
                        this.c = (byte) 2;
                        objH = ccc0.h(ccc0Var, str17, ubc0Var, this, 2);
                        if (objH == d9nVar) {
                            return d9nVar;
                        }
                        ((Boolean) objH).getClass();
                    }
                } else if (b14 == 1) {
                    hm5.M(obj);
                    objB = obj;
                    ((Boolean) objB).getClass();
                } else {
                    if (b14 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objH = obj;
                    ((Boolean) objH).getClass();
                }
                return rih1Var;
            case 13:
                jx90 jx90Var = (lx90) this.b;
                bx90 bx90Var = (dx90) this.e;
                tqw tqwVar13 = (tqw) this.d;
                byte b15 = this.c;
                if (b15 != 0) {
                    if (b15 == 1 || b15 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                jx90 jx90Var2 = jx90Var instanceof jx90 ? jx90Var : null;
                if (jx90Var2 != null && (pp90VarB = jx90Var2.b()) != null) {
                    xw90 xw90Var = (xw90) obj2;
                    tq90 tq90Var = xw90Var.d;
                    if (bx90Var instanceof zw90) {
                        if (xw90Var.g.a() != null) {
                            j5a1 j5a1Var = xw90Var.e;
                            this.b = null;
                            this.e = null;
                            this.d = null;
                            this.c = (byte) 1;
                            Object objA4 = j5a1Var.b.a(this);
                            if (objA4 != d9nVar) {
                                objA4 = rih1Var;
                            }
                            if (objA4 == d9nVar) {
                                return d9nVar;
                            }
                        }
                    } else if (bx90Var instanceof bx90) {
                        t0a0 t0a0Var = xw90Var.c;
                        String str18 = bx90Var.a;
                        this.b = null;
                        this.e = null;
                        this.d = null;
                        this.c = (byte) 2;
                        if (t0a0Var.a(pp90VarB, str18, this) == d9nVar) {
                            return d9nVar;
                        }
                    } else if (bx90Var instanceof yw90) {
                        tq90Var.a(pp90VarB, hr90.c);
                    } else if (bx90Var instanceof cx90) {
                        xw90Var.f.a.a((tqwVar13 == null || (ou80Var2 = n3o1.y(tqwVar13).a) == null) ? null : ou80Var2.a, nik1.u5.a, (Bundle) null);
                    } else {
                        if (!(bx90Var instanceof ax90)) {
                            eg.o();
                            return null;
                        }
                        tq90Var.a(pp90VarB, hr90.N0);
                    }
                }
                return rih1Var;
            case 14:
                yt11 yt11Var = ((mbc0) obj2).f;
                unb1 unb1Var = (unb1) this.b;
                fe00 fe00Var = (fe00) this.e;
                tqw tqwVar14 = (tqw) this.d;
                byte b16 = this.c;
                if (b16 == 0) {
                    hm5.M(obj);
                    if (u890.j(fe00Var, be00.a)) {
                        tv80 tv80VarY5 = tqwVar14 != null ? n3o1.y(tqwVar14) : null;
                        this.b = null;
                        this.e = null;
                        this.d = null;
                        this.c = (byte) 1;
                        if (yt11Var.a(unb1Var, tv80VarY5, this) == d9nVar) {
                            return d9nVar;
                        }
                    } else if (u890.j(fe00Var, ce00.a)) {
                        tv80 tv80VarY6 = tqwVar14 != null ? n3o1.y(tqwVar14) : null;
                        this.b = null;
                        this.e = null;
                        this.d = null;
                        this.c = (byte) 2;
                        if (yt11Var.c(unb1Var, tv80VarY6, this) == d9nVar) {
                            return d9nVar;
                        }
                    } else if (u890.j(fe00Var, zd00.a)) {
                        tv80 tv80VarY7 = tqwVar14 != null ? n3o1.y(tqwVar14) : null;
                        this.b = null;
                        this.e = null;
                        this.d = null;
                        this.c = (byte) 3;
                        if (yt11Var.a(unb1Var, tv80VarY7, this) == d9nVar) {
                            return d9nVar;
                        }
                    } else if (u890.j(fe00Var, ae00.a)) {
                        tv80 tv80VarY8 = tqwVar14 != null ? n3o1.y(tqwVar14) : null;
                        this.b = null;
                        this.e = null;
                        this.d = null;
                        this.c = (byte) 4;
                        if (yt11Var.c(unb1Var, tv80VarY8, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (b16 != 1 && b16 != 2 && b16 != 3 && b16 != 4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            case 15:
                return e(obj);
            case 16:
                return g(obj);
            case 17:
                return h(obj);
            case 18:
                return i(obj);
            case 19:
                return j(obj);
            case 20:
                et90 et90Var = (et90) obj2;
                bd61 bd61Var = (bd61) this.b;
                zc61 zc61Var = (zc61) this.e;
                tqw tqwVar15 = (tqw) this.d;
                byte b17 = this.c;
                if (b17 != 0) {
                    if (b17 == 1 || b17 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ou80 ou80Var3 = cvl1.d(tqwVar15).a;
                int iOrdinal3 = zc61Var.ordinal();
                if (iOrdinal3 == 0) {
                    String str19 = bd61Var.b;
                    this.b = null;
                    this.e = null;
                    this.d = null;
                    this.c = (byte) 1;
                    if (et90Var.n(bd61Var, str19, ou80Var3, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (iOrdinal3 != 1) {
                        eg.o();
                        return null;
                    }
                    this.b = null;
                    this.e = null;
                    this.d = null;
                    this.c = (byte) 2;
                    if (et90Var.n(bd61Var, "session-control-reset", ou80Var3, this) == d9nVar) {
                        return d9nVar;
                    }
                }
                return rih1Var;
            default:
                ldk0 ldk0Var = ((skg1) obj2).c;
                nkg1 nkg1Var = (nkg1) this.b;
                okg1 okg1Var = (okg1) this.e;
                mkg1 mkg1Var = (mkg1) this.d;
                byte b18 = this.c;
                if (b18 == 0) {
                    hm5.M(obj);
                    if (!(mkg1Var instanceof mkg1)) {
                        eg.o();
                        return null;
                    }
                    if (mkg1Var.a) {
                        this.b = null;
                        this.e = null;
                        this.d = null;
                        this.c = (byte) 1;
                        if (ldk0Var.h(this) == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        lhg1 lhg1Var = okg1Var.a;
                        if (lhg1Var != null) {
                            String str20 = okg1Var.b;
                            this.b = nkg1Var;
                            this.e = null;
                            this.d = null;
                            this.c = (byte) 2;
                            if (cdk0.a(ldk0Var, lhg1Var, str20, this) == d9nVar) {
                                return d9nVar;
                            }
                            nkg1Var.c.invoke();
                        }
                    }
                } else if (b18 == 1) {
                    hm5.M(obj);
                } else {
                    if (b18 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    nkg1Var.c.invoke();
                }
                return rih1Var;
        }
    }
}
