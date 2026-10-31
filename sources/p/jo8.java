package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jo8 {
    public final uu00 a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(String str, onm onmVar) {
        zan0 zan0Var;
        if (onmVar instanceof zan0) {
            zan0Var = (zan0) onmVar;
            int i = zan0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zan0Var.c = i - Integer.MIN_VALUE;
            } else {
                zan0Var = new zan0(this, onmVar);
            }
        } else {
            zan0Var = new zan0(this, onmVar);
        }
        Object objD = zan0Var.a;
        int i2 = zan0Var.c;
        if (i2 == 0) {
            hm5.M(objD);
            zan0Var.c = 1;
            objD = d(str, zan0Var);
            Object obj = d9n.a;
            if (objD == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objD);
        }
        yan0 yan0Var = (yan0) objD;
        jo70 jo70Var = yan0Var.a;
        String str2 = jo70Var.a;
        hll hllVar = yan0Var.b;
        wkk1 wkk1VarP = ucp1.p(yan0Var.c);
        String str3 = wkk1VarP.a;
        jlw0 jlw0Var = str3 != null ? new jlw0(str3, str2) : null;
        String str4 = wkk1VarP.b;
        if (str4 == null) {
            str4 = "";
        }
        return new xan0(jlw0Var, new jlw0(str4, str2), wkk1VarP.d, wkk1VarP.c, str2, m0p1.A(jo70Var), jfv.h(hllVar.a));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(String str, onm onmVar) {
        io8 io8Var;
        if (onmVar instanceof io8) {
            io8Var = (io8) onmVar;
            int i = io8Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                io8Var.c = i - Integer.MIN_VALUE;
            } else {
                io8Var = new io8(this, onmVar);
            }
        } else {
            io8Var = new io8(this, onmVar);
        }
        Object objJ = io8Var.a;
        int i2 = io8Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            Single singleDoOnError = this.a.b(new oi("ContextMenuDataLoader", false, new wk3(str, (byte) 26))).filter(vgp1.i).firstOrError().doOnError(nm.X0).map(new yjp1(str, this)).doOnError(nm.W0);
            io8Var.c = 1;
            objJ = fc11.j(singleDoOnError, io8Var);
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable c(ArrayList arrayList, onm onmVar) {
        mb81 mb81Var;
        if (onmVar instanceof mb81) {
            mb81Var = (mb81) onmVar;
            int i = mb81Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mb81Var.d = i - Integer.MIN_VALUE;
            } else {
                mb81Var = new mb81(this, onmVar);
            }
        } else {
            mb81Var = new mb81(this, onmVar);
        }
        Object objL = mb81Var.b;
        int i2 = mb81Var.d;
        if (i2 == 0) {
            hm5.M(objL);
            if (!arrayList.isEmpty()) {
                Observable observableFilter = this.a.b(new oi("show_value_metadata", false, new nec0(arrayList, (byte) 23))).filter(mgx0.X);
                mb81Var.a = arrayList;
                mb81Var.d = 1;
                objL = fc11.l(observableFilter, 2, (Object) null, mb81Var);
                d9n d9nVar = d9n.a;
                if (objL == d9nVar) {
                    return d9nVar;
                }
            }
            return b7x.a;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        arrayList = mb81Var.a;
        hm5.M(objL);
        uv00 uv00Var = (uv00) objL;
        if (uv00Var != null) {
            int iS = zno1.s(q7h.U(arrayList, 10));
            if (iS < 16) {
                iS = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
            for (Object obj : arrayList) {
                gw81 gw81Var = uv00Var.a(gw81.class, (String) obj).b;
                String str = gw81Var != null ? gw81Var.b : null;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                String str3 = gw81Var != null ? gw81Var.c : null;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = gw81Var != null ? gw81Var.a : null;
                if (str4 != null) {
                    str2 = str4;
                }
                linkedHashMap.put(obj, new rv21(str, str3, str2));
            }
            return linkedHashMap;
        }
        return b7x.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(String str, onm onmVar) {
        abn0 abn0Var;
        if (onmVar instanceof abn0) {
            abn0Var = (abn0) onmVar;
            int i = abn0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                abn0Var.d = i - Integer.MIN_VALUE;
            } else {
                abn0Var = new abn0(this, onmVar);
            }
        } else {
            abn0Var = new abn0(this, onmVar);
        }
        Object objL = abn0Var.b;
        int i2 = abn0Var.d;
        if (i2 == 0) {
            hm5.M(objL);
            Observable observableFilter = this.a.b(new oi("music-video-share-card", false, new fki0(str, (byte) 20))).filter(zz10.P0);
            abn0Var.a = str;
            abn0Var.d = 1;
            objL = fc11.l(observableFilter, 1, (Object) null, abn0Var);
            d9n d9nVar = d9n.a;
            if (objL == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = abn0Var.a;
            hm5.M(objL);
        }
        uv00 uv00Var = (uv00) objL;
        jo70 jo70Var = uv00Var.a(jo70.class, str).b;
        if (jo70Var == null) {
            bhn0.f("Identity trait was missing for ".concat(str));
            return null;
        }
        jo70 jo70Var2 = jo70Var;
        hll hllVar = uv00Var.a(hll.class, str).b;
        if (hllVar == null) {
            bhn0.f("Consumption experience trait was missing for ".concat(str));
            return null;
        }
        hll hllVar2 = hllVar;
        xkk1 xkk1Var = uv00Var.a(xkk1.class, str).b;
        if (xkk1Var != null) {
            return new yan0(hllVar2, jo70Var2, xkk1Var);
        }
        bhn0.f("Visual identity trait was missing for ".concat(str));
        return null;
    }
}
