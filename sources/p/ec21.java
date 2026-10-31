package p;

import com.spotify.scrollsita.v1.CreatorBio;
import com.spotify.scrollsita.v1.Heading;
import com.spotify.scrollsita.v1.ShowDescription;
import com.spotify.scrollsita.v1.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ec21 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ec21(String str, String str2, ci10 ci10Var) {
        super(1);
        this.a = (byte) 5;
        this.b = str;
        this.c = str2;
    }

    public final Object invoke(Object obj) throws Exception {
        int i;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.c;
        String str2 = this.b;
        switch (b) {
            case 0:
                dol0 dol0Var = (dol0) obj;
                z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
                if (str2 == null) {
                    str2 = "";
                }
                mmr0 mmr0Var = new mmr0("playlist", str2);
                if (str == null) {
                    str = "";
                }
                return new w7h1("", "", z7h1Var, new x7h1("remove_user_from_playlist", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0("user_to_be_removed", str)})), dol0Var.a, r6h1.c, System.currentTimeMillis());
            case 1:
                fyn fynVarP = CreatorBio.p();
                fynVarP.n(str2);
                fynVarP.q(str);
                ((bf51) obj).s((CreatorBio) fynVarP.build());
                return rih1Var;
            case 2:
                fyn fynVarP2 = CreatorBio.p();
                fynVarP2.n(str2);
                fynVarP2.q(str);
                ((bf51) obj).s((CreatorBio) fynVarP2.build());
                return rih1Var;
            case 3:
                z381 z381VarP = ShowDescription.p();
                z381VarP.n(str2);
                a aVarQ = Heading.q();
                aVarQ.n(str);
                z381VarP.q((Heading) aVarQ.build());
                ((bf51) obj).C(z381VarP);
                return rih1Var;
            case 4:
                b261.n((e261) obj, str2 + ", " + str);
                return rih1Var;
            case 5:
                wsc0 wsc0Var = (wsc0) obj;
                kby kbyVar = wsc0Var.f;
                boolean zJ = u890.j(kbyVar.q.get("enhanced_context"), "true");
                boolean zR = eqr0.r(wsc0Var, new dlc0[]{dlc0.d});
                boolean z = kbyVar.j;
                int iOrdinal = kbyVar.n.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    i = 4;
                } else {
                    if (iOrdinal != 2 && iOrdinal != 3) {
                        eg.o();
                        return null;
                    }
                    i = 5;
                }
                return new i5w0(new yrc0(this.b, this.c, zJ, i, zR, z));
            case 6:
                b261.C((e261) obj, new af5(nhc1.W(str2, "\u0000", str)));
                return rih1Var;
            case 7:
                e261 e261Var = (e261) obj;
                b261.x(e261Var, 0);
                b261.n(e261Var, str2);
                b261.A(e261Var, str);
                return rih1Var;
            case 8:
                e261 e261Var2 = (e261) obj;
                if (!ihc1.y0(str2)) {
                    str = str2;
                }
                b261.n(e261Var2, str);
                b261.x(e261Var2, 0);
                return rih1Var;
            case 9:
                e261 e261Var3 = (e261) obj;
                if (!ihc1.y0(str2)) {
                    str = str2;
                }
                b261.n(e261Var3, str);
                return rih1Var;
            case 10:
                d441 d441VarG1 = ((y341) obj).g1("\n        SELECT * FROM WiredHeadphoneFilterStateEntity\n        WHERE headphoneIdentifier = ? AND owner = ?\n    ");
                try {
                    d441VarG1.K(1, str2);
                    d441VarG1.K(2, str);
                    int iW = y7y0.w(d441VarG1, "headphoneIdentifier");
                    int iW2 = y7y0.w(d441VarG1, "owner");
                    int iW3 = y7y0.w(d441VarG1, "externalizationEnabledId");
                    int iW4 = y7y0.w(d441VarG1, "externalizationDisabledId");
                    int iW5 = y7y0.w(d441VarG1, "externalizationEnabled");
                    int iW6 = y7y0.w(d441VarG1, "specificEnabledId");
                    int iW7 = y7y0.w(d441VarG1, "specificDisabledId");
                    int iW8 = y7y0.w(d441VarG1, "specificEnabled");
                    int iW9 = y7y0.w(d441VarG1, "filterName");
                    ArrayList arrayList = new ArrayList();
                    while (d441VarG1.f1()) {
                        arrayList.add(new tul1(d441VarG1.P0(iW), d441VarG1.P0(iW2), d441VarG1.P0(iW3), d441VarG1.P0(iW4), d441VarG1.isNull(iW6) ? null : d441VarG1.P0(iW6), d441VarG1.P0(iW7), d441VarG1.isNull(iW9) ? null : d441VarG1.P0(iW9), ((int) d441VarG1.getLong(iW5)) != 0, ((int) d441VarG1.getLong(iW8)) != 0));
                        break;
                    }
                    return arrayList;
                } finally {
                    d441VarG1.close();
                }
            default:
                d441 d441VarG2 = ((y341) obj).g1("\n        DELETE FROM WiredHeadphoneFilterStateEntity\n        WHERE headphoneIdentifier = ? AND owner = ?\n    ");
                try {
                    d441VarG2.K(1, str2);
                    d441VarG2.K(2, str);
                    d441VarG2.f1();
                    return rih1Var;
                } finally {
                    d441VarG2.close();
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ec21(String str, String str2, byte b) {
        super(1);
        this.a = b;
        this.b = str;
        this.c = str2;
    }
}
