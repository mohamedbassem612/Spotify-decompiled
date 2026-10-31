package p;

import com.spotify.base.java.logging.Logger;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class byl1 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f2g1 b;

    public /* synthetic */ byl1(f2g1 f2g1Var, byte b) {
        this.a = b;
        this.b = f2g1Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    public final Object b(Set set, lnm lnmVar) {
        ayl1 ayl1Var;
        fyl1 fyl1Var;
        byte b = this.a;
        f2g1 f2g1Var = this.b;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof ayl1) {
                    ayl1Var = (ayl1) lnmVar;
                    int i = ayl1Var.c;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        ayl1Var.c = i - Integer.MIN_VALUE;
                    } else {
                        ayl1Var = new ayl1(this, lnmVar);
                    }
                } else {
                    ayl1Var = new ayl1(this, lnmVar);
                }
                Object obj = ayl1Var.a;
                int i2 = ayl1Var.c;
                try {
                    if (i2 == 0) {
                        hm5.M(obj);
                        ayl1Var.c = 1;
                        Object objD = f2g1Var.d("/workout_coaching", "com.spotify.wear.coaching.disabled.uris", set, ayl1Var);
                        if (objD != d9nVar) {
                            objD = rih1Var;
                        }
                        if (objD == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (i2 != 1) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    break;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    Logger.e(th, "Failed to publish coaching preferences to watch", new Object[0]);
                }
                return rih1Var;
            default:
                if (lnmVar instanceof fyl1) {
                    fyl1Var = (fyl1) lnmVar;
                    int i3 = fyl1Var.c;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        fyl1Var.c = i3 - Integer.MIN_VALUE;
                    } else {
                        fyl1Var = new fyl1(this, lnmVar);
                    }
                } else {
                    fyl1Var = new fyl1(this, lnmVar);
                }
                Object obj2 = fyl1Var.a;
                int i4 = fyl1Var.c;
                try {
                    if (i4 == 0) {
                        hm5.M(obj2);
                        fyl1Var.c = 1;
                        Object objD2 = f2g1Var.d("/workout_mode", "com.spotify.wear.workout.disabled.uris", set, fyl1Var);
                        if (objD2 != d9nVar) {
                            objD2 = rih1Var;
                        }
                        if (objD2 == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (i4 != 1) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj2);
                    }
                    break;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th2) {
                    Logger.e(th2, "Failed to publish workout preferences to watch", new Object[0]);
                }
                return rih1Var;
        }
    }

    public final /* bridge */ /* synthetic */ Object emit(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                break;
        }
        return b((Set) obj, lnmVar);
    }
}
