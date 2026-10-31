package p;

import io.reactivex.rxjava3.core.Scheduler;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vn41 {
    public final Scheduler a;
    public Object c;
    public final Object b = new Object();
    public final LinkedHashSet d = new LinkedHashSet();

    public vn41(xm41 xm41Var, Scheduler scheduler) {
        this.a = scheduler;
        sam0 sam0Var = (sam0) xm41Var;
        sam0Var.e(new g521(this, (byte) 24), new mn41((Object) this, (byte) 1));
    }

    public final m021 a() {
        Object obj;
        synchronized (this.b) {
            obj = this.c;
        }
        if (obj == null) {
            return null;
        }
        return new m021(this, obj, (byte) 19);
    }

    public final nt21 b(Function0 function0) {
        Object obj;
        un41 un41Var = new un41(function0);
        synchronized (this.b) {
            this.d.add(un41Var);
            obj = this.c;
        }
        if (obj != null) {
            this.a.c(new sl21(this, un41Var, obj, (byte) 4));
        }
        return new nt21(un41Var, this, (byte) 12);
    }
}
