package p;

import com.spotify.scrollsita.v1.Section;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class z63 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ urk0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z63(urk0 urk0Var, byte b) {
        super(4);
        this.a = b;
        this.b = urk0Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        Object wvl0Var;
        Object wvl0Var2;
        byte b = this.a;
        urk0 urk0Var = this.b;
        switch (b) {
            case 0:
                s63 s63Var = (s63) obj;
                ((Number) obj3).intValue();
                return new wvl0(e130.r(urk0Var, s63Var), Integer.valueOf(s63Var.j), null, s63Var.a);
            case 1:
                tf3 tf3Var = (tf3) obj;
                int iIntValue = ((Number) obj3).intValue();
                d8r0 d8r0Var = tf3Var.i;
                return new jvl0(new lvl0(new mjl0(new mjl0(urk0Var, d8r0Var.b, d8r0Var.a, d8r0Var.e), ""), tf3Var.g, (byte) 0), Integer.valueOf(iIntValue), null, tf3Var.a);
            case 2:
                ol6 ol6Var = (ol6) obj;
                ((Number) obj3).intValue();
                return new wvl0(ljo1.r(urk0Var, ol6Var), Integer.valueOf(ol6Var.k), null, ol6Var.a);
            case 3:
                jx6 jx6Var = (jx6) obj;
                int iIntValue2 = ((Number) obj3).intValue();
                d8r0 d8r0Var2 = jx6Var.j;
                return new jvl0(new lvl0(new mjl0(new mjl0(urk0Var, d8r0Var2.b, d8r0Var2.a, d8r0Var2.e), ""), jx6Var.h, (byte) 0), Integer.valueOf(iIntValue2), null, jx6Var.a);
            case 4:
                x78 x78Var = (x78) obj;
                ((Number) obj3).intValue();
                return new wvl0(luo1.u(urk0Var, x78Var), Integer.valueOf(x78Var.m), null, x78Var.a);
            case 5:
                vb8 vb8Var = (vb8) obj;
                int iIntValue3 = ((Number) obj3).intValue();
                d8r0 d8r0Var3 = vb8Var.h;
                return new jvl0(new lvl0(new mjl0(new mjl0(urk0Var, d8r0Var3.b, d8r0Var3.a, d8r0Var3.e), ""), vb8Var.g, (byte) 0), Integer.valueOf(iIntValue3), null, vb8Var.a);
            case 6:
                pn8 pn8Var = (pn8) obj;
                ((Number) obj3).intValue();
                d8r0 d8r0Var4 = pn8Var.g;
                return new wvl0(new lvl0(new mjl0(new mjl0(urk0Var, d8r0Var4.b, d8r0Var4.a, d8r0Var4.e), d8r0Var4.d), pn8Var.f, (byte) 3), Integer.valueOf(pn8Var.h), null, pn8Var.a);
            case 7:
                dp8 dp8Var = (dp8) obj;
                int iIntValue4 = ((Number) obj3).intValue();
                d8r0 d8r0Var5 = dp8Var.g;
                return new jvl0(new lvl0(new mjl0(new mjl0(urk0Var, d8r0Var5.b, d8r0Var5.a, d8r0Var5.e), ""), dp8Var.f, (byte) 0), Integer.valueOf(iIntValue4), null, dp8Var.a);
            case 8:
                z39 z39Var = (z39) obj;
                int iIntValue5 = ((Number) obj3).intValue();
                d8r0 d8r0Var6 = z39Var.d;
                return new gvl0(new lvl0(new mjl0(new mjl0(urk0Var, d8r0Var6.b, d8r0Var6.a, d8r0Var6.e), ""), z39Var.c, (byte) 0), Integer.valueOf(iIntValue5), z39Var.a);
            case 9:
                nkg nkgVar = (nkg) obj;
                int iIntValue6 = ((Number) obj3).intValue();
                d8r0 d8r0Var7 = nkgVar.d;
                return new gvl0(new lvl0(new mjl0(new mjl0(urk0Var, d8r0Var7.b, d8r0Var7.a, d8r0Var7.e), ""), nkgVar.c, (byte) 0), Integer.valueOf(iIntValue6), nkgVar.a);
            case 10:
                bek bekVar = (bek) obj;
                ((Number) obj3).intValue();
                d8r0 d8r0Var8 = bekVar.f;
                vvl0 vvl0Var = new vvl0(new lvl0(new mjl0(new mjl0(urk0Var, d8r0Var8.b, d8r0Var8.a, d8r0Var8.e), d8r0Var8.d), bekVar.g, (byte) 3), Integer.valueOf(bekVar.h), bekVar.i);
                String str = bekVar.a;
                String str2 = bekVar.j;
                if (str2.length() == 0) {
                    iek iekVar = bekVar.d;
                    if (iekVar instanceof fek) {
                        str2 = "before_sale";
                    } else if (iekVar instanceof gek) {
                        str2 = "on_sale";
                    } else {
                        if (!(iekVar instanceof hek)) {
                            eg.o();
                            return null;
                        }
                        str2 = "unknown";
                    }
                }
                return new uvl0(vvl0Var, 0, str2, str);
            case 11:
                efk efkVar = (efk) obj;
                ((Number) obj3).intValue();
                return new wvl0(bin.G(urk0Var, efkVar), Integer.valueOf(efkVar.i), null, efkVar.a);
            case 12:
                iao iaoVar = (iao) obj;
                int iIntValue7 = ((Number) obj3).intValue();
                d8r0 d8r0Var9 = iaoVar.f;
                lvl0 lvl0Var = new lvl0(new mjl0(new mjl0(urk0Var, d8r0Var9.b, d8r0Var9.a, d8r0Var9.e), d8r0Var9.d), iaoVar.e, (byte) 3);
                int i = iaoVar.i;
                Integer numValueOf = Integer.valueOf(i);
                String str3 = iaoVar.h;
                return new zvl0(new awl0(new gwl0(lvl0Var, numValueOf, "crossword", str3), Integer.valueOf(i), str3), Integer.valueOf(iIntValue7), iaoVar.a);
            case 13:
                sbo sboVar = (sbo) obj;
                ((Number) obj3).intValue();
                d8r0 d8r0Var10 = sboVar.c;
                lvl0 lvl0Var2 = new lvl0(new mjl0(new mjl0(urk0Var, d8r0Var10.b, d8r0Var10.a, d8r0Var10.e), d8r0Var10.d), sboVar.d, (byte) 3);
                int i2 = sboVar.b;
                Integer numValueOf2 = Integer.valueOf(i2);
                String str4 = sboVar.a;
                return new yvl0(new gwl0(lvl0Var2, numValueOf2, "crossword_overview", str4), Integer.valueOf(i2), str4);
            case 14:
                o2z o2zVar = (o2z) obj;
                ((Number) obj3).intValue();
                return new wvl0(don1.B(urk0Var, o2zVar), Integer.valueOf(o2zVar.o), null, o2zVar.a);
            case 15:
                haz hazVar = (haz) obj;
                int iIntValue8 = ((Number) obj3).intValue();
                d8r0 d8r0Var11 = hazVar.h;
                return new jvl0(new lvl0(new mjl0(new mjl0(urk0Var, d8r0Var11.b, d8r0Var11.a, d8r0Var11.e), ""), hazVar.i, (byte) 0), Integer.valueOf(iIntValue8), null, hazVar.a);
            case 16:
                dm20 dm20Var = (dm20) obj;
                int iIntValue9 = ((Number) obj3).intValue();
                d8r0 d8r0Var12 = dm20Var.j;
                return new jvl0(new lvl0(new mjl0(new mjl0(urk0Var, d8r0Var12.b, d8r0Var12.a, d8r0Var12.e), ""), dm20Var.m, (byte) 0), Integer.valueOf(iIntValue9), null, dm20Var.a);
            case 17:
                ri40 ri40Var = (ri40) obj;
                ((Number) obj3).intValue();
                return new wvl0(rqg0.C(urk0Var, ri40Var), Integer.valueOf(ri40Var.g), null, ri40Var.a);
            case 18:
                ej40 ej40Var = (ej40) obj;
                int iIntValue10 = ((Number) obj3).intValue();
                d8r0 d8r0Var13 = ej40Var.f;
                return new jvl0(new lvl0(new mjl0(new mjl0(urk0Var, d8r0Var13.b, d8r0Var13.a, d8r0Var13.e), ""), ej40Var.e, (byte) 0), Integer.valueOf(iIntValue10), null, ej40Var.a);
            case 19:
                qd60 qd60Var = (qd60) obj;
                ((Number) obj3).intValue();
                d8r0 d8r0Var14 = qd60Var.h;
                return new wvl0(new lvl0(new mjl0(new mjl0(urk0Var, d8r0Var14.b, d8r0Var14.a, d8r0Var14.e), d8r0Var14.d), qd60Var.g, (byte) 3), Integer.valueOf(qd60Var.c), "new_release", qd60Var.a);
            case 20:
                so80 so80Var = (so80) obj;
                ((Number) obj3).intValue();
                d8r0 d8r0Var15 = so80Var.f;
                return new cwl0(new gwl0(new lvl0(new mjl0(new mjl0(urk0Var, d8r0Var15.b, d8r0Var15.a, d8r0Var15.e), d8r0Var15.d), so80Var.i, (byte) 3), Integer.valueOf(so80Var.g), "", so80Var.h), so80Var.c);
            case 21:
                sna0 sna0Var = (sna0) obj;
                int iIntValue11 = ((Number) obj3).intValue();
                String str5 = sna0Var.a;
                String str6 = sna0Var.g;
                d8r0 d8r0Var16 = sna0Var.h;
                mjl0 mjl0Var = new mjl0(urk0Var, d8r0Var16.b, d8r0Var16.a, d8r0Var16.e);
                int iC = l1d.C(sna0Var.i);
                if (iC == 0) {
                    wvl0Var = new wvl0(new lvl0(new mjl0(mjl0Var, d8r0Var16.d), str6, (byte) 3), Integer.valueOf(sna0Var.j), null, str5);
                } else {
                    if (iC != 1) {
                        eg.o();
                        return null;
                    }
                    wvl0Var = new jvl0(new lvl0(new mjl0(mjl0Var, ""), str6, (byte) 0), Integer.valueOf(iIntValue11), null, str5);
                }
                return wvl0Var;
            case 22:
                mwi0 mwi0Var = (mwi0) obj;
                ((Number) obj3).intValue();
                d8r0 d8r0Var17 = mwi0Var.g;
                return new ivl0(new lvl0(new mjl0(new mjl0(urk0Var, d8r0Var17.b, d8r0Var17.a, d8r0Var17.e), ""), mwi0Var.f, (byte) 0), mwi0Var.e);
            case 23:
                qwi0 qwi0Var = (qwi0) obj;
                ((Number) obj3).intValue();
                d8r0 d8r0Var18 = qwi0Var.g;
                return new tvl0(new lvl0(new mjl0(new mjl0(urk0Var, d8r0Var18.b, d8r0Var18.a, d8r0Var18.e), d8r0Var18.d), qwi0Var.f, (byte) 3), qwi0Var.e);
            case 24:
                wvp0 wvp0Var = (wvp0) obj;
                ((Number) obj3).intValue();
                d8r0 d8r0Var19 = wvp0Var.h;
                return new rvl0(new lvl0(new mjl0(new mjl0(urk0Var, d8r0Var19.b, d8r0Var19.a, d8r0Var19.e), ""), (byte) 2), Integer.valueOf(wvp0Var.i), wvp0Var.a);
            case 25:
                fhu0 fhu0Var = (fhu0) obj;
                ((Number) obj3).intValue();
                return new wvl0(b5p1.o(urk0Var, fhu0Var), Integer.valueOf(fhu0Var.g), fhu0Var.k ? "has_sponsorship" : null, fhu0Var.a);
            case 26:
                bsu0 bsu0Var = (bsu0) obj;
                int iIntValue12 = ((Number) obj3).intValue();
                d8r0 d8r0Var20 = bsu0Var.f;
                return new jvl0(new lvl0(new mjl0(new mjl0(urk0Var, d8r0Var20.b, d8r0Var20.a, d8r0Var20.e), ""), bsu0Var.e, (byte) 0), Integer.valueOf(iIntValue12), bsu0Var.i ? "has_sponsorship" : null, bsu0Var.a);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                u2v0 u2v0Var = (u2v0) obj;
                int iIntValue13 = ((Number) obj3).intValue();
                String str7 = u2v0Var.a;
                String str8 = u2v0Var.g;
                d8r0 d8r0Var21 = u2v0Var.h;
                mjl0 mjl0Var2 = new mjl0(urk0Var, d8r0Var21.b, d8r0Var21.a, d8r0Var21.e);
                int iC2 = l1d.C(u2v0Var.i);
                if (iC2 == 0) {
                    wvl0Var2 = new wvl0(new lvl0(new mjl0(mjl0Var2, d8r0Var21.d), str8, (byte) 3), Integer.valueOf(u2v0Var.j), null, str7);
                } else {
                    if (iC2 != 1) {
                        eg.o();
                        return null;
                    }
                    wvl0Var2 = new jvl0(new lvl0(new mjl0(mjl0Var2, ""), str8, (byte) 0), Integer.valueOf(iIntValue13), null, str7);
                }
                return wvl0Var2;
            case 28:
                s0x0 s0x0Var = (s0x0) obj;
                ((Number) obj3).intValue();
                d8r0 d8r0Var22 = s0x0Var.g;
                return new wvl0(new lvl0(new mjl0(new mjl0(urk0Var, d8r0Var22.b, d8r0Var22.a, d8r0Var22.e), d8r0Var22.d), s0x0Var.f, (byte) 3), Integer.valueOf(s0x0Var.h), null, s0x0Var.a);
            default:
                jdx0 jdx0Var = (jdx0) obj;
                int iIntValue14 = ((Number) obj3).intValue();
                d8r0 d8r0Var23 = jdx0Var.g;
                return new jvl0(new lvl0(new mjl0(new mjl0(urk0Var, d8r0Var23.b, d8r0Var23.a, d8r0Var23.e), ""), jdx0Var.f, (byte) 0), Integer.valueOf(iIntValue14), null, jdx0Var.a);
        }
    }
}
