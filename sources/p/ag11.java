package p;

import com.google.common.collect.BiMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ag11 extends l280 {
    public static final ag11 i = new ag11();
    public final transient Object d;
    public final transient Object[] e;
    public final transient boolean f;
    public final transient int g;
    public final transient ag11 h;

    public ag11(int i2, Object[] objArr) {
        this.e = objArr;
        this.g = i2;
        this.f = false;
        int iM = i2 >= 2 ? t380.m(i2) : 0;
        Object objQ = gg11.q(objArr, i2, iM, 0);
        if (objQ instanceof Object[]) {
            throw ((g380) ((Object[]) objQ)[2]).a();
        }
        this.d = objQ;
        Object objQ2 = gg11.q(objArr, i2, iM, 1);
        if (objQ2 instanceof Object[]) {
            throw ((g380) ((Object[]) objQ2)[2]).a();
        }
        this.h = new ag11(objQ2, objArr, i2, this);
    }

    public final t380 d() {
        boolean z = this.f;
        return new dg11(this, this.e, z ? 1 : 0, this.g);
    }

    public final t380 e() {
        boolean z = this.f;
        return new eg11(this, new fg11(z ? 1 : 0, this.g, this.e));
    }

    public final Object get(Object obj) {
        int i2 = this.g;
        boolean z = this.f;
        Object objR = gg11.r(i2, z ? 1 : 0, this.d, obj, this.e);
        if (objR == null) {
            return null;
        }
        return objR;
    }

    public final BiMap inverse() {
        return this.h;
    }

    public final int size() {
        return this.g;
    }

    @Override // p.l280
    public Object writeReplace() {
        return super.writeReplace();
    }

    public ag11() {
        this.d = null;
        this.e = new Object[0];
        this.f = false;
        this.g = 0;
        this.h = this;
    }

    public ag11(Object obj, Object[] objArr, int i2, ag11 ag11Var) {
        this.d = obj;
        this.e = objArr;
        this.f = true;
        this.g = i2;
        this.h = ag11Var;
    }
}
