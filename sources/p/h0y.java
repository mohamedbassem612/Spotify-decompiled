package p;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.tasks.Task;
import com.google.protobuf.Any;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;
import com.spotify.player.model.PlayerState;
import com.spotify.profile.profilelist.datasource.PartialProfileListDataException;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import spotify.autodownload.esperanto.proto.SetEpisodeLimitRequest;
import spotify.mdata.proto.Mdata;
import spotify.mdata.proto.Mdata$LocalBatchedExtensionResponse$EntityExtension;
import spotify.mdata.proto.Mdata$LocalBatchedExtensionResponse$ExtensionHeader;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h0y implements i2q0, Function, av30, ix30, h4i1, ya, Producer {
    public final /* synthetic */ byte a;
    public final Object b;

    public h0y(xdn0 xdn0Var) {
        Object objE;
        this.a = (byte) 23;
        this.b = xdn0Var;
        Object objE2 = null;
        try {
            objE = xdn0Var.e(jrd1.s0);
        } catch (IllegalArgumentException unused) {
            objE = null;
        }
        Class cls = (Class) objE;
        if (cls != null && !cls.equals(pr70.class)) {
            hhg1.i("Invalid target class configuration for ", this, ": ", cls);
            throw null;
        }
        ((xdn0) this.b).r(i4i1.I0, k4i1.a);
        xdn0 xdn0Var2 = (xdn0) this.b;
        xdn0Var2.r(jrd1.s0, pr70.class);
        try {
            objE2 = xdn0Var2.e(jrd1.r0);
        } catch (IllegalArgumentException unused2) {
        }
        if (objE2 == null) {
            ((xdn0) this.b).r(jrd1.r0, pr70.class.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }

    public static String b(Intent intent) {
        String string;
        Bundle extras = intent.getExtras();
        String str = "";
        if (extras != null && (string = extras.getString("query", "")) != null) {
            str = string;
        }
        return "spotify://search/".concat(str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(onm onmVar) {
        i020 i020Var;
        if (onmVar instanceof i020) {
            i020Var = (i020) onmVar;
            int i = i020Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                i020Var.c = i - Integer.MIN_VALUE;
            } else {
                i020Var = new i020(this, onmVar);
            }
        } else {
            i020Var = new i020(this, onmVar);
        }
        Object objP = i020Var.a;
        int i2 = i020Var.c;
        lnm lnmVar = null;
        try {
            if (i2 == 0) {
                hm5.M(objP);
                ytw0 ytw0Var = jfv.b;
                long jK0 = fdg1.k0(10, ngv.e);
                j020 j020Var = new j020(this, lnmVar, (byte) 0);
                i020Var.c = 1;
                objP = rc2.P(jK0, j020Var, i020Var);
                d9n d9nVar = d9n.a;
                if (objP == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objP);
            }
            String str = (String) objP;
            return str == null ? u4y.a : new w4y(str);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public boolean accept(Object obj) {
        return ((kmj1) this.b).a.a();
    }

    public Object apply(Object obj) {
        Mdata$LocalBatchedExtensionResponse$ExtensionHeader mdata$LocalBatchedExtensionResponse$ExtensionHeaderO;
        Mdata$LocalBatchedExtensionResponse$ExtensionHeader mdata$LocalBatchedExtensionResponse$ExtensionHeaderO2;
        byte[] bArrT;
        phc phcVarQ;
        h290 h290VarN;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 3:
                gr61 gr61Var = ((z4z) obj).a;
                mt8 mt8Var = ((nt8) obj2).a;
                nk61 nk61VarN = SetEpisodeLimitRequest.n();
                if (gr61Var instanceof gr61) {
                    nk61VarN.n(gr61Var.a);
                } else {
                    nk61VarN.q();
                }
                return mt8Var.callSingle("spotify.autodownload_esperanto.proto.AutoDownloadService", "SetEpisodeLimit", nk61VarN.build()).map(vrg.t).ignoreElement();
            case 5:
                juz juzVar = (juz) obj2;
                Mdata.LocalBatchedExtensionResponse.Extension extension = (Mdata.LocalBatchedExtensionResponse.Extension) o7h.s0(((Mdata.LocalBatchedExtensionResponse) obj).getExtensionList());
                Mdata$LocalBatchedExtensionResponse$EntityExtension mdata$LocalBatchedExtensionResponse$EntityExtension = (extension == null || (h290VarN = extension.n()) == null) ? null : (Mdata$LocalBatchedExtensionResponse$EntityExtension) o7h.s0(h290VarN);
                if (mdata$LocalBatchedExtensionResponse$EntityExtension == null || (mdata$LocalBatchedExtensionResponse$ExtensionHeaderO2 = mdata$LocalBatchedExtensionResponse$EntityExtension.o()) == null || mdata$LocalBatchedExtensionResponse$ExtensionHeaderO2.getStatusCode() != 200) {
                    return new jvd0((gvd0) null, new fvd0((mdata$LocalBatchedExtensionResponse$EntityExtension == null || (mdata$LocalBatchedExtensionResponse$ExtensionHeaderO = mdata$LocalBatchedExtensionResponse$EntityExtension.o()) == null) ? null : Integer.valueOf(mdata$LocalBatchedExtensionResponse$ExtensionHeaderO.getStatusCode()), (String) null));
                }
                int number = hz00.W1.getNumber();
                Any anyN = mdata$LocalBatchedExtensionResponse$EntityExtension.n();
                if (anyN == null || (phcVarQ = anyN.q()) == null || (bArrT = phcVarQ.t()) == null) {
                    bArrT = new byte[0];
                }
                jvd0 jvd0VarA = juzVar.b.a(Collections.singletonList(new jz00(bArrT, number))).a(jvd0.class);
                return jvd0VarA == null ? new jvd0((gvd0) null, new fvd0(200, (String) null)) : jvd0VarA;
            case 6:
                ArrayList arrayListB = ((chm0) obj2).b();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : arrayListB) {
                    if (obj3 instanceof qjl) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    r7h.W(((qjl) it.next()).c(), arrayList2);
                }
                return o7h.p1(arrayList2);
            case 8:
                z310 z310Var = (z310) obj;
                List list = z310Var.a;
                list.size();
                short s = ((r9c) obj2).j.a;
                return list.size() > s ? z310.a(z310Var, list.subList(0, s), z310Var.b, 12) : z310Var;
            case 12:
                lot lotVar = (mot) ((t030) obj2).g.invoke(((mn3) obj).d);
                if (lotVar.equals(kot.a)) {
                    return jq3.a;
                }
                if (lotVar instanceof lot) {
                    lot lotVar2 = lotVar;
                    return new iq3(lotVar2.a, lotVar2.b);
                }
                eg.o();
                return null;
            case 15:
                Throwable th = (Throwable) obj;
                return Observable.error(th instanceof PartialProfileListDataException ? (PartialProfileListDataException) th : new PartialProfileListDataException((j8x0) obj2, th));
            case 17:
                dt50 dt50Var = (dt50) obj;
                na naVar = (na) obj2;
                return dt50Var != dt50.NONE ? Observable.fromCallable(new sra(dt50Var, (byte) 5)) : ((g0l) naVar.c).l().map(new nhc(naVar, (byte) 11));
            case 20:
                return ((jh50) obj2).a.a(((t4b) obj).g).onErrorReturnItem(new yaa0()).toObservable();
            case 21:
                xo60 xo60Var = (xo60) obj2;
                return ((Boolean) obj).booleanValue() ? (uut0) xo60Var.e.getValue() : (uut0) xo60Var.d.getValue();
            case 24:
                return new CompletableFromAction(new go91((io91) obj2, (String) obj, (byte) 0));
            default:
                PlayerState playerState = (PlayerState) obj;
                h690 h690Var = (h690) obj2;
                return (!playerState.isPlaying() || playerState.isPaused()) ? Flowable.I(playerState.position(h690Var.b.b())) : Flowable.h(Flowable.I(playerState), h690Var.c, new mev((Object) h690Var, (byte) 29));
        }
    }

    public boolean c(Intent intent) {
        String strE = ((xap) this.b).e(intent);
        return "android.intent.action.SEARCH".equals(intent.getAction()) && strE != null && ihc1.h0(strE, "com.google.android.googlequicksearchbox", false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(String str, onm onmVar) {
        fdz fdzVar;
        if (onmVar instanceof fdz) {
            fdzVar = (fdz) onmVar;
            int i = fdzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fdzVar.c = i - Integer.MIN_VALUE;
            } else {
                fdzVar = new fdz(this, onmVar);
            }
        } else {
            fdzVar = new fdz(this, onmVar);
        }
        Object objD = fdzVar.a;
        int i2 = fdzVar.c;
        if (i2 == 0) {
            hm5.M(objD);
            Set set = s4b1.f;
            if (!uic.g(str, blc0.Pg) && !uic.g(str, blc0.ed) && !uic.g(str, blc0.M3)) {
                bhn0.f("Unsupported uri ".concat(str));
                return null;
            }
            int iOrdinal = uic.x(str).c.ordinal();
            if (iOrdinal != 166 && iOrdinal != 652) {
                return str;
            }
            amd amdVar = (amd) this.b;
            fdzVar.c = 1;
            objD = amdVar.d(str, fdzVar);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objD);
        }
        io70 io70Var = ((jo70) objD).e;
        if (io70Var != null) {
            return io70Var.b;
        }
        return null;
    }

    public xdn0 e() {
        return (xdn0) this.b;
    }

    public Object get() {
        return new DispatcherWorker(((vz90) this.b).a);
    }

    public i4i1 h() {
        return new qr70(eqq0.b((xdn0) this.b));
    }

    public void onComplete(Task task) {
        Exception excV;
        l441 l441Var = (l441) this.b;
        boolean zJ = task.j();
        rih1 rih1Var = rih1.a;
        if (zJ) {
            l441Var.resumeWith(rih1Var);
            return;
        }
        Exception excF = task.f();
        if (excF == null || (excV = lmt0.v(excF)) == null) {
            l441Var.resumeWith(rih1Var);
        } else {
            l441Var.resumeWith(new m231(excV));
        }
    }

    public void onFailure(Throwable th) {
        ((mzc) this.b).c(th);
    }

    public void onSuccess(Object obj) {
        mzc mzcVar = (mzc) this.b;
        try {
            mzcVar.b(obj);
        } catch (Throwable th) {
            mzcVar.c(th);
        }
    }

    public h0y(ConstraintLayout constraintLayout, lag lagVar, FrameLayout frameLayout) {
        this.a = (byte) 14;
        this.b = lagVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h0y(coa1 coa1Var, f8r f8rVar, fgb0 fgb0Var, adr adrVar, ha41 ha41Var, ab50 ab50Var, cun0 cun0Var) {
        this.a = (byte) 25;
        this.b = t380.w(adrVar, coa1Var, f8rVar, fgb0Var, ha41Var, ab50Var, new dyf0[]{cun0Var});
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h0y(byte b) {
        this(xdn0.d());
        this.a = b;
        switch (b) {
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                break;
            default:
                this.b = new Object();
                break;
        }
    }

    public /* synthetic */ h0y(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
