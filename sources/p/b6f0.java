package p;

import androidx.car.app.model.Alert;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class b6f0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c6f0 b;

    public /* synthetic */ b6f0(c6f0 c6f0Var, byte b) {
        this.a = b;
        this.b = c6f0Var;
    }

    public final Object invoke() {
        z5f0 z5f0VarC1;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        p5t0 wdn0Var = null;
        c6f0 c6f0Var = this.b;
        switch (b) {
            case 0:
                lmb0 lmb0Var = c6f0Var.f;
                lmb0Var.h = 0;
                hmb0 hmb0Var = lmb0Var.a;
                bfn0 bfn0VarA = hmb0Var.A();
                Object[] objArr = bfn0VarA.a;
                int i = bfn0VarA.c;
                for (int i2 = 0; i2 < i; i2++) {
                    c6f0 c6f0Var2 = ((hmb0) objArr[i2]).f1.q;
                    c6f0Var2.getClass();
                    c6f0Var2.h = c6f0Var2.i;
                    c6f0Var2.i = Alert.DURATION_SHOW_INDEFINITELY;
                    if (c6f0Var2.t == 2) {
                        c6f0Var2.t = 3;
                    }
                }
                bfn0 bfn0VarA2 = hmb0Var.A();
                Object[] objArr2 = bfn0VarA2.a;
                int i3 = bfn0VarA2.c;
                for (int i4 = 0; i4 < i3; i4++) {
                    c6f0 c6f0Var3 = ((hmb0) objArr2[i4]).f1.q;
                    c6f0Var3.getClass();
                    c6f0Var3.S0.d = false;
                }
                rh80 rh80Var = c6f0Var.r().F1;
                if (rh80Var == null) {
                    eg.m("Expected lookahead delegate");
                    return null;
                }
                List listO = hmb0Var.o();
                int size = listO.size();
                for (int i5 = 0; i5 < size; i5++) {
                    hmb0 hmb0Var2 = (hmb0) ((afn0) listO).get(i5);
                    z5f0 z5f0VarC2 = ((ndo0) hmb0Var2.e1.e).c1();
                    if (z5f0VarC2 != null) {
                        if (((x5f0) z5f0VarC2).O0) {
                            if (wdn0Var == null) {
                                wdn0Var = new wdn0();
                            }
                            wdn0Var.b(hmb0Var2);
                        }
                        ((x5f0) z5f0VarC2).O0 = ((x5f0) rh80Var).O0;
                    }
                }
                rh80Var.A0().a();
                List listO2 = hmb0Var.o();
                int size2 = listO2.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size2) {
                        bfn0 bfn0VarA3 = hmb0Var.A();
                        Object[] objArr3 = bfn0VarA3.a;
                        int i7 = bfn0VarA3.c;
                        for (int i8 = 0; i8 < i7; i8++) {
                            c6f0 c6f0Var4 = ((hmb0) objArr3[i8]).f1.q;
                            c6f0Var4.getClass();
                            int i9 = c6f0Var4.h;
                            int i10 = c6f0Var4.i;
                            if (i9 != i10 && i10 == Integer.MAX_VALUE) {
                                c6f0Var4.o0(true);
                            }
                        }
                        bfn0 bfn0VarA4 = hmb0Var.A();
                        Object[] objArr4 = bfn0VarA4.a;
                        int i11 = bfn0VarA4.c;
                        for (int i12 = 0; i12 < i11; i12++) {
                            c6f0 c6f0Var5 = ((hmb0) objArr4[i12]).f1.q;
                            c6f0Var5.getClass();
                            t5f0 t5f0Var = c6f0Var5.S0;
                            t5f0Var.e = t5f0Var.d;
                        }
                        return rih1Var;
                    }
                    hmb0 hmb0Var3 = (hmb0) ((afn0) listO2).get(i6);
                    boolean z = wdn0Var != null && wdn0Var.h(hmb0Var3) >= 0;
                    z5f0 z5f0VarC3 = ((ndo0) hmb0Var3.e1.e).c1();
                    if (z5f0VarC3 != null) {
                        ((x5f0) z5f0VarC3).O0 = z;
                    }
                    i6++;
                }
                break;
            case 1:
                z5f0 z5f0VarC4 = c6f0Var.f.a().c1();
                z5f0VarC4.getClass();
                z5f0VarC4.H(c6f0Var.Z0);
                return rih1Var;
            default:
                lmb0 lmb0Var2 = c6f0Var.f;
                if (gio1.y(lmb0Var2.a) || lmb0Var2.c) {
                    ndo0 ndo0Var = lmb0Var2.a().Y0;
                    if (ndo0Var != null) {
                        wdn0Var = ((x5f0) ndo0Var).P0;
                    }
                } else {
                    ndo0 ndo0Var2 = lmb0Var2.a().Y0;
                    if (ndo0Var2 != null && (z5f0VarC1 = ndo0Var2.c1()) != null) {
                        wdn0Var = ((x5f0) z5f0VarC1).P0;
                    }
                }
                if (wdn0Var == null) {
                    wdn0Var = kmb0.a(lmb0Var2.a).getPlacementScope();
                }
                z5f0 z5f0VarC5 = lmb0Var2.a().c1();
                z5f0VarC5.getClass();
                p5t0.i(wdn0Var, z5f0VarC5, c6f0Var.O0);
                return rih1Var;
        }
    }
}
