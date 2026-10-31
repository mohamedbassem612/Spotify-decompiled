package p;

import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jvb0 extends AbstractList implements RandomAccess, ovb0 {
    public static final qjh1 b = new qjh1(new jvb0());
    public final ArrayList a;

    public jvb0(ovb0 ovb0Var) {
        this.a = new ArrayList(ovb0Var.size());
        addAll(ovb0Var);
    }

    @Override // p.ovb0
    public final void N0(qmd0 qmd0Var) {
        this.a.add(qmd0Var);
        ((AbstractList) this).modCount++;
    }

    @Override // p.ovb0
    public final List a() {
        return Collections.unmodifiableList(this.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.a.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection instanceof ovb0) {
            collection = ((ovb0) collection).a();
        }
        boolean zAddAll = this.a.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // p.ovb0
    public final qhc c0(int i) {
        qhc qmd0Var;
        ArrayList arrayList = this.a;
        Object obj = arrayList.get(i);
        if (obj instanceof qhc) {
            qmd0Var = (qhc) obj;
        } else if (obj instanceof String) {
            try {
                qmd0Var = new qmd0(((String) obj).getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e) {
                bhn0.o("UTF-8 not supported?", e);
                return null;
            }
        } else {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            qmd0Var = new qmd0(bArr2);
        }
        if (qmd0Var != obj) {
            arrayList.set(i, qmd0Var);
        }
        return qmd0Var;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.a.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // p.ovb0
    public final qjh1 g() {
        return new qjh1(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ArrayList arrayList = this.a;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof qhc) {
            qhc qhcVar = (qhc) obj;
            String strQ = qhcVar.q();
            if (qhcVar.k()) {
                arrayList.set(i, strQ);
            }
            return strQ;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = m290.a;
        try {
            String str = new String(bArr, "UTF-8");
            if (oto1.s(0, bArr, bArr.length) == 0) {
                arrayList.set(i, str);
            }
            return str;
        } catch (UnsupportedEncodingException e) {
            bhn0.o("UTF-8 not supported?", e);
            return null;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        Object objRemove = this.a.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (objRemove instanceof qhc) {
            return ((qhc) objRemove).q();
        }
        byte[] bArr = (byte[]) objRemove;
        byte[] bArr2 = m290.a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            bhn0.o("UTF-8 not supported?", e);
            return null;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Object obj2 = this.a.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof qhc) {
            return ((qhc) obj2).q();
        }
        byte[] bArr = (byte[]) obj2;
        byte[] bArr2 = m290.a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            bhn0.o("UTF-8 not supported?", e);
            return null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    public jvb0() {
        this.a = new ArrayList();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.a.size(), collection);
    }
}
