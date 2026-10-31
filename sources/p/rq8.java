package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class rq8 implements Update {
    public final Next a(Object obj, Object obj2) {
        Object objM;
        tq8 tq8Var = (tq8) obj;
        oq8 oq8Var = (oq8) obj2;
        wq8 wq8Var = tq8Var.a;
        if (oq8Var.equals(iq8.a)) {
            if (tq8Var.f) {
                return Next.j();
            }
            String str = wq8Var != null ? wq8Var.e : null;
            return Next.a(wyo1.l(nhz.g, str != null ? str : ""));
        }
        if (oq8Var instanceof jq8) {
            if (!u890.j(((jq8) oq8Var).a, new qal(1))) {
                return Next.j();
            }
            if (wq8Var == null) {
                eg.m("Required value was null.");
                return null;
            }
            wp8 wp8Var = new wp8(wq8Var.e);
            int i = t380.c;
            return Next.a(new b291(wp8Var));
        }
        if (oq8Var instanceof kq8) {
            kq8 kq8Var = (kq8) oq8Var;
            if (wq8Var == null) {
                eg.m("Required value was null.");
                return null;
            }
            sq8 sq8VarA = tq8Var.a();
            sq8VarA.f = true;
            fr8 fr8Var = kq8Var.a;
            if (fr8Var instanceof ar8) {
                ar8 ar8Var = (ar8) fr8Var;
                String str2 = ar8Var.a;
                String str3 = ar8Var.b;
                String str4 = ar8Var.d;
                objM = new qp8(str2, str3, str4 != null ? str4 : "");
            } else if (fr8Var instanceof br8) {
                br8 br8Var = (br8) fr8Var;
                String str5 = br8Var.a;
                String str6 = br8Var.b;
                String str7 = br8Var.c;
                objM = new rp8(str5, str6, str7 != null ? str7 : "");
            } else if ((fr8Var instanceof cr8) || (fr8Var instanceof er8)) {
                objM = wyo1.m(tq8Var, wq8Var);
            } else {
                if (!(fr8Var instanceof dr8)) {
                    eg.o();
                    return null;
                }
                dr8 dr8Var = (dr8) fr8Var;
                nhz nhzVar = dr8Var.a;
                if (nhzVar == nhz.O0) {
                    objM = wyo1.m(tq8Var, wq8Var);
                } else {
                    String str8 = dr8Var.b;
                    if (str8 == null) {
                        str8 = "";
                    }
                    String str9 = dr8Var.c;
                    objM = new vp8(nhzVar, str8, str9 != null ? str9 : "");
                }
            }
            tq8 tq8VarA = sq8VarA.a();
            int i2 = t380.c;
            return Next.i(tq8VarA, new b291(objM));
        }
        if (oq8Var instanceof lq8) {
            jm70 jm70Var = ((lq8) oq8Var).a;
            if (wq8Var == null) {
                eg.m("Required value was null.");
                return null;
            }
            if (!(jm70Var instanceof im70)) {
                if (jm70Var instanceof hm70) {
                    return Next.a(wyo1.l(nhz.Y, wq8Var.e));
                }
                eg.o();
                return null;
            }
            String str10 = ((im70) jm70Var).a;
            sq8 sq8VarA2 = tq8Var.a();
            sq8VarA2.c = str10;
            tq8 tq8VarA2 = sq8VarA2.a();
            xp8 xp8Var = new xp8(str10, wq8Var);
            int i3 = t380.c;
            return Next.i(tq8VarA2, new b291(xp8Var));
        }
        if (!(oq8Var instanceof mq8)) {
            if (!(oq8Var instanceof nq8)) {
                if (!oq8Var.equals(iq8.b)) {
                    eg.o();
                    return null;
                }
                sq8 sq8VarA3 = tq8Var.a();
                sq8VarA3.h = true;
                return wyo1.p(sq8VarA3.a());
            }
            th61 th61Var = ((nq8) oq8Var).a;
            if (th61Var.c || th61Var.d) {
                return Next.j();
            }
            if (th61Var.b) {
                if (!th61Var.h) {
                    return Next.j();
                }
                sq8 sq8VarA4 = tq8Var.a();
                sq8VarA4.g = true;
                return wyo1.p(sq8VarA4.a());
            }
            if (tq8Var.e) {
                return Next.j();
            }
            sq8 sq8VarA5 = tq8Var.a();
            sq8VarA5.e = true;
            tq8 tq8VarA3 = sq8VarA5.a();
            zp8 zp8Var = zp8.b;
            int i4 = t380.c;
            return Next.i(tq8VarA3, new b291(zp8Var));
        }
        mq8 mq8Var = (mq8) oq8Var;
        sq8 sq8VarA6 = tq8Var.a();
        int i5 = mq8Var.b;
        wq8 wq8Var2 = mq8Var.a;
        spq0 spq0Var = mq8Var.c;
        boolean z = mq8Var.d;
        boolean z2 = mq8Var.e;
        String str11 = wq8Var2.e;
        if (i5 == 6) {
            return Next.a(wyo1.l(nhz.c, str11));
        }
        sq8VarA6.b = i5;
        if (!z) {
            return Next.a(wyo1.l(nhz.e, str11));
        }
        if (!z2 && wq8Var2.d == null && (wq8Var2.b == 1 || i5 != 4)) {
            return Next.a(wyo1.l(nhz.X, str11));
        }
        String str12 = wq8Var2.c;
        if (jhc1.F(wq8Var2.a) || jhc1.F(str12)) {
            return Next.a(wyo1.l(nhz.d, str11));
        }
        sq8VarA6.a = wq8Var2;
        if (spq0Var.c()) {
            sq8VarA6.c = (String) spq0Var.b();
            sq8VarA6.d = true;
            sq8VarA6.f = true;
        }
        return Next.i(sq8VarA6.a(), t380.t(cq8.a, bq8.a));
    }
}
