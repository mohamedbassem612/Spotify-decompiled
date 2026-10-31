package p;

import android.view.MenuInflater;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class o60 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;

    public /* synthetic */ o60(Object obj, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    public Integer a(o60 o60Var) {
        xkg0 xkg0Var = mjk1.a;
        if (this == o60Var) {
            return 0;
        }
        xkg0 xkg0Var2 = mjk1.a;
        Integer num = (Integer) xkg0Var2.get(this);
        Integer num2 = (Integer) xkg0Var2.get(o60Var);
        if (num == null || num2 == null || num.equals(num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public abstract void b();

    public abstract View c();

    public String e() {
        return (String) this.c;
    }

    public abstract msi0 f();

    public abstract MenuInflater g();

    public abstract CharSequence i();

    public abstract CharSequence j();

    public abstract void k();

    public abstract boolean l();

    public abstract void n(View view);

    public abstract void o(int i);

    public abstract void p(CharSequence charSequence);

    public abstract void q(int i);

    public abstract void r(CharSequence charSequence);

    public abstract void s(boolean z);

    public String toString() {
        switch (this.a) {
            case 2:
                return e();
            default:
                return super.toString();
        }
    }

    public o60 m() {
        return this;
    }
}
