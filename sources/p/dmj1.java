package p;

import android.graphics.Matrix;
import android.os.Build;
import android.os.Parcel;
import com.spotify.connect.esperanto.proto.CommonMessages;
import com.spotify.connect.esperanto.proto.VolumeMessages;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableObserveOn;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.security.Provider;
import java.util.Collections;
import spotify.your_library.esperanto.proto.YourLibraryDecorateResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dmj1 implements Function, pnm, xgn1, acp1, vy11 {
    public final /* synthetic */ byte a;
    public Object b;

    public dmj1(byte b) {
        this.a = b;
        switch (b) {
            case 16:
                break;
            default:
                int i = Build.VERSION.SDK_INT;
                if (i >= 36) {
                    this.b = new url1();
                } else if (i >= 35) {
                    this.b = new trl1();
                } else if (i >= 34) {
                    this.b = new srl1();
                } else if (i >= 31) {
                    this.b = new rrl1();
                } else if (i >= 30) {
                    this.b = new qrl1();
                } else if (i < 29) {
                    this.b = new nrl1();
                } else {
                    this.b = new prl1();
                }
                break;
        }
    }

    public w7h1 a(String str) {
        rsk0 rsk0Var = (rsk0) this.b;
        x6h1 x6h1VarC = rsk0Var.c.c();
        x6h1VarC.i.add(new a7h1("continue_watching_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str)), y6h1VarA, rsk0Var.b, System.currentTimeMillis());
    }

    public void accept(Object obj, Object obj2) {
        bao1 bao1Var = new bao1((pxo1) this.b, (bsd1) obj2);
        vco1 vco1VarN = ((ldo1) obj).n();
        Parcel parcelA1 = vco1VarN.a1();
        osn1.c(parcelA1, bao1Var);
        vco1VarN.c1(2, parcelA1);
    }

    public Object apply(Object obj) {
        CompletableObserveOn completableObserveOnN;
        String str = null;
        switch (this.a) {
            case 0:
                ContextTrack contextTrack = (ContextTrack) obj;
                String strA0 = l4o1.a0(contextTrack, "context_uri");
                if (strA0 == null) {
                    strA0 = "";
                }
                String strUid = contextTrack.uid();
                String str2 = strUid != null ? strUid : "";
                return ((strA0.length() <= 0 || str2.length() <= 0) ? Flowable.I(new to91((Boolean) null)) : ((ip91) this.b).c(str2, strA0).toFlowable(BackpressureStrategy.d)).J(new qeh1(contextTrack, (byte) 5));
            case 1:
            case 2:
            case 6:
            default:
                return (svc0) ((ado0) ((cik1) this.b).d).invoke((YourLibraryDecorateResponse) obj);
            case 3:
                drk1 drk1Var = (drk1) obj;
                bih1 bih1Var = (bih1) this.b;
                Scheduler scheduler = (Scheduler) bih1Var.c;
                be beVar = (be) bih1Var.b;
                String str3 = drk1Var.a;
                b32 b32Var = drk1Var.b;
                int i = b32Var.a;
                String str4 = b32Var.c;
                int iC = l1d.C(i);
                if (iC == 0) {
                    tsk1 tsk1VarN = VolumeMessages.VolumeDownRequest.n();
                    osh oshVarO = CommonMessages.LoggingParams.o();
                    if (str4 != null) {
                        oshVarO.n(str4);
                    }
                    tsk1VarN.q(oshVarO.build());
                    if (str3 != null) {
                        tsk1VarN.n(str3);
                    }
                    completableObserveOnN = beVar.callSingle("spotify.connect.esperanto.proto.ConnectVolumeService", "VolumeDown", tsk1VarN.build()).map(ios.R0).doOnSuccess(iqa1.d1).doOnError(iqa1.e1).ignoreElement().n(scheduler);
                } else {
                    if (iC != 1) {
                        eg.o();
                        return null;
                    }
                    wsk1 wsk1VarN = VolumeMessages.VolumeUpRequest.n();
                    osh oshVarO2 = CommonMessages.LoggingParams.o();
                    if (str4 != null) {
                        oshVarO2.n(str4);
                    }
                    wsk1VarN.q(oshVarO2.build());
                    if (str3 != null) {
                        wsk1VarN.n(str3);
                    }
                    completableObserveOnN = beVar.callSingle("spotify.connect.esperanto.proto.ConnectVolumeService", "VolumeUp", wsk1VarN.build()).map(v560.R0).doOnSuccess(vrk1.d).doOnError(vrk1.e).ignoreElement().n(scheduler);
                }
                return completableObserveOnN.w().onErrorResumeNext(wbx0.X0);
            case 4:
                mmr0 mmr0Var = (mmr0) obj;
                b4l1 b4l1Var = ((w0l1) this.b).a;
                String str5 = (String) mmr0Var.a;
                String str6 = (String) mmr0Var.b;
                if (str5 != null || ((str5 = b4l1Var.d) != null && str5.length() > 0)) {
                    str = str5;
                }
                if (str == null) {
                    return new g2l1(false);
                }
                if (str6 == null) {
                    str6 = b4l1Var.h;
                }
                return new f2l1(b4l1Var, str, str6);
            case 5:
                return j2h1.D(o6x.a, new w621((g2x0) this.b, (rnh) obj, (lnm) null, (byte) 26)).o(Functions.h);
            case 7:
                ikl1 ikl1Var = (ikl1) this.b;
                return ((Boolean) obj).booleanValue() ? ikl1Var.b.a(ikl1Var.a).compose(ikl1Var.f) : Observable.just(new xsq0(new IOException("Connectivity is offline.")));
        }
    }

    public hsl1 b() {
        return ((vrl1) this.b).b();
    }

    public Object c() {
        return ((WeakReference) this.b).get();
    }

    public dbk1 d() {
        return (dbk1) this.b;
    }

    public void e(nk80 nk80Var) {
        ((vrl1) this.b).f(nk80Var);
    }

    public void f(nk80 nk80Var) {
        ((vrl1) this.b).h(nk80Var);
    }

    public zxl1 g(iu30 iu30Var) {
        return new zxl1(((pjo1) this.b).a.a, iu30Var, (byte) 20);
    }

    public Object zza(Object obj) {
        return new pzd1((bep1) obj, (Matrix) this.b);
    }

    public Object zza(String str) {
        return ((zgn1) this.b).a(str, (Provider) null);
    }

    public dmj1(iac0 iac0Var) {
        this.a = (byte) 6;
        this.b = new WeakReference(iac0Var);
    }

    public /* synthetic */ dmj1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public dmj1(hsl1 hsl1Var) {
        this.a = (byte) 8;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            this.b = new url1(hsl1Var);
            return;
        }
        if (i >= 35) {
            this.b = new trl1(hsl1Var);
            return;
        }
        if (i >= 34) {
            this.b = new srl1(hsl1Var);
            return;
        }
        if (i >= 31) {
            this.b = new rrl1(hsl1Var);
            return;
        }
        if (i >= 30) {
            this.b = new qrl1(hsl1Var);
        } else if (i >= 29) {
            this.b = new prl1(hsl1Var);
        } else {
            this.b = new nrl1(hsl1Var);
        }
    }
}
