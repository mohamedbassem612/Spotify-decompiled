package p;

import android.os.Bundle;
import java.io.PrintWriter;
import java.io.Writer;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nu9 implements ph30 {
    public final rg30 a;
    public final ClassLoader b;
    public final ArrayList c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public String k;
    public int l;
    public CharSequence m;
    public int n;
    public CharSequence o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f83p;
    public ArrayList q;
    public boolean r;
    public ArrayList s;
    public final th30 t;
    public boolean u;
    public int v;
    public boolean w;

    /* JADX WARN: Illegal instructions before constructor call */
    public nu9(nu9 nu9Var) {
        rg30 rg30VarN = nu9Var.t.N();
        tg30 tg30Var = nu9Var.t.x;
        this(rg30VarN, tg30Var != null ? tg30Var.e.getClassLoader() : null);
        for (wi30 wi30Var : nu9Var.c) {
            ArrayList arrayList = this.c;
            wi30 wi30Var2 = new wi30();
            wi30Var2.a = wi30Var.a;
            wi30Var2.b = wi30Var.b;
            wi30Var2.c = wi30Var.c;
            wi30Var2.d = wi30Var.d;
            wi30Var2.e = wi30Var.e;
            wi30Var2.f = wi30Var.f;
            wi30Var2.g = wi30Var.g;
            wi30Var2.h = wi30Var.h;
            wi30Var2.i = wi30Var.i;
            arrayList.add(wi30Var2);
        }
        this.d = nu9Var.d;
        this.e = nu9Var.e;
        this.f = nu9Var.f;
        this.g = nu9Var.g;
        this.h = nu9Var.h;
        this.i = nu9Var.i;
        this.j = nu9Var.j;
        this.k = nu9Var.k;
        this.n = nu9Var.n;
        this.o = nu9Var.o;
        this.l = nu9Var.l;
        this.m = nu9Var.m;
        if (nu9Var.f83p != null) {
            ArrayList arrayList2 = new ArrayList();
            this.f83p = arrayList2;
            arrayList2.addAll(nu9Var.f83p);
        }
        if (nu9Var.q != null) {
            ArrayList arrayList3 = new ArrayList();
            this.q = arrayList3;
            arrayList3.addAll(nu9Var.q);
        }
        this.r = nu9Var.r;
        this.v = -1;
        this.w = false;
        this.t = nu9Var.t;
        this.u = nu9Var.u;
        this.v = nu9Var.v;
        this.w = nu9Var.w;
    }

    @Override // p.ph30
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (th30.P(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.i) {
            return true;
        }
        this.t.d.add(this);
        return true;
    }

    public final void b(wi30 wi30Var) {
        this.c.add(wi30Var);
        wi30Var.d = this.d;
        wi30Var.e = this.e;
        wi30Var.f = this.f;
        wi30Var.g = this.g;
    }

    public final void c(String str) {
        if (!this.j) {
            eg.m("This FragmentTransaction is not allowed to be added to the back stack.");
        } else {
            this.i = true;
            this.k = str;
        }
    }

    public final void d(int i) {
        if (this.i) {
            if (th30.P(2)) {
                toString();
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                wi30 wi30Var = (wi30) arrayList.get(i2);
                zf30 zf30Var = wi30Var.b;
                if (zf30Var != null) {
                    zf30Var.T0 += i;
                    if (th30.P(2)) {
                        Objects.toString(wi30Var.b);
                        int i3 = wi30Var.b.T0;
                    }
                }
            }
        }
    }

    public final void e() {
        ArrayList arrayList = this.c;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            wi30 wi30Var = (wi30) arrayList.get(size);
            if (wi30Var.c) {
                if (wi30Var.a == 8) {
                    wi30Var.c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i = wi30Var.b.Z0;
                    wi30Var.a = 2;
                    wi30Var.c = false;
                    for (int i2 = size - 1; i2 >= 0; i2--) {
                        wi30 wi30Var2 = (wi30) arrayList.get(i2);
                        if (wi30Var2.c && wi30Var2.b.Z0 == i) {
                            arrayList.remove(i2);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public final void f() {
        g(false, true);
    }

    public final int g(boolean z, boolean z2) {
        if (this.u) {
            eg.m("commit already called");
            return 0;
        }
        if (th30.P(2)) {
            toString();
            PrintWriter printWriter = new PrintWriter((Writer) new fte0());
            l("  ", printWriter, true);
            printWriter.close();
        }
        this.u = true;
        boolean z3 = this.i;
        th30 th30Var = this.t;
        if (z3) {
            this.v = th30Var.k.getAndIncrement();
        } else {
            this.v = -1;
        }
        if (z2) {
            th30Var.y(this, z);
        }
        return this.v;
    }

    public final void h() {
        if (this.i) {
            eg.m("This transaction is already being added to the back stack");
        } else {
            this.j = false;
            this.t.B(this, false);
        }
    }

    public final void i() {
        if (this.i) {
            eg.m("This transaction is already being added to the back stack");
        } else {
            this.j = false;
            this.t.B(this, true);
        }
    }

    public final zf30 j(Bundle bundle, Class cls) {
        rg30 rg30Var = this.a;
        if (rg30Var == null) {
            eg.m("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
            return null;
        }
        ClassLoader classLoader = this.b;
        if (classLoader == null) {
            eg.m("The FragmentManager must be attached to itshost to create a Fragment");
            return null;
        }
        zf30 zf30VarA = rg30Var.a(classLoader, cls.getName());
        if (bundle != null) {
            zf30VarA.T0(bundle);
        }
        return zf30VarA;
    }

    public final void k(int i, zf30 zf30Var, String str, int i2) {
        String str2 = zf30Var.q1;
        if (str2 != null) {
            vi30.c(str2, zf30Var);
        }
        Class<?> cls = zf30Var.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            eg.h("Fragment ", cls.getCanonicalName(), " must be a public static class to be  properly recreated from instance state.");
            return;
        }
        if (str != null) {
            String str3 = zf30Var.a1;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(zf30Var);
                sb.append(": was ");
                eg.m(l1d.q(sb, zf30Var.a1, " now ", str));
                return;
            }
            zf30Var.a1 = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + zf30Var + " with tag " + str + " to container view with no id");
            }
            int i3 = zf30Var.Y0;
            if (i3 != 0 && i3 != i) {
                StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                sb2.append(zf30Var);
                int i4 = zf30Var.Y0;
                sb2.append(": was ");
                sb2.append(i4);
                sb2.append(" now ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
            }
            zf30Var.Y0 = i;
            zf30Var.Z0 = i;
        }
        b(new wi30(i2, zf30Var));
        zf30Var.U0 = this.t;
    }

    public final void l(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.k);
            printWriter.print(" mIndex=");
            printWriter.print(this.v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.u);
            if (this.h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.h));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.f != 0 || this.g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.g));
            }
            if (this.l != 0 || this.m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.m);
            }
            if (this.n != 0 || this.o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.o);
            }
        }
        ArrayList arrayList = this.c;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            wi30 wi30Var = (wi30) arrayList.get(i);
            switch (wi30Var.a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + wi30Var.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(wi30Var.b);
            if (z) {
                if (wi30Var.d != 0 || wi30Var.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(wi30Var.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(wi30Var.e));
                }
                if (wi30Var.f != 0 || wi30Var.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(wi30Var.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(wi30Var.g));
                }
            }
        }
    }

    public final void m(zf30 zf30Var) {
        th30 th30Var = zf30Var.U0;
        if (th30Var == null || th30Var == this.t) {
            b(new wi30(3, zf30Var));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + zf30Var.toString() + " is already attached to a FragmentManager.");
    }

    public final void n(int i, zf30 zf30Var, String str) {
        if (i != 0) {
            k(i, zf30Var, str, 2);
        } else {
            hhg1.n("Must use non-zero containerViewId");
        }
    }

    public final void o(int i, int i2, int i3, int i4) {
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
    }

    public final void p(zf30 zf30Var, w8c0 w8c0Var) {
        th30 th30Var = zf30Var.U0;
        th30 th30Var2 = this.t;
        if (th30Var != th30Var2) {
            hhg1.g(th30Var2, "Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            return;
        }
        if (w8c0Var == w8c0.b && zf30Var.a > -1) {
            eg.n("Cannot set maximum Lifecycle to ", w8c0Var, " after the Fragment has been created");
            return;
        }
        if (w8c0Var == w8c0.a) {
            eg.n("Cannot set maximum Lifecycle to ", w8c0Var, ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
            return;
        }
        wi30 wi30Var = new wi30();
        wi30Var.a = 10;
        wi30Var.b = zf30Var;
        wi30Var.c = false;
        wi30Var.h = zf30Var.r1;
        wi30Var.i = w8c0Var;
        b(wi30Var);
    }

    public final void q(zf30 zf30Var) {
        th30 th30Var = zf30Var.U0;
        if (th30Var == null || th30Var == this.t) {
            b(new wi30(8, zf30Var));
            return;
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + zf30Var.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.v >= 0) {
            sb.append(" #");
            sb.append(this.v);
        }
        if (this.k != null) {
            sb.append(" ");
            sb.append(this.k);
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public nu9(th30 th30Var) {
        rg30 rg30VarN = th30Var.N();
        tg30 tg30Var = th30Var.x;
        this(rg30VarN, tg30Var != null ? tg30Var.e.getClassLoader() : null);
        this.v = -1;
        this.w = false;
        this.t = th30Var;
    }

    public nu9(rg30 rg30Var, ClassLoader classLoader) {
        this.c = new ArrayList();
        this.j = true;
        this.r = false;
        this.a = rg30Var;
        this.b = classLoader;
    }
}
