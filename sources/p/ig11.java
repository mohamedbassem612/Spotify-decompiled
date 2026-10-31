package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ig11 implements Serializable {
    public final Object[] a;
    public final int[] b;

    public ig11(jg11 jg11Var) {
        int size = jg11Var.m().size();
        this.a = new Object[size];
        this.b = new int[size];
        int i = 0;
        for (ffp0 ffp0Var : jg11Var.m()) {
            this.a[i] = ffp0Var.a;
            this.b[i] = ffp0Var.a();
            i++;
        }
    }

    public Object readResolve() {
        Object[] objArr = this.a;
        int length = objArr.length;
        gfp0 gfp0Var = new gfp0();
        gfp0Var.d(length);
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            int i2 = this.b[i];
            if (i2 != 0) {
                obj.getClass();
                gfp0Var.e(gfp0Var.b(obj) + i2, obj);
            }
        }
        if (gfp0Var.c != 0) {
            return new jg11(gfp0Var);
        }
        int i3 = q380.d;
        return jg11.h;
    }
}
