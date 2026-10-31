package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rpp0 implements tha1 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public rpp0(n381 n381Var, me30 me30Var, byte b) {
        this.a = b;
        switch (b) {
            case 2:
                this.b = n381Var;
                this.c = me30Var;
                this.d = new e3d0(false);
                break;
            default:
                this.b = n381Var;
                this.c = me30Var;
                this.d = new c3d0(false);
                break;
        }
    }

    public final g3d0 a(g3d0 g3d0Var) {
        switch (this.a) {
            case 0:
                if (g3d0Var instanceof u2d0) {
                    return u2d0.a;
                }
                n57.e("Cannot reverse unknown sort order: " + g3d0Var);
                return g3d0Var;
            case 1:
                if (g3d0Var instanceof c3d0) {
                    return new c3d0(!((c3d0) g3d0Var).a);
                }
                n57.e("Cannot reverse unknown sort order: " + g3d0Var);
                return g3d0Var;
            default:
                if (g3d0Var instanceof e3d0) {
                    return new e3d0(!((e3d0) g3d0Var).a);
                }
                n57.e("Cannot reverse unknown sort order: " + g3d0Var);
                return g3d0Var;
        }
    }

    public final int b() {
        switch (this.a) {
            case 0:
                return 2131959322;
            case 1:
                return 2131957374;
            default:
                return 2131957375;
        }
    }

    public final void c(qxc0 qxc0Var) {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                xha1 xha1Var = (xha1) this.c;
                i8h1 i8h1Var = xha1Var.a;
                fjl0 fjl0Var = xha1Var.b;
                x6h1 x6h1VarC = fjl0Var.c.c();
                x6h1VarC.i.add(new a7h1("custom", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                b7x b7xVar = b7x.a;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("sort", 1, b7xVar), y6h1VarA, fjl0Var.b, System.currentTimeMillis()), (xj61) null);
                break;
            case 1:
                ((n381) obj2).n(((c3d0) obj).g());
                break;
            default:
                ((n381) obj2).n(((e3d0) obj).g());
                break;
        }
    }

    public final boolean e(qxc0 qxc0Var) {
        byte b = this.a;
        le30 le30Var = le30.T0;
        Object obj = this.c;
        switch (b) {
            case 0:
                upp0 upp0Var = (upp0) this.d;
                String str = (String) this.b;
                upp0Var.getClass();
                return upp0.b(str);
            case 1:
                return ((me30) obj).a(qxc0Var.e) == le30Var;
            default:
                return ((me30) obj).a(qxc0Var.e) == le30Var;
        }
    }

    public final g3d0 getSortOrder() {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                return u2d0.a;
            case 1:
                return (c3d0) obj;
            default:
                return (e3d0) obj;
        }
    }

    public rpp0(String str, xha1 xha1Var, upp0 upp0Var) {
        this.a = (byte) 0;
        this.b = str;
        this.c = xha1Var;
        this.d = upp0Var;
    }
}
