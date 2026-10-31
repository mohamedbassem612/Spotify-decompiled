package p;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.spotify.base.java.logging.Logger;
import com.spotify.device_context.v1.TargetDevice;
import com.spotify.gpb.choicescreenuc.ChoiceScreenUcActivity;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.FormatType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessagePresentationStatus;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;
import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.player.model.ContextTrack;
import com.spotify.profile.coreprofileimpl.CoreProfileException;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import spotify.profile_esperanto.proto.ChangeDisplayNameResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fna implements Function, ya, ix30, BiFunction, du11, is31, fxc, g210, Producer {
    public final /* synthetic */ byte a;
    public Object b;

    public fna() {
        this.a = (byte) 24;
        this.b = null;
    }

    public w7h1 a(r6h1 r6h1Var, unb1 unb1Var, String str) {
        if (!(unb1Var instanceof jmb1)) {
            return null;
        }
        String str2 = ((jmb1) unb1Var).a.a;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-audiobook-chapter-row";
        x6h1VarI.f = "3.1.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.d = str2;
        y6h1 y6h1VarA = x6h1VarI.a();
        b7x b7xVar = b7x.a;
        return new w7h1("", "", new z7h1("long_hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA, r6h1Var, System.currentTimeMillis());
    }

    public boolean accept(Object obj) {
        return ((ksk) obj).c == le30.g && ((bo4) this.b).c();
    }

    public Object apply(Object obj) {
        boolean z = false;
        switch (this.a) {
            case 0:
                String str = (String) obj;
                vpp0 vpp0Var = ((hna) this.b).g.a;
                apz apzVarN = EsOffline.HasResourceRequest.n();
                apzVarN.n(str);
                apzVarN.q(gpz.b);
                return vpp0Var.callSingle("spotify.offline_esperanto.proto.Offline", "HasResource", apzVarN.build()).map(sa20.T0).map(ud20.U0).filter(e4y.Z).f(new gap1(str, (byte) 3));
            case 1:
                s141 s141Var = ((esa) this.b).a;
                s141Var.getClass();
                return Single.create(new m7y0(s141Var, (byte) 17)).onErrorReturn(hgx0.h).toObservable().map(stf0.P0);
            case 4:
                Collection<MessagePresentationStatus> collectionValues = ((ConcurrentHashMap) obj).values();
                emc emcVar = (emc) this.b;
                if (!collectionValues.isEmpty()) {
                    for (MessagePresentationStatus messagePresentationStatus : collectionValues) {
                        xj xjVar = emcVar.d;
                        messagePresentationStatus.getClass();
                        if (((Boolean) xjVar.invoke(messagePresentationStatus)).booleanValue() && yhm0.d(messagePresentationStatus) != FormatType.BANNER && yhm0.d(messagePresentationStatus) != FormatType.INLINE_CARD) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 6:
                yvg1 yvg1Var = (yvg1) obj;
                Boolean bool = (Boolean) yvg1Var.a;
                Boolean bool2 = (Boolean) yvg1Var.b;
                Integer num = (Integer) yvg1Var.c;
                h5d h5dVar = (h5d) this.b;
                ps7 ps7Var = h5dVar.e;
                l5d l5dVar = h5dVar.f;
                ((si4) l5dVar.a.b).d();
                Single single = l5dVar.b;
                fp8 fp8Var = l5dVar.a;
                ((si4) fp8Var.b).c();
                if (!bool.booleanValue() && ((si4) fp8Var.b).d() && num.intValue() < 72) {
                    return ps7Var.g("benefits:modal", h5d.h).flatMap(new i3b("benefits:modal", h5dVar, single.flatMapCompletable(new kba(l5d.e, (byte) 8)), (byte) 5));
                }
                if (!bool2.booleanValue() && ((si4) fp8Var.b).c()) {
                    return ps7Var.g("benefits:banner", h5d.h).flatMap(new i3b("benefits:banner", h5dVar, single.flatMapCompletable(new kba(l5d.d, (byte) 8)), (byte) 5));
                }
                Observable observableJust = Observable.just(rih1.a);
                observableJust.getClass();
                return observableJust;
            case 17:
                s0h s0hVar = (s0h) obj;
                l0x0 l0x0Var = ((z0h) this.b).e;
                return ((tuz) l0x0Var.c).a(ContextTrack.create(s0hVar.a.b.a)).flatMapCompletable(new pux0(l0x0Var, s0hVar.b, (byte) 10));
            case 25:
                ChangeDisplayNameResponse changeDisplayNameResponse = (ChangeDisplayNameResponse) obj;
                v5n v5nVar = (v5n) this.b;
                int statusCode = changeDisplayNameResponse.getStatusCode();
                v5nVar.getClass();
                return (200 > statusCode || statusCode >= 300) ? Completable.j(new CoreProfileException(f4i1.c(changeDisplayNameResponse.getStatusCode(), "Failed changing display name, status "))) : CompletableEmpty.a;
            default:
                k23 k23Var = (k23) obj;
                g23 g23Var = (g23) ((bk1) this.b).b;
                axu0 axu0Var = k23Var.a;
                cqz0 cqz0Var = dqz0.a;
                byte[] bArr = new byte[16];
                dqz0.b.l().nextBytes(bArr);
                String strA = f9a.a(bArr);
                Set set = s4b1.f;
                String strZ = uic.y(strA).z();
                strZ.getClass();
                j23 j23Var = (c23) g23Var.d;
                Pattern.compile("^spotify:image:[0-9a-fA-F]+$");
                Single singleRetry = j23Var.c(strZ, (String) null).doOnError(nm.Z).retry(1L);
                u961 u961Var = new u961();
                u961Var.b = g23Var;
                u961Var.c = axu0Var;
                u961Var.a = strA;
                u961Var.d = strZ;
                return singleRetry.flatMapCompletable(u961Var).e(Single.defer(new u33(strZ, (byte) 0))).doOnError(nm.Y).doFinally(new t33(g23Var, axu0Var, strZ)).map(new l7c(k23Var, (byte) 3)).onErrorReturn(mpi1.T0).toObservable();
        }
    }

    public Type b() {
        return (Type) this.b;
    }

    public w7h1 c(r6h1 r6h1Var, unb1 unb1Var, String str) {
        if (!(unb1Var instanceof jmb1)) {
            return null;
        }
        jmb1 jmb1Var = (jmb1) unb1Var;
        String str2 = jmb1Var.a.a;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-audiobook-chapter-row";
        x6h1VarI.f = "3.1.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.d = str2;
        y6h1 y6h1VarA = x6h1VarI.a();
        x440 x440Var = (x440) ((k740) this.b).d(str2).a.getValue();
        rrt0 rrt0Var = jmb1Var.f;
        rrt0 rrt0Var2 = rrt0.a;
        b7x b7xVar = b7x.a;
        if (rrt0Var == rrt0Var2) {
            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("pause", 1, Collections.singletonMap("item_to_be_paused", str2)), y6h1VarA, r6h1Var, System.currentTimeMillis());
        }
        if ((x440Var instanceof r440) || (x440Var instanceof w440) || (x440Var instanceof q440)) {
            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("show_paywall", 1, Collections.singletonMap("paywalled_item", str2)), y6h1VarA, r6h1Var, System.currentTimeMillis());
        }
        if (x440Var instanceof v440) {
            return null;
        }
        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str2)), y6h1VarA, r6h1Var, System.currentTimeMillis());
    }

    public void d(tv80 tv80Var) {
        ((jgm) this.b).a.c.invoke(tv80Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(ybq0 ybq0Var, onm onmVar) {
        yfd yfdVar;
        if (onmVar instanceof yfd) {
            yfdVar = (yfd) onmVar;
            int i = yfdVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                yfdVar.d = i - Integer.MIN_VALUE;
            } else {
                yfdVar = new yfd(this, onmVar);
            }
        } else {
            yfdVar = new yfd(this, onmVar);
        }
        Object obj = yfdVar.b;
        int i2 = yfdVar.d;
        tdq0 tdq0Var = tdq0.a;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybq0 ybq0Var2 = yfdVar.a;
                hm5.M(obj);
                return tdq0Var;
            }
            hm5.M(obj);
            Completable completableC = ((byp0) this.b).c(ybq0Var.a, ybq0Var.b);
            yfdVar.a = ybq0Var;
            yfdVar.d = 1;
            Object objI = fc11.i(completableC, yfdVar);
            d9n d9nVar = d9n.a;
            return objI == d9nVar ? d9nVar : tdq0Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.d(l1d.m("Cancel download failed for: ", ybq0Var.a), new Object[]{e2});
            return tdq0Var;
        }
    }

    public Intent f(Intent intent) {
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(intent.getDataString());
        try {
            String strJ = s4b1VarX.j();
            if (strJ == null) {
                strJ = "";
            }
            UUID uuidFromString = UUID.fromString(strJ);
            Context context = (Context) ((fw0) this.b).b;
            v5g v5gVar = new v5g(uxf.b, uuidFromString.toString(), intent.getDataString());
            Intent intent2 = new Intent(context, (Class<?>) ChoiceScreenUcActivity.class);
            intent2.putExtra("EXTRA_CHOICE_SCREEN_UC_ARGS", v5gVar);
            return intent2;
        } catch (Exception unused) {
            Logger.d("Not a valid UUID: %s", new Object[]{s4b1VarX.j()});
            return null;
        }
    }

    public Object get() {
        return new DispatcherWorker(((llo) this.b).d);
    }

    public Object i(wyp0 wyp0Var) {
        byh byhVar = new byh(wyp0Var);
        wyp0Var.p(new uq8((Object) byhVar, (byte) 18));
        return byhVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object j(String str, long j, long j2, onm onmVar) {
        tmg tmgVar;
        if (onmVar instanceof tmg) {
            tmgVar = (tmg) onmVar;
            int i = tmgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tmgVar.c = i - Integer.MIN_VALUE;
            } else {
                tmgVar = new tmg(this, onmVar);
            }
        } else {
            tmgVar = new tmg(this, onmVar);
        }
        tmg tmgVar2 = tmgVar;
        Object objA = tmgVar2.a;
        int i2 = tmgVar2.c;
        if (i2 == 0) {
            hm5.M(objA);
            smg smgVar = (smg) this.b;
            tmgVar2.c = 1;
            objA = smgVar.a(str, j, j2, tmgVar2);
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
        return Boolean.valueOf(((wmg) objA).a);
    }

    public String k() {
        String strEncodeToString;
        Objects.toString((TargetDevice) this.b);
        TargetDevice targetDevice = (TargetDevice) this.b;
        return (targetDevice == null || (strEncodeToString = Base64.encodeToString(targetDevice.toByteArray(), 2)) == null) ? "" : strEncodeToString;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    public void l(String str, String str2) {
        ose0 ose0Var;
        cab cabVar = ((u3c) this.b).a;
        wcr wcrVar = (wcr) cabVar.b;
        if (str != null) {
            ose0 ose0Var2 = ose0.d;
            ose0 ose0Var3 = ose0.e;
            switch (str2) {
                case "INFO":
                    ose0Var = ose0.c;
                    break;
                case "WARN":
                    ose0Var = ose0Var2;
                    break;
                case "DEBUG":
                    ose0Var = ose0.b;
                    break;
                case "ERROR":
                    ose0Var = ose0Var3;
                    break;
                case "VERBOSE":
                    ose0Var = ose0.a;
                    break;
                default:
                    ose0Var = null;
                    break;
            }
            List listD1 = o7h.d1(ihc1.Q0(str, new String[]{"\n"}, 0, 6), 12);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listD1) {
                String str3 = (String) obj;
                if (!ihc1.h0(str3, "Retry number", false) && !ihc1.h0(str3, "Final attempt", false)) {
                    arrayList.add(obj);
                }
            }
            String strY0 = o7h.y0(arrayList, (CharSequence) null, (String) null, (String) null, (iu30) null, 63);
            String strY1 = o7h.y0(o7h.d1(ihc1.Q0(str, new String[]{"\n"}, 0, 6), 12), (CharSequence) null, (String) null, (String) null, (iu30) null, 63);
            int iOrdinal = ((qc4) cabVar.c).a().ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    if (ose0Var == ose0Var2 || ose0Var == ose0Var3) {
                        if (!u890.j((String) cabVar.d, strY0) || ihc1.h0(strY1, "Retry number: 0", false)) {
                            cabVar.d = strY0;
                            wcrVar.c(3, null, f4i1.f(str2, ", ", strY1));
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (iOrdinal != 2) {
                    eg.o();
                    return;
                }
                if (ose0Var == ose0Var3) {
                    if (!u890.j((String) cabVar.d, strY0) || ihc1.h0(strY1, "Retry number: 0", false)) {
                        cabVar.d = strY0;
                        wcrVar.c(3, null, f4i1.f(str2, ", ", strY1));
                    }
                }
            }
        }
    }

    public void onFailure(Throwable th) {
        synchronized (((iod) this.b).a) {
            try {
                ((iod) this.b).d.q();
                int iC = l1d.C(((iod) this.b).i);
                if ((iC == 3 || iC == 5 || iC == 6) && !(th instanceof CancellationException)) {
                    j2h1.N("CaptureSession");
                    ((iod) this.b).d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void onSuccess(Object obj) {
    }

    public /* synthetic */ fna(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public Object apply(Object obj, Object obj2) {
        List list = (List) obj;
        b881 b881Var = (b881) obj2;
        int iH = ((oto0) ((ajq0) this.b).e).a.h();
        int size = list.size();
        if (iH > size) {
            iH = size;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(iH, new t8e(b881Var));
        return arrayList;
    }
}
