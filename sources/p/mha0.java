package p;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mha0 {
    public final y6 a;
    public final boolean b;
    public int c;

    public mha0(vfa0 vfa0Var, y6 y6Var) {
        this.a = y6Var;
        this.b = vfa0Var.c;
    }

    public final ega0 a() {
        ega0 uga0Var;
        y6 y6Var = this.a;
        byte B = y6Var.B();
        if (B == 1) {
            return d(true);
        }
        if (B == 0) {
            return d(false);
        }
        if (B != 6) {
            if (B == 8) {
                return b();
            }
            y6.v(y6Var, "Cannot read Json element because of unexpected ".concat(cto1.v(B)), 0, (String) null, 6);
            throw null;
        }
        int i = this.c + 1;
        this.c = i;
        if (i == 200) {
            uga0Var = (ega0) m6p1.u(new i3b(new kha0(this, (lnm) null), (byte) 29));
        } else {
            byte bJ = y6Var.j((byte) 6);
            if (y6Var.B() == 4) {
                y6.v(y6Var, "Unexpected leading comma", 0, (String) null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (y6Var.e()) {
                String strP = this.b ? y6Var.p() : y6Var.n();
                y6Var.j((byte) 5);
                linkedHashMap.put(strP, a());
                bJ = y6Var.i();
                if (bJ != 4) {
                    if (bJ == 7) {
                        break;
                    }
                    y6.v(y6Var, "Expected end of the object or comma", 0, (String) null, 6);
                    throw null;
                }
            }
            if (bJ == 6) {
                y6Var.j((byte) 7);
            } else if (bJ == 4) {
                vvm1.A(y6Var);
                throw null;
            }
            uga0Var = new uga0(linkedHashMap);
        }
        this.c--;
        return uga0Var;
    }

    public final pfa0 b() {
        y6 y6Var = this.a;
        byte bI = y6Var.i();
        if (y6Var.B() == 4) {
            y6.v(y6Var, "Unexpected leading comma", 0, (String) null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (y6Var.e()) {
            arrayList.add(a());
            bI = y6Var.i();
            if (bI != 4) {
                boolean z = bI == 9;
                int i = y6Var.b;
                if (!z) {
                    y6.v(y6Var, "Expected end of the array or comma", i, (String) null, 4);
                    throw null;
                }
            }
        }
        if (bI == 8) {
            y6Var.j((byte) 9);
        } else if (bI == 4) {
            vvm1.z(y6Var, "array");
            throw null;
        }
        return new pfa0(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009b  */
    /* JADX WARN: Code duplicated, block: B:35:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(bcr bcrVar, faa faaVar) {
        lha0 lha0Var;
        bcr bcrVar2;
        byte bI;
        LinkedHashMap linkedHashMap;
        mha0 mha0Var;
        y6 y6Var;
        if (faaVar instanceof lha0) {
            lha0Var = (lha0) faaVar;
            int i = lha0Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                lha0Var.h = i - Integer.MIN_VALUE;
            } else {
                lha0Var = new lha0(this, faaVar);
            }
        } else {
            lha0Var = new lha0(this, faaVar);
        }
        Object obj = lha0Var.f;
        int i2 = lha0Var.h;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i4 = lha0Var.e;
            String str = lha0Var.d;
            linkedHashMap = lha0Var.c;
            mha0Var = lha0Var.b;
            bcrVar2 = lha0Var.a;
            hm5.M(obj);
            linkedHashMap.put(str, (ega0) obj);
            bI = mha0Var.a.i();
            if (bI == 4) {
                i3 = i4;
                this = mha0Var;
            } else if (bI != 7) {
                y6.v(mha0Var.a, "Expected end of the object or comma", 0, (String) null, 6);
                throw null;
            }
            y6Var = mha0Var.a;
            if (bI == 6) {
                y6Var.j((byte) 7);
            } else if (bI == 4) {
                vvm1.A(y6Var);
                throw null;
            }
            return new uga0(linkedHashMap);
        }
        hm5.M(obj);
        y6 y6Var2 = this.a;
        byte bJ = y6Var2.j((byte) 6);
        if (y6Var2.B() == 4) {
            y6.v(y6Var2, "Unexpected leading comma", 0, (String) null, 6);
            throw null;
        }
        bcrVar2 = bcrVar;
        bI = bJ;
        linkedHashMap = new LinkedHashMap();
        y6 y6Var3 = this.a;
        if (!y6Var3.e()) {
            mha0Var = this;
            y6Var = mha0Var.a;
            if (bI == 6) {
                y6Var.j((byte) 7);
            } else if (bI == 4) {
                vvm1.A(y6Var);
                throw null;
            }
            return new uga0(linkedHashMap);
        }
        String strP = this.b ? y6Var3.p() : y6Var3.n();
        y6Var3.j((byte) 5);
        lha0Var.a = bcrVar2;
        lha0Var.b = this;
        lha0Var.c = linkedHashMap;
        lha0Var.d = strP;
        lha0Var.e = i3;
        lha0Var.h = 1;
        bcrVar2.a(lha0Var);
        return d9n.a;
    }

    public final aha0 d(boolean z) {
        boolean z2 = this.b;
        y6 y6Var = this.a;
        String strP = (z2 || !z) ? y6Var.p() : y6Var.n();
        return (z || !u890.j(strP, "null")) ? new nga0(strP, z) : rga0.INSTANCE;
    }
}
