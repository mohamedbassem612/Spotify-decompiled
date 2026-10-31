package p;

import android.content.Context;
import com.spotify.base.java.logging.Logger;
import com.spotify.integrity.integrityimpl.proto.VerifyRequest;
import com.spotify.integrity.integrityimpl.proto.VerifyResponse;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.PlayerState;
import com.spotify.userinteractivityservice.usercomments.v1.proto.Timestamp;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableJust;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class myq0 implements Function, fg0, BiFunction, kir0, zfa, uot0 {
    public final /* synthetic */ byte a;
    public final Object b;
    public Object c;

    public myq0(j8m0 j8m0Var) {
        this.a = (byte) 29;
        this.b = j8m0Var;
        this.c = new idd1(new kks0(this, (byte) 22));
    }

    public static final /* synthetic */ q7r0 c(myq0 myq0Var) {
        return (q7r0) myq0Var.b;
    }

    public Observable a() {
        return yoi1.i(new any(((ien0) this.b).a, (byte) 18), o6x.a).distinctUntilChanged().flatMap(new swm0((nir0) this.c, (byte) 17));
    }

    public Object apply(Object obj) {
        String m231Var;
        n310 m231Var2;
        n310 n310Var;
        p510 p510Var;
        List list;
        FlowableJust flowableJustJ;
        byte b = this.a;
        String str = null;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return Observable.fromIterable((List) obj).concatMap(new sjq0((nyq0) obj2, (r9c) this.c, (byte) 3)).toList().map(a020.V0);
            case 9:
                return new g500((String) obj2, ((agw) this.c).s(), (Throwable) obj);
            case 11:
                String str2 = ((o39) obj2).b;
                nx41 nx41Var = (nx41) this.c;
                return new w051(str2, nx41Var.c, new w851((q39) obj), nx41Var.d);
            case 14:
                mmr0 mmr0Var = (mmr0) obj;
                return ((ats0) obj2).d((l510) mmr0Var.a, (m210) this.c, ((Boolean) mmr0Var.b).booleanValue(), false);
            case 15:
                sy21 sy21Var = (sy21) obj;
                ry21 ry21Var = sy21Var.a;
                if (!ry21Var.Q0) {
                    try {
                        uz21 uz21Var = sy21Var.c;
                        m231Var = uz21Var != null ? uz21Var.f() : null;
                    } catch (Throwable th) {
                        m231Var = new m231(th);
                    }
                    if (m231Var instanceof m231) {
                        m231Var = null;
                    }
                    String str3 = m231Var;
                    if (str3 != null) {
                        try {
                            m231Var2 = (n310) w0h1.d(k8b0.b).a(str3, n310.Companion.serializer());
                        } catch (Throwable th2) {
                            m231Var2 = new m231(th2);
                        }
                        if (m231Var2 instanceof m231) {
                            m231Var2 = null;
                        }
                        n310Var = m231Var2;
                    } else {
                        n310Var = null;
                    }
                    Logger.d("Personalised home request for package %s returned %d: %s", new Object[]{(String) this.c, Integer.valueOf(ry21Var.d), n310Var != null ? n310Var.a : null});
                    break;
                }
                int i = ry21Var.a().c;
                m510 m510Var = ry21Var.i != null ? m510.c : (ry21Var.t == null || (System.currentTimeMillis() - ry21Var.Z) / 1000 > ((long) i)) ? m510.a : m510.b;
                q310 q310Var = (q310) sy21Var.b;
                if (q310Var != null && (list = q310Var.a) != null) {
                    p510 p510Var2 = (p510) o7h.s0(list);
                    return new l510(list, m510Var, p510Var2 != null ? p510Var2.h : null);
                }
                if (q310Var != null && (p510Var = (p510) o7h.s0(q310Var.a)) != null) {
                    str = p510Var.h;
                }
                return new l510(z6x.a, m510Var, str);
            case 21:
                tut0 tut0Var = (tut0) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    return Observable.just(tut0Var.d);
                }
                euc eucVar = (buc) tut0Var.a.get();
                ztc ztcVar = (ztc) this.c;
                euc eucVar2 = eucVar;
                rsc0 rsc0Var = eucVar2.a;
                ((upp0) eucVar2.b.get()).getClass();
                return yoi1.i(new hs6(rsc0Var.k(upp0.a(), euc.b(ztcVar)), (byte) 21), o6x.a).observeOn(tut0Var.c);
            case 25:
                PlayerState playerState = (PlayerState) obj;
                ContextTrack contextTrack = (ContextTrack) playerState.track().h();
                if (u890.j(contextTrack != null ? contextTrack.uri() : null, (String) obj2)) {
                    FlowableJust flowableJustI = Flowable.I(playerState);
                    r0s0 r0s0Var = (r0s0) this.c;
                    flowableJustJ = flowableJustI.j(new xeu0(100L, (Scheduler) r0s0Var.b, (yqg) r0s0Var.d)).J(new e5l0(playerState, (byte) 28));
                } else {
                    flowableJustJ = Flowable.I(imh.a);
                }
                return flowableJustJ.J(rh20.Z0);
            case 26:
                return Flowable.h((FlowableMap) obj2, (FlowableMap) this.c, new e5l0((Long) obj, (byte) 29));
            default:
                r0s0 r0s0Var2 = (r0s0) obj2;
                return ((ywc0) r0s0Var2.c).a(new eoc0(((ssi0) this.c).b, (lik1) r0s0Var2.b, mno1.j0, (dpu0) obj));
        }
    }

    public void b(Object obj) {
        ((cir0) ((sjq0) this.b).b).l(new ozp0((o1p1) this.c, obj, (byte) 16));
    }

    public vfa d() {
        return new fdc((l5v0) this.b, (l451) this.c);
    }

    public hft0 e() {
        return new hft0((clm) this.b, (ynb0) this.c);
    }

    public vqo f() {
        huz huzVar = new huz(Boolean.valueOf(((z0t) this.c).a.k()), (byte) 10);
        c0g.x.getClass();
        pbo1 pbo1Var = pbo1.N0;
        uqo uqoVar = new uqo(2131962121, null, null, null, 30);
        kly0 kly0Var = (kly0) this.b;
        tqo.a.getClass();
        return new vqo("pinsSectionLayout", uqoVar, huzVar, pbo1Var, kly0Var, rqo.b);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(int i, String str, onm onmVar) throws NoWhenBranchMatchedException {
        v5s0 v5s0Var;
        long j;
        if (onmVar instanceof v5s0) {
            v5s0Var = (v5s0) onmVar;
            int i2 = v5s0Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v5s0Var.d = i2 - Integer.MIN_VALUE;
            } else {
                v5s0Var = new v5s0(this, onmVar);
            }
        } else {
            v5s0Var = new v5s0(this, onmVar);
        }
        Object objL = v5s0Var.b;
        int i3 = v5s0Var.d;
        if (i3 == 0) {
            hm5.M(objL);
            long j2 = ((long) i) * 1000;
            v5s0Var.a = j2;
            v5s0Var.d = 1;
            objL = l(j2, str, v5s0Var);
            Object obj = d9n.a;
            if (objL == obj) {
                return obj;
            }
            j = j2;
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = v5s0Var.a;
            hm5.M(objL);
        }
        Long l = (Long) objL;
        if (l == null) {
            return null;
        }
        long jLongValue = l.longValue();
        rve1 rve1VarP = Timestamp.p();
        rve1VarP.n(j);
        rve1VarP.q(jLongValue);
        return rve1VarP.build();
    }

    public PlayOrigin get() {
        return (PlayOrigin) ((idd1) this.c).getValue();
    }

    public Flowable h() {
        return ((Flowable) this.b).j(mo9.N0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object i(onm onmVar) {
        rtr0 rtr0Var;
        if (onmVar instanceof rtr0) {
            rtr0Var = (rtr0) onmVar;
            int i = rtr0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rtr0Var.c = i - Integer.MIN_VALUE;
            } else {
                rtr0Var = new rtr0(this, onmVar);
            }
        } else {
            rtr0Var = new rtr0(this, onmVar);
        }
        Object objI = rtr0Var.a;
        int i2 = rtr0Var.c;
        if (i2 == 0) {
            hm5.M(objI);
            Flowable flowable = ((v5n) this.b).a(((ytr0) this.c).a).toFlowable();
            vbm[] vbmVarArr = q601.a;
            kge kgeVar = new kge(flowable);
            rtr0Var.c = 1;
            objI = b5p1.i(kgeVar, rtr0Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objI);
        }
        return new thm0((String) objI);
    }

    public tv80 j(String str) {
        x6h1 x6h1VarC = ((pdl0) this.c).b.c();
        x6h1VarC.i.add(new a7h1("link_later_snackbar", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("settings_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        return ((i8h1) this.b).m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public void k() {
        i8h1 i8h1Var = (i8h1) this.b;
        x6h1 x6h1VarC = ((pdl0) this.c).b.c();
        x6h1VarC.i.add(new a7h1("link_later_snackbar", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        i8h1Var.f(k7h1Var.a(), (Set) null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public Object l(long j, String str, onm onmVar) throws NoWhenBranchMatchedException {
        w5s0 w5s0Var;
        if (onmVar instanceof w5s0) {
            w5s0Var = (w5s0) onmVar;
            int i = w5s0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                w5s0Var.c = i - Integer.MIN_VALUE;
            } else {
                w5s0Var = new w5s0(this, onmVar);
            }
        } else {
            w5s0Var = new w5s0(this, onmVar);
        }
        w5s0 w5s0Var2 = w5s0Var;
        Object objO = w5s0Var2.a;
        int i2 = w5s0Var2.c;
        try {
            if (i2 == 0) {
                hm5.M(objO);
                long jC = ((wjh) this.c).c();
                wn2 wn2Var = new wn2((Object) this, (Object) str, j, (lnm) null, (byte) 13);
                w5s0Var2.c = 1;
                objO = rc2.O(jC, wn2Var, w5s0Var2);
                d9n d9nVar = d9n.a;
                if (objO == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objO);
            }
            qpg0 qpg0Var = (qpg0) objO;
            if (qpg0Var instanceof opg0) {
                return new Long(((opg0) qpg0Var).a);
            }
            if ((qpg0Var instanceof ppg0) || qpg0Var == null) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public void m(int i, int i2) {
        String str;
        String str2;
        t45 t45Var = (t45) this.c;
        if (t45Var != null) {
            if (i == 1) {
                str = "success";
            } else if (i == 2) {
                str = "empty";
            } else {
                if (i != 3) {
                    throw null;
                }
                str = "error";
            }
            t45Var.a("outcome", str);
            if (i2 == 1) {
                str2 = "network";
            } else if (i2 == 2) {
                str2 = "memory_cache";
            } else if (i2 == 3) {
                str2 = "http_cache";
            } else {
                if (i2 != 4) {
                    throw null;
                }
                str2 = "stale_http_cache";
            }
            t45Var.a("source", str2);
            t45Var.g("load_children");
            ((zle1) this.b).b(t45Var.e());
        } else {
            Logger.k("Attempt to end a measurement that was not started or has already ended", new Object[0]);
        }
        this.c = null;
    }

    public void n(String str) {
        String str2;
        t45 t45VarA = ((zle1) this.b).a("mbs_load_children_content");
        t45.m(t45VarA, "load_children", 4);
        t45VarA.h = "media-browser-service";
        ypn0 ypn0Var = ypn0.a;
        if (str.equals("spotify:home")) {
            str2 = "home";
        } else {
            lqn0 lqn0Var = lqn0.a;
            if (str.equals("spotify:recently-played")) {
                str2 = "recently-played";
            } else {
                upn0 upn0Var = upn0.a;
                if (str.equals("spotify:browse")) {
                    str2 = "browse";
                } else {
                    cqn0 cqn0Var = cqn0.a;
                    str2 = str.equals("spotify:collection") ? "your-library" : "other";
                }
            }
        }
        t45VarA.a("content_type", str2);
        t45VarA.a("package_name", "androidx.car.app");
        t45VarA.b("parent_id", str);
        this.c = t45VarA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object o(String str, ou80 ou80Var, onm onmVar) {
        v1u0 v1u0Var;
        if (onmVar instanceof v1u0) {
            v1u0Var = (v1u0) onmVar;
            int i = v1u0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                v1u0Var.d = i - Integer.MIN_VALUE;
            } else {
                v1u0Var = new v1u0(this, onmVar);
            }
        } else {
            v1u0Var = new v1u0(this, onmVar);
        }
        Object objO = v1u0Var.b;
        int i2 = v1u0Var.d;
        if (i2 == 0) {
            hm5.M(objO);
            f3t0 f3t0Var = new f3t0(this, str, (lnm) null, (byte) 12);
            v1u0Var.a = ou80Var;
            v1u0Var.d = 1;
            objO = rc2.O(10000L, f3t0Var, v1u0Var);
            d9n d9nVar = d9n.a;
            if (objO == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ou80Var = v1u0Var.a;
            hm5.M(objO);
        }
        if (objO != null) {
            e7p0.d((e7p0) this.b, ou80Var);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object p(quc qucVar, onm onmVar) {
        ogu0 ogu0Var;
        String str;
        aqh1 aqh1Var;
        if (onmVar instanceof ogu0) {
            ogu0Var = (ogu0) onmVar;
            int i = ogu0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ogu0Var.d = i - Integer.MIN_VALUE;
            } else {
                ogu0Var = new ogu0(this, onmVar);
            }
        } else {
            ogu0Var = new ogu0(this, onmVar);
        }
        Object objA = ogu0Var.b;
        int i2 = ogu0Var.d;
        if (i2 == 0) {
            hm5.M(objA);
            if (qucVar.b.contains("UPDATE_CADENCE")) {
                iyc0 iyc0Var = (iyc0) this.b;
                String str2 = qucVar.a;
                kvh1 kvh1Var = qucVar.c;
                if (kvh1Var instanceof jvh1) {
                    aqh1Var = new aqh1("NEVER", null);
                } else if (kvh1Var instanceof hvh1) {
                    aqh1Var = new aqh1("DAILY", null);
                } else {
                    if (!(kvh1Var instanceof kvh1)) {
                        hhg1.g(kvh1Var, "Unsupported cadence for playlists: ");
                        return null;
                    }
                    switch (kvh1Var.a) {
                        case 2:
                            str = "MONDAY";
                            break;
                        case 3:
                            str = "TUESDAY";
                            break;
                        case 4:
                            str = "WEDNESDAY";
                            break;
                        case 5:
                            str = "THURSDAY";
                            break;
                        case 6:
                            str = "FRIDAY";
                            break;
                        case 7:
                            str = "SATURDAY";
                            break;
                        default:
                            str = "SUNDAY";
                            break;
                    }
                    aqh1Var = new aqh1("WEEKLY", str);
                }
                ayc0 ayc0Var = new ayc0("UPDATE_CADENCE", (phc) null, phc.i(((nfa0) this.c).b(aqh1.Companion.serializer(), aqh1Var)), false, (String) null, 26);
                ogu0Var.a = qucVar;
                ogu0Var.d = 1;
                objA = iyc0.a(iyc0Var, str2, ayc0Var, ogu0Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            }
            return ruc.a;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        qucVar = ogu0Var.a;
        hm5.M(objA);
        oy21 oy21Var = (py21) objA;
        n5u0 n5u0Var = new n5u0(qucVar, (byte) 6);
        oy21Var.getClass();
        if (!(oy21Var instanceof ly21)) {
            if (oy21Var instanceof oy21) {
                return n5u0Var.invoke(oy21Var.a);
            }
            eg.o();
            return null;
        }
        return ruc.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object q(String str, String str2, onm onmVar) {
        o3t0 o3t0Var;
        if (onmVar instanceof o3t0) {
            o3t0Var = (o3t0) onmVar;
            int i = o3t0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                o3t0Var.c = i - Integer.MIN_VALUE;
            } else {
                o3t0Var = new o3t0(this, onmVar);
            }
        } else {
            o3t0Var = new o3t0(this, onmVar);
        }
        Object objA = o3t0Var.a;
        int i2 = o3t0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                p3t0 p3t0Var = (p3t0) this.b;
                r3j1 r3j1VarN = VerifyRequest.n();
                r3j1VarN.r(str);
                r3j1VarN.n(str2);
                r3j1VarN.q((String) this.c);
                VerifyRequest verifyRequestBuild = r3j1VarN.build();
                o3t0Var.c = 1;
                objA = p3t0Var.a(verifyRequestBuild, o3t0Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objA);
            }
            return new t3j1(((VerifyResponse) objA).o());
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            return new s3j1(message);
        }
    }

    public myq0(yon yonVar, o39 o39Var, nx41 nx41Var) {
        this.a = (byte) 11;
        this.b = o39Var;
        this.c = nx41Var;
    }

    public myq0(skc0 skc0Var, ulc ulcVar, rzo0 rzo0Var) {
        this.a = (byte) 5;
        this.b = skc0Var;
        this.c = rzo0Var;
    }

    public myq0(q7r0 q7r0Var) {
        this.a = (byte) 20;
        this.b = q7r0Var;
        this.c = new idd1(new vot0(this));
    }

    public /* synthetic */ myq0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public myq0(zle1 zle1Var) {
        this.a = (byte) 12;
        this.b = zle1Var;
    }

    public myq0(vfs0 vfs0Var) {
        this.a = (byte) 10;
        this.b = vfs0Var;
        this.c = new ConcurrentHashMap();
    }

    public Object apply(Object obj, Object obj2) {
        List list = (List) obj;
        if ((((tal) obj2) instanceof qal) && !list.isEmpty()) {
            zl5 zl5Var = (zl5) this.b;
            String str = (String) this.c;
            smc0 smc0VarN = k4p1.n();
            smc0VarN.add(new ffr0(((Context) zl5Var.b).getString(2131955115)));
            int i = 0;
            for (Object obj3 : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    smc0VarN.add(new rer0((String) obj3, str, new tfr0(Integer.valueOf(i), null, 2)));
                    i = i2;
                } else {
                    p7h.T();
                    throw null;
                }
            }
            return k4p1.k(smc0VarN);
        }
        return z6x.a;
    }
}
