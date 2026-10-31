package p;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qg91 implements Iterator {
    public final /* synthetic */ byte a;
    public int b = -1;
    public boolean c;
    public Iterator d;
    public final /* synthetic */ AbstractMap e;

    public /* synthetic */ qg91(AbstractMap abstractMap, byte b) {
        this.a = b;
        this.e = abstractMap;
    }

    public final Iterator a() {
        byte b = this.a;
        jg91 jg91Var = this.e;
        switch (b) {
            case 0:
                Iterator it = this.d;
                if (it != null) {
                    return it;
                }
                Iterator it2 = ((hg91) jg91Var).c.entrySet().iterator();
                this.d = it2;
                return it2;
            case 1:
                Iterator it3 = this.d;
                if (it3 != null) {
                    return it3;
                }
                Iterator it4 = ((ig91) jg91Var).c.entrySet().iterator();
                this.d = it4;
                return it4;
            default:
                Iterator it5 = this.d;
                if (it5 != null) {
                    return it5;
                }
                Iterator it6 = jg91Var.c.entrySet().iterator();
                this.d = it6;
                return it6;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.a;
        jg91 jg91Var = this.e;
        switch (b) {
            case 0:
                hg91 hg91Var = (hg91) jg91Var;
                return this.b + 1 < hg91Var.b || (!hg91Var.c.isEmpty() && a().hasNext());
            case 1:
                return this.b + 1 < ((ig91) jg91Var).b.size() || a().hasNext();
            default:
                jg91 jg91Var2 = jg91Var;
                return this.b + 1 < jg91Var2.b.size() || (!jg91Var2.c.isEmpty() && a().hasNext());
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.a;
        jg91 jg91Var = this.e;
        switch (b) {
            case 0:
                this.c = true;
                int i = this.b + 1;
                this.b = i;
                hg91 hg91Var = (hg91) jg91Var;
                return i < hg91Var.b ? (ng91) hg91Var.a[i] : (Map.Entry) a().next();
            case 1:
                this.c = true;
                int i2 = this.b + 1;
                this.b = i2;
                ig91 ig91Var = (ig91) jg91Var;
                return i2 < ig91Var.b.size() ? (Map.Entry) ig91Var.b.get(this.b) : (Map.Entry) a().next();
            default:
                this.c = true;
                int i3 = this.b + 1;
                this.b = i3;
                jg91 jg91Var2 = jg91Var;
                return i3 < jg91Var2.b.size() ? (Map.Entry) jg91Var2.b.get(this.b) : (Map.Entry) a().next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        byte b = this.a;
        jg91 jg91Var = this.e;
        switch (b) {
            case 0:
                hg91 hg91Var = (hg91) jg91Var;
                if (!this.c) {
                    eg.m("remove() was called before next()");
                } else {
                    this.c = false;
                    int i = hg91.g;
                    hg91Var.b();
                    int i2 = this.b;
                    if (i2 >= hg91Var.b) {
                        a().remove();
                    } else {
                        this.b = i2 - 1;
                        hg91Var.h(i2);
                    }
                }
                break;
            case 1:
                ig91 ig91Var = (ig91) jg91Var;
                if (!this.c) {
                    eg.m("remove() was called before next()");
                } else {
                    this.c = false;
                    int i3 = ig91.f;
                    ig91Var.b();
                    if (this.b >= ig91Var.b.size()) {
                        a().remove();
                    } else {
                        int i4 = this.b;
                        this.b = i4 - 1;
                        ig91Var.f(i4);
                    }
                }
                break;
            default:
                jg91 jg91Var2 = jg91Var;
                if (!this.c) {
                    eg.m("remove() was called before next()");
                } else {
                    this.c = false;
                    int i5 = jg91.g;
                    jg91Var2.b();
                    if (this.b >= jg91Var2.b.size()) {
                        a().remove();
                    } else {
                        int i6 = this.b;
                        this.b = i6 - 1;
                        jg91Var2.g(i6);
                    }
                }
                break;
        }
    }
}
