package com.spotify.storage.localstorage;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import com.spotify.storage.localstorageapi.CacheMovingWorker;
import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import kotlin.Metadata;
import p.bd30;
import p.cko0;
import p.d9n;
import p.dko0;
import p.dsc;
import p.eg;
import p.esc;
import p.fn31;
import p.fsc;
import p.fta;
import p.gpm0;
import p.hm5;
import p.k65;
import p.lnm;
import p.nod;
import p.onm;
import p.q8n;
import p.qd4;
import p.rih1;
import p.s45;
import p.s6b1;
import p.t45;
import p.tvl1;
import p.upn1;
import p.vk6;
import p.w0h1;
import p.wge0;
import p.xs80;
import p.z8d0;
import p.zle1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0015\u0016BY\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/spotify/storage/localstorage/CacheMovingWorkerImpl;", "Lcom/spotify/storage/localstorageapi/CacheMovingWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lp/s6b1;", "spotifyStorageManager", "Lp/wge0;", "fileFactory", "Lp/zle1;", "timeKeeper", "Lp/gpm0;", "movingOrchestrator", "Lp/xs80;", "intentFactory", "Lp/q8n;", "ioDispatcher", "mainDispatcher", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lp/s6b1;Lp/wge0;Lp/zle1;Lp/gpm0;Lp/xs80;Lp/q8n;Lp/q8n;)V", "p/asc", "p/hqp", "src_main_java_com_spotify_storage_localstorage-localstorage"}, k = 1, mv = {2, 3, 0}, xi = StreamStartRequestOuterClass$StreamStartRequest.PREVIEW_IMPRESSION_URI_FIELD_NUMBER)
public final class CacheMovingWorkerImpl extends CacheMovingWorker {
    public final Context i;
    public final WorkerParameters j;
    public final s6b1 k;
    public final wge0 l;
    public final zle1 m;
    public final gpm0 n;
    public final q8n o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f0p;
    public final fta q;

    public CacheMovingWorkerImpl(Context context, WorkerParameters workerParameters, s6b1 s6b1Var, wge0 wge0Var, zle1 zle1Var, gpm0 gpm0Var, xs80 xs80Var, q8n q8nVar, q8n q8nVar2) {
        super(context.getApplicationContext(), workerParameters);
        this.i = context;
        this.j = workerParameters;
        this.k = s6b1Var;
        this.l = wge0Var;
        this.m = zle1Var;
        this.n = gpm0Var;
        this.o = q8nVar;
        this.q = new fta(context.getApplicationContext(), xs80Var, q8nVar2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(lnm lnmVar) {
        dsc dscVar;
        if (lnmVar instanceof dsc) {
            dscVar = (dsc) lnmVar;
            int i = dscVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dscVar.c = i - Integer.MIN_VALUE;
            } else {
                dscVar = new dsc(this, (onm) lnmVar);
            }
        } else {
            dscVar = new dsc(this, (onm) lnmVar);
        }
        Object obj = dscVar.a;
        int i2 = dscVar.c;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            dscVar.c = 1;
            fta ftaVar = this.q;
            Object objY = fn31.Y((q8n) ftaVar.d, new fsc(ftaVar, null, (byte) 0), dscVar);
            if (objY != d9nVar) {
                objY = rih1.a;
            }
            if (objY != d9nVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        vk6 vk6Var = new vk6(this, (lnm) null, (byte) 19);
        dscVar.c = 2;
        Object objY2 = fn31.Y(this.o, vk6Var, dscVar);
        return objY2 == d9nVar ? d9nVar : objY2;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x016f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0174  */
    /* JADX WARN: Code duplicated, block: B:42:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:43:0x01c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x01c5 A[Catch: lcd1 -> 0x01ca, TRY_LEAVE, TryCatch #0 {lcd1 -> 0x01ca, blocks: (B:40:0x01a8, B:44:0x01c5), top: B:88:0x01a8 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:52:0x01e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:60:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:62:0x0200  */
    /* JADX WARN: Code duplicated, block: B:68:0x025f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0263 A[PHI: r1 r2 r4
      0x0263: PHI (r1v16 int) = (r1v14 int), (r1v20 int) binds: [B:69:0x0260, B:13:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x0263: PHI (r2v5 p.fpm0) = (r2v3 p.fpm0), (r2v9 p.fpm0) binds: [B:69:0x0260, B:13:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x0263: PHI (r4v7 long) = (r4v5 long), (r4v8 long) binds: [B:69:0x0260, B:13:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x0269  */
    /* JADX WARN: Code duplicated, block: B:75:0x026c  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0295  */
    /* JADX WARN: Code duplicated, block: B:86:0x029f  */
    /* JADX WARN: Code duplicated, block: B:90:0x01f1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b5, code lost:
    
        if (l(r6) == r9) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0219, code lost:
    
        if (l(r6) == r9) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0296, code lost:
    
        if (r12 == r9) goto L84;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(long r24, java.lang.String r26, p.onm r27) {
        /*
            Method dump skipped, instruction units count: 694
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.storage.localstorage.CacheMovingWorkerImpl.j(long, java.lang.String, p.onm):java.lang.Object");
    }

    public final void k(int i, String str) {
        s45 s45Var = this.m;
        long jA = s45Var.a.a() - this.f0p;
        t45 t45VarA = s45Var.a("move_cache");
        Long lValueOf = Long.valueOf(this.f0p);
        Long lValueOf2 = Long.valueOf(jA);
        t45VarA.i = lValueOf;
        t45VarA.m.add(new nod("move_cache", "android-storage-localstorage", lValueOf, lValueOf2));
        t45VarA.g.put("outcome", str);
        t45VarA.f.put("attempts", String.valueOf(i));
        s45Var.b(t45VarA.e());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(onm onmVar) {
        esc escVar;
        if (onmVar instanceof esc) {
            escVar = (esc) onmVar;
            int i = escVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                escVar.c = i - Integer.MIN_VALUE;
            } else {
                escVar = new esc(this, onmVar);
            }
        } else {
            escVar = new esc(this, onmVar);
        }
        Object obj = escVar.a;
        int i2 = escVar.c;
        if (i2 == 0) {
            hm5.M(obj);
            Context context = this.i;
            String string = context.getString(2131953088);
            dko0 dko0Var = new dko0(context, "spotify_updates_channel");
            dko0Var.e = dko0.d(context.getString(2131953087));
            dko0Var.f = dko0.d(string);
            dko0Var.s(context.getString(2131953087));
            cko0 cko0Var = new cko0(false);
            cko0Var.f = dko0.d(string);
            dko0Var.r(cko0Var);
            dko0Var.D.icon = 2131233418;
            dko0Var.k = false;
            dko0Var.u = context.getColor(2131102443);
            Notification notificationC = dko0Var.c();
            escVar.c = 1;
            Object objM = m(42, notificationC, escVar);
            Object obj2 = d9n.a;
            if (objM == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        this.n.a();
        return rih1.a;
    }

    public final Object m(int i, Notification notification, onm onmVar) {
        bd30 bd30Var = Build.VERSION.SDK_INT >= 29 ? new bd30(i, notification, 1) : new bd30(i, notification, 0);
        WorkerParameters workerParameters = ((z8d0) this).b;
        tvl1 tvl1Var = workerParameters.i;
        Object objN = w0h1.n(upn1.t(new k65(tvl1Var.a.a, "setForegroundAsync", new qd4(tvl1Var, workerParameters.a, bd30Var, ((z8d0) this).a, (byte) 8), (byte) 14)), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objN != d9nVar) {
            objN = rih1Var;
        }
        return objN == d9nVar ? objN : rih1Var;
    }
}
