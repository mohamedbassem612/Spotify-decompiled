package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.connectivity.httpwebgate.WebgateTokenProvider;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService;
import com.spotify.player.model.ContextTrack;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class af01 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af01(sq61 sq61Var, kv61 kv61Var, lnm lnmVar) {
        super(3, lnmVar);
        this.a = (byte) 15;
        this.d = sq61Var;
        this.e = kv61Var;
    }

    private final Object e(Object obj) {
        dza1 dza1Var = (dza1) this.e;
        fza1 fza1Var = dza1Var.c;
        String str = (String) this.c;
        String str2 = (String) this.d;
        boolean z = this.b;
        if (z) {
            if (z) {
                hm5.M(obj);
                return str2;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        if (fza1Var.b(str) || fza1Var.b(str2)) {
            be91 be91Var = dza1Var.b;
            jx0 jx0Var = jx0.c;
            this.c = null;
            this.d = str2;
            this.b = true;
            Object objA = be91.a(be91Var, jx0Var, qc91.d, (Map) null, this, 4);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        }
        return str2;
    }

    private final Object g(Object obj) {
        r8s r8sVar = (r8s) this.e;
        vr20 vr20Var = (vr20) this.c;
        Object obj2 = this.d;
        boolean z = this.b;
        rih1 rih1Var = rih1.a;
        if (z) {
            if (z) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        mmr0 mmr0Var = (mmr0) obj2;
        ji0 ji0Var = (ji0) mmr0Var.a;
        if (((Boolean) mmr0Var.b).booleanValue()) {
            ((n0b1) r8sVar.i).a(true);
        }
        mr20 mr20Var = ((n0b1) r8sVar.h).c;
        this.c = null;
        this.d = null;
        this.b = true;
        u4p1.S(vr20Var);
        Object objCollect = mr20Var.collect(new ip61(vr20Var, ji0Var, (byte) 14), this);
        d9n d9nVar = d9n.a;
        if (objCollect != d9nVar) {
            objCollect = rih1Var;
        }
        if (objCollect != d9nVar) {
            objCollect = rih1Var;
        }
        return objCollect == d9nVar ? d9nVar : rih1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                af01 af01Var = new af01((lnm) obj3, obj4, (byte) 0);
                af01Var.c = (vr20) obj;
                af01Var.d = obj2;
                return af01Var.invokeSuspend(rih1Var);
            case 1:
                af01 af01Var2 = new af01((lnm) obj3, obj4, (byte) 1);
                af01Var2.c = (vr20) obj;
                af01Var2.d = obj2;
                return af01Var2.invokeSuspend(rih1Var);
            case 2:
                af01 af01Var3 = new af01((lnm) obj3, obj4, (byte) 2);
                af01Var3.c = (vr20) obj;
                af01Var3.d = obj2;
                return af01Var3.invokeSuspend(rih1Var);
            case 3:
                af01 af01Var4 = new af01((lnm) obj3, obj4, (byte) 3);
                af01Var4.c = (vr20) obj;
                af01Var4.d = obj2;
                return af01Var4.invokeSuspend(rih1Var);
            case 4:
                af01 af01Var5 = new af01((lnm) obj3, obj4, (byte) 4);
                af01Var5.c = (vr20) obj;
                af01Var5.d = obj2;
                return af01Var5.invokeSuspend(rih1Var);
            case 5:
                af01 af01Var6 = new af01((lnm) obj3, obj4, (byte) 5);
                af01Var6.c = (vr20) obj;
                af01Var6.d = obj2;
                return af01Var6.invokeSuspend(rih1Var);
            case 6:
                af01 af01Var7 = new af01(obj4, (lnm) obj3, (byte) 6);
                af01Var7.c = (ni41) obj;
                af01Var7.d = (ni41) obj2;
                return af01Var7.invokeSuspend(rih1Var);
            case 7:
                af01 af01Var8 = new af01((ri41) obj4, this.b, (lnm) obj3);
                af01Var8.c = (ni41) obj;
                af01Var8.d = (mi41) obj2;
                return af01Var8.invokeSuspend(rih1Var);
            case 8:
                af01 af01Var9 = new af01((lnm) obj3, obj4, (byte) 8);
                af01Var9.c = (vr20) obj;
                af01Var9.d = obj2;
                return af01Var9.invokeSuspend(rih1Var);
            case 9:
                af01 af01Var10 = new af01((lnm) obj3, obj4, (byte) 9);
                af01Var10.c = (vr20) obj;
                af01Var10.d = obj2;
                return af01Var10.invokeSuspend(rih1Var);
            case 10:
                af01 af01Var11 = new af01((lnm) obj3, obj4, (byte) 10);
                af01Var11.c = (vr20) obj;
                af01Var11.d = obj2;
                return af01Var11.invokeSuspend(rih1Var);
            case 11:
                af01 af01Var12 = new af01((lnm) obj3, obj4, (byte) 11);
                af01Var12.c = (vr20) obj;
                af01Var12.d = obj2;
                return af01Var12.invokeSuspend(rih1Var);
            case 12:
                af01 af01Var13 = new af01((lnm) obj3, obj4, (byte) 12);
                af01Var13.c = (vr20) obj;
                af01Var13.d = obj2;
                return af01Var13.invokeSuspend(rih1Var);
            case 13:
                af01 af01Var14 = new af01((lnm) obj3, obj4, (byte) 13);
                af01Var14.c = (vr20) obj;
                af01Var14.d = obj2;
                return af01Var14.invokeSuspend(rih1Var);
            case 14:
                af01 af01Var15 = new af01((lnm) obj3, obj4, (byte) 14);
                af01Var15.c = (vr20) obj;
                af01Var15.d = obj2;
                return af01Var15.invokeSuspend(rih1Var);
            case 15:
                af01 af01Var16 = new af01((sq61) this.d, (kv61) obj4, (lnm) obj3);
                af01Var16.c = (String) obj2;
                return af01Var16.invokeSuspend(rih1Var);
            case 16:
                af01 af01Var17 = new af01((lnm) obj3, obj4, (byte) 16);
                af01Var17.c = (vr20) obj;
                af01Var17.d = obj2;
                return af01Var17.invokeSuspend(rih1Var);
            case 17:
                af01 af01Var18 = new af01((lnm) obj3, obj4, (byte) 17);
                af01Var18.c = (vr20) obj;
                af01Var18.d = obj2;
                return af01Var18.invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                af01 af01Var19 = new af01((lnm) obj3, obj4, (byte) 18);
                af01Var19.c = (vr20) obj;
                af01Var19.d = obj2;
                return af01Var19.invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                af01 af01Var20 = new af01(obj4, (lnm) obj3, (byte) 19);
                af01Var20.c = (List) obj;
                af01Var20.d = (String) obj2;
                return af01Var20.invokeSuspend(rih1Var);
            case 20:
                af01 af01Var21 = new af01((lnm) obj3, obj4, (byte) 20);
                af01Var21.c = (vr20) obj;
                af01Var21.d = obj2;
                return af01Var21.invokeSuspend(rih1Var);
            case 21:
                af01 af01Var22 = new af01((lnm) obj3, obj4, (byte) 21);
                af01Var22.c = (vr20) obj;
                af01Var22.d = obj2;
                return af01Var22.invokeSuspend(rih1Var);
            case 22:
                af01 af01Var23 = new af01((lnm) obj3, obj4, (byte) 22);
                af01Var23.c = (vr20) obj;
                af01Var23.d = obj2;
                return af01Var23.invokeSuspend(rih1Var);
            case 23:
                af01 af01Var24 = new af01(obj4, (lnm) obj3, (byte) 23);
                af01Var24.c = (vr20) obj;
                af01Var24.d = (Throwable) obj2;
                return af01Var24.invokeSuspend(rih1Var);
            case 24:
                af01 af01Var25 = new af01((lnm) obj3, obj4, (byte) 24);
                af01Var25.c = (vr20) obj;
                af01Var25.d = obj2;
                return af01Var25.invokeSuspend(rih1Var);
            case 25:
                af01 af01Var26 = new af01((lnm) obj3, obj4, (byte) 25);
                af01Var26.c = (vr20) obj;
                af01Var26.d = obj2;
                return af01Var26.invokeSuspend(rih1Var);
            case 26:
                af01 af01Var27 = new af01((lnm) obj3, obj4, (byte) 26);
                af01Var27.c = (vr20) obj;
                af01Var27.d = obj2;
                return af01Var27.invokeSuspend(rih1Var);
            case 27:
                af01 af01Var28 = new af01(obj4, (lnm) obj3, (byte) 27);
                af01Var28.c = (String) obj;
                af01Var28.d = (String) obj2;
                return af01Var28.invokeSuspend(rih1Var);
            case 28:
                af01 af01Var29 = new af01((lnm) obj3, obj4, (byte) 28);
                af01Var29.c = (vr20) obj;
                af01Var29.d = obj2;
                return af01Var29.invokeSuspend(rih1Var);
            default:
                af01 af01Var30 = new af01((lnm) obj3, obj4, (byte) 29);
                af01Var30.c = (vr20) obj;
                af01Var30.d = obj2;
                return af01Var30.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:165:0x0434  */
    /* JADX WARN: Code duplicated, block: B:167:0x044a  */
    /* JADX WARN: Code duplicated, block: B:169:0x0450  */
    /* JADX WARN: Code duplicated, block: B:170:0x0453  */
    /* JADX WARN: Code duplicated, block: B:172:0x0456  */
    /* JADX WARN: Code duplicated, block: B:173:0x0459  */
    /* JADX WARN: Code duplicated, block: B:175:0x045c  */
    /* JADX WARN: Code duplicated, block: B:176:0x0462  */
    /* JADX WARN: Code duplicated, block: B:33:0x013a  */
    /* JADX WARN: Code duplicated, block: B:507:? A[RETURN, SYNTHETIC] */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ht20 huzVar;
        lt20 huzVar2;
        String message;
        ni41 ni41VarA;
        Object objE;
        zm81 zm81Var;
        Object objA;
        ArrayList arrayList;
        kh81 kh81Var;
        vrv0 vrv0Var;
        hh81 hh81Var;
        hh81 hh81Var2;
        tm81 tm81Var;
        boolean z;
        x010 huzVar3;
        mr20 huzVar4;
        boolean z2;
        huz huzVarU;
        huz ht20Var;
        byte b = this.a;
        evz m441Var = r6x.a;
        byte b2 = 12;
        byte b3 = 8;
        int i = 3;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj2 = this.e;
        lnm lnmVar = null;
        switch (b) {
            case 0:
                cf01 cf01Var = (cf01) obj2;
                vr20 vr20Var = (vr20) this.c;
                Object obj3 = this.d;
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
                ze01 ze01Var = (ze01) obj3;
                if (ze01Var != null) {
                    g23 g23Var = cf01Var.a;
                    UUID uuid = ze01Var.a;
                    huzVar = new ht20(new mpy0(new vd0(w361.n(awl1.d(((fyh1) g23Var.b).a).c.A(), uuid), g23Var, uuid, (byte) 9), cf01Var, ze01Var, (byte) 2), new b201(ze01Var, (lnm) null, (byte) 7));
                } else {
                    huzVar = new huz(ayh1.a, (byte) 10);
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var, huzVar, this) == d9nVar ? d9nVar : rih1Var;
            case 1:
                vr20 vr20Var2 = (vr20) this.c;
                Object obj4 = this.d;
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
                if (!((Boolean) obj4).booleanValue()) {
                    m441Var = new m441(new ian0((xl01) obj2, (lnm) null, (byte) 27));
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var2, m441Var, this) == d9nVar ? d9nVar : rih1Var;
            case 2:
                vr20 vr20Var3 = (vr20) this.c;
                Object obj5 = this.d;
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
                mr20 mr20Var = (mr20) ((zkz0) obj2).invoke();
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var3, mr20Var, this) == d9nVar ? d9nVar : rih1Var;
            case 3:
                vr20 vr20Var4 = (vr20) this.c;
                Object obj6 = this.d;
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20Var2 = (mr20) ((zkz0) obj2).invoke();
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var4, mr20Var2, this) == d9nVar ? d9nVar : rih1Var;
            case 4:
                bah1 bah1Var = (bah1) ((uy11) obj2).c;
                vr20 vr20Var5 = (vr20) this.c;
                Object obj7 = this.d;
                boolean z7 = this.b;
                if (z7) {
                    if (z7) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                q5l q5lVar = (r5l) obj7;
                if (q5lVar instanceof q5l) {
                    huzVar2 = new lt20(new rgb(bah1Var.b(q5lVar.a), (byte) 10), new q8t0(3, (lnm) null, (byte) 14), (byte) 0);
                } else if (q5lVar instanceof p5l) {
                    p5l p5lVar = (p5l) q5lVar;
                    huzVar2 = p5lVar.b ? new lt20(new rgb(bah1Var.b(p5lVar.a), (byte) 10), new q8t0(3, (lnm) null, (byte) 14), (byte) 0) : new huz(new ht61((Integer) null, 0), (byte) 10);
                } else {
                    huzVar2 = new huz(new ht61((Integer) null, 0), (byte) 10);
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var5, huzVar2, this) == d9nVar ? d9nVar : rih1Var;
            case 5:
                vr20 vr20Var6 = (vr20) this.c;
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
                vi11 vi11Var = (vi11) obj2;
                ay8 ay8VarF = d3p1.F((d0r) vi11Var.b, (o3r) vi11Var.e, (String) obj8);
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var6, ay8VarF, this) == d9nVar ? d9nVar : rih1Var;
            case 6:
                ni41 ni41Var = (ni41) this.c;
                ni41 ni41Var2 = (ni41) this.d;
                boolean z9 = this.b;
                if (!z9) {
                    hm5.M(obj);
                    ji41 ji41Var = ni41Var.a;
                    if (u890.j(ji41Var, gi41.d) || u890.j(ji41Var, gi41.e) || (ji41Var instanceof ii41) || (ji41Var instanceof hi41)) {
                        long j = 1000 - (ni41Var2.e - ni41Var.e);
                        if (j < 0) {
                            j = 0;
                        }
                        this.c = null;
                        this.d = ni41Var2;
                        this.b = true;
                        if (hap1.i(j, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (!z9) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return ni41.a(ni41Var2, null, 0L, ((ri41) obj2).a.b(), 15);
            case 7:
                gi41 gi41Var = gi41.g;
                ni41 ni41Var3 = (ni41) this.c;
                mi41 mi41Var = (mi41) this.d;
                hm5.M(obj);
                yqg yqgVar = ((ri41) obj2).a;
                long jB = yqgVar.b();
                long j2 = ni41Var3.b;
                ji41 ji41Var2 = ni41Var3.a;
                if (jB >= j2) {
                    gi41 gi41Var2 = gi41.f;
                    if (u890.j(ji41Var2, gi41Var2)) {
                        return this.b ? ni41.a(ni41Var3, gi41Var, 0L, 0L, 30) : ni41.a(ni41Var3, null, jB + 5000, 0L, 29);
                    }
                    if (!u890.j(ji41Var2, gi41Var)) {
                        return ni41.a(ni41Var3, gi41Var2, jB + 5000, jB, 12);
                    }
                } else if (!(mi41Var instanceof li41)) {
                    if (!(mi41Var instanceof ki41)) {
                        eg.o();
                        return null;
                    }
                    aj41 aj41Var = ((ki41) mi41Var).a;
                    if (aj41Var != null) {
                        gi41 gi41Var3 = gi41.e;
                        if (aj41Var instanceof wi41) {
                            ni41VarA = ni41.a(ni41Var3, gi41.c, 0L, 0L, 30);
                        } else if (aj41Var instanceof xi41) {
                            ni41VarA = ni41.a(ni41Var3, gi41.d, 0L, 0L, 30);
                        } else if (aj41Var instanceof yi41) {
                            ni41VarA = !ni41Var3.c ? ni41.a(ni41Var3, gi41Var3, yqgVar.b() + 10000, 0L, 24) : ni41.a(ni41Var3, gi41Var3, 0L, 0L, 30);
                        } else if (aj41Var instanceof zi41) {
                            zi41 zi41Var = (zi41) aj41Var;
                            ni41VarA = ni41.a(ni41Var3, new ii41(zi41Var.a, zi41Var.b), 0L, 0L, 30);
                        } else {
                            if (!(aj41Var instanceof vi41)) {
                                eg.o();
                                return null;
                            }
                            vi41 vi41Var = (vi41) aj41Var;
                            if (vi41Var instanceof ti41) {
                                message = ((ti41) aj41Var).a.getMessage();
                            } else {
                                if (!(vi41Var instanceof ui41)) {
                                    eg.o();
                                    return null;
                                }
                                message = ((ui41) aj41Var).a.getMessage();
                            }
                            ni41VarA = ni41.a(ni41Var3, new hi41(message), 0L, 0L, 30);
                        }
                        ni41 ni41VarA2 = ni41VarA;
                        if (!ni41Var3.d && ni41VarA2.a.a >= 1) {
                            ni41VarA2 = ni41VarA2.c ? ni41.a(ni41VarA2, null, 0L, 0L, 23) : ni41.a(ni41VarA2, null, yqgVar.b() + 10000, 0L, 21);
                        }
                        ni41 ni41VarA3 = ni41.a(ni41VarA2, null, 0L, yqgVar.b(), 15);
                        if (ji41Var2.a <= ni41VarA3.a.a) {
                            return ni41VarA3;
                        }
                    }
                }
                return ni41Var3;
            case 8:
                vr20 vr20Var7 = (vr20) this.c;
                Object obj9 = this.d;
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
                boolean zBooleanValue = ((Boolean) obj9).booleanValue();
                dt71 dt71Var = ((tp41) ((m7y0) obj2).b).a;
                this.c = null;
                this.d = null;
                this.b = true;
                u4p1.S(vr20Var7);
                dt71Var.collect(new od00(new ml21(vr20Var7, (byte) 18), zBooleanValue, (byte) 2), this);
                return d9nVar;
            case 9:
                vr20 vr20Var8 = (vr20) this.c;
                Object obj10 = this.d;
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
                boolean zBooleanValue2 = ((Boolean) obj10).booleanValue();
                dt71 dt71Var2 = ((hq41) obj2).a.a;
                this.c = null;
                this.d = null;
                this.b = true;
                u4p1.S(vr20Var8);
                dt71Var2.collect(new od00(vr20Var8, zBooleanValue2, (byte) 3), this);
                return d9nVar;
            case 10:
                vr20 vr20Var9 = (vr20) this.c;
                Object obj11 = this.d;
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
                this.c = null;
                this.d = null;
                this.b = true;
                u4p1.S(vr20Var9);
                Object objCollect = ((mr20) obj2).collect(new o010(new tzy0(vr20Var9, (tv80) obj11, (byte) 21), (byte) 25), this);
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                return objCollect == d9nVar ? d9nVar : rih1Var;
            case 11:
                vr20 vr20Var10 = (vr20) this.c;
                Object obj12 = this.d;
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
                m441 m441Var2 = new m441(new q721((e821) obj2, (String) obj12, (lnm) null, (byte) 7));
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var10, m441Var2, this) == d9nVar ? d9nVar : rih1Var;
            case 12:
                s551 s551Var = (s551) obj2;
                vr20 vr20Var11 = (vr20) this.c;
                Object obj13 = this.d;
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
                x751 x751Var = (x751) obj13;
                if (x751Var != null && (x751Var.c || x751Var.d != null)) {
                    m441Var = h5p1.s(s551Var.a.b(), s551Var.g, o4p1.k(h4p1.f(new lc41(s551Var, lnmVar, b2)), -1, 2), new w63(x751Var, s551Var, (lnm) null, (byte) 19));
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var11, m441Var, this) == d9nVar ? d9nVar : rih1Var;
            case 13:
                vr20 vr20Var12 = (vr20) this.c;
                Object obj14 = this.d;
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
                boolean zBooleanValue3 = ((Boolean) obj14).booleanValue();
                ArrayList<sq61> arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                for (sq61 sq61Var : arrayList2) {
                    arrayList3.add(new zo51(sq61Var.a().e(zBooleanValue3), sq61Var, (byte) 10));
                }
                jge jgeVarE = hu20.e(new z4t0((mr20[]) o7h.l1(arrayList3).toArray(new mr20[0]), (byte) 7), new i64(i, lnmVar, (byte) 29));
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var12, jgeVarE, this) == d9nVar ? d9nVar : rih1Var;
            case 14:
                vr20 vr20Var13 = (vr20) this.c;
                Object obj15 = this.d;
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
                mr20 mr20VarIsVisible = ((Boolean) obj15).booleanValue() ? ((sq61) obj2).isVisible() : new huz(Boolean.FALSE, (byte) 10);
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var13, mr20VarIsVisible, this) == d9nVar ? d9nVar : rih1Var;
            case 15:
                kv61 kv61Var = (kv61) obj2;
                String str = (String) this.c;
                boolean z17 = this.b;
                if (z17) {
                    if (!z17) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objE = obj;
                    return (wu61) objE;
                }
                hm5.M(obj);
                jgb1 jgb1Var = (sq61) this.d;
                if (jgb1Var instanceof jgb1) {
                    jgb1 jgb1Var2 = jgb1Var;
                    int i2 = kv61.r;
                    igb1 igb1Var = jgb1Var2.m;
                    if (igb1Var instanceof qxn0) {
                        return kv61.f(str, jgb1Var2, kv61Var, (w9r0) kv61Var.l.getValue(), igb1Var);
                    }
                    if (igb1Var instanceof m70) {
                        return kv61.f(str, jgb1Var2, kv61Var, (i0r0) kv61Var.m.getValue(), igb1Var);
                    }
                    if (igb1Var instanceof ibd1) {
                        return kv61.f(str, jgb1Var2, kv61Var, (igr0) kv61Var.n.getValue(), igb1Var);
                    }
                    if (igb1Var instanceof xxm0) {
                        return kv61.f(str, jgb1Var2, kv61Var, (u9r0) kv61Var.o.getValue(), igb1Var);
                    }
                    eg.o();
                } else {
                    if (jgb1Var instanceof vqo) {
                        this.c = null;
                        this.b = true;
                        int i3 = kv61.r;
                        objE = kv61Var.e((vqo) jgb1Var, str, this);
                        if (objE == d9nVar) {
                            return d9nVar;
                        }
                        return (wu61) objE;
                    }
                    eg.o();
                }
                return null;
            case 16:
                vr20 vr20Var14 = (vr20) this.c;
                Object obj16 = this.d;
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
                m441 m441Var3 = new m441(new ciw0((o671) obj2, (String) obj16, (lnm) null, (byte) 19));
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var14, m441Var3, this) == d9nVar ? d9nVar : rih1Var;
            case 17:
                vr20 vr20Var15 = (vr20) this.c;
                Object obj17 = this.d;
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
                m441 m441Var4 = new m441(new q721((w671) obj17, (im0) obj2, (lnm) null, (byte) 8));
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var15, m441Var4, this) == d9nVar ? d9nVar : rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                vr20 vr20Var16 = (vr20) this.c;
                Object obj18 = this.d;
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
                gh40 gh40Var = ((p681) obj2).a;
                List list = p681.d;
                List list2 = p681.e;
                Duration duration = p681.f;
                gh40Var.getClass();
                lnm lnmVar2 = null;
                m441 m441VarJ = z4p1.J(new m441(new lm61(new m441(new rzu(new fh40(gh40Var, list, duration, lnmVar2, (byte) 0), new fh40(gh40Var, list2, duration, lnmVar2, (byte) 1), (lnm) null, (byte) 14)), (lnm) null, (byte) 22)), new o681(3, (lnm) null, (byte) 0));
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var16, m441VarJ, this) == d9nVar ? d9nVar : rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                List list3 = (List) this.c;
                String str2 = (String) this.d;
                boolean z21 = this.b;
                if (!z21) {
                    hm5.M(obj);
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        hh81 hh81Var3 = ((kh81) ((mmr0) it.next()).b).a;
                        hh81 hh81Var4 = hh81Var3 instanceof hh81 ? hh81Var3 : null;
                        tm81 tm81Var2 = hh81Var4 != null ? hh81Var4.d : null;
                        if (tm81Var2 != null) {
                            arrayList4.add(tm81Var2);
                        }
                    }
                    if (arrayList4.isEmpty()) {
                        arrayList4 = null;
                    }
                    if (arrayList4 != null) {
                        ym81 ym81Var = ((zg81) obj2).e;
                        str2.getClass();
                        this.c = list3;
                        this.d = null;
                        this.b = true;
                        objA = ym81Var.a(str2, arrayList4, this);
                        if (objA == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        zm81Var = null;
                    }
                    List<mmr0> list4 = list3;
                    arrayList = new ArrayList(q7h.U(list4, 10));
                    for (mmr0 mmr0Var : list4) {
                        int iIntValue = ((Number) mmr0Var.a).intValue();
                        kh81Var = (kh81) mmr0Var.b;
                        if (zm81Var != null) {
                            hh81Var = kh81Var.a;
                            if (hh81Var instanceof hh81) {
                                hh81Var2 = hh81Var;
                            } else {
                                hh81Var2 = null;
                            }
                            if (hh81Var2 != null) {
                                tm81Var = hh81Var2.d;
                            } else {
                                tm81Var = null;
                            }
                            if (tm81Var != null) {
                                vrv0Var = new vrv0(zm81Var, tm81Var);
                            } else {
                                vrv0Var = null;
                            }
                        } else {
                            vrv0Var = null;
                        }
                        arrayList.add(new ug81(iIntValue, kh81Var, vrv0Var));
                    }
                    return arrayList;
                }
                if (!z21) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                objA = obj;
                zm81Var = (zm81) objA;
                List<mmr0> list5 = list3;
                arrayList = new ArrayList(q7h.U(list5, 10));
                while (r1.hasNext()) {
                    int iIntValue2 = ((Number) mmr0Var.a).intValue();
                    kh81Var = (kh81) mmr0Var.b;
                    if (zm81Var != null) {
                        hh81Var = kh81Var.a;
                        if (hh81Var instanceof hh81) {
                            hh81Var2 = hh81Var;
                        } else {
                            hh81Var2 = null;
                        }
                        if (hh81Var2 != null) {
                            tm81Var = hh81Var2.d;
                        } else {
                            tm81Var = null;
                        }
                        if (tm81Var != null) {
                            vrv0Var = new vrv0(zm81Var, tm81Var);
                        } else {
                            vrv0Var = null;
                        }
                    } else {
                        vrv0Var = null;
                    }
                    arrayList.add(new ug81(iIntValue2, kh81Var, vrv0Var));
                }
                return arrayList;
            case 20:
                vr20 vr20Var17 = (vr20) this.c;
                Object obj19 = this.d;
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
                xe01 huzVar5 = ((Boolean) obj19).booleanValue() ? ((fh81) obj2).q1 : new huz(Boolean.FALSE, (byte) 10);
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var17, huzVar5, this) == d9nVar ? d9nVar : rih1Var;
            case 21:
                vr20 vr20Var18 = (vr20) this.c;
                Object obj20 = this.d;
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
                String str3 = (String) obj20;
                v5n v5nVar = (v5n) ((pt) obj2).f;
                str3.getClass();
                ezc ezcVarG = yoi1.g(v5nVar.c(str3));
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var18, ezcVarG, this) == d9nVar ? d9nVar : rih1Var;
            case 22:
                vr20 vr20Var19 = (vr20) this.c;
                Object obj21 = this.d;
                boolean z24 = this.b;
                if (z24) {
                    if (z24) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                String str4 = (String) obj21;
                v5n v5nVar2 = (v5n) ((res) obj2).e;
                str4.getClass();
                ezc ezcVarG2 = yoi1.g(v5nVar2.c(str4));
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var19, ezcVarG2, this) == d9nVar ? d9nVar : rih1Var;
            case 23:
                ev81 ev81Var = (ev81) obj2;
                vr20 vr20Var20 = (vr20) this.c;
                Throwable th = (Throwable) this.d;
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
                if (!(th instanceof pq8) && !(th instanceof WebgateTokenProvider.WebgateTokenException)) {
                    throw th;
                }
                ezc ezcVarF = h4p1.f(new uk71(ev81Var, ev81Var.d.b(true), (lnm) null, (byte) 13));
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var20, ezcVarF, this) == d9nVar ? d9nVar : rih1Var;
            case 24:
                o791 o791Var = (o791) obj2;
                vr20 vr20Var21 = (vr20) this.c;
                Object obj22 = this.d;
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
                ContextTrack contextTrack = (ContextTrack) obj22;
                contextTrack.getClass();
                if (!l4o1.P(contextTrack) || l4o1.U(contextTrack)) {
                    z = true;
                    huzVar3 = new huz(i791.a, (byte) 10);
                } else {
                    String strUri = contextTrack.uri();
                    z = true;
                    huzVar3 = new x010(new ph11(yoi1.g(o791Var.a.b(new oi("nowplaying-smart-skip", false, new fki0(strUri, (byte) 27))).map(new gap1(strUri, (byte) 13)).onErrorReturnItem(new t8p0()).distinctUntilChanged()), (byte) 8), new m441(new q721(o791Var, contextTrack.uri(), (lnm) null, (byte) 11)), new lag0(o791Var, lnmVar, b3), (byte) 1);
                }
                this.c = null;
                this.d = null;
                this.b = z;
                return l4p1.s(vr20Var21, huzVar3, this) == d9nVar ? d9nVar : rih1Var;
            case 25:
                r961 r961Var = (r961) obj2;
                vr20 vr20Var22 = (vr20) this.c;
                Object obj23 = this.d;
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
                if (((Boolean) obj23).booleanValue()) {
                    v3u0 v3u0Var = ((p4u0) r961Var.d).b;
                    m4u0 m4u0VarP = PlaybackSettingsEsperantoService.StreamSettingChangesRequest.p();
                    m4u0VarP.q(c4u0.h);
                    huzVar4 = rqt0.u(new rgb(new ht20(new uop0(yoi1.g(v3u0Var.callStream("spotify.playback_settings.esperanto.proto.PlaybackSettings", "StreamSettingChanges", m4u0VarP.build()).map(b610.Y0)), (byte) 15), new q721(r961Var, (lnm) null, (byte) 12)), (byte) 11));
                } else {
                    huzVar4 = new huz(Boolean.TRUE, (byte) 10);
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var22, huzVar4, this) == d9nVar ? d9nVar : rih1Var;
            case 26:
                vr20 vr20Var23 = (vr20) this.c;
                Object obj24 = this.d;
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
                String str5 = (String) obj24;
                huz huzVar6 = ihc1.y0(str5) ? new huz(wca1.a, (byte) 10) : new m441(new ciw0((dda1) obj2, str5, (lnm) null, (byte) 24));
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var23, huzVar6, this) == d9nVar ? d9nVar : rih1Var;
            case 27:
                return e(obj);
            case 28:
                return g(obj);
            default:
                gfb1 gfb1Var = (gfb1) obj2;
                vr20 vr20Var24 = (vr20) this.c;
                Object obj25 = this.d;
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
                yeb1 yeb1Var = (yeb1) obj25;
                List list6 = yeb1Var.a;
                ArrayList arrayList5 = new ArrayList(q7h.U(list6, 10));
                Iterator it2 = list6.iterator();
                while (it2.hasNext()) {
                    arrayList5.add(((qpc1) it2.next()).b);
                }
                ArrayList arrayList6 = new ArrayList();
                for (Object obj26 : arrayList5) {
                    if (!ihc1.y0((String) obj26)) {
                        arrayList6.add(obj26);
                    }
                }
                List listJ0 = o7h.j0(arrayList6);
                if (!listJ0.isEmpty()) {
                    d0r d0rVar = gfb1Var.e;
                    if (d0rVar != null) {
                        ht20Var = new lt20(new ht20(new mpy0(new cly0(d3p1.G(d0rVar, i13.b, new m13(listJ0)), (byte) 12), yeb1Var, listJ0, (byte) 15), new sb91(yeb1Var, (lnm) null, (byte) 21)), new afb1(yeb1Var, (lnm) null, (byte) 0), (byte) 0);
                    } else {
                        l13 l13Var = (l13) gfb1Var.d.getValue();
                        l13Var.getClass();
                        byte b4 = 4;
                        if (listJ0.isEmpty()) {
                            huzVarU = new huz(b7x.a, (byte) 10);
                            z2 = true;
                        } else {
                            z2 = true;
                            huzVarU = rqt0.u(new lt20(new gk(new nf(yoi1.g(l13Var.a.b(new oi("ai-persona-playlist-row-subtitle", false, new s6(listJ0, (byte) 4)))), (byte) 8), listJ0, (byte) 17), new rf2(3, (lnm) null, (byte) 1), (byte) 0));
                        }
                        ht20Var = new ht20(new a1b1(new fu20(huzVarU, new ku91(gfb1Var, listJ0, lnmVar, b4), z2 ? (byte) 1 : (byte) 0), yeb1Var, (byte) 3), new bfb1(gfb1Var, yeb1Var, (lnm) null, (byte) 0));
                    }
                    this.c = null;
                    this.d = null;
                    this.b = z2;
                    if (l4p1.s(vr20Var24, ht20Var, this) == d9nVar) {
                        return d9nVar;
                    }
                    return rih1Var;
                }
                ht20Var = new huz(yeb1Var, (byte) 10);
                z2 = true;
                this.c = null;
                this.d = null;
                this.b = z2;
                if (l4p1.s(vr20Var24, ht20Var, this) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ af01(lnm lnmVar, Object obj, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af01(ri41 ri41Var, boolean z, lnm lnmVar) {
        super(3, lnmVar);
        this.a = (byte) 7;
        this.e = ri41Var;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ af01(Object obj, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.e = obj;
    }
}
