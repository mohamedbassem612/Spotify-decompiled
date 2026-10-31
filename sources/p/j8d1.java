package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputResetException;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class j8d1 extends pim0 implements nav0, wat, mav0 {
    public Object O0;
    public Object P0;
    public Object[] Q0;
    public PointerInputEventHandler R0;
    public faa0 S0;
    public bav0 T0 = f8d1.a;
    public final bfn0 U0;
    public final bfn0 V0;
    public final bfn0 W0;
    public bav0 X0;
    public long Y0;

    public j8d1(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.O0 = obj;
        this.P0 = obj2;
        this.Q0 = objArr;
        this.R0 = pointerInputEventHandler;
        bfn0 bfn0Var = new bfn0(0, new i8d1[16]);
        this.U0 = bfn0Var;
        this.V0 = bfn0Var;
        this.W0 = new bfn0(0, new i8d1[16]);
        this.Y0 = 0L;
    }

    @Override // p.pim0
    public final void A1() {
        J1();
    }

    @Override // p.mav0
    public final void D0(bav0 bav0Var, cav0 cav0Var, long j) {
        this.Y0 = j;
        if (cav0Var == cav0.a) {
            this.T0 = bav0Var;
        }
        if (this.S0 == null) {
            this.S0 = c921.y(v1(), (o8n) null, 4, new i7u0(this, (lnm) null, (byte) 9), 1);
        }
        I1(bav0Var, cav0Var);
        List list = bav0Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!p8p1.k((hav0) list.get(i))) {
                this.X0 = bav0Var;
            }
        }
        bav0Var = null;
        this.X0 = bav0Var;
    }

    public final Object H1(vu30 vu30Var, lnm lnmVar) {
        ohd ohdVar = new ohd(1, aym.t(lnmVar));
        ohdVar.t();
        i8d1 i8d1Var = new i8d1(this, ohdVar);
        synchronized (this.V0) {
            this.U0.b(i8d1Var);
            l6o1.q(vu30Var, i8d1Var, i8d1Var).resumeWith(rih1.a);
        }
        ohdVar.n(new gqb0(i8d1Var, (byte) 18));
        return ohdVar.r();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004c A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:6:0x000d, B:13:0x001b, B:14:0x0020, B:17:0x0023, B:20:0x002f, B:22:0x0037, B:24:0x003b, B:25:0x0040, B:26:0x0043, B:28:0x004c, B:30:0x0054, B:32:0x0058), top: B:41:0x000d }] */
    public final void I1(bav0 bav0Var, cav0 cav0Var) {
        Object[] objArr;
        int i;
        int i2;
        i8d1 i8d1Var;
        ohd ohdVar;
        ohd ohdVar2;
        synchronized (this.V0) {
            bfn0 bfn0Var = this.W0;
            bfn0Var.d(bfn0Var.c, this.U0);
        }
        try {
            int iOrdinal = cav0Var.ordinal();
            if (iOrdinal == 0) {
                bfn0 bfn0Var2 = this.W0;
                objArr = bfn0Var2.a;
                i = bfn0Var2.c;
                for (i2 = 0; i2 < i; i2++) {
                    i8d1Var = (i8d1) objArr[i2];
                    if (cav0Var != i8d1Var.d && (ohdVar = i8d1Var.c) != null) {
                        i8d1Var.c = null;
                        ohdVar.resumeWith(bav0Var);
                    }
                }
            } else if (iOrdinal == 1) {
                bfn0 bfn0Var3 = this.W0;
                int i3 = bfn0Var3.c - 1;
                Object[] objArr2 = bfn0Var3.a;
                if (i3 < objArr2.length) {
                    while (i3 >= 0) {
                        i8d1 i8d1Var2 = (i8d1) objArr2[i3];
                        if (cav0Var == i8d1Var2.d && (ohdVar2 = i8d1Var2.c) != null) {
                            i8d1Var2.c = null;
                            ohdVar2.resumeWith(bav0Var);
                        }
                        i3--;
                    }
                }
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                bfn0 bfn0Var4 = this.W0;
                objArr = bfn0Var4.a;
                i = bfn0Var4.c;
                while (i2 < i) {
                    i8d1Var = (i8d1) objArr[i2];
                    if (cav0Var != i8d1Var.d) {
                    }
                }
            }
            this.W0.g();
        } catch (Throwable th) {
            this.W0.g();
            throw th;
        }
    }

    public final void J1() {
        faa0 faa0Var = this.S0;
        if (faa0Var != null) {
            faa0Var.d(new PointerInputResetException());
            this.S0 = null;
        }
    }

    @Override // p.mav0
    public final void K0() {
        bav0 bav0Var = this.X0;
        if (bav0Var == null) {
            return;
        }
        List list = bav0Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((hav0) list.get(i)).f()) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    hav0 hav0Var = (hav0) list.get(i2);
                    arrayList.add(new hav0(hav0Var.d(), hav0Var.k(), hav0Var.e(), hav0Var.g(), hav0Var.k(), hav0Var.e(), hav0Var.f(), hav0Var.f(), hav0Var.j()));
                }
                bav0 bav0Var2 = new bav0(arrayList, null);
                this.T0 = bav0Var2;
                I1(bav0Var2, cav0.a);
                I1(bav0Var2, cav0.b);
                I1(bav0Var2, cav0.c);
                this.X0 = null;
                return;
            }
        }
    }

    @Override // p.wat
    public final float U0() {
        return oap1.B(this).Z0.U0();
    }

    @Override // p.wat
    public final float h() {
        return oap1.B(this).Z0.h();
    }

    @Override // p.x4t, p.mav0
    public final void i() {
        J1();
    }

    @Override // p.mav0
    public final void m1() {
        J1();
    }
}
