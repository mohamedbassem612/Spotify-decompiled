package p;

import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.functions.Function;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class chh0 implements Function {
    public final /* synthetic */ s24 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ m210 d;
    public final /* synthetic */ a710 e;
    public final /* synthetic */ xp91 f;

    public chh0(s24 s24Var, int i, long j, m210 m210Var, a710 a710Var, xp91 xp91Var) {
        this.a = s24Var;
        this.b = i;
        this.c = j;
        this.d = m210Var;
        this.e = a710Var;
        this.f = xp91Var;
    }

    public final Object apply(Object obj) {
        g710 g710Var;
        Object next;
        sq51 sq51Var;
        sq51 sq51Var2;
        Object next2;
        s24 s24Var = this.a;
        yqg yqgVar = (yqg) s24Var.X;
        g510 g510Var = (g510) s24Var.c;
        Long l = (Long) ((PlayerState) obj).position(yqgVar.b()).h();
        long jLongValue = l != null ? l.longValue() : 0L;
        im51 im51Var = (im51) s24Var.h;
        int i = this.b;
        hm51 hm51VarA = im51Var.a(i, jLongValue);
        boolean z = hm51VarA instanceof em51;
        m210 m210Var = this.d;
        long j = this.c;
        if (z) {
            return s24Var.X(j, m210Var);
        }
        boolean z2 = hm51VarA instanceof gm51;
        g710 g710Var2 = this.e;
        if (z2) {
            Completable completableIgnoreElement = g510Var.k(j, m210Var).ignoreElement();
            long j2 = ((gm51) hm51VarA).a;
            g710 g710Var3 = g710Var2;
            g710Var3.getClass();
            return completableIgnoreElement.c(g710Var3.k.a(new i9u0(j2)).doOnSuccess(new b710(g710Var3, (byte) 2)).ignoreElement());
        }
        if (!(hm51VarA instanceof fm51)) {
            eg.o();
            return null;
        }
        xp91 xp91Var = this.f;
        if (i == 1) {
            Iterator it = ((wp91) xp91Var).a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    sq51Var2 = null;
                    next2 = null;
                    break;
                }
                next2 = it.next();
                lvy lvyVar = (lvy) next2;
                long j3 = lvyVar.b.a;
                long j4 = lvyVar.c.a;
                sq51Var2 = null;
                long j5 = ((fm51) hm51VarA).a;
                if (j3 <= j5 && j5 <= j4) {
                    break;
                }
            }
            lvy lvyVar2 = (lvy) next2;
            sq51Var = lvyVar2 != null ? lvyVar2.c : sq51Var2;
            g710Var = g710Var2;
        } else {
            Iterator it2 = ((wp91) xp91Var).a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    g710Var = g710Var2;
                    next = null;
                    break;
                }
                next = it2.next();
                lvy lvyVar3 = (lvy) next;
                long j6 = lvyVar3.b.a;
                long j7 = lvyVar3.c.a;
                g710Var = g710Var2;
                long j8 = ((fm51) hm51VarA).a;
                if (j6 <= j8 && j8 <= j7) {
                    break;
                }
                g710Var2 = g710Var;
            }
            lvy lvyVar4 = (lvy) next;
            sq51Var = lvyVar4 != null ? lvyVar4.b : null;
        }
        if (sq51Var == null) {
            return s24Var.X(j, m210Var);
        }
        Completable completableIgnoreElement2 = g510Var.k(j, m210Var).ignoreElement();
        long j9 = sq51Var.a;
        g710 g710Var4 = g710Var;
        g710Var4.getClass();
        return completableIgnoreElement2.c(g710Var4.k.a(new i9u0(j9)).doOnSuccess(new b710(g710Var4, (byte) 2)).ignoreElement());
    }
}
