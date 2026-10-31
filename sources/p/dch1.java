package p;

import android.os.Bundle;
import android.os.Process;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dch1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dch1(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke() {
        byte b = 1;
        switch (this.a) {
            case 0:
                ech1 ech1Var = (ech1) this.b;
                return new kpg0(ech1Var.c, new cch1(ech1Var, b));
            case 1:
                return new kpg0((rwj) ((x1b) this.b).g, hzg1.X);
            case 2:
                return ((en10) ((dlg1) this.b).b).b(p7h.M(new m9d0[]{zbh1.d, zbh1.c, zbh1.b}));
            case 3:
                Process.setThreadPriority(1);
                ((Runnable) this.b).run();
                return rih1.a;
            case 4:
                ydh1 ydh1Var = (ydh1) this.b;
                Set set = ydh1Var.c;
                i94 i94Var = ydh1Var.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj : set) {
                    if (obj instanceof wdh1) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (((wdh1) obj2).c) {
                        arrayList2.add(obj2);
                    }
                }
                i94 i94Var2 = i94Var;
                i94Var2.e("session_ui_plugins_init");
                ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add((iyf0) ((wdh1) it.next()).b.get());
                }
                Set setP1 = o7h.p1(arrayList3);
                i94Var2.a("session_ui_plugins_init");
                return setP1;
            case 5:
                ((ceh1) ((km0) this.b).c).a();
                return rih1.a;
            case 6:
                xgh1 xgh1Var = (xgh1) this.b;
                i8h1 i8h1Var = (i8h1) xgh1Var.f.get();
                x6h1 x6h1VarC = xgh1Var.g.b.c();
                x6h1VarC.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                b7x b7xVar = b7x.a;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                xgh1Var.e.e();
                return rih1.a;
            case 7:
                return (qzh) ((gjh1) this.b).a.get();
            case 8:
                avh1 avh1Var = (avh1) this.b;
                Map map = avh1Var.h;
                bm41 bm41Var = avh1Var.c.b;
                Object obj3 = map.get(bm41Var);
                if (obj3 != null) {
                    return (dvh1) obj3;
                }
                bhn0.s(bm41Var, "No UpdateSchedulePageConfig registered for key ");
                return null;
            case 9:
                return (maa) ((hsq) ((bn1) this.b).f).get();
            case 10:
                ((z3i1) this.b).b.setValue(Boolean.FALSE);
                return rih1.a;
            case 11:
                u8i1 u8i1Var = (u8i1) this.b;
                n9i1 n9i1Var = u8i1Var.f;
                i8h1 i8h1Var2 = n9i1Var.a;
                x6h1 x6h1VarC2 = n9i1Var.b.b.c();
                x6h1VarC2.i.add(new a7h1("get_started_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", yon1.i2().a)), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null);
                dwn0 dwn0Var = new dwn0(nik1.J5.a, "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null);
                u8i1Var.g = false;
                try {
                    u8i1Var.b.i(dwn0Var, mno1.h(new mmr0[]{new mmr0("screenshotFilePath", u8i1Var.d.a), new mmr0("feedbackReportMode", "ExternalFeedback")}));
                    return rih1.a;
                } catch (Throwable th) {
                    u8i1Var.g = true;
                    throw th;
                }
            case 12:
                edi1 edi1Var = ((bdi1) this.b).d;
                edi1Var.a().m(((b7l0) edi1Var.d.getValue()).e(), (xj61) null);
                return rih1.a;
            case 13:
                bte1 bte1Var = ((kii1) this.b).G1;
                if (bte1Var != null) {
                    return bte1Var;
                }
                u890.C("timelineViewModelFactory");
                throw null;
            case 14:
                return (ymi1) ((fni1) this.b).d.get();
            case 15:
                return (ymi1) ((nni1) this.b).c.get();
            case 16:
                o6j1 o6j1Var = (o6j1) this.b;
                String str = o6j1Var.h;
                String str2 = o6j1Var.n;
                String str3 = o6j1Var.c;
                String str4 = o6j1Var.o;
                return new tgm((String) null, true, false, false, true, false, false, new yh10(str, null, str2, new ugo0(false, str3, str4 == null ? str3 : str4, true, false, null, null, 461), 16), true, false, 0, false, false, false, false, false, (iu30) null, false, false, (g371) null, (c821) null, false, (String) null, (iu30) null, (p860) null, (mgo0) null, false, false, -803, 1);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return (hwt) ((zob1) ((idd1) ((wai0) this.b).g).getValue()).getValue();
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return (x191) ((g2z) this.b).c;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                if (!((ejj1) this.b).i) {
                    ((ejj1) this.b).i = true;
                    ((ejj1) this.b).d().f();
                }
                return rih1.a;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                hmj1 hmj1Var = (hmj1) ((oas) this.b).b.get();
                if (hmj1Var.c) {
                    Object obj4 = hmj1Var.a.get();
                    obj4.getClass();
                    return (m4p0) obj4;
                }
                Object obj5 = hmj1Var.b.get();
                obj5.getClass();
                return (m4p0) obj5;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return (i8h1) ((r0y) this.b).b.get();
            case 22:
                ((ioj1) this.b).c.onNext(Boolean.TRUE);
                return rih1.a;
            case 23:
                cqj1 cqj1Var = (cqj1) this.b;
                nuq nuqVar = cqj1Var.b;
                h5a1 h5a1Var = cqj1Var.d;
                jnq jnqVar = (jnq) nuqVar.a.c;
                yk90 yk90Var = ((fl90) jnqVar.c).f;
                luk lukVar = (luk) ((i3q) jnqVar.d).a.L1.get();
                c8o.l(lukVar);
                return new wqw(new xzq(new c0a(yk90Var, new ltf1(new uq8(new jq4(lukVar), (byte) 2), (byte) 13), h5a1Var), new yvf1(cqj1Var, (byte) 10)));
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                gsj1 gsj1Var = (gsj1) this.b;
                gn10 gn10Var = boo1.a;
                return gsj1Var.i.l() ? new yuj1(gsj1Var.j, gsj1Var.k, gsj1Var.l, gsj1Var.h.h(), gn10Var, (i8h1) gsj1Var.m.get(), (v1r0) null, gsj1Var.d) : new bsj1(gsj1Var.e, gsj1Var.f, gsj1Var.g, gn10Var);
            case 25:
                lwj1 lwj1Var = (lwj1) this.b;
                ((i8h1) lwj1Var.g.get()).m(lwj1Var.h.e(), (xj61) null);
                lwj1Var.d.l();
                return rih1.a;
            case 26:
                c1k1 c1k1Var = (c1k1) this.b;
                los losVar = c1k1Var.b;
                losVar.c(new z0k1(c1k1Var, (byte) 2));
                losVar.a(ixb.c);
                return rih1.a;
            case 27:
                ((b1k1) this.b).b.e();
                return rih1.a;
            case 28:
                MessageResponseToken messageResponseToken = ((blc) this.b).b;
                return yhm0.o(messageResponseToken.getMessageRequest(), messageResponseToken.getRequestId());
            default:
                return Pattern.compile(((kik1) this.b).a);
        }
    }
}
