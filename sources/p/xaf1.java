package p;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.ui.unit.TextUnit;
import com.spotify.martini.martinidata.model.Mode;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.scrollsita.v1.Section;
import com.spotify.signup.signup.v2.proto.Error;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xaf1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xaf1(Object obj, Object obj2, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    vnr0 vnr0VarA = ((iv21) obj4).b;
                    u7h u7hVar = (u7h) obj3;
                    pxg1 pxg1Var = zaf1.c;
                    if (u7hVar != null) {
                        vnr0VarA = vnr0.a(vnr0VarA, (String) null, (lee1) null, (kor0) null, u7hVar.a, 23);
                    }
                    qgo1.f(vnr0VarA, u291.f(nim0Var, 1.0f), (a0e1) null, 0, false, (iu30) null, x340Var2, 56, 60);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                b2u.i((List) obj4, (ard1) obj3, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                h7w.l((lfa1) obj4, (tcf1) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    otw.c((mr10) ((uef1) obj4).Y.getValue(), new fr10(((qef1) obj3).a.b, (String) null, true, Mode.TOP_STORIES, (String) null, false, Error.INVALID_COUNTRY_FIELD_NUMBER), (qim0) null, (ipb1) null, x340Var4, 0, 12);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 4:
                iz6 iz6Var = (iz6) obj4;
                return new jpg0(f6o1.A(new kls0(((zl5) iz6Var.b).h(new epb1((zob1) obj), (iac0) obj2, (ms11) obj3, (nu11) null), (cgf1) iz6Var.d), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), udf1.f);
            case 5:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    otw.c((fqg0) obj4, ((egf1) obj3).b, (qim0) null, (ipb1) null, x340Var6, 0, 12);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                ((ujo) obj4).g((fof1) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                crm0.l((crf1) obj4, (qim0) obj3, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 8:
                trf1 trf1Var = (trf1) obj3;
                ((iu30) obj4).invoke(new qrf1((String) obj, trf1Var.a, (String) obj2, trf1Var.g));
                return rih1Var;
            case 9:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    lc7 lc7Var = (lc7) obj3;
                    otw.c(((wyf1) obj4).d, new tg7(lc7Var.a.a, ((cyf1) lc7Var.i).b), (qim0) null, (ipb1) null, x340Var8, 0, 12);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 10:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    adg1 adg1Var = (adg1) obj3;
                    fdg1.q((wcg1) obj4, adg1Var.d, adg1Var.e, adg1Var.f, adg1Var.g, adg1Var.h, adg1Var.i, adg1Var.t, adg1Var.X, adg1Var.Y, adg1Var.Z, adg1Var.P0, adg1Var.Q0, x340Var10, 0);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 11:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                iu30 iu30Var = (iu30) obj3;
                dlg1 dlg1Var = (dlg1) obj4;
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    boolean zI = x340Var12.i(dlg1Var) | x340Var12.g(iu30Var);
                    Object objT = x340Var12.T();
                    if (zI || objT == fkj0.X) {
                        objT = new bwr0(dlg1Var, iu30Var, (byte) 1);
                        x340Var12.s0(objT);
                    }
                    foo1.f(new gbx(z50.c, (Function0) objT), (qim0) null, (max) null, (gdx) null, (idn0) null, (vu30) null, (vu30) null, aoj.b, x340Var12, 12582912, 126);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 12:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    qqg1 qqg1Var = (qqg1) obj3;
                    otw.c((maa) ((r060) obj4).b.get(), new kqg1(qqg1Var.b, qqg1Var.c), (qim0) null, (ipb1) null, x340Var14, 0, 12);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                cpn1.c((srg1) obj4, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                cpn1.d((trg1) obj4, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                cpn1.g((yrg1) obj4, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 16:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                iu30 iu30Var2 = (iu30) obj3;
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    fhm0 fhm0Var = (fhm0) obj4;
                    zrg1 zrg1Var = fhm0Var.b;
                    msg1 msg1Var = fhm0Var.a;
                    boolean zG = x340Var16.g(iu30Var2);
                    Object objT2 = x340Var16.T();
                    if (zG || objT2 == m4cVar) {
                        objT2 = new fgf1(iu30Var2, (byte) 11);
                        x340Var16.s0(objT2);
                    }
                    Function0 function0 = (Function0) objT2;
                    boolean zG2 = x340Var16.g(iu30Var2);
                    Object objT3 = x340Var16.T();
                    if (zG2 || objT3 == m4cVar) {
                        objT3 = new fgf1(iu30Var2, (byte) 12);
                        x340Var16.s0(objT3);
                    }
                    Function0 function1 = (Function0) objT3;
                    boolean zG3 = x340Var16.g(iu30Var2);
                    Object objT4 = x340Var16.T();
                    if (zG3 || objT4 == m4cVar) {
                        objT4 = new fgf1(iu30Var2, (byte) 13);
                        x340Var16.s0(objT4);
                    }
                    cpn1.i(zrg1Var, msg1Var, function0, function1, (Function0) objT4, (qim0) null, x340Var16, 0);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 17:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    yj41 yj41Var = ((wxg1) ((jye1) obj4).c).b;
                    cwl1.g(new yk4(yj41Var.a), yj41Var.b, u291.r(nim0Var, ((p3v) obj3).a), mif1.Q0, 0, x340Var18, 24576, 232);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                ern1.i((sxg1) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 19:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                scx scxVar = (scx) obj3;
                String str = (String) obj4;
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    boolean zI2 = x340Var20.i(scxVar);
                    Object objT5 = x340Var20.T();
                    if (zI2 || objT5 == fkj0.X) {
                        objT5 = new rqc(scxVar, (byte) 4);
                        x340Var20.s0(objT5);
                    }
                    Function0 function2 = (Function0) objT5;
                    if (ihc1.y0(str)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    foo1.c(new gbx(new y50(str), function2), new idx(4), (qim0) null, (max) null, yla.r(x340Var20), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(2060964852, new zsd1(str, (byte) 10), x340Var20), x340Var20, 0, 48, 2012);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 20:
                ((Number) obj2).intValue();
                ((rwj) obj4).j((Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 21:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    Object objT6 = x340Var22.T();
                    if (objT6 == fkj0.X) {
                        objT6 = hzg1.N0;
                        x340Var22.s0(objT6);
                    }
                    leh1 leh1Var = (leh1) obj3;
                    o4p1.g(((Context) obj4).getString(2131959286), iko1.x(et40.a, (iu30) objT6), leh1Var != null ? kee1.a(nee1.c, leh1Var.c, (TextUnit) null, (ka30) null, (zzd1) null, 126) : nee1.c, 0, x340Var22, 0, 8);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 22:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    qim0 qim0VarN = anm1.N("TOOLBAR", d9y0.k(nim0Var, ((Number) ((tob1) obj3).getValue()).floatValue()));
                    String str2 = ((a470) obj4).a.a;
                    uwr uwrVar = cbx.a;
                    uwo1.e(str2, qim0VarN, cbx.d(x340Var24).h, cbx.a(x340Var24).b.a, (a0e1) null, (iu30) null, 2, false, (djc0) null, 1, (qx8) null, x340Var24, 806879232, 0, 1456);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 23:
                ((Number) obj2).intValue();
                sio1.o((zmh1) obj4, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                ((t01) obj4).f(czo1.p(7), (j2i) obj3, (b0k) obj);
                return rih1Var;
            case 25:
                ((Number) obj2).intValue();
                ((m6i1) obj4).g((String) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 26:
                x340 x340Var25 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    ((m6i1) obj4).g(((i6i1) obj3).b, x340Var26, 0);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                ((Number) obj2).intValue();
                fqo1.t((yxa0) obj4, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 28:
                ((Number) obj2).intValue();
                ((dlg1) obj4).a((qhi1) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                x340 x340Var27 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    otw.c((t2f1) obj4, ((thi1) obj3).b, (qim0) null, (ipb1) null, x340Var28, 8, 12);
                } else {
                    x340Var28.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xaf1(Object obj, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
