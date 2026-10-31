package p;

import android.os.Build;
import com.ravelin.core.model.MobileError;
import com.ravelin.core.model.MobileReportRequest;
import com.ravelin.core.model.Permissions;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class el70 implements Function0 {
    public final /* synthetic */ byte a;

    public /* synthetic */ el70(byte b) {
        this.a = b;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = 0;
        switch (b) {
            case 0:
                vu40.j.getClass();
                return new p3v(40.0f);
            case 1:
                fns fnsVar = igu.a;
                return pyf0.a.f;
            case 2:
                return (mf01) ypi1.a.getValue();
            case 3:
            case 4:
                return rih1Var;
            case 5:
                dha0 dha0Var = dha0.a;
                return dha0.b;
            case 6:
                sga0 sga0Var = sga0.a;
                return sga0.b;
            case 7:
                oga0 oga0Var = oga0.a;
                return oga0.b;
            case 8:
                xga0 xga0Var = xga0.a;
                return xga0.b;
            case 9:
                sfa0 sfa0Var = sfa0.a;
                return sfa0.b;
            case 10:
                return new upb0(0, 0);
            case 11:
                return new fvb0(new int[]{0}, new int[]{0});
            case 12:
                return ri7.a;
            case 13:
                return new hmb0(2);
            case 14:
                MobileReportRequest.CoM4 coM4 = MobileReportRequest.Companion;
                return new r36(MobileError.cOm9.lpt2, (byte) 0);
            case 15:
                return UUID.randomUUID();
            case 16:
                llm llmVarE = smo1.e(o6x.a);
                smo1.p(llmVarE, (CancellationException) null);
                return llmVarE;
            case 17:
                return nkr.a;
            case 18:
                fns fnsVar2 = igu.a;
                return b3s.c;
            case 19:
                return new lxc(new azp0());
            case 20:
                return t3k1.g();
            case 21:
                Permissions.CoM4 coM5 = Permissions.Companion;
                return new r36(chc1.a, (byte) 0);
            case 22:
                Permissions.CoM4 coM6 = Permissions.Companion;
                return new r36(chc1.a, (byte) 0);
            case 23:
                fns fnsVar3 = igu.a;
                return b3s.c;
            case 24:
                return null;
            case 25:
                List listA1 = o7h.a1((List) s961.a.getValue(), new zbg((byte) 5));
                ArrayList arrayList = new ArrayList();
                int size = listA1.size();
                while (i < size) {
                    arrayList.add(new mmr0(new o7o0(new el70((byte) 19)), rc11.a.b(j2i1.class)));
                    i++;
                }
                return arrayList;
            case 26:
                List listA2 = o7h.a1((List) s961.b.getValue(), new ktg0((byte) 23));
                ArrayList arrayList2 = new ArrayList();
                int size2 = listA2.size();
                while (i < size2) {
                    ((xr40) listA2.get(i)).getClass();
                    arrayList2.add(Build.VERSION.SDK_INT >= 28 ? new mb5() : new vr40());
                    i++;
                }
                return arrayList2;
            case 27:
                return null;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return new wh31();
            default:
                return new ld41(new LinkedHashMap());
        }
    }
}
