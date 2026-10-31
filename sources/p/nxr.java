package p;

import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.music.SpotifyMainActivity;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nxr extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nxr(RecyclerView recyclerView, View view, toj0 toj0Var) {
        super(0);
        this.a = (byte) 20;
        this.b = view;
        this.c = toj0Var;
    }

    public final Object invoke() {
        ou80 ou80Var;
        ye90 ye90Var;
        r3w0 r3w0Var;
        byte b = this.a;
        boolean z = true;
        String str = null;
        rih1 rih1Var = rih1.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                oxr oxrVar = (oxr) obj2;
                l7z l7zVar = (l7z) obj;
                String str2 = ((lik1) oxrVar.b.get()).a;
                j7z j7zVar = l7zVar.e;
                String str3 = j7zVar.a;
                ArrayList<n7z> arrayList = l7zVar.d;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                for (n7z n7zVar : arrayList) {
                    arrayList2.add(new b6v0(n7zVar.a, n7zVar.b));
                }
                return new d6v0(str2, str3, arrayList2, oxrVar.b(j7zVar), gqt0.a);
            case 1:
                m7z m7zVar = (m7z) obj;
                String str4 = m7zVar.d;
                j7z j7zVar2 = m7zVar.e;
                return new c6v0(str4, j7zVar2.a, ((oxr) obj2).b(j7zVar2));
            case 2:
                gfz gfzVar = (gfz) obj2;
                if ((!gfzVar.b() || !gfzVar.a()) && (((Boolean) ((idd1) ((k9r) obj).c).getValue()).booleanValue() || !gfzVar.b())) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                ((iu30) obj2).invoke(new cbj0(((zaj0) obj).e));
                return rih1Var;
            case 4:
                ((j0s) obj2).a((slc0) obj);
                return rih1Var;
            case 5:
                ((Function0) obj2).invoke();
                ((o1s) obj).a.finish();
                return rih1Var;
            case 6:
                x1s x1sVar = (x1s) obj2;
                lj70 lj70Var = (lj70) obj;
                x1sVar.b.h.onNext(new xpq0(lj70Var));
                x1sVar.a(lj70Var.a, true);
                return rih1Var;
            case 7:
                x1s x1sVar2 = (x1s) obj2;
                pi70 pi70Var = (pi70) obj;
                tv80 tv80VarA = x1sVar2.e.a(new xmo0(pi70Var.e, 4));
                if (tv80VarA != null && (ou80Var = tv80VarA.a) != null) {
                    str = ou80Var.a;
                }
                new nxr((Object) x1sVar2, (Object) new ij70(pi70Var, str), (byte) 6).invoke();
                return rih1Var;
            case 8:
                x1s x1sVar3 = (x1s) obj2;
                x1sVar3.a((ti70) obj, false);
                x1sVar3.Y.b(x1sVar3.g.a(vww0.b).subscribe(new t1s(new q1s(x1sVar3, (byte) 2), (byte) 0)));
                return rih1Var;
            case 9:
                x1s x1sVar4 = (x1s) obj2;
                x1sVar4.a.finish();
                fn31.T(x1sVar4.i, (o8n) null, 0, new clo(x1sVar4, (wi70) obj, (lnm) null, (byte) 26), 3);
                return rih1Var;
            case 10:
                ((x1s) obj2).a((bj70) obj, true);
                return rih1Var;
            case 11:
                x1s x1sVar5 = (x1s) obj2;
                x1sVar5.e.a(new bno0(((gj70) obj).d, 4));
                x1sVar5.a.finish();
                return rih1Var;
            case 12:
                d2s d2sVar = (d2s) obj2;
                int iC = l1d.C(((bi70) ((hj70) obj)).c);
                if (iC == 0) {
                    ye90Var = d2sVar.i;
                } else {
                    if (iC != 1 && iC != 2) {
                        eg.o();
                        return null;
                    }
                    ye90Var = d2sVar.h;
                }
                ye90Var.g();
                return rih1Var;
            case 13:
                ((o7s) obj2).a.d((sun) obj);
                return rih1Var;
            case 14:
                iu30 iu30Var = (iu30) obj;
                if (((zom0) obj2).a) {
                    iu30Var.invoke(vom0.a);
                } else {
                    iu30Var.invoke(rom0.a);
                }
                return rih1Var;
            case 15:
                return ((stm1) obj2).b((ft30) ((res) obj).f);
            case 16:
                return ((stm1) obj2).b((ft30) ((res) obj).f);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                FrameLayout frameLayout = (FrameLayout) ((p410) ((tjq) obj).c).c;
                ConstraintLayout constraintLayoutInflate = ((LayoutInflater) obj2).inflate(2131624074, (ViewGroup) frameLayout, false);
                frameLayout.addView(constraintLayoutInflate);
                int i = 2131428512;
                if (((TextView) m5n1.t(constraintLayoutInflate, 2131428512)) != null) {
                    i = 2131428513;
                    if (((TextView) m5n1.t(constraintLayoutInflate, 2131428513)) != null) {
                        i = 2131428514;
                        if (m5n1.t(constraintLayoutInflate, 2131428514) != null) {
                            i = 2131428515;
                            TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131428515);
                            if (textView != null) {
                                i = 2131428516;
                                if (((TextView) m5n1.t(constraintLayoutInflate, 2131428516)) != null) {
                                    i = 2131428517;
                                    ComposeView composeViewT = m5n1.t(constraintLayoutInflate, 2131428517);
                                    if (composeViewT != null) {
                                        i = 2131428518;
                                        if (((TextView) m5n1.t(constraintLayoutInflate, 2131428518)) != null) {
                                            rt8 rt8Var = new rt8(constraintLayoutInflate, textView, composeViewT);
                                            SpannableString spannableString = new SpannableString(textView.getText());
                                            spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
                                            textView.setText(spannableString);
                                            return rt8Var;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                ((ven0) obj).setValue(Boolean.TRUE);
                y0o y0oVar = (y0o) ((tjq) obj2).e;
                if (y0oVar != null) {
                    y0oVar.invoke(x7v0.a);
                    return rih1Var;
                }
                u890.C("eventHandler");
                throw null;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                y0o y0oVar2 = (y0o) ((tjq) obj2).e;
                if (y0oVar2 != null) {
                    y0oVar2.invoke(new z7v0((String) obj));
                    return rih1Var;
                }
                u890.C("eventHandler");
                throw null;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                toj0 toj0Var = (toj0) obj;
                lh2 lh2Var = (lh2) toj0Var.c;
                int iR = RecyclerView.R((View) obj2);
                if (iR != -1 && (r3w0Var = (r3w0) toj0Var.f) != null) {
                    if (r3w0Var == null) {
                        u890.C("model");
                        throw null;
                    }
                    if (iR < r3w0Var.a.size()) {
                        r3w0 r3w0Var2 = (r3w0) toj0Var.f;
                        if (r3w0Var2 == null) {
                            u890.C("model");
                            throw null;
                        }
                        s3w0 s3w0Var = (s3w0) r3w0Var2.a.get(iR);
                        String str5 = s3w0Var.d.a;
                        return (l7h1) lh2Var.invoke(str5 != null ? str5 : "", Integer.valueOf(iR), s3w0Var.a);
                    }
                }
                return (l7h1) lh2Var.invoke("", 0, "");
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                cks cksVar = (cks) obj2;
                cksVar.c.p0().a();
                v6s v6sVar = (v6s) obj;
                Iterator it = v6sVar.d.iterator();
                while (it.hasNext()) {
                    ((ote0) it.next()).a(v6sVar.h);
                }
                SpotifyMainActivity spotifyMainActivity = v6sVar.b;
                if (!spotifyMainActivity.e0().U() && !v6sVar.f) {
                    i94 i94Var = v6sVar.g;
                    i94Var.a("logged_in_session");
                    Iterator it2 = v6sVar.e.iterator();
                    while (it2.hasNext()) {
                        ((e0c0) it2.next()).a();
                    }
                    i94Var.e("navigation_intent_received");
                    v6sVar.c.a.c();
                    i94Var.a("navigation_intent_received");
                    spotifyMainActivity.setVisible(true);
                    v6sVar.f = true;
                }
                tif1.b(cksVar.Z, "LoggedInUi");
                return rih1Var;
            case 22:
                ((jks) obj2).a.e((w2z) obj);
                return rih1Var;
            case 23:
                ((iu30) obj2).invoke(new fia1(((gia1) obj).b));
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                if (((g23) ((mxr) obj2).d) != null) {
                    g23.n((ViewGroup) obj);
                }
                return rih1Var;
            case 25:
                zbs zbsVarA = ((zfx) obj2).a((l0i) null);
                ((tzf1) ((odr) obj).b).m().addView((ConstraintLayout) zbsVarA.b.c);
                return zbsVarA;
            case 26:
                zbs zbsVarA2 = ((zfx) obj2).a((l0i) null);
                ((FrameLayout) ((ks6) ((p2o0) obj).c).S0).addView((ConstraintLayout) zbsVarA2.b.c);
                return zbsVarA2;
            case 27:
                zbs zbsVarA3 = ((zfx) obj2).a((l0i) null);
                ((FrameLayout) ((ks6) ((hjs) obj).d).S0).addView((ConstraintLayout) zbsVarA3.b.c);
                return zbsVarA3;
            case 28:
                ((f0i) ((gj5) obj2)).a.d((uzs) obj);
                return rih1Var;
            default:
                k1t k1tVar = (k1t) obj2;
                cir0 cir0Var = k1tVar.b;
                vas vasVar = new vas(k1tVar, (byte) 25);
                Scheduler schedulerD0 = ((lvq) ((ivq) obj).a.c).b.d0();
                c8o.l(schedulerD0);
                return new z481(cir0Var, schedulerD0, vasVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nxr(Object obj, Object obj2, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
