package p;

import android.app.DatePickerDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.net.Uri;
import android.view.Window;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class shq0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ shq0(byte b, Object obj, iu30 iu30Var) {
        super(0);
        this.a = b;
        this.c = iu30Var;
        this.b = obj;
    }

    public final Object invoke() {
        BroadcastReceiver.PendingResult pendingResult;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                String str = ((rhq0) obj2).c;
                if (str == null) {
                    return null;
                }
                ((iu30) obj).invoke(new nhq0(str));
                return rih1Var;
            case 1:
                Context context = (Context) obj2;
                context.getClass();
                kek0 kek0Var = new kek0((Function0) obj, (byte) 25);
                mw40 mw40VarT = yoi1.T(context, context.getString(2131959141), context.getString(2131959138));
                String string = context.getString(2131959140);
                oad oadVar = new oad(kek0Var, (byte) 20);
                mw40VarT.a = string;
                mw40VarT.c = oadVar;
                mw40VarT.b = context.getString(2131959139);
                mw40VarT.d = null;
                mw40VarT.e = true;
                mw40VarT.b().b();
                return rih1Var;
            case 2:
                lz20.b((lz20) obj2);
                b6t b6tVar = (k6a1) obj;
                if (b6tVar != null) {
                    b6tVar.b();
                }
                return rih1Var;
            case 3:
                ((Window) obj2).setCallback((Window.Callback) obj);
                return rih1Var;
            case 4:
                w0r0 w0r0Var = (w0r0) obj2;
                if (w0r0Var.c.u.isEmpty()) {
                    th30 th30Var = (th30) obj;
                    yun0 yun0Var = w0r0Var.d;
                    if (w0r0Var.g.U() || (yun0Var.i().isEmpty() && yun0Var.h() == null)) {
                        w0r0Var.a.finish();
                    } else {
                        th30Var.getClass();
                        th30Var.y(new qh30(th30Var, (String) null, -1, 0), false);
                    }
                }
                return rih1Var;
            case 5:
                ((iu30) obj).invoke(new bym0((qxm0) obj2));
                return rih1Var;
            case 6:
                gar0 gar0Var = (gar0) obj2;
                if (u890.j(gar0Var.a.getValue(), (s4j0) obj)) {
                    gar0Var.a.l((Object) null);
                }
                return rih1Var;
            case 7:
                xar0 xar0Var = (xar0) obj2;
                if (u890.j(xar0Var.a, (bbr0) obj)) {
                    xar0Var.a = null;
                    izm0 izm0Var = xar0Var.b;
                    if (izm0Var != null) {
                        ((kdn0) izm0Var.b).m((Object) null);
                    }
                    Runnable an90Var = new an90(xar0Var, (byte) 18);
                    xar0Var.d = an90Var;
                    xar0Var.c.postDelayed(an90Var, 16L);
                }
                return rih1Var;
            case 8:
                float fS = ((es41) obj2).a.s();
                tr80 tr80Var = (tr80) obj;
                int i = ((rr80) tr80Var).a;
                return Float.valueOf(yoi1.o((fS - i) / (((rr80) tr80Var).b - i), 0.0f, 1.0f));
            case 9:
                return ((khr0) obj2).g.a((wao0) obj);
            case 10:
                ((ohr0) obj2).b(new bos0((Map) obj));
                return rih1Var;
            case 11:
                ((ohr0) obj2).b((xh0) obj);
                return rih1Var;
            case 12:
                ((Function0) obj2).invoke();
                ((DatePickerDialog) obj).show();
                return rih1Var;
            case 13:
                poj0 poj0Var = (poj0) obj2;
                i8h1 i8h1Var = (i8h1) ((idd1) poj0Var.d).getValue();
                x6h1 x6h1VarC = ((h7l0) poj0Var.c).b.c();
                x6h1VarC.i.add(new a7h1("remove_parent_or_guardian_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:internal:parental-control:remove-parent")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                ((Function0) obj).invoke();
                return rih1Var;
            case 14:
                qur0 qur0Var = (qur0) obj2;
                myq0 myq0Var = qur0Var.d;
                String str2 = qur0Var.b.a;
                skc0 skc0Var = (skc0) myq0Var.b;
                String strA = skc0.a("https://www.spotify.com/account/in-app-parental-consent", str2, "dependent-initiated-linking");
                rzo0 rzo0Var = (rzo0) myq0Var.c;
                i8h1 i8h1Var2 = (i8h1) ((idd1) rzo0Var.d).getValue();
                txk0 txk0Var = (txk0) rzo0Var.c;
                txk0Var.getClass();
                x6h1 x6h1VarC2 = txk0Var.b.c();
                x6h1VarC2.i.add(new a7h1("log_into_this_device_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                tv80 tv80VarM = i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strA)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                g8h1 g8h1Var = skc0Var.a;
                Uri uri = Uri.parse(skc0.a("https://www.spotify.com/account/in-app-parental-consent", str2, "dependent-initiated-linking"));
                g8h1Var.getClass();
                ulc.r((Context) obj, g8h1Var.b(uri, new bwn0(tv80VarM)).toString(), tv80VarM);
                return rih1Var;
            case 15:
                iu30 iu30Var = (iu30) obj;
                c2s0 c2s0Var = (c2s0) obj2;
                if (!c2s0Var.e) {
                    iu30Var.invoke(y1s0.a);
                } else if (c2s0Var.f instanceof j2s0) {
                    iu30Var.invoke(w1s0.a);
                }
                return rih1Var;
            case 16:
                ((iu30) obj).invoke(new ics0(((xbs0) obj2).a));
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                ((ven0) obj2).setValue(((xbs0) obj).e);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                if (((AtomicBoolean) obj2).compareAndSet(false, true) && (pendingResult = (BroadcastReceiver.PendingResult) obj) != null) {
                    pendingResult.finish();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                ((iu30) obj).invoke(his0.a);
                ((bpb1) ((pt) obj2).c).m((Object) null, Boolean.FALSE);
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ((iu30) obj).invoke(new tvs0((txs0) obj2));
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ((iu30) obj).invoke(new aws0((gxs0) obj2));
                return rih1Var;
            case 22:
                ((iu30) obj).invoke(rih1Var);
                ((Function0) ((smp0) obj2).d).invoke();
                return rih1Var;
            case 23:
                ((iu30) obj).invoke(rih1Var);
                ((Function0) ((kls0) obj2).c).invoke();
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ((iu30) obj).invoke((a3t0) obj2);
                return rih1Var;
            case 25:
                if (((j3t0) obj2).c) {
                    ((iu30) obj).invoke(h3t0.a);
                }
                return rih1Var;
            case 26:
                eit0 eit0Var = (eit0) obj2;
                if (eit0Var != null) {
                    ((iu30) obj).invoke(eit0Var);
                }
                return rih1Var;
            case 27:
                return new kpg0(((wxp) obj2).a(), new fgs0((rb3) obj, (byte) 18));
            case 28:
                ((iu30) obj).invoke(((mpt0) obj2).g ? bpt0.b : bpt0.a);
                return rih1Var;
            default:
                ((ttm0) ((mqt0) obj2).c.get()).b((zau0) obj);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ shq0(Object obj, Object obj2, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
