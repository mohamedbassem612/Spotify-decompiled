package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hg5 implements fg5 {
    public final /* synthetic */ byte a;
    public final Object b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hg5(fg5[] fg5VarArr) {
        this(f46.Q0(fg5VarArr), (byte) 1);
        this.a = (byte) 1;
    }

    @Override // p.fg5
    public final pf5 F(kf30 kf30Var) {
        byte b = this.a;
        Object obj = null;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                for (Object obj3 : this) {
                    if (u890.j(((pf5) obj3).b(), kf30Var)) {
                        obj = obj3;
                        return (pf5) obj;
                    }
                }
                return (pf5) obj;
            case 1:
                return (pf5) z561.W(z561.f0(new p1k(kf30Var, (byte) 0), new i46((List) obj2, (byte) 1)));
            default:
                if (kf30Var.equals((kf30) obj2)) {
                    return day.a;
                }
                return null;
        }
    }

    @Override // p.fg5
    public final boolean d0(kf30 kf30Var) {
        switch (this.a) {
            case 0:
                return F(kf30Var) != null;
            case 1:
                Iterator it = ((List) this.b).iterator();
                while (it.hasNext()) {
                    if (((fg5) it.next()).d0(kf30Var)) {
                        return true;
                    }
                }
                return false;
            default:
                return F(kf30Var) != null;
        }
    }

    @Override // p.fg5
    public final boolean isEmpty() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((List) obj).isEmpty();
            case 1:
                List list = (List) obj;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (!((fg5) it.next()).isEmpty()) {
                            return false;
                        }
                    }
                }
                return true;
            default:
                return false;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((List) obj).iterator();
            case 1:
                return new ep20(z561.X(ye3.U0, new i46((List) obj, (byte) 1)));
            default:
                return y6x.a;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return ((List) this.b).toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ hg5(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
