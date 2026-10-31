package p;

import androidx.media3.common.ParserException;
import java.io.EOFException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ryp0 {
    public short a;
    public long b;
    public short c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    public final izr0 g = new izr0(255);

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [int, short] */
    /* JADX WARN: Type inference failed for: r1v9, types: [int, short] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean a(fc10 fc10Var, boolean z) throws ParserException, EOFException {
        boolean zD;
        boolean zD2;
        b();
        izr0 izr0Var = this.g;
        izr0Var.O(27);
        try {
            zD = fc10Var.d(izr0Var.a, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            zD = false;
        }
        if (zD && izr0Var.G() == 1332176723) {
            if (izr0Var.E() == 0) {
                this.a = izr0Var.E();
                this.b = izr0Var.t();
                izr0Var.v();
                izr0Var.v();
                izr0Var.v();
                ?? E = izr0Var.E();
                this.c = E;
                this.d = E + 27;
                izr0Var.O(E);
                try {
                    zD2 = fc10Var.d(izr0Var.a, 0, this.c, z);
                } catch (EOFException e2) {
                    if (!z) {
                        throw e2;
                    }
                    zD2 = false;
                }
                if (zD2) {
                    for (int i = 0; i < this.c; i++) {
                        int iE = izr0Var.E();
                        this.f[i] = iE;
                        this.e += iE;
                    }
                    return true;
                }
            } else if (!z) {
                throw ParserException.d("unsupported bit stream revision");
            }
        }
        return false;
    }

    public final void b() {
        this.a = (short) 0;
        this.b = 0L;
        this.c = (short) 0;
        this.d = 0;
        this.e = 0;
    }

    public final boolean c(fc10 fc10Var) {
        return d(fc10Var, -1L);
    }

    public final boolean d(fc10 fc10Var, long j) {
        boolean zD;
        dm5.m(fc10Var.getPosition() == fc10Var.j());
        izr0 izr0Var = this.g;
        izr0Var.O(4);
        while (true) {
            if (j != -1 && fc10Var.getPosition() + 4 >= j) {
                break;
            }
            try {
                zD = fc10Var.d(izr0Var.a, 0, 4, true);
            } catch (EOFException unused) {
                zD = false;
            }
            if (!zD) {
                break;
            }
            izr0Var.R(0);
            if (izr0Var.G() == 1332176723) {
                fc10Var.f();
                return true;
            }
            fc10Var.u(1);
        }
        do {
            if (j != -1 && fc10Var.getPosition() >= j) {
                break;
            }
        } while (fc10Var.r(1) != -1);
        return false;
    }
}
