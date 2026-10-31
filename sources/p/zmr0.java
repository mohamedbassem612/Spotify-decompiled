package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zmr0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ c10 e;
    public final /* synthetic */ lbt0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zmr0(lbt0 lbt0Var, iu30 iu30Var, boolean z, boolean z2, c10 c10Var) {
        super(1);
        this.a = (byte) 2;
        this.f = lbt0Var;
        this.b = iu30Var;
        this.c = z;
        this.d = z2;
        this.e = c10Var;
    }

    public final Object invoke(Object obj) {
        String str;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        t80 t80Var = t80.t;
        c10 c10Var = this.e;
        boolean z = this.d;
        boolean z2 = this.c;
        nat0 nat0Var = nat0.a;
        mat0 mat0Var = mat0.a;
        pat0 pat0Var = pat0.a;
        sat0 sat0Var = sat0.a;
        iu30 iu30Var = this.b;
        lbt0 lbt0Var = this.f;
        switch (b) {
            case 0:
                bwm0 bwm0Var = (bwm0) obj;
                if (bwm0Var.equals(zvm0.b)) {
                    iu30Var.invoke(sat0Var);
                } else if (bwm0Var.equals(zvm0.c)) {
                    iu30Var.invoke(pat0Var);
                } else if (bwm0Var.equals(zvm0.e)) {
                    iu30Var.invoke(mat0Var);
                } else if (bwm0Var.equals(zvm0.f)) {
                    iu30Var.invoke(nat0Var);
                } else if (bwm0Var instanceof awm0) {
                    o4o1.r(((awm0) bwm0Var).a, iu30Var, z2, z);
                } else if (bwm0Var.equals(zvm0.g)) {
                    iu30Var.invoke(new wat0(c10Var != null ? c10Var.e : null, null));
                } else if (bwm0Var.equals(zvm0.a)) {
                    c10 c10Var2 = (c10) lbt0Var.c.get(t80Var);
                    iu30Var.invoke(new jat0(c10Var2 != null ? c10Var2.e : null));
                }
                break;
            case 1:
                tvm0 tvm0Var = (tvm0) obj;
                if (tvm0Var.equals(rvm0.b)) {
                    iu30Var.invoke(sat0Var);
                } else if (tvm0Var.equals(rvm0.c)) {
                    iu30Var.invoke(pat0Var);
                } else if (tvm0Var.equals(rvm0.e)) {
                    iu30Var.invoke(mat0Var);
                } else if (tvm0Var.equals(rvm0.f)) {
                    iu30Var.invoke(nat0Var);
                } else if (tvm0Var instanceof svm0) {
                    o4o1.r(((svm0) tvm0Var).a, iu30Var, z2, z);
                } else if (tvm0Var.equals(rvm0.g)) {
                    iu30Var.invoke(new wat0(c10Var != null ? c10Var.e : null, null));
                } else if (tvm0Var.equals(rvm0.a)) {
                    c10 c10Var3 = (c10) lbt0Var.c.get(t80Var);
                    iu30Var.invoke(new jat0(c10Var3 != null ? c10Var3.e : null));
                }
                break;
            default:
                xvm0 xvm0Var = (xvm0) obj;
                Map map = lbt0Var.c;
                if (!xvm0Var.equals(vvm0.b)) {
                    if (xvm0Var.equals(vvm0.c)) {
                        iu30Var.invoke(pat0Var);
                    } else if (xvm0Var.equals(vvm0.d)) {
                        c10 c10Var4 = (c10) map.get(t80.Y);
                        if (c10Var4 == null || (str = c10Var4.e) == null) {
                            str = "";
                        }
                        iu30Var.invoke(new iat0(str));
                    } else if (xvm0Var.equals(vvm0.f)) {
                        iu30Var.invoke(mat0Var);
                    } else if (xvm0Var.equals(vvm0.g)) {
                        iu30Var.invoke(nat0Var);
                    } else if (xvm0Var instanceof wvm0) {
                        o4o1.r(((wvm0) xvm0Var).a, iu30Var, z2, z);
                    } else if (xvm0Var.equals(vvm0.h)) {
                        iu30Var.invoke(new wat0(c10Var != null ? c10Var.e : null, null));
                    } else if (xvm0Var.equals(vvm0.a)) {
                        c10 c10Var5 = (c10) map.get(t80Var);
                        iu30Var.invoke(new jat0(c10Var5 != null ? c10Var5.e : null));
                    }
                } else if (!lbt0Var.b.h.h) {
                    iu30Var.invoke(sat0Var);
                } else {
                    iu30Var.invoke(rat0.a);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zmr0(iu30 iu30Var, boolean z, boolean z2, c10 c10Var, lbt0 lbt0Var, byte b) {
        super(1);
        this.a = b;
        this.b = iu30Var;
        this.c = z;
        this.d = z2;
        this.e = c10Var;
        this.f = lbt0Var;
    }
}
