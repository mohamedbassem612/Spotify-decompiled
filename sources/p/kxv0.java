package p;

import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.options.CommandOptions;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kxv0 implements iu30 {
    public final c3s a;
    public final ruz b;
    public final Flowable c;

    public kxv0(c3s c3sVar, ruz ruzVar, Flowable flowable) {
        this.a = c3sVar;
        this.b = ruzVar;
        this.c = flowable;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(lnm lnmVar) {
        jxv0 jxv0Var;
        int i;
        int i2;
        boolean z;
        if (lnmVar instanceof jxv0) {
            jxv0Var = (jxv0) lnmVar;
            int i3 = jxv0Var.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jxv0Var.d = i3 - Integer.MIN_VALUE;
            } else {
                jxv0Var = new jxv0(this, lnmVar);
            }
        } else {
            jxv0Var = new jxv0(this, lnmVar);
        }
        Object objI = jxv0Var.b;
        int i4 = jxv0Var.d;
        d9n d9nVar = d9n.a;
        try {
            if (i4 == 0) {
                hm5.M(objI);
                if (!this.a.c()) {
                    return new k2h0(false, false);
                }
                Flowable flowable = this.c;
                vbm[] vbmVarArr = q601.a;
                kge kgeVar = new kge(flowable);
                jxv0Var.d = 1;
                objI = b5p1.i(kgeVar, jxv0Var);
                if (objI == d9nVar) {
                }
                return d9nVar;
            }
            if (i4 == 1) {
                hm5.M(objI);
            } else {
                if (i4 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = jxv0Var.a;
                hm5.M(objI);
            }
            i = i2;
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            return new k2h0(z, true);
            PlayerState playerState = (PlayerState) objI;
            i = (!playerState.isPlaying() || playerState.isPaused()) ? 0 : 1;
            if (i != 0) {
                Completable completableIgnoreElement = this.b.a(new e9u0(PauseCommand.builder().options(CommandOptions.builder().systemInitiated(true).overrideRestrictions(true).build()).build())).ignoreElement();
                jxv0Var.a = i;
                jxv0Var.d = 2;
                if (fc11.i(completableIgnoreElement, jxv0Var) != d9nVar) {
                    i2 = i;
                    i = i2;
                }
                return d9nVar;
            }
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            return new k2h0(z, true);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            n57.t("Failed to pause context player for TTS", e2);
            return new k2h0(false, false);
        }
    }
}
