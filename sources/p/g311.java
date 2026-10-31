package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class g311 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g311(t5j1 t5j1Var, q5t0 q5t0Var, int i) {
        this.a = (byte) 2;
        this.c = t5j1Var;
        this.d = q5t0Var;
        this.b = i;
    }

    public final Object invoke(Object obj) {
        h4k h4kVar;
        rih1 rih1Var;
        h4k h4kVar2;
        rih1 rih1Var2;
        int i;
        byte b = this.a;
        rih1 rih1Var3 = rih1.a;
        int i2 = 0;
        int i3 = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                h311 h311Var = (h311) obj3;
                sdn0 sdn0Var = (sdn0) obj2;
                h4k h4kVar3 = (j3k) obj;
                if (h311Var.e == i3 && u890.j(sdn0Var, h311Var.f) && (h4kVar3 instanceof h4k)) {
                    long[] jArr = sdn0Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i4 = 0;
                        while (true) {
                            long j = jArr[i4];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i5 = 8;
                                int i6 = 8 - ((~(i4 - length)) >>> 31);
                                int i7 = i2;
                                while (i7 < i6) {
                                    if ((255 & j) < 128) {
                                        int i8 = (i4 << 3) + i7;
                                        Object obj4 = sdn0Var.b[i8];
                                        boolean z = sdn0Var.c[i8] != i3;
                                        if (z) {
                                            i = i5;
                                            h4k h4kVar4 = h4kVar3;
                                            h4kVar2 = h4kVar3;
                                            nen0 nen0Var = h4kVar4.g;
                                            dm5.Z(nen0Var, obj4, h311Var);
                                            rih1Var2 = rih1Var3;
                                            if (obj4 instanceof mdt) {
                                                mdt mdtVar = (mdt) obj4;
                                                if (!nen0Var.c(mdtVar)) {
                                                    dm5.a0(h4kVar4.t, mdtVar);
                                                }
                                                nen0 nen0Var2 = h311Var.g;
                                                if (nen0Var2 != null) {
                                                    nen0Var2.k(obj4);
                                                }
                                            }
                                        } else {
                                            h4kVar2 = h4kVar3;
                                            rih1Var2 = rih1Var3;
                                            i = i5;
                                        }
                                        if (z) {
                                            sdn0Var.f(i8);
                                        }
                                    } else {
                                        h4kVar2 = h4kVar3;
                                        rih1Var2 = rih1Var3;
                                        i = i5;
                                    }
                                    j >>= i;
                                    i7++;
                                    i5 = i;
                                    h4kVar3 = h4kVar2;
                                    rih1Var3 = rih1Var2;
                                }
                                h4kVar = h4kVar3;
                                rih1Var = rih1Var3;
                                if (i6 != i5) {
                                    return rih1Var;
                                }
                            } else {
                                h4kVar = h4kVar3;
                                rih1Var = rih1Var3;
                            }
                            if (i4 == length) {
                                return rih1Var;
                            }
                            i4++;
                            h4kVar3 = h4kVar;
                            rih1Var3 = rih1Var;
                            i2 = 0;
                        }
                    }
                }
                return rih1Var3;
            case 1:
                xr41 xr41Var = (xr41) obj3;
                q5t0 q5t0Var = (q5t0) obj2;
                p5t0 p5t0Var = (p5t0) obj;
                int iS = xr41Var.O0.a.s();
                if (iS < 0) {
                    iS = 0;
                }
                if (iS <= i3) {
                    i3 = iS;
                }
                int i9 = -i3;
                boolean z2 = xr41Var.P0;
                int i10 = z2 ? 0 : i9;
                int i11 = z2 ? i9 : 0;
                p5t0Var.a = true;
                p5t0.n(p5t0Var, q5t0Var, i10, i11, (iu30) null, 12);
                p5t0Var.a = false;
                return rih1Var3;
            default:
                t5j1 t5j1Var = (t5j1) obj3;
                q5t0 q5t0Var2 = (q5t0) obj2;
                p5t0 p5t0Var2 = (p5t0) obj;
                int i12 = t5j1Var.b;
                r6e1 r6e1Var = t5j1Var.a;
                cgg1 cgg1Var = t5j1Var.c;
                z9e1 z9e1Var = (z9e1) t5j1Var.d.invoke();
                r6e1Var.a(qqq0.a, x3p1.s(p5t0Var2, i12, cgg1Var, z9e1Var != null ? z9e1Var.a : null, false, q5t0Var2.a), i3, q5t0Var2.b);
                p5t0Var2.k(q5t0Var2, 0, Math.round(-r6e1Var.a.s()), 0.0f);
                return rih1Var3;
        }
    }

    public /* synthetic */ g311(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }
}
