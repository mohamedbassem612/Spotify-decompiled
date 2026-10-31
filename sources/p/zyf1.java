package p;

import android.content.Context;
import android.net.Uri;
import android.view.ViewGroup;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zyf1 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zyf1(Object obj, byte b) {
        super(4);
        this.a = b;
        this.b = obj;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        return new vh((Context) obj2, (ViewGroup) obj3, (sma1) this.b);
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        lsw lswVar = ((d75) obj).c;
        jb3 jb3Var = (jb3) this.b;
        return new cej1((Context) obj2, lswVar, (lik1) jb3Var.e, (h2q) jb3Var.c, (Function0) jb3Var.d, (x191) ((Function0) jb3Var.f).invoke(), (kko) jb3Var.g, (guj1) jb3Var.h, (iu30) obj4);
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        return new as0((ggx) this.b, (iu30) obj4);
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        czj1 czj1Var = (czj1) obj;
        iu30 iu30Var = (iu30) obj2;
        x340 x340Var = (b0k) obj3;
        int iIntValue = ((Number) obj4).intValue();
        if ((iIntValue & 6) == 0) {
            i = ((iIntValue & 8) == 0 ? x340Var.g(czj1Var) : x340Var.i(czj1Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= x340Var.i(iu30Var) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 147) != 146)) {
            yzj1 yzj1Var = (yzj1) this.b;
            Object objT = x340Var2.T();
            if (objT == fkj0.X) {
                goq goqVar = (goq) yzj1Var.c.a.c;
                jzj1 jzj1Var = new jzj1((quq) ((jly0) goqVar.d).get(), (ruq) ((jly0) goqVar.e).get(), (suq) ((jly0) goqVar.f).get(), new jd6((d0r) ((jly0) goqVar.b).get(), w3p1.n(new l4r(b2v.a, 2, ayj1.e1, new j4r(a0k1.e), a0k1.b), new l4r(pwc0.q, 2, a0k1.c, new j4r(a0k1.f), a0k1.d), olj1.t)), new xnb((d0r) ((jly0) goqVar.b).get(), (byte) 4), (wzj1) ((jly0) goqVar.c).get(), iu30Var);
                x340Var2.s0(jzj1Var);
                objT = jzj1Var;
            }
            otw.c((jzj1) objT, new gzj1(czj1Var), (qim0) null, (ipb1) null, x340Var2, 0, 12);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        y0k1 y0k1Var = (y0k1) obj;
        iu30 iu30Var = (iu30) obj2;
        x340 x340Var = (b0k) obj3;
        int iIntValue = ((Number) obj4).intValue();
        b1k1 b1k1Var = (b1k1) this.b;
        m4c m4cVar = fkj0.X;
        if ((iIntValue & 6) == 0) {
            i = (x340Var.g(y0k1Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= x340Var.i(iu30Var) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 147) != 146)) {
            y0k1Var.getClass();
            boolean zV = b1k1Var.f.b.v();
            int i2 = i & 112;
            boolean z = i2 == 32;
            Object objT = x340Var2.T();
            if (z || objT == m4cVar) {
                objT = new izj1(iu30Var, (byte) 1);
                x340Var2.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            boolean z2 = i2 == 32;
            Object objT2 = x340Var2.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new izj1(iu30Var, (byte) 2);
                x340Var2.s0(objT2);
            }
            Function0 function1 = (Function0) objT2;
            boolean z3 = i2 == 32;
            Object objT3 = x340Var2.T();
            if (z3 || objT3 == m4cVar) {
                objT3 = new izj1(iu30Var, (byte) 3);
                x340Var2.s0(objT3);
            }
            Function0 function2 = (Function0) objT3;
            boolean zI = x340Var2.i(b1k1Var);
            Object objT4 = x340Var2.T();
            if (zI || objT4 == m4cVar) {
                objT4 = new dch1(b1k1Var, (byte) 27);
                x340Var2.s0(objT4);
            }
            t5p1.f(y0k1Var, zV, function0, function1, function2, (Function0) objT4, (qim0) null, false, x340Var2, 0);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        jqk1 jqk1Var = (jqk1) obj;
        iu30 iu30Var = (iu30) obj2;
        x340 x340Var = (b0k) obj3;
        int iIntValue = ((Number) obj4).intValue();
        upk1 upk1Var = (upk1) this.b;
        if ((iIntValue & 6) == 0) {
            i = (x340Var.g(jqk1Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i2 = i;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = (ttm0) upk1Var.d.invoke();
                x340Var2.s0(objT);
            }
            ttm0 ttm0Var = (ttm0) objT;
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = ttm0Var.c(false);
                x340Var2.s0(objT2);
            }
            zau0 zau0Var = (zau0) objT2;
            boolean zI = x340Var2.i(ttm0Var) | x340Var2.i(zau0Var);
            Object objT3 = x340Var2.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new q0e(ttm0Var, zau0Var, (byte) 1);
                x340Var2.s0(objT3);
            }
            qxd0.i(zau0Var, (iu30) objT3, x340Var2);
            los losVar = upk1Var.f;
            boolean zI2 = x340Var2.i(upk1Var);
            Object objT4 = x340Var2.T();
            if (zI2 || objT4 == m4cVar) {
                objT4 = new tpk1(upk1Var, (byte) 1);
                x340Var2.s0(objT4);
            }
            qxd0.i(losVar, (iu30) objT4, x340Var2);
            upk1Var.c(zau0Var, jqk1Var.b, iu30Var, x340Var2, (i2 << 3) & 896);
            c380 c380VarA = mqo1.A(jqk1Var.a);
            gfu0 gfu0Var = jqk1Var.b;
            String str = gfu0Var != null ? gfu0Var.a : null;
            boolean z = jqk1Var.d;
            qpj1 qpj1Var = upk1Var.e;
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object objT5 = x340Var2.T();
            if (z2 || objT5 == m4cVar) {
                objT5 = new otj1(iu30Var, (byte) 5);
                x340Var2.s0(objT5);
            }
            iu30 iu30Var2 = (iu30) objT5;
            boolean z3 = i3 == 32;
            Object objT6 = x340Var2.T();
            if (z3 || objT6 == m4cVar) {
                objT6 = new otj1(iu30Var, (byte) 6);
                x340Var2.s0(objT6);
            }
            zod.g(c380VarA, str, z, qpj1Var, iu30Var2, (iu30) objT6, (qim0) null, x340Var2, 0);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        Integer numValueOf = Integer.valueOf(((Number) obj3).intValue());
        return new n3m0(((k7l1) obj2).e, numValueOf, (String) null, (String) ((n0o) this.b).f, (r6h1) obj4);
    }

    private final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        return new wal1((sma1) this.b, (Context) obj2, ((d75) obj).c);
    }

    private final Object k(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        zgm0 zgm0Var = (zgm0) obj;
        iu30 iu30Var = (iu30) obj2;
        x340 x340Var = (b0k) obj3;
        int iIntValue = ((Number) obj4).intValue();
        qml1 qml1Var = (qml1) this.b;
        if ((iIntValue & 6) == 0) {
            i = (x340Var.g(zgm0Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= x340Var.i(iu30Var) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 147) != 146)) {
            dsa0.i(zgm0Var.a, zgm0Var.b, qml1Var.a.f(jl.b), qml1Var.c, iu30Var, x340Var2, (i << 9) & 57344);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4) {
        w3m0 w3m0Var = (w3m0) obj;
        String strI = cgj1.I((String) ((vbe1) this.b).c);
        if (strI == null) {
            return null;
        }
        return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strI)), w3m0Var.b, w3m0Var.a, System.currentTimeMillis());
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        coi1 boi1Var;
        me90 me90Var;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        boolean z = false;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                Integer numValueOf = Integer.valueOf(((Number) obj3).intValue());
                String str = ((gyf1) obj).a;
                opl0 opl0Var = new opl0((byte) 23, numValueOf, str, (r6h1) obj4);
                switch (((qnq) obj5).a) {
                    case 0:
                        return new n111(str, opl0Var);
                    default:
                        return new n111(str, opl0Var);
                }
            case 1:
                n111 n111Var = (n111) obj;
                lyf1 lyf1Var = (lyf1) obj3;
                zxf1 zxf1Var = (zxf1) obj4;
                q7j0 q7j0Var = (q7j0) obj5;
                String str2 = n111Var.a;
                opl0 opl0Var2 = n111Var.b;
                r6h1 r6h1Var = opl0Var2.b;
                y6h1 y6h1Var = opl0Var2.c;
                String str3 = ((gyf1) obj2).d;
                if (zxf1Var instanceof yxf1) {
                    eyf1 eyf1Var = lyf1Var.d;
                    if ((eyf1Var instanceof dyf1) || (eyf1Var instanceof fyf1)) {
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play_preview", 1, Collections.singletonMap("item_to_be_previewed", str2 != null ? str2 : "")), y6h1Var, r6h1Var, System.currentTimeMillis());
                    } else {
                        if (!(eyf1Var instanceof eyf1)) {
                            eg.o();
                            return null;
                        }
                        int i = (int) eyf1Var.j;
                        z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                        String strValueOf = String.valueOf(i);
                        w7h1Var = new w7h1("", "", z7h1Var, new x7h1("stop_preview", 1, Collections.singletonMap("duration_ms", strValueOf != null ? strValueOf : "")), y6h1Var, r6h1Var, System.currentTimeMillis());
                    }
                    return w7h1Var;
                }
                if (!(zxf1Var instanceof vxf1)) {
                    if (!(zxf1Var instanceof sxf1)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("curate_track_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC.a(), r6h1Var, System.currentTimeMillis());
                    return w7h1Var;
                }
                if (!q7j0Var.b(str3)) {
                    if (q7j0.c(str3)) {
                        x6h1 x6h1VarC2 = y6h1Var.c();
                        x6h1VarC2.i.add(new a7h1("curate_track_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC2.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("add_to_playlist", 2, sqg0.J(new mmr0[]{new mmr0("playlist", str3), new mmr0("item_to_be_added", str2 != null ? str2 : "")})), x6h1VarC2.a(), r6h1Var, System.currentTimeMillis());
                    }
                    return null;
                }
                x6h1 x6h1VarC3 = y6h1Var.c();
                x6h1VarC3.i.add(new a7h1("curate_track_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("like", 1, Collections.singletonMap("item_to_be_liked", str2 != null ? str2 : "")), x6h1VarC3.a(), r6h1Var, System.currentTimeMillis());
                return w7h1Var;
            case 2:
                i5g1 i5g1Var = (i5g1) obj5;
                return new j5g1((ViewGroup) obj3, (iu30) obj4, i5g1Var.d, i5g1Var.c, i5g1Var.e, i5g1Var.f, i5g1Var.g, 0.0f);
            case 3:
                x6h1 x6h1VarC4 = ((bul0) obj).a.c();
                x6h1VarC4.i.add(new a7h1("switch_to_manage_account_row", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                y6h1 y6h1VarA = x6h1VarC4.a();
                String strA = ((hwa0) ((ecd1) obj5).c).a(((vkg1) obj2).a);
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strA != null ? strA : "")), y6h1VarA, r6h1.c, System.currentTimeMillis());
            case 4:
                tfl0 tfl0Var = (tfl0) obj;
                wkg1 wkg1Var = (wkg1) obj2;
                if (!((gki0) obj4).equals(gki0.a)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC5 = tfl0Var.b.c();
                x6h1VarC5.i.add(new a7h1("self_managed_group", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                x6h1VarC6.i.add(new a7h1("switch_to_manage_account_row", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = false;
                y6h1 y6h1VarA2 = x6h1VarC6.a();
                String strA2 = ((xkg1) obj5).a.a(wkg1Var.a);
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strA2 != null ? strA2 : "")), y6h1VarA2, tfl0Var.a, System.currentTimeMillis());
            case 5:
                bmg1 bmg1Var = (bmg1) obj;
                iu30 iu30Var = (iu30) obj2;
                x340 x340Var = (b0k) obj3;
                int iIntValue = ((Number) obj4).intValue();
                dlg1 dlg1Var = ((jlg1) obj5).a;
                if (bmg1Var.b) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(-1486808343);
                    nko1.r((iIntValue << 3) & 896, x340Var2, iu30Var, (qim0) null, dlg1Var, bmg1Var);
                    x340Var2.r(false);
                } else {
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(-1486709608);
                    kln1.q((iIntValue << 3) & 896, x340Var3, iu30Var, (qim0) null, dlg1Var, bmg1Var);
                    x340Var3.r(false);
                }
                return rih1Var;
            case 6:
                fhm0 fhm0Var = (fhm0) obj;
                iu30 iu30Var2 = (iu30) obj2;
                x340 x340Var4 = (b0k) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                dug1 dug1Var = (dug1) obj5;
                int i2 = (iIntValue2 & 6) == 0 ? iIntValue2 | ((iIntValue2 & 8) == 0 ? x340Var4.g(fhm0Var) : x340Var4.i(fhm0Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i2 |= x340Var4.i(iu30Var2) ? 32 : 16;
                }
                x340 x340Var5 = x340Var4;
                if (x340Var5.Y(i2 & 1, (i2 & 147) != 146)) {
                    msg1 msg1Var = fhm0Var.a;
                    int i3 = i2 & 112;
                    boolean zI = x340Var5.i(dug1Var) | (i3 == 32);
                    Object objT = x340Var5.T();
                    if (zI || objT == fkj0.X) {
                        objT = new d(dug1Var, iu30Var2, (byte) 25);
                        x340Var5.s0(objT);
                    }
                    qxd0.i(msg1Var, (iu30) objT, x340Var5);
                    qpn1.c(fhm0Var, iu30Var2, x340Var5, i3);
                } else {
                    x340Var5.b0();
                }
                return rih1Var;
            case 7:
                hph1 hph1Var = (hph1) obj;
                iu30 iu30Var3 = (iu30) obj2;
                x340 x340Var6 = (b0k) obj3;
                int iIntValue3 = ((Number) obj4).intValue();
                int i4 = (iIntValue3 & 6) == 0 ? iIntValue3 | ((iIntValue3 & 8) == 0 ? x340Var6.g(hph1Var) : x340Var6.i(hph1Var) ? 4 : 2) : iIntValue3;
                if ((iIntValue3 & 48) == 0) {
                    i4 |= x340Var6.i(iu30Var3) ? 32 : 16;
                }
                x340 x340Var7 = x340Var6;
                if (x340Var7.Y(i4 & 1, (i4 & 147) != 146)) {
                    ijo1.b(hph1Var.d, iu30Var3, (qim0) null, ((kph1) obj5).c, x340Var7, i4 & 112);
                } else {
                    x340Var7.b0();
                }
                return rih1Var;
            case 8:
                vrh1 vrh1Var = (vrh1) obj;
                iu30 iu30Var4 = (iu30) obj2;
                x340 x340Var8 = (b0k) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i5 = (iIntValue4 & 6) == 0 ? iIntValue4 | ((iIntValue4 & 8) == 0 ? x340Var8.g(vrh1Var) : x340Var8.i(vrh1Var) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i5 |= x340Var8.i(iu30Var4) ? 32 : 16;
                }
                x340 x340Var9 = x340Var8;
                if (x340Var9.Y(i5 & 1, (i5 & 147) != 146)) {
                    rjo1.b(vrh1Var.b, iu30Var4, (qim0) null, ((yrh1) obj5).d, x340Var9, i5 & 112);
                } else {
                    x340Var9.b0();
                }
                return rih1Var;
            case 9:
                zci1 zci1Var = (zci1) obj;
                iu30 iu30Var5 = (iu30) obj2;
                int iIntValue5 = ((Number) obj4).intValue();
                zci1Var.getClass();
                bdi1 bdi1Var = (bdi1) obj5;
                x340 x340Var10 = (b0k) obj3;
                boolean zI2 = x340Var10.i(bdi1Var);
                Object objT2 = x340Var10.T();
                if (zI2 || objT2 == fkj0.X) {
                    objT2 = new dch1(bdi1Var, (byte) 12);
                    x340Var10.s0(objT2);
                }
                fqo1.A(zci1Var, iu30Var5, (Function0) objT2, (qim0) null, x340Var10, iIntValue5 & 112);
                return rih1Var;
            case 10:
                rqe1 rqe1Var = (rqe1) obj;
                iu30 iu30Var6 = (iu30) obj2;
                int iIntValue6 = ((Number) obj4).intValue();
                m4c m4cVar = fkj0.X;
                oii1 oii1Var = (oii1) obj5;
                x340 x340Var11 = (b0k) obj3;
                boolean zI3 = x340Var11.i(oii1Var);
                Object objT3 = x340Var11.T();
                if (zI3 || objT3 == m4cVar) {
                    objT3 = new k6g1(oii1Var, (lnm) null, (byte) 21);
                    x340Var11.s0(objT3);
                }
                qxd0.t(rih1Var, x340Var11, (vu30) objT3);
                boolean zI4 = x340Var11.i(oii1Var) | x340Var11.i(rqe1Var);
                Object objT4 = x340Var11.T();
                if (zI4 || objT4 == m4cVar) {
                    objT4 = new xw0(oii1Var, rqe1Var, (lnm) null, (byte) 14);
                    x340Var11.s0(objT4);
                }
                qxd0.t(rqe1Var, x340Var11, (vu30) objT4);
                rqe1Var.getClass();
                c8o.h(sj1.v(rqe1Var, oii1Var.h), oii1Var.g, oii1Var.e, oii1Var.f, iu30Var6, x340Var11, (iIntValue6 << 9) & 57344);
                return rih1Var;
            case 11:
                bni1 bni1Var = (bni1) obj;
                iu30 iu30Var7 = (iu30) obj2;
                int iIntValue7 = ((Number) obj4).intValue();
                m4c m4cVar2 = fkj0.X;
                x340 x340Var12 = (b0k) obj3;
                x340Var12.i0(-493146132);
                fni1 fni1Var = (fni1) obj5;
                fni1Var.e.a(fni1Var, x340Var12, 0);
                x340Var12.r(false);
                List list = bni1Var.b;
                if (!list.isEmpty()) {
                    List<b5i1> list2 = list;
                    ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                    for (b5i1 b5i1Var : list2) {
                        String username = b5i1Var.getUsername();
                        nd90 nd90Var = (nd90) bni1Var.j.get(username);
                        if (nd90Var == nd90.a) {
                            me90Var = me90.d;
                        } else if (nd90Var == nd90.b) {
                            me90Var = me90.e;
                        } else if (bni1Var.h.contains(username)) {
                            me90Var = me90.b;
                        } else {
                            me90Var = bni1Var.i.contains(username) ? me90.c : me90.a;
                        }
                        arrayList.add(new yc90(b5i1Var, me90Var));
                    }
                    boi1Var = new boi1(arrayList, bni1Var.b());
                } else if (bni1Var.f instanceof k4o0) {
                    boi1Var = yni1.a;
                } else if (u890.j(bni1Var.c, Boolean.FALSE)) {
                    boi1Var = xni1.a;
                } else {
                    boi1Var = bni1Var.b() ? aoi1.a : zni1.a;
                }
                coi1 coi1Var = boi1Var;
                String str4 = bni1Var.d;
                boolean zG = x340Var12.g(str4) | x340Var12.i(fni1Var);
                Object objT5 = x340Var12.T();
                Function0 function0 = null;
                if (zG || objT5 == m4cVar2) {
                    objT5 = new kwb1(str4, fni1Var, (lnm) null, (byte) 27);
                    x340Var12.s0(objT5);
                }
                qxd0.t(str4, x340Var12, (vu30) objT5);
                y2m0 y2m0VarP = tro1.p(coi1Var);
                boolean zI5 = x340Var12.i(fni1Var) | x340Var12.i(coi1Var) | x340Var12.i(bni1Var);
                Object objT6 = x340Var12.T();
                if (zI5 || objT6 == m4cVar2) {
                    ku91 ku91Var = new ku91(fni1Var, coi1Var, bni1Var, (lnm) null, (byte) 24);
                    x340Var12.s0(ku91Var);
                    objT6 = ku91Var;
                }
                qxd0.t(y2m0VarP, x340Var12, (vu30) objT6);
                int i6 = (iIntValue7 & 112) ^ 48;
                boolean zI6 = x340Var12.i(fni1Var) | x340Var12.i(coi1Var) | ((i6 > 32 && x340Var12.g(iu30Var7)) || (iIntValue7 & 48) == 32);
                Object objT7 = x340Var12.T();
                if (zI6 || objT7 == m4cVar2) {
                    objT7 = new rsc1(fni1Var, coi1Var, iu30Var7, (byte) 27);
                    x340Var12.s0(objT7);
                }
                iu30 iu30Var8 = (iu30) objT7;
                boolean zI7 = x340Var12.i(fni1Var) | x340Var12.i(coi1Var) | ((i6 > 32 && x340Var12.g(iu30Var7)) || (iIntValue7 & 48) == 32);
                Object objT8 = x340Var12.T();
                if (zI7 || objT8 == m4cVar2) {
                    objT8 = new cni1(fni1Var, coi1Var, iu30Var7, (byte) 0);
                    x340Var12.s0(objT8);
                }
                Function0 function1 = (Function0) objT8;
                boolean zI8 = x340Var12.i(fni1Var) | ((i6 > 32 && x340Var12.g(iu30Var7)) || (iIntValue7 & 48) == 32);
                Object objT9 = x340Var12.T();
                if (zI8 || objT9 == m4cVar2) {
                    objT9 = new dni1(fni1Var, iu30Var7, (byte) 0);
                    x340Var12.s0(objT9);
                }
                Function0 function2 = (Function0) objT9;
                boolean zI9 = x340Var12.i(fni1Var) | x340Var12.i(coi1Var) | ((i6 > 32 && x340Var12.g(iu30Var7)) || (iIntValue7 & 48) == 32);
                Object objT10 = x340Var12.T();
                if (zI9 || objT10 == m4cVar2) {
                    objT10 = new cni1(fni1Var, coi1Var, iu30Var7, (byte) 1);
                    x340Var12.s0(objT10);
                }
                Function0 function3 = (Function0) objT10;
                if (bni1Var.l) {
                    x340Var12.i0(1893588146);
                    boolean zI10 = ((i6 > 32 && x340Var12.g(iu30Var7)) || (iIntValue7 & 48) == 32) | x340Var12.i(fni1Var);
                    Object objT11 = x340Var12.T();
                    if (zI10 || objT11 == m4cVar2) {
                        objT11 = new dni1(fni1Var, iu30Var7, (byte) 1);
                        x340Var12.s0(objT11);
                    }
                    function0 = (Function0) objT11;
                    x340Var12.r(false);
                } else {
                    x340Var12.i0(1893739332);
                    x340Var12.r(false);
                }
                Function0 function4 = function0;
                b5i1 b5i1Var2 = bni1Var.e;
                boolean zI11 = x340Var12.i(fni1Var);
                Object objT12 = x340Var12.T();
                if (zI11 || objT12 == m4cVar2) {
                    objT12 = new muh1(fni1Var, (byte) 8);
                    x340Var12.s0(objT12);
                }
                wro1.E(coi1Var, iu30Var8, function1, function2, function3, function4, (qim0) null, b5i1Var2, (vu30) objT12, x340Var12, 0);
                return rih1Var;
            case 12:
                xzi1 xzi1Var = (xzi1) obj;
                iu30 iu30Var9 = (iu30) obj2;
                x340 x340Var13 = (b0k) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                a0j1 a0j1Var = (a0j1) obj5;
                int i7 = (iIntValue8 & 6) == 0 ? iIntValue8 | ((iIntValue8 & 8) == 0 ? x340Var13.g(xzi1Var) : x340Var13.i(xzi1Var) ? 4 : 2) : iIntValue8;
                if ((iIntValue8 & 48) == 0) {
                    i7 |= x340Var13.i(iu30Var9) ? 32 : 16;
                }
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(i7 & 1, (i7 & 147) != 146)) {
                    boolean zI12 = x340Var14.i(a0j1Var);
                    if ((i7 & 14) == 4 || ((i7 & 8) != 0 && x340Var14.i(xzi1Var))) {
                        z = true;
                    }
                    boolean z2 = zI12 | z;
                    Object objT13 = x340Var14.T();
                    if (z2 || objT13 == fkj0.X) {
                        objT13 = new mah1(a0j1Var, xzi1Var, (byte) 13);
                        x340Var14.s0(objT13);
                    }
                    qxd0.S((Function0) objT13, x340Var14);
                    j2i j2iVarR = apo.r(1452488564, new wpg1(xzi1Var, a0j1Var, iu30Var9, (byte) 23), x340Var14);
                    WeakHashMap weakHashMap = osl1.x;
                    irn1.u((qim0) null, j2iVarR, (vu30) null, lhc.g(x340Var14).g, apo.r(165239278, new p8e1(a0j1Var, xzi1Var, iu30Var9, (byte) 7), x340Var14), x340Var14, 24624, 5);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 13:
                x0j1 x0j1Var = (x0j1) obj;
                iu30 iu30Var10 = (iu30) obj2;
                x340 x340Var15 = (b0k) obj3;
                int iIntValue9 = ((Number) obj4).intValue();
                a1j1 a1j1Var = (a1j1) obj5;
                int i8 = (iIntValue9 & 6) == 0 ? iIntValue9 | ((iIntValue9 & 8) == 0 ? x340Var15.g(x0j1Var) : x340Var15.i(x0j1Var) ? 4 : 2) : iIntValue9;
                if ((iIntValue9 & 48) == 0) {
                    i8 |= x340Var15.i(iu30Var10) ? 32 : 16;
                }
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(i8 & 1, (i8 & 147) != 146)) {
                    boolean z3 = a1j1Var.f;
                    x0j1Var.getClass();
                    czo1.e(z3, x0j1Var, x340Var16, 0);
                    j2i j2iVarR2 = apo.r(-1053307912, new iuy0(iu30Var10, (byte) 27), x340Var16);
                    WeakHashMap weakHashMap2 = osl1.x;
                    irn1.u((qim0) null, j2iVarR2, (vu30) null, lhc.g(x340Var16).g, apo.r(729748210, new p8e1(a1j1Var, x0j1Var, iu30Var10, (byte) 8), x340Var16), x340Var16, 24624, 5);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 14:
                x1j1 x1j1Var = (x1j1) obj;
                iu30 iu30Var11 = (iu30) obj2;
                x340 x340Var17 = (b0k) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                z1j1 z1j1Var = (z1j1) obj5;
                int i9 = (iIntValue10 & 6) == 0 ? iIntValue10 | ((iIntValue10 & 8) == 0 ? x340Var17.g(x1j1Var) : x340Var17.i(x1j1Var) ? 4 : 2) : iIntValue10;
                if ((iIntValue10 & 48) == 0) {
                    i9 |= x340Var17.i(iu30Var11) ? 32 : 16;
                }
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(i9 & 1, (i9 & 147) != 146)) {
                    boolean zI13 = x340Var18.i(z1j1Var);
                    if ((i9 & 14) == 4 || ((i9 & 8) != 0 && x340Var18.i(x1j1Var))) {
                        z = true;
                    }
                    boolean z4 = zI13 | z;
                    Object objT14 = x340Var18.T();
                    if (z4 || objT14 == fkj0.X) {
                        objT14 = new mah1(z1j1Var, x1j1Var, (byte) 14);
                        x340Var18.s0(objT14);
                    }
                    qxd0.S((Function0) objT14, x340Var18);
                    j2i j2iVarR3 = apo.r(1193477620, new iuy0(iu30Var11, (byte) 28), x340Var18);
                    WeakHashMap weakHashMap3 = osl1.x;
                    irn1.u((qim0) null, j2iVarR3, (vu30) null, lhc.g(x340Var18).g, apo.r(-1260299154, new p8e1(z1j1Var, x1j1Var, iu30Var11, (byte) 9), x340Var18), x340Var18, 24624, 5);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 15:
                t4j1 t4j1Var = (t4j1) obj4;
                y6h1 y6h1Var2 = ((b3m0) obj).a;
                if (t4j1Var.equals(r4j1.a)) {
                    x6h1 x6h1VarC7 = y6h1Var2.c();
                    x6h1VarC7.i.add(new a7h1("update_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    y6h1 y6h1VarA3 = x6h1VarC7.a();
                    String string = ((Uri) ((idd1) ((vbe1) obj5).g).getValue()).toString();
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", string != null ? string : "")), y6h1VarA3, r6h1.c, System.currentTimeMillis());
                } else if (t4j1Var.equals(q4j1.a)) {
                    x6h1 x6h1VarC8 = y6h1Var2.c();
                    x6h1VarC8.i.add(new a7h1("learn_more_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", "https://support.spotify.com/article/updating-spotify/")), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (!t4j1Var.equals(s4j1.a)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC9 = y6h1Var2.c();
                    x6h1VarC9.i.add(new a7h1("web_player_link", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", "https://open.spotify.com")), x6h1VarC9.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 16:
                c3m0 c3m0Var = (c3m0) obj;
                f8j1 f8j1Var = (f8j1) obj3;
                z7j1 z7j1Var = (z7j1) obj4;
                x8j1 x8j1Var = (x8j1) obj5;
                fta ftaVar = x8j1Var.f;
                y6h1 y6h1Var3 = c3m0Var.b;
                ji0 ji0Var = ((y8j1) obj2).c;
                String str5 = ji0Var.t;
                boolean z5 = f8j1Var.a;
                if (z7j1Var.equals(p7j1.a) || z7j1Var.equals(q7j1.a)) {
                    ftaVar.v(lm60.d, ji0Var);
                    String str6 = ji0Var.e;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", str6 != null ? str6 : "")), y6h1Var3, c3m0Var.a, System.currentTimeMillis());
                } else if (z7j1Var.equals(r7j1.a)) {
                    x8j1Var.d.o();
                    ftaVar.v(tm60.e, ji0Var);
                    ftaVar.v(mm60.d, ji0Var);
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1Var3, c3m0Var.a, System.currentTimeMillis());
                } else if (!z7j1Var.equals(x7j1.a)) {
                    if (!z7j1Var.equals(y7j1.a)) {
                        return null;
                    }
                    ftaVar.v(z5 ? nm60.d : rm60.d, ji0Var);
                    w7h1Var3 = z5 ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("unmute_playback", 1, b7xVar), y6h1Var3, c3m0Var.a, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("mute_playback", 1, b7xVar), y6h1Var3, c3m0Var.a, System.currentTimeMillis());
                } else if (f8j1Var.g instanceof d8j1) {
                    ftaVar.v(om60.d, ji0Var);
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("pause", 1, Collections.singletonMap("item_to_be_paused", str5 != null ? str5 : "")), y6h1Var3, c3m0Var.a, System.currentTimeMillis());
                } else {
                    ftaVar.v(pm60.d, ji0Var);
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("resume", 1, Collections.singletonMap("item_to_be_resumed", str5 != null ? str5 : "")), y6h1Var3, c3m0Var.a, System.currentTimeMillis());
                }
                return w7h1Var3;
            case 17:
                bs0 bs0Var = (bs0) obj5;
                return new oej1((Context) obj2, (ViewGroup) obj3, (lik1) bs0Var.b, (h2q) bs0Var.d, (iu30) obj4, (bsj1) bs0Var.e, ((d75) obj).c);
            case 18:
                g2z g2zVar = (g2z) obj5;
                return new mfj1((x191) g2zVar.c, (gw70) g2zVar.a, (Context) obj2, (gn10) g2zVar.b, (iu30) obj4, (br0) g2zVar.d, (xho) g2zVar.e, (njv0) g2zVar.f);
            case 19:
                return a(obj, obj2, obj3, obj4);
            case 20:
                return d(obj, obj2, obj3, obj4);
            case 21:
                return e(obj, obj2, obj3, obj4);
            case 22:
                return f(obj, obj2, obj3, obj4);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return g(obj, obj2, obj3, obj4);
            case 24:
                return h(obj, obj2, obj3, obj4);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return i(obj, obj2, obj3, obj4);
            case 26:
                return j(obj, obj2, obj3, obj4);
            case 27:
                return k(obj, obj2, obj3, obj4);
            case 28:
                return m(obj, obj2, obj3, obj4);
            default:
                ((w2n1) obj5).d.k((g2n1) obj, (iu30) obj2, (qim0) null, (b0k) obj3, (((Number) obj4).intValue() & 126) | 4096);
                return rih1Var;
        }
    }
}
