package p;

import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.spotify.base.java.logging.Logger;
import com.spotify.encoreconsumermobile.elements.thumb.ThumbButtonView;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.scrollsita.v1.Section;
import com.spotify.wrapped.v1.proto.StoryCard;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class x0e1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0e1(Object obj, Object obj2, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke() {
        m231 m231Var;
        boolean z = true;
        boolean z2 = false;
        switch (this.a) {
            case 0:
                ((iu30) this.b).invoke((chf0) this.c);
                return rih1.a;
            case 1:
                return new kpg0((xpw) ((x1e1) this.b).a.invoke((oud) this.c), vxd1.T0);
            case 2:
                ven0 ven0Var = (ven0) this.c;
                Set set = ((dde1) ven0Var.getValue()).a;
                int i = ((uce1) this.b).a;
                if (set.contains(Integer.valueOf(i))) {
                    return q061.a;
                }
                return ((dde1) ven0Var.getValue()).b.contains(Integer.valueOf(i)) ? q061.b : q061.c;
            case 3:
                q061 q061Var = (q061) this.b;
                q061 q061Var2 = q061.a;
                z0e1 z0e1Var = (z0e1) this.c;
                return new u7h(q061Var == q061Var2 ? z4p1.e(z0e1Var.b) : z4p1.e(z0e1Var.a));
            case 4:
                ((iu30) this.b).invoke(new rde1(((tde1) this.c).i));
                return rih1.a;
            case 5:
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                frr0 frr0Var = (frr0) this.b;
                if (frr0Var.s() < 0 || jElapsedRealtime - frr0Var.s() >= 1000) {
                    frr0Var.t(jElapsedRealtime);
                    ((Function0) ((ven0) this.c).getValue()).invoke();
                }
                return rih1.a;
            case 6:
                ThumbButtonView thumbButtonView = (ThumbButtonView) this.b;
                DecelerateInterpolator decelerateInterpolator = ihe1.b;
                fjc1 fjc1Var = (fjc1) this.c;
                ViewPropertyAnimator viewPropertyAnimatorAnimate = thumbButtonView.animate();
                viewPropertyAnimatorAnimate.rotationBy(25.0f);
                viewPropertyAnimatorAnimate.scaleXBy(-0.2f);
                viewPropertyAnimatorAnimate.scaleYBy(-0.2f);
                viewPropertyAnimatorAnimate.setInterpolator(decelerateInterpolator);
                viewPropertyAnimatorAnimate.setDuration(200L);
                viewPropertyAnimatorAnimate.withEndAction(new is3(fjc1Var, (byte) 12));
                return rih1.a;
            case 7:
                ((iu30) this.b).invoke(new eje1(((aa80) this.c).a));
                return rih1.a;
            case 8:
                if (((uue1) this.b).h) {
                    ((Function0) this.c).invoke();
                }
                return rih1.a;
            case 9:
                for (Map.Entry entry : ((Map) this.b).entrySet()) {
                    String str = (String) entry.getKey();
                    long jLongValue = ((Number) entry.getValue()).longValue();
                    CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((ConcurrentHashMap) ((vnd1) this.c).c).get(str);
                    if (copyOnWriteArrayList != null) {
                        copyOnWriteArrayList.removeIf(new z8y((byte) 1, jLongValue));
                    }
                }
                return rih1.a;
            case 10:
                return new a1b1(yoi1.g(((of60) this.b).a()), (pue1) this.c, (byte) 13);
            case 11:
                ((Function0) this.b).invoke();
                ((s1q0) this.c).J().d();
                return rih1.a;
            case 12:
                jp80 jp80Var = new jp80(new aya1((ven0) this.c, (byte) 7));
                h5f1 h5f1Var = (h5f1) this.b;
                eq80 eq80Var = new eq80(new e3h1(h5f1Var.j, (n7h1) null, h5f1Var.i));
                wch wchVar = q6x.b;
                if (!jp80Var.equals(wchVar) || !eq80Var.equals(wchVar)) {
                    if (jp80Var.equals(wchVar)) {
                        return eq80Var;
                    }
                    if (eq80Var.equals(wchVar)) {
                        return jp80Var;
                    }
                    wchVar = new wch(jp80Var, eq80Var);
                }
                return wchVar;
            case 13:
                ((iu30) this.b).invoke(((y8f1) this.c).b);
                return rih1.a;
            case 14:
                tnu0 tnu0Var = (tnu0) this.b;
                if (tnu0Var != null) {
                    ((ven0) this.c).setValue(tnu0Var);
                }
                return rih1.a;
            case 15:
                ((ven0) this.b).setValue((Object) null);
                ((jfe) this.c).l(new tj31("resumeAnimation"));
                return rih1.a;
            case 16:
                ucf1 ucf1Var = (ucf1) this.b;
                boolean z3 = ucf1Var.h;
                boolean zBooleanValue = ((Boolean) ucf1Var.b.getValue()).booleanValue();
                boolean z4 = ucf1Var.c;
                if (z3 && zBooleanValue && z4) {
                    sam1.a((qam1) this.c);
                }
                return rih1.a;
            case 17:
                m231 m231Var2 = rih1.a;
                gdf1 gdf1Var = (gdf1) this.b;
                if (!gdf1Var.m) {
                    try {
                        gdf1Var.c.c();
                        gdf1Var.c.e();
                        gdf1Var.l = false;
                        m231Var = m231Var2;
                    } catch (Throwable th) {
                        m231Var = new m231(th);
                    }
                    Throwable thA = e331.a(m231Var);
                    if (thA != null) {
                        Logger.e(thA, "TopSongJourneyVideoScene: video retry failed", new Object[0]);
                    }
                    boolean z5 = m231Var instanceof m231;
                    z2 = !z5;
                    gdf1Var.n = z5;
                }
                if (z2) {
                    ((hdn0) this.c).t(((hdn0) this.c).s() + 1);
                }
                return m231Var2;
            case 18:
                gdf1 gdf1Var2 = (gdf1) this.b;
                boolean z6 = gdf1Var2.i;
                boolean zBooleanValue2 = ((Boolean) gdf1Var2.e.getValue()).booleanValue();
                boolean z7 = gdf1Var2.f;
                if (z6 && zBooleanValue2 && z7) {
                    sam1.a((qam1) this.c);
                }
                return rih1.a;
            case 19:
                StoryCard storyCard = ((wgm1) ((tob1) this.b).getValue()).a;
                return Boolean.valueOf(u890.j(storyCard != null ? storyCard.getId() : null, ((gdf1) this.c).b));
            case 20:
                return Float.valueOf(((Boolean) ((ven0) this.c).getValue()).booleanValue() ? 1.0f : ((Number) ((tcf1) this.b).b.getValue()).floatValue());
            case 21:
                return ((tiv0) ((g0y0) this.b).e).a(((xk00) this.c).i);
            case 22:
                ((iu30) this.b).invoke(((htg0) this.c).c);
                return rih1.a;
            case 23:
                ((iu30) this.b).invoke(((rjf1) this.c).a);
                return rih1.a;
            case 24:
                return tvf1.a((btt0) this.c, (String) this.b);
            case 25:
                FrameLayout frameLayout = (FrameLayout) ((View) ((i34) this.b).e).findViewById(2131431188);
                tka0 tka0Var = dtw.C;
                dtw dtwVarD = mhc.d(frameLayout.getContext(), frameLayout, f6o1.A((ecd1) ((sma1) this.c).e, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), (drw) null, 24);
                k8p1.o(frameLayout, dtwVarD.w);
                return dtwVarD;
            case 26:
                ((iu30) this.b).invoke(new mkg1(((okg1) this.c).c));
                return rih1.a;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                apz0 apz0Var = (apz0) this.c;
                kby kbyVar = ((cxc0) this.b).f;
                String str2 = kbyVar.a;
                Map map = kbyVar.q;
                w6b1 w6b1VarA = f7b1.a(blc0.Ai);
                String str3 = w6b1VarA != null ? (String) o7h.s0(w6b1VarA.c) : null;
                if (str3 == null) {
                    str3 = "";
                }
                StringBuilder sb = new StringBuilder(f4i1.f(str3, "?listUri=", str2));
                String str4 = (String) map.get("user_location_tny_city_localized");
                if (str4 != null) {
                    sb.append("&currentCity=" + Uri.encode(str4));
                }
                String str5 = (String) map.get("geoname_id");
                if (str5 != null) {
                    sb.append("&currentGeonameId=".concat(str5));
                }
                String string = sb.toString();
                vnd1 vnd1Var = (vnd1) apz0Var.e;
                i8h1 i8h1Var = (i8h1) vnd1Var.b;
                x6h1 x6h1VarC = ((brl0) vnd1Var.c).b.c();
                x6h1VarC.i.add(new a7h1("header_metadata", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("change_location_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", string)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                ((lzn0) apz0Var.d).h(string);
                return rih1.a;
            case 28:
                dp5 dp5Var = (dp5) this.b;
                ((v3h1) this.c).a();
                return new e4h1(yoi1.Q(0, ((cc91) dp5Var.b).a));
            default:
                if (!((Boolean) ((t4h1) this.b).h.getValue()).booleanValue() && ((hrr0) ((ywv0) this.c).f).getValue() == null) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
