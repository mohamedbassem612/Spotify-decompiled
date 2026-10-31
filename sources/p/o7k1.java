package p;

import android.os.Build;
import android.view.View;
import app.p000rive.runtime.kotlin.R;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class o7k1 {
    public final int a;
    public final Class b;
    public final byte c;
    public final byte d;

    public o7k1() {
        this(R.id.tag_screen_reader_focusable, Boolean.class, 0, 28);
    }

    public static boolean a(Boolean bool, Boolean bool2) {
        return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
    }

    public Object b(View view) {
        return Boolean.valueOf(v7k1.c(view));
    }

    public void c(View view, Object obj) {
        v7k1.g(view, ((Boolean) obj).booleanValue());
    }

    public final Object d(View view) {
        if (Build.VERSION.SDK_INT >= this.c) {
            return b(view);
        }
        Object tag = view.getTag(this.a);
        if (this.b.isInstance(tag)) {
            return tag;
        }
        return null;
    }

    public final void e(View view, Object obj) {
        rf rfVar;
        if (Build.VERSION.SDK_INT >= this.c) {
            c(view, obj);
            return;
        }
        if (f(d(view), obj)) {
            qf qfVarE = b8k1.e(view);
            if (qfVarE == null) {
                rfVar = null;
            } else {
                rfVar = qfVarE instanceof qf ? qfVarE.a : new rf(qfVarE);
            }
            if (rfVar == null) {
                rfVar = new rf();
            }
            b8k1.p(view, rfVar);
            view.setTag(this.a, obj);
            b8k1.h(view, this.d);
        }
    }

    public boolean f(Object obj, Object obj2) {
        return !a((Boolean) obj, (Boolean) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o7k1(int i, Class cls, int i2, int i3) {
        this.a = i;
        this.b = cls;
        this.d = i2;
        this.c = i3;
    }
}
