package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ezw implements b1x {
    public final /* synthetic */ byte a = 0;
    public final ao0 b;
    public final Object c;
    public final Object d;

    public ezw(ip31 ip31Var, ao0 ao0Var, j44 j44Var) {
        this.c = ip31Var;
        this.b = ao0Var;
        this.d = j44Var;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0071  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:61:0x010b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:? A[LOOP:0: B:48:0x00db->B:65:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    public final Object a(ji0 ji0Var, lnm lnmVar) {
        dzw dzwVar;
        Iterator it;
        Object obj;
        String str;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof dzw) {
                    dzwVar = (dzw) lnmVar;
                    int i = dzwVar.d;
                    if ((i & os00.INVALID_ID) != 0) {
                        dzwVar.d = i - os00.INVALID_ID;
                    } else {
                        dzwVar = new dzw(this, (onm) lnmVar);
                    }
                } else {
                    dzwVar = new dzw(this, (onm) lnmVar);
                }
                Object objE = dzwVar.b;
                int i2 = dzwVar.d;
                int i3 = 1;
                if (i2 == 0) {
                    hm5.M(objE);
                    List listJ = o2p1.j(ji0Var);
                    if (listJ.isEmpty()) {
                        i3 = 6;
                    } else {
                        List list = listJ;
                        boolean z = list instanceof Collection;
                        if (z && list.isEmpty()) {
                            if (z) {
                                it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((hj0) it.next()).d.b()) {
                                            dzwVar.a = ji0Var;
                                            dzwVar.d = 1;
                                            objE = e(listJ, dzwVar);
                                            obj = d9n.a;
                                            if (objE == obj) {
                                                return obj;
                                            }
                                        }
                                    }
                                }
                            } else {
                                it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((hj0) it.next()).d.b()) {
                                            dzwVar.a = ji0Var;
                                            dzwVar.d = 1;
                                            objE = e(listJ, dzwVar);
                                            obj = d9n.a;
                                            if (objE == obj) {
                                                return obj;
                                            }
                                        }
                                    }
                                }
                            }
                            i3 = 7;
                        } else {
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    if (z || !list.isEmpty()) {
                                        it = list.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                if (((hj0) it.next()).d.b()) {
                                                    dzwVar.a = ji0Var;
                                                    dzwVar.d = 1;
                                                    objE = e(listJ, dzwVar);
                                                    obj = d9n.a;
                                                    if (objE == obj) {
                                                        return obj;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i3 = 7;
                                } else if (((hj0) it2.next()).a.length() == 0) {
                                    i3 = 5;
                                }
                            }
                        }
                    }
                    if (i3 != 0) {
                        return rih1Var;
                    }
                    ao0.c(this.b, co0.i, ji0Var.a, (Long) null, kk0.e(i3), (String) null, (String) null, (String) null, 116);
                    return new m231(new IllegalStateException("Ad Carousel Failed to Prerender"));
                }
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ji0Var = dzwVar.a;
                hm5.M(objE);
                if (((Boolean) objE).booleanValue()) {
                    i3 = 0;
                }
                if (i3 != 0) {
                    return rih1Var;
                }
                ao0.c(this.b, co0.i, ji0Var.a, (Long) null, kk0.e(i3), (String) null, (String) null, (String) null, 116);
                return new m231(new IllegalStateException("Ad Carousel Failed to Prerender"));
            default:
                zy60 zy60Var = (zy60) o7h.s0(ji0Var.g.c);
                if (zy60Var == null || (str = zy60Var.c) == null || str.length() == 0) {
                    ao0.a(this.b, co0.i, ji0Var.a, (Long) null, "missing_creative", (String) null, 116);
                    return new m231(new IllegalStateException("HTML Ad Failed to Prerender: missing creative"));
                }
                if (zy60Var.a > 0 && zy60Var.b > 0) {
                    return rih1Var;
                }
                ao0.a(this.b, co0.i, ji0Var.a, (Long) null, "dimensions_error", (String) null, 116);
                return new m231(new IllegalStateException("HTML Ad Failed to Prerender: invalid dimensions"));
        }
    }

    public final boolean b(ji0 ji0Var) {
        switch (this.a) {
            case 0:
                return u890.j(ji0Var.W0, "npv_carousel");
            default:
                return ((j44) this.d).d() && ((zy60) o7h.s0(ji0Var.g.c)) != null;
        }
    }

    public final xu30 c() {
        switch (this.a) {
            case 0:
                return new oat(this, (byte) 24);
            default:
                return new oat(this, (byte) 26);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(List list, onm onmVar) {
        czw czwVar;
        if (onmVar instanceof czw) {
            czwVar = (czw) onmVar;
            int i = czwVar.c;
            if ((i & os00.INVALID_ID) != 0) {
                czwVar.c = i - os00.INVALID_ID;
            } else {
                czwVar = new czw(this, onmVar);
            }
        } else {
            czwVar = new czw(this, onmVar);
        }
        Object obj = czwVar.a;
        int i2 = czwVar.c;
        boolean z = true;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                l2w l2wVar = new l2w(list, this, (lnm) null, (byte) 2);
                czwVar.c = 1;
                Object objS = smo1.s(l2wVar, czwVar);
                d9n d9nVar = d9n.a;
                if (objS == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (Exception unused) {
            op71.x(czwVar.getContext());
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public ezw(gw70 gw70Var, o860 o860Var, ao0 ao0Var) {
        this.c = gw70Var;
        this.d = o860Var;
        this.b = ao0Var;
    }
}
