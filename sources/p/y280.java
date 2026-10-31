package p;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class y280 extends b380 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ b380 e;

    public y280(b380 b380Var, int i, int i2) {
        this.e = b380Var;
        this.c = i;
        this.d = i2;
    }

    public final Object[] d() {
        return this.e.d();
    }

    public final int e() {
        return this.e.f() + this.c + this.d;
    }

    public final int f() {
        return this.e.f() + this.c;
    }

    public final Object get(int i) {
        dm5.q(i, this.d);
        return this.e.get(i + this.c);
    }

    public final boolean i() {
        return true;
    }

    public final Iterator iterator() {
        return r(0);
    }

    public final ListIterator listIterator() {
        return r(0);
    }

    public final int size() {
        return this.d;
    }

    public Object writeReplace() {
        return super.writeReplace();
    }

    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final b380 subList(int i, int i2) {
        dm5.v(i, i2, this.d);
        int i3 = this.c;
        return this.e.x(i + i3, i2 + i3);
    }

    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return r(i);
    }
}
