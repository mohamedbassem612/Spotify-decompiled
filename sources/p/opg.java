package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class opg extends hab0 implements Function0 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ opg(Object obj, byte b) {
        super(0);
        this.a = b;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new kpg0(new hz5((byte) 4), tzf.d1);
            case 1:
                return new p9k();
            case 2:
                return new p9k();
            case 3:
                return new p9k();
            case 4:
                return new huz(kbr.a, (byte) 10);
            case 5:
                return rih1.a;
            case 6:
                r6h1 r6h1Var = r6h1.c;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-your-library-page-header";
                x6h1VarI.f = "2.2.0";
                x6h1VarI.g = "22.0.0";
                x6h1 x6h1VarC = x6h1VarI.a().c();
                x6h1VarC.i.add(new a7h1("profile_button", (String) null, (Integer) null, "spotify:activitycenter", (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                ArrayList arrayList = new ArrayList();
                return c13.m(arrayList, z6x.a, y6h1VarA, arrayList, (u8h1) null);
            case 7:
                return "spotify:activitycenter";
            case 8:
                return Long.valueOf(jfv.u(nbc.e(), ngv.c));
            case 9:
                return true;
            case 10:
                return rih1.a;
            case 11:
                return rih1.a;
            case 12:
                int i = fp70.a;
                return new m3x();
            case 13:
                return v8r.q((Object) null);
            case 14:
                w7x w7xVar = w7x.a;
                ArrayList arrayList2 = new ArrayList(q7h.U(w7xVar, 10));
                Iterator it = w7xVar.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((sc11) it.next()).name());
                }
                return v8r.q(arrayList2);
            case 15:
                return null;
            case 16:
                return rih1.a;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new xtb0(0, 0);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return op71.f();
            default:
                bpb1 bpb1Var = vf40.b;
                Boolean bool = Boolean.FALSE;
                bpb1Var.getClass();
                bpb1Var.m((Object) null, bool);
                vf40.c = null;
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ opg(int i, byte b) {
        super(i);
        this.a = b;
    }
}
