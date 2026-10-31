package p;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import com.spotify.encoremobile.roundedcorner.RoundedConstraintLayout;
import io.reactivex.rxjava3.core.Flowable;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class z5o extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z5o(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke() {
        ArrayList arrayList;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((rjn) obj).c(new GetCredentialUnsupportedException("Your device doesn't support credential manager"));
                return rih1Var;
            case 1:
                return f4i1.f("{\"http_engine\":\"", ((h8o) ((wzn) obj).a).f ? "cronetH3" : "cronet", "\"}");
            case 2:
                return new glo((llo) obj, (byte) 3);
            case 3:
                return new glo((klo) obj, (byte) 4);
            case 4:
                return new upo((wy71) obj);
            case 5:
                return t5p1.j(((yc8) ((pto) obj).k.get()).a(), 3);
            case 6:
                return (i8h1) ((xxq) obj).a.get();
            case 7:
                return (ConnectivityManager) ((o1r) obj).a.getSystemService(ConnectivityManager.class);
            case 8:
                jmq jmqVar = (jmq) obj;
                return hu20.e((mr20) jmqVar.b, new b7c((lnm) null, jmqVar, (byte) 21));
            case 9:
                List<l4r> list = ((o3r) obj).a;
                ArrayList arrayList2 = new ArrayList();
                for (l4r l4rVar : list) {
                    o4r o4rVar = new o4r(l4rVar.a, l4rVar.b == 1);
                    k4r k4rVar = l4rVar.d;
                    if (k4rVar instanceof k4r) {
                        List list2 = k4rVar.d.a;
                        arrayList = new ArrayList(q7h.U(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new o4r(((opa0) it.next()).b, true));
                        }
                    } else {
                        if (!(k4rVar instanceof j4r)) {
                            eg.o();
                            return null;
                        }
                        arrayList = z6x.a;
                    }
                    r7h.W(o7h.N0(arrayList, Collections.singletonList(o4rVar)), arrayList2);
                }
                return arrayList2;
            case 10:
                return (File) obj;
            case 11:
                return new kpg0((na9) ((fb3) obj).c, r5r.h);
            case 12:
                s7r s7rVar = (s7r) obj;
                return new kpg0(s7rVar.e.a(s7rVar.f), new m4r(s7rVar, (byte) 4));
            case 13:
                return new kpg0((nu) obj, r5r.t);
            case 14:
                w7r w7rVar = (w7r) obj;
                luk lukVar = w7rVar.h;
                if (lukVar != null) {
                    return lukVar.e(new d26(w7rVar, (byte) 13));
                }
                return null;
            case 15:
                l8r l8rVar = (l8r) obj;
                feh1 feh1Var = l8rVar.b;
                if (feh1Var != null) {
                    return feh1Var.e(new d26(l8rVar, (byte) 14));
                }
                return null;
            case 16:
                ((scr) obj).c.setValue(Boolean.FALSE);
                return rih1Var;
            case 17:
                return flo1.l(((vdr) obj).d, guo1.B());
            case 18:
                fer ferVar = (fer) obj;
                return rqt0.u(new x010(rqt0.w(new wef(yoi1.g(ferVar.a.d()), (byte) 18), r5r.R0, rqt0.b), new ht20(new i0h(new pya(ferVar.b.c(), (byte) 1), (byte) 13), new sd0(2, null, (byte) 26)), new mnl(ferVar, (lnm) null, (byte) 8), (byte) 1));
            case 19:
                wj3 wj3Var = (wj3) obj;
                return ((Flowable) wj3Var.f).j((xh80) ((h72) wj3Var.d).i);
            case 20:
                ngr ngrVar = (ngr) obj;
                View view = (ConstraintLayout) ((d520) ngrVar.e).b;
                if (!(((nh7) ngrVar.d) instanceof mh7)) {
                    return view;
                }
                RoundedConstraintLayout roundedConstraintLayout = new RoundedConstraintLayout(view.getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                roundedConstraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                view.setMinHeight(ngrVar.b);
                roundedConstraintLayout.addView(view);
                roundedConstraintLayout.setCornerRadius(view.getContext().getResources().getDimension(2131166933));
                return roundedConstraintLayout;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                return (rd9) ((ynb0) ((wg9) obj).b).get();
            case 22:
                return (bk9) ((uir) obj).a.get();
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                ijr ijrVar = (ijr) obj;
                return ijrVar.c.a(ijrVar.a.getResources());
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                k9r k9rVar = (k9r) obj;
                ResolveInfo resolveInfo = (ResolveInfo) k9rVar.c;
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (u890.j(activityInfo != null ? activityInfo.packageName : null, "android")) {
                    return null;
                }
                return resolveInfo.loadLabel(((Activity) k9rVar.b).getPackageManager()).toString();
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                return flo1.l(((vkr) obj).d, guo1.B());
            case 26:
                ((x2e) obj).b();
                return rih1Var;
            case 27:
                return flo1.l(((clr) obj).g, guo1.B());
            case 28:
                return flo1.l(((glr) obj).b, guo1.B());
            default:
                c450 c450VarA = ((n0s) ((ilr) obj).b.get()).a();
                c450 c450Var = c450VarA instanceof c450 ? c450VarA : null;
                if (c450Var != null) {
                    return Long.valueOf(c450Var.a);
                }
                return null;
        }
    }
}
