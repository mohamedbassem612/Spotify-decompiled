package p;

import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class x8d1 implements Parcelable {
    public final llw0 a() {
        if (this instanceof p8d1) {
            p8d1 p8d1Var = (p8d1) this;
            List list = p8d1Var.a;
            return new ilw0(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue(), p8d1Var.b);
        }
        if (this instanceof s8d1) {
            s8d1 s8d1Var = (s8d1) this;
            return new jlw0(s8d1Var.a, s8d1Var.b);
        }
        if (this instanceof v8d1) {
            v8d1 v8d1Var = (v8d1) this;
            return new klw0(v8d1Var.a, v8d1Var.b);
        }
        if (this instanceof t8d1) {
            t8d1 t8d1Var = (t8d1) this;
            return new jlw0(t8d1Var.a, t8d1Var.b);
        }
        eg.o();
        return null;
    }

    public abstract String b();
}
