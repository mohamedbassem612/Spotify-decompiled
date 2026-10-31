package p;

import com.spotify.scrollsita.v1.ConcertCampaign;
import com.spotify.scrollsita.v1.Section;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hqa1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hqa1(String str, byte b) {
        super(1);
        this.a = b;
        this.b = str;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        t2b t2bVar = lgo1.b;
        rih1 rih1Var = rih1.a;
        String str = this.b;
        switch (b) {
            case 0:
                ((qv00) obj).a(str, ro7.class, false);
                return rih1Var;
            case 1:
                b261.n((e261) obj, str);
                return rih1Var;
            case 2:
                e261 e261Var = (e261) obj;
                b261.n(e261Var, str);
                b261.x(e261Var, 0);
                return rih1Var;
            case 3:
                String str2 = (String) obj;
                str2.getClass();
                int iW0 = ihc1.w0(str, str2, 0, false, 6);
                while (iW0 >= 0) {
                    int length = str2.length() + iW0;
                    boolean z = iW0 > 0 && Character.isDigit(str.charAt(iW0 + (-1)));
                    boolean z2 = length < str.length() && Character.isDigit(str.charAt(length));
                    if (!z && !z2) {
                        return yoi1.Q(iW0, length);
                    }
                    iW0 = ihc1.w0(str, str2, iW0 + 1, false, 4);
                }
                return null;
            case 4:
                qv00 qv00Var = (qv00) obj;
                qv00Var.a(str, jo70.class, false);
                qv00Var.a(str, xkk1.class, false);
                return rih1Var;
            case 5:
                e261 e261Var2 = (e261) obj;
                b261.x(e261Var2, 0);
                if (str != null) {
                    b261.n(e261Var2, str);
                }
                return rih1Var;
            case 6:
                Section section = (Section) obj;
                if (!section.S()) {
                    return null;
                }
                ConcertCampaign concertCampaignP = section.p();
                return new swo0(concertCampaignP.n(), Collections.singletonList(concertCampaignP.n()), str);
            case 7:
                ((qv00) obj).a(str, w281.class, true);
                return rih1Var;
            case 8:
                b261.n((e261) obj, str);
                return rih1Var;
            case 9:
                b261.u((e261) obj, str);
                return rih1Var;
            case 10:
                b261.n((e261) obj, str);
                return rih1Var;
            case 11:
                e261 e261Var3 = (e261) obj;
                b261.x(e261Var3, 0);
                if (str != null) {
                    b261.n(e261Var3, str);
                }
                return rih1Var;
            case 12:
                b261.n((e261) obj, str);
                return rih1Var;
            case 13:
                return new n8d1(str);
            case 14:
                return new uv11(((fld1) obj).c, this.b, (Integer) null, (String) null, (cqs0) null, (tv11) null, 0, 252);
            case 15:
                return (Map) ama.b.invoke(((fld1) obj).c, str);
            case 16:
                b261.n((e261) obj, str);
                return rih1Var;
            case 17:
                b261.n((e261) obj, str);
                return rih1Var;
            case 18:
                b261.n((e261) obj, str);
                return rih1Var;
            case 19:
                b261.n((e261) obj, str);
                return rih1Var;
            case 20:
                return ((o3m0) obj).a(str);
            case 21:
                ((n161) obj).b(t2bVar, str);
                return rih1Var;
            case 22:
                ((n161) obj).b(t2bVar, str);
                return rih1Var;
            case 23:
                b261.n((e261) obj, str);
                return rih1Var;
            case 24:
                e261 e261Var4 = (e261) obj;
                b261.n(e261Var4, str);
                b261.x(e261Var4, 0);
                return rih1Var;
            case 25:
                b261.n((e261) obj, str);
                return rih1Var;
            case 26:
                ((qv00) obj).a(str, mdz.class, false);
                return rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                b261.n((e261) obj, str);
                return rih1Var;
            case 28:
                ((qv00) obj).a(str, xkk1.class, false);
                return rih1Var;
            default:
                ((qv00) obj).a(str, lo7.class, false);
                return rih1Var;
        }
    }
}
