package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.campfire.service.api.ChatWithParticipantsNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pcd {
    public final kly0 a;
    public final kly0 b;
    public final mr20 c;
    public final yqg d;
    public final kly0 e;
    public final xgn0 f = ygn0.a();

    public pcd(gbp gbpVar, gbp gbpVar2, mr20 mr20Var, yqg yqgVar, gbp gbpVar3) {
        this.a = gbpVar;
        this.b = gbpVar2;
        this.c = mr20Var;
        this.d = yqgVar;
        this.e = gbpVar3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(bfd bfdVar, goe goeVar, String str, tom tomVar, onm onmVar) {
        kcd kcdVar;
        goe goeVar2;
        if (onmVar instanceof kcd) {
            kcdVar = (kcd) onmVar;
            int i = kcdVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                kcdVar.d = i - Integer.MIN_VALUE;
            } else {
                kcdVar = new kcd(this, onmVar);
            }
        } else {
            kcdVar = new kcd(this, onmVar);
        }
        Object obj = kcdVar.b;
        int i2 = kcdVar.d;
        if (i2 == 0) {
            hm5.M(obj);
            op71.x(kcdVar.getContext());
            d9n d9nVar = d9n.a;
            if (goeVar == null) {
                h8d h8dVar = new h8d(str, new n8d(tomVar));
                kcdVar.a = goeVar;
                kcdVar.d = 1;
                Object objE = bfdVar.e(h8dVar, kcdVar);
                if (objE != d9nVar) {
                    obj = objE;
                    goeVar2 = (goe) obj;
                }
            } else {
                g8d g8dVar = new g8d(goeVar.a, tomVar.a, new e8d(tomVar, false), true);
                kcdVar.a = goeVar;
                kcdVar.d = 2;
                Object objG = bfdVar.G(g8dVar, kcdVar);
                if (objG != d9nVar) {
                    obj = objG;
                    goeVar2 = (goe) obj;
                }
            }
            return d9nVar;
        }
        if (i2 == 1) {
            goeVar = kcdVar.a;
            hm5.M(obj);
            goeVar2 = (goe) obj;
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            goeVar = kcdVar.a;
            hm5.M(obj);
            goeVar2 = (goe) obj;
        }
        op71.x(kcdVar.getContext());
        String str2 = goeVar2.a;
        if (ihc1.y0(str2)) {
            return new ccd(wbd.a);
        }
        return (goeVar == null || u890.j(str2, goeVar.a)) ? new icd(str2) : new ccd(wbd.b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(bfd bfdVar, String str, String str2, onm onmVar) {
        lcd lcdVar;
        if (onmVar instanceof lcd) {
            lcdVar = (lcd) onmVar;
            int i = lcdVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lcdVar.c = i - Integer.MIN_VALUE;
            } else {
                lcdVar = new lcd(this, onmVar);
            }
        } else {
            lcdVar = new lcd(this, onmVar);
        }
        Object objQ = lcdVar.a;
        int i2 = lcdVar.c;
        try {
            if (i2 == 0) {
                hm5.M(objQ);
                List listM = p7h.M(new String[]{str, str2});
                lcdVar.c = 1;
                objQ = bfdVar.q(listM, true, lcdVar);
                d9n d9nVar = d9n.a;
                if (objQ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objQ);
            }
            return (goe) objQ;
        } catch (ChatWithParticipantsNotFoundException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(bfd bfdVar, goe goeVar, String str, String str2, onm onmVar) {
        mcd mcdVar;
        if (onmVar instanceof mcd) {
            mcdVar = (mcd) onmVar;
            int i = mcdVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                mcdVar.f = i - Integer.MIN_VALUE;
            } else {
                mcdVar = new mcd(this, onmVar);
            }
        } else {
            mcdVar = new mcd(this, onmVar);
        }
        Object objI = mcdVar.d;
        int i2 = mcdVar.f;
        if (i2 == 0) {
            hm5.M(objI);
            if (!u890.j(goeVar.b, atf.a) || !goeVar.c.h()) {
                return new ubd(goeVar);
            }
            mr20 mr20VarZ = bfdVar.z(goeVar.a, 0, false);
            mcdVar.a = goeVar;
            mcdVar.b = str;
            mcdVar.c = str2;
            mcdVar.f = 1;
            objI = b5p1.i(mr20VarZ, mcdVar);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = mcdVar.c;
            str = mcdVar.b;
            goeVar = mcdVar.a;
            hm5.M(objI);
        }
        Object obj = ((e331) objI).a;
        hm5.M(obj);
        goe goeVar2 = (goe) obj;
        op71.x(mcdVar.getContext());
        if (!u890.j(goeVar2.a, goeVar.a)) {
            return new tbd(xbd.a);
        }
        List list = goeVar2.e;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((jwm) it.next()).a.a);
        }
        return !o7h.p1(arrayList).equals(f46.S0(new String[]{str, str2})) ? new tbd(xbd.b) : new ubd(goeVar2);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:45:0x010c  */
    /* JADX WARN: Code duplicated, block: B:50:0x011e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0134  */
    /* JADX WARN: Code duplicated, block: B:56:0x013b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0141  */
    /* JADX WARN: Code duplicated, block: B:59:0x0145  */
    /* JADX WARN: Code duplicated, block: B:61:0x014f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0153  */
    /* JADX WARN: Code duplicated, block: B:66:0x015d  */
    /* JADX WARN: Code duplicated, block: B:68:0x016b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0171  */
    /* JADX WARN: Code duplicated, block: B:71:0x0177  */
    /* JADX WARN: Code duplicated, block: B:73:0x017d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0183  */
    /* JADX WARN: Code duplicated, block: B:75:0x0185  */
    /* JADX WARN: Code duplicated, block: B:77:0x018b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0192 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:81:0x0195  */
    /* JADX WARN: Code duplicated, block: B:82:0x0198  */
    /* JADX WARN: Code duplicated, block: B:84:0x019b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0205 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object d(zu90 zu90Var, String str, onm onmVar) {
        ncd ncdVar;
        String str2;
        String str3;
        bfd bfdVar;
        Object objB;
        zu90 zu90Var2;
        bfd bfdVar2;
        goe goeVar;
        goe goeVar2;
        zu90 zu90Var3;
        String str4;
        Object objA;
        ctf ctfVar;
        String str5;
        zks0 zks0Var;
        Object hcdVar;
        vbd vbdVar;
        zu90 zu90Var4 = zu90Var;
        if (onmVar instanceof ncd) {
            ncdVar = (ncd) onmVar;
            int i = ncdVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                ncdVar.f = i - Integer.MIN_VALUE;
            } else {
                ncdVar = new ncd(this, onmVar);
            }
        } else {
            ncdVar = new ncd(this, onmVar);
        }
        ncd ncdVar2 = ncdVar;
        Object objA2 = ncdVar2.d;
        int i2 = ncdVar2.f;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objA2);
            op71.x(ncdVar2.getContext());
            b4s b4sVar = (b4s) this.b.get();
            String str6 = zu90Var4.d;
            ncdVar2.a = zu90Var4;
            str2 = str;
            ncdVar2.b = str2;
            ncdVar2.f = 1;
            objA2 = b4sVar.a(str6, ncdVar2);
            if (objA2 != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            String str7 = ncdVar2.b;
            zu90 zu90Var5 = ncdVar2.a;
            hm5.M(objA2);
            str2 = str7;
            zu90Var4 = zu90Var5;
        } else {
            if (i2 == 2) {
                String str8 = ncdVar2.b;
                zu90 zu90Var6 = ncdVar2.a;
                hm5.M(objA2);
                str3 = str8;
                zu90Var4 = zu90Var6;
                if (!((Boolean) objA2).booleanValue()) {
                    return acd.a;
                }
                op71.x(ncdVar2.getContext());
                bfdVar = (bfd) this.a.get();
                bfdVar.getClass();
                String str9 = zu90Var4.d;
                ncdVar2.a = zu90Var4;
                ncdVar2.b = str3;
                ncdVar2.c = bfdVar;
                ncdVar2.f = 3;
                objB = b(bfdVar, str3, str9, ncdVar2);
                if (objB != obj) {
                    zu90Var2 = zu90Var4;
                    bfdVar2 = bfdVar;
                    objA2 = objB;
                    goeVar = (goe) objA2;
                    op71.x(ncdVar2.getContext());
                    if (goeVar == null) {
                    }
                    if (goeVar != null) {
                        bfdVar2.getClass();
                        String str10 = zu90Var2.d;
                        ncdVar2.a = zu90Var2;
                        ncdVar2.b = str3;
                        ncdVar2.c = bfdVar2;
                        ncdVar2.f = 4;
                        objA2 = c(bfdVar2, goeVar, str3, str10, ncdVar2);
                        if (objA2 != obj) {
                            zu90Var3 = zu90Var2;
                        }
                    } else {
                        goeVar2 = null;
                        op71.x(ncdVar2.getContext());
                        if (goeVar2 != null) {
                            ctfVar = goeVar2.b;
                            str5 = goeVar2.a;
                            zks0Var = goeVar2.c;
                            if (!u890.j(ctfVar, atf.a)) {
                                hcdVar = new hcd(str5, ctfVar, zks0Var);
                            } else if (zks0Var.h()) {
                                if (bpo1.w(goeVar2, str3)) {
                                    hcdVar = new fcd(str5);
                                } else {
                                    hcdVar = null;
                                }
                            } else if (zks0Var.a()) {
                                hcdVar = null;
                            } else {
                                hcdVar = new hcd(str5, ctfVar, zks0Var);
                            }
                            if (hcdVar != null) {
                                return hcdVar;
                            }
                        }
                        if (goeVar2 != null) {
                            str4 = goeVar2.a;
                        } else {
                            str4 = null;
                        }
                        if (str4 == null) {
                            str4 = "";
                        }
                        tom tomVar = new tom(UUID.randomUUID().toString(), str4, new w4i1(str3, str3, 12, (String) null), this.d.b() / 1000, true, new lpl(zu90Var2.e, (bc71) null, (String) null, new bpl(zu90Var2.c, zu90Var2.d), (hmp0) null, (String) null, (String) null, 118), new pom(false), (ArrayList) null, (ArrayList) null, (nom) null, false, (xo2) null, 3968);
                        bfdVar2.getClass();
                        String str11 = zu90Var2.d;
                        ncdVar2.a = null;
                        ncdVar2.b = null;
                        ncdVar2.c = null;
                        ncdVar2.f = 5;
                        objA = a(bfdVar2, goeVar2, str11, tomVar, ncdVar2);
                        if (objA == obj) {
                            return objA;
                        }
                    }
                }
                return obj;
            }
            if (i2 == 3) {
                bfdVar2 = ncdVar2.c;
                str3 = ncdVar2.b;
                zu90Var2 = ncdVar2.a;
                hm5.M(objA2);
                goeVar = (goe) objA2;
                op71.x(ncdVar2.getContext());
                if (goeVar == null && ihc1.y0(goeVar.a)) {
                    return new ccd(wbd.a);
                }
                if (goeVar != null) {
                    bfdVar2.getClass();
                    String str12 = zu90Var2.d;
                    ncdVar2.a = zu90Var2;
                    ncdVar2.b = str3;
                    ncdVar2.c = bfdVar2;
                    ncdVar2.f = 4;
                    objA2 = c(bfdVar2, goeVar, str3, str12, ncdVar2);
                    if (objA2 != obj) {
                        zu90Var3 = zu90Var2;
                    }
                } else {
                    goeVar2 = null;
                    op71.x(ncdVar2.getContext());
                    if (goeVar2 != null) {
                        ctfVar = goeVar2.b;
                        str5 = goeVar2.a;
                        zks0Var = goeVar2.c;
                        if (!u890.j(ctfVar, atf.a)) {
                            hcdVar = new hcd(str5, ctfVar, zks0Var);
                        } else if (zks0Var.h()) {
                            if (bpo1.w(goeVar2, str3)) {
                                hcdVar = new fcd(str5);
                            } else {
                                hcdVar = null;
                            }
                        } else if (zks0Var.a()) {
                            hcdVar = new hcd(str5, ctfVar, zks0Var);
                        } else {
                            hcdVar = null;
                        }
                        if (hcdVar != null) {
                            return hcdVar;
                        }
                    }
                    if (goeVar2 != null) {
                        str4 = goeVar2.a;
                    } else {
                        str4 = null;
                    }
                    if (str4 == null) {
                        str4 = "";
                    }
                    tom tomVar2 = new tom(UUID.randomUUID().toString(), str4, new w4i1(str3, str3, 12, (String) null), this.d.b() / 1000, true, new lpl(zu90Var2.e, (bc71) null, (String) null, new bpl(zu90Var2.c, zu90Var2.d), (hmp0) null, (String) null, (String) null, 118), new pom(false), (ArrayList) null, (ArrayList) null, (nom) null, false, (xo2) null, 3968);
                    bfdVar2.getClass();
                    String str13 = zu90Var2.d;
                    ncdVar2.a = null;
                    ncdVar2.b = null;
                    ncdVar2.c = null;
                    ncdVar2.f = 5;
                    objA = a(bfdVar2, goeVar2, str13, tomVar2, ncdVar2);
                    if (objA == obj) {
                        return objA;
                    }
                }
                return obj;
            }
            if (i2 != 4) {
                if (i2 == 5) {
                    hm5.M(objA2);
                    return objA2;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bfdVar2 = ncdVar2.c;
            str3 = ncdVar2.b;
            zu90Var3 = ncdVar2.a;
            hm5.M(objA2);
        }
        vbdVar = (vbd) objA2;
        if (vbdVar instanceof ubd) {
            if (vbdVar instanceof tbd) {
                return new dcd(((tbd) vbdVar).a);
            }
            eg.o();
            return null;
        }
        goeVar2 = ((ubd) vbdVar).a;
        zu90Var2 = zu90Var3;
        op71.x(ncdVar2.getContext());
        if (goeVar2 != null) {
            ctfVar = goeVar2.b;
            str5 = goeVar2.a;
            zks0Var = goeVar2.c;
            if (!u890.j(ctfVar, atf.a)) {
                hcdVar = new hcd(str5, ctfVar, zks0Var);
            } else if (zks0Var.h()) {
                if (bpo1.w(goeVar2, str3)) {
                    hcdVar = new fcd(str5);
                } else {
                    hcdVar = null;
                }
            } else if (zks0Var.a()) {
                hcdVar = new hcd(str5, ctfVar, zks0Var);
            } else {
                hcdVar = null;
            }
            if (hcdVar != null) {
                return hcdVar;
            }
        }
        if (goeVar2 != null) {
            str4 = goeVar2.a;
        } else {
            str4 = null;
        }
        if (str4 == null) {
            str4 = "";
        }
        tom tomVar3 = new tom(UUID.randomUUID().toString(), str4, new w4i1(str3, str3, 12, (String) null), this.d.b() / 1000, true, new lpl(zu90Var2.e, (bc71) null, (String) null, new bpl(zu90Var2.c, zu90Var2.d), (hmp0) null, (String) null, (String) null, 118), new pom(false), (ArrayList) null, (ArrayList) null, (nom) null, false, (xo2) null, 3968);
        bfdVar2.getClass();
        String str14 = zu90Var2.d;
        ncdVar2.a = null;
        ncdVar2.b = null;
        ncdVar2.c = null;
        ncdVar2.f = 5;
        objA = a(bfdVar2, goeVar2, str14, tomVar3, ncdVar2);
        if (objA == obj) {
            return obj;
        }
        return objA;
        if (!((Boolean) objA2).booleanValue()) {
            return new zbd(zu90Var4.d);
        }
        op71.x(ncdVar2.getContext());
        ylr ylrVar = (ylr) this.e.get();
        ncdVar2.a = zu90Var4;
        ncdVar2.b = str2;
        ncdVar2.f = 2;
        objA2 = b5p1.i(ylrVar.a.a("chats-disclaimer-accepted", false), ncdVar2);
        if (objA2 != obj) {
            str3 = str2;
            if (!((Boolean) objA2).booleanValue()) {
                return acd.a;
            }
            op71.x(ncdVar2.getContext());
            bfdVar = (bfd) this.a.get();
            bfdVar.getClass();
            String str15 = zu90Var4.d;
            ncdVar2.a = zu90Var4;
            ncdVar2.b = str3;
            ncdVar2.c = bfdVar;
            ncdVar2.f = 3;
            objB = b(bfdVar, str3, str15, ncdVar2);
            if (objB != obj) {
                zu90Var2 = zu90Var4;
                bfdVar2 = bfdVar;
                objA2 = objB;
                goeVar = (goe) objA2;
                op71.x(ncdVar2.getContext());
                if (goeVar == null) {
                }
                if (goeVar != null) {
                    bfdVar2.getClass();
                    String str16 = zu90Var2.d;
                    ncdVar2.a = zu90Var2;
                    ncdVar2.b = str3;
                    ncdVar2.c = bfdVar2;
                    ncdVar2.f = 4;
                    objA2 = c(bfdVar2, goeVar, str3, str16, ncdVar2);
                    if (objA2 != obj) {
                        zu90Var3 = zu90Var2;
                        vbdVar = (vbd) objA2;
                        if (vbdVar instanceof ubd) {
                            if (vbdVar instanceof tbd) {
                                return new dcd(((tbd) vbdVar).a);
                            }
                            eg.o();
                            return null;
                        }
                        goeVar2 = ((ubd) vbdVar).a;
                        zu90Var2 = zu90Var3;
                        op71.x(ncdVar2.getContext());
                        if (goeVar2 != null) {
                            ctfVar = goeVar2.b;
                            str5 = goeVar2.a;
                            zks0Var = goeVar2.c;
                            if (!u890.j(ctfVar, atf.a)) {
                                hcdVar = new hcd(str5, ctfVar, zks0Var);
                            } else if (zks0Var.h()) {
                                if (bpo1.w(goeVar2, str3)) {
                                    hcdVar = new fcd(str5);
                                } else {
                                    hcdVar = null;
                                }
                            } else if (zks0Var.a()) {
                                hcdVar = new hcd(str5, ctfVar, zks0Var);
                            } else {
                                hcdVar = null;
                            }
                            if (hcdVar != null) {
                                return hcdVar;
                            }
                        }
                        if (goeVar2 != null) {
                            str4 = goeVar2.a;
                        } else {
                            str4 = null;
                        }
                        if (str4 == null) {
                            str4 = "";
                        }
                        tom tomVar4 = new tom(UUID.randomUUID().toString(), str4, new w4i1(str3, str3, 12, (String) null), this.d.b() / 1000, true, new lpl(zu90Var2.e, (bc71) null, (String) null, new bpl(zu90Var2.c, zu90Var2.d), (hmp0) null, (String) null, (String) null, 118), new pom(false), (ArrayList) null, (ArrayList) null, (nom) null, false, (xo2) null, 3968);
                        bfdVar2.getClass();
                        String str17 = zu90Var2.d;
                        ncdVar2.a = null;
                        ncdVar2.b = null;
                        ncdVar2.c = null;
                        ncdVar2.f = 5;
                        objA = a(bfdVar2, goeVar2, str17, tomVar4, ncdVar2);
                        if (objA == obj) {
                            return objA;
                        }
                    }
                } else {
                    goeVar2 = null;
                    op71.x(ncdVar2.getContext());
                    if (goeVar2 != null) {
                        ctfVar = goeVar2.b;
                        str5 = goeVar2.a;
                        zks0Var = goeVar2.c;
                        if (!u890.j(ctfVar, atf.a)) {
                            hcdVar = new hcd(str5, ctfVar, zks0Var);
                        } else if (zks0Var.h()) {
                            if (bpo1.w(goeVar2, str3)) {
                                hcdVar = new fcd(str5);
                            } else {
                                hcdVar = null;
                            }
                        } else if (zks0Var.a()) {
                            hcdVar = new hcd(str5, ctfVar, zks0Var);
                        } else {
                            hcdVar = null;
                        }
                        if (hcdVar != null) {
                            return hcdVar;
                        }
                    }
                    if (goeVar2 != null) {
                        str4 = goeVar2.a;
                    } else {
                        str4 = null;
                    }
                    if (str4 == null) {
                        str4 = "";
                    }
                    tom tomVar5 = new tom(UUID.randomUUID().toString(), str4, new w4i1(str3, str3, 12, (String) null), this.d.b() / 1000, true, new lpl(zu90Var2.e, (bc71) null, (String) null, new bpl(zu90Var2.c, zu90Var2.d), (hmp0) null, (String) null, (String) null, 118), new pom(false), (ArrayList) null, (ArrayList) null, (nom) null, false, (xo2) null, 3968);
                    bfdVar2.getClass();
                    String str18 = zu90Var2.d;
                    ncdVar2.a = null;
                    ncdVar2.b = null;
                    ncdVar2.c = null;
                    ncdVar2.f = 5;
                    objA = a(bfdVar2, goeVar2, str18, tomVar5, ncdVar2);
                    if (objA == obj) {
                        return objA;
                    }
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0093  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:55:0x0104  */
    /* JADX WARN: Code duplicated, block: B:57:0x0108  */
    /* JADX WARN: Code duplicated, block: B:58:0x0124  */
    /* JADX WARN: Code duplicated, block: B:60:0x0129  */
    /* JADX WARN: Code duplicated, block: B:61:0x0131  */
    /* JADX WARN: Code duplicated, block: B:63:0x0135  */
    /* JADX WARN: Code duplicated, block: B:64:0x0143  */
    /* JADX WARN: Code duplicated, block: B:66:0x0147  */
    /* JADX WARN: Code duplicated, block: B:67:0x0155  */
    /* JADX WARN: Code duplicated, block: B:69:0x0159  */
    /* JADX WARN: Code duplicated, block: B:70:0x0165  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(zu90 zu90Var, onm onmVar) {
        ocd ocdVar;
        Object bcdVar;
        boolean z;
        acd acdVar;
        if (onmVar instanceof ocd) {
            ocdVar = (ocd) onmVar;
            int i = ocdVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ocdVar.d = i - Integer.MIN_VALUE;
            } else {
                ocdVar = new ocd(this, onmVar);
            }
        } else {
            ocdVar = new ocd(this, onmVar);
        }
        Object objS = ocdVar.b;
        int i2 = ocdVar.d;
        try {
            if (i2 == 0) {
                hm5.M(objS);
                if (ihc1.y0(zu90Var.d)) {
                    bcdVar = new ecd(ybd.a);
                } else if (ihc1.y0(zu90Var.e)) {
                    bcdVar = new ecd(ybd.b);
                } else if (kv90.a.contains(zu90Var.c)) {
                    nx nxVar = new nx(this, zu90Var, null);
                    ocdVar.a = zu90Var;
                    ocdVar.d = 1;
                    objS = smo1.s(new us0(this, nxVar, (lnm) null, (byte) 14), ocdVar);
                    d9n d9nVar = d9n.a;
                    if (objS == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    bcdVar = new ecd(ybd.c);
                }
                op71.x(ocdVar.getContext());
                z = bcdVar instanceof icd;
                if (z) {
                    return new cv90(zu90Var.b, ((icd) bcdVar).a);
                }
                acdVar = acd.a;
                if (u890.j(bcdVar, acdVar)) {
                    return new av90(zu90Var.b);
                }
                bv90 bv90Var = new bv90(zu90Var.b);
                if (!z && !u890.j(bcdVar, acdVar)) {
                    if (bcdVar instanceof ecd) {
                        Logger.d("Jam reaction invalid request: %s", new Object[]{((ecd) bcdVar).a});
                    } else if (bcdVar instanceof gcd) {
                        th61 th61Var = ((gcd) bcdVar).a;
                        Logger.d("Jam reaction account unavailable: loggedIn=%s, loggingOut=%s", new Object[]{Boolean.valueOf(th61Var.b), Boolean.valueOf(th61Var.d)});
                    } else if (bcdVar instanceof zbd) {
                        Logger.d("Jam reaction capability denied: %s", new Object[]{sbd.a});
                    } else if (bcdVar instanceof hcd) {
                        hcd hcdVar = (hcd) bcdVar;
                        String simpleName = hcdVar.b.getClass().getSimpleName();
                        zks0 zks0Var = hcdVar.c;
                        Logger.d("Jam reaction permission denied: type=%s, status=%s, participation=%s", new Object[]{simpleName, zks0Var.b, zks0Var.d});
                    } else if (bcdVar instanceof fcd) {
                        Logger.d("Jam reaction draft contribution limit reached", new Object[0]);
                    } else if (bcdVar instanceof dcd) {
                        Logger.d("Jam reaction draft history invalid: %s", new Object[]{((dcd) bcdVar).a});
                    } else if (bcdVar instanceof ccd) {
                        Logger.d("Jam reaction chat identity invalid: %s", new Object[]{((ccd) bcdVar).a});
                    } else {
                        if (bcdVar instanceof bcd) {
                            eg.o();
                            return null;
                        }
                        Logger.e(((bcd) bcdVar).a, "Jam reaction send failed", new Object[0]);
                    }
                }
                return bv90Var;
            }
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zu90Var = ocdVar.a;
            hm5.M(objS);
            bcdVar = (jcd) objS;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            bcdVar = new bcd(e2);
        }
        op71.x(ocdVar.getContext());
        z = bcdVar instanceof icd;
        if (z) {
            return new cv90(zu90Var.b, ((icd) bcdVar).a);
        }
        acdVar = acd.a;
        if (u890.j(bcdVar, acdVar)) {
            return new av90(zu90Var.b);
        }
        bv90 bv90Var2 = new bv90(zu90Var.b);
        if (!z) {
            if (bcdVar instanceof ecd) {
                Logger.d("Jam reaction invalid request: %s", new Object[]{((ecd) bcdVar).a});
            } else if (bcdVar instanceof gcd) {
                th61 th61Var2 = ((gcd) bcdVar).a;
                Logger.d("Jam reaction account unavailable: loggedIn=%s, loggingOut=%s", new Object[]{Boolean.valueOf(th61Var2.b), Boolean.valueOf(th61Var2.d)});
            } else if (bcdVar instanceof zbd) {
                Logger.d("Jam reaction capability denied: %s", new Object[]{sbd.a});
            } else if (bcdVar instanceof hcd) {
                hcd hcdVar2 = (hcd) bcdVar;
                String simpleName2 = hcdVar2.b.getClass().getSimpleName();
                zks0 zks0Var2 = hcdVar2.c;
                Logger.d("Jam reaction permission denied: type=%s, status=%s, participation=%s", new Object[]{simpleName2, zks0Var2.b, zks0Var2.d});
            } else if (bcdVar instanceof fcd) {
                Logger.d("Jam reaction draft contribution limit reached", new Object[0]);
            } else if (bcdVar instanceof dcd) {
                Logger.d("Jam reaction draft history invalid: %s", new Object[]{((dcd) bcdVar).a});
            } else if (bcdVar instanceof ccd) {
                Logger.d("Jam reaction chat identity invalid: %s", new Object[]{((ccd) bcdVar).a});
            } else {
                if (bcdVar instanceof bcd) {
                    eg.o();
                    return null;
                }
                Logger.e(((bcd) bcdVar).a, "Jam reaction send failed", new Object[0]);
            }
        }
        return bv90Var2;
    }
}
