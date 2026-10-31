package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class aui1 extends cui1 implements Iterable, ola0 {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final List i;
    public final ArrayList t;

    public aui1(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.h = f7;
        this.i = list;
        this.t = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof aui1)) {
            return false;
        }
        aui1 aui1Var = (aui1) obj;
        return u890.j(this.a, aui1Var.a) && this.b == aui1Var.b && this.c == aui1Var.c && this.d == aui1Var.d && this.e == aui1Var.e && this.f == aui1Var.f && this.g == aui1Var.g && this.h == aui1Var.h && u890.j(this.i, aui1Var.i) && this.t.equals(aui1Var.t);
    }

    public final int hashCode() {
        return this.t.hashCode() + f4i1.b(x0d.f(x0d.f(x0d.f(x0d.f(x0d.f(x0d.f(x0d.f(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new k7(this);
    }
}
