package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.concertpageview.v1.GetTicketingTimelineRequest;
import com.spotify.creativeworkplatform.encore.elements.ArtworkView;
import com.spotify.creativeworkplatform.encore.elements.DefaultCreator;
import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;
import com.spotify.musicquizservice.v1.GetOrCreateChallengeRequest;
import com.spotify.musicquizservice.v1.GetOrCreateChallengeResponse;
import com.spotify.musicquizservice.v1.ListChallengeTargetsRequest;
import com.spotify.musicquizservice.v1.ListChallengeTargetsResponse;
import com.spotify.player.model.ContextTrack;
import com.spotify.playlist.ai.creation.v2.CloneSessionByMessageIdRequest;
import com.spotify.profile.editprofile.editprofile.biodatasource.BioDataSourceException;
import com.spotify.profile.editprofile.editprofile.biodatasource.BioRateLimitException;
import com.spotify.profile.editprofile.editprofile.biodatasource.BioViolationException;
import com.spotify.profile.editprofile.proto.UserprofileviewV4;
import com.spotify.profile.editprofile.proto.UserprofileviewV4$Bio;
import com.spotify.profile.editprofile.proto.UserprofileviewV4$GetBioAudienceRequest;
import com.spotify.profile.editprofile.proto.UserprofileviewV4$UpdateBioResponse;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableError;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public class kba implements Function, is31, mkf1, itd, BiFunction, s6t0, Producer {
    public final /* synthetic */ byte a;
    public Object b;

    public kba(String str, Bundle bundle) {
        Uri uriA;
        String str2;
        this.a = (byte) 29;
        bundle = bundle == null ? new Bundle() : bundle;
        int[] iArrH = l1d.H(2);
        ArrayList arrayList = new ArrayList(iArrH.length);
        for (int i : iArrH) {
            if (i == 1) {
                str2 = "context_choose";
            } else {
                if (i != 2) {
                    throw null;
                }
                str2 = "join_tournament";
            }
            arrayList.add(str2);
        }
        if (arrayList.contains(str)) {
            wf10 wf10Var = wf10.a;
            uriA = fpi1.a(String.format("%s", Arrays.copyOf(new Object[]{"fb.gg"}, 1)), "/dialog/".concat(str), bundle);
        } else {
            uriA = fpi1.a(kno1.r(), wf10.d() + "/dialog/" + str, bundle);
        }
        this.b = uriA;
    }

    public r6t0 a(Context context, Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new g6t0(context, new j2i(-1278791305, new zvj((xu30) this.b, (byte) 0), true));
    }

    public Object apply(Object obj) {
        Object objInvoke;
        byte b = 15;
        switch (this.a) {
            case 0:
                nba nbaVar = (nba) this.b;
                qhh0 qhh0Var = nbaVar.d;
                ruk rukVar = nbaVar.a;
                return qhh0Var.a((z310) obj, rukVar.a, rukVar.b.g, (y310) null);
            case 5:
                ly21 ly21Var = (py21) obj;
                rs7 rs7Var = new rs7((d5c) this.b, (byte) 15);
                if (ly21Var instanceof ly21) {
                    objInvoke = rs7Var.invoke(ly21Var.a);
                } else {
                    if (!(ly21Var instanceof oy21)) {
                        eg.o();
                        return null;
                    }
                    objInvoke = bjo.a;
                }
                return (cjo) objInvoke;
            case 8:
                return new CompletableFromAction(new bm0((dma1) obj, (bma1) this.b, b));
            case 15:
                ib51 ib51Var = ((ew41) ((bk1) this.b).b).a.a;
                ib51Var.a = null;
                ib51Var.b = null;
                return d051.a;
            case 16:
                eqx0 eqx0Var = (eqx0) obj;
                so soVar = (so) this.b;
                nf61 nf61Var = (nf61) soVar.b;
                String str = eqx0Var.b;
                j23 j23Var = (c23) soVar.c;
                String str2 = eqx0Var.a;
                j23 j23Var2 = j23Var;
                r23 r23Var = j23Var2.a;
                CloneSessionByMessageIdRequest.Builder builderNewBuilder = CloneSessionByMessageIdRequest.newBuilder();
                builderNewBuilder.setMessageId(str2);
                return nf61.b(nf61Var, r23Var.b(builderNewBuilder.build()).flatMap(new ymm0(j23Var2, (byte) 11)), str, 26).map(bya0.P0).onErrorReturn(stf0.T0);
            case 18:
                ilh1 ilh1Var = ((z0h) this.b).f;
                return ki91.a((ki91) ilh1Var.c, (String) ilh1Var.b, ((w0h) obj).a ? rp91.b : rp91.a).h(fcc.Y);
            case 24:
                Boolean bool = ((to91) obj).a;
                return Boolean.valueOf(bool != null ? bool.booleanValue() : l4o1.J((ContextTrack) this.b));
            default:
                mmr0 mmr0Var = (mmr0) obj;
                Throwable th = (Throwable) mmr0Var.a;
                Integer num = (Integer) mmr0Var.b;
                if (num.intValue() <= 3) {
                    return Flowable.a0(num.intValue(), TimeUnit.SECONDS, ((rhn) this.b).e);
                }
                int i = Flowable.a;
                return new FlowableError(Functions.h(th));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(onm onmVar) throws BioDataSourceException {
        iva ivaVar;
        if (onmVar instanceof iva) {
            ivaVar = (iva) onmVar;
            int i = ivaVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ivaVar.c = i - Integer.MIN_VALUE;
            } else {
                ivaVar = new iva(this, onmVar);
            }
        } else {
            ivaVar = new iva(this, onmVar);
        }
        Object objB = ivaVar.a;
        int i2 = ivaVar.c;
        if (i2 == 0) {
            hm5.M(objB);
            eki1 eki1VarN = UserprofileviewV4$GetBioAudienceRequest.n();
            eki1VarN.n();
            UserprofileviewV4$GetBioAudienceRequest userprofileviewV4$GetBioAudienceRequest = (UserprofileviewV4$GetBioAudienceRequest) eki1VarN.build();
            lva lvaVar = (lva) this.b;
            userprofileviewV4$GetBioAudienceRequest.getClass();
            ivaVar.c = 1;
            objB = lvaVar.b(userprofileviewV4$GetBioAudienceRequest, ivaVar);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objB);
        }
        sy21 sy21Var = (sy21) objB;
        UserprofileviewV4.GetBioAudienceResponse getBioAudienceResponse = (UserprofileviewV4.GetBioAudienceResponse) sy21Var.b;
        if (getBioAudienceResponse != null) {
            UserprofileviewV4.GetBioAudienceResponse getBioAudienceResponse2 = sy21Var.a.Q0 ? getBioAudienceResponse : null;
            if (getBioAudienceResponse2 != null) {
                ova ovaVarU = zod.U(getBioAudienceResponse2.o());
                if (ovaVarU == null) {
                    ovaVarU = ova.a;
                }
                d290<cki1> d290VarN = getBioAudienceResponse2.n();
                ArrayList arrayList = new ArrayList();
                for (cki1 cki1Var : d290VarN) {
                    cki1Var.getClass();
                    ova ovaVarU2 = zod.U(cki1Var);
                    if (ovaVarU2 != null) {
                        arrayList.add(ovaVarU2);
                    }
                }
                return new gva(ovaVarU, arrayList);
            }
        }
        throw new BioDataSourceException("Failed to get bio audience");
    }

    public Single c(String str) {
        return str.length() == 0 ? Single.just(ewe0.a) : ((uh8) this.b).a().map(new zjp1(str, (byte) 1));
    }

    public e711 d(ViewGroup viewGroup, Object obj, v1r0 v1r0Var, y3o0 y3o0Var) {
        kup kupVar = ((njd) this.b).a;
        mr20 mr20Var = obj instanceof mr20 ? (mr20) obj : null;
        switch (kupVar.a) {
            case 0:
                p2p p2pVar = kupVar.b;
                nwp nwpVar = (nwp) p2pVar.c;
                l7m0 l7m0Var = new l7m0(nwpVar.g(), (byte) 10);
                gw70 gw70VarA0 = nwpVar.a.a0();
                c8o.l(gw70VarA0);
                g1i g1iVar = (g1i) p2pVar.d;
                t2j0 t2j0VarI0 = ((nwp) g1iVar.c).a.i0();
                c8o.l(t2j0VarI0);
                ii9 ii9Var = new ii9(t2j0VarI0);
                nwp nwpVar2 = (nwp) g1iVar.c;
                Flowable flowable = (Flowable) nwpVar2.l.get();
                t2j0 t2j0VarI1 = nwpVar2.a.i0();
                c8o.l(t2j0VarI1);
                return new sjd(l7m0Var, gw70VarA0, ii9Var, new ne(flowable, t2j0VarI1), (iac0) ((jly0) g1iVar.d).get(), nwpVar.g(), viewGroup, mr20Var, y3o0Var);
            default:
                p2p p2pVar2 = kupVar.b;
                daq daqVar = (daq) p2pVar2.c;
                l7m0 l7m0Var2 = new l7m0(daqVar.v(), (byte) 10);
                gw70 gw70Var = (gw70) daqVar.d8.get();
                k9k k9kVar = (k9k) p2pVar2.d;
                ii9 ii9Var2 = new ii9((t2j0) ((daq) k9kVar.c).f2.get());
                daq daqVar2 = (daq) k9kVar.c;
                return new sjd(l7m0Var2, gw70Var, ii9Var2, new ne((Flowable) daqVar2.D5.get(), (t2j0) daqVar2.f2.get()), (iac0) ((jly0) k9kVar.d).get(), daqVar.v(), viewGroup, mr20Var, y3o0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Serializable e(String str, onm onmVar) {
        gce gceVar;
        if (onmVar instanceof gce) {
            gceVar = (gce) onmVar;
            int i = gceVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gceVar.c = i - Integer.MIN_VALUE;
            } else {
                gceVar = new gce(this, onmVar);
            }
        } else {
            gceVar = new gce(this, onmVar);
        }
        Object objB = gceVar.a;
        int i2 = gceVar.c;
        try {
            if (i2 == 0) {
                hm5.M(objB);
                no40 no40VarN = GetOrCreateChallengeRequest.n();
                no40VarN.n(str);
                GetOrCreateChallengeRequest getOrCreateChallengeRequest = (GetOrCreateChallengeRequest) no40VarN.build();
                lce lceVar = (lce) this.b;
                getOrCreateChallengeRequest.getClass();
                gceVar.c = 1;
                objB = lceVar.b(getOrCreateChallengeRequest, gceVar);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objB);
            }
            sy21 sy21Var = (sy21) objB;
            if (sy21Var.a.Q0) {
                Object obj = sy21Var.b;
                if (obj != null) {
                    return ((GetOrCreateChallengeResponse) obj).n();
                }
                throw new IllegalArgumentException("Response body is null");
            }
            return new m231(new Exception("Failed to get or create challenge: HTTP " + sy21Var.a.d));
        } catch (Exception e) {
            return new m231(e);
        }
    }

    public Intent f(Intent intent) {
        return ((b72) this.b).e(intent, false);
    }

    public Object g(String str, boolean z, ehk ehkVar) {
        pq40 pq40VarO = GetTicketingTimelineRequest.o();
        pq40VarO.q(str);
        pq40VarO.n(mig.d);
        if (z) {
            pq40VarO.n(mig.e);
        }
        return ((eqk) this.b).a(pq40VarO.build(), ehkVar);
    }

    public Object get() {
        return new SchedulerWorkRunner(((p1m) this.b).b);
    }

    public boolean h() {
        return ((otu) this.b).e();
    }

    public Object i(int i, String str, r6h1 r6h1Var, String str2) {
        sqk0 sqk0Var = new sqk0(Integer.valueOf(i), str, new jpk0(new py9(r6h1Var, (byte) 14), (char) 0));
        this.b = sqk0Var;
        return sqk0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Object j(onm onmVar) {
        hce hceVar;
        if (onmVar instanceof hce) {
            hceVar = (hce) onmVar;
            int i = hceVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hceVar.c = i - Integer.MIN_VALUE;
            } else {
                hceVar = new hce(this, onmVar);
            }
        } else {
            hceVar = new hce(this, onmVar);
        }
        Object objC = hceVar.a;
        int i2 = hceVar.c;
        try {
            if (i2 == 0) {
                hm5.M(objC);
                vmc0 vmc0VarN = ListChallengeTargetsRequest.n();
                vmc0VarN.n();
                ListChallengeTargetsRequest listChallengeTargetsRequest = (ListChallengeTargetsRequest) vmc0VarN.build();
                lce lceVar = (lce) this.b;
                listChallengeTargetsRequest.getClass();
                hceVar.c = 1;
                objC = lceVar.c(listChallengeTargetsRequest, hceVar);
                d9n d9nVar = d9n.a;
                if (objC == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objC);
            }
            sy21 sy21Var = (sy21) objC;
            if (sy21Var.a.Q0) {
                Object obj = sy21Var.b;
                if (obj != null) {
                    return ((ListChallengeTargetsResponse) obj).n();
                }
                throw new IllegalArgumentException("Response body is null");
            }
            return new m231(new Exception("Failed to list challenge targets: HTTP " + sy21Var.a.d));
        } catch (Exception e) {
            return new m231(e);
        }
    }

    public w7h1 k(ctd ctdVar, String str) {
        if (!ctdVar.equals(ctd.a)) {
            eg.o();
            return null;
        }
        sqk0 sqk0Var = (sqk0) this.b;
        if (sqk0Var != null) {
            return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), sqk0Var.b, sqk0Var.c.c.b, System.currentTimeMillis());
        }
        u890.C("playlistItem");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object l(String str, onm onmVar) {
        w3h w3hVar;
        if (onmVar instanceof w3h) {
            w3hVar = (w3h) onmVar;
            int i = w3hVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                w3hVar.c = i - Integer.MIN_VALUE;
            } else {
                w3hVar = new w3h(this, onmVar);
            }
        } else {
            w3hVar = new w3h(this, onmVar);
        }
        Object objC = w3hVar.a;
        int i2 = w3hVar.c;
        if (i2 == 0) {
            hm5.M(objC);
            Set set = s4b1.f;
            if (uic.k(str, new b3i1[]{nyu0.e, wyu0.f})) {
                z2h z2hVarA = ((z2h) this.b).a(str);
                w3hVar.c = 1;
                objC = z2hVarA.c(str, w3hVar);
                d9n d9nVar = d9n.a;
                if (objC == d9nVar) {
                    return d9nVar;
                }
            }
            return z6x.a;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objC);
        ArrayList arrayList = ((y2h) objC).a;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((fi90) it.next()).b);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (!ihc1.y0((String) obj)) {
                arrayList3.add(obj);
            }
        }
        List listD1 = o7h.d1(o7h.j0(arrayList3), 3);
        List list = listD1.size() == 3 ? listD1 : null;
        if (list != null) {
            return list;
        }
        return z6x.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Enum m(ova ovaVar, onm onmVar) throws BioDataSourceException {
        jva jvaVar;
        cki1 cki1Var;
        ova ovaVarU;
        if (onmVar instanceof jva) {
            jvaVar = (jva) onmVar;
            int i = jvaVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jvaVar.c = i - Integer.MIN_VALUE;
            } else {
                jvaVar = new jva(this, onmVar);
            }
        } else {
            jvaVar = new jva(this, onmVar);
        }
        Object objC = jvaVar.a;
        int i2 = jvaVar.c;
        if (i2 == 0) {
            hm5.M(objC);
            fki1 fki1VarN = UserprofileviewV4.SetBioAudienceRequest.n();
            int iOrdinal = ovaVar.ordinal();
            if (iOrdinal == 0) {
                cki1Var = cki1.c;
            } else if (iOrdinal == 1) {
                cki1Var = cki1.d;
            } else {
                if (iOrdinal != 2) {
                    eg.o();
                    return null;
                }
                cki1Var = cki1.e;
            }
            fki1VarN.n(cki1Var);
            UserprofileviewV4.SetBioAudienceRequest setBioAudienceRequestBuild = fki1VarN.build();
            lva lvaVar = (lva) this.b;
            setBioAudienceRequestBuild.getClass();
            jvaVar.c = 1;
            objC = lvaVar.c(setBioAudienceRequestBuild, jvaVar);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objC);
        }
        sy21 sy21Var = (sy21) objC;
        UserprofileviewV4.SetBioAudienceResponse setBioAudienceResponse = (UserprofileviewV4.SetBioAudienceResponse) sy21Var.b;
        if (setBioAudienceResponse != null) {
            UserprofileviewV4.SetBioAudienceResponse setBioAudienceResponse2 = sy21Var.a.Q0 ? setBioAudienceResponse : null;
            if (setBioAudienceResponse2 != null && (ovaVarU = zod.U(setBioAudienceResponse2.n())) != null) {
                return ovaVarU;
            }
        }
        throw new BioDataSourceException("Failed to set bio audience");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.profile.editprofile.editprofile.biodatasource.BioRateLimitException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.profile.editprofile.editprofile.biodatasource.BioViolationException */
    /* JADX WARN: Code duplicated, block: B:43:0x00a0 A[PHI: r4
      0x00a0: PHI (r4v1 int) = (r4v0 int), (r4v2 int), (r4v3 int) binds: [B:33:0x0090, B:35:0x0093, B:37:0x0096] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object n(String str, onm onmVar) throws BioDataSourceException, BioViolationException, BioRateLimitException {
        kva kvaVar;
        int i;
        if (onmVar instanceof kva) {
            kvaVar = (kva) onmVar;
            int i2 = kvaVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kvaVar.c = i2 - Integer.MIN_VALUE;
            } else {
                kvaVar = new kva(this, onmVar);
            }
        } else {
            kvaVar = new kva(this, onmVar);
        }
        Object objD = kvaVar.a;
        int i3 = kvaVar.c;
        if (i3 == 0) {
            hm5.M(objD);
            gki1 gki1VarN = UserprofileviewV4.UpdateBioRequest.n();
            bki1 bki1VarQ = UserprofileviewV4$Bio.q();
            bki1VarQ.n(str);
            gki1VarN.n(bki1VarQ);
            UserprofileviewV4.UpdateBioRequest updateBioRequestBuild = gki1VarN.build();
            lva lvaVar = (lva) this.b;
            updateBioRequestBuild.getClass();
            kvaVar.c = 1;
            objD = lvaVar.d(updateBioRequestBuild, kvaVar);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objD);
        }
        sy21 sy21Var = (sy21) objD;
        UserprofileviewV4$UpdateBioResponse userprofileviewV4$UpdateBioResponse = (UserprofileviewV4$UpdateBioResponse) sy21Var.b;
        if (userprofileviewV4$UpdateBioResponse != null) {
            if (!sy21Var.a.Q0) {
                userprofileviewV4$UpdateBioResponse = null;
            }
            if (userprofileviewV4$UpdateBioResponse != null) {
                if (userprofileviewV4$UpdateBioResponse.q()) {
                    throw new BioRateLimitException(userprofileviewV4$UpdateBioResponse.o().o());
                }
                Iterator it = userprofileviewV4$UpdateBioResponse.p().iterator();
                do {
                    i = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    dki1 dki1Var = (dki1) it.next();
                    dki1Var.getClass();
                    int iOrdinal = dki1Var.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            int i4 = 2;
                            if (iOrdinal != 2) {
                                i4 = 3;
                                if (iOrdinal != 3) {
                                    i4 = 4;
                                    if (iOrdinal == 4) {
                                        i = i4;
                                    } else if (iOrdinal != 5) {
                                        eg.o();
                                        return null;
                                    }
                                } else {
                                    i = i4;
                                }
                            } else {
                                i = i4;
                            }
                        } else {
                            i = 1;
                        }
                    }
                } while (i == 0);
                if (i != 0) {
                    throw new BioViolationException(i);
                }
                if (userprofileviewV4$UpdateBioResponse.n().p()) {
                    return userprofileviewV4$UpdateBioResponse.n().o();
                }
                throw new BioDataSourceException("Failed to update bio");
            }
        }
        throw new BioDataSourceException("Failed to update bio");
    }

    public /* synthetic */ kba(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public kba(DefaultCreator defaultCreator, ArtworkView artworkView, TextView textView) {
        this.a = (byte) 27;
        this.b = artworkView;
    }

    public Object apply(Object obj, Object obj2) {
        atq0 atq0Var = (atq0) obj;
        return (atq0) atq0Var.a(new nch((v9c) this.b, (atq0) obj2), new nch(atq0Var));
    }
}
