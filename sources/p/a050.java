package p;

import android.app.Application;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import spotify.transcript_search.v1.DebugInfo;
import spotify.transcript_search.v1.Match;
import spotify.transcript_search.v1.SearchRequest;
import spotify.transcript_search.v1.SearchResponse;
import spotify.transcript_search.v1.TimeOffsetHighlight;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class a050 {
    public final idd1 a;

    public a050(RetrofitMaker retrofitMaker) {
        this.a = new idd1(new bkk1(retrofitMaker, (byte) 15));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object a(ArrayList arrayList, String str, Long l, mdg1 mdg1Var, onm onmVar) throws NoWhenBranchMatchedException {
        eil1 eil1Var;
        odg1 odg1Var;
        j8h0 j8h0Var;
        String strF;
        ndg1 ndg1Var;
        if (onmVar instanceof eil1) {
            eil1Var = (eil1) onmVar;
            int i = eil1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                eil1Var.c = i - Integer.MIN_VALUE;
            } else {
                eil1Var = new eil1(this, onmVar);
            }
        } else {
            eil1Var = new eil1(this, onmVar);
        }
        Object objA = eil1Var.a;
        int i2 = eil1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                f851 f851VarO = SearchRequest.o();
                f851VarO.n(arrayList);
                if (str != null) {
                    f851VarO.r(str);
                }
                if (l != null) {
                    loe1 loe1VarN = TimeOffsetHighlight.n();
                    loe1VarN.n(l.longValue());
                    f851VarO.s((TimeOffsetHighlight) loe1VarN.build());
                }
                if (mdg1Var != null) {
                    int iOrdinal = mdg1Var.ordinal();
                    if (iOrdinal == 0) {
                        j8h0Var = j8h0.MATCH_BOUNDARIES_UNSPECIFIED;
                    } else if (iOrdinal == 1) {
                        j8h0Var = j8h0.MATCH_BOUNDARIES_EXPANDED;
                    } else {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        j8h0Var = j8h0.MATCH_BOUNDARIES_DYNAMIC;
                    }
                    f851VarO.q(j8h0Var);
                }
                dil1 dil1Var = (dil1) this.a.getValue();
                SearchRequest searchRequest = (SearchRequest) f851VarO.build();
                eil1Var.c = 1;
                objA = dil1Var.a(searchRequest, eil1Var);
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
            sy21 sy21Var = (sy21) objA;
            if (!sy21Var.a.Q0) {
                uz21 uz21Var = sy21Var.c;
                if (uz21Var == null || (strF = uz21Var.f()) == null) {
                    strF = "";
                }
                if (ihc1.y0(strF)) {
                    strF = "Transcript Search Api responded with " + sy21Var.a.d;
                }
                return new odg1(strF);
            }
            SearchResponse searchResponse = (SearchResponse) sy21Var.b;
            if (searchResponse == null) {
                return new odg1("Empty response");
            }
            if (!searchResponse.q()) {
                return searchResponse.p() ? new odg1(searchResponse.n().getMessage()) : new odg1("Unknown error");
            }
            Match matchO = searchResponse.o();
            long jP = matchO.n().p();
            String strU = matchO.u();
            String strR = matchO.r();
            String strT = matchO.t();
            rdg1 rdg1Var = matchO.v() ? new rdg1(matchO.n().p(), matchO.n().o()) : null;
            long jN = matchO.w() ? matchO.o().n() : 0L;
            pdg1 pdg1Var = matchO.y() ? new pdg1(matchO.s().p(), matchO.s().o()) : null;
            if (matchO.x()) {
                DebugInfo debugInfoP = matchO.p();
                String strO = debugInfoP.o();
                if (!debugInfoP.q()) {
                    strO = null;
                }
                ndg1Var = new ndg1(strO, debugInfoP.r() ? debugInfoP.p() : null);
            } else {
                ndg1Var = null;
            }
            return new qdg1(strU, strR, strT, jP, rdg1Var, jN, pdg1Var, ndg1Var);
        } catch (IOException e) {
            String message = e.getMessage();
            odg1Var = new odg1(message != null ? message : "Unknown error");
            return odg1Var;
        } catch (IllegalStateException e2) {
            String message2 = e2.getMessage();
            odg1Var = new odg1(message2 != null ? message2 : "Unknown error");
            return odg1Var;
        }
    }

    public a050(Application application) {
        this.a = new idd1(new zz40(application));
    }
}
