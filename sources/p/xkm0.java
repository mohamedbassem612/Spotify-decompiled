package p;

import android.app.Activity;
import android.view.View;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.rx3.RxEventSources;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xkm0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xkm0(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj) {
        xg30 xg30VarA;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        boolean z = false;
        byte b2 = 1;
        e6w0 e6w0Var = null;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                cm0 cm0Var = (cm0) obj2;
                cas casVar = (a7m0) obj;
                casVar.b = RxEventSources.a(new ObservableSource[]{((Observable) cm0Var.c).filter(stf0.h1).take(1L).map(olj0.d1)});
                casVar.d = new wkm0(cm0Var, z ? 1 : 0);
                casVar.e = new wkm0(cm0Var, b2);
                casVar.a = new vkm0(cm0Var);
                casVar.a(xjm0.e, xjm0.f);
                return rih1Var;
            case 1:
                return Boolean.valueOf(((aom0) obj2).a.contains(((ftv) obj).a));
            case 2:
                Object tag = ((View) obj).getTag();
                e6w0Var = tag instanceof kbs ? (kbs) tag : null;
                if (e6w0Var != null) {
                    e6w0Var.f((bqm0) obj2);
                }
                return rih1Var;
            case 3:
                uum0 uum0Var = (uum0) ((vum0) obj2).d.get();
                ((i8h1) uum0Var.a.get()).m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), uum0Var.b.a, r6h1.c, System.currentTimeMillis()), (xj61) null);
                return rih1Var;
            case 4:
                ((qtr) obj).b(new jaz((hxm0) obj2, (lnm) null, (byte) 17));
                return rih1Var;
            case 5:
                ((kd31) obj).b(((ma5) obj2).a);
                return rih1Var;
            case 6:
                int[] iArr = (int[]) obj2;
                int iO0 = f46.o0(((Number) obj).intValue(), iArr) + 1;
                return Integer.valueOf((iO0 < 0 || iO0 >= iArr.length) ? iArr[0] : iArr[iO0]);
            case 7:
                e261 e261Var = (e261) obj;
                if (((lax) obj2) instanceof gax) {
                    b261.a(e261Var);
                }
                return rih1Var;
            case 8:
                int iIntValue = ((Number) obj).intValue();
                Object obj3 = ((xxm0) obj2).b.get(Integer.valueOf(iIntValue));
                Object objValueOf = obj3;
                if (obj3 == null) {
                    objValueOf = Integer.valueOf(iIntValue);
                }
                return (Integer) objValueOf;
            case 9:
                zg3 zg3Var = (zg3) obj2;
                Map map = ((cxc0) obj).f.q;
                boolean zJ = u890.j(map.get("entrypoint_status"), "GAME_COMPLETE");
                String str = (String) map.get("entrypoint_title");
                String str2 = str == null ? "" : str;
                String str3 = (String) map.get("entrypoint_cta_label");
                return new j3n0(str2, str3 == null ? "" : str3, (String) map.get("entrypoint_redirect_uri"), (String) zg3Var.c, zJ);
            case 10:
                return new m441(new l4f0((n3n0) obj2, (k3n0) obj, (lnm) null, (byte) 11));
            case 11:
                jd6 jd6Var = (jd6) obj2;
                return d3p1.H((d0r) jd6Var.b, jd6Var.c, (h4n0) obj);
            case 12:
                kd31 kd31Var = (kd31) obj;
                kd31Var.p(8.0f);
                kd31Var.w((cr31) obj2);
                kd31Var.f(true);
                kd31Var.u(kd31Var.T0.h() * 16.0f);
                return rih1Var;
            case 13:
                return new rxc0(((e9n0) obj2).a);
            case 14:
                z8n0 z8n0Var = ((a9n0) obj).a;
                y8n0 y8n0Var = z8n0Var instanceof y8n0 ? (y8n0) z8n0Var : null;
                return yoi1.h(new yv8(((ytp0) ((dxy) obj2).g).E(y8n0Var != null ? y8n0Var.b : null), (byte) 6), o6x.a);
            case 15:
                return new rxc0(((q9n0) obj2).b);
            case 16:
                ((kd31) obj).b(((lob1) obj2).g ? 0.4f : 1.0f);
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                n1k n1kVar = (n1k) obj2;
                n1kVar.a.m((Object) null, Boolean.TRUE);
                return new xwm0(n1kVar, (byte) 1);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                y6h1 y6h1Var = ((o3m0) obj).a;
                return ((Boolean) ((fal1) ((h680) obj2).c).d.getValue()).booleanValue() ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("unmute_playback", 1, b7xVar), y6h1Var, r6h1.c, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("mute_playback", 1, b7xVar), y6h1Var, r6h1.c, System.currentTimeMillis());
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                ((Number) obj).intValue();
                y8l0 y8l0Var = (y8l0) obj2;
                y8l0Var.getClass();
                x6h1 x6h1VarC = y8l0Var.a.c();
                x6h1VarC.i.add(new a7h1("requests_list", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                r6h1 r6h1Var = r6h1.c;
                return new r6h1(kk0.l(y6h1VarA), (u8h1) null);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                mlv0 mlv0Var = (mlv0) obj;
                hmn0 hmn0Var = (hmn0) obj2;
                ReentrantLock reentrantLock = hmn0Var.b;
                reentrantLock.lock();
                try {
                    hmn0Var.a = mlv0Var.b().a().mediaProcessorFactory();
                    return rih1Var;
                } finally {
                    reentrantLock.unlock();
                }
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                b261.n((e261) obj, ((xqn0) obj2).a);
                return rih1Var;
            case 22:
                qtr qtrVar = (qtr) obj;
                qtrVar.d(htn0.b, b5n0.U0);
                qtrVar.b(new skv((itn0) obj2, (lnm) null, (byte) 28));
                return rih1Var;
            case 23:
                return ((o3m0) obj).a(zmo1.s(((xtn0) obj2).b));
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                Function0 function0 = (Function0) obj;
                xun0 xun0VarH = ((zwn0) obj2).a.h();
                if (xun0VarH != null && (xg30VarA = xun0VarH.a()) != null) {
                    e6w0Var = xg30VarA.d;
                }
                if (e6w0Var instanceof d6w0) {
                    function0.invoke();
                }
                return rih1Var;
            case 25:
                ((du9) ((eyn0) obj2).o).f(((Number) obj).intValue() > 0);
                return rih1Var;
            case 26:
                rwq0.z((qtr) obj, new pah0((res) obj2, (byte) 27));
                return rih1Var;
            case 27:
                ((o1o0) obj2).c.remove((Activity) obj);
                return rih1Var;
            case 28:
                return (n1o0) ((jly0) new wtp(((w2o0) obj2).a.a, (Activity) obj).b).get();
            default:
                rwq0.z((qtr) obj, new pah0((o3o0) obj2, (byte) 29));
                return rih1Var;
        }
    }
}
