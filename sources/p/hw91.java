package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hw91 implements Parcelable, ypb1, Set, RandomAccess, ama0 {
    public static final Parcelable.Creator<hw91> CREATOR = new aw91((byte) 16);
    public qqb1 a;

    public hw91() {
        mqs0 mqs0Var = mqs0.d;
        qqb1 qqb1Var = new qqb1(pv91.h().g(), mqs0Var);
        if (pv91.b.e() != null) {
            ((cqb1) qqb1Var).b = new qqb1(1L, mqs0Var);
        }
        this.a = qqb1Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        mqs0 mqs0Var;
        jv91 jv91VarH;
        boolean zO;
        do {
            synchronized (tho1.a) {
                qqb1 qqb1Var = (qqb1) pv91.f(this.a);
                i = qqb1Var.d;
                mqs0Var = qqb1Var.c;
            }
            mqs0Var.getClass();
            mqs0 mqs0VarC = mqs0Var.c(obj);
            if (mqs0VarC.equals(mqs0Var)) {
                return false;
            }
            qqb1 qqb1Var2 = this.a;
            synchronized (pv91.c) {
                jv91VarH = pv91.h();
                zO = tho1.o((qqb1) pv91.u(qqb1Var2, this, jv91VarH), i, mqs0VarC);
            }
            pv91.l(jv91VarH, this);
        } while (!zO);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.AbstractCollection, p.oqs0] */
    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        mqs0 mqs0Var;
        jv91 jv91VarH;
        boolean zO;
        do {
            synchronized (tho1.a) {
                qqb1 qqb1Var = (qqb1) pv91.f(this.a);
                i = qqb1Var.d;
                mqs0Var = qqb1Var.c;
            }
            mqs0Var.getClass();
            ?? oqs0Var = new oqs0(mqs0Var);
            oqs0Var.addAll(collection);
            mqs0 mqs0VarC = oqs0Var.c();
            if (u890.j(mqs0VarC, mqs0Var)) {
                return false;
            }
            qqb1 qqb1Var2 = this.a;
            synchronized (pv91.c) {
                jv91VarH = pv91.h();
                zO = tho1.o((qqb1) pv91.u(qqb1Var2, this, jv91VarH), i, mqs0VarC);
            }
            pv91.l(jv91VarH, this);
        } while (!zO);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        jv91 jv91VarH;
        qqb1 qqb1Var = this.a;
        synchronized (pv91.c) {
            jv91VarH = pv91.h();
            qqb1 qqb1Var2 = (qqb1) pv91.u(qqb1Var, this, jv91VarH);
            synchronized (tho1.a) {
                qqb1Var2.c = mqs0.d;
                qqb1Var2.d++;
            }
        }
        pv91.l(jv91VarH, this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return ((qqb1) pv91.r(this.a, this)).c.c.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return ((qqb1) pv91.r(this.a, this)).c.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return ((qqb1) pv91.r(this.a, this)).c.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new pqb1(this, ((qqb1) pv91.r(this.a, this)).c.iterator());
    }

    public final cqb1 k() {
        return this.a;
    }

    public final void l(cqb1 cqb1Var) {
        cqb1Var.b = this.a;
        this.a = (qqb1) cqb1Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        mqs0 mqs0Var;
        jv91 jv91VarH;
        boolean zO;
        do {
            synchronized (tho1.a) {
                qqb1 qqb1Var = (qqb1) pv91.f(this.a);
                i = qqb1Var.d;
                mqs0Var = qqb1Var.c;
            }
            mqs0Var.getClass();
            mqs0 mqs0VarD = mqs0Var.d(obj);
            if (mqs0VarD.equals(mqs0Var)) {
                return false;
            }
            qqb1 qqb1Var2 = this.a;
            synchronized (pv91.c) {
                jv91VarH = pv91.h();
                zO = tho1.o((qqb1) pv91.u(qqb1Var2, this, jv91VarH), i, mqs0VarD);
            }
            pv91.l(jv91VarH, this);
        } while (!zO);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.AbstractSet, p.oqs0] */
    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        mqs0 mqs0Var;
        jv91 jv91VarH;
        boolean zO;
        do {
            synchronized (tho1.a) {
                qqb1 qqb1Var = (qqb1) pv91.f(this.a);
                i = qqb1Var.d;
                mqs0Var = qqb1Var.c;
            }
            mqs0Var.getClass();
            ?? oqs0Var = new oqs0(mqs0Var);
            oqs0Var.removeAll(collection);
            mqs0 mqs0VarC = oqs0Var.c();
            if (u890.j(mqs0VarC, mqs0Var)) {
                return false;
            }
            qqb1 qqb1Var2 = this.a;
            synchronized (pv91.c) {
                jv91VarH = pv91.h();
                zO = tho1.o((qqb1) pv91.u(qqb1Var2, this, jv91VarH), i, mqs0VarC);
            }
            pv91.l(jv91VarH, this);
        } while (!zO);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.AbstractCollection, p.oqs0] */
    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        mqs0 mqs0Var;
        boolean zRetainAll;
        jv91 jv91VarH;
        boolean zO;
        do {
            synchronized (tho1.a) {
                qqb1 qqb1Var = (qqb1) pv91.f(this.a);
                i = qqb1Var.d;
                mqs0Var = qqb1Var.c;
            }
            if (mqs0Var == null) {
                eg.m("No set to mutate");
                return false;
            }
            ?? oqs0Var = new oqs0(mqs0Var);
            zRetainAll = oqs0Var.retainAll(o7h.p1(collection));
            mqs0 mqs0VarC = oqs0Var.c();
            if (u890.j(mqs0VarC, mqs0Var)) {
                break;
            }
            qqb1 qqb1Var2 = this.a;
            synchronized (pv91.c) {
                jv91VarH = pv91.h();
                zO = tho1.o((qqb1) pv91.u(qqb1Var2, this, jv91VarH), i, mqs0VarC);
            }
            pv91.l(jv91VarH, this);
        } while (!zO);
        return zRetainAll;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return ((qqb1) pv91.r(this.a, this)).c.c.c();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return bmq0.c0(this);
    }

    public final String toString() {
        return "SnapshotStateSet(value=" + ((qqb1) pv91.f(this.a)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        mqs0 mqs0Var = ((qqb1) pv91.r(this.a, this)).c;
        parcel.writeInt(size());
        kqs0 it = mqs0Var.iterator();
        if (it.hasNext()) {
            parcel.writeValue(it.next());
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return bmq0.d0(this, objArr);
    }
}
