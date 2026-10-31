package p;

import android.content.Intent;
import android.content.res.Resources;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.player.model.PlayerState;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zz90 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zz90(mdd0 mdd0Var, p811 p811Var, String str, lnm lnmVar) {
        super(3, lnmVar);
        this.a = (byte) 7;
        this.c = mdd0Var;
        this.d = p811Var;
        this.e = str;
    }

    private final Object e(Object obj) {
        Object objI;
        Object next;
        Intent intent = (Intent) this.c;
        th61 th61Var = (th61) this.d;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            mr20 mr20Var = ((mnk0) ((wf2) this.e).b).a;
            this.c = intent;
            this.d = th61Var;
            this.b = true;
            objI = b5p1.i(mr20Var, this);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            objI = obj;
        }
        if (!((ibk0) objI).a()) {
            return new hrn0(txj0.class, new vxj0(), new c6w0(2, false, (hd5) null, 12));
        }
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(intent.getDataString());
        String strZ = s4b1VarX.z();
        if (strZ == null) {
            return crn0.a;
        }
        String strN = s4b1VarX.n("mixingPageMode");
        Iterator it = dbk0.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!nhc1.S(((dbk0) next).name(), strN, true));
        dbk0 dbk0Var = (dbk0) next;
        if (dbk0Var == null) {
            dbk0Var = dbk0.a;
        }
        return new hrn0(qyj0.class, new c0k0((String) null, (String) null, (bt31) null, (bt31) null, strZ, th61Var.a, dbk0Var, false, 143), new c6w0(1, true, (hd5) null, 12));
    }

    private final Object g(Object obj) {
        vr20 vr20Var = (vr20) this.c;
        Object obj2 = this.d;
        boolean z = this.b;
        lnm lnmVar = null;
        if (!z) {
            hm5.M(obj);
            b1n0 b1n0Var = (b1n0) obj2;
            t0n0 t0n0Var = (t0n0) this.e;
            jge jgeVarE = hu20.e(t0n0Var.e, new c6e0(lnmVar, (Object) t0n0Var, (Object) b1n0Var, (byte) 4));
            lik1 lik1Var = t0n0Var.b;
            if (lik1Var == null) {
                u0n0 u0n0Var = b1n0Var.g;
                lik1Var = u0n0Var != null ? u0n0Var.c : null;
            }
            ipr iprVar = new ipr(new ssn0(lik1Var, czm0.c, k8b0.T0), jgeVarE, new lok0(3, (lnm) null, (byte) 2), (byte) 16);
            this.c = null;
            this.d = null;
            this.b = true;
            Object objS = l4p1.s(vr20Var, iprVar, this);
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

    private final Object h(Object obj) {
        qsc0 qsc0Var;
        huz sii0Var;
        lun0 lun0Var = (lun0) this.e;
        vr20 vr20Var = (vr20) this.c;
        Object obj2 = this.d;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            PlayerState playerState = (PlayerState) obj2;
            if (playerState.track().c()) {
                bnj0 bnj0Var = lun0Var.a;
                dzy.c.getClass();
                dzy dzyVarC = gtv0.c(playerState);
                fny fnyVar = (fny) ((Map) bnj0Var.c).get(dzyVarC);
                byte b = 10;
                if (fnyVar == null) {
                    bx21 bx21Var = dzyVarC.a;
                    bx21 bx21Var2 = dzyVarC.b;
                    String strZ = poo1.z(playerState);
                    boolean z2 = (120 & 16) == 0;
                    Resources resources = (Resources) bnj0Var.b;
                    sii0Var = new huz(new iun0((String) bx21Var.invoke(resources), (String) bx21Var2.invoke(resources), strZ, null, z2, null, null), (byte) 10);
                } else {
                    sii0Var = new sii0(fnyVar.b(playerState), bnj0Var, b);
                }
                qsc0Var = new qsc0(sii0Var, lun0Var, playerState, (byte) 11);
            } else {
                qsc0Var = r6x.a;
            }
            this.c = null;
            this.d = null;
            this.b = true;
            Object objS = l4p1.s(vr20Var, qsc0Var, this);
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

    private final Object i(Object obj) {
        m2o0 m2o0Var = (m2o0) this.e;
        vr20 vr20Var = (vr20) this.c;
        Object obj2 = this.d;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            fu20 fu20Var = ((Boolean) obj2).booleanValue() ? new fu20(new r6k0(rqt0.u(m2o0Var.b.a()), (byte) 18), new uug0(m2o0Var, (lnm) null, (byte) 24), (byte) 1) : r6x.a;
            this.c = null;
            this.d = null;
            this.b = true;
            Object objS = l4p1.s(vr20Var, fu20Var, this);
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
        switch (b) {
            case 0:
                zz90 zz90Var = new zz90((lnm) obj3, obj4, (byte) 0);
                zz90Var.c = (vr20) obj;
                zz90Var.d = obj2;
                return zz90Var.invokeSuspend(rih1Var);
            case 1:
                zz90 zz90Var2 = new zz90((lnm) obj3, obj4, (byte) 1);
                zz90Var2.c = (vr20) obj;
                zz90Var2.d = obj2;
                return zz90Var2.invokeSuspend(rih1Var);
            case 2:
                zz90 zz90Var3 = new zz90((lnm) obj3, obj4, (byte) 2);
                zz90Var3.c = (vr20) obj;
                zz90Var3.d = obj2;
                return zz90Var3.invokeSuspend(rih1Var);
            case 3:
                zz90 zz90Var4 = new zz90((lnm) obj3, obj4, (byte) 3);
                zz90Var4.c = (vr20) obj;
                zz90Var4.d = (Object[]) obj2;
                return zz90Var4.invokeSuspend(rih1Var);
            case 4:
                zz90 zz90Var5 = new zz90((lnm) obj3, obj4, (byte) 4);
                zz90Var5.c = (vr20) obj;
                zz90Var5.d = obj2;
                return zz90Var5.invokeSuspend(rih1Var);
            case 5:
                zz90 zz90Var6 = new zz90((lnm) obj3, obj4, (byte) 5);
                zz90Var6.c = (vr20) obj;
                zz90Var6.d = obj2;
                return zz90Var6.invokeSuspend(rih1Var);
            case 6:
                zz90 zz90Var7 = new zz90((lnm) obj3, obj4, (byte) 6);
                zz90Var7.c = (vr20) obj;
                zz90Var7.d = obj2;
                return zz90Var7.invokeSuspend(rih1Var);
            case 7:
                return new zz90((mdd0) this.c, (p811) this.d, (String) obj4, (lnm) obj3).invokeSuspend(rih1Var);
            case 8:
                zz90 zz90Var8 = new zz90((lnm) obj3, obj4, (byte) 8);
                zz90Var8.c = (vr20) obj;
                zz90Var8.d = obj2;
                return zz90Var8.invokeSuspend(rih1Var);
            case 9:
                zz90 zz90Var9 = new zz90((lnm) obj3, obj4, (byte) 9);
                zz90Var9.c = (vr20) obj;
                zz90Var9.d = obj2;
                return zz90Var9.invokeSuspend(rih1Var);
            case 10:
                zz90 zz90Var10 = new zz90((lnm) obj3, obj4, (byte) 10);
                zz90Var10.c = (vr20) obj;
                zz90Var10.d = obj2;
                return zz90Var10.invokeSuspend(rih1Var);
            case 11:
                zz90 zz90Var11 = new zz90((lnm) obj3, obj4, (byte) 11);
                zz90Var11.c = (vr20) obj;
                zz90Var11.d = obj2;
                return zz90Var11.invokeSuspend(rih1Var);
            case 12:
                zz90 zz90Var12 = new zz90((lnm) obj3, obj4, (byte) 12);
                zz90Var12.c = (vr20) obj;
                zz90Var12.d = obj2;
                return zz90Var12.invokeSuspend(rih1Var);
            case 13:
                zz90 zz90Var13 = new zz90((lnm) obj3, obj4, (byte) 13);
                zz90Var13.c = (vr20) obj;
                zz90Var13.d = obj2;
                return zz90Var13.invokeSuspend(rih1Var);
            case 14:
                zz90 zz90Var14 = new zz90((lnm) obj3, obj4, (byte) 14);
                zz90Var14.c = (vr20) obj;
                zz90Var14.d = obj2;
                return zz90Var14.invokeSuspend(rih1Var);
            case 15:
                zz90 zz90Var15 = new zz90((lnm) obj3, obj4, (byte) 15);
                zz90Var15.c = (vr20) obj;
                zz90Var15.d = obj2;
                return zz90Var15.invokeSuspend(rih1Var);
            case 16:
                zz90 zz90Var16 = new zz90((lnm) obj3, obj4, (byte) 16);
                zz90Var16.c = (vr20) obj;
                zz90Var16.d = obj2;
                return zz90Var16.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                zz90 zz90Var17 = new zz90((it80) obj4, (lnm) obj3, (byte) 17);
                zz90Var17.d = (Intent) obj;
                return zz90Var17.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                zz90 zz90Var18 = new zz90((lnm) obj3, obj4, (byte) 18);
                zz90Var18.c = (vr20) obj;
                zz90Var18.d = obj2;
                return zz90Var18.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                zz90 zz90Var19 = new zz90((lnm) obj3, obj4, (byte) 19);
                zz90Var19.c = (vr20) obj;
                zz90Var19.d = obj2;
                return zz90Var19.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                zz90 zz90Var20 = new zz90((lnm) obj3, obj4, (byte) 20);
                zz90Var20.c = (vr20) obj;
                zz90Var20.d = obj2;
                return zz90Var20.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                zz90 zz90Var21 = new zz90((lnm) obj3, obj4, (byte) 21);
                zz90Var21.c = (vr20) obj;
                zz90Var21.d = obj2;
                return zz90Var21.invokeSuspend(rih1Var);
            case 22:
                zz90 zz90Var22 = new zz90((lnm) obj3, obj4, (byte) 22);
                zz90Var22.c = (vr20) obj;
                zz90Var22.d = obj2;
                return zz90Var22.invokeSuspend(rih1Var);
            case 23:
                zz90 zz90Var23 = new zz90((lnm) obj3, obj4, (byte) 23);
                zz90Var23.c = (vr20) obj;
                zz90Var23.d = obj2;
                return zz90Var23.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                zz90 zz90Var24 = new zz90((it80) obj4, (lnm) obj3, (byte) 24);
                zz90Var24.c = (Intent) obj;
                zz90Var24.d = (th61) obj2;
                return zz90Var24.invokeSuspend(rih1Var);
            case 25:
                zz90 zz90Var25 = new zz90((lnm) obj3, obj4, (byte) 25);
                zz90Var25.c = (vr20) obj;
                zz90Var25.d = obj2;
                return zz90Var25.invokeSuspend(rih1Var);
            case 26:
                zz90 zz90Var26 = new zz90((lnm) obj3, obj4, (byte) 26);
                zz90Var26.c = (vr20) obj;
                zz90Var26.d = obj2;
                return zz90Var26.invokeSuspend(rih1Var);
            case 27:
                zz90 zz90Var27 = new zz90((lnm) obj3, obj4, (byte) 27);
                zz90Var27.c = (vr20) obj;
                zz90Var27.d = obj2;
                return zz90Var27.invokeSuspend(rih1Var);
            case 28:
                zz90 zz90Var28 = new zz90((lnm) obj3, obj4, (byte) 28);
                zz90Var28.c = (vr20) obj;
                zz90Var28.d = obj2;
                return zz90Var28.invokeSuspend(rih1Var);
            default:
                zz90 zz90Var29 = new zz90((lnm) obj3, obj4, (byte) 29);
                zz90Var29.c = (vr20) obj;
                zz90Var29.d = obj2;
                return zz90Var29.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:131:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:173:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:442:0x09d2 A[LOOP:5: B:429:0x099c->B:442:0x09d2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:482:0x0ac0  */
    /* JADX WARN: Code duplicated, block: B:515:0x09cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:597:? A[RETURN, SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v5 java.lang.Object, still in use, count: 2, list:
          (r14v5 java.lang.Object) from 0x09c8: PHI (r14 I:??) = (r14v2 java.lang.Object), (r14v5 java.lang.Object) binds: [B:438:0x09c7, B:518:0x09c8] A[DONT_GENERATE, DONT_INLINE]
          (r14v5 java.lang.Object) from 0x09ba: CHECK_CAST (p.uod1) (r14v5 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 2892
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.zz90.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zz90(it80 it80Var, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.e = it80Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zz90(lnm lnmVar, Object obj, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.e = obj;
    }
}
