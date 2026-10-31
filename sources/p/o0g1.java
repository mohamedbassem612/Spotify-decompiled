package p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.text.SpannableString;
import android.text.style.BulletSpan;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import j$.time.Clock;
import j$.time.DayOfWeek;
import j$.time.Month;
import j$.time.format.TextStyle;
import j$.time.temporal.WeekFields;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class o0g1 implements za21, Function, ps40, z57, b1h1, mi51 {
    public final /* synthetic */ byte a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public o0g1(Locale locale, Clock clock) {
        this.a = (byte) 3;
        this.c = locale;
        this.d = clock;
        this.b = WeekFields.of(locale).getFirstDayOfWeek().getValue();
        DayOfWeek[] dayOfWeekArrValues = DayOfWeek.values();
        ArrayList arrayList = new ArrayList(dayOfWeekArrValues.length);
        for (DayOfWeek dayOfWeek : dayOfWeekArrValues) {
            arrayList.add(new mmr0(dayOfWeek.getDisplayName(TextStyle.FULL_STANDALONE, (Locale) this.c), dayOfWeek.getDisplayName(TextStyle.NARROW_STANDALONE, (Locale) this.c)));
        }
        this.e = arrayList;
        Month[] monthArrValues = Month.values();
        ArrayList arrayList2 = new ArrayList(monthArrValues.length);
        for (Month month : monthArrValues) {
            arrayList2.add(month.getDisplayName(TextStyle.FULL_STANDALONE, (Locale) this.c));
        }
        this.f = arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0141  */
    @Override // p.mi51
    public void a(izr0 izr0Var) {
        yve1 yve1Var;
        yve1 yve1Var2;
        SparseArray sparseArray;
        int i;
        bae baeVar;
        char c;
        SparseArray sparseArray2 = (SparseArray) this.d;
        SparseIntArray sparseIntArray = (SparseIntArray) this.e;
        bae baeVar2 = (bae) this.c;
        uwg1 uwg1Var = (uwg1) this.f;
        SparseArray sparseArray3 = uwg1Var.h;
        SparseBooleanArray sparseBooleanArray = uwg1Var.i;
        yxs yxsVar = uwg1Var.f;
        List list = uwg1Var.c;
        byte b = uwg1Var.a;
        if (izr0Var.E() != 2) {
            return;
        }
        if (b == 1 || b == 2 || uwg1Var.n == 1) {
            yve1Var = (yve1) list.get(0);
        } else {
            yve1Var = new yve1(((yve1) list.get(0)).d());
            list.add(yve1Var);
        }
        if ((izr0Var.E() & 128) == 0) {
            return;
        }
        izr0Var.S(1);
        int iL = izr0Var.L();
        izr0Var.S(3);
        izr0Var.o(0, baeVar2.b, 2);
        baeVar2.m(0);
        baeVar2.o(3);
        uwg1Var.t = baeVar2.g(13);
        izr0Var.o(0, baeVar2.b, 2);
        baeVar2.m(0);
        baeVar2.o(4);
        izr0Var.S(baeVar2.g(12));
        if (b == 2 && uwg1Var.r == null) {
            xwg1 xwg1VarB = yxsVar.b(21, new b8p1(21, (String) null, 0, (ArrayList) null, zoi1.b));
            uwg1Var.r = xwg1VarB;
            if (xwg1VarB != null) {
                xwg1VarB.c(yve1Var, uwg1Var.m, new wwg1(iL, 21, 8192));
            }
        }
        sparseArray2.clear();
        sparseIntArray.clear();
        int iA = izr0Var.a();
        while (iA > 0) {
            izr0Var.o(0, baeVar2.b, 5);
            baeVar2.m(0);
            int iG = baeVar2.g(8);
            baeVar2.o(3);
            int iG2 = baeVar2.g(13);
            baeVar2.o(4);
            int iG3 = baeVar2.g(12);
            int i2 = izr0Var.b;
            int i3 = i2 + iG3;
            int i4 = -1;
            String strTrim = null;
            ArrayList arrayList = null;
            int iE = 0;
            int i5 = iA;
            while (true) {
                if (izr0Var.b >= i3) {
                    baeVar = baeVar2;
                    break;
                }
                int iE2 = izr0Var.E();
                baeVar = baeVar2;
                int iE3 = izr0Var.b + izr0Var.E();
                if (iE3 > i3) {
                    break;
                }
                SparseArray sparseArray4 = sparseArray3;
                if (iE2 == 5) {
                    long jG = izr0Var.G();
                    if (jG == 1094921523) {
                        i4 = 129;
                    } else if (jG == 1161904947) {
                        i4 = 135;
                    } else if (jG == 1094921524) {
                        i4 = 172;
                    } else if (jG == 1212503619) {
                        i4 = 36;
                    }
                } else if (iE2 == 106) {
                    iE3 = iE3;
                    i4 = 129;
                } else if (iE2 == 122) {
                    i4 = 135;
                    iE3 = iE3;
                } else if (iE2 == 127) {
                    int iE4 = izr0Var.E();
                    if (iE4 == 21) {
                        i4 = 172;
                    } else if (iE4 == 14) {
                        i4 = 136;
                    } else if (iE4 == 33) {
                        i4 = 139;
                    }
                } else if (iE2 == 123) {
                    i4 = 138;
                } else if (iE2 == 10) {
                    strTrim = izr0Var.C(3, StandardCharsets.UTF_8).trim();
                    iE = izr0Var.E();
                } else if (iE2 == 89) {
                    ArrayList arrayList2 = new ArrayList();
                    while (izr0Var.b < iE3) {
                        String strTrim2 = izr0Var.C(3, StandardCharsets.UTF_8).trim();
                        izr0Var.E();
                        yve1 yve1Var3 = yve1Var;
                        byte[] bArr = new byte[4];
                        izr0Var.o(0, bArr, 4);
                        arrayList2.add(new vwg1(strTrim2, bArr));
                        yve1Var = yve1Var3;
                        iE3 = iE3;
                        iL = iL;
                    }
                    iE3 = iE3;
                    iL = iL;
                    yve1Var = yve1Var;
                    arrayList = arrayList2;
                    i4 = 89;
                } else {
                    iE3 = iE3;
                    iL = iL;
                    yve1Var = yve1Var;
                    if (iE2 == 111) {
                        i4 = 257;
                    }
                }
                izr0Var.S(iE3 - izr0Var.b);
                yve1Var = yve1Var;
                baeVar2 = baeVar;
                sparseArray3 = sparseArray4;
                iL = iL;
            }
            SparseArray sparseArray5 = sparseArray3;
            int i6 = iL;
            yve1 yve1Var4 = yve1Var;
            izr0Var.R(i3);
            b8p1 b8p1Var = new b8p1(i4, strTrim, iE, arrayList, Arrays.copyOfRange(izr0Var.a, i2, i3));
            if (iG == 6 || iG == 5) {
                iG = i4;
            }
            int i7 = i5 - (iG3 + 5);
            int i8 = b == 2 ? iG : iG2;
            if (sparseBooleanArray.get(i8)) {
                c = 21;
            } else {
                c = 21;
                xwg1 xwg1VarB2 = (b == 2 && iG == 21) ? uwg1Var.r : yxsVar.b(iG, b8p1Var);
                if (b != 2 || iG2 < sparseIntArray.get(i8, 8192)) {
                    sparseIntArray.put(i8, iG2);
                    sparseArray2.put(i8, xwg1VarB2);
                }
            }
            iA = i7;
            yve1Var = yve1Var4;
            baeVar2 = baeVar;
            sparseArray3 = sparseArray5;
            iL = i6;
        }
        SparseArray sparseArray6 = sparseArray3;
        int i9 = iL;
        yve1 yve1Var5 = yve1Var;
        int size = sparseIntArray.size();
        int i10 = 0;
        while (i10 < size) {
            int iKeyAt = sparseIntArray.keyAt(i10);
            int iValueAt = sparseIntArray.valueAt(i10);
            sparseBooleanArray.put(iKeyAt, true);
            uwg1Var.j.put(iValueAt, true);
            xwg1 xwg1Var = (xwg1) sparseArray2.valueAt(i10);
            if (xwg1Var != null) {
                if (xwg1Var != uwg1Var.r) {
                    i = i9;
                    yve1Var2 = yve1Var5;
                    xwg1Var.c(yve1Var2, uwg1Var.m, new wwg1(i, iKeyAt, 8192));
                } else {
                    yve1Var2 = yve1Var5;
                    i = i9;
                }
                sparseArray = sparseArray6;
                sparseArray.put(iValueAt, xwg1Var);
            } else {
                yve1Var2 = yve1Var5;
                sparseArray = sparseArray6;
                i = i9;
            }
            i10++;
            sparseArray6 = sparseArray;
            i9 = i;
            yve1Var5 = yve1Var2;
        }
        SparseArray sparseArray7 = sparseArray6;
        if (b == 2) {
            if (uwg1Var.o) {
                return;
            }
            uwg1Var.m.s();
            uwg1Var.n = 0;
            uwg1Var.o = true;
            return;
        }
        sparseArray7.remove(this.b);
        int i11 = b == 1 ? 0 : uwg1Var.n - 1;
        uwg1Var.n = i11;
        if (i11 == 0) {
            uwg1Var.m.s();
            uwg1Var.o = true;
        }
    }

    public Object apply(Object obj) {
        boolean zContains;
        switch (this.a) {
            case 4:
                bbz0 bbz0Var = (bbz0) obj;
                Set set = bbz0Var.n;
                List list = (List) this.c;
                boolean z = bbz0Var.a;
                Set set2 = bbz0Var.k;
                if (z && !set2.isEmpty()) {
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                ContextTrack contextTrack = (ContextTrack) it.next();
                                if (l4o1.W(contextTrack) || l4o1.L(contextTrack)) {
                                    zContains = set2.contains(abz0.c);
                                } else {
                                    zContains = (l4o1.P(contextTrack) || l4o1.G(contextTrack)) ? set2.contains(abz0.d) : true;
                                }
                                if (!zContains) {
                                }
                            }
                        }
                    }
                    iqr iqrVar = (iqr) this.d;
                    return iqrVar.a.c.z().flatMap(new hqr(list, this.b, bbz0Var.b == 2, (String) this.e, (String) this.f, iqrVar)).map(bbn.V0);
                }
                Single singleJust = Single.just((set.isEmpty() || set.contains("mft_disallow")) ? zy1.c : zy1.d);
                singleJust.getClass();
                return singleJust;
            case 11:
                return new ubm((String) this.c, (String) this.d, this.b, (yrc0) ((spq0) this.e).h(), (kf81) obj, (xd41) this.f);
            default:
                b510 b510Var = (b510) this.f;
                ytp0 ytp0Var = (ytp0) this.e;
                yvg1 yvg1Var = (yvg1) obj;
                r9c r9cVar = (r9c) this.d;
                Boolean bool = (Boolean) yvg1Var.b;
                Map map = (Map) yvg1Var.c;
                p210 p210Var = q210.Companion;
                m210 m210Var = (m210) this.c;
                p210Var.getClass();
                q210 q210VarA = p210.a(m210Var);
                int i = this.b;
                k510 k510Var = new k510(q210VarA, i != 0 ? lzu0.d(i) : null, r9cVar.n, bool, r9cVar.q);
                return b510Var.a(map, d7r.a(((yqg) ytp0Var.d).d()), h510.a(k510Var)).map(new myq0(b510Var, r9cVar.c, (byte) 15)).toObservable().onErrorResumeNext(new phi0(map, ytp0Var, b510Var, k510Var, (r9c) this.d, (byte) 9));
        }
    }

    public y0h1 b(ac11 ac11Var) {
        drb0 drb0Var = (drb0) ((ffr) this.f).invoke(ac11Var);
        return drb0Var != null ? drb0Var : ((b1h1) ((o860) this.c).c).b(ac11Var);
    }

    @Override // p.za21
    public void d() {
        ((ven0) this.c).setValue(Boolean.TRUE);
    }

    @Override // p.z57
    public b67 e(e4w e4wVar, Looper looper, a67 a67Var, y57 y57Var) {
        igr igrVar;
        rdd1 rdd1Var = (rdd1) this.e;
        dn3 dn3Var = (dn3) this.d;
        q2r q2rVar = new q2r(yoi1.F(Executors.newSingleThreadExecutor()), new lbq((Context) this.c));
        if (this.b == 1) {
            igrVar = new igr((Context) this.c, dn3Var, rdd1Var, (o2i0) this.f, q2rVar);
        } else {
            igrVar = new igr((Context) this.c, dn3Var, rdd1Var, (o2i0) this.f, q2rVar, new il00(this, (byte) 15));
        }
        return igrVar.e(e4wVar, looper, a67Var, y57Var);
    }

    public void f(double d, float f) {
        int length = ((float[]) this.c).length + 1;
        int iBinarySearch = Arrays.binarySearch((double[]) this.d, d);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.d = Arrays.copyOf((double[]) this.d, length);
        this.c = Arrays.copyOf((float[]) this.c, length);
        this.e = new double[length];
        double[] dArr = (double[]) this.d;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        ((double[]) this.d)[iBinarySearch] = d;
        ((float[]) this.c)[iBinarySearch] = f;
    }

    public e19 g() {
        return new e19((String) this.c, (String) this.d, (String) this.e, (r29) this.f, this.b);
    }

    @Override // p.za21
    public void h() {
        ((ven0) this.c).setValue(Boolean.FALSE);
    }

    public EncoreTextView i(int i) {
        EncoreTextView encoreTextView = new EncoreTextView((Activity) this.c, null, 0, 6, null);
        encoreTextView.setTextAppearance(2132018006);
        encoreTextView.setTextColor(xfo1.r(encoreTextView, 2130968791));
        int dimensionPixelSize = encoreTextView.getContext().getResources().getDimensionPixelSize(2131165393);
        SpannableString spannableString = new SpannableString(encoreTextView.getContext().getString(i));
        spannableString.setSpan(new BulletSpan(dimensionPixelSize), 0, spannableString.length(), 33);
        encoreTextView.setText(spannableString);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMarginStart(dimensionPixelSize);
        marginLayoutParams.topMargin = encoreTextView.getContext().getResources().getDimensionPixelSize(2131165394);
        encoreTextView.setLayoutParams(marginLayoutParams);
        return encoreTextView;
    }

    @Override // p.ps40
    public synchronized void k() {
        ype1 ype1Var = (ype1) ((ArrayDeque) this.f).poll();
        if (ype1Var == null) {
            this.b++;
            return;
        }
        ((roj1) this.e).f(new ace(this, ype1Var, (byte) 4), true);
        ype1 ype1Var2 = (ype1) ((ArrayDeque) this.f).peek();
        if (ype1Var2 != null && ype1Var2.b == Long.MIN_VALUE) {
            roj1 roj1Var = (roj1) this.e;
            rs40 rs40Var = (rs40) this.d;
            Objects.requireNonNull(rs40Var);
            roj1Var.f(new bce(rs40Var, (byte) 1), true);
            ((ArrayDeque) this.f).remove();
        }
    }

    @Override // p.za21
    public void l(boolean z) {
        ((ven0) this.c).setValue(Boolean.FALSE);
        ((ven0) this.f).setValue(Boolean.valueOf(!z));
        if (z) {
            ((iu30) this.d).invoke(new cj1(this.b, ((h6q0) this.e).a));
        }
    }

    public EncoreTextView m(int i) {
        EncoreTextView encoreTextView = new EncoreTextView((Activity) this.c, null, 0, 6, null);
        encoreTextView.setTextAppearance(2132018004);
        encoreTextView.setTextColor(xfo1.r(encoreTextView, 2130968787));
        encoreTextView.setText(i);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.topMargin = encoreTextView.getContext().getResources().getDimensionPixelSize(2131166959);
        encoreTextView.setLayoutParams(marginLayoutParams);
        return encoreTextView;
    }

    public boolean n(o0g1 o0g1Var, int i) {
        return Objects.equals(((ld21[]) this.c)[i], ((ld21[]) o0g1Var.c)[i]) && Objects.equals(((qp00[]) this.d)[i], ((qp00[]) o0g1Var.d)[i]);
    }

    public boolean o(int i) {
        return ((ld21[]) this.c)[i] != null;
    }

    @Override // p.ps40
    public synchronized void onFlush() {
        this.b = 0;
        ((ArrayDeque) this.f).clear();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006f  */
    public void p(Intent intent) {
        int i;
        x680 x680Var = new x680(this, intent, (byte) 5);
        hu4 hu4Var = (hu4) this.e;
        if (hu4Var.a() <= 0) {
            x680Var.invoke();
            return;
        }
        Intent intent2 = (Intent) this.f;
        if (intent2 != null && u890.j(intent2.getAction(), intent.getAction()) && u890.j(intent2.getData(), intent.getData())) {
            Bundle extras = intent2.getExtras();
            if (extras == null) {
                extras = new Bundle();
            }
            Bundle extras2 = intent.getExtras();
            if (extras2 == null) {
                extras2 = new Bundle();
            }
            if (!pdp1.o(extras, extras2) || o7h.i0(p7h.M(new String[]{"com.spotify.mobile.android.ui.action.view.SPOTIFY_URI", "com.spotify.mobile.android.ui.action.view.CLEAR_BACKSTACK", "com.spotify.mobile.android.ui.action.ACTION_CLOSE_ALL_OVERLAYS"}), intent2.getAction())) {
                i = 0;
                this.b = 0;
            } else {
                i = this.b + 1;
                this.b = i;
            }
        } else {
            i = 0;
            this.b = 0;
        }
        this.f = intent;
        if (i < hu4Var.a()) {
            x680Var.invoke();
        }
    }

    public synchronized void q(ss40 ss40Var, long j) {
        try {
            if (this.b > 0) {
                ((roj1) this.e).f(new rj30(this, ss40Var, j), true);
                this.b--;
            } else {
                ((ArrayDeque) this.f).add(new ype1(ss40Var, j));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void r(int i) {
        this.b = i;
    }

    public synchronized void s() {
        try {
            if (((ArrayDeque) this.f).isEmpty()) {
                roj1 roj1Var = (roj1) this.e;
                rs40 rs40Var = (rs40) this.d;
                Objects.requireNonNull(rs40Var);
                roj1Var.f(new bce(rs40Var, (byte) 1), true);
            } else {
                ((ArrayDeque) this.f).add(new ype1(ss40.e, Long.MIN_VALUE));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object t(wa71 wa71Var, long j, vve1 vve1Var, String str, onm onmVar) {
        owe1 owe1Var;
        long jU;
        LinkedHashMap linkedHashMap;
        if (onmVar instanceof owe1) {
            owe1Var = (owe1) onmVar;
            int i = owe1Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                owe1Var.f = i - Integer.MIN_VALUE;
            } else {
                owe1Var = new owe1(this, onmVar);
            }
        } else {
            owe1Var = new owe1(this, onmVar);
        }
        owe1 owe1Var2 = owe1Var;
        Object obj = owe1Var2.d;
        int i2 = owe1Var2.f;
        if (i2 == 0) {
            hm5.M(obj);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap((Map) wa71Var.c);
            ytw0 ytw0Var = jfv.b;
            long jL0 = fdg1.l0(j, ngv.d);
            ngv ngvVar = ngv.e;
            jU = jfv.u(jL0, ngvVar);
            if (str != null) {
                return wa71.a(wa71Var, str, mqo1.G(linkedHashMap2), ((Context) this.f).getString(2131960176, ((vr51) this.e).f(vve1Var != null ? vve1Var.a - j : jfv.h(fdg1.k0(this.b, ngvVar)))), 106);
            }
            s6v0 s6v0Var = (s6v0) this.c;
            String str2 = wa71Var.a;
            owe1Var2.a = wa71Var;
            owe1Var2.b = linkedHashMap2;
            owe1Var2.c = jU;
            owe1Var2.f = 1;
            l7c l7cVar = s6v0Var.b;
            Object objA = s6v0Var.a(linkedHashMap2, str2, jU, owe1Var2);
            d9n d9nVar = d9n.a;
            if (objA != d9nVar) {
                objA = rih1.a;
            }
            if (objA == d9nVar) {
                return d9nVar;
            }
            linkedHashMap = linkedHashMap2;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j2 = owe1Var2.c;
            linkedHashMap = owe1Var2.b;
            wa71 wa71Var2 = owe1Var2.a;
            hm5.M(obj);
            jU = j2;
            wa71Var = wa71Var2;
        }
        return wa71.a(wa71Var, (String) null, mqo1.G(linkedHashMap), ((qwe1) this.d).a(String.valueOf(jU)), 107);
    }

    public String toString() {
        String str;
        switch (this.a) {
            case 12:
                return "pos =" + Arrays.toString((double[]) this.d) + " period=" + Arrays.toString((float[]) this.c);
            case 17:
                String str2 = (String) this.f;
                StringBuilder sb = new StringBuilder("since ");
                sb.append((x3j1) this.c);
                sb.append(' ');
                sb.append(eqq.B(this.b));
                Integer num = (Integer) this.e;
                if (num != null) {
                    str = " error " + num.intValue();
                } else {
                    str = "";
                }
                sb.append(str);
                sb.append(str2 != null ? ": ".concat(str2) : "");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ o0g1(int i, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = i;
    }

    public /* synthetic */ o0g1(Object obj, Object obj2, int i, Serializable serializable, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
        this.e = serializable;
        this.f = obj3;
    }

    public /* synthetic */ o0g1(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    public o0g1(m210 m210Var, int i, r9c r9cVar, ytp0 ytp0Var, b510 b510Var) {
        this.a = (byte) 13;
        this.c = m210Var;
        this.b = i;
        this.d = r9cVar;
        this.e = ytp0Var;
        this.f = b510Var;
    }

    public o0g1(RecyclerView recyclerView, f0t f0tVar, f0t f0tVar2) {
        int dimensionPixelSize;
        this.a = (byte) 18;
        this.c = recyclerView;
        this.d = new fdc(recyclerView, f0tVar, f0tVar2);
        this.e = new l0x0(recyclerView, new tak1(this, (byte) 11));
        if (xoi1.b(recyclerView.getContext())) {
            dimensionPixelSize = recyclerView.getContext().getResources().getDimensionPixelSize(2131167114);
        } else {
            dimensionPixelSize = recyclerView.getContext().getResources().getDimensionPixelSize(2131165423);
        }
        this.b = dimensionPixelSize;
        this.f = new f3a(recyclerView.getContext(), dimensionPixelSize);
    }

    @Override // p.mi51
    public void c(yve1 yve1Var, gc10 gc10Var, wwg1 wwg1Var) {
    }

    public /* synthetic */ o0g1(byte b) {
        this.a = b;
    }

    public o0g1(Activity activity, i8h1 i8h1Var, int i) {
        this.a = (byte) 5;
        this.c = activity;
        this.d = i8h1Var;
        this.b = i;
        r6h1 r6h1Var = r6h1.c;
        this.e = new rrk0((byte) 4);
        this.f = new idd1(new ots(this, (byte) 25));
    }

    public o0g1(o860 o860Var, n9r n9rVar, p8a0 p8a0Var, int i) {
        this.a = (byte) 10;
        this.c = o860Var;
        this.d = n9rVar;
        this.b = i;
        ArrayList typeParameters = p8a0Var.getTypeParameters();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = typeParameters.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i2));
            i2++;
        }
        this.e = linkedHashMap;
        this.f = ((voe0) ((uw0) ((o860) this.c).b).d).b(new gqb0(this, (byte) 2));
    }

    public o0g1(ks40 ks40Var, rs40 rs40Var, roj1 roj1Var) {
        this.a = (byte) 6;
        this.c = ks40Var;
        this.d = rs40Var;
        this.e = roj1Var;
        this.f = new ArrayDeque();
    }

    public o0g1(ld21[] ld21VarArr, qp00[] qp00VarArr, o3g1 o3g1Var, Object obj) {
        this.a = (byte) 0;
        dm5.m(ld21VarArr.length == qp00VarArr.length);
        this.c = ld21VarArr;
        this.d = (qp00[]) qp00VarArr.clone();
        this.e = o3g1Var;
        this.f = obj;
        this.b = ld21VarArr.length;
    }

    public o0g1(ven0 ven0Var, iu30 iu30Var, h6q0 h6q0Var, int i, ven0 ven0Var2) {
        this.a = (byte) 1;
        this.c = ven0Var;
        this.d = iu30Var;
        this.e = h6q0Var;
        this.b = i;
        this.f = ven0Var2;
    }

    public o0g1(ctg0 ctg0Var, iu30 iu30Var, iu30 iu30Var2) {
        this.a = (byte) 7;
        this.c = ctg0Var;
        this.d = iu30Var;
        this.e = iu30Var2;
        this.f = new LinkedHashMap();
    }

    public o0g1(uwg1 uwg1Var, int i) {
        this.a = (byte) 16;
        this.f = uwg1Var;
        this.c = new bae(new byte[5], 5);
        this.d = new SparseArray();
        this.e = new SparseIntArray();
        this.b = i;
    }
}
