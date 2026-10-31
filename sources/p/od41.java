package p;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class od41 implements nd41 {
    public final iu30 a;
    public final nen0 b;
    public nen0 c;

    public od41(Map map, iu30 iu30Var) {
        nen0 nen0Var;
        this.a = iu30Var;
        if (map == null || map.isEmpty()) {
            nen0Var = null;
        } else {
            nen0Var = new nen0(map.size());
            for (Map.Entry entry : map.entrySet()) {
                nen0Var.m(entry.getKey(), entry.getValue());
            }
        }
        this.b = nen0Var;
    }

    @Override // p.nd41
    public final md41 a(String str, Function0 function0) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!eth.H(str.charAt(i))) {
                nen0 nen0Var = this.c;
                if (nen0Var == null) {
                    long[] jArr = hj41.a;
                    nen0Var = new nen0();
                    this.c = nen0Var;
                }
                Object objG = nen0Var.g(str);
                if (objG == null) {
                    objG = new ArrayList();
                    nen0Var.m(str, objG);
                }
                ((List) objG).add(function0);
                return new g931(nen0Var, str, function0, (byte) 12);
            }
        }
        hhg1.n("Registered key is empty or blank");
        return null;
    }

    @Override // p.nd41
    public final boolean d(Object obj) {
        return ((Boolean) this.a.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    @Override // p.nd41
    public final Map e() {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        nen0 nen0Var = this.b;
        if (nen0Var == null && this.c == null) {
            return b7x.a;
        }
        int i3 = 0;
        int i4 = nen0Var != null ? nen0Var.e : 0;
        nen0 nen0Var2 = this.c;
        HashMap map = new HashMap(i4 + (nen0Var2 != null ? nen0Var2.e : 0));
        char c2 = 7;
        long j4 = -9187201950435737472L;
        int i5 = 8;
        if (nen0Var != null) {
            Object[] objArr = nen0Var.b;
            Object[] objArr2 = nen0Var.c;
            long[] jArr3 = nen0Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                j2 = 128;
                while (true) {
                    long j5 = jArr3[i6];
                    j3 = 255;
                    if ((((~j5) << c2) & j5 & j4) != j4) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j5 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                map.put((String) objArr[i9], (List) objArr2[i9]);
                            }
                            j5 >>= 8;
                            i8++;
                            c2 = c2;
                            j4 = j4;
                        }
                        c = c2;
                        j = j4;
                        if (i7 != 8) {
                            break;
                        }
                    } else {
                        c = c2;
                        j = j4;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c2 = c;
                    j4 = j;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 128;
                j3 = 255;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 128;
            j3 = 255;
        }
        nen0 nen0Var3 = this.c;
        if (nen0Var3 != null) {
            Object[] objArr3 = nen0Var3.b;
            Object[] objArr4 = nen0Var3.c;
            long[] jArr4 = nen0Var3.a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i10 = 0;
                while (true) {
                    long j6 = jArr4[i10];
                    if ((((~j6) << c) & j6 & j) != j) {
                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                        int i12 = i3;
                        while (i12 < i11) {
                            if ((j6 & j3) < j2) {
                                int i13 = (i10 << 3) + i12;
                                Object obj = objArr3[i13];
                                List list = (List) objArr4[i13];
                                String str = (String) obj;
                                i2 = i5;
                                if (list.size() == 1) {
                                    Object objInvoke = ((Function0) list.get(i3)).invoke();
                                    if (objInvoke != null) {
                                        if (!d(objInvoke)) {
                                            bhn0.f(k5p1.m(objInvoke));
                                            return null;
                                        }
                                        map.put(str, p7h.H(new Object[]{objInvoke}));
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    int size = list.size();
                                    ArrayList arrayList = new ArrayList(size);
                                    while (i3 < size) {
                                        long[] jArr5 = jArr4;
                                        Object objInvoke2 = ((Function0) list.get(i3)).invoke();
                                        if (objInvoke2 != null && !d(objInvoke2)) {
                                            bhn0.f(k5p1.m(objInvoke2));
                                            return null;
                                        }
                                        arrayList.add(objInvoke2);
                                        i3++;
                                        jArr4 = jArr5;
                                    }
                                    jArr2 = jArr4;
                                    map.put(str, arrayList);
                                }
                            } else {
                                jArr2 = jArr4;
                                i2 = i5;
                            }
                            j6 >>= i2;
                            i12++;
                            i5 = i2;
                            jArr4 = jArr2;
                            i3 = 0;
                        }
                        jArr = jArr4;
                        i = i5;
                        if (i11 != i) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i = i5;
                    }
                    if (i10 == length2) {
                        break;
                    }
                    i10++;
                    i5 = i;
                    jArr4 = jArr;
                    i3 = 0;
                }
            }
        }
        return map;
    }

    @Override // p.nd41
    public final Object f(String str) {
        nen0 nen0Var = this.b;
        List list = nen0Var != null ? (List) nen0Var.k(str) : null;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && nen0Var != null) {
            List listSubList = list.subList(1, list.size());
            int iF = nen0Var.f(str);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = nen0Var.c;
            Object obj = objArr[iF];
            nen0Var.b[iF] = str;
            objArr[iF] = listSubList;
        }
        return list.get(0);
    }
}
