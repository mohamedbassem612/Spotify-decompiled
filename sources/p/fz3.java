package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fz3 implements ign0 {
    public final /* synthetic */ byte a;
    public final bpb1 b;
    public final Object c;

    public fz3(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                bpb1 bpb1VarB = gio1.b(Boolean.FALSE);
                this.b = bpb1VarB;
                this.c = bpb1VarB;
                break;
            case 2:
                bpb1 bpb1VarB2 = gio1.b(Boolean.FALSE);
                this.b = bpb1VarB2;
                this.c = bpb1VarB2;
                break;
            case 3:
                bpb1 bpb1VarB3 = gio1.b(Boolean.TRUE);
                this.b = bpb1VarB3;
                this.c = bpb1VarB3;
                break;
            default:
                bpb1 bpb1VarB4 = gio1.b(Boolean.TRUE);
                this.b = bpb1VarB4;
                this.c = bpb1VarB4;
                break;
        }
    }

    public final void d() {
        byte b = this.a;
        bpb1 bpb1Var = this.b;
        switch (b) {
            case 0:
                bpb1Var.m((Object) null, Boolean.TRUE);
                break;
            case 1:
                bpb1Var.m((Object) null, Boolean.TRUE);
                break;
            case 2:
                bpb1Var.m((Object) null, Boolean.TRUE);
                break;
            case 3:
                bpb1Var.m((Object) null, Boolean.TRUE);
                break;
            default:
                ((utm0) this.c).c.d();
                bpb1Var.m((Object) null, Boolean.TRUE);
                break;
        }
    }

    public final bpb1 e() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                return (bpb1) obj;
            case 1:
                return (bpb1) obj;
            case 2:
                return (bpb1) obj;
            case 3:
                return (bpb1) obj;
            default:
                return this.b;
        }
    }

    public final boolean f() {
        byte b = this.a;
        boolean zF = true;
        bpb1 bpb1Var = this.b;
        switch (b) {
            case 1:
                bpb1Var.m((Object) null, Boolean.FALSE);
            case 0:
                return false;
            case 2:
                bpb1Var.m((Object) null, Boolean.FALSE);
                return true;
            case 3:
                bpb1Var.m((Object) null, Boolean.FALSE);
                return true;
            default:
                utm0 utm0Var = (utm0) this.c;
                ign0 ign0Var = utm0Var.c;
                if (((Boolean) ign0Var.e().getValue()).booleanValue()) {
                    zF = ign0Var.f();
                    if (zF) {
                        bpb1Var.l(ign0Var.e().getValue());
                    }
                } else {
                    Iterator it = utm0Var.b.f.iterator();
                    while (it.hasNext()) {
                        w590 w590Var = ((cbu0) it.next()).c;
                        if (w590Var != null) {
                            w590Var.n();
                        }
                    }
                }
                return zF;
        }
    }

    public fz3(utm0 utm0Var) {
        this.a = (byte) 4;
        this.c = utm0Var;
        this.b = gio1.b(Boolean.TRUE);
    }
}
