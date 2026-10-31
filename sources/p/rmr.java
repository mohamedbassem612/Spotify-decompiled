package p;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.creatorbutton.CreatorButtonView;
import com.spotify.encoreconsumermobile.elements.shuffle.ShuffleButtonView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.liveevents.uiusecases.concertentityheader.elements.CalendarIconView;
import com.spotify.liveevents.uiusecases.multiavatar.MultiArtistAvatarView;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class rmr implements qiw, Function, sh, BiFunction, yu30 {
    public final /* synthetic */ byte a;
    public final Object b;

    public rmr(NestedScrollView nestedScrollView, EncoreButton encoreButton, FrameLayout frameLayout) {
        this.a = (byte) 21;
        this.b = encoreButton;
    }

    public Set a(String str, aey aeyVar) {
        int iOrdinal = aeyVar.ordinal();
        bx51 bx51Var = bx51.a;
        w7x w7xVar = w7x.a;
        bx51 bx51Var2 = bx51.c;
        switch (iOrdinal) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 10:
                return Collections.singleton(bx51Var2);
            case 7:
                return f46.S0(new bx51[]{bx51Var, bx51Var2});
            case 8:
            case 11:
            case 12:
            case 13:
            case 14:
                return w7xVar;
            case 9:
                Set set = ((uv40) this.b).a;
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        if (((hmv0) it.next()).a(str)) {
                            return w7xVar;
                        }
                    }
                }
                return f46.S0(new bx51[]{bx51Var, bx51Var2});
            default:
                eg.o();
                return null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: retrofit2.HttpException */
    public Object apply(Object obj) throws HttpException {
        mq70 mq70Var;
        up70 up70VarA;
        String str;
        byte b = this.a;
        boolean z = true;
        woa1 woa1Var = null;
        Object obj2 = this.b;
        switch (b) {
            case 1:
                if (y7y0.u("allow-connect-entry-points", (Map) obj, true) && !((apr) obj2).b.isEnabled()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 6:
                ((ias) obj2).g.d().onNext(obj);
                return CompletableEmpty.a;
            case 7:
                Boolean bool = (Boolean) obj;
                vgr vgrVar = (vgr) obj2;
                vgrVar.b = bool.booleanValue();
                inr inrVar = (g0l) vgrVar.c;
                l0l l0lVarC = inrVar.c();
                if (!bool.booleanValue() || l0lVarC == null) {
                    return j5.a;
                }
                nnr nnrVarK = inrVar.k();
                return new i5w0(new xi5(l0lVarC, nnrVarK != null ? nnrVarK.B.a : null, vgrVar.a, ((v5u0) vgrVar.e).b));
            case 11:
                qw91 qw91Var = (qw91) obj2;
                xkk1 xkk1Var = ((uv00) obj).a(xkk1.class, qw91Var.a).b;
                boolean z2 = qw91Var.c;
                if (xkk1Var != null && (mq70Var = xkk1Var.a) != null && (up70VarA = mq70Var.a(vp70.b)) != null) {
                    woa1Var = up70VarA.a.a;
                }
                return new rw91(woa1Var, z2);
            case 16:
                PlayerState playerState = (PlayerState) obj;
                return new p9u(!playerState.isPaused() && playerState.isPlaying() && ((c3s) ((s24) obj2).e).c());
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                xmg0 xmg0Var = (ymg0) obj;
                if (!(xmg0Var instanceof xmg0)) {
                    Single singleJust = Single.just(jwu.a);
                    singleJust.getClass();
                    return singleJust;
                }
                umg0 umg0Var = xmg0Var.a;
                kb10 kb10Var = umg0Var.c;
                fb10 fb10Var = new fb10(kb10Var.c, kb10Var.d, kb10Var.a, n1p1.q(kb10Var.b));
                eb10 eb10Var = umg0Var.d;
                za10 za10Var = new za10(eb10Var.c, eb10Var.d, eb10Var.a, n1p1.q(eb10Var.b));
                bpa1 bpa1Var = umg0Var.a;
                woa1Var = bpa1Var != null ? new woa1(bpa1Var.a, n1p1.q(bpa1Var.e), bpa1Var.b, bpa1Var.c, bpa1Var.d, bpa1Var.f, bpa1Var.g) : null;
                soa1 soa1Var = umg0Var.b;
                le20 le20Var = new le20(fb10Var, za10Var, woa1Var, new noa1(soa1Var.c, soa1Var.d, soa1Var.a, n1p1.q(soa1Var.b)));
                return ((Completable) ((p5) ((ek1) obj2).c).invoke(le20Var)).e(Single.just(new kwu(le20Var)));
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                bja1 bja1Var = (bja1) obj;
                k3v k3vVar = (k3v) obj2;
                return k3vVar.d.map(new j3v(bja1Var.a, (byte) 0)).switchMap(new qmr(k3vVar, (byte) 20)).takeUntil(cxo1.Z0).map(new gmt(k3vVar, bja1Var.b, (byte) 11));
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return ((bkv) obj2).a.c().d((spq0) obj).ignoreElement();
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                int iOrdinal = ((p4o0) obj).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                eg.o();
                                return null;
                            }
                        }
                    }
                    yjq yjqVar = (yjq) obj2;
                    d3o0 d3o0Var = (d3o0) yjqVar.b;
                    Single map = d3o0Var.b().map(new yfc0(d3o0Var, (byte) 23));
                    q1o0 q1o0Var = (q1o0) yjqVar.d;
                    Single map2 = q1o0Var.b().map(new hod0(q1o0Var, (byte) 22));
                    p241 p241Var = (o241) yjqVar.f;
                    h84 h84Var = (h84) yjqVar.e;
                    return Single.zip(map, map2, p241Var.a("active-session-days", String.valueOf(h84Var.c())).map(new qmr(yjqVar, (byte) 23)).first(Integer.valueOf(h84Var.c())), stf0.e1).map(new efr(yjqVar, (byte) 20));
                }
                return Single.just(Boolean.FALSE);
            case 23:
                sy21 sy21Var = (sy21) obj;
                if (!sy21Var.a.Q0) {
                    throw new HttpException(sy21Var);
                }
                h4c0 h4c0Var = (h4c0) sy21Var.b;
                if (h4c0Var == null || (str = h4c0Var.a) == null) {
                    eg.m("Response body is null.");
                    return null;
                }
                return "wg://dynamic-sessions/context-resolve/v2/endless/" + str + "?seed=" + ((Random) ((ynb0) ((gmt) obj2).c).get()).nextInt();
            case 27:
                vn90 vn90Var = (vn90) obj;
                rpv0 rpv0Var = ((zdz) obj2).e;
                rw20 items = vn90Var.getItems();
                rw20 pw20Var = items instanceof rw20 ? items : new pw20(items, items);
                wn90 wn90VarO = hr80.o((Iterable) pw20Var.a.e(pw20Var), kf21.b);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                r7h.W(wn90VarO, arrayList2);
                rpv0.b("today", arrayList, arrayList2, new if21(rpv0Var, (byte) 0));
                rpv0.b("yesterday", arrayList, arrayList2, new if21(rpv0Var, (byte) 1));
                rpv0.b("thisWeek", arrayList, arrayList2, new if21(rpv0Var, (byte) 2));
                rpv0.b("unplayed", arrayList, arrayList2, ma21.R0);
                return new jf21(arrayList, vn90Var);
            default:
                return ((ruz) obj2).e(((j9u0) obj).a);
        }
    }

    public jhm b(tom tomVar, boolean z) {
        return new jhm(z ? "campfire_delete_contribution_for_me" : "campfire_delete_contribution_for_everyone", (hux) cmx.c, (fhm) null, Integer.valueOf(z ? 2131958529 : 2131958528), (String) null, false, (tm81) null, new ihm(new ygm(3), z ? new ghm(d0t.d1, d0t.e1) : new ghm(z6t.b, z6t.c), new c30((Object) this, (Object) tomVar, z, (byte) 9)), 244);
    }

    public Parcelable c() {
        Bundle bundle = ((g7z) this.b).b;
        if (bundle != null) {
            return bundle.getParcelable("extra_playback_state");
        }
        return null;
    }

    public void d(Uri uri, boolean z) {
        zhq0 zhq0Var = ((qy7) this.b).f;
        if (zhq0Var != null) {
            zhq0Var.o(new mgt0(uri, z));
        } else {
            u890.C("playCommandHandler");
            throw null;
        }
    }

    public void f() {
        zhq0 zhq0Var = ((qy7) this.b).f;
        if (zhq0Var != null) {
            zhq0Var.o(pgt0.a);
        } else {
            u890.C("playCommandHandler");
            throw null;
        }
    }

    public boolean r(View view) {
        ((err) this.b).Z.invoke(lyn.a);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x032c  */
    /* JADX WARN: Code duplicated, block: B:107:0x0334  */
    /* JADX WARN: Code duplicated, block: B:112:0x033c  */
    /* JADX WARN: Code duplicated, block: B:114:0x033f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0341  */
    /* JADX WARN: Code duplicated, block: B:118:0x0348  */
    /* JADX WARN: Code duplicated, block: B:119:0x034c  */
    /* JADX WARN: Code duplicated, block: B:122:0x0358 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x035a  */
    /* JADX WARN: Code duplicated, block: B:124:0x035d  */
    /* JADX WARN: Code duplicated, block: B:131:0x03bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:132:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:133:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:136:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:137:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:140:0x03da  */
    /* JADX WARN: Code duplicated, block: B:141:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:144:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:151:0x0412  */
    /* JADX WARN: Code duplicated, block: B:154:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:155:0x04db  */
    /* JADX WARN: Code duplicated, block: B:158:0x0552  */
    /* JADX WARN: Code duplicated, block: B:159:0x055c  */
    /* JADX WARN: Code duplicated, block: B:162:0x0567  */
    /* JADX WARN: Code duplicated, block: B:163:0x057c  */
    /* JADX WARN: Code duplicated, block: B:166:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:170:0x0610  */
    /* JADX WARN: Code duplicated, block: B:178:0x0663  */
    /* JADX WARN: Code duplicated, block: B:181:0x066e  */
    /* JADX WARN: Code duplicated, block: B:182:0x0684  */
    /* JADX WARN: Code duplicated, block: B:188:0x069f  */
    /* JADX WARN: Code duplicated, block: B:195:0x0707  */
    /* JADX WARN: Code duplicated, block: B:204:0x061d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x060a A[SYNTHETIC] */
    public void v(Object obj) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        String str;
        int i3;
        int i4;
        CharSequence charSequence;
        String str2;
        boolean z3;
        ComposeView composeView;
        TextView textView;
        kil kilVar;
        boolean z4;
        kil kilVar2;
        int i5;
        String str3;
        List listN;
        ArrayList arrayList;
        boolean z5;
        ArtworkView artworkView;
        int i6;
        int i7;
        int i8;
        Drawable drawable;
        Drawable drawableMutate;
        kil kilVar3;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                k160 k160Var = (k160) obj;
                Integer num = k160Var.i;
                boolean z6 = k160Var.h;
                zmr zmrVar = (zmr) obj2;
                h72 h72Var = zmrVar.d;
                kil kilVar4 = zmrVar.i;
                wik wikVar = k160Var.a;
                boolean z7 = k160Var.e;
                e93 e93Var = zmrVar.e;
                if (wikVar == null) {
                    zmrVar.r(true);
                    if (zmrVar.V0) {
                        kilVar4.b((ConstraintLayout) e93Var.b);
                    }
                    zmrVar.V0 = false;
                    zmrVar.e(false);
                    ConstraintLayout constraintLayout = (ConstraintLayout) e93Var.b;
                    ComposeView composeView2 = (ComposeView) e93Var.h;
                    constraintLayout.setBackground(zmrVar.Q0);
                    composeView2.setTranslationY(0.0f);
                    zmrVar.u();
                    Integer numValueOf = z6 ? Integer.valueOf(num != null ? num.intValue() : zmrVar.s(2130968787)) : null;
                    if (numValueOf != null) {
                        h360.j(h72Var, numValueOf.intValue());
                    }
                    ((ArtworkView) e93Var.Y).setVisibility(8);
                    ((ArtworkView) e93Var.Z).setVisibility(8);
                    ((View) e93Var.O0).setVisibility(8);
                    ((CalendarIconView) e93Var.N0).setVisibility(8);
                    ((TextView) e93Var.Q0).setVisibility(8);
                    ((TextView) e93Var.P0).setVisibility(8);
                    ((Space) e93Var.t).setVisibility(0);
                    ((ArtworkView) e93Var.d).setVisibility(k160Var.g ? 0 : 8);
                    ((MultiArtistAvatarView) e93Var.f).setVisibility(0);
                    ((Space) e93Var.e).setVisibility(0);
                    ((CalendarIconView) e93Var.g).setVisibility(0);
                    ((TextView) e93Var.U0).setVisibility(0);
                    ((Space) e93Var.i).setVisibility(0);
                    boolean z8 = k160Var.f;
                    if (z7) {
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) e93Var.b;
                        ViewStub viewStub = (ViewStub) e93Var.c;
                        kil kilVar5 = new kil();
                        kilVar5.f(constraintLayout2);
                        kilVar5.e(composeView2.getId(), 3);
                        kilVar5.e(viewStub.getId(), 3);
                        if (z8) {
                            kilVar5.g(composeView2.getId(), 3, ((TextView) e93Var.R0).getId(), 4);
                            kilVar3 = kilVar5;
                        } else {
                            kilVar5.h(composeView2.getId(), 3, ((TextView) e93Var.V0).getId(), 4, zmrVar.b(8));
                            kilVar3 = kilVar5;
                        }
                        kilVar3.g(viewStub.getId(), 3, composeView2.getId(), 4);
                        kilVar3.b(constraintLayout2);
                    }
                    i6 = 8;
                    z7 = z7;
                    i7 = 0;
                } else {
                    zmrVar.V0 = true;
                    int iS = zmrVar.s(2130968768);
                    Integer numValueOf2 = z6 ? Integer.valueOf(num != null ? num.intValue() : zmrVar.s(2130968787)) : null;
                    String str4 = k160Var.b;
                    h360.j(h72Var, numValueOf2 != null ? numValueOf2.intValue() : iS);
                    ConstraintLayout constraintLayout3 = (ConstraintLayout) e93Var.b;
                    ArtworkView artworkView2 = (ArtworkView) e93Var.Y;
                    TextView textView2 = (TextView) e93Var.P0;
                    tx8 tx8Var = (TextView) e93Var.Q0;
                    CalendarIconView calendarIconView = (CalendarIconView) e93Var.N0;
                    constraintLayout3.setBackgroundColor(iS);
                    zmrVar.u();
                    zmrVar.e(true);
                    String str5 = k160Var.c;
                    String str6 = k160Var.d;
                    Integer num2 = wikVar.f;
                    String str7 = wikVar.c;
                    int i9 = wikVar.e;
                    calendarIconView.f(new xwc(132, num2, wikVar.g, str5, str6, i9 == 2));
                    int iC = l1d.C(i9);
                    if (iC != 0) {
                        i = 1;
                        if (iC != 1) {
                            eg.o();
                        } else {
                            i2 = 56;
                        }
                    } else {
                        i = 1;
                        i2 = 48;
                    }
                    tx8Var.setText(str4);
                    int iC2 = l1d.C(i9);
                    if (iC2 == 0) {
                        t5b1.c(tx8Var);
                        tx8Var.setTypeface(zmrVar.S0);
                    } else if (iC2 != i) {
                        eg.o();
                    } else {
                        t5b1.b(tx8Var, str4, zmrVar.T0);
                    }
                    tx8Var.setEllipsize(TextUtils.TruncateAt.END);
                    if (Build.VERSION.SDK_INT >= 27) {
                        no80.G(tx8Var, i2);
                    } else {
                        if (tx8Var instanceof tx8) {
                            tx8Var.setAutoSizeTextTypeUniformWithConfiguration(24, i2, 1, 2);
                        }
                        zmrVar.w(str4);
                        if (str7 != null || ihc1.y0(str7)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z && i9 == 2) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        str = wikVar.d;
                        if (str != null || !z2) {
                            str = null;
                        }
                        if (z) {
                            i3 = 8;
                        } else {
                            i3 = 0;
                        }
                        textView2.setVisibility(i3);
                        if (z2) {
                            i4 = 2130968787;
                        } else {
                            i4 = 2130968791;
                        }
                        textView2.setTextColor(zmrVar.s(i4));
                        if (z2) {
                            if (str7 == null) {
                                charSequence = "";
                            } else {
                                charSequence = str7;
                            }
                            drawable = zmrVar.a.getDrawable(2131231589);
                            if (drawable != null && (drawableMutate = drawable.mutate()) != null) {
                                int iB = zmrVar.b(12);
                                int iB2 = zmrVar.b(4);
                                drawableMutate.setTint(zmrVar.s(2130968787));
                                InsetDrawable insetDrawable = new InsetDrawable(drawableMutate, iB2, 0, 0, 0);
                                insetDrawable.setBounds(0, 0, iB + iB2, iB);
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                                spannableStringBuilder.append((CharSequence) "￼");
                                spannableStringBuilder.setSpan(new hbe(insetDrawable, (byte) 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                                charSequence = spannableStringBuilder;
                            }
                        } else if (str7 == null) {
                            charSequence = "";
                        } else {
                            charSequence = str7;
                        }
                        textView2.setText(charSequence);
                        if (str7 == null) {
                            str2 = "";
                        } else {
                            str2 = str7;
                        }
                        textView2.setContentDescription(str2);
                        textView2.setMovementMethod(null);
                        textView2.setOnClickListener(null);
                        if (str != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        textView2.setClickable(z3);
                        if (str != null) {
                            textView2.setOnClickListener(new cg1(zmrVar, str, (byte) 28));
                        }
                        ViewStub viewStub2 = (ViewStub) e93Var.c;
                        composeView = (ComposeView) e93Var.h;
                        TextView textView3 = (TextView) e93Var.V0;
                        textView = (TextView) e93Var.X;
                        kilVar4.b(constraintLayout3);
                        kilVar = new kil();
                        kilVar.f(constraintLayout3);
                        if (str7 != null || ihc1.y0(str7)) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        int iB3 = zmrVar.b(16);
                        kilVar.e(tx8Var.getId(), 4);
                        kilVar.e(tx8Var.getId(), 3);
                        kilVar.e(tx8Var.getId(), 6);
                        kilVar.e(tx8Var.getId(), 7);
                        kilVar.e(textView2.getId(), 4);
                        kilVar.e(textView2.getId(), 3);
                        kilVar.e(textView2.getId(), 6);
                        kilVar.e(textView2.getId(), 7);
                        kilVar.e(calendarIconView.getId(), 4);
                        kilVar.e(calendarIconView.getId(), 3);
                        kilVar.e(calendarIconView.getId(), 6);
                        kilVar.e(textView.getId(), 6);
                        kilVar.e(textView.getId(), 7);
                        kilVar.e(textView3.getId(), 6);
                        kilVar.e(textView3.getId(), 7);
                        kilVar.e(composeView.getId(), 3);
                        kilVar.e(textView.getId(), 3);
                        kilVar.e(textView3.getId(), 3);
                        kilVar.e(viewStub2.getId(), 3);
                        if (z4) {
                            kilVar2 = kilVar;
                            kilVar2.h(tx8Var.getId(), 4, artworkView2.getId(), 4, zmrVar.b(16));
                        } else {
                            kilVar2 = kilVar;
                            kilVar2.h(tx8Var.getId(), 4, textView2.getId(), 3, zmrVar.b(4));
                            kilVar2.h(textView2.getId(), 4, artworkView2.getId(), 4, zmrVar.b(16));
                        }
                        kilVar2.h(tx8Var.getId(), 6, 0, 6, iB3);
                        kilVar2.h(tx8Var.getId(), 7, 0, 7, iB3);
                        kilVar2.h(textView2.getId(), 6, 0, 6, iB3);
                        kilVar2.h(textView2.getId(), 7, 0, 7, iB3);
                        kilVar2.h(calendarIconView.getId(), 4, tx8Var.getId(), 3, zmrVar.b(16));
                        kilVar2.h(calendarIconView.getId(), 6, 0, 6, iB3);
                        int id = composeView.getId();
                        int id2 = artworkView2.getId();
                        if (z7 != 0) {
                            i5 = -zmrVar.b(8);
                        } else {
                            i5 = 0;
                        }
                        kilVar2.h(id, 3, id2, 4, i5);
                        if (z7 != 0) {
                            kilVar2.h(textView.getId(), 3, composeView.getId(), 4, zmrVar.b(4));
                        } else {
                            kilVar2.h(textView.getId(), 3, artworkView2.getId(), 4, zmrVar.b(0));
                        }
                        kilVar2.h(textView.getId(), 6, 0, 6, iB3);
                        kilVar2.h(textView.getId(), 7, 0, 7, iB3);
                        kil kilVar6 = kilVar2;
                        kilVar6.g(textView3.getId(), 3, textView.getId(), 4);
                        kilVar2.h(textView3.getId(), 6, 0, 6, iB3);
                        kilVar2.h(textView3.getId(), 7, 0, 7, iB3);
                        kilVar2.h(viewStub2.getId(), 3, textView3.getId(), 4, zmrVar.b(8));
                        kilVar6.b(constraintLayout3);
                        composeView.setTranslationY(0.0f);
                        List list = wikVar.b;
                        str3 = wikVar.a;
                        zmrVar.r(false);
                        listN = list;
                        if (listN.isEmpty()) {
                            listN = p7h.N(str3);
                        }
                        arrayList = new ArrayList();
                        for (Object obj3 : listN) {
                            if (!ihc1.y0((String) obj3)) {
                                arrayList.add(obj3);
                            }
                        }
                        zmrVar.Y0 = o7h.j0(arrayList);
                        zmrVar.Z0 = 0;
                        zmrVar.a1 = artworkView2;
                        zmrVar.b1 = (ArtworkView) e93Var.Z;
                        artworkView2.setAlpha(1.0f);
                        zmr.k(zmrVar.a1, (String) o7h.s0(zmrVar.Y0));
                        zmrVar.a1.setVisibility(0);
                        if (zmrVar.Y0.size() > 1 || !((Boolean) zmrVar.c.invoke()).booleanValue()) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        zmrVar.b1.setAlpha(0.0f);
                        artworkView = zmrVar.b1;
                        if (z5) {
                            zmr.k(artworkView, (String) zmrVar.Y0.get(1));
                            zmrVar.b1.setVisibility(0);
                            zmrVar.l();
                        } else {
                            artworkView.setVisibility(8);
                        }
                        zmrVar.v(wikVar);
                        if (constraintLayout3.isLaidOut() || constraintLayout3.isLayoutRequested()) {
                            constraintLayout3.addOnLayoutChangeListener(new qo9(zmrVar, wikVar, k160Var, (byte) 4));
                        } else {
                            zmrVar.v(wikVar);
                            zmrVar.w(str4);
                        }
                        i6 = 8;
                        ((Space) e93Var.t).setVisibility(8);
                        ((ArtworkView) e93Var.d).setVisibility(8);
                        ((MultiArtistAvatarView) e93Var.f).setVisibility(8);
                        ((Space) e93Var.e).setVisibility(8);
                        ((CalendarIconView) e93Var.g).setVisibility(8);
                        ((TextView) e93Var.U0).setVisibility(8);
                        ((TextView) e93Var.R0).setVisibility(8);
                        ((TextView) e93Var.T0).setVisibility(8);
                        ((Space) e93Var.i).setVisibility(8);
                        i7 = 0;
                        artworkView2.setVisibility(0);
                        ((View) e93Var.O0).setVisibility(0);
                        calendarIconView.setVisibility(0);
                        tx8Var.setVisibility(0);
                        if (str7 != null || ihc1.y0(str7)) {
                            i8 = 8;
                        } else {
                            i8 = 0;
                        }
                        textView2.setVisibility(i8);
                    }
                    zmrVar.w(str4);
                    if (str7 != null) {
                        z = true;
                    } else {
                        z = true;
                    }
                    if (z) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    str = wikVar.d;
                    if (str != null) {
                        str = null;
                    } else {
                        str = null;
                    }
                    if (z) {
                        i3 = 0;
                    } else {
                        i3 = 8;
                    }
                    textView2.setVisibility(i3);
                    if (z2) {
                        i4 = 2130968787;
                    } else {
                        i4 = 2130968791;
                    }
                    textView2.setTextColor(zmrVar.s(i4));
                    if (z2) {
                        if (str7 == null) {
                            charSequence = "";
                        } else {
                            charSequence = str7;
                        }
                        drawable = zmrVar.a.getDrawable(2131231589);
                        if (drawable != null) {
                            int iB4 = zmrVar.b(12);
                            int iB5 = zmrVar.b(4);
                            drawableMutate.setTint(zmrVar.s(2130968787));
                            InsetDrawable insetDrawable2 = new InsetDrawable(drawableMutate, iB5, 0, 0, 0);
                            insetDrawable2.setBounds(0, 0, iB4 + iB5, iB4);
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence);
                            spannableStringBuilder2.append((CharSequence) "￼");
                            spannableStringBuilder2.setSpan(new hbe(insetDrawable2, (byte) 0), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                            charSequence = spannableStringBuilder2;
                        }
                    } else if (str7 == null) {
                        charSequence = "";
                    } else {
                        charSequence = str7;
                    }
                    textView2.setText(charSequence);
                    if (str7 == null) {
                        str2 = "";
                    } else {
                        str2 = str7;
                    }
                    textView2.setContentDescription(str2);
                    textView2.setMovementMethod(null);
                    textView2.setOnClickListener(null);
                    if (str != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    textView2.setClickable(z3);
                    if (str != null) {
                        textView2.setOnClickListener(new cg1(zmrVar, str, (byte) 28));
                    }
                    ViewStub viewStub3 = (ViewStub) e93Var.c;
                    composeView = (ComposeView) e93Var.h;
                    TextView textView4 = (TextView) e93Var.V0;
                    textView = (TextView) e93Var.X;
                    kilVar4.b(constraintLayout3);
                    kilVar = new kil();
                    kilVar.f(constraintLayout3);
                    if (str7 != null) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    int iB6 = zmrVar.b(16);
                    kilVar.e(tx8Var.getId(), 4);
                    kilVar.e(tx8Var.getId(), 3);
                    kilVar.e(tx8Var.getId(), 6);
                    kilVar.e(tx8Var.getId(), 7);
                    kilVar.e(textView2.getId(), 4);
                    kilVar.e(textView2.getId(), 3);
                    kilVar.e(textView2.getId(), 6);
                    kilVar.e(textView2.getId(), 7);
                    kilVar.e(calendarIconView.getId(), 4);
                    kilVar.e(calendarIconView.getId(), 3);
                    kilVar.e(calendarIconView.getId(), 6);
                    kilVar.e(textView.getId(), 6);
                    kilVar.e(textView.getId(), 7);
                    kilVar.e(textView4.getId(), 6);
                    kilVar.e(textView4.getId(), 7);
                    kilVar.e(composeView.getId(), 3);
                    kilVar.e(textView.getId(), 3);
                    kilVar.e(textView4.getId(), 3);
                    kilVar.e(viewStub3.getId(), 3);
                    if (z4) {
                        kilVar2 = kilVar;
                        kilVar2.h(tx8Var.getId(), 4, textView2.getId(), 3, zmrVar.b(4));
                        kilVar2.h(textView2.getId(), 4, artworkView2.getId(), 4, zmrVar.b(16));
                    } else {
                        kilVar2 = kilVar;
                        kilVar2.h(tx8Var.getId(), 4, artworkView2.getId(), 4, zmrVar.b(16));
                    }
                    kilVar2.h(tx8Var.getId(), 6, 0, 6, iB6);
                    kilVar2.h(tx8Var.getId(), 7, 0, 7, iB6);
                    kilVar2.h(textView2.getId(), 6, 0, 6, iB6);
                    kilVar2.h(textView2.getId(), 7, 0, 7, iB6);
                    kilVar2.h(calendarIconView.getId(), 4, tx8Var.getId(), 3, zmrVar.b(16));
                    kilVar2.h(calendarIconView.getId(), 6, 0, 6, iB6);
                    int id3 = composeView.getId();
                    int id4 = artworkView2.getId();
                    if (z7 != 0) {
                        i5 = -zmrVar.b(8);
                    } else {
                        i5 = 0;
                    }
                    kilVar2.h(id3, 3, id4, 4, i5);
                    if (z7 != 0) {
                        kilVar2.h(textView.getId(), 3, composeView.getId(), 4, zmrVar.b(4));
                    } else {
                        kilVar2.h(textView.getId(), 3, artworkView2.getId(), 4, zmrVar.b(0));
                    }
                    kilVar2.h(textView.getId(), 6, 0, 6, iB6);
                    kilVar2.h(textView.getId(), 7, 0, 7, iB6);
                    kil kilVar7 = kilVar2;
                    kilVar7.g(textView4.getId(), 3, textView.getId(), 4);
                    kilVar2.h(textView4.getId(), 6, 0, 6, iB6);
                    kilVar2.h(textView4.getId(), 7, 0, 7, iB6);
                    kilVar2.h(viewStub3.getId(), 3, textView4.getId(), 4, zmrVar.b(8));
                    kilVar7.b(constraintLayout3);
                    composeView.setTranslationY(0.0f);
                    List list2 = wikVar.b;
                    str3 = wikVar.a;
                    zmrVar.r(false);
                    listN = list2;
                    if (listN.isEmpty()) {
                        listN = p7h.N(str3);
                    }
                    arrayList = new ArrayList();
                    while (r2.hasNext()) {
                        if (!ihc1.y0((String) obj3)) {
                            arrayList.add(obj3);
                        }
                    }
                    zmrVar.Y0 = o7h.j0(arrayList);
                    zmrVar.Z0 = 0;
                    zmrVar.a1 = artworkView2;
                    zmrVar.b1 = (ArtworkView) e93Var.Z;
                    artworkView2.setAlpha(1.0f);
                    zmr.k(zmrVar.a1, (String) o7h.s0(zmrVar.Y0));
                    zmrVar.a1.setVisibility(0);
                    if (zmrVar.Y0.size() > 1) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    zmrVar.b1.setAlpha(0.0f);
                    artworkView = zmrVar.b1;
                    if (z5) {
                        zmr.k(artworkView, (String) zmrVar.Y0.get(1));
                        zmrVar.b1.setVisibility(0);
                        zmrVar.l();
                    } else {
                        artworkView.setVisibility(8);
                    }
                    zmrVar.v(wikVar);
                    if (constraintLayout3.isLaidOut()) {
                        constraintLayout3.addOnLayoutChangeListener(new qo9(zmrVar, wikVar, k160Var, (byte) 4));
                    } else {
                        constraintLayout3.addOnLayoutChangeListener(new qo9(zmrVar, wikVar, k160Var, (byte) 4));
                    }
                    i6 = 8;
                    ((Space) e93Var.t).setVisibility(8);
                    ((ArtworkView) e93Var.d).setVisibility(8);
                    ((MultiArtistAvatarView) e93Var.f).setVisibility(8);
                    ((Space) e93Var.e).setVisibility(8);
                    ((CalendarIconView) e93Var.g).setVisibility(8);
                    ((TextView) e93Var.U0).setVisibility(8);
                    ((TextView) e93Var.R0).setVisibility(8);
                    ((TextView) e93Var.T0).setVisibility(8);
                    ((Space) e93Var.i).setVisibility(8);
                    i7 = 0;
                    artworkView2.setVisibility(0);
                    ((View) e93Var.O0).setVisibility(0);
                    calendarIconView.setVisibility(0);
                    tx8Var.setVisibility(0);
                    if (str7 != null) {
                        i8 = 8;
                    } else {
                        i8 = 8;
                    }
                    textView2.setVisibility(i8);
                }
                ((ComposeView) e93Var.h).setVisibility(z7 ? i7 : i6);
                break;
            case 3:
                String str8 = (String) obj;
                srr srrVar = (srr) obj2;
                ((TextView) srrVar.a.Y).setText(str8);
                wdm wdmVar = srrVar.b;
                MotionLayout motionLayout = (MotionLayout) wdmVar.b;
                if (!motionLayout.isLaidOut() || motionLayout.isLayoutRequested()) {
                    motionLayout.addOnLayoutChangeListener(new x37(wdmVar, str8, (byte) 5));
                } else {
                    float height = motionLayout.getHeight() * 0.3f;
                    TextView textView5 = (TextView) wdmVar.Z;
                    Float fValueOf = Float.valueOf(height);
                    rr80 rr80VarO = yoi1.O(ebp1.m(56, 24, -1), 1);
                    rr80 rr80Var = o9m.a;
                    aiq0.a(textView5, new n9m(textView5, textView5, str8, fValueOf, rr80VarO, (byte) 0));
                }
                break;
            case 5:
                ((z800) obj).getClass();
                ((TextView) ((dxy) ((yir) obj2).c).e).setText("");
                break;
            case 8:
                String str9 = (String) obj;
                str9.getClass();
                ((TextView) ((em0) ((ngr) obj2).c).i).setText(str9);
                break;
            case 9:
                hzn hznVar = (hzn) obj;
                ytp0 ytp0Var = ((uhs) obj2).f;
                if (hznVar != null) {
                    ((CreatorButtonView) ytp0Var.d).setVisibility(0);
                    ((CreatorButtonView) ytp0Var.d).y(hznVar);
                } else {
                    ((CreatorButtonView) ytp0Var.d).setVisibility(8);
                }
                break;
            default:
                snf1 snf1Var = (snf1) obj;
                lvs lvsVar = (lvs) obj2;
                snf1Var.getClass();
                String str10 = lvsVar.t;
                cet0 cet0Var = snf1Var.g;
                boolean z9 = cet0Var.b.a;
                ip31 ip31Var = lvsVar.d;
                ((ShuffleButtonView) ip31Var.h).setVisibility(0);
                ShuffleButtonView shuffleButtonView = (ShuffleButtonView) ip31Var.h;
                shuffleButtonView.setImageDrawable(z9 ? shuffleButtonView.d : shuffleButtonView.e);
                shuffleButtonView.setContentDescription(z9 ? str10 != null ? shuffleButtonView.getContext().getString(2131962442, str10) : shuffleButtonView.getContext().getString(2131962441) : str10 != null ? shuffleButtonView.getContext().getString(2131962444, str10) : shuffleButtonView.getContext().getString(2131962443));
                lvsVar.e.B(cet0.a(cet0.a(cet0Var, new zft0(false, false), (String) null, 5), (egt0) null, str10, 3));
                break;
        }
    }

    public /* synthetic */ rmr(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public Object apply(Object obj, Object obj2) {
        return o7h.a1((List) obj2, ((v7p) ((qn1) this.b).b).a((Map) obj));
    }
}
