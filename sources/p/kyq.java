package p;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.ui.graphics.Brush;
import com.spotify.genalphagraduation.datadownload.page.domain.DataSectionType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.ModalTemplate;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kyq extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kyq(c380 c380Var, x880 x880Var, iu30 iu30Var, qim0 qim0Var, iu30 iu30Var2, int i) {
        super(2);
        this.a = (byte) 22;
        hsw0 hsw0Var = hsw0.a;
        this.d = c380Var;
        this.e = x880Var;
        this.b = iu30Var;
        this.f = qim0Var;
        this.g = iu30Var2;
        this.c = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = 0;
        rih1 rih1Var = rih1.a;
        int i2 = this.c;
        Object obj3 = this.b;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                g2p1.l((l3p1) obj7, (String) obj6, (DataSectionType) obj5, (xxq) obj4, (iu30) obj3, (b0k) obj, czo1.p(i2 | 1));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                ((nas) obj7).c((MessageResponseToken) obj6, (cdj0) obj5, (ModalTemplate) obj4, (iu30) obj3, (b0k) obj, czo1.p(i2 | 1));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                bbp1.b((d8t) obj7, (Function0) obj6, (Function0) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(i2 | 1));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                ((lqc) obj7).g((String) obj6, (Integer) obj5, (Integer) obj4, (qim0) obj3, (b0k) obj, czo1.p(i2 | 1));
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                ((bxv) obj7).f((xtb0) obj6, (vzq0) obj5, (eyv) obj4, (iu30) obj3, (b0k) obj, czo1.p(i2 | 1));
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                ero1.c((qim0) obj7, (gbx) obj5, (String) obj6, (idn0) obj4, (j2i) obj3, (b0k) obj, czo1.p(i2 | 1));
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                ((lz9) obj7).e((wwy) obj6, (xwa) obj5, (xwa) obj4, (qim0) obj3, (b0k) obj, czo1.p(i2 | 1));
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                oho1.e((c380) obj7, (p40) obj6, (iu30) obj3, (Function0) obj5, (qim0) obj4, (b0k) obj, czo1.p(i2 | 1));
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                cuo1.m((jj10) obj7, (Function0) obj6, (Function0) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(i2 | 1));
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                wxo1.f((gp10) obj7, (Function0) obj5, (qim0) obj4, (String) obj6, (String) obj3, (b0k) obj, czo1.p(i2 | 1));
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                e9p1.c((ziu) obj7, (lee1) obj6, (yf) obj5, (qim0) obj4, (iu30) obj3, (b0k) obj, czo1.p(i2 | 1));
                return rih1Var;
            case 11:
                ((Number) obj2).intValue();
                ((rnu) obj7).a((String) obj6, (xb10) obj5, (qim0) obj4, (yqi1) obj3, (b0k) obj, czo1.p(i2 | 1));
                return rih1Var;
            case 12:
                ((Number) obj2).intValue();
                ((ro30) obj7).b((qcb1) obj6, (jha1) obj5, (iu30) obj3, (qim0) obj4, (b0k) obj, czo1.p(i2 | 1));
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                aq8.k((String) obj6, (String) obj7, (String) obj5, (List) obj4, (qim0) obj3, (b0k) obj, czo1.p(i2 | 1));
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                rqt0.e((fs40) obj7, (Function0) obj6, (Function0) obj5, (qim0) obj4, (idn0) obj3, (b0k) obj, czo1.p(i2 | 1));
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                y9g1.e((dsx) obj7, (dsx) obj6, (qim0) obj5, (Brush) obj4, (Brush) obj3, (b0k) obj, czo1.p(i2 | 1));
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                crn1.c((kl50) obj7, (jl50) obj5, (String) obj6, (String) obj4, (Function0) obj3, (b0k) obj, czo1.p(i2 | 1));
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                q0o1.b((hcl1) obj7, (c380) obj6, (iu30) obj3, (j2i) obj5, (qim0) obj4, (b0k) obj, czo1.p(i2 | 1));
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                blo1.h((c380) obj7, (zfx) obj6, (srt0) obj5, (iu30) obj3, (iu30) obj4, (b0k) obj, czo1.p(i2 | 1));
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                i2p1.h((Context) obj7, (Bitmap) obj6, (Bitmap) obj5, (u380) obj4, (qim0) obj3, (b0k) obj, czo1.p(i2 | 1));
                return rih1Var;
            case 20:
                ((Number) obj2).intValue();
                ((af80) obj7).d((Button) obj5, (MessageTemplate) obj4, (String) obj6, (iu30) obj3, (b0k) obj, czo1.p(i2 | 1));
                return rih1Var;
            case 21:
                String str = (String) obj6;
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zI = x340Var2.i((dw91) obj7) | x340Var2.e(i2) | x340Var2.i((ven0) obj5) | x340Var2.i((vyz0) obj4) | x340Var2.g(str) | x340Var2.g((iu30) obj3);
                    dw91 dw91Var = (dw91) obj7;
                    vyz0 vyz0Var = (vyz0) obj4;
                    String str2 = (String) obj6;
                    iu30 iu30Var = (iu30) obj3;
                    ven0 ven0Var = (ven0) obj5;
                    Object objT = x340Var2.T();
                    if (zI || objT == fkj0.X) {
                        y6v y6vVar = new y6v(this.c, str2, iu30Var, ven0Var, vyz0Var, dw91Var);
                        x340Var2.s0(y6vVar);
                        objT = y6vVar;
                    }
                    iu90.f(0, str, (Function0) objT, x340Var2, null);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                hsw0 hsw0Var = hsw0.a;
                iu90.d((c380) obj7, (x880) obj6, (iu30) obj3, (qim0) obj5, (iu30) obj4, (b0k) obj, czo1.p(i2 | 1));
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ((Number) obj2).intValue();
                hqq0.l((lx90) obj7, (tob1) obj6, (d6o0) obj5, (y5a0) obj4, (iu30) obj3, (b0k) obj, czo1.p(i2 | 1));
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                sgc1.b((iba0) obj7, (no90) obj6, (iu30) obj3, (iu30) obj5, (Function0) obj4, (b0k) obj, czo1.p(i2 | 1));
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                ((Number) obj2).intValue();
                mth1.c((uda0) obj7, (Function0) obj6, (Function0) obj5, (Function0) obj4, (Function0) obj3, (b0k) obj, czo1.p(i2 | 1));
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                j0o1.i((mya0) obj7, (String) obj6, (shg1) obj5, (iu30) obj3, (qim0) obj4, (b0k) obj, czo1.p(i2 | 1));
                return rih1Var;
            case 27:
                byte b2 = 1;
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    j2i j2iVar = (j2i) obj5;
                    String str3 = (String) obj6;
                    are0 are0Var = (are0) obj4;
                    iu30 iu30Var2 = (iu30) obj3;
                    int i3 = 0;
                    for (Object obj8 : ((wqe0) obj7).c) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            p7h.T();
                            throw null;
                        }
                        woe0 woe0Var = (woe0) obj8;
                        tqe0 tqe0VarB = uqe0.b(str3, are0Var, new t50(i2, i3));
                        j2iVar.invoke(tqe0VarB != null ? tqe0VarB.a : null, x340Var4, Integer.valueOf(i));
                        String str4 = woe0Var.a;
                        boolean zG = x340Var4.g(iu30Var2) | x340Var4.e(i2) | x340Var4.e(i3);
                        Object objT2 = x340Var4.T();
                        if (zG || objT2 == fkj0.X) {
                            objT2 = new n1j(b2, i2, i3, iu30Var2);
                            x340Var4.s0(objT2);
                        }
                        byte b3 = b2;
                        foo1.c(new gbx(new y50(str4), (Function0) objT2), (i2 == 0 && i3 == 0) ? new idx(4) : i2 == 0 ? new idx() : jdx.c, (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-748120425, new s2c0(woe0Var, (byte) 25), x340Var4), x340Var4, 0, 48, 2044);
                        i3 = i4;
                        b2 = b3;
                        i = 0;
                    }
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 28:
                ((Number) obj2).intValue();
                ((y1f0) obj7).h((String) obj6, (vzg1) obj5, (c380) obj4, (iu30) obj3, (b0k) obj, czo1.p(i2 | 1));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                ((a2f0) obj7).h((String) obj6, (vzg1) obj5, (c380) obj4, (iu30) obj3, (b0k) obj, czo1.p(i2 | 1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kyq(byte b, int i, Object obj, Object obj2, Object obj3, Object obj4, String str) {
        super(2);
        this.a = b;
        this.d = obj;
        this.f = obj2;
        this.g = obj3;
        this.e = str;
        this.b = obj4;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kyq(byte b, int i, Object obj, Object obj2, Object obj3, Object obj4, iu30 iu30Var) {
        super(2);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.b = iu30Var;
        this.g = obj4;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kyq(int i, String str, iu30 iu30Var, ven0 ven0Var, vyz0 vyz0Var, dw91 dw91Var) {
        super(2);
        this.a = (byte) 21;
        this.e = str;
        this.d = dw91Var;
        this.c = i;
        this.f = ven0Var;
        this.g = vyz0Var;
        this.b = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kyq(Object obj, Object obj2, iu30 iu30Var, cv30 cv30Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = iu30Var;
        this.f = cv30Var;
        this.g = qim0Var;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kyq(String str, String str2, String str3, List list, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 13;
        this.e = str;
        this.d = str2;
        this.f = str3;
        this.g = list;
        this.b = qim0Var;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kyq(kl50 kl50Var, jl50 jl50Var, String str, String str2, Function0 function0, int i) {
        super(2);
        this.a = (byte) 16;
        this.d = kl50Var;
        this.f = jl50Var;
        this.e = str;
        this.g = str2;
        this.b = function0;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kyq(byte b, int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        super(2);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
        this.b = obj5;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kyq(iba0 iba0Var, no90 no90Var, iu30 iu30Var, iu30 iu30Var2, Function0 function0, int i) {
        super(2);
        this.a = (byte) 24;
        this.d = iba0Var;
        this.e = no90Var;
        this.b = iu30Var;
        this.f = iu30Var2;
        this.g = function0;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kyq(uda0 uda0Var, Function0 function0, Function0 function1, Function0 function2, Function0 function3, int i) {
        super(2);
        this.a = (byte) 25;
        this.d = uda0Var;
        this.e = function0;
        this.f = function1;
        this.g = function2;
        this.b = function3;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kyq(wqe0 wqe0Var, j2i j2iVar, String str, are0 are0Var, int i, iu30 iu30Var) {
        super(2);
        this.a = (byte) 27;
        this.d = wqe0Var;
        this.f = j2iVar;
        this.e = str;
        this.g = are0Var;
        this.c = i;
        this.b = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kyq(qim0 qim0Var, gbx gbxVar, String str, idn0 idn0Var, j2i j2iVar, int i) {
        super(2);
        this.a = (byte) 5;
        this.d = qim0Var;
        this.f = gbxVar;
        this.e = str;
        this.g = idn0Var;
        this.b = j2iVar;
        this.c = i;
    }
}
