package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class evt {
    public final Flowable a;
    public final ae5 b;
    public final fut c;
    public final gz4 d;
    public final yqg e;
    public long f;

    public evt(Flowable flowable, ae5 ae5Var, fut futVar, gz4 gz4Var, yqg yqgVar) {
        this.a = flowable;
        this.b = ae5Var;
        this.c = futVar;
        this.d = gz4Var;
        this.e = yqgVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(aza azaVar, Set set, onm onmVar) {
        dvt dvtVar;
        re9 re9Var;
        String strA;
        if (onmVar instanceof dvt) {
            dvtVar = (dvt) onmVar;
            int i = dvtVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                dvtVar.e = i - Integer.MIN_VALUE;
            } else {
                dvtVar = new dvt(this, onmVar);
            }
        } else {
            dvtVar = new dvt(this, onmVar);
        }
        Object objX = dvtVar.c;
        int i2 = dvtVar.e;
        try {
            if (i2 == 0) {
                hm5.M(objX);
                Flowable flowable = this.a;
                dvtVar.a = azaVar;
                dvtVar.b = set;
                dvtVar.e = 1;
                objX = lyg.x(flowable, dvtVar);
                d9n d9nVar = d9n.a;
                if (objX == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                set = dvtVar.b;
                azaVar = dvtVar.a;
                hm5.M(objX);
            }
            Set set2 = set;
            PlayerState playerState = (PlayerState) objX;
            this.b.b(azaVar.a().a(), azaVar.a().c(), set2, lyg.p(playerState), lyg.n(playerState), lyg.o(playerState));
            if (b(azaVar, set2)) {
                fut futVar = this.c;
                String strA2 = azaVar.a().a();
                de9 de9VarA = gut.a();
                byte[] bArr = {1};
                nya nyaVar = (nya) ((Map) futVar.h.getValue()).get(strA2);
                if (nyaVar != null && (re9Var = nyaVar.a) != null && (strA = re9Var.a()) != null) {
                    futVar.c.a.accept(new tj9(strA, de9VarA, bArr));
                }
                this.f = this.e.b();
            }
        } catch (Exception e) {
            Logger.e(e, "DevicePredictability: proximity logging failed", new Object[0]);
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final boolean b(aza azaVar, Set set) throws NoWhenBranchMatchedException {
        Object next;
        Set setSingleton;
        gz4 gz4Var = this.d;
        if (gz4Var.f()) {
            fz4 fz4VarH = gz4Var.h();
            t0z t0zVar = di9.f;
            Iterator it = t0zVar.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!u890.j(((di9) next).name(), fz4VarH.name()));
            di9 di9Var = (di9) next;
            if (di9Var != null) {
                int iOrdinal = di9Var.ordinal();
                di9 di9Var2 = di9.a;
                if (iOrdinal == 0) {
                    setSingleton = Collections.singleton(di9Var2);
                } else if (iOrdinal == 1) {
                    setSingleton = dm61.z0(new di9[]{di9.b, di9Var2});
                } else {
                    if (iOrdinal != 2 && iOrdinal != 3) {
                        eg.o();
                        return false;
                    }
                    setSingleton = o7h.p1(t0zVar);
                }
                Set set2 = set;
                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                    Iterator it2 = set2.iterator();
                    while (it2.hasNext()) {
                        if (setSingleton.contains((di9) it2.next())) {
                            if (azaVar.a().b().contains(gut.a()) && this.e.b() - this.f >= gz4Var.g()) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
