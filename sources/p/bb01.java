package p;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.protobuf.FieldMask;
import com.google.protobuf.StringValue;
import com.spotify.adsdisplay.browser.BreadcrumbException;
import com.spotify.download.esperanto.proto.EsDownload;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.gander.v2.proto.ResetLatestCursorRequest;
import com.spotify.identity.proto.v3.Identity;
import com.spotify.trending.v1.TnyLocationSuggestion;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;
import java.util.concurrent.CancellationException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bb01 implements r6b0, BiFunction, Function, qp91, itd, qiw, it41, n2r {
    public final /* synthetic */ byte a;
    public Object b;

    public bb01(byte b) {
        this.a = b;
        switch (b) {
            case 12:
                this.b = new Stack();
                break;
            case 29:
                this.b = new kdn0(l3r.c);
                break;
        }
    }

    public static List l(bb01 bb01Var, zuc0 zuc0Var) {
        mq70 mq70Var;
        mq70 mq70Var2;
        up70 up70VarA;
        xkk1 xkk1VarA = zuc0Var.q.a(xkk1.class);
        vp70 vp70Var = vp70.c;
        String str = (xkk1VarA == null || (mq70Var2 = xkk1VarA.a) == null || (up70VarA = mq70Var2.a(vp70Var)) == null) ? null : up70VarA.a.a;
        if (xkk1VarA != null && (mq70Var = xkk1VarA.b) != null) {
            mq70Var.a(vp70Var);
        }
        return str != null ? Collections.singletonList(str) : z6x.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: io.reactivex.rxjava3.exceptions.CompositeException */
    public Object apply(Object obj) throws CompositeException {
        Object objInvoke;
        mq70 mq70Var;
        byte b = this.a;
        o6x o6xVar = o6x.a;
        switch (b) {
            case 3:
                oy21 oy21Var = (py21) obj;
                o211 o211Var = new o211((cr6) this.b, (byte) 1);
                if (oy21Var instanceof ly21) {
                    objInvoke = CompletableEmpty.a;
                } else {
                    if (!(oy21Var instanceof oy21)) {
                        eg.o();
                        return null;
                    }
                    objInvoke = o211Var.invoke(oy21Var.a);
                }
                return (CompletableSource) objInvoke;
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
            case 11:
            case 12:
            case 15:
            case 17:
            case 24:
            case 25:
            case 26:
            default:
                ar81 ar81Var = (ar81) this.b;
                return rqt0.F(o6xVar, new lm61(ar81Var, (oo81) obj, (lnm) null, (byte) 27)).map(new dr41(ar81Var, (byte) 13)).onErrorReturn(new ep31(ar81Var, (byte) 15)).toObservable();
            case 5:
                return j2h1.D(o6xVar, new ic01((ytp0) this.b, (lnm) null, (byte) 9));
            case 10:
                ij01 ij01Var = (ij01) ((ks21) this.b).b;
                ms21 ms21Var = ((u0n1) obj).c;
                y2n1 y2n1Var = (y2n1) ij01Var.b;
                ls21 ls21VarO = ResetLatestCursorRequest.o();
                ls21VarO.n(ms21Var.a);
                return y2n1Var.b(ls21VarO.build()).map(f2x0.h).map(a2x0.h).onErrorReturn(e2x0.h);
            case 13:
                throw new CompositeException(new Throwable[]{(Throwable) obj, (BreadcrumbException) this.b});
            case 14:
                xa41 xa41Var = (xa41) obj;
                String str = xa41Var.c;
                String str2 = xa41Var.d;
                String str3 = xa41Var.e;
                h220 h220VarQ = FieldMask.q();
                vn70 vn70VarW = Identity.UserProfile.w();
                obc obcVar = new obc(vn70VarW, (byte) 0);
                if (str2 != null) {
                    h220VarQ.q("pronouns");
                    if (!ihc1.y0(str2)) {
                        fhc1 fhc1VarP = StringValue.p();
                        fhc1VarP.n(str2);
                        obcVar.invoke(fhc1VarP.build());
                    }
                }
                obc obcVar2 = new obc(vn70VarW, (byte) 1);
                if (str3 != null) {
                    h220VarQ.q("location");
                    if (!ihc1.y0(str3)) {
                        fhc1 fhc1VarP2 = StringValue.p();
                        fhc1VarP2.n(str3);
                        obcVar2.invoke(fhc1VarP2.build());
                    }
                }
                wn70 wn70VarO = Identity.UserProfileUpdateRequest.o();
                wn70VarO.n(h220VarQ);
                wn70VarO.q(vn70VarW);
                return ((co70) this.b).i(str, wn70VarO.build()).d(Observable.just(new mb41(true))).onErrorReturn(n9x0.h);
            case 16:
                return new dd7(((ad7) this.b).e);
            case 18:
                z551 z551Var = (z551) obj;
                d751 d751Var = (d751) this.b;
                z551 z551Var2 = d751Var.f;
                kdn0 kdn0Var = d751Var.h;
                kdn0Var.j(d751Var.c.n(new id51(z551Var2, z551Var, (od51) kdn0Var.e())));
                d751Var.f = z551Var;
                return rih1.a;
            case 19:
                int iN = ((EsDownload.SegmentFileStreamerId) obj).n();
                Integer numValueOf = Integer.valueOf(iN);
                ((gq51) this.b).i = Integer.valueOf(iN);
                return numValueOf;
            case 20:
                xkk1 xkk1Var = ((uv00) obj).a(xkk1.class, ((tz51) this.b).c).b;
                return (xkk1Var == null || (mq70Var = xkk1Var.a) == null) ? new mq70((List) null, 7) : mq70Var;
            case 21:
                p23 p23Var = (p23) this.b;
                return new y23(p23Var.b, p23Var.c);
            case 22:
                th61 th61Var = (th61) obj;
                ywv0 ywv0Var = (ywv0) this.b;
                return !ywv0.e(th61Var) ? eth.X((xm41) ((kly0) ywv0Var.c).get()).toFlowable(BackpressureStrategy.d).J(new ep31(th61Var, (byte) 9)).L((Scheduler) ((kly0) ywv0Var.d).get()) : Flowable.I(new xv21(th61Var));
            case 23:
                bq61 bq61Var = (bq61) obj;
                return bq61Var instanceof qp61 ? Single.just(bq61Var) : ((Single) ((cs61) this.b).a.c.getValue()).map(u321.X).flatMapCompletable(uh21.X).e(Single.just(bq61Var));
            case 27:
                brx0 brx0Var = (brx0) obj;
                qfl1 qfl1Var = (qfl1) this.b;
                long j = brx0Var.a;
                return brx0Var.b ? new psx0(j + 2, hwb.x(), qfl1Var.b(2131961195, new Object[0]), true) : new psx0(j + 2, hwb.x(), qfl1Var.b(2131961194, new Object[0]), false);
        }
    }

    public void b(un91 un91Var) {
        ((p2p0) this.b).d(un91Var, "PlayModePicker.Dialog");
    }

    public void d(qhc qhcVar) {
        if (!qhcVar.i()) {
            if (!(qhcVar instanceof sp31)) {
                String strValueOf = String.valueOf(qhcVar.getClass());
                hhg1.n(l1d.n("Has a new type of ByteString been created? Found ", strValueOf, new StringBuilder(strValueOf.length() + 49)));
                return;
            } else {
                sp31 sp31Var = (sp31) qhcVar;
                d(sp31Var.c);
                d(sp31Var.d);
                return;
            }
        }
        int size = qhcVar.size();
        int[] iArr = sp31.h;
        int iBinarySearch = Arrays.binarySearch(iArr, size);
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int i = iArr[iBinarySearch + 1];
        Stack stack = (Stack) this.b;
        if (stack.isEmpty() || ((qhc) stack.peek()).size() >= i) {
            stack.push(qhcVar);
            return;
        }
        int i2 = iArr[iBinarySearch];
        qhc sp31Var2 = (qhc) stack.pop();
        while (!stack.isEmpty() && ((qhc) stack.peek()).size() < i2) {
            sp31Var2 = new sp31((qhc) stack.pop(), sp31Var2);
        }
        sp31 sp31Var3 = new sp31(sp31Var2, qhcVar);
        while (!stack.isEmpty()) {
            int[] iArr2 = sp31.h;
            int iBinarySearch2 = Arrays.binarySearch(iArr2, sp31Var3.b);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((qhc) stack.peek()).size() >= iArr2[iBinarySearch2 + 1]) {
                break;
            } else {
                sp31Var3 = new sp31((qhc) stack.pop(), sp31Var3);
            }
        }
        stack.push(sp31Var3);
    }

    public void e(ajn0 ajn0Var, Object obj) {
        cb01 cb01Var = (cb01) this.b;
        String strB = ajn0Var.b();
        if ("version".equals(strB)) {
            if (obj instanceof int[]) {
                cb01Var.a = (int[]) obj;
            }
        } else if ("multifileClassName".equals(strB)) {
            cb01Var.b = obj instanceof String ? (String) obj : null;
        }
    }

    public void g(int i) {
        ((NestedScrollView) this.b).r(i);
    }

    public ymd0 getState() {
        return (kdn0) this.b;
    }

    public r6b0 h(heg hegVar, ajn0 ajn0Var) {
        return null;
    }

    public Object i(int i, String str, r6h1 r6h1Var, String str2) {
        int i2;
        int[] iArrH = l1d.H(3);
        int length = iArrH.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                i2 = 0;
                break;
            }
            i2 = iArrH[i3];
            if (v8i0.d(i2).equals(str2)) {
                break;
            }
            i3++;
        }
        if (i2 == 0) {
            i2 = 1;
        }
        sqk0 sqk0Var = new sqk0(i2, Integer.valueOf(i), str, new jpk0(new py9(r6h1Var, (byte) 13), (byte) 0));
        this.b = sqk0Var;
        return sqk0Var;
    }

    public boolean j() {
        return true;
    }

    public w7h1 k(ctd ctdVar, String str) {
        if (!ctdVar.equals(ctd.a)) {
            eg.o();
            return null;
        }
        sqk0 sqk0Var = (sqk0) this.b;
        if (sqk0Var != null) {
            return sqk0Var.a(str);
        }
        u890.C("releaseCard");
        throw null;
    }

    public s6b0 m(ajn0 ajn0Var) {
        String strB = ajn0Var.b();
        if ("data".equals(strB) || "filePartClassNames".equals(strB)) {
            return new ab01(this, (byte) 0);
        }
        if ("strings".equals(strB)) {
            return new ab01(this, (byte) 1);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object o(String str, onm onmVar) {
        k551 k551Var;
        if (onmVar instanceof k551) {
            k551Var = (k551) onmVar;
            int i = k551Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                k551Var.d = i - Integer.MIN_VALUE;
            } else {
                k551Var = new k551(this, onmVar);
            }
        } else {
            k551Var = new k551(this, onmVar);
        }
        Object objB = k551Var.b;
        int i2 = k551Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objB);
                if (str.length() > 150) {
                    return new dme0(str);
                }
                eb80 eb80Var = (eb80) this.b;
                k551Var.a = str;
                k551Var.d = 1;
                objB = eb80Var.B(str, k551Var);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = k551Var.a;
                hm5.M(objB);
            }
            List list = (List) objB;
            ArrayList arrayList = new ArrayList(q7h.U(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(b0o1.n((TnyLocationSuggestion) it.next()));
            }
            return new fme0(str, arrayList);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return new dme0(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0068  */
    /* JADX WARN: Code duplicated, block: B:33:0x0076  */
    public void p(w611 w611Var) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        boolean z = true;
        w611Var.B(true);
        View view = w611Var.a;
        if (w611Var.h != null && w611Var.i == null) {
            w611Var.h = null;
        }
        w611Var.i = null;
        if ((w611Var.t & 16) != 0) {
            return;
        }
        n611 n611Var = recyclerView.c;
        recyclerView.z0();
        p0g p0gVar = recyclerView.f;
        o0g o0gVar = p0gVar.b;
        vqv0 vqv0Var = p0gVar.a;
        byte b = p0gVar.d;
        if (b != 1) {
            if (b == 2) {
                eg.m("Cannot call removeViewIfHidden within removeViewIfHidden");
                return;
            }
            try {
                p0gVar.d = (byte) 2;
                int iIndexOfChild = ((RecyclerView) vqv0Var.b).indexOfChild(view);
                if (iIndexOfChild == -1) {
                    p0gVar.g(view);
                } else if (o0gVar.C(iIndexOfChild)) {
                    o0gVar.L(iIndexOfChild);
                    p0gVar.g(view);
                    vqv0Var.x(iIndexOfChild);
                } else {
                    p0gVar.d = (byte) 0;
                }
                p0gVar.d = (byte) 0;
                if (z) {
                    w611 w611VarU = RecyclerView.U(view);
                    n611Var.n(w611VarU);
                    n611Var.j(w611VarU);
                    if (RecyclerView.c2) {
                        Objects.toString(view);
                        recyclerView.toString();
                    }
                }
                recyclerView.A0(!z);
                if (z && w611Var.x()) {
                    recyclerView.removeDetachedView(view, false);
                    return;
                }
            } catch (Throwable th) {
                p0gVar.d = (byte) 0;
                throw th;
            }
        }
        if (p0gVar.e != view) {
            eg.m("Cannot call removeViewIfHidden within removeView(At) for a different view");
            return;
        }
        z = false;
        if (z) {
            w611 w611VarU2 = RecyclerView.U(view);
            n611Var.n(w611VarU2);
            n611Var.j(w611VarU2);
            if (RecyclerView.c2) {
                Objects.toString(view);
                recyclerView.toString();
            }
        }
        recyclerView.A0(!z);
        if (z) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0024 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public void q(String str, String str2, JSONObject jSONObject) {
        String strC;
        String string;
        if (str == null || (strC = m5n1.C(str)) == null) {
            return;
        }
        String string2 = null;
        if (jSONObject != null) {
            try {
                string = new JSONObject(jSONObject.getString("data")).getString("$canonical_url");
            } catch (JSONException unused) {
                string = null;
            }
            if (string != null) {
                string2 = string;
            } else if (jSONObject != null) {
                try {
                    string2 = new JSONObject(jSONObject.getString("data")).getString("$full_url");
                } catch (JSONException unused2) {
                }
            }
        } else if (jSONObject != null) {
            string2 = new JSONObject(jSONObject.getString("data")).getString("$full_url");
        }
        ae5 ae5Var = (ae5) this.b;
        if (string2 != null) {
            ae5Var.h(strC, string2, str);
        } else {
            ae5Var.g(2000, strC, str2);
        }
    }

    public void v(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        bz11 bz11Var = ((sj21) this.b).a;
        ((EncoreButton) bz11Var.i).setEnabled(zBooleanValue);
        ((MaterialRadioButton) bz11Var.k).setEnabled(zBooleanValue);
        ((MaterialRadioButton) bz11Var.j).setEnabled(zBooleanValue);
        ((MaterialRadioButton) bz11Var.f).setEnabled(zBooleanValue);
    }

    public void a() {
    }

    public void start() {
    }

    public void stop() {
    }

    public /* synthetic */ bb01(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public bb01(hwb hwbVar, qfl1 qfl1Var) {
        this.a = (byte) 27;
        this.b = qfl1Var;
    }

    public void n(ajn0 ajn0Var, jeg jegVar) {
    }

    public void f(ajn0 ajn0Var, heg hegVar, ajn0 ajn0Var2) {
    }

    public Object apply(Object obj, Object obj2) {
        zw01 zw01Var = (zw01) obj2;
        Map mapK = ((bx01) obj).a;
        gx01 gx01Var = (gx01) this.b;
        yqg yqgVar = gx01Var.a;
        Scheduler scheduler = gx01Var.f;
        long jE = yqgVar.e();
        if (zw01Var instanceof ww01) {
            scheduler.c(new fx01(gx01Var, (byte) 0));
            mapK = sqg0.P(mapK, new mmr0(((ww01) zw01Var).a, Long.valueOf(jE)));
        } else if (zw01Var instanceof yw01) {
            scheduler.c(new fx01(gx01Var, (byte) 1));
            mapK = sqg0.K(((yw01) zw01Var).a, mapK);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapK.entrySet()) {
            if (((Number) entry.getValue()).longValue() + 10000 > jE) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new bx01(linkedHashMap);
    }
}
