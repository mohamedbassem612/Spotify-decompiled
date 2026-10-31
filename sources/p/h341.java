package p;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.RemoteException;
import android.view.Surface;
import androidx.media3.transformer.ExportException;
import androidx.work.WorkerParameters;
import androidx.work.rxjava3.RxWorker;
import com.spotify.betamax.transcoder.BetamaxTranscoderException;
import com.spotify.interapp.service.IapException;
import com.spotify.player.model.AudioStream;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import com.spotify.player.model.command.SetShufflingContextCommand;
import com.spotify.player.model.command.options.PreparePlayOptions;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.schedulers.ExecutorScheduler;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class h341 implements nzc, a441, qy70, ObservableOnSubscribe, Function, SingleOnSubscribe, akl, e9d0, cdd1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h341(a1g1 a1g1Var, dt00 dt00Var, ExportException exportException) {
        this.a = (byte) 16;
        this.b = a1g1Var;
        this.c = exportException;
    }

    public pyp0 a(fjb fjbVar) {
        oae1 oae1Var = (oae1) this.b;
        ze5 ze5Var = (ze5) this.c;
        y9e1 y9e1Var = (y9e1) oae1Var.a.getValue();
        if (y9e1Var == null) {
            return new pyp0(0, 0, new mf41((byte) 10), (byte) 10);
        }
        ze5 ze5VarC = oae1.c(ze5Var, y9e1Var);
        if (ze5VarC == null) {
            return new pyp0(0, 0, new mf41((byte) 9), (byte) 10);
        }
        ur80 ur80VarH = hm5.H(y9e1Var.k(ze5VarC.b, ze5VarC.c).i());
        return new pyp0(ur80VarH.d(), ur80VarH.b(), new ww21(ur80VarH, (byte) 24), (byte) 10);
    }

    public void accept(Object obj) {
        upc1 upc1Var = (upc1) this.b;
        AtomicLong atomicLong = (AtomicLong) this.c;
        bfo bfoVar = (bfo) obj;
        tpc1 tpc1Var = new tpc1(bfoVar.b, nhc.w(bfoVar.a, bfoVar.c));
        upc1Var.c.add(tpc1Var);
        long j = bfoVar.d;
        if (j != -9223372036854775807L) {
            atomicLong.set(atomicLong.get() == -9223372036854775807L ? j : Math.max(atomicLong.get(), j));
        }
        long j2 = upc1Var.l;
        if (j2 == -9223372036854775807L || j >= j2) {
            upc1Var.f(tpc1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.interapp.service.IapException */
    /* JADX WARN: Code duplicated, block: B:108:0x0240 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x0282 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x02b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x029b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0229  */
    /* JADX WARN: Code duplicated, block: B:75:0x023b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0266 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:78:0x0260, B:80:0x0266, B:82:0x0276, B:83:0x0282), top: B:100:0x0260 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0276 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:78:0x0260, B:80:0x0266, B:82:0x0276, B:83:0x0282), top: B:100:0x0260 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:94:0x02d0 A[LOOP:4: B:92:0x02ca->B:94:0x02d0, LOOP_END] */
    public Object apply(Object obj) throws IapException {
        HashMap map;
        StringBuilder sb;
        int i;
        Cursor cursorQuery;
        ListIterator listIterator;
        r19 r19Var;
        long j;
        long j2;
        em0 em0VarC;
        long j3;
        Set hashSet;
        byte b = this.a;
        boolean z = true;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 1:
                c441 c441Var = (c441) obj3;
                s29 s29Var = (s29) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                t09 t09Var = c441Var.d;
                ArrayList arrayListE = c441Var.e(sQLiteDatabase, s29Var, t09Var.b);
                for (xnw0 xnw0Var : xnw0.values()) {
                    if (xnw0Var != s29Var.c) {
                        int size = t09Var.b - arrayListE.size();
                        if (size <= 0) {
                            map = new HashMap();
                            sb = new StringBuilder("event_id IN (");
                            for (i = 0; i < arrayListE.size(); i++) {
                                sb.append(((r19) arrayListE.get(i)).a);
                                if (i < arrayListE.size() - 1) {
                                    sb.append(',');
                                }
                            }
                            sb.append(')');
                            cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
                            while (cursorQuery.moveToNext()) {
                                try {
                                    j3 = cursorQuery.getLong(0);
                                    hashSet = (Set) map.get(Long.valueOf(j3));
                                    if (hashSet == null) {
                                        hashSet = new HashSet();
                                        map.put(Long.valueOf(j3), hashSet);
                                    }
                                    hashSet.add(new b441(cursorQuery.getString(1), cursorQuery.getString(2)));
                                } catch (Throwable th) {
                                    cursorQuery.close();
                                    throw th;
                                }
                                break;
                            }
                            cursorQuery.close();
                            listIterator = arrayListE.listIterator();
                            while (listIterator.hasNext()) {
                                r19Var = (r19) listIterator.next();
                                j = r19Var.a;
                                j2 = r19Var.a;
                                if (!map.containsKey(Long.valueOf(j))) {
                                    em0VarC = r19Var.c.c();
                                    for (b441 b441Var : (Set) map.get(Long.valueOf(j2))) {
                                        em0VarC.j(b441Var.a, b441Var.b);
                                    }
                                    listIterator.set(new r19(j2, r19Var.b, em0VarC.t()));
                                }
                            }
                            return arrayListE;
                        }
                        arrayListE.addAll(c441Var.e(sQLiteDatabase, s29Var.b(xnw0Var), size));
                    }
                }
                map = new HashMap();
                sb = new StringBuilder("event_id IN (");
                while (i < arrayListE.size()) {
                    sb.append(((r19) arrayListE.get(i)).a);
                    if (i < arrayListE.size() - 1) {
                        sb.append(',');
                    }
                }
                sb.append(')');
                cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
                while (cursorQuery.moveToNext()) {
                    j3 = cursorQuery.getLong(0);
                    hashSet = (Set) map.get(Long.valueOf(j3));
                    if (hashSet == null) {
                        hashSet = new HashSet();
                        map.put(Long.valueOf(j3), hashSet);
                    }
                    hashSet.add(new b441(cursorQuery.getString(1), cursorQuery.getString(2)));
                    break;
                }
                cursorQuery.close();
                listIterator = arrayListE.listIterator();
                while (listIterator.hasNext()) {
                    r19Var = (r19) listIterator.next();
                    j = r19Var.a;
                    j2 = r19Var.a;
                    if (!map.containsKey(Long.valueOf(j))) {
                        em0VarC = r19Var.c.c();
                        while (r3.hasNext()) {
                            em0VarC.j(b441Var.a, b441Var.b);
                        }
                        listIterator.set(new r19(j2, r19Var.b, em0VarC.t()));
                    }
                }
                return arrayListE;
            case 2:
            case 3:
            case 4:
            default:
                oh61 oh61Var = (oh61) obj3;
                rt5 rt5Var = (rt5) obj2;
                Restrictions restrictions = ((PlayerState) obj).restrictions();
                if (!restrictions.disallowTogglingShuffleReasons().isEmpty()) {
                    throw new IapException(new es5(f4i1.f("Cannot set shuffle: [", oh61.e(restrictions.disallowTogglingShuffleReasons()), "]")), "wamp.error");
                }
                return oh61Var.v.j.d(SetShufflingContextCommand.create(rt5Var.b.booleanValue()));
            case 5:
                oh61 oh61Var2 = (oh61) obj3;
                ut5 ut5Var = (ut5) obj2;
                nmr0 nmr0Var = (nmr0) obj;
                PlayerState playerState = (PlayerState) nmr0Var.b;
                spq0 spq0Var = (spq0) nmr0Var.a;
                if (ut5Var != null && ut5Var.b.booleanValue()) {
                    z = false;
                }
                return (z || playerState.restrictions().disallowSkippingPrevReasons().isEmpty()) ? oh61Var2.v.g(spq0Var, z) : oh61Var2.v.j(0L, spq0Var);
            case 6:
                x610 x610Var = ((oh61) obj3).c;
                ft5 ft5Var = (ft5) obj2;
                PlayerState playerState2 = (PlayerState) obj;
                String str = ft5Var.b;
                Boolean bool = ft5Var.d;
                String str2 = ft5Var.c;
                if ((str != null && playerState2.track().c() && str.equals(((ContextTrack) playerState2.track().b()).uri()) && "true".equals(playerState2.contextMetadata().get("is_audiobook"))) || (str == null && "true".equals(playerState2.contextMetadata().get("is_audiobook")))) {
                    return CompletableEmpty.a;
                }
                playerState2.contextUri();
                if (str != null || str2 != null) {
                    boolean zBooleanValue = bool.booleanValue();
                    String str3 = (String) cwl1.y(str, str2);
                    return zBooleanValue ? x610Var.a().a(str3) : x610Var.a().c(str3);
                }
                ContextTrack contextTrack = (ContextTrack) playerState2.track().h();
                if (contextTrack == null) {
                    n57.m("Track is null");
                    return CompletableEmpty.a;
                }
                String strUri = contextTrack.uri();
                return bool.booleanValue() ? x610Var.a().a(strUri) : x610Var.a().c(strUri);
            case 7:
                oh61 oh61Var3 = (oh61) obj3;
                String str4 = (String) obj;
                return oh61Var3.k.e(oh61Var3.z, str4, (w7h1) null, (ou80) null, 1).map(new nh61((byte) 12)).flatMap(new k65(oh61Var3, str4, (jr5) obj2, (byte) 25)).map(new hfr("Couldn't start radio", (byte) 18)).toObservable();
            case 8:
                oh61 oh61Var4 = (oh61) obj3;
                pu5 pu5Var = (pu5) obj2;
                Restrictions restrictions2 = ((PlayerState) obj).restrictions();
                if (!restrictions2.disallowInsertingIntoNextTracksReasons().isEmpty()) {
                    throw new IapException(new es5(f4i1.f("Cannot queue specified uri: [", oh61.e(restrictions2.disallowInsertingIntoNextTracksReasons()), "]")), "wamp.error");
                }
                j710 j710Var = (i710) oh61Var4.c.a.j.get();
                j710Var.a.a(j710Var.b.a(ContextTrack.create(pu5Var.b)).subscribe(new jld((byte) 5), new jld((byte) 6)));
                return cv5.a;
            case 9:
                su5 su5Var = (su5) obj2;
                return ((oh61) obj3).g(su5Var.b, (PreparePlayOptions) obj, su5Var.f);
        }
    }

    public Object attachCompleter(mzc mzcVar) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                WorkerParameters workerParameters = ((z8d0) ((RxWorker) obj2)).b;
                ExecutorService executorService = workerParameters.d;
                Scheduler scheduler = Schedulers.a;
                ((Single) obj).subscribeOn(new ExecutorScheduler(executorService, true, true)).observeOn(new ExecutorScheduler(workerParameters.f.a, true, true)).subscribe(new i341(mzcVar));
                return "converted single to future";
            case 13:
                ((AtomicReference) obj).set(mzcVar);
                return "SurfaceRequest-surface-recreation(" + ((j4d1) obj2).hashCode() + ")";
            case 15:
                hfe1 hfe1Var = (hfe1) obj2;
                Surface surface = (Surface) obj;
                j2h1.o("TextureViewImpl");
                hfe1Var.h.a(surface, n5u.a(), new jj5(mzcVar, (byte) 5));
                return "provideSurface[request=" + hfe1Var.h + " surface=" + surface + "]";
            default:
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                mzcVar.a(new p8d0(atomicBoolean, (byte) 1), k5u.a);
                ((Executor) obj2).execute(new q8d0(atomicBoolean, mzcVar, (Function0) obj, (byte) 1));
                return rih1.a;
        }
    }

    public Object c() {
        byte b = this.a;
        Object obj = this.c;
        ywv0 ywv0Var = (ywv0) this.b;
        switch (b) {
            case 17:
                Iterable iterable = (Iterable) obj;
                c441 c441Var = (c441) ywv0Var.c;
                c441Var.getClass();
                if (iterable.iterator().hasNext()) {
                    c441Var.a().compileStatement("DELETE FROM events WHERE _id in ".concat(c441.h(iterable))).execute();
                }
                break;
            default:
                for (Map.Entry entry : ((HashMap) obj).entrySet()) {
                    ((c441) ywv0Var.i).f(((Integer) entry.getValue()).intValue(), cse0.g, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    public void e(ry70 ry70Var) {
        ((qy70) this.c).e((vnd) this.b);
    }

    public void invoke(Object obj) {
        a1g1 a1g1Var = (a1g1) this.b;
        ExportException exportException = (ExportException) this.c;
        i690 i690Var = (i690) obj;
        b3k b3kVar = ((kgg1) a1g1Var.b).r;
        b3kVar.getClass();
        i690Var.getClass();
        if (i690Var.c.compareAndSet(false, true)) {
            i690Var.b.invoke(0L, new BetamaxTranscoderException("Transcoding error occurred with composition: " + b3kVar, exportException, (xjz) null, 4));
        }
    }

    public void subscribe(ObservableEmitter observableEmitter) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 3:
                zgz0 zgz0Var = (zgz0) obj2;
                Context context = (Context) obj;
                v7y v7yVar = new v7y(zgz0Var, observableEmitter);
                zgz0Var.b = new i5w0(new m2d((Object) zgz0Var, (Object) context, (Object) observableEmitter, (Object) v7yVar, (byte) 23));
                Context applicationContext = context.getApplicationContext();
                Intent intent = new Intent("com.msc.action.samsungaccount.REQUEST_SERVICE");
                intent.setPackage("com.osp.app.signin");
                if (!applicationContext.bindService(intent, v7yVar, 1)) {
                    observableEmitter.tryOnError(new Exception("Couldn't bind service!"));
                }
                break;
            default:
                l841 l841Var = (l841) obj2;
                dk70 dk70Var = (dk70) obj;
                try {
                    l841Var.c = spq0.d(((bk70) dk70Var).s(l841Var.a.getPackageName(), new k841(l841Var, dk70Var, observableEmitter)));
                    if (!l841Var.b(dk70Var) && !observableEmitter.isDisposed()) {
                        observableEmitter.onNext(new i741("Request auth code failed!"));
                        observableEmitter.onComplete();
                        break;
                    }
                } catch (RemoteException unused) {
                    if (observableEmitter.isDisposed()) {
                        return;
                    }
                    observableEmitter.onNext(new i741("Failure with Service binding"));
                    observableEmitter.onComplete();
                }
                break;
        }
    }

    public /* synthetic */ h341(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public void subscribe(SingleEmitter singleEmitter) {
        String[] strArr = (String[]) this.b;
        String str = (String) this.c;
        PreparePlayOptions.Builder builder = PreparePlayOptions.builder();
        try {
            HashMap mapP = j541.p(strArr);
            opq0 opq0Var = opq0.a;
            if (mapP.containsKey(opq0Var)) {
                if (mpq0.a == ((mpq0) mapP.get(opq0Var))) {
                    builder.audioStream(AudioStream.ALARM);
                }
            }
            oh61.b(str, mapP, builder);
            singleEmitter.onSuccess(builder.build());
        } catch (Exception e) {
            singleEmitter.onError(new IapException(e.getMessage(), "wamp.error"));
        }
    }
}
