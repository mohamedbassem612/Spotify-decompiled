package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeOnErrorReturn;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rxh0 implements nxh0 {
    public final Set a;
    public final txh0 b;
    public final e6u0 c;

    public rxh0(txh0 txh0Var, t380 t380Var, e6u0 e6u0Var) {
        this.b = txh0Var;
        this.a = t380Var;
        this.c = e6u0Var;
    }

    @Override // p.nxh0
    public final Single a(String str, kxh0 kxh0Var, int i) {
        e6u0 e6u0Var = this.c;
        e6u0Var.b();
        if (e6u0Var.c(str)) {
            e6u0Var.b.getValue();
        }
        sxh0 sxh0Var = this.b.c;
        Single singleA = sxh0Var != null ? sxh0Var.a(str, kxh0Var, i) : null;
        pxh0 pxh0Var = new pxh0(str, kxh0Var);
        return singleA != null ? singleA.onErrorReturn(new oxh0(this, str, pxh0Var, i, (byte) 0)) : Single.just(d(str, pxh0Var, i));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    @Override // p.nxh0
    public final Maybe b(int i, String str, String str2) {
        lxh0 lxh0VarC;
        txh0 txh0Var = this.b;
        sxh0 sxh0Var = txh0Var.c;
        if (sxh0Var != null) {
            Maybe maybeB = sxh0Var.b(i, str, str2);
            o8d0 o8d0Var = new o8d0(this, str, i, (byte) 3);
            maybeB.getClass();
            return new MaybeOnErrorReturn(maybeB, o8d0Var);
        }
        x610 x610Var = txh0Var.d;
        if (x610Var != null) {
            for (uxh0 uxh0Var : this.a) {
                if (uxh0Var != null && uxh0Var.b(str)) {
                    lxh0VarC = uxh0Var.c(x610Var, i);
                }
            }
            Logger.g("Couldn't create a callback for package %s. Binder: %s. Resolving with the default callback instead", new Object[]{str, x610Var});
            lxh0VarC = txh0Var.b;
            if (lxh0VarC == null) {
                lxh0VarC = txh0Var.a;
            }
        } else {
            Logger.g("Couldn't create a callback for package %s. Binder: %s. Resolving with the default callback instead", new Object[]{str, x610Var});
            lxh0VarC = txh0Var.b;
            if (lxh0VarC == null) {
                lxh0VarC = txh0Var.a;
            }
        }
        return Maybe.e(lxh0VarC);
    }

    @Override // p.nxh0
    public final Single c(int i, String str, String str2) {
        e6u0 e6u0Var = this.c;
        e6u0Var.b();
        if (e6u0Var.c(str) && e6u0.d.contains(str2)) {
            e6u0Var.b.getValue();
        }
        sxh0 sxh0Var = this.b.c;
        Single singleC = sxh0Var != null ? sxh0Var.c(i, str, str2) : null;
        qxh0 qxh0Var = new qxh0(str);
        return singleC != null ? singleC.onErrorReturn(new oxh0(this, str, qxh0Var, i, (byte) 0)) : Single.just(d(str, qxh0Var, i));
    }

    public final lxh0 d(String str, omv0 omv0Var, int i) {
        txh0 txh0Var = this.b;
        x610 x610Var = txh0Var.d;
        if (x610Var != null) {
            for (uxh0 uxh0Var : this.a) {
                if (omv0Var.apply(uxh0Var)) {
                    return uxh0Var.c(x610Var, i);
                }
            }
        }
        Logger.g("Couldn't create a callback for package %s. Binder: %s. Resolving with the default callback instead", new Object[]{str, x610Var});
        bkv bkvVar = txh0Var.b;
        return bkvVar == null ? txh0Var.a : bkvVar;
    }
}
