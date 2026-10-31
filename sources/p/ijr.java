package p;

import android.content.Context;
import io.reactivex.rxjava3.internal.operators.completable.CompletableSubscribeOn;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ijr {
    public final Context a;
    public final zfr b;
    public final x3h c;
    public final xqs d;
    public final zrg e;
    public final q8n f;
    public final idd1 g = new idd1(new z5o(this, (byte) 23));

    public ijr(Context context, zfr zfrVar, x3h x3hVar, xqs xqsVar, zrg zrgVar, q8n q8nVar) {
        this.a = context;
        this.b = zfrVar;
        this.c = x3hVar;
        this.d = xqsVar;
        this.e = zrgVar;
        this.f = q8nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) {
        bjr bjrVar;
        if (onmVar instanceof bjr) {
            bjrVar = (bjr) onmVar;
            int i = bjrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bjrVar.c = i - Integer.MIN_VALUE;
            } else {
                bjrVar = new bjr(this, onmVar);
            }
        } else {
            bjrVar = new bjr(this, onmVar);
        }
        Object objD = bjrVar.a;
        int i2 = bjrVar.c;
        rih1 rih1Var = rih1.a;
        try {
            if (i2 == 0) {
                hm5.M(objD);
                Set set = s4b1.f;
                if (uic.x(str).c != blc0.u1) {
                    n57.e("banArtistGlobally should only be used with Artist uris " + str);
                    return rih1Var;
                }
                zfr zfrVar = this.b;
                bjrVar.c = 1;
                objD = zfrVar.d(str, bjrVar);
                d9n d9nVar = d9n.a;
                if (objD == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objD);
            }
        } catch (Throwable unused) {
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:58:0x010e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0110  */
    /* JADX WARN: Code duplicated, block: B:61:0x0133 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object b(String str, String str2, boolean z, hly0 hly0Var, onm onmVar) {
        cjr cjrVar;
        hly0 hly0Var2;
        boolean z2;
        boolean zBooleanValue;
        String str3;
        String str4;
        boolean z3;
        hly0 hly0Var3;
        boolean z4;
        boolean z5;
        String str5;
        r4a r4aVar;
        boolean z6;
        String str6;
        a4h a4hVar;
        l24 l24Var;
        sr1 sr1Var;
        String str7 = str;
        String str8 = str2;
        if (onmVar instanceof cjr) {
            cjrVar = (cjr) onmVar;
            int i = cjrVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                cjrVar.h = i - Integer.MIN_VALUE;
            } else {
                cjrVar = new cjr(this, onmVar);
            }
        } else {
            cjrVar = new cjr(this, onmVar);
        }
        cjr cjrVar2 = cjrVar;
        Object objS = cjrVar2.f;
        int i2 = cjrVar2.h;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        try {
            if (i2 == 0) {
                hm5.M(objS);
                if (str8.length() <= 0 || u890.j(str, str2)) {
                    n57.e("banInContext should be used for banning on a given context, if you need a global ban, use banGlobally instead, itemUri " + str7 + ",contextUri: " + str8);
                    return rih1Var;
                }
                cjrVar2.a = str7;
                cjrVar2.b = str8;
                hly0Var2 = hly0Var;
                cjrVar2.c = hly0Var2;
                z2 = z;
                cjrVar2.d = z2;
                cjrVar2.h = 1;
                objS = smo1.s(new zlo(this, str7, str8, (lnm) null, (byte) 4), cjrVar2);
                if (objS != d9nVar) {
                }
                return d9nVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        hm5.M(objS);
                        return rih1Var;
                    }
                    if (i2 == 4) {
                        hm5.M(objS);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z3 = cjrVar2.e;
                z4 = cjrVar2.d;
                hly0Var3 = cjrVar2.c;
                str4 = cjrVar2.b;
                str3 = cjrVar2.a;
                try {
                    hm5.M(objS);
                    r4aVar = (r4a) objS;
                    String str9 = str3;
                    z5 = z3;
                    str5 = str9;
                } catch (Throwable th) {
                    th = th;
                    r4a m231Var = new m231(th);
                    String str10 = str3;
                    z5 = z3;
                    str5 = str10;
                    r4aVar = m231Var;
                }
                z6 = z4;
                str6 = str4;
                if (e331.a(r4aVar) != null) {
                    r4aVar = p4a.a;
                }
                Set set = s4b1.f;
                blc0 blc0Var = uic.x(str5).c;
                if ((r4aVar instanceof q4a) && blc0Var == blc0.ti) {
                    if (z5) {
                        sr1Var = new sr1(this, str5, str6, hly0Var3, (lnm) null, (byte) 8);
                        cjrVar2.a = null;
                        cjrVar2.b = null;
                        cjrVar2.c = null;
                        cjrVar2.d = z6;
                        cjrVar2.e = z5;
                        cjrVar2.h = 3;
                        if (c921.H(this.f, sr1Var, cjrVar2) == d9nVar) {
                            return d9nVar;
                        }
                    } else if (z6) {
                        a4hVar = (a4h) this.g.getValue();
                        l24Var = new l24(this, str5, str6, (lnm) null, (byte) 6);
                        cjrVar2.a = null;
                        cjrVar2.b = null;
                        cjrVar2.c = null;
                        cjrVar2.d = z6;
                        cjrVar2.e = z5;
                        cjrVar2.h = 4;
                        if (a4hVar.f(str6, l24Var, cjrVar2) == d9nVar) {
                            return d9nVar;
                        }
                    }
                }
                return rih1Var;
            }
            boolean z7 = cjrVar2.d;
            hly0 hly0Var4 = cjrVar2.c;
            String str11 = cjrVar2.b;
            String str12 = cjrVar2.a;
            hm5.M(objS);
            z2 = z7;
            hly0Var2 = hly0Var4;
            str8 = str11;
            str7 = str12;
            zfr zfrVar = this.b;
            String value = hly0Var2.getValue();
            cjrVar2.a = str7;
            cjrVar2.b = str8;
            cjrVar2.c = hly0Var2;
            cjrVar2.d = z2;
            cjrVar2.e = zBooleanValue;
            cjrVar2.h = 2;
            objS = zfrVar.e(str7, str8, value, cjrVar2);
            if (objS != d9nVar) {
                str3 = str7;
                str4 = str8;
                z3 = zBooleanValue;
                hly0Var3 = hly0Var2;
                z4 = z2;
                r4aVar = (r4a) objS;
                String str13 = str3;
                z5 = z3;
                str5 = str13;
                z6 = z4;
                str6 = str4;
                if (e331.a(r4aVar) != null) {
                    r4aVar = p4a.a;
                }
                Set set2 = s4b1.f;
                blc0 blc0Var2 = uic.x(str5).c;
                if (r4aVar instanceof q4a) {
                    if (z5) {
                        sr1Var = new sr1(this, str5, str6, hly0Var3, (lnm) null, (byte) 8);
                        cjrVar2.a = null;
                        cjrVar2.b = null;
                        cjrVar2.c = null;
                        cjrVar2.d = z6;
                        cjrVar2.e = z5;
                        cjrVar2.h = 3;
                        if (c921.H(this.f, sr1Var, cjrVar2) == d9nVar) {
                        }
                    } else if (z6) {
                        a4hVar = (a4h) this.g.getValue();
                        l24Var = new l24(this, str5, str6, (lnm) null, (byte) 6);
                        cjrVar2.a = null;
                        cjrVar2.b = null;
                        cjrVar2.c = null;
                        cjrVar2.d = z6;
                        cjrVar2.e = z5;
                        cjrVar2.h = 4;
                        if (a4hVar.f(str6, l24Var, cjrVar2) == d9nVar) {
                        }
                    }
                }
                return rih1Var;
            }
        } catch (Throwable th2) {
            th = th2;
            str3 = str7;
            str4 = str8;
            z3 = zBooleanValue;
            hly0Var3 = hly0Var2;
            z4 = z2;
            r4a m231Var2 = new m231(th);
            String str14 = str3;
            z5 = z3;
            str5 = str14;
            r4aVar = m231Var2;
        }
        zBooleanValue = ((Boolean) objS).booleanValue();
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, onm onmVar, boolean z) {
        djr djrVar;
        r4a m231Var;
        if (onmVar instanceof djr) {
            djrVar = (djr) onmVar;
            int i = djrVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                djrVar.d = i - Integer.MIN_VALUE;
            } else {
                djrVar = new djr(this, onmVar);
            }
        } else {
            djrVar = new djr(this, onmVar);
        }
        Object objD = djrVar.b;
        int i2 = djrVar.d;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        try {
            if (i2 == 0) {
                hm5.M(objD);
                Set set = s4b1.f;
                if (uic.x(str).c != blc0.ti) {
                    n57.e("banTrackGlobally should only be used with Track uris " + str);
                    return rih1Var;
                }
                zfr zfrVar = this.b;
                djrVar.a = z;
                djrVar.d = 1;
                objD = zfrVar.d(str, djrVar);
                if (objD == d9nVar) {
                }
                return d9nVar;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    hm5.M(objD);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = djrVar.a;
            hm5.M(objD);
            m231Var = (r4a) objD;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (e331.a(m231Var) != null) {
            m231Var = p4a.a;
        }
        r4a r4aVar = m231Var;
        if (z && !(r4aVar instanceof p4a)) {
            CompletableSubscribeOn completableSubscribeOnC = ((a4h) this.g.getValue()).c();
            djrVar.a = z;
            djrVar.d = 2;
            if (fc11.i(completableSubscribeOnC, djrVar) == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, String str2, onm onmVar) {
        ejr ejrVar;
        ijr ijrVar;
        String str3;
        if (onmVar instanceof ejr) {
            ejrVar = (ejr) onmVar;
            int i = ejrVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ejrVar.d = i - Integer.MIN_VALUE;
            } else {
                ejrVar = new ejr(this, onmVar);
            }
        } else {
            ejrVar = new ejr(this, onmVar);
        }
        Object objS = ejrVar.b;
        int i2 = ejrVar.d;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objS);
            ejrVar.a = str;
            ejrVar.d = 1;
            ijrVar = this;
            objS = smo1.s(new zlo(ijrVar, str, str2, (lnm) null, (byte) 4), ejrVar);
            if (objS != d9nVar) {
                str3 = str;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objS);
                return objS;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str3 = ejrVar.a;
        hm5.M(objS);
        ijrVar = this;
        if (!((Boolean) objS).booleanValue()) {
            return yah0.m(false);
        }
        ejrVar.a = null;
        ejrVar.d = 2;
        Object objM = ijrVar.b.m(str3, ejrVar);
        return objM == d9nVar ? d9nVar : objM;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, onm onmVar) {
        fjr fjrVar;
        if (onmVar instanceof fjr) {
            fjrVar = (fjr) onmVar;
            int i = fjrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fjrVar.c = i - Integer.MIN_VALUE;
            } else {
                fjrVar = new fjr(this, onmVar);
            }
        } else {
            fjrVar = new fjr(this, onmVar);
        }
        Object objX = fjrVar.a;
        int i2 = fjrVar.c;
        rih1 rih1Var = rih1.a;
        try {
            if (i2 == 0) {
                hm5.M(objX);
                Set set = s4b1.f;
                blc0 blc0Var = uic.x(str).c;
                if (blc0Var != blc0.u1 && blc0Var != blc0.ti) {
                    n57.e("unBanGlobally should only be used with Artist  or Track uris " + str);
                    return rih1Var;
                }
                zfr zfrVar = this.b;
                fjrVar.c = 1;
                objX = zfrVar.x(str, fjrVar);
                d9n d9nVar = d9n.a;
                if (objX == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objX);
            }
        } catch (Throwable unused) {
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0089  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object f(String str, String str2, onm onmVar) {
        gjr gjrVar;
        String str3;
        String str4;
        String str5;
        String str6;
        if (onmVar instanceof gjr) {
            gjrVar = (gjr) onmVar;
            int i = gjrVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                gjrVar.e = i - Integer.MIN_VALUE;
            } else {
                gjrVar = new gjr(this, onmVar);
            }
        } else {
            gjrVar = new gjr(this, onmVar);
        }
        gjr gjrVar2 = gjrVar;
        Object objS = gjrVar2.c;
        int i2 = gjrVar2.e;
        zfr zfrVar = this.b;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objS);
            if (str2.length() <= 0 || u890.j(str, str2)) {
                n57.e("unbanInContext should be used for unbanning on a given context, if you need a global unban, use unbanInContext instead, itemUri " + str + ",contextUri: " + str2);
                return rih1Var;
            }
            gjrVar2.a = str;
            gjrVar2.b = str2;
            gjrVar2.e = 1;
            if (zfrVar.y(str, str2, gjrVar2) != d9nVar) {
                str3 = str;
                str4 = str2;
            }
            return d9nVar;
        }
        if (i2 == 1) {
            String str7 = gjrVar2.b;
            str3 = gjrVar2.a;
            hm5.M(objS);
            str4 = str7;
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    hm5.M(objS);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str6 = gjrVar2.a;
            hm5.M(objS);
            str5 = null;
        }
        if (((Boolean) objS).booleanValue()) {
            gjrVar2.a = str5;
            gjrVar2.b = str5;
            gjrVar2.e = 3;
            if (zfrVar.v(str6, gjrVar2) == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
        gjrVar2.a = str3;
        gjrVar2.b = null;
        gjrVar2.e = 2;
        str5 = null;
        objS = smo1.s(new zlo(this, str3, str4, (lnm) null, (byte) 4), gjrVar2);
        if (objS != d9nVar) {
            str6 = str3;
            if (((Boolean) objS).booleanValue()) {
                gjrVar2.a = str5;
                gjrVar2.b = str5;
                gjrVar2.e = 3;
                if (zfrVar.v(str6, gjrVar2) == d9nVar) {
                }
            }
            return rih1Var;
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0090  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:43:0x0118  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008a, code lost:
    
        r0 = r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(java.lang.String r16, java.util.ArrayList r17, p.onm r18) {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ijr.g(java.lang.String, java.util.ArrayList, p.onm):java.lang.Object");
    }
}
