package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kng0 implements Iterator {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public kng0(ain1 ain1Var) {
        this.a = (byte) 4;
        if (!(ain1Var instanceof pjn1)) {
            this.b = null;
            this.c = (uhn1) ain1Var;
            return;
        }
        pjn1 pjn1Var = (pjn1) ain1Var;
        ArrayDeque arrayDeque = new ArrayDeque(pjn1Var.g);
        this.b = arrayDeque;
        arrayDeque.push(pjn1Var);
        ain1 ain1Var2 = pjn1Var.d;
        while (ain1Var2 instanceof pjn1) {
            pjn1 pjn1Var2 = (pjn1) ain1Var2;
            ((ArrayDeque) this.b).push(pjn1Var2);
            ain1Var2 = pjn1Var2.d;
        }
        this.c = (uhn1) ain1Var2;
    }

    public qmd0 a() {
        Stack stack = (Stack) this.b;
        qmd0 qmd0Var = (qmd0) this.c;
        qmd0 qmd0Var2 = null;
        if (qmd0Var == null) {
            hhg1.k();
            return null;
        }
        while (!stack.isEmpty()) {
            qhc qhcVar = ((sp31) stack.pop()).d;
            while (qhcVar instanceof sp31) {
                sp31 sp31Var = (sp31) qhcVar;
                stack.push(sp31Var);
                qhcVar = sp31Var.c;
            }
            qmd0 qmd0Var3 = (qmd0) qhcVar;
            if (qmd0Var3.b.length != 0) {
                qmd0Var2 = qmd0Var3;
                break;
            }
        }
        this.c = qmd0Var2;
        return qmd0Var;
    }

    public uhn1 b() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        uhn1 uhn1Var = (uhn1) this.c;
        uhn1 uhn1Var2 = null;
        if (uhn1Var == null) {
            hhg1.k();
            return null;
        }
        while (arrayDeque != null && !arrayDeque.isEmpty()) {
            ain1 ain1Var = ((pjn1) arrayDeque.pop()).e;
            while (ain1Var instanceof pjn1) {
                pjn1 pjn1Var = (pjn1) ain1Var;
                arrayDeque.push(pjn1Var);
                ain1Var = pjn1Var.d;
            }
            uhn1 uhn1Var3 = (uhn1) ain1Var;
            if (!uhn1Var3.w()) {
                uhn1Var2 = uhn1Var3;
                break;
            }
        }
        this.c = uhn1Var2;
        return uhn1Var;
    }

    public boolean equals(Object obj) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return ((Iterator) this.c).equals(obj);
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return ((Iterator) this.c).hasNext();
            case 1:
                cdo0 cdo0Var = (cdo0) this.b;
                return (cdo0Var == null || cdo0Var == ((cdo0) this.c)) ? false : true;
            case 2:
                return ((qmd0) this.c) != null;
            case 3:
                return ((Iterator) this.c).hasNext();
            default:
                return ((uhn1) this.c) != null;
        }
    }

    public int hashCode() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return ((Iterator) this.c).hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return ((Iterator) this.c).next();
            case 1:
                cdo0 cdo0Var = (cdo0) this.b;
                this.b = cdo0Var.e;
                return cdo0Var;
            case 2:
                return a();
            case 3:
                Map.Entry entry = (Map.Entry) ((Iterator) this.c).next();
                this.b = entry;
                return entry.getKey();
            default:
                return b();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((nng0) this.b).c();
                ((Iterator) this.c).remove();
                return;
            case 1:
                throw new UnsupportedOperationException("remove");
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                Map.Entry entry = (Map.Entry) this.b;
                if (!(entry != null)) {
                    eg.m("no calls to next() since the last call to remove()");
                    return;
                }
                Collection collection = (Collection) entry.getValue();
                ((Iterator) this.c).remove();
                collection.size();
                collection.clear();
                this.b = null;
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public String toString() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return ((Iterator) this.c).toString();
            default:
                return super.toString();
        }
    }

    public kng0(ucn1 ucn1Var, Iterator it) {
        this.a = (byte) 3;
        this.c = it;
    }

    public /* synthetic */ kng0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public kng0(qhc qhcVar) {
        this.a = (byte) 2;
        this.b = new Stack();
        while (qhcVar instanceof sp31) {
            sp31 sp31Var = (sp31) qhcVar;
            ((Stack) this.b).push(sp31Var);
            qhcVar = sp31Var.c;
        }
        this.c = (qmd0) qhcVar;
    }
}
