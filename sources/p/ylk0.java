package p;

import com.spotify.base.java.logging.Logger;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ylk0 {
    public final xrc0 a;
    public final iyc0 b;
    public final kkg1 c;
    public final vw51 d;
    public final lw51 e;

    public ylk0(xrc0 xrc0Var, iyc0 iyc0Var, kkg1 kkg1Var, vw51 vw51Var, lw51 lw51Var) {
        this.a = xrc0Var;
        this.b = iyc0Var;
        this.c = kkg1Var;
        this.d = vw51Var;
        this.e = lw51Var;
    }

    public static Object a(ylk0 ylk0Var, String str, List list, List list2, ddd1 ddd1Var, List list3, List list4, boolean z, a8d1 a8d1Var, int i) {
        if ((i & 16) != 0) {
            list3 = list;
        }
        if ((i & 32) != 0) {
            list4 = null;
        }
        if ((i & 64) != 0) {
            z = true;
        }
        return ylk0Var.e.a(str, list, list2, ddd1Var, list3, list4, z, a8d1Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object b(String str, List list, List list2, String str2, ddd1 ddd1Var, dqa1 dqa1Var, onm onmVar) {
        vlk0 vlk0Var;
        String str3;
        py21 m231Var;
        if (onmVar instanceof vlk0) {
            vlk0Var = (vlk0) onmVar;
            int i = vlk0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                vlk0Var.d = i - Integer.MIN_VALUE;
            } else {
                vlk0Var = new vlk0(this, onmVar);
            }
        } else {
            vlk0Var = new vlk0(this, onmVar);
        }
        Object objP = vlk0Var.b;
        int i2 = vlk0Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objP);
                try {
                    ytw0 ytw0Var = jfv.b;
                    long jK0 = fdg1.k0(20, ngv.e);
                    str3 = str2;
                    try {
                        yj6 yj6Var = new yj6(this, str, list, list2, dqa1Var, str3, ddd1Var, (lnm) null);
                        vlk0Var.a = str3;
                        vlk0Var.d = 1;
                        objP = rc2.P(jK0, yj6Var, vlk0Var);
                        d9n d9nVar = d9n.a;
                        if (objP == d9nVar) {
                            return d9nVar;
                        }
                        m231Var = (py21) objP;
                    } catch (Throwable th) {
                        th = th;
                        m231Var = new m231(th);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    str3 = str2;
                    m231Var = new m231(th);
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str4 = vlk0Var.a;
                try {
                    hm5.M(objP);
                    str3 = str4;
                    m231Var = (py21) objP;
                } catch (Throwable th3) {
                    th = th3;
                    str3 = str4;
                    m231Var = new m231(th);
                }
            }
            if (!(m231Var instanceof m231)) {
                py21 py21Var = m231Var;
                if (!(py21Var instanceof oy21)) {
                    if (py21Var instanceof ly21) {
                        Logger.k("Failed to copy speeds and transitions to created playlist %s: %s", new Object[]{str3, ((ly21) py21Var).a.b()});
                    } else {
                        if (py21Var != null) {
                            eg.o();
                            return null;
                        }
                        Logger.k("Timed out copying speeds and transitions to created playlist %s", new Object[]{str3});
                    }
                }
            }
            Throwable thA = e331.a(m231Var);
            if (thA != null) {
                Logger.l(thA, "Failed to copy speeds and transitions to created playlist %s", new Object[]{str3});
            }
            return rih1.a;
        } catch (CancellationException e) {
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:46:0x011c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0124  */
    /* JADX WARN: Code duplicated, block: B:52:0x013a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x013b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object c(String str, String str2, String str3, String str4, ddd1 ddd1Var, zxc0 zxc0Var, onm onmVar) {
        wlk0 wlk0Var;
        String str5;
        ddd1 ddd1Var2;
        Object objD;
        String str6;
        List list;
        String str7;
        String str8;
        List list2;
        String str9;
        ly21 ly21Var;
        if (onmVar instanceof wlk0) {
            wlk0Var = (wlk0) onmVar;
            int i = wlk0Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                wlk0Var.h = i - Integer.MIN_VALUE;
            } else {
                wlk0Var = new wlk0(this, onmVar);
            }
        } else {
            wlk0Var = new wlk0(this, onmVar);
        }
        wlk0 wlk0Var2 = wlk0Var;
        Object objM = wlk0Var2.f;
        int i2 = wlk0Var2.h;
        xyc0 xyc0Var = this.b;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objM);
            this.c.getClass();
            lhg1 lhg1VarA = kkg1.a(str2);
            if (lhg1VarA == null) {
                return new ly21(new iy21("Failed to decode transition blob"));
            }
            ruq0 ruq0Var = lhg1VarA.b;
            List listM = p7h.M(new String[]{ruq0Var.a, ruq0Var.b});
            wlk0Var2.a = str;
            str5 = str2;
            wlk0Var2.b = str5;
            ddd1Var2 = ddd1Var;
            wlk0Var2.c = ddd1Var2;
            wlk0Var2.h = 1;
            objD = xyc0Var.d(str, listM, str3, str4, zxc0Var, wlk0Var2);
            if (objD != d9nVar) {
                str6 = str;
            }
            return d9nVar;
        }
        if (i2 == 1) {
            ddd1Var2 = wlk0Var2.c;
            String str10 = wlk0Var2.b;
            str6 = wlk0Var2.a;
            hm5.M(objM);
            objD = objM;
            str5 = str10;
        } else {
            if (i2 == 2) {
                list = wlk0Var2.d;
                str7 = wlk0Var2.b;
                str6 = wlk0Var2.a;
                hm5.M(objM);
                str8 = (String) o7h.s0(list);
                if (str8 == null) {
                    return new ly21(new iy21("No row ID returned after adding tracks"));
                }
                wlk0Var2.a = str6;
                wlk0Var2.b = null;
                wlk0Var2.c = null;
                wlk0Var2.d = list;
                wlk0Var2.h = 3;
                objM = fho1.m(this.b, this.a, str6, str8, str7, false, wlk0Var2);
                if (objM != d9nVar) {
                    list2 = list;
                    str9 = str6;
                }
                return d9nVar;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ly21 ly21Var2 = wlk0Var2.e;
                List list3 = wlk0Var2.d;
                hm5.M(objM);
                return ly21Var2;
            }
            list2 = wlk0Var2.d;
            str9 = wlk0Var2.a;
            hm5.M(objM);
        }
        ly21Var = (py21) objM;
        if (ly21Var instanceof ly21) {
            return new oy21(list2);
        }
        wlk0Var2.a = null;
        wlk0Var2.b = null;
        wlk0Var2.c = null;
        wlk0Var2.d = null;
        wlk0Var2.e = ly21Var;
        wlk0Var2.h = 4;
        if (iyc0.c(xyc0Var, str9, list2, wlk0Var2) != d9nVar) {
            return d9nVar;
        }
        return ly21Var;
        oy21 oy21Var = (py21) objD;
        if (oy21Var instanceof ly21) {
            return oy21Var;
        }
        if (!(oy21Var instanceof oy21)) {
            eg.o();
            return null;
        }
        List list4 = (List) oy21Var.a;
        wlk0Var2.a = str6;
        wlk0Var2.b = str5;
        wlk0Var2.c = null;
        wlk0Var2.d = list4;
        wlk0Var2.h = 2;
        if (xyc0Var.u(str6, ddd1Var2, wlk0Var2) != d9nVar) {
            list = list4;
            str7 = str5;
            str8 = (String) o7h.s0(list);
            if (str8 == null) {
                return new ly21(new iy21("No row ID returned after adding tracks"));
            }
            wlk0Var2.a = str6;
            wlk0Var2.b = null;
            wlk0Var2.c = null;
            wlk0Var2.d = list;
            wlk0Var2.h = 3;
            objM = fho1.m(this.b, this.a, str6, str8, str7, false, wlk0Var2);
            if (objM != d9nVar) {
                list2 = list;
                str9 = str6;
                ly21Var = (py21) objM;
                if (ly21Var instanceof ly21) {
                    return new oy21(list2);
                }
                wlk0Var2.a = null;
                wlk0Var2.b = null;
                wlk0Var2.c = null;
                wlk0Var2.d = null;
                wlk0Var2.e = ly21Var;
                wlk0Var2.h = 4;
                if (iyc0.c(xyc0Var, str9, list2, wlk0Var2) != d9nVar) {
                    return ly21Var;
                }
            }
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, onm onmVar) {
        xlk0 xlk0Var;
        Boolean m231Var;
        if (onmVar instanceof xlk0) {
            xlk0Var = (xlk0) onmVar;
            int i = xlk0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                xlk0Var.d = i - Integer.MIN_VALUE;
            } else {
                xlk0Var = new xlk0(this, onmVar);
            }
        } else {
            xlk0Var = new xlk0(this, onmVar);
        }
        Object objP = xlk0Var.b;
        int i2 = xlk0Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objP);
                ytw0 ytw0Var = jfv.b;
                long jK0 = fdg1.k0(5, ngv.e);
                d7i0 d7i0Var = new d7i0(this, str, (lnm) null, (byte) 20);
                xlk0Var.a = str;
                xlk0Var.d = 1;
                objP = rc2.P(jK0, d7i0Var, xlk0Var);
                d9n d9nVar = d9n.a;
                if (objP == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = xlk0Var.a;
                hm5.M(objP);
            }
            m231Var = Boolean.valueOf(u890.j(objP, Boolean.TRUE));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            Logger.l(thA, "Failed to enable mixing on created playlist %s", new Object[]{str});
            return Boolean.FALSE;
        }
        Boolean bool = m231Var;
        if (!bool.booleanValue()) {
            Logger.k("Mixing was not enabled on created playlist %s", new Object[]{str});
        }
        return bool;
    }
}
