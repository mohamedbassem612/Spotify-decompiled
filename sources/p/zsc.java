package p;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.media3.database.DatabaseIOException;
import com.google.android.recaptcha.internal.zzhm;
import com.spotify.casita.v1.resolved.ResolvedHome;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import com.spotify.fandomcollectibles.protos.GetCollectibleDetailRequest;
import com.spotify.fandomcollectibles.protos.GetCollectibleDetailResponse;
import com.spotify.fandomcollectibles.protos.GetRequest;
import com.spotify.fandomcollectibles.protos.GetResponse;
import com.spotify.widgets.widgetstate.WidgetState;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeMap;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeTimeoutMaybe;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeToSingle;
import io.reactivex.rxjava3.schedulers.Schedulers;
import j$.util.DesugarTimeZone;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zsc implements atc, a6a1 {
    public static final String[] f = {"id", "key", "metadata"};
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    static {
        new i5w0("premium");
    }

    public zsc(Typeface typeface, rkj0 rkj0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        this.a = (byte) 15;
        this.e = typeface;
        this.b = rkj0Var;
        this.d = new slj0(1024);
        int iA = rkj0Var.a(6);
        if (iA != 0) {
            int i5 = iA + rkj0Var.a;
            i = rkj0Var.b.getInt(rkj0Var.b.getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.c = new char[i * 2];
        int iA2 = rkj0Var.a(6);
        if (iA2 != 0) {
            int i6 = iA2 + rkj0Var.a;
            i2 = rkj0Var.b.getInt(rkj0Var.b.getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            a2h1 a2h1Var = new a2h1(this, i7);
            mkj0 mkj0VarC = a2h1Var.c();
            int iA3 = mkj0VarC.a(4);
            Character.toChars(iA3 != 0 ? mkj0VarC.b.getInt(iA3 + mkj0VarC.a) : 0, (char[]) this.c, i7 * 2);
            mkj0 mkj0VarC2 = a2h1Var.c();
            int iA4 = mkj0VarC2.a(16);
            if (iA4 != 0) {
                int i8 = iA4 + mkj0VarC2.a;
                i3 = mkj0VarC2.b.getInt(mkj0VarC2.b.getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            o0c.k("invalid metadata codepoint length", i3 > 0);
            slj0 slj0Var = (slj0) this.d;
            mkj0 mkj0VarC3 = a2h1Var.c();
            int iA5 = mkj0VarC3.a(16);
            if (iA5 != 0) {
                int i9 = iA5 + mkj0VarC3.a;
                i4 = mkj0VarC3.b.getInt(mkj0VarC3.b.getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            slj0Var.a(a2h1Var, 0, i4 - 1);
        }
    }

    public static kt11 j(zsc zscVar, em0 em0Var, mka mkaVar, int i, boolean z, vtw vtwVar, vtw vtwVar2, vtw vtwVar3, vtw vtwVar4, vtw vtwVar5, vtw vtwVar6, yt11 yt11Var, bu11 bu11Var, nu11 nu11Var, boolean z2, int i2, boolean z3, ppc1 ppc1Var, boolean z4, boolean z5, boolean z6, egx0 egx0Var, int i3, int i4) {
        return new kt11((yqg) zscVar.b, (ggv) zscVar.d, (gw70) zscVar.c, null, (i4 & 64) != 0 ? null : vtwVar, (i4 & 128) != 0 ? null : vtwVar2, (i4 & 256) != 0 ? null : vtwVar3, (i4 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0 ? null : vtwVar4, (i4 & 1024) != 0 ? null : vtwVar5, (i4 & 2048) != 0 ? null : vtwVar6, yt11Var, bu11Var, em0Var, (i4 & 16384) != 0 ? null : nu11Var, mkaVar, i, (32768 & i4) == 0, (65536 & i4) != 0 ? false : z2, (131072 & i4) != 0 ? 2 : 1, (262144 & i4) != 0 ? 0 : i2, (1048576 & i4) != 0, (2097152 & i4) != 0 ? false : z3, (4194304 & i4) != 0 ? 2 : 1, z, ppc1Var, (16777216 & i4) != 0 ? false : z4, (33554432 & i4) != 0 ? false : z5, (67108864 & i4) != 0 ? false : z6, true, (536870912 & i4) != 0 ? dgx0.a : egx0Var, (1073741824 & i4) == 0, ((f6g1) zscVar.e).a(), (i4 & Integer.MIN_VALUE) != 0 ? 1 : i3);
    }

    public void A(si30 si30Var) {
        HashMap map = (HashMap) this.c;
        zf30 zf30Var = si30Var.c;
        if (zf30Var.d1) {
            ((di30) this.e).W(zf30Var);
        }
        if (map.get(zf30Var.e) == si30Var && ((si30) map.put(zf30Var.e, null)) != null && th30.P(2)) {
            zf30Var.toString();
        }
    }

    public void B(String str, String str2) {
        if (str2 == null) {
            str2 = pcf.g(str);
        }
        tv80 tv80VarA = ((oxi0) this.d).a(str2, true);
        lzn0 lzn0Var = (lzn0) this.b;
        if (tv80VarA != null) {
            lzn0Var.a(str2, tv80VarA, (Bundle) null);
        } else {
            lzn0Var.h(str2);
        }
    }

    public Observable C(Map map, Set set) {
        Observable observableDistinctUntilChanged;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            Set set2 = s4b1.f;
            if (uic.x((String) obj).c == blc0.u1) {
                arrayList.add(obj);
            }
        }
        Set setP1 = o7h.p1(arrayList);
        Set<String> setV0 = dm61.v0(set, setP1);
        r630 r630Var = (r630) this.c;
        boolean zIsEmpty = setV0.isEmpty();
        b7x b7xVar = b7x.a;
        if (zIsEmpty) {
            observableDistinctUntilChanged = Observable.just(b7xVar);
        } else {
            HashMap map2 = new HashMap(setV0.size());
            for (String str : setV0) {
                q730 q730Var = (q730) map.get(str);
                if (q730Var == null) {
                    q730Var = new q730(0, 15);
                }
                i430 i430VarC = r630Var.c(str);
                if (i430VarC == null || i430VarC.e() != q730Var.b() || i430VarC.b() != q730Var.g() || i430VarC.c() != q730Var.j() || i430VarC.f() != q730Var.h()) {
                    i430VarC = new i430(q730Var.g(), q730Var.j(), str, q730Var.h(), q730Var.b());
                    r630Var.a(i430VarC);
                }
                map2.put(str, new q730(i430VarC.b(), i430VarC.c(), i430VarC.f(), i430VarC.e()));
            }
            Observable observableCreate = Observable.create(new lc20(setV0, map2, this, (byte) 3));
            Observable observableDoOnError = ((w430) this.d).b().map(zz10.c).doOnError(k530.b);
            j5 j5Var = j5.a;
            observableDistinctUntilChanged = Observable.combineLatest(observableDoOnError.onErrorReturnItem(j5Var).startWithItem(j5Var), observableCreate.startWithItem(sqg0.U(map2)), sa20.c).distinctUntilChanged();
        }
        uo5 uo5Var = (uo5) this.b;
        Set set3 = setP1;
        return Observable.combineLatest(observableDistinctUntilChanged, set3.isEmpty() ? Observable.just(b7xVar) : ((g7h) uo5Var.c).c((String) ((idd1) uo5Var.d).getValue(), o7h.l1(set3), false).map(new q3e(map)), a020.c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object D(WidgetState widgetState, onm onmVar) throws Throwable {
        qxa qxaVar;
        vgn0 vgn0Var;
        int i;
        vgn0 vgn0Var2;
        List listB;
        ArrayList arrayList;
        if (onmVar instanceof qxa) {
            qxaVar = (qxa) onmVar;
            int i2 = qxaVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qxaVar.f = i2 - Integer.MIN_VALUE;
            } else {
                qxaVar = new qxa(this, onmVar);
            }
        } else {
            qxaVar = new qxa(this, onmVar);
        }
        Object obj = qxaVar.d;
        int i3 = qxaVar.f;
        d9n d9nVar = d9n.a;
        try {
            try {
                try {
                    if (i3 == 0) {
                        hm5.M(obj);
                        vgn0Var = (xgn0) this.e;
                        qxaVar.a = widgetState;
                        qxaVar.b = vgn0Var;
                        qxaVar.c = 0;
                        qxaVar.f = 1;
                        if (vgn0Var.a(qxaVar) != d9nVar) {
                            i = 0;
                        }
                        return d9nVar;
                    }
                    if (i3 != 1) {
                        if (i3 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        vgn0Var2 = qxaVar.b;
                        try {
                            hm5.M(obj);
                            vgn0Var2.c((Object) null);
                            return rih1.a;
                        } catch (Throwable th) {
                            th = th;
                            vgn0Var2.c((Object) null);
                            throw th;
                        }
                    }
                    int i4 = qxaVar.c;
                    vgn0 vgn0Var3 = qxaVar.b;
                    WidgetState widgetState2 = qxaVar.a;
                    hm5.M(obj);
                    vgn0Var = vgn0Var3;
                    i = i4;
                    widgetState = widgetState2;
                    ((rol1) this.c).a.keySet().retainAll(o7h.p1(arrayList));
                    q8n q8nVar = (q8n) this.d;
                    sxa sxaVar = new sxa(listB, this, (lnm) null, (byte) 0);
                    qxaVar.a = null;
                    qxaVar.b = vgn0Var;
                    qxaVar.c = i;
                    qxaVar.f = 2;
                    Object objH = c921.H(q8nVar, sxaVar, qxaVar);
                    if (objH != d9nVar) {
                        vgn0 vgn0Var4 = vgn0Var;
                        obj = objH;
                        vgn0Var2 = vgn0Var4;
                        vgn0Var2.c((Object) null);
                        return rih1.a;
                    }
                    return d9nVar;
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    vgn0Var2 = vgn0Var;
                    vgn0Var2.c((Object) null);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
            listB = txa.b(widgetState);
            List list = listB;
            arrayList = new ArrayList(q7h.U(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(txa.a((String) ((mmr0) it.next()).a));
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public void E(sy21 sy21Var, Throwable th) {
        String strF;
        Object obj;
        String str = ((lmo) this.c).a;
        dxz0 dxz0Var = (dxz0) this.d;
        t2j0 t2j0Var = (t2j0) this.b;
        if (sy21Var != null && sy21Var.a.Q0 && (obj = sy21Var.b) != null) {
            ago1.k(t2j0Var, ((ResolvedHome) obj).r().s(), o0c.D(sy21Var, (yqg) this.e), dxz0Var.f(), str);
            return;
        }
        Integer numValueOf = sy21Var != null ? Integer.valueOf(sy21Var.a.d) : null;
        uz21 uz21Var = sy21Var != null ? sy21Var.c : null;
        if (th != null) {
            strF = th.toString();
        } else {
            strF = uz21Var != null ? uz21Var.f() : "";
        }
        ago1.j(t2j0Var, str, numValueOf, strF, dxz0Var.f());
    }

    public void F(pe70 pe70Var) {
        ((xd70) ((SparseArray) this.c).get(pe70Var.c())).b(pe70Var);
    }

    public void G(s2f0 s2f0Var, String str, String str2) {
        r241 r241Var = (r241) this.c;
        str.getClass();
        dm5.n(str.length() > 0, "referralCode must be set");
        if (str2 != null && !str2.isEmpty()) {
            r241Var.a("created_by_partner", str2);
            r241Var.a("mobile-product-test", str2);
        }
        r241Var.a("referral", str);
        Long l = (Long) s2f0Var.call().e(0L);
        Calendar calendarD = ((yqg) this.b).d();
        calendarD.setTimeInMillis(l.longValue() * 1000);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        r241Var.a("referral-timestamp", simpleDateFormat.format(calendarD.getTime()) + " UTC");
    }

    public Bundle H(Bundle bundle, String str) {
        HashMap map = (HashMap) this.d;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }

    public void I(mkb1 mkb1Var) {
        qub1 qub1Var = new qub1(this, mkb1Var, (byte) 3);
        synchronized (this.d) {
        }
        ((sun) this.b).c(qub1Var, 5400000L);
    }

    public Completable J(String str, boolean z) {
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(str);
        int iOrdinal = s4b1VarX.c.ordinal();
        if (iOrdinal == 44) {
            return j2h1.D((q8n) this.e, new hl1(z, this, str, (lnm) null, (byte) 8));
        }
        if (iOrdinal != 704) {
            eg.f("Unsupported uri");
            return null;
        }
        String strS = s4b1VarX.s();
        strS.getClass();
        return new CompletableFromAction(new m530((byte) 0, this, str, z)).c(((w430) this.d).a(strS, z));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzhm */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public Object K(onm onmVar) throws Throwable {
        jqn1 jqn1Var;
        Throwable th;
        xrn1 xrn1Var;
        hf41 hf41Var = hf41.f;
        AtomicReference atomicReference = (AtomicReference) this.e;
        dmj1 dmj1Var = (dmj1) this.c;
        if (onmVar instanceof jqn1) {
            jqn1Var = (jqn1) onmVar;
            int i = jqn1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jqn1Var.c = i - Integer.MIN_VALUE;
            } else {
                jqn1Var = new jqn1(this, onmVar);
            }
        } else {
            jqn1Var = new jqn1(this, onmVar);
        }
        Object objA = jqn1Var.a;
        int i2 = jqn1Var.c;
        byte b = 2;
        lnm lnmVar = null;
        if (i2 != 0) {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xrn1Var = jqn1Var.d;
            try {
                hm5.M(objA);
                lqn1.k(atomicReference, xrn1Var);
                tqn1.a.set(null);
                dmj1Var.g(new m95(xrn1Var, lnmVar, b)).q(hf41Var, (gla0) null);
                return objA;
            } catch (Throwable th2) {
                th = th2;
                lqn1.k(atomicReference, xrn1Var);
                tqn1.a.set(null);
                dmj1Var.g(new m95(xrn1Var, lnmVar, b)).q(hf41Var, (gla0) null);
                throw th;
            }
        }
        hm5.M(objA);
        xrn1 xrn1Var2 = new xrn1((mxa1) this.b, dmj1Var);
        if (!xvj1.t(atomicReference, xrn1Var2)) {
            throw new zzhm(tgo1.c, ij81.g1, (String) null, (Exception) null);
        }
        try {
            jqn1Var.d = xrn1Var2;
            jqn1Var.c = 1;
            tqn1.a.set(xrn1Var2);
            Context context = (Context) this.d;
            Intent intent = new Intent(context, (Class<?>) hun1.class);
            intent.setFlags(268435456);
            context.startActivity(intent);
            objA = xrn1Var2.a(jqn1Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
            xrn1Var = xrn1Var2;
            lqn1.k(atomicReference, xrn1Var);
            tqn1.a.set(null);
            dmj1Var.g(new m95(xrn1Var, lnmVar, b)).q(hf41Var, (gla0) null);
            return objA;
        } catch (Throwable th3) {
            th = th3;
            xrn1Var = xrn1Var2;
            lqn1.k(atomicReference, xrn1Var);
            tqn1.a.set(null);
            dmj1Var.g(new m95(xrn1Var, lnmVar, b)).q(hf41Var, (gla0) null);
            throw th;
        }
    }

    public void a(zf30 zf30Var) {
        if (((ArrayList) this.b).contains(zf30Var)) {
            bhn0.A(zf30Var, "Fragment already added: ");
            return;
        }
        synchronized (((ArrayList) this.b)) {
            ((ArrayList) this.b).add(zf30Var);
        }
        zf30Var.X = true;
    }

    @Override // p.atc
    public void b(ysc yscVar) {
        ((SparseArray) this.c).put(yscVar.a, yscVar);
    }

    public void c(rij0 rij0Var) {
        if (rij0Var instanceof tpm0) {
            this.b = (tpm0) rij0Var;
            return;
        }
        if (rij0Var instanceof rpm0) {
            this.c = (rpm0) rij0Var;
            return;
        }
        if (rij0Var instanceof upm0) {
            this.e = (upm0) rij0Var;
        } else if (rij0Var instanceof yeh0) {
            ((HashSet) this.d).add((yeh0) rij0Var);
        } else {
            hhg1.n("Unsupported metadata");
        }
    }

    public void cancel() throws IOException {
        ((Socket) this.b).close();
    }

    public void d(SQLiteDatabase sQLiteDatabase, ysc yscVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        toj0.c(yscVar.c(), new DataOutputStream(byteArrayOutputStream));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(yscVar.a));
        contentValues.put("key", yscVar.b);
        contentValues.put("metadata", byteArray);
        String str = (String) this.e;
        str.getClass();
        sQLiteDatabase.replaceOrThrow(str, null, contentValues);
    }

    public void e(mkb1 mkb1Var) {
        Runnable runnable;
        synchronized (this.d) {
            runnable = (Runnable) ((LinkedHashMap) this.e).remove(mkb1Var);
        }
        if (runnable != null) {
            ((sun) this.b).a(runnable);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.database.DatabaseIOException */
    @Override // p.atc
    public boolean f() throws DatabaseIOException {
        try {
            SQLiteDatabase readableDatabase = ((yab1) this.b).getReadableDatabase();
            String str = (String) this.d;
            str.getClass();
            return e5j1.a(readableDatabase, 1, str) != -1;
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.database.DatabaseIOException */
    @Override // p.atc
    public void g(HashMap map) throws DatabaseIOException {
        SparseArray sparseArray = (SparseArray) this.c;
        if (sparseArray.size() == 0) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = ((yab1) this.b).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (int i = 0; i < sparseArray.size(); i++) {
                try {
                    ysc yscVar = (ysc) sparseArray.valueAt(i);
                    if (yscVar == null) {
                        int iKeyAt = sparseArray.keyAt(i);
                        String str = (String) this.e;
                        str.getClass();
                        writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(iKeyAt)});
                    } else {
                        d(writableDatabase, yscVar);
                    }
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            writableDatabase.setTransactionSuccessful();
            sparseArray.clear();
            writableDatabase.endTransaction();
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public fka1 getSource() {
        return (ors) this.d;
    }

    @Override // p.atc
    public void h(ysc yscVar, boolean z) {
        SparseArray sparseArray = (SparseArray) this.c;
        int i = yscVar.a;
        if (z) {
            sparseArray.delete(i);
        } else {
            sparseArray.put(i, null);
        }
    }

    @Override // p.atc
    public void i(long j) {
        String hexString = Long.toHexString(j);
        this.d = hexString;
        this.e = l1d.m("ExoPlayerCacheIndex", hexString);
    }

    public mr20 k(Set set) {
        return o4p1.r(x4p1.h((mr20) ((iu30) this.c).invoke(set), new qd0(this, set, (lnm) null)), (o8n) this.d);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.database.DatabaseIOException */
    @Override // p.atc
    public void l(HashMap map) throws DatabaseIOException {
        try {
            SQLiteDatabase writableDatabase = ((yab1) this.b).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                x(writableDatabase);
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    d(writableDatabase, (ysc) it.next());
                }
                writableDatabase.setTransactionSuccessful();
                ((SparseArray) this.c).clear();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public zf30 m(String str) {
        si30 si30Var = (si30) ((HashMap) this.c).get(str);
        if (si30Var != null) {
            return si30Var.c;
        }
        return null;
    }

    public zf30 n(String str) {
        for (si30 si30Var : ((HashMap) this.c).values()) {
            if (si30Var != null) {
                zf30 zf30VarN = si30Var.c;
                if (!str.equals(zf30VarN.e)) {
                    zf30VarN = zf30VarN.W0.c.n(str);
                }
                if (zf30VarN != null) {
                    return zf30VarN;
                }
            }
        }
        return null;
    }

    public ArrayList o() {
        ArrayList arrayList = new ArrayList();
        for (si30 si30Var : ((HashMap) this.c).values()) {
            if (si30Var != null) {
                arrayList.add(si30Var);
            }
        }
        return arrayList;
    }

    public ArrayList p() {
        ArrayList arrayList = new ArrayList();
        for (si30 si30Var : ((HashMap) this.c).values()) {
            if (si30Var != null) {
                arrayList.add(si30Var.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public c291 q() {
        return (nrs) this.e;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.database.DatabaseIOException */
    @Override // p.atc
    public void r(HashMap map, SparseArray sparseArray) throws DatabaseIOException {
        yab1 yab1Var = (yab1) this.b;
        dm5.y(((SparseArray) this.c).size() == 0);
        try {
            SQLiteDatabase readableDatabase = yab1Var.getReadableDatabase();
            String str = (String) this.d;
            str.getClass();
            if (e5j1.a(readableDatabase, 1, str) != 1) {
                SQLiteDatabase writableDatabase = yab1Var.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    x(writableDatabase);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            SQLiteDatabase readableDatabase2 = yab1Var.getReadableDatabase();
            String str2 = (String) this.e;
            str2.getClass();
            Cursor cursorQuery = readableDatabase2.query(str2, f, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    int i = cursorQuery.getInt(0);
                    String string = cursorQuery.getString(1);
                    string.getClass();
                    map.put(string, new ysc(i, string, toj0.b(new DataInputStream(new ByteArrayInputStream(cursorQuery.getBlob(2))))));
                    sparseArray.put(i, string);
                } catch (Throwable th2) {
                    if (cursorQuery == null) {
                        throw th2;
                    }
                    try {
                        cursorQuery.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
            cursorQuery.close();
        } catch (SQLiteException e) {
            map.clear();
            sparseArray.clear();
            throw new DatabaseIOException(e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.database.DatabaseIOException */
    @Override // p.atc
    public void s() throws DatabaseIOException {
        yab1 yab1Var = (yab1) this.b;
        String str = (String) this.d;
        str.getClass();
        try {
            String strConcat = "ExoPlayerCacheIndex".concat(str);
            SQLiteDatabase writableDatabase = yab1Var.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                int i = e5j1.a;
                try {
                    if (zoi1.k0(writableDatabase, "ExoPlayerVersions")) {
                        writableDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
                    }
                    writableDatabase.execSQL("DROP TABLE IF EXISTS ".concat(strConcat));
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (SQLException e) {
                    throw new DatabaseIOException(e);
                }
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    public pe70 t(pe70 pe70Var, y570 y570Var, ViewGroup viewGroup, int i) {
        uo5 uo5Var = (uo5) this.d;
        if (pe70Var == null) {
            pe70Var = null;
        } else if (uo5Var.x(y570Var).a() != pe70Var.c()) {
            F(pe70Var);
            pe70Var = null;
        }
        if (pe70Var == null) {
            int iA = uo5Var.x(y570Var).a();
            SparseArray sparseArray = (SparseArray) this.c;
            xd70 xd70Var = (xd70) sparseArray.get(iA);
            if (xd70Var == null) {
                xd70Var = new xd70();
                sparseArray.put(iA, xd70Var);
            }
            pe70 pe70VarA = xd70Var.a();
            pe70Var = pe70VarA != null ? pe70VarA : pe70.b(iA, viewGroup, (l670) this.b);
        }
        pe70Var.a(i, uo5Var.x(y570Var).b(), (yfu) this.e);
        return pe70Var;
    }

    public String toString() {
        switch (this.a) {
            case 5:
                return ((Socket) this.b).toString();
            default:
                return super.toString();
        }
    }

    public List u() {
        ArrayList arrayList;
        if (((ArrayList) this.b).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.b)) {
            arrayList = new ArrayList((ArrayList) this.b);
        }
        return arrayList;
    }

    public MaybeMap v() {
        MaybeMap maybeMapF = fq7.D((qlr0) this.e).f(Functions.b(vov0.class));
        tov0 tov0Var = tov0.a;
        Maybe maybeFlatMapMaybe = new MaybeToSingle(new MaybeTimeoutMaybe(maybeMapF, Maybe.l(3L, TimeUnit.SECONDS, Schedulers.b), Maybe.e(tov0Var)), tov0Var).flatMapMaybe(new c1y0(this, (byte) 28));
        maybeFlatMapMaybe.getClass();
        return maybeFlatMapMaybe.f(Functions.b(uov0.class));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public d4c1 w() throws NoWhenBranchMatchedException {
        yqg yqgVar = (yqg) this.b;
        String str = (String) this.d;
        x4c1 x4c1Var = (x4c1) this.e;
        int iOrdinal = ((a9c1) this.c).ordinal();
        if (iOrdinal == 0) {
            qp40 qp40VarN = GetRequest.n();
            qp40VarN.q(str);
            qp40VarN.n(yqgVar.g().getID());
            GetResponse getResponse = (GetResponse) x4c1Var.b(qp40VarN.build()).blockingGet();
            return new d4c1(getResponse.n(), getResponse.o(), getResponse.p());
        }
        if (iOrdinal != 1) {
            eg.o();
            return null;
        }
        ol40 ol40VarN = GetCollectibleDetailRequest.n();
        ol40VarN.q(str);
        ol40VarN.n(yqgVar.g().getID());
        GetCollectibleDetailResponse getCollectibleDetailResponse = (GetCollectibleDetailResponse) x4c1Var.a(ol40VarN.build()).blockingGet();
        return new d4c1(getCollectibleDetailResponse.n(), getCollectibleDetailResponse.o(), getCollectibleDetailResponse.p());
    }

    public void x(SQLiteDatabase sQLiteDatabase) {
        String str = (String) this.d;
        str.getClass();
        e5j1.b(sQLiteDatabase, 1, str, 1);
        String str2 = (String) this.e;
        str2.getClass();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
        sQLiteDatabase.execSQL("CREATE TABLE " + ((String) this.e) + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
    }

    public boolean y(jit jitVar) {
        if (((jit) this.c).equals(jitVar)) {
            return true;
        }
        zsc zscVar = (zsc) this.b;
        return zscVar != null ? zscVar.y(jitVar) : false;
    }

    public void z(si30 si30Var) {
        zf30 zf30Var = si30Var.c;
        String str = zf30Var.e;
        HashMap map = (HashMap) this.c;
        if (map.get(str) != null) {
            return;
        }
        map.put(zf30Var.e, si30Var);
        if (zf30Var.e1) {
            boolean z = zf30Var.d1;
            di30 di30Var = (di30) this.e;
            if (z) {
                di30Var.T(zf30Var);
            } else {
                di30Var.W(zf30Var);
            }
            zf30Var.e1 = false;
        }
        if (th30.P(2)) {
            zf30Var.toString();
        }
    }

    public zsc(mxa1 mxa1Var, dmj1 dmj1Var, Context context) {
        this.a = (byte) 28;
        this.b = mxa1Var;
        this.c = dmj1Var;
        this.d = context;
        this.e = new AtomicReference(null);
    }

    public zsc(yqg yqgVar, a9c1 a9c1Var, x4c1 x4c1Var, String str) {
        this.a = (byte) 22;
        this.b = yqgVar;
        this.c = a9c1Var;
        this.e = x4c1Var;
        this.d = str;
    }

    public zsc(View view) {
        this.a = (byte) 24;
        this.b = view;
        this.c = (TextView) view.findViewById(2131431394);
        this.d = (TextView) view.findViewById(2131431393);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        rwq0.s(view, new ut1(marginLayoutParams, marginLayoutParams.bottomMargin, (byte) 12));
        if (view.isLaidOut() && !view.isLayoutRequested()) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            rwq0.s(view, new ut1(marginLayoutParams2, marginLayoutParams2.bottomMargin, (byte) 12));
        } else {
            view.addOnLayoutChangeListener(new eg7(this, (byte) 25));
        }
    }

    public zsc(Flowable flowable, xrc0 xrc0Var, jbk0 jbk0Var, z6k0 z6k0Var, o241 o241Var) {
        this.a = (byte) 16;
        this.b = flowable;
        this.c = xrc0Var;
        this.d = jbk0Var;
        this.e = o241Var;
    }

    public zsc(sun sunVar, t8r0 t8r0Var) {
        this.a = (byte) 23;
        this.b = sunVar;
        this.c = t8r0Var;
        this.d = new Object();
        this.e = new LinkedHashMap();
    }

    public zsc(lzn0 lzn0Var, i8h1 i8h1Var, oxi0 oxi0Var, hvp0 hvp0Var) {
        this.a = (byte) 17;
        this.b = lzn0Var;
        this.c = i8h1Var;
        this.d = oxi0Var;
        this.e = zod.E(hvp0Var.g());
    }

    public zsc(wyt0 wyt0Var, zeu0 zeu0Var, o241 o241Var) {
        this.a = (byte) 1;
        this.e = new rku();
        this.c = zeu0Var;
        this.d = o241Var;
        this.b = wyt0Var;
    }

    public zsc(np61 np61Var, nfa0 nfa0Var) {
        this.a = (byte) 8;
        this.b = np61Var;
        this.c = nfa0Var;
        this.d = ConcurrentHashMap.newKeySet();
        this.e = new r36(m210.Companion.serializer(), (byte) 1);
    }

    public zsc(byte b) {
        this.a = b;
        switch (b) {
            case 14:
                this.b = new tpm0(0);
                this.d = new HashSet();
                long jD = upm0.d(System.currentTimeMillis());
                this.e = new upm0(jD, jD);
                break;
            case 20:
                this.b = c97.b(1.0f);
                this.c = c97.b(1.0f);
                this.d = c97.b(1.0f);
                this.e = c97.b(1.0f);
                break;
            default:
                this.b = new ArrayList();
                this.c = new HashMap();
                this.d = new HashMap();
                break;
        }
    }

    public zsc(l670 l670Var, uo5 uo5Var, yfu yfuVar) {
        this.a = (byte) 13;
        this.c = new SparseArray();
        l670Var.getClass();
        this.b = l670Var;
        this.d = uo5Var;
        this.e = yfuVar;
    }

    public zsc(Socket socket) {
        this.a = (byte) 5;
        this.b = socket;
        this.c = new AtomicInteger();
        this.d = new ors(this);
        this.e = new nrs(this);
    }

    public zsc(gw70 gw70Var, rol1 rol1Var, q8n q8nVar) {
        this.a = (byte) 3;
        this.b = gw70Var;
        this.c = rol1Var;
        this.d = q8nVar;
        this.e = ygn0.a();
    }

    public zsc(iu30 iu30Var, iu30 iu30Var2, o8n o8nVar, iu30 iu30Var3) {
        this.a = (byte) 2;
        this.c = iu30Var2;
        this.d = o8nVar;
        this.e = iu30Var3;
        this.b = new vla1(iu30Var);
    }

    public zsc(ki4 ki4Var, ey40 ey40Var, yfu yfuVar) {
        this.a = (byte) 11;
        t380 t380VarW = t380.w("microsoft-surface-buds-legacy-client-id", "c2d7f5fe99d84e04b64cbc1d012d457a", "1d2cf25b1643474983fae381b00cea3c", "e11b1a8713164f739d2a9d9fed5a4c01", "bdbbbe571cef4b148a51a0defb957475", "3e3c91ea35fd41f8925d7bb68f07d3da", "0f6ab2c3f985452a83b1609ce37afc65", "212b005bde914f2c97ab6f310c28ad98", "434d885d509143d9b772a0d46a9e5804", "ce581542d24c47ff957d86f7e1b286ce", "2a1cd724fd0446d389b39036a6323547", "a56a9ca4c3224149844c062bbebf64a4", "c7204c31f95344a6872edd10937c12b3", "82c4b4cd1a034256bd2a190cdcafdd0a", "3e46a9fbac3c4e14b342390f6dcbc9c1", "ddc0016fed8048ad8c61d32f69afb6f1", "76642c7bcc9c466bb99a44ce206edbbe");
        this.b = ki4Var;
        this.c = ey40Var;
        this.d = t380VarW;
        this.e = yfuVar;
    }

    public /* synthetic */ zsc(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public zsc(yab1 yab1Var) {
        this.a = (byte) 0;
        this.b = yab1Var;
        this.c = new SparseArray();
    }
}
