package p;

import android.content.Intent;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessagePresentationStatus;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lqv extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public /* synthetic */ Object d;
    public Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lqv(jkr0 jkr0Var, iu30 iu30Var, hdn0 hdn0Var, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 25;
        this.c = jkr0Var;
        this.e = iu30Var;
        this.d = hdn0Var;
        this.f = ven0Var;
    }

    private final Object e(Object obj) {
        nbm1 nbm1Var;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            nbm1 nbm1Var2 = (nbm1) this.d;
            o860 o860Var = (o860) this.e;
            String str = (String) this.f;
            this.c = nbm1Var2;
            this.b = true;
            Object objJ = o860Var.j(nbm1Var2, str, this);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
            obj = objJ;
            nbm1Var = nbm1Var2;
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            nbm1Var = (nbm1) this.c;
            hm5.M(obj);
        }
        return new mmr0(nbm1Var, obj);
    }

    private final Object g(Object obj) {
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            s680 s680Var = (s680) this.c;
            Intent intent = (Intent) this.d;
            String str = (String) this.f;
            String str2 = (String) this.e;
            this.b = true;
            Object objC = s680Var.c(intent, str, str2, this);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.f;
        switch (b) {
            case 0:
                return new lqv(this.c, this.d, this.e, obj2, lnmVar, (byte) 0);
            case 1:
                lqv lqvVar = new lqv(this.e, obj2, lnmVar, (byte) 1);
                lqvVar.d = obj;
                return lqvVar;
            case 2:
                return new lqv(this.c, this.d, this.e, obj2, lnmVar, (byte) 2);
            case 3:
                return new lqv((xtb0) this.d, this.c, this.e, (ven0) obj2, lnmVar, (byte) 3);
            case 4:
                lqv lqvVar2 = new lqv(this.d, this.e, obj2, lnmVar, (byte) 4);
                lqvVar2.c = obj;
                return lqvVar2;
            case 5:
                return new lqv(this.c, this.d, this.e, obj2, lnmVar, (byte) 5);
            case 6:
                return new lqv(this.c, this.d, (String) obj2, (String) this.e, lnmVar, (byte) 6);
            case 7:
                lqv lqvVar3 = new lqv(this.d, obj2, this.e, false, lnmVar, (byte) 7);
                lqvVar3.c = obj;
                return lqvVar3;
            case 8:
                lqv lqvVar4 = new lqv(this.d, this.e, obj2, lnmVar, (byte) 8);
                lqvVar4.c = obj;
                return lqvVar4;
            case 9:
                lqv lqvVar5 = new lqv((is20) this.d, lnmVar, (js20) this.e, obj2);
                lqvVar5.c = obj;
                return lqvVar5;
            case 10:
                lqv lqvVar6 = new lqv(this.d, this.e, obj2, lnmVar, (byte) 10);
                lqvVar6.c = obj;
                return lqvVar6;
            case 11:
                lqv lqvVar7 = new lqv(this.e, obj2, lnmVar, (byte) 11);
                lqvVar7.d = ((qge) obj).a;
                return lqvVar7;
            case 12:
                lqv lqvVar8 = new lqv(this.e, obj2, lnmVar, (byte) 12);
                lqvVar8.d = obj;
                return lqvVar8;
            case 13:
                lqv lqvVar9 = new lqv(this.d, this.e, this.f, lnmVar, (byte) 13);
                lqvVar9.c = obj;
                return lqvVar9;
            case 14:
                lqv lqvVar10 = new lqv(this.e, obj2, lnmVar, (byte) 14);
                lqvVar10.d = obj;
                return lqvVar10;
            case 15:
                return new lqv(this.c, this.d, obj2, lnmVar, (byte) 15, (byte) 0);
            case 16:
                return new lqv(this.c, this.d, obj2, lnmVar, (byte) 16, (byte) 0);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new lqv(this.d, obj2, this.e, false, lnmVar, (byte) 17);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                lqv lqvVar11 = new lqv(this.d, this.e, obj2, lnmVar, (byte) 18);
                lqvVar11.c = obj;
                return lqvVar11;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                lqv lqvVar12 = new lqv(this.d, this.e, obj2, lnmVar, (byte) 19);
                lqvVar12.c = obj;
                return lqvVar12;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                lqv lqvVar13 = new lqv(this.d, this.e, obj2, lnmVar, (byte) 20);
                lqvVar13.c = obj;
                return lqvVar13;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new lqv((xtb0) this.d, this.c, this.e, (ven0) obj2, lnmVar, (byte) 21);
            case 22:
                lqv lqvVar14 = new lqv(this.d, this.e, obj2, lnmVar, (byte) 22);
                lqvVar14.c = obj;
                return lqvVar14;
            case 23:
                return new lqv(this.c, this.d, this.e, obj2, lnmVar, (byte) 23);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                lqv lqvVar15 = new lqv(this.d, this.e, obj2, lnmVar, (byte) 24);
                lqvVar15.c = obj;
                return lqvVar15;
            case 25:
                return new lqv((jkr0) this.c, (iu30) this.e, (hdn0) this.d, (ven0) obj2, lnmVar);
            case 26:
                return new lqv(this.d, this.e, obj2, lnmVar, (byte) 26);
            case 27:
                return new lqv(this.d, this.e, obj2, lnmVar, (byte) 27);
            case 28:
                return new lqv(this.c, this.d, (String) obj2, (String) this.e, lnmVar, (byte) 28);
            default:
                lqv lqvVar16 = new lqv(this.e, obj2, lnmVar, (byte) 29);
                lqvVar16.d = obj;
                return lqvVar16;
        }
    }

    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((nsw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9n.a;
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                Object obj3 = ((qge) obj).a;
                lqv lqvVar = new lqv(this.e, this.f, (lnm) obj2, (byte) 11);
                lqvVar.d = obj3;
                return lqvVar.invokeSuspend(rih1Var);
            case 12:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((cy71) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return create((MessagePresentationStatus) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((Boolean) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((nsw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    /* JADX WARN: Code duplicated, block: B:251:0x0550  */
    /* JADX WARN: Code duplicated, block: B:254:0x055a  */
    /* JADX WARN: Code duplicated, block: B:399:0x07cc A[ADDED_TO_REGION, LOOP:5: B:399:0x07cc->B:400:0x07ce, LOOP_START, PHI: r11
      0x07cc: PHI (r11v5 int) = (r11v9 int), (r11v6 int) binds: [B:398:0x07ca, B:400:0x07ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:400:0x07ce A[LOOP:5: B:399:0x07cc->B:400:0x07ce, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:402:0x07d8 A[Catch: all -> 0x07c5, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x07c5, blocks: (B:388:0x07a5, B:389:0x07af, B:391:0x07b5, B:397:0x07c8, B:402:0x07d8), top: B:500:0x07a5 }] */
    /* JADX WARN: Code duplicated, block: B:404:0x07ed A[LOOP:6: B:403:0x07eb->B:404:0x07ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:491:0x0a57  */
    /* JADX WARN: Code duplicated, block: B:493:0x0a65  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v8 java.lang.Object, still in use, count: 2, list:
          (r10v8 java.lang.Object) from 0x07c8: PHI (r10 I:??) = (r10v5 java.lang.Object), (r10v8 java.lang.Object) binds: [B:396:0x07c7, B:393:0x07c4] A[DONT_GENERATE, DONT_INLINE]
          (r10v8 java.lang.Object) from 0x07ba: CHECK_CAST (p.wjl) (r10v8 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2738
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.lqv.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lqv(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lqv(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b, byte b2) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.f = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lqv(Object obj, Object obj2, Object obj3, boolean z, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.f = obj2;
        this.e = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lqv(Object obj, Object obj2, String str, String str2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.f = str;
        this.e = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lqv(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.f = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lqv(is20 is20Var, lnm lnmVar, js20 js20Var, Object obj) {
        super(2, lnmVar);
        this.a = (byte) 9;
        this.d = is20Var;
        this.e = js20Var;
        this.f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lqv(xtb0 xtb0Var, Object obj, Object obj2, ven0 ven0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = xtb0Var;
        this.c = obj;
        this.e = obj2;
        this.f = ven0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lqv(Object obj, Object obj2, Object obj3, Object obj4, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }
}
