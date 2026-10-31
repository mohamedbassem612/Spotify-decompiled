package p;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hvb0 extends h9 implements mvb0, RandomAccess {
    public final ArrayList b;

    static {
        ((h9) new hvb0(10)).a = false;
    }

    public hvb0(int i) {
        this(new ArrayList(i));
    }

    @Override // p.mvb0
    public final List a() {
        return Collections.unmodifiableList(this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.mvb0
    public final void a0(ghc ghcVar) {
        b();
        this.b.add(ghcVar);
        ((AbstractList) this).modCount++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List
    public final void add(int i, Object obj) {
        b();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        b();
        if (collection instanceof mvb0) {
            collection = ((mvb0) collection).a();
        }
        boolean zAddAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        b();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // p.mvb0
    public final mvb0 g() {
        return ((h9) this).a ? new ojh1(this) : this;
    }

    @Override // java.util.List
    public final Object get(int i) {
        String str;
        ArrayList arrayList = this.b;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof ohc)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, k290.a);
            if (soi1.a.w(0, bArr, bArr.length)) {
                arrayList.set(i, str2);
            }
            return str2;
        }
        ghc ghcVar = (ohc) obj;
        Charset charset = k290.a;
        if (ghcVar.size() == 0) {
            str = "";
        } else {
            ghc ghcVar2 = ghcVar;
            str = new String(ghcVar2.d, ghcVar2.k(), ghcVar2.size(), charset);
        }
        ghc ghcVar3 = ghcVar;
        int iK = ghcVar3.k();
        if (soi1.a.w(iK, ghcVar3.d, ghcVar3.size() + iK)) {
            arrayList.set(i, str);
        }
        return str;
    }

    public final g290 h(int i) {
        ArrayList arrayList = this.b;
        if (i < arrayList.size()) {
            bhn0.q();
            return null;
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new hvb0(arrayList2);
    }

    @Override // p.mvb0
    public final Object j(int i) {
        return this.b.get(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List
    public final Object remove(int i) {
        b();
        Object objRemove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof ohc)) {
            return new String((byte[]) objRemove, k290.a);
        }
        ghc ghcVar = (ohc) objRemove;
        Charset charset = k290.a;
        if (ghcVar.size() == 0) {
            return "";
        }
        ghc ghcVar2 = ghcVar;
        return new String(ghcVar2.d, ghcVar2.k(), ghcVar2.size(), charset);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        b();
        Object obj2 = this.b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof ohc)) {
            return new String((byte[]) obj2, k290.a);
        }
        ghc ghcVar = (ohc) obj2;
        Charset charset = k290.a;
        if (ghcVar.size() == 0) {
            return "";
        }
        ghc ghcVar2 = ghcVar;
        return new String(ghcVar2.d, ghcVar2.k(), ghcVar2.size(), charset);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.b.size();
    }

    public hvb0(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }
}
