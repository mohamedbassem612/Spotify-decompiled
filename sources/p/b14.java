package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import com.spotify.creativeworkplatform.encore.elements.mostshared.MostSharedView;
import com.spotify.creativeworkplatform.encore.elements.releasedate.ReleaseDateView;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.paid.PaidBadgeView;
import com.spotify.encoreconsumermobile.elements.metadatarow.MetadataRow;
import com.spotify.encoreconsumermobile.elements.settings.SettingsButton;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.nowplaying.scroll.ScrollCardType;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b14 implements isw {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public Object d;
    public final Object e;

    public b14(Context context, ViewGroup viewGroup, w2s w2sVar, iu30 iu30Var) {
        this.a = (byte) 8;
        iac0 iac0Var = (iac0) w2sVar.b;
        this.b = iu30Var;
        RecyclerView recyclerViewInflate = LayoutInflater.from(context).inflate(2131624095, viewGroup, false);
        if (recyclerViewInflate == null) {
            bhn0.i("rootView");
            throw null;
        }
        RecyclerView recyclerView = recyclerViewInflate;
        this.c = new ic9(recyclerView, recyclerView, (byte) 16);
        LinkedHashMap linkedHashMap = (LinkedHashMap) w2sVar.e;
        tl7 tl7Var = (tl7) w2sVar.t;
        ham hamVar = new ham(linkedHashMap, (Map) w2sVar.f, new jwa0(iu30Var, (byte) 13));
        e611 itemAnimator = recyclerView.getItemAnimator();
        zw81 zw81Var = itemAnimator instanceof zw81 ? (zw81) itemAnimator : null;
        if (zw81Var != null) {
            zw81Var.g = false;
        }
        Iterator it = ((List) w2sVar.g).iterator();
        while (it.hasNext()) {
            ((RecyclerView) ((ic9) this.c).c).j((f611) it.next());
        }
        RecyclerView recyclerView2 = (RecyclerView) ((ic9) this.c).c;
        recyclerView2.getContext();
        ((p1d0) hamVar.b).a(recyclerView2, iac0Var, new LinearLayoutManager(1), false);
        RecyclerView recyclerView3 = (RecyclerView) ((ic9) this.c).c;
        recyclerView3.setPadding(0, 0, 0, ((ij81) w2sVar.h).b);
        recyclerView3.setClipToPadding(false);
        recyclerView3.k(new i0m((byte) 1));
        recyclerView3.m(new hqc0(this, iu30Var, (byte) 0));
        ((RecyclerView) ((ic9) this.c).c).setTag(2131431623, tl7Var);
        rwq0.s((RecyclerView) ((ic9) this.c).c, j830.Y0);
        iro1.j(tl7Var, (RecyclerView) ((ic9) this.c).c);
        new fn90(new w9d1(((RecyclerView) ((ic9) this.c).c).getContext())).i((RecyclerView) ((ic9) this.c).c);
        x9p1.p((RecyclerView) ((ic9) this.c).c, iac0Var);
        ((RecyclerView) ((ic9) this.c).c).setAccessibilityDelegateCompat(new jqc0((RecyclerView) ((ic9) this.c).c));
        this.d = hamVar;
        this.e = (RecyclerView) ((ic9) this.c).b;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0141  */
    /* JADX WARN: Type inference failed for: r2v115, types: [android.app.Dialog, p.fga1] */
    public final void a(Object obj, ysw yswVar) {
        String str;
        int i;
        int i2;
        String str2;
        int i3;
        String string;
        byte b = this.a;
        byte b2 = 2;
        int i4 = 8;
        Object obj2 = this.e;
        Object obj3 = this.c;
        int i5 = 0;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ((r4u) this.d).e((u04) obj);
                return;
            case 1:
                pl6 pl6Var = (pl6) obj;
                ((qzh) obj4).f(rjo1.v(pl6Var));
                il6 il6Var = pl6Var.o;
                ((FrameLayout) obj3).setVisibility(il6Var != null ? 0 : 8);
                if (il6Var != null) {
                    ((dtw) ((idd1) this.d).getValue()).f(new bek(il6Var.a, il6Var.b, il6Var.c, il6Var.d, il6Var.e, pl6Var.l, pl6Var.k, pl6Var.p, pl6Var.a, il6Var.f));
                    return;
                }
                return;
            case 2:
                LinearLayout linearLayout = (LinearLayout) obj3;
                xto xtoVar = ((dmb) obj).b;
                if (!(xtoVar instanceof nob)) {
                    if (xtoVar.equals(lob.d)) {
                        linearLayout.removeAllViews();
                        return;
                    } else {
                        eg.o();
                        return;
                    }
                }
                linearLayout.removeAllViews();
                for (Object obj5 : ((nob) xtoVar).d) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        p7h.T();
                        throw null;
                    }
                    mob mobVar = (mob) obj5;
                    h98 h98Var = new h98((Context) this.d, (gw70) obj2, (byte) 16);
                    h98Var.v(new t0d1(mobVar.b, mobVar.a, mobVar.c, mobVar.d, true));
                    h98Var.n(new gu2((iu30) obj4, i5, mobVar, (byte) 6));
                    linearLayout.addView(((lly) h98Var.d).c);
                    i5 = i6;
                }
                return;
            case 3:
                bfk bfkVar = (bfk) obj;
                ((c460) ((jb3) this.d).g).a(bfkVar.a, (FrameLayout) obj4);
                List list = bfkVar.c;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new yek((String) it.next()));
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                if (arrayList2.isEmpty() && (i = bfkVar.b) != 0) {
                    int iMin = Math.min(i, 3);
                    while (i5 < iMin) {
                        arrayList2.add(zek.a);
                        i5++;
                    }
                }
                if (bfkVar.d && (str = bfkVar.e) != null) {
                    arrayList2.add(new afk(str));
                }
                ((kdn0) obj2).m(arrayList2);
                return;
            case 4:
                isw iswVar = (isw) obj3;
                iswVar.a(obj, yswVar);
                wxn wxnVar = (wxn) ((iu30) obj4).invoke(obj);
                if (wxnVar == null) {
                    lag lagVar = (lag) this.d;
                    if (lagVar != null) {
                        FrameLayout frameLayout = (FrameLayout) lagVar.c;
                        View view = ((dtw) lagVar.d).w;
                        frameLayout.removeView(view);
                        p9p1.s(view);
                        ((ConstraintLayout) lagVar.b).removeView(frameLayout);
                    }
                    this.d = null;
                    return;
                }
                i1a i1aVar = new i1a(yswVar.b, wxnVar);
                lag lagVar2 = (lag) this.d;
                if (lagVar2 != null) {
                    if (i1aVar.equals((i1a) lagVar2.e)) {
                        return;
                    }
                    dtw dtwVar = (dtw) lagVar2.d;
                    byn bynVar = new byn(wxnVar);
                    joa0 joa0Var = new joa0(i1aVar);
                    tka0 tka0Var = dtw.C;
                    dtwVar.k(bynVar, joa0Var, (vu30) null);
                    lagVar2.e = i1aVar;
                    return;
                }
                hz5 hz5Var = (hz5) obj2;
                View viewFindViewById = iswVar.getView().findViewById(2131427553);
                if (viewFindViewById == null) {
                    hhg1.n("No badge view to anchor the badge impression to");
                    return;
                }
                ConstraintLayout parent = viewFindViewById.getParent();
                ConstraintLayout constraintLayout = parent instanceof ConstraintLayout ? parent : null;
                if (constraintLayout == null) {
                    hhg1.n("The badge view is not a direct child of a ConstraintLayout");
                    return;
                }
                FrameLayout frameLayout2 = new FrameLayout(constraintLayout.getContext());
                frameLayout2.setId(View.generateViewId());
                frameLayout2.setImportantForAccessibility(4);
                tka0 tka0Var2 = dtw.C;
                dtw dtwVarD = mhc.d(constraintLayout.getContext(), frameLayout2, f6o1.A(hz5Var, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), m9h.c1, 8);
                frameLayout2.addView(dtwVarD.w, new FrameLayout.LayoutParams(-1, -1));
                ViewGroup.LayoutParams qhlVar = new qhl(0, 0);
                ((qhl) qhlVar).t = 2131427553;
                ((qhl) qhlVar).v = 2131427553;
                ((qhl) qhlVar).i = 2131427553;
                ((qhl) qhlVar).l = 2131427553;
                constraintLayout.addView(frameLayout2, qhlVar);
                dtwVarD.k(new byn(wxnVar), new joa0(i1aVar), (vu30) null);
                this.d = new lag((Object) constraintLayout, (Object) frameLayout2, (Object) dtwVarD, (Object) i1aVar, (byte) 29);
                return;
            case 5:
                rgj0 rgj0Var = (rgj0) obj;
                WebView webView = (WebView) this.d;
                if (u890.j(rgj0Var.d, sgj0.c)) {
                    String str3 = rgj0Var.b;
                    if (str3 != null) {
                        iu30 iu30Var = (iu30) obj4;
                        if (webView != null) {
                            webView.loadData(Base64.encodeToString(str3.getBytes(Charset.forName("UTF-8")), 0), "text/html; charset=utf-8", "base64");
                        }
                        iu30Var.invoke(ngj0.a);
                    }
                    if (!rgj0Var.g || webView == null) {
                        return;
                    }
                    WeakHashMap weakHashMap = b8k1.a;
                    webView.requestApplyInsets();
                    r7k1.c(webView, l9x0.X0);
                    return;
                }
                return;
            case 6:
                lp20 lp20Var = (lp20) obj;
                qp20 qp20Var = lp20Var.b;
                kp5 kp5Var = (kp5) obj3;
                TextView textView = (TextView) kp5Var.g;
                TextView textView2 = (TextView) kp5Var.e;
                Resources resources = textView.getResources();
                int i7 = lp20Var.a;
                ThreadLocal threadLocal = qx21.a;
                int color = resources.getColor(i7, null);
                TextView textView3 = (TextView) kp5Var.g;
                String str4 = qp20Var.a;
                String str5 = qp20Var.g;
                String str6 = qp20Var.e;
                textView3.setText(str4);
                textView3.setTextColor(color);
                ((TextView) kp5Var.f).setText(qp20Var.b);
                TextView textView4 = (TextView) kp5Var.d;
                String str7 = qp20Var.d;
                textView4.setVisibility((str7 == null || str7.length() == 0) ? 8 : 0);
                textView4.setText(str7);
                ((TextView) kp5Var.h).setText(qp20Var.c);
                if (str6 != null && str6.length() != 0) {
                    i4 = 0;
                }
                textView2.setVisibility(i4);
                textView2.setText(str6);
                if (str5 != null && str5.length() != 0) {
                    ((EncoreButton) kp5Var.c).setText(str5);
                }
                ArrayList<s7t0> arrayList3 = qp20Var.f;
                ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
                for (s7t0 s7t0Var : arrayList3) {
                    arrayList4.add(new nnp0(s7t0Var.a, s7t0Var.b, s7t0Var.c, s7t0Var.d, s7t0Var.e, s7t0Var.f, Integer.valueOf(color)));
                }
                ((kdn0) this.d).m(arrayList4);
                ((NestedScrollView) kp5Var.a).addOnAttachStateChangeListener(new y22((iu30) obj4, (byte) 12));
                return;
            case 7:
                s430 s430Var = (s430) obj;
                EncoreButton encoreButton = (EncoreButton) obj2;
                encoreButton.setEnabled(s430Var.c);
                if (s430Var.f) {
                    TypedValue typedValue = new TypedValue();
                    encoreButton.getContext().getTheme().resolveAttribute(2130969011, typedValue, true);
                    encoreButton.setRippleColor(ColorStateList.valueOf(typedValue.data));
                }
                boolean z = s430Var.d;
                String str8 = s430Var.b;
                if (z) {
                    encoreButton.setText(encoreButton.getResources().getString(2131960184));
                    encoreButton.setContentDescription(encoreButton.getResources().getString(2131960183, str8));
                } else {
                    encoreButton.setText(encoreButton.getResources().getString(2131960186));
                    encoreButton.setContentDescription(encoreButton.getResources().getString(2131960185, str8));
                }
                encoreButton.setOnClickListener(new t230(s430Var, this, b2));
                return;
            case 8:
                dqc0 dqc0Var = (gqc0) obj;
                ham hamVar = (ham) this.d;
                iu30 iu30Var2 = (iu30) obj4;
                ic9 ic9Var = (ic9) obj3;
                if (dqc0Var instanceof dqc0) {
                    z511 adapter = ((RecyclerView) ic9Var.c).getAdapter();
                    if (adapter != null) {
                        adapter.w(new zk00(new l811(), adapter, new iqc0(iu30Var2, (gqc0) dqc0Var), (byte) 2));
                    }
                    ((p1d0) hamVar.b).b(dqc0Var.a);
                    return;
                }
                if (dqc0Var instanceof tpc0) {
                    z511 adapter2 = ((RecyclerView) ic9Var.c).getAdapter();
                    if (adapter2 != null) {
                        adapter2.w(new zk00(new l811(), adapter2, new iqc0((gqc0) dqc0Var, iu30Var2), (byte) 2));
                    }
                    ((p1d0) hamVar.b).b(((tpc0) dqc0Var).b);
                    return;
                }
                if (!(dqc0Var instanceof upc0)) {
                    if (dqc0Var instanceof vpc0) {
                        iu30Var2.invoke(qpc0.a);
                        return;
                    } else {
                        if ((dqc0Var instanceof eqc0) || dqc0Var.equals(fqc0.a) || (dqc0Var instanceof bqc0) || (dqc0Var instanceof wpc0)) {
                            return;
                        }
                        eg.o();
                        return;
                    }
                }
                upc0 upc0Var = (upc0) dqc0Var;
                xpc0 xpc0Var = upc0Var.a;
                rnc0 rnc0Var = upc0Var.b;
                if (xpc0Var instanceof ypc0) {
                    i2 = 0;
                } else if (xpc0Var instanceof xpc0) {
                    Iterator it2 = rnc0Var.b.iterator();
                    i2 = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            i2 = -1;
                        } else if (!u890.j(((h8k1) it2.next()).b, xpc0Var.a)) {
                            i2++;
                        }
                    }
                } else {
                    if (!(xpc0Var instanceof zpc0)) {
                        eg.o();
                        return;
                    }
                    Iterator it3 = rnc0Var.b.iterator();
                    i2 = 0;
                    while (true) {
                        if (!it3.hasNext()) {
                            i2 = -1;
                        } else if (!u890.j(((h8k1) it3.next()).b, ((zpc0) xpc0Var).a)) {
                            i2++;
                        }
                    }
                }
                Integer numValueOf = Integer.valueOf(i2);
                if (i2 == -1) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    RecyclerView recyclerView = (RecyclerView) ic9Var.c;
                    recyclerView.startNestedScroll(2);
                    if (iIntValue != 0) {
                        recyclerView.dispatchNestedPreScroll(0, 2000, new int[2], (int[]) null);
                    }
                    a layoutManager = recyclerView.getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    if (linearLayoutManager != null) {
                        linearLayoutManager.w1(iIntValue, 0);
                    }
                    if (iIntValue != 0) {
                        recyclerView.dispatchNestedScroll(0, 0, 0, 0, new int[]{0, -2000});
                    }
                    recyclerView.stopNestedScroll();
                    return;
                }
                return;
            case 9:
                uud0 uud0Var = (uud0) obj;
                o860 o860Var = (o860) obj3;
                TextView textView5 = (TextView) o860Var.e;
                Context context = (Context) obj2;
                int i8 = uud0Var.b;
                int[] iArr = xud0.a;
                textView5.setText(context.getString(iArr[l1d.C(i8)] == 1 ? 2131961485 : 2131961484));
                ((TextView) o860Var.d).setText(context.getString(iArr[l1d.C(i8)] == 1 ? 2131961483 : 2131956977));
                ((LinearLayout) o860Var.c).setVisibility(iArr[l1d.C(i8)] == 2 ? 0 : 8);
                EncoreButton encoreButton2 = (EncoreButton) o860Var.b;
                iu30 iu30Var3 = (iu30) obj4;
                if (i8 == 1 && !ihc1.y0(uud0Var.a) && i8 == 1) {
                    i4 = 0;
                }
                encoreButton2.setVisibility(i4);
                encoreButton2.setOnClickListener(new jn90(iu30Var3, (byte) 1));
                return;
            case 10:
                MetadataRow metadataRow = (MetadataRow) obj4;
                metadataRow.A();
                ArrayList arrayList5 = ((gmj0) obj).a;
                if (!arrayList5.isEmpty()) {
                    b(metadataRow, (snj0) o7h.q0(arrayList5), false);
                }
                for (mmr0 mmr0Var : o7h.w1(arrayList5)) {
                    b(metadataRow, (snj0) mmr0Var.b, !((snj0) mmr0Var.a).a);
                }
                return;
            case 11:
                wb80 wb80Var = (wb80) obj3;
                bs0 bs0Var = (bs0) obj2;
                wb80Var.b.setText((CharSequence) ((iu30) bs0Var.d).invoke(obj));
                b8k1.q(wb80Var.a, true);
                ((dtw) obj4).f(((iu30) bs0Var.b).invoke(obj));
                return;
            case 12:
                ((r4u) this.d).e((dzs0) obj);
                return;
            case 13:
                xn51 xn51Var = (xn51) obj;
                TextView textView6 = (TextView) obj4;
                Context context2 = (Context) obj2;
                if (!(xn51Var instanceof wn51)) {
                    if (xn51Var instanceof vn51) {
                        textView6.setVisibility(8);
                        return;
                    } else {
                        eg.o();
                        return;
                    }
                }
                wn51 wn51Var = (wn51) xn51Var;
                Integer num = wn51Var.a;
                if (num != null) {
                    int iMax = (int) (((long) Math.max(0, num.intValue())) / 1000);
                    long j = iMax;
                    int i9 = (int) (j / 3600);
                    int i10 = ((int) (j / 60)) % 60;
                    int i11 = iMax % 60;
                    str2 = i9 == 0 ? String.format(Locale.US, "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i10), Integer.valueOf(i11)}, 2)) : String.format(Locale.US, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11)}, 3));
                } else {
                    str2 = "";
                }
                textView6.setText(str2);
                textView6.setVisibility(0);
                int iC = l1d.C(wn51Var.c);
                if (iC == 0) {
                    Drawable drawable = (Drawable) ((idd1) obj3).getValue();
                    int dimensionPixelSize = context2.getResources().getDimensionPixelSize(2131165897);
                    int dimensionPixelSize2 = context2.getResources().getDimensionPixelSize(2131165907);
                    textView6.setTextAppearance(2132018007);
                    textView6.setBackground(drawable);
                    textView6.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
                    textView6.setFontFeatureSettings("tnum");
                    return;
                }
                if (iC != 1) {
                    eg.o();
                    return;
                }
                Drawable drawable2 = (Drawable) ((idd1) this.d).getValue();
                int dimensionPixelSize3 = context2.getResources().getDimensionPixelSize(2131165898);
                int dimensionPixelSize4 = context2.getResources().getDimensionPixelSize(2131165907);
                textView6.setTextAppearance(2132018009);
                textView6.setBackground(drawable2);
                textView6.setPadding(dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize3, dimensionPixelSize4);
                textView6.setFontFeatureSettings("tnum");
                return;
            case 14:
                ep61 ep61Var = (ep61) obj;
                SettingsButton settingsButton = (SettingsButton) obj2;
                if (ep61Var.c) {
                    au8 au8Var = (au8) this.d;
                    l451 l451Var = new l451(this, (byte) 22);
                    if (au8Var.e) {
                        l451Var.invoke();
                    } else {
                        du8 du8Var = au8Var.c;
                        if (du8Var.a.l(du8.c, 0) < du8Var.b.a()) {
                            au8Var.e = true;
                            au8Var.d.b(au8Var.b.c(new ijo0(new mx81(au8Var.a.getString(2131952678), 1, 2, 5000L, 6), settingsButton, new zt8(l451Var), 8)).subscribe(new a21(au8Var, l451Var, (byte) 14), new tg(l451Var, (byte) 25)));
                        } else {
                            l451Var.invoke();
                        }
                    }
                }
                settingsButton.setEnabled(ep61Var.a);
                settingsButton.setContentDescription(((Context) obj3).getString(2131962437));
                settingsButton.setOnClickListener(new gl61(this, (byte) 1));
                return;
            default:
                vga1 vga1Var = (vga1) obj;
                EncoreButton encoreButton3 = (EncoreButton) ((y281) obj3).b;
                Context context3 = (Context) this.d;
                sga1 sga1Var = vga1Var.b;
                if (u890.j(sga1Var, r3x0.Q0)) {
                    i3 = 2131955956;
                } else if (u890.j(sga1Var, i2x0.N0)) {
                    i3 = 2131955957;
                } else {
                    if (!u890.j(sga1Var, u3x0.Q0)) {
                        eg.o();
                        return;
                    }
                    i3 = 2131955959;
                }
                String string2 = context3.getString(i3);
                uga1 uga1Var = vga1Var.a;
                if (uga1Var instanceof tga1) {
                    string = ((tga1) uga1Var).a;
                } else if (u890.j(uga1Var, b4x0.P0)) {
                    string = context3.getString(2131955973);
                } else if (u890.j(uga1Var, c4x0.Q0)) {
                    string = context3.getString(2131955974);
                } else {
                    if (!u890.j(uga1Var, a4x0.P0)) {
                        eg.o();
                        return;
                    }
                    string = context3.getString(2131955972);
                }
                encoreButton3.setText(string2 + " • " + string);
                if (vga1Var.c) {
                    yga1 yga1VarH = ug3.h(vga1Var);
                    ?? fga1Var = new fga1(context3);
                    iu30 iu30Var4 = (iu30) obj4;
                    fga1Var.S0 = new et61(iu30Var4, (byte) 17);
                    fga1Var.T0 = new et61(iu30Var4, (byte) 18);
                    fga1Var.setOnDismissListener(new whr(iu30Var4, (byte) 6));
                    fga1Var.i(yga1VarH);
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [android.view.View, android.widget.TextView, com.spotify.creativeworkplatform.encore.elements.releasedate.ReleaseDateView] */
    public void b(MetadataRow metadataRow, snj0 snj0Var, boolean z) {
        Context context = (Context) this.c;
        lmj0 lmj0Var = (lmj0) this.d;
        if (snj0Var instanceof jnj0) {
            ComposeView composeView = new ComposeView(metadataRow.getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            composeView.setId(View.generateViewId());
            composeView.setContent(k1j.b);
            MetadataRow.y(metadataRow, composeView, z);
            return;
        }
        ComposeView composeViewM = null;
        if (snj0Var instanceof lnj0) {
            tka0 tka0Var = dtw.C;
            View view = mhc.b(context, metadataRow, lmj0Var.b, ((lnj0) snj0Var).b, (ipb1) null, 112).w;
            ViewParent parent = view.getParent();
            composeViewM = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (composeViewM != null) {
                composeViewM.removeView(view);
            }
            MetadataRow.y(metadataRow, view, z);
            return;
        }
        int i = 2;
        if (snj0Var instanceof dnj0) {
            k4m k4mVar = ((dnj0) snj0Var).b;
            ContentRestrictionBadgeView contentRestrictionBadgeView = new ContentRestrictionBadgeView(metadataRow.getContext(), (AttributeSet) null, 2, (DefaultConstructorMarker) null);
            contentRestrictionBadgeView.setId(View.generateViewId());
            contentRestrictionBadgeView.c(k4mVar);
            MetadataRow.y(metadataRow, contentRestrictionBadgeView, z);
            return;
        }
        if (snj0Var instanceof rnj0) {
            d2k1 d2k1Var = ((rnj0) snj0Var).b;
            String strA = a2k1.a(metadataRow.getContext(), d2k1Var);
            if (strA != null) {
                composeViewM = azo1.m(metadataRow, strA);
                composeViewM.setContentDescription(a2k1.b(composeViewM.getContext(), d2k1Var));
            }
            if (composeViewM != null) {
                MetadataRow.y(metadataRow, composeViewM, z);
                return;
            }
            return;
        }
        if (snj0Var instanceof knj0) {
            boolean z2 = ((knj0) snj0Var).b;
            PaidBadgeView paidBadgeView = new PaidBadgeView(metadataRow.getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            paidBadgeView.setId(View.generateViewId());
            int i2 = z2 ? 2131955878 : 2131959537;
            int i3 = z2 ? 2131955877 : 2131959536;
            paidBadgeView.setImageDrawable(new n0e1(paidBadgeView.getContext(), paidBadgeView.getContext().getString(i2)));
            paidBadgeView.setContentDescription(paidBadgeView.getContext().getString(i3));
            paidBadgeView.setVisibility(0);
            MetadataRow.y(metadataRow, paidBadgeView, z);
            return;
        }
        if (snj0Var instanceof fnj0) {
            String str = ((fnj0) snj0Var).b;
            ComposeView composeView2 = new ComposeView(metadataRow.getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            composeView2.setId(View.generateViewId());
            composeView2.setContent(new j2i(-112629824, new tej0(str, (byte) 2), true));
            MetadataRow.y(metadataRow, composeView2, z);
            return;
        }
        if (snj0Var instanceof inj0) {
            MostSharedView mostSharedView = new MostSharedView(metadataRow.getContext(), null, 2, null);
            mostSharedView.setId(View.generateViewId());
            mostSharedView.a(true);
            MetadataRow.y(metadataRow, mostSharedView, z);
            return;
        }
        if (snj0Var instanceof nnj0) {
            nnj0 nnj0Var = (nnj0) snj0Var;
            fy50 fy50Var = nnj0Var.b;
            qzh qzhVarA = lmj0Var.e.a(new hsz0(nnj0Var.c));
            qzhVarA.f(new ksz0(fy50Var.a, new fsz0(fy50Var.c, fy50Var.d, fy50Var.e), fy50Var.b));
            MetadataRow.y(metadataRow, qzhVarA.getView(), z);
            return;
        }
        if (snj0Var instanceof enj0) {
            MetadataRow.y(metadataRow, azo1.m(metadataRow, ((enj0) snj0Var).b), z);
            return;
        }
        if (snj0Var instanceof qnj0) {
            MetadataRow.y(metadataRow, azo1.m(metadataRow, ((qnj0) snj0Var).b), z);
            return;
        }
        if (snj0Var instanceof onj0) {
            long j = ((onj0) snj0Var).b;
            Calendar calendar = (Calendar) this.e;
            calendar.getClass();
            ?? releaseDateView = new ReleaseDateView(metadataRow.getContext(), composeViewM, i, composeViewM);
            releaseDateView.setViewContext(new to11(calendar));
            releaseDateView.setTextColor(releaseDateView.getContext().getColor(2131101506));
            releaseDateView.f(new so11(Long.valueOf(j)));
            MetadataRow.y(metadataRow, (View) releaseDateView, z);
            return;
        }
        if (snj0Var instanceof pnj0) {
            long j2 = ((pnj0) snj0Var).b;
            ro11 ro11Var = new ro11(metadataRow.getContext());
            ro11Var.f(new qo11(j2));
            if (!ro11Var.e) {
                ro11Var = null;
            }
            composeViewM = ro11Var != null ? ro11Var.d : null;
            if (composeViewM != null) {
                MetadataRow.y(metadataRow, composeViewM, z);
                return;
            }
            return;
        }
        if (snj0Var instanceof mnj0) {
            mnj0 mnj0Var = (mnj0) snj0Var;
            String str2 = mnj0Var.b;
            if (mnj0Var.d) {
                tka0 tka0Var2 = dtw.C;
                MetadataRow.y(metadataRow, mhc.b(context, metadataRow, fdg1.m0((vl90) lmj0Var.g.getValue(), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new pl90(str2), (ipb1) null, 112).w, false);
                return;
            } else {
                tka0 tka0Var3 = dtw.C;
                MetadataRow.y(metadataRow, mhc.b(context, metadataRow, fdg1.m0(lmj0Var.d, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new lfv(mnj0Var.c, str2), (ipb1) null, 112).w, z);
                return;
            }
        }
        if (snj0Var instanceof cnj0) {
            ComposeView composeView3 = new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            composeView3.setId(View.generateViewId());
            composeView3.setContent(c9i.b);
            MetadataRow.y(metadataRow, composeView3, z);
            return;
        }
        if (snj0Var instanceof hnj0) {
            MetadataRow.y(metadataRow, e130.p(context, ((hnj0) snj0Var).b), z);
        } else if (snj0Var instanceof gnj0) {
            MetadataRow.y(metadataRow, e130.p(context, ((gnj0) snj0Var).b), z);
        } else {
            eg.o();
        }
    }

    public void c() {
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131960188});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
        ((kt91) this.d).k(new er91((fs91) null, "", 2131960188, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
    }

    public final View getView() {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        Object obj3 = this.e;
        switch (b) {
            case 0:
                return (EncoreButton) obj3;
            case 1:
                return (LinearLayout) obj3;
            case 2:
                return (LinearLayout) obj2;
            case 3:
                return (View) obj2;
            case 4:
                return ((isw) obj2).getView();
            case 5:
                return (View) obj3;
            case 6:
                return (NestedScrollView) obj3;
            case 7:
                return (EncoreButton) obj3;
            case 8:
                return (RecyclerView) obj3;
            case 9:
                return (RelativeLayout) this.d;
            case 10:
                return (MetadataRow) obj;
            case 11:
                return (ConstraintLayout) this.d;
            case 12:
                return (View) obj2;
            case 13:
                return (TextView) obj;
            case 14:
                return (SettingsButton) obj3;
            default:
                return (EncoreButton) obj3;
        }
    }

    public b14(Context context, iu30 iu30Var, y04 y04Var) {
        this.a = (byte) 0;
        this.b = iu30Var;
        this.c = new AtomicBoolean(false);
        this.d = r4u.c(new r4u[]{r4u.d(t9w.g, r4u.a(new t7o0(this, (byte) 14)))});
        EncoreButton encoreButtonInflate = LayoutInflater.from(context).inflate(2131624050, (ViewGroup) null);
        encoreButtonInflate.setVisibility(8);
        y04Var.a.invoke(context.getString(2131952332), new a14(this, (byte) 1));
        encoreButtonInflate.setOnClickListener(new c20(this, (byte) 6));
        this.e = encoreButtonInflate;
    }

    public b14(Context context, au8 au8Var, iu30 iu30Var) {
        this.a = (byte) 14;
        this.c = context;
        this.d = au8Var;
        this.b = iu30Var;
        SettingsButton settingsButton = new SettingsButton(new plm(context, 2132017819), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        settingsButton.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        settingsButton.addOnAttachStateChangeListener(new y22(this, (byte) 15));
        this.e = settingsButton;
    }

    public b14(Context context, ViewGroup viewGroup, bs0 bs0Var) {
        this.a = (byte) 11;
        this.e = bs0Var;
        tka0 tka0Var = dtw.C;
        dtw dtwVarD = mhc.d(context, viewGroup, (wpw) bs0Var.e, (drw) null, 24);
        this.b = dtwVarD;
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131625325, viewGroup, false);
        int i = 2131428212;
        FrameLayout frameLayout = (FrameLayout) m5n1.t(constraintLayoutInflate, 2131428212);
        if (frameLayout != null) {
            ConstraintLayout constraintLayout = constraintLayoutInflate;
            TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131431356);
            if (textView != null) {
                wb80 wb80Var = new wb80(constraintLayout, frameLayout, constraintLayout, textView);
                frameLayout.addView(dtwVarD.w);
                ((GradientDrawable) constraintLayout.getBackground()).setColor(context.getColor(2131101501));
                this.c = wb80Var;
                this.d = constraintLayout;
                return;
            }
            i = 2131431356;
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    public b14(Context context, gu8 gu8Var, kt91 kt91Var, iu30 iu30Var) {
        this.a = (byte) 7;
        this.c = gu8Var;
        this.d = kt91Var;
        this.b = iu30Var;
        EncoreButton encoreButton = new EncoreButton(context, (AttributeSet) null, 2130969232, (eix) null, 8, (DefaultConstructorMarker) null);
        encoreButton.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        encoreButton.setEllipsize(TextUtils.TruncateAt.END);
        encoreButton.setMaxLines(1);
        this.e = encoreButton;
    }

    public b14(rsw rswVar, Context context, ViewGroup viewGroup, lsw lswVar, iu30 iu30Var, iu30 iu30Var2, hz5 hz5Var) {
        this.a = (byte) 4;
        this.b = iu30Var2;
        this.e = hz5Var;
        this.c = rswVar.a(context, viewGroup, lswVar, iu30Var);
    }

    public b14(Context context, ViewGroup viewGroup, iu30 iu30Var, u63 u63Var, iu30 iu30Var2) {
        this.a = (byte) 12;
        this.b = iu30Var2;
        int i = 0;
        View viewInflate = LayoutInflater.from(context).inflate(2131625376, viewGroup, false);
        this.c = viewInflate;
        List listM = p7h.M(new EditText[]{(EditText) viewInflate.findViewById(2131430341), (EditText) viewInflate.findViewById(2131430343), (EditText) viewInflate.findViewById(2131430344), (EditText) viewInflate.findViewById(2131430342)});
        this.e = listM;
        this.d = r4u.c(new r4u[]{r4u.d(new ahs(sys0.b, (byte) 6), r4u.a(new e5l0(this, (byte) 23))), r4u.d(new ahs(tys0.b, (byte) 6), r4u.a(new vgq0(this, (byte) 6))), r4u.d(new ahs(uys0.b, (byte) 6), r4u.a(new mre0(this, (byte) 29))), r4u.d(new ahs(vys0.b, (byte) 6), r4u.a(new sks0(this, (byte) 1)))});
        for (Object obj : listM) {
            int i2 = i + 1;
            if (i >= 0) {
                EditText editText = (EditText) obj;
                editText.setContentDescription(editText.getResources().getString(2131959744, Integer.valueOf(i2)));
                editText.addTextChangedListener(new rys0(iu30Var, i, this));
                editText.setOnKeyListener(new qys0(u63Var, i, editText, this));
                i = i2;
            } else {
                p7h.T();
                throw null;
            }
        }
        ((View) this.c).post(new an90(this, (byte) 20));
    }

    public b14(Context context, ViewGroup viewGroup, ug3 ug3Var, iu30 iu30Var) {
        this.a = (byte) 6;
        this.b = iu30Var;
        NestedScrollView nestedScrollViewInflate = LayoutInflater.from(context).inflate(2131624648, viewGroup, false);
        int i = 2131427688;
        if (m5n1.t(nestedScrollViewInflate, 2131427688) != null) {
            i = 2131428198;
            if (m5n1.t(nestedScrollViewInflate, 2131428198) != null) {
                i = 2131428497;
                View viewT = m5n1.t(nestedScrollViewInflate, 2131428497);
                if (viewT != null) {
                    NestedScrollView nestedScrollView = nestedScrollViewInflate;
                    i = 2131428911;
                    EncoreButton encoreButtonT = m5n1.t(nestedScrollViewInflate, 2131428911);
                    if (encoreButtonT != null) {
                        i = 2131429667;
                        TextView textView = (TextView) m5n1.t(nestedScrollViewInflate, 2131429667);
                        if (textView != null) {
                            i = 2131429754;
                            TextView textView2 = (TextView) m5n1.t(nestedScrollViewInflate, 2131429754);
                            if (textView2 != null) {
                                i = 2131430358;
                                TextView textView3 = (TextView) m5n1.t(nestedScrollViewInflate, 2131430358);
                                if (textView3 != null) {
                                    i = 2131430386;
                                    TextView textView4 = (TextView) m5n1.t(nestedScrollViewInflate, 2131430386);
                                    if (textView4 != null) {
                                        i = 2131430389;
                                        RecyclerView recyclerViewT = m5n1.t(nestedScrollViewInflate, 2131430389);
                                        if (recyclerViewT != null) {
                                            i = 2131430395;
                                            TextView textView5 = (TextView) m5n1.t(nestedScrollViewInflate, 2131430395);
                                            if (textView5 != null) {
                                                i = 2131430469;
                                                if (((TextView) m5n1.t(nestedScrollViewInflate, 2131430469)) != null) {
                                                    i = 2131430473;
                                                    if (((ImageView) m5n1.t(nestedScrollViewInflate, 2131430473)) != null) {
                                                        this.c = new kp5(nestedScrollView, viewT, encoreButtonT, textView, textView2, textView3, textView4, recyclerViewT, textView5);
                                                        this.d = new kdn0();
                                                        ne neVar = new ne(3, new zf10(this, ug3Var, (byte) 14));
                                                        recyclerViewT.getContext();
                                                        neVar.f(recyclerViewT, new LinearLayoutManager(1), false);
                                                        recyclerViewT.setNestedScrollingEnabled(false);
                                                        encoreButtonT.setOnClickListener(new aqs(iu30Var, (byte) 23));
                                                        this.e = nestedScrollView;
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(nestedScrollViewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public b14(pp ppVar, di4 di4Var, Context context, iu30 iu30Var, yqg yqgVar, kly0 kly0Var, iu30 iu30Var2) {
        this.a = (byte) 1;
        boolean zS = di4Var.S();
        boolean zB = di4Var.b();
        boolean zO = di4Var.O();
        wfx wfxVar = ppVar.b;
        bgr bgrVar = new bgr(wfxVar.b, wfxVar.a, zS, zB, zO);
        this.b = bgrVar;
        bgrVar.n(new xg6(iu30Var, yqgVar, (byte) 7));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        frameLayout.setVisibility(8);
        this.c = frameLayout;
        this.d = new idd1(new f80(context, this, kly0Var, iu30Var2, (byte) 6));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout.addView((View) bgrVar.e.b, new ViewGroup.LayoutParams(-1, -2));
        linearLayout.addView(frameLayout);
        this.e = linearLayout;
    }

    public b14(Context context, ViewGroup viewGroup, jjv0 jjv0Var) {
        this.a = (byte) 13;
        this.e = context;
        this.b = (TextView) LayoutInflater.from(context).inflate(2131626117, viewGroup, false);
        this.c = new idd1(new qnd0(context, (byte) 14));
        this.d = new idd1(new qnd0(context, (byte) 15));
    }

    public b14(Context context, yud0 yud0Var, iu30 iu30Var) {
        this.a = (byte) 9;
        this.e = context;
        this.b = iu30Var;
        View viewInflate = LayoutInflater.from(context).inflate(2131625156, (ViewGroup) null, false);
        RelativeLayout relativeLayout = (RelativeLayout) viewInflate;
        int i = 2131428290;
        EncoreButton encoreButtonT = m5n1.t(viewInflate, 2131428290);
        if (encoreButtonT != null) {
            i = 2131430781;
            if (((TextView) m5n1.t(viewInflate, 2131430781)) != null) {
                i = 2131430782;
                if (((TextView) m5n1.t(viewInflate, 2131430782)) != null) {
                    i = 2131430783;
                    if (((TextView) m5n1.t(viewInflate, 2131430783)) != null) {
                        i = 2131430784;
                        LinearLayout linearLayout = (LinearLayout) m5n1.t(viewInflate, 2131430784);
                        if (linearLayout != null) {
                            i = 2131430785;
                            TextView textView = (TextView) m5n1.t(viewInflate, 2131430785);
                            if (textView != null) {
                                i = 2131430786;
                                TextView textView2 = (TextView) m5n1.t(viewInflate, 2131430786);
                                if (textView2 != null) {
                                    i = 2131431704;
                                    if (m5n1.t(viewInflate, 2131431704) != null) {
                                        this.c = new o860(relativeLayout, encoreButtonT, linearLayout, textView, textView2);
                                        this.d = relativeLayout;
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public b14(Context context, ViewGroup viewGroup, ne neVar, jb3 jb3Var, kdn0 kdn0Var) {
        this.a = (byte) 3;
        this.d = jb3Var;
        this.e = kdn0Var;
        View viewInflate = LayoutInflater.from(context).inflate(2131624452, viewGroup, false);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(2131428171);
        this.b = frameLayout;
        ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).setMarginStart(context.getResources().getDimensionPixelSize(2131165424));
        ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).setMarginEnd(context.getResources().getDimensionPixelSize(2131165424));
        RecyclerView recyclerViewFindViewById = viewInflate.findViewById(2131428168);
        recyclerViewFindViewById.j(new j1e(context.getResources().getDimensionPixelOffset(2131165424), (byte) 6));
        neVar.f(recyclerViewFindViewById, new LinearLayoutManager(0), false);
        recyclerViewFindViewById.setItemAnimator((e611) null);
        this.c = viewInflate;
    }

    public b14(Context context, gw70 gw70Var, iu30 iu30Var) {
        this.a = (byte) 2;
        this.d = context;
        this.e = gw70Var;
        this.b = iu30Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(2131427640);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.c = linearLayout;
    }

    public b14(Context context, iu30 iu30Var, ug3 ug3Var) {
        this.a = (byte) 15;
        this.d = context;
        this.b = iu30Var;
        EncoreButton encoreButtonInflate = LayoutInflater.from(context).inflate(2131626184, (ViewGroup) null, false);
        if (encoreButtonInflate != null) {
            EncoreButton encoreButton = encoreButtonInflate;
            this.c = new y281(encoreButton, encoreButton);
            encoreButton.setOnClickListener(new zl51(iu30Var, (byte) 8));
            this.e = encoreButton;
            return;
        }
        bhn0.i("rootView");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.webkit.WebView, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v8 */
    public b14(Context context, iu30 iu30Var) {
        Object obj;
        this.a = (byte) 5;
        this.b = iu30Var;
        this.c = new LinkedHashSet();
        try {
            WebView webView = new WebView(context);
            webView.setBackgroundColor(0);
            webView.getSettings().setTextZoom(100);
            webView.setHorizontalScrollBarEnabled(false);
            webView.setVerticalScrollBarEnabled(false);
            webView.setWebViewClient(new WebViewClient());
            webView.getSettings().setJavaScriptEnabled(true);
            webView.getSettings().setOffscreenPreRaster(true);
            webView.setAccessibilityDelegate(new View.AccessibilityDelegate());
            webView.setId(2131431682);
            webView.setTag(2131431682);
            webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            obj = webView;
        } catch (Throwable th) {
            iu30Var.invoke(new mgj0(l1d.m("Webview instantiation failed: ", th.getMessage())));
            obj = 0;
        }
        this.d = obj;
        f9s f9sVar = new f9s(context, this, iu30Var);
        if (obj != 0) {
            obj.setBackgroundColor(context.getColor(2131102457));
        }
        if (obj != 0) {
            obj.addJavascriptInterface(f9sVar, "Android");
        }
        if (obj != 0) {
            obj.setWebViewClient(new q78(iu30Var, (byte) 1));
        }
        this.e = obj == 0 ? new View(context) : obj;
    }

    public b14(Context context, lmj0 lmj0Var, Calendar calendar) {
        this.a = (byte) 10;
        this.c = context;
        this.d = lmj0Var;
        this.e = calendar;
        this.b = new MetadataRow(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }
}
