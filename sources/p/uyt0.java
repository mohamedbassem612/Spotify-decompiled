package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uyt0 implements vu30 {
    public final xrc0 a;
    public final yqg b;
    public final q7r0 c;
    public final b7r0 d;
    public final Flowable e;
    public final a2n f;
    public final idd1 g = new idd1(new kks0(this, (byte) 17));

    public uyt0(xrc0 xrc0Var, yqg yqgVar, q7r0 q7r0Var, b7r0 b7r0Var, Flowable flowable, a2n a2nVar) {
        this.a = xrc0Var;
        this.b = yqgVar;
        this.c = q7r0Var;
        this.d = b7r0Var;
        this.e = flowable;
        this.f = a2nVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0232, code lost:
    
        if (p.xrc0.b(r22.a, r5, (p.trc0) null, r6, r8, r9, r10, r11, (p.ayc0) null, r13, 130) == r15) goto L82;
     */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(p.xzg0 r23, p.lnm r24) {
        /*
            Method dump skipped, instruction units count: 572
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.uyt0.invoke(p.xzg0, p.lnm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(onm onmVar) {
        syt0 syt0Var;
        spq0 spq0VarTrack;
        ContextTrack contextTrack;
        if (onmVar instanceof syt0) {
            syt0Var = (syt0) onmVar;
            int i = syt0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                syt0Var.c = i - Integer.MIN_VALUE;
            } else {
                syt0Var = new syt0(this, onmVar);
            }
        } else {
            syt0Var = new syt0(this, onmVar);
        }
        Object objO = syt0Var.a;
        int i2 = syt0Var.c;
        lnm lnmVar = null;
        try {
            if (i2 == 0) {
                hm5.M(objO);
                i2p0 i2p0Var = new i2p0(this, lnmVar, (byte) 28);
                syt0Var.c = 1;
                objO = rc2.O(500L, i2p0Var, syt0Var);
                d9n d9nVar = d9n.a;
                if (objO == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objO);
            }
            PlayerState playerState = (PlayerState) objO;
            if (playerState != null && (spq0VarTrack = playerState.track()) != null && (contextTrack = (ContextTrack) spq0VarTrack.h()) != null) {
                return contextTrack.uri();
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return null;
    }
}
