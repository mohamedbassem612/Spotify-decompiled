package p;

import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nb9 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb9(phb phbVar, String str) {
        super(1);
        this.a = (byte) 22;
        this.b = str;
    }

    public final Object invoke(Object obj) throws Exception {
        int i;
        byte b = this.a;
        boolean z = false;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        String str = this.b;
        switch (b) {
            case 0:
                b261.n((e261) obj, str);
                return rih1Var;
            case 1:
                e261 e261Var = (e261) obj;
                b261.n(e261Var, str);
                b261.x(e261Var, 0);
                return rih1Var;
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
                b261.u((e261) obj, str);
                return rih1Var;
            case 6:
                ((qv00) obj).a(str, xkk1.class, false);
                return rih1Var;
            case 7:
                b261.n((e261) obj, str);
                return rih1Var;
            case 8:
                b261.C((e261) obj, new af5(str));
                return rih1Var;
            case 9:
                b261.n((e261) obj, str);
                return rih1Var;
            case 10:
                b261.n((e261) obj, str);
                return rih1Var;
            case 11:
                return new pll0(new pdl0((byte) 11), str);
            case 12:
                return new qll0(new pdl0((byte) 11), str);
            case 13:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), ((qll0) obj).a, r6h1.c, System.currentTimeMillis());
            case 14:
                return new rll0(new pdl0((byte) 11), str);
            case 15:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("leave_playlist", 1, Collections.singletonMap("playlist", str)), ((rll0) obj).a, r6h1.c, System.currentTimeMillis());
            case 16:
                return new sll0(new pdl0((byte) 11), str);
            case 17:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), ((sll0) obj).a, r6h1.c, System.currentTimeMillis());
            case 18:
                bzk0 bzk0Var = (bzk0) obj;
                Set set = s4b1.f;
                String strZ = uic.C(str, (String) null).z();
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("block_user", 1, Collections.singletonMap("user_to_be_blocked", strZ != null ? strZ : "")), bzk0Var.a, r6h1.c, System.currentTimeMillis());
            case 19:
                ((qv00) obj).a(str, hll.class, false);
                return rih1Var;
            case 20:
                e261 e261Var2 = (e261) obj;
                b261.n(e261Var2, str);
                fam.a.getClass();
                b261.o(e261Var2, s9m.e);
                c261.a(e261Var2);
                return rih1Var;
            case 21:
                d441 d441VarG1 = ((y341) obj).g1("SELECT * FROM BluetoothHeadphoneFilterStateEntity WHERE owner = ?");
                try {
                    d441VarG1.K(1, str);
                    int iW = y7y0.w(d441VarG1, "headphoneIdentifier");
                    int iW2 = y7y0.w(d441VarG1, "owner");
                    int iW3 = y7y0.w(d441VarG1, "headphoneName");
                    int iW4 = y7y0.w(d441VarG1, "externalizationEnabledId");
                    int iW5 = y7y0.w(d441VarG1, "externalizationDisabledId");
                    int iW6 = y7y0.w(d441VarG1, "externalizationEnabled");
                    int iW7 = y7y0.w(d441VarG1, "specificEnabledId");
                    int iW8 = y7y0.w(d441VarG1, "specificDisabledId");
                    int iW9 = y7y0.w(d441VarG1, "specificEnabled");
                    int iW10 = y7y0.w(d441VarG1, "filterName");
                    ArrayList arrayList = new ArrayList();
                    while (d441VarG1.f1()) {
                        int i2 = iW2;
                        arrayList.add(new fhb(d441VarG1.P0(iW), d441VarG1.P0(iW2), d441VarG1.P0(iW3), d441VarG1.P0(iW4), d441VarG1.P0(iW5), ((int) d441VarG1.getLong(iW6)) != 0, d441VarG1.isNull(iW7) ? null : d441VarG1.P0(iW7), d441VarG1.P0(iW8), ((int) d441VarG1.getLong(iW9)) != 0, d441VarG1.isNull(iW10) ? null : d441VarG1.P0(iW10)));
                        iW2 = i2;
                        break;
                    }
                    return arrayList;
                } finally {
                    d441VarG1.close();
                }
            case 22:
                qt7 qt7Var = (qt7) obj;
                if ((qt7Var.getType() == 7 || (((i = Build.VERSION.SDK_INT) >= 31 && qt7Var.getType() == 26) || (i >= 28 && qt7Var.getType() == 23))) && qt7Var.a().equalsIgnoreCase(str)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 23:
                e261 e261Var3 = (e261) obj;
                b261.a(e261Var3);
                b261.A(e261Var3, str);
                return rih1Var;
            case 24:
                b261.n((e261) obj, str);
                return rih1Var;
            case 25:
                return ((o3m0) obj).a(zmo1.s(str));
            case 26:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), ((fzk0) obj).a, r6h1.c, System.currentTimeMillis());
            case 27:
                return ((hzk0) obj).a(str);
            case 28:
                return ((hzk0) obj).a(str);
            default:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), ((jzk0) obj).a, r6h1.c, System.currentTimeMillis());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nb9(String str, byte b) {
        super(1);
        this.a = b;
        this.b = str;
    }
}
