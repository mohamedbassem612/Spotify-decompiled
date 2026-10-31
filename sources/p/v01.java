package p;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v01 extends b611 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ v01(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public void a() {
        switch (this.a) {
            case 0:
                ((v3v0) this.c).invoke(Integer.valueOf(((an) this.b).e()));
                break;
            case 1:
                h();
                break;
        }
    }

    public void b(int i, int i2) {
        switch (this.a) {
            case 1:
                h();
                break;
        }
    }

    public void c(int i, int i2, Object obj) {
        switch (this.a) {
            case 1:
                h();
                break;
            default:
                super.c(i, i2, obj);
                break;
        }
    }

    public final void d(int i, int i2) {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ((v3v0) obj2).invoke(Integer.valueOf(((an) obj).e()));
                break;
            case 1:
                h();
                break;
            default:
                RecyclerView recyclerView = (RecyclerView) obj2;
                cej1 cej1Var = (cej1) obj;
                if (i2 > 0) {
                    if (!cej1Var.t && (recyclerView.getChildCount() == 0 || recyclerView.getLayoutParams().height != -2)) {
                        cej1Var.t = true;
                        recyclerView.post(new mqh1(cej1Var, recyclerView, (byte) 2));
                    }
                    if (!cej1Var.X) {
                        cej1Var.X = true;
                        recyclerView.post(new jyh0(cej1Var, recyclerView, (byte) 29));
                        break;
                    }
                }
                break;
        }
    }

    public void e(int i, int i2) {
        switch (this.a) {
            case 1:
                h();
                break;
        }
    }

    public void f(int i, int i2) {
        switch (this.a) {
            case 0:
                ((v3v0) this.c).invoke(Integer.valueOf(((an) this.b).e()));
                break;
            case 1:
                h();
                break;
        }
    }

    public void h() {
        err0 err0Var = (hdn0) this.c;
        Iterator it = ((List) this.b).iterator();
        int iE = 0;
        while (it.hasNext()) {
            iE += ((z511) it.next()).e();
        }
        err0Var.t(iE);
    }
}
