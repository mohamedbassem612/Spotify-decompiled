package p;

import android.content.Intent;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.atv_remote.esperanto.proto.AtvRemoteServiceOuterClass;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.completable.CompletableObserveOn;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qt extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qt(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
    }

    private final Object e(Object obj) {
        huz c64Var;
        it8 it8Var = (it8) this.e;
        vr20 vr20Var = (vr20) this.c;
        Object obj2 = this.d;
        boolean z = this.b;
        lnm lnmVar = null;
        if (!z) {
            hm5.M(obj);
            List list = (List) obj2;
            zo8 zo8Var = (zo8) it8Var.c;
            List list2 = list;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((lvy) it.next()).a);
            }
            byte b = 24;
            if (arrayList.isEmpty()) {
                c64Var = new huz(b7x.a, (byte) 10);
            } else {
                c64Var = new c64(yoi1.g(zo8Var.a.b(new oi("byom", false, new ib5(arrayList, (byte) 5)))), zo8Var, (byte) 24);
            }
            lt20 lt20Var = new lt20(new vd0(c64Var, it8Var, list, (byte) 14), new qt(it8Var, list, lnmVar, b), (byte) 0);
            this.c = null;
            this.d = null;
            this.b = true;
            Object objS = l4p1.s(vr20Var, lt20Var, this);
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
        vr20 vr20Var = (vr20) this.c;
        Throwable th = (Throwable) this.d;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            Logger.d("Reachability monitoring error", new Object[]{th});
            swz0 swz0Var = ((yma) this.e).c;
            this.c = null;
            this.d = null;
            this.b = true;
            Object objEmit = vr20Var.emit(swz0Var, this);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
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
        vr20 vr20Var = (vr20) this.c;
        Throwable th = (Throwable) this.d;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            Logger.d("Reachability monitoring error", new Object[]{th});
            swz0 swz0Var = ((noa) this.e).D1;
            this.c = null;
            this.d = null;
            this.b = true;
            Object objEmit = vr20Var.emit(swz0Var, this);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
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
        bge huzVar;
        vr20 vr20Var = (vr20) this.c;
        Object obj2 = this.d;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            if (((Boolean) obj2).booleanValue()) {
                oua ouaVar = (oua) this.e;
                int i = oua.g;
                huzVar = h4p1.g(new nua(ouaVar, (lnm) null, (byte) 0));
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

    private final Object j(Object obj) {
        vr20 vr20Var = (vr20) this.c;
        Object obj2 = this.d;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            m441 m441Var = ((Boolean) obj2).booleanValue() ? new m441(new wt((uya) this.e, (lnm) null, (byte) 15)) : r6x.a;
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

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                qt qtVar = new qt((lnm) obj3, obj4, (byte) 0);
                qtVar.c = (vr20) obj;
                qtVar.d = obj2;
                return qtVar.invokeSuspend(rih1Var);
            case 1:
                qt qtVar2 = new qt((lnm) obj3, obj4, (byte) 1);
                qtVar2.c = (vr20) obj;
                qtVar2.d = obj2;
                return qtVar2.invokeSuspend(rih1Var);
            case 2:
                qt qtVar3 = new qt((lnm) obj3, obj4, (byte) 2);
                qtVar3.c = (vr20) obj;
                qtVar3.d = obj2;
                return qtVar3.invokeSuspend(rih1Var);
            case 3:
                qt qtVar4 = new qt(obj4, (lnm) obj3, (byte) 3);
                qtVar4.d = (Intent) obj;
                return qtVar4.invokeSuspend(rih1Var);
            case 4:
                qt qtVar5 = new qt((lnm) obj3, obj4, (byte) 4);
                qtVar5.c = (vr20) obj;
                qtVar5.d = obj2;
                return qtVar5.invokeSuspend(rih1Var);
            case 5:
                qt qtVar6 = new qt((lnm) obj3, obj4, (byte) 5);
                qtVar6.c = (vr20) obj;
                qtVar6.d = obj2;
                return qtVar6.invokeSuspend(rih1Var);
            case 6:
                qt qtVar7 = new qt((lnm) obj3, obj4, (byte) 6);
                qtVar7.c = (vr20) obj;
                qtVar7.d = obj2;
                return qtVar7.invokeSuspend(rih1Var);
            case 7:
                qt qtVar8 = new qt((swn) this.d, (a24) obj4, (lnm) obj3, (byte) 7);
                qtVar8.c = (o24) obj;
                return qtVar8.invokeSuspend(rih1Var);
            case 8:
                qt qtVar9 = new qt((lnm) obj3, obj4, (byte) 8);
                qtVar9.c = (vr20) obj;
                qtVar9.d = (Object[]) obj2;
                return qtVar9.invokeSuspend(rih1Var);
            case 9:
                qt qtVar10 = new qt((lnm) obj3, obj4, (byte) 9);
                qtVar10.c = (vr20) obj;
                qtVar10.d = obj2;
                return qtVar10.invokeSuspend(rih1Var);
            case 10:
                qt qtVar11 = new qt((lnm) obj3, obj4, (byte) 10);
                qtVar11.c = (vr20) obj;
                qtVar11.d = obj2;
                return qtVar11.invokeSuspend(rih1Var);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                qt qtVar12 = new qt((lnm) obj3, obj4, (byte) 11);
                qtVar12.c = (vr20) obj;
                qtVar12.d = obj2;
                return qtVar12.invokeSuspend(rih1Var);
            case grn1.d /* 12 */:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                qt qtVar13 = new qt((String) this.d, (w4b1) obj4, (lnm) obj3, (byte) 12);
                qtVar13.c = (Map) obj;
                qtVar13.b = zBooleanValue;
                return qtVar13.invokeSuspend(rih1Var);
            case 13:
                qt qtVar14 = new qt((lnm) obj3, obj4, (byte) 13);
                qtVar14.c = (vr20) obj;
                qtVar14.d = obj2;
                return qtVar14.invokeSuspend(rih1Var);
            case 14:
                qt qtVar15 = new qt(obj4, (lnm) obj3, (byte) 14);
                qtVar15.c = (uv11) obj;
                qtVar15.d = (tv80) obj2;
                return qtVar15.invokeSuspend(rih1Var);
            case 15:
                qt qtVar16 = new qt((lnm) obj3, obj4, (byte) 15);
                qtVar16.c = (vr20) obj;
                qtVar16.d = obj2;
                return qtVar16.invokeSuspend(rih1Var);
            case 16:
                qt qtVar17 = new qt((lnm) obj3, obj4, (byte) 16);
                qtVar17.c = (vr20) obj;
                qtVar17.d = obj2;
                return qtVar17.invokeSuspend(rih1Var);
            case 17:
                qt qtVar18 = new qt((lnm) obj3, obj4, (byte) 17);
                qtVar18.c = (vr20) obj;
                qtVar18.d = obj2;
                return qtVar18.invokeSuspend(rih1Var);
            case 18:
                qt qtVar19 = new qt((lnm) obj3, obj4, (byte) 18);
                qtVar19.c = (vr20) obj;
                qtVar19.d = obj2;
                return qtVar19.invokeSuspend(rih1Var);
            case 19:
                qt qtVar20 = new qt((lnm) obj3, obj4, (byte) 19);
                qtVar20.c = (vr20) obj;
                qtVar20.d = obj2;
                return qtVar20.invokeSuspend(rih1Var);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                qt qtVar21 = new qt((lnm) obj3, obj4, (byte) 20);
                qtVar21.c = (vr20) obj;
                qtVar21.d = obj2;
                return qtVar21.invokeSuspend(rih1Var);
            case 21:
                qt qtVar22 = new qt((lnm) obj3, obj4, (byte) 21);
                qtVar22.c = (vr20) obj;
                qtVar22.d = obj2;
                return qtVar22.invokeSuspend(rih1Var);
            case 22:
                qt qtVar23 = new qt((lnm) obj3, obj4, (byte) 22);
                qtVar23.c = (vr20) obj;
                qtVar23.d = obj2;
                return qtVar23.invokeSuspend(rih1Var);
            case 23:
                qt qtVar24 = new qt((lnm) obj3, obj4, (byte) 23);
                qtVar24.c = (vr20) obj;
                qtVar24.d = obj2;
                return qtVar24.invokeSuspend(rih1Var);
            case 24:
                qt qtVar25 = new qt((it8) this.d, (List) obj4, (lnm) obj3, (byte) 24);
                qtVar25.c = (vr20) obj;
                return qtVar25.invokeSuspend(rih1Var);
            case 25:
                qt qtVar26 = new qt(obj4, (lnm) obj3, (byte) 25);
                qtVar26.c = (vr20) obj;
                qtVar26.d = (Throwable) obj2;
                return qtVar26.invokeSuspend(rih1Var);
            case 26:
                qt qtVar27 = new qt(obj4, (lnm) obj3, (byte) 26);
                qtVar27.c = (vr20) obj;
                qtVar27.d = (Throwable) obj2;
                return qtVar27.invokeSuspend(rih1Var);
            case 27:
                qt qtVar28 = new qt((lnm) obj3, obj4, (byte) 27);
                qtVar28.c = (vr20) obj;
                qtVar28.d = obj2;
                return qtVar28.invokeSuspend(rih1Var);
            case 28:
                qt qtVar29 = new qt((lnm) obj3, obj4, (byte) 28);
                qtVar29.c = (vr20) obj;
                qtVar29.d = obj2;
                return qtVar29.invokeSuspend(rih1Var);
            default:
                qt qtVar30 = new qt((lnm) obj3, obj4, (byte) 29);
                qtVar30.c = (vr20) obj;
                qtVar30.d = obj2;
                return qtVar30.invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    /* JADX WARN: Code duplicated, block: B:389:0x0aa0  */
    public final Object invokeSuspend(Object obj) throws AbortFlowException {
        huz ht20Var;
        s4b1 s4b1VarX;
        Object objI;
        mmr0 mmr0Var;
        huz huzVar;
        rl1 rl1Var;
        huz huzVar2;
        bpb1 pzsVar;
        w2r0 w2r0Var;
        smc0 smc0VarK;
        x2r0 x2r0Var;
        huz ht20Var2;
        ou80 ou80Var;
        bpb1 bpb1Var;
        mr20 huzVar3;
        byte b = this.a;
        m441 m441VarU = r6x.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj2 = this.e;
        nb1 nb1Var = null;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                vr20 vr20Var = (vr20) this.c;
                Object obj3 = this.d;
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
                mr20 mr20VarE = ((jq) ((xt) obj2).b.get()).e();
                this.c = null;
                this.d = null;
                this.b = true;
                u4p1.S(vr20Var);
                Object objCollect = mr20VarE.collect(new st(vr20Var, (String) obj3, (byte) 0), this);
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                return objCollect == d9nVar ? d9nVar : rih1Var;
            case 1:
                vr20 vr20Var2 = (vr20) this.c;
                Object obj4 = this.d;
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
                String str = (String) obj4;
                v5n v5nVar = ((gu) obj2).a;
                str.getClass();
                ezc ezcVarG = yoi1.g(v5nVar.b(str));
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var2, ezcVarG, this) == d9nVar ? d9nVar : rih1Var;
            case 2:
                vr20 vr20Var3 = (vr20) this.c;
                Object obj5 = this.d;
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    od0 od0Var = (pd0) obj5;
                    if (od0Var == null) {
                        ht20Var = new huz((Object) null, (byte) 10);
                    } else if (od0Var instanceof od0) {
                        ht20Var = new huz(new ld0(od0Var.a), (byte) 10);
                    } else if (od0Var instanceof nd0) {
                        xd0 xd0Var = (xd0) obj2;
                        String str2 = ((nd0) od0Var).a;
                        ht20Var = new ht20(hu20.e(rqt0.u(new lt20(xd0Var.a.f(str2), new rd0(str2, (lnm) null, (byte) 0), (byte) 0)), new qd0((lnm) null, str2, xd0Var, (byte) 0)), new sd0(2, (lnm) null, (byte) 0));
                    } else {
                        eg.o();
                    }
                    this.c = null;
                    this.d = null;
                    this.b = true;
                    return l4p1.s(vr20Var3, ht20Var, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z3) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                fw0 fw0Var = (fw0) obj2;
                Intent intent = (Intent) this.d;
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    Set set = s4b1.f;
                    String dataString = intent.getDataString();
                    if (dataString == null) {
                        dataString = "";
                    }
                    s4b1VarX = uic.x(dataString);
                    ezc ezcVarA = ((sb40) fw0Var.b).a();
                    this.d = null;
                    this.c = s4b1VarX;
                    this.b = true;
                    objI = b5p1.i(ezcVarA, this);
                    if (objI == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    s4b1 s4b1Var = (s4b1) this.c;
                    hm5.M(obj);
                    s4b1VarX = s4b1Var;
                    objI = obj;
                }
                if (((Boolean) objI).booleanValue()) {
                    String strO = s4b1VarX.o(3);
                    String str3 = strO != null ? strO : "";
                    int iOrdinal = s4b1VarX.c.ordinal();
                    if (iOrdinal != 625) {
                        if (iOrdinal == 627) {
                            mmr0Var = new mmr0(nik1.W5.b("spotify:internal:parental-control:child:" + str3 + ":manage-content:blocked:add"), iyr0.b);
                        }
                        if (nb1Var != null) {
                            return new hrn0(eb1.class, nb1Var, a6w0.a);
                        }
                    } else {
                        mmr0Var = new mmr0(nik1.X5.b("spotify:internal:parental-control:child:" + str3 + ":manage-content:approved:add"), iyr0.a);
                    }
                    nb1Var = new nb1(str3, (lik1) mmr0Var.a, (iyr0) mmr0Var.b);
                    if (nb1Var != null) {
                        return new hrn0(eb1.class, nb1Var, a6w0.a);
                    }
                }
                return crn0.a;
            case 4:
                so1 so1Var = (so1) obj2;
                vr20 vr20Var4 = (vr20) this.c;
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
                hy1 hy1Var = (hy1) obj6;
                qt1 qt1Var = so1Var.t;
                ezc ezcVarG2 = yoi1.g(so1Var.e.e());
                List list = so1Var.T0;
                av1 av1Var = so1Var.f;
                gy1 gy1Var = av1Var.i;
                boolean z6 = gy1Var instanceof by1;
                io1 io1Var = jo1.a;
                if (z6) {
                    if (((by1) gy1Var).a == ak3.c) {
                        io1Var = new io1(false);
                    }
                    huzVar = new huz(io1Var, (byte) 10);
                } else {
                    List list2 = av1Var.d;
                    l7c l7cVar = blc0.a;
                    if (so1.k(list2)) {
                        jxo jxoVar = so1Var.X;
                        Single singleJust = Single.just(list);
                        switch (jxoVar.a) {
                            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                                ib3 ib3Var = (ib3) ((fwo) jxoVar.b).c;
                                av1 av1VarC = ib3Var.c();
                                g7h g7hVar = (g7h) ((kt1) ib3Var.b).K.get();
                                c8o.l(g7hVar);
                                rl1Var = new rl1(av1VarC, g7hVar, singleJust);
                                break;
                            default:
                                ai0 ai0Var = (ai0) ((fwo) jxoVar.b).c;
                                av1 av1Var2 = (av1) ai0Var.c;
                                g7h g7hVar2 = (g7h) ((xu1) ai0Var.b).I.get();
                                c8o.l(g7hVar2);
                                rl1Var = new rl1(av1Var2, g7hVar2, singleJust);
                                break;
                        }
                        huzVar = new nf(yoi1.g((Observable) ((idd1) rl1Var.e).getValue()), (byte) 5);
                    } else {
                        huzVar = new huz(io1Var, (byte) 10);
                    }
                }
                mr20 mr20VarA = qt1Var.a(hy1Var, new x010(ezcVarG2, huzVar, new qr0(so1Var, (lnm) null, (byte) 1), (byte) 1));
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var4, mr20VarA, this) == d9nVar ? d9nVar : rih1Var;
            case 5:
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
                ContextTrack contextTrack = (ContextTrack) obj7;
                vf2 vf2Var = (vf2) obj2;
                if (!l4o1.X(contextTrack) || !l4o1.Z(contextTrack) || l4o1.E(contextTrack) || l4o1.P(contextTrack)) {
                    huzVar2 = new huz(Boolean.FALSE, (byte) 10);
                } else {
                    String strUri = (l4o1.P(contextTrack) || !l4o1.Y(contextTrack)) ? (String) contextTrack.metadata().get("video_association") : contextTrack.uri();
                    huzVar2 = (strUri == null || strUri.length() == 0) ? new huz(Boolean.FALSE, (byte) 10) : new lt20(hu20.c(((ov20) vf2Var.b).a("should-assure-age-content-playback", false), new q4(vf2Var, strUri, (lnm) null, (byte) 29)), new rf2(3, (lnm) null, (byte) 0), (byte) 0);
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var5, huzVar2, this) == d9nVar ? d9nVar : rih1Var;
            case 6:
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
                List list3 = (List) obj8;
                ht20 ht20Var3 = new ht20(new gk(z4p1.F(new nf(yoi1.g(((uu00) ((res) obj2).h).b(new oi("artist_metadata_loader", false, new s6(list3, (byte) 5)))), (byte) 10), 1), list3, (byte) 19), new sd0(2, (lnm) null, (byte) 8), (byte) 0);
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var6, ht20Var3, this) == d9nVar ? d9nVar : rih1Var;
            case 7:
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
                o24 o24Var = (o24) this.c;
                swn swnVar = (swn) this.d;
                b6 b6Var = new b6((a24) obj2, o24Var, (byte) 2);
                this.b = true;
                return swnVar.invoke(b6Var, this) == d9nVar ? d9nVar : rih1Var;
            case 8:
                vr20 vr20Var7 = (vr20) this.c;
                Object[] objArr = (Object[]) this.d;
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
                LinkedHashMap linkedHashMapO = sqg0.O((Map) obj2, sqg0.W((mmr0[]) objArr));
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var7.emit(linkedHashMapO, this) == d9nVar ? d9nVar : rih1Var;
            case 9:
                qz4 qz4Var = (qz4) obj2;
                poj0 poj0Var = qz4Var.a;
                vr20 vr20Var8 = (vr20) this.c;
                Object obj9 = this.d;
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
                x010 x010Var = ((Boolean) obj9).booleanValue() ? new x010(((kvp0) poj0Var.e).a(), ((kvp0) poj0Var.d).a(), new ce2(3, (lnm) null, (byte) 1), (byte) 1) : new huz(new twz0(qz4Var.b.c()), (byte) 10);
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var8, x010Var, this) == d9nVar ? d9nVar : rih1Var;
            case 10:
                vr20 vr20Var9 = (vr20) this.c;
                Object obj10 = this.d;
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
                if (((Boolean) obj10).booleanValue()) {
                    Flowable flowable = ((yv5) obj2).c;
                    flowable.getClass();
                    m441VarU = rqt0.u(new ik(new nf(yoi1.g(new ObservableFromPublisher(flowable)), (byte) 11), (byte) 11));
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var9, m441VarU, this) == d9nVar ? d9nVar : rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                vr20 vr20Var10 = (vr20) this.c;
                Object obj11 = this.d;
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
                g23 g23Var = (g23) obj2;
                if (((Boolean) obj11).booleanValue()) {
                    pzsVar = ((ct50) g23Var.c).a;
                } else {
                    laz lazVar = (laz) g23Var.b;
                    jn7 jn7Var = (jn7) lazVar.b;
                    on7 on7VarN = AtvRemoteServiceOuterClass.StateRequest.n();
                    on7VarN.n();
                    pzsVar = new pzs(new hs6(jn7Var.callStream("spotify.atv_remote.esperanto.proto.AtvRemoteService", "State", on7VarN.build()), (byte) 2), lazVar, (byte) 27);
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var10, pzsVar, this) == d9nVar ? d9nVar : rih1Var;
            case grn1.d /* 12 */:
                Map map = (Map) this.c;
                boolean z14 = this.b;
                hm5.M(obj);
                String str4 = (String) this.d;
                w4b1 w4b1Var = (w4b1) obj2;
                xf4 xf4Var = (xf4) w4b1Var.b;
                boolean zG = y7y0.G(map);
                w2r0 w2r0Var2 = w2r0.X0;
                w2r0 w2r0Var3 = w2r0.V0;
                w2r0 w2r0Var4 = w2r0.Z;
                w2r0 w2r0Var5 = w2r0.e;
                w2r0 w2r0Var6 = w2r0.f1;
                w2r0 w2r0Var7 = w2r0.Q0;
                w2r0 w2r0Var8 = w2r0.S0;
                w2r0 w2r0Var9 = w2r0.Y;
                w2r0 w2r0Var10 = w2r0.Y0;
                w2r0 w2r0Var11 = w2r0.b;
                w2r0 w2r0Var12 = w2r0.f;
                w2r0 w2r0Var13 = w2r0.t;
                w2r0 w2r0Var14 = w2r0.R0;
                if (zG) {
                    w2r0Var = w2r0Var3;
                    smc0 smc0VarN = k4p1.n();
                    if (xf4Var.n()) {
                        smc0VarN.add(new v2r0(w2r0.O0));
                    }
                    smc0VarN.add(new v2r0(w2r0.N0));
                    smc0VarN.add(new v2r0(w2r0.b1));
                    smc0VarN.add(new v2r0(w2r0Var4));
                    smc0VarN.add(new v2r0(w2r0Var14));
                    smc0VarN.add(new v2r0(w2r0Var13));
                    smc0VarN.add(new v2r0(w2r0Var12));
                    smc0VarN.add(new v2r0(w2r0Var11));
                    if (!xf4Var.t()) {
                        smc0VarN.add(new v2r0(w2r0Var10));
                    }
                    smc0VarN.add(new v2r0(w4b1Var.e()));
                    smc0VarN.add(new v2r0(xf4Var.y() ? w2r0Var : w2r0Var2));
                    smc0VarN.add(new v2r0(w2r0Var9));
                    smc0VarN.add(new v2r0(w2r0Var8));
                    smc0VarN.add(new v2r0(w2r0Var7));
                    if (xf4Var.C()) {
                        smc0VarN.add(new v2r0(w2r0Var6));
                    }
                    smc0VarN.add(new v2r0(w2r0Var5));
                    smc0VarN.add(new v2r0(w2r0.a));
                    smc0VarK = k4p1.k(smc0VarN);
                } else {
                    str4 = str4;
                    w2r0Var = w2r0Var3;
                    w4b1Var = w4b1Var;
                    if (z14 || y7y0.L(map)) {
                        smc0 smc0VarN2 = k4p1.n();
                        smc0VarN2.add(new v2r0(w2r0Var4));
                        smc0VarN2.add(new v2r0(w2r0Var14));
                        smc0VarN2.add(new v2r0(w2r0Var13));
                        smc0VarN2.add(new v2r0(w2r0Var12));
                        smc0VarN2.add(new v2r0(w2r0Var11));
                        if (!xf4Var.t()) {
                            smc0VarN2.add(new v2r0(w2r0Var10));
                        }
                        smc0VarN2.add(new v2r0(w4b1Var.e()));
                        smc0VarN2.add(new v2r0(xf4Var.y() ? w2r0Var : w2r0Var2));
                        smc0VarN2.add(new v2r0(w2r0Var9));
                        smc0VarN2.add(new v2r0(w2r0Var8));
                        smc0VarN2.add(new v2r0(w2r0Var7));
                        if (xf4Var.C()) {
                            smc0VarN2.add(new v2r0(w2r0Var6));
                        }
                        smc0VarN2.add(new v2r0(w2r0Var5));
                        smc0VarK = k4p1.k(smc0VarN2);
                    } else {
                        smc0 smc0VarN3 = k4p1.n();
                        smc0VarN3.add(new v2r0(w2r0.c1));
                        smc0VarN3.add(new v2r0(w2r0Var14));
                        smc0VarN3.add(new v2r0(w2r0Var13));
                        smc0VarN3.add(new v2r0(w2r0Var12));
                        smc0VarN3.add(new v2r0(w2r0Var11));
                        if (!xf4Var.t()) {
                            smc0VarN3.add(new v2r0(w2r0Var10));
                        }
                        smc0VarN3.add(new v2r0(w2r0Var9));
                        smc0VarN3.add(new v2r0(w2r0Var8));
                        smc0VarN3.add(new v2r0(w2r0Var7));
                        if (xf4Var.C()) {
                            smc0VarN3.add(new v2r0(w2r0Var6));
                        }
                        smc0VarN3.add(new v2r0(w2r0Var5));
                        smc0VarK = k4p1.k(smc0VarN3);
                    }
                }
                x2r0 x2r0Var2 = new x2r0(2, smc0VarK);
                if (xf4Var.t()) {
                    smc0 smc0VarN4 = k4p1.n();
                    if (y7y0.G(map) || z14 || y7y0.L(map)) {
                        if (xf4Var.m()) {
                            smc0VarN4.add(new v2r0(w2r0.T0));
                        }
                        smc0VarN4.add(new v2r0(w4b1Var.e()));
                        smc0VarN4.add(new v2r0(xf4Var.y() ? w2r0Var : w2r0Var2));
                    }
                    smc0VarN4.add(new v2r0(w2r0.e1));
                    x2r0Var = new x2r0(6, k4p1.k(smc0VarN4));
                } else {
                    x2r0Var = new x2r0(5, Collections.singletonList(new v2r0(w2r0.Z0)));
                }
                return new y2r0(str4, p7h.M(new x2r0[]{x2r0Var2, x2r0Var, new x2r0(3, p7h.M(new v2r0[]{new v2r0(w2r0.a1), new v2r0(w2r0.P0)})), new x2r0(4, Collections.singletonList(new v2r0(w2r0.i)))}), 0);
            case 13:
                bv6 bv6Var = (bv6) obj2;
                vr20 vr20Var11 = (vr20) this.c;
                Object obj12 = this.d;
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
                y0r y0rVar = (y0r) obj12;
                if (y0rVar == null) {
                    ht20Var2 = new huz(fx11.a, (byte) 10);
                } else {
                    p811 p811Var = new p811();
                    p811Var.a = uu6.a;
                    ht20Var2 = new ht20(new vd0(d3p1.F(bv6Var.d, dv6.a, y0rVar), p811Var, y0rVar, (byte) 8), new bh(p811Var, bv6Var, y0rVar, (lnm) null, (byte) 20));
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var11, ht20Var2, this) == d9nVar ? d9nVar : rih1Var;
            case 14:
                my6 my6Var = (my6) obj2;
                uv11 uv11Var = (uv11) this.c;
                tv80 tv80Var = (tv80) this.d;
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
                aas aasVar = my6Var.c;
                List listSingletonList = Collections.singletonList(ContextTrack.create(uv11Var.a));
                y6r0 y6r0Var = my6Var.e;
                String str5 = y6r0Var != null ? y6r0Var.a : null;
                if (str5 == null) {
                    str5 = "";
                }
                String str6 = (tv80Var == null || (ou80Var = tv80Var.a) == null) ? null : ou80Var.a;
                CompletableObserveOn completableObserveOnA = aasVar.a(2, str5, str6 != null ? str6 : "", listSingletonList);
                this.c = null;
                this.d = null;
                this.b = true;
                return fc11.i(completableObserveOnA, this) == d9nVar ? d9nVar : rih1Var;
            case 15:
                vr20 vr20Var12 = (vr20) this.c;
                Object obj13 = this.d;
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
                r091 r091Var = (r091) obj13;
                mr20 huzVar4 = (r091Var == null || (bpb1Var = r091Var.g) == null) ? new huz(ofu0.a, (byte) 10) : rqt0.u(new c64(bpb1Var, (ec7) obj2, (byte) 15));
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var12, huzVar4, this) == d9nVar ? d9nVar : rih1Var;
            case 16:
                vr20 vr20Var13 = (vr20) this.c;
                Object obj14 = this.d;
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
                if (((Boolean) obj14).booleanValue()) {
                    WeakHashMap weakHashMap = ty60.q;
                    g38 g38Var = ((ty60) obj2).a;
                    Flowable flowableA = g38Var.a();
                    vbm[] vbmVarArr = q601.a;
                    m441VarU = new lt20(new c64(new huz(new bt20(16L, o4p1.j(new kge(flowableA), 1, 2), (lnm) null), (byte) 6), new kr60(g38Var, (byte) 22), (byte) 17), new re1(3, (lnm) null, (byte) 5), (byte) 0);
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var13, m441VarU, this) == d9nVar ? d9nVar : rih1Var;
            case 17:
                vr20 vr20Var14 = (vr20) this.c;
                Object obj15 = this.d;
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
                Set<String> set2 = (Set) obj15;
                ArrayList arrayList = new ArrayList(q7h.U(set2, 10));
                for (String str7 : set2) {
                    arrayList.add(new x68(((k740) ((z68) obj2).d).d(str7), str7, (byte) 0));
                }
                mr20[] mr20VarArr = (mr20[]) o7h.l1(arrayList).toArray(new mr20[0]);
                this.c = null;
                this.d = null;
                this.b = true;
                u4p1.S(vr20Var14);
                Object objS = fc11.s(new ua3(mr20VarArr, (byte) 4), this, vr20Var14, new va3(3, (lnm) null, (byte) 2), mr20VarArr);
                if (objS != d9nVar) {
                    objS = rih1Var;
                }
                if (objS != d9nVar) {
                    objS = rih1Var;
                }
                return objS == d9nVar ? d9nVar : rih1Var;
            case 18:
                cl8 cl8Var = (cl8) obj2;
                vr20 vr20Var15 = (vr20) this.c;
                Object obj16 = this.d;
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
                th61 th61Var = (th61) obj16;
                if (cl8.b(th61Var)) {
                    huzVar3 = new huz(new wv21(th61Var), (byte) 10);
                } else {
                    vd0 vd0Var = new vd0(eth.V(cl8Var.c.a), cl8Var, th61Var, (byte) 10);
                    fns fnsVar = igu.a;
                    huzVar3 = o4p1.r(vd0Var, pyf0.a);
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var15, huzVar3, this) == d9nVar ? d9nVar : rih1Var;
            case 19:
                yu3 yu3Var = (yu3) obj2;
                vr20 vr20Var16 = (vr20) this.c;
                Object obj17 = this.d;
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
                String str8 = (String) obj17;
                str8.getClass();
                huz huzVar5 = str8.length() == 0 ? new huz(new z79(""), (byte) 10) : new lt20(new vd0((byte) 12, yu3Var, str8, ((xrc0) yu3Var.b).p(new rxc0(str8))), new rd0(str8, (lnm) null, (byte) 1), (byte) 0);
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var16, huzVar5, this) == d9nVar ? d9nVar : rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                vr20 vr20Var17 = (vr20) this.c;
                Object obj18 = this.d;
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
                qer huzVar6 = ((Boolean) obj18).booleanValue() ? (qer) obj2 : new huz(z6x.a, (byte) 10);
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var17, huzVar6, this) == d9nVar ? d9nVar : rih1Var;
            case 21:
                vr20 vr20Var18 = (vr20) this.c;
                Object obj19 = this.d;
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
                mr20 huzVar7 = ((Boolean) obj19).booleanValue() ? (mr20) ((Function0) obj2).invoke() : new huz(Boolean.FALSE, (byte) 10);
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var18, huzVar7, this) == d9nVar ? d9nVar : rih1Var;
            case 22:
                vr20 vr20Var19 = (vr20) this.c;
                Object obj20 = this.d;
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
                huz huzVar8 = ((Boolean) obj20).booleanValue() ? new huz(Boolean.TRUE, (byte) 10) : (mr20) ((qa9) obj2).invoke();
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var19, huzVar8, this) == d9nVar ? d9nVar : rih1Var;
            case 23:
                return e(obj);
            case 24:
                vr20 vr20Var20 = (vr20) this.c;
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
                ArrayList arrayListD = it8.D((List) obj2, b7x.a);
                this.c = null;
                this.b = true;
                return vr20Var20.emit(arrayListD, this) == d9nVar ? d9nVar : rih1Var;
            case 25:
                return g(obj);
            case 26:
                return h(obj);
            case 27:
                return i(obj);
            case 28:
                return j(obj);
            default:
                vr20 vr20Var21 = (vr20) this.c;
                Object obj21 = this.d;
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
                if (((Boolean) obj21).booleanValue()) {
                    m441VarU = new m441(new wt((xya) obj2, (lnm) null, (byte) 16));
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var21, m441VarU, this) == d9nVar ? d9nVar : rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qt(Object obj, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qt(lnm lnmVar, Object obj, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.e = obj;
    }
}
