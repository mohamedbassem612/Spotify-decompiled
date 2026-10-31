package p;

import com.spotify.atv_remote.esperanto.proto.AtvRemoteServiceOuterClass;
import com.spotify.atv_remote.esperanto.proto.AtvRemoteServiceOuterClass$AtvSubmitPinRequest;
import com.spotify.base.java.logging.Logger;
import com.spotify.download.esperanto.proto.EsDownload;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mdata.cosmos.proto.InvalidateCacheRequest;
import com.spotify.player.model.ContextTrack;
import com.spotify.support.assertion.Assertion;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import javax.net.ssl.SSLException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class laz implements iy5, yu30, Predicate, Function, hv30, nzc, BiFunction, g9v, mka1, m57 {
    public final /* synthetic */ byte a;
    public final Object b;

    public laz() {
        this.a = (byte) 28;
        this.b = new bfn0(0, new nrb0[16]);
    }

    public static Throwable i(Throwable th) {
        do {
            th = th.getCause();
            if (th == null) {
                return null;
            }
            if ((th instanceof SocketTimeoutException) || (th instanceof UnknownHostException) || (th instanceof ConnectException) || (th instanceof NoRouteToHostException)) {
                break;
            }
        } while (!(th instanceof SSLException));
        return th;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(jy5 jy5Var, lnm lnmVar) {
        ctz ctzVar;
        if (lnmVar instanceof ctz) {
            ctzVar = (ctz) lnmVar;
            int i = ctzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ctzVar.c = i - Integer.MIN_VALUE;
            } else {
                ctzVar = new ctz(this, (onm) lnmVar);
            }
        } else {
            ctzVar = new ctz(this, (onm) lnmVar);
        }
        Object objW0 = ctzVar.a;
        int i2 = ctzVar.c;
        String str = null;
        try {
            if (i2 == 0) {
                hm5.M(objW0);
                jn7 jn7Var = (jn7) this.b;
                mn7 mn7VarN = AtvRemoteServiceOuterClass.AtvStartPairingRequest.n();
                mn7VarN.q(jy5Var.e);
                mn7VarN.r(jy5Var.d);
                mn7VarN.n(jy5Var.a);
                AtvRemoteServiceOuterClass.AtvStartPairingRequest atvStartPairingRequestBuild = mn7VarN.build();
                ctzVar.c = 1;
                objW0 = jn7Var.w0(atvStartPairingRequestBuild, ctzVar);
                d9n d9nVar = d9n.a;
                if (objW0 == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objW0);
            }
            AtvRemoteServiceOuterClass.AtvPairingResponse atvPairingResponse = (AtvRemoteServiceOuterClass.AtvPairingResponse) objW0;
            if (atvPairingResponse.p()) {
                return pz5.a;
            }
            fz5 fz5VarV = w0o1.v(atvPairingResponse.n());
            String strO = atvPairingResponse.o();
            if (!ihc1.y0(strO)) {
                str = strO;
            }
            return new oz5(fz5VarV, str, 4);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new oz5(fz5.t, e2.getMessage(), e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x021a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0194  */
    public Object apply(Object obj) {
        z6x z6xVar;
        String str;
        wvu0 wvu0Var;
        String str2;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 2:
                return ((ruz) obj2).c(((e9u0) obj).a);
            case 3:
            case 8:
            case 12:
            case 13:
            case 15:
            case 16:
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
            case 22:
            case 23:
            default:
                p0b0 p0b0Var = (p0b0) obj2;
                return p0b0Var.c != null ? new i5w0(p0b0Var) : j5.a;
            case 4:
                juz juzVar = (juz) ((bk1) obj2).b;
                String str3 = ((vwd0) obj).a;
                zmj0 zmj0Var = juzVar.a;
                ac90 ac90VarP = InvalidateCacheRequest.p();
                ac90VarP.q(str3);
                ac90VarP.r(hz00.W1);
                return zmj0Var.callSingle("spotify.mdata_esperanto.proto.MetadataService", "Expire", ac90VarP.build()).map(e710.P0).ignoreElement().e(Single.just(xxd0.a));
            case 5:
                return new mmr0((z310) obj, Boolean.valueOf(((r9c) obj2).h));
            case 6:
                m0n1 m0n1Var = (m0n1) obj;
                rok0 rok0Var = (rok0) ((fey) obj2).b;
                lvo0 lvo0Var = m0n1Var.d;
                return ((y2n1) rok0Var.b).f(upn1.m(), lvo0Var.c, Integer.valueOf(lvo0Var.a)).map(new swm0(rok0Var, (byte) 7)).map(new ouz(m0n1Var, (byte) 5)).onErrorReturn(new dqu((Object) m0n1Var, (byte) 17));
            case 7:
                EsDownload.RequestDataResponse requestDataResponse = (EsDownload.RequestDataResponse) obj;
                f520 f520Var = (f520) obj2;
                f520Var.f = requestDataResponse.s() > 0 ? Long.valueOf(requestDataResponse.s()) : null;
                return new g1r(requestDataResponse.r(), requestDataResponse.getData(), f520Var.f, requestDataResponse.o(), requestDataResponse.n() == xmz.b ? 1 : 2, requestDataResponse.p(), requestDataResponse.q());
            case 9:
                oy21 oy21Var = (py21) obj;
                p410 p410Var = (p410) obj2;
                bpb1 bpb1Var = (bpb1) p410Var.f;
                bpb1 bpb1Var2 = (bpb1) p410Var.h;
                p530 p530Var = (p530) bpb1Var.getValue();
                boolean z = oy21Var instanceof ly21;
                z6x<zuc0> z6xVar2 = z6x.a;
                if (z) {
                    z6xVar = z6xVar2;
                } else {
                    if (!(oy21Var instanceof oy21)) {
                        eg.o();
                        return null;
                    }
                    List<zuc0> list = ((wsc0) oy21Var.a).e;
                    z6x arrayList = new ArrayList(q7h.U(list, 10));
                    for (zuc0 zuc0Var : list) {
                        String str4 = zuc0Var.c;
                        String str5 = (String) zuc0Var.g.get("parent_uri");
                        arrayList.add(new uv11(str4, str5 == null ? "" : str5, (Integer) null, (String) null, (cqs0) null, (tv11) null, 0, 252));
                    }
                    z6xVar = arrayList;
                }
                if (z) {
                    str = "";
                } else {
                    if (!(oy21Var instanceof oy21)) {
                        eg.o();
                        return null;
                    }
                    String str6 = (String) ((wsc0) oy21Var.a).f.q.get("onboarding_image_url");
                    if (str6 == null) {
                        str = "";
                    } else {
                        str = str6;
                    }
                }
                xkg0 xkg0Var = new xkg0();
                wsc0 wsc0Var = (wsc0) oy21Var.c();
                z6x z6xVar3 = wsc0Var != null ? wsc0Var.e : null;
                if (z6xVar3 != null) {
                    z6xVar2 = z6xVar3;
                }
                for (zuc0 zuc0Var2 : z6xVar2) {
                    Map map = zuc0Var2.g;
                    String str7 = (String) map.get("prompted_playlist_uri");
                    if (str7 == null) {
                        wvu0Var = null;
                    } else {
                        if (ihc1.y0(str7)) {
                            str7 = null;
                        }
                        if (str7 == null || (str2 = (String) map.get("prompted_playlist_name")) == null) {
                            wvu0Var = null;
                        } else {
                            if (ihc1.y0(str2)) {
                                str2 = null;
                            }
                            if (str2 == null) {
                                wvu0Var = null;
                            } else {
                                String str8 = (String) map.get("prompted_playlist_image_url");
                                if (str8 == null || ihc1.y0(str8)) {
                                    str8 = null;
                                }
                                wvu0Var = new wvu0(str7, str2, str8);
                            }
                        }
                    }
                    if (wvu0Var != null) {
                        xkg0Var.put(zuc0Var2.c, wvu0Var);
                    }
                }
                return p530.a(p530Var, z6xVar, str, xkg0Var.b(), false, ((o530) bpb1Var2.getValue()).a, ((o530) bpb1Var2.getValue()).b, 8);
            case 10:
                zf30 zf30Var = (zf30) obj2;
                vh0 vh0Var = zf30Var.V0;
                return vh0Var instanceof vh0 ? vh0Var.m() : ((g0i) zf30Var.N0()).i;
            case 11:
                return Boolean.valueOf(((gmt) obj2).p((ContextTrack) obj));
            case 14:
                pi40 pi40Var = (pi40) obj;
                lc20 lc20Var = (lc20) obj2;
                sjj0 sjj0Var = (sjj0) lc20Var.b;
                List list2 = pi40Var.b;
                ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((y411) it.next()).a);
                }
                return sjj0Var.a(arrayList2).map((lfb) lc20Var.d).map(new dqu((Object) pi40Var, (byte) 22));
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new ou60(((et60) obj2).b, gv60.b);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                so soVar = (so) obj2;
                return ((Observable) soVar.c).take(1L).flatMap(new ro30((Object) soVar, obj, (byte) 23)).onErrorReturnItem(atx0.a);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                re9 re9Var = (re9) obj;
                s2a0 s2a0Var = (s2a0) obj2;
                int i = re9Var.b.a;
                fi9 fi9Var = re9Var.c;
                int i2 = s2a0Var.d;
                int iOrdinal = fi9Var.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        i2 = s2a0Var.e;
                    } else if (iOrdinal == 2) {
                        i2 = s2a0Var.f;
                    } else if (iOrdinal == 6) {
                        i2 = s2a0Var.g;
                    } else if (iOrdinal == 7) {
                        i2 = s2a0Var.h;
                    } else if (iOrdinal == 9) {
                        i2 = s2a0Var.i;
                    } else if (iOrdinal == 10) {
                        i2 = s2a0Var.j;
                    }
                }
                double dPow = Math.pow(10.0d, (((double) i2) - ((double) i)) / (s2a0Var.a * 10.0d));
                return new re9(re9Var.a, new ei9(i, dPow <= s2a0Var.c ? di9.a : dPow <= s2a0Var.b ? di9.b : di9.c), fi9Var, re9Var.d);
        }
    }

    public Object attachCompleter(mzc mzcVar) {
        jx30 jx30Var = (jx30) this.b;
        o0c.q("The result can only set once!", jx30Var.b == null);
        jx30Var.b = mzcVar;
        return "FutureChain[" + jx30Var + "]";
    }

    public f9v b(yoh0 yoh0Var) {
        return (f9v) this.b;
    }

    public nrb0 d(int i, int i2) {
        nrb0 nrb0Var = new nrb0(i, i2);
        ((bfn0) this.b).b(nrb0Var);
        return nrb0Var;
    }

    public void e(Assertion.RecoverableAssertionError recoverableAssertionError) {
        Throwable cause = recoverableAssertionError.getCause();
        if (cause != null) {
            recoverableAssertionError.getMessage();
            cause.getMessage();
        } else {
            recoverableAssertionError.getMessage();
        }
        i6a1 i6a1Var = (i6a1) this.b;
        if (i(recoverableAssertionError) != null) {
            Throwable thI = i(recoverableAssertionError);
            Assertion.RecoverableAssertionError recoverableAssertionError2 = new Assertion.RecoverableAssertionError(recoverableAssertionError.getMessage() + " [" + String.valueOf(thI) + "]", recoverableAssertionError.a);
            recoverableAssertionError2.setStackTrace(recoverableAssertionError.getStackTrace());
            recoverableAssertionError = recoverableAssertionError2;
        }
        i6a1Var.a(recoverableAssertionError);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object f(int i, lnm lnmVar) {
        dtz dtzVar;
        if (lnmVar instanceof dtz) {
            dtzVar = (dtz) lnmVar;
            int i2 = dtzVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dtzVar.c = i2 - Integer.MIN_VALUE;
            } else {
                dtzVar = new dtz(this, (onm) lnmVar);
            }
        } else {
            dtzVar = new dtz(this, (onm) lnmVar);
        }
        Object objD0 = dtzVar.a;
        int i3 = dtzVar.c;
        String str = null;
        try {
            if (i3 == 0) {
                hm5.M(objD0);
                jn7 jn7Var = (jn7) this.b;
                nn7 nn7VarN = AtvRemoteServiceOuterClass$AtvSubmitPinRequest.n();
                nn7VarN.n(i);
                AtvRemoteServiceOuterClass$AtvSubmitPinRequest atvRemoteServiceOuterClass$AtvSubmitPinRequest = (AtvRemoteServiceOuterClass$AtvSubmitPinRequest) nn7VarN.build();
                dtzVar.c = 1;
                objD0 = jn7Var.D0(atvRemoteServiceOuterClass$AtvSubmitPinRequest, dtzVar);
                d9n d9nVar = d9n.a;
                if (objD0 == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i3 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objD0);
            }
            AtvRemoteServiceOuterClass.AtvPairingResponse atvPairingResponse = (AtvRemoteServiceOuterClass.AtvPairingResponse) objD0;
            if (atvPairingResponse.p()) {
                return pz5.a;
            }
            fz5 fz5VarV = w0o1.v(atvPairingResponse.n());
            String strO = atvPairingResponse.o();
            if (!ihc1.y0(strO)) {
                str = strO;
            }
            return new oz5(fz5VarV, str, 4);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new oz5(fz5.t, e2.getMessage(), e2);
        }
    }

    public void g(AssertionError assertionError) {
        Logger.e(assertionError, "", new Object[0]);
        throw assertionError;
    }

    public void h(Throwable th) {
        th.getMessage();
        i6a1 i6a1Var = (i6a1) this.b;
        if (i(th) != null) {
            Throwable thI = i(th);
            Throwable recoverableAssertionError = new Assertion.RecoverableAssertionError(th.getMessage() + " [" + String.valueOf(thI) + "]", (String) null);
            recoverableAssertionError.setStackTrace(th.getStackTrace());
            th = recoverableAssertionError;
        }
        i6a1Var.a(th);
    }

    public f961 j() {
        return (f961) ((io80) this.b).b.getValue();
    }

    public void k(Assertion.Note note) {
        e(note);
    }

    public void l(nrb0 nrb0Var) {
        ((bfn0) this.b).k(nrb0Var);
    }

    public boolean test(Object obj) {
        Throwable th = (Throwable) obj;
        fc00 fc00Var = (fc00) this.b;
        fc00Var.e.invoke(ec00.b);
        boolean zD = fc00.d(th);
        zq4 zq4Var = fc00Var.c;
        if (!zD) {
            zq4Var.e("Error while writing to disk.", th);
            return true;
        }
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        "Error while writing to disk: ".concat(message);
        zq4Var.g();
        return true;
    }

    public String toString() {
        switch (this.a) {
            case 27:
                StringBuilder sb = new StringBuilder();
                nqb0 nqb0Var = (nqb0) this.b;
                sb.append(nqb0Var);
                sb.append(": ");
                toe0 toe0Var = nqb0Var.t;
                mma0 mma0Var = nqb0.N0[0];
                sb.append(((Map) toe0Var.invoke()).keySet());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ laz(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public Object apply(Object obj, Object obj2) {
        xii0 xii0Var = (xii0) obj;
        x350 x350Var = (x350) this.b;
        int iOrdinal = ((u311) obj2).ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2) {
                psd0 psd0Var = x350Var.d;
                if (psd0Var != null && (psd0Var instanceof jsd0)) {
                    return msd0.a;
                }
                return lsd0.a;
            }
            eg.o();
            return null;
        }
        psd0 psd0Var2 = x350Var.d;
        if (psd0Var2 != null && ((psd0Var2 instanceof jsd0) || (psd0Var2 instanceof osd0))) {
            return psd0Var2;
        }
        xii0Var.toString();
        int iOrdinal2 = xii0Var.ordinal();
        if (iOrdinal2 == 0) {
            return dsd0.a;
        }
        if (iOrdinal2 == 1) {
            return zrd0.a;
        }
        if (iOrdinal2 == 2) {
            return asd0.a;
        }
        eg.o();
        return null;
    }
}
