package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class avm implements m381, l381 {
    public final /* synthetic */ byte a = 1;
    public final o3r b;

    public avm(bvm bvmVar) {
        this.b = w3p1.m(new l4r(hvm.a, 2, atm.Y0, new j4r(new zum(bvmVar, (byte) 0)), atm.Z0), new l4r(jd0.m, 2, atm.a1, new j4r(new zum(bvmVar, (byte) 1)), atm.b1), new l4r(jd0.x, 2, atm.c1, new j4r(atm.X0), atm.d1), zrj.Z0);
    }

    public final o3r b() {
        byte b = this.a;
        return this.b;
    }

    public boolean r(vhc1 vhc1Var, Object obj) {
        yum yumVar = (yum) obj;
        List list = yumVar.a;
        return (list == null || !(list.isEmpty() ^ true) || u890.j(yumVar.b, Boolean.FALSE) || yumVar.c) ? false : true;
    }

    public boolean t(Object obj) {
        switch (this.a) {
            case 1:
                throw td6.k(obj);
            default:
                f7l1 f7l1Var = ((p7l1) obj).a;
                return (f7l1Var != null ? f7l1Var.a : null) instanceof z6l1;
        }
    }

    public avm(app0 app0Var) {
        this.b = w3p1.o(new l4r(jd0.C, 1, mmp0.Y, new j4r(new cnp0(app0Var, (byte) 2)), mmp0.Z), mmp0.X);
    }

    public avm(q7l1 q7l1Var) {
        this.b = q7l1Var.d;
    }
}
