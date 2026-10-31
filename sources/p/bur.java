package p;

import com.spotify.base.java.logging.Logger;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bur {
    public final y2l a;

    public bur(y2l y2lVar) {
        this.a = y2lVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, onm onmVar) {
        ztr ztrVar;
        if (onmVar instanceof ztr) {
            ztrVar = (ztr) onmVar;
            int i = ztrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ztrVar.c = i - Integer.MIN_VALUE;
            } else {
                ztrVar = new ztr(this, onmVar);
            }
        } else {
            ztrVar = new ztr(this, onmVar);
        }
        Object obj = ztrVar.a;
        int i2 = ztrVar.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                c3l c3lVar = this.a;
                ztrVar.c = 1;
                Object objA = c3lVar.a(str, str2, ztrVar);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, "Failed to group device", new Object[0]);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, String str2, onm onmVar) {
        aur aurVar;
        if (onmVar instanceof aur) {
            aurVar = (aur) onmVar;
            int i = aurVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aurVar.c = i - Integer.MIN_VALUE;
            } else {
                aurVar = new aur(this, onmVar);
            }
        } else {
            aurVar = new aur(this, onmVar);
        }
        Object obj = aurVar.a;
        int i2 = aurVar.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                c3l c3lVar = this.a;
                aurVar.c = 1;
                Object objF = c3lVar.f(str, str2, aurVar);
                d9n d9nVar = d9n.a;
                if (objF == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, "Failed to ungroup device", new Object[0]);
        }
        return rih1.a;
    }
}
