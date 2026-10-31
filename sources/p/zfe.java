package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import java.net.URL;
import java.util.concurrent.CancellationException;
import spotify.playlist.esperanto.proto.PlaylistGetRequest;
import spotify.playlist.esperanto.proto.PlaylistGetResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zfe extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public final /* synthetic */ Object d;
    public /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zfe(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // p.faa
    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                zfe zfeVar = new zfe((vr20) obj2, (age) this.e, lnmVar, (byte) 0);
                zfeVar.c = obj;
                return zfeVar;
            case 1:
                zfe zfeVar2 = new zfe((jge) this.e, (vr20) obj2, lnmVar);
                zfeVar2.c = obj;
                return zfeVar2;
            case 2:
                zfe zfeVar3 = new zfe((fu20) obj2, (hx4) this.e, lnmVar, (byte) 2);
                zfeVar3.c = obj;
                return zfeVar3;
            case 3:
                return new zfe((String) this.c, (rgn0) obj2, (sfn0) this.e, lnmVar, (byte) 3);
            case 4:
                return new zfe((xmn) this.c, (tqw) obj2, (ldo) this.e, lnmVar, (byte) 4);
            case 5:
                zfe zfeVar4 = new zfe((yfu) obj2, (URL) this.e, lnmVar, (byte) 5);
                zfeVar4.c = obj;
                return zfeVar4;
            case 6:
                zfe zfeVar5 = new zfe((vr20) obj2, lnmVar);
                zfeVar5.e = ((qge) obj).a;
                return zfeVar5;
            case 7:
                return new zfe((ve01) this.c, (bpb1) obj2, (dk50) this.e, lnmVar, (byte) 7);
            case 8:
                return new zfe((rsc0) this.c, (String) obj2, (trc0) this.e, lnmVar, (byte) 8);
            case 9:
                zfe zfeVar6 = new zfe((rf01) obj2, (zy70) this.e, lnmVar, (byte) 9);
                zfeVar6.c = obj;
                return zfeVar6;
            case 10:
                return new zfe((im0) this.c, (ContextTrack) obj2, (PlayerState) this.e, lnmVar, (byte) 10);
            case 11:
                return new zfe((hd81) this.c, (id81) obj2, (iu30) this.e, lnmVar, (byte) 11);
            case 12:
                zfe zfeVar7 = new zfe((vu30) obj2, (ven0) this.e, lnmVar, (byte) 12);
                zfeVar7.c = obj;
                return zfeVar7;
            case 13:
                return new zfe((ocj1) this.c, (taj1) obj2, (ven0) this.e, lnmVar, (byte) 13);
            case 14:
                zfe zfeVar8 = new zfe((dzp0) obj2, (xmn1) this.e, lnmVar, (byte) 14);
                zfeVar8.c = obj;
                return zfeVar8;
            default:
                zfe zfeVar9 = new zfe((yln1) obj2, (x5o1) this.e, lnmVar, (byte) 15);
                zfeVar9.c = obj;
                return zfeVar9;
        }
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return ((zfe) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 1:
                return ((zfe) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 2:
                return ((zfe) create((ssw0) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 3:
                return ((zfe) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 4:
                return ((zfe) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 5:
                return ((zfe) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 6:
                Object obj3 = ((qge) obj).a;
                zfe zfeVar = new zfe((vr20) this.d, (lnm) obj2);
                zfeVar.e = obj3;
                return zfeVar.invokeSuspend(rih1Var);
            case 7:
                ((zfe) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return d9n.a;
            case 8:
                return ((zfe) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 9:
                return ((zfe) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 10:
                return ((zfe) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 11:
                return ((zfe) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 12:
                return ((zfe) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 13:
                return ((zfe) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 14:
                return ((zfe) create((rvo1) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            default:
                return ((zfe) create((zwo1) obj, (lnm) obj2)).invokeSuspend(rih1Var);
        }
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object m231Var;
        Object objJ;
        Object objQ;
        ipr iprVarM;
        mxh mxhVar;
        Object objB;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                c9n c9nVar = (c9n) this.c;
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
                jfe jfeVarJ = ((age) this.e).j(c9nVar);
                this.c = null;
                this.b = true;
                return k4p1.r((vr20) obj2, jfeVarJ, this) == d9nVar ? d9nVar : rih1Var;
            case 1:
                c9n c9nVar2 = (c9n) this.c;
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p811 p811VarU = cy30.u(obj);
                jge jgeVar = (jge) this.e;
                mr20 mr20Var = jgeVar.d;
                u60 u60Var = new u60(p811VarU, c9nVar2, jgeVar, (vr20) obj2, (byte) 10);
                this.c = null;
                this.b = true;
                return mr20Var.collect(u60Var, this) == d9nVar ? d9nVar : rih1Var;
            case 2:
                boolean z3 = this.b;
                if (z3) {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    return rih1Var;
                }
                hm5.M(obj);
                ssw0 ssw0Var = (ssw0) this.c;
                q6n1 q6n1Var = new q6n1();
                l811 l811Var = new l811();
                l811Var.a = true;
                ege egeVar = new ege(q6n1Var, ssw0Var, (hx4) this.e, l811Var);
                this.c = ssw0Var;
                this.b = true;
                return ((fu20) obj2).collect(egeVar, this) == d9nVar ? d9nVar : rih1Var;
            case 3:
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
                String str = (String) this.c;
                if (str == null) {
                    return rih1Var;
                }
                rgn0 rgn0Var = (rgn0) obj2;
                sfn0 sfn0Var = (sfn0) this.e;
                nwd nwdVar = new nwd(rqt0.u(u4p1.b0(rgn0Var.a(), new bag(rgn0Var, (lnm) null, (byte) 21))), (byte) 17);
                mib mibVar = new mib(sfn0Var, str, (byte) 2);
                this.b = true;
                return nwdVar.collect(mibVar, this) == d9nVar ? d9nVar : rih1Var;
            case 4:
                xmn xmnVar = (xmn) this.c;
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    vrv0 vrv0VarB = xmnVar.b();
                    if (vrv0VarB != null) {
                        vrv0VarB.m();
                    }
                    tqw tqwVar = (tqw) obj2;
                    tqwVar.getClass();
                    tv80 tv80VarY = n3o1.y(tqwVar);
                    kmn kmnVarB = xmnVar.a().b();
                    if (kmnVarB instanceof kmn) {
                        ldo.u((ldo) this.e).a(kmnVarB.a(), tv80VarY, null);
                        return rih1Var;
                    }
                    if (kmnVarB instanceof jmn) {
                        vu30 vu30VarA = ((jmn) kmnVarB).a();
                        this.b = true;
                        return vu30VarA.invoke(tv80VarY, this) == d9nVar ? d9nVar : rih1Var;
                    }
                    eg.o();
                } else {
                    if (z5) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 5:
                boolean z6 = this.b;
                try {
                    if (!z6) {
                        hm5.M(obj);
                        Single singleD = ((iru) ((yfu) obj2).b).d((URL) this.e);
                        this.c = null;
                        this.b = true;
                        objJ = fc11.j(singleD, this);
                        if (objJ == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z6) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objJ = obj;
                    }
                    m231Var = (Boolean) objJ;
                    break;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                Boolean bool = (Boolean) (m231Var instanceof m231 ? null : m231Var);
                return yah0.m(bool != null ? bool.booleanValue() : false);
            case 6:
                Object obj3 = this.e;
                boolean z7 = this.b;
                if (!z7) {
                    hm5.M(obj);
                    vr20 vr20Var = (vr20) obj2;
                    if (!(obj3 instanceof pge)) {
                        this.e = null;
                        this.c = obj3;
                        this.b = true;
                        if (vr20Var.emit(obj3, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (!z7) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj3 = this.c;
                    hm5.M(obj);
                }
                if (!(obj3 instanceof oge)) {
                    return yah0.m(true);
                }
                Throwable thA = qge.a(obj3);
                if (thA == null) {
                    return yah0.m(false);
                }
                throw thA;
            case 7:
                boolean z8 = this.b;
                if (z8) {
                    if (!z8) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        hm5.M(obj);
                    }
                    return null;
                }
                hm5.M(obj);
                ve01 ve01Var = (ve01) this.c;
                vr20 mibVar2 = new mib((bpb1) obj2, (dk50) this.e, (byte) 13);
                this.b = true;
                if (ve01Var.a.collect(mibVar2, this) == d9nVar) {
                    return d9nVar;
                }
                jah.d();
                return null;
            case 8:
                String str2 = (String) obj2;
                rsc0 rsc0Var = (rsc0) this.c;
                boolean z9 = this.b;
                if (!z9) {
                    hm5.M(obj);
                    jn7 jn7Var = rsc0Var.f;
                    PlaylistGetRequest playlistGetRequestD = rsc0Var.d(str2, rsc0Var.e.a(), (trc0) this.e);
                    playlistGetRequestD.getClass();
                    this.b = true;
                    objQ = jn7Var.q(playlistGetRequestD, this);
                    if (objQ == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z9) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objQ = obj;
                }
                PlaylistGetResponse playlistGetResponse = (PlaylistGetResponse) objQ;
                return i2x0.l(playlistGetResponse.r(), str2, new ft0(rsc0Var, playlistGetResponse, (byte) 12));
            case 9:
                zy70 zy70Var = (zy70) this.e;
                rf01 rf01Var = (rf01) obj2;
                c9n c9nVar3 = (c9n) this.c;
                boolean z10 = this.b;
                if (z10) {
                    if (z10) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                l2t l2tVarA = jto1.v(zy70Var, c921.q(c9nVar3, (o8n) rf01Var.a.c.getValue(), 0, new b201(rf01Var, zy70Var, (lnm) null, (byte) 8), 2)).a();
                this.c = null;
                this.b = true;
                Object objE = l2tVarA.E(this);
                return objE == d9nVar ? d9nVar : objE;
            case 10:
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
                ijr ijrVarE = im0.e((im0) this.c);
                String strUri = ((ContextTrack) obj2).uri();
                String strContextUri = ((PlayerState) this.e).contextUri();
                this.b = true;
                return ijrVarE.f(strUri, strContextUri, this) == d9nVar ? d9nVar : rih1Var;
            case 11:
                id81 id81Var = (id81) obj2;
                hd81 hd81Var = (hd81) this.c;
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
                abu0 abu0Var = (abu0) hd81Var.Y.invoke();
                zau0 zau0VarE = abu0Var != null ? abu0Var.e(id81Var.b, false) : null;
                if (id81Var.h == 3 && (mxhVar = id81Var.f) != null) {
                    hd81Var.Z.c(mxhVar.a(), zau0VarE);
                }
                if (id81Var.i != null) {
                    Flowable flowable = hd81Var.N0.b(new oi("showcase-music-video", new d781(id81Var, (byte) 5))).toFlowable(BackpressureStrategy.d);
                    vbm[] vbmVarArr = q601.a;
                    iprVarM = f5p1.s(new kge(flowable), new dd81(7), new dwf0(id81Var, (lnm) null, (byte) 23));
                } else {
                    iprVarM = h4p1.m(new dd81(3));
                }
                nwt nwtVar = hd81Var.V0;
                ht20 ht20VarB0 = nwtVar != null ? u4p1.b0(new tu41(nwtVar.a(), (byte) 20), new egv0((byte) 18)) : h4p1.m((Object) null);
                mr20 mr20VarI = t5p1.i(hd81Var.a);
                Flowable flowable2 = hd81Var.f;
                vbm[] vbmVarArr2 = q601.a;
                mr20 mr20VarU = rqt0.u(new mpy0(new sr0(new mr20[]{mr20VarI, new kge(flowable2), hd81Var.g.a(), hd81Var.t, iprVarM, ht20VarB0}, id81Var, hd81Var, zau0VarE, (byte) 25), id81Var, hd81Var, (byte) 14));
                uqs0 uqs0Var = new uqs0((iu30) this.e, hd81Var, id81Var, (byte) 27);
                this.b = true;
                return mr20VarU.collect(uqs0Var, this) == d9nVar ? d9nVar : rih1Var;
            case 12:
                boolean z13 = this.b;
                if (!z13) {
                    hm5.M(obj);
                    psw0 psw0Var = new psw0((ven0) this.e, ((c9n) this.c).J());
                    this.b = true;
                    return ((vu30) obj2).invoke(psw0Var, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z13) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                ocj1 ocj1Var = (ocj1) this.c;
                boolean z14 = this.b;
                if (!z14) {
                    hm5.M(obj);
                    this.b = true;
                    objB = ocj1.c(ocj1Var).b((taj1) obj2, this);
                    if (objB == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z14) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objB = obj;
                }
                icj1 icj1Var = (icj1) objB;
                if (icj1Var == null) {
                    ocj1.d(ocj1Var).g();
                    return rih1Var;
                }
                muh1.a((ven0) this.e, icj1Var);
                return rih1Var;
            case 14:
                boolean z15 = this.b;
                hm5.M(obj);
                if (z15) {
                    return obj;
                }
                rvo1 rvo1Var = (rvo1) this.c;
                dzp0 dzp0Var = (dzp0) obj2;
                o8n o8nVar = ((llm) ((qeh1) dzp0Var.d).a()).a;
                g1y g1yVar = new g1y(dzp0Var, rvo1Var, (xmn1) this.e, (lnm) null, (byte) 7);
                this.b = true;
                Object objH = c921.H(o8nVar, g1yVar, this);
                return objH == d9nVar ? d9nVar : objH;
            default:
                boolean z16 = this.b;
                hm5.M(obj);
                if (z16) {
                    return obj;
                }
                azn1 azn1Var = new azn1((yln1) obj2, (x5o1) this.e, (zwo1) this.c, (lnm) null, (byte) 3);
                this.b = true;
                Object objS = smo1.s(azn1Var, this);
                return objS == d9nVar ? d9nVar : objS;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zfe(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zfe(jge jgeVar, vr20 vr20Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 1;
        this.e = jgeVar;
        this.d = vr20Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zfe(vr20 vr20Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 6;
        this.d = vr20Var;
    }
}
