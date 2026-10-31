package p;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zk00 extends b611 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z511 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public zk00(z511 z511Var, el00 el00Var, Map map) {
        this.a = (byte) 0;
        this.b = z511Var;
        this.c = el00Var;
        this.d = map;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                i();
                break;
            case 1:
                h();
                break;
            default:
                l811 l811Var = (l811) this.c;
                if (!l811Var.a) {
                    l811Var.a = true;
                    this.b.z(this);
                    new Handler(Looper.getMainLooper()).post(new is3((Function0) this.d, (byte) 6));
                    break;
                }
                break;
        }
    }

    public final void b(int i, int i2) {
        switch (this.a) {
            case 0:
                i();
                break;
            case 1:
                h();
                break;
            default:
                a();
                break;
        }
    }

    public void c(int i, int i2, Object obj) {
        switch (this.a) {
            case 0:
                i();
                break;
            case 1:
                h();
                break;
            default:
                super.c(i, i2, obj);
                break;
        }
    }

    public final void d(int i, int i2) {
        switch (this.a) {
            case 0:
                i();
                break;
            case 1:
                h();
                break;
            default:
                a();
                break;
        }
    }

    public final void e(int i, int i2) {
        switch (this.a) {
            case 0:
                i();
                break;
            case 1:
                h();
                break;
            default:
                a();
                break;
        }
    }

    public final void f(int i, int i2) {
        switch (this.a) {
            case 0:
                i();
                break;
            case 1:
                h();
                break;
            default:
                a();
                break;
        }
    }

    public void h() {
        iu30 iu30Var = (iu30) this.c;
        z511 z511Var = this.b;
        if (((Boolean) iu30Var.invoke(Integer.valueOf(z511Var.e()))).booleanValue()) {
            ((Function0) this.d).invoke();
            z511Var.z(this);
        }
    }

    public void i() {
        this.b.z(this);
        el00 el00Var = (el00) this.c;
        if (el00Var.c1 == this) {
            el00Var.c1 = null;
        }
        RecyclerView recyclerView = el00Var.T0;
        recyclerView.getViewTreeObserver().addOnDrawListener(new gl00(recyclerView, new t3x(el00Var, (Map) this.d, (byte) 20)));
    }

    public /* synthetic */ zk00(Object obj, z511 z511Var, Function0 function0, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z511Var;
        this.d = function0;
    }
}
