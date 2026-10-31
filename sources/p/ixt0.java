package p;

import android.content.Context;
import android.icu.text.CompactDecimalFormat;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.nowplaying.scroll.ScrollCardType;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ixt0 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ixt0(Object obj, byte b) {
        super(4);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:314:0x096e  */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        esu0 dsu0Var;
        mq70 mq70Var;
        up70 up70VarA;
        Object obj5;
        String quantityString;
        String strValueOf;
        CompactDecimalFormat compactDecimalFormat;
        w7h1 w7h1Var;
        int i;
        Object obj6;
        int i2;
        lee1 lee1Var;
        Object obj7;
        w7h1 w7h1Var2;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        byte b2 = 14;
        boolean z = true;
        Object obj8 = this.b;
        switch (b) {
            case 0:
                return new i34((Context) obj2, (jxt0) obj8);
            case 1:
                Context context = (Context) obj2;
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                nou0 nou0Var = (nou0) obj8;
                qfv qfvVarM0 = fdg1.m0(nou0Var.a, new ViewGroup.LayoutParams(-2, -2), (ScrollCardType) null, 2);
                tka0 tka0Var = dtw.C;
                dtw dtwVarD = mhc.d(context, frameLayout, qfvVarM0, (drw) null, 24);
                frameLayout.addView(dtwVarD.w);
                return new vh(frameLayout, dtwVarD, nou0Var);
            case 2:
                jjm0 jjm0Var = (jjm0) obj;
                boolean z2 = true;
                csu0 csu0Var = (csu0) obj2;
                int iIntValue = ((Number) obj4).intValue();
                m4c m4cVar = fkj0.X;
                String str = csu0Var.b;
                x340 x340Var = (b0k) obj3;
                x340Var.i0(-589997472);
                String str2 = csu0Var.a;
                boolean zG = x340Var.g(str2);
                rsu0 rsu0Var = (rsu0) obj8;
                Object objT = x340Var.T();
                Object obj9 = objT;
                if (zG || objT == m4cVar) {
                    zob1 zob1Var = (zob1) new xul1(rsu0Var, (byte) 0).invoke(csu0Var);
                    x340Var.s0(zob1Var);
                    obj9 = zob1Var;
                }
                ven0 ven0VarH = rwq.h((zob1) obj9, x340Var, 0);
                Object objT2 = x340Var.T();
                Object obj10 = objT2;
                if (objT2 == m4cVar) {
                    hrr0 hrr0VarQ = v8r.q(Boolean.FALSE);
                    x340Var.s0(hrr0VarQ);
                    obj10 = hrr0VarQ;
                }
                ven0 ven0Var = (ven0) obj10;
                boolean zI = x340Var.i(rsu0Var);
                if ((((iIntValue & 112) ^ 48) <= 32 || !x340Var.i(csu0Var)) && (iIntValue & 48) != 32) {
                    z2 = false;
                }
                boolean zI2 = zI | z2 | x340Var.i(jjm0Var) | x340Var.i(ven0Var);
                Object objT3 = x340Var.T();
                if (zI2 || objT3 == m4cVar) {
                    o6q0 o6q0Var = new o6q0(rsu0Var, csu0Var, jjm0Var, ven0Var, (lnm) null);
                    x340Var.s0(o6q0Var);
                    objT3 = o6q0Var;
                }
                jjm0Var.a((zu30) objT3, x340Var, (iIntValue << 3) & 112);
                if (str.length() == 0) {
                    dsu0Var = new esu0(csu0Var.e);
                } else {
                    boolean z3 = csu0Var.c;
                    u061 u061Var = ((isu0) ven0VarH.getValue()).a;
                    boolean z4 = u061Var != null ? u061Var.a : false;
                    xkk1 xkk1Var = ((isu0) ven0VarH.getValue()).b;
                    dsu0Var = new dsu0(str2, str, z3, z4, (xkk1Var == null || (mq70Var = xkk1Var.a) == null || (up70VarA = mq70Var.a(vp70.c)) == null) ? null : up70VarA.a.a, csu0Var.d, csu0Var.e, ((Boolean) ven0Var.getValue()).booleanValue());
                }
                x340Var.r(false);
                return dsu0Var;
            case 3:
                return new k9e0((Context) obj2, (q1v0) obj8, (ViewGroup) obj3);
            case 4:
                return new u3((Context) obj2, (rt01) obj8);
            case 5:
                return new vh((yfx) obj8, (iu30) obj4, (Context) obj2);
            case 6:
                hrr0 hrr0VarQ2 = v8r.q((Object) null);
                ComposeView composeView = new ComposeView((Context) obj2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                composeView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) composeView.getLayoutParams();
                DisplayMetrics displayMetrics = composeView.getContext().getResources().getDisplayMetrics();
                displayMetrics.getClass();
                int iApplyDimension = (int) TypedValue.applyDimension(1, 16.0f, displayMetrics);
                int iApplyDimension2 = (int) TypedValue.applyDimension(1, 12.0f, displayMetrics);
                marginLayoutParams.setMargins(iApplyDimension, iApplyDimension2, iApplyDimension, iApplyDimension2);
                composeView.setLayoutParams(marginLayoutParams);
                composeView.setContent(new j2i(1670622257, new tbs0(hrr0VarQ2, (dx0) obj8, (iu30) obj4, (byte) 20), true));
                return new yet(composeView, hrr0VarQ2, (byte) 2);
            case 7:
                dx0 dx0Var = (dx0) obj8;
                mfs mfsVarA = ((zfx) dx0Var.d).a((l0i) null);
                rt01 rt01VarA = ((ryp) dx0Var.e).a();
                kdn0 kdn0Var = new kdn0();
                ne neVar = new ne(3, new hzu0(kdn0Var, rt01VarA, b2));
                mfs mfsVar = mfsVarA;
                mfsVar.n(new ppv0((iu30) obj4, (byte) 2));
                RecyclerView recyclerViewFindViewById = ((ConstraintLayout) ((phi0) mfsVar.c).d).findViewById(2131429044);
                recyclerViewFindViewById.getClass();
                neVar.f(recyclerViewFindViewById, new LinearLayoutManager(1), false);
                return new u3(mfsVarA, new l811(), recyclerViewFindViewById, kdn0Var);
            case 8:
                return new zuv0((avv0) obj8, (d75) obj, (ViewGroup) obj3);
            case 9:
                ((Number) obj3).intValue();
                return (rol0) ((yup0) obj8).e;
            case 10:
                jjm0 jjm0Var2 = (jjm0) obj;
                ezv0 ezv0Var = (ezv0) obj2;
                int iIntValue2 = ((Number) obj4).intValue();
                x340 x340Var2 = (b0k) obj3;
                x340Var2.i0(-788187059);
                long j = ezv0Var.c;
                cm0 cm0Var = (cm0) obj8;
                ZoneId zoneIdOf = (ZoneId) cm0Var.e;
                boolean z5 = j <= ZonedDateTime.now(zoneIdOf).toEpochSecond();
                ven0 ven0VarG = rwq.g(yoi1.g(((s4w0) cm0Var.d).b(z5 ? ezv0Var.k : ezv0Var.d)), Boolean.FALSE, (o8n) null, x340Var2, 48, 2);
                boolean zI3 = x340Var2.i(cm0Var);
                Object objT4 = x340Var2.T();
                if (zI3 || objT4 == fkj0.X) {
                    obj5 = objT4;
                    w63 w63Var = new w63(cm0Var, (lnm) null, (byte) 15);
                    x340Var2.s0(w63Var);
                    obj5 = w63Var;
                }
                obj5 = objT4;
                jjm0Var2.a((zu30) obj5, x340Var2, (iIntValue2 << 3) & 112);
                boolean zBooleanValue = ((Boolean) ven0VarG.getValue()).booleanValue();
                String str3 = ezv0Var.a;
                String str4 = ezv0Var.l;
                String str5 = ezv0Var.b;
                String str6 = ezv0Var.d;
                ArrayList arrayList = ezv0Var.e;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((hb6) it.next()).a);
                }
                String strY0 = o7h.y0(o7h.l1(arrayList2), ((quc0) cm0Var.h).b(), (String) null, (String) null, (iu30) null, 62);
                Locale locale = (Locale) cm0Var.f;
                ZoneId zoneIdOf2 = (str4 == null || str4.length() == 0) ? zoneIdOf : ZoneId.of(str4);
                String str7 = Instant.ofEpochSecond(j).atZone(zoneIdOf2).toLocalDate().format(DateTimeFormatter.ofPattern(DateFormat.getBestDateTimePattern(locale, "MMM d"), locale).withZone(zoneIdOf2));
                if (str4 != null && str4.length() != 0) {
                    zoneIdOf = ZoneId.of(str4);
                }
                int iBetween = (int) ChronoUnit.DAYS.between(LocalDate.now(zoneIdOf), Instant.ofEpochSecond(j).atZone(zoneIdOf).toLocalDate());
                Long l = ezv0Var.f;
                if (l != null) {
                    xmu0 xmu0Var = (xmu0) cm0Var.i;
                    long jLongValue = l.longValue();
                    if (1000 > jLongValue || jLongValue > Long.MAX_VALUE || (compactDecimalFormat = CompactDecimalFormat.getInstance((Locale) xmu0Var.b, CompactDecimalFormat.CompactStyle.SHORT)) == null) {
                        strValueOf = String.valueOf(jLongValue);
                    } else {
                        compactDecimalFormat.setMaximumFractionDigits(jLongValue < 1000000 ? 1 : 2);
                        compactDecimalFormat.setRoundingMode(RoundingMode.DOWN.ordinal());
                        strValueOf = compactDecimalFormat.format(jLongValue);
                        if (strValueOf == null) {
                            strValueOf = String.valueOf(jLongValue);
                        }
                    }
                    quantityString = ((Context) xmu0Var.c).getResources().getQuantityString(2131820860, (int) jLongValue, strValueOf);
                } else {
                    quantityString = null;
                }
                gzv0 gzv0Var = new gzv0(str3, str5, str6, strY0, str7, iBetween, z5, zBooleanValue, quantityString, ezv0Var.g, mqo1.A(arrayList), mqo1.A(ezv0Var.h), ezv0Var.i, ezv0Var.k);
                x340Var2.r(false);
                return gzv0Var;
            case 11:
                return new y9n((tzv0) obj8, (iu30) obj4);
            case 12:
                zhl0 zhl0Var = (zhl0) obj;
                q0w0 q0w0Var = (q0w0) obj3;
                p0w0 p0w0Var = (p0w0) obj4;
                r6h1 r6h1Var = zhl0Var.a;
                y6h1 y6h1Var = zhl0Var.b;
                String str8 = ((oyv0) obj2).a;
                if (p0w0Var.equals(p0w0.a)) {
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str8)), y6h1Var, r6h1Var, System.currentTimeMillis());
                } else {
                    if (!p0w0Var.equals(p0w0.b)) {
                        eg.o();
                        return null;
                    }
                    String str9 = new y6b1(str8, false).e;
                    if (str9 == null) {
                        return null;
                    }
                    String str10 = (String) ((n0o) obj8).t;
                    if (q0w0Var.i) {
                        x6h1 x6h1VarC = y6h1Var.c();
                        x6h1VarC.i.add(new a7h1("presave_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_presave", 1, sqg0.J(new mmr0[]{new mmr0("prerelease_id", str9), new mmr0("item_to_be_removed_from_presaved", str8), new mmr0("context_uri", str10 != null ? str10 : "")})), x6h1VarC.a(), r6h1Var, System.currentTimeMillis());
                    } else {
                        x6h1 x6h1VarC2 = y6h1Var.c();
                        x6h1VarC2.i.add(new a7h1("presave_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC2.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("presave", 1, sqg0.J(new mmr0[]{new mmr0("prerelease_id", str9), new mmr0("item_to_be_presaved", str8), new mmr0("context_uri", str10 != null ? str10 : "")})), x6h1VarC2.a(), r6h1Var, System.currentTimeMillis());
                    }
                }
                return w7h1Var;
            case 13:
                int iIntValue3 = ((Number) obj2).intValue();
                int iIntValue4 = ((Number) obj4).intValue();
                m4c m4cVar2 = fkj0.X;
                z511 z511Var = (z511) obj8;
                x340 x340Var3 = (b0k) obj3;
                int i3 = (iIntValue4 & 112) ^ 48;
                boolean zI4 = x340Var3.i(z511Var) | ((i3 > 32 && x340Var3.e(iIntValue3)) || (iIntValue4 & 48) == 32);
                Object objT5 = x340Var3.T();
                Object obj11 = objT5;
                if (zI4 || objT5 == m4cVar2) {
                    tdx0 tdx0Var = new tdx0(z511Var, iIntValue3, (byte) 0);
                    x340Var3.s0(tdx0Var);
                    obj11 = tdx0Var;
                }
                iu30 iu30Var = (iu30) obj11;
                boolean zI5 = x340Var3.i(z511Var);
                Object objT6 = x340Var3.T();
                Object obj12 = objT6;
                if (zI5 || objT6 == m4cVar2) {
                    mwv0 mwv0Var = new mwv0(z511Var, (byte) 23);
                    x340Var3.s0(mwv0Var);
                    obj12 = mwv0Var;
                }
                iu30 iu30Var2 = (iu30) obj12;
                boolean zI6 = x340Var3.i(z511Var) | ((i3 > 32 && x340Var3.e(iIntValue3)) || (iIntValue4 & 48) == 32);
                Object objT7 = x340Var3.T();
                Object obj13 = objT7;
                if (zI6 || objT7 == m4cVar2) {
                    tdx0 tdx0Var2 = new tdx0(z511Var, iIntValue3, (byte) 1);
                    x340Var3.s0(tdx0Var2);
                    obj13 = tdx0Var2;
                }
                dm5.b(iu30Var, nim0.a, (iu30) null, iu30Var2, (iu30) obj13, x340Var3, 48, 4);
                return rih1Var;
            case 14:
                sgx0 sgx0Var = (sgx0) obj2;
                ((Number) obj4).intValue();
                x340 x340Var4 = (b0k) obj3;
                x340Var4.i0(-1403405455);
                ugx0 ugx0Var = (ugx0) obj8;
                Object objT8 = x340Var4.T();
                Object obj14 = objT8;
                if (objT8 == fkj0.X) {
                    ay8 ay8VarH = d3p1.H(ugx0Var.a, ugx0Var.c, sgx0Var);
                    x340Var4.s0(ay8VarH);
                    obj14 = ay8VarH;
                }
                ven0 ven0VarH2 = rwq.h((zob1) obj14, x340Var4, 0);
                boolean z6 = sgx0Var instanceof qgx0;
                iix0 hix0Var = ugx0.g;
                if (z6) {
                    iix0 iix0Var = ((pgx0) ven0VarH2.getValue()).a;
                    if (iix0Var != null) {
                        hix0Var = iix0Var;
                    }
                } else {
                    if (!(sgx0Var instanceof rgx0)) {
                        eg.o();
                        return null;
                    }
                    hll hllVar = ((pgx0) ven0VarH2.getValue()).b;
                    rgx0 rgx0Var = (rgx0) sgx0Var;
                    long j2 = rgx0Var.d;
                    long j3 = rgx0Var.c;
                    if (hllVar != null) {
                        long jH = jfv.h(hllVar.a);
                        long j4 = j2 + j3;
                        if (j4 >= jH) {
                            hix0Var = new hix0(true, jH);
                        } else {
                            hix0Var = j4 <= 0 ? new hix0(false, jH) : new gix0(jH, j4, false);
                        }
                    }
                }
                tgx0 tgx0Var = new tgx0(hix0Var);
                x340Var4.r(false);
                return tgx0Var;
            case 15:
                t67 t67Var = (t67) obj;
                iu30 iu30Var3 = (iu30) obj2;
                x340 x340Var5 = (b0k) obj3;
                int iIntValue5 = ((Number) obj4).intValue();
                m4c m4cVar3 = fkj0.X;
                m2y0 m2y0Var = (m2y0) obj8;
                if ((iIntValue5 & 6) == 0) {
                    i = iIntValue5 | (x340Var5.g(t67Var) ? 4 : 2);
                } else {
                    i = iIntValue5;
                }
                if ((iIntValue5 & 48) == 0) {
                    i |= x340Var5.i(iu30Var3) ? 32 : 16;
                }
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(i & 1, (i & 147) != 146)) {
                    boolean zI7 = x340Var6.i(m2y0Var);
                    Object objT9 = x340Var6.T();
                    if (zI7 || objT9 == m4cVar3) {
                        obj6 = objT9;
                        l2y0 l2y0Var = new l2y0(m2y0Var, (byte) 0);
                        x340Var6.s0(l2y0Var);
                        obj6 = l2y0Var;
                    }
                    qxd0.i(rih1Var, (iu30) obj6, x340Var6);
                    List list = t67Var.a;
                    p40 p40Var = m2y0Var.d;
                    hz5 hz5Var = m2y0Var.e;
                    op41 op41Var = t67Var.b;
                    int i4 = t67Var.c;
                    xmu0 xmu0Var2 = m2y0Var.f;
                    boolean z7 = (i & 112) == 32;
                    Object objT10 = x340Var6.T();
                    Object obj15 = objT10;
                    if (z7 || objT10 == m4cVar3) {
                        h7w0 h7w0Var = new h7w0(iu30Var3, (byte) 24);
                        x340Var6.s0(h7w0Var);
                        obj15 = h7w0Var;
                    }
                    Function0 function0 = (Function0) obj15;
                    boolean zI8 = x340Var6.i(m2y0Var);
                    Object objT11 = x340Var6.T();
                    Object obj16 = objT11;
                    if (zI8 || objT11 == m4cVar3) {
                        l2y0 l2y0Var2 = new l2y0(m2y0Var, (byte) 1);
                        x340Var6.s0(l2y0Var2);
                        obj16 = l2y0Var2;
                    }
                    iu30 iu30Var4 = (iu30) obj16;
                    boolean zI9 = x340Var6.i(m2y0Var);
                    Object objT12 = x340Var6.T();
                    Object obj17 = objT12;
                    if (zI9 || objT12 == m4cVar3) {
                        h2y0 h2y0Var = new h2y0(m2y0Var, true ? 1 : 0);
                        x340Var6.s0(h2y0Var);
                        obj17 = h2y0Var;
                    }
                    ryn1.g(list, p40Var, hz5Var, op41Var, i4, xmu0Var2, function0, iu30Var4, (Function0) obj17, iu30Var3, (qim0) null, 0, x340Var6, (i << 24) & 1879048192);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 16:
                hrl0 hrl0Var = (hrl0) obj;
                z3y0 z3y0Var = (z3y0) obj3;
                y6h1 y6h1Var2 = hrl0Var.a;
                r6h1 r6h1Var2 = hrl0Var.b.a;
                if (((y3y0) obj4).equals(t3y0.a)) {
                    return z3y0Var.d != null ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var2, r6h1Var2, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ktv.c((String) ((rwj) obj8).d))), y6h1Var2, r6h1Var2, System.currentTimeMillis());
                }
                return null;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                dml0 dml0Var = (dml0) obj;
                e8y0 e8y0Var = (e8y0) obj3;
                c8y0 c8y0Var = (c8y0) obj4;
                if (c8y0Var instanceof b8y0) {
                    return null;
                }
                if (c8y0Var instanceof a8y0) {
                    return dml0Var.a(ezn1.s((String) ((z72) obj8).e, e8y0Var.b, e8y0Var.c, e8y0Var.d == 3));
                }
                eg.o();
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                int iIntValue6 = ((Number) obj2).intValue();
                b0k b0kVar = (b0k) obj3;
                ((Number) obj4).intValue();
                List list2 = (List) obj8;
                String str11 = (String) o7h.t0(iIntValue6, list2);
                if (str11 == null) {
                    str11 = (String) o7h.q0(list2);
                }
                uwr uwrVar = cbx.a;
                uwo1.e(str11, (qim0) null, cbx.d(b0kVar).j, cbx.a(b0kVar).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar, 0, 0, 1714);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                jjm0 jjm0Var3 = (jjm0) obj;
                int iIntValue7 = ((Number) obj4).intValue();
                res resVar = (res) obj8;
                x340 x340Var7 = (b0k) obj3;
                x340Var7.i0(-330201368);
                Object objT13 = x340Var7.T();
                m4c m4cVar4 = fkj0.X;
                Object obj18 = objT13;
                if (objT13 == m4cVar4) {
                    hrr0 hrr0VarQ3 = v8r.q(Boolean.FALSE);
                    x340Var7.s0(hrr0VarQ3);
                    obj18 = hrr0VarQ3;
                }
                ven0 ven0Var2 = (ven0) obj18;
                ven0 ven0VarG2 = rwq.g(((cxv) resVar.g).b, z6x.a, (o8n) null, x340Var7, 48, 2);
                boolean zI10 = x340Var7.i(ven0Var2) | x340Var7.i(resVar) | x340Var7.i(ven0VarG2);
                Object objT14 = x340Var7.T();
                Object obj19 = objT14;
                if (zI10 || objT14 == m4cVar4) {
                    kw0 kw0Var = new kw0(resVar, ven0Var2, ven0VarG2, (lnm) null);
                    x340Var7.s0(kw0Var);
                    obj19 = kw0Var;
                }
                jjm0Var3.a((zu30) obj19, x340Var7, (iIntValue7 << 3) & 112);
                int size = ((List) ven0VarG2.getValue()).size();
                boolean zBooleanValue2 = ((Boolean) ven0Var2.getValue()).booleanValue();
                List list3 = (List) ven0VarG2.getValue();
                if ((list3 instanceof Collection) && list3.isEmpty()) {
                    z = false;
                } else {
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        if (((rnu0) it2.next()).d) {
                        }
                    }
                    z = false;
                }
                eoy0 eoy0Var = new eoy0(size, z, zBooleanValue2);
                x340Var7.r(false);
                return eoy0Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                iu30 iu30Var5 = (iu30) obj2;
                x340 x340Var8 = (b0k) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                if ((iIntValue8 & 48) == 0) {
                    iIntValue8 |= x340Var8.i(iu30Var5) ? 32 : 16;
                }
                x340 x340Var9 = x340Var8;
                if (x340Var9.Y(iIntValue8 & 1, (iIntValue8 & 145) != 144)) {
                    ((bry0) obj8).c(iu30Var5, x340Var9, (iIntValue8 >> 3) & 14);
                } else {
                    x340Var9.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                iu30 iu30Var6 = (iu30) obj2;
                x340 x340Var10 = (b0k) obj3;
                int iIntValue9 = ((Number) obj4).intValue();
                if ((iIntValue9 & 48) == 0) {
                    iIntValue9 |= x340Var10.i(iu30Var6) ? 32 : 16;
                }
                x340 x340Var11 = x340Var10;
                if (x340Var11.Y(iIntValue9 & 1, (iIntValue9 & 145) != 144)) {
                    ((zry0) obj8).c(iu30Var6, x340Var11, (iIntValue9 >> 3) & 14);
                } else {
                    x340Var11.b0();
                }
                return rih1Var;
            case 22:
                iu30 iu30Var7 = (iu30) obj2;
                x340 x340Var12 = (b0k) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                if ((iIntValue10 & 48) == 0) {
                    iIntValue10 |= x340Var12.i(iu30Var7) ? 32 : 16;
                }
                x340 x340Var13 = x340Var12;
                if (x340Var13.Y(iIntValue10 & 1, (iIntValue10 & 145) != 144)) {
                    ((ity0) obj8).c(iu30Var7, x340Var13, (iIntValue10 >> 3) & 14);
                } else {
                    x340Var13.b0();
                }
                return rih1Var;
            case 23:
                fuy0 fuy0Var = (fuy0) obj;
                iu30 iu30Var8 = (iu30) obj2;
                x340 x340Var14 = (b0k) obj3;
                int iIntValue11 = ((Number) obj4).intValue();
                if ((iIntValue11 & 6) == 0) {
                    i2 = iIntValue11 | (x340Var14.g(fuy0Var) ? 4 : 2);
                } else {
                    i2 = iIntValue11;
                }
                if ((iIntValue11 & 48) == 0) {
                    i2 |= x340Var14.i(iu30Var8) ? 32 : 16;
                }
                x340 x340Var15 = x340Var14;
                if (x340Var15.Y(i2 & 1, (i2 & 147) != 146)) {
                    fuy0Var.getClass();
                    ((huy0) obj8).c(fuy0Var, iu30Var8, x340Var15, i2 & 112);
                } else {
                    x340Var15.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new CompletableFromAction(new wf0((p9z0) obj2, (tqw) obj4, (q9z0) obj8, (byte) 16));
            case 25:
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                x340 x340Var16 = (b0k) obj3;
                ((Number) obj4).intValue();
                mmr0 mmr0Var = zBooleanValue3 ? new mmr0(2131960766, 2131960765) : new mmr0(2131960772, 2131960772);
                int iIntValue12 = ((Number) mmr0Var.a).intValue();
                String strO0 = cwl1.o0(x340Var16, ((Number) mmr0Var.b).intValue());
                String strO1 = cwl1.o0(x340Var16, iIntValue12);
                if (((p9z0) obj8).d) {
                    x340 x340Var17 = x340Var16;
                    x340Var17.i0(-1034151253);
                    uwr uwrVar2 = cbx.a;
                    lee1Var = cbx.d(x340Var17).h;
                    x340Var17.r(false);
                } else {
                    x340 x340Var18 = x340Var16;
                    x340Var18.i0(-1034149721);
                    uwr uwrVar3 = cbx.a;
                    lee1Var = cbx.d(x340Var18).e;
                    x340Var18.r(false);
                }
                lee1 lee1Var2 = lee1Var;
                vul1 vul1Var = new vul1(xl3.a);
                x340 x340Var19 = x340Var16;
                boolean zG2 = x340Var19.g(strO0);
                Object objT15 = x340Var19.T();
                if (zG2 || objT15 == fkj0.X) {
                    obj7 = objT15;
                    q4z0 q4z0Var = new q4z0(strO0, (byte) 2);
                    x340Var19.s0(q4z0Var);
                    obj7 = q4z0Var;
                }
                obj7 = objT15;
                uwo1.e(strO1, s161.b(vul1Var, false, (iu30) obj7), lee1Var2, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var19, 0, 0, 2040);
                return rih1Var;
            case 26:
                ((Number) obj3).intValue();
                miz0 miz0Var = (miz0) obj8;
                String str12 = miz0Var.a.a;
                jce jceVar = miz0Var.g;
                return new ksl0((jceVar != null ? jceVar.b : null) != null ? 1 : 2, str12);
            case 27:
                msl0 msl0Var = (msl0) obj;
                djz0 djz0Var = (djz0) obj4;
                r6h1 r6h1Var3 = msl0Var.a;
                y6h1 y6h1Var3 = msl0Var.b;
                if (djz0Var.equals(bjz0.a)) {
                    x6h1 x6h1VarC3 = y6h1Var3.c();
                    x6h1VarC3.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC3.a(), r6h1Var3, System.currentTimeMillis());
                } else {
                    if (!djz0Var.equals(cjz0.a)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC4 = y6h1Var3.c();
                    x6h1VarC4.i.add(new a7h1("upsell_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    y6h1 y6h1VarA = x6h1VarC4.a();
                    String str13 = (String) ((jjz0) obj8).c.getValue();
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str13 != null ? str13 : "")), y6h1VarA, r6h1Var3, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 28:
                ((Number) obj3).intValue();
                return ((yjz0) obj8).c;
            default:
                ((Number) obj3).intValue();
                wsl0 wsl0Var = ((hkz0) obj8).b;
                String str14 = ((ekz0) obj).a;
                wsl0Var.getClass();
                return new vsl0(wsl0Var, str14);
        }
    }
}
