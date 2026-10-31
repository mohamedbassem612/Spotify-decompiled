package p;

import com.spotify.stickers.v1.GetStickerResponse;
import com.spotify.stickers.v1.GetSurfaceResponse;
import com.spotify.stickers.v1.SearchSurfaceStickersResponse;
import io.reactivex.rxjava3.core.Observable;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ayb1 {
    public static final se11 l = new se11("[\\s,;.!?_]+");
    public final boolean a;
    public final oyb1 b;
    public final uu00 c;
    public final bpb1 d = gio1.b("");
    public final bpb1 e;
    public final xe01 f;
    public final bpb1 g;
    public final bpb1 h;
    public final LinkedHashMap i;
    public final ConcurrentHashMap j;
    public faa0 k;

    public ayb1(boolean z, oyb1 oyb1Var, uu00 uu00Var) {
        this.a = z;
        this.b = oyb1Var;
        this.c = uu00Var;
        bpb1 bpb1VarB = gio1.b(t851.a);
        this.e = bpb1VarB;
        this.f = d5p1.h(bpb1VarB);
        this.g = gio1.b(new rxb1());
        this.h = gio1.b(z6x.a);
        this.i = new LinkedHashMap();
        this.j = new ConcurrentHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(rvb1 rvb1Var, String str, onm onmVar) {
        txb1 txb1Var;
        fxb1 fxb1Var;
        rvb1 rvb1Var2;
        String strB;
        if (onmVar instanceof txb1) {
            txb1Var = (txb1) onmVar;
            int i = txb1Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                txb1Var.f = i - Integer.MIN_VALUE;
            } else {
                txb1Var = new txb1(this, onmVar);
            }
        } else {
            txb1Var = new txb1(this, onmVar);
        }
        Object obj = txb1Var.d;
        int i2 = txb1Var.f;
        ConcurrentHashMap concurrentHashMap = this.j;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                fxb1 fxb1VarB = rvb1Var.b();
                if (fxb1VarB instanceof fxb1) {
                    fxb1 fxb1Var2 = fxb1VarB;
                    if (fxb1Var2.b() == null) {
                        String str2 = (String) concurrentHashMap.get(str);
                        if (str2 != null) {
                            return rvb1.a(rvb1Var, fxb1.a(fxb1Var2, str2));
                        }
                        try {
                            txb1Var.a = rvb1Var;
                            txb1Var.b = str;
                            txb1Var.c = fxb1VarB;
                            txb1Var.f = 1;
                            Object objD = d(str, txb1Var);
                            d9n d9nVar = d9n.a;
                            if (objD == d9nVar) {
                                return d9nVar;
                            }
                            obj = objD;
                            fxb1Var = fxb1VarB;
                        } catch (Exception unused) {
                            fxb1Var = fxb1VarB;
                            rvb1Var2 = null;
                        }
                    }
                }
                return rvb1Var;
            }
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fxb1Var = txb1Var.c;
            str = txb1Var.b;
            rvb1Var = txb1Var.a;
            try {
                hm5.M(obj);
            } catch (Exception unused2) {
                rvb1Var2 = null;
            }
            rvb1Var2 = (rvb1) obj;
            hxb1 hxb1VarB = rvb1Var2 != null ? rvb1Var2.b() : null;
            fxb1 fxb1Var3 = hxb1VarB instanceof fxb1 ? (fxb1) hxb1VarB : null;
            if (fxb1Var3 == null || (strB = fxb1Var3.b()) == null) {
                return rvb1Var;
            }
            concurrentHashMap.put(str, strB);
            return rvb1.a(rvb1Var, fxb1.a(fxb1Var, strB));
        } catch (CancellationException e) {
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object b(onm onmVar) {
        uxb1 uxb1Var;
        Object m231Var;
        Object value;
        rxb1 rxb1Var;
        if (onmVar instanceof uxb1) {
            uxb1Var = (uxb1) onmVar;
            int i = uxb1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uxb1Var.c = i - Integer.MIN_VALUE;
            } else {
                uxb1Var = new uxb1(this, onmVar);
            }
        } else {
            uxb1Var = new uxb1(this, onmVar);
        }
        uxb1 uxb1Var2 = uxb1Var;
        Object objC = uxb1Var2.a;
        int i2 = uxb1Var2.c;
        bpb1 bpb1Var = this.g;
        try {
            if (i2 == 0) {
                hm5.M(objC);
                rxb1 rxb1Var2 = (rxb1) bpb1Var.getValue();
                if (rxb1Var2.g() && !ihc1.y0(rxb1Var2.e()) && rxb1Var2.d().length() != 0) {
                    String strF = rxb1Var2.f();
                    String strE = rxb1Var2.e();
                    int iC = rxb1Var2.c();
                    String strD = rxb1Var2.d();
                    uxb1Var2.c = 1;
                    objC = c(strF, strE, iC, strD, uxb1Var2);
                    d9n d9nVar = d9n.a;
                    if (objC == d9nVar) {
                        return d9nVar;
                    }
                }
                return rih1.a;
            }
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objC);
            m231Var = (mmr0) objC;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        boolean z = m231Var instanceof m231;
        bpb1 bpb1Var2 = this.e;
        if (!z) {
            mmr0 mmr0Var = (mmr0) m231Var;
            List list = (List) mmr0Var.a;
            String str = (String) mmr0Var.b;
            do {
                value = bpb1Var.getValue();
                rxb1Var = (rxb1) value;
            } while (!bpb1Var.k(value, rxb1.a(rxb1Var, (LinkedHashMap) null, (List) null, (String) null, (String) null, 0, str, a6o1.s(rxb1Var.b(), list), false, 159)));
            bpb1Var2.m(null, new c951(((rxb1) bpb1Var.getValue()).b()));
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null && !(thA instanceof CancellationException)) {
            bpb1Var2.m(null, new o851(thA));
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Serializable c(String str, String str2, int i, String str3, onm onmVar) {
        vxb1 vxb1Var;
        String strF;
        if (onmVar instanceof vxb1) {
            vxb1Var = (vxb1) onmVar;
            int i2 = vxb1Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vxb1Var.c = i2 - Integer.MIN_VALUE;
            } else {
                vxb1Var = new vxb1(this, onmVar);
            }
        } else {
            vxb1Var = new vxb1(this, onmVar);
        }
        vxb1 vxb1Var2 = vxb1Var;
        Object objD = vxb1Var2.a;
        int i3 = vxb1Var2.c;
        if (i3 == 0) {
            hm5.M(objD);
            vxb1Var2.c = 1;
            objD = oyb1.d(this.b, str, str2, i, str3, (List) null, vxb1Var2, 16, (Object) null);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objD);
        }
        sy21 sy21Var = (sy21) objD;
        SearchSurfaceStickersResponse searchSurfaceStickersResponse = (SearchSurfaceStickersResponse) sy21Var.b;
        ry21 ry21Var = sy21Var.a;
        if (ry21Var.Q0 && searchSurfaceStickersResponse != null) {
            return oqn1.n(m87.B(searchSurfaceStickersResponse), searchSurfaceStickersResponse.getNextPageToken());
        }
        int i4 = ry21Var.d;
        uz21 uz21Var = sy21Var.c;
        if (uz21Var == null || (strF = uz21Var.f()) == null) {
            strF = "Unknown error";
        }
        uh61.g(i4, strF);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, onm onmVar) {
        wxb1 wxb1Var;
        String strF;
        if (onmVar instanceof wxb1) {
            wxb1Var = (wxb1) onmVar;
            int i = wxb1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wxb1Var.c = i - Integer.MIN_VALUE;
            } else {
                wxb1Var = new wxb1(this, onmVar);
            }
        } else {
            wxb1Var = new wxb1(this, onmVar);
        }
        Object objE = wxb1Var.a;
        int i2 = wxb1Var.c;
        if (i2 == 0) {
            hm5.M(objE);
            wxb1Var.c = 1;
            objE = this.b.e(str, wxb1Var);
            d9n d9nVar = d9n.a;
            if (objE == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objE);
        }
        sy21 sy21Var = (sy21) objE;
        GetStickerResponse getStickerResponse = (GetStickerResponse) sy21Var.b;
        ry21 ry21Var = sy21Var.a;
        if (ry21Var.Q0 && getStickerResponse != null) {
            return m87.y(getStickerResponse);
        }
        int i3 = ry21Var.d;
        uz21 uz21Var = sy21Var.c;
        if (uz21Var == null || (strF = uz21Var.f()) == null) {
            strF = "Unknown error";
        }
        uh61.g(i3, strF);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, onm onmVar) {
        xxb1 xxb1Var;
        String strF;
        if (onmVar instanceof xxb1) {
            xxb1Var = (xxb1) onmVar;
            int i = xxb1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xxb1Var.c = i - Integer.MIN_VALUE;
            } else {
                xxb1Var = new xxb1(this, onmVar);
            }
        } else {
            xxb1Var = new xxb1(this, onmVar);
        }
        Object objB = xxb1Var.a;
        int i2 = xxb1Var.c;
        if (i2 == 0) {
            hm5.M(objB);
            xxb1Var.c = 1;
            objB = this.b.b(str, xxb1Var);
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
        sy21 sy21Var = (sy21) objB;
        GetSurfaceResponse getSurfaceResponse = (GetSurfaceResponse) sy21Var.b;
        ry21 ry21Var = sy21Var.a;
        if (ry21Var.Q0 && getSurfaceResponse != null) {
            return new nwb1(m87.A(getSurfaceResponse), m87.v(getSurfaceResponse));
        }
        int i3 = ry21Var.d;
        uz21 uz21Var = sy21Var.c;
        if (uz21Var == null || (strF = uz21Var.f()) == null) {
            strF = "Unknown error";
        }
        uh61.g(i3, strF);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(String str, onm onmVar) {
        yxb1 yxb1Var;
        if (onmVar instanceof yxb1) {
            yxb1Var = (yxb1) onmVar;
            int i = yxb1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                yxb1Var.d = i - Integer.MIN_VALUE;
            } else {
                yxb1Var = new yxb1(this, onmVar);
            }
        } else {
            yxb1Var = new yxb1(this, onmVar);
        }
        Object objL = yxb1Var.b;
        int i2 = yxb1Var.d;
        if (i2 == 0) {
            hm5.M(objL);
            Observable observableFilter = this.c.b(new oi("stickers-data-repo", new hqa1(str, (byte) 4))).filter(njx0.Q0);
            yxb1Var.a = str;
            yxb1Var.d = 1;
            objL = fc11.l(observableFilter, 2, null, yxb1Var);
            d9n d9nVar = d9n.a;
            if (objL == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = yxb1Var.a;
            hm5.M(objL);
        }
        uv00 uv00Var = (uv00) objL;
        jo70 jo70Var = uv00Var != null ? (jo70) uv00Var.a(jo70.class, str).b : null;
        xkk1 xkk1Var = uv00Var != null ? (xkk1) uv00Var.a(xkk1.class, str).b : null;
        if (jo70Var == null || xkk1Var == null) {
            return null;
        }
        return new sxb1(jo70Var, xkk1Var);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object g(int i, String str, String str2, onm onmVar) {
        zxb1 zxb1Var;
        Object m231Var;
        List list;
        Object value;
        if (onmVar instanceof zxb1) {
            zxb1Var = (zxb1) onmVar;
            int i2 = zxb1Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zxb1Var.c = i2 - Integer.MIN_VALUE;
            } else {
                zxb1Var = new zxb1(this, onmVar);
            }
        } else {
            zxb1Var = new zxb1(this, onmVar);
        }
        zxb1 zxb1Var2 = zxb1Var;
        Object objC = zxb1Var2.a;
        int i3 = zxb1Var2.c;
        bpb1 bpb1Var = this.g;
        try {
            if (i3 == 0) {
                hm5.M(objC);
                do {
                    value = bpb1Var.getValue();
                } while (!bpb1Var.k(value, rxb1.a((rxb1) value, (LinkedHashMap) null, (List) null, str, str2, i, (String) null, (List) null, false, 227)));
                zxb1Var2.c = 1;
                objC = c(str, str2, i, "", zxb1Var2);
                d9n d9nVar = d9n.a;
                if (objC == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i3 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objC);
            }
            m231Var = (mmr0) objC;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        boolean z = m231Var instanceof m231;
        bpb1 bpb1Var2 = this.e;
        if (!z) {
            mmr0 mmr0Var = (mmr0) m231Var;
            List list2 = (List) mmr0Var.a;
            String str3 = (String) mmr0Var.b;
            while (true) {
                Object value2 = bpb1Var.getValue();
                list = list2;
                if (bpb1Var.k(value2, rxb1.a((rxb1) value2, (LinkedHashMap) null, (List) null, (String) null, (String) null, 0, str3, list2, false, 159))) {
                    break;
                }
                list2 = list;
            }
            bpb1Var2.m(null, new c951(list));
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null && !(thA instanceof CancellationException)) {
            bpb1Var2.m(null, new o851(thA));
        }
        return rih1.a;
    }
}
