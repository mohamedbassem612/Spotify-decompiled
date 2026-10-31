package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class o161 implements e261, Iterable, ola0 {
    public final nen0 a;
    public tpg0 b;
    public boolean c;
    public boolean d;

    public o161() {
        long[] jArr = hj41.a;
        this.a = new nen0();
    }

    @Override // p.e261
    public final void b(d261 d261Var, Object obj) {
        boolean z = obj instanceof we;
        nen0 nen0Var = this.a;
        if (z && nen0Var.c(d261Var)) {
            we weVar = (we) nen0Var.g(d261Var);
            we weVar2 = (we) obj;
            String str = weVar2.a;
            if (str == null) {
                str = weVar.a;
            }
            cv30 cv30Var = weVar2.b;
            if (cv30Var == null) {
                cv30Var = weVar.b;
            }
            nen0Var.m(d261Var, new we(str, cv30Var));
        } else {
            nen0Var.m(d261Var, obj);
        }
        d261Var.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0055 A[LOOP:0: B:5:0x001c->B:15:0x0055, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:18:0x0058 A[EDGE_INSN: B:18:0x0058->B:16:0x0058 BREAK  A[LOOP:0: B:5:0x001c->B:15:0x0055], SYNTHETIC] */
    public final o161 c() {
        o161 o161Var = new o161();
        o161Var.c = this.c;
        o161Var.d = this.d;
        nen0 nen0Var = this.a;
        Object[] objArr = nen0Var.b;
        Object[] objArr2 = nen0Var.c;
        long[] jArr = nen0Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            o161Var.a.m(objArr[i4], objArr2[i4]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return o161Var;
    }

    public final Object d(d261 d261Var) {
        Object objG = this.a.g(d261Var);
        if (objG != null) {
            return objG;
        }
        bhn0.u("Key not present: ", d261Var, " - consider getOrElse or getOrNull");
        return null;
    }

    public final void e(o161 o161Var) {
        nen0 nen0Var = o161Var.a;
        Object[] objArr = nen0Var.b;
        Object[] objArr2 = nen0Var.c;
        long[] jArr = nen0Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        d261 d261Var = (d261) obj;
                        nen0 nen0Var2 = this.a;
                        Object objInvoke = d261Var.b.invoke(nen0Var2.g(d261Var), obj2);
                        if (objInvoke != null) {
                            nen0Var2.m(d261Var, objInvoke);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o161)) {
            return false;
        }
        o161 o161Var = (o161) obj;
        return this.a.equals(o161Var.a) && this.c == o161Var.c && this.d == o161Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(this.a.hashCode() * 31, 31, this.c);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        tpg0 tpg0Var = this.b;
        if (tpg0Var == null) {
            tpg0Var = new tpg0(this.a);
            this.b = tpg0Var;
        }
        return tpg0Var.entrySet().iterator();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0078 A[DONT_INVERT, PHI: r2
      0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x007a A[LOOP:0: B:12:0x0031->B:22:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x007d A[EDGE_INSN: B:26:0x007d->B:23:0x007d BREAK  A[LOOP:0: B:12:0x0031->B:22:0x007a], SYNTHETIC] */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.c) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.d) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        nen0 nen0Var = this.a;
        Object[] objArr = nen0Var.b;
        Object[] objArr2 = nen0Var.c;
        long[] jArr = nen0Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((d261) obj).a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return nmn1.r(this) + "{ " + ((Object) sb) + " }";
    }
}
