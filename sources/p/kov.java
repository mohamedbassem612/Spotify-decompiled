package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kov extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kov(String str, pbq pbqVar) {
        super(1);
        this.a = (byte) 21;
        this.b = str;
    }

    public final Object invoke(Object obj) throws Exception {
        gd2 gd2Var;
        Boolean boolValueOf;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.b;
        switch (b) {
            case 0:
                Set set = s4b1.f;
                return ((p2l0) obj).a("spotify:internal:clip:" + uic.x(str).h() + ":edit");
            case 1:
                return ((p2l0) obj).a(str);
            case 2:
                b261.n((e261) obj, str);
                return rih1Var;
            case 3:
                b261.n((e261) obj, str);
                return rih1Var;
            case 4:
                b261.n((e261) obj, str);
                return rih1Var;
            case 5:
                sil silVar = (sil) obj;
                nnb0 ihlVar = new ihl("image");
                nnb0 ihlVar2 = new ihl("bottom_row");
                ihl ihlVar3 = new ihl("background");
                silVar.h(new nnb0[]{ihlVar, ihlVar2}, ybe.d);
                silVar.c(ihlVar, new c3x(ihlVar2, str, (byte) 0));
                silVar.c(ihlVar2, new pu(ihlVar, (byte) 7));
                silVar.c(ihlVar3, new jih(ihlVar, ihlVar2, (byte) 1));
                return rih1Var;
            case 6:
                sil silVar2 = (sil) obj;
                nnb0 ihlVar4 = new ihl("image");
                nnb0 ihlVar5 = new ihl("bottom_row");
                ihl ihlVar6 = new ihl("background");
                silVar2.h(new nnb0[]{ihlVar4, ihlVar5}, ybe.d);
                silVar2.c(ihlVar4, new c3x(ihlVar5, str, (byte) 1));
                silVar2.c(ihlVar5, new pu(ihlVar4, (byte) 8));
                silVar2.c(ihlVar6, new jih(ihlVar4, ihlVar5, (byte) 2));
                return rih1Var;
            case 7:
                str.getClass();
                b261.n((e261) obj, str);
                return rih1Var;
            case 8:
                e261 e261Var = (e261) obj;
                b261.c(e261Var);
                b261.n(e261Var, str);
                return rih1Var;
            case 9:
                b261.n((e261) obj, str);
                return rih1Var;
            case 10:
                b261.A((e261) obj, str);
                return rih1Var;
            case 11:
                ((qv00) obj).a(str, xkk1.class, false);
                return rih1Var;
            case 12:
                e261 e261Var2 = (e261) obj;
                if (str == null) {
                    str = "";
                }
                b261.n(e261Var2, str);
                b261.x(e261Var2, 0);
                return rih1Var;
            case 13:
                return Boolean.valueOf(u890.j(((ll51) obj).a, str));
            case 14:
                return Boolean.valueOf(u890.j(((fl51) obj).a, str));
            case 15:
                qv00 qv00Var = (qv00) obj;
                qv00Var.a(str, jo70.class, false);
                qv00Var.a(str, xkk1.class, false);
                qv00Var.a(str, vn71.class, false);
                return rih1Var;
            case 16:
                ((qv00) obj).a(str, jo70.class, false);
                return rih1Var;
            case 17:
                ((qv00) obj).a(str, jo70.class, false);
                return rih1Var;
            case 18:
                ((qv00) obj).a(str, jo70.class, false);
                return rih1Var;
            case 19:
                ((qv00) obj).a(str, jo70.class, false);
                return rih1Var;
            case 20:
                return new s371((String) obj, str, 8, "context-menu");
            case 21:
                tb2 tb2Var = (tb2) obj;
                if (tb2Var.a) {
                    Integer num = tb2Var.b;
                    gd2Var = new gd2(num != null ? num.intValue() : 0, true);
                } else {
                    gd2Var = hd2.a;
                }
                return Collections.singletonMap(str, gd2Var);
            case 22:
                ((qv00) obj).a(str, l1z.class, false);
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ((qv00) obj).a(str, l1z.class, false);
                return rih1Var;
            case 24:
                qv00 qv00Var2 = (qv00) obj;
                qv00Var2.a(str, v740.class, false);
                qv00Var2.a(str, mdz.class, false);
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                ((qv00) obj).a(str, mdz.class, false);
                return rih1Var;
            case 26:
                ((qv00) obj).a(str, d7u0.class, false);
                return rih1Var;
            case 27:
                ((qv00) obj).a(str, mdz.class, false);
                return rih1Var;
            case 28:
                qv00 qv00Var3 = (qv00) obj;
                qv00Var3.a(str, jo70.class, false);
                qv00Var3.a(str, hll.class, false);
                qv00Var3.a(str, d7u0.class, false);
                qv00Var3.a(str, xkk1.class, false);
                return rih1Var;
            default:
                d441 d441VarG1 = ((y341) obj).g1("SELECT * FROM Events WHERE deviceId IS NULL OR deviceId <> ? ORDER BY id ASC");
                try {
                    d441VarG1.K(1, str);
                    int iW = y7y0.w(d441VarG1, "id");
                    int iW2 = y7y0.w(d441VarG1, "authenticated");
                    int iW3 = y7y0.w(d441VarG1, "eventName");
                    int iW4 = y7y0.w(d441VarG1, "sequenceId");
                    int iW5 = y7y0.w(d441VarG1, "sequenceNumber");
                    int iW6 = y7y0.w(d441VarG1, "fragments");
                    int iW7 = y7y0.w(d441VarG1, "owner");
                    int iW8 = y7y0.w(d441VarG1, "deviceId");
                    ArrayList arrayList = new ArrayList();
                    while (d441VarG1.f1()) {
                        ba00 ba00Var = new ba00();
                        ba00Var.a = d441VarG1.getLong(iW);
                        Integer numValueOf = d441VarG1.isNull(iW2) ? null : Integer.valueOf((int) d441VarG1.getLong(iW2));
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        } else {
                            boolValueOf = null;
                        }
                        ba00Var.b = boolValueOf;
                        if (d441VarG1.isNull(iW3)) {
                            ba00Var.c = null;
                        } else {
                            ba00Var.c = d441VarG1.P0(iW3);
                        }
                        if (d441VarG1.isNull(iW4)) {
                            ba00Var.d = null;
                        } else {
                            ba00Var.d = d441VarG1.getBlob(iW4);
                        }
                        ba00Var.e = d441VarG1.getLong(iW5);
                        if (d441VarG1.isNull(iW6)) {
                            ba00Var.f = null;
                        } else {
                            ba00Var.f = d441VarG1.getBlob(iW6);
                        }
                        if (d441VarG1.isNull(iW7)) {
                            ba00Var.g = null;
                        } else {
                            ba00Var.g = d441VarG1.P0(iW7);
                        }
                        if (d441VarG1.isNull(iW8)) {
                            ba00Var.h = null;
                        } else {
                            ba00Var.h = d441VarG1.P0(iW8);
                        }
                        arrayList.add(ba00Var);
                        break;
                    }
                    return arrayList;
                } finally {
                    d441VarG1.close();
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kov(String str, byte b) {
        super(1);
        this.a = b;
        this.b = str;
    }
}
