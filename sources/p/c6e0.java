package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c6e0 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6e0(qfr0 qfr0Var, y6h1 y6h1Var, String str, lnm lnmVar) {
        super(3, lnmVar);
        this.a = (byte) 7;
        this.d = qfr0Var;
        this.f = y6h1Var;
        this.e = str;
    }

    private final Object e(Object obj) {
        mr20 huzVar;
        vr20 vr20Var = (vr20) this.c;
        Object obj2 = this.d;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            hfu0 hfu0Var = (hfu0) obj2;
            if (hfu0Var != null) {
                wyf1 wyf1Var = (wyf1) this.f;
                huzVar = wyf1Var.e.a(wyf1Var.f, (String) this.e, hfu0Var.a);
            } else {
                huzVar = new huz(Boolean.FALSE, (byte) 10);
            }
            this.c = null;
            this.d = null;
            this.b = true;
            Object objS = l4p1.s(vr20Var, huzVar, this);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
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

    private final Object g(Object obj) {
        a1b1 x010Var;
        String str = (String) this.e;
        tag1 tag1Var = (tag1) this.f;
        vr20 vr20Var = (vr20) this.c;
        Object obj2 = this.d;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            kng1 kng1Var = (kng1) obj2;
            if (kng1Var instanceof ing1) {
                x010Var = new a1b1(tag1Var.a(str), kng1Var, (byte) 16);
            } else {
                if (!(kng1Var instanceof jng1)) {
                    eg.o();
                    return null;
                }
                x010Var = new x010(rqt0.u(eth.t(tag1Var.a, r6x.a, new rzf1(str, tag1Var.b, (byte) 2))), tag1Var.a(str), new hpp0(3, null, (byte) 3), (byte) 1);
            }
            this.c = null;
            this.d = null;
            this.b = true;
            Object objS = l4p1.s(vr20Var, x010Var, this);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
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

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.e;
        Object obj5 = this.f;
        switch (b) {
            case 0:
                c6e0 c6e0Var = new c6e0((lnm) obj3, obj4, obj5, (byte) 0);
                c6e0Var.c = (vr20) obj;
                c6e0Var.d = obj2;
                return c6e0Var.invokeSuspend(rih1Var);
            case 1:
                c6e0 c6e0Var2 = new c6e0((lnm) obj3, obj4, obj5, (byte) 1);
                c6e0Var2.c = (vr20) obj;
                c6e0Var2.d = obj2;
                return c6e0Var2.invokeSuspend(rih1Var);
            case 2:
                c6e0 c6e0Var3 = new c6e0((lnm) obj3, obj4, obj5, (byte) 2);
                c6e0Var3.c = (vr20) obj;
                c6e0Var3.d = obj2;
                return c6e0Var3.invokeSuspend(rih1Var);
            case 3:
                c6e0 c6e0Var4 = new c6e0((lnm) obj3, obj4, obj5, (byte) 3);
                c6e0Var4.c = (vr20) obj;
                c6e0Var4.d = obj2;
                return c6e0Var4.invokeSuspend(rih1Var);
            case 4:
                c6e0 c6e0Var5 = new c6e0((lnm) obj3, obj4, obj5, (byte) 4);
                c6e0Var5.c = (vr20) obj;
                c6e0Var5.d = obj2;
                return c6e0Var5.invokeSuspend(rih1Var);
            case 5:
                c6e0 c6e0Var6 = new c6e0((lnm) obj3, obj4, obj5, (byte) 5);
                c6e0Var6.c = (vr20) obj;
                c6e0Var6.d = (Object[]) obj2;
                return c6e0Var6.invokeSuspend(rih1Var);
            case 6:
                c6e0 c6e0Var7 = new c6e0((lnm) obj3, obj4, obj5, (byte) 6);
                c6e0Var7.c = (vr20) obj;
                c6e0Var7.d = obj2;
                return c6e0Var7.invokeSuspend(rih1Var);
            case 7:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                c6e0 c6e0Var8 = new c6e0((qfr0) this.d, (y6h1) obj5, (String) obj4, (lnm) obj3);
                c6e0Var8.b = zBooleanValue;
                c6e0Var8.c = (List) obj2;
                return c6e0Var8.invokeSuspend(rih1Var);
            case 8:
                c6e0 c6e0Var9 = new c6e0((lnm) obj3, obj4, obj5, (byte) 8);
                c6e0Var9.c = (vr20) obj;
                c6e0Var9.d = obj2;
                return c6e0Var9.invokeSuspend(rih1Var);
            case 9:
                c6e0 c6e0Var10 = new c6e0((lnm) obj3, obj4, obj5, (byte) 9);
                c6e0Var10.c = (vr20) obj;
                c6e0Var10.d = obj2;
                return c6e0Var10.invokeSuspend(rih1Var);
            case 10:
                c6e0 c6e0Var11 = new c6e0((lnm) obj3, obj4, obj5, (byte) 10);
                c6e0Var11.c = (vr20) obj;
                c6e0Var11.d = obj2;
                return c6e0Var11.invokeSuspend(rih1Var);
            case 11:
                c6e0 c6e0Var12 = new c6e0((lnm) obj3, obj4, obj5, (byte) 11);
                c6e0Var12.c = (vr20) obj;
                c6e0Var12.d = obj2;
                return c6e0Var12.invokeSuspend(rih1Var);
            case 12:
                c6e0 c6e0Var13 = new c6e0((byte) 12, (opv0) obj5, (String) obj4, (lnm) obj3);
                c6e0Var13.c = (vr20) obj;
                c6e0Var13.d = obj2;
                return c6e0Var13.invokeSuspend(rih1Var);
            case 13:
                c6e0 c6e0Var14 = new c6e0(obj4, obj5, (lnm) obj3, (byte) 13);
                c6e0Var14.c = (vr20) obj;
                c6e0Var14.d = (Throwable) obj2;
                return c6e0Var14.invokeSuspend(rih1Var);
            case 14:
                c6e0 c6e0Var15 = new c6e0((lnm) obj3, obj4, obj5, (byte) 14);
                c6e0Var15.c = (vr20) obj;
                c6e0Var15.d = obj2;
                return c6e0Var15.invokeSuspend(rih1Var);
            case 15:
                c6e0 c6e0Var16 = new c6e0((byte) 15, (pa01) obj5, (String) obj4, (lnm) obj3);
                c6e0Var16.c = (vr20) obj;
                c6e0Var16.d = obj2;
                return c6e0Var16.invokeSuspend(rih1Var);
            case 16:
                c6e0 c6e0Var17 = new c6e0(obj4, obj5, (lnm) obj3, (byte) 16);
                c6e0Var17.c = (vr20) obj;
                c6e0Var17.d = (Throwable) obj2;
                return c6e0Var17.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                c6e0 c6e0Var18 = new c6e0(obj4, obj5, (lnm) obj3, (byte) 17);
                c6e0Var18.c = (vr20) obj;
                c6e0Var18.d = (Throwable) obj2;
                return c6e0Var18.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                c6e0 c6e0Var19 = new c6e0((lnm) obj3, obj4, obj5, (byte) 18);
                c6e0Var19.c = (vr20) obj;
                c6e0Var19.d = obj2;
                return c6e0Var19.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                c6e0 c6e0Var20 = new c6e0((lnm) obj3, obj4, obj5, (byte) 19);
                c6e0Var20.c = (vr20) obj;
                c6e0Var20.d = obj2;
                return c6e0Var20.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                c6e0 c6e0Var21 = new c6e0((lnm) obj3, obj4, obj5, (byte) 20);
                c6e0Var21.c = (vr20) obj;
                c6e0Var21.d = obj2;
                return c6e0Var21.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                c6e0 c6e0Var22 = new c6e0((lnm) obj3, obj4, obj5, (byte) 21);
                c6e0Var22.c = (vr20) obj;
                c6e0Var22.d = obj2;
                return c6e0Var22.invokeSuspend(rih1Var);
            case 22:
                c6e0 c6e0Var23 = new c6e0((lnm) obj3, obj4, obj5, (byte) 22);
                c6e0Var23.c = (vr20) obj;
                c6e0Var23.d = obj2;
                return c6e0Var23.invokeSuspend(rih1Var);
            case 23:
                c6e0 c6e0Var24 = new c6e0((lnm) obj3, obj4, obj5, (byte) 23);
                c6e0Var24.c = (vr20) obj;
                c6e0Var24.d = obj2;
                return c6e0Var24.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                c6e0 c6e0Var25 = new c6e0(obj4, obj5, (lnm) obj3, (byte) 24);
                c6e0Var25.c = (vr20) obj;
                c6e0Var25.d = (Throwable) obj2;
                return c6e0Var25.invokeSuspend(rih1Var);
            case 25:
                c6e0 c6e0Var26 = new c6e0((lnm) obj3, obj4, obj5, (byte) 25);
                c6e0Var26.c = (vr20) obj;
                c6e0Var26.d = obj2;
                return c6e0Var26.invokeSuspend(rih1Var);
            case 26:
                c6e0 c6e0Var27 = new c6e0((byte) 26, (nl9) obj5, (String) obj4, (lnm) obj3);
                c6e0Var27.c = (vr20) obj;
                c6e0Var27.d = obj2;
                return c6e0Var27.invokeSuspend(rih1Var);
            case 27:
                c6e0 c6e0Var28 = new c6e0((byte) 27, (wyf1) obj5, (String) obj4, (lnm) obj3);
                c6e0Var28.c = (vr20) obj;
                c6e0Var28.d = obj2;
                return c6e0Var28.invokeSuspend(rih1Var);
            case 28:
                c6e0 c6e0Var29 = new c6e0((byte) 28, (tag1) obj5, (String) obj4, (lnm) obj3);
                c6e0Var29.c = (vr20) obj;
                c6e0Var29.d = obj2;
                return c6e0Var29.invokeSuspend(rih1Var);
            default:
                c6e0 c6e0Var30 = new c6e0((byte) 29, (cig1) obj5, (String) obj4, (lnm) obj3);
                c6e0Var30.c = (vr20) obj;
                c6e0Var30.d = obj2;
                return c6e0Var30.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:246:0x0655  */
    /* JADX WARN: Code duplicated, block: B:247:0x0658  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v17 java.lang.Object, still in use, count: 2, list:
          (r11v17 java.lang.Object) from 0x0651: PHI (r11 I:??) = (r11v14 java.lang.Object), (r11v17 java.lang.Object) binds: [B:243:0x0650, B:446:0x0651] A[DONT_GENERATE, DONT_INLINE]
          (r11v17 java.lang.Object) from 0x0641: CHECK_CAST (p.pvc0) (r11v17 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instruction units count: 2872
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.c6e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c6e0(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.e = obj;
        this.f = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c6e0(lnm lnmVar, Object obj, Object obj2, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.e = obj;
        this.f = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c6e0(byte b, Object obj, String str, lnm lnmVar) {
        super(3, lnmVar);
        this.a = b;
        this.f = obj;
        this.e = str;
    }
}
