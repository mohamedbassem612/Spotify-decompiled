package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.player.model.PlayerState;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import com.spotify.wrapped.v1.proto.StoryCard;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class us0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public Object c;
    public Object d;
    public Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ us0(Object obj, Object obj2, Object obj3, Object obj4, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.d = obj2;
        this.c = obj3;
        this.f = obj4;
    }

    private final Object e(Object obj) {
        owl owlVar = (owl) this.e;
        uwl uwlVar = (uwl) this.d;
        byte b = this.b;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            em0 em0Var = (em0) uwlVar.f;
            String str = owlVar.a;
            this.b = (byte) 1;
            if (em0Var.E(str, this) != d9nVar) {
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
        mr20 mr20Var = (mr20) ((em0) uwlVar.f).i;
        ur1 ur1Var = new ur1((iu30) this.c, uwlVar, owlVar, (tob1) this.f, (lnm) null, (byte) 11);
        this.b = (byte) 2;
        Object objCollect = mr20Var.collect(new eu20(kfo0.a, ur1Var, (byte) 1), this);
        if (objCollect != d9nVar) {
            objCollect = rih1Var;
        }
        if (objCollect != d9nVar) {
            objCollect = rih1Var;
        }
        return objCollect == d9nVar ? d9nVar : rih1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r0.emit(r7, r6) == r5) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object g(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.c
            p.vr20 r0 = (p.vr20) r0
            byte r1 = r6.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L23
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L15
            p.hm5.M(r7)
            goto L50
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L1b:
            java.lang.Object r0 = r6.d
            p.vr20 r0 = (p.vr20) r0
            p.hm5.M(r7)
            goto L43
        L23:
            p.hm5.M(r7)
            java.lang.Object r7 = r6.e
            p.tdm r7 = (p.tdm) r7
            p.kly0 r7 = r7.a
            java.lang.Object r7 = r7.get()
            p.zy91 r7 = (p.zy91) r7
            java.lang.Object r1 = r6.f
            p.zim r1 = (p.zim) r1
            r6.c = r4
            r6.d = r0
            r6.b = r3
            java.lang.Object r7 = r7.a(r1, r6)
            if (r7 != r5) goto L43
            goto L4f
        L43:
            r6.c = r4
            r6.d = r4
            r6.b = r2
            java.lang.Object r6 = r0.emit(r7, r6)
            if (r6 != r5) goto L50
        L4f:
            return r5
        L50:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.us0.g(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (r0.emit(r7, r6) == r5) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object h(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.c
            p.vr20 r0 = (p.vr20) r0
            byte r1 = r6.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L23
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L15
            p.hm5.M(r7)
            goto L52
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L1b:
            java.lang.Object r0 = r6.d
            p.vr20 r0 = (p.vr20) r0
            p.hm5.M(r7)
            goto L45
        L23:
            p.hm5.M(r7)
            java.lang.Object r7 = r6.e
            p.kly0 r7 = (p.kly0) r7
            java.lang.Object r7 = r7.get()
            p.sdm r7 = (p.sdm) r7
            java.lang.Object r1 = r6.f
            p.him r1 = (p.him) r1
            p.mim r1 = r1.f
            p.oim r1 = r1.b
            r6.c = r4
            r6.d = r0
            r6.b = r3
            java.lang.Object r7 = r7.a(r1, r6)
            if (r7 != r5) goto L45
            goto L51
        L45:
            r6.c = r4
            r6.d = r4
            r6.b = r2
            java.lang.Object r6 = r0.emit(r7, r6)
            if (r6 != r5) goto L52
        L51:
            return r5
        L52:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.us0.h(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0086  */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        if (r5.emit(r10, r9) == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c2, code lost:
    
        if (p.smo1.s(r1, r9) == r0) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object i(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.us0.i(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        if (r0.emit(r7, r6) == r5) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object j(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.c
            p.vr20 r0 = (p.vr20) r0
            byte r1 = r6.b
            r2 = 2
            r3 = 0
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L23
            if (r1 == r4) goto L1b
            if (r1 != r2) goto L15
            p.hm5.M(r7)
            goto L53
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r3
        L1b:
            java.lang.Object r0 = r6.d
            p.vr20 r0 = (p.vr20) r0
            p.hm5.M(r7)
            goto L3b
        L23:
            p.hm5.M(r7)
            java.lang.Object r7 = r6.e
            p.xlo r7 = (p.xlo) r7
            java.lang.Object r1 = r6.f
            java.lang.String r1 = (java.lang.String) r1
            r6.c = r3
            r6.d = r0
            r6.b = r4
            java.lang.Object r7 = r7.a(r1, r6)
            if (r7 != r5) goto L3b
            goto L52
        L3b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r7 = r7 ^ r4
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r6.c = r3
            r6.d = r3
            r6.b = r2
            java.lang.Object r6 = r0.emit(r7, r6)
            if (r6 != r5) goto L53
        L52:
            return r5
        L53:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.us0.j(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if (p.l4p1.s(r0, r7, r6) == r5) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object m(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.c
            p.vr20 r0 = (p.vr20) r0
            byte r1 = r6.b
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L15
            p.hm5.M(r7)
            goto L47
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r2
        L1b:
            p.hm5.M(r7)
            goto L38
        L1f:
            p.hm5.M(r7)
            p.dbr r7 = new p.dbr
            java.lang.Object r1 = r6.d
            if (r1 != 0) goto L2a
            java.lang.Object r1 = r6.e
        L2a:
            r7.<init>(r1)
            r6.c = r0
            r6.b = r4
            java.lang.Object r7 = r0.emit(r7, r6)
            if (r7 != r5) goto L38
            goto L46
        L38:
            java.lang.Object r7 = r6.f
            p.mr20 r7 = (p.mr20) r7
            r6.c = r2
            r6.b = r3
            java.lang.Object r6 = p.l4p1.s(r0, r7, r6)
            if (r6 != r5) goto L47
        L46:
            return r5
        L47:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.us0.m(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        if (r9 == r5) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        if (r0.emit(r1, r8) == r5) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object o(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.c
            p.vr20 r0 = (p.vr20) r0
            byte r1 = r8.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L23
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L15
            p.hm5.M(r9)
            goto L69
        L15:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r4
        L1b:
            java.lang.Object r0 = r8.d
            p.vr20 r0 = (p.vr20) r0
            p.hm5.M(r9)
            goto L59
        L23:
            p.hm5.M(r9)
            java.lang.Object r9 = r8.e
            p.ils r9 = (p.ils) r9
            java.lang.String r9 = r9.a
            java.util.Set r1 = p.s4b1.f
            p.s4b1 r1 = p.uic.x(r9)
            p.blc0 r1 = r1.c
            int r6 = r1.ordinal()
            r7 = 844(0x34c, float:1.183E-42)
            if (r6 == r7) goto L48
            r7 = 926(0x39e, float:1.298E-42)
            if (r6 == r7) goto L48
            p.mmr0 r1 = new p.mmr0
            p.fls r3 = p.fls.a
            r1.<init>(r3, r9)
            goto L5c
        L48:
            java.lang.Object r6 = r8.f
            p.ams r6 = (p.ams) r6
            r8.c = r4
            r8.d = r0
            r8.b = r3
            java.io.Serializable r9 = r6.k(r9, r1, r8)
            if (r9 != r5) goto L59
            goto L68
        L59:
            r1 = r9
            p.mmr0 r1 = (p.mmr0) r1
        L5c:
            r8.c = r4
            r8.d = r4
            r8.b = r2
            java.lang.Object r8 = r0.emit(r1, r8)
            if (r8 != r5) goto L69
        L68:
            return r5
        L69:
            p.rih1 r8 = p.rih1.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.us0.o(java.lang.Object):java.lang.Object");
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.f;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                us0 us0Var = new us0((ws0) obj2, lnmVar);
                us0Var.c = obj;
                return us0Var;
            case 1:
                us0 us0Var2 = new us0((bv40) this.e, (String) obj2, lnmVar, (byte) 1);
                us0Var2.c = obj;
                return us0Var2;
            case 2:
                us0 us0Var3 = new us0((SceneTemplate.ArtistCardsContent.Card1) this.e, (be6) obj2, lnmVar, (byte) 2);
                us0Var3.d = obj;
                return us0Var3;
            case 3:
                us0 us0Var4 = new us0((q98) this.e, (PlayerState) obj2, lnmVar, (byte) 3);
                us0Var4.c = obj;
                return us0Var4;
            case 4:
                us0 us0Var5 = new us0((SceneTemplate.AudiobooksContent.Card2) this.e, (se8) obj2, lnmVar, (byte) 4);
                us0Var5.d = obj;
                return us0Var5;
            case 5:
                us0 us0Var6 = new us0((rm9) this.d, (sh61) this.e, (String) obj2, lnmVar, (byte) 5);
                us0Var6.c = obj;
                return us0Var6;
            case 6:
                us0 us0Var7 = new us0((it8) this.e, (String) obj2, lnmVar, (byte) 6);
                us0Var7.c = obj;
                return us0Var7;
            case 7:
                us0 us0Var8 = new us0((vu30) this.d, (Set) this.e, (vu30) obj2, lnmVar, (byte) 7);
                us0Var8.c = obj;
                return us0Var8;
            case 8:
                return new us0((SceneTemplate.BespokeListeningAgeContent.Card2) this.e, (s2t) this.d, (g7m1) this.c, (qla) obj2, lnmVar, (byte) 8);
            case 9:
                us0 us0Var9 = new us0((SceneTemplate.BespokeListeningAgeContent.Card2) this.e, (qla) obj2, lnmVar, (byte) 9);
                us0Var9.d = obj;
                return us0Var9;
            case 10:
                return new us0((zqg0) this.d, (pmb) this.e, (String) this.c, (String) obj2, lnmVar, (byte) 10, false);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                us0 us0Var10 = new us0((cnb) this.e, (bnb) obj2, lnmVar, (byte) 11);
                us0Var10.c = obj;
                return us0Var10;
            case grn1.d /* 12 */:
                us0 us0Var11 = new us0((p4c) this.d, (a5c) this.e, (i) obj2, lnmVar, (byte) 12);
                us0Var11.c = obj;
                return us0Var11;
            case 13:
                return new us0((l2t) this.e, (ven0) this.d, (tym0) this.c, (x5d) obj2, lnmVar, (byte) 13);
            case 14:
                us0 us0Var12 = new us0((pcd) this.e, (nx) obj2, lnmVar, (byte) 14);
                us0Var12.c = obj;
                return us0Var12;
            case 15:
                us0 us0Var13 = new us0((tte) this.e, (ute) obj2, lnmVar, (byte) 15);
                us0Var13.c = obj;
                return us0Var13;
            case 16:
                return new us0((ewe) this.d, (tbr0) this.e, (ven0) this.c, (ven0) obj2, lnmVar, (byte) 16, false);
            case 17:
                us0 us0Var14 = new us0((g7m1) this.e, (cfg) obj2, lnmVar, (byte) 17);
                us0Var14.d = obj;
                return us0Var14;
            case 18:
                us0 us0Var15 = new us0((StoryCard) this.e, (cfg) obj2, lnmVar, (byte) 18);
                us0Var15.d = obj;
                return us0Var15;
            case 19:
                return new us0((v0h) this.d, (z0h) this.e, (String) this.c, (ubc0) obj2, lnmVar, (byte) 19, false);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                us0 us0Var16 = new us0((rm5) this.d, (z6k) this.e, (xrk) obj2, lnmVar, (byte) 20);
                us0Var16.c = obj;
                return us0Var16;
            case 21:
                us0 us0Var17 = new us0((cfd) this.e, (String) obj2, lnmVar, (byte) 21);
                us0Var17.c = obj;
                return us0Var17;
            case 22:
                return new us0((uwl) this.d, (owl) this.e, (iu30) this.c, (tob1) obj2, lnmVar, (byte) 22, false);
            case 23:
                us0 us0Var18 = new us0((tdm) this.e, (zim) obj2, lnmVar, (byte) 23);
                us0Var18.c = obj;
                return us0Var18;
            case 24:
                us0 us0Var19 = new us0((kly0) this.e, (him) obj2, lnmVar, (byte) 24);
                us0Var19.c = obj;
                return us0Var19;
            case 25:
                us0 us0Var20 = new us0((cco) this.e, (kbo) obj2, lnmVar, (byte) 25);
                us0Var20.c = obj;
                return us0Var20;
            case 26:
                us0 us0Var21 = new us0((xlo) this.e, (String) obj2, lnmVar, (byte) 26);
                us0Var21.c = obj;
                return us0Var21;
            case 27:
                us0 us0Var22 = new us0(this.d, this.e, (mr20) obj2, lnmVar, (byte) 27);
                us0Var22.c = obj;
                return us0Var22;
            case 28:
                us0 us0Var23 = new us0((ils) this.e, (ams) obj2, lnmVar, (byte) 28);
                us0Var23.c = obj;
                return us0Var23;
            default:
                us0 us0Var24 = new us0((mxr) this.e, (y6t) obj2, lnmVar, (byte) 29);
                us0Var24.c = obj;
                return us0Var24;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((ni31) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((ni31) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((ni31) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case grn1.d /* 12 */:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 17:
                return create((ni31) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 18:
                return create((ni31) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 19:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:419:0x0855  */
    /* JADX WARN: Code duplicated, block: B:422:0x0864  */
    /* JADX WARN: Code duplicated, block: B:474:0x099a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:423:0x0872 -> B:419:0x0855). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 2552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.us0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ us0(Object obj, Object obj2, Object obj3, Object obj4, lnm lnmVar, byte b, boolean z) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
        this.f = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ us0(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ us0(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.f = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us0(ws0 ws0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 0;
        this.f = ws0Var;
    }
}
