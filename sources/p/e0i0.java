package p;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import androidx.media3.session.legacy.MediaConstants;
import androidx.media3.session.legacy.MediaDescriptionCompat;
import androidx.media3.session.legacy.MediaSessionCompat;
import androidx.media3.session.legacy.MediaSessionManager;
import androidx.media3.session.legacy.PlaybackStateCompat;
import androidx.media3.session.legacy.RatingCompat;
import com.comscore.streaming.ContentMediaFormat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class e0i0 extends MediaSessionCompat.Callback {
    public static final int x;
    public final v1k a;
    public final fzh0 d;
    public final MediaSessionManager e;
    public final c0i0 f;
    public final zzh0 g;
    public final boolean h;
    public final q64 i;
    public final MediaSessionCompat j;
    public final jlb k;
    public final ComponentName l;
    public yzh0 m;
    public volatile int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b0i0 f43p;
    public int q;
    public b2c r;
    public Bundle s;
    public b380 t;
    public b380 u;
    public qa61 v;
    public m8u0 w;
    public final boolean n = true;
    public final y36 b = new y36(0);
    public final y36 c = new y36(0);

    static {
        x = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0113  */
    /* JADX WARN: Code duplicated, block: B:46:0x012c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0130  */
    /* JADX WARN: Code duplicated, block: B:49:0x014b  */
    /* JADX WARN: Code duplicated, block: B:4:0x0062  */
    /* JADX WARN: Code duplicated, block: B:51:0x0150  */
    /* JADX WARN: Code duplicated, block: B:53:0x0154  */
    /* JADX WARN: Code duplicated, block: B:54:0x015b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0162  */
    /* JADX WARN: Code duplicated, block: B:59:0x017c  */
    /* JADX WARN: Code duplicated, block: B:60:0x017e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0181  */
    /* JADX WARN: Code duplicated, block: B:63:0x0183  */
    /* JADX WARN: Code duplicated, block: B:70:0x019b  */
    public e0i0(fzh0 fzh0Var, Uri uri, Handler handler, Bundle bundle, b380 b380Var, b380 b380Var2, qa61 qa61Var, m8u0 m8u0Var, Bundle bundle2) {
        boolean z;
        ComponentName componentName;
        ComponentName componentNameE;
        Intent intent;
        PendingIntent broadcast;
        MediaSessionCompat mediaSessionCompat;
        ComponentName componentName2;
        PendingIntent pendingIntent;
        jlb jlbVar;
        IntentFilter intentFilter;
        this.d = fzh0Var;
        boolean z2 = true;
        this.t = b380Var;
        this.u = b380Var2;
        this.v = qa61Var;
        this.w = m8u0Var;
        this.s = new Bundle(bundle2);
        Context context = fzh0Var.f;
        this.e = MediaSessionManager.getSessionManager(context);
        this.f = new c0i0(this);
        v1k v1kVar = new v1k(fzh0Var);
        this.a = v1kVar;
        this.o = 300000;
        this.g = new zzh0(fzh0Var.l.getLooper(), v1kVar);
        int i = Build.VERSION.SDK_INT;
        if (i < 33) {
            z = false;
        } else {
            String str = zoi1.a;
            if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                z = false;
            } else {
                String str2 = Build.MANUFACTURER;
                if (str2.equals("Google") || str2.equals("motorola") || str2.equals("vivo") || str2.equals("Sony") || str2.equals("Nothing") || str2.equals("unknown")) {
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        this.h = z;
        if (!b380Var2.isEmpty()) {
            l();
        }
        PackageManager packageManager = context.getPackageManager();
        Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
        intent2.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
            componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
        } else {
            if (!listQueryBroadcastReceivers.isEmpty()) {
                bhn0.r(listQueryBroadcastReceivers.size(), "Expected 1 broadcast receiver that handles android.intent.action.MEDIA_BUTTON, found ");
                throw null;
            }
            componentName = null;
        }
        this.l = componentName;
        if (componentName == null || i < 31) {
            componentNameE = e(context, "androidx.media3.session.MediaLibraryService");
            componentNameE = componentNameE == null ? e(context, "androidx.media3.session.MediaSessionService") : componentNameE;
            if (componentNameE == null || componentNameE.equals(componentName)) {
            }
            intent = new Intent("android.intent.action.MEDIA_BUTTON", uri);
            if (componentNameE == null) {
                jlbVar = new jlb(this, (byte) 13);
                this.k = jlbVar;
                intentFilter = new IntentFilter("android.intent.action.MEDIA_BUTTON");
                String scheme = uri.getScheme();
                String str3 = zoi1.a;
                intentFilter.addDataScheme(scheme);
                if (i < 33) {
                    context.registerReceiver(jlbVar, intentFilter);
                } else {
                    context.registerReceiver(jlbVar, intentFilter, 4);
                }
                intent.setPackage(context.getPackageName());
                broadcast = PendingIntent.getBroadcast(context, 0, intent, x);
                componentNameE = new ComponentName(context, context.getClass());
            } else {
                intent.setComponent(componentNameE);
                if (z2) {
                    broadcast = PendingIntent.getBroadcast(context, 0, intent, x);
                } else if (i >= 26) {
                    broadcast = PendingIntent.getForegroundService(context, 0, intent, x);
                } else {
                    broadcast = PendingIntent.getService(context, 0, intent, x);
                }
                this.k = null;
            }
            String strJoin = TextUtils.join(".", new String[]{"androidx.media3.session.id", fzh0Var.i});
            if (i < 31) {
                componentName2 = componentNameE;
            } else {
                componentName2 = null;
            }
            if (i < 31) {
                pendingIntent = broadcast;
            } else {
                pendingIntent = null;
            }
            mediaSessionCompat = new MediaSessionCompat(context, strJoin, componentName2, pendingIntent, bundle, null);
            this.j = mediaSessionCompat;
            if (i >= 31 && componentName != null) {
                mb4.K(mediaSessionCompat, componentName);
            }
            mediaSessionCompat.setCallback(this, handler);
            this.i = z ? new q64(context, new gzh0(this, (byte) 0)) : null;
        }
        componentNameE = componentName;
        z2 = false;
        intent = new Intent("android.intent.action.MEDIA_BUTTON", uri);
        if (componentNameE == null) {
            jlbVar = new jlb(this, (byte) 13);
            this.k = jlbVar;
            intentFilter = new IntentFilter("android.intent.action.MEDIA_BUTTON");
            String scheme2 = uri.getScheme();
            String str4 = zoi1.a;
            intentFilter.addDataScheme(scheme2);
            if (i < 33) {
                context.registerReceiver(jlbVar, intentFilter);
            } else {
                context.registerReceiver(jlbVar, intentFilter, 4);
            }
            intent.setPackage(context.getPackageName());
            broadcast = PendingIntent.getBroadcast(context, 0, intent, x);
            componentNameE = new ComponentName(context, context.getClass());
        } else {
            intent.setComponent(componentNameE);
            if (z2) {
                broadcast = PendingIntent.getBroadcast(context, 0, intent, x);
            } else if (i >= 26) {
                broadcast = PendingIntent.getForegroundService(context, 0, intent, x);
            } else {
                broadcast = PendingIntent.getService(context, 0, intent, x);
            }
            this.k = null;
        }
        String strJoin2 = TextUtils.join(".", new String[]{"androidx.media3.session.id", fzh0Var.i});
        if (i < 31) {
            componentName2 = componentNameE;
        } else {
            componentName2 = null;
        }
        if (i < 31) {
            pendingIntent = broadcast;
        } else {
            pendingIntent = null;
        }
        mediaSessionCompat = new MediaSessionCompat(context, strJoin2, componentName2, pendingIntent, bundle, null);
        this.j = mediaSessionCompat;
        if (i >= 31) {
            mb4.K(mediaSessionCompat, componentName);
        }
        mediaSessionCompat.setCallback(this, handler);
        this.i = z ? new q64(context, new gzh0(this, (byte) 0)) : null;
    }

    public static yoh0 a(String str, Uri uri, String str2, Bundle bundle) {
        koh0 koh0Var = new koh0();
        if (str == null) {
            str = "";
        }
        koh0Var.b = str;
        o3e0 o3e0Var = new o3e0();
        o3e0Var.b = uri;
        o3e0Var.c = str2;
        o3e0Var.d = bundle;
        koh0Var.m = new toh0(o3e0Var);
        return koh0Var.a();
    }

    public static ComponentName e(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            return null;
        }
        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
        return new ComponentName(serviceInfo.packageName, serviceInfo.name);
    }

    /* JADX WARN: Code duplicated, block: B:153:0x0261  */
    /* JADX WARN: Code duplicated, block: B:36:0x009f  */
    /* JADX WARN: Code duplicated, block: B:87:0x014a  */
    public final PlaybackStateCompat b(ffu0 ffu0Var) {
        long j;
        int i;
        long j2;
        b2c b2cVar = this.r;
        if (b2cVar != null) {
            Bundle bundle = (Bundle) b2cVar.d;
            if (b2cVar.b) {
                Bundle bundle2 = new Bundle(bundle);
                bundle2.putAll(this.s);
                PlaybackStateCompat.Builder extras = new PlaybackStateCompat.Builder().setState(7, -1L, 0.0f, SystemClock.elapsedRealtime()).setActions(0L).setBufferedPosition(0L).setExtras(bundle2);
                int i2 = b2cVar.a;
                String str = (String) b2cVar.c;
                str.getClass();
                return extras.setErrorMessage(i2, str).setExtras(bundle).build();
            }
        }
        PlaybackException playbackExceptionL = ffu0Var.L();
        boolean z = ffu0Var.Y(16) && !ffu0Var.e1();
        boolean z2 = playbackExceptionL != null || zoi1.i0(ffu0Var, this.n);
        int i3 = 7;
        if (playbackExceptionL == null) {
            int i4 = yzb0.a;
            if (ffu0Var.L() == null) {
                int playbackState = ffu0Var.getPlaybackState();
                if (playbackState == 1) {
                    i3 = 0;
                } else if (playbackState != 2) {
                    if (playbackState != 3) {
                        if (playbackState != 4) {
                            hhg1.n(f4i1.c(playbackState, "Unrecognized State: "));
                            return null;
                        }
                        i3 = 1;
                    } else if (z2) {
                        i3 = 2;
                    } else {
                        i3 = 3;
                    }
                } else if (z2) {
                    i3 = 2;
                } else {
                    i3 = 6;
                }
            }
        }
        int i5 = i3;
        m8u0 m8u0VarD = bai0.d(this.w, ffu0Var.n0());
        long j3 = 128;
        for (int i6 = 0; i6 < m8u0VarD.a.a.size(); i6++) {
            int iB = m8u0VarD.a.b(i6);
            if (iB == 1) {
                j2 = z2 ? 516L : 514L;
            } else if (iB == 2) {
                j2 = PlaybackStateCompat.ACTION_PREPARE;
            } else if (iB == 3) {
                j2 = 1;
            } else if (iB != 31) {
                switch (iB) {
                    case 5:
                        j2 = 256;
                        break;
                    case 6:
                    case 7:
                        j2 = 16;
                        break;
                    case 8:
                    case 9:
                        j2 = 32;
                        break;
                    case 10:
                        j2 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
                        break;
                    case 11:
                        j2 = 8;
                        break;
                    case 12:
                        j2 = 64;
                        break;
                    case 13:
                        j2 = PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED;
                        break;
                    case 14:
                        j2 = 2621440;
                        break;
                    case 15:
                        j2 = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                        break;
                    default:
                        j2 = 0;
                        break;
                }
            } else {
                j2 = 240640;
            }
            j3 |= j2;
        }
        if (!this.u.isEmpty() && udh.b(2, this.t)) {
            j3 &= -17;
        }
        if (!this.u.isEmpty() && udh.b(3, this.t)) {
            j3 &= -33;
        }
        if (!z) {
            j3 &= -257;
        }
        long j4 = j3;
        if (ffu0Var.Y(17)) {
            int iQ0 = ffu0Var.Q0();
            int i7 = yzb0.a;
            if (iQ0 == -1) {
                j = -1;
            } else {
                j = iQ0;
            }
        } else {
            j = -1;
        }
        float f = ffu0Var.l().a;
        float f2 = (ffu0Var.i() && z) ? f : 0.0f;
        Bundle bundle3 = playbackExceptionL != null ? new Bundle(playbackExceptionL.c) : new Bundle();
        if (playbackExceptionL == null && b2cVar != null) {
            bundle3.putAll((Bundle) b2cVar.d);
        }
        bundle3.putAll(this.s);
        bundle3.putFloat("EXO_SPEED", f);
        yoh0 yoh0VarH1 = ffu0Var.h1();
        if (yoh0VarH1 != null) {
            String str2 = yoh0VarH1.a;
            if (!"".equals(str2)) {
                bundle3.putString(MediaConstants.PLAYBACK_STATE_EXTRAS_KEY_MEDIA_ID, str2);
            }
        }
        PlaybackStateCompat.Builder extras2 = new PlaybackStateCompat.Builder().setState(i5, z ? ffu0Var.v() : -1L, f2, SystemClock.elapsedRealtime()).setActions(j4).setActiveQueueItemId(j).setBufferedPosition(z ? ffu0Var.N0() : -1L).setExtras(bundle3);
        for (int i8 = 0; i8 < this.t.size(); i8++) {
            udh udhVar = (udh) this.t.get(i8);
            pa61 pa61Var = udhVar.a;
            Uri uri = udhVar.e;
            int i9 = udhVar.c;
            Bundle bundle4 = udhVar.g;
            if (pa61Var != null) {
                Bundle bundle5 = pa61Var.c;
                String str3 = pa61Var.b;
                if (udhVar.i && pa61Var.a == 0) {
                    qa61 qa61Var = this.v;
                    if ((pa61Var != null && qa61Var.a.contains(pa61Var)) || (((i = udhVar.b) != -1 && m8u0VarD.a(i)) || udh.l(str3))) {
                        boolean z3 = i9 != 0;
                        boolean z4 = uri != null;
                        if (z3 || z4 || !bundle4.isEmpty()) {
                            bundle5 = new Bundle(bundle5);
                        }
                        if (!bundle4.isEmpty()) {
                            bundle5.putAll(bundle4);
                        }
                        if (z3) {
                            bundle5.putInt("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT", i9);
                        }
                        if (z4) {
                            uri.getClass();
                            bundle5.putString("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_URI_COMPAT", uri.toString());
                        }
                        extras2.addCustomAction(new PlaybackStateCompat.CustomAction.Builder(str3, udhVar.f, udhVar.d).setExtras(bundle5).build());
                    }
                }
            }
        }
        if (playbackExceptionL != null) {
            int i10 = yzb0.a;
            extras2.setErrorMessage(yzb0.c(playbackExceptionL.a), playbackExceptionL.getMessage());
        } else if (b2cVar != null) {
            extras2.setErrorMessage(b2cVar.a, (String) b2cVar.c);
        }
        return extras2.build();
    }

    public final void c(final int i, final d0i0 d0i0Var, final MediaSessionManager.RemoteUserInfo remoteUserInfo, final boolean z) {
        if (this.d.p()) {
            return;
        }
        if (remoteUserInfo != null) {
            i(new Runnable() { // from class: p.tzh0
                @Override // java.lang.Runnable
                public final void run() {
                    final e0i0 e0i0Var = this.a;
                    final int i2 = i;
                    final d0i0 d0i0Var2 = d0i0Var;
                    final boolean z2 = z;
                    e0i0Var.f(remoteUserInfo, new d0i0() { // from class: p.vzh0
                        public final void a(ixh0 ixh0Var) {
                            d0i0 d0i0Var3 = d0i0Var2;
                            e0i0 e0i0Var2 = e0i0Var;
                            fzh0 fzh0Var = e0i0Var2.d;
                            v1k v1kVar = e0i0Var2.a;
                            int i3 = i2;
                            if (!v1kVar.v(ixh0Var, i3)) {
                                if (i3 == 1) {
                                    fzh0Var.C();
                                    if (fzh0Var.t.q()) {
                                        return;
                                    }
                                    oon1.H("Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
                                    return;
                                }
                                return;
                            }
                            uph0 uph0Var = fzh0Var.e;
                            fzh0Var.A(ixh0Var);
                            uph0Var.getClass();
                            fzh0Var.x = ixh0Var;
                            try {
                                d0i0Var3.a(ixh0Var);
                            } catch (RemoteException e) {
                                oon1.I("Exception in " + ixh0Var, e);
                            }
                            fzh0Var.x = null;
                            if (z2) {
                                l8u0 l8u0Var = new l8u0();
                                l8u0Var.a.c(i3);
                                fzh0Var.v(ixh0Var, l8u0Var.d());
                            }
                        }
                    });
                }
            });
            return;
        }
        oon1.s("RemoteUserInfo is null, ignoring command=" + i);
    }

    public final void d(final pa61 pa61Var, final int i, final d0i0 d0i0Var, final MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        Object objValueOf;
        if (remoteUserInfo != null) {
            i(new Runnable() { // from class: p.uzh0
                @Override // java.lang.Runnable
                public final void run() {
                    final e0i0 e0i0Var = this.a;
                    final pa61 pa61Var2 = pa61Var;
                    final char c = i;
                    final d0i0 d0i0Var2 = d0i0Var;
                    e0i0Var.f(remoteUserInfo, new d0i0() { // from class: p.wzh0
                        public final void a(ixh0 ixh0Var) {
                            d0i0 d0i0Var3 = d0i0Var2;
                            v1k v1kVar = e0i0Var.a;
                            pa61 pa61Var3 = pa61Var2;
                            if (pa61Var3 != null) {
                                if (!v1kVar.x(ixh0Var, pa61Var3)) {
                                    return;
                                }
                            } else if (!v1kVar.w(ixh0Var, c)) {
                                return;
                            }
                            try {
                                d0i0Var3.a(ixh0Var);
                            } catch (RemoteException e) {
                                oon1.I("Exception in " + ixh0Var, e);
                            }
                        }
                    });
                }
            });
            return;
        }
        StringBuilder sb = new StringBuilder("RemoteUserInfo is null, ignoring command=");
        if (pa61Var == null) {
            objValueOf = pa61Var;
            objValueOf = Integer.valueOf(i);
        }
        objValueOf = pa61Var;
        sb.append(objValueOf);
        oon1.s(sb.toString());
    }

    public final void f(MediaSessionManager.RemoteUserInfo remoteUserInfo, d0i0 d0i0Var) {
        if (this.d.p()) {
            return;
        }
        if (!this.j.isActive()) {
            oon1.H("Ignore incoming command before initialization. pid=" + remoteUserInfo.getPid());
            return;
        }
        ixh0 ixh0VarO = this.a.o(remoteUserInfo);
        if (ixh0VarO != null) {
            zzh0 zzh0Var = this.g;
            long j = this.o;
            zzh0Var.removeMessages(ContentMediaFormat.FULL_CONTENT_GENERIC, ixh0VarO);
            zzh0Var.sendMessageDelayed(zzh0Var.obtainMessage(ContentMediaFormat.FULL_CONTENT_GENERIC, ixh0VarO), j);
            try {
                d0i0Var.a(ixh0VarO);
                return;
            } catch (RemoteException e) {
                oon1.I("Exception in " + ixh0VarO, e);
                return;
            }
        }
        if (this.b.containsKey(remoteUserInfo)) {
            List list = (List) this.c.get(remoteUserInfo);
            list.getClass();
            list.add(d0i0Var);
            return;
        }
        a0i0 a0i0Var = new a0i0(remoteUserInfo);
        ixh0 ixh0Var = new ixh0(remoteUserInfo, 0, 0, this.e.isTrustedForMediaControl(remoteUserInfo), a0i0Var, Bundle.EMPTY);
        f280 f280VarS = this.d.s(ixh0Var);
        ArrayList arrayList = new ArrayList();
        arrayList.add(d0i0Var);
        this.c.put(remoteUserInfo, arrayList);
        f280VarS.b(new nx30(f280VarS, new pzh0(this, remoteUserInfo, a0i0Var, ixh0Var), (byte) 24), new wkh0(this, (byte) 4));
    }

    public final void g(final yoh0 yoh0Var, final boolean z, final boolean z2) {
        c(31, new d0i0() { // from class: p.kzh0
            public final void a(ixh0 ixh0Var) {
                e0i0 e0i0Var = this.a;
                f280 f280VarX = e0i0Var.d.x(ixh0Var, b380.t(yoh0Var), -1, -9223372036854775807L);
                m3c m3cVar = new m3c(e0i0Var, ixh0Var, z, z2);
                f280VarX.b(new nx30(f280VarX, m3cVar, (byte) 24), new wkh0(e0i0Var, (byte) 4));
            }
        }, this.j.getCurrentControllerInfo(), false);
    }

    public final boolean h() {
        fzh0 fzh0Var = this.d;
        fzh0Var.C();
        return this.w.a(17) && fzh0Var.t.n0().a(17);
    }

    public final void i(Runnable runnable) {
        zoi1.c0(this.d.l, runnable);
    }

    public final void j() {
        int i = Build.VERSION.SDK_INT;
        fzh0 fzh0Var = this.d;
        MediaSessionCompat mediaSessionCompat = this.j;
        if (i < 31) {
            ComponentName componentName = this.l;
            if (componentName == null) {
                mediaSessionCompat.setMediaButtonReceiver(null);
            } else {
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", fzh0Var.b);
                intent.setComponent(componentName);
                mediaSessionCompat.setMediaButtonReceiver(PendingIntent.getBroadcast(fzh0Var.f, 0, intent, x));
            }
        }
        jlb jlbVar = this.k;
        if (jlbVar != null) {
            fzh0Var.f.unregisterReceiver(jlbVar);
        }
        q64 q64Var = this.i;
        if (q64Var != null && !q64Var.f.getAndSet(true)) {
            q64Var.c.execute(new p64(q64Var, (byte) 1));
        }
        mediaSessionCompat.release();
        ((WeakReference) this.a.d).clear();
    }

    public final void k(qa61 qa61Var, m8u0 m8u0Var) {
        byte b = 1;
        boolean z = this.w.a(17) != m8u0Var.a(17);
        this.v = qa61Var;
        this.w = m8u0Var;
        if (!this.u.isEmpty()) {
            m();
        }
        fzh0 fzh0Var = this.d;
        if (z) {
            fzh0Var.C();
            i(new szh0(this, fzh0Var.t, b));
        } else {
            fzh0Var.C();
            n(fzh0Var.t);
        }
    }

    public final void l() {
        q64 q64Var;
        this.t = udh.i(10, udh.f(this.u, this.v, this.w), true, true);
        if (this.h && ((q64Var = this.i) == null || !q64Var.e.get())) {
            this.s.putBoolean(MediaConstants.SESSION_EXTRAS_KEY_SLOT_RESERVATION_SKIP_TO_PREV, (this.t.isEmpty() || udh.b(2, this.t)) ? false : true);
            this.s.putBoolean(MediaConstants.SESSION_EXTRAS_KEY_SLOT_RESERVATION_SKIP_TO_NEXT, false);
        } else {
            this.s.putBoolean(MediaConstants.SESSION_EXTRAS_KEY_SLOT_RESERVATION_SKIP_TO_PREV, !udh.b(2, this.t));
            this.s.putBoolean(MediaConstants.SESSION_EXTRAS_KEY_SLOT_RESERVATION_SKIP_TO_NEXT, !udh.b(3, this.t));
        }
    }

    public final void m() {
        boolean z = this.s.getBoolean(MediaConstants.SESSION_EXTRAS_KEY_SLOT_RESERVATION_SKIP_TO_PREV, false);
        boolean z2 = this.s.getBoolean(MediaConstants.SESSION_EXTRAS_KEY_SLOT_RESERVATION_SKIP_TO_NEXT, false);
        l();
        if (this.s.getBoolean(MediaConstants.SESSION_EXTRAS_KEY_SLOT_RESERVATION_SKIP_TO_PREV, false) == z && this.s.getBoolean(MediaConstants.SESSION_EXTRAS_KEY_SLOT_RESERVATION_SKIP_TO_NEXT, false) == z2) {
            return;
        }
        this.j.setExtras(this.s);
    }

    public final void n(ffu0 ffu0Var) {
        i(new szh0(this, ffu0Var, (byte) 0));
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public final void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        if (mediaDescriptionCompat != null) {
            if (i == -1 || i >= 0) {
                c(20, new nzh0(this, mediaDescriptionCompat, i), this.j.getCurrentControllerInfo(), false);
            }
        }
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public final void onCommand(String str, final Bundle bundle, final ResultReceiver resultReceiver) {
        str.getClass();
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        if (!str.equals("androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN") || resultReceiver == null) {
            final pa61 pa61Var = new pa61(str, Bundle.EMPTY);
            d(pa61Var, 0, new d0i0() { // from class: p.rzh0
                public final void a(ixh0 ixh0Var) {
                    fzh0 fzh0Var = this.a.d;
                    Bundle bundle2 = bundle;
                    if (bundle2 == null) {
                        bundle2 = Bundle.EMPTY;
                    }
                    s8d0 s8d0VarT = fzh0Var.t(ixh0Var, pa61Var, bundle2);
                    ResultReceiver resultReceiver2 = resultReceiver;
                    if (resultReceiver2 != null) {
                        s8d0VarT.b(new zyh0(s8d0VarT, resultReceiver2, (byte) 4), l5u.a);
                    }
                }
            }, this.j.getCurrentControllerInfo());
            return;
        }
        hi61 hi61Var = this.d.j;
        hi61Var.getClass();
        String str2 = hi61.b;
        Bundle bundle2 = new Bundle();
        ki61 ki61Var = hi61Var.a;
        bundle2.putInt(str2, 0);
        String str3 = hi61.c;
        Bundle bundle3 = new Bundle();
        bundle3.putInt(ki61.i, ki61Var.a);
        bundle3.putInt(ki61.j, 0);
        bundle3.putInt(ki61.k, ki61Var.b);
        bundle3.putString(ki61.l, ki61Var.d);
        bundle3.putString(ki61.m, "");
        bundle3.putBinder(ki61.o, ki61Var.f);
        bundle3.putParcelable(ki61.n, null);
        bundle3.putBundle(ki61.f82p, ki61Var.g);
        bundle3.putInt(ki61.q, ki61Var.c);
        MediaSession.Token token = ki61Var.h;
        if (token != null) {
            bundle3.putParcelable(ki61.r, token);
        }
        String str4 = ki61Var.e;
        if (str4 != null) {
            bundle3.putString(ki61.s, str4);
        }
        bundle2.putBundle(str3, bundle3);
        resultReceiver.send(0, bundle2);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0061  */
    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public final void onCustomAction(String str, final Bundle bundle) {
        boolean zBooleanValue;
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        final pa61 pa61Var = new pa61(str, bundle);
        boolean zL = udh.l(str);
        MediaSessionCompat mediaSessionCompat = this.j;
        byte b = 0;
        if (!zL) {
            d(pa61Var, 0, new d0i0() { // from class: p.mzh0
                public final void a(ixh0 ixh0Var) {
                    this.a.d.t(ixh0Var, pa61Var, bundle);
                }
            }, mediaSessionCompat.getCurrentControllerInfo());
            return;
        }
        try {
            udh udhVarC = udh.c(pa61Var);
            int i = udhVarC.b;
            Object obj = udhVarC.j;
            if (!udhVarC.a()) {
                oon1.H("Can't execute predefined custom command: ".concat(str));
                return;
            }
            pa61 pa61Var2 = udhVarC.a;
            char c = 1;
            if (pa61Var2 != null) {
                dm5.y(pa61Var2.a == 40010);
                obj.getClass();
                d(null, 40010, new ozh0(this, (esz0) obj, b), mediaSessionCompat.getCurrentControllerInfo());
                return;
            }
            fzh0 fzh0Var = this.d;
            fzh0Var.C();
            ffu0 ffu0Var = fzh0Var.t;
            if (i != 1) {
                zBooleanValue = false;
            } else if (obj != null) {
                zBooleanValue = ((Boolean) obj).booleanValue();
            } else if (ffu0Var.q()) {
                zBooleanValue = false;
            } else {
                zBooleanValue = true;
            }
            if (zBooleanValue) {
                c(1, new izh0(this, (byte) 4), mediaSessionCompat.getCurrentControllerInfo(), false);
            } else if (i != 31) {
                c(i, new ozh0(this, udhVarC, c == true ? 1 : 0), mediaSessionCompat.getCurrentControllerInfo(), true);
            } else {
                obj.getClass();
                g((yoh0) obj, false, false);
            }
        } catch (RuntimeException e) {
            oon1.I("Failed to convert predefined custom command: " + pa61Var.b, e);
        }
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public final void onFastForward() {
        c(12, new izh0(this, (byte) 8), this.j.getCurrentControllerInfo(), true);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        MediaSessionManager.RemoteUserInfo currentControllerInfo = this.j.getCurrentControllerInfo();
        currentControllerInfo.getClass();
        return this.d.u(new ixh0(currentControllerInfo, 0, 0, false, null, Bundle.EMPTY), intent);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public final void onPause() {
        c(1, new izh0(this, (byte) 0), this.j.getCurrentControllerInfo(), true);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public final void onPlay() {
        c(1, new izh0(this, (byte) 4), this.j.getCurrentControllerInfo(), false);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        g(a(str, null, null, bundle), true, true);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public final void onPlayFromSearch(String str, Bundle bundle) {
        g(a(null, null, str, bundle), true, true);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        g(a(null, uri, null, bundle), true, true);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public final void onPrepare() {
        c(2, new izh0(this, (byte) 5), this.j.getCurrentControllerInfo(), true);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        g(a(str, null, null, bundle), true, false);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        g(a(null, null, str, bundle), true, false);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        g(a(null, uri, null, bundle), true, false);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public final void onRemoveQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        if (mediaDescriptionCompat == null) {
            return;
        }
        c(20, new ozh0(this, mediaDescriptionCompat, (byte) 2), this.j.getCurrentControllerInfo(), true);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public final void onRewind() {
        c(11, new izh0(this, (byte) 3), this.j.getCurrentControllerInfo(), true);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public final void onSeekTo(long j) {
        c(5, new lzh0(this, j, (byte) 1), this.j.getCurrentControllerInfo(), true);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public final void onSetPlaybackSpeed(final float f) {
        if (f <= 0.0f) {
            return;
        }
        c(13, new d0i0() { // from class: p.jzh0
            public final void a(ixh0 ixh0Var) {
                fzh0 fzh0Var = this.a.d;
                fzh0Var.C();
                fzh0Var.t.h(f);
            }
        }, this.j.getCurrentControllerInfo(), true);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public final void onSetRating(RatingCompat ratingCompat, Bundle bundle) {
        esz0 esz0VarG = yzb0.g(ratingCompat);
        if (esz0VarG != null) {
            d(null, 40010, new ozh0(this, esz0VarG, (byte) 0), this.j.getCurrentControllerInfo());
            return;
        }
        oon1.H("Ignoring invalid RatingCompat " + ratingCompat);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public final void onSetRepeatMode(int i) {
        c(15, new hzh0(this, i, (byte) 1), this.j.getCurrentControllerInfo(), true);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public final void onSetShuffleMode(int i) {
        c(14, new hzh0(this, i, (byte) 0), this.j.getCurrentControllerInfo(), true);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public final void onSkipToNext() {
        fzh0 fzh0Var = this.d;
        fzh0Var.C();
        byte b = 9;
        boolean zY = fzh0Var.t.Y(9);
        MediaSessionCompat mediaSessionCompat = this.j;
        if (zY) {
            c(9, new izh0(this, b), mediaSessionCompat.getCurrentControllerInfo(), true);
        } else {
            c(8, new izh0(this, (byte) 10), mediaSessionCompat.getCurrentControllerInfo(), true);
        }
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public final void onSkipToPrevious() {
        fzh0 fzh0Var = this.d;
        fzh0Var.C();
        boolean zY = fzh0Var.t.Y(7);
        byte b = 1;
        MediaSessionCompat mediaSessionCompat = this.j;
        if (zY) {
            c(7, new izh0(this, b), mediaSessionCompat.getCurrentControllerInfo(), true);
        } else {
            c(6, new izh0(this, (byte) 2), mediaSessionCompat.getCurrentControllerInfo(), true);
        }
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public final void onSkipToQueueItem(long j) {
        if (j < 0) {
            return;
        }
        c(10, new lzh0(this, j, (byte) 0), this.j.getCurrentControllerInfo(), true);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public final void onStop() {
        c(3, new izh0(this, (byte) 6), this.j.getCurrentControllerInfo(), true);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public final void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        if (mediaDescriptionCompat != null) {
            c(20, new nzh0(this, mediaDescriptionCompat, -1), this.j.getCurrentControllerInfo(), false);
        }
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public final void onSetCaptioningEnabled(boolean z) {
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public final void onSetRating(RatingCompat ratingCompat) {
        onSetRating(ratingCompat, null);
    }
}
