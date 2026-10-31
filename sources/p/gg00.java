package p;

import com.spotify.concertview.concertfeedview.v1.Concept;
import com.spotify.concertview.concertfeedview.v1.ConceptGroup;
import com.spotify.concertview.concertfeedview.v1.GetConceptsResponse;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.wear.wearabledatalayer.SpotifyWearableListenerService;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gg00 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gg00(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                gg00 gg00Var = new gg00((uo5) obj4, (lnm) obj3, (byte) 0);
                gg00Var.c = (vr20) obj;
                gg00Var.d = (kf00) obj2;
                return gg00Var.invokeSuspend(rih1Var);
            case 1:
                gg00 gg00Var2 = new gg00((bpb1) obj4, (lnm) obj3, (byte) 1);
                gg00Var2.c = (vr20) obj;
                gg00Var2.d = (kk50) obj2;
                return gg00Var2.invokeSuspend(rih1Var);
            case 2:
                gg00 gg00Var3 = new gg00((duj0) obj4, (lnm) obj3, (byte) 2);
                gg00Var3.c = (vr20) obj;
                gg00Var3.d = (w4l) obj2;
                return gg00Var3.invokeSuspend(rih1Var);
            case 3:
                gg00 gg00Var4 = new gg00((yxb0) obj4, (lnm) obj3, (byte) 3);
                gg00Var4.c = (vr20) obj;
                gg00Var4.d = (hnk0) obj2;
                return gg00Var4.invokeSuspend(rih1Var);
            case 4:
                gg00 gg00Var5 = new gg00((v9u0) this.d, (vy1) obj4, (lnm) obj3, (byte) 4);
                gg00Var5.c = (x610) obj;
                return gg00Var5.invokeSuspend(rih1Var);
            case 5:
                gg00 gg00Var6 = new gg00((ao51) this.d, (v9u0) obj4, (lnm) obj3, (byte) 5);
                gg00Var6.c = (x610) obj;
                return gg00Var6.invokeSuspend(rih1Var);
            case 6:
                gg00 gg00Var7 = new gg00((ggv0) obj4, (lnm) obj3, (byte) 6);
                gg00Var7.c = (vr20) obj;
                gg00Var7.d = (oei1) obj2;
                return gg00Var7.invokeSuspend(rih1Var);
            default:
                gg00 gg00Var8 = new gg00((up41) obj4, (lnm) obj3, (byte) 7);
                gg00Var8.c = (vr20) obj;
                gg00Var8.d = (t681) obj2;
                return gg00Var8.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        byte b2 = 6;
        h5e0 h5e0Var = h5e0.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj2 = this.e;
        lnm lnmVar = null;
        switch (b) {
            case 0:
                vr20 vr20Var = (vr20) this.c;
                kf00 kf00Var = (kf00) this.d;
                byte b3 = this.b;
                try {
                    if (b3 == 0) {
                        hm5.M(obj);
                        uo5 uo5Var = (uo5) obj2;
                        jj40 jj40Var = kf00Var.e;
                        String strValueOf = jj40Var != null ? String.valueOf(jj40Var.b) : null;
                        this.c = vr20Var;
                        this.d = null;
                        this.b = (byte) 1;
                        obj = uo5Var.B(strValueOf, this);
                        if (obj == d9nVar) {
                        }
                        return d9nVar;
                    }
                    if (b3 != 1) {
                        if (b3 == 2) {
                            hm5.M(obj);
                            return rih1Var;
                        }
                        if (b3 == 3) {
                            hm5.M(obj);
                            return rih1Var;
                        }
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    h290<ConceptGroup> h290VarN = ((GetConceptsResponse) obj).n();
                    ArrayList arrayList = new ArrayList(q7h.U(h290VarN, 10));
                    for (ConceptGroup conceptGroup : h290VarN) {
                        String title = conceptGroup.getTitle();
                        h290<Concept> h290VarN2 = conceptGroup.n();
                        ArrayList arrayList2 = new ArrayList(q7h.U(h290VarN2, 10));
                        for (Concept concept : h290VarN2) {
                            arrayList2.add(new p5k(concept.getUri(), concept.getName(), null));
                        }
                        arrayList.add(new x5k(title, arrayList2));
                    }
                    ug00 ug00Var = new ug00(arrayList);
                    this.c = vr20Var;
                    this.d = null;
                    this.b = (byte) 2;
                    if (vr20Var.emit(ug00Var, this) != d9nVar) {
                        return rih1Var;
                    }
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception unused) {
                    this.c = null;
                    this.d = null;
                    this.b = (byte) 3;
                    if (vr20Var.emit(tg00.a, this) != d9nVar) {
                        return rih1Var;
                    }
                }
                return d9nVar;
            case 1:
                bpb1 bpb1Var = (bpb1) obj2;
                vr20 vr20Var2 = (vr20) this.c;
                kk50 kk50Var = (kk50) this.d;
                byte b4 = this.b;
                if (b4 == 0) {
                    hm5.M(obj);
                    if (kk50Var instanceof ik50) {
                        this.c = null;
                        this.d = null;
                        this.b = (byte) 1;
                        if (vr20Var2.emit(h5e0Var, this) == d9nVar) {
                            return d9nVar;
                        }
                    } else if (kk50Var instanceof hk50) {
                        bpb1Var.l(mqo1.A(((hk50) kk50Var).a));
                        f5e0 f5e0Var = new f5e0(bpb1Var);
                        this.c = null;
                        this.d = null;
                        this.b = (byte) 2;
                        if (vr20Var2.emit(f5e0Var, this) == d9nVar) {
                            return d9nVar;
                        }
                    } else if (kk50Var instanceof gk50) {
                        m5e0 m5e0Var = new m5e0(((gk50) kk50Var).a);
                        this.c = null;
                        this.d = null;
                        this.b = (byte) 3;
                        if (vr20Var2.emit(m5e0Var, this) == d9nVar) {
                            return d9nVar;
                        }
                    } else if (!(kk50Var instanceof jk50)) {
                        eg.o();
                        return null;
                    }
                    z = true;
                } else if (b4 == 1) {
                    hm5.M(obj);
                    z = true;
                } else {
                    if (b4 != 2 && b4 != 3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return Boolean.valueOf(z);
            case 2:
                vr20 vr20Var3 = (vr20) this.c;
                w4l w4lVar = (w4l) this.d;
                byte b5 = this.b;
                if (b5 == 0) {
                    hm5.M(obj);
                    zx60 zx60Var = new zx60(yoi1.g(((duj0) obj2).f), (byte) 24);
                    this.c = vr20Var3;
                    this.d = w4lVar;
                    this.b = (byte) 1;
                    obj = b5p1.i(zx60Var, this);
                    if (obj != d9nVar) {
                    }
                    return d9nVar;
                }
                if (b5 != 1) {
                    if (b5 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mmr0 mmr0Var = new mmr0((spq0) obj, w4lVar);
                this.c = null;
                this.d = null;
                this.b = (byte) 2;
                if (vr20Var3.emit(mmr0Var, this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            case 3:
                yxb0 yxb0Var = (yxb0) obj2;
                vr20 vr20Var4 = (vr20) this.c;
                dnk0 dnk0Var = (hnk0) this.d;
                byte b6 = this.b;
                if (b6 != 0) {
                    if (b6 == 1 || b6 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if ((dnk0Var instanceof dnk0) && ((fn4) yxb0Var.d).a()) {
                    this.c = null;
                    this.d = null;
                    this.b = (byte) 1;
                    if (yxb0Var.j(vr20Var4, dnk0Var, this) != d9nVar) {
                        return rih1Var;
                    }
                } else {
                    this.c = null;
                    this.d = null;
                    this.b = (byte) 2;
                    if (vr20Var4.emit(dnk0Var, this) != d9nVar) {
                        return rih1Var;
                    }
                }
                return d9nVar;
            case 4:
                String str = ((vy1) obj2).a;
                v9u0 v9u0Var = (v9u0) this.d;
                x610 x610Var = (x610) this.c;
                byte b7 = this.b;
                if (b7 != 0) {
                    if (b7 == 1) {
                        hm5.M(obj);
                    } else {
                        if (b7 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    kzq.Companion.getClass();
                    return jzq.b();
                }
                hm5.M(obj);
                Single singleZ = v9u0Var.h.z();
                this.c = x610Var;
                this.b = (byte) 1;
                obj = fc11.j(singleZ, this);
                if (obj == d9nVar) {
                    return d9nVar;
                }
                if (((PlayerState) obj).restrictions().disallowAddToQueueReasons().isEmpty()) {
                    j710 j710Var = (i710) x610Var.a.j.get();
                    j710Var.a.a(j710Var.b.a(ContextTrack.create(str)).subscribe(new jld((byte) 5), new jld((byte) 6)));
                    g510 g510Var = v9u0Var.b;
                    Single singleQ = g510.q(g510Var, SpotifyWearableListenerService.T0, g510Var.h.e(str));
                    this.c = null;
                    this.b = (byte) 2;
                    if (fc11.j(singleQ, this) == d9nVar) {
                        return d9nVar;
                    }
                }
                kzq.Companion.getClass();
                return jzq.b();
            case 5:
                Long l = ((ao51) this.d).a;
                x610 x610Var2 = (x610) this.c;
                byte b8 = this.b;
                if (b8 != 0) {
                    if (b8 == 1) {
                        hm5.M(obj);
                    } else {
                        if (b8 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    kzq.Companion.getClass();
                    return jzq.b();
                }
                hm5.M(obj);
                g710 g710VarC = x610Var2.c();
                long jLongValue = l != null ? l.longValue() : 0L;
                g710 g710Var = g710VarC;
                g710Var.getClass();
                Single singleDoOnSuccess = g710Var.k.a(new i9u0(jLongValue)).doOnSuccess(new b710(g710Var, (byte) 2));
                this.c = null;
                this.b = (byte) 1;
                if (fc11.j(singleDoOnSuccess, this) == d9nVar) {
                    return d9nVar;
                }
                Single singleL = ((v9u0) obj2).b.l(l != null ? l.longValue() : 0L, SpotifyWearableListenerService.T0);
                this.c = null;
                this.b = (byte) 2;
                if (fc11.j(singleL, this) == d9nVar) {
                    return d9nVar;
                }
                kzq.Companion.getClass();
                return jzq.b();
            case 6:
                vr20 vr20Var5 = (vr20) this.c;
                oei1 oei1Var = (oei1) this.d;
                byte b9 = this.b;
                if (b9 == 0) {
                    hm5.M(obj);
                    this.c = vr20Var5;
                    this.d = oei1Var;
                    this.b = (byte) 1;
                    if (vr20Var5.emit((Object) null, this) != d9nVar) {
                    }
                    return d9nVar;
                }
                if (b9 != 1) {
                    if (b9 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (oei1Var == null) {
                    return rih1Var;
                }
                ggv0 ggv0Var = (ggv0) obj2;
                m441 m441Var = oei1Var.c ? new m441(new glu0(ggv0Var, oei1Var, lnmVar, b2)) : new m9r0(ggv0Var.b.b, oei1Var, (byte) 22);
                this.c = null;
                this.d = null;
                this.b = (byte) 2;
                if (l4p1.s(vr20Var5, m441Var, this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            default:
                p681 p681Var = (p681) ((up41) obj2).b;
                vr20 vr20Var6 = (vr20) this.c;
                t681 t681Var = (t681) this.d;
                byte b10 = this.b;
                if (b10 != 0) {
                    if (b10 != 1) {
                        if (b10 != 2) {
                            if (b10 != 3) {
                                if (b10 != 4) {
                                    eg.m("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            }
                        }
                        hm5.M(obj);
                    }
                    hm5.M(obj);
                    z = true;
                } else {
                    hm5.M(obj);
                    if (u890.j(t681Var, r681.a)) {
                        this.c = null;
                        this.d = null;
                        this.b = (byte) 1;
                        if (vr20Var6.emit(h5e0Var, this) == d9nVar) {
                            return d9nVar;
                        }
                    } else if (t681Var instanceof q681) {
                        f5e0 f5e0Var2 = new f5e0(p681Var.c);
                        this.c = null;
                        this.d = null;
                        this.b = (byte) 2;
                        if (vr20Var6.emit(f5e0Var2, this) == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!(t681Var instanceof s681)) {
                            eg.o();
                            return null;
                        }
                        if (((s681) t681Var).a.isEmpty()) {
                            m5e0 m5e0Var2 = new m5e0(new ntj0("Show generation request failed"));
                            this.c = null;
                            this.d = null;
                            this.b = (byte) 3;
                            if (vr20Var6.emit(m5e0Var2, this) == d9nVar) {
                                return d9nVar;
                            }
                        } else {
                            f5e0 f5e0Var3 = new f5e0(p681Var.c);
                            this.c = null;
                            this.d = null;
                            this.b = (byte) 4;
                            if (vr20Var6.emit(f5e0Var3, this) == d9nVar) {
                                return d9nVar;
                            }
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gg00(Object obj, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.e = obj;
    }
}
