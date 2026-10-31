package p;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import com.spotify.accountswitching.v1.Account;
import com.spotify.accountswitching.v1.AccountProfile;
import com.spotify.accountswitching.v1.GetAddAccountPageResponse;
import com.spotify.authentication.tokenexchangeesperanto.EsTokenExchange;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.mobius.Next;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public class ubc implements h271, il60, BiPredicate, BiFunction, Function, Init, jrn0, izq0, n8n {
    public final /* synthetic */ byte a;

    public ubc() {
        this.a = (byte) 14;
        gwc0 gwc0Var = gwc0.b;
    }

    public static Next h(lz41 lz41Var) {
        return Next.a(Collections.singleton(new tc51(lz41Var.a, (tv80) null, (gto1) null, 12)));
    }

    public ArrayList a(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
        ArrayList arrayList = new ArrayList(packageInfo.signatures.length);
        for (Signature signature : packageInfo.signatures) {
            byte[] bArrW = kln1.w(signature);
            if (bArrW == null) {
                return null;
            }
            arrayList.add(bArrW);
        }
        return arrayList;
    }

    public Object apply(Object obj, Object obj2) {
        gqi0 eqi0Var;
        boolean z;
        switch (this.a) {
            case 9:
                List listM = p7h.M(new xdz[]{(xdz) obj, (xdz) obj2});
                if (!(listM instanceof Collection) || !listM.isEmpty()) {
                    Iterator it = listM.iterator();
                    while (it.hasNext()) {
                        if (!(((xdz) it.next()) instanceof vdz)) {
                            Iterator it2 = o7h.n0(listM, wdz.class).iterator();
                            if (!it2.hasNext()) {
                                hhg1.h("Empty collection can't be reduced.");
                                return null;
                            }
                            Object next = it2.next();
                            while (it2.hasNext()) {
                                next = new wdz(new ydz(((wdz) next).a, ((wdz) it2.next()).a));
                            }
                            return (xdz) next;
                        }
                    }
                }
                ArrayList arrayListN0 = o7h.n0(listM, vdz.class);
                vdz vdzVar = new vdz("");
                Iterator it3 = arrayListN0.iterator();
                vdz vdzVar2 = vdzVar;
                while (it3.hasNext()) {
                    vdzVar2 = new vdz(f4i1.f(vdzVar2.a, ", ", ((vdz) it3.next()).a));
                }
                return vdzVar2;
            default:
                GetAddAccountPageResponse getAddAccountPageResponse = (GetAddAccountPageResponse) obj;
                List list = (List) obj2;
                h290<Account> h290VarN = getAddAccountPageResponse.n();
                ArrayList arrayList = new ArrayList(q7h.U(h290VarN, 10));
                for (Account account : h290VarN) {
                    account.getClass();
                    String username = account.getUsername();
                    String displayName = account.q().getDisplayName();
                    String imageUrl = account.q().getImageUrl();
                    int iN = account.n();
                    int i = iN == 0 ? -1 : vi10.b[l1d.C(iN)];
                    if (i != -1) {
                        if (i == 1) {
                            eqi0Var = new eqi0(account.p().getChildId());
                        } else if (i == 2) {
                            eqi0Var = new dqi0(account.o().getChildId());
                        } else if (i == 3) {
                            eqi0Var = new fqi0(account.s().o());
                        } else if (i == 4) {
                            eqi0Var = new gqi0(account.r().o());
                        } else if (i != 5) {
                            eg.o();
                            return null;
                        }
                        AccountProfile accountProfileQ = account.q();
                        int value = accountProfileQ.hasColor() ? accountProfileQ.getColor().getValue() : 0;
                        List list2 = list;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator it4 = list2.iterator();
                            while (true) {
                                z = it4.hasNext();
                                if (u890.j(((ev) it4.next()).a, account.getUsername())) {
                                }
                            }
                        }
                        arrayList.add(new z8t0(username, displayName, imageUrl, eqi0Var, value, z));
                        break;
                    }
                    eg.m("Account type not supported");
                    return null;
                }
                boolean zO = getAddAccountPageResponse.o();
                boolean zO2 = getAddAccountPageResponse.q().o();
                if (!getAddAccountPageResponse.r()) {
                    getAddAccountPageResponse = null;
                }
                return new h9t0(arrayList, zO, zO2, getAddAccountPageResponse != null ? Integer.valueOf(getAddAccountPageResponse.p()) : null);
        }
    }

    public Object b(u171 u171Var) {
        throw new UnsupportedOperationException("Config input not supported for chat preview cards");
    }

    public uzr0 c() {
        return new hl60();
    }

    public uzr0 d(fl60 fl60Var, bl60 bl60Var) {
        return new hl60(fl60Var, bl60Var);
    }

    public List e(Executor executor) {
        return Collections.singletonList(new pkr(executor));
    }

    public First e0(Object obj) {
        return First.b((r6g0) obj);
    }

    public List f() {
        return Collections.EMPTY_LIST;
    }

    public boolean g(CharSequence charSequence) {
        return false;
    }

    public irn0 l(Intent intent, th61 th61Var) {
        Bundle bundleP;
        String strValueOf = String.valueOf(intent.getData());
        Set set = s4b1.f;
        String strJ = uic.x(strValueOf).j();
        bi90 parcelableExtra = intent.getParcelableExtra("SELECTED_ITEM");
        if (parcelableExtra != null) {
            bundleP = sjb.p(parcelableExtra, strJ);
        } else {
            if (!jmo1.m(strJ)) {
                hhg1.n("Category details fragment cannot be instantiated without a category");
                return null;
            }
            bundleP = sjb.p(null, strJ);
        }
        return new frn0(bundleP, y7e.class);
    }

    public Object s(t171 t171Var) {
        return new ygf(t171Var.b, t171Var.c);
    }

    public Object t(v171 v171Var) {
        throw new UnsupportedOperationException("URI input not supported for chat preview cards");
    }

    public boolean test(Object obj, Object obj2) {
        s0w s0wVar = (s0w) obj;
        s0w s0wVar2 = (s0w) obj2;
        s0wVar.getClass();
        s0wVar2.getClass();
        return s0wVar.f == s0wVar2.f && u890.j(s0wVar.h, s0wVar2.h) && u890.j(s0wVar.g, s0wVar2.g) && u890.j(s0wVar.i, s0wVar2.i) && u890.j(s0wVar.j, s0wVar2.j);
    }

    public Object apply(Object obj) {
        boolean z;
        switch (this.a) {
            case 13:
                rsy0 rsy0Var = (rsy0) obj;
                if (rsy0Var instanceof ksy0) {
                    z = true;
                } else {
                    if (!(rsy0Var instanceof nsy0) && !rsy0Var.equals(isy0.a) && !rsy0Var.equals(jsy0.a) && !rsy0Var.equals(lsy0.a) && !rsy0Var.equals(msy0.a) && !rsy0Var.equals(osy0.a) && !rsy0Var.equals(psy0.a) && !(rsy0Var instanceof qsy0)) {
                        eg.o();
                        return null;
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 14:
                return gwc0.b.get(obj);
            case 21:
                return lfz0.b((tl51) obj);
            case 22:
                pze0.m(obj);
                throw null;
            case 25:
                return ypa.o((re70) obj);
            default:
                return a0f1.d((EsTokenExchange.TokenExchangeResponse) obj);
        }
    }
}
