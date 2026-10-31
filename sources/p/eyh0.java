package p;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadata;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import app.p000rive.semantics.SemanticState;
import com.facebook.AuthenticationTokenManager$CurrentAuthenticationTokenChangedBroadcastReceiver;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Function;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executors;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class eyh0 implements nyc, Function {
    public static final o4t X;
    public static final o4t Y;
    public static final o4t Z;
    public static int e;
    public static eyh0 g;
    public static volatile eyh0 i;
    public final /* synthetic */ byte a;
    public final Object b;
    public Object c;
    public Object d;
    public static final l9x0 f = new l9x0((byte) 29);
    public static final vhc h = new vhc((byte) 10);
    public static final Object t = new Object();
    public static final Object N0 = new Object();

    static {
        long j = -9223372036854775807L;
        X = new o4t(0, j);
        Y = new o4t(2, j);
        Z = new o4t(3, j);
    }

    public eyh0(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        byh0 zxh0Var;
        this.a = (byte) 0;
        this.d = new ArrayList();
        ComponentName componentName2 = null;
        if (context == null) {
            hhg1.n("context must not be null");
            throw null;
        }
        if (TextUtils.isEmpty(str)) {
            hhg1.n("tag must not be null or empty");
            throw null;
        }
        if (componentName == null) {
            int i2 = qed1.a;
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setPackage(context.getPackageName());
            List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
            if (listQueryBroadcastReceivers.size() == 1) {
                ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
                componentName2 = new ComponentName(activityInfo.packageName, activityInfo.name);
            } else {
                listQueryBroadcastReceivers.size();
            }
            componentName = componentName2;
        }
        if (componentName != null && pendingIntent == null) {
            Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
            intent2.setComponent(componentName);
            pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            zxh0Var = new byh0(context, str);
            this.b = zxh0Var;
        } else if (i3 >= 28) {
            zxh0Var = new ayh0(context, str);
            this.b = zxh0Var;
        } else {
            zxh0Var = new zxh0(context, str);
            this.b = zxh0Var;
        }
        z(new vxh0(), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
        ((yxh0) zxh0Var).a.setMediaButtonReceiver(pendingIntent);
        this.c = new dg90(context, this);
        if (e == 0) {
            e = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
        }
    }

    public static void F(eyh0 eyh0Var, String str) {
        ((kt91) eyh0Var.d).k(new er91((fs91) null, str, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
    }

    public static List L(File file, ddc ddcVar) throws IOException {
        List<p5x> list = (List) ddcVar.invoke();
        if (file.exists() && !file.delete()) {
            file.toString();
        }
        if (!file.createNewFile()) {
            hhg1.l(file, "Can't create file: ");
            return null;
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), nne.a), SemanticState.Multiline);
        try {
            for (p5x p5xVar : list) {
                bufferedWriter.write(p5xVar.a);
                Iterator it = p5xVar.b.iterator();
                while (it.hasNext()) {
                    bufferedWriter.write(',' + ((String) it.next()));
                }
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            return list;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u890.p(bufferedWriter, th);
                throw th2;
            }
        }
    }

    public static void b(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(eyh0.class.getClassLoader());
        }
    }

    public static String h(String str) {
        return ihc1.c1(10, UUID.randomUUID().toString()).concat(str);
    }

    public static PlaybackStateCompat j(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        long j;
        if (playbackStateCompat != null) {
            float f2 = playbackStateCompat.d;
            long j2 = playbackStateCompat.h;
            int i2 = playbackStateCompat.a;
            long j3 = playbackStateCompat.b;
            long j4 = -1;
            if (j3 != -1 && ((i2 == 3 || i2 == 4 || i2 == 5) && j2 > 0)) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j5 = ((long) (f2 * (jElapsedRealtime - j2))) + j3;
                if (mediaMetadataCompat != null) {
                    Bundle bundle = mediaMetadataCompat.a;
                    if (bundle.containsKey(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DURATION)) {
                        j4 = bundle.getLong(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DURATION, 0L);
                    }
                }
                if (j4 < 0 || j5 <= j4) {
                    j = j5 < 0 ? 0L : j5;
                } else {
                    j = j4;
                }
                ArrayList arrayList = new ArrayList();
                long j6 = playbackStateCompat.c;
                long j7 = playbackStateCompat.e;
                int i3 = playbackStateCompat.f;
                CharSequence charSequence = playbackStateCompat.g;
                ArrayList arrayList2 = playbackStateCompat.i;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                return new PlaybackStateCompat(playbackStateCompat.a, j, j6, playbackStateCompat.d, j7, i3, charSequence, jElapsedRealtime, arrayList, playbackStateCompat.t, playbackStateCompat.X);
            }
        }
        return playbackStateCompat;
    }

    public static ArrayList v(File file) throws IOException {
        if (!file.isFile()) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), nne.a), SemanticState.Multiline);
        try {
            List listK0 = z561.k0(z561.R(new hjc0(bufferedReader)));
            bufferedReader.close();
            List list = listK0;
            ArrayList<List> arrayList = new ArrayList(q7h.U(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(ihc1.Q0((String) it.next(), new String[]{","}, 0, 6));
            }
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            for (List list2 : arrayList) {
                arrayList2.add(new p5x((String) o7h.q0(list2), o7h.k0(list2, 1)));
            }
            return arrayList2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u890.p(bufferedReader, th);
                throw th2;
            }
        }
    }

    public void A(rl8 rl8Var) {
        boolean zEquals;
        rl8 rl8Var2 = (rl8) this.d;
        this.d = rl8Var;
        SharedPreferences sharedPreferences = (SharedPreferences) ((ps7) this.c).b;
        if (rl8Var != null) {
            try {
                sharedPreferences.edit().putString("com.facebook.AuthenticationManager.CachedAuthenticationToken", rl8Var.a().toString()).apply();
            } catch (JSONException unused) {
            }
        } else {
            sharedPreferences.edit().remove("com.facebook.AuthenticationManager.CachedAuthenticationToken").apply();
            fpi1.c(wf10.a());
        }
        if (rl8Var2 == null) {
            zEquals = rl8Var == null;
        } else {
            zEquals = rl8Var2.equals(rl8Var);
        }
        if (zEquals) {
            return;
        }
        Intent intent = new Intent(wf10.a(), (Class<?>) AuthenticationTokenManager$CurrentAuthenticationTokenChangedBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_AUTHENTICATION_TOKEN", rl8Var2);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_AUTHENTICATION_TOKEN", rl8Var);
        ((zce0) this.b).c(intent);
    }

    public void B(MediaMetadataCompat mediaMetadataCompat) {
        MediaMetadata mediaMetadata;
        yxh0 yxh0Var = (yxh0) this.b;
        yxh0Var.i = mediaMetadataCompat;
        MediaSession mediaSession = yxh0Var.a;
        if (mediaMetadataCompat == null) {
            mediaMetadata = null;
        } else {
            if (mediaMetadataCompat.b == null) {
                Parcel parcelObtain = Parcel.obtain();
                mediaMetadataCompat.writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                mediaMetadataCompat.b = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(parcelObtain);
                parcelObtain.recycle();
            }
            mediaMetadata = mediaMetadataCompat.b;
        }
        mediaSession.setMetadata(mediaMetadata);
    }

    /*  JADX ERROR: NullPointerException in pass: BlockProcessor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getPredecessors()" because "to" is null
        	at jadx.core.dex.visitors.blocks.BlockSplitter.connect(BlockSplitter.java:159)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectSplittersAndHandlers(BlockExceptionHandler.java:501)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.wrapBlocksWithTryCatch(BlockExceptionHandler.java:382)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:91)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:62)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:422)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public void C(android.support.v4.media.session.PlaybackStateCompat r9) {
        /*
            r8 = this;
            java.lang.Object r8 = r8.b
            p.yxh0 r8 = (p.yxh0) r8
            r8.g = r9
            java.lang.Object r1 = r8.d
            monitor-enter(r1)
            android.os.RemoteCallbackList r0 = r8.f     // Catch: java.lang.Throwable -> L1f
            int r0 = r0.beginBroadcast()     // Catch: java.lang.Throwable -> L1f
            int r0 = r0 + (-1)
        L11:
            android.os.RemoteCallbackList r2 = r8.f
            if (r0 < 0) goto L25
            android.os.IInterface r2 = r2.getBroadcastItem(r0)     // Catch: java.lang.Throwable -> L1f
            p.gh70 r2 = (p.gh70) r2     // Catch: java.lang.Throwable -> L1f
            r2.W0(r9)     // Catch: java.lang.Throwable -> L1f android.os.RemoteException -> L22
            goto L22
        L1f:
            r0 = move-exception
            r8 = r0
            goto L8e
        L22:
            int r0 = r0 + (-1)
            goto L11
        L25:
            r2.finishBroadcast()     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            android.media.session.MediaSession r8 = r8.a
            android.media.session.PlaybackState r0 = r9.Y
            if (r0 != 0) goto L8a
            android.media.session.PlaybackState$Builder r1 = p.l5u0.d()
            int r2 = r9.a
            long r3 = r9.b
            float r5 = r9.d
            long r6 = r9.h
            p.l5u0.x(r1, r2, r3, r5, r6)
            long r2 = r9.c
            p.l5u0.u(r1, r2)
            long r2 = r9.e
            p.l5u0.s(r1, r2)
            java.lang.CharSequence r0 = r9.g
            p.l5u0.v(r1, r0)
            java.util.ArrayList r0 = r9.i
            java.util.Iterator r0 = r0.iterator()
        L53:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L7a
            java.lang.Object r2 = r0.next()
            android.support.v4.media.session.PlaybackStateCompat$CustomAction r2 = (android.support.v4.media.session.PlaybackStateCompat$CustomAction) r2
            android.media.session.PlaybackState$CustomAction r3 = r2.e
            if (r3 != 0) goto L76
            java.lang.String r3 = r2.a
            java.lang.CharSequence r4 = r2.b
            int r5 = r2.c
            android.media.session.PlaybackState$CustomAction$Builder r3 = p.l5u0.e(r3, r4, r5)
            android.os.Bundle r2 = r2.d
            p.l5u0.w(r3, r2)
            android.media.session.PlaybackState$CustomAction r3 = p.l5u0.b(r3)
        L76:
            p.l5u0.a(r1, r3)
            goto L53
        L7a:
            long r2 = r9.t
            p.l5u0.t(r1, r2)
            android.os.Bundle r0 = r9.X
            p.m5u0.b(r1, r0)
            android.media.session.PlaybackState r0 = p.l5u0.c(r1)
            r9.Y = r0
        L8a:
            r8.setPlaybackState(r0)
            return
        L8e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.eyh0.C(android.support.v4.media.session.PlaybackStateCompat):void");
    }

    public void D(List list) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem = (MediaSessionCompat$QueueItem) it.next();
            if (mediaSessionCompat$QueueItem == null) {
                hhg1.n("queue shouldn't have null items");
                return;
            }
            long j = mediaSessionCompat$QueueItem.b;
            if (hashSet.contains(Long.valueOf(j))) {
                new IllegalArgumentException("id of each queue item should be unique");
            }
            hashSet.add(Long.valueOf(j));
        }
        yxh0 yxh0Var = (yxh0) this.b;
        MediaSession mediaSession = yxh0Var.a;
        yxh0Var.h = list;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem2 = (MediaSessionCompat$QueueItem) it2.next();
            MediaSession.QueueItem queueItemA = mediaSessionCompat$QueueItem2.c;
            if (queueItemA == null) {
                queueItemA = dyh0.a(mediaSessionCompat$QueueItem2.a.b(), mediaSessionCompat$QueueItem2.b);
                mediaSessionCompat$QueueItem2.c = queueItemA;
            }
            arrayList.add(queueItemA);
        }
        mediaSession.setQueue(arrayList);
    }

    public void E(int i2, int i3) {
        String str;
        wt1 wt1Var = (wt1) this.c;
        i8h1 i8h1Var = wt1Var.a;
        gpk0 gpk0Var = wt1Var.b;
        if (i3 == 1) {
            str = "unknown_reason";
        } else if (i3 == 2) {
            str = "book_to_mixedlist";
        } else {
            if (i3 != 3) {
                throw null;
            }
            str = "mixed_content_to_booklist";
        }
        String str2 = str;
        x6h1 x6h1VarC = gpk0Var.a.c();
        x6h1VarC.i.add(new a7h1("failure_snackbar", (String) null, (Integer) null, (String) null, str2));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        k7h1Var.a = y6h1VarA;
        k7h1Var.c = Long.valueOf(System.currentTimeMillis());
        k7h1Var.e = gpk0Var.b;
        i8h1Var.f(k7h1Var.a(), (Set) null);
        F(this, ((Context) this.b).getString(i2));
    }

    public void G(Function0 function0) {
        kt91 kt91Var = (kt91) this.d;
        ((Context) this.b).getResources();
        kt91Var.k(new er91((fs91) null, "", (Integer) null, "", (Integer) null, new et1(function0, (byte) 0), (cvr) null, (xq91) null, false));
    }

    public long H(f9e0 f9e0Var, d9e0 d9e0Var, int i2) {
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        this.d = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        e9e0 e9e0Var = new e9e0(this, looperMyLooper, f9e0Var, d9e0Var, i2, jElapsedRealtime);
        dm5.y(((e9e0) this.c) == null);
        this.c = e9e0Var;
        e9e0Var.b();
        return jElapsedRealtime;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object I(yfe0 yfe0Var, onm onmVar) {
        zz0 zz0Var;
        if (onmVar instanceof zz0) {
            zz0Var = (zz0) onmVar;
            int i2 = zz0Var.d;
            if ((i2 & os00.INVALID_ID) != 0) {
                zz0Var.d = i2 - os00.INVALID_ID;
            } else {
                zz0Var = new zz0(this, onmVar);
            }
        } else {
            zz0Var = new zz0(this, onmVar);
        }
        Object objP = zz0Var.b;
        int i3 = zz0Var.d;
        if (i3 == 0) {
            hm5.M(objP);
            if (!((de31) ((pg5) this.c).a.get()).a()) {
                return Boolean.FALSE;
            }
            if (ihc1.y0(yfe0Var.b)) {
                return Boolean.FALSE;
            }
            eyh0 eyh0Var = (eyh0) this.d;
            zz0Var.a = yfe0Var;
            zz0Var.d = 1;
            objP = eyh0Var.p(zz0Var);
            d9n d9nVar = d9n.a;
            if (objP == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            yfe0Var = zz0Var.a;
            hm5.M(objP);
        }
        if (!((Boolean) objP).booleanValue()) {
            return Boolean.FALSE;
        }
        String strEncode = Uri.encode(yfe0Var.b);
        String strEncode2 = Uri.encode(yfe0Var.a);
        ((lzn0) this.b).h(nik1.f2.a + "?destinationUri=" + strEncode + "&contextUri=" + strEncode2);
        return Boolean.TRUE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object J(dt0 dt0Var, onm onmVar) throws NoWhenBranchMatchedException {
        tj2 tj2Var;
        af4 af4Var = (af4) this.c;
        if (onmVar instanceof tj2) {
            tj2Var = (tj2) onmVar;
            int i2 = tj2Var.c;
            if ((i2 & os00.INVALID_ID) != 0) {
                tj2Var.c = i2 - os00.INVALID_ID;
            } else {
                tj2Var = new tj2(this, onmVar);
            }
        } else {
            tj2Var = new tj2(this, onmVar);
        }
        Object objInvoke = tj2Var.a;
        int i3 = tj2Var.c;
        d9n d9nVar = d9n.a;
        if (i3 == 0) {
            hm5.M(objInvoke);
            if (!af4Var.a() || !af4Var.b()) {
                return en2.a;
            }
            tj2Var.c = 1;
            objInvoke = dt0Var.invoke(tj2Var);
            if (objInvoke != d9nVar) {
            }
        }
        if (i3 != 1) {
            if (i3 == 2) {
                hm5.M(objInvoke);
                return objInvoke;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objInvoke);
        boolean zBooleanValue = ((Boolean) objInvoke).booleanValue();
        String str = zBooleanValue ? "authenticated_managed" : "authenticated";
        int iC = af4Var.c();
        tj2Var.c = 2;
        Object objU = u(iC, str, tj2Var, zBooleanValue);
        return objU == d9nVar ? d9nVar : objU;
    }

    public Object K(a5l1 a5l1Var) {
        af4 af4Var = (af4) this.c;
        return !af4Var.a() ? en2.a : u(af4Var.c(), "unauthenticated", a5l1Var, false);
    }

    public void a() {
        e9e0 e9e0Var = (e9e0) this.c;
        e9e0Var.getClass();
        e9e0Var.a(false);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v23 java.lang.Object, still in use, count: 2, list:
          (r0v23 java.lang.Object) from 0x0029: PHI (r0 I:??) = (r0v4 java.lang.Object), (r0v23 java.lang.Object) binds: [B:10:0x0028, B:48:0x0029] A[DONT_GENERATE, DONT_INLINE]
          (r0v23 java.lang.Object) from 0x001d: CHECK_CAST (p.qfd) (r0v23 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public java.lang.Object apply(java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.eyh0.apply(java.lang.Object):java.lang.Object");
    }

    public gn2 c(jj2 jj2Var, int i2, boolean z, String str) {
        ihv0 ihv0Var = (ihv0) this.d;
        ci2 ci2Var = jj2Var.a;
        int i3 = ci2Var.a;
        int i4 = ci2Var.d;
        int iC = l1d.C(i3);
        en2 en2Var = en2.a;
        if (iC == 0 || iC == 1) {
            ihv0Var.c(1, i4, str);
            return en2Var;
        }
        if (iC != 2) {
            if (iC != 3) {
                eg.o();
                return null;
            }
            if (z) {
                ihv0Var.c(4, i4, str);
                return en2Var;
            }
            ihv0Var.c(7, i4, str);
            return new fn2(1, i4);
        }
        int i5 = ci2Var.c;
        if (i5 == 1 || i5 == 2) {
            ihv0Var.c(6, i4, str);
            return new fn2(2, i4);
        }
        if (z) {
            ihv0Var.c(2, i4, str);
            return en2Var;
        }
        uh2 uh2Var = ci2Var.b;
        if (uh2Var == null || uh2Var.a < i2) {
            ihv0Var.c(5, i4, str);
            return new fn2(3, i4);
        }
        ihv0Var.c(2, i4, str);
        return en2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public Object d(String str, tv80 tv80Var, onm onmVar) {
        fc2 fc2Var;
        if (onmVar instanceof fc2) {
            fc2Var = (fc2) onmVar;
            int i2 = fc2Var.e;
            if ((i2 & os00.INVALID_ID) != 0) {
                fc2Var.e = i2 - os00.INVALID_ID;
            } else {
                fc2Var = new fc2(this, onmVar);
            }
        } else {
            fc2Var = new fc2(this, onmVar);
        }
        Object obj = fc2Var.c;
        int i3 = fc2Var.e;
        try {
            if (i3 == 0) {
                hm5.M(obj);
                w0g w0gVar = (w0g) this.c;
                fc2Var.a = str;
                fc2Var.b = tv80Var;
                fc2Var.e = 1;
                Object objG = w0gVar.g(str, fc2Var);
                d9n d9nVar = d9n.a;
                str = objG;
                if (objG == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i3 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tv80Var = fc2Var.b;
                String str2 = fc2Var.a;
                hm5.M(obj);
                str = str2;
            }
        } catch (CancellationException e2) {
            throw e2;
        } catch (Exception e3) {
            Logger.d(gvg.h("Failed to terminate session in kids-sessions ", str, ": ", e3.getMessage()), new Object[0]);
        }
        ((a1g) this.d).a();
        ((njm) this.b).b(tv80Var);
        return rih1.a;
    }

    public dg90 e() {
        return (dg90) this.c;
    }

    public f0i0 f() {
        return ((yxh0) this.b).b();
    }

    public int g(a2z a2zVar) {
        String name = a2zVar.getClass().getName();
        Integer num = (Integer) ((HashMap) this.b).get(name);
        if (num != null) {
            return num.intValue();
        }
        hhg1.n(f4i1.f("No AdapterDelegate added that can handle type: ", name, " Did you register the segment in any adapter delegate?"));
        return 0;
    }

    public MediaSessionCompat.Token i() {
        return ((yxh0) this.b).c;
    }

    public void k(jf01 jf01Var, IOException iOException) {
        ((ko0) this.b).b.a(new ta10((String) this.c, (String) this.d, iOException));
    }

    public boolean l() {
        return ((IOException) this.d) != null;
    }

    public rrk0 m(int i2, String str) {
        rrk0 rrk0Var = (rrk0) this.d;
        if (rrk0Var != null) {
            return rrk0Var;
        }
        String strQ = zjy.q(i2);
        int i3 = 0;
        if (strQ == null) {
            bhn0.i("Name is null");
        } else if (strQ.equals("ALBUM")) {
            i3 = 1;
        } else if (strQ.equals("ARTIST")) {
            i3 = 2;
        } else if (strQ.equals("AUDIOBOOK")) {
            i3 = 3;
        } else if (strQ.equals("EPISODE")) {
            i3 = 4;
        } else if (strQ.equals("PLAYLIST")) {
            i3 = 5;
        } else if (strQ.equals("PODCAST")) {
            i3 = 6;
        } else if (strQ.equals("TRACK")) {
            i3 = 7;
        } else {
            hhg1.n("No enum constant com.spotify.ubi.specification.factories.MobileSaveForLaterIntentModalEventFactory.MobileSaveForLaterIntentModalEnums.Identifier.".concat(strQ));
        }
        String strA = ((gdr) this.c).a(fdr.d);
        r6h1 r6h1Var = r6h1.c;
        rrk0 rrk0Var2 = new rrk0(i3, strA, str);
        this.d = rrk0Var2;
        return rrk0Var2;
    }

    public void n(jf01 jf01Var, ry21 ry21Var) {
        try {
            ry21Var.g.close();
        } catch (Throwable unused) {
        }
    }

    public boolean o() {
        return ((yxh0) this.b).a.isActive();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
    
        if (r7 == r5) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object p(p.onm r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p.uz0
            if (r0 == 0) goto L13
            r0 = r7
            p.uz0 r0 = (p.uz0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.uz0 r0 = new p.uz0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L36
            if (r1 == r4) goto L32
            if (r1 != r3) goto L2b
            p.hm5.M(r7)     // Catch: java.util.concurrent.CancellationException -> L7a java.lang.Exception -> L7c
            goto L70
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            r6 = 0
            return r6
        L32:
            p.hm5.M(r7)     // Catch: java.util.concurrent.CancellationException -> L7a java.lang.Exception -> L7c
            goto L5b
        L36:
            p.hm5.M(r7)
            java.lang.Object r7 = r6.d
            p.kly0 r7 = (p.kly0) r7
            java.lang.Object r7 = r7.get()
            p.c05 r7 = (p.c05) r7
            boolean r7 = r7.a()
            if (r7 != 0) goto L4c
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L4c:
            java.lang.Object r7 = r6.b     // Catch: java.util.concurrent.CancellationException -> L7a java.lang.Exception -> L7c
            p.krh r7 = (p.krh) r7     // Catch: java.util.concurrent.CancellationException -> L7a java.lang.Exception -> L7c
            p.ql10 r1 = p.ql10.a     // Catch: java.util.concurrent.CancellationException -> L7a java.lang.Exception -> L7c
            r0.c = r4     // Catch: java.util.concurrent.CancellationException -> L7a java.lang.Exception -> L7c
            java.lang.Object r7 = r7.b(r1, r0)     // Catch: java.util.concurrent.CancellationException -> L7a java.lang.Exception -> L7c
            if (r7 != r5) goto L5b
            goto L6f
        L5b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.util.concurrent.CancellationException -> L7a java.lang.Exception -> L7c
            boolean r7 = r7.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L7a java.lang.Exception -> L7c
            if (r7 == 0) goto L7c
            java.lang.Object r6 = r6.c     // Catch: java.util.concurrent.CancellationException -> L7a java.lang.Exception -> L7c
            p.mgf1 r6 = (p.mgf1) r6     // Catch: java.util.concurrent.CancellationException -> L7a java.lang.Exception -> L7c
            r0.c = r3     // Catch: java.util.concurrent.CancellationException -> L7a java.lang.Exception -> L7c
            java.lang.Object r7 = r6.b(r0)     // Catch: java.util.concurrent.CancellationException -> L7a java.lang.Exception -> L7c
            if (r7 != r5) goto L70
        L6f:
            return r5
        L70:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.util.concurrent.CancellationException -> L7a java.lang.Exception -> L7c
            boolean r6 = r7.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L7a java.lang.Exception -> L7c
            if (r6 == 0) goto L7c
            r2 = r4
            goto L7c
        L7a:
            r6 = move-exception
            goto L81
        L7c:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            return r6
        L81:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.eyh0.p(p.onm):java.lang.Object");
    }

    public boolean q() {
        return ((e9e0) this.c) != null;
    }

    public o6e0 r(boolean z) {
        return new o6e0(new q71(this, z, null), f46.I(new p6e0[0]));
    }

    public void s() throws IOException {
        IOException iOException = (IOException) this.d;
        if (iOException != null) {
            throw iOException;
        }
        e9e0 e9e0Var = (e9e0) this.c;
        if (e9e0Var != null) {
            int i2 = e9e0Var.a;
            IOException iOException2 = e9e0Var.e;
            if (iOException2 != null && e9e0Var.f > i2) {
                throw iOException2;
            }
        }
    }

    public n7e0 t(boolean z) {
        return new n7e0(new s71(this), new dr0((byte) 1, z), xbp1.d, (iu30) null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:100:0x0210 A[Catch: TimeoutCancellationException -> 0x0238, TRY_LEAVE, TryCatch #7 {TimeoutCancellationException -> 0x0238, blocks: (B:98:0x020c, B:100:0x0210), top: B:165:0x020c }] */
    /* JADX WARN: Code duplicated, block: B:106:0x023b A[Catch: TimeoutCancellationException -> 0x0230, TryCatch #11 {TimeoutCancellationException -> 0x0230, blocks: (B:102:0x022c, B:106:0x023b, B:108:0x0241, B:110:0x0259, B:111:0x025e, B:114:0x0266, B:115:0x0273, B:116:0x0274, B:117:0x0281, B:120:0x028e, B:121:0x0299), top: B:173:0x0104 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0241 A[Catch: TimeoutCancellationException -> 0x0230, TryCatch #11 {TimeoutCancellationException -> 0x0230, blocks: (B:102:0x022c, B:106:0x023b, B:108:0x0241, B:110:0x0259, B:111:0x025e, B:114:0x0266, B:115:0x0273, B:116:0x0274, B:117:0x0281, B:120:0x028e, B:121:0x0299), top: B:173:0x0104 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x0259 A[Catch: TimeoutCancellationException -> 0x0230, TryCatch #11 {TimeoutCancellationException -> 0x0230, blocks: (B:102:0x022c, B:106:0x023b, B:108:0x0241, B:110:0x0259, B:111:0x025e, B:114:0x0266, B:115:0x0273, B:116:0x0274, B:117:0x0281, B:120:0x028e, B:121:0x0299), top: B:173:0x0104 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x0266 A[Catch: TimeoutCancellationException -> 0x0230, TryCatch #11 {TimeoutCancellationException -> 0x0230, blocks: (B:102:0x022c, B:106:0x023b, B:108:0x0241, B:110:0x0259, B:111:0x025e, B:114:0x0266, B:115:0x0273, B:116:0x0274, B:117:0x0281, B:120:0x028e, B:121:0x0299), top: B:173:0x0104 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x0274 A[Catch: TimeoutCancellationException -> 0x0230, TryCatch #11 {TimeoutCancellationException -> 0x0230, blocks: (B:102:0x022c, B:106:0x023b, B:108:0x0241, B:110:0x0259, B:111:0x025e, B:114:0x0266, B:115:0x0273, B:116:0x0274, B:117:0x0281, B:120:0x028e, B:121:0x0299), top: B:173:0x0104 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x028e A[Catch: TimeoutCancellationException -> 0x0230, TryCatch #11 {TimeoutCancellationException -> 0x0230, blocks: (B:102:0x022c, B:106:0x023b, B:108:0x0241, B:110:0x0259, B:111:0x025e, B:114:0x0266, B:115:0x0273, B:116:0x0274, B:117:0x0281, B:120:0x028e, B:121:0x0299), top: B:173:0x0104 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x0106 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x0188 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:47:0x0122  */
    /* JADX WARN: Code duplicated, block: B:50:0x0128 A[Catch: TimeoutCancellationException -> 0x028b, TRY_LEAVE, TryCatch #17 {TimeoutCancellationException -> 0x028b, blocks: (B:48:0x0124, B:50:0x0128), top: B:184:0x0124 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x013c  */
    /* JADX WARN: Code duplicated, block: B:55:0x013e A[Catch: TimeoutCancellationException -> 0x0282, TryCatch #4 {TimeoutCancellationException -> 0x0282, blocks: (B:52:0x0138, B:55:0x013e, B:58:0x0144, B:61:0x014a), top: B:159:0x0138 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0142  */
    /* JADX WARN: Code duplicated, block: B:58:0x0144 A[Catch: TimeoutCancellationException -> 0x0282, TryCatch #4 {TimeoutCancellationException -> 0x0282, blocks: (B:52:0x0138, B:55:0x013e, B:58:0x0144, B:61:0x014a), top: B:159:0x0138 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0148  */
    /* JADX WARN: Code duplicated, block: B:61:0x014a A[Catch: TimeoutCancellationException -> 0x0282, TRY_LEAVE, TryCatch #4 {TimeoutCancellationException -> 0x0282, blocks: (B:52:0x0138, B:55:0x013e, B:58:0x0144, B:61:0x014a), top: B:159:0x0138 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x014e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0156 A[Catch: TimeoutCancellationException -> 0x015d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {TimeoutCancellationException -> 0x015d, blocks: (B:67:0x0156, B:74:0x0176), top: B:156:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0162 A[Catch: TimeoutCancellationException -> 0x025f, TRY_ENTER, TryCatch #0 {TimeoutCancellationException -> 0x025f, blocks: (B:65:0x0152, B:70:0x0162, B:72:0x0166, B:76:0x0184, B:64:0x014f), top: B:152:0x0152 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0166 A[Catch: TimeoutCancellationException -> 0x025f, TRY_LEAVE, TryCatch #0 {TimeoutCancellationException -> 0x025f, blocks: (B:65:0x0152, B:70:0x0162, B:72:0x0166, B:76:0x0184, B:64:0x014f), top: B:152:0x0152 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0176 A[Catch: TimeoutCancellationException -> 0x015d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {TimeoutCancellationException -> 0x015d, blocks: (B:67:0x0156, B:74:0x0176), top: B:156:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0184 A[Catch: TimeoutCancellationException -> 0x025f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {TimeoutCancellationException -> 0x025f, blocks: (B:65:0x0152, B:70:0x0162, B:72:0x0166, B:76:0x0184, B:64:0x014f), top: B:152:0x0152 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a9 A[Catch: TimeoutCancellationException -> 0x01ec, TRY_LEAVE, TryCatch #16 {TimeoutCancellationException -> 0x01ec, blocks: (B:78:0x0188, B:80:0x01a9), top: B:182:0x0188 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:97:0x0204  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [p.eyh0] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r11v47 */
    /* JADX WARN: Type inference failed for: r11v48 */
    /* JADX WARN: Type inference failed for: r11v49 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v50 */
    /* JADX WARN: Type inference failed for: r11v51 */
    /* JADX WARN: Type inference failed for: r11v52 */
    /* JADX WARN: Type inference failed for: r11v53 */
    /* JADX WARN: Type inference failed for: r11v54 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:133:0x02ec -> B:134:0x02ee). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:135:0x02f8 -> B:136:0x0303). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object u(int r21, java.lang.String r22, p.onm r23, boolean r24) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 814
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.eyh0.u(int, java.lang.String, p.onm, boolean):java.lang.Object");
    }

    public void w() {
        yxh0 yxh0Var = (yxh0) this.b;
        MediaSession mediaSession = yxh0Var.a;
        yxh0Var.f.kill();
        if (Build.VERSION.SDK_INT == 27) {
            try {
                Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                declaredField.setAccessible(true);
                Handler handler = (Handler) declaredField.get(mediaSession);
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
            } catch (Exception unused) {
            }
        }
        mediaSession.setCallback(null);
        yxh0Var.b.a.set(null);
        mediaSession.release();
    }

    public void x(g9e0 g9e0Var) {
        u8a0 u8a0Var = (u8a0) this.b;
        e9e0 e9e0Var = (e9e0) this.c;
        if (e9e0Var != null) {
            e9e0Var.a(true);
        }
        if (g9e0Var != null) {
            u8a0Var.execute(new an90(g9e0Var, (byte) 8));
        }
        ((mna0) u8a0Var.c).accept(u8a0Var.b);
    }

    public void y(boolean z) {
        ((yxh0) this.b).a.setActive(z);
        Iterator it = ((ArrayList) this.d).iterator();
        if (it.hasNext()) {
            throw pze0.g(it);
        }
    }

    public void z(xxh0 xxh0Var, Handler handler) {
        yxh0 yxh0Var = (yxh0) this.b;
        if (xxh0Var == null) {
            yxh0Var.c((xxh0) null, (Handler) null);
            return;
        }
        if (handler == null) {
            handler = new Handler();
        }
        yxh0Var.c(xxh0Var, handler);
    }

    public /* synthetic */ eyh0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ eyh0(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ eyh0(wpw wpwVar, im0 im0Var, int i2) {
        byte b = 7;
        this.a = (byte) 7;
        this(wpwVar, (i2 & 2) != 0 ? null : im0Var, (Object) null, b);
    }

    public eyh0(Context context, Activity activity, wt1 wt1Var, kt91 kt91Var, a1r0 a1r0Var) {
        this.a = (byte) 19;
        this.b = context;
        this.c = wt1Var;
        this.d = kt91Var;
    }

    public eyh0(jwo jwoVar, h4l0 h4l0Var, d7l0 d7l0Var) {
        this.a = (byte) 25;
        this.b = h4l0Var;
        this.c = d7l0Var;
        this.d = new idd1(new g82(jwoVar, (byte) 1));
    }

    public eyh0(LayoutInflater layoutInflater, t380 t380Var) {
        this.a = (byte) 16;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = layoutInflater;
        Iterator it = t380Var.iterator();
        while (it.hasNext()) {
            p01 p01Var = (p01) it.next();
            Class cls = p01Var.a;
            o01 o01Var = p01Var.b;
            String name = cls.getName();
            int iHashCode = name.hashCode();
            HashMap map = (HashMap) this.c;
            if (!map.containsKey(Integer.valueOf(iHashCode))) {
                ((HashMap) this.b).put(name, Integer.valueOf(iHashCode));
                map.put(Integer.valueOf(iHashCode), o01Var);
            }
        }
    }

    public eyh0(yqg yqgVar, dma1 dma1Var) {
        this.a = (byte) 8;
        this.b = dma1Var;
        this.c = yqgVar;
        this.d = p7h.M(new Long[]{0L, 691200000L, 1900800000L});
    }

    public eyh0(Drawable.Callback callback, String str, Map map) {
        this.a = (byte) 3;
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.c = str.concat("/");
        } else {
            this.c = str;
        }
        this.d = map;
        if (!(callback instanceof View)) {
            this.b = null;
        } else {
            this.b = ((View) callback).getContext().getApplicationContext();
        }
    }

    public eyh0(Context context) {
        long jN;
        this.a = (byte) 2;
        this.d = new Object();
        StringBuilder sb = new StringBuilder();
        int i2 = Build.VERSION.SDK_INT;
        sb.append(i2);
        sb.append('_');
        sb.append(Build.TIME);
        String string = sb.toString();
        try {
            if (i2 >= 33) {
                jN = gg.g(context);
            } else if (i2 >= 28) {
                jN = ph5.n(context);
            } else {
                jN = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            jN = 1;
        }
        this.c = string + '.' + jN;
        Context contextCreateDeviceProtectedStorageContext = context.isDeviceProtectedStorage() ? context : null;
        File file = new File(((contextCreateDeviceProtectedStorageContext == null && (contextCreateDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext()) == null) ? context : contextCreateDeviceProtectedStorageContext).getCacheDir(), "emoji_picker");
        this.b = file;
        if (file.exists()) {
            return;
        }
        file.mkdir();
    }

    public eyh0(CoordinatorLayout coordinatorLayout) {
        this.a = (byte) 21;
        this.b = coordinatorLayout;
        this.c = new idd1(new g3(this, (byte) 25));
        this.d = coordinatorLayout.getViewTreeObserver();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public eyh0(String str) {
        this.a = (byte) 4;
        String strConcat = "ExoPlayer:Loader:".concat(str);
        String str2 = zoi1.a;
        this((Object) new u8a0(Executors.newSingleThreadExecutor(new ask(strConcat, (byte) 1)), new mna0((byte) 15), (byte) 2), (byte) 4);
    }

    public /* synthetic */ eyh0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public eyh0(Context context, yxh0 yxh0Var) {
        this.a = (byte) 0;
        this.d = new ArrayList();
        this.b = yxh0Var;
        this.c = new dg90(context, this);
    }
}
