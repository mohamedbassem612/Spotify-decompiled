package p;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.util.ArrayMap;
import android.util.Base64;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import android.view.ViewGroup;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.serialization.BundlerException;
import androidx.car.app.utils.f;
import com.google.firebase.messaging.FirebaseMessaging;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.Context;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import io.reactivex.rxjava3.core.FlowableEmitter;
import io.reactivex.rxjava3.core.FlowableOnSubscribe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRefCount;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import org.chromium.net.UrlResponseInfo;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class k65 implements o7o, s7v, ci7, cdd1, bxs, nzc, fsc1, j9a0, Function, akl, i4d1, a421, FlowableOnSubscribe, a441 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k65(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public void a() {
        amw0 amw0Var = (amw0) this.b;
        kl1 kl1Var = (kl1) this.c;
        n3d n3dVar = (n3d) this.d;
        AtomicReference atomicReference = amw0Var.a.g;
        do {
            if (atomicReference.compareAndSet(kl1Var, null)) {
                kl1Var.H(fmw0.a);
                break;
            }
        } while (atomicReference.get() == kl1Var);
        n8d0 n8d0Var = (jx30) kl1Var.f;
        if (n8d0Var != null) {
            n8d0Var.cancel(false);
            kl1Var.f = null;
        }
        n3dVar.k().a(kl1Var);
    }

    public void accept(Object obj) {
        mgc mgcVar = (mgc) this.b;
        ((w2i0) obj).D(mgcVar.b, (p2i0) this.c, (qqh0) this.d);
    }

    public Object apply(Object obj) throws Throwable {
        long jInsert;
        Cursor cursor;
        c441 c441Var;
        cse0 cse0Var;
        byte b = this.a;
        int i = 6;
        int i2 = 5;
        int i3 = 4;
        int i4 = 3;
        cse0 cse0Var2 = cse0.d;
        int i5 = 2;
        int i6 = 1;
        int i7 = 0;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 11:
                vvc0 vvc0Var = (vvc0) obj4;
                wsc0 wsc0Var = (wsc0) obj;
                return Observable.combineLatest(vvc0Var.g.d((String) obj3).map(new mna0((byte) 9)), yoi1.i(don1.A(yoi1.g((ObservableRefCount) obj2), wsc0Var), o6x.a), new x8a0((Object) vvc0Var, (Object) wsc0Var, (byte) 2));
            case 12:
                vvc0 vvc0Var2 = (vvc0) obj4;
                Observable observable = (Observable) obj2;
                wsc0 wsc0Var2 = (wsc0) obj;
                Single singleJust = Single.just(wsc0Var2);
                Single singleFirstOrError = vvc0Var2.g.d((String) obj3).map(new mna0((byte) 9)).firstOrError();
                String str = wsc0Var2.f.a;
                Set set = s4b1.f;
                return Single.zip(singleJust, singleFirstOrError, observable.filter(new oi(wsc0Var2, uic.x(str).c == blc0.fh, str)).timeout(2L, TimeUnit.SECONDS).firstOrError().onErrorReturnItem(b7x.a), new bf70(vvc0Var2, (byte) 24));
            case 13:
                hlr0 hlr0Var = (hlr0) obj2;
                g3d0 g3d0Var = (g3d0) obj;
                PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy = ((vvc0) obj4).f;
                hlr0Var.getClass();
                return new trc0(playlistRequestDecorationPolicy, g3d0Var, (HashSet) obj3, false, qrc0.a, new iqz0(0, hlr0Var.a), (prc0) null, 0, (List) null, 448);
            case 21:
                c441 c441Var2 = (c441) obj4;
                s09 s09Var = (s09) obj3;
                rax raxVar = s09Var.c;
                String str2 = s09Var.a;
                s29 s29Var = (s29) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long jSimpleQueryForLong = c441Var2.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * c441Var2.a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                t09 t09Var = c441Var2.d;
                if (jSimpleQueryForLong >= t09Var.a) {
                    c441Var2.f(1L, cse0Var2, str2);
                    return -1L;
                }
                Long lC = c441.c(sQLiteDatabase, s29Var);
                if (lC != null) {
                    jInsert = lC.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", s29Var.a);
                    contentValues.put("priority", Integer.valueOf(aow0.a(s29Var.c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = s29Var.b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i8 = t09Var.e;
                byte[] bArr2 = raxVar.b;
                boolean z = bArr2.length <= i8;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", str2);
                contentValues2.put("timestamp_ms", Long.valueOf(s09Var.d));
                contentValues2.put("uptime_ms", Long.valueOf(s09Var.e));
                contentValues2.put("payload_encoding", raxVar.a.a);
                contentValues2.put("code", s09Var.b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put("payload", z ? bArr2 : new byte[0]);
                contentValues2.put("product_id", s09Var.g);
                contentValues2.put("pseudonymous_id", s09Var.h);
                contentValues2.put("experiment_ids_clear_blob", s09Var.i);
                contentValues2.put("experiment_ids_encrypted_blob", s09Var.j);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z) {
                    int iCeil = (int) Math.ceil(((double) bArr2.length) / ((double) i8));
                    for (int i9 = 1; i9 <= iCeil; i9++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i9 - 1) * i8, Math.min(i9 * i8, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i9));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(s09Var.f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            case 22:
                c441 c441Var3 = (c441) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                s29 s29Var2 = (s29) obj2;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j = cursor2.getLong(0);
                    int i10 = cursor2.getInt(7) != 0 ? i6 : 0;
                    em0 em0Var = new em0();
                    em0Var.Q0(new HashMap());
                    em0Var.U0(cursor2.getString(i6));
                    em0Var.T0(cursor2.getLong(i5));
                    em0Var.V0(cursor2.getLong(3));
                    if (i10 != 0) {
                        String string = cursor2.getString(4);
                        em0Var.d = new rax(string == null ? c441.f : new bbx(string), cursor2.getBlob(5));
                        c441Var = c441Var3;
                    } else {
                        String string2 = cursor2.getString(4);
                        bbx bbxVar = string2 == null ? c441.f : new bbx(string2);
                        Cursor cursorQuery = c441Var3.a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int length = 0;
                            while (cursorQuery.moveToNext()) {
                                byte[] blob = cursorQuery.getBlob(0);
                                arrayList2.add(blob);
                                length += blob.length;
                            }
                            byte[] bArr3 = new byte[length];
                            int i11 = 0;
                            int length2 = 0;
                            while (i11 < arrayList2.size()) {
                                byte[] bArr4 = (byte[]) arrayList2.get(i11);
                                c441 c441Var4 = c441Var3;
                                cursor = cursorQuery;
                                try {
                                    System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
                                    length2 += bArr4.length;
                                    i11++;
                                    cursorQuery = cursor;
                                    c441Var3 = c441Var4;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            c441Var = c441Var3;
                            cursorQuery.close();
                            em0Var.d = new rax(bbxVar, bArr3);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        em0Var.c = Integer.valueOf(cursor2.getInt(6));
                    }
                    if (!cursor2.isNull(8)) {
                        em0Var.h = Integer.valueOf(cursor2.getInt(8));
                    }
                    if (!cursor2.isNull(9)) {
                        em0Var.i = cursor2.getString(9);
                    }
                    if (!cursor2.isNull(10)) {
                        em0Var.t = cursor2.getBlob(10);
                    }
                    if (!cursor2.isNull(11)) {
                        em0Var.X = cursor2.getBlob(11);
                    }
                    arrayList.add(new r19(j, s29Var2, em0Var.t()));
                    c441Var3 = c441Var;
                    i5 = 2;
                    i6 = 1;
                }
                return null;
            case 23:
                c441 c441Var5 = (c441) obj4;
                HashMap map = (HashMap) obj3;
                lag lagVar = (lag) obj2;
                ArrayList arrayList3 = (ArrayList) lagVar.c;
                Cursor cursor3 = (Cursor) obj;
                c441Var5.getClass();
                while (cursor3.moveToNext()) {
                    String string3 = cursor3.getString(i7);
                    int i12 = cursor3.getInt(1);
                    cse0 cse0Var3 = cse0.b;
                    if (i12 != 0) {
                        if (i12 == 1) {
                            cse0Var3 = cse0.c;
                        } else if (i12 == 2) {
                            cse0Var = cse0Var2;
                        } else if (i12 == i4) {
                            cse0Var3 = cse0.e;
                        } else if (i12 == i3) {
                            cse0Var3 = cse0.f;
                        } else if (i12 == i2) {
                            cse0Var3 = cse0.g;
                        } else if (i12 == i) {
                            cse0Var3 = cse0.h;
                        } else {
                            pdp1.i("SQLiteEventStore", Integer.valueOf(i12), "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                        }
                        cse0Var = cse0Var3;
                    } else {
                        cse0Var = cse0Var3;
                    }
                    long j2 = cursor3.getLong(2);
                    if (!map.containsKey(string3)) {
                        map.put(string3, new ArrayList());
                    }
                    ((List) map.get(string3)).add(new dse0(j2, cse0Var));
                    i = 6;
                    i2 = 5;
                    i3 = 4;
                    i4 = 3;
                    i7 = 0;
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    int i13 = zse0.c;
                    new ArrayList();
                    arrayList3.add(new zse0((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                }
                long jB = c441Var5.b.b();
                SQLiteDatabase sQLiteDatabaseA = c441Var5.a();
                sQLiteDatabaseA.beginTransaction();
                try {
                    xpe1 xpe1Var = (xpe1) c441.i(sQLiteDatabaseA.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new l58(jB));
                    sQLiteDatabaseA.setTransactionSuccessful();
                    sQLiteDatabaseA.endTransaction();
                    lagVar.b = xpe1Var;
                    lagVar.d = new lv40(new t1c1(c441Var5.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * c441Var5.a().compileStatement("PRAGMA page_count").simpleQueryForLong(), t09.f.a));
                    lagVar.e = (String) c441Var5.e.get();
                    return new dkg((xpe1) lagVar.b, Collections.unmodifiableList(arrayList3), (lv40) lagVar.d, (String) lagVar.e);
                } catch (Throwable th3) {
                    sQLiteDatabaseA.endTransaction();
                    throw th3;
                }
            case 24:
                return ((oh61) obj4).g((String) obj3, (PreparePlayOptions) obj, (String) obj2);
            default:
                return ((oh61) obj4).v.e(new z610((String) obj3, (Context) null, Collections.EMPTY_MAP, (PreparePlayOptions) null, oh61.d(((jr5) obj2).c), (LoggingParams) obj));
        }
    }

    public Object attachCompleter(mzc mzcVar) {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        byte b2 = 0;
        switch (b) {
            case 6:
                pzc pzcVar = (pzc) obj3;
                g661 g661Var = (g661) obj2;
                mzcVar.a(new fss((Object) pzcVar, (byte) 9), g661Var);
                pzcVar.b(new nx30(pzcVar, new a0m(mzcVar, (byte) 26), b2), g661Var);
                return "surfaceList[" + ((ArrayList) obj) + "]";
            default:
                String str = (String) obj2;
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                mzcVar.a(new p8d0(atomicBoolean, (byte) 0), k5u.a);
                ((Executor) obj3).execute(new q8d0(atomicBoolean, mzcVar, (Function0) obj, (byte) 0));
                return str;
        }
    }

    public bg11 b(int i, pnf1 pnf1Var, int[] iArr) {
        zws zwsVar = (zws) this.b;
        String str = (String) this.c;
        String str2 = (String) this.d;
        v280 v280VarM = b380.m();
        for (int i2 = 0; i2 < pnf1Var.a; i2++) {
            v280VarM.c(new axs(i, pnf1Var, i2, zwsVar, iArr[i2], str, str2));
        }
        return v280VarM.g();
    }

    public Object c() {
        gns gnsVar = (gns) this.b;
        s29 s29Var = (s29) this.c;
        s09 s09Var = (s09) this.d;
        c441 c441Var = gnsVar.d;
        c441Var.getClass();
        pdp1.j("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", new Object[]{s29Var.c, s09Var.a, s29Var.a});
        long jLongValue = ((Long) c441Var.d(new k65(c441Var, s09Var, s29Var, (byte) 21))).longValue();
        if (jLongValue >= 1) {
            new r19(jLongValue, s29Var, s09Var);
        }
        gnsVar.a.s(s29Var, 1, false);
        return null;
    }

    public Object call() {
        tcc tccVar;
        IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.b;
        String str = (String) this.d;
        Object obj = this.c;
        if (obj == null) {
            tccVar = null;
        } else {
            try {
                tccVar = new tcc(obj);
            } catch (BundlerException e) {
                f.e(iOnDoneCallback, e, str);
                return null;
            }
        }
        iOnDoneCallback.onSuccess(tccVar);
        return null;
    }

    public hfp1 e(Object obj) {
        String string;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
        String str = (String) this.c;
        upb upbVar = (upb) this.d;
        String str2 = (String) obj;
        android.content.Context context = firebaseMessaging.b;
        nl51 nl51VarC = FirebaseMessaging.c(context);
        wi20 wi20Var = firebaseMessaging.a;
        wi20Var.a();
        String strD = "[DEFAULT]".equals(wi20Var.b) ? "" : wi20Var.d();
        String strA = firebaseMessaging.h.a();
        synchronized (nl51VarC) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("token", str2);
                    jSONObject.put("appVersion", strA);
                    jSONObject.put("timestamp", jCurrentTimeMillis);
                    string = jSONObject.toString();
                } catch (JSONException e) {
                    e.toString();
                    string = null;
                }
                if (string != null) {
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) nl51VarC.b).edit();
                    editorEdit.putString(strD + "|T|" + str + "|*", string);
                    editorEdit.commit();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (upbVar == null || !str2.equals((String) upbVar.b)) {
            wi20 wi20Var2 = firebaseMessaging.a;
            wi20Var2.a();
            if ("[DEFAULT]".equals(wi20Var2.b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    wi20Var2.a();
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new oj80(context).p(intent);
            }
        }
        return o0c.z(str2);
    }

    public Drawable f(Bitmap bitmap) {
        h3a h3aVar = (h3a) this.b;
        s7v s7vVar = (s7v) this.c;
        return (Drawable) h3aVar.apply(s7vVar != null ? s7vVar.f(bitmap) : new BitmapDrawable(((android.content.Context) this.d).getResources(), bitmap));
    }

    public void j(o29 o29Var) {
        hmw0 hmw0Var;
        amw0 amw0Var = (amw0) this.b;
        n3d n3dVar = (n3d) this.c;
        j4d1 j4d1Var = (j4d1) this.d;
        gmw0 gmw0Var = amw0Var.a;
        Objects.toString(o29Var);
        j2h1.o("PreviewView");
        boolean z = n3dVar.g().d() == 0;
        ylw0 ylw0Var = gmw0Var.d;
        Size size = j4d1Var.b;
        ylw0Var.getClass();
        Objects.toString(o29Var);
        Objects.toString(size);
        j2h1.o("PreviewTransform");
        ylw0Var.b = o29Var.a;
        ylw0Var.c = o29Var.b;
        int i = o29Var.c;
        ylw0Var.e = i;
        ylw0Var.a = size;
        ylw0Var.f = z;
        ylw0Var.g = o29Var.d;
        ylw0Var.d = o29Var.e;
        if (i == -1 || ((hmw0Var = gmw0Var.b) != null && (hmw0Var instanceof q4d1))) {
            gmw0Var.e = true;
        } else {
            gmw0Var.e = false;
        }
        gmw0Var.a();
    }

    /* JADX INFO: renamed from: run, reason: collision with other method in class */
    public void m637run() {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        f9a0 f9a0Var = (f9a0) this.b;
        switch (b) {
            case 9:
                UrlResponseInfo urlResponseInfo = (UrlResponseInfo) obj2;
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                i9a0 i9a0Var = f9a0Var.d;
                if (i9a0Var.f.compareAndSet(5, 4)) {
                    f9a0Var.a.onReadCompleted(i9a0Var, urlResponseInfo, byteBuffer);
                }
                break;
            default:
                f9a0Var.a.onRedirectReceived(f9a0Var.d, (v3i1) obj2, (String) obj);
                break;
        }
    }

    public void subscribe(FlowableEmitter flowableEmitter) {
        FlowableEmitter flowableEmitter2;
        nt21 nt21Var = (nt21) this.b;
        Activity activity = (Activity) this.c;
        ViewGroup viewGroup = (ViewGroup) this.d;
        try {
            erw0 erw0Var = erw0.g;
            dce dceVarZ = crm0.z(activity);
            flowableEmitter2 = flowableEmitter;
            try {
                dceVarZ.b(new lph0(nt21Var, dceVarZ, flowableEmitter2, activity, viewGroup, (byte) 3), (ExecutorService) nt21Var.c);
            } catch (Exception e) {
                e = e;
                Exception exc = e;
                Logger.d("Error getting camera provider: %s", new Object[]{exc.getMessage()});
                flowableEmitter2.onError(exc);
            }
        } catch (Exception e2) {
            e = e2;
            flowableEmitter2 = flowableEmitter;
        }
        flowableEmitter2.setCancellable(new u241(nt21Var, activity, (byte) 0));
    }

    @Override // p.o7o
    public Object run() {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        l65 l65Var = (l65) this.b;
        android.net.http.UrlResponseInfo urlResponseInfo = (android.net.http.UrlResponseInfo) obj2;
        switch (b) {
            case 0:
                o65 o65VarB = o65.b(urlResponseInfo);
                l65Var.a.onReadCompleted(l65Var.b, o65VarB, (ByteBuffer) obj);
                break;
            default:
                o65 o65VarB2 = o65.b(urlResponseInfo);
                l65Var.a.onRedirectReceived(l65Var.b, o65VarB2, (String) obj);
                break;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x013e A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:4:0x0019, B:10:0x002a, B:11:0x003e, B:15:0x0043, B:16:0x004a, B:18:0x0050, B:19:0x0066, B:20:0x00c5, B:22:0x00cb, B:23:0x00dc, B:25:0x00ec, B:27:0x00f0, B:28:0x00fc, B:29:0x0114, B:31:0x011a, B:33:0x0128, B:35:0x0130, B:39:0x013e, B:41:0x0150, B:44:0x0168, B:45:0x0174, B:46:0x0187, B:48:0x018d, B:51:0x01a6, B:52:0x01b9, B:54:0x01d1, B:56:0x01d5, B:58:0x01df, B:59:0x0200, B:61:0x0206, B:62:0x0216, B:64:0x022c, B:65:0x0231, B:66:0x0239, B:69:0x023c, B:70:0x0242, B:72:0x0244, B:73:0x0259), top: B:77:0x0019, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0150 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:4:0x0019, B:10:0x002a, B:11:0x003e, B:15:0x0043, B:16:0x004a, B:18:0x0050, B:19:0x0066, B:20:0x00c5, B:22:0x00cb, B:23:0x00dc, B:25:0x00ec, B:27:0x00f0, B:28:0x00fc, B:29:0x0114, B:31:0x011a, B:33:0x0128, B:35:0x0130, B:39:0x013e, B:41:0x0150, B:44:0x0168, B:45:0x0174, B:46:0x0187, B:48:0x018d, B:51:0x01a6, B:52:0x01b9, B:54:0x01d1, B:56:0x01d5, B:58:0x01df, B:59:0x0200, B:61:0x0206, B:62:0x0216, B:64:0x022c, B:65:0x0231, B:66:0x0239, B:69:0x023c, B:70:0x0242, B:72:0x0244, B:73:0x0259), top: B:77:0x0019, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0165  */
    /* JADX INFO: renamed from: apply, reason: collision with other method in class */
    public n8d0 m636apply(Object obj) {
        InputConfiguration inputConfiguration;
        boolean z;
        utq0 utq0VarE;
        String str;
        iod iodVar = (iod) this.b;
        bb61 bb61Var = (bb61) this.c;
        CameraDevice cameraDevice = (CameraDevice) this.d;
        List list = (List) obj;
        synchronized (iodVar.a) {
            try {
                int iC = l1d.C(iodVar.i);
                if (iC != 0 && iC != 1) {
                    if (iC == 2) {
                        iodVar.g.clear();
                        for (int i = 0; i < list.size(); i++) {
                            iodVar.g.put((j2t) iodVar.h.get(i), (Surface) list.get(i));
                        }
                        iodVar.i = 4;
                        j2h1.o("CaptureSession");
                        hod hodVar = new hod(Arrays.asList(iodVar.c, new hod(bb61Var.d, (byte) 1)), (byte) 2);
                        wnd wndVar = bb61Var.g;
                        z1d z1dVar = new z1d(wndVar.b, (byte) 9);
                        HashSet hashSet = new HashSet();
                        xdn0.d();
                        ArrayList arrayList = new ArrayList();
                        yen0.a();
                        hashSet.addAll(wndVar.a);
                        xdn0 xdn0VarN = xdn0.n(wndVar.b);
                        int i2 = wndVar.c;
                        arrayList.addAll(wndVar.d);
                        boolean z2 = wndVar.e;
                        tod1 tod1Var = wndVar.f;
                        ArrayMap arrayMap = new ArrayMap();
                        for (String str2 : tod1Var.a.keySet()) {
                            arrayMap.put(str2, tod1Var.a.get(str2));
                        }
                        yen0 yen0Var = new yen0(arrayMap);
                        HashMap map = new HashMap();
                        if (iodVar.r && Build.VERSION.SDK_INT >= 35) {
                            map = iod.c(iod.f(bb61Var.a), iodVar.g);
                        }
                        ArrayList<utq0> arrayList2 = new ArrayList();
                        String str3 = (String) ((qsk) ((uq8) z1dVar).b).h(z1d.h, (Object) null);
                        for (b29 b29Var : bb61Var.a) {
                            xdn0 xdn0Var = xdn0VarN;
                            if (iodVar.r) {
                                z = z2;
                                utq0VarE = Build.VERSION.SDK_INT >= 35 ? (utq0) map.get(b29Var) : null;
                                if (utq0VarE == null) {
                                    utq0VarE = iodVar.e(b29Var, iodVar.g, str3);
                                    str = str3;
                                    if (iodVar.l.containsKey(b29Var.a)) {
                                        utq0VarE.a.i(((Long) iodVar.l.get(b29Var.a)).longValue());
                                    }
                                    arrayList2.add(utq0VarE);
                                    i2 = i2;
                                    xdn0VarN = xdn0Var;
                                    z2 = z;
                                    str3 = str;
                                } else {
                                    str = str3;
                                }
                                arrayList2.add(utq0VarE);
                                i2 = i2;
                                xdn0VarN = xdn0Var;
                                z2 = z;
                                str3 = str;
                            } else {
                                z = z2;
                            }
                            if (utq0VarE == null) {
                                utq0VarE = iodVar.e(b29Var, iodVar.g, str3);
                                str = str3;
                                if (iodVar.l.containsKey(b29Var.a)) {
                                    utq0VarE.a.i(((Long) iodVar.l.get(b29Var.a)).longValue());
                                }
                                arrayList2.add(utq0VarE);
                                i2 = i2;
                                xdn0VarN = xdn0Var;
                                z2 = z;
                                str3 = str;
                            } else {
                                str = str3;
                            }
                            arrayList2.add(utq0VarE);
                            i2 = i2;
                            xdn0VarN = xdn0Var;
                            z2 = z;
                            str3 = str;
                        }
                        xdn0 xdn0Var2 = xdn0VarN;
                        boolean z3 = z2;
                        int i3 = i2;
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        for (utq0 utq0Var : arrayList2) {
                            if (!arrayList3.contains(((OutputConfiguration) utq0Var.a.c()).getSurface())) {
                                arrayList3.add(((OutputConfiguration) utq0Var.a.c()).getSurface());
                                arrayList4.add(utq0Var);
                            }
                        }
                        hdd1 hdd1Var = iodVar.d;
                        hdd1Var.f = hodVar;
                        jb61 jb61Var = new jb61(arrayList4, hdd1Var.d, new t2d(hdd1Var, (byte) 1));
                        if (bb61Var.g.c == 5 && (inputConfiguration = bb61Var.h) != null) {
                            jb61Var.a.b(ei80.a(inputConfiguration));
                        }
                        try {
                            ArrayList arrayList5 = new ArrayList(hashSet);
                            eqq0 eqq0VarB = eqq0.b(xdn0Var2);
                            ArrayList arrayList6 = new ArrayList(arrayList);
                            tod1 tod1Var2 = tod1.b;
                            ArrayMap arrayMap2 = new ArrayMap();
                            for (String str4 : yen0Var.a.keySet()) {
                                arrayMap2.put(str4, yen0Var.a.get(str4));
                            }
                            CaptureRequest captureRequestO = eqn1.o(new wnd(arrayList5, eqq0VarB, i3, arrayList6, z3, new tod1(arrayMap2), null), cameraDevice, iodVar.q);
                            if (captureRequestO != null) {
                                jb61Var.a.h(captureRequestO);
                            }
                            return iodVar.d.n(cameraDevice, jb61Var, iodVar.h);
                        } catch (CameraAccessException e) {
                            return new e280(e, (byte) 1);
                        }
                    }
                    if (iC != 4) {
                        return new e280(new CancellationException("openCaptureSession() not execute in state: ".concat(l1d.G(iodVar.i))), (byte) 1);
                    }
                }
                return new e280(new IllegalStateException("openCaptureSession() should not be possible in state: ".concat(l1d.G(iodVar.i))), (byte) 1);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
