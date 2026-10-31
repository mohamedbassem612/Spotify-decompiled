package p;

import android.content.Context;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.ViewGroup;
import com.spotify.ads.esperanto.proto.PutStateRequest;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.util.policy.proto.AlbumDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.player.model.ContextTrack;
import com.spotify.playlist.policy.proto.PlaylistAlbumDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import com.spotify.scrollsita.v1.Section;
import com.spotify.stream_reporting_esperanto.proto.StreamEndRequestOuterClass$StreamEndRequest;
import com.spotify.stream_reporting_esperanto.proto.StreamProgressRequestOuterClass$StreamProgressRequest;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sb91 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sb91(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                return new sb91((tb91) this.c, (swn) obj2, lnmVar, (byte) 0);
            case 1:
                return new sb91((lh91) this.c, (ViewGroup) obj2, lnmVar, (byte) 1);
            case 2:
                return new sb91((qo91) this.c, (String) obj2, lnmVar, (byte) 2);
            case 3:
                return new sb91((ip91) this.c, (String) obj2, lnmVar, (byte) 3);
            case 4:
                return new sb91((ir91) this.c, (oo3) obj2, lnmVar, (byte) 4);
            case 5:
                return new sb91((wr91) this.c, (cg) obj2, lnmVar, (byte) 5);
            case 6:
                return new sb91((xr91) this.c, (cg) obj2, lnmVar, (byte) 6);
            case 7:
                return new sb91((g0i) this.c, (j0d1) obj2, lnmVar, (byte) 7);
            case 8:
                return new sb91((dt71) this.c, (ven0) obj2, lnmVar, (byte) 8);
            case 9:
                return new sb91((my91) this.c, (ArrayList) obj2, lnmVar, (byte) 9);
            case 10:
                return new sb91((my91) this.c, (List) obj2, lnmVar, (byte) 10);
            case 11:
                return new sb91((i5a1) this.c, (go71) obj2, lnmVar, (byte) 11);
            case 12:
                return new sb91(this.c, (xtb0) obj2, lnmVar, (byte) 12);
            case 13:
                return new sb91((m441) this.c, (dda1) obj2, lnmVar, (byte) 13);
            case 14:
                return new sb91((zja1) this.c, (rvt0) obj2, lnmVar, (byte) 14);
            case 15:
                return new sb91((zja1) this.c, (Collection) obj2, lnmVar, (byte) 15);
            case 16:
                sb91 sb91Var = new sb91((d6b1) obj2, lnmVar, (byte) 16);
                sb91Var.c = obj;
                return sb91Var;
            case 17:
                sb91 sb91Var2 = new sb91((Context) obj2, lnmVar, (byte) 17);
                sb91Var2.c = obj;
                return sb91Var2;
            case 18:
                return new sb91((d9b1) this.c, (ContextTrack) obj2, lnmVar, (byte) 18);
            case 19:
                return new sb91((n9b1) this.c, (ContextTrack) obj2, lnmVar, (byte) 19);
            case 20:
                return new sb91((jha1) this.c, (g2z) obj2, lnmVar, (byte) 20);
            case 21:
                sb91 sb91Var3 = new sb91((yeb1) obj2, lnmVar, (byte) 21);
                sb91Var3.c = obj;
                return sb91Var3;
            case 22:
                return new sb91((yxb0) this.c, (tqw) obj2, lnmVar, (byte) 22);
            case 23:
                return new sb91((q5o) this.c, (bkb1) obj2, lnmVar, (byte) 23);
            case 24:
                return new sb91((Map) this.c, (xob1) obj2, lnmVar, (byte) 24);
            case 25:
                return new sb91((vrv0) this.c, (fe5) obj2, lnmVar, (byte) 25);
            case 26:
                return new sb91((ayb1) this.c, (rvb1) obj2, lnmVar, (byte) 26);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                sb91 sb91Var4 = new sb91((gpm0) obj2, lnmVar, (byte) 27);
                sb91Var4.c = obj;
                return sb91Var4;
            case 28:
                return new sb91((rec1) this.c, (mdc1) obj2, lnmVar, (byte) 28);
            default:
                return new sb91((rec1) this.c, (zdc1) obj2, lnmVar, (byte) 29);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invoke(Object obj, Object obj2) throws KotlinNothingValueException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9n.a;
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 17:
                return create((g6b1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 18:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 19:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code duplicated, block: B:183:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:225:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:369:0x078a  */
    /* JADX WARN: Code duplicated, block: B:455:0x04ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:533:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v2, types: [java.lang.Throwable] */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        long jA;
        long jA2;
        ohd ohdVar;
        Object objJ;
        Object obj2;
        List list;
        Object obj3;
        Object objJ2;
        Object objJ3;
        byte b = this.a;
        byte b2 = 29;
        j1r j1rVar = j1r.a;
        boolean z = false;
        int i = 0;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.d;
        Serializable serializable = d9n.a;
        String str = null;
        switch (b) {
            case 0:
                tb91 tb91Var = (tb91) this.c;
                hrr0 hrr0Var = tb91Var.n;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    hrr0Var.setValue(Boolean.TRUE);
                    pfn0 pfn0Var = tb91Var.s;
                    p24 p24Var = tb91Var.r;
                    this.b = true;
                    pfn0Var.getClass();
                    if (smo1.s(new ofn0(hfn0.b, pfn0Var, (swn) obj4, p24Var, (lnm) null), this) == serializable) {
                        return serializable;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                hrr0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 1:
                lh91 lh91Var = (lh91) this.c;
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
                mr20 mr20VarU = rqt0.u(h4p1.f(new zlo(lh91Var.d, (ViewGroup) obj4, (lnm) null, (byte) 12)));
                axn0 axn0Var = lh91Var.e;
                mr20 mr20VarG = yoi1.g(Observable.combineLatest(axn0Var.b, axn0Var.c, ta20.Q0).distinctUntilChanged());
                a82 a82Var = new a82(3, (lnm) null, (byte) 7);
                vi viVar = new vi(lh91Var.a, (byte) 14);
                this.b = true;
                Object objS = fc11.s(vrl.c, this, viVar, new ekv(a82Var, (lnm) null), new mr20[]{mr20VarU, mr20VarG});
                if (objS != serializable) {
                    objS = rih1Var;
                }
                return objS == serializable ? serializable : rih1Var;
            case 2:
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
                rsc0 rsc0Var = ((qo91) this.c).a;
                hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
                vwu0 vwu0VarR = PlaylistTrackDecorationPolicy.r();
                vwu0VarR.A();
                vwu0VarR.x();
                vwu0VarR.u(ArtistDecorationPolicy.newBuilder().setName(true).build());
                dgu0 dgu0VarP = PlaylistAlbumDecorationPolicy.p();
                dgu0VarP.q(AlbumDecorationPolicy.newBuilder().setCovers(true).build());
                vwu0VarR.r(dgu0VarP.build());
                vwu0VarR.D(TrackDecorationPolicy.newBuilder().setName(true).setLink(true).setPreviewId(true).build());
                hru0VarS.y(vwu0VarR.build());
                PlaylistRequestDecorationPolicy playlistRequestDecorationPolicyBuild = hru0VarS.build();
                playlistRequestDecorationPolicyBuild.getClass();
                trc0 trc0Var = new trc0(playlistRequestDecorationPolicyBuild, (g3d0) null, Collections.singleton(grc0.a), false, (src0) null, hqz0.a, (prc0) null, 0, (List) null, 474);
                this.b = true;
                Object objF = rsc0Var.f((String) obj4, trc0Var, this);
                return objF == serializable ? serializable : objF;
            case 3:
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                rsc0 rsc0Var2 = ((ip91) this.c).b;
                hru0 builder = PlaylistRequestDecorationPolicy.n().toBuilder();
                sku0 builder2 = PlaylistDecorationPolicy.o().toBuilder();
                builder2.k0();
                builder.w(builder2.build());
                trc0 trc0Var2 = new trc0(builder.build(), (g3d0) null, (Set) null, false, (src0) null, jqz0.a, (prc0) null, 0, (List) null, 478);
                this.b = true;
                Object objF2 = rsc0Var2.f((String) obj4, trc0Var2, this);
                return objF2 == serializable ? serializable : objF2;
            case 4:
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
                ccc0 ccc0Var = ((ir91) this.c).b;
                String str2 = ((oo3) obj4).b;
                this.b = true;
                return ccc0.h(ccc0Var, str2, (ubc0) null, this, 6) == serializable ? serializable : rih1Var;
            case 5:
                wr91 wr91Var = (wr91) this.c;
                boolean z7 = this.b;
                if (z7) {
                    if (!z7) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    wr91Var.a();
                    return rih1Var;
                }
                hm5.M(obj);
                if (wr91Var == null) {
                    return rih1Var;
                }
                t34 t34Var = (cg) obj4;
                int iC = l1d.C(wr91Var.a.b);
                if (iC == 0) {
                    jA = 4000;
                } else if (iC == 1) {
                    jA = 10000;
                } else {
                    if (iC != 2) {
                        eg.o();
                        return null;
                    }
                    jA = Long.MAX_VALUE;
                }
                if (t34Var != null) {
                    jA = t34Var.a(jA, false);
                }
                this.b = true;
                if (hap1.i(jA, this) == serializable) {
                    return serializable;
                }
                wr91Var.a();
                return rih1Var;
            case 6:
                xr91 xr91Var = (xr91) this.c;
                boolean z8 = this.b;
                if (z8) {
                    if (!z8) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    ohdVar = xr91Var.d;
                    if (ohdVar.s() instanceof ago0) {
                        return rih1Var;
                    }
                    ohdVar.resumeWith(au91.a);
                    return rih1Var;
                }
                hm5.M(obj);
                if (xr91Var == null) {
                    return rih1Var;
                }
                hr91 hr91Var = xr91Var.c;
                z = xr91Var.b != null;
                t34 t34Var2 = (cg) obj4;
                int iOrdinal = hr91Var.ordinal();
                if (iOrdinal == 0) {
                    jA2 = 4000;
                } else if (iOrdinal == 1) {
                    jA2 = 10000;
                } else {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    jA2 = Long.MAX_VALUE;
                }
                if (t34Var2 != null) {
                    jA2 = t34Var2.a(jA2, z);
                }
                this.b = true;
                if (hap1.i(jA2, this) == serializable) {
                    return serializable;
                }
                ohdVar = xr91Var.d;
                if (ohdVar.s() instanceof ago0) {
                    return rih1Var;
                }
                ohdVar.resumeWith(au91.a);
                return rih1Var;
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
                ezc ezcVarF = h4p1.f(new ss90(((f0i) ((g0i) this.c)).a, (lnm) null, (byte) 18));
                fns fnsVar = igu.a;
                mr20 mr20VarR = o4p1.r(ezcVarF, pyf0.a.f);
                j0z0 j0z0Var = new j0z0((j0d1) obj4, (byte) 28);
                this.b = true;
                Object objCollect = mr20VarR.collect(new ae91(j0z0Var, (byte) 8), this);
                if (objCollect != serializable) {
                    objCollect = rih1Var;
                }
                return objCollect == serializable ? serializable : rih1Var;
            case 8:
                boolean z10 = this.b;
                if (z10) {
                    if (z10) {
                        throw l1d.v(obj);
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                dt71 dt71Var = (dt71) this.c;
                mp0 mp0Var = new mp0((ven0) obj4, (byte) 28);
                this.b = true;
                dt71Var.collect(mp0Var, this);
                return serializable;
            case 9:
                boolean z11 = this.b;
                if (z11) {
                    if (z11) {
                        hm5.M(obj);
                        objJ = obj;
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                n381 n381Var = ((my91) this.c).a;
                Single map = rca.E((rca) n381Var.b, new ou21((ArrayList) obj4), (fq21) null, 2, (Object) null).map(new n801(n381Var, b2));
                this.b = true;
                objJ = fc11.j(map, this);
                if (objJ == serializable) {
                    return serializable;
                }
                nx91 nx91Var = (ox91) objJ;
                int i2 = ny91.b;
                if (nx91Var instanceof mx91) {
                    rx91 rx91Var = ((mx91) nx91Var).a;
                    return new c1a0(rx91Var.a, rx91Var.b);
                }
                if (nx91Var instanceof nx91) {
                    return new e1a0(nx91Var.a);
                }
                eg.o();
                return null;
            case 10:
                boolean z12 = this.b;
                if (z12) {
                    if (z12) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                yrg0 yrg0Var = ((my91) this.c).f;
                List list2 = (List) obj4;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new cqi0((String) it.next(), false));
                }
                this.b = true;
                Serializable serializableP = yrg0Var.p(arrayList, this);
                return serializableP == serializable ? serializable : serializableP;
            case 11:
                boolean z13 = this.b;
                if (!z13) {
                    hm5.M(obj);
                    this.b = true;
                    Object objA = ((i5a1) this.c).a.a((go71) obj4, this);
                    return objA == serializable ? serializable : objA;
                }
                if (z13) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
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
                if (this.c == null) {
                    return rih1Var;
                }
                this.b = true;
                df41 df41Var = xtb0.y;
                return ((xtb0) obj4).k(0, 0, this) == serializable ? serializable : rih1Var;
            case 13:
                dda1 dda1Var = (dda1) obj4;
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
                jge jgeVarE = hu20.e(rqt0.u(new yc2((m441) this.c, (byte) 23)), new af01((lnm) null, dda1Var, (byte) 26));
                bda1 bda1Var = new bda1(dda1Var, z ? (byte) 1 : (byte) 0);
                this.b = true;
                return jgeVarE.collect(bda1Var, this) == serializable ? serializable : rih1Var;
            case 14:
                boolean z16 = this.b;
                if (!z16) {
                    hm5.M(obj);
                    this.b = true;
                    return ((zja1) this.c).c((rvt0) obj4, this) == serializable ? serializable : rih1Var;
                }
                if (z16) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                boolean z17 = this.b;
                if (!z17) {
                    hm5.M(obj);
                    this.b = true;
                    return ((zja1) this.c).d((Collection) obj4, this) == serializable ? serializable : rih1Var;
                }
                if (z17) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 16:
                vr20 vr20Var = (vr20) this.c;
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
                MediaSessionCompat.Token tokenA = ((d6b1) obj4).a().a();
                this.c = null;
                this.b = true;
                return vr20Var.emit(tokenA, this) == serializable ? serializable : rih1Var;
            case 17:
                g6b1 g6b1Var = (g6b1) this.c;
                boolean z19 = this.b;
                if (z19) {
                    if (z19) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                t25 t25Var = new t25();
                List list3 = k6b1.h;
                iv81 iv81Var = new iv81((Context) obj4, g6b1Var, b2);
                lda1 lda1Var = new lda1(2, t25Var, t25.class, "load", "load(Ljava/lang/String;I)[B", 0, (byte) 2);
                this.c = null;
                this.b = true;
                Locale localeForLanguageTag = Locale.forLanguageTag(g6b1Var.a);
                String language = localeForLanguageTag.getLanguage();
                if (language == null) {
                    obj2 = null;
                } else {
                    int iHashCode = language.hashCode();
                    if (iHashCode != 3383) {
                        if (iHashCode != 3428) {
                            if (iHashCode == 3886 && language.equals("zh")) {
                                obj2 = (!u890.j(localeForLanguageTag.getScript(), "Hant") && (u890.j(localeForLanguageTag.getScript(), "Hans") || !f46.S0(new String[]{"TW", "HK", "MO"}).contains(localeForLanguageTag.getCountry()))) ? "zh-Hans" : "zh-Hant";
                            } else {
                                obj2 = null;
                            }
                        } else if (language.equals("ko")) {
                            obj2 = "ko";
                        } else {
                            obj2 = null;
                        }
                    } else if (language.equals("ja")) {
                        obj2 = "ja";
                    } else {
                        obj2 = null;
                    }
                }
                List listJ0 = o7h.j0(o7h.N0(p7h.M(new String[]{"ko", "ja", "zh-Hans", "zh-Hant"}), p7h.N(obj2)));
                ArrayList<String> arrayListO0 = o7h.O0("und-Deva", listJ0);
                ArrayList arrayList2 = new ArrayList();
                List list4 = k6b1.h;
                ArrayList arrayList3 = new ArrayList(q7h.U(list4, 10));
                Exception exc = null;
                for (Object obj5 : list4) {
                    int i3 = i + 1;
                    if (i < 0) {
                        ?? r23 = str;
                        p7h.T();
                        throw r23;
                    }
                    int iIntValue = ((Number) obj5).intValue();
                    op71.x(getContext());
                    try {
                        list = (List) iv81Var.invoke(new Integer(iIntValue));
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        if (exc == null) {
                            exc = e2;
                        } else if (exc != e2) {
                            j2h1.h(exc, e2);
                        }
                        Logger.l(e2, "Failed to load Rive Encore fallback tier %s", new Object[]{new Integer(i)});
                        list = z6x.a;
                    }
                    Exception exc2 = exc;
                    List list5 = list;
                    arrayList2.add(list5);
                    String str3 = str;
                    int iIntValue2 = ((Number) p7h.M(new Integer[]{new Integer(400), new Integer(700), new Integer(900)}).get(i)).intValue();
                    ArrayList arrayList4 = new ArrayList();
                    Exception exc3 = exc2;
                    for (String str4 : arrayListO0) {
                        iv81 iv81Var2 = iv81Var;
                        try {
                            try {
                                byte[] bArr = (byte[]) lda1Var.invoke(str4, new Integer(iIntValue2));
                                if (listJ0.contains(str4) && bArr == null) {
                                    StringBuilder sb = new StringBuilder();
                                    try {
                                        sb.append("Missing CJK fallback: ");
                                        sb.append(str4);
                                        sb.append(", weight ");
                                        sb.append(iIntValue2);
                                        throw new IllegalStateException(sb.toString().toString());
                                    } catch (Exception e3) {
                                        e = e3;
                                    }
                                } else {
                                    lda1Var = lda1Var;
                                    obj3 = bArr;
                                    if (obj3 != null) {
                                        arrayList4.add(obj3);
                                    }
                                    iv81Var = iv81Var2;
                                    lda1Var = lda1Var;
                                }
                            } catch (Exception e4) {
                                e = e4;
                            }
                            if (obj3 != null) {
                                arrayList4.add(obj3);
                            }
                            iv81Var = iv81Var2;
                            lda1Var = lda1Var;
                        } catch (CancellationException e5) {
                            throw e5;
                        }
                        if (exc3 == null) {
                            exc3 = e;
                        } else if (exc3 != e) {
                            j2h1.h(exc3, e);
                        }
                        Logger.l(e, "Failed to load Rive system fallback %s", new Object[]{str4});
                        obj3 = str3;
                    }
                    arrayList3.add(o7h.N0(arrayList4, list5));
                    exc = exc3;
                    str = str3;
                    i = i3;
                    break;
                }
                i6b1 i6b1Var = new i6b1(arrayList3, exc, arrayList2);
                return i6b1Var == serializable ? serializable : i6b1Var;
            case 18:
                d9b1 d9b1Var = (d9b1) this.c;
                boolean z20 = this.b;
                if (z20) {
                    if (z20) {
                        hm5.M(obj);
                        objJ2 = obj;
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                ay8 ay8VarF = d3p1.F(d9b1Var.V0, d9b1Var.a1, ((ContextTrack) obj4).uri());
                ck01 ck01Var = new ck01(2, (lnm) null, (byte) 22);
                this.b = true;
                objJ2 = b5p1.j(ay8VarF, ck01Var, this);
                if (objJ2 == serializable) {
                    return serializable;
                }
                i1r i1rVar = (k1r) objJ2;
                if (!(i1rVar instanceof i1r)) {
                    if ((i1rVar instanceof h1r) || u890.j(i1rVar, j1rVar)) {
                        return rih1Var;
                    }
                    eg.o();
                    return null;
                }
                String str5 = (String) i1rVar.a;
                if (str5 == null) {
                    return rih1Var;
                }
                if (str5.length() <= 0) {
                    str5 = null;
                }
                if (str5 == null) {
                    return rih1Var;
                }
                ixg ixgVarF = d9b1Var.U0.f(str5);
                ixgVarF.l(2131233988);
                ixgVarF.k(d9b1Var.X0, (ird1) null);
                return rih1Var;
            case 19:
                n9b1 n9b1Var = (n9b1) this.c;
                boolean z21 = this.b;
                if (z21) {
                    if (z21) {
                        hm5.M(obj);
                        objJ3 = obj;
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                ay8 ay8VarF2 = d3p1.F(n9b1Var.W0, n9b1Var.q1, ((ContextTrack) obj4).uri());
                ck01 ck01Var2 = new ck01(2, (lnm) null, (byte) 23);
                this.b = true;
                objJ3 = b5p1.j(ay8VarF2, ck01Var2, this);
                if (objJ3 == serializable) {
                    return serializable;
                }
                i1r i1rVar2 = (k1r) objJ3;
                if (!(i1rVar2 instanceof i1r)) {
                    if ((i1rVar2 instanceof h1r) || u890.j(i1rVar2, j1rVar)) {
                        return rih1Var;
                    }
                    eg.o();
                    return null;
                }
                String str6 = (String) i1rVar2.a;
                if (str6 == null) {
                    return rih1Var;
                }
                str = str6.length() > 0 ? str6 : null;
                if (str == null) {
                    return rih1Var;
                }
                int i4 = n9b1.r1;
                n9b1Var.K(str);
                return rih1Var;
            case 20:
                boolean z22 = this.b;
                if (!z22) {
                    hm5.M(obj);
                    jha1 jha1Var = (jha1) this.c;
                    ga5 ga5Var = new ga5(2, (lnm) null, (byte) 7);
                    this.b = true;
                    if (b5p1.j(jha1Var, ga5Var, this) == serializable) {
                        return serializable;
                    }
                } else {
                    if (!z22) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((hrr0) ((g2z) obj4).b).setValue(Boolean.TRUE);
                return rih1Var;
            case 21:
                vr20 vr20Var2 = (vr20) this.c;
                boolean z23 = this.b;
                if (!z23) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    return vr20Var2.emit((yeb1) obj4, this) == serializable ? serializable : rih1Var;
                }
                if (z23) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 22:
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
                ats atsVar = (ats) ((yxb0) this.c).e;
                tqw tqwVar = (tqw) obj4;
                if (tqwVar != null) {
                    ou80 ou80Var = n3o1.y(tqwVar).a;
                }
                this.b = true;
                return atsVar.b(false, this) == serializable ? serializable : rih1Var;
            case 23:
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
                ezc ezcVarG = yoi1.g(((q5o) this.c).g());
                vi viVar2 = new vi((bkb1) obj4, (byte) 15);
                this.b = true;
                return ezcVarG.collect(viVar2, this) == serializable ? serializable : rih1Var;
            case 24:
                boolean z26 = this.b;
                if (z26) {
                    if (z26) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                kyy0 kyy0VarO = PutStateRequest.o();
                kyy0VarO.n((Map) this.c);
                PutStateRequest putStateRequestBuild = kyy0VarO.build();
                wob1 wob1Var = ((xob1) obj4).a;
                putStateRequestBuild.getClass();
                this.b = true;
                Object objB = wob1Var.b(putStateRequestBuild, this);
                return objB == serializable ? serializable : objB;
            case 25:
                boolean z27 = this.b;
                if (!z27) {
                    hm5.M(obj);
                    this.b = true;
                    return o95.b((o95) ((vrv0) this.c).d, new Float(0.0f), (fe5) obj4, (Float) null, (iu30) null, this, 12) == serializable ? serializable : rih1Var;
                }
                if (z27) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 26:
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
                ayb1 ayb1Var = (ayb1) this.c;
                String str7 = ((rvb1) obj4).d;
                this.b = true;
                se11 se11Var = ayb1.l;
                Object objF3 = ayb1Var.f(str7, this);
                return objF3 == serializable ? serializable : objF3;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                hpm0 hpm0Var = (gpm0) obj4;
                ssw0 ssw0Var = (ssw0) this.c;
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
                n1c1 n1c1Var = new n1c1(ssw0Var);
                hpm0 hpm0Var2 = hpm0Var;
                hpm0Var2.g.add(n1c1Var);
                ssw0Var.l(hpm0Var2.d);
                k7a1 k7a1Var = new k7a1((Object) hpm0Var, (Object) n1c1Var, (byte) 16);
                this.c = null;
                this.b = true;
                return jch0.s(ssw0Var, k7a1Var, this) == serializable ? serializable : rih1Var;
            case 28:
                boolean z30 = this.b;
                if (z30) {
                    if (z30) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                rec1 rec1Var = (rec1) this.c;
                jn7 jn7Var = rec1Var.a;
                mdc1 mdc1Var = (mdc1) obj4;
                mdc1Var.r(rec1Var.P0);
                StreamEndRequestOuterClass$StreamEndRequest streamEndRequestOuterClass$StreamEndRequest = (StreamEndRequestOuterClass$StreamEndRequest) mdc1Var.build();
                this.b = true;
                Object objZ0 = jn7Var.z0(streamEndRequestOuterClass$StreamEndRequest, this);
                return objZ0 == serializable ? serializable : objZ0;
            default:
                boolean z31 = this.b;
                if (z31) {
                    if (z31) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                rec1 rec1Var2 = (rec1) this.c;
                jn7 jn7Var2 = rec1Var2.a;
                zdc1 zdc1Var = (zdc1) obj4;
                zdc1Var.y(rec1Var2.P0);
                StreamProgressRequestOuterClass$StreamProgressRequest streamProgressRequestOuterClass$StreamProgressRequest = (StreamProgressRequestOuterClass$StreamProgressRequest) zdc1Var.build();
                this.b = true;
                Object objA0 = jn7Var2.A0(streamProgressRequestOuterClass$StreamProgressRequest, this);
                return objA0 == serializable ? serializable : objA0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sb91(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
    }
}
