package p;

import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pmb0 implements tlc1 {
    public flb0 a = flb0.b;
    public float b;
    public float c;
    public final /* synthetic */ vmb0 d;

    public pmb0(vmb0 vmb0Var) {
        this.d = vmb0Var;
    }

    @Override // p.ifh0
    public final hfh0 B(int i, int i2, Map map, iu30 iu30Var, iu30 iu30Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            qf80.c("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new omb0(i, i2, map, iu30Var, this, this.d, iu30Var2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // p.tlc1
    public final List P(Object obj, vu30 vu30Var) throws KotlinNothingValueException {
        vmb0 vmb0Var = this.d;
        vmb0Var.i();
        hmb0 hmb0Var = vmb0Var.a;
        int i = hmb0Var.f1.d;
        if (i != 1 && i != 3 && i != 2 && i != 4) {
            qf80.c("subcompose can only be used inside the measure or layout blocks");
        }
        nen0 nen0Var = vmb0Var.g;
        Object objG = nen0Var.g(obj);
        if (objG == null) {
            objG = (hmb0) vmb0Var.t.k(obj);
            if (objG != null) {
                if (vmb0Var.O0 <= 0) {
                    qf80.c("Check failed.");
                }
                vmb0Var.O0--;
            } else {
                objG = vmb0Var.o(obj);
                if (objG == null) {
                    int i2 = vmb0Var.d;
                    hmb0 hmb0Var2 = new hmb0(2);
                    hmb0Var.R0 = true;
                    hmb0Var.C(i2, hmb0Var2);
                    hmb0Var.R0 = false;
                    objG = hmb0Var2;
                }
            }
            nen0Var.m(obj, objG);
        }
        hmb0 hmb0Var3 = (hmb0) objG;
        if (o7h.t0(vmb0Var.d, hmb0Var.p()) != hmb0Var3) {
            int iIndexOf = hmb0Var.p().indexOf(hmb0Var3);
            if (iIndexOf < vmb0Var.d) {
                qf80.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i3 = vmb0Var.d;
            if (i3 != iIndexOf) {
                vmb0Var.k(iIndexOf, i3);
            }
        }
        vmb0Var.d++;
        vmb0Var.n(hmb0Var3, obj, false, vu30Var);
        return (i == 1 || i == 3) ? hmb0Var3.n() : hmb0Var3.m();
    }

    @Override // p.wat
    public final float U0() {
        return this.c;
    }

    @Override // p.p890
    public final boolean W() {
        int i = this.d.a.f1.d;
        return i == 4 || i == 2;
    }

    @Override // p.p890
    public final flb0 getLayoutDirection() {
        return this.a;
    }

    @Override // p.wat
    public final float h() {
        return this.b;
    }
}
