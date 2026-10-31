package p;

import com.spotify.authentication.login5esperanto.EsAuthenticateResult;
import com.spotify.messages.AccountSwitchingAddAccount;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes15.dex */
public final class qr implements Predicate, Function, BiFunction {
    public final /* synthetic */ byte a;
    public static final qr b = new qr((byte) 0);
    public static final qr c = new qr((byte) 1);
    public static final qr d = new qr((byte) 2);
    public static final qr e = new qr((byte) 3);
    public static final qr f = new qr((byte) 4);
    public static final qr g = new qr((byte) 5);
    public static final qr h = new qr((byte) 6);
    public static final qr i = new qr((byte) 7);
    public static final qr t = new qr((byte) 8);
    public static final qr X = new qr((byte) 9);

    public qr(cs csVar) {
        this.a = (byte) 10;
    }

    public static final String a(byte[] bArr) {
        return new String(bArr, nne.e);
    }

    public static final byte[] b(String str) {
        return str.getBytes(nne.e);
    }

    public Object apply(Object obj) {
        gi8 gi8Var;
        switch (this.a) {
            case 1:
                return k941.a;
            case 2:
                return z6x.a;
            case 3:
            case 4:
            case 5:
            default:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Object[]) obj) {
                    if (obj2 instanceof spq0) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    lw lwVar = (lw) ((spq0) it.next()).h();
                    if (lwVar != null) {
                        arrayList2.add(lwVar);
                    }
                }
                ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(cs.r((lw) it2.next()));
                }
                return o7h.a1(arrayList3, new hq((byte) 1));
            case AccountSwitchingAddAccount.ACCOUNT_AUTO_ADDED_FIELD_NUMBER /* 6 */:
                EsAuthenticateResult.AuthenticateResult authenticateResult = (EsAuthenticateResult.AuthenticateResult) obj;
                int iS = authenticateResult.s();
                int i2 = iS == 0 ? -1 : ov.a[l1d.C(iS)];
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
                    int i3 = iR != 0 ? ov.b[l1d.C(iR)] : -1;
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
                            case AccountSwitchingAddAccount.ACCOUNT_AUTO_ADDED_FIELD_NUMBER /* 6 */:
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
            case 7:
                for (l0l l0lVar : (List) obj) {
                    if (l0lVar.l()) {
                        return l0lVar.d();
                    }
                }
                bhn0.t("Collection contains no element matching the predicate.");
                return null;
            case 8:
                jn41 jn41Var = (ln41) obj;
                return jn41Var instanceof jn41 ? new cw(((ui8) jn41Var.a).d()) : dw.a;
            case 9:
                jn41 jn41Var2 = (ln41) obj;
                if (!(jn41Var2 instanceof jn41)) {
                    return aw.a;
                }
                vuk vukVar = (vuk) jn41Var2.a;
                return new zv(vukVar.f(), vukVar.c());
        }
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((bw) obj) instanceof zv;
            case 3:
                return ((ew) obj) instanceof dw;
            default:
                return !((th61) obj).b;
        }
    }

    public /* synthetic */ qr(byte b2) {
        this.a = b2;
    }

    public Object apply(Object obj, Object obj2) {
        return (th61) obj2;
    }
}
