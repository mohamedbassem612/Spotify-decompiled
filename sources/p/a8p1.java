package p;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.a;
import android.support.v4.media.session.d;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.ReconnectionService;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class a8p1 {
    public static final pue0 v = new pue0("MediaSessionManager", (String) null);
    public final Context a;
    public final p3e b;
    public final fsn1 c;
    public final wf61 d;
    public final vro0 e;
    public final ComponentName f;
    public final ComponentName g;
    public final vi11 h;
    public final vi11 i;
    public final evo1 j;
    public final jim0 k;
    public final seg1 l;
    public final oxo1 m;
    public e321 n;
    public CastDevice o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public eyh0 f2p;
    public boolean q;
    public PlaybackStateCompat.CustomAction r;
    public PlaybackStateCompat.CustomAction s;
    public PlaybackStateCompat.CustomAction t;
    public PlaybackStateCompat.CustomAction u;

    public a8p1(Context context, p3e p3eVar, fsn1 fsn1Var) {
        wf61 wf61Var;
        vro0 vro0Var;
        this.a = context;
        this.b = p3eVar;
        this.c = fsn1Var;
        pue0 pue0Var = b3e.l;
        zod.n("Must be called from the main thread.");
        b3e b3eVar = b3e.n;
        evo1 evo1Var = null;
        if (b3eVar != null) {
            zod.n("Must be called from the main thread.");
            wf61Var = b3eVar.b;
        } else {
            wf61Var = null;
        }
        this.d = wf61Var;
        h3e h3eVar = p3eVar.f;
        this.e = h3eVar == null ? null : h3eVar.d;
        this.m = new oxo1(this, (byte) 2);
        String str = h3eVar == null ? null : h3eVar.b;
        this.f = !TextUtils.isEmpty(str) ? new ComponentName(context, str) : null;
        String str2 = h3eVar == null ? null : h3eVar.a;
        this.g = !TextUtils.isEmpty(str2) ? new ComponentName(context, str2) : null;
        vi11 vi11Var = new vi11(context, (byte) 29);
        this.h = vi11Var;
        vi11Var.f = new ghk1(this, (byte) 10);
        vi11 vi11Var2 = new vi11(context, (byte) 29);
        this.i = vi11Var2;
        vi11Var2.f = new ssk1(this);
        this.k = new jim0(Looper.getMainLooper(), (byte) 5);
        pue0 pue0Var2 = evo1.u;
        h3e h3eVar2 = p3eVar.f;
        if (h3eVar2 != null && (vro0Var = h3eVar2.d) != null) {
            i2o1 i2o1Var = vro0Var.f1;
            if (i2o1Var == null) {
                evo1Var = new evo1(context);
            } else {
                ArrayList arrayListA = cap1.a(i2o1Var);
                int[] iArrB = cap1.b(i2o1Var);
                int size = arrayListA == null ? 0 : arrayListA.size();
                if (arrayListA == null || arrayListA.isEmpty()) {
                    pue0Var2.c(sjo0.class.getSimpleName().concat(" doesn't provide any action."), new Object[0]);
                } else if (arrayListA.size() > 5) {
                    pue0Var2.c(sjo0.class.getSimpleName().concat(" provides more than 5 actions."), new Object[0]);
                } else if (iArrB == null || (iArrB.length) == 0) {
                    pue0Var2.c(sjo0.class.getSimpleName().concat(" doesn't provide any actions for compact view."), new Object[0]);
                } else {
                    for (int i : iArrB) {
                        if (i < 0 || i >= size) {
                            pue0Var2.c(sjo0.class.getSimpleName().concat("provides a compact view action whose index is out of bounds."), new Object[0]);
                        }
                    }
                    evo1Var = new evo1(context);
                }
            }
        }
        this.j = evo1Var;
        this.l = new seg1(this, (byte) 25);
    }

    public final void a(e321 e321Var, CastDevice castDevice) {
        ComponentName componentName;
        p3e p3eVar = this.b;
        h3e h3eVar = p3eVar == null ? null : p3eVar.f;
        if (this.q || p3eVar == null || h3eVar == null || this.e == null || e321Var == null || castDevice == null || (componentName = this.g) == null) {
            v.a("skip attaching media session", new Object[0]);
            return;
        }
        this.n = e321Var;
        e321Var.l(this.m);
        this.o = castDevice;
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentName);
        Context context = this.a;
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 67108864);
        if (h3eVar.f) {
            eyh0 eyh0Var = new eyh0(context, "CastMediaSession", componentName, broadcast);
            this.f2p = eyh0Var;
            e(0, null);
            CastDevice castDevice2 = this.o;
            if (castDevice2 != null && !TextUtils.isEmpty(castDevice2.d)) {
                Bundle bundle = new Bundle();
                String string = context.getResources().getString(2131953456, this.o.d);
                y36 y36Var = MediaMetadataCompat.c;
                if (y36Var.containsKey("android.media.metadata.ALBUM_ARTIST") && ((Integer) y36Var.get("android.media.metadata.ALBUM_ARTIST")).intValue() != 1) {
                    hhg1.n("The android.media.metadata.ALBUM_ARTIST key cannot be used to put a String");
                    return;
                } else {
                    bundle.putCharSequence("android.media.metadata.ALBUM_ARTIST", string);
                    eyh0Var.B(new MediaMetadataCompat(bundle));
                }
            }
            eyh0Var.z(new z0p1(this), (Handler) null);
            eyh0Var.y(true);
            this.c.l.getClass();
            owh0.f(eyh0Var);
        }
        this.q = true;
        c();
    }

    public final void b(int i) {
        if (this.q) {
            this.q = false;
            e321 e321Var = this.n;
            if (e321Var != null) {
                zod.n("Must be called from the main thread.");
                oxo1 oxo1Var = this.m;
                if (oxo1Var != null) {
                    e321Var.h.remove(oxo1Var);
                }
            }
            AudioManager audioManager = (AudioManager) this.a.getSystemService("audio");
            if (audioManager != null) {
                audioManager.abandonAudioFocus(null);
            }
            this.c.l.getClass();
            owh0.f((eyh0) null);
            vi11 vi11Var = this.h;
            if (vi11Var != null) {
                vi11Var.Y();
                vi11Var.f = null;
            }
            vi11 vi11Var2 = this.i;
            if (vi11Var2 != null) {
                vi11Var2.Y();
                vi11Var2.f = null;
            }
            eyh0 eyh0Var = this.f2p;
            if (eyh0Var != null) {
                eyh0Var.z((xxh0) null, (Handler) null);
                this.f2p.B(new MediaMetadataCompat(new Bundle()));
                e(0, null);
            }
            eyh0 eyh0Var2 = this.f2p;
            if (eyh0Var2 != null) {
                eyh0Var2.y(false);
                this.f2p.w();
                this.f2p = null;
            }
            this.n = null;
            this.o = null;
            j();
            if (i == 0) {
                l();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    public final void c() {
        MediaInfo mediaInfoC;
        sqh0 sqh0Var;
        boolean z;
        boolean z2;
        quh0 quh0Var;
        MediaInfo mediaInfo;
        e321 e321Var = this.n;
        if (e321Var == null) {
            return;
        }
        int iP = e321Var.p();
        MediaInfo mediaInfoC2 = e321Var.c();
        bil1 bil1Var = null;
        if (e321Var.i()) {
            zod.n("Must be called from the main thread.");
            j3i0 j3i0VarD = e321Var.d();
            if (j3i0VarD == null) {
                quh0Var = null;
            } else {
                Integer num = (Integer) j3i0VarD.X0.get(j3i0VarD.Y);
                if (num == null) {
                    quh0Var = null;
                } else {
                    quh0Var = (quh0) j3i0VarD.Q0.get(num.intValue());
                }
            }
            if (quh0Var != null && (mediaInfo = quh0Var.a) != null) {
                mediaInfoC2 = mediaInfo;
            }
        }
        e(iP, mediaInfoC2);
        if (!e321Var.g()) {
            j();
            l();
            return;
        }
        if (iP != 0) {
            evo1 evo1Var = this.j;
            if (evo1Var != null) {
                v.a("Update media notification.", new Object[0]);
                CastDevice castDevice = this.o;
                e321 e321Var2 = this.n;
                eyh0 eyh0Var = this.f2p;
                if (castDevice != null && e321Var2 != null && eyh0Var != null && (mediaInfoC = e321Var2.c()) != null && (sqh0Var = mediaInfoC.d) != null) {
                    List list = sqh0Var.a;
                    j3i0 j3i0VarD2 = e321Var2.d();
                    if (j3i0VarD2 == null) {
                        z = false;
                        z2 = z;
                    } else {
                        int i = j3i0VarD2.P0;
                        if (i == 1 || i == 2 || i == 3) {
                            z = true;
                            z2 = z;
                        } else {
                            Integer num2 = (Integer) j3i0VarD2.X0.get(j3i0VarD2.c);
                            if (num2 != null) {
                                boolean z3 = num2.intValue() > 0;
                                z = num2.intValue() < j3i0VarD2.Q0.size() + (-1);
                                z2 = z3;
                            } else {
                                z = false;
                                z2 = z;
                            }
                        }
                    }
                    boolean z4 = e321Var2.e() == 2;
                    int i2 = mediaInfoC.b;
                    String strJ = sqh0Var.j("com.google.android.gms.cast.metadata.TITLE");
                    String str = castDevice.d;
                    b3k b3kVar = new b3k(z4, i2, strJ, str, ((yxh0) eyh0Var.b).c, z, z2);
                    boolean z5 = z4;
                    boolean z6 = z;
                    boolean z7 = z2;
                    b3k b3kVar2 = evo1Var.k;
                    if (b3kVar2 == null || z5 != b3kVar2.e || i2 != b3kVar2.g || !o4e.c(strJ, (String) b3kVar2.c) || !o4e.c(str, (String) b3kVar2.d) || z6 != b3kVar2.f || z7 != b3kVar2.h) {
                        evo1Var.k = b3kVar;
                        evo1Var.a();
                    }
                    if (list != null && !list.isEmpty()) {
                        bil1Var = (bil1) list.get(0);
                    }
                    zxl1 zxl1Var = new zxl1(bil1Var);
                    Uri uri = (Uri) zxl1Var.b;
                    zxl1 zxl1Var2 = evo1Var.l;
                    if (zxl1Var2 == null || !o4e.c(uri, (Uri) zxl1Var2.b)) {
                        vi11 vi11Var = evo1Var.i;
                        vi11Var.f = new frl1(evo1Var, zxl1Var);
                        vi11Var.X(uri);
                    }
                }
            }
            if (e321Var.i()) {
                return;
            }
            k(true);
        }
    }

    public final void d(int i, Bitmap bitmap) {
        eyh0 eyh0Var = this.f2p;
        if (eyh0Var == null) {
            return;
        }
        if (bitmap == null || bitmap.getWidth() <= 1 || bitmap.getHeight() <= 1) {
            bitmap = Bitmap.createBitmap(2, 2, Bitmap.Config.ARGB_8888);
            bitmap.eraseColor(0);
        }
        mre0 mre0VarI = i();
        mre0VarI.g(i == 0 ? "android.media.metadata.DISPLAY_ICON" : "android.media.metadata.ALBUM_ART", bitmap);
        eyh0Var.B(new MediaMetadataCompat((Bundle) mre0VarI.b));
    }

    public final void e(int i, MediaInfo mediaInfo) {
        PlaybackStateCompat playbackStateCompatA;
        eyh0 eyh0Var;
        sqh0 sqh0Var;
        Bitmap bitmap;
        PendingIntent activity;
        eyh0 eyh0Var2 = this.f2p;
        if (eyh0Var2 == null) {
            return;
        }
        yxh0 yxh0Var = (yxh0) eyh0Var2.b;
        Bundle bundle = new Bundle();
        d dVar = new d();
        e321 e321Var = this.n;
        vro0 vro0Var = this.e;
        if (e321Var == null || this.j == null) {
            playbackStateCompatA = dVar.a();
        } else {
            long jB = (e321Var.p() == 0 || e321Var.h()) ? 0L : e321Var.b();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            dVar.b = i;
            dVar.c = jB;
            dVar.f = jElapsedRealtime;
            dVar.d = 1.0f;
            if (i == 0) {
                playbackStateCompatA = dVar.a();
            } else {
                i2o1 i2o1Var = vro0Var != null ? vro0Var.f1 : null;
                e321 e321Var2 = this.n;
                long jF = (e321Var2 == null || e321Var2.h() || this.n.k()) ? 0L : 256L;
                if (i2o1Var != null) {
                    ArrayList<qjo0> arrayListA = cap1.a(i2o1Var);
                    if (arrayListA != null) {
                        for (qjo0 qjo0Var : arrayListA) {
                            String str = qjo0Var.a;
                            if (TextUtils.equals(str, MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_PREV) || TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                                jF |= f(str, i, bundle);
                            } else {
                                g(dVar, str, qjo0Var);
                            }
                        }
                    }
                } else if (vro0Var != null) {
                    for (String str2 : vro0Var.a) {
                        if (TextUtils.equals(str2, MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || TextUtils.equals(str2, MediaIntentReceiver.ACTION_SKIP_PREV) || TextUtils.equals(str2, MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                            jF |= f(str2, i, bundle);
                        } else {
                            g(dVar, str2, null);
                        }
                    }
                }
                dVar.e = jF;
                playbackStateCompatA = dVar.a();
            }
        }
        eyh0Var2.C(playbackStateCompatA);
        if (vro0Var != null && vro0Var.g1) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
        }
        if (vro0Var != null && vro0Var.h1) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        }
        if (bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS") || bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
            yxh0Var.a.setExtras(bundle);
        }
        if (i == 0) {
            eyh0Var2.B(new MediaMetadataCompat(new Bundle()));
            return;
        }
        if (this.n != null) {
            ComponentName componentName = this.f;
            if (componentName == null) {
                activity = null;
            } else {
                Intent intent = new Intent();
                intent.setComponent(componentName);
                activity = PendingIntent.getActivity(this.a, 0, intent, 201326592);
            }
            if (activity != null) {
                yxh0Var.a.setSessionActivity(activity);
            }
        }
        e321 e321Var3 = this.n;
        if (e321Var3 == null || (eyh0Var = this.f2p) == null || mediaInfo == null || (sqh0Var = mediaInfo.d) == null) {
            return;
        }
        long j = e321Var3.h() ? 0L : mediaInfo.e;
        String strJ = sqh0Var.j("com.google.android.gms.cast.metadata.TITLE");
        String strJ2 = sqh0Var.j("com.google.android.gms.cast.metadata.SUBTITLE");
        mre0 mre0VarI = i();
        mre0VarI.h(j, "android.media.metadata.DURATION");
        if (strJ != null) {
            mre0VarI.i("android.media.metadata.TITLE", strJ);
            mre0VarI.i("android.media.metadata.DISPLAY_TITLE", strJ);
        }
        if (strJ2 != null) {
            mre0VarI.i("android.media.metadata.DISPLAY_SUBTITLE", strJ2);
        }
        eyh0Var.B(new MediaMetadataCompat((Bundle) mre0VarI.b));
        Uri uriH = h(sqh0Var);
        if (uriH != null) {
            this.h.X(uriH);
            bitmap = null;
        } else {
            bitmap = null;
            d(0, null);
        }
        Uri uriH2 = h(sqh0Var);
        if (uriH2 != null) {
            this.i.X(uriH2);
        } else {
            d(3, bitmap);
        }
    }

    public final long f(String str, int i, Bundle bundle) {
        long j;
        int iHashCode = str.hashCode();
        if (iHashCode != -945151566) {
            if (iHashCode != -945080078) {
                if (iHashCode == 235550565 && str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK)) {
                    int i2 = 3;
                    if (i == 3) {
                        j = 514;
                    } else {
                        i2 = i;
                        j = 512;
                    }
                    if (i2 != 2) {
                        return j;
                    }
                    return 516L;
                }
            } else if (str.equals(MediaIntentReceiver.ACTION_SKIP_PREV)) {
                e321 e321Var = this.n;
                if (e321Var != null && e321Var.g()) {
                    j3i0 j3i0VarD = e321Var.d();
                    zod.s(j3i0VarD);
                    if ((128 & j3i0VarD.h) != 0 || j3i0VarD.P0 != 0) {
                        return 16L;
                    }
                    Integer num = (Integer) j3i0VarD.X0.get(j3i0VarD.c);
                    if (num != null && num.intValue() > 0) {
                        return 16L;
                    }
                }
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
                return 0L;
            }
        } else if (str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT)) {
            e321 e321Var2 = this.n;
            if (e321Var2 != null && e321Var2.g()) {
                j3i0 j3i0VarD2 = e321Var2.d();
                zod.s(j3i0VarD2);
                if ((64 & j3i0VarD2.h) != 0 || j3i0VarD2.P0 != 0) {
                    return 32L;
                }
                Integer num2 = (Integer) j3i0VarD2.X0.get(j3i0VarD2.c);
                if (num2 != null && num2.intValue() < j3i0VarD2.Q0.size() - 1) {
                    return 32L;
                }
            }
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        }
        return 0L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x014c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x014e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0158  */
    /* JADX WARN: Code duplicated, block: B:109:0x015e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x0160  */
    /* JADX WARN: Code duplicated, block: B:111:0x0167  */
    /* JADX WARN: Code duplicated, block: B:113:0x016b  */
    /* JADX WARN: Code duplicated, block: B:115:0x016f  */
    /* JADX WARN: Code duplicated, block: B:118:0x0175  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074 A[PHI: r14
      0x0074: PHI (r14v12 android.support.v4.media.session.PlaybackStateCompat$CustomAction) = 
      (r14v1 android.support.v4.media.session.PlaybackStateCompat$CustomAction)
      (r14v1 android.support.v4.media.session.PlaybackStateCompat$CustomAction)
      (r14v6 android.support.v4.media.session.PlaybackStateCompat$CustomAction)
      (r14v6 android.support.v4.media.session.PlaybackStateCompat$CustomAction)
      (r14v9 android.support.v4.media.session.PlaybackStateCompat$CustomAction)
      (r14v9 android.support.v4.media.session.PlaybackStateCompat$CustomAction)
      (r14v13 android.support.v4.media.session.PlaybackStateCompat$CustomAction)
      (r14v13 android.support.v4.media.session.PlaybackStateCompat$CustomAction)
     binds: [B:76:0x00fb, B:77:0x00fd, B:59:0x00bf, B:60:0x00c1, B:41:0x0081, B:42:0x0083, B:8:0x0022, B:9:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /*  JADX ERROR: UnsupportedOperationException in pass: SwitchBreakVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor$BaseSwitchRegionVisitor.leaveRegion(SwitchBreakVisitor.java:210)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor$IterativeSwitchRegionVisitor.leaveRegion(SwitchBreakVisitor.java:177)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor.runSwitchTraverse(SwitchBreakVisitor.java:52)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor.visit(SwitchBreakVisitor.java:45)
        */
    public final void g(android.support.v4.media.session.d r13, java.lang.String r14, p.qjo0 r15) {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.a8p1.g(android.support.v4.media.session.d, java.lang.String, p.qjo0):void");
    }

    public final Uri h(sqh0 sqh0Var) {
        h3e h3eVar = this.b.f;
        if (h3eVar != null) {
            h3eVar.j();
        }
        List list = sqh0Var.a;
        bil1 bil1Var = (list == null || list.isEmpty()) ? null : (bil1) sqh0Var.a.get(0);
        if (bil1Var == null) {
            return null;
        }
        return bil1Var.b;
    }

    public final mre0 i() {
        MediaMetadata metadata;
        eyh0 eyh0Var = this.f2p;
        MediaMetadataCompat mediaMetadataCompat = null;
        if (eyh0Var != null && (metadata = ((a) ((dg90) eyh0Var.c).b).a.getMetadata()) != null) {
            y36 y36Var = MediaMetadataCompat.c;
            Parcel parcelObtain = Parcel.obtain();
            metadata.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            MediaMetadataCompat mediaMetadataCompat2 = (MediaMetadataCompat) MediaMetadataCompat.CREATOR.createFromParcel(parcelObtain);
            parcelObtain.recycle();
            mediaMetadataCompat2.b = metadata;
            mediaMetadataCompat = mediaMetadataCompat2;
        }
        return mediaMetadataCompat == null ? new mre0() : new mre0(mediaMetadataCompat);
    }

    public final void j() {
        evo1 evo1Var = this.j;
        if (evo1Var != null) {
            v.a("Stopping media notification.", new Object[0]);
            vi11 vi11Var = evo1Var.i;
            vi11Var.Y();
            vi11Var.f = null;
            NotificationManager notificationManager = evo1Var.b;
            if (notificationManager != null) {
                notificationManager.cancel("castMediaNotification", 1);
            }
        }
    }

    public final void k(boolean z) {
        if (this.b.g) {
            jim0 jim0Var = this.k;
            seg1 seg1Var = this.l;
            if (seg1Var != null) {
                jim0Var.removeCallbacks(seg1Var);
            }
            Context context = this.a;
            Intent intent = new Intent(context, (Class<?>) ReconnectionService.class);
            intent.setPackage(context.getPackageName());
            try {
                context.startService(intent);
            } catch (IllegalStateException unused) {
                if (z) {
                    jim0Var.postDelayed(seg1Var, 1000L);
                }
            }
        }
    }

    public final void l() {
        if (this.b.g) {
            this.k.removeCallbacks(this.l);
            Context context = this.a;
            Intent intent = new Intent(context, (Class<?>) ReconnectionService.class);
            intent.setPackage(context.getPackageName());
            context.stopService(intent);
        }
    }
}
