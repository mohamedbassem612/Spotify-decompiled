package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.observers.BlockingMultiObserver;
import io.reactivex.rxjava3.internal.operators.completable.CompletableOnErrorComplete;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jwf1 implements yt11 {
    public final ynb0 a;
    public final ynb0 b;
    public final ynb0 c;
    public final w25 d;
    public final vgm e;
    public final q8n f;
    public final btt0 g;
    public final dxz0 h;
    public final yh2 i;

    public jwf1(ynb0 ynb0Var, ynb0 ynb0Var2, ynb0 ynb0Var3, lwf1 lwf1Var, w25 w25Var, vgm vgmVar, q8n q8nVar, btt0 btt0Var, dxz0 dxz0Var, yh2 yh2Var) {
        b3s b3sVar = b3s.c;
        this.a = ynb0Var;
        this.b = ynb0Var2;
        this.c = ynb0Var3;
        this.d = w25Var;
        this.e = vgmVar;
        this.f = q8nVar;
        this.g = btt0Var;
        this.h = dxz0Var;
        this.i = yh2Var;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ff A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x0100 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x0101 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x0103  */
    /* JADX WARN: Code duplicated, block: B:56:0x0106  */
    /* JADX WARN: Code duplicated, block: B:61:0x0117  */
    /* JADX WARN: Code duplicated, block: B:69:0x0127  */
    /* JADX WARN: Code duplicated, block: B:72:0x013a  */
    /* JADX WARN: Code duplicated, block: B:73:0x016d  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Instruction removed from duplicated block: B:73:0x016d, please report this as an issue */
    public final Object a(unb1 unb1Var, tv80 tv80Var, onm onmVar) {
        dwf1 dwf1Var;
        jmb1 jmb1Var;
        tv80 tv80Var2;
        Object objH;
        String str;
        jmb1 jmb1Var2;
        s4b1 s4b1Var;
        tv80 tv80Var3;
        ttt0 ttt0Var;
        ttt0 ttt0Var2;
        q8n q8nVar;
        ou80 ou80Var;
        SkipToTrack skipToTrackFromUri;
        String str2;
        LoggingParams loggingParamsBuild;
        boolean zC0;
        ynb0 ynb0Var;
        PlayCommand playCommandBuild;
        y6r0 y6r0Var;
        kwb1 kwb1Var;
        ku91 ku91Var;
        if (onmVar instanceof dwf1) {
            dwf1Var = (dwf1) onmVar;
            int i = dwf1Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                dwf1Var.g = i - Integer.MIN_VALUE;
            } else {
                dwf1Var = new dwf1(this, onmVar);
            }
        } else {
            dwf1Var = new dwf1(this, onmVar);
        }
        dwf1 dwf1Var2 = dwf1Var;
        Object obj = dwf1Var2.e;
        int i2 = dwf1Var2.g;
        rih1 rih1Var = rih1.a;
        String str3 = null;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            jmb1Var = unb1Var instanceof jmb1 ? (jmb1) unb1Var : null;
            if (jmb1Var != null) {
                tv80Var2 = tv80Var;
                dwf1Var2.a = tv80Var2;
                dwf1Var2.b = jmb1Var;
                dwf1Var2.g = 1;
                objH = c921.H(b3s.c, new b0f1(this, (lnm) null, (byte) 4), dwf1Var2);
                if (objH != d9nVar) {
                }
                return d9nVar;
            }
            return rih1Var;
        }
        if (i2 == 1) {
            jmb1Var = dwf1Var2.b;
            tv80 tv80Var4 = dwf1Var2.a;
            hm5.M(obj);
            objH = obj;
            tv80Var2 = tv80Var4;
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    hm5.M(obj);
                    return rih1Var;
                }
                if (i2 == 4) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            s4b1Var = dwf1Var2.d;
            str = dwf1Var2.c;
            jmb1Var2 = dwf1Var2.b;
            tv80Var3 = dwf1Var2.a;
            hm5.M(obj);
        }
        ttt0Var = (ttt0) obj;
        ttt0Var2 = ttt0.c;
        q8nVar = this.f;
        if (ttt0Var == ttt0Var2) {
            ku91Var = new ku91(this, str, jmb1Var2, (lnm) null, (byte) 17);
            dwf1Var2.a = null;
            dwf1Var2.b = null;
            dwf1Var2.c = null;
            dwf1Var2.d = null;
            dwf1Var2.g = 3;
            if (c921.H(q8nVar, ku91Var, dwf1Var2) == d9nVar) {
                return d9nVar;
            }
            return rih1Var;
        }
        if (ttt0Var != ttt0.a) {
            kwb1Var = new kwb1(this, str, (lnm) null, (byte) 15);
            dwf1Var2.a = null;
            dwf1Var2.b = null;
            dwf1Var2.c = null;
            dwf1Var2.d = null;
            dwf1Var2.g = 4;
            if (c921.H(q8nVar, kwb1Var, dwf1Var2) == d9nVar) {
                return d9nVar;
            }
            return rih1Var;
        }
        if (tv80Var3 != null) {
            ou80Var = tv80Var3.a;
        } else {
            ou80Var = null;
        }
        skipToTrackFromUri = SkipToTrack.fromUri(str);
        LoggingParams.Builder builder = LoggingParams.builder();
        if (ou80Var != null || (str2 = ou80Var.a) == null) {
            str2 = "";
        }
        LoggingParams.Builder builderInteractionId = builder.interactionId(str2);
        if (tv80Var3 != null && (y6r0Var = tv80Var3.b) != null) {
            str3 = y6r0Var.a;
        }
        loggingParamsBuild = builderInteractionId.pageInstanceId(str3 != null ? str3 : "").build();
        zC0 = this.d.c0();
        ynb0Var = this.b;
        if (zC0) {
            playCommandBuild = PlayCommand.Builder.builder().context(Context.fromUri(jmb1Var2.a.b)).options(PreparePlayOptions.builder().skipTo(skipToTrackFromUri).build()).playOrigin((PlayOrigin) ynb0Var.get()).loggingParams(loggingParamsBuild).build();
        } else {
            String strConcat = "spotify:station:track:".concat(s4b1Var.h());
            playCommandBuild = PlayCommand.Builder.builder().context(Context.builder(strConcat).url("hm://darwin-experiments/play-context/radio/track/" + str).build()).options(PreparePlayOptions.builder().alwaysPlaySomething(true).skipTo(skipToTrackFromUri).build()).playOrigin((PlayOrigin) ynb0Var.get()).loggingParams(loggingParamsBuild).build();
        }
        CompletableOnErrorComplete completableOnErrorCompleteO = ((muz) this.a.get()).a(playCommandBuild).ignoreElement().h(iqa1.V0).o(Functions.h);
        Action action = Functions.c;
        Consumer consumer = Functions.e;
        Objects.requireNonNull(action, "onComplete is null");
        Objects.requireNonNull(consumer, "onError is null");
        BlockingMultiObserver blockingMultiObserver = new BlockingMultiObserver();
        completableOnErrorCompleteO.subscribe(blockingMultiObserver);
        blockingMultiObserver.a(Functions.d, consumer, action);
        return rih1Var;
        if (!((Boolean) objH).booleanValue()) {
            str = jmb1Var.a.a;
            Set set = s4b1.f;
            s4b1 s4b1VarX = uic.x(str);
            if (s4b1VarX.c != blc0.TRACK) {
                Logger.d(l1d.m("Unexpected uri in track row: ", str), new Object[0]);
                return rih1Var;
            }
            dwf1Var2.a = tv80Var2;
            dwf1Var2.b = jmb1Var;
            dwf1Var2.c = str;
            dwf1Var2.d = s4b1VarX;
            dwf1Var2.g = 2;
            Enum enumD = d(str, dwf1Var2);
            if (enumD != d9nVar) {
                jmb1Var2 = jmb1Var;
                s4b1Var = s4b1VarX;
                tv80Var3 = tv80Var2;
                obj = enumD;
                ttt0Var = (ttt0) obj;
                ttt0Var2 = ttt0.c;
                q8nVar = this.f;
                if (ttt0Var == ttt0Var2) {
                    ku91Var = new ku91(this, str, jmb1Var2, (lnm) null, (byte) 17);
                    dwf1Var2.a = null;
                    dwf1Var2.b = null;
                    dwf1Var2.c = null;
                    dwf1Var2.d = null;
                    dwf1Var2.g = 3;
                    if (c921.H(q8nVar, ku91Var, dwf1Var2) == d9nVar) {
                    }
                } else {
                    if (ttt0Var != ttt0.a) {
                        if (tv80Var3 != null) {
                            ou80Var = tv80Var3.a;
                        } else {
                            ou80Var = null;
                        }
                        skipToTrackFromUri = SkipToTrack.fromUri(str);
                        LoggingParams.Builder builder2 = LoggingParams.builder();
                        if (ou80Var != null) {
                            str2 = "";
                        } else {
                            str2 = "";
                        }
                        LoggingParams.Builder builderInteractionId2 = builder2.interactionId(str2);
                        if (tv80Var3 != null) {
                            str3 = y6r0Var.a;
                        }
                        loggingParamsBuild = builderInteractionId2.pageInstanceId(str3 != null ? str3 : "").build();
                        zC0 = this.d.c0();
                        ynb0Var = this.b;
                        if (zC0) {
                            playCommandBuild = PlayCommand.Builder.builder().context(Context.fromUri(jmb1Var2.a.b)).options(PreparePlayOptions.builder().skipTo(skipToTrackFromUri).build()).playOrigin((PlayOrigin) ynb0Var.get()).loggingParams(loggingParamsBuild).build();
                        } else {
                            String strConcat2 = "spotify:station:track:".concat(s4b1Var.h());
                            playCommandBuild = PlayCommand.Builder.builder().context(Context.builder(strConcat2).url("hm://darwin-experiments/play-context/radio/track/" + str).build()).options(PreparePlayOptions.builder().alwaysPlaySomething(true).skipTo(skipToTrackFromUri).build()).playOrigin((PlayOrigin) ynb0Var.get()).loggingParams(loggingParamsBuild).build();
                        }
                        CompletableOnErrorComplete completableOnErrorCompleteO2 = ((muz) this.a.get()).a(playCommandBuild).ignoreElement().h(iqa1.V0).o(Functions.h);
                        Action action2 = Functions.c;
                        Consumer consumer2 = Functions.e;
                        Objects.requireNonNull(action2, "onComplete is null");
                        Objects.requireNonNull(consumer2, "onError is null");
                        BlockingMultiObserver blockingMultiObserver2 = new BlockingMultiObserver();
                        completableOnErrorCompleteO2.subscribe(blockingMultiObserver2);
                        blockingMultiObserver2.a(Functions.d, consumer2, action2);
                        return rih1Var;
                    }
                    kwb1Var = new kwb1(this, str, (lnm) null, (byte) 15);
                    dwf1Var2.a = null;
                    dwf1Var2.b = null;
                    dwf1Var2.c = null;
                    dwf1Var2.d = null;
                    dwf1Var2.g = 4;
                    if (c921.H(q8nVar, kwb1Var, dwf1Var2) == d9nVar) {
                    }
                }
            }
            return d9nVar;
        }
        return rih1Var;
    }

    public final s9d1 b() {
        return null;
    }

    public final Object c(unb1 unb1Var, tv80 tv80Var, onm onmVar) {
        if ((unb1Var instanceof jmb1) && tv80Var != null) {
            Object objH = c921.H(this.f, new ku91(this, unb1Var, tv80Var, (lnm) null, (byte) 18), onmVar);
            if (objH == d9n.a) {
                return objH;
            }
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum d(String str, onm onmVar) {
        awf1 awf1Var;
        if (onmVar instanceof awf1) {
            awf1Var = (awf1) onmVar;
            int i = awf1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                awf1Var.c = i - Integer.MIN_VALUE;
            } else {
                awf1Var = new awf1(this, onmVar);
            }
        } else {
            awf1Var = new awf1(this, onmVar);
        }
        Object objB = awf1Var.a;
        int i2 = awf1Var.c;
        if (i2 == 0) {
            hm5.M(objB);
            awf1Var.c = 1;
            objB = this.g.b(str, awf1Var);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objB);
        }
        Object value = ((zob1) objB).getValue();
        vtt0 vtt0Var = value instanceof vtt0 ? (vtt0) value : null;
        if (vtt0Var != null) {
            return vtt0Var.a;
        }
        return null;
    }
}
