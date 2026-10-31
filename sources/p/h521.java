package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.disposables.Disposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class h521 implements p421, hs80 {
    public final u421 a;
    public MobiusLoop b;
    public Disposable c;
    public final idd1 d = new idd1(new g521(this, (byte) 0));

    public h521(u421 u421Var) {
        this.a = u421Var;
    }

    public final zob1 a() {
        return (zob1) this.d.getValue();
    }

    public final void b(String str) {
        MobiusLoop mobiusLoop = this.b;
        if (mobiusLoop != null) {
            mobiusLoop.a(new y421(str));
        } else {
            u890.C("loop");
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, lnm lnmVar) {
        f521 f521Var;
        if (lnmVar instanceof f521) {
            f521Var = (f521) lnmVar;
            int i = f521Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                f521Var.c = i - Integer.MIN_VALUE;
            } else {
                f521Var = new f521(this, (onm) lnmVar);
            }
        } else {
            f521Var = new f521(this, (onm) lnmVar);
        }
        Object objJ = f521Var.a;
        int i2 = f521Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            MobiusLoop mobiusLoop = this.b;
            if (mobiusLoop == null) {
                u890.C("loop");
                throw null;
            }
            mobiusLoop.a(new w421(str));
            h5y0 h5y0Var = new h5y0(a(), (byte) 22);
            ytw0 ytw0Var = jfv.b;
            e521 e521Var = new e521(x4p1.h(r4p1.v(h5y0Var, fdg1.k0(60, ngv.SECONDS)), new bz0((byte) 28)), str, (byte) 0);
            ck01 ck01Var = new ck01((byte) 5);
            f521Var.c = 1;
            objJ = b5p1.j(e521Var, ck01Var, f521Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        Object obj = ((e331) objJ).a;
        return obj instanceof m231 ? ynl.a : obj;
    }

    @Override // p.hs80
    public final r4u d(chm0 chm0Var) {
        return r4u.d(new uqv0(chm0Var, (byte) 21), r4u.a(new mlw0(this, (byte) 20)));
    }

    @Override // p.hs80
    public final void dispose() {
        Disposable disposable = this.c;
        if (disposable != null) {
            disposable.dispose();
        }
        MobiusLoop mobiusLoop = this.b;
        if (mobiusLoop != null) {
            mobiusLoop.dispose();
        } else {
            u890.C("loop");
            throw null;
        }
    }

    @Override // p.hs80
    public final void start() {
        this.b = l1d.g(Mobius.d(rve0.i, this.a)).g(new b521());
    }
}
