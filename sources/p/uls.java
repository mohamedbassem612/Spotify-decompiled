package p;

import android.content.Intent;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uls extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public /* synthetic */ Object d;
    public /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uls(boolean z, o860 o860Var, lnm lnmVar) {
        super(3, lnmVar);
        this.a = (byte) 29;
        this.b = z;
        this.e = o860Var;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x016d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0171  */
    /* JADX WARN: Code duplicated, block: B:69:0x0175  */
    /* JADX WARN: Code duplicated, block: B:71:0x017b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x017d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0190  */
    /* JADX WARN: Code duplicated, block: B:81:0x0197  */
    /* JADX WARN: Code duplicated, block: B:83:0x019f  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x01a8 A[SYNTHETIC] */
    private final Object e(Object obj) {
        int i;
        Object y640Var;
        mq70 mq70Var;
        up70 up70VarA;
        Object x640Var;
        String str;
        l1z l1zVar;
        Object y640Var2;
        jo70 jo70Var;
        z440 z440Var;
        String str2;
        mq70 mq70Var2;
        up70 up70VarA2;
        boolean z = this.b;
        uv00 uv00Var = (uv00) this.c;
        hm5.M(obj);
        Set set = (Set) this.d;
        int iS = zno1.s(q7h.U(set, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj2 : set) {
            s640 s640Var = (s640) obj2;
            String str3 = s640Var.b;
            String str4 = s640Var.a;
            linkedHashMap.put(obj2, new h740(str3 != null ? (l1z) uv00Var.a(l1z.class, str3).b : null, uv00Var.a(jo70.class, str4).b, uv00Var.a(w281.class, str4).b, uv00Var.a(sdy.class, str4).b, uv00Var.a(xkk1.class, str4).b));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            s640 s640Var2 = (s640) entry.getKey();
            h740 h740Var = (h740) entry.getValue();
            sdy sdyVar = h740Var.d;
            xkk1 xkk1Var = h740Var.e;
            w281 w281Var = h740Var.c;
            if (sdyVar == null || (i = sdyVar.a) == 0) {
                i = 1;
            }
            vp70 vp70Var = vp70.d;
            Object obj3 = b740.a;
            if (i == 2 && z) {
                y640Var = new w640(w281Var != null ? w281Var.l : false);
            } else {
                if (w281Var != null) {
                    o281 o281Var = w281Var.a;
                    boolean z2 = w281Var.l;
                    if (w281Var.c) {
                        z = z;
                        y640Var = obj3;
                    } else {
                        if (o281Var instanceof o281) {
                            x640Var = new z640(o281Var.c, z2);
                        } else if ((o281Var instanceof k281) && ((k281) o281Var).f != null) {
                            y640Var = new c740(z2);
                        } else if (o281Var instanceof m281) {
                            m281 m281Var = (m281) o281Var;
                            x640Var = new x640(m281Var.c, m281Var.d, z2);
                        } else {
                            n281 n281Var = o281Var instanceof n281 ? (n281) o281Var : null;
                            y640Var = new y640(n281Var != null ? new y440(n281Var.c, n281Var.d, n281Var.e, (xkk1Var == null || (mq70Var = xkk1Var.a) == null || (up70VarA = mq70Var.a(vp70Var)) == null) ? null : up70VarA.a.a, n281Var.f, n281Var.g, n281Var.h, n281Var.i) : null, z2);
                        }
                        z = z;
                        y640Var = x640Var;
                    }
                } else {
                    z = z;
                    y640Var = a740.a;
                }
                if (y640Var.equals(obj3)) {
                    str = s640Var2.b;
                    if (str == null) {
                        l1zVar = h740Var.a;
                        if (l1zVar != null) {
                            jo70Var = h740Var.b;
                            if (l1zVar.e) {
                                if (jo70Var != null) {
                                    String str5 = jo70Var.a;
                                    if (xkk1Var != null || (mq70Var2 = xkk1Var.a) == null || (up70VarA2 = mq70Var2.a(vp70Var)) == null) {
                                        str2 = null;
                                    } else {
                                        str2 = up70VarA2.a.a;
                                    }
                                    z440Var = new z440(str5, str5, str2, str);
                                } else {
                                    z440Var = null;
                                }
                                y640Var2 = new y640(z440Var, true);
                            } else {
                                y640Var2 = obj3;
                            }
                        } else {
                            y640Var2 = null;
                        }
                        if (y640Var2 == null) {
                            obj3 = y640Var2;
                        }
                    }
                } else {
                    obj3 = y640Var;
                }
                linkedHashMap2.put(key, obj3);
                z = z;
            }
            z = z;
            if (y640Var.equals(obj3)) {
                str = s640Var2.b;
                if (str == null) {
                    l1zVar = h740Var.a;
                    if (l1zVar != null) {
                        jo70Var = h740Var.b;
                        if (l1zVar.e) {
                            if (jo70Var != null) {
                                String str6 = jo70Var.a;
                                if (xkk1Var != null) {
                                    str2 = null;
                                } else {
                                    str2 = null;
                                }
                                z440Var = new z440(str6, str6, str2, str);
                            } else {
                                z440Var = null;
                            }
                            y640Var2 = new y640(z440Var, true);
                        } else {
                            y640Var2 = obj3;
                        }
                    } else {
                        y640Var2 = null;
                    }
                    if (y640Var2 == null) {
                        obj3 = y640Var2;
                    }
                }
            } else {
                obj3 = y640Var;
            }
            linkedHashMap2.put(key, obj3);
            z = z;
        }
        return linkedHashMap2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0056  */
    private final Object g(Object obj) {
        lt20 huzVar;
        vr20 vr20Var = (vr20) this.c;
        Object obj2 = this.d;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            uh80 uh80Var = (uh80) obj2;
            if (((w6x) ((idd1) ((h72) this.e).t).getValue()) != null) {
                Set set = s4b1.f;
                if (uic.x(uh80Var.b).u()) {
                    huzVar = new lt20(new x880(new huz((Object) null, (byte) 10), uh80Var, (byte) 1), new ew0(uh80Var, (lnm) null, (byte) 26), (byte) 0);
                } else {
                    huzVar = new huz(uh80Var, (byte) 10);
                }
            } else {
                huzVar = new huz(uh80Var, (byte) 10);
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

    private final Object h(Object obj) {
        ht20 ht20Var;
        mr20 mr20Var = ((ax80) this.e).c;
        vr20 vr20Var = (vr20) this.c;
        Object obj2 = this.d;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            dx80 dx80Var = (dx80) obj2;
            if (dx80Var instanceof bx80) {
                ht20Var = new ht20(mr20Var, new afv(2, (lnm) null, (byte) 24), (byte) 2);
            } else {
                ht20Var = dx80Var instanceof cx80 ? new ht20(mr20Var, new afv(2, (lnm) null, (byte) 25), (byte) 2) : r6x.a;
            }
            this.c = null;
            this.d = null;
            this.b = true;
            Object objS = l4p1.s(vr20Var, ht20Var, this);
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
        vr20 vr20Var = (vr20) this.c;
        Object obj2 = this.d;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            m441 m441Var = new m441(new xtz((qwc) obj2, (t290) this.e, (lnm) null, (byte) 15));
            this.c = null;
            this.d = null;
            this.b = true;
            Object objS = l4p1.s(vr20Var, m441Var, this);
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

    private final Object j(Object obj) {
        vr20 vr20Var = (vr20) this.c;
        Object obj2 = this.d;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            Set set = (Set) obj2;
            huz huzVar = set.isEmpty() ? new huz(b7x.a, (byte) 10) : new lt20(new m441(new xtz(set, (ye90) this.e, (lnm) null, (byte) 16)), new ew0(set, (lnm) null, (byte) 28), (byte) 0);
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

    private final Object m(Object obj) {
        o860 o860Var = (o860) this.e;
        vr20 vr20Var = (vr20) this.c;
        Object obj2 = this.d;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            mr20 x72Var = new x72(new any(d5p1.h(((p5a0) o860Var.b).c), (byte) 18), (byte) 27);
            d6c d6cVar = (d6c) o860Var.c;
            kge kgeVarD = hu20.d(new mr20[]{x72Var, new zx60(yoi1.g(d6cVar.a.b("social-connect/v2/broadcast_status_update", new qka(d6cVar))), (byte) 6)});
            dvl1 dvl1Var = new dvl1(0L, (Object) null);
            huz huzVar = new huz(new ir9(z4p1.v(new ipr(new mmr0(dvl1Var, dvl1Var), new h6a(kgeVarD, (byte) 6), new mnl(3, (lnm) null, (byte) 23), (byte) 16), 1), (byte) 4), (byte) 1);
            k9r k9rVar = (k9r) o860Var.e;
            mr20 mr20VarU = rqt0.u(new x010(huzVar, new x010(((zwz0) k9rVar.b).b(), ((her) k9rVar.c).a(), new ew0(k9rVar, (lnm) null, (byte) 16), (byte) 1), new uls(zBooleanValue, o860Var, (lnm) null), (byte) 1));
            this.c = null;
            this.d = null;
            this.b = true;
            Object objS = l4p1.s(vr20Var, mr20VarU, this);
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

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                uls ulsVar = new uls(this.d, this.e, (lnm) obj3, (byte) (objArr == true ? 1 : 0));
                ulsVar.b = zBooleanValue;
                ulsVar.c = (nls) obj2;
                return ulsVar.invokeSuspend(rih1Var);
            case 1:
                uls ulsVar2 = new uls(this.e, (lnm) obj3, (byte) 1);
                ulsVar2.d = (km61) obj;
                return ulsVar2.invokeSuspend(rih1Var);
            case 2:
                uls ulsVar3 = new uls((lnm) obj3, this.e, (byte) 2);
                ulsVar3.c = (vr20) obj;
                ulsVar3.d = obj2;
                return ulsVar3.invokeSuspend(rih1Var);
            case 3:
                uls ulsVar4 = new uls(this.e, (lnm) obj3, (byte) 3);
                ulsVar4.c = (vr20) obj;
                ulsVar4.d = (x5s0) obj2;
                return ulsVar4.invokeSuspend(rih1Var);
            case 4:
                uls ulsVar5 = new uls((lnm) obj3, this.e, (byte) 4);
                ulsVar5.c = (vr20) obj;
                ulsVar5.d = (Object[]) obj2;
                return ulsVar5.invokeSuspend(rih1Var);
            case 5:
                uls ulsVar6 = new uls((lnm) obj3, this.e, (byte) 5);
                ulsVar6.c = (vr20) obj;
                ulsVar6.d = obj2;
                return ulsVar6.invokeSuspend(rih1Var);
            case 6:
                uls ulsVar7 = new uls((lnm) obj3, this.e, (byte) 6);
                ulsVar7.c = (vr20) obj;
                ulsVar7.d = obj2;
                return ulsVar7.invokeSuspend(rih1Var);
            case 7:
                uls ulsVar8 = new uls((lnm) obj3, this.e, (byte) 7);
                ulsVar8.c = (vr20) obj;
                ulsVar8.d = obj2;
                return ulsVar8.invokeSuspend(rih1Var);
            case 8:
                uls ulsVar9 = new uls(this.d, (boolean) (objArr2 == true ? 1 : 0), (lnm) obj3, (byte) 8);
                ulsVar9.e = (String) obj;
                ulsVar9.c = (String) obj2;
                return ulsVar9.invokeSuspend(rih1Var);
            case 9:
                uls ulsVar10 = new uls(this.d, (boolean) (objArr3 == true ? 1 : 0), (lnm) obj3, (byte) 9);
                ulsVar10.e = (String) obj;
                ulsVar10.c = (String) obj2;
                return ulsVar10.invokeSuspend(rih1Var);
            case 10:
                uls ulsVar11 = new uls(this.d, z, (lnm) obj3, (byte) 10);
                ulsVar11.e = (String) obj;
                ulsVar11.c = (String) obj2;
                return ulsVar11.invokeSuspend(rih1Var);
            case 11:
                uls ulsVar12 = new uls(this.e, (lnm) obj3, (byte) 11);
                ulsVar12.c = (Intent) obj;
                ulsVar12.d = (th61) obj2;
                return ulsVar12.invokeSuspend(rih1Var);
            case 12:
                uls ulsVar13 = new uls(this.e, (lnm) obj3, (byte) 12);
                ulsVar13.c = (vr20) obj;
                ulsVar13.d = (Throwable) obj2;
                return ulsVar13.invokeSuspend(rih1Var);
            case 13:
                uls ulsVar14 = new uls(this.e, (lnm) obj3, (byte) 13);
                ulsVar14.c = (vr20) obj;
                ulsVar14.d = (Throwable) obj2;
                return ulsVar14.invokeSuspend(rih1Var);
            case 14:
                uls ulsVar15 = new uls((lnm) obj3, this.e, (byte) 14);
                ulsVar15.c = (vr20) obj;
                ulsVar15.d = obj2;
                return ulsVar15.invokeSuspend(rih1Var);
            case 15:
                uls ulsVar16 = new uls((lnm) obj3, this.e, (byte) 15);
                ulsVar16.c = (vr20) obj;
                ulsVar16.d = obj2;
                return ulsVar16.invokeSuspend(rih1Var);
            case 16:
                uls ulsVar17 = new uls((lnm) obj3, this.e, (byte) 16);
                ulsVar17.c = (vr20) obj;
                ulsVar17.d = obj2;
                return ulsVar17.invokeSuspend(rih1Var);
            case 17:
                uls ulsVar18 = new uls((lnm) obj3, this.e, (byte) 17);
                ulsVar18.c = (vr20) obj;
                ulsVar18.d = obj2;
                return ulsVar18.invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                uls ulsVar19 = new uls((lnm) obj3, this.e, (byte) 18);
                ulsVar19.c = (vr20) obj;
                ulsVar19.d = obj2;
                return ulsVar19.invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                uls ulsVar20 = new uls((lnm) obj3, this.e, (byte) 19);
                ulsVar20.c = (vr20) obj;
                ulsVar20.d = obj2;
                return ulsVar20.invokeSuspend(rih1Var);
            case 20:
                uls ulsVar21 = new uls((lnm) obj3, this.e, (byte) 20);
                ulsVar21.c = (vr20) obj;
                ulsVar21.d = obj2;
                return ulsVar21.invokeSuspend(rih1Var);
            case 21:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                uls ulsVar22 = new uls(this.d, this.e, (lnm) obj3, (byte) 21);
                ulsVar22.b = zBooleanValue2;
                ulsVar22.c = (uv00) obj2;
                return ulsVar22.invokeSuspend(rih1Var);
            case 22:
                uls ulsVar23 = new uls((lnm) obj3, this.e, (byte) 22);
                ulsVar23.c = (vr20) obj;
                ulsVar23.d = obj2;
                return ulsVar23.invokeSuspend(rih1Var);
            case 23:
                uls ulsVar24 = new uls((lnm) obj3, this.e, (byte) 23);
                ulsVar24.c = (vr20) obj;
                ulsVar24.d = obj2;
                return ulsVar24.invokeSuspend(rih1Var);
            case 24:
                uls ulsVar25 = new uls((lnm) obj3, this.e, (byte) 24);
                ulsVar25.c = (vr20) obj;
                ulsVar25.d = obj2;
                return ulsVar25.invokeSuspend(rih1Var);
            case 25:
                uls ulsVar26 = new uls((lnm) obj3, this.e, (byte) 25);
                ulsVar26.c = (vr20) obj;
                ulsVar26.d = obj2;
                return ulsVar26.invokeSuspend(rih1Var);
            case 26:
                uls ulsVar27 = new uls((lnm) obj3, this.e, (byte) 26);
                ulsVar27.c = (vr20) obj;
                ulsVar27.d = obj2;
                return ulsVar27.invokeSuspend(rih1Var);
            case 27:
                uls ulsVar28 = new uls((lnm) obj3, this.e, (byte) 27);
                ulsVar28.c = (vr20) obj;
                ulsVar28.d = obj2;
                return ulsVar28.invokeSuspend(rih1Var);
            case 28:
                uls ulsVar29 = new uls((lnm) obj3, this.e, (byte) 28);
                ulsVar29.c = (vr20) obj;
                ulsVar29.d = obj2;
                return ulsVar29.invokeSuspend(rih1Var);
            default:
                uls ulsVar30 = new uls(this.b, (o860) this.e, (lnm) obj3);
                ulsVar30.c = (tpt) obj;
                ulsVar30.d = (s5c) obj2;
                return ulsVar30.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r7v38 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v38 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v38 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v38 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v40 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v40 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v42 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v42 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v44 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v44 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v46 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v46 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v48 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v48 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v49 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v49 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v51 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v51 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v38 ??, new type: char
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) {
        /*
            Method dump skipped, instruction units count: 3430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.uls.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uls(Object obj, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uls(Object obj, boolean z, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uls(lnm lnmVar, Object obj, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uls(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
    }
}
