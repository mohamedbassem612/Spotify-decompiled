package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hke implements yt11 {
    public final /* synthetic */ byte a = 0;
    public final q8n b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public hke(yzc0 yzc0Var, vgm vgmVar, h5q h5qVar, e7p0 e7p0Var, ytp0 ytp0Var, kt91 kt91Var, q8n q8nVar) {
        this.c = yzc0Var;
        this.d = vgmVar;
        this.e = e7p0Var;
        this.f = ytp0Var;
        this.g = kt91Var;
        this.b = q8nVar;
        this.h = h5qVar.a((muz) null);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:124:0x0238  */
    /* JADX WARN: Code duplicated, block: B:127:0x023f  */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x005d  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:59:0x0108  */
    /* JADX WARN: Code duplicated, block: B:62:0x010d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0152  */
    /* JADX WARN: Code duplicated, block: B:85:0x0188  */
    public final Object a(unb1 unb1Var, tv80 tv80Var, onm onmVar) {
        fke fkeVar;
        gwt0 gwt0Var;
        unb1 unb1Var2;
        gwt0 gwt0Var2;
        s24 s24Var;
        String str;
        ou80 ou80Var;
        String str2;
        ewf1 ewf1Var;
        jmb1 jmb1Var;
        wtt0 wtt0Var;
        ewt0 ewt0Var;
        Enum enumD;
        unb1 unb1Var3;
        wtt0 wtt0Var2;
        zvt0 zvt0Var;
        ttt0 ttt0Var;
        ux3 ux3Var;
        by3 by3Var;
        String str3;
        String str4;
        Object objY;
        unb1 unb1Var4 = unb1Var;
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.h;
        Object obj3 = this.c;
        q8n q8nVar = this.b;
        Enum r14 = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                tv80 tv80Var2 = tv80Var;
                if (onmVar instanceof fke) {
                    fkeVar = (fke) onmVar;
                    int i = fkeVar.f;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        fkeVar.f = i - Integer.MIN_VALUE;
                    } else {
                        fkeVar = new fke(this, onmVar);
                    }
                } else {
                    fkeVar = new fke(this, onmVar);
                }
                Object objK = fkeVar.d;
                int i2 = fkeVar.f;
                lnm lnmVar = null;
                if (i2 == 0) {
                    hm5.M(objK);
                    if (unb1Var4 instanceof jmb1) {
                        uv11 uv11Var = ((jmb1) unb1Var4).a;
                        evz evzVarZ = ((r0s0) obj3).z(uv11Var.b, uv11Var.a);
                        fkeVar.a = unb1Var4;
                        fkeVar.b = tv80Var2;
                        fkeVar.f = 1;
                        objK = b5p1.k(evzVarZ, fkeVar);
                        if (objK == r14) {
                            return r14;
                        }
                        gwt0Var = (gwt0) objK;
                        if (gwt0Var != null) {
                            if (gwt0Var instanceof dwt0) {
                            }
                            s24Var = (s24) obj;
                            if (tv80Var2 != null) {
                                str = null;
                            } else {
                                str = null;
                            }
                            fkeVar.a = null;
                            fkeVar.b = null;
                            fkeVar.c = null;
                            fkeVar.f = 4;
                            if (s24Var.m(gwt0Var, str, fkeVar) == r14) {
                                return r14;
                            }
                        }
                    }
                } else if (i2 == 1) {
                    tv80 tv80Var3 = fkeVar.b;
                    unb1 unb1Var5 = fkeVar.a;
                    hm5.M(objK);
                    tv80Var2 = tv80Var3;
                    unb1Var4 = unb1Var5;
                    gwt0Var = (gwt0) objK;
                    if (gwt0Var != null) {
                        if ((gwt0Var instanceof dwt0) || tv80Var2 == null) {
                            s24Var = (s24) obj;
                            if (tv80Var2 != null) {
                                str = null;
                            } else {
                                str = null;
                            }
                            fkeVar.a = null;
                            fkeVar.b = null;
                            fkeVar.c = null;
                            fkeVar.f = 4;
                            if (s24Var.m(gwt0Var, str, fkeVar) == r14) {
                                return r14;
                            }
                        } else {
                            fkeVar.a = unb1Var4;
                            fkeVar.b = tv80Var2;
                            fkeVar.c = gwt0Var;
                            fkeVar.f = 2;
                            objK = ((dt0) obj2).invoke(fkeVar);
                            if (objK == r14) {
                                return r14;
                            }
                            unb1Var2 = unb1Var4;
                            gwt0Var2 = gwt0Var;
                            str2 = (String) objK;
                            if (str2 != null) {
                            }
                            gwt0Var = gwt0Var2;
                            s24Var = (s24) obj;
                            if (tv80Var2 != null) {
                                str = null;
                            } else {
                                str = null;
                            }
                            fkeVar.a = null;
                            fkeVar.b = null;
                            fkeVar.c = null;
                            fkeVar.f = 4;
                            if (s24Var.m(gwt0Var, str, fkeVar) == r14) {
                                return r14;
                            }
                        }
                    }
                } else if (i2 == 2) {
                    gwt0Var2 = fkeVar.c;
                    tv80Var2 = fkeVar.b;
                    unb1Var2 = fkeVar.a;
                    hm5.M(objK);
                    str2 = (String) objK;
                    if (str2 != null || u890.j(((jmb1) unb1Var2).a.a, str2)) {
                        gwt0Var = gwt0Var2;
                        s24Var = (s24) obj;
                        if (tv80Var2 != null || (ou80Var = tv80Var2.a) == null) {
                            str = null;
                        } else {
                            str = ou80Var.a;
                        }
                        fkeVar.a = null;
                        fkeVar.b = null;
                        fkeVar.c = null;
                        fkeVar.f = 4;
                        if (s24Var.m(gwt0Var, str, fkeVar) == r14) {
                            return r14;
                        }
                    } else {
                        gke gkeVar = new gke(this, unb1Var2, tv80Var2, lnmVar, (byte) 0);
                        fkeVar.a = null;
                        fkeVar.b = null;
                        fkeVar.c = null;
                        fkeVar.f = 3;
                        if (fn31.Y(q8nVar, gkeVar, fkeVar) == r14) {
                            return r14;
                        }
                    }
                } else {
                    if (i2 != 3 && i2 != 4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(objK);
                }
                return rih1Var;
            case 1:
                tv80 tv80Var4 = tv80Var;
                if (onmVar instanceof ewf1) {
                    ewf1Var = (ewf1) onmVar;
                    int i3 = ewf1Var.g;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        ewf1Var.g = i3 - Integer.MIN_VALUE;
                    } else {
                        ewf1Var = new ewf1(this, onmVar);
                    }
                } else {
                    ewf1Var = new ewf1(this, onmVar);
                }
                Object objB = ewf1Var.e;
                int i4 = ewf1Var.g;
                if (i4 != 0) {
                    if (i4 == 1) {
                        jmb1 jmb1Var2 = ewf1Var.d;
                        jmb1 jmb1Var3 = ewf1Var.c;
                        tv80Var4 = ewf1Var.b;
                        unb1 unb1Var6 = ewf1Var.a;
                        hm5.M(objB);
                        jmb1Var = jmb1Var3;
                        unb1Var4 = unb1Var6;
                    } else if (i4 == 2) {
                        wtt0Var2 = ewf1Var.d;
                        tv80Var4 = ewf1Var.b;
                        unb1Var3 = ewf1Var.a;
                        hm5.M(objB);
                        ewt0Var = (ewt0) objB;
                        wtt0Var = wtt0Var2;
                        unb1Var4 = unb1Var3;
                        if (ewt0Var == null) {
                            ewf1Var.a = null;
                            ewf1Var.b = null;
                            ewf1Var.c = null;
                            ewf1Var.d = null;
                            ewf1Var.g = 3;
                            if (((yt11) obj3).a(unb1Var4, tv80Var4, ewf1Var) == r14) {
                                return r14;
                            }
                        } else if (!(wtt0Var instanceof vtt0) && (((ttt0Var = ((vtt0) wtt0Var).a) == ttt0.a || ttt0Var == ttt0.b) && (ux3Var = (ux3) this.g) != null && ux3Var.a() && (((u601) ux3Var.b.getValue()).getValue() instanceof ul10) && (by3Var = (by3) obj2) != null)) {
                            str3 = ((jmb1) unb1Var4).a.a;
                            ewf1Var.a = null;
                            ewf1Var.b = null;
                            ewf1Var.c = null;
                            ewf1Var.d = null;
                            ewf1Var.g = 4;
                            if (by3Var.a(str3, tv80Var4, ewf1Var) == r14) {
                                return r14;
                            }
                        } else {
                            zvt0Var = new zvt0(((jmb1) unb1Var4).a.a, ewt0Var, false);
                            ewf1Var.a = null;
                            ewf1Var.b = null;
                            ewf1Var.c = null;
                            ewf1Var.d = null;
                            ewf1Var.g = 5;
                            if (((iwt0) obj).m(zvt0Var, (String) null, ewf1Var) == r14) {
                                return r14;
                            }
                        }
                    } else {
                        if (i4 != 3 && i4 != 4 && i4 != 5) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(objB);
                    }
                    return rih1Var;
                }
                hm5.M(objB);
                jmb1Var = unb1Var4 instanceof jmb1 ? (jmb1) unb1Var4 : null;
                if (jmb1Var != null) {
                    btt0 btt0Var = (btt0) this.e;
                    String str5 = jmb1Var.a.a;
                    ewf1Var.a = unb1Var4;
                    ewf1Var.b = tv80Var4;
                    ewf1Var.c = jmb1Var;
                    ewf1Var.d = null;
                    ewf1Var.g = 1;
                    objB = btt0Var.b(str5, ewf1Var);
                    if (objB == r14) {
                        return r14;
                    }
                } else {
                    wtt0Var = null;
                }
                if (jmb1Var != null) {
                    ewf1Var.a = unb1Var4;
                    ewf1Var.b = tv80Var4;
                    ewf1Var.c = null;
                    ewf1Var.d = wtt0Var;
                    ewf1Var.g = 2;
                    enumD = d(jmb1Var, wtt0Var, ewf1Var);
                    if (enumD == r14) {
                        return r14;
                    }
                    unb1Var3 = unb1Var4;
                    wtt0Var2 = wtt0Var;
                    objB = enumD;
                    ewt0Var = (ewt0) objB;
                    wtt0Var = wtt0Var2;
                    unb1Var4 = unb1Var3;
                } else {
                    ewt0Var = null;
                }
                if (ewt0Var == null) {
                    ewf1Var.a = null;
                    ewf1Var.b = null;
                    ewf1Var.c = null;
                    ewf1Var.d = null;
                    ewf1Var.g = 3;
                    if (((yt11) obj3).a(unb1Var4, tv80Var4, ewf1Var) == r14) {
                        return r14;
                    }
                } else if (wtt0Var instanceof vtt0) {
                    zvt0Var = new zvt0(((jmb1) unb1Var4).a.a, ewt0Var, false);
                    ewf1Var.a = null;
                    ewf1Var.b = null;
                    ewf1Var.c = null;
                    ewf1Var.d = null;
                    ewf1Var.g = 5;
                    if (((iwt0) obj).m(zvt0Var, (String) null, ewf1Var) == r14) {
                        return r14;
                    }
                } else {
                    str3 = ((jmb1) unb1Var4).a.a;
                    ewf1Var.a = null;
                    ewf1Var.b = null;
                    ewf1Var.c = null;
                    ewf1Var.d = null;
                    ewf1Var.g = 4;
                    if (by3Var.a(str3, tv80Var4, ewf1Var) == r14) {
                        return r14;
                    }
                }
                return rih1Var;
                wtt0Var = (wtt0) ((zob1) objB).getValue();
                if (jmb1Var != null) {
                    ewf1Var.a = unb1Var4;
                    ewf1Var.b = tv80Var4;
                    ewf1Var.c = null;
                    ewf1Var.d = wtt0Var;
                    ewf1Var.g = 2;
                    enumD = d(jmb1Var, wtt0Var, ewf1Var);
                    if (enumD == r14) {
                        return r14;
                    }
                    unb1Var3 = unb1Var4;
                    wtt0Var2 = wtt0Var;
                    objB = enumD;
                    ewt0Var = (ewt0) objB;
                    wtt0Var = wtt0Var2;
                    unb1Var4 = unb1Var3;
                } else {
                    ewt0Var = null;
                }
                if (ewt0Var == null) {
                    ewf1Var.a = null;
                    ewf1Var.b = null;
                    ewf1Var.c = null;
                    ewf1Var.d = null;
                    ewf1Var.g = 3;
                    if (((yt11) obj3).a(unb1Var4, tv80Var4, ewf1Var) == r14) {
                        return r14;
                    }
                } else if (wtt0Var instanceof vtt0) {
                    zvt0Var = new zvt0(((jmb1) unb1Var4).a.a, ewt0Var, false);
                    ewf1Var.a = null;
                    ewf1Var.b = null;
                    ewf1Var.c = null;
                    ewf1Var.d = null;
                    ewf1Var.g = 5;
                    if (((iwt0) obj).m(zvt0Var, (String) null, ewf1Var) == r14) {
                        return r14;
                    }
                } else {
                    str3 = ((jmb1) unb1Var4).a.a;
                    ewf1Var.a = null;
                    ewf1Var.b = null;
                    ewf1Var.c = null;
                    ewf1Var.d = null;
                    ewf1Var.g = 4;
                    if (by3Var.a(str3, tv80Var4, ewf1Var) == r14) {
                        return r14;
                    }
                }
                return rih1Var;
            default:
                jmb1 jmb1Var4 = unb1Var4 instanceof jmb1 ? (jmb1) unb1Var4 : null;
                return (jmb1Var4 == null || (str4 = jmb1Var4.a.d) == null || tv80Var == null || (objY = fn31.Y(q8nVar, new nsf1((byte) 12, this, jmb1Var4, tv80Var, str4, (lnm) null), onmVar)) != r14) ? rih1Var : objY;
        }
    }

    public final s9d1 b() {
        switch (this.a) {
            case 0:
                return null;
            case 1:
                return ((yt11) this.c).b();
            default:
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    /* JADX WARN: Code duplicated, block: B:41:0x0098  */
    /* JADX WARN: Code duplicated, block: B:42:0x009b  */
    /* JADX WARN: Code duplicated, block: B:44:0x009e  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    public final Object c(unb1 unb1Var, tv80 tv80Var, onm onmVar) {
        gwf1 gwf1Var;
        wtt0 wtt0Var;
        vtt0 vtt0Var;
        ttt0 ttt0Var;
        yt11 yt11Var;
        byte b = this.a;
        Object obj = this.e;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                if ((unb1Var instanceof jmb1) && tv80Var != null) {
                    wlr wlrVar = (wlr) obj;
                    uv11 uv11Var = ((jmb1) unb1Var).a;
                    String str = uv11Var.a;
                    String str2 = uv11Var.d;
                    if (str2 == null) {
                        str2 = "";
                    }
                    wlrVar.a.d(str, wlrVar.b.a, tv80Var, wlrVar.a(new ahe(str, str2)));
                }
                return rih1Var;
            case 1:
                tv80 tv80Var2 = tv80Var;
                if (onmVar instanceof gwf1) {
                    gwf1Var = (gwf1) onmVar;
                    int i = gwf1Var.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        gwf1Var.e = i - Integer.MIN_VALUE;
                    } else {
                        gwf1Var = new gwf1(this, onmVar);
                    }
                } else {
                    gwf1Var = new gwf1(this, onmVar);
                }
                Object objI = gwf1Var.c;
                int i2 = gwf1Var.e;
                if (i2 != 0) {
                    if (i2 == 1) {
                        tv80 tv80Var3 = gwf1Var.b;
                        unb1 unb1Var2 = gwf1Var.a;
                        hm5.M(objI);
                        tv80Var2 = tv80Var3;
                        unb1Var = unb1Var2;
                    } else {
                        if (i2 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(objI);
                    }
                    return rih1Var;
                }
                hm5.M(objI);
                jmb1 jmb1Var = unb1Var instanceof jmb1 ? (jmb1) unb1Var : null;
                if (jmb1Var != null) {
                    g9i0 g9i0VarA = ((btt0) obj).a(jmb1Var.a.a);
                    gwf1Var.a = unb1Var;
                    gwf1Var.b = tv80Var2;
                    gwf1Var.e = 1;
                    objI = b5p1.i(g9i0VarA, gwf1Var);
                    if (objI == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    wtt0Var = null;
                }
                if (wtt0Var instanceof vtt0) {
                    vtt0Var = (vtt0) wtt0Var;
                } else {
                    vtt0Var = null;
                }
                if (vtt0Var != null) {
                    ttt0Var = vtt0Var.a;
                } else {
                    ttt0Var = null;
                }
                if (ttt0Var != ttt0.e && ttt0Var != ttt0.b) {
                    yt11Var = (yt11) this.c;
                    gwf1Var.a = null;
                    gwf1Var.b = null;
                    gwf1Var.e = 2;
                    if (yt11Var.c(unb1Var, tv80Var2, gwf1Var) == d9nVar) {
                        return d9nVar;
                    }
                }
                return rih1Var;
                wtt0Var = (wtt0) objI;
                if (wtt0Var instanceof vtt0) {
                    vtt0Var = (vtt0) wtt0Var;
                } else {
                    vtt0Var = null;
                }
                if (vtt0Var != null) {
                    ttt0Var = vtt0Var.a;
                } else {
                    ttt0Var = null;
                }
                if (ttt0Var != ttt0.e) {
                    yt11Var = (yt11) this.c;
                    gwf1Var.a = null;
                    gwf1Var.b = null;
                    gwf1Var.e = 2;
                    if (yt11Var.c(unb1Var, tv80Var2, gwf1Var) == d9nVar) {
                        return d9nVar;
                    }
                }
                return rih1Var;
            default:
                lnm lnmVar = null;
                jmb1 jmb1Var2 = unb1Var instanceof jmb1 ? (jmb1) unb1Var : null;
                if (jmb1Var2 == null || tv80Var == null) {
                    return rih1Var;
                }
                Object objY = fn31.Y(this.b, new ku91(this, jmb1Var2, tv80Var, lnmVar, (byte) 29), onmVar);
                return objY == d9nVar ? objY : rih1Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Enum d(jmb1 jmb1Var, wtt0 wtt0Var, onm onmVar) {
        bwf1 bwf1Var;
        ewt0 ewt0Var;
        if (onmVar instanceof bwf1) {
            bwf1Var = (bwf1) onmVar;
            int i = bwf1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bwf1Var.c = i - Integer.MIN_VALUE;
            } else {
                bwf1Var = new bwf1(this, onmVar);
            }
        } else {
            bwf1Var = new bwf1(this, onmVar);
        }
        Object objY = bwf1Var.a;
        int i2 = bwf1Var.c;
        if (i2 == 0) {
            hm5.M(objY);
            if (wtt0Var instanceof vtt0) {
                int iOrdinal = ((vtt0) wtt0Var).a.ordinal();
                if (iOrdinal == 0) {
                    ewt0Var = ewt0.a;
                } else if (iOrdinal == 1) {
                    ewt0Var = ewt0.d;
                } else if (iOrdinal == 2) {
                    ewt0Var = ewt0.b;
                } else if (iOrdinal != 4) {
                    ewt0Var = null;
                } else {
                    ewt0Var = ewt0.d;
                }
            } else {
                ewt0Var = null;
            }
            if (ewt0Var != null) {
                return ewt0Var;
            }
            bwf1Var.c = 1;
            objY = fn31.Y(this.b, new bfb1(this, jmb1Var, wtt0Var, (lnm) null, (byte) 23), bwf1Var);
            d9n d9nVar = d9n.a;
            if (objY == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objY);
        }
        if (((Boolean) objY).booleanValue()) {
            return ewt0.c;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(onm onmVar) {
        cwf1 cwf1Var;
        if (onmVar instanceof cwf1) {
            cwf1Var = (cwf1) onmVar;
            int i = cwf1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cwf1Var.c = i - Integer.MIN_VALUE;
            } else {
                cwf1Var = new cwf1(this, onmVar);
            }
        } else {
            cwf1Var = new cwf1(this, onmVar);
        }
        Object objL = cwf1Var.a;
        int i2 = cwf1Var.c;
        if (i2 == 0) {
            hm5.M(objL);
            Observable observableE = ((dxz0) this.f).e();
            cwf1Var.c = 1;
            objL = fc11.l(observableE, 1, (Object) null, cwf1Var);
            d9n d9nVar = d9n.a;
            if (objL == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objL);
        }
        return Boolean.valueOf(!((Boolean) objL).booleanValue());
    }

    public hke(r0s0 r0s0Var, s24 s24Var, wlr wlrVar, mp8 mp8Var, String str, dt0 dt0Var, q8n q8nVar) {
        this.c = r0s0Var;
        this.d = s24Var;
        this.e = wlrVar;
        this.f = mp8Var;
        this.g = str;
        this.h = dt0Var;
        this.b = q8nVar;
    }

    public hke(yt11 yt11Var, iwt0 iwt0Var, btt0 btt0Var, dxz0 dxz0Var, q8n q8nVar, ux3 ux3Var, by3 by3Var) {
        this.c = yt11Var;
        this.d = iwt0Var;
        this.e = btt0Var;
        this.f = dxz0Var;
        this.b = q8nVar;
        this.g = ux3Var;
        this.h = by3Var;
    }
}
