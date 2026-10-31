package p;

import android.opengl.GLES20;
import androidx.media3.common.util.GlUtil;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dfe1 {
    public final ArrayDeque a;
    public final ArrayDeque b;
    public final byte c;
    public final boolean d;

    /* JADX WARN: Multi-variable type inference failed */
    public dfe1(int i, boolean z) {
        this.d = z;
        this.c = i;
        this.a = new ArrayDeque(i);
        this.b = new ArrayDeque(i);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.util.GlUtil$GlException */
    public final void a(ks40 ks40Var, int i, int i2) throws GlUtil.GlException {
        int iL;
        int i3;
        int i4;
        ArrayDeque arrayDeque = this.a;
        dm5.y(arrayDeque.isEmpty());
        dm5.y(this.b.isEmpty());
        for (int i5 = 0; i5 < this.c; i5++) {
            if (this.d) {
                fn31.p(i, i2);
                iL = fn31.L();
                fn31.r(3553, iL, 9729);
                i3 = i;
                i4 = i2;
                GLES20.glTexImage2D(3553, 0, 34842, i3, i4, 0, 6408, 5131, null);
                fn31.t();
            } else {
                fn31.p(i, i2);
                iL = fn31.L();
                fn31.r(3553, iL, 9729);
                GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
                fn31.t();
                i3 = i;
                i4 = i2;
            }
            arrayDeque.add(ks40Var.e(iL, i3, i4));
        }
    }

    public final void b() {
        Iterator itE = e();
        while (true) {
            do90 do90Var = (do90) itE;
            if (!do90Var.hasNext()) {
                this.a.clear();
                this.b.clear();
                return;
            }
            ((ss40) do90Var.next()).a();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.util.GlUtil$GlException */
    public final void c(ks40 ks40Var, int i, int i2) throws GlUtil.GlException {
        if (!((do90) e()).hasNext()) {
            a(ks40Var, i, i2);
            return;
        }
        ss40 ss40Var = (ss40) ((do90) e()).next();
        if (ss40Var.c == i && ss40Var.d == i2) {
            return;
        }
        b();
        a(ks40Var, i, i2);
    }

    public final int d() {
        return !((do90) e()).hasNext() ? this.c : this.a.size();
    }

    public final Iterator e() {
        Iterable[] iterableArr = {this.a, this.b};
        for (int i = 0; i < 2; i++) {
            iterableArr[i].getClass();
        }
        return new pw20(iterableArr).iterator();
    }

    public final ss40 f() {
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            eg.m("Textures are all in use. Please release in-use textures before calling useTexture.");
            return null;
        }
        ss40 ss40Var = (ss40) arrayDeque.remove();
        this.b.add(ss40Var);
        return ss40Var;
    }
}
