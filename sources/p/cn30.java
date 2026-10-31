package p;

import android.os.Parcelable;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cn30 {
    public final /* synthetic */ byte a;
    public final ser b;
    public final v5n c;
    public final mr20 d;
    public final q8n e;

    public /* synthetic */ cn30(ser serVar, v5n v5nVar, mr20 mr20Var, q8n q8nVar, byte b) {
        this.a = b;
        this.b = serVar;
        this.c = v5nVar;
        this.d = mr20Var;
        this.e = q8nVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b2 A[LOOP:0: B:26:0x00ac->B:28:0x00b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e0, code lost:
    
        if (p.fn31.Y(r12.e, r5, r0) == r11) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.lang.String r13, java.util.List r14, p.onm r15) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.cn30.a(java.lang.String, java.util.List, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002d  */
    /* JADX WARN: Code duplicated, block: B:38:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    public Object b(String str, onm onmVar) {
        an30 an30Var;
        String str2;
        String str3;
        String str4;
        piu piuVar;
        yp90 yp90Var;
        String str5;
        String str6;
        String str7;
        az80 az80Var;
        String str8 = str;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        q8n q8nVar = this.e;
        mr20 mr20Var = this.d;
        Object obj = d9n.a;
        switch (b) {
            case 0:
                if (onmVar instanceof an30) {
                    an30Var = (an30) onmVar;
                    int i = an30Var.f;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        an30Var.f = i - Integer.MIN_VALUE;
                    } else {
                        an30Var = new an30(this, onmVar);
                    }
                } else {
                    an30Var = new an30(this, onmVar);
                }
                an30 an30Var2 = an30Var;
                Object objJ = an30Var2.d;
                int i2 = an30Var2.f;
                lnm lnmVar = null;
                if (i2 == 0) {
                    hm5.M(objJ);
                    afv afvVar = new afv(2, null, (byte) 14);
                    an30Var2.a = null;
                    an30Var2.b = str8;
                    an30Var2.f = 1;
                    objJ = b5p1.j(mr20Var, afvVar, an30Var2);
                    if (objJ != obj) {
                        str2 = null;
                    }
                    return obj;
                }
                if (i2 == 1) {
                    str8 = an30Var2.b;
                    String str9 = an30Var2.a;
                    hm5.M(objJ);
                    str2 = str9;
                } else {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            hm5.M(objJ);
                            return rih1Var;
                        }
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str4 = an30Var2.c;
                    str3 = an30Var2.b;
                    str2 = an30Var2.a;
                    hm5.M(objJ);
                }
                Map map = (Map) objJ;
                piuVar = new piu((Object) this, str2, (Parcelable) new en30(sj1.A((eww0) map.get(str4), str4), sj1.A((eww0) map.get(str3), str3)), lnmVar, (byte) 18);
                an30Var2.a = null;
                an30Var2.b = null;
                an30Var2.c = null;
                an30Var2.f = 3;
                if (fn31.Y(q8nVar, piuVar, an30Var2) != obj) {
                    return rih1Var;
                }
                return obj;
                String str10 = ((th61) objJ).a;
                List listM = p7h.M(new String[]{str10, str8});
                an30Var2.a = str2;
                an30Var2.b = str8;
                an30Var2.c = str10;
                an30Var2.f = 2;
                Object objD = d(listM, an30Var2);
                if (objD != obj) {
                    str3 = str8;
                    str4 = str10;
                    objJ = objD;
                    Map map2 = (Map) objJ;
                    piuVar = new piu((Object) this, str2, (Parcelable) new en30(sj1.A((eww0) map2.get(str4), str4), sj1.A((eww0) map2.get(str3), str3)), lnmVar, (byte) 18);
                    an30Var2.a = null;
                    an30Var2.b = null;
                    an30Var2.c = null;
                    an30Var2.f = 3;
                    if (fn31.Y(q8nVar, piuVar, an30Var2) != obj) {
                        return rih1Var;
                    }
                }
                return obj;
            default:
                if (onmVar instanceof yp90) {
                    yp90Var = (yp90) onmVar;
                    int i3 = yp90Var.f;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        yp90Var.f = i3 - Integer.MIN_VALUE;
                    } else {
                        yp90Var = new yp90(this, onmVar);
                    }
                } else {
                    yp90Var = new yp90(this, onmVar);
                }
                yp90 yp90Var2 = yp90Var;
                Object objJ2 = yp90Var2.d;
                int i4 = yp90Var2.f;
                lnm lnmVar2 = null;
                if (i4 == 0) {
                    hm5.M(objJ2);
                    afv afvVar2 = new afv(2, null, (byte) 27);
                    yp90Var2.a = null;
                    yp90Var2.b = str8;
                    yp90Var2.f = 1;
                    objJ2 = b5p1.j(mr20Var, afvVar2, yp90Var2);
                    if (objJ2 != obj) {
                        str5 = null;
                    }
                    return obj;
                }
                if (i4 == 1) {
                    str8 = yp90Var2.b;
                    String str11 = yp90Var2.a;
                    hm5.M(objJ2);
                    str5 = str11;
                } else {
                    if (i4 != 2) {
                        if (i4 == 3) {
                            hm5.M(objJ2);
                            return rih1Var;
                        }
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str7 = yp90Var2.c;
                    str6 = yp90Var2.b;
                    str5 = yp90Var2.a;
                    hm5.M(objJ2);
                }
                Map map3 = (Map) objJ2;
                az80Var = new az80(this, str5, new bq90(pxd0.V((eww0) map3.get(str7), str7), pxd0.V((eww0) map3.get(str6), str6)), lnmVar2, (byte) 2);
                yp90Var2.a = null;
                yp90Var2.b = null;
                yp90Var2.c = null;
                yp90Var2.f = 3;
                if (fn31.Y(q8nVar, az80Var, yp90Var2) != obj) {
                    return rih1Var;
                }
                return obj;
                String str12 = ((th61) objJ2).a;
                List listM2 = p7h.M(new String[]{str12, str8});
                yp90Var2.a = str5;
                yp90Var2.b = str8;
                yp90Var2.c = str12;
                yp90Var2.f = 2;
                Object objD2 = d(listM2, yp90Var2);
                if (objD2 != obj) {
                    str6 = str8;
                    str7 = str12;
                    objJ2 = objD2;
                    Map map4 = (Map) objJ2;
                    az80Var = new az80(this, str5, new bq90(pxd0.V((eww0) map4.get(str7), str7), pxd0.V((eww0) map4.get(str6), str6)), lnmVar2, (byte) 2);
                    yp90Var2.a = null;
                    yp90Var2.b = null;
                    yp90Var2.c = null;
                    yp90Var2.f = 3;
                    if (fn31.Y(q8nVar, az80Var, yp90Var2) != obj) {
                        return rih1Var;
                    }
                }
                return obj;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(ArrayList arrayList, onm onmVar) {
        wib1 wib1Var;
        if (onmVar instanceof wib1) {
            wib1Var = (wib1) onmVar;
            int i = wib1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wib1Var.c = i - Integer.MIN_VALUE;
            } else {
                wib1Var = new wib1(this, onmVar);
            }
        } else {
            wib1Var = new wib1(this, onmVar);
        }
        Object objK = wib1Var.a;
        int i2 = wib1Var.c;
        if (i2 == 0) {
            hm5.M(objK);
            Observable map = this.c.d(arrayList).map(pdx0.Q0);
            l4b1 l4b1Var = l4b1.O0;
            wib1Var.c = 1;
            objK = fc11.k(map, l4b1Var, wib1Var);
            d9n d9nVar = d9n.a;
            if (objK == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objK);
        }
        return objK;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    public Object d(List list, onm onmVar) {
        bn30 bn30Var;
        zp90 zp90Var;
        byte b = this.a;
        v5n v5nVar = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (onmVar instanceof bn30) {
                    bn30Var = (bn30) onmVar;
                    int i = bn30Var.c;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        bn30Var.c = i - Integer.MIN_VALUE;
                    } else {
                        bn30Var = new bn30(this, onmVar);
                    }
                } else {
                    bn30Var = new bn30(this, onmVar);
                }
                Object objK = bn30Var.a;
                int i2 = bn30Var.c;
                if (i2 == 0) {
                    hm5.M(objK);
                    Observable map = v5nVar.d(list).map(yj20.c);
                    bc30 bc30Var = bc30.e;
                    bn30Var.c = 1;
                    objK = fc11.k(map, bc30Var, bn30Var);
                    if (objK == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i2 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(objK);
                }
                return objK;
            default:
                if (onmVar instanceof zp90) {
                    zp90Var = (zp90) onmVar;
                    int i3 = zp90Var.c;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        zp90Var.c = i3 - Integer.MIN_VALUE;
                    } else {
                        zp90Var = new zp90(this, onmVar);
                    }
                } else {
                    zp90Var = new zp90(this, onmVar);
                }
                Object objK2 = zp90Var.a;
                int i4 = zp90Var.c;
                if (i4 == 0) {
                    hm5.M(objK2);
                    Observable map2 = v5nVar.d(list).map(kc20.g);
                    lx70 lx70Var = lx70.S0;
                    zp90Var.c = 1;
                    objK2 = fc11.k(map2, lx70Var, zp90Var);
                    if (objK2 == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i4 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(objK2);
                }
                return objK2;
        }
    }
}
