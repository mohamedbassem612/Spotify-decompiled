package p;

import com.spotify.authentication.login5esperanto.EsAuthenticateResult;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoItemsResponse;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mi10 implements Function, Init, Predicate, BiFunction, Function3, s2i1 {
    public final /* synthetic */ byte a;
    public static final mi10 b = new mi10(0);
    public static final mi10 c = new mi10(1);
    public static final mi10 d = new mi10(2);
    public static final mi10 e = new mi10(3);
    public static final mi10 f = new mi10(4);
    public static final mi10 g = new mi10(5);
    public static final mi10 h = new mi10(6);
    public static final mi10 i = new mi10(7);
    public static final mi10 t = new mi10(8);
    public static final mi10 X = new mi10(9);
    public static final mi10 Y = new mi10(10);
    public static final mi10 Z = new mi10(11);
    public static final mi10 N0 = new mi10(12);
    public static final mi10 O0 = new mi10(13);
    public static final mi10 P0 = new mi10(14);
    public static final mi10 Q0 = new mi10(15);
    public static final mi10 R0 = new mi10(16);
    public static final mi10 S0 = new mi10(17);
    public static final mi10 T0 = new mi10(18);
    public static final mi10 U0 = new mi10(19);
    public static final mi10 V0 = new mi10(20);
    public static final mi10 W0 = new mi10(21);
    public static final mi10 X0 = new mi10(22);
    public static final mi10 Y0 = new mi10(23);
    public static final mi10 Z0 = new mi10(24);
    public static final mi10 a1 = new mi10(25);
    public static final mi10 b1 = new mi10(26);
    public static final mi10 c1 = new mi10(27);
    public static final mi10 d1 = new mi10(28);
    public static final mi10 e1 = new mi10(29);

    public /* synthetic */ mi10(byte b2) {
        this.a = b2;
    }

    public Object apply(Object obj) {
        gi8 gi8Var;
        Object objEmpty;
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((wtw0) obj).a);
            case 1:
            case 2:
            case 5:
            case 9:
            case 12:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
            case 24:
            default:
                CollectionPlatformEsperantoItemsResponse collectionPlatformEsperantoItemsResponse = (CollectionPlatformEsperantoItemsResponse) obj;
                int iO = collectionPlatformEsperantoItemsResponse.n().o();
                return (200 > iO || iO >= 300) ? Completable.j(new Exception(collectionPlatformEsperantoItemsResponse.n().q())) : CompletableEmpty.a;
            case 3:
                return j000.c;
            case 4:
                return new up3((List) obj);
            case 6:
                return foo1.r((Set) obj);
            case 7:
                EsAuthenticateResult.AuthenticateResult authenticateResult = (EsAuthenticateResult.AuthenticateResult) obj;
                int iS = authenticateResult.s();
                int i2 = iS == 0 ? -1 : d0b0.a[l1d.C(iS)];
                if (i2 == 1) {
                    EsAuthenticateResult.AuthenticateSuccess authenticateSuccessU = authenticateResult.u();
                    wd wdVar = authenticateSuccessU.r() ? new wd(authenticateSuccessU.o().r(), authenticateSuccessU.o().q(), new Date(TimeUnit.SECONDS.toMillis(authenticateSuccessU.o().p().q()))) : null;
                    of8 of8Var = new of8(authenticateSuccessU.p().o().getUsername(), authenticateSuccessU.p().o().o().t());
                    if (wdVar != null) {
                        return new ii8(new di8(authenticateSuccessU.getUsername(), wdVar, of8Var));
                    }
                    gi8Var = new gi8(new ug8((Integer) null, "Access Token or AuthBlob equal to null on refresh"));
                } else {
                    if (i2 != 2) {
                        eg.m("connectivity login5 esperanto returned unexpected response. should never happen in production");
                        return null;
                    }
                    EsAuthenticateResult.AuthenticateFailure authenticateFailureQ = authenticateResult.q();
                    int iR = authenticateFailureQ.r();
                    int i3 = iR != 0 ? d0b0.b[l1d.C(iR)] : -1;
                    if (i3 == 1) {
                        switch (authenticateFailureQ.p().ordinal()) {
                            case 1:
                                gi8Var = new fi8(new ug8(400, "Aborted"));
                                break;
                            case 2:
                                gi8Var = new gi8(new ug8(400, "Unsupported Response"));
                                break;
                            case 3:
                                gi8Var = new gi8(new ug8(400, "Non Successful Response"));
                                break;
                            case 4:
                                gi8Var = new fi8(new ug8(400, "HTTP Transport Error"));
                                break;
                            case 5:
                                gi8Var = new gi8(new ug8(400, "Unsupported Authentication Method"));
                                break;
                            case 6:
                                gi8Var = new gi8(new ug8(400, "Invalid Arguments"));
                                break;
                            case 7:
                                return new fi8(new ug8(503, "Unknown Backend Error"));
                            case 8:
                                return ei8.a;
                            case 9:
                                gi8Var = new fi8(new ug8(400, "Bad Request"));
                                break;
                            case 10:
                                gi8Var = new gi8(new ug8(400, "Unsupported Login Protocol"));
                                break;
                            case 11:
                                gi8Var = new fi8(new ug8(400, "Request Timeout"));
                                break;
                            case 12:
                                gi8Var = new gi8(new ug8(400, "Unknown Identifier"));
                                break;
                            case 13:
                                return new fi8(new ug8(403, "Too Many Attempts"));
                            case 14:
                                gi8Var = new gi8(new ug8(400, "Asking for accesstoken but backend is replying with phone number error"));
                                break;
                            case 15:
                                return new fi8(new ug8(503, "Try Again Later"));
                            case 16:
                                gi8Var = new gi8(new ug8(400, "Hash mismatch"));
                                break;
                            default:
                                return new gi8(new ug8(Integer.valueOf(authenticateFailureQ.q()), "Unexpected failure from Login5"));
                        }
                    } else {
                        if (i3 == 2) {
                            return new gi8(new ug8(Integer.valueOf(authenticateFailureQ.s().n()), authenticateFailureQ.s().getMessage()));
                        }
                        gi8Var = new gi8(new ug8(400, "Esperanto failure: Failure reason NOT_SET"));
                    }
                }
                return gi8Var;
            case 8:
                return new x7c0(pvo.a, (Boolean) obj);
            case 10:
                return Boolean.valueOf(((r560) obj) == r560.a);
            case 11:
                return new maf0(((Boolean) obj).booleanValue());
            case 13:
                return o4p1.o((PlayerState) obj);
            case 14:
                return l4o1.b0((ContextTrack) obj);
            case 15:
                return new rym0(true, (fvf1) obj);
            case 16:
                atq0 atq0Var = (atq0) obj;
                cmo0 cmo0Var = cmo0.d;
                if (atq0Var instanceof zsq0) {
                    objEmpty = cmo0Var.invoke(atq0Var);
                } else {
                    if (!(atq0Var instanceof xsq0)) {
                        eg.o();
                        return null;
                    }
                    objEmpty = Observable.empty();
                }
                return (ObservableSource) objEmpty;
            case 18:
                return ((Boolean) obj).booleanValue() ? nkp0.a : mkp0.a;
            case 23:
                return cyt0.a;
            case 25:
                ContextTrack contextTrack = (ContextTrack) ((spq0) obj).h();
                return spq0.a(contextTrack != null ? contextTrack.uri() : null);
            case 26:
                return z6x.a;
        }
    }

    public First e0(Object obj) {
        switch (this.a) {
            case 1:
                al20 al20Var = (al20) obj;
                al20Var.getClass();
                return First.b(al20Var);
            default:
                gmb1 gmb1Var = (pnb1) obj;
                if (gmb1Var.equals(umb1.a)) {
                    return First.c(gmb1Var, Collections.singleton(new u9w()));
                }
                dnb1 dnb1Var = dnb1.a;
                if (gmb1Var.equals(dnb1Var)) {
                    return First.c(gmb1Var, Collections.singleton(new u9w()));
                }
                if (gmb1Var instanceof cmb1) {
                    cmb1 cmb1Var = (cmb1) gmb1Var;
                    return First.c(dnb1Var, cmb1Var.b ? Collections.singleton(new rcw(cmb1Var.a, (jqf) null)) : Collections.singleton(new u9w()));
                }
                if (gmb1Var instanceof emb1) {
                    return First.c(gmb1Var, Collections.singleton(new u9w()));
                }
                if (gmb1Var instanceof fmb1) {
                    return First.b(gmb1Var);
                }
                if (gmb1Var instanceof gmb1) {
                    gmb1 gmb1Var2 = gmb1Var;
                    td90 td90Var = gmb1Var2.b;
                    return First.c(dnb1Var, Collections.singleton(new rcw(pcf.c(td90Var.a, gmb1Var2.a, td90Var.b), jqf.e)));
                }
                if (gmb1Var instanceof vlb1) {
                    return First.c(dnb1Var, Collections.singleton(new rcw(pcf.d(6, ((vlb1) gmb1Var).a, (String) null), (jqf) null)));
                }
                if (gmb1Var instanceof anb1) {
                    zmb1 zmb1Var = ((anb1) gmb1Var).b;
                    return zmb1Var != null ? First.c(dnb1Var, Collections.singleton(new wcw(zmb1Var.a))) : First.b(gmb1Var);
                }
                if (!(gmb1Var instanceof bnb1)) {
                    eg.o();
                    return null;
                }
                bnb1 bnb1Var = (bnb1) gmb1Var;
                String str = bnb1Var.a;
                wmp0 wmp0Var = bnb1Var.b;
                return wmp0Var.a ? First.c(dnb1Var, Collections.singleton(new rcw(pcf.c(wmp0Var.b, str, wmp0Var.c), jqf.d))) : First.c(dnb1Var, Collections.singleton(new rcw(str, (jqf) null)));
        }
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        String str3;
        switch (this.a) {
            case 21:
                String str4 = (String) linkedHashMap.get("managed_account_id");
                if (str4 == null) {
                    return null;
                }
                return new fwr0(str4, str2, str, xkg0Var);
            case 22:
                return new lss0(xkg0Var, str2, str);
            default:
                String str5 = (String) linkedHashMap.get("user_name");
                if (str5 == null || (str3 = (String) linkedHashMap.get("playlist_id")) == null || str3.length() != 22) {
                    return null;
                }
                int length = str3.length();
                for (int i2 = 0; i2 < length; i2++) {
                    char cCharAt = str3.charAt(i2);
                    if (('a' > cCharAt || cCharAt >= '{') && (('A' > cCharAt || cCharAt >= '[') && ('0' > cCharAt || cCharAt >= ':'))) {
                        return null;
                    }
                }
                return new xyu0(str5, str3, xkg0Var, str2, str);
        }
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        return Boolean.valueOf(((gbl) obj).c && (((Boolean) obj2).booleanValue() || ((Boolean) obj3).booleanValue()));
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 2:
                return !((uv00) obj).f;
            case 12:
                return !((Map) obj).isEmpty();
            case 20:
                return !((uv00) obj).f;
            case 24:
                return ((PlayerState) obj).track().c();
            default:
                return !((Map) obj).isEmpty();
        }
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 9:
                return new mmr0((gud0) obj, (Boolean) obj2);
            default:
                return new mmr0((ContextTrack) obj, (Boolean) obj2);
        }
    }
}
