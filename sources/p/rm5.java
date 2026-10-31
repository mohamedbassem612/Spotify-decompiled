package p;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.cardview.widget.CardView;
import androidx.media3.database.DatabaseIOException;
import com.facebook.FacebookException;
import com.spotify.concertcampaignview.v1.CampaignActionRequest;
import com.spotify.concertcampaignview.v1.CampaignCardRequest;
import com.spotify.concertcampaignview.v1.CampaignRouting;
import com.spotify.concertcampaignview.v1.CampaignRoutingCardRequest;
import com.spotify.concertcampaignview.v1.ConcertCampaignPageRequest;
import com.spotify.rcs.resolver.grpc.v0.Configuration;
import com.spotify.rcs.resolver.grpc.v0.ResolveResponse;
import com.spotify.remoteconfig.fetcherimpl.network.ResolveRequestFailedException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.net.SocketTimeoutException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rm5 implements uz71, wa00, z2n, fxc, mc41 {
    public static ScheduledThreadPoolExecutor c;
    public static volatile String e;
    public static boolean f;
    public Object a;
    public Object b;
    public static final Object d = new Object();
    public static final eg g = new eg();
    public static final long[] h = {604800000, 1209600000};
    public static final String[] i = {"name", "length", "last_touch_timestamp"};
    public static final y0z t = new y0z();
    public static final sua X = new sua((byte) 15);
    public static final xgc Y = new xgc((byte) 28);

    public rm5(String str, String str2) {
        w0h1.H();
        this.a = str;
        Date date = xd.Y;
        xd xdVarS = fuo1.s();
        if (xdVarS == null || new Date().after(xdVarS.a) || !(str2 == null || str2.equals(xdVarS.h))) {
            if (str2 == null) {
                wf10.a();
                str2 = wf10.b();
            }
            this.b = new zd(null, str2);
        } else {
            this.b = new zd(xdVarS.e, wf10.b());
        }
        wbx0.b();
    }

    public static void A(rm5 rm5Var, String str, Double d2, Bundle bundle, boolean z, UUID uuid) {
        if (dhn.a.contains(rm5.class)) {
            return;
        }
        try {
            rm5Var.z(str, d2, bundle, z, uuid, null);
        } catch (Throwable th) {
            dhn.a(rm5.class, th);
        }
    }

    public static int O(mo6 mo6Var) {
        switch (mo6Var.ordinal()) {
            case 1:
                return 7;
            case 2:
                return 5;
            case 3:
                return 2;
            case 4:
                return 6;
            case 5:
                return 10;
            case 6:
                return 1;
            case 7:
                return 8;
            case 8:
                return 4;
            default:
                return 9;
        }
    }

    public static void Q(File file, byte[] bArr) throws Exception {
        File fileCreateTempFile = File.createTempFile(f4i1.e(file.getName(), "."), ".tmp", file.getParentFile());
        try {
            fileCreateTempFile.getClass();
            y520.J(fileCreateTempFile, bArr);
            if (fileCreateTempFile.renameTo(file)) {
                return;
            }
            throw new IOException("Failed to move " + fileCreateTempFile.getName() + " to " + file.getName());
        } catch (Exception e2) {
            fileCreateTempFile.delete();
            throw e2;
        }
    }

    public static final String g() {
        if (dhn.a.contains(rm5.class)) {
            return null;
        }
        try {
            return e;
        } catch (Throwable th) {
            dhn.a(rm5.class, th);
            return null;
        }
    }

    public static final ScheduledThreadPoolExecutor h() {
        if (dhn.a.contains(rm5.class)) {
            return null;
        }
        try {
            return c;
        } catch (Throwable th) {
            dhn.a(rm5.class, th);
            return null;
        }
    }

    public static final Object j() {
        if (dhn.a.contains(rm5.class)) {
            return null;
        }
        try {
            return d;
        } catch (Throwable th) {
            dhn.a(rm5.class, th);
            return null;
        }
    }

    public static rm5 k(Context context) {
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    return new rm5(channel, fileLockLock);
                } catch (IOException | Error | OverlappingFileLockException unused) {
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused2) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException unused4) {
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException unused5) {
            channel = null;
            fileLockLock = null;
        }
    }

    public static oqh1 l(Bundle bundle) {
        String string = bundle != null ? bundle.getString("qualityName") : null;
        if (string == null) {
            string = "";
        }
        String string2 = bundle != null ? bundle.getString("currentSize") : null;
        if (string2 == null) {
            string2 = "";
        }
        String string3 = bundle != null ? bundle.getString("estimatedSize") : null;
        return new oqh1(string, string2, string3 != null ? string3 : "");
    }

    public static rm5 t() {
        n3c n3cVarH = n3c.h();
        if (n3cVarH == null) {
            return null;
        }
        return n3cVarH.c;
    }

    public static boolean v(String str) {
        return TextUtils.isEmpty(str) || str.equals("bnc_no_value");
    }

    public void B(Bundle bundle, String str) {
        rm5 rm5Var;
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            rm5Var = this;
            try {
                A(rm5Var, str, null, bundle, true, og0.b());
            } catch (Throwable th) {
                th = th;
                dhn.a(rm5Var, th);
            }
        } catch (Throwable th2) {
            th = th2;
            rm5Var = this;
        }
    }

    public void C(long j, x020 x020Var, sy21 sy21Var) {
        int i2;
        String strA;
        ry21 ry21Var;
        if (sy21Var == null || (ry21Var = sy21Var.a.i) == null) {
            i2 = sy21Var != null ? sy21Var.a.d : -1;
        } else {
            i2 = ry21Var.d;
        }
        int iF = x760.F(i2);
        ry21 ry21Var2 = sy21Var.a;
        ry21 ry21Var3 = ry21Var2.i;
        if (ry21Var2.Q0) {
            strA = sy21Var.b == null ? "Missing resolve response body" : "Missing configuration in resolve response";
        } else {
            strA = y2o1.A(sy21Var);
        }
        String str = strA;
        utw0 utw0Var = ike1.a;
        utw0Var.y("RCS");
        utw0Var.A("There was an error in ResolveResponse. code: %d body: %s", Integer.valueOf(ry21Var3 != null ? ry21Var3.d : ry21Var2.d), str);
        za00 za00Var = (za00) this.b;
        String strName = x020Var.name();
        ya00 ya00Var = new ya00(str, iF, iF, 232, str);
        if (ry21Var3 != null) {
            ry21Var2 = ry21Var3;
        }
        za00Var.c(strName, j, ya00Var, ry21Var2.d);
    }

    public void D(long j, x020 x020Var, sy21 sy21Var) {
        za00 za00Var = (za00) this.b;
        utw0 utw0Var = ike1.a;
        utw0Var.y("RCS");
        Long lValueOf = Long.valueOf(j);
        ry21 ry21Var = sy21Var.a;
        int i2 = ry21Var.d;
        ry21 ry21Var2 = ry21Var.i;
        utw0Var.o("ResolveRequest responded in %d ms with code %d ", lValueOf, Integer.valueOf(ry21Var2 != null ? ry21Var2.d : i2));
        if (i2 == 304) {
            za00Var.a(x020Var.name(), 304, j, 0, "", 0L, "unnecessaryFetch=true");
            return;
        }
        ResolveResponse resolveResponse = (ResolveResponse) sy21Var.b;
        if (!ry21Var.Q0 || resolveResponse == null || !resolveResponse.p()) {
            C(j, x020Var, sy21Var);
            return;
        }
        svz0 svz0VarC = ((cj4) ((ne) this.a).d).c();
        svz0 svz0Var = svz0.d;
        Configuration configurationO = resolveResponse.o();
        h290<Configuration.AssignedValue> h290VarO = configurationO.o();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarO, 10));
        for (Configuration.AssignedValue assignedValue : h290VarO) {
            assignedValue.getClass();
            arrayList.add(l67.b(assignedValue));
        }
        Boolean boolValueOf = Boolean.valueOf(((Set) svz0VarC.c.getValue()).equals((Set) ulc.m(new sc50(configurationO.p(), configurationO.r(), Collections.unmodifiableList(arrayList), configurationO.s(), 16)).c.getValue()));
        if (u890.j(boolValueOf, Boolean.TRUE)) {
            utw0Var.y("RCS");
            utw0Var.v("This fetch was unnecessary 😥", new Object[0]);
        }
        String strName = x020Var.name();
        if (ry21Var2 != null) {
            i2 = ry21Var2.d;
        }
        za00Var.a(strName, i2, j, resolveResponse.getSerializedSize(), resolveResponse.o().p(), Long.valueOf(resolveResponse.o().r()), "unnecessaryFetch=" + boolValueOf.booleanValue());
    }

    public void E(BigDecimal bigDecimal, Currency currency, Bundle bundle, ylq0 ylq0Var) {
        Throwable th;
        rm5 rm5Var;
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            if (bigDecimal == null) {
                wbx0.d();
                return;
            }
            if (currency == null) {
                wbx0.d();
                return;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            try {
                bundle2.putString("fb_currency", currency.getCurrencyCode());
                rm5Var = this;
                try {
                    rm5Var.z("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle2, true, og0.b(), ylq0Var);
                    wbx0.g();
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    dhn.a(rm5Var, th);
                }
            } catch (Throwable th3) {
                th = th3;
                rm5Var = this;
            }
        } catch (Throwable th4) {
            th = th4;
            rm5Var = this;
        }
    }

    public void F(Throwable th, x020 x020Var, long j) {
        za00 za00Var = (za00) this.b;
        utw0 utw0Var = ike1.a;
        utw0Var.y("RCS");
        utw0Var.B(th, "The call failed locally within %d ms.", Long.valueOf(j));
        if (th instanceof ResolveRequestFailedException) {
            C(j, x020Var, ((ResolveRequestFailedException) th).a());
            return;
        }
        if ((th instanceof SocketTimeoutException) || u890.j(th.getMessage(), "timeout")) {
            za00Var.c(x020Var.name(), j, new ya00(th.getMessage(), 2, 0, 252, (String) null), -1);
            return;
        }
        if (th.getMessage() != null) {
            za00Var.c(x020Var.name(), j, new ya00(th.getMessage(), 5, 0, 252, (String) null), -1);
            return;
        }
        String message = th.getMessage();
        if (message == null) {
            message = "unknown error message";
        }
        Throwable cause = th.getCause();
        za00Var.c(x020Var.name(), j, new ya00(f4i1.f(message, " - ", cause != null ? cause.getMessage() : null), 1, 0, 252, (String) null), -1);
    }

    public spq0 G(String str) {
        Enum enumP = p(str);
        return enumP != null ? new i5w0(enumP) : j5.a;
    }

    public void H() {
        r4t r4tVar = (r4t) this.b;
        if (((AtomicBoolean) this.a).compareAndSet(false, true) && r4tVar.d().decrementAndGet() == 0 && r4t.a(r4tVar).compareAndSet(false, true)) {
            r4t.b(r4tVar).a();
        }
    }

    public void I() {
        try {
            ((FileLock) this.b).release();
            ((FileChannel) this.a).close();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.database.DatabaseIOException */
    public void J(Set set) throws DatabaseIOException {
        ((String) this.a).getClass();
        try {
            SQLiteDatabase writableDatabase = ((yab1) this.b).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete((String) this.a, "name = ?", new String[]{(String) it.next()});
                }
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.database.DatabaseIOException */
    public void K(long j, long j2, String str) throws DatabaseIOException {
        ((String) this.a).getClass();
        try {
            SQLiteDatabase writableDatabase = ((yab1) this.b).getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow((String) this.a, null, contentValues);
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    public void L(String str, List list) throws Exception {
        P(str).mkdirs();
        Q(new File(P(str), ".cue-manifest"), o7h.y0(list, "\n", (String) null, (String) null, (iu30) null, 62).getBytes(nne.a));
    }

    public void M(JSONObject jSONObject) {
        t861 t861Var = t861.e;
        i1k0.B("setPostUserAgent " + Thread.currentThread().getName());
        try {
            if (TextUtils.isEmpty(n3c.p)) {
                Context context = (Context) this.b;
                sqt sqtVar = new sqt(jSONObject);
                xgn0 xgn0Var = cwt.a;
                c921.H(igu.a, new zlo(context, (lnm) null, (byte) 27), sqtVar);
                return;
            }
            i1k0.B("userAgent was cached: " + n3c.p);
            f4t f4tVar = f4t.b;
            jSONObject.put("user_agent", n3c.p);
            n3c.h().f.r(t861Var);
            n3c.h().f.p("setPostUserAgent");
        } catch (Exception e2) {
            i1k0.C("Caught exception trying to set userAgent " + e2.getMessage());
            n3c.h().f.r(t861Var);
            n3c.h().f.p("getUserAgentAsync");
        }
    }

    public void N(int i2, int i3, int i4, int i5) {
        CardView cardView = (CardView) this.b;
        cardView.d.set(i2, i3, i4, i5);
        Rect rect = cardView.c;
        super/*android.view.View*/.setPadding(i2 + rect.left, i3 + rect.top, i4 + rect.right, i5 + rect.bottom);
    }

    public File P(String str) {
        return new File((File) this.a, ihc1.c1(16, avw0.e(str.getBytes(nne.a))));
    }

    public Type b() {
        return (Type) this.a;
    }

    public xa00 c(jf01 jf01Var) {
        ta00 ta00VarC = ((wa00) this.a).c(jf01Var);
        ta00 ta00VarC2 = ((mzp0) this.b).c(jf01Var);
        ta00VarC.getClass();
        ta00 ta00Var = xa00.a;
        if (ta00VarC == ta00Var) {
            return ta00VarC2;
        }
        xa00[] xa00VarArrH = ta00VarC instanceof ta00 ? ta00VarC.H() : new xa00[]{ta00VarC};
        if (ta00VarC2 == ta00Var) {
            return ta00VarC;
        }
        return new ta00((xa00[]) f46.A0(xa00VarArrH, ta00VarC2 instanceof ta00 ? ta00VarC2.H() : new xa00[]{ta00VarC2}));
    }

    @Override // p.mc41
    public Bundle d(Object obj) {
        return (Bundle) ((iu30) this.a).invoke(obj);
    }

    @Override // p.mc41
    public Object e(Bundle bundle, Object obj) {
        return ((vu30) this.b).invoke(bundle, obj);
    }

    public boolean f(String str) {
        return ((v3c) this.a).f(str) || ((fjb) this.b).f(str);
    }

    public Object i(wyp0 wyp0Var) {
        Executor executor = (Executor) this.b;
        return executor == null ? wyp0Var : new okr(executor, wyp0Var);
    }

    public Object m(String str, onm onmVar) {
        g5d g5dVarO = CampaignActionRequest.o();
        g5dVarO.n(str);
        CampaignActionRequest campaignActionRequest = (CampaignActionRequest) g5dVarO.build();
        ybk ybkVar = (ybk) this.a;
        campaignActionRequest.getClass();
        return ybkVar.a(campaignActionRequest, onmVar);
    }

    public File n(String str, String str2) {
        return new File(P(str), f4i1.e(str2, ".mp3"));
    }

    public spq0 o(String str) {
        return str != null ? G(str) : j5.a;
    }

    public Enum p(String str) {
        HashMap map = (HashMap) this.b;
        str.getClass();
        return (Enum) map.get(str.toUpperCase(Locale.US));
    }

    public Object q(Class cls) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.b;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return obj;
        }
        Object objInvoke = ((iu30) this.a).invoke(cls);
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, objInvoke);
        return objPutIfAbsent == null ? objInvoke : objPutIfAbsent;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.database.DatabaseIOException */
    public HashMap r() throws DatabaseIOException {
        try {
            ((String) this.a).getClass();
            Cursor cursorQuery = ((yab1) this.b).getReadableDatabase().query((String) this.a, i, null, null, null, null, null);
            try {
                HashMap map = new HashMap(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    string.getClass();
                    map.put(string, new nqc(cursorQuery.getLong(1), cursorQuery.getLong(2)));
                }
                cursorQuery.close();
                return map;
            } catch (Throwable th) {
                if (cursorQuery == null) {
                    throw th;
                }
                try {
                    cursorQuery.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    public Object s(String str, a8d1 a8d1Var) {
        zbk zbkVarO = ConcertCampaignPageRequest.o();
        zbkVarO.n(str);
        ConcertCampaignPageRequest concertCampaignPageRequest = (ConcertCampaignPageRequest) zbkVarO.build();
        ybk ybkVar = (ybk) this.a;
        concertCampaignPageRequest.getClass();
        return ybkVar.e(concertCampaignPageRequest, a8d1Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.database.DatabaseIOException */
    public void u(long j) throws DatabaseIOException {
        yab1 yab1Var = (yab1) this.b;
        try {
            String hexString = Long.toHexString(j);
            this.a = "ExoPlayerCacheFileMetadata" + hexString;
            if (e5j1.a(yab1Var.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = yab1Var.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    e5j1.b(writableDatabase, 2, hexString, 1);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + ((String) this.a));
                    writableDatabase.execSQL("CREATE TABLE " + ((String) this.a) + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    public Object w(String str, onm onmVar) {
        g5d g5dVarO = CampaignActionRequest.o();
        g5dVarO.n(str);
        CampaignActionRequest campaignActionRequest = (CampaignActionRequest) g5dVarO.build();
        ybk ybkVar = (ybk) this.a;
        campaignActionRequest.getClass();
        return ybkVar.d(campaignActionRequest, onmVar);
    }

    public Object x(String str, String str2, String str3, a8d1 a8d1Var) {
        ybk ybkVar = (ybk) this.a;
        xrk xrkVar = (xrk) this.b;
        if (str2 == null || str3 == null) {
            j5d j5dVarP = CampaignCardRequest.p();
            j5dVarP.q(str);
            if (xrkVar.p && xrkVar.q) {
                j5dVarP.n();
            }
            CampaignCardRequest campaignCardRequest = (CampaignCardRequest) j5dVarP.build();
            campaignCardRequest.getClass();
            return ybkVar.c(campaignCardRequest, a8d1Var);
        }
        t6d t6dVarP = CampaignRouting.p();
        t6dVarP.n(str);
        t6dVarP.q(str2);
        t6dVarP.r(str3);
        CampaignRouting campaignRoutingBuild = t6dVarP.build();
        campaignRoutingBuild.getClass();
        v6d v6dVarP = CampaignRoutingCardRequest.p();
        v6dVarP.q(campaignRoutingBuild);
        if (xrkVar.p && xrkVar.q) {
            v6dVarP.n();
        }
        CampaignRoutingCardRequest campaignRoutingCardRequest = (CampaignRoutingCardRequest) v6dVarP.build();
        campaignRoutingCardRequest.getClass();
        return ybkVar.b(campaignRoutingCardRequest, a8d1Var);
    }

    public void y(Bundle bundle, String str) {
        rm5 rm5Var;
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            rm5Var = this;
            try {
                A(rm5Var, str, null, bundle, false, og0.b());
            } catch (Throwable th) {
                th = th;
                dhn.a(rm5Var, th);
            }
        } catch (Throwable th2) {
            th = th2;
            rm5Var = this;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0096  */
    public void z(String str, Double d2, Bundle bundle, boolean z, UUID uuid, ylq0 ylq0Var) {
        ylq0 ylq0Var2;
        Bundle bundle2;
        Set set = dhn.a;
        if (set.contains(this) || str == null) {
            return;
        }
        try {
            if (str.length() == 0) {
                return;
            }
            boolean zContains = false;
            if (z || !m69.c() || (!str.equals("fb_mobile_purchase") && !str.equals("Subscribe") && !str.equals("StartTrial"))) {
                ylq0Var2 = ylq0Var;
                bundle2 = bundle;
            } else if ((mn10.b(kn10.AndroidManualImplicitPurchaseDedupe) && str.equals("fb_mobile_purchase")) || (mn10.b(kn10.AndroidManualImplicitSubsDedupe) && (str.equals("Subscribe") || str.equals("StartTrial")))) {
                Double dF = w580.f(d2, bundle);
                Currency currencyB = w580.b(bundle);
                if (dF == null || currencyB == null) {
                    ylq0Var2 = ylq0Var;
                    bundle2 = bundle;
                } else {
                    mmr0 mmr0VarA = w580.a(z580.c(k4p1.x(new k580(str, dF.doubleValue(), currencyB)), System.currentTimeMillis(), false, k4p1.x(new mmr0(bundle, ylq0Var))), bundle, ylq0Var);
                    bundle2 = (Bundle) mmr0VarA.a;
                    ylq0Var2 = (ylq0) mmr0VarA.b;
                }
            } else {
                ylq0Var2 = ylq0Var;
                bundle2 = bundle;
            }
            boolean zB = b120.b("app_events_killswitch", wf10.b(), false);
            zue0 zue0Var = zue0.c;
            if (zB) {
                fza fzaVar = oue0.a;
                fza.f(zue0Var);
                return;
            }
            y8b y8bVar = y8b.a;
            if (!set.contains(y8b.class)) {
                try {
                    if (y8b.b) {
                        zContains = y8b.c.contains(str);
                    }
                } catch (Throwable th) {
                    dhn.a(y8b.class, th);
                }
            }
            if (zContains) {
                return;
            }
            mmr0 mmr0VarF = wbx0.f(bundle2, ylq0Var2, z);
            Bundle bundle3 = (Bundle) mmr0VarF.a;
            ylq0 ylq0Var3 = (ylq0) mmr0VarF.b;
            try {
                if (!vey0.a.c(bundle3)) {
                    i561.b(bundle3, str);
                }
                t4a.a(bundle3);
                stf0.e(bundle3, str);
                mub1.d(bundle3);
                vey0.b(bundle3);
                wbx0.c(new bm5((String) this.a, str, d2, bundle3, z, og0.c(), uuid, ylq0Var3), (zd) this.b);
            } catch (FacebookException e2) {
                fza fzaVar2 = oue0.a;
                e2.toString();
                fza.f(zue0Var);
            } catch (JSONException e3) {
                fza fzaVar3 = oue0.a;
                e3.toString();
                fza.f(zue0Var);
            }
        } catch (Throwable th2) {
            dhn.a(this, th2);
        }
    }

    public /* synthetic */ rm5(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public rm5(iu30 iu30Var, byte b) {
        switch (b) {
            case 17:
                this.a = iu30Var;
                this.b = new ConcurrentHashMap();
                break;
            default:
                this.a = iu30Var;
                break;
        }
    }

    public rm5(String str, i8h1 i8h1Var) {
        this.b = i8h1Var;
        this.a = new urk0(str, (byte) 0);
    }

    public rm5(Context context, byte b) {
        switch (b) {
            case 28:
                this.b = context;
                this.a = new tqt();
                break;
            default:
                this.a = context;
                this.b = null;
                break;
        }
    }

    public rm5(d520 d520Var) {
        this.a = d520Var;
        this.b = X;
    }

    public rm5(Class cls, wu30 wu30Var) {
        cls.getClass();
        this.a = cls;
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        this.b = new HashMap(mno1.k(enumArr.length));
        for (Enum r2 : enumArr) {
            ((HashMap) this.b).put(((String) wu30Var.apply(r2)).toUpperCase(Locale.US), r2);
        }
    }

    public /* synthetic */ rm5(Object obj) {
        this.b = obj;
    }

    public rm5(Context context, String str) {
        this(fpi1.k(context), str);
    }
}
