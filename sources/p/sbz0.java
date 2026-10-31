package p;

import android.content.Context;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sbz0 implements h0r0 {
    public final Context a;
    public final los b;
    public final vbz0 c;
    public final f7f0 d;
    public final eh4 e;
    public final pe f;
    public final rzo0 g;
    public final mwn0 h;
    public final ynb0 i;
    public final boolean j;
    public final raz0 k;
    public final zen0 l;
    public tv80 m;
    public ft0 n;
    public final llm o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public faa0 f79p;
    public BottomSheetBehavior q;
    public boolean r;
    public final dxy s;
    public final idd1 t;

    public sbz0(Context context, los losVar, q7r0 q7r0Var, gx81 gx81Var, vbz0 vbz0Var, f7f0 f7f0Var, qaz0 qaz0Var, eh4 eh4Var, pe peVar, rzo0 rzo0Var, mwn0 mwn0Var, ynb0 ynb0Var, q8n q8nVar) {
        this.a = context;
        this.b = losVar;
        this.c = vbz0Var;
        this.d = f7f0Var;
        this.e = eh4Var;
        this.f = peVar;
        this.g = rzo0Var;
        this.h = mwn0Var;
        this.i = ynb0Var;
        boolean z = qaz0Var.a() == 2;
        this.j = z;
        this.k = new hck1(q7r0Var.d.d).a(raz0.class);
        this.l = new zen0(Boolean.valueOf(!d() || losVar.a.e() == ixb.b));
        this.o = l1d.x(q8nVar);
        this.s = new dxy(new pbz0(this, (byte) 4), new ggx0(this, (byte) 5), new ggx0(this, (byte) 6), new ggx0(this, (byte) 7), new ggx0(this, (byte) 8), z ? context.getString(2131960772) : null, (byte) 20);
        this.t = new idd1(new h2y0(this, (byte) 22));
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return (cbr0) this.t.getValue();
    }

    @Override // p.h0r0
    public final p2r0 b() {
        if (d()) {
            ft0 ft0Var = this.n;
            if (ft0Var != null) {
                ft0Var.invoke();
            }
            this.n = this.b.d(new pbz0(this, (byte) 3));
        }
        return gx81.a(new pbz0(this, (byte) 0), new dx81(new rbz0(this), new pbz0(this, (byte) 1), m9x0.d));
    }

    public final void c() {
        faa0 faa0Var = this.f79p;
        if (faa0Var != null) {
            faa0Var.d(null);
        }
        this.f79p = null;
    }

    public final boolean d() {
        return this.j && !this.k.T();
    }

    public final void e(boolean z) {
        if (d()) {
            c();
            ft0 ft0Var = this.n;
            if (ft0Var != null) {
                ft0Var.invoke();
            }
            this.n = null;
            this.k.U();
            this.l.w1(Boolean.TRUE);
            tv80 tv80VarE = this.m;
            if (tv80VarE == null) {
                tv80VarE = this.g.E();
            }
            this.m = null;
            lsn0 lsn0VarM = mqn1.M("spotify:now-playing:queue", tv80VarE);
            mwn0 mwn0Var = this.h;
            mwn0Var.e(lsn0VarM);
            mwn0Var.f(lsn0VarM);
            t8h1 t8h1Var = (t8h1) this.i.get();
            if (t8h1Var != null) {
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                t8h1.l(t8h1Var, yon1.c3(), nik1.w1.a());
            }
            cbr0 cbr0Var = (cbr0) this.t.getValue();
            AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
            cbr0Var.a(new bn70(yon1.c3(), nik1.w1, (nar0) null));
            int i = (int) (this.a.getResources().getDisplayMetrics().heightPixels * 0.66f);
            BottomSheetBehavior bottomSheetBehavior = this.q;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.J(i);
                if (z) {
                    this.r = true;
                    bottomSheetBehavior.L(4);
                } else {
                    bottomSheetBehavior.F(true);
                }
            }
            if (!z || this.q == null) {
                f();
            }
        }
    }

    public final void f() {
        ((cbr0) this.t.getValue()).a(new nxb(Integer.valueOf((int) (this.a.getResources().getDisplayMetrics().heightPixels * 0.66f)), (ixb) null, (Integer) null, 1, (mxb) null, this.b, false, false, false, (nsm0) null, 4054));
    }
}
