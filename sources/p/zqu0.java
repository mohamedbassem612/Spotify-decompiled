package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zqu0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zqu0(String str, byte b) {
        super(1);
        this.a = b;
        this.b = str;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        String str = this.b;
        switch (b) {
            case 0:
                Logger.d("Error getting Smart Shuffle recommendations for " + str + ": " + ((jy21) obj), new Object[0]);
                return z6x.a;
            case 1:
                List list = ((wsc0) obj).e;
                ArrayList<zuc0> arrayList = new ArrayList();
                for (Object obj2 : list) {
                    zuc0 zuc0Var = (zuc0) obj2;
                    if (zuc0Var.e) {
                        Set set = s4b1.f;
                        if (uic.x(zuc0Var.c).c == blc0.ti) {
                            arrayList.add(obj2);
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                for (zuc0 zuc0Var2 : arrayList) {
                    String str2 = zuc0Var2.c;
                    String str3 = zuc0Var2.a;
                    String str4 = zuc0Var2.i;
                    fjf1 fjf1Var = zuc0Var2.p;
                    String strY0 = fjf1Var instanceof fjf1 ? o7h.y0(fjf1Var.b, ", ", (String) null, (String) null, lqu0.Y, 30) : "";
                    String str5 = (String) zuc0Var2.r.getValue();
                    arrayList2.add(new kjf1(str2, str3, str4, strY0, zuc0Var2.a(1), this.b, str5 == null ? "" : str5));
                }
                return arrayList2;
            case 2:
                b261.A((e261) obj, str);
                return rih1Var;
            case 3:
                ((qv00) obj).a(str, qp31.class, false);
                return rih1Var;
            case 4:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), ((n1l0) obj).a, r6h1.c, System.currentTimeMillis());
            case 5:
                ((qv00) obj).a(str, gwu0.class, false);
                return rih1Var;
            case 6:
                b261.n((e261) obj, str);
                return rih1Var;
            case 7:
                b261.n((e261) obj, str);
                return rih1Var;
            case 8:
                ((qv00) obj).b(jo70.class, Collections.singletonList(str), false);
                return rih1Var;
            case 9:
                ((qv00) obj).a(str, zd3.class, false);
                return rih1Var;
            case 10:
                b261.n((e261) obj, str);
                return rih1Var;
            case 11:
                b261.n((e261) obj, str);
                return rih1Var;
            case 12:
                b261.n((e261) obj, str);
                return rih1Var;
            case 13:
                b261.n((e261) obj, str);
                return rih1Var;
            case 14:
                b261.n((e261) obj, str);
                return rih1Var;
            case 15:
                b261.n((e261) obj, str);
                return rih1Var;
            case 16:
                b261.n((e261) obj, str);
                return rih1Var;
            case 17:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), ((o1l0) obj).a, r6h1.c, System.currentTimeMillis());
            case 18:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("follow", 1, Collections.singletonMap("item_to_be_followed", str != null ? str : "")), ((i0l0) obj).a, r6h1.c, System.currentTimeMillis());
            case 19:
                return ((r2l0) obj).e(str);
            case 20:
                return ((r2l0) obj).h(str);
            case 21:
                b261.n((e261) obj, str);
                return rih1Var;
            case 22:
                b261.n((e261) obj, str);
                return rih1Var;
            case 23:
                return new rxc0(str);
            case 24:
                ((qv00) obj).a(str, jo70.class, false);
                return rih1Var;
            case 25:
                ((qv00) obj).a(str, jo70.class, false);
                return rih1Var;
            case 26:
                return Boolean.valueOf(u890.j(((eo01) obj).a, str));
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                ((qv00) obj).a(str, xkk1.class, false);
                return rih1Var;
            case 28:
                b261.n((e261) obj, str);
                return rih1Var;
            default:
                b261.n((e261) obj, str);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zqu0(bru0 bru0Var, String str) {
        super(1);
        this.a = (byte) 1;
        this.b = str;
    }
}
