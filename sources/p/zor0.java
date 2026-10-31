package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zor0 extends s5 {
    public final oor0 a = new oor0();
    public final mkc0 b = new mkc0();

    @Override // p.s5
    public final void a(ala1 ala1Var) {
        String str;
        mkc0 mkc0Var = this.b;
        ArrayList arrayList = mkc0Var.b;
        arrayList.add(ala1Var);
        if (mkc0Var.a == 6) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(ala1Var);
        yr31 yr31Var = new yr31(arrayList2);
        while (yr31Var.e()) {
            int iC = l1d.C(mkc0Var.a);
            if (iC == 0) {
                mkc0Var.a();
                yr31Var.o();
                if (!yr31Var.i('[')) {
                    mkc0Var.a = 6;
                    mkc0Var.a();
                    return;
                } else {
                    mkc0Var.a = 2;
                    mkc0Var.e = new StringBuilder();
                    if (!yr31Var.e()) {
                        mkc0Var.e.append('\n');
                    }
                }
            } else {
                if (iC == 1) {
                    d9z0 d9z0VarL = yr31Var.l();
                    if (jch0.c0(yr31Var)) {
                        mkc0Var.e.append(yr31Var.d(d9z0VarL, yr31Var.l()).b());
                        if (!yr31Var.e()) {
                            mkc0Var.e.append('\n');
                        } else if (yr31Var.i(']') && yr31Var.i(':') && mkc0Var.e.length() <= 999 && !atz.a(mkc0Var.e.toString()).isEmpty()) {
                            mkc0Var.a = 3;
                            yr31Var.o();
                        }
                    }
                    mkc0Var.a = 6;
                    mkc0Var.a();
                    return;
                }
                if (iC == 2) {
                    yr31Var.o();
                    d9z0 d9z0VarL2 = yr31Var.l();
                    if (jch0.b0(yr31Var)) {
                        String strB = yr31Var.d(d9z0VarL2, yr31Var.l()).b();
                        if (strB.startsWith("<")) {
                            strB = cy30.h(1, 1, strB);
                        }
                        mkc0Var.f = strB;
                        int iO = yr31Var.o();
                        if (!yr31Var.e()) {
                            mkc0Var.i = true;
                            arrayList.clear();
                        } else if (iO == 0) {
                        }
                        mkc0Var.a = 4;
                    }
                    mkc0Var.a = 6;
                    mkc0Var.a();
                    return;
                }
                if (iC != 3) {
                    if (iC == 4) {
                        d9z0 d9z0VarL3 = yr31Var.l();
                        if (jch0.d0(yr31Var, mkc0Var.g)) {
                            mkc0Var.h.append(yr31Var.d(d9z0VarL3, yr31Var.l()).b());
                            if (yr31Var.e()) {
                                yr31Var.h();
                                yr31Var.o();
                                if (yr31Var.e()) {
                                    mkc0Var.h = null;
                                } else {
                                    mkc0Var.i = true;
                                    arrayList.clear();
                                    mkc0Var.a = 1;
                                }
                            } else {
                                mkc0Var.h.append('\n');
                            }
                        } else {
                            mkc0Var.h = null;
                        }
                        mkc0Var.a = 6;
                        mkc0Var.a();
                        return;
                    }
                    switch (mkc0Var.a) {
                        case 1:
                            str = "START_DEFINITION";
                            break;
                        case 2:
                            str = "LABEL";
                            break;
                        case 3:
                            str = "DESTINATION";
                            break;
                        case 4:
                            str = "START_TITLE";
                            break;
                        case 5:
                            str = "TITLE";
                            break;
                        case 6:
                            str = "PARAGRAPH";
                            break;
                        default:
                            str = "null";
                            break;
                    }
                    eg.m("Unknown parsing state: ".concat(str));
                    return;
                }
                yr31Var.o();
                if (yr31Var.e()) {
                    mkc0Var.g = (char) 0;
                    char cK = yr31Var.k();
                    if (cK == '\"' || cK == '\'') {
                        mkc0Var.g = cK;
                    } else if (cK == '(') {
                        mkc0Var.g = ')';
                    }
                    if (mkc0Var.g != 0) {
                        mkc0Var.a = 5;
                        mkc0Var.h = new StringBuilder();
                        yr31Var.h();
                        if (!yr31Var.e()) {
                            mkc0Var.h.append('\n');
                        }
                    } else {
                        mkc0Var.a = 1;
                    }
                } else {
                    mkc0Var.a = 1;
                }
            }
        }
    }

    @Override // p.s5
    public final void b(sla1 sla1Var) {
        this.b.d.add(sla1Var);
    }

    @Override // p.s5
    public final void e() {
        oor0 oor0Var;
        mkc0 mkc0Var = this.b;
        mkc0Var.a();
        Iterator it = mkc0Var.c.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            oor0Var = this.a;
            if (!zHasNext) {
                break;
            }
            lkc0 lkc0Var = (lkc0) it.next();
            lkc0Var.g();
            cdo0 cdo0Var = oor0Var.d;
            lkc0Var.d = cdo0Var;
            if (cdo0Var != null) {
                cdo0Var.e = lkc0Var;
            }
            lkc0Var.e = oor0Var;
            oor0Var.d = lkc0Var;
            cdo0 cdo0Var2 = oor0Var.a;
            lkc0Var.a = cdo0Var2;
            if (lkc0Var.d == null) {
                cdo0Var2.b = lkc0Var;
            }
        }
        ArrayList arrayList = mkc0Var.b;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        if (arrayList2.isEmpty()) {
            oor0Var.g();
        } else {
            oor0Var.e(mkc0Var.d);
        }
    }

    @Override // p.s5
    public final e6b f() {
        return this.a;
    }

    @Override // p.s5
    public final List g() {
        i4t i4tVar = new i4t();
        mkc0 mkc0Var = this.b;
        mkc0Var.a();
        for (lkc0 lkc0Var : mkc0Var.c) {
            i4tVar.a.putIfAbsent(atz.a(lkc0Var.g), lkc0Var);
        }
        Object[] objArr = {i4tVar};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        return Collections.unmodifiableList(arrayList);
    }

    @Override // p.s5
    public final void i(ug80 ug80Var) {
        ArrayList arrayList = this.b.b;
        ld50 ld50Var = new ld50();
        ArrayList arrayList2 = ld50Var.a;
        arrayList2.addAll(arrayList);
        if (arrayList2.isEmpty()) {
            return;
        }
        ug80Var.e(ld50Var, this.a);
    }

    @Override // p.s5
    public final jwg j(cqu cquVar) {
        if (cquVar.i) {
            return null;
        }
        return jwg.a(cquVar.c);
    }
}
