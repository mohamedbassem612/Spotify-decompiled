package p;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class pfb1 {
    public static final oma0 a;
    public static final oma0 b;
    public static final oma0 c;
    public static final oma0 d;
    public static final ax81 e;

    static {
        jd11 jd11Var = rc11.a;
        tka0 tka0VarB = jd11Var.b(Object.class);
        List list = Collections.EMPTY_LIST;
        a = jd11Var.m(tka0VarB, list, false);
        b = jd11Var.m(jd11Var.b(Object.class), list, true);
        c = jd11Var.m(jd11Var.b(Cloneable.class), list, false);
        d = jd11Var.m(jd11Var.b(Serializable.class), list, false);
        tka0 tka0VarB2 = jd11Var.b(rih1.class);
        b69 b69Var = b69.X;
        z6x z6xVar = z6x.a;
        e = new ax81(tka0VarB2, z6xVar, false, z6xVar, null, false, false, false, null, b69Var);
    }
}
