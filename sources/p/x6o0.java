package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.car.app.navigation.model.Maneuver;
import app.p000rive.semantics.SemanticState;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.playlist.ai.creation.v2.ChatMessage;
import com.spotify.playlist.ai.creation.v2.Sender;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class x6o0 implements Function, BiFunction, g4u, pms, jrn0, nu11, SingleOnSubscribe {
    public static final Object c = new Object();
    public static x6o0 d;
    public final /* synthetic */ byte a;
    public final Object b;

    public x6o0(f77 f77Var) {
        this.a = (byte) 16;
        this.b = new vpg0(d5p1.h(f77Var.b), (byte) 1);
    }

    public static String f(String str, e420 e420Var, boolean z) {
        String strConcat = e420Var.a;
        if (z) {
            strConcat = ".temp".concat(strConcat);
        }
        String strReplaceAll = str.replaceAll("\\W+", "");
        int length = 242 - strConcat.length();
        if (strReplaceAll.length() > length) {
            try {
                byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(strReplaceAll.getBytes());
                StringBuilder sb = new StringBuilder();
                for (byte b : bArrDigest) {
                    sb.append(String.format("%02x", Byte.valueOf(b)));
                }
                strReplaceAll = sb.toString();
            } catch (NoSuchAlgorithmException unused) {
                strReplaceAll = strReplaceAll.substring(0, length);
            }
        }
        return f4i1.f("lottie_cache_", strReplaceAll, strConcat);
    }

    public static x6o0 k() {
        x6o0 x6o0Var;
        synchronized (c) {
            try {
                x6o0Var = d;
                if (x6o0Var == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    x6o0 x6o0Var2 = new x6o0(handlerThread.getLooper());
                    d = x6o0Var2;
                    x6o0Var = x6o0Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return x6o0Var;
    }

    public static hfp1 t(Callable callable) {
        bsd1 bsd1Var = new bsd1();
        lqn1.a(1, new mqh1(callable, bsd1Var, (byte) 16));
        return bsd1Var.a;
    }

    @Override // p.pms
    public void a(ak3 ak3Var, tv80 tv80Var) {
        ((ju1) this.b).a.l(new hu1(new rms(eqq.m("picker:", UUID.randomUUID()), ak3Var)));
    }

    /* JADX WARN: Code duplicated, block: B:102:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:93:0x027c  */
    public Object apply(Object obj) {
        boolean z;
        Observable map;
        Iterator it;
        Object next;
        qi qiVar;
        Object next2;
        byte b = this.a;
        byte b2 = 5;
        String str = null;
        Object obj2 = this.b;
        switch (b) {
            case 2:
                jn41 jn41Var = (ln41) obj;
                if ((jn41Var instanceof jn41) && ((vuk) jn41Var.a).c().a.a()) {
                    z = ((mya1) obj2).a().contains(ohv.c);
                }
                return Boolean.valueOf(z);
            case 6:
                u11 u11Var = (u11) obj2;
                return rqt0.F(o6x.a, new k2(u11Var, (a1f0) obj, (lnm) null, (byte) 6)).map(new g11(u11Var, (byte) 0)).onErrorReturn(new kr60(u11Var, b2)).toObservable();
            case 10:
                gq0 gq0Var = (gq0) obj;
                String str2 = gq0Var.a;
                return new mmr0(gq0Var, (Boolean) obj2);
            case 12:
                ChatMessage chatMessage = (ChatMessage) obj;
                Sender sender = chatMessage.getSender();
                int i = sender == null ? -1 : i23.a[sender.ordinal()];
                if (i != -1) {
                    if (i == 1) {
                        return Observable.just(new wvi0(chatMessage.getMessageId(), chatMessage.getSubmitTimestamp(), chatMessage.getStatus().getMessage(), new svi0(o7h.j1(chatMessage.getMessagePreferences().getExcludedUrisList()), o7h.j1(chatMessage.getMessagePreferences().getIncludedUrisList()))));
                    }
                    if (i == 2 || i == 3) {
                        return ((j23) obj2).f(new d23(chatMessage.getMessageId(), chatMessage.getStatus(), chatMessage.getPlaylist(), chatMessage.getSubmitTimestamp(), chatMessage.getUpdatedTimestamp(), new svi0(o7h.j1(chatMessage.getMessagePreferences().getExcludedUrisList()), o7h.j1(chatMessage.getMessagePreferences().getIncludedUrisList()))), Observable.empty());
                    }
                    if (i != 4 && i != 5) {
                        eg.o();
                        return null;
                    }
                }
                return Observable.error(new Exception("Unknown sender"));
            case 19:
                String str3 = (String) obj;
                g610 g610VarA = ((x610) obj2).a();
                g610VarA.getClass();
                Set set = s4b1.f;
                if (uic.x(str3).c == blc0.Pg || uic.x(str3).c == blc0.ti) {
                    map = g7h.d(g610VarA.b, str3, new String[]{str3}).map(new k9p1(str3, (byte) 11));
                } else {
                    map = Observable.just(Boolean.FALSE);
                    map.getClass();
                }
                return map.toFlowable(BackpressureStrategy.b);
            case 24:
                f7h f7hVar = (f7h) ((Map) obj).get(((ol6) obj2).a);
                return Boolean.valueOf(f7hVar != null ? f7hVar.a : false);
            case 26:
                return ((v7s) ((c77) obj2)).b.c().g(spq0.d((LoggingParams) obj), false);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                a48 a48Var = (a48) obj;
                String str4 = a48Var.c;
                Integer num = a48Var.b;
                d48 d48Var = (d48) obj2;
                d48Var.getClass();
                if (d48.a(a48Var) || num == null || num.intValue() != 8) {
                    return a48Var;
                }
                qfb qfbVar = d48Var.e;
                qfbVar.getClass();
                if (num != null && num.intValue() == 8) {
                    List list = (List) ((ck) qfbVar.a.get()).f.getValue();
                    if (list.size() == 1) {
                        str = ((hi) list.get(0)).b;
                    } else if (str4 != null) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next2 = it2.next();
                                qi qiVar2 = (hi) next2;
                                if (qiVar2.i.a() == null || !u890.j(qiVar2.i.a(), str4)) {
                                }
                            } else {
                                next2 = null;
                            }
                        }
                        qi qiVar3 = (hi) next2;
                        if (qiVar3 != null) {
                            str = qiVar3.b;
                        } else {
                            it = list.iterator();
                            do {
                                if (it.hasNext()) {
                                    next = it.next();
                                } else {
                                    next = null;
                                }
                                qiVar = (hi) next;
                                if (qiVar != null) {
                                    str = qiVar.b;
                                }
                            } while (!u890.j(((hi) next).g, Boolean.TRUE));
                            qiVar = (hi) next;
                            if (qiVar != null) {
                                str = qiVar.b;
                            }
                        }
                    } else {
                        it = list.iterator();
                        do {
                            if (it.hasNext()) {
                                next = it.next();
                            } else {
                                next = null;
                            }
                            qiVar = (hi) next;
                            if (qiVar != null) {
                                str = qiVar.b;
                            }
                        } while (!u890.j(((hi) next).g, Boolean.TRUE));
                        qiVar = (hi) next;
                        if (qiVar != null) {
                            str = qiVar.b;
                        }
                    }
                }
                return str != null ? new a48(str, str4, num, a48Var.d) : a48Var;
            default:
                kp5 kp5Var = (kp5) obj2;
                return ((g341) kp5Var.f).b(Uri.parse(((vvf) obj).a)).timeout(2L, TimeUnit.SECONDS, Single.error(new TimeoutException())).observeOn((Scheduler) kp5Var.d).map(bbn.i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0020 A[Catch: all -> 0x004c, TryCatch #1 {, blocks: (B:3:0x0001, B:11:0x0016, B:12:0x001a, B:14:0x0020, B:16:0x0032, B:17:0x003c, B:19:0x0042, B:10:0x0013, B:7:0x000b), top: B:29:0x0001, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0042 A[Catch: all -> 0x004c, LOOP:1: B:17:0x003c->B:19:0x0042, LOOP_END, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:11:0x0016, B:12:0x001a, B:14:0x0020, B:16:0x0032, B:17:0x003c, B:19:0x0042, B:10:0x0013, B:7:0x000b), top: B:29:0x0001, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0032 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x001a A[SYNTHETIC] */
    public synchronized void b(fos0 fos0Var) {
        ef61 ef61VarM;
        Iterator it;
        Set<Map.Entry> setEntrySet = null;
        if (dhn.a.contains(fos0Var)) {
            for (Map.Entry entry : setEntrySet) {
                ef61VarM = m((zd) entry.getKey());
                if (ef61VarM != null) {
                    it = ((List) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        ef61VarM.a((bm5) it.next());
                    }
                }
            }
        } else {
            try {
                setEntrySet = fos0Var.a.entrySet();
            } catch (Throwable th) {
                dhn.a(fos0Var, th);
            }
            while (r4.hasNext()) {
                ef61VarM = m((zd) entry.getKey());
                if (ef61VarM != null) {
                    it = ((List) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        ef61VarM.a((bm5) it.next());
                    }
                }
            }
        }
        throw th;
    }

    public o860 c() {
        return new o860(new b7a0((jt4) ((uo5) this.b).c));
    }

    public void d(long j, String str) {
        ((xe3) this.b).c.d();
    }

    public void e(long j, String str) {
        ((xe3) this.b).c.f();
    }

    public synchronized ef61 g(zd zdVar) {
        return (ef61) ((HashMap) this.b).get(zdVar);
    }

    public File h(String str) {
        File file = new File(r(), f(str, e420.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(r(), f(str, e420.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(r(), f(str, e420.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    public synchronized int j() {
        int i;
        int size;
        i = 0;
        for (ef61 ef61Var : ((HashMap) this.b).values()) {
            synchronized (ef61Var) {
                if (!dhn.a.contains(ef61Var)) {
                    try {
                        size = ef61Var.c.size();
                    } catch (Throwable th) {
                        dhn.a(ef61Var, th);
                        size = 0;
                    }
                }
                size = 0;
            }
            i += size;
        }
        return i;
    }

    public irn0 l(Intent intent, th61 th61Var) {
        vb2.a((vb2) ((wf2) this.b).b, (tv80) null);
        return crn0.a;
    }

    public synchronized ef61 m(zd zdVar) {
        Context contextA;
        en7 en7VarQ;
        ef61 ef61Var = (ef61) ((HashMap) this.b).get(zdVar);
        if (ef61Var == null && (en7VarQ = lro1.q((contextA = wf10.a()))) != null) {
            ef61Var = new ef61(en7VarQ, w0o1.j(contextA));
        }
        if (ef61Var == null) {
            return null;
        }
        ((HashMap) this.b).put(zdVar, ef61Var);
        return ef61Var;
    }

    public boolean n() {
        return ((c3s) this.b).d();
    }

    public synchronized Set o() {
        return ((HashMap) this.b).keySet();
    }

    public jx6 p(lby lbyVar, jb6 jb6Var, boolean z, d8r0 d8r0Var, String str, List list) {
        String strG = tb51.g((tb51) this.b, lbyVar);
        String str2 = lbyVar.a;
        return new jx6(str2, lbyVar.b, strG, lbyVar.c, jb6Var.a, jb6Var.b, jb6Var.c, str, z ? new q8b(Collections.singletonList(str2), true) : new q8b(z6x.a, false), d8r0Var, list);
    }

    public void q(r600 r600Var, k8e0 k8e0Var, tv80 tv80Var) {
        bk90 bk90Var = ((bg3) this.b).b;
        int i = k8e0Var.a;
        zuc0 zuc0Var = k8e0Var.i;
        int iOrdinal = r600Var.ordinal();
        if (iOrdinal == 0) {
            bk90Var.a(new xj90(i, zuc0Var));
            return;
        }
        if (iOrdinal == 1) {
            bk90Var.a(new zj90(i, zuc0Var));
        } else if (iOrdinal == 2) {
            bk90Var.a(new yj90(i, zuc0Var, (rj90) null, tv80Var, 4));
        } else {
            eg.o();
        }
    }

    public File r() {
        File file = new File(((n8b0) this.b).a.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public void s(ki0 ki0Var, Long l, String str, String str2) {
        if (ki0Var.g().length() == 0) {
            return;
        }
        ao0.c((ao0) this.b, co0.d, ki0Var.a(), l, str, str2, (String) null, (String) null, 64);
    }

    public void subscribe(SingleEmitter singleEmitter) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 17:
                singleEmitter.onSuccess(new fg4(((Boolean) Single.create(new t7o0(obj, (byte) 16)).blockingGet()).booleanValue()));
                break;
            case 18:
                ek4 ek4Var = (ek4) obj;
                luk lukVar = ek4Var.i;
                if (lukVar == null || !lukVar.i("android-gen-alpha-blocking.is_managed_account_allowlisting_requests_page_enabled")) {
                    lukVar = ek4Var.j;
                }
                if (lukVar != null) {
                    lukVar.e(new dk4(singleEmitter, ek4Var, (byte) 2));
                }
                break;
            case 19:
            case 20:
            default:
                m26 m26Var = (m26) obj;
                luk lukVar2 = m26Var.r;
                if (lukVar2 == null || !lukVar2.i("apps-music-libs-eventsender.rate_limiting_rule_2_events_per_time_unit")) {
                    lukVar2 = m26Var.s;
                }
                if (lukVar2 != null) {
                    lukVar2.e(new k26(singleEmitter, m26Var, (byte) 9));
                }
                break;
            case 21:
                singleEmitter.onSuccess(new z15(((Boolean) Single.create(new t7o0(obj, (byte) 20)).blockingGet()).booleanValue()));
                break;
        }
    }

    public boolean test(Object obj, Object obj2) {
        s31 s31Var = (s31) obj2;
        if (((s31) obj).equals(s31Var)) {
            return ((s31Var != null ? s31Var.c : null) instanceof v21) && !(((v51) this.b).R0 instanceof f51);
        }
        return true;
    }

    public File u(String str, InputStream inputStream, e420 e420Var) throws IOException {
        File file = new File(r(), f(str, e420Var, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[SemanticState.ReadOnly];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        inputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            inputStream.close();
            throw th2;
        }
    }

    public x6o0(Looper looper) {
        this.a = (byte) 1;
        jim0 jim0Var = new jim0(looper, (byte) 3, false);
        Looper.getMainLooper();
        this.b = jim0Var;
    }

    public /* synthetic */ x6o0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public x6o0() {
        this.a = (byte) 22;
        this.b = new HashMap();
    }

    public x6o0(t450 t450Var, lhc lhcVar) {
        this.a = (byte) 14;
        this.b = t450Var;
    }

    public void i(long j, String str) {
    }

    public Object apply(Object obj, Object obj2) {
        ((j62) this.b).g((String) obj, (fvf1) obj2);
        return rih1.a;
    }
}
