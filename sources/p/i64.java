package p;

import com.google.protobuf.Empty;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.carapplibrary.androidauto.chapters.ChapterFetchException;
import com.spotify.mobius.MobiusLoop;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i64 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ vr20 c;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i64(byte b) {
        super(3, (lnm) null);
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = 3;
        vr20 vr20Var = (vr20) obj;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                i64 i64Var = new i64(b2, lnmVar, (byte) 0);
                i64Var.c = vr20Var;
                i64Var.d = obj2;
                return i64Var.invokeSuspend(rih1Var);
            case 1:
                i64 i64Var2 = new i64(b2, lnmVar, (byte) 1);
                i64Var2.c = vr20Var;
                i64Var2.d = obj2;
                return i64Var2.invokeSuspend(rih1Var);
            case 2:
                i64 i64Var3 = new i64(b2, lnmVar, (byte) 2);
                i64Var3.c = vr20Var;
                i64Var3.d = obj2;
                return i64Var3.invokeSuspend(rih1Var);
            case 3:
                i64 i64Var4 = new i64(b2, lnmVar, b2);
                i64Var4.c = vr20Var;
                i64Var4.d = obj2;
                return i64Var4.invokeSuspend(rih1Var);
            case 4:
                i64 i64Var5 = new i64(b2, lnmVar, (byte) 4);
                i64Var5.c = vr20Var;
                i64Var5.d = obj2;
                return i64Var5.invokeSuspend(rih1Var);
            case 5:
                i64 i64Var6 = new i64(b2, lnmVar, (byte) 5);
                i64Var6.c = vr20Var;
                i64Var6.d = obj2;
                return i64Var6.invokeSuspend(rih1Var);
            case 6:
                i64 i64Var7 = new i64(b2, lnmVar, (byte) 6);
                i64Var7.c = vr20Var;
                i64Var7.d = obj2;
                return i64Var7.invokeSuspend(rih1Var);
            case 7:
                i64 i64Var8 = new i64(b2, lnmVar, (byte) 7);
                i64Var8.c = vr20Var;
                i64Var8.d = obj2;
                return i64Var8.invokeSuspend(rih1Var);
            case 8:
                i64 i64Var9 = new i64(b2, lnmVar, (byte) 8);
                i64Var9.c = vr20Var;
                i64Var9.d = obj2;
                return i64Var9.invokeSuspend(rih1Var);
            case 9:
                i64 i64Var10 = new i64(b2, lnmVar, (byte) 9);
                i64Var10.c = vr20Var;
                i64Var10.d = obj2;
                return i64Var10.invokeSuspend(rih1Var);
            case 10:
                i64 i64Var11 = new i64(b2, lnmVar, (byte) 10);
                i64Var11.c = vr20Var;
                i64Var11.d = obj2;
                return i64Var11.invokeSuspend(rih1Var);
            case 11:
                i64 i64Var12 = new i64(b2, lnmVar, (byte) 11);
                i64Var12.c = vr20Var;
                i64Var12.d = obj2;
                return i64Var12.invokeSuspend(rih1Var);
            case 12:
                i64 i64Var13 = new i64(b2, lnmVar, (byte) 12);
                i64Var13.c = vr20Var;
                i64Var13.d = obj2;
                return i64Var13.invokeSuspend(rih1Var);
            case 13:
                i64 i64Var14 = new i64(b2, lnmVar, (byte) 13);
                i64Var14.c = vr20Var;
                i64Var14.d = obj2;
                return i64Var14.invokeSuspend(rih1Var);
            case 14:
                i64 i64Var15 = new i64(b2, lnmVar, (byte) 14);
                i64Var15.c = vr20Var;
                i64Var15.d = obj2;
                return i64Var15.invokeSuspend(rih1Var);
            case 15:
                i64 i64Var16 = new i64(b2, lnmVar, (byte) 15);
                i64Var16.c = vr20Var;
                i64Var16.d = obj2;
                return i64Var16.invokeSuspend(rih1Var);
            case 16:
                i64 i64Var17 = new i64(b2, lnmVar, (byte) 16);
                i64Var17.c = vr20Var;
                i64Var17.d = obj2;
                return i64Var17.invokeSuspend(rih1Var);
            case 17:
                i64 i64Var18 = new i64(b2, lnmVar, (byte) 17);
                i64Var18.c = vr20Var;
                i64Var18.d = obj2;
                return i64Var18.invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                i64 i64Var19 = new i64(b2, lnmVar, (byte) 18);
                i64Var19.c = vr20Var;
                i64Var19.d = obj2;
                return i64Var19.invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                i64 i64Var20 = new i64(b2, lnmVar, (byte) 19);
                i64Var20.c = vr20Var;
                i64Var20.d = obj2;
                return i64Var20.invokeSuspend(rih1Var);
            case 20:
                i64 i64Var21 = new i64(b2, lnmVar, (byte) 20);
                i64Var21.c = vr20Var;
                i64Var21.d = obj2;
                return i64Var21.invokeSuspend(rih1Var);
            case 21:
                i64 i64Var22 = new i64(b2, lnmVar, (byte) 21);
                i64Var22.c = vr20Var;
                i64Var22.d = obj2;
                return i64Var22.invokeSuspend(rih1Var);
            case 22:
                i64 i64Var23 = new i64(b2, lnmVar, (byte) 22);
                i64Var23.c = vr20Var;
                i64Var23.d = obj2;
                return i64Var23.invokeSuspend(rih1Var);
            case 23:
                i64 i64Var24 = new i64(b2, lnmVar, (byte) 23);
                i64Var24.c = vr20Var;
                i64Var24.d = obj2;
                return i64Var24.invokeSuspend(rih1Var);
            case 24:
                i64 i64Var25 = new i64(b2, lnmVar, (byte) 24);
                i64Var25.c = vr20Var;
                i64Var25.d = obj2;
                return i64Var25.invokeSuspend(rih1Var);
            case 25:
                i64 i64Var26 = new i64(b2, lnmVar, (byte) 25);
                i64Var26.c = vr20Var;
                i64Var26.d = obj2;
                return i64Var26.invokeSuspend(rih1Var);
            case 26:
                i64 i64Var27 = new i64(b2, lnmVar, (byte) 26);
                i64Var27.c = vr20Var;
                i64Var27.d = obj2;
                return i64Var27.invokeSuspend(rih1Var);
            case 27:
                i64 i64Var28 = new i64(b2, lnmVar, (byte) 27);
                i64Var28.c = vr20Var;
                i64Var28.d = obj2;
                return i64Var28.invokeSuspend(rih1Var);
            case 28:
                i64 i64Var29 = new i64(b2, lnmVar, (byte) 28);
                i64Var29.c = vr20Var;
                i64Var29.d = obj2;
                return i64Var29.invokeSuspend(rih1Var);
            default:
                i64 i64Var30 = new i64(b2, lnmVar, (byte) 29);
                i64Var30.c = vr20Var;
                i64Var30.d = obj2;
                return i64Var30.invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.carapplibrary.androidauto.chapters.ChapterFetchException */
    /* JADX WARN: Code duplicated, block: B:126:0x029f  */
    /* JADX WARN: Code duplicated, block: B:259:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:465:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:493:? A[RETURN, SYNTHETIC] */
    public final Object invokeSuspend(Object obj) throws ChapterFetchException {
        huz huzVar;
        mr20 huzVar2;
        mr20 huzVar3;
        v7d0 v7d0Var;
        ezc ezcVar;
        bpb1 huzVar4;
        bpb1 huzVar5;
        huz huzVar6;
        bpb1 huzVar7;
        huz z4t0Var;
        byte b = this.a;
        ezc huzVar8 = r6x.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                vr20 vr20Var = this.c;
                Object obj2 = this.d;
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    i1r i1rVar = (k1r) obj2;
                    if (!(i1rVar instanceof j1r)) {
                        if (i1rVar instanceof i1r) {
                            huzVar8 = new huz(i1rVar.a, (byte) 10);
                        } else {
                            if (i1rVar instanceof h1r) {
                                throw new ChapterFetchException(((h1r) i1rVar).a.getMessage());
                            }
                            eg.o();
                        }
                    }
                    this.c = null;
                    this.d = null;
                    this.b = true;
                    return l4p1.s(vr20Var, huzVar8, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                vr20 vr20Var2 = this.c;
                Object obj3 = this.d;
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarJ = ((yzc0) obj3).j();
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var2, mr20VarJ, this) == d9nVar ? d9nVar : rih1Var;
            case 2:
                vr20 vr20Var3 = this.c;
                Object obj4 = this.d;
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarA = ((yzc0) obj4).a();
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var3, mr20VarA, this) == d9nVar ? d9nVar : rih1Var;
            case 3:
                vr20 vr20Var4 = this.c;
                Object obj5 = this.d;
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Collection<drb> collectionValues = ((Map) obj5).values();
                ArrayList arrayList = new ArrayList(q7h.U(collectionValues, 10));
                for (drb drbVar : collectionValues) {
                    arrayList.add(new asb(drbVar.l(), drbVar, (byte) 1));
                }
                int i = hu20.a;
                kge kgeVar = new kge(arrayList);
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var4, kgeVar, this) == d9nVar ? d9nVar : rih1Var;
            case 4:
                vr20 vr20Var5 = this.c;
                Object obj6 = this.d;
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                drb drbVar2 = (drb) obj6;
                huz huzVar9 = drbVar2 == null ? new huz((Object) null, (byte) 10) : new asb(drbVar2.r(), drbVar2, (byte) 0);
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var5, huzVar9, this) == d9nVar ? d9nVar : rih1Var;
            case 5:
                vr20 vr20Var6 = this.c;
                Object obj7 = this.d;
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    i1r i1rVar2 = (k1r) obj7;
                    boolean z7 = i1rVar2 instanceof j1r;
                    asm asmVar = asm.a;
                    if (z7 || (i1rVar2 instanceof h1r)) {
                        huzVar = new huz(asmVar, (byte) 10);
                    } else if (i1rVar2 instanceof i1r) {
                        huzVar = new huz(i1rVar2.a, (byte) 10);
                    } else {
                        eg.o();
                    }
                    this.c = null;
                    this.d = null;
                    this.b = true;
                    return l4p1.s(vr20Var6, huzVar, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z6) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                vr20 vr20Var7 = this.c;
                Object obj8 = this.d;
                boolean z8 = this.b;
                if (z8) {
                    if (z8) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                t1v0 t1v0Var = (t1v0) obj8;
                p260 p260Var = t1v0Var != null ? t1v0Var.b : null;
                t17 t17Var = p260Var instanceof t17 ? (t17) p260Var : null;
                if (t17Var == null || (huzVar2 = t17Var.b()) == null) {
                    huzVar2 = new huz((Object) null, (byte) 10);
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var7, huzVar2, this) == d9nVar ? d9nVar : rih1Var;
            case 7:
                vr20 vr20Var8 = this.c;
                Object obj9 = this.d;
                boolean z9 = this.b;
                if (z9) {
                    if (z9) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarB = ((zdt) obj9).b();
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var8, mr20VarB, this) == d9nVar ? d9nVar : rih1Var;
            case 8:
                vr20 vr20Var9 = this.c;
                Object obj10 = this.d;
                boolean z10 = this.b;
                if (z10) {
                    if (z10) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                cx80 cx80Var = (cx80) obj10;
                if (cx80Var == null || (huzVar3 = cx80Var.c()) == null) {
                    huzVar3 = new huz(Boolean.FALSE, (byte) 10);
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var9, huzVar3, this) == d9nVar ? d9nVar : rih1Var;
            case 9:
                vr20 vr20Var10 = this.c;
                Object obj11 = this.d;
                boolean z11 = this.b;
                if (z11) {
                    if (z11) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarE = ((cx80) obj11).e();
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var10, mr20VarE, this) == d9nVar ? d9nVar : rih1Var;
            case 10:
                vr20 vr20Var11 = this.c;
                Object obj12 = this.d;
                boolean z12 = this.b;
                if (z12) {
                    if (z12) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                zob1 zob1VarC = ((nw80) obj12).c();
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var11, zob1VarC, this) == d9nVar ? d9nVar : rih1Var;
            case 11:
                vr20 vr20Var12 = this.c;
                Object obj13 = this.d;
                boolean z13 = this.b;
                if (z13) {
                    if (z13) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (((Boolean) obj13).booleanValue()) {
                    huzVar8 = new m441(new y2k(2, (lnm) null, (byte) 2));
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var12, huzVar8, this) == d9nVar ? d9nVar : rih1Var;
            case 12:
                vr20 vr20Var13 = this.c;
                Object obj14 = this.d;
                boolean z14 = this.b;
                if (z14) {
                    if (z14) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ezc ezcVar2 = (at71) obj14;
                if (ezcVar2 != null) {
                    huzVar8 = ezcVar2;
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var13, huzVar8, this) == d9nVar ? d9nVar : rih1Var;
            case 13:
                vr20 vr20Var14 = this.c;
                Object obj15 = this.d;
                boolean z15 = this.b;
                if (z15) {
                    if (z15) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Iterator it = ((List) obj15).iterator();
                do {
                    if (it.hasNext()) {
                        r2g r2gVar = ((x2g) it.next()).b;
                        v7d0Var = r2gVar instanceof v7d0 ? (v7d0) r2gVar : null;
                    } else {
                        v7d0Var = null;
                    }
                    if (v7d0Var != null && (ezcVar = v7d0Var.c) != null) {
                        huzVar8 = ezcVar;
                    }
                    this.c = null;
                    this.d = null;
                    this.b = true;
                    if (l4p1.s(vr20Var14, huzVar8, this) == d9nVar) {
                        return d9nVar;
                    }
                    return rih1Var;
                } while (v7d0Var == null);
                if (v7d0Var != null) {
                    huzVar8 = ezcVar;
                }
                this.c = null;
                this.d = null;
                this.b = true;
                if (l4p1.s(vr20Var14, huzVar8, this) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case 14:
                vr20 vr20Var15 = this.c;
                Object obj16 = this.d;
                boolean z16 = this.b;
                if (z16) {
                    if (z16) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                r091 r091Var = (r091) obj16;
                if (r091Var == null || (huzVar4 = r091Var.g) == null) {
                    huzVar4 = new huz((Object) null, (byte) 10);
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var15, huzVar4, this) == d9nVar ? d9nVar : rih1Var;
            case 15:
                vr20 vr20Var16 = this.c;
                Object obj17 = this.d;
                boolean z17 = this.b;
                if (z17) {
                    if (z17) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                MobiusLoop mobiusLoop = (MobiusLoop) obj17;
                if (mobiusLoop != null) {
                    huzVar8 = h4p1.f(new pur(mobiusLoop, (lnm) null, (byte) 1));
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var16, huzVar8, this) == d9nVar ? d9nVar : rih1Var;
            case 16:
                vr20 vr20Var17 = this.c;
                Object obj18 = this.d;
                boolean z18 = this.b;
                if (z18) {
                    if (z18) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                huz huzVar10 = (mr20) obj18;
                if (huzVar10 == null) {
                    huzVar10 = new huz(Boolean.FALSE, (byte) 10);
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var17, huzVar10, this) == d9nVar ? d9nVar : rih1Var;
            case 17:
                vr20 vr20Var18 = this.c;
                Object obj19 = this.d;
                boolean z19 = this.b;
                if (z19) {
                    if (z19) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                r091 r091Var2 = (r091) obj19;
                if (r091Var2 == null || (huzVar5 = r091Var2.g) == null) {
                    huzVar5 = new huz((Object) null, (byte) 10);
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var18, huzVar5, this) == d9nVar ? d9nVar : rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                vr20 vr20Var19 = this.c;
                Object obj20 = this.d;
                boolean z20 = this.b;
                if (z20) {
                    if (z20) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ptn0 ptn0Var = (ptn0) obj20;
                ArrayList arrayList2 = new ArrayList(q7h.U(ptn0Var, 10));
                for (ntn0 ntn0Var : ptn0Var.a) {
                    arrayList2.add(new sii0(ntn0Var.e, ntn0Var, (byte) 9));
                }
                mr20[] mr20VarArr = (mr20[]) o7h.l1(arrayList2).toArray(new mr20[0]);
                this.c = null;
                this.d = null;
                this.b = true;
                u4p1.S(vr20Var19);
                Object objS = fc11.s(new ldd0(mr20VarArr, (byte) 5), this, vr20Var19, new ftn0(3, (lnm) null, (byte) 0), mr20VarArr);
                if (objS != d9nVar) {
                    objS = rih1Var;
                }
                if (objS != d9nVar) {
                    objS = rih1Var;
                }
                return objS == d9nVar ? d9nVar : rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                vr20 vr20Var20 = this.c;
                Object obj21 = this.d;
                boolean z21 = this.b;
                if (z21) {
                    if (z21) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ima1 ima1Var = (dma1) obj21;
                ht20 ht20Var = ima1Var != null ? new ht20(new uop0(ima1Var.q(n9r0.g), (byte) 5), new kgv(ima1Var, (lnm) null, (byte) 1)) : new huz(Boolean.FALSE, (byte) 10);
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var20, ht20Var, this) == d9nVar ? d9nVar : rih1Var;
            case 20:
                vr20 vr20Var21 = this.c;
                Object obj22 = this.d;
                boolean z22 = this.b;
                if (z22) {
                    if (z22) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ima1 ima1Var2 = (dma1) obj22;
                ht20 ht20Var2 = ima1Var2 != null ? new ht20(new uop0(ima1Var2.q(n9r0.f), (byte) 9), new kgv(ima1Var2, (lnm) null, (byte) 5)) : new huz(Boolean.FALSE, (byte) 10);
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var21, ht20Var2, this) == d9nVar ? d9nVar : rih1Var;
            case 21:
                vr20 vr20Var22 = this.c;
                Object obj23 = this.d;
                boolean z23 = this.b;
                if (z23) {
                    if (z23) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bma1 bma1Var = g3t0.c;
                ima1 ima1Var3 = (dma1) obj23;
                m441 m441VarU = i6p1.u(new d3t0(ima1Var3.q(bma1Var), ima1Var3, (byte) 0), Boolean.valueOf(ima1Var3.h(bma1Var, true)));
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var22, m441VarU, this) == d9nVar ? d9nVar : rih1Var;
            case 22:
                vr20 vr20Var23 = this.c;
                Object obj24 = this.d;
                boolean z24 = this.b;
                if (!z24) {
                    hm5.M(obj);
                    ly21 ly21Var = (py21) obj24;
                    ly21Var.getClass();
                    if (ly21Var instanceof ly21) {
                        jy21 jy21Var = ly21Var.a;
                        if ((jy21Var instanceof gy21) || (jy21Var instanceof cy21) || (jy21Var instanceof hy21)) {
                            huzVar6 = new huz(Boolean.FALSE, (byte) 10);
                            this.c = null;
                            this.d = null;
                            this.b = true;
                            if (l4p1.s(vr20Var23, huzVar6, this) == d9nVar) {
                                return d9nVar;
                            }
                            return rih1Var;
                        }
                        k220.f(jy21Var.b());
                    } else {
                        if (ly21Var instanceof oy21) {
                            huzVar6 = new huz(Boolean.valueOf(((wsc0) ((oy21) ly21Var).a).f.g), (byte) 10);
                            this.c = null;
                            this.d = null;
                            this.b = true;
                            if (l4p1.s(vr20Var23, huzVar6, this) == d9nVar) {
                                return d9nVar;
                            }
                            return rih1Var;
                        }
                        eg.o();
                    }
                } else {
                    if (z24) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 23:
                vr20 vr20Var24 = this.c;
                Object obj25 = this.d;
                boolean z25 = this.b;
                if (z25) {
                    if (z25) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ipr iprVar = new ipr(new fw8(false, false), rqt0.u(new c1v0(((r091) obj25).g, (byte) 11)), new lok0(3, (lnm) null, (byte) 18), (byte) 16);
                this.c = null;
                this.d = null;
                this.b = true;
                u4p1.S(vr20Var24);
                Object objCollect = iprVar.collect(new qkv0(vr20Var24, (byte) 14), this);
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                return objCollect == d9nVar ? d9nVar : rih1Var;
            case 24:
                vr20 vr20Var25 = this.c;
                Object obj26 = this.d;
                boolean z26 = this.b;
                if (z26) {
                    if (z26) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                r091 r091Var3 = (r091) obj26;
                if (r091Var3 == null || (huzVar7 = r091Var3.g) == null) {
                    huzVar7 = new huz((Object) null, (byte) 10);
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var25, huzVar7, this) == d9nVar ? d9nVar : rih1Var;
            case 25:
                vr20 vr20Var26 = this.c;
                Object obj27 = this.d;
                boolean z27 = this.b;
                if (z27) {
                    if (z27) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                by60 by60Var = (by60) obj27;
                ht20 ht20Var3 = by60Var != null ? new ht20(rqt0.u(new zx60(yoi1.g(by60Var.a.q(Empty.n())), (byte) 1)), new te11(by60Var, null, (byte) 0)) : new huz((Object) null, (byte) 10);
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var26, ht20Var3, this) == d9nVar ? d9nVar : rih1Var;
            case 26:
                vr20 vr20Var27 = this.c;
                Object obj28 = this.d;
                boolean z28 = this.b;
                if (z28) {
                    if (z28) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                by60 by60Var2 = (by60) obj28;
                ht20 ht20Var4 = by60Var2 != null ? new ht20(rqt0.u(new zx60(yoi1.g(by60Var2.a.q(Empty.n())), (byte) 0)), new te11(by60Var2, null, (byte) 1)) : new huz((Object) null, (byte) 10);
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var27, ht20Var4, this) == d9nVar ? d9nVar : rih1Var;
            case 27:
                vr20 vr20Var28 = this.c;
                Object obj29 = this.d;
                boolean z29 = this.b;
                if (z29) {
                    if (z29) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                hy11.i0.getClass();
                bma1 bma1Var2 = gy11.b;
                ima1 ima1Var4 = (dma1) obj29;
                m441 m441VarU2 = i6p1.u(new d3t0(ima1Var4.q(bma1Var2), ima1Var4, (byte) 1), Boolean.valueOf(ima1Var4.h(bma1Var2, false)));
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var28, m441VarU2, this) == d9nVar ? d9nVar : rih1Var;
            case 28:
                vr20 vr20Var29 = this.c;
                Object obj30 = this.d;
                boolean z30 = this.b;
                if (z30) {
                    if (z30) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarA2 = ((u601) obj30).a();
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var29, mr20VarA2, this) == d9nVar ? d9nVar : rih1Var;
            default:
                vr20 vr20Var30 = this.c;
                Object obj31 = this.d;
                boolean z31 = this.b;
                if (z31) {
                    if (z31) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                List list = (List) obj31;
                List list2 = list;
                ArrayList arrayList3 = new ArrayList(q7h.U(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((sq61) it2.next()).isVisible());
                }
                if (list.isEmpty()) {
                    z4t0Var = new huz(Boolean.FALSE, (byte) 10);
                } else if (arrayList3.isEmpty()) {
                    z4t0Var = new z4t0((mr20[]) o7h.l1(arrayList3).toArray(new mr20[0]), (byte) 8);
                } else {
                    Iterator it3 = arrayList3.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            mr20 mr20Var = (mr20) it3.next();
                            huz huzVar11 = wbx0.X;
                            if (u890.j(mr20Var, huzVar11)) {
                                z4t0Var = huzVar11;
                            }
                        } else {
                            z4t0Var = new z4t0((mr20[]) o7h.l1(arrayList3).toArray(new mr20[0]), (byte) 8);
                        }
                    }
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var30, z4t0Var, this) == d9nVar ? d9nVar : rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i64(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }
}
