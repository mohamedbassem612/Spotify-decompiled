package p;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class ply {
    public static final long a = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(4.0f)) & 4294967295L);
    public static final float b = 1.5f;

    public static final void a(yk80 yk80Var, String str, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1844173804);
        int i2 = (x340Var.i(yk80Var) ? 4 : 2) | i | (x340Var.g(str) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            w2g0.c(d7e.r(1.0f, qim0Var, false), (tl3) null, apo.r(87442774, new o3((byte) 15, yk80Var, str, yk80Var.e == 1), x340Var), x340Var, 3072, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g6w(yk80Var, str, qim0Var, i, (byte) 21);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x019f  */
    /* JADX WARN: Code duplicated, block: B:105:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:108:0x0205  */
    /* JADX WARN: Code duplicated, block: B:110:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:? A[LOOP:1: B:93:0x0160->B:114:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:80:0x0104  */
    /* JADX WARN: Code duplicated, block: B:83:0x0117  */
    /* JADX WARN: Code duplicated, block: B:84:0x0130  */
    /* JADX WARN: Code duplicated, block: B:87:0x0149  */
    /* JADX WARN: Code duplicated, block: B:95:0x0166  */
    public static final void b(yk80 yk80Var, String str, String str2, String str3, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        Function0 function2;
        qim0 qim0Var2;
        boolean z;
        qim0 qim0Var3;
        h311 h311VarV;
        qim0 qim0Var4;
        int iC;
        int i3;
        String strN0;
        xkg0 xkg0Var;
        xkg0 xkg0VarB;
        List listD1;
        Iterator it;
        Object obj;
        Object next;
        bl80 bl80Var;
        LinkedHashMap linkedHashMap;
        String strN1;
        boolean z2;
        af5 af5VarG;
        int i4 = yk80Var.e;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(721694072);
        int i5 = (i & 6) == 0 ? (x340Var.i(yk80Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i5 |= x340Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= x340Var.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= x340Var.g(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i5 |= x340Var.i(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            function2 = function1;
            i5 |= x340Var.i(function2) ? 131072 : 65536;
        } else {
            function2 = function1;
        }
        int i6 = i2 & 64;
        if (i6 == 0) {
            if ((1572864 & i) == 0) {
                qim0Var2 = qim0Var;
                i5 |= x340Var.g(qim0Var2) ? 1048576 : 524288;
            }
            if ((599187 & i5) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i5 & 1, z)) {
                if (i6 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                iC = l1d.C(i4);
                if (iC != 0) {
                    i3 = 2131956672;
                } else {
                    if (iC == 1) {
                        eg.o();
                        return;
                    }
                    i3 = 2131956692;
                }
                String strO0 = cwl1.o0(x340Var, i3);
                x340Var.i0(-1940680857);
                if (i4 == 2 || str3 == null) {
                    x340Var.i0(-268278341);
                    x340Var.r(false);
                    strN0 = "\ue002";
                } else {
                    x340Var.i0(-268388112);
                    strN0 = cwl1.n0(2131956691, new Object[]{"\ue002", "\ue003"}, x340Var);
                    x340Var.r(false);
                }
                xkg0Var = new xkg0();
                xkg0Var.put("\ue002", str2);
                if (str3 != null) {
                    xkg0Var.put("\ue003", str3);
                }
                xkg0VarB = xkg0Var.b();
                listD1 = o7h.d1(yk80Var.c, 2);
                if (listD1.size() < 2) {
                    x340Var.i0(-268041594);
                    af5VarG = p8p1.g(strN0, xkg0VarB, xkg0VarB.keySet(), x340Var);
                    x340Var.r(false);
                    x340Var.r(false);
                    qim0Var4 = qim0Var4;
                } else {
                    x340Var.i0(-267959909);
                    x340Var.r(false);
                    List list = listD1;
                    it = list.iterator();
                    do {
                        obj = null;
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!((bl80) next).e);
                    bl80Var = (bl80) next;
                    for (Object obj2 : list) {
                        if (!((bl80) obj2).e) {
                            obj = obj2;
                            break;
                        }
                    }
                    bl80 bl80Var2 = (bl80) obj;
                    linkedHashMap = new LinkedHashMap((Map) xkg0VarB);
                    if (bl80Var != null || bl80Var2 == null) {
                        x340Var.i0(-267506255);
                        strN1 = cwl1.n0(2131956675, new Object[]{"\ue000", "\ue001", strN0}, x340Var);
                        linkedHashMap.put("\ue000", ((bl80) listD1.get(0)).b);
                        linkedHashMap.put("\ue001", ((bl80) listD1.get(1)).b);
                        z2 = false;
                        x340Var.r(false);
                    } else {
                        x340Var.i0(-267695386);
                        strN1 = cwl1.n0(2131956674, new Object[]{"\ue000", strN0}, x340Var);
                        linkedHashMap.put("\ue000", bl80Var2.b);
                        z2 = false;
                        x340Var.r(false);
                    }
                    af5VarG = p8p1.g(strN1, linkedHashMap, xkg0VarB.keySet(), x340Var);
                    x340Var.r(z2);
                }
                qim0 qim0Var5 = qim0Var4;
                gfx.b(18, apo.r(-585204179, new ta5(qim0Var5, function0, strO0, af5VarG, function2, yk80Var, str, (byte) 19), x340Var), x340Var, 54);
                qim0Var3 = qim0Var5;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ra5(yk80Var, str, str2, str3, function0, function1, qim0Var3, i, i2);
            }
        }
        i5 |= 1572864;
        qim0Var2 = qim0Var;
        if ((599187 & i5) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i5 & 1, z)) {
            if (i6 != 0) {
                qim0Var4 = nim0.a;
            } else {
                qim0Var4 = qim0Var2;
            }
            iC = l1d.C(i4);
            if (iC != 0) {
                i3 = 2131956672;
            } else {
                if (iC == 1) {
                    eg.o();
                    return;
                }
                i3 = 2131956692;
            }
            String strO1 = cwl1.o0(x340Var, i3);
            x340Var.i0(-1940680857);
            if (i4 == 2) {
                x340Var.i0(-268278341);
                x340Var.r(false);
                strN0 = "\ue002";
            } else {
                x340Var.i0(-268278341);
                x340Var.r(false);
                strN0 = "\ue002";
            }
            xkg0Var = new xkg0();
            xkg0Var.put("\ue002", str2);
            if (str3 != null) {
                xkg0Var.put("\ue003", str3);
            }
            xkg0VarB = xkg0Var.b();
            listD1 = o7h.d1(yk80Var.c, 2);
            if (listD1.size() < 2) {
                x340Var.i0(-268041594);
                af5VarG = p8p1.g(strN0, xkg0VarB, xkg0VarB.keySet(), x340Var);
                x340Var.r(false);
                x340Var.r(false);
                qim0Var4 = qim0Var4;
            } else {
                x340Var.i0(-267959909);
                x340Var.r(false);
                List list2 = listD1;
                it = list2.iterator();
                do {
                    obj = null;
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((bl80) next).e);
                bl80Var = (bl80) next;
                while (r2.hasNext()) {
                    if (!((bl80) obj2).e) {
                        obj = obj2;
                        break;
                    }
                }
                bl80 bl80Var3 = (bl80) obj;
                linkedHashMap = new LinkedHashMap((Map) xkg0VarB);
                if (bl80Var != null) {
                    x340Var.i0(-267506255);
                    strN1 = cwl1.n0(2131956675, new Object[]{"\ue000", "\ue001", strN0}, x340Var);
                    linkedHashMap.put("\ue000", ((bl80) listD1.get(0)).b);
                    linkedHashMap.put("\ue001", ((bl80) listD1.get(1)).b);
                    z2 = false;
                    x340Var.r(false);
                } else {
                    x340Var.i0(-267506255);
                    strN1 = cwl1.n0(2131956675, new Object[]{"\ue000", "\ue001", strN0}, x340Var);
                    linkedHashMap.put("\ue000", ((bl80) listD1.get(0)).b);
                    linkedHashMap.put("\ue001", ((bl80) listD1.get(1)).b);
                    z2 = false;
                    x340Var.r(false);
                }
                af5VarG = p8p1.g(strN1, linkedHashMap, xkg0VarB.keySet(), x340Var);
                x340Var.r(z2);
            }
            qim0 qim0Var6 = qim0Var4;
            gfx.b(18, apo.r(-585204179, new ta5(qim0Var6, function0, strO1, af5VarG, function2, yk80Var, str, (byte) 19), x340Var), x340Var, 54);
            qim0Var3 = qim0Var6;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ra5(yk80Var, str, str2, str3, function0, function1, qim0Var3, i, i2);
        }
    }
}
