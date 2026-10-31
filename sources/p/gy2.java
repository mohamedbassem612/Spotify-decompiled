package p;

import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gy2 {
    public final Flowable a;
    public final Single b;
    public final yqg c;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final AtomicBoolean e = new AtomicBoolean(false);
    public volatile PlayerState f;

    public gy2(Flowable flowable, Single single, yqg yqgVar) {
        this.a = flowable;
        this.b = single;
        this.c = yqgVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        by2 by2Var;
        PlayerState playerState;
        if (onmVar instanceof by2) {
            by2Var = (by2) onmVar;
            int i = by2Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                by2Var.d = i - Integer.MIN_VALUE;
            } else {
                by2Var = new by2(this, onmVar);
            }
        } else {
            by2Var = new by2(this, onmVar);
        }
        Object obj = by2Var.b;
        d9n d9nVar = d9n.a;
        int i2 = by2Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            PlayerState playerState2 = this.f;
            if (playerState2 != null) {
                if (!hzg0.a().contains(playerState2.playOrigin().featureIdentifier())) {
                    return yx2.a;
                }
                if (playerState2.isPlaying() && !playerState2.isPaused()) {
                    return yx2.b;
                }
                by2Var.a = playerState2;
                by2Var.d = 1;
                Object objC = c(by2Var);
                if (objC == d9nVar) {
                    return d9nVar;
                }
                obj = objC;
                playerState = playerState2;
            }
            return null;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        playerState = by2Var.a;
        hm5.M(obj);
        long jLongValue = ((Number) obj).longValue();
        if (jLongValue > 0) {
            return new zx2(jLongValue);
        }
        long jTimestamp = playerState.timestamp();
        if (jTimestamp > 0) {
            return new zx2(jTimestamp);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        cy2 cy2Var;
        if (onmVar instanceof cy2) {
            cy2Var = (cy2) onmVar;
            int i = cy2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cy2Var.c = i - Integer.MIN_VALUE;
            } else {
                cy2Var = new cy2(this, onmVar);
            }
        } else {
            cy2Var = new cy2(this, onmVar);
        }
        Object objJ = cy2Var.a;
        int i2 = cy2Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            cy2Var.c = 1;
            objJ = fc11.j(this.b, cy2Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        hma1 hma1VarEdit = ((dma1) objJ).edit();
        hma1VarEdit.f(hy2.a());
        hma1VarEdit.g();
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(onm onmVar) {
        dy2 dy2Var;
        if (onmVar instanceof dy2) {
            dy2Var = (dy2) onmVar;
            int i = dy2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dy2Var.c = i - Integer.MIN_VALUE;
            } else {
                dy2Var = new dy2(this, onmVar);
            }
        } else {
            dy2Var = new dy2(this, onmVar);
        }
        Object objJ = dy2Var.a;
        int i2 = dy2Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            dy2Var.c = 1;
            objJ = fc11.j(this.b, dy2Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        return yah0.q(((dma1) objJ).g(hy2.a(), 0L));
    }

    public final Boolean d(String str) {
        if (ihc1.y0(str)) {
            return yah0.m(false);
        }
        PlayerState playerState = this.f;
        if (playerState == null) {
            return yah0.m(false);
        }
        if (!hzg0.a().contains(playerState.playOrigin().featureIdentifier())) {
            return yah0.m(false);
        }
        String str2 = (String) playerState.contextMetadata().get("martini_conversation_id");
        if (str2 == null || ihc1.y0(str2)) {
            str2 = null;
        }
        return yah0.m(u890.j(str2, str));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(long j, onm onmVar) {
        ey2 ey2Var;
        if (onmVar instanceof ey2) {
            ey2Var = (ey2) onmVar;
            int i = ey2Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ey2Var.d = i - Integer.MIN_VALUE;
            } else {
                ey2Var = new ey2(this, onmVar);
            }
        } else {
            ey2Var = new ey2(this, onmVar);
        }
        Object objJ = ey2Var.b;
        int i2 = ey2Var.d;
        if (i2 == 0) {
            hm5.M(objJ);
            ey2Var.a = j;
            ey2Var.d = 1;
            objJ = fc11.j(this.b, ey2Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = ey2Var.a;
            hm5.M(objJ);
        }
        hma1 hma1VarEdit = ((dma1) objJ).edit();
        hma1VarEdit.c(hy2.a(), j);
        hma1VarEdit.g();
        return rih1.a;
    }

    public final void f(c9n c9nVar) {
        if (this.d.compareAndSet(false, true)) {
            c921.y(c9nVar, (o8n) null, 0, new qm(this, (lnm) null, (byte) 21), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00d5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x00d6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(PlayerState playerState, onm onmVar) {
        fy2 fy2Var;
        boolean zContains;
        int i;
        boolean andSet;
        int i2;
        boolean z;
        boolean z2;
        long jB;
        if (onmVar instanceof fy2) {
            fy2Var = (fy2) onmVar;
            int i3 = fy2Var.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fy2Var.f = i3 - Integer.MIN_VALUE;
            } else {
                fy2Var = new fy2(this, onmVar);
            }
        } else {
            fy2Var = new fy2(this, onmVar);
        }
        Object obj = fy2Var.d;
        int i4 = fy2Var.f;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i4 == 0) {
            hm5.M(obj);
            zContains = hzg0.a().contains(playerState.playOrigin().featureIdentifier());
            i = (zContains && playerState.isPlaying() && !playerState.isPaused()) ? 1 : 0;
            AtomicBoolean atomicBoolean = this.e;
            if (i != 0) {
                atomicBoolean.set(true);
                fy2Var.a = zContains;
                fy2Var.c = i;
                fy2Var.f = 1;
                if (b(fy2Var) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            }
            andSet = atomicBoolean.getAndSet(false);
            if (!zContains) {
                fy2Var.a = zContains;
                fy2Var.c = i;
                fy2Var.b = andSet;
                fy2Var.f = 2;
                if (b(fy2Var) != d9nVar) {
                    return rih1Var;
                }
            } else if (andSet) {
                jB = this.c.b();
                fy2Var.a = zContains;
                fy2Var.c = i;
                fy2Var.b = andSet;
                fy2Var.f = 4;
                if (e(jB, fy2Var) != d9nVar) {
                    return rih1Var;
                }
            } else {
                fy2Var.a = zContains;
                fy2Var.c = i;
                fy2Var.b = andSet;
                fy2Var.f = 3;
                Object objC = c(fy2Var);
                if (objC != d9nVar) {
                    i2 = i;
                    z = andSet;
                    z2 = zContains;
                    obj = objC;
                }
            }
            return d9nVar;
        }
        if (i4 == 1) {
            hm5.M(obj);
            return rih1Var;
        }
        if (i4 == 2) {
            hm5.M(obj);
            return rih1Var;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z = fy2Var.b;
        i2 = fy2Var.c;
        z2 = fy2Var.a;
        hm5.M(obj);
        if (((Number) obj).longValue() <= 0) {
            int i5 = i2;
            andSet = z;
            i = i5;
            zContains = z2;
            jB = this.c.b();
            fy2Var.a = zContains;
            fy2Var.c = i;
            fy2Var.b = andSet;
            fy2Var.f = 4;
            if (e(jB, fy2Var) != d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
    }
}
