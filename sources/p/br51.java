package p;

import android.util.Base64;
import com.spotify.endless.base.exception.EndlessException;
import com.spotify.lexiconformatlistprovider.v0.proto.PromptSignalPayloadProto;
import com.spotify.player.esperanto.proto.EsLoggingParams;
import com.spotify.player.esperanto.proto.EsOptional;
import com.spotify.player.esperanto.proto.EsPlayOrigin;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.SkipToNextTrackCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableAndThenCompletable;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class br51 implements Function {
    public final /* synthetic */ kl81[] a;
    public final /* synthetic */ cr51 b;

    public br51(kl81[] kl81VarArr, cr51 cr51Var) {
        this.a = kl81VarArr;
        this.b = cr51Var;
    }

    public final Object apply(Object obj) {
        int i;
        CompletableAndThenCompletable completableAndThenCompletableJ;
        wp51 wp51Var = wp51.Q0;
        PlayerState playerState = (PlayerState) obj;
        cr51 cr51Var = this.b;
        w9u0 w9u0Var = cr51Var.c;
        yqg yqgVar = cr51Var.a;
        mm4 mm4Var = cr51Var.b;
        kl81[] kl81VarArr = this.a;
        ArrayList arrayList = new ArrayList(kl81VarArr.length);
        int length = kl81VarArr.length;
        int i2 = 0;
        while (i2 < length) {
            kl81 kl81Var = kl81VarArr[i2];
            if (!(kl81Var instanceof al81)) {
                if (kl81Var instanceof dl81) {
                    boolean zT = o4p1.t(playerState);
                    if (!playerState.signals().contains("prompt") && zT) {
                        completableAndThenCompletableJ = Completable.j(new EndlessException.SignalNotAvailableException());
                    } else if (playerState.signals().contains("prompt")) {
                        dl81 dl81Var = (dl81) kl81Var;
                        String str = dl81Var.a;
                        el81 el81Var = dl81Var.b;
                        zxx0 zxx0VarN = PromptSignalPayloadProto.PromptSignalPayload.n();
                        zxx0VarN.q(str);
                        if (el81Var != null) {
                            zxx0VarN.n(dr51.c(el81Var));
                        }
                        completableAndThenCompletableJ = cr51Var.f("prompt", Base64.encodeToString(zxx0VarN.build().toByteArray(), 2)).c(cr51Var.b(mm4Var.b(), wp51Var));
                    } else {
                        dl81 dl81Var2 = (dl81) kl81Var;
                        String str2 = dl81Var2.a;
                        el81 el81Var2 = dl81Var2.b;
                        zxx0 zxx0VarN2 = PromptSignalPayloadProto.PromptSignalPayload.n();
                        zxx0VarN2.q(str2);
                        if (el81Var2 != null) {
                            zxx0VarN2.n(dr51.c(el81Var2));
                        }
                        byte[] bArrEncode = Base64.encode(zxx0VarN2.build().toByteArray(), 2);
                        hhc hhcVar = phc.b;
                        ayc0 ayc0Var = new ayc0("prompt", (phc) null, phc.e(0, bArrEncode, bArrEncode.length), false, (String) null, 26);
                        zpz zpzVarY = EsPlayOrigin.PlayOrigin.y();
                        zpzVarY.s("endless");
                        EsPlayOrigin.PlayOrigin playOriginBuild = zpzVarY.build();
                        coz cozVarR = EsLoggingParams.LoggingParams.r();
                        cozVarR.n("unknown");
                        cozVarR.q("unknown");
                        qpz qpzVarP = EsOptional.OptionalInt64.p();
                        qpzVarP.n(yqgVar.b());
                        cozVarR.t(qpzVarP);
                        i = i2;
                        completableAndThenCompletableJ = j2h1.D(o6x.a, new p651(cr51Var, playOriginBuild, cozVarR.build(), ayc0Var, null, (byte) 1)).c(cr51Var.b(mm4Var.b(), wp51Var));
                    }
                } else {
                    i = i2;
                    if (!(kl81Var instanceof yk81)) {
                        eg.o();
                        return null;
                    }
                    if (playerState.signals().contains("interact")) {
                        completableAndThenCompletableJ = o4p1.C(playerState) ? cr51Var.f("interact", "listen").c(w9u0Var.a(new e9u0(PauseCommand.builder().options(CommandOptions.builder().overrideRestrictions(true).systemInitiated(true).build()).build())).ignoreElement()).c(cr51Var.b(mm4Var.a(), new sc21("listen", (byte) 26))) : cr51Var.f("interact", (String) null).c(cr51Var.b(mm4Var.a(), new sc21("jump", (byte) 26)));
                    } else {
                        completableAndThenCompletableJ = Completable.j(new EndlessException.SignalNotAvailableException());
                    }
                }
                arrayList.add(completableAndThenCompletableJ);
                i2 = i + 1;
            } else if (playerState.signals().contains("jump")) {
                completableAndThenCompletableJ = cr51Var.f("jump", (String) null).c(cr51Var.b(mm4Var.b(), wp51Var));
            } else {
                ContextTrack contextTrackC = cr51.c(playerState);
                if (contextTrackC != null) {
                    completableAndThenCompletableJ = w9u0Var.a(new m9u0(SkipToNextTrackCommand.builder().track(contextTrackC).loggingParams(LoggingParams.builder().commandInitiatedTime(Long.valueOf(yqgVar.b())).build()).build())).flatMapCompletable(new jxa(cr51Var, (byte) 24));
                    completableAndThenCompletableJ.getClass();
                } else {
                    completableAndThenCompletableJ = Completable.j(new IllegalStateException("Could not find track to jump to."));
                }
            }
            i = i2;
            arrayList.add(completableAndThenCompletableJ);
            i2 = i + 1;
        }
        Completable[] completableArr = (Completable[]) arrayList.toArray(new Completable[0]);
        return Completable.f((CompletableSource[]) Arrays.copyOf(completableArr, completableArr.length));
    }
}
