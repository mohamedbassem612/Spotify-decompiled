package p;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import androidx.media3.session.legacy.MediaConstants;
import androidx.media3.session.legacy.MediaSessionCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class c0i0 implements hxh0 {
    public Uri c;
    public final /* synthetic */ e0i0 e;
    public tqh0 a = tqh0.M;
    public String b = "";
    public long d = -9223372036854775807L;

    public c0i0(e0i0 e0i0Var) {
        this.e = e0i0Var;
    }

    @Override // p.hxh0
    public final void a(int i, PendingIntent pendingIntent) {
        this.e.j.setSessionActivity(pendingIntent);
    }

    @Override // p.hxh0
    public final void e(int i, xg61 xg61Var, boolean z, boolean z2, int i2) {
        e0i0 e0i0Var = this.e;
        fzh0 fzh0Var = e0i0Var.d;
        fzh0Var.C();
        e0i0Var.n(fzh0Var.t);
    }

    @Override // p.hxh0
    public final void f(int i, List list) {
        e0i0 e0i0Var = this.e;
        fzh0 fzh0Var = e0i0Var.d;
        fzh0Var.C();
        e0i0Var.n(fzh0Var.t);
    }

    @Override // p.hxh0
    public final void h(int i, ke61 ke61Var) {
        e0i0 e0i0Var = this.e;
        fzh0 fzh0Var = e0i0Var.d;
        fzh0Var.C();
        ffu0 ffu0Var = fzh0Var.t;
        e0i0Var.r = new b2c(false, yzb0.c(ke61Var.a), ke61Var.b, ke61Var.c);
        MediaSessionCompat mediaSessionCompat = e0i0Var.j;
        mediaSessionCompat.setPlaybackState(e0i0Var.b(ffu0Var));
        e0i0Var.r = null;
        mediaSessionCompat.setPlaybackState(e0i0Var.b(ffu0Var));
    }

    @Override // p.hxh0
    public final void j(int i, pa61 pa61Var) {
        Bundle bundle = Bundle.EMPTY;
        boolean zIsEmpty = bundle.isEmpty();
        Bundle bundle2 = pa61Var.c;
        if (zIsEmpty) {
            bundle = bundle2;
        } else if (!bundle2.isEmpty()) {
            Bundle bundle3 = new Bundle(bundle2);
            bundle3.putAll(bundle);
            bundle = bundle3;
        }
        this.e.j.sendSessionEvent(pa61Var.b, bundle);
    }

    @Override // p.hxh0
    public final void k(int i, Bundle bundle) {
        dm5.m(!bundle.containsKey("EXO_SPEED"));
        dm5.m(!bundle.containsKey(MediaConstants.PLAYBACK_STATE_EXTRAS_KEY_MEDIA_ID));
        Bundle bundle2 = new Bundle(bundle);
        e0i0 e0i0Var = this.e;
        e0i0Var.s = bundle2;
        if (!e0i0Var.u.isEmpty()) {
            e0i0Var.l();
        }
        e0i0Var.j.setExtras(e0i0Var.s);
        fzh0 fzh0Var = e0i0Var.d;
        fzh0Var.C();
        e0i0Var.n(fzh0Var.t);
    }

    @Override // p.hxh0
    public final void l(int i, m8u0 m8u0Var) {
        e0i0 e0i0Var = this.e;
        fzh0 fzh0Var = e0i0Var.d;
        fzh0Var.C();
        ffu0 ffu0Var = fzh0Var.t;
        int i2 = ffu0Var.Y(20) ? 4 : 0;
        if (e0i0Var.q != i2) {
            e0i0Var.q = i2;
            e0i0Var.j.setFlags(i2);
        }
        e0i0Var.n(ffu0Var);
    }

    public final void p() {
        int i;
        yzh0 yzh0Var;
        e0i0 e0i0Var = this.e;
        fzh0 fzh0Var = e0i0Var.d;
        fzh0Var.C();
        ffu0 ffu0Var = fzh0Var.t;
        if (ffu0Var.y0().a == 0) {
            yzh0Var = null;
        } else {
            m8u0 m8u0VarN0 = ffu0Var.n0();
            if (m8u0VarN0.a.a(26, 34)) {
                i = m8u0VarN0.a.a(25, 33) ? 2 : 1;
            } else {
                i = 0;
            }
            Handler handler = new Handler(ffu0Var.a.e0());
            int iJ0 = ffu0Var.Y(23) ? ffu0Var.j0() : 0;
            xqt xqtVarY0 = ffu0Var.y0();
            yzh0Var = new yzh0(i, xqtVarY0.c, iJ0, xqtVarY0.d, handler, ffu0Var);
        }
        e0i0Var.m = yzh0Var;
        MediaSessionCompat mediaSessionCompat = e0i0Var.j;
        if (yzh0Var == null) {
            mediaSessionCompat.setPlaybackToLocal(ffu0Var.Y(21) ? ffu0Var.x0() : po7.i);
        } else {
            mediaSessionCompat.setPlaybackToRemote(yzh0Var);
        }
    }

    public final void q(yoh0 yoh0Var) {
        w();
        e0i0 e0i0Var = this.e;
        MediaSessionCompat mediaSessionCompat = e0i0Var.j;
        if (yoh0Var == null) {
            mediaSessionCompat.setRatingType(0);
        } else {
            mediaSessionCompat.setRatingType(yzb0.j(yoh0Var.d.i));
        }
        fzh0 fzh0Var = e0i0Var.d;
        fzh0Var.C();
        e0i0Var.n(fzh0Var.t);
    }

    public final void r(int i, ffu0 ffu0Var) {
        v(ffu0Var.i1());
        s(ffu0Var.Y(18) ? ffu0Var.P0() : tqh0.M);
        ffu0Var.j1();
        w();
        u(ffu0Var.V0());
        t(ffu0Var.getRepeatMode());
        ffu0Var.y0();
        p();
        int i2 = ffu0Var.Y(20) ? 4 : 0;
        e0i0 e0i0Var = this.e;
        if (e0i0Var.q != i2) {
            e0i0Var.q = i2;
            e0i0Var.j.setFlags(i2);
        }
        q(ffu0Var.h1());
    }

    public final void s(tqh0 tqh0Var) {
        e0i0 e0i0Var = this.e;
        MediaSessionCompat mediaSessionCompat = e0i0Var.j;
        CharSequence queueTitle = mediaSessionCompat.getController().getQueueTitle();
        CharSequence charSequence = tqh0Var.a;
        if (TextUtils.equals(queueTitle, charSequence)) {
            return;
        }
        if (!e0i0Var.h()) {
            charSequence = null;
        }
        mediaSessionCompat.setQueueTitle(charSequence);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0026 A[PHI: r1
      0x0026: PHI (r1v1 int) = (r1v0 int), (r1v2 int) binds: [B:5:0x000a, B:7:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
    public final void t(int i) {
        MediaSessionCompat mediaSessionCompat = this.e.j;
        int i2 = yzb0.a;
        int i3 = 0;
        if (i != 0) {
            int i4 = 1;
            if (i != 1) {
                i4 = 2;
                if (i != 2) {
                    oon1.H("Unrecognized RepeatMode: " + i + " was converted to `PlaybackStateCompat.REPEAT_MODE_NONE`");
                } else {
                    i3 = i4;
                }
            } else {
                i3 = i4;
            }
        }
        mediaSessionCompat.setRepeatMode(i3);
    }

    public final void u(boolean z) {
        MediaSessionCompat mediaSessionCompat = this.e.j;
        int i = yzb0.a;
        mediaSessionCompat.setShuffleMode(z ? 1 : 0);
    }

    public final void v(sqe1 sqe1Var) {
        x(sqe1Var);
        w();
    }

    public final void w() {
        long j;
        Uri uri;
        tqh0 tqh0Var;
        Uri uri2;
        e0i0 e0i0Var = this.e;
        fzh0 fzh0Var = e0i0Var.d;
        fzh0Var.C();
        ffu0 ffu0Var = fzh0Var.t;
        yoh0 yoh0VarH1 = ffu0Var.h1();
        tqh0 tqh0VarJ1 = ffu0Var.j1();
        long duration = -9223372036854775807L;
        if ((!ffu0Var.Y(16) || !ffu0Var.e1()) && ffu0Var.Y(16)) {
            duration = ffu0Var.getDuration();
        }
        String str = yoh0VarH1 != null ? yoh0VarH1.a : "";
        Bitmap bitmap = null;
        Uri uri3 = (yoh0VarH1 == null || (uri2 = yoh0VarH1.f.a) == null) ? null : uri2;
        if (Objects.equals(this.a, tqh0VarJ1) && Objects.equals(this.b, str) && Objects.equals(this.c, uri3) && this.d == duration) {
            return;
        }
        this.b = str;
        this.c = uri3;
        this.a = tqh0VarJ1;
        this.d = duration;
        n8d0 n8d0VarI = fzh0Var.m.i(tqh0VarJ1);
        if (n8d0VarI != null) {
            e0i0Var.f43p = null;
            if (n8d0VarI.isDone()) {
                try {
                    bitmap = (Bitmap) fc11.C(n8d0VarI);
                } catch (CancellationException | ExecutionException e) {
                    oon1.H("Failed to load bitmap: " + e.getMessage());
                }
                j = duration;
                uri = uri3;
                tqh0Var = tqh0VarJ1;
            } else {
                j = duration;
                uri = uri3;
                tqh0Var = tqh0VarJ1;
                b0i0 b0i0Var = new b0i0(this, tqh0Var, str, uri, j);
                str = str;
                e0i0Var.f43p = b0i0Var;
                Handler handler = fzh0Var.l;
                Objects.requireNonNull(handler);
                n8d0VarI.b(new nx30(n8d0VarI, b0i0Var, (byte) 24), new zrk(handler, (byte) 1));
            }
        } else {
            j = duration;
            uri = uri3;
            tqh0Var = tqh0VarJ1;
        }
        e0i0Var.j.setMetadata(yzb0.f(tqh0Var, str, uri, j, bitmap));
    }

    public final void x(sqe1 sqe1Var) {
        e0i0 e0i0Var = this.e;
        fzh0 fzh0Var = e0i0Var.d;
        if (!e0i0Var.h() || sqe1Var.p()) {
            e0i0Var.j.setQueue(null);
            return;
        }
        int i = yzb0.a;
        ArrayList arrayList = new ArrayList();
        oqe1 oqe1Var = new oqe1();
        for (int i2 = 0; i2 < sqe1Var.o(); i2++) {
            arrayList.add(sqe1Var.n(i2, oqe1Var, 0L).c);
        }
        ArrayList arrayList2 = new ArrayList();
        m2d m2dVar = new m2d((Object) this, (Object) new AtomicInteger(0), (Object) arrayList, (Object) arrayList2, (byte) 17);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            byte[] bArr = ((yoh0) arrayList.get(i3)).d.k;
            if (bArr == null) {
                arrayList2.add(null);
                m2dVar.run();
            } else {
                n8d0 n8d0VarQ = fzh0Var.m.q(bArr);
                arrayList2.add(n8d0VarQ);
                Handler handler = fzh0Var.l;
                Objects.requireNonNull(handler);
                n8d0VarQ.b(m2dVar, new zrk(handler, (byte) 1));
            }
        }
    }

    @Override // p.hxh0
    public final void onDisconnected() {
    }
}
