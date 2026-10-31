package p;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class my6 implements yt11 {
    public final String a;
    public final String b;
    public final aas c;
    public final jr6 d;
    public final y6r0 e;
    public final vgm f;
    public final btt0 g;
    public final c8b h;
    public final q8n i;
    public final wr00 j;
    public final t740 k;
    public final kly0 l;
    public final yqg m;
    public final vb2 n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q9d1 f19p;

    public my6(Context context, String str, String str2, aas aasVar, jr6 jr6Var, y6r0 y6r0Var, vgm vgmVar, btt0 btt0Var, c8b c8bVar, q8n q8nVar, wr00 wr00Var, t740 t740Var, kly0 kly0Var, yqg yqgVar, vb2 vb2Var, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = aasVar;
        this.d = jr6Var;
        this.e = y6r0Var;
        this.f = vgmVar;
        this.g = btt0Var;
        this.h = c8bVar;
        this.i = q8nVar;
        this.j = wr00Var;
        this.k = t740Var;
        this.l = kly0Var;
        this.m = yqgVar;
        this.n = vb2Var;
        this.o = z;
        ng5 ng5Var = ng5.Y0;
        plm plmVar = new plm(context, 2132018135);
        int iO = ago1.o(plmVar, 2130968844, 0);
        int iO2 = ago1.o(plmVar, 2130968831, 0);
        Drawable drawable = plmVar.getDrawable(2131231360);
        if (drawable != null) {
            drawable.setTint(iO);
        } else {
            drawable = null;
        }
        m9d1 m9d1Var = drawable != null ? new m9d1(iO2, new ads(drawable, null), ng5Var) : null;
        this.f19p = new q9d1(m9d1Var != null ? new vu11(m9d1Var.a, m9d1Var.b, new qt(this, (lnm) null, (byte) 14)) : null, (vu11) null);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0129  */
    /* JADX WARN: Code duplicated, block: B:65:0x0143  */
    /* JADX WARN: Code duplicated, block: B:68:0x0157 A[PHI: r0 r2 r3 r8 r13
      0x0157: PHI (r0v18 java.lang.String) = (r0v14 java.lang.String), (r0v23 java.lang.String) binds: [B:66:0x0154, B:17:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0157: PHI (r2v19 java.lang.Object) = (r2v17 java.lang.Object), (r2v1 java.lang.Object) binds: [B:66:0x0154, B:17:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0157: PHI (r3v8 p.ou80) = (r3v5 p.ou80), (r3v9 p.ou80) binds: [B:66:0x0154, B:17:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0157: PHI (r8v6 long) = (r8v4 long), (r8v7 long) binds: [B:66:0x0154, B:17:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0157: PHI (r13v10 p.tv80) = (r13v8 p.tv80), (r13v11 p.tv80) binds: [B:66:0x0154, B:17:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x015f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0178  */
    /* JADX WARN: Code duplicated, block: B:75:0x0181  */
    /* JADX WARN: Code duplicated, block: B:76:0x0185  */
    /* JADX WARN: Code duplicated, block: B:79:0x019c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:80:0x019d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object a(unb1 unb1Var, tv80 tv80Var, onm onmVar) {
        jy6 jy6Var;
        long jB;
        jmb1 jmb1Var;
        String str;
        tv80 tv80Var2;
        ou80 ou80Var;
        String str2;
        ur1 ur1Var;
        ky6 ky6Var;
        bu6 bu6Var;
        tv80 tv80Var3;
        ky6 ky6Var2;
        tv80 tv80Var4 = tv80Var;
        if (onmVar instanceof jy6) {
            jy6Var = (jy6) onmVar;
            int i = jy6Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                jy6Var.h = i - Integer.MIN_VALUE;
            } else {
                jy6Var = new jy6(this, onmVar);
            }
        } else {
            jy6Var = new jy6(this, onmVar);
        }
        jy6 jy6Var2 = jy6Var;
        Object objC = jy6Var2.f;
        int i2 = jy6Var2.h;
        q8n q8nVar = this.i;
        rih1 rih1Var = rih1.a;
        Object obj = d9n.a;
        switch (i2) {
            case 0:
                hm5.M(objC);
                ou80 ou80Var2 = tv80Var4 != null ? tv80Var4.a : null;
                jB = this.m.b();
                jmb1Var = unb1Var instanceof jmb1 ? (jmb1) unb1Var : null;
                if (jmb1Var != null) {
                    str = jmb1Var.a.a;
                    ke2 ke2Var = jmb1Var.o;
                    ke2 ke2Var2 = ke2Var instanceof ke2 ? ke2Var : null;
                    if (this.o && ke2Var2 != null && ke2Var2.a) {
                        hb1 hb1Var = new hb1(this, ke2Var2, tv80Var4, (lnm) null, (byte) 17);
                        jy6Var2.a = null;
                        jy6Var2.b = null;
                        jy6Var2.c = null;
                        jy6Var2.d = null;
                        jy6Var2.e = jB;
                        jy6Var2.h = 1;
                        if (fn31.Y(q8nVar, hb1Var, jy6Var2) == obj) {
                        }
                    } else {
                        tv80Var2 = null;
                        if (jmb1Var.m) {
                            opv0 opv0Var = (opv0) this.l.get();
                            jy6Var2.a = tv80Var4;
                            jy6Var2.b = null;
                            jy6Var2.c = jmb1Var;
                            jy6Var2.d = str;
                            jy6Var2.e = jB;
                            jy6Var2.h = 2;
                            objC = opv0Var.c(str, jy6Var2);
                            if (objC != obj) {
                                ur1Var = new ur1(this, jmb1Var, tv80Var4, (hpe0) objC, str, (lnm) null);
                                jy6Var2.a = tv80Var2;
                                jy6Var2.b = tv80Var2;
                                jy6Var2.c = tv80Var2;
                                jy6Var2.d = tv80Var2;
                                jy6Var2.e = jB;
                                jy6Var2.h = 3;
                                if (fn31.Y(q8nVar, ur1Var, jy6Var2) == obj) {
                                }
                            }
                        } else {
                            jy6Var2.a = null;
                            jy6Var2.b = ou80Var2;
                            jy6Var2.c = null;
                            jy6Var2.d = str;
                            jy6Var2.e = jB;
                            jy6Var2.h = 4;
                            Object objD = d(str, jy6Var2);
                            if (objD != obj) {
                                ou80Var = ou80Var2;
                                objC = objD;
                                str2 = str;
                                if (((Boolean) objC).booleanValue()) {
                                    ky6Var = new ky6(this, str2, tv80Var2, (byte) 0);
                                    jy6Var2.a = tv80Var2;
                                    jy6Var2.b = tv80Var2;
                                    jy6Var2.c = tv80Var2;
                                    jy6Var2.d = tv80Var2;
                                    jy6Var2.e = jB;
                                    jy6Var2.h = 5;
                                    if (fn31.Y(q8nVar, ky6Var, jy6Var2) != obj) {
                                    }
                                } else {
                                    jy6Var2.a = tv80Var2;
                                    jy6Var2.b = ou80Var;
                                    jy6Var2.c = tv80Var2;
                                    jy6Var2.d = str2;
                                    jy6Var2.e = jB;
                                    jy6Var2.h = 6;
                                    objC = e(str2, jy6Var2);
                                    if (objC != obj) {
                                        if (((Boolean) objC).booleanValue()) {
                                            ky6Var2 = new ky6(this, str2, tv80Var2, (byte) 1);
                                            jy6Var2.a = tv80Var2;
                                            jy6Var2.b = tv80Var2;
                                            jy6Var2.c = tv80Var2;
                                            jy6Var2.d = tv80Var2;
                                            jy6Var2.e = jB;
                                            jy6Var2.h = 7;
                                            if (fn31.Y(q8nVar, ky6Var2, jy6Var2) != obj) {
                                            }
                                        } else {
                                            bu6Var = new bu6(this.b, str2);
                                            if (ou80Var != null) {
                                                tv80Var3 = ou80Var.a;
                                            } else {
                                                tv80Var3 = tv80Var2;
                                            }
                                            jy6Var2.a = tv80Var2;
                                            jy6Var2.b = tv80Var2;
                                            jy6Var2.c = tv80Var2;
                                            jy6Var2.d = tv80Var2;
                                            jy6Var2.e = jB;
                                            jy6Var2.h = 8;
                                            if (this.d.a(bu6Var, tv80Var3, jB, jy6Var2) != obj) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return obj;
                }
                return rih1Var;
            case 1:
                hm5.M(objC);
                return rih1Var;
            case 2:
                long j = jy6Var2.e;
                String str3 = jy6Var2.d;
                jmb1 jmb1Var2 = jy6Var2.c;
                tv80 tv80Var5 = jy6Var2.a;
                hm5.M(objC);
                str = str3;
                jmb1Var = jmb1Var2;
                tv80Var4 = tv80Var5;
                jB = j;
                tv80Var2 = null;
                ur1Var = new ur1(this, jmb1Var, tv80Var4, (hpe0) objC, str, (lnm) null);
                jy6Var2.a = tv80Var2;
                jy6Var2.b = tv80Var2;
                jy6Var2.c = tv80Var2;
                jy6Var2.d = tv80Var2;
                jy6Var2.e = jB;
                jy6Var2.h = 3;
                if (fn31.Y(q8nVar, ur1Var, jy6Var2) == obj) {
                    return obj;
                }
                return rih1Var;
            case 3:
                hm5.M(objC);
                return rih1Var;
            case 4:
                jB = jy6Var2.e;
                str2 = jy6Var2.d;
                ou80Var = jy6Var2.b;
                hm5.M(objC);
                tv80Var2 = null;
                if (((Boolean) objC).booleanValue()) {
                    ky6Var = new ky6(this, str2, tv80Var2, (byte) 0);
                    jy6Var2.a = tv80Var2;
                    jy6Var2.b = tv80Var2;
                    jy6Var2.c = tv80Var2;
                    jy6Var2.d = tv80Var2;
                    jy6Var2.e = jB;
                    jy6Var2.h = 5;
                    if (fn31.Y(q8nVar, ky6Var, jy6Var2) != obj) {
                        return rih1Var;
                    }
                } else {
                    jy6Var2.a = tv80Var2;
                    jy6Var2.b = ou80Var;
                    jy6Var2.c = tv80Var2;
                    jy6Var2.d = str2;
                    jy6Var2.e = jB;
                    jy6Var2.h = 6;
                    objC = e(str2, jy6Var2);
                    if (objC != obj) {
                        if (((Boolean) objC).booleanValue()) {
                            ky6Var2 = new ky6(this, str2, tv80Var2, (byte) 1);
                            jy6Var2.a = tv80Var2;
                            jy6Var2.b = tv80Var2;
                            jy6Var2.c = tv80Var2;
                            jy6Var2.d = tv80Var2;
                            jy6Var2.e = jB;
                            jy6Var2.h = 7;
                            if (fn31.Y(q8nVar, ky6Var2, jy6Var2) != obj) {
                                return rih1Var;
                            }
                        } else {
                            bu6Var = new bu6(this.b, str2);
                            if (ou80Var != null) {
                                tv80Var3 = ou80Var.a;
                            } else {
                                tv80Var3 = tv80Var2;
                            }
                            jy6Var2.a = tv80Var2;
                            jy6Var2.b = tv80Var2;
                            jy6Var2.c = tv80Var2;
                            jy6Var2.d = tv80Var2;
                            jy6Var2.e = jB;
                            jy6Var2.h = 8;
                            if (this.d.a(bu6Var, tv80Var3, jB, jy6Var2) != obj) {
                                return rih1Var;
                            }
                        }
                    }
                }
                return obj;
            case 5:
                hm5.M(objC);
                return rih1Var;
            case 6:
                jB = jy6Var2.e;
                str2 = jy6Var2.d;
                ou80Var = jy6Var2.b;
                hm5.M(objC);
                tv80Var2 = null;
                if (((Boolean) objC).booleanValue()) {
                    ky6Var2 = new ky6(this, str2, tv80Var2, (byte) 1);
                    jy6Var2.a = tv80Var2;
                    jy6Var2.b = tv80Var2;
                    jy6Var2.c = tv80Var2;
                    jy6Var2.d = tv80Var2;
                    jy6Var2.e = jB;
                    jy6Var2.h = 7;
                    if (fn31.Y(q8nVar, ky6Var2, jy6Var2) != obj) {
                        return obj;
                    }
                    return rih1Var;
                }
                bu6Var = new bu6(this.b, str2);
                if (ou80Var != null) {
                    tv80Var3 = ou80Var.a;
                } else {
                    tv80Var3 = tv80Var2;
                }
                jy6Var2.a = tv80Var2;
                jy6Var2.b = tv80Var2;
                jy6Var2.c = tv80Var2;
                jy6Var2.d = tv80Var2;
                jy6Var2.e = jB;
                jy6Var2.h = 8;
                if (this.d.a(bu6Var, tv80Var3, jB, jy6Var2) != obj) {
                    return obj;
                }
                return rih1Var;
            case 7:
                hm5.M(objC);
                return rih1Var;
            case 8:
                hm5.M(objC);
                return rih1Var;
            default:
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public final s9d1 b() {
        return this.f19p;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(unb1 unb1Var, tv80 tv80Var, onm onmVar) {
        ly6 ly6Var;
        if (onmVar instanceof ly6) {
            ly6Var = (ly6) onmVar;
            int i = ly6Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ly6Var.e = i - Integer.MIN_VALUE;
            } else {
                ly6Var = new ly6(this, onmVar);
            }
        } else {
            ly6Var = new ly6(this, onmVar);
        }
        Object objD = ly6Var.c;
        int i2 = ly6Var.e;
        rih1 rih1Var = rih1.a;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objD);
            jmb1 jmb1Var = unb1Var instanceof jmb1 ? (jmb1) unb1Var : null;
            if (jmb1Var != null) {
                String str = jmb1Var.a.a;
                ly6Var.a = unb1Var;
                ly6Var.b = tv80Var;
                ly6Var.e = 1;
                objD = d(str, ly6Var);
                if (objD != obj) {
                }
                return obj;
            }
            return rih1Var;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objD);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        tv80Var = ly6Var.b;
        unb1Var = ly6Var.a;
        hm5.M(objD);
        unb1 unb1Var2 = unb1Var;
        tv80 tv80Var2 = tv80Var;
        if (!((Boolean) objD).booleanValue() && tv80Var2 != null) {
            hb1 hb1Var = new hb1(this, unb1Var2, tv80Var2, (lnm) null, (byte) 18);
            ly6Var.a = null;
            ly6Var.b = null;
            ly6Var.e = 2;
            if (fn31.Y(this.i, hb1Var, ly6Var) == obj) {
                return obj;
            }
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, onm onmVar) {
        hy6 hy6Var;
        ttt0 ttt0Var;
        if (onmVar instanceof hy6) {
            hy6Var = (hy6) onmVar;
            int i = hy6Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hy6Var.c = i - Integer.MIN_VALUE;
            } else {
                hy6Var = new hy6(this, onmVar);
            }
        } else {
            hy6Var = new hy6(this, onmVar);
        }
        Object objB = hy6Var.a;
        int i2 = hy6Var.c;
        boolean z = true;
        if (i2 == 0) {
            hm5.M(objB);
            hy6Var.c = 1;
            objB = this.g.b(str, hy6Var);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objB);
        }
        vtt0 vtt0Var = (wtt0) ((zob1) objB).getValue();
        if (!(vtt0Var instanceof vtt0) || ((ttt0Var = vtt0Var.a) != ttt0.e && ttt0Var != ttt0.b)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, onm onmVar) {
        iy6 iy6Var;
        if (onmVar instanceof iy6) {
            iy6Var = (iy6) onmVar;
            int i = iy6Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iy6Var.c = i - Integer.MIN_VALUE;
            } else {
                iy6Var = new iy6(this, onmVar);
            }
        } else {
            iy6Var = new iy6(this, onmVar);
        }
        Object objB = iy6Var.a;
        int i2 = iy6Var.c;
        if (i2 == 0) {
            hm5.M(objB);
            iy6Var.c = 1;
            objB = this.g.b(str, iy6Var);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objB);
        }
        vtt0 vtt0Var = (wtt0) ((zob1) objB).getValue();
        return Boolean.valueOf((vtt0Var instanceof vtt0) && vtt0Var.a == ttt0.a);
    }
}
