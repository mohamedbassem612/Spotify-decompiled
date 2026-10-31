package p;

import android.net.Uri;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zqy {
    public final i6c A;
    public final ic9 B;
    public final yje C;
    public final mxr D;
    public final f971 a;
    public final jl21 b;
    public final dg8 c;
    public final cab d;
    public final g7h e;
    public final kr60 f;
    public final in8 g;
    public final bl3 h;
    public final goq i;
    public final gmt j;
    public final o860 k;
    public final e821 l;
    public final kqi0 m;
    public final dxy n;
    public final vi11 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y4q f54p;
    public final gza q;
    public final f3b r;
    public final qmg s;
    public final agc0 t;
    public final ifl1 u;
    public final ruc0 v;
    public final ne w;
    public final dc31 x;
    public final xlr y;
    public final t2 z;

    public zqy(f971 f971Var, jl21 jl21Var, dg8 dg8Var, cab cabVar, g7h g7hVar, kr60 kr60Var, in8 in8Var, bl3 bl3Var, goq goqVar, gmt gmtVar, o860 o860Var, e821 e821Var, kqi0 kqi0Var, dxy dxyVar, vi11 vi11Var, y4q y4qVar, gza gzaVar, f3b f3bVar, qmg qmgVar, agc0 agc0Var, ifl1 ifl1Var, ruc0 ruc0Var, ne neVar, dc31 dc31Var, xlr xlrVar, t2 t2Var, i6c i6cVar, ic9 ic9Var, yje yjeVar, mxr mxrVar) {
        this.a = f971Var;
        this.b = jl21Var;
        this.c = dg8Var;
        this.d = cabVar;
        this.e = g7hVar;
        this.f = kr60Var;
        this.g = in8Var;
        this.h = bl3Var;
        this.i = goqVar;
        this.j = gmtVar;
        this.k = o860Var;
        this.l = e821Var;
        this.m = kqi0Var;
        this.n = dxyVar;
        this.o = vi11Var;
        this.f54p = y4qVar;
        this.q = gzaVar;
        this.r = f3bVar;
        this.s = qmgVar;
        this.t = agc0Var;
        this.u = ifl1Var;
        this.v = ruc0Var;
        this.w = neVar;
        this.x = dc31Var;
        this.y = xlrVar;
        this.z = t2Var;
        this.A = i6cVar;
        this.B = ic9Var;
        this.C = yjeVar;
        this.D = mxrVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0231  */
    /* JADX WARN: Code duplicated, block: B:104:0x0238 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:105:0x023a  */
    /* JADX WARN: Code duplicated, block: B:109:0x0254  */
    /* JADX WARN: Code duplicated, block: B:112:0x0265  */
    /* JADX WARN: Code duplicated, block: B:116:0x0293  */
    /* JADX WARN: Code duplicated, block: B:118:0x029f  */
    /* JADX WARN: Code duplicated, block: B:119:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:120:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:129:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:132:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:133:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:135:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:137:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:138:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:139:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:142:0x034a  */
    /* JADX WARN: Code duplicated, block: B:148:0x035c  */
    /* JADX WARN: Code duplicated, block: B:152:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:154:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:156:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:157:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:159:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:160:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:181:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:188:0x040e  */
    /* JADX WARN: Code duplicated, block: B:189:0x0428  */
    /* JADX WARN: Code duplicated, block: B:191:0x042f  */
    /* JADX WARN: Code duplicated, block: B:194:0x0448 A[LOOP:0: B:192:0x0442->B:194:0x0448, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:199:0x046e  */
    /* JADX WARN: Code duplicated, block: B:203:0x0482  */
    /* JADX WARN: Code duplicated, block: B:207:0x0499  */
    /* JADX WARN: Code duplicated, block: B:211:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:215:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:219:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:223:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:227:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:229:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:230:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:234:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:32:0x0103  */
    /* JADX WARN: Code duplicated, block: B:36:0x0124  */
    /* JADX WARN: Code duplicated, block: B:46:0x0153  */
    /* JADX WARN: Code duplicated, block: B:47:0x0155  */
    /* JADX WARN: Code duplicated, block: B:49:0x015f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0161 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0164  */
    /* JADX WARN: Code duplicated, block: B:54:0x0168  */
    /* JADX WARN: Code duplicated, block: B:56:0x0180  */
    /* JADX WARN: Code duplicated, block: B:57:0x0183  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:71:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code duplicated, block: B:98:0x022a  */
    public final Object a(lik1 lik1Var, String str, wqy wqyVar, onm onmVar) {
        yqy yqyVar;
        int i;
        d9n d9nVar;
        Object obj;
        wqy wqyVar2;
        String str2;
        Object objJ;
        lik1 lik1Var2;
        bry bryVar;
        String str3;
        wqy wqyVar3;
        kk3 kk3Var;
        Object objJ2;
        wqy wqyVar4;
        kk3 kk3Var2;
        lik1 lik1Var3;
        Map map;
        Object objB;
        bry bryVar2;
        Map map2;
        boolean zBooleanValue;
        String str4;
        String str5;
        String str6;
        List list;
        Uri uri;
        int i2;
        int i3;
        String strY0;
        smc0 smc0VarN;
        boolean z;
        String str7;
        f7h f7hVar;
        boolean z2;
        String str8;
        c821 c821Var;
        jhm jhmVarL;
        who0 who0Var;
        String str9;
        String str10;
        ahm ahmVar;
        int iOrdinal;
        String str11;
        String str12;
        jhm jhmVar;
        int iC;
        int i4;
        blc0 blc0Var;
        blc0 blc0Var2;
        ok51 ok51Var;
        ugo0 ugo0Var;
        p860 p860Var;
        ArrayList arrayList;
        Iterator it;
        boolean z3;
        String str13;
        List list2;
        kpm kpmVar;
        String str14;
        lik1 lik1Var4 = lik1Var;
        if (onmVar instanceof yqy) {
            yqyVar = (yqy) onmVar;
            int i5 = yqyVar.i;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                yqyVar.i = i5 - Integer.MIN_VALUE;
            } else {
                yqyVar = new yqy(this, onmVar);
            }
        } else {
            yqyVar = new yqy(this, onmVar);
        }
        yqy yqyVar2 = yqyVar;
        Object obj2 = yqyVar2.g;
        int i6 = yqyVar2.i;
        d9n d9nVar2 = d9n.a;
        if (i6 == 0) {
            hm5.M(obj2);
            String str15 = lik1Var4.a;
            String str16 = wqyVar.a;
            String str17 = wqyVar.l;
            yqyVar2.a = lik1Var4;
            yqyVar2.b = str;
            yqyVar2.c = wqyVar;
            yqyVar2.i = 1;
            i = 1;
            d9nVar = d9nVar2;
            Object objK = this.i.k(str, str15, str16, str17, yqyVar2);
            if (objK != d9nVar) {
                obj = objK;
                wqyVar2 = wqyVar;
                str2 = str;
            }
            return d9nVar;
        }
        if (i6 == 1) {
            wqy wqyVar5 = yqyVar2.c;
            str2 = yqyVar2.b;
            lik1 lik1Var5 = yqyVar2.a;
            hm5.M(obj2);
            wqyVar2 = wqyVar5;
            lik1Var4 = lik1Var5;
            i = 1;
            obj = obj2;
            d9nVar = d9nVar2;
        } else {
            if (i6 == 2) {
                bryVar = yqyVar2.d;
                wqyVar3 = yqyVar2.c;
                String str18 = yqyVar2.b;
                lik1 lik1Var6 = yqyVar2.a;
                hm5.M(obj2);
                objJ = obj2;
                d9nVar = d9nVar2;
                lik1Var2 = lik1Var6;
                str3 = str18;
                i = 1;
                kk3Var = (kk3) objJ;
                Single singleA = this.e.a(lik1Var2.a, Collections.singletonList(str3), false);
                yqyVar2.a = lik1Var2;
                yqyVar2.b = null;
                yqyVar2.c = wqyVar3;
                yqyVar2.d = bryVar;
                yqyVar2.e = kk3Var;
                yqyVar2.i = 3;
                objJ2 = fc11.j(singleA, yqyVar2);
                if (objJ2 != d9nVar) {
                    lik1 lik1Var7 = lik1Var2;
                    wqyVar4 = wqyVar3;
                    kk3Var2 = kk3Var;
                    lik1Var3 = lik1Var7;
                    map = (Map) objJ2;
                    String str19 = bryVar.c;
                    yqyVar2.a = lik1Var3;
                    yqyVar2.b = null;
                    yqyVar2.c = wqyVar4;
                    yqyVar2.d = bryVar;
                    yqyVar2.e = kk3Var2;
                    yqyVar2.f = map;
                    yqyVar2.i = 4;
                    objB = this.s.b(str19, yqyVar2);
                    if (objB != d9nVar) {
                        bryVar2 = bryVar;
                        map2 = map;
                        obj2 = objB;
                    }
                }
                return d9nVar;
            }
            if (i6 == 3) {
                kk3 kk3Var3 = yqyVar2.e;
                bry bryVar3 = yqyVar2.d;
                wqy wqyVar6 = yqyVar2.c;
                lik1Var3 = yqyVar2.a;
                hm5.M(obj2);
                kk3Var2 = kk3Var3;
                bryVar = bryVar3;
                objJ2 = obj2;
                d9nVar = d9nVar2;
                wqyVar4 = wqyVar6;
                i = 1;
                map = (Map) objJ2;
                String str110 = bryVar.c;
                yqyVar2.a = lik1Var3;
                yqyVar2.b = null;
                yqyVar2.c = wqyVar4;
                yqyVar2.d = bryVar;
                yqyVar2.e = kk3Var2;
                yqyVar2.f = map;
                yqyVar2.i = 4;
                objB = this.s.b(str110, yqyVar2);
                if (objB != d9nVar) {
                    bryVar2 = bryVar;
                    map2 = map;
                    obj2 = objB;
                }
                return d9nVar;
            }
            if (i6 != 4) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            map2 = yqyVar2.f;
            kk3Var2 = yqyVar2.e;
            bry bryVar4 = yqyVar2.d;
            wqyVar4 = yqyVar2.c;
            lik1Var3 = yqyVar2.a;
            hm5.M(obj2);
            bryVar2 = bryVar4;
            i = 1;
        }
        zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean z4 = bryVar2.n;
        str4 = bryVar2.c;
        str5 = bryVar2.a;
        str6 = bryVar2.j;
        list = bryVar2.f1p;
        String str20 = bryVar2.e;
        uri = (z4 && !ihc1.y0(str20)) ? Uri.parse(str20) : Uri.EMPTY;
        i2 = bryVar2.q;
        if (i2 == 0) {
            i3 = -1;
        } else {
            i3 = xqy.a[l1d.C(i2)];
        }
        if (i3 == -1) {
            strY0 = str6;
        } else if (i3 != i) {
            if (i3 != 2) {
                eg.o();
                return null;
            }
            strY0 = str6;
        } else {
            strY0 = o7h.y0(list, ", ", (String) null, (String) null, rqy.i, 30);
            if (strY0.length() == 0) {
                strY0 = null;
            }
        }
        String str21 = bryVar2.d;
        uri.getClass();
        igm igmVar = new igm(str21, new wfm(uri, bgm.c), strY0);
        smc0VarN = k4p1.n();
        z = wqyVar4.b;
        str7 = wqyVar4.a;
        if (z && !bryVar2.n && (str14 = bryVar2.h) != null) {
            smc0VarN.add(f971.b(this.a, str14, str5));
        }
        if (wqyVar4.e) {
            f7hVar = (f7h) map2.get(str4);
            if (f7hVar != null) {
                z2 = f7hVar.c;
            } else {
                z2 = false;
            }
            zwg zwgVarA = this.f54p.a(lik1Var3);
            if (!z2 && (jhmVarL = zwgVarA.l(str4, str5, kk3Var2)) != null) {
                smc0VarN.add(jhmVarL);
            }
            jhm jhmVarE = this.f.e(lik1Var3, str4, str5, true);
            str8 = lik1Var3.a;
            smc0VarN.add(jhmVarE);
            Set set = s4b1.f;
            if (uic.i(str8, s4b1.g) && !uic.g(str8, blc0.Yc)) {
                this.t.getClass();
                if (str8.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") || str8.equals("spotify:collection:tracks") || str8.equals("spotify:internal:collection:tracks") || (nhc1.Y(str8, "spotify:user:", false) && nhc1.R(str8, ":collection", false))) {
                    if (str8.equals("spotify:playlist:37i9dQZF1FgnTBfUlzkeKt")) {
                        c821Var = wqyVar4.k;
                        if (c821Var instanceof a821) {
                            smc0VarN.add(this.l.g(((a821) c821Var).a, str4, str7, (xwp0) null));
                        }
                    }
                }
            } else if (str8.equals("spotify:playlist:37i9dQZF1FgnTBfUlzkeKt")) {
                c821Var = wqyVar4.k;
                if ((c821Var instanceof a821) && str7 != null) {
                    smc0VarN.add(this.l.g(((a821) c821Var).a, str4, str7, (xwp0) null));
                }
            }
            if (u890.j(str8, "spotify:playlist:37i9dQZF1FgnTBfUlzkeKt")) {
                smc0VarN.add(this.o.m(str4));
            }
        } else {
            zBooleanValue = zBooleanValue;
        }
        who0Var = bryVar2.o;
        str9 = bryVar2.i;
        int i7 = bryVar2.m;
        if (who0Var != null) {
            z3 = who0Var.g;
            str13 = who0Var.b;
            list2 = who0Var.c;
            if (str13 == null && z3) {
                jhm jhmVarC = this.v.c(lik1Var3.a, str13, str4, wqyVar4.a, !list2.isEmpty());
                str10 = str4;
                smc0VarN.add(jhmVarC);
            } else {
                str10 = str4;
                if (!list2.isEmpty()) {
                    smc0VarN.add(this.w.n(lik1Var3.a, list2, str10, str7));
                } else if (z3 && (kpmVar = who0Var.e) != null && kpmVar.a && who0Var.d && who0Var.f) {
                    smc0VarN.add(this.u.c(lik1Var3.a, str10, str7));
                }
            }
        } else {
            str10 = str4;
        }
        ahmVar = ahm.c;
        if (zBooleanValue) {
            Set set2 = s4b1.f;
            s4b1 s4b1VarX = uic.x(str5);
            iOrdinal = s4b1VarX.c.ordinal();
            if (iOrdinal != 844) {
                if (iOrdinal != 926) {
                    str12 = str5;
                    jhmVar = null;
                } else {
                    str11 = "track";
                }
                if (jhmVar != null) {
                    smc0VarN.add(jhmVar);
                }
            } else {
                str11 = "episode";
            }
            String strH = gvg.h("spotify:internal:media-trimmer:", str11, ":", s4b1VarX.h());
            otx otxVar = otx.c;
            String str22 = str10;
            ghm ghmVar = new ghm(rnv.N0, new i3o(strH, (byte) 29));
            ggh gghVar = new ggh((Object) this.r, (Object) strH, (Object) str5, (Object) str22, (byte) 23);
            str12 = str5;
            str10 = str22;
            jhmVar = new jhm("edit_clip", otxVar, (fhm) null, 2131954367, (String) null, false, (tm81) null, new ihm(ahmVar, ghmVar, gghVar), 244);
            if (jhmVar != null) {
                smc0VarN.add(jhmVar);
            }
        } else {
            str12 = str5;
            list = list;
        }
        Set set3 = s4b1.f;
        if (uic.g(str10, blc0.M3) && bryVar2.l) {
            smc0VarN.add(new jhm("title_and_details", xmx.c, (fhm) null, 2131954368, (String) null, false, (tm81) null, new ihm(ahmVar, new ghm(rnv.O0, new kov(str10, (byte) 0)), new wrs(str10, this.q, (byte) 24)), 244));
        }
        iC = l1d.C(i7);
        if (iC != 0) {
            i4 = 4;
        } else if (iC != 1) {
            i4 = 1;
        } else {
            if (iC == 2) {
                eg.o();
                return null;
            }
            i4 = 0;
        }
        if (i4 != 0 && wqyVar4.f && str9 != null && str6 != null) {
            smc0VarN.add(this.c.n(i4, str9, str6));
        }
        if (wqyVar4.d && i7 == 2 && !u890.j(lik1Var3.a, str12)) {
            smc0VarN.add(this.g.c(str12, bryVar2.b, false));
        }
        if (uic.h(str12, blc0.ti, blc0.ui)) {
            if (str9 != null && str6 != null && !bryVar2.r) {
                smc0VarN.add(this.z.a(str9, str6, false));
            }
            if (list.size() == 1) {
                smc0VarN.add(this.A.a(((cry) o7h.q0(list)).a, ((cry) o7h.q0(list)).b));
            } else if (list.size() > 1) {
                List list3 = list;
                arrayList = new ArrayList(q7h.U(list3, 10));
                it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(((cry) it.next()).a);
                }
                smc0VarN.add(this.B.d(arrayList));
            }
        }
        Set set4 = s4b1.f;
        blc0Var = blc0.ti;
        blc0Var2 = blc0.ui;
        if (uic.h(str12, blc0Var, blc0Var2)) {
            smc0VarN.add(this.C.a(str12));
        }
        if (uic.h(str12, blc0Var, blc0Var2)) {
            smc0VarN.add(this.D.k(str12));
        }
        smc0VarN.add(this.d.n());
        if (wqyVar4.n) {
            smc0VarN.add(this.y.a());
        }
        ok51Var = wqyVar4.m;
        if (ok51Var != null) {
            smc0VarN.add(this.x.d(ok51Var));
        }
        if (wqyVar4.c) {
            if (uic.g(str10, blc0.M3) || uic.g(str10, blc0.ed)) {
                str12 = str10;
            }
            smc0VarN.add(jl21.b(this.b, str12, lik1Var3));
        }
        if (wqyVar4.h) {
            smc0VarN.add(this.j.d());
        }
        ugo0Var = wqyVar4.j;
        if (ugo0Var != null) {
            if (ugo0Var.a) {
                smc0VarN.add(this.m.k(ugo0Var));
            } else {
                smc0VarN.add(this.n.s(ugo0Var));
            }
        }
        p860Var = wqyVar4.i;
        if (p860Var != null) {
            smc0VarN.add(this.k.h(p860Var));
        }
        return new kjm(igmVar, k4p1.k(smc0VarN), 4);
        bry bryVar5 = (bry) obj;
        Single singleG = this.h.g(str2);
        yqyVar2.a = lik1Var4;
        yqyVar2.b = str2;
        yqyVar2.c = wqyVar2;
        yqyVar2.d = bryVar5;
        yqyVar2.i = 2;
        objJ = fc11.j(singleG, yqyVar2);
        if (objJ != d9nVar) {
            lik1Var2 = lik1Var4;
            bryVar = bryVar5;
            wqy wqyVar7 = wqyVar2;
            str3 = str2;
            wqyVar3 = wqyVar7;
            kk3Var = (kk3) objJ;
            Single singleA2 = this.e.a(lik1Var2.a, Collections.singletonList(str3), false);
            yqyVar2.a = lik1Var2;
            yqyVar2.b = null;
            yqyVar2.c = wqyVar3;
            yqyVar2.d = bryVar;
            yqyVar2.e = kk3Var;
            yqyVar2.i = 3;
            objJ2 = fc11.j(singleA2, yqyVar2);
            if (objJ2 != d9nVar) {
                lik1 lik1Var8 = lik1Var2;
                wqyVar4 = wqyVar3;
                kk3Var2 = kk3Var;
                lik1Var3 = lik1Var8;
                map = (Map) objJ2;
                String str111 = bryVar.c;
                yqyVar2.a = lik1Var3;
                yqyVar2.b = null;
                yqyVar2.c = wqyVar4;
                yqyVar2.d = bryVar;
                yqyVar2.e = kk3Var2;
                yqyVar2.f = map;
                yqyVar2.i = 4;
                objB = this.s.b(str111, yqyVar2);
                if (objB != d9nVar) {
                    bryVar2 = bryVar;
                    map2 = map;
                    obj2 = objB;
                    zBooleanValue = ((Boolean) obj2).booleanValue();
                    boolean z5 = bryVar2.n;
                    str4 = bryVar2.c;
                    str5 = bryVar2.a;
                    str6 = bryVar2.j;
                    list = bryVar2.f1p;
                    String str23 = bryVar2.e;
                    if (z5) {
                        uri = Uri.EMPTY;
                    }
                    i2 = bryVar2.q;
                    if (i2 == 0) {
                        i3 = -1;
                    } else {
                        i3 = xqy.a[l1d.C(i2)];
                    }
                    if (i3 == -1) {
                        strY0 = str6;
                    } else if (i3 != i) {
                        if (i3 != 2) {
                            eg.o();
                            return null;
                        }
                        strY0 = str6;
                    } else {
                        strY0 = o7h.y0(list, ", ", (String) null, (String) null, rqy.i, 30);
                        if (strY0.length() == 0) {
                            strY0 = null;
                        }
                    }
                    String str24 = bryVar2.d;
                    uri.getClass();
                    igm igmVar2 = new igm(str24, new wfm(uri, bgm.c), strY0);
                    smc0VarN = k4p1.n();
                    z = wqyVar4.b;
                    str7 = wqyVar4.a;
                    if (z) {
                        smc0VarN.add(f971.b(this.a, str14, str5));
                    }
                    if (wqyVar4.e) {
                        zBooleanValue = zBooleanValue;
                    } else {
                        f7hVar = (f7h) map2.get(str4);
                        if (f7hVar != null) {
                            z2 = f7hVar.c;
                        } else {
                            z2 = false;
                        }
                        zwg zwgVarA2 = this.f54p.a(lik1Var3);
                        if (!z2) {
                            smc0VarN.add(jhmVarL);
                        }
                        jhm jhmVarE2 = this.f.e(lik1Var3, str4, str5, true);
                        str8 = lik1Var3.a;
                        smc0VarN.add(jhmVarE2);
                        Set set5 = s4b1.f;
                        if (uic.i(str8, s4b1.g)) {
                            if (str8.equals("spotify:playlist:37i9dQZF1FgnTBfUlzkeKt")) {
                                c821Var = wqyVar4.k;
                                if (c821Var instanceof a821) {
                                    smc0VarN.add(this.l.g(((a821) c821Var).a, str4, str7, (xwp0) null));
                                }
                            }
                        } else if (str8.equals("spotify:playlist:37i9dQZF1FgnTBfUlzkeKt")) {
                            c821Var = wqyVar4.k;
                            if (c821Var instanceof a821) {
                                smc0VarN.add(this.l.g(((a821) c821Var).a, str4, str7, (xwp0) null));
                            }
                        }
                        if (u890.j(str8, "spotify:playlist:37i9dQZF1FgnTBfUlzkeKt")) {
                            smc0VarN.add(this.o.m(str4));
                        }
                    }
                    who0Var = bryVar2.o;
                    str9 = bryVar2.i;
                    int i8 = bryVar2.m;
                    if (who0Var != null) {
                        z3 = who0Var.g;
                        str13 = who0Var.b;
                        list2 = who0Var.c;
                        if (str13 == null) {
                            str10 = str4;
                            if (!list2.isEmpty()) {
                                smc0VarN.add(this.w.n(lik1Var3.a, list2, str10, str7));
                            } else if (z3) {
                                smc0VarN.add(this.u.c(lik1Var3.a, str10, str7));
                            }
                        } else {
                            str10 = str4;
                            if (!list2.isEmpty()) {
                                smc0VarN.add(this.w.n(lik1Var3.a, list2, str10, str7));
                            } else if (z3) {
                                smc0VarN.add(this.u.c(lik1Var3.a, str10, str7));
                            }
                        }
                    } else {
                        str10 = str4;
                    }
                    ahmVar = ahm.c;
                    if (zBooleanValue) {
                        str12 = str5;
                        list = list;
                    } else {
                        Set set6 = s4b1.f;
                        s4b1 s4b1VarX2 = uic.x(str5);
                        iOrdinal = s4b1VarX2.c.ordinal();
                        if (iOrdinal != 844) {
                            if (iOrdinal != 926) {
                                str12 = str5;
                                jhmVar = null;
                            } else {
                                str11 = "track";
                            }
                            if (jhmVar != null) {
                                smc0VarN.add(jhmVar);
                            }
                        } else {
                            str11 = "episode";
                        }
                        String strH2 = gvg.h("spotify:internal:media-trimmer:", str11, ":", s4b1VarX2.h());
                        otx otxVar2 = otx.c;
                        String str25 = str10;
                        ghm ghmVar2 = new ghm(rnv.N0, new i3o(strH2, (byte) 29));
                        ggh gghVar2 = new ggh((Object) this.r, (Object) strH2, (Object) str5, (Object) str25, (byte) 23);
                        str12 = str5;
                        str10 = str25;
                        jhmVar = new jhm("edit_clip", otxVar2, (fhm) null, 2131954367, (String) null, false, (tm81) null, new ihm(ahmVar, ghmVar2, gghVar2), 244);
                        if (jhmVar != null) {
                            smc0VarN.add(jhmVar);
                        }
                    }
                    Set set7 = s4b1.f;
                    if (uic.g(str10, blc0.M3)) {
                        smc0VarN.add(new jhm("title_and_details", xmx.c, (fhm) null, 2131954368, (String) null, false, (tm81) null, new ihm(ahmVar, new ghm(rnv.O0, new kov(str10, (byte) 0)), new wrs(str10, this.q, (byte) 24)), 244));
                    }
                    iC = l1d.C(i8);
                    if (iC != 0) {
                        i4 = 4;
                    } else if (iC != 1) {
                        i4 = 1;
                    } else {
                        if (iC == 2) {
                            eg.o();
                            return null;
                        }
                        i4 = 0;
                    }
                    if (i4 != 0) {
                        smc0VarN.add(this.c.n(i4, str9, str6));
                    }
                    if (wqyVar4.d) {
                        smc0VarN.add(this.g.c(str12, bryVar2.b, false));
                    }
                    if (uic.h(str12, blc0.ti, blc0.ui)) {
                        if (str9 != null) {
                            smc0VarN.add(this.z.a(str9, str6, false));
                        }
                        if (list.size() == 1) {
                            smc0VarN.add(this.A.a(((cry) o7h.q0(list)).a, ((cry) o7h.q0(list)).b));
                        } else if (list.size() > 1) {
                            List list4 = list;
                            arrayList = new ArrayList(q7h.U(list4, 10));
                            it = list4.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((cry) it.next()).a);
                            }
                            smc0VarN.add(this.B.d(arrayList));
                        }
                    }
                    Set set8 = s4b1.f;
                    blc0Var = blc0.ti;
                    blc0Var2 = blc0.ui;
                    if (uic.h(str12, blc0Var, blc0Var2)) {
                        smc0VarN.add(this.C.a(str12));
                    }
                    if (uic.h(str12, blc0Var, blc0Var2)) {
                        smc0VarN.add(this.D.k(str12));
                    }
                    smc0VarN.add(this.d.n());
                    if (wqyVar4.n) {
                        smc0VarN.add(this.y.a());
                    }
                    ok51Var = wqyVar4.m;
                    if (ok51Var != null) {
                        smc0VarN.add(this.x.d(ok51Var));
                    }
                    if (wqyVar4.c) {
                        if (uic.g(str10, blc0.M3)) {
                            str12 = str10;
                        } else {
                            str12 = str10;
                        }
                        smc0VarN.add(jl21.b(this.b, str12, lik1Var3));
                    }
                    if (wqyVar4.h) {
                        smc0VarN.add(this.j.d());
                    }
                    ugo0Var = wqyVar4.j;
                    if (ugo0Var != null) {
                        if (ugo0Var.a) {
                            smc0VarN.add(this.m.k(ugo0Var));
                        } else {
                            smc0VarN.add(this.n.s(ugo0Var));
                        }
                    }
                    p860Var = wqyVar4.i;
                    if (p860Var != null) {
                        smc0VarN.add(this.k.h(p860Var));
                    }
                    return new kjm(igmVar2, k4p1.k(smc0VarN), 4);
                }
            }
        }
        return d9nVar;
    }
}
