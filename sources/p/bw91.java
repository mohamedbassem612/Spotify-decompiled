package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bw91 implements Parcelable, ypb1, List, RandomAccess, qla0 {
    public static final Parcelable.Creator<bw91> CREATOR = new aw91((byte) 0);
    public opb1 a;

    public bw91(d9 d9Var) {
        this.a = nho1.G(d9Var);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        d9 d9Var;
        jv91 jv91VarN;
        boolean zK;
        do {
            synchronized (nho1.a) {
                opb1 opb1Var = (opb1) pv91.f(this.a);
                i = opb1Var.d;
                d9Var = opb1Var.c;
            }
            d9Var.getClass();
            d9 d9VarD = d9Var.d(obj);
            if (d9VarD.equals(d9Var)) {
                return false;
            }
            opb1 opb1Var2 = this.a;
            synchronized (pv91.c) {
                jv91VarN = ekb.n();
                zK = nho1.k((opb1) pv91.u(opb1Var2, this, jv91VarN), i, d9VarD, true);
            }
            pv91.l(jv91VarN, this);
        } while (!zK);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        d9 d9Var;
        jv91 jv91VarN;
        boolean zK;
        do {
            synchronized (nho1.a) {
                opb1 opb1Var = (opb1) pv91.f(this.a);
                i = opb1Var.d;
                d9Var = opb1Var.c;
            }
            d9Var.getClass();
            d9 d9VarE = d9Var.e(collection);
            if (u890.j(d9VarE, d9Var)) {
                return false;
            }
            opb1 opb1Var2 = this.a;
            synchronized (pv91.c) {
                jv91VarN = ekb.n();
                zK = nho1.k((opb1) pv91.u(opb1Var2, this, jv91VarN), i, d9VarE, true);
            }
            pv91.l(jv91VarN, this);
        } while (!zK);
        return true;
    }

    public final void b(int i, int i2) {
        int i3;
        d9 d9Var;
        jv91 jv91VarN;
        boolean zK;
        do {
            synchronized (nho1.a) {
                opb1 opb1Var = (opb1) pv91.f(this.a);
                i3 = opb1Var.d;
                d9Var = opb1Var.c;
            }
            d9Var.getClass();
            ers0 ers0VarF = d9Var.f();
            ers0VarF.subList(i, i2).clear();
            d9 d9VarD = ers0VarF.d();
            if (u890.j(d9VarD, d9Var)) {
                return;
            }
            opb1 opb1Var2 = this.a;
            synchronized (pv91.c) {
                jv91VarN = ekb.n();
                zK = nho1.k((opb1) pv91.u(opb1Var2, this, jv91VarN), i3, d9VarD, true);
            }
            pv91.l(jv91VarN, this);
        } while (!zK);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        jv91 jv91VarN;
        opb1 opb1Var = this.a;
        synchronized (pv91.c) {
            jv91VarN = ekb.n();
            opb1 opb1Var2 = (opb1) pv91.u(opb1Var, this, jv91VarN);
            synchronized (nho1.a) {
                opb1Var2.c = gg91.b;
                opb1Var2.d++;
                opb1Var2.e++;
            }
        }
        pv91.l(jv91VarN, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return nho1.w(this).c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return nho1.w(this).c.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.util.List
    public final Object get(int i) {
        return nho1.w(this).c.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return nho1.w(this).c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return nho1.w(this).c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // p.ypb1
    public final cqb1 k() {
        return this.a;
    }

    @Override // p.ypb1
    public final void l(cqb1 cqb1Var) {
        cqb1Var.b = this.a;
        this.a = (opb1) cqb1Var;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return nho1.w(this).c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new ek60(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        d9 d9Var;
        jv91 jv91VarN;
        boolean zK;
        do {
            synchronized (nho1.a) {
                opb1 opb1Var = (opb1) pv91.f(this.a);
                i = opb1Var.d;
                d9Var = opb1Var.c;
            }
            d9Var.getClass();
            int iIndexOf = d9Var.indexOf(obj);
            d9 d9VarK = iIndexOf != -1 ? d9Var.k(iIndexOf) : d9Var;
            if (d9VarK.equals(d9Var)) {
                return false;
            }
            opb1 opb1Var2 = this.a;
            synchronized (pv91.c) {
                jv91VarN = ekb.n();
                zK = nho1.k((opb1) pv91.u(opb1Var2, this, jv91VarN), i, d9VarK, true);
            }
            pv91.l(jv91VarN, this);
        } while (!zK);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        d9 d9Var;
        jv91 jv91VarN;
        boolean zK;
        do {
            synchronized (nho1.a) {
                opb1 opb1Var = (opb1) pv91.f(this.a);
                i = opb1Var.d;
                d9Var = opb1Var.c;
            }
            d9Var.getClass();
            d9 d9VarI = d9Var.i(new b9(collection, (byte) 0));
            if (u890.j(d9VarI, d9Var)) {
                return false;
            }
            opb1 opb1Var2 = this.a;
            synchronized (pv91.c) {
                jv91VarN = ekb.n();
                zK = nho1.k((opb1) pv91.u(opb1Var2, this, jv91VarN), i, d9VarI, true);
            }
            pv91.l(jv91VarN, this);
        } while (!zK);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return nho1.y(this, new b9(collection, (byte) 2));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        d9 d9Var;
        jv91 jv91VarN;
        boolean zK;
        Object obj2 = get(i);
        do {
            synchronized (nho1.a) {
                opb1 opb1Var = (opb1) pv91.f(this.a);
                i2 = opb1Var.d;
                d9Var = opb1Var.c;
            }
            d9Var.getClass();
            d9 d9VarL = d9Var.l(i, obj);
            if (d9VarL.equals(d9Var)) {
                break;
            }
            opb1 opb1Var2 = this.a;
            synchronized (pv91.c) {
                jv91VarN = ekb.n();
                zK = nho1.k((opb1) pv91.u(opb1Var2, this, jv91VarN), i2, d9VarL, false);
            }
            pv91.l(jv91VarN, this);
        } while (!zK);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return nho1.w(this).c.b();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            bmv0.a("fromIndex or toIndex are out of bounds");
        }
        return new zkc1(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return bmq0.c0(this);
    }

    public final String toString() {
        return "SnapshotStateList(value=" + ((opb1) pv91.f(this.a)).c + ")@" + hashCode();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        d380 d380Var = nho1.w(this).c;
        int iB = d380Var.b();
        parcel.writeInt(iB);
        for (int i2 = 0; i2 < iB; i2++) {
            parcel.writeValue(d380Var.get(i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return bmq0.d0(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new ek60(this, i);
    }

    public bw91() {
        this(gg91.b);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        d9 d9Var;
        jv91 jv91VarN;
        boolean zK;
        do {
            synchronized (nho1.a) {
                opb1 opb1Var = (opb1) pv91.f(this.a);
                i2 = opb1Var.d;
                d9Var = opb1Var.c;
            }
            d9Var.getClass();
            d9 d9VarC = d9Var.c(i, obj);
            if (d9VarC.equals(d9Var)) {
                return;
            }
            opb1 opb1Var2 = this.a;
            synchronized (pv91.c) {
                jv91VarN = ekb.n();
                zK = nho1.k((opb1) pv91.u(opb1Var2, this, jv91VarN), i2, d9VarC, true);
            }
            pv91.l(jv91VarN, this);
        } while (!zK);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return nho1.y(this, new bz20(i, collection));
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        d9 d9Var;
        jv91 jv91VarN;
        boolean zK;
        Object obj = get(i);
        do {
            synchronized (nho1.a) {
                opb1 opb1Var = (opb1) pv91.f(this.a);
                i2 = opb1Var.d;
                d9Var = opb1Var.c;
            }
            d9Var.getClass();
            d9 d9VarK = d9Var.k(i);
            if (d9VarK.equals(d9Var)) {
                break;
            }
            opb1 opb1Var2 = this.a;
            synchronized (pv91.c) {
                jv91VarN = ekb.n();
                zK = nho1.k((opb1) pv91.u(opb1Var2, this, jv91VarN), i2, d9VarK, true);
            }
            pv91.l(jv91VarN, this);
        } while (!zK);
        return obj;
    }
}
