package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.encoreconsumermobile.elements.addtobutton.EncoreAddToButtonView;
import com.spotify.marquee.marquee.ui.OverlayBackgroundView;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kmd0 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kmd0(Object obj, byte b) {
        super(4);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0221  */
    /* JADX WARN: Code duplicated, block: B:101:0x0224  */
    /* JADX WARN: Code duplicated, block: B:22:0x009d  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:370:0x01b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:373:0x01a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0116  */
    /* JADX WARN: Code duplicated, block: B:52:0x014f  */
    /* JADX WARN: Code duplicated, block: B:61:0x019f  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:77:0x01da  */
    /* JADX WARN: Code duplicated, block: B:79:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:98:0x021d  */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        Object o8l0Var;
        w7h1 w7h1Var4;
        f6h0 f6h0Var;
        boolean z;
        boolean zI;
        Object objT;
        a6h0 a6h0Var;
        iu30 iu30Var;
        iu30 iu30Var2;
        boolean zI2;
        Object objT2;
        boolean zI3;
        Object objT3;
        lnm lnmVar;
        boolean zI4;
        Object objT4;
        c380 c380Var;
        ArrayList arrayList;
        c380 c380VarA;
        String str;
        int iOrdinal;
        int i;
        lnm lnmVarO0;
        lnm lnmVar2;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                return new c6m0(((lmd0) obj5).b);
            case 1:
                return new as0(((qtw) obj5).c.a((Context) obj2, (ViewGroup) obj3, ((d75) obj).c, (iu30) obj4));
            case 2:
                return new b14((Context) obj2, (yud0) obj5, (iu30) obj4);
            case 3:
                ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj3;
                int iIntValue = ((Number) obj4).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 129) != 128)) {
                    lap1.b((qim0) null, 0, 100L, apo.r(-1548394615, new s2c0((dz61) obj5, (byte) 20), x340Var2), x340Var2, 3504, 1);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 4:
                ((Number) obj3).intValue();
                i4m0 i4m0Var = ((hce0) obj5).a;
                i4m0Var.getClass();
                return new g4m0(i4m0Var);
            case 5:
                bnl0 bnl0Var = (bnl0) obj;
                mee0 mee0Var = (mee0) obj4;
                r6h1 r6h1Var = bnl0Var.a;
                y6h1 y6h1Var = bnl0Var.b;
                if (mee0Var.equals(lee0.e)) {
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("add_songs_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC.a(), r6h1Var, System.currentTimeMillis());
                } else {
                    if (!(mee0Var instanceof kee0)) {
                        return null;
                    }
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("settings_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    y6h1 y6h1VarA = x6h1VarC2.a();
                    String str2 = ((see0) obj5).g;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2 != null ? str2 : "")), y6h1VarA, r6h1Var, System.currentTimeMillis());
                }
                return w7h1Var;
            case 6:
                aoe0 aoe0Var = (aoe0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var3 = (b0k) obj3;
                int iIntValue3 = ((Number) obj4).intValue();
                String strM = ab80.m(aoe0Var.c, iIntValue2, ":");
                boolean z2 = (((iIntValue3 & 112) ^ 48) > 32 && x340Var3.e(iIntValue2)) || (iIntValue3 & 48) == 32;
                x340 x340Var4 = x340Var3;
                Object objT5 = x340Var4.T();
                if (z2 || objT5 == fkj0.X) {
                    objT5 = new po60(iIntValue2, (byte) 13);
                    x340Var4.s0(objT5);
                }
                dgo1.c(strM, (iu30) objT5, apo.r(-846286131, new d0e0(obj5, (Object) aoe0Var, (byte) 3), x340Var4), x340Var4, 384);
                return rih1Var;
            case 7:
                int iIntValue4 = ((Number) obj3).intValue();
                h7l0 h7l0Var = (h7l0) ((ng20) obj5).b;
                String strValueOf = String.valueOf(((eje0) obj).a.c);
                Integer numValueOf = Integer.valueOf(iIntValue4);
                h7l0Var.getClass();
                return new k9l0(h7l0Var, strValueOf, numValueOf);
            case 8:
                ume0 ume0Var = (ume0) obj;
                int iIntValue5 = ((Number) obj4).intValue();
                ume0Var.getClass();
                s9p1.q(ume0Var, (iu30) obj2, ((zme0) obj5).f, (qim0) null, (b0k) obj3, iIntValue5 & 112);
                return rih1Var;
            case 9:
                fae1.a((vme0) obj, (iu30) obj2, ((ane0) obj5).e, (qim0) null, (b0k) obj3, ((Number) obj4).intValue() & 126);
                return rih1Var;
            case 10:
                lye0 lye0Var = (lye0) obj;
                int iIntValue6 = ((Number) obj4).intValue();
                lye0Var.getClass();
                nye0 nye0Var = (nye0) obj5;
                kbb.f(lye0Var, nye0Var.g, nye0Var.a, (iu30) obj2, (b0k) obj3, (iIntValue6 << 6) & 7168);
                return rih1Var;
            case 11:
                qze0 qze0Var = (qze0) obj;
                iu30 iu30Var3 = (iu30) obj2;
                ((Number) obj4).intValue();
                sze0 sze0Var = (sze0) obj5;
                x340 x340Var5 = (b0k) obj3;
                Object objT6 = x340Var5.T();
                m4c m4cVar = fkj0.X;
                if (objT6 == m4cVar) {
                    objT6 = sze0Var.f.b();
                    x340Var5.s0(objT6);
                }
                r6h1 r6h1Var2 = (r6h1) objT6;
                boolean zI5 = x340Var5.i(r6h1Var2);
                Object objT7 = x340Var5.T();
                if (zI5 || objT7 == m4cVar) {
                    objT7 = new cb1(r6h1Var2, (byte) 23);
                    x340Var5.s0(objT7);
                }
                dgo1.c("loginCurrentDevice", (iu30) objT7, apo.r(1087921969, new qae0(qze0Var, iu30Var3, sze0Var, (byte) 8), x340Var5), x340Var5, 390);
                return rih1Var;
            case 12:
                r0f0 r0f0Var = (r0f0) obj;
                iu30 iu30Var4 = (iu30) obj2;
                ((Number) obj4).intValue();
                t0f0 t0f0Var = (t0f0) obj5;
                x340 x340Var6 = (b0k) obj3;
                Object objT8 = x340Var6.T();
                m4c m4cVar2 = fkj0.X;
                if (objT8 == m4cVar2) {
                    objT8 = t0f0Var.g.b();
                    x340Var6.s0(objT8);
                }
                r6h1 r6h1Var3 = (r6h1) objT8;
                boolean zI6 = x340Var6.i(r6h1Var3);
                Object objT9 = x340Var6.T();
                if (zI6 || objT9 == m4cVar2) {
                    objT9 = new cb1(r6h1Var3, (byte) 25);
                    x340Var6.s0(objT9);
                }
                dgo1.c("loginDifferentDevice", (iu30) objT9, apo.r(-1234094031, new qae0(r0f0Var, iu30Var4, t0f0Var, (byte) 10), x340Var6), x340Var6, 390);
                return rih1Var;
            case 13:
                tfl0 tfl0Var = (tfl0) obj;
                d2f0 d2f0Var = (d2f0) obj2;
                if (!((b2f0) obj4).equals(b2f0.a)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC3 = tfl0Var.b.c();
                x6h1VarC3.i.add(new a7h1("managed_group", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("login_options_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                y6h1 y6h1VarA2 = x6h1VarC4.a();
                String strE = ((f2f0) obj5).e(d2f0Var);
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strE != null ? strE : "")), y6h1VarA2, tfl0Var.a, System.currentTimeMillis());
            case 14:
                x6h1 x6h1VarC5 = ((o7l0) obj).a.c();
                x6h1VarC5.i.add(new a7h1("login_options_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                y6h1 y6h1VarA3 = x6h1VarC5.a();
                String strE2 = ((g2f0) obj5).e((e2f0) obj2);
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strE2 != null ? strE2 : "")), y6h1VarA3, r6h1.c, System.currentTimeMillis());
            case 15:
                e9f0 e9f0Var = (e9f0) obj;
                iu30 iu30Var5 = (iu30) obj2;
                x340 x340Var7 = (b0k) obj3;
                int iIntValue7 = ((Number) obj4).intValue();
                int i2 = (iIntValue7 & 6) == 0 ? iIntValue7 | (x340Var7.g(e9f0Var) ? 4 : 2) : iIntValue7;
                if ((iIntValue7 & 48) == 0) {
                    i2 |= x340Var7.i(iu30Var5) ? 32 : 16;
                }
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(i2 & 1, (i2 & 147) != 146)) {
                    e9f0Var.getClass();
                    ((g9f0) obj5).c(e9f0Var, iu30Var5, x340Var8, i2 & 112);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 16:
                vel0 vel0Var = (vel0) obj;
                if (((blf0) obj4) != blf0.a) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC6 = vel0Var.b.c();
                x6h1VarC6.i.add(new a7h1("cta_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = false;
                y6h1 y6h1VarA4 = x6h1VarC6.a();
                String str3 = (String) ((qj0) obj5).e;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str3 != null ? str3 : "")), y6h1VarA4, vel0Var.a, System.currentTimeMillis());
            case 17:
                ((Number) obj4).intValue();
                x340 x340Var9 = (b0k) obj3;
                x340Var9.i0(609908423);
                glf0 glf0Var = (glf0) rwq.g((x010) ((yxb0) obj5).f, new glf0(), (o8n) null, x340Var9, 0, 2).getValue();
                x340Var9.r(false);
                return glf0Var;
            case 18:
                iu30 iu30Var6 = (iu30) obj2;
                x340 x340Var10 = (b0k) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                if ((iIntValue8 & 48) == 0) {
                    iIntValue8 |= x340Var10.i(iu30Var6) ? 32 : 16;
                }
                x340 x340Var11 = x340Var10;
                if (x340Var11.Y(iIntValue8 & 1, (iIntValue8 & 145) != 144)) {
                    ha71.c(((vvf0) obj5).b, iu30Var6, x340Var11, iIntValue8 & 112);
                } else {
                    x340Var11.b0();
                }
                return rih1Var;
            case 19:
                x4l0 x4l0Var = (x4l0) obj;
                j4g0 j4g0Var = (j4g0) ((ng20) obj5).b;
                r6h1 r6h1Var4 = x4l0Var.b.b;
                y6h1 y6h1Var2 = x4l0Var.a;
                int iOrdinal2 = ((g4g0) obj4).ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 != 1) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC7 = y6h1Var2.c();
                    x6h1VarC7.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC7.a(), r6h1Var4, System.currentTimeMillis());
                } else if (j4g0Var instanceof i4g0) {
                    x6h1 x6h1VarC8 = y6h1Var2.c();
                    x6h1VarC8.i.add(new a7h1("confirm_making_private_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    y6h1 y6h1VarA5 = x6h1VarC8.a();
                    String str4 = ((i4g0) j4g0Var).a;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("make_playlist_private", 1, Collections.singletonMap("playlist_to_be_made_private", str4 != null ? str4 : "")), y6h1VarA5, r6h1Var4, System.currentTimeMillis());
                } else {
                    if (!(j4g0Var instanceof h4g0)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC9 = y6h1Var2.c();
                    x6h1VarC9.i.add(new a7h1("confirm_making_private_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{new mmr0("state_before_toggle", "public"), new mmr0("state_after_toggle", "private")})), x6h1VarC9.a(), r6h1Var4, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 20:
                y4l0 y4l0Var = (y4l0) obj;
                n4g0 n4g0Var = (o4g0) ((ng20) obj5).b;
                r6h1 r6h1Var5 = y4l0Var.a;
                y6h1 y6h1Var3 = y4l0Var.b;
                int iOrdinal3 = ((l4g0) obj4).ordinal();
                if (iOrdinal3 == 0) {
                    x6h1 x6h1VarC10 = y6h1Var3.c();
                    x6h1VarC10.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC10.a(), r6h1Var5, System.currentTimeMillis());
                } else {
                    if (iOrdinal3 != 1) {
                        eg.o();
                        return null;
                    }
                    if (n4g0Var instanceof n4g0) {
                        x6h1 x6h1VarC11 = y6h1Var3.c();
                        x6h1VarC11.i.add(new a7h1("confirm_making_visible_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC11.j = false;
                        w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("show_playlist_on_profile", 1, Collections.singletonMap("playlist_to_be_shown", n4g0Var.a)), x6h1VarC11.a(), r6h1Var5, System.currentTimeMillis());
                    } else {
                        if (!(n4g0Var instanceof m4g0)) {
                            eg.o();
                            return null;
                        }
                        x6h1 x6h1VarC12 = y6h1Var3.c();
                        x6h1VarC12.i.add(new a7h1("confirm_making_visible_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC12.j = false;
                        w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{new mmr0("state_before_toggle", "not_visible_on_profile_and_not_public"), new mmr0("state_after_toggle", "visible_on_profile_and_public")})), x6h1VarC12.a(), r6h1Var5, System.currentTimeMillis());
                    }
                }
                return w7h1Var3;
            case 21:
                ((Number) obj3).intValue();
                q8l0 q8l0Var = (q8l0) ((umf0) obj5).e;
                int iOrdinal4 = ((o7g0) obj).a.ordinal();
                if (iOrdinal4 == 0) {
                    q8l0Var.getClass();
                    o8l0Var = new o8l0(q8l0Var);
                } else {
                    if (iOrdinal4 != 1) {
                        eg.o();
                        return null;
                    }
                    q8l0Var.getClass();
                    o8l0Var = new p8l0(q8l0Var);
                }
                return o8l0Var;
            case 22:
                b9g0 b9g0Var = (b9g0) obj;
                int iIntValue9 = ((Number) obj4).intValue();
                x340 x340Var12 = (b0k) obj3;
                d0r d0rVarC = cwl1.C(((cir0) x340Var12.k(k2r0.a)).g());
                b9g0Var.getClass();
                jon1.c(b9g0Var, (iu30) obj2, ((d9g0) obj5).e, d0rVarC, x340Var12, iIntValue9 & 112);
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ceg0 ceg0Var = (ceg0) obj;
                iu30 iu30Var7 = (iu30) obj2;
                x340 x340Var13 = (b0k) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                int i3 = (iIntValue10 & 6) == 0 ? iIntValue10 | (x340Var13.g(ceg0Var) ? 4 : 2) : iIntValue10;
                if ((iIntValue10 & 48) == 0) {
                    i3 |= x340Var13.i(iu30Var7) ? 32 : 16;
                }
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(i3 & 1, (i3 & 147) != 146)) {
                    ceg0Var.getClass();
                    bqn1.l(ceg0Var, iu30Var7, ((eeg0) obj5).e, (qim0) null, x340Var14, i3 & 112);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 24:
                ofg0 ofg0Var = (ofg0) obj;
                iu30 iu30Var8 = (iu30) obj2;
                x340 x340Var15 = (b0k) obj3;
                int iIntValue11 = ((Number) obj4).intValue();
                int i4 = (iIntValue11 & 6) == 0 ? iIntValue11 | (x340Var15.g(ofg0Var) ? 4 : 2) : iIntValue11;
                if ((iIntValue11 & 48) == 0) {
                    i4 |= x340Var15.i(iu30Var8) ? 32 : 16;
                }
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(i4 & 1, (i4 & 147) != 146)) {
                    ofg0Var.getClass();
                    kqn1.i(ofg0Var, iu30Var8, ((qfg0) obj5).e, (qim0) null, x340Var16, i4 & 112);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                ygg0 ygg0Var = (ygg0) obj;
                x340 x340Var17 = (b0k) obj3;
                ((Number) obj4).intValue();
                ven0 ven0VarS = v8r.s((iu30) obj2, x340Var17);
                ahg0 ahg0Var = (ahg0) obj5;
                x340 x340Var18 = x340Var17;
                Object objT10 = x340Var18.T();
                Object obj6 = fkj0.X;
                if (objT10 == obj6) {
                    vqp vqpVar = ahg0Var.e;
                    xd2 xd2Var = new xd2(ven0VarS, (byte) 14);
                    vqpVar.getClass();
                    objT10 = new keg0(xd2Var);
                    x340Var18.s0(objT10);
                }
                keg0 keg0Var = (keg0) objT10;
                ygg0Var.getClass();
                boolean zI7 = x340Var18.i(ahg0Var);
                Object objT11 = x340Var18.T();
                if (zI7 || objT11 == obj6) {
                    objT11 = new e4f0(ahg0Var, (byte) 19);
                    x340Var18.s0(objT11);
                }
                qqn1.b(ygg0Var, keg0Var, (iu30) objT11, x340Var18, 48);
                return rih1Var;
            case 26:
                ((Number) obj3).intValue();
                return new d6m0(((lmd0) obj5).b);
            case 27:
                d75 d75Var = (d75) obj;
                Context context = (Context) obj2;
                iu30 iu30Var9 = (iu30) obj4;
                View viewInflate = LayoutInflater.from(d75Var.a).inflate(2131625179, d75Var.b, false);
                View viewFindViewById = viewInflate.findViewById(2131429905);
                View viewFindViewById2 = viewInflate.findViewById(2131429903);
                View viewFindViewById3 = viewInflate.findViewById(2131429902);
                OverlayBackgroundView overlayBackgroundViewFindViewById = viewInflate.findViewById(2131429895);
                TextView textView = (TextView) viewInflate.findViewById(2131429897);
                ImageView imageView = (ImageView) viewInflate.findViewById(2131429896);
                TextView textView2 = (TextView) viewInflate.findViewById(2131429898);
                TextView textView3 = (TextView) viewInflate.findViewById(2131429891);
                TextView textView4 = (TextView) viewInflate.findViewById(2131429908);
                Button button = (Button) viewInflate.findViewById(2131429892);
                TextView textView5 = (TextView) viewInflate.findViewById(2131429904);
                EncoreAddToButtonView encoreAddToButtonView = (EncoreAddToButtonView) viewInflate.findViewById(2131429907);
                overlayBackgroundViewFindViewById.setRadius(context.getResources().getDisplayMetrics().density * 8.0f);
                overlayBackgroundViewFindViewById.a(context.getColor(2131102102), true);
                overlayBackgroundViewFindViewById.setOnTouchListener(new rvq0(viewFindViewById, new w6e0(viewFindViewById2, viewFindViewById3, iu30Var9, imageView, (byte) 15)));
                button.setOnClickListener(new vhs(iu30Var9, (byte) 2));
                encoreAddToButtonView.n(new mhg0(iu30Var9, (byte) 6));
                viewFindViewById3.setOnClickListener(new jn90(iu30Var9, (byte) 11));
                viewInflate.addOnLayoutChangeListener(new jwg0(context, viewFindViewById2, viewFindViewById3, imageView, viewInflate));
                return new iwg0(viewInflate, textView2, textView3, textView, button, overlayBackgroundViewFindViewById, context, textView5, new p811(), (s060) obj5, imageView, encoreAddToButtonView, iu30Var9, textView4);
            case 28:
                kfl0 kfl0Var = (kfl0) obj;
                syg0 syg0Var = (syg0) obj4;
                r6h1 r6h1Var6 = kfl0Var.a;
                y6h1 y6h1Var4 = kfl0Var.b;
                if (!(syg0Var instanceof pyg0)) {
                    if (!(syg0Var instanceof qyg0)) {
                        if (syg0Var instanceof ryg0) {
                            return null;
                        }
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC13 = y6h1Var4.c();
                    x6h1VarC13.i.add(new a7h1("mic_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC13.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC13.a(), r6h1Var6, System.currentTimeMillis());
                } else if (((ezg0) obj5).h()) {
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var4, r6h1Var6, System.currentTimeMillis());
                } else {
                    String str5 = nik1.w6.a;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5 != null ? str5 : "")), y6h1Var4, r6h1Var6, System.currentTimeMillis());
                }
                return w7h1Var4;
            default:
                a6h0 a6h0Var2 = (a6h0) obj;
                iu30 iu30Var10 = (iu30) obj2;
                int iIntValue12 = ((Number) obj4).intValue();
                lnm lnmVar3 = a6h0Var2.B;
                boolean z3 = a6h0Var2.c;
                f6h0 f6h0Var2 = (f6h0) obj5;
                String str6 = a6h0Var2.b;
                mr4 mr4Var = f6h0Var2.e;
                x340 x340Var19 = (b0k) obj3;
                Object objT12 = x340Var19.T();
                m4c m4cVar3 = fkj0.X;
                if (objT12 == m4cVar3) {
                    objT12 = qxd0.M(o6x.a, x340Var19);
                    x340Var19.s0(objT12);
                }
                c9n c9nVar = (c9n) objT12;
                Boolean boolValueOf = Boolean.valueOf(a6h0Var2.d);
                boolean zI8 = x340Var19.i(a6h0Var2) | x340Var19.i((Object) null) | x340Var19.i(f6h0Var2);
                int i5 = (iIntValue12 & 112) ^ 48;
                if (i5 <= 32 || !x340Var19.g(iu30Var10)) {
                    f6h0Var = f6h0Var2;
                    if ((iIntValue12 & 48) != 32) {
                        z = false;
                    }
                    zI = zI8 | z | x340Var19.i(c9nVar);
                    objT = x340Var19.T();
                    if (!zI || objT == m4cVar3) {
                        objT = new c6h0(a6h0Var2, f6h0Var, iu30Var10, c9nVar, (lnm) null, (byte) 0);
                        a6h0Var = a6h0Var2;
                        iu30Var = iu30Var10;
                        x340Var19.s0(objT);
                    } else {
                        a6h0Var = a6h0Var2;
                        iu30Var = iu30Var10;
                    }
                    qxd0.r((Object) null, str6, boolValueOf, (vu30) objT, x340Var19);
                    iu30Var2 = iu30Var;
                    buo1.c(a6h0Var.A, a6h0Var.B, f6h0Var.d, iu30Var2, x340Var19, (iIntValue12 << 6) & 7168);
                    zI2 = x340Var19.i(f6h0Var);
                    objT2 = x340Var19.T();
                    if (zI2 || objT2 == m4cVar3) {
                        objT2 = new xy50(f6h0Var, (byte) 13);
                        x340Var19.s0(objT2);
                    }
                    qxd0.i(rih1Var, (iu30) objT2, x340Var19);
                    zI3 = x340Var19.i(f6h0Var) | ((i5 <= 32 && x340Var19.g(iu30Var2)) || (iIntValue12 & 48) == 32);
                    objT3 = x340Var19.T();
                    if (!zI3 || objT3 == m4cVar3) {
                        lnmVar = null;
                        objT3 = new k53(f6h0Var, iu30Var2, (lnm) null, (byte) 19);
                        x340Var19.s0(objT3);
                    } else {
                        lnmVar = null;
                    }
                    qxd0.t(iu30Var2, x340Var19, (vu30) objT3);
                    Boolean boolValueOf2 = Boolean.valueOf(a6h0Var.m);
                    zI4 = ((i5 <= 32 && x340Var19.g(iu30Var2)) || (iIntValue12 & 48) == 32) | x340Var19.i(a6h0Var) | x340Var19.i(f6h0Var);
                    objT4 = x340Var19.T();
                    if (zI4 || objT4 == m4cVar3) {
                        objT4 = new az80(a6h0Var, iu30Var2, f6h0Var, false, lnmVar, (byte) 17);
                        x340Var19.s0(objT4);
                    }
                    qxd0.t(boolValueOf2, x340Var19, (vu30) objT4);
                    nyx.a(2, (wux) null, apo.r(364761249, new rvg0(f6h0Var, a6h0Var, iu30Var2, (byte) 4), x340Var19), x340Var19, 3078, 6);
                    c380Var = a6h0Var.a;
                    if (z3 || (lnmVar3 != null && lnmVar3.a())) {
                        arrayList = new ArrayList();
                        for (Object obj7 : c380Var) {
                            if (!(((h5h0) obj7) instanceof y4h0)) {
                                arrayList.add(obj7);
                            }
                        }
                        c380VarA = mqo1.A(arrayList);
                    } else {
                        c380VarA = mqo1.A(o7h.O0(y4h0.a, c380Var));
                    }
                    c380 c380Var2 = c380VarA;
                    dt71 dt71Var = f6h0Var.l;
                    if (str6 == null) {
                        str = "";
                    } else {
                        str = str6;
                    }
                    boolean z4 = !f6h0Var.r;
                    if (lnmVar3 != null || lnmVar3.a()) {
                        lnmVar3 = lnmVar;
                    }
                    if (lnmVar3 != null) {
                        x340Var19.i0(718964006);
                        x340Var19.r(false);
                        lnmVarO0 = lnmVar;
                    } else {
                        x340Var19.i0(-253902277);
                        iOrdinal = lnmVar3.ordinal();
                        if (iOrdinal != 0 || iOrdinal == 1 || iOrdinal == 2) {
                            eg.m("Permission requests have no recognition progress text");
                            return null;
                        }
                        if (iOrdinal == 3) {
                            i = 2131958204;
                        } else if (iOrdinal == 4) {
                            i = 2131958203;
                        } else {
                            if (iOrdinal != 5) {
                                eg.o();
                                return null;
                            }
                            i = 2131958205;
                        }
                        lnmVarO0 = cwl1.o0(x340Var19, i);
                        x340Var19.r(false);
                    }
                    if (lnmVarO0 == null) {
                        lnmVarO0 = a6h0Var.n;
                    }
                    if (z3) {
                        lnmVar2 = lnmVarO0;
                    } else {
                        lnmVar2 = lnmVar;
                    }
                    dt71Var.a(new g6h0(c380Var2, str, z4, lnmVar2, a6h0Var.o, a6h0Var.p, mr4Var.h(), a6h0Var.h, q1o1.k(mr4Var)));
                    return rih1Var;
                }
                f6h0Var = f6h0Var2;
                z = true;
                zI = zI8 | z | x340Var19.i(c9nVar);
                objT = x340Var19.T();
                if (zI) {
                    objT = new c6h0(a6h0Var2, f6h0Var, iu30Var10, c9nVar, (lnm) null, (byte) 0);
                    a6h0Var = a6h0Var2;
                    iu30Var = iu30Var10;
                    x340Var19.s0(objT);
                } else {
                    objT = new c6h0(a6h0Var2, f6h0Var, iu30Var10, c9nVar, (lnm) null, (byte) 0);
                    a6h0Var = a6h0Var2;
                    iu30Var = iu30Var10;
                    x340Var19.s0(objT);
                }
                qxd0.r((Object) null, str6, boolValueOf, (vu30) objT, x340Var19);
                iu30Var2 = iu30Var;
                buo1.c(a6h0Var.A, a6h0Var.B, f6h0Var.d, iu30Var2, x340Var19, (iIntValue12 << 6) & 7168);
                zI2 = x340Var19.i(f6h0Var);
                objT2 = x340Var19.T();
                if (zI2) {
                    objT2 = new xy50(f6h0Var, (byte) 13);
                    x340Var19.s0(objT2);
                } else {
                    objT2 = new xy50(f6h0Var, (byte) 13);
                    x340Var19.s0(objT2);
                }
                qxd0.i(rih1Var, (iu30) objT2, x340Var19);
                zI3 = x340Var19.i(f6h0Var) | ((i5 <= 32 && x340Var19.g(iu30Var2)) || (iIntValue12 & 48) == 32);
                objT3 = x340Var19.T();
                if (zI3) {
                    lnmVar = null;
                    objT3 = new k53(f6h0Var, iu30Var2, (lnm) null, (byte) 19);
                    x340Var19.s0(objT3);
                } else {
                    lnmVar = null;
                    objT3 = new k53(f6h0Var, iu30Var2, (lnm) null, (byte) 19);
                    x340Var19.s0(objT3);
                }
                qxd0.t(iu30Var2, x340Var19, (vu30) objT3);
                Boolean boolValueOf3 = Boolean.valueOf(a6h0Var.m);
                zI4 = ((i5 <= 32 && x340Var19.g(iu30Var2)) || (iIntValue12 & 48) == 32) | x340Var19.i(a6h0Var) | x340Var19.i(f6h0Var);
                objT4 = x340Var19.T();
                if (zI4) {
                    objT4 = new az80(a6h0Var, iu30Var2, f6h0Var, false, lnmVar, (byte) 17);
                    x340Var19.s0(objT4);
                } else {
                    objT4 = new az80(a6h0Var, iu30Var2, f6h0Var, false, lnmVar, (byte) 17);
                    x340Var19.s0(objT4);
                }
                qxd0.t(boolValueOf3, x340Var19, (vu30) objT4);
                nyx.a(2, (wux) null, apo.r(364761249, new rvg0(f6h0Var, a6h0Var, iu30Var2, (byte) 4), x340Var19), x340Var19, 3078, 6);
                c380Var = a6h0Var.a;
                if (z3) {
                    arrayList = new ArrayList();
                    while (r2.hasNext()) {
                        if (!(((h5h0) obj7) instanceof y4h0)) {
                            arrayList.add(obj7);
                        }
                    }
                    c380VarA = mqo1.A(arrayList);
                } else {
                    arrayList = new ArrayList();
                    while (r2.hasNext()) {
                        if (!(((h5h0) obj7) instanceof y4h0)) {
                            arrayList.add(obj7);
                        }
                    }
                    c380VarA = mqo1.A(arrayList);
                }
                c380 c380Var3 = c380VarA;
                dt71 dt71Var2 = f6h0Var.l;
                if (str6 == null) {
                    str = "";
                } else {
                    str = str6;
                }
                boolean z5 = !f6h0Var.r;
                if (lnmVar3 != null) {
                    lnmVar3 = lnmVar;
                } else {
                    lnmVar3 = lnmVar;
                }
                if (lnmVar3 != null) {
                    x340Var19.i0(-253902277);
                    iOrdinal = lnmVar3.ordinal();
                    if (iOrdinal != 0) {
                    }
                    eg.m("Permission requests have no recognition progress text");
                    return null;
                }
                x340Var19.i0(718964006);
                x340Var19.r(false);
                lnmVarO0 = lnmVar;
                if (lnmVarO0 == null) {
                    lnmVarO0 = a6h0Var.n;
                }
                if (z3) {
                    lnmVar2 = lnmVarO0;
                } else {
                    lnmVar2 = lnmVar;
                }
                dt71Var2.a(new g6h0(c380Var3, str, z5, lnmVar2, a6h0Var.o, a6h0Var.p, mr4Var.h(), a6h0Var.h, q1o1.k(mr4Var)));
                return rih1Var;
        }
    }
}
