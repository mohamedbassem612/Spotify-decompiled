package p;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import io.reactivex.rxjava3.core.Flowable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tkt {
    public final int a;
    public int b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;

    public tkt(RecyclerView recyclerView, ak01 ak01Var, sjw0 sjw0Var, pnq pnqVar, rnq rnqVar) {
        this.c = ak01Var;
        this.d = new kdn0();
        this.a = recyclerView.getContext().getResources().getDimensionPixelSize(2131167023);
        this.b = recyclerView.getContext().getResources().getDimensionPixelSize(2131167023);
        e111 e111Var = new e111(this, (byte) 0);
        lik1 lik1Var = nik1.J4;
        c8o.m(lik1Var);
        wj3 wj3Var = (wj3) rnqVar.a.c;
        Flowable flowable = (Flowable) ((d111) wj3Var.c).s.get();
        c8o.l(flowable);
        xfx xfxVar = (xfx) ((d111) wj3Var.c).E.get();
        c8o.l(xfxVar);
        igx igxVar = new igx(xfxVar.c, (byte) 3);
        agc0 agc0Var = (agc0) ((d111) wj3Var.c).w.get();
        c8o.l(agc0Var);
        this.e = new rt01(lik1Var, flowable, igxVar, agc0Var, e111Var);
        this.f = pnqVar.a(sjw0Var, new g001(this, (byte) 14));
        ne neVar = new ne(3, new e111(this, (byte) 3));
        recyclerView.getContext();
        neVar.f(recyclerView, new LinearLayoutManager(1), false);
    }

    public long a(int i, int i2) {
        int i3;
        v6a0 v6a0Var = (v6a0) this.c;
        int[] iArr = (int[]) v6a0Var.b;
        if (i2 == 1) {
            i3 = iArr[i];
        } else {
            int i4 = (i2 + i) - 1;
            int[] iArr2 = (int[]) v6a0Var.c;
            i3 = (iArr2[i4] + iArr[i4]) - iArr2[i];
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i3 < 0) {
            sf80.a("width must be >= 0");
        }
        return jjl.h(i3, i3, 0, Integer.MAX_VALUE);
    }

    public npb0 b(int i) {
        yxs yxsVarB = ((rpb0) this.e).b(i);
        int i2 = yxsVarB.a;
        int size = yxsVarB.b.size();
        int i3 = 0;
        mpb0[] mpb0VarArr = new mpb0[size];
        int i4 = 0;
        int i5 = (size == 0 || i2 + size == this.a) ? 0 : this.b;
        while (true) {
            List list = yxsVarB.b;
            if (i3 >= size) {
                return new npb0(i, mpb0VarArr, (v6a0) this.f, list, i5);
            }
            int i6 = (int) ((bg50) list.get(i3)).a;
            int i7 = i5;
            mpb0 mpb0VarV1 = ((ipb0) this.d).v1(i2 + i3, i4, i6, i7, a(i4, i6));
            i5 = i7;
            i4 += i6;
            mpb0VarArr[i3] = mpb0VarV1;
            i3++;
        }
    }

    public void c(LottieAnimationView lottieAnimationView) {
        yge0 yge0Var = (yge0) this.c;
        kdf0 kdf0Var = (kdf0) ((List) yge0Var.c).get(this.b);
        fcf0 fcf0Var = (fcf0) yge0Var.b;
        if (!(kdf0Var instanceof kdf0)) {
            eg.o();
            return;
        }
        mdf0 mdf0Var = kdf0Var.c;
        int iM = up30.m(kdf0Var.a, fcf0Var);
        int iM2 = up30.m(kdf0Var.b, fcf0Var);
        if (!(mdf0Var instanceof mdf0)) {
            eg.o();
            return;
        }
        lottieAnimationView.h.r(iM, iM2);
        lottieAnimationView.setRepeatMode(1);
        lottieAnimationView.setRepeatCount(0);
        lottieAnimationView.h.b.addListener(new oqr(lottieAnimationView, this, (byte) 3));
        lottieAnimationView.g();
    }

    public tkt(v6a0 v6a0Var, int i, int i2, ipb0 ipb0Var, rpb0 rpb0Var) {
        this.f = v6a0Var;
        this.c = v6a0Var;
        this.a = i;
        this.b = i2;
        this.d = ipb0Var;
        this.e = rpb0Var;
    }

    public tkt(yge0 yge0Var, int i, List list) {
        this.c = yge0Var;
        this.a = i;
        this.d = list;
    }

    public tkt(d0r d0rVar, zob1 zob1Var, int i, int i2, m7y0 m7y0Var, plt pltVar) {
        this.c = d0rVar;
        this.d = zob1Var;
        this.a = i;
        this.b = i2;
        this.e = m7y0Var;
        this.f = pltVar;
    }
}
