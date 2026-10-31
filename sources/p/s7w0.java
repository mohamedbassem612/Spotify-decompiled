package p;

import android.os.Bundle;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s7w0 extends x7e0 implements b031 {
    public final x7w0 d;
    public final a9w0 e;
    public final bpb1 f;
    public final xe01 g;
    public final llm h;
    public xab1 i;
    public eso t;

    public s7w0(x7w0 x7w0Var, a9w0 a9w0Var) {
        this.d = x7w0Var;
        this.e = a9w0Var;
        bpb1 bpb1VarB = gio1.b(z7w0.a);
        this.f = bpb1VarB;
        this.g = d5p1.h(bpb1VarB);
        this.h = smo1.e(op71.f());
    }

    public final void a(Bundle bundle) {
        this.t = (eso) bundle.getParcelable("preset_details_customization_input");
    }

    public final void e() {
        j();
        if (this.g.a.getValue() instanceof y7w0) {
            i();
            return;
        }
        this.i = fn31.T(this.h, (o8n) null, 0, new c3u0(this, null, (byte) 12), 3);
    }

    public final void f() {
        xab1 xab1Var = this.i;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(onm onmVar) {
        q7w0 q7w0Var;
        Object objA;
        t7w0 m231Var;
        if (onmVar instanceof q7w0) {
            q7w0Var = (q7w0) onmVar;
            int i = q7w0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                q7w0Var.c = i - Integer.MIN_VALUE;
            } else {
                q7w0Var = new q7w0(this, onmVar);
            }
        } else {
            q7w0Var = new q7w0(this, onmVar);
        }
        Object obj = q7w0Var.a;
        int i2 = q7w0Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            String str = this.d.a;
            q7w0Var.c = 1;
            objA = this.e.a(str, q7w0Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            objA = ((e331) obj).a;
        }
        if (!(objA instanceof m231)) {
            try {
                m231Var = new t7w0((e9w0) objA, null, false);
            } catch (Throwable th) {
                m231Var = new m231(th);
            }
            objA = m231Var;
        }
        if (!(objA instanceof m231)) {
            this.f.m((Object) null, new y7w0((t7w0) objA));
        }
        return objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(onm onmVar) {
        r7w0 r7w0Var;
        Object value;
        a8w0 y7w0Var;
        t7w0 t7w0Var;
        Object value2;
        a8w0 y7w0Var2;
        Object objC;
        Object value3;
        a8w0 y7w0Var3;
        d9w0 d9w0Var;
        Object value4;
        a8w0 y7w0Var4;
        Object value5;
        a8w0 y7w0Var5;
        if (onmVar instanceof r7w0) {
            r7w0Var = (r7w0) onmVar;
            int i = r7w0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                r7w0Var.c = i - Integer.MIN_VALUE;
            } else {
                r7w0Var = new r7w0(this, onmVar);
            }
        } else {
            r7w0Var = new r7w0(this, onmVar);
        }
        Object obj = r7w0Var.a;
        int i2 = r7w0Var.c;
        z7w0 z7w0Var = z7w0.a;
        bpb1 bpb1Var = this.f;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                Object value6 = this.g.a.getValue();
                y7w0 y7w0Var6 = value6 instanceof y7w0 ? (y7w0) value6 : null;
                if (y7w0Var6 != null && (t7w0Var = y7w0Var6.a) != null && !t7w0Var.c) {
                    do {
                        value2 = bpb1Var.getValue();
                        y7w0Var2 = (a8w0) value2;
                        if (y7w0Var2 instanceof y7w0) {
                            y7w0Var2 = new y7w0(t7w0.a(((y7w0) y7w0Var2).a, null, true, 3));
                        } else if (!u890.j(y7w0Var2, z7w0Var)) {
                            eg.o();
                        }
                    } while (!bpb1Var.k(value2, y7w0Var2));
                    a9w0 a9w0Var = this.e;
                    String str = t7w0Var.a.a;
                    r7w0Var.c = 1;
                    objC = a9w0Var.c(str, r7w0Var);
                    d9n d9nVar = d9n.a;
                    if (objC == d9nVar) {
                        return d9nVar;
                    }
                }
                return null;
            }
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            objC = ((e331) obj).a;
            if (e331.a(objC) == null) {
                d9w0Var = (d9w0) objC;
                mwv0 mwv0Var = new mwv0(d9w0Var, (byte) 5);
                do {
                    value5 = bpb1Var.getValue();
                    y7w0Var5 = (a8w0) value5;
                    if (!(y7w0Var5 instanceof y7w0)) {
                        if (!u890.j(y7w0Var5, z7w0Var)) {
                            eg.o();
                            break;
                        }
                    } else {
                        y7w0Var5 = new y7w0((t7w0) mwv0Var.invoke(((y7w0) y7w0Var5).a));
                    }
                } while (!bpb1Var.k(value5, y7w0Var5));
            } else {
                do {
                    value3 = bpb1Var.getValue();
                    y7w0Var3 = (a8w0) value3;
                    if (y7w0Var3 instanceof y7w0) {
                        y7w0Var3 = new y7w0(t7w0.a(((y7w0) y7w0Var3).a, null, false, 3));
                    } else if (!u890.j(y7w0Var3, z7w0Var)) {
                        throw new NoWhenBranchMatchedException();
                    }
                } while (!bpb1Var.k(value3, y7w0Var3));
                d9w0Var = null;
            }
            do {
                value4 = bpb1Var.getValue();
                y7w0Var4 = (a8w0) value4;
                if (y7w0Var4 instanceof y7w0) {
                    y7w0Var4 = new y7w0(t7w0.a(((y7w0) y7w0Var4).a, null, false, 3));
                } else if (!u890.j(y7w0Var4, z7w0Var)) {
                    eg.o();
                    return null;
                }
            } while (!bpb1Var.k(value4, y7w0Var4));
            return d9w0Var;
        } catch (Throwable th) {
            do {
                value = bpb1Var.getValue();
                y7w0Var = (a8w0) value;
                if (y7w0Var instanceof y7w0) {
                    y7w0Var = new y7w0(t7w0.a(((y7w0) y7w0Var).a, null, false, 3));
                } else if (!u890.j(y7w0Var, z7w0Var)) {
                    eg.o();
                    return null;
                }
            } while (!bpb1Var.k(value, y7w0Var));
            throw th;
        }
    }

    public final Bundle serialize() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("preset_details_customization_input", this.t);
        return bundle;
    }
}
