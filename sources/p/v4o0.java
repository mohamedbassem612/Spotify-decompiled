package p;

import android.os.Build;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class v4o0 {
    public final o4o0 a;
    public final kqi0 b;
    public final kqi0 c;
    public final v1o0 d;
    public final q8n e;
    public final q8n f;
    public final mr20 g;

    public v4o0(o4o0 o4o0Var, kqi0 kqi0Var, kqi0 kqi0Var2, v1o0 v1o0Var, q8n q8nVar, q8n q8nVar2) {
        this.a = o4o0Var;
        this.b = kqi0Var;
        this.c = kqi0Var2;
        this.d = v1o0Var;
        this.e = q8nVar;
        this.f = q8nVar2;
        this.g = rqt0.u(Build.VERSION.SDK_INT < 31 ? h4p1.m(l4o0.a) : hu20.e(u4p1.b0(yoi1.g(o4o0Var.d.distinctUntilChanged()), new m3n0(this, (lnm) null, (byte) 15)), new t4o0((lnm) null, this, (byte) 0)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        q4o0 q4o0Var;
        if (onmVar instanceof q4o0) {
            q4o0Var = (q4o0) onmVar;
            int i = q4o0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                q4o0Var.c = i - Integer.MIN_VALUE;
            } else {
                q4o0Var = new q4o0(this, onmVar);
            }
        } else {
            q4o0Var = new q4o0(this, onmVar);
        }
        Object objJ = q4o0Var.a;
        int i2 = q4o0Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            o4o0 o4o0Var = this.a;
            Single map = o4o0Var.b.a().map(new jpa0(o4o0Var, (byte) 27));
            q4o0Var.c = 1;
            objJ = fc11.j(map, q4o0Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        return objJ;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0079  */
    /* JADX WARN: Code duplicated, block: B:24:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x007f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0084  */
    /* JADX WARN: Code duplicated, block: B:29:0x0088  */
    /* JADX WARN: Code duplicated, block: B:30:0x008d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0091  */
    /* JADX WARN: Code duplicated, block: B:34:0x0097  */
    /* JADX WARN: Code duplicated, block: B:36:0x009e  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00db A[PHI: r1 r13
      0x00db: PHI (r1v6 p.z0o0) = (r1v4 p.z0o0), (r1v8 p.z0o0) binds: [B:43:0x00d7, B:15:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x00db: PHI (r13v14 int) = (r13v12 int), (r13v17 int) binds: [B:43:0x00d7, B:15:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:55:0x0103  */
    /* JADX WARN: Code duplicated, block: B:58:0x011d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0128  */
    /* JADX WARN: Code duplicated, block: B:64:0x013e A[PHI: r1 r13
      0x013e: PHI (r1v11 p.z0o0) = (r1v9 p.z0o0), (r1v13 p.z0o0) binds: [B:62:0x013b, B:12:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x013e: PHI (r13v20 int) = (r13v18 int), (r13v23 int) binds: [B:62:0x013b, B:12:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0146  */
    /* JADX WARN: Code duplicated, block: B:69:0x015d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0161  */
    /* JADX WARN: Code duplicated, block: B:74:0x0165  */
    /* JADX WARN: Code duplicated, block: B:77:0x0179  */
    /* JADX WARN: Code duplicated, block: B:79:0x017d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:81:0x0196 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:82:0x0197  */
    /* JADX WARN: Code duplicated, block: B:84:0x019b  */
    /* JADX WARN: Code duplicated, block: B:85:0x019f  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a9  */
    public final Object b(n4o0 n4o0Var, lnm lnmVar) {
        r4o0 r4o0Var;
        m4o0 m4o0Var;
        z0o0 z0o0VarB;
        boolean z;
        kqi0 kqi0Var;
        s4o0 s4o0Var;
        z0o0 z0o0Var;
        int i;
        z0o0 z0o0Var2;
        int i2;
        Object objH;
        Object objH2;
        if (lnmVar instanceof r4o0) {
            r4o0Var = (r4o0) lnmVar;
            int i3 = r4o0Var.g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                r4o0Var.g = i3 - Integer.MIN_VALUE;
            } else {
                r4o0Var = new r4o0(this, lnmVar);
            }
        } else {
            r4o0Var = new r4o0(this, lnmVar);
        }
        Object objI = r4o0Var.e;
        int i4 = r4o0Var.g;
        q8n q8nVar = this.f;
        rih1 rih1Var = rih1.a;
        kqi0 kqi0Var2 = this.b;
        d9n d9nVar = d9n.a;
        switch (i4) {
            case 0:
                hm5.M(objI);
                r4o0Var.a = n4o0Var;
                r4o0Var.g = 1;
                objI = b5p1.i(this.g, r4o0Var);
                if (objI != d9nVar) {
                    m4o0Var = (m4o0) objI;
                    if (m4o0Var instanceof l4o0) {
                        z0o0VarB = null;
                    } else if (m4o0Var instanceof h4o0) {
                        z0o0VarB = n4o0Var.a();
                    } else if (m4o0Var instanceof i4o0) {
                        z0o0VarB = n4o0Var.c();
                    } else {
                        if (m4o0Var instanceof j4o0) {
                            eg.o();
                            return null;
                        }
                        z0o0VarB = n4o0Var.b();
                    }
                    if (z0o0VarB != null) {
                        z = z0o0VarB instanceof r0o0;
                        kqi0Var = this.c;
                        if (z) {
                            boolean zA = ((r0o0) z0o0VarB).a();
                            r4o0Var.a = null;
                            r4o0Var.b = m4o0Var;
                            r4o0Var.c = z0o0VarB;
                            r4o0Var.d = 0;
                            r4o0Var.g = 2;
                            objI = kqi0Var.i(zA, r4o0Var);
                            if (objI != d9nVar) {
                                z0o0Var2 = z0o0VarB;
                                i2 = 0;
                                if (((Boolean) objI).booleanValue()) {
                                    r4o0Var.a = null;
                                    r4o0Var.b = null;
                                    r4o0Var.c = z0o0Var2;
                                    r4o0Var.d = i2;
                                    r4o0Var.g = 3;
                                    if (kqi0Var2.w((r0o0) z0o0Var2, m4o0Var instanceof i4o0, r4o0Var) != d9nVar) {
                                        if (((r0o0) z0o0Var2).a()) {
                                            r4o0Var.a = null;
                                            r4o0Var.b = null;
                                            r4o0Var.c = null;
                                            r4o0Var.d = i2;
                                            r4o0Var.g = 4;
                                            objH = c921.H(q8nVar, new s4o0(this, (lnm) null, (byte) 1), r4o0Var);
                                            if (objH != d9nVar) {
                                                objH = rih1Var;
                                            }
                                            if (objH == d9nVar) {
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (z0o0VarB instanceof p0o0) {
                            boolean zA2 = ((p0o0) z0o0VarB).a();
                            r4o0Var.a = null;
                            r4o0Var.b = m4o0Var;
                            r4o0Var.c = z0o0VarB;
                            r4o0Var.d = 0;
                            r4o0Var.g = 5;
                            objI = kqi0Var.i(zA2, r4o0Var);
                            if (objI != d9nVar) {
                                z0o0Var = z0o0VarB;
                                i = 0;
                                if (((Boolean) objI).booleanValue()) {
                                    r4o0Var.a = null;
                                    r4o0Var.b = null;
                                    r4o0Var.c = z0o0Var;
                                    r4o0Var.d = i;
                                    r4o0Var.g = 6;
                                    kqi0Var2.v((p0o0) z0o0Var, m4o0Var instanceof i4o0, r4o0Var);
                                    if (rih1Var != d9nVar) {
                                        if (((p0o0) z0o0Var).a()) {
                                            r4o0Var.a = null;
                                            r4o0Var.b = null;
                                            r4o0Var.c = null;
                                            r4o0Var.d = i;
                                            r4o0Var.g = 7;
                                            objH2 = c921.H(q8nVar, new s4o0(this, (lnm) null, (byte) 1), r4o0Var);
                                            if (objH2 != d9nVar) {
                                                objH2 = rih1Var;
                                            }
                                            if (objH2 == d9nVar) {
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (z0o0VarB instanceof n0o0) {
                            r4o0Var.a = null;
                            r4o0Var.b = null;
                            r4o0Var.c = null;
                            r4o0Var.d = 0;
                            r4o0Var.g = 8;
                            kqi0Var2.u((n0o0) z0o0VarB, r4o0Var);
                            if (rih1Var == d9nVar) {
                            }
                        } else if (z0o0VarB instanceof o0o0) {
                            s4o0Var = new s4o0(this, (lnm) null, (byte) 0);
                            r4o0Var.a = null;
                            r4o0Var.b = null;
                            r4o0Var.c = null;
                            r4o0Var.d = 0;
                            r4o0Var.g = 9;
                            if (c921.H(this.e, s4o0Var, r4o0Var) == d9nVar) {
                            }
                        } else if (z0o0VarB instanceof m0o0) {
                            kqi0Var2.x();
                        } else if (!(z0o0VarB instanceof l0o0)) {
                            eg.o();
                            return null;
                        }
                    }
                    return rih1Var;
                }
                return d9nVar;
            case 1:
                n4o0Var = r4o0Var.a;
                hm5.M(objI);
                m4o0Var = (m4o0) objI;
                if (m4o0Var instanceof l4o0) {
                    z0o0VarB = null;
                } else if (m4o0Var instanceof h4o0) {
                    z0o0VarB = n4o0Var.a();
                } else if (m4o0Var instanceof i4o0) {
                    z0o0VarB = n4o0Var.c();
                } else {
                    if (m4o0Var instanceof j4o0) {
                        eg.o();
                        return null;
                    }
                    z0o0VarB = n4o0Var.b();
                }
                if (z0o0VarB != null) {
                    z = z0o0VarB instanceof r0o0;
                    kqi0Var = this.c;
                    if (z) {
                        boolean zA3 = ((r0o0) z0o0VarB).a();
                        r4o0Var.a = null;
                        r4o0Var.b = m4o0Var;
                        r4o0Var.c = z0o0VarB;
                        r4o0Var.d = 0;
                        r4o0Var.g = 2;
                        objI = kqi0Var.i(zA3, r4o0Var);
                        if (objI != d9nVar) {
                            z0o0Var2 = z0o0VarB;
                            i2 = 0;
                            if (((Boolean) objI).booleanValue()) {
                                r4o0Var.a = null;
                                r4o0Var.b = null;
                                r4o0Var.c = z0o0Var2;
                                r4o0Var.d = i2;
                                r4o0Var.g = 3;
                                if (kqi0Var2.w((r0o0) z0o0Var2, m4o0Var instanceof i4o0, r4o0Var) != d9nVar) {
                                    if (((r0o0) z0o0Var2).a()) {
                                        r4o0Var.a = null;
                                        r4o0Var.b = null;
                                        r4o0Var.c = null;
                                        r4o0Var.d = i2;
                                        r4o0Var.g = 4;
                                        objH = c921.H(q8nVar, new s4o0(this, (lnm) null, (byte) 1), r4o0Var);
                                        if (objH != d9nVar) {
                                            objH = rih1Var;
                                        }
                                        if (objH == d9nVar) {
                                        }
                                    }
                                }
                            }
                        }
                    } else if (z0o0VarB instanceof p0o0) {
                        boolean zA4 = ((p0o0) z0o0VarB).a();
                        r4o0Var.a = null;
                        r4o0Var.b = m4o0Var;
                        r4o0Var.c = z0o0VarB;
                        r4o0Var.d = 0;
                        r4o0Var.g = 5;
                        objI = kqi0Var.i(zA4, r4o0Var);
                        if (objI != d9nVar) {
                            z0o0Var = z0o0VarB;
                            i = 0;
                            if (((Boolean) objI).booleanValue()) {
                                r4o0Var.a = null;
                                r4o0Var.b = null;
                                r4o0Var.c = z0o0Var;
                                r4o0Var.d = i;
                                r4o0Var.g = 6;
                                kqi0Var2.v((p0o0) z0o0Var, m4o0Var instanceof i4o0, r4o0Var);
                                if (rih1Var != d9nVar) {
                                    if (((p0o0) z0o0Var).a()) {
                                        r4o0Var.a = null;
                                        r4o0Var.b = null;
                                        r4o0Var.c = null;
                                        r4o0Var.d = i;
                                        r4o0Var.g = 7;
                                        objH2 = c921.H(q8nVar, new s4o0(this, (lnm) null, (byte) 1), r4o0Var);
                                        if (objH2 != d9nVar) {
                                            objH2 = rih1Var;
                                        }
                                        if (objH2 == d9nVar) {
                                        }
                                    }
                                }
                            }
                        }
                    } else if (z0o0VarB instanceof n0o0) {
                        r4o0Var.a = null;
                        r4o0Var.b = null;
                        r4o0Var.c = null;
                        r4o0Var.d = 0;
                        r4o0Var.g = 8;
                        kqi0Var2.u((n0o0) z0o0VarB, r4o0Var);
                        if (rih1Var == d9nVar) {
                        }
                    } else if (z0o0VarB instanceof o0o0) {
                        s4o0Var = new s4o0(this, (lnm) null, (byte) 0);
                        r4o0Var.a = null;
                        r4o0Var.b = null;
                        r4o0Var.c = null;
                        r4o0Var.d = 0;
                        r4o0Var.g = 9;
                        if (c921.H(this.e, s4o0Var, r4o0Var) == d9nVar) {
                        }
                    } else if (z0o0VarB instanceof m0o0) {
                        kqi0Var2.x();
                    } else if (!(z0o0VarB instanceof l0o0)) {
                        eg.o();
                        return null;
                    }
                    return d9nVar;
                }
                return rih1Var;
            case 2:
                i2 = r4o0Var.d;
                z0o0Var2 = r4o0Var.c;
                m4o0Var = r4o0Var.b;
                hm5.M(objI);
                if (((Boolean) objI).booleanValue()) {
                    r4o0Var.a = null;
                    r4o0Var.b = null;
                    r4o0Var.c = z0o0Var2;
                    r4o0Var.d = i2;
                    r4o0Var.g = 3;
                    if (kqi0Var2.w((r0o0) z0o0Var2, m4o0Var instanceof i4o0, r4o0Var) != d9nVar) {
                        if (((r0o0) z0o0Var2).a()) {
                            r4o0Var.a = null;
                            r4o0Var.b = null;
                            r4o0Var.c = null;
                            r4o0Var.d = i2;
                            r4o0Var.g = 4;
                            objH = c921.H(q8nVar, new s4o0(this, (lnm) null, (byte) 1), r4o0Var);
                            if (objH != d9nVar) {
                                objH = rih1Var;
                            }
                            if (objH == d9nVar) {
                            }
                        }
                    }
                    return d9nVar;
                }
                return rih1Var;
            case 3:
                i2 = r4o0Var.d;
                z0o0Var2 = r4o0Var.c;
                hm5.M(objI);
                if (((r0o0) z0o0Var2).a()) {
                    r4o0Var.a = null;
                    r4o0Var.b = null;
                    r4o0Var.c = null;
                    r4o0Var.d = i2;
                    r4o0Var.g = 4;
                    objH = c921.H(q8nVar, new s4o0(this, (lnm) null, (byte) 1), r4o0Var);
                    if (objH != d9nVar) {
                        objH = rih1Var;
                    }
                    if (objH == d9nVar) {
                        return d9nVar;
                    }
                }
                return rih1Var;
            case 4:
            case 7:
            case 8:
            case 9:
                hm5.M(objI);
                return rih1Var;
            case 5:
                i = r4o0Var.d;
                z0o0Var = r4o0Var.c;
                m4o0Var = r4o0Var.b;
                hm5.M(objI);
                if (((Boolean) objI).booleanValue()) {
                    r4o0Var.a = null;
                    r4o0Var.b = null;
                    r4o0Var.c = z0o0Var;
                    r4o0Var.d = i;
                    r4o0Var.g = 6;
                    kqi0Var2.v((p0o0) z0o0Var, m4o0Var instanceof i4o0, r4o0Var);
                    if (rih1Var != d9nVar) {
                        if (((p0o0) z0o0Var).a()) {
                            r4o0Var.a = null;
                            r4o0Var.b = null;
                            r4o0Var.c = null;
                            r4o0Var.d = i;
                            r4o0Var.g = 7;
                            objH2 = c921.H(q8nVar, new s4o0(this, (lnm) null, (byte) 1), r4o0Var);
                            if (objH2 != d9nVar) {
                                objH2 = rih1Var;
                            }
                            if (objH2 == d9nVar) {
                            }
                        }
                    }
                    return d9nVar;
                }
                return rih1Var;
            case 6:
                i = r4o0Var.d;
                z0o0Var = r4o0Var.c;
                hm5.M(objI);
                if (((p0o0) z0o0Var).a()) {
                    r4o0Var.a = null;
                    r4o0Var.b = null;
                    r4o0Var.c = null;
                    r4o0Var.d = i;
                    r4o0Var.g = 7;
                    objH2 = c921.H(q8nVar, new s4o0(this, (lnm) null, (byte) 1), r4o0Var);
                    if (objH2 != d9nVar) {
                        objH2 = rih1Var;
                    }
                    if (objH2 == d9nVar) {
                        return d9nVar;
                    }
                }
                return rih1Var;
            default:
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
