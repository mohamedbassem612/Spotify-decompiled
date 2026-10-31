package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class p7 implements Iterator {
    public final /* synthetic */ byte a = 0;
    public final Iterator b;
    public Object c;
    public final /* synthetic */ Object d;

    public p7(yhn1 yhn1Var) {
        this.d = yhn1Var;
        Collection collection = yhn1Var.b;
        this.c = collection;
        this.b = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public void a() {
        x7 x7Var = (x7) this.d;
        x7Var.c();
        if (x7Var.b == ((Collection) this.c)) {
            return;
        }
        eg.d();
    }

    public void b() {
        yhn1 yhn1Var = (yhn1) this.d;
        yhn1Var.zzb();
        if (yhn1Var.b == ((Collection) this.c)) {
            return;
        }
        eg.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
            case 1:
                break;
            case 2:
                a();
                break;
            case 3:
                break;
            default:
                b();
                break;
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.a;
        Object obj = this.d;
        Iterator it = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Map.Entry entry = (Map.Entry) it.next();
                this.c = (Collection) entry.getValue();
                return ((q7) obj).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) it.next();
                this.c = entry2;
                return entry2.getKey();
            case 2:
                a();
                return it.next();
            case 3:
                Map.Entry entry3 = (Map.Entry) it.next();
                this.c = (Collection) entry3.getValue();
                Object key = entry3.getKey();
                Collection collection = (Collection) entry3.getValue();
                mkn1 mkn1Var = (mkn1) ((q7) obj).e;
                List list = (List) collection;
                return new iqn1(key, list instanceof RandomAccess ? new ufn1(mkn1Var, key, list, null) : new yhn1(mkn1Var, key, list, null));
            default:
                b();
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        byte b = this.a;
        Object obj = this.d;
        Iterator it = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                dm5.z(((Collection) this.c) != null, "no calls to next() since the last call to remove()");
                it.remove();
                ((b8) ((q7) obj).e).f -= ((Collection) this.c).size();
                ((Collection) this.c).clear();
                this.c = null;
                break;
            case 1:
                dm5.z(((Map.Entry) this.c) != null, "no calls to next() since the last call to remove()");
                Collection collection = (Collection) ((Map.Entry) this.c).getValue();
                it.remove();
                ((r7) obj).c.f -= collection.size();
                collection.clear();
                this.c = null;
                break;
            case 2:
                it.remove();
                x7 x7Var = (x7) obj;
                x7Var.e.f--;
                x7Var.d();
                break;
            case 3:
                if (!(((Collection) this.c) != null)) {
                    eg.m("no calls to next() since the last call to remove()");
                } else {
                    it.remove();
                    ((Collection) this.c).size();
                    ((Collection) this.c).clear();
                    this.c = null;
                }
                break;
            default:
                it.remove();
                ((yhn1) obj).b();
                break;
        }
    }

    public p7(q7 q7Var, byte b) {
        this.d = q7Var;
        this.b = q7Var.b.entrySet().iterator();
    }

    public p7(yhn1 yhn1Var, ListIterator listIterator) {
        this.d = yhn1Var;
        this.c = yhn1Var.b;
        this.b = listIterator;
    }

    public p7(x7 x7Var) {
        Iterator it;
        this.d = x7Var;
        Collection collection = x7Var.b;
        this.c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.b = it;
    }

    public p7(x7 x7Var, ListIterator listIterator) {
        this.d = x7Var;
        this.c = x7Var.b;
        this.b = listIterator;
    }

    public p7(r7 r7Var, Iterator it) {
        this.b = it;
        this.d = r7Var;
    }

    public p7(q7 q7Var) {
        this.d = q7Var;
        this.b = q7Var.b.entrySet().iterator();
    }
}
