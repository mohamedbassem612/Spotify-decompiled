package p;

import android.view.View;
import com.spotify.offline.offlineplugin_proto.EsOfflinePlugin;
import com.spotify.player.model.PlayerState;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gqj1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqj1(boolean z, l8m1 l8m1Var, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 29;
        this.b = z;
        this.c = l8m1Var;
        this.d = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                gqj1 gqj1Var = new gqj1((qu2) obj2, lnmVar, (byte) 0);
                gqj1Var.c = obj;
                return gqj1Var;
            case 1:
                return new gqj1(this.c, obj2, lnmVar, (byte) 1);
            case 2:
                return new gqj1(this.c, obj2, lnmVar, (byte) 2);
            case 3:
                return new gqj1(this.c, obj2, lnmVar, (byte) 3);
            case 4:
                gqj1 gqj1Var2 = new gqj1((View) obj2, lnmVar, (byte) 4);
                gqj1Var2.c = obj;
                return gqj1Var2;
            case 5:
                return new gqj1(this.c, obj2, lnmVar, (byte) 5);
            case 6:
                return new gqj1(this.c, obj2, lnmVar, (byte) 6);
            case 7:
                return new gqj1(this.c, obj2, lnmVar, (byte) 7);
            case 8:
                return new gqj1(this.c, obj2, lnmVar, (byte) 8);
            case 9:
                return new gqj1(this.c, obj2, lnmVar, (byte) 9);
            case 10:
                return new gqj1(this.c, obj2, lnmVar, (byte) 10);
            case 11:
                gqj1 gqj1Var3 = new gqj1((k42) obj2, lnmVar, (byte) 11);
                gqj1Var3.c = obj;
                return gqj1Var3;
            case 12:
                return new gqj1(this.c, obj2, lnmVar, (byte) 12);
            case 13:
                return new gqj1(this.c, obj2, lnmVar, (byte) 13);
            case 14:
                return new gqj1(this.c, obj2, lnmVar, (byte) 14);
            case 15:
                return new gqj1(this.c, obj2, lnmVar, (byte) 15);
            case 16:
                return new gqj1(this.c, obj2, lnmVar, (byte) 16);
            case 17:
                return new gqj1(this.c, obj2, lnmVar, (byte) 17);
            case 18:
                return new gqj1(this.c, obj2, lnmVar, (byte) 18);
            case 19:
                return new gqj1(this.c, obj2, lnmVar, (byte) 19);
            case 20:
                return new gqj1(this.c, obj2, lnmVar, (byte) 20);
            case 21:
                return new gqj1(this.c, obj2, lnmVar, (byte) 21);
            case 22:
                return new gqj1(this.c, obj2, lnmVar, (byte) 22);
            case 23:
                gqj1 gqj1Var4 = new gqj1((PlayerState) obj2, lnmVar, (byte) 23);
                gqj1Var4.c = obj;
                return gqj1Var4;
            case 24:
                return new gqj1(this.c, obj2, lnmVar, (byte) 24);
            case 25:
                return new gqj1(this.c, obj2, lnmVar, (byte) 25);
            case 26:
                return new gqj1(this.c, obj2, lnmVar, (byte) 26);
            case 27:
                return new gqj1(this.c, obj2, lnmVar, (byte) 27);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return new gqj1(this.c, obj2, lnmVar, (byte) 28);
            default:
                return new gqj1(this.b, (l8m1) this.c, (ven0) obj2, lnmVar);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invoke(Object obj, Object obj2) throws KotlinNothingValueException {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((yvg1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case 12:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case 13:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case 14:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case 15:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 17:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 18:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 19:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        Object objN;
        Object objJ;
        Object objI;
        Object objA;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj2 = this.d;
        lnm lnmVar = null;
        switch (b) {
            case 0:
                yvg1 yvg1Var = (yvg1) this.c;
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
                PlayerState playerState = (PlayerState) yvg1Var.a;
                this.c = null;
                this.b = true;
                return ((qu2) obj2).f(playerState, this) == d9nVar ? d9nVar : rih1Var;
            case 1:
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
                p8n0 p8n0Var = (p8n0) this.c;
                Set set = ((byj1) obj2).b;
                this.b = true;
                return p8n0Var.a(set, this) == d9nVar ? d9nVar : rih1Var;
            case 2:
                u3k1 u3k1Var = (u3k1) this.c;
                boolean z3 = this.b;
                if (z3) {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objN = obj;
                    return (llg) objN;
                }
                hm5.M(obj);
                String str = u3k1Var.a.a;
                Set set2 = s4b1.f;
                if (uic.g(str, blc0.M3)) {
                    String str2 = u3k1Var.a.a;
                    this.b = true;
                    objN = ((dc31) obj2).n(str2, this);
                    if (objN == d9nVar) {
                        return d9nVar;
                    }
                    return (llg) objN;
                }
                return null;
            case 3:
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                d0r d0rVar = (d0r) this.c;
                o3r o3rVar = f4k1.g;
                k3k1 k3k1Var = ((u3k1) obj2).a;
                this.b = true;
                Object objF = t3k1.F(d0rVar, o3rVar, k3k1Var, this);
                return objF == d9nVar ? d9nVar : objF;
            case 4:
                View view = (View) obj2;
                ssw0 ssw0Var = (ssw0) this.c;
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
                zqi1 zqi1Var = new zqi1(ssw0Var, (byte) 2);
                ssw0Var.l(Boolean.valueOf(view.hasWindowFocus()));
                view.getViewTreeObserver().addOnWindowFocusChangeListener(zqi1Var);
                g4k1 g4k1Var = new g4k1((Object) view, (Object) zqi1Var, (byte) 4);
                this.c = null;
                this.b = true;
                return jch0.s(ssw0Var, g4k1Var, this) == d9nVar ? d9nVar : rih1Var;
            case 5:
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ejm1 ejm1Var = (ejm1) ((pck1) this.c).k.get();
                this.b = true;
                Object objA2 = ((hjm1) ejm1Var).a((String) obj2, this);
                return objA2 == d9nVar ? d9nVar : objA2;
            case 6:
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
                u601 u601Var = (u601) this.c;
                t6j1 t6j1Var = new t6j1((uhk1) obj2, lnmVar, (byte) 12);
                this.b = true;
                return u601Var.b(t6j1Var, this) == d9nVar ? d9nVar : rih1Var;
            case 7:
                psw0 psw0Var = (nsw0) obj2;
                boolean z8 = this.b;
                if (!z8) {
                    hm5.M(obj);
                    psw0Var.setValue(Boolean.FALSE);
                    return rih1Var;
                }
                if (!z8) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    hm5.M(obj);
                    jah.d();
                }
                return null;
            case 8:
                boolean z9 = this.b;
                if (z9) {
                    if (z9) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                pp31 pp31Var = (op31) ((zsc) this.c).b;
                j0l1 j0l1Var = (j0l1) obj2;
                String str3 = j0l1Var.b;
                List listQ0 = f46.Q0(j0l1Var.e);
                this.b = true;
                pp31 pp31Var2 = pp31Var;
                Object objH = c921.H(pp31Var2.b, new zn0(str3, listQ0, mp31.a, pp31Var2, (String) null, "vtec", "vtec", (lnm) null), this);
                return objH == d9nVar ? d9nVar : objH;
            case 9:
                boolean z10 = this.b;
                if (!z10) {
                    hm5.M(obj);
                    cik1 cik1Var = (cik1) this.c;
                    ay8 ay8VarH = d3p1.H((d0r) cik1Var.c, (o3r) cik1Var.e, ((cbk0) cik1Var.b).b.b);
                    lm9 lm9Var = new lm9((String) obj2, (lnm) null, (byte) 9);
                    this.b = true;
                    objJ = b5p1.j(ay8VarH, lm9Var, this);
                    if (objJ == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z10) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objJ = obj;
                }
                return ((Map) objJ).get("automix.transition_uri");
            case 10:
                boolean z11 = this.b;
                if (!z11) {
                    hm5.M(obj);
                    this.b = true;
                    if (hap1.i(3000L, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z11) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                c5l1 c5l1Var = (c5l1) this.c;
                Set set3 = c5l1.S1;
                c5l1Var.N0().getWindow().setBackgroundDrawableResource(2131104047);
                View view2 = (View) obj2;
                if (view2 == null) {
                    return rih1Var;
                }
                view2.setVisibility(0);
                return rih1Var;
            case 11:
                c9n c9nVar = (c9n) this.c;
                boolean z12 = this.b;
                if (z12) {
                    if (!z12) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        hm5.M(obj);
                    }
                    return null;
                }
                hm5.M(obj);
                k42 k42Var = (k42) obj2;
                xe01 xe01Var = ((hcl1) k42Var.j).g;
                bda1 bda1Var = new bda1(c9nVar, k42Var);
                this.c = null;
                this.b = true;
                if (xe01Var.a.collect(bda1Var, this) == d9nVar) {
                    return d9nVar;
                }
                jah.d();
                return null;
            case 12:
                boolean z13 = this.b;
                if (z13) {
                    if (z13) {
                        throw l1d.v(obj);
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                r091 r091Var = (r091) this.c;
                bpb1 bpb1Var = r091Var.g;
                i6e1 i6e1Var = new i6e1((g9l1) obj2, r091Var, (byte) 29);
                this.b = true;
                bpb1Var.collect(i6e1Var, this);
                return d9nVar;
            case 13:
                boolean z14 = this.b;
                if (z14) {
                    if (z14) {
                        throw l1d.v(obj);
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                dt71 dt71Var = ((akr0) this.c).c;
                bda1 bda1Var2 = new bda1((jkr0) obj2, (byte) 26);
                this.b = true;
                dt71Var.collect(bda1Var2, this);
                return d9nVar;
            case 14:
                boolean z15 = this.b;
                if (z15) {
                    if (z15) {
                        throw l1d.v(obj);
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                dt71 dt71Var2 = ((sfx0) this.c).b;
                bda1 bda1Var3 = new bda1((tfx0) obj2, (byte) 27);
                this.b = true;
                dt71Var2.collect(bda1Var3, this);
                return d9nVar;
            case 15:
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
                mr20 mr20VarU = rqt0.u(rwq.q(new of((jkr0) this.c, (byte) 15)));
                lm31 lm31Var = new lm31((iu30) obj2, (byte) 17);
                this.b = true;
                return mr20VarU.collect(lm31Var, this) == d9nVar ? d9nVar : rih1Var;
            case 16:
                npl1 npl1Var = (npl1) this.c;
                boolean z17 = this.b;
                if (!z17) {
                    hm5.M(obj);
                    xkb1 xkb1Var = new xkb1(new xkb1(new uji1(npl1Var.b, (byte) 7), (byte) 19), (byte) 20);
                    this.b = true;
                    objI = b5p1.i(xkb1Var, this);
                    if (objI == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z17) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objI = obj;
                }
                npl1Var.c((epl1) obj2, (PlayerState) objI);
                return rih1Var;
            case 17:
                spl1 spl1Var = (spl1) this.c;
                boolean z18 = this.b;
                if (!z18) {
                    hm5.M(obj);
                    geo0 geo0Var = geo0.b;
                    dim dimVar = new dim((int[]) obj2, spl1Var, null);
                    this.b = true;
                    if (fn31.Y(geo0Var, dimVar, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z18) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                spl1Var.l.d((CancellationException) null);
                return rih1Var;
            case 18:
                boolean z19 = this.b;
                if (!z19) {
                    hm5.M(obj);
                    sn40 sn40Var = (sn40) this.c;
                    this.b = true;
                    objA = ((un40) sn40Var).a(this);
                    if (objA == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z19) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objA = obj;
                }
                Integer num = (Integer) objA;
                if ((num != null ? num.intValue() : 0) <= 0) {
                    return rih1Var;
                }
                ((cql1) ((bql1) obj2)).a();
                return rih1Var;
            case 19:
                v3k v3kVar = (p311) this.c;
                View view3 = (View) obj2;
                boolean z20 = this.b;
                try {
                    if (!z20) {
                        hm5.M(obj);
                        this.b = true;
                        Object objJ2 = b5p1.j(((p311) v3kVar).v, new ck01(2, (lnm) null, (byte) 3), this);
                        if (objJ2 != d9nVar) {
                            objJ2 = rih1Var;
                        }
                        if (objJ2 == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z20) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    if (gtl1.a(view3) != v3kVar) {
                        return rih1Var;
                    }
                    view3.setTag(2131427576, null);
                    return rih1Var;
                } catch (Throwable th) {
                    if (gtl1.a(view3) == v3kVar) {
                        view3.setTag(2131427576, null);
                    }
                    throw th;
                }
            case 20:
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
                m441 m441VarQ = rwq.q(new z7m((kes) this.c, (byte) 1));
                i9l1 i9l1Var = new i9l1((ven0) obj2, (byte) 2);
                this.b = true;
                return m441VarQ.collect(i9l1Var, this) == d9nVar ? d9nVar : rih1Var;
            case 21:
                boolean z22 = this.b;
                if (z22) {
                    if (z22) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                EsOfflinePlugin.DownloadCommand downloadCommand = (EsOfflinePlugin.DownloadCommand) this.c;
                jyl1 jyl1Var = (jyl1) obj2;
                vpp0 vpp0Var = jyl1Var.d;
                xrc0 xrc0Var = jyl1Var.e;
                ytw0 ytw0Var = jyl1Var.c;
                rm5 rm5Var = jyl1Var.a;
                avw0 avw0Var = jyl1Var.b;
                m2l1 m2l1Var = jyl1Var.h;
                tz01 tz01Var = jyl1Var.f;
                xaz0 xaz0Var = jyl1Var.g;
                ConcurrentHashMap concurrentHashMap = jyl1Var.i;
                this.b = true;
                Object objB = qxu.b(downloadCommand, vpp0Var, xrc0Var, ytw0Var, rm5Var, avw0Var, m2l1Var, tz01Var, xaz0Var, concurrentHashMap, this);
                return objB == d9nVar ? d9nVar : objB;
            case 22:
                boolean z23 = this.b;
                if (z23) {
                    if (z23) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                EsOfflinePlugin.IdentifyCommand identifyCommand = (EsOfflinePlugin.IdentifyCommand) this.c;
                jyl1 jyl1Var2 = (jyl1) obj2;
                vpp0 vpp0Var2 = jyl1Var2.d;
                xrc0 xrc0Var2 = jyl1Var2.e;
                rm5 rm5Var2 = jyl1Var2.a;
                m2l1 m2l1Var2 = jyl1Var2.h;
                this.b = true;
                Object objB2 = qn70.b(identifyCommand, vpp0Var2, xrc0Var2, rm5Var2, m2l1Var2, this);
                return objB2 == d9nVar ? d9nVar : objB2;
            case 23:
                vr20 vr20Var = (vr20) this.c;
                boolean z24 = this.b;
                if (!z24) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    return vr20Var.emit((PlayerState) obj2, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z24) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 24:
                boolean z25 = this.b;
                if (!z25) {
                    hm5.M(obj);
                    this.b = true;
                    Object objR = ((vi11) this.c).r((String) obj2, this);
                    return objR == d9nVar ? d9nVar : objR;
                }
                if (z25) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 25:
                boolean z26 = this.b;
                if (!z26) {
                    hm5.M(obj);
                    this.b = true;
                    Object objD = ((u6y0) ((bz11) this.c).e).d((String) obj2, this);
                    return objD == d9nVar ? d9nVar : objD;
                }
                if (z26) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 26:
                boolean z27 = this.b;
                if (z27) {
                    if (z27) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mzc0 mzc0Var = (mzc0) this.c;
                uji1 uji1Var = new uji1(mzc0Var.b.k((String) obj2, (trc0) mzc0Var.d.getValue()), (byte) 9);
                this.b = true;
                Object objK = b5p1.k(uji1Var, this);
                return objK == d9nVar ? d9nVar : objK;
            case 27:
                o7m1 o7m1Var = (o7m1) this.c;
                boolean z28 = this.b;
                if (z28) {
                    if (z28) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                any anyVarD = o7m1Var.b.d();
                mxj1 mxj1Var = new mxj1(o7m1Var, (jb20) obj2, null);
                this.b = true;
                Object objJ3 = b5p1.j(anyVarD, mxj1Var, this);
                return objJ3 == d9nVar ? d9nVar : objJ3;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                boolean z29 = this.b;
                if (!z29) {
                    hm5.M(obj);
                    this.b = true;
                    Object objA3 = ((o7m1) this.c).a((String) obj2, this);
                    return objA3 == d9nVar ? d9nVar : objA3;
                }
                if (z29) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                xgm1 xgm1Var = ((l8m1) this.c).c;
                hm5.M(obj);
                if (((Boolean) ((ven0) obj2).getValue()).booleanValue() && this.b) {
                    xgm1Var.a(igm1.a);
                    xgm1Var.a(fgm1.a);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gqj1(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gqj1(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }
}
