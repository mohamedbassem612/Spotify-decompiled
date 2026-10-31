package p;

import android.animation.AnimatorSet;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import j$.time.Instant;
import j$.time.ZonedDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m4r extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m4r(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj) throws Exception {
        s20 s20Var;
        byte b = this.a;
        byte b2 = 7;
        boolean z = true;
        byte b3 = 0;
        lnm string = null;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                List list = (List) obj;
                int size = list.size();
                n4r n4rVar = (n4r) obj2;
                int i = n4rVar.c;
                if (size == i) {
                    return n4rVar.d.invoke(list);
                }
                final String strJ = l1d.j(list.size(), i, "Mismatching number of values between the table values response array (", " items) and the DataStatement parameter pack (", " items)");
                throw new Exception(strJ) { // from class: com.spotify.kodiak.dataloader.statement.DataStatement$DataStatementError
                    public final String a;

                    {
                        super(strJ);
                        this.a = strJ;
                    }

                    @Override // java.lang.Throwable
                    public final String getMessage() {
                        return this.a;
                    }
                };
            case 1:
                aq21 aq21Var = (aq21) obj2;
                if (aq21Var instanceof zp21) {
                    s20Var = new s20(aq21Var, (byte) 12);
                } else {
                    if (!(aq21Var instanceof yp21)) {
                        eg.o();
                        return null;
                    }
                    s20Var = a9o.f;
                }
                return (Boolean) s20Var.invoke(Collections.singletonMap(aq21Var.getKey(), new goj0(obj)));
            case 2:
                return new k6r((DatePickerDialog) obj2, (byte) 0);
            case 3:
                b261.n((e261) obj, ((pe30) obj2).d);
                return rih1Var;
            case 4:
                s7r s7rVar = (s7r) obj2;
                me30 me30Var = s7rVar.b;
                kby kbyVar = ((cxc0) obj).f;
                z = me30Var.a(kbyVar.p) == le30.Z;
                Map map = kbyVar.q;
                String str = z ? (String) map.get("created") : (String) map.get("expires");
                cb8 cb8Var = new cb8(z, s7rVar, (byte) 4);
                try {
                    ZonedDateTime zonedDateTimeOfInstant = ZonedDateTime.ofInstant(Instant.parse(str), s7rVar.d);
                    zonedDateTimeOfInstant.getClass();
                    string = (String) cb8Var.invoke(zonedDateTimeOfInstant);
                } catch (Exception unused) {
                }
                lnm lnmVar = kbyVar.c;
                if (lnmVar == null) {
                    lnmVar = "";
                }
                if (string != null && !ihc1.y0(lnmVar)) {
                    string = s7rVar.a.getResources().getString(2131956541, string, lnmVar);
                    string.getClass();
                } else if (string == null) {
                    string = lnmVar;
                }
                return new iq00(string);
            case 5:
                return new rxc0(((v7r) obj2).a);
            case 6:
                g9r g9rVar = (g9r) obj2;
                fn31.T((llm) g9rVar.b, (o8n) null, 0, new clo(g9rVar, (i9r) obj, (lnm) null, (byte) 8), 3);
                return rih1Var;
            case 7:
                kd31 kd31Var = (kd31) obj;
                kd31Var.A(sgc1.u(1.0f, 1.0f));
                kd31Var.p(3.0f);
                kd31Var.C(kd31Var.T0.h() * ((bfs0) obj2).a);
                kd31Var.f(false);
                return rih1Var;
            case 8:
                return new odr((ViewGroup) obj, ((rcr) obj2).d);
            case 9:
                qv00 qv00Var = (qv00) obj;
                String str2 = (String) ((oi) obj2).d;
                qv00Var.a(str2, zc8.class, false);
                qv00Var.a(str2, jo70.class, false);
                qv00Var.a(str2, l98.class, false);
                qv00Var.a(str2, f7l1.class, false);
                qv00Var.a(str2, pnt.class, false);
                return rih1Var;
            case 10:
                ((qtr) obj).b(new gz0((kp5) obj2, string, b2));
                return rih1Var;
            case 11:
                k9r k9rVar = (k9r) obj2;
                k9rVar.n();
                ((Context) k9rVar.c).startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://support.spotify.com/article/spotify-on-tv/")).addFlags(268435456));
                return rih1Var;
            case 12:
                ((AnimatorSet) obj2).cancel();
                return rih1Var;
            case 13:
                u3l u3lVar = (u3l) obj;
                hor horVar = (hor) ((for) obj2).a.get();
                return new qer(new qer(vby0.r(horVar.b, horVar.c, u3lVar.c), horVar, (byte) 7), u3lVar, (byte) 6);
            case 14:
                if (!(((ksv0) obj) instanceof ksv0)) {
                    eg.o();
                    return null;
                }
                mqr mqrVar = ((nqr) obj2).e;
                if (mqrVar != null) {
                    mqrVar.a.invoke(dan.a);
                }
                return rih1Var;
            case 15:
                ((err) obj2).Z.invoke(myn.a);
                return rih1Var;
            case 16:
                atr atrVar = (atr) obj2;
                m980 m980Var = atrVar.b;
                ConstraintLayout constraintLayout = (ConstraintLayout) atrVar.c.f;
                Object systemService = constraintLayout.getContext().getSystemService("accessibility");
                AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
                if (((accessibilityManager == null || !accessibilityManager.isEnabled()) ? false : !accessibilityManager.getEnabledAccessibilityServiceList(1).isEmpty()) && !constraintLayout.isAccessibilityFocused() && m980Var.b) {
                    constraintLayout.performAccessibilityAction(64, null);
                }
                m980Var.b = false;
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                fzu fzuVar = (fzu) obj;
                long j = fzuVar.b;
                return new gzu((jfx0) ((tm) obj2).j(j).getValue(), fzuVar.a != null, j);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return ((zwr) obj2).b;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                g920 g920Var = (g920) obj;
                iu30 iu30Var = ((yyr) obj2).b;
                if (iu30Var != null) {
                    iu30Var.invoke(g920Var);
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ((qtr) obj).b(new wm0((azr) obj2, (lnm) null, (byte) 2));
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                if (czr.a[((yd10) obj).ordinal()] == 1) {
                    ((iu30) ((odr) obj2).b).invoke(qg20.c);
                }
                return rih1Var;
            case 22:
                ((qtr) obj).b(new f3((nl9) obj2, (lnm) null, (byte) 10));
                return rih1Var;
            case 23:
                int iOrdinal = ((s0a1) obj).ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    ((q1s) obj2).invoke();
                    return rih1Var;
                }
                eg.o();
                return null;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new ihy(((Number) obj).intValue(), (as3) obj2);
            case 25:
                tjq tjqVar = (tjq) obj2;
                afu afuVar = (afu) tjqVar.a;
                int iOrdinal2 = ((zpd0) obj).ordinal();
                if (iOrdinal2 == 0) {
                    ((hgv0) tjqVar.d).a();
                    afuVar.dismiss();
                } else {
                    if (iOrdinal2 != 1) {
                        eg.o();
                        return null;
                    }
                    afuVar.dismiss();
                }
                return rih1Var;
            case 26:
                cas casVar = (a7m0) obj;
                casVar.a = szr.e;
                r8s r8sVar = (r8s) obj2;
                casVar.e = new o8s(r8sVar, b3);
                casVar.d = new o8s(r8sVar, z ? (byte) 1 : (byte) 0);
                return rih1Var;
            case 27:
                g9s g9sVar = (g9s) obj2;
                cas casVar2 = (a7m0) obj;
                casVar2.a = new sqk(g9sVar, (byte) 25);
                casVar2.e = new b9s(g9sVar, (byte) 0);
                casVar2.d = new b9s(g9sVar, (byte) 1);
                return rih1Var;
            case 28:
                uhj0 uhj0Var = (uhj0) obj;
                Bundle bundle = new Bundle();
                m4r m4rVar = ((l9s) obj2).e;
                bundle.putParcelable("webviewElementState", uhj0.a(uhj0Var, (MessageResponseToken) null, (iwq) null, (String) null, false, false, (yhj0) null, false, (shj0) null, m4rVar != null ? (Bundle) m4rVar.invoke(uhj0Var) : null, 255));
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                ((j9s) obj2).b().b.saveState(bundle2);
                return bundle2;
        }
    }
}
