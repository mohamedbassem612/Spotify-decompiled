package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qjr extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qjr(boolean z, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 17;
        this.b = z;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                qjr qjrVar = new qjr(2, lnmVar, (byte) 0);
                qjrVar.c = obj;
                return qjrVar;
            case 1:
                qjr qjrVar2 = new qjr(2, lnmVar, (byte) 1);
                qjrVar2.c = obj;
                return qjrVar2;
            case 2:
                qjr qjrVar3 = new qjr(2, lnmVar, (byte) 2);
                qjrVar3.c = obj;
                return qjrVar3;
            case 3:
                qjr qjrVar4 = new qjr(2, lnmVar, (byte) 3);
                qjrVar4.c = obj;
                return qjrVar4;
            case 4:
                qjr qjrVar5 = new qjr(2, lnmVar, (byte) 4);
                qjrVar5.c = obj;
                return qjrVar5;
            case 5:
                qjr qjrVar6 = new qjr(2, lnmVar, (byte) 5);
                qjrVar6.c = obj;
                return qjrVar6;
            case 6:
                qjr qjrVar7 = new qjr(2, lnmVar, (byte) 6);
                qjrVar7.c = obj;
                return qjrVar7;
            case 7:
                qjr qjrVar8 = new qjr(2, lnmVar, (byte) 7);
                qjrVar8.c = obj;
                return qjrVar8;
            case 8:
                qjr qjrVar9 = new qjr(2, lnmVar, (byte) 8);
                qjrVar9.c = obj;
                return qjrVar9;
            case 9:
                qjr qjrVar10 = new qjr(2, lnmVar, (byte) 9);
                qjrVar10.c = obj;
                return qjrVar10;
            case 10:
                qjr qjrVar11 = new qjr(2, lnmVar, (byte) 10);
                qjrVar11.c = obj;
                return qjrVar11;
            case 11:
                qjr qjrVar12 = new qjr(2, lnmVar, (byte) 11);
                qjrVar12.c = obj;
                return qjrVar12;
            case 12:
                qjr qjrVar13 = new qjr(2, lnmVar, (byte) 12);
                qjrVar13.c = obj;
                return qjrVar13;
            case 13:
                qjr qjrVar14 = new qjr(2, lnmVar, (byte) 13);
                qjrVar14.c = obj;
                return qjrVar14;
            case 14:
                qjr qjrVar15 = new qjr(2, lnmVar, (byte) 14);
                qjrVar15.c = obj;
                return qjrVar15;
            case 15:
                qjr qjrVar16 = new qjr(2, lnmVar, (byte) 15);
                qjrVar16.c = obj;
                return qjrVar16;
            case 16:
                qjr qjrVar17 = new qjr(2, lnmVar, (byte) 16);
                qjrVar17.c = obj;
                return qjrVar17;
            case 17:
                qjr qjrVar18 = new qjr(this.b, lnmVar);
                qjrVar18.c = obj;
                return qjrVar18;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                qjr qjrVar19 = new qjr(2, lnmVar, (byte) 18);
                qjrVar19.c = obj;
                return qjrVar19;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                qjr qjrVar20 = new qjr(2, lnmVar, (byte) 19);
                qjrVar20.c = obj;
                return qjrVar20;
            case 20:
                qjr qjrVar21 = new qjr(2, lnmVar, (byte) 20);
                qjrVar21.c = obj;
                return qjrVar21;
            case 21:
                qjr qjrVar22 = new qjr(2, lnmVar, (byte) 21);
                qjrVar22.c = obj;
                return qjrVar22;
            case 22:
                qjr qjrVar23 = new qjr(2, lnmVar, (byte) 22);
                qjrVar23.c = obj;
                return qjrVar23;
            case 23:
                qjr qjrVar24 = new qjr(2, lnmVar, (byte) 23);
                qjrVar24.c = obj;
                return qjrVar24;
            case 24:
                qjr qjrVar25 = new qjr(2, lnmVar, (byte) 24);
                qjrVar25.c = obj;
                return qjrVar25;
            case 25:
                qjr qjrVar26 = new qjr(2, lnmVar, (byte) 25);
                qjrVar26.c = obj;
                return qjrVar26;
            case 26:
                qjr qjrVar27 = new qjr(2, lnmVar, (byte) 26);
                qjrVar27.c = obj;
                return qjrVar27;
            case 27:
                qjr qjrVar28 = new qjr(2, lnmVar, (byte) 27);
                qjrVar28.c = obj;
                return qjrVar28;
            case 28:
                qjr qjrVar29 = new qjr(2, lnmVar, (byte) 28);
                qjrVar29.c = obj;
                return qjrVar29;
            default:
                qjr qjrVar30 = new qjr(2, lnmVar, (byte) 29);
                qjrVar30.c = obj;
                return qjrVar30;
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
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((d0r) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 17:
                return create((Boolean) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
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

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        z6x z6xVar = z6x.a;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                vr20 vr20Var = (vr20) this.c;
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                lkb lkbVar = new lkb(false);
                this.c = null;
                this.b = true;
                return vr20Var.emit(lkbVar, this) == d9nVar ? d9nVar : rih1Var;
            case 1:
                vr20 vr20Var2 = (vr20) this.c;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    return vr20Var2.emit(z6xVar, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z2) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                vr20 vr20Var3 = (vr20) this.c;
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    return vr20Var3.emit((Object) null, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z3) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                vr20 vr20Var4 = (vr20) this.c;
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    return vr20Var4.emit(z6xVar, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z4) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                vr20 vr20Var5 = (vr20) this.c;
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
                Boolean bool = Boolean.FALSE;
                this.c = null;
                this.b = true;
                return vr20Var5.emit(bool, this) == d9nVar ? d9nVar : rih1Var;
            case 5:
                vr20 vr20Var6 = (vr20) this.c;
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    return vr20Var6.emit((Object) null, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z6) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                vr20 vr20Var7 = (vr20) this.c;
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
                Long l = new Long(-1L);
                this.c = null;
                this.b = true;
                return vr20Var7.emit(l, this) == d9nVar ? d9nVar : rih1Var;
            case 7:
                vr20 vr20Var8 = (vr20) this.c;
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
                Long l2 = new Long(-1L);
                this.c = null;
                this.b = true;
                return vr20Var8.emit(l2, this) == d9nVar ? d9nVar : rih1Var;
            case 8:
                vr20 vr20Var9 = (vr20) this.c;
                boolean z9 = this.b;
                if (!z9) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    return vr20Var9.emit((Object) null, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z9) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                d0r d0rVar = (d0r) this.c;
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
                pwc0 pwc0Var = pwc0.D;
                cz51 cz51Var = new cz51();
                this.c = null;
                this.b = true;
                d0rVar.getClass();
                return d0r.d(d0rVar, pwc0Var, rih1Var, cz51Var, this) == d9nVar ? d9nVar : rih1Var;
            case 10:
                vr20 vr20Var10 = (vr20) this.c;
                boolean z11 = this.b;
                if (!z11) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    return vr20Var10.emit((Object) null, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z11) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                vr20 vr20Var11 = (vr20) this.c;
                boolean z12 = this.b;
                if (!z12) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    return vr20Var11.emit(z6xVar, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z12) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                vr20 vr20Var12 = (vr20) this.c;
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
                Boolean bool2 = Boolean.TRUE;
                this.c = null;
                this.b = true;
                return vr20Var12.emit(bool2, this) == d9nVar ? d9nVar : rih1Var;
            case 13:
                vr20 vr20Var13 = (vr20) this.c;
                boolean z14 = this.b;
                if (!z14) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    return vr20Var13.emit((Object) null, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z14) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                vr20 vr20Var14 = (vr20) this.c;
                boolean z15 = this.b;
                if (!z15) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    return vr20Var14.emit((Object) null, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z15) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                vr20 vr20Var15 = (vr20) this.c;
                boolean z16 = this.b;
                if (!z16) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    return vr20Var15.emit(w7x.a, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z16) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 16:
                vr20 vr20Var16 = (vr20) this.c;
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
                PlayerState playerState = PlayerState.EMPTY;
                this.c = null;
                this.b = true;
                return vr20Var16.emit(playerState, this) == d9nVar ? d9nVar : rih1Var;
            case 17:
                Boolean bool3 = (Boolean) this.c;
                hm5.M(obj);
                return Boolean.valueOf(u890.j(bool3, Boolean.valueOf(this.b)));
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                vr20 vr20Var17 = (vr20) this.c;
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
                Float f = new Float(0.0f);
                this.c = null;
                this.b = true;
                return vr20Var17.emit(f, this) == d9nVar ? d9nVar : rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                vr20 vr20Var18 = (vr20) this.c;
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
                Boolean bool4 = Boolean.FALSE;
                this.c = null;
                this.b = true;
                return vr20Var18.emit(bool4, this) == d9nVar ? d9nVar : rih1Var;
            case 20:
                vr20 vr20Var19 = (vr20) this.c;
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
                Boolean bool5 = Boolean.FALSE;
                this.c = null;
                this.b = true;
                return vr20Var19.emit(bool5, this) == d9nVar ? d9nVar : rih1Var;
            case 21:
                vr20 vr20Var20 = (vr20) this.c;
                boolean z21 = this.b;
                if (!z21) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    return vr20Var20.emit(rih1Var, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z21) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 22:
                vr20 vr20Var21 = (vr20) this.c;
                boolean z22 = this.b;
                if (!z22) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    return vr20Var21.emit(b7xVar, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z22) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 23:
                vr20 vr20Var22 = (vr20) this.c;
                boolean z23 = this.b;
                if (!z23) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    return vr20Var22.emit(b7xVar, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z23) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 24:
                vr20 vr20Var23 = (vr20) this.c;
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
                j5q0 j5q0Var = new j5q0(false);
                this.c = null;
                this.b = true;
                return vr20Var23.emit(j5q0Var, this) == d9nVar ? d9nVar : rih1Var;
            case 25:
                vr20 vr20Var24 = (vr20) this.c;
                boolean z25 = this.b;
                if (!z25) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    return vr20Var24.emit(j1r.a, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z25) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 26:
                vr20 vr20Var25 = (vr20) this.c;
                boolean z26 = this.b;
                if (!z26) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    return vr20Var25.emit(px3.a, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z26) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 27:
                vr20 vr20Var26 = (vr20) this.c;
                boolean z27 = this.b;
                if (!z27) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    return vr20Var26.emit(b7xVar, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z27) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 28:
                vr20 vr20Var27 = (vr20) this.c;
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
                PlayerState playerState2 = PlayerState.EMPTY;
                this.c = null;
                this.b = true;
                return vr20Var27.emit(playerState2, this) == d9nVar ? d9nVar : rih1Var;
            default:
                vr20 vr20Var28 = (vr20) this.c;
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
                Boolean bool6 = Boolean.FALSE;
                this.c = null;
                this.b = true;
                return vr20Var28.emit(bool6, this) == d9nVar ? d9nVar : rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qjr(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qjr() {
        super(2, (lnm) null);
        this.a = (byte) 15;
    }
}
