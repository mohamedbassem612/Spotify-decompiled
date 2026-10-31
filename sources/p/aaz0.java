package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.internal.operators.completable.CompletableObserveOn;
import java.util.Collections;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class aaz0 implements mk90 {
    public final qv80 a;
    public final aas b;
    public final b7r0 c;

    public aaz0(qv80 qv80Var, aas aasVar, b7r0 b7r0Var) {
        this.a = qv80Var;
        this.b = aasVar;
        this.c = b7r0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object d(int i, zuc0 zuc0Var, onm onmVar) {
        z9z0 z9z0Var;
        if (onmVar instanceof z9z0) {
            z9z0Var = (z9z0) onmVar;
            int i2 = z9z0Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z9z0Var.c = i2 - Integer.MIN_VALUE;
            } else {
                z9z0Var = new z9z0(this, onmVar);
            }
        } else {
            z9z0Var = new z9z0(this, onmVar);
        }
        Object obj = z9z0Var.a;
        int i3 = z9z0Var.c;
        try {
            if (i3 == 0) {
                hm5.M(obj);
                String str = zuc0Var.c;
                qv80 qv80Var = this.a;
                i8h1 i8h1Var = qv80Var.a;
                r6h1 r6h1Var = qv80Var.b;
                Integer numValueOf = Integer.valueOf(i);
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-playlist-entity-item-list-item";
                x6h1VarI.f = "3.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.c = numValueOf;
                x6h1VarI.d = str;
                ou80 ou80Var = i8h1Var.m(new w7h1("", "", new z7h1("swipe", 1, b7x.a), new x7h1("add_item_to_queue", 1, Collections.singletonMap("item_to_add_to_queue", str)), x6h1VarI.a(), r6h1Var, System.currentTimeMillis()), (xj61) null).a;
                aas aasVar = this.b;
                String str2 = zuc0Var.c;
                y6r0 y6r0Var = this.c.get();
                String str3 = y6r0Var != null ? y6r0Var.a : null;
                if (str3 == null) {
                    str3 = "";
                }
                CompletableObserveOn completableObserveOnB = aasVar.b(str2, str3, 2, ou80Var.a);
                z9z0Var.c = 1;
                Object objI = fc11.i(completableObserveOnB, z9z0Var);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i3 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, "QueueInteractionImpl failed to swap.", new Object[0]);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum t(ak90 ak90Var, lnm lnmVar) {
        y9z0 y9z0Var;
        if (lnmVar instanceof y9z0) {
            y9z0Var = (y9z0) lnmVar;
            int i = y9z0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                y9z0Var.c = i - Integer.MIN_VALUE;
            } else {
                y9z0Var = new y9z0(this, (onm) lnmVar);
            }
        } else {
            y9z0Var = new y9z0(this, (onm) lnmVar);
        }
        Object obj = y9z0Var.a;
        int i2 = y9z0Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            if (!(ak90Var instanceof tj90)) {
                return lk90.a;
            }
            tj90 tj90Var = (tj90) ak90Var;
            int i3 = tj90Var.a;
            zuc0 zuc0Var = tj90Var.b;
            y9z0Var.c = 1;
            Object objD = d(i3, zuc0Var, y9z0Var);
            d9n d9nVar = d9n.a;
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
        return lk90.b;
    }
}
