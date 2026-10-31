package p;

import android.app.Application;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.aiplaylist.promptcreation.presentation.MessageInputView;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;
import com.spotify.premiumdestination.destination.mobius.domain.JsonException;
import com.spotify.premiumdestination.destination.mobius.domain.MappingException;
import com.spotify.premiumdestination.destination.mobius.domain.TransformerException;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import spotify.show_cosmos.proto.ShowRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class l1p0 implements Function, Producer, t2n, k1q0, qiw {
    public final /* synthetic */ byte a;
    public Object b;

    public l1p0() {
        this.a = (byte) 15;
        this.b = Build.VERSION.SDK_INT >= 28 ? new ykb0() : new sjb((byte) 19);
    }

    public tym0 a(String str) {
        HashMap map = new HashMap();
        int i = whc.a;
        ij81 ij81Var = new ij81(-1, (byte) 12);
        UUID uuid = h9v.a;
        d710 d710Var = d710.U0;
        uuid.getClass();
        return new tym0(new ysp0(new cwr(uuid, d710Var, new ua91(fkj0.b1, ((l270) this.b).c(), str), map, false, new int[0], true, ij81Var), new b9v()), (byte) 12);
    }

    public Object apply(Object obj) {
        hix0 gix0Var;
        switch (this.a) {
            case 0:
                return new i5w0(new ru50(((e1p0) this.b).getId(), (j1p0) obj));
            case 1:
            case 2:
            case 4:
            case 5:
            case 7:
            case 9:
            case 10:
            case 15:
            case 23:
            case 24:
            default:
                Map map = (Map) obj;
                fjx0 fjx0Var = (fjx0) this.b;
                LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    ShowRequest.Header header = (ShowRequest.Header) entry.getValue();
                    if (header.r().getPlayedPercentage() >= 100) {
                        zc8 zc8VarA = fjx0Var.b(header.p()).a(zc8.class);
                        gix0Var = new hix0(true, zc8VarA != null ? zc8VarA.e : 0L);
                    } else if (header.r().getPlayedTime() == 0) {
                        zc8 zc8VarA2 = fjx0Var.b(header.p()).a(zc8.class);
                        gix0Var = new hix0(false, zc8VarA2 != null ? zc8VarA2.e : 0L);
                    } else {
                        zc8 zc8VarA3 = fjx0Var.b(header.p()).a(zc8.class);
                        gix0Var = new gix0(zc8VarA3 != null ? zc8VarA3.e : 0L, TimeUnit.SECONDS.toMillis(header.r().getPlayedTime()), false);
                    }
                    linkedHashMap.put(key, gix0Var);
                }
                return linkedHashMap;
            case 3:
                rsy0 rsy0Var = (rsy0) obj;
                hgo hgoVar = (hgo) this.b;
                eur eurVar = (eur) hgoVar.c;
                Application application = ((flm) hgoVar.d).a;
                if (rsy0Var instanceof nsy0) {
                    nsy0 nsy0Var = (nsy0) rsy0Var;
                    if ((nsy0Var.a instanceof k560) && nsy0Var.b) {
                        return eurVar.b(new fwi0(ywi0.d, application.getString(2131960669), application.getString(2131960667), new uvi0(application.getString(2131960668), new y3o0(hgoVar, (byte) 27)), 112), pzo0.c1);
                    }
                }
                eurVar.a("PUFFIN");
                return rih1.a;
            case 6:
                return yz10.h((ovp0) this.b, (Map) obj);
            case 8:
                return ((t9q0) this.b).b.c(((w9q0) obj).a).map(d710.V0);
            case 11:
                b6s0 b6s0Var = (b6s0) obj;
                return ((hr81) this.b).a(tri1.PASSWORD, b6s0Var.a).onErrorReturn(a020.W0).map(new uip0(b6s0Var, (byte) 8));
            case 12:
                String str = (String) obj;
                x3v0 x3v0Var = ((dds0) this.b).a;
                List listSingletonList = Collections.singletonList(str);
                Boolean bool = Boolean.TRUE;
                return x3v0Var.a(listSingletonList, new t3v0(sqg0.J(new mmr0[]{new mmr0("name", bool), new mmr0("covers", bool)}), Collections.singletonMap("link", bool), (Map) null, Collections.singletonList(22), (List) null, 167)).flatMapMaybe(new akp1(str, (byte) 8));
            case 13:
                return new k851(((pc20) this.b).a, (z2g0) obj);
            case 14:
                w9u0 w9u0Var = ((evs0) this.b).d;
                w9u0Var.getClass();
                return w9u0Var.a((q9u0) obj);
            case 16:
                mmr0 mmr0Var = (mmr0) obj;
                pyt0 pyt0Var = (pyt0) mmr0Var.a;
                cs01 cs01Var = (cs01) mmr0Var.b;
                st01 st01Var = cs01Var.f;
                y6b1 y6b1Var = cs01Var.e;
                String str2 = cs01Var.d;
                tyt0 tyt0Var = (tyt0) this.b;
                return tyt0Var.b.a(str2, Collections.singletonList(str2), false).onErrorReturnItem(b7x.a).toObservable().flatMap(new phi0((Object) str2, (Object) y6b1Var, (Object) pyt0Var, (Object) tyt0Var, (Object) st01Var, (byte) 14));
            case 17:
                beh behVar = (feh) obj;
                if (behVar instanceof ceh) {
                    return w231.a;
                }
                if (behVar instanceof beh) {
                    return new j231(behVar.a);
                }
                return new j231("Unknown handling for " + rc11.a.b(((Single) this.b).getClass()));
            case 18:
                return ((veu0) this.b).d;
            case 19:
                return new CompletableFromAction(new tt60((myq0) this.b, (mmr0) obj, (byte) 11));
            case 20:
                kgv0 kgv0Var = (kgv0) this.b;
                return ((Boolean) obj).booleanValue() ? yoi1.i(kgv0Var.d, o6x.a).firstOrError().flatMap(new uip0(kgv0Var, (byte) 16)).compose(new dn81(30, 1000L, 3)).map(eh10.d1) : Single.just(Boolean.FALSE);
            case 21:
                Logger.e((Throwable) obj, "Error reading cookies from %s", new Object[]{((wqv0) this.b).a.a});
                return "";
            case 22:
                Throwable th = (Throwable) obj;
                String str3 = ((wtv0) this.b).b;
                if (str3 == null || ihc1.y0(str3)) {
                    return new juv0(4);
                }
                if (th instanceof JsonException) {
                    return new juv0(5);
                }
                if (th instanceof MappingException) {
                    return new juv0(6);
                }
                return th instanceof TransformerException ? new juv0(7) : new juv0(2);
            case 25:
                return Boolean.valueOf(((vww0) this.b) != vww0.d ? ((xww0) obj).a : true);
            case 26:
                return Observable.create(new yeu0(this.b, obj, (byte) 24));
            case 27:
                return ((v5n) ((yeu0) this.b).c).b(((th61) obj).a).map(icx0.b);
        }
    }

    public Object g(Object obj) {
        return Optional.ofNullable(((t2n) this.b).g((uz21) obj));
    }

    public Object get() {
        return new DispatcherWorker(((l4p0) this.b).c);
    }

    public void v(Object obj) {
        mmr0 mmr0Var = (mmr0) obj;
        fvx0 fvx0Var = (fvx0) this.b;
        zvx0 zvx0Var = (zvx0) mmr0Var.a;
        boolean zBooleanValue = ((Boolean) mmr0Var.b).booleanValue();
        boolean z = zvx0Var instanceof uvx0;
        s24 s24Var = fvx0Var.d;
        MessageInputView messageInputView = (MessageInputView) s24Var.f;
        int i = 0;
        if (!z) {
            messageInputView.setVisibility(zBooleanValue ? 0 : 8);
            return;
        }
        if (!zBooleanValue) {
            int iC1 = ((RecyclerView) ((m021) s24Var.g).c).getLayoutManager().c1();
            i = (iC1 == 0 || iC1 == -1) ? 4 : 8;
        }
        messageInputView.setVisibility(i);
    }

    public hsl1 x(View view, hsl1 hsl1Var) {
        nk80 nk80VarI = hsl1Var.a.i(519);
        z0w0 z0w0Var = (z0w0) this.b;
        int i = z0w0Var.j ? nk80VarI.a : 0;
        RecyclerView recyclerView = z0w0Var.a;
        recyclerView.setPadding(i, recyclerView.getPaddingTop(), i, z0w0Var.l + nk80VarI.d);
        return hsl1Var;
    }

    public /* synthetic */ l1p0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
