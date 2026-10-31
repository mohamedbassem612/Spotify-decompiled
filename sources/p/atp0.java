package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.base.java.logging.Logger;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class atp0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ atp0(String str, byte b) {
        super(1);
        this.a = b;
        this.b = str;
    }

    public final Object invoke(Object obj) throws Exception {
        ctp0 ctp0Var;
        byte b = this.a;
        j5 j5Var = j5.a;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        String str = this.b;
        switch (b) {
            case 0:
                d441 d441VarG1 = ((y341) obj).g1("SELECT * FROM OfflineLicenseInfoEntity WHERE media_id = ?");
                try {
                    d441VarG1.K(1, str);
                    int iW = y7y0.w(d441VarG1, "media_id");
                    int iW2 = y7y0.w(d441VarG1, "key_set_id");
                    if (d441VarG1.f1()) {
                        ctp0Var = new ctp0(d441VarG1.P0(iW), d441VarG1.P0(iW2));
                        break;
                    } else {
                        ctp0Var = null;
                    }
                    return ctp0Var;
                } finally {
                    d441VarG1.close();
                }
            case 1:
                Logger.d(gvg.h("Failed loading playlist ", str, ", error: ", ((jy21) obj).b()), new Object[0]);
                return j5Var;
            case 2:
                ((qv00) obj).a(str, xkk1.class, false);
                return rih1Var;
            case 3:
                b261.n((e261) obj, str);
                return rih1Var;
            case 4:
                b261.n((e261) obj, str);
                return rih1Var;
            case 5:
                b261.A((e261) obj, str);
                return rih1Var;
            case 6:
                ((qv00) obj).a(str, ldg1.class, false);
                return rih1Var;
            case 7:
                b261.n((e261) obj, str);
                return rih1Var;
            case 8:
                b261.n((e261) obj, str);
                return rih1Var;
            case 9:
                b261.B((e261) obj, "partnerIntegrationSetting_" + str + "_cta");
                return rih1Var;
            case 10:
                ((qv00) obj).a(str, jo70.class, false);
                return rih1Var;
            case 11:
                t1u0 t1u0VarE0 = ((kb61) obj).e0();
                t1u0.d(t1u0VarE0.Z, new q1u0(t1u0VarE0, str, (byte) 1));
                return rih1Var;
            case 12:
                t1u0 t1u0VarE1 = ((kb61) obj).e0();
                t1u0.d(t1u0VarE1.Z, new q1u0(t1u0VarE1, str, (byte) 0));
                return rih1Var;
            case 13:
                t1u0 t1u0VarE2 = ((kb61) obj).e0();
                t1u0.d(t1u0VarE2.Z, new q1u0(t1u0VarE2, str, (byte) 5));
                return rih1Var;
            case 14:
                t1u0 t1u0VarE3 = ((kb61) obj).e0();
                t1u0.d(t1u0VarE3.Z, new q1u0(t1u0VarE3, str, (byte) 4));
                return rih1Var;
            case 15:
                t1u0 t1u0VarE4 = ((kb61) obj).e0();
                t1u0.d(t1u0VarE4.Z, new q1u0(t1u0VarE4, str, (byte) 2));
                return rih1Var;
            case 16:
                t1u0 t1u0VarE5 = ((kb61) obj).e0();
                t1u0.d(t1u0VarE5.Z, new q1u0(t1u0VarE5, str, (byte) 3));
                return rih1Var;
            case 17:
                b261.n((e261) obj, str);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                b261.n((e261) obj, str);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                Logger.d(gvg.h("Failed loading playlist ", str, ", error: ", ((jy21) obj).b()), new Object[0]);
                return j5Var;
            case 20:
                b261.n((e261) obj, str);
                return rih1Var;
            case 21:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("pin_item", 1, Collections.singletonMap("item_to_pin", str != null ? str : "")), ((x2l0) obj).a, r6h1.c, System.currentTimeMillis());
            case 22:
                b261.n((e261) obj, str);
                return rih1Var;
            case 23:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), ((j1l0) obj).a, r6h1.c, System.currentTimeMillis());
            case 24:
                e261 e261Var = (e261) obj;
                b261.n(e261Var, str);
                b261.x(e261Var, 0);
                b261.B(e261Var, "mdc.playlink.card");
                return rih1Var;
            case 25:
                return ((p1l0) obj).e(str);
            case 26:
                ((qv00) obj).a(str, mtl.class, false);
                return rih1Var;
            case 27:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), ((m1l0) obj).a, r6h1.c, System.currentTimeMillis());
            case 28:
                ((qv00) obj).a(str, jo70.class, false);
                return rih1Var;
            default:
                return Boolean.valueOf(u890.j(((pt1) obj).getUri(), str));
        }
    }
}
