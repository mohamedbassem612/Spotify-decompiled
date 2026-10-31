package p;

import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class vaa implements rs40 {
    public final dfe1 a;
    public ps40 b = new mgx0((byte) 29);
    public qs40 c = new bjx0((byte) 29);
    public os40 d = new q58((byte) 8);
    public Executor e = l5u.a;
    public int f = -1;
    public int g = -1;

    public vaa(int i, boolean z) {
        this.a = new dfe1(i, z);
    }

    @Override // p.rs40
    public final void a() {
        this.c.h();
    }

    @Override // p.rs40
    public final void b(cce cceVar) {
        this.c = cceVar;
    }

    @Override // p.rs40
    public final void c(ps40 ps40Var) {
        this.b = ps40Var;
        for (int i = 0; i < this.a.d(); i++) {
            ps40Var.k();
        }
    }

    @Override // p.rs40
    public final void d(Executor executor, os40 os40Var) {
        this.e = executor;
        this.d = os40Var;
    }

    public abstract l291 e(int i, int i2);

    @Override // p.rs40
    public void f(ss40 ss40Var) {
        dfe1 dfe1Var = this.a;
        ArrayDeque arrayDeque = dfe1Var.b;
        if (arrayDeque.contains(ss40Var)) {
            dm5.y(arrayDeque.contains(ss40Var));
            arrayDeque.remove(ss40Var);
            dfe1Var.a.add(ss40Var);
            this.b.k();
        }
    }

    @Override // p.rs40
    public void flush() {
        dfe1 dfe1Var = this.a;
        ArrayDeque arrayDeque = dfe1Var.a;
        ArrayDeque arrayDeque2 = dfe1Var.b;
        arrayDeque.addAll(arrayDeque2);
        arrayDeque2.clear();
        this.b.onFlush();
        for (int i = 0; i < dfe1Var.c; i++) {
            this.b.k();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.util.GlUtil$GlException */
    @Override // p.rs40
    public void g(ks40 ks40Var, ss40 ss40Var, long j) {
        try {
            int i = this.f;
            int i2 = ss40Var.c;
            int i3 = ss40Var.d;
            dfe1 dfe1Var = this.a;
            if (i != i2 || this.g != i3 || !((do90) dfe1Var.e()).hasNext()) {
                int i4 = ss40Var.c;
                this.f = i4;
                this.g = i3;
                l291 l291VarE = e(i4, i3);
                dfe1Var.c(ks40Var, l291VarE.a, l291VarE.b);
            }
            ss40 ss40VarF = dfe1Var.f();
            fn31.J(ss40VarF.b, ss40VarF.c, ss40VarF.d);
            if (i()) {
                fn31.w();
            }
            h(ss40Var.a, j);
            this.b.j(ss40Var);
            this.c.f(ss40VarF, j);
        } catch (GlUtil.GlException e) {
            e = e;
            this.e.execute(new ny2((Object) this, (Object) e, (byte) 17));
        } catch (VideoFrameProcessingException e2) {
            e = e2;
            this.e.execute(new ny2((Object) this, (Object) e, (byte) 17));
        }
    }

    public abstract void h(int i, long j);

    public boolean i() {
        return true;
    }
}
