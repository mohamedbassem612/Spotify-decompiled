package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pci0 extends hab0 implements ju30 {
    public static final pci0 b;
    public static final pci0 c;
    public static final pci0 d;
    public final /* synthetic */ byte a;

    static {
        int i = 11;
        b = new pci0(i, (byte) 0);
        c = new pci0(i, (byte) 1);
        d = new pci0(i, (byte) 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pci0(int i, byte b2) {
        super(i);
        this.a = b2;
    }

    public final Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        hei0 hei0Var = null;
        switch (this.a) {
            case 0:
                nbw0 nbw0Var = (nbw0) obj;
                yo60 yo60Var = (yo60) obj2;
                jo70 jo70Var = (jo70) obj3;
                prl prlVar = (prl) obj4;
                nbw0 nbw0Var2 = (nbw0) obj7;
                xkk1 xkk1Var = (xkk1) obj8;
                xei0 xei0Var = new xei0(nbw0Var, yo60Var, jo70Var, prlVar, (xkk1) obj5, (e2k1) obj6, (w281) obj9, xkk1Var, (l1z) obj10, (mtl) obj11, null, 1024);
                if (yo60Var != null) {
                    hei0Var = new hei0(nbw0Var2 == null ? nbw0Var : nbw0Var2, yo60Var, jo70Var, prlVar, xkk1Var);
                }
                return new hci0(xei0Var, hei0Var);
            case 1:
                return new p4r((jo70) obj, (xkk1) obj2, (hll) obj3, (a7q0) obj4, (zoy0) obj5, (hzy) obj6, (fuj0) obj7, (dxc0) obj8, (ldj1) obj9, (mtl) obj10, (Boolean) obj11);
            default:
                rrt0 rrt0Var = (rrt0) obj;
                j6u j6uVar = (n6u) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
                iix0 iix0Var = (iix0) obj5;
                q1v q1vVar = (q1v) obj6;
                me2 me2Var = (me2) obj7;
                boolean zBooleanValue3 = ((Boolean) obj8).booleanValue();
                t6g1 t6g1Var = (t6g1) obj9;
                xn70 xn70Var = (xn70) obj10;
                boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                if (rrt0Var == null) {
                    rrt0Var = rrt0.b;
                }
                rrt0 rrt0Var2 = rrt0Var;
                if (j6uVar == null) {
                    j6uVar = j6u.a;
                }
                return new k910(t6g1Var, q1vVar != null ? new dt11(q1vVar, 2) : new dt11((q1v) null, 3), iix0Var, j6uVar, rrt0Var2, zBooleanValue2, zBooleanValue, zBooleanValue3, (Double) null, me2Var, xn70Var, zBooleanValue4, 528);
        }
    }
}
