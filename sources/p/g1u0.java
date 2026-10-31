package p;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ContextTrack$Metadata;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Collections;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g1u0 {
    public Notification A;
    public String B;
    public boolean C;
    public llm F;
    public final Context a;
    public final rd30 b;
    public final gw70 c;
    public final s880 d;
    public final Flowable e;
    public final Flowable f;
    public final cor g;
    public final ynb0 h;
    public final Scheduler i;
    public final g7h j;
    public final oo70 k;
    public final uu00 l;
    public final q0i0 m;
    public final i35 n;
    public final vbs o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e6u0 f21p;
    public final q8n q;
    public pd30 r;
    public String s;
    public Boolean u;
    public String v;
    public boolean y;
    public Bitmap z;
    public PlayerState t = PlayerState.EMPTY;
    public w0u0 w = new w0u0();
    public ktl x = ktl.a;
    public final vku D = new vku();
    public final rku E = new rku();

    public g1u0(Context context, rd30 rd30Var, gw70 gw70Var, s880 s880Var, Flowable flowable, Flowable flowable2, cor corVar, ynb0 ynb0Var, Scheduler scheduler, g7h g7hVar, oo70 oo70Var, uu00 uu00Var, q0i0 q0i0Var, i35 i35Var, vbs vbsVar, e6u0 e6u0Var, q8n q8nVar) {
        this.a = context;
        this.b = rd30Var;
        this.c = gw70Var;
        this.d = s880Var;
        this.e = flowable;
        this.f = flowable2;
        this.g = corVar;
        this.h = ynb0Var;
        this.i = scheduler;
        this.j = g7hVar;
        this.k = oo70Var;
        this.l = uu00Var;
        this.m = q0i0Var;
        this.n = i35Var;
        this.o = vbsVar;
        this.f21p = e6u0Var;
        this.q = q8nVar;
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            String string = context.getString(2131959164);
            wu7.m();
            NotificationChannel notificationChannel = new NotificationChannel("playback_channel", string, 2);
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    public static boolean c(PlayerState playerState) {
        ContextTrack contextTrack = (ContextTrack) playerState.track().h();
        if (contextTrack == null) {
            return false;
        }
        CharSequence charSequence = (CharSequence) contextTrack.metadata().get(ContextTrack$Metadata.KEY_TITLE);
        return !(charSequence == null || charSequence.length() == 0) || l4o1.E(contextTrack);
    }

    public final boolean a() {
        boolean zIsEnabled = ((dpb) this.h.get()).isEnabled();
        cor corVar = this.g;
        if (zIsEnabled || Build.VERSION.SDK_INT < 31) {
            return (this.s == null || corVar.a.i()) && !this.t.isPaused();
        }
        if (this.s == null) {
            return true;
        }
        return corVar.a.i();
    }

    public final ixg b(String str) {
        ixg ixgVarF = this.c.f(str);
        ixgVarF.g = false;
        ixgVarF.e();
        int i = Build.VERSION.SDK_INT;
        Context context = this.a;
        if (i >= 31) {
            ixgVarF.q(context, 2131166831, 2131166831, 3);
            return ixgVarF;
        }
        ixgVarF.q(context, R.dimen.notification_large_icon_width, R.dimen.notification_large_icon_height, 2);
        return ixgVarF;
    }

    public final void d(Notification notification) {
        Integer num = Build.VERSION.SDK_INT >= 31 ? 2 : null;
        pd30 pd30Var = this.r;
        if (pd30Var != null) {
            boolean zA = a();
            synchronized (pd30Var) {
                pd30Var.a(new jd30(2131430176, notification, zA, num));
            }
        }
    }

    public final void e() {
        llm llmVar = this.F;
        if (llmVar != null) {
            smo1.p(llmVar, (CancellationException) null);
        }
        this.F = null;
        this.E.a();
        this.D.c();
        pd30 pd30Var = this.r;
        if (pd30Var != null) {
            synchronized (pd30Var) {
                pd30Var.a(new hd30(2131430176));
            }
        }
        this.k.g(new rzm0());
        this.t = PlayerState.EMPTY;
        this.v = null;
        this.w = new w0u0();
        this.x = ktl.a;
        this.y = false;
        this.B = null;
        this.C = false;
        this.r = null;
    }

    public final s6g1 f() {
        Boolean bool;
        w0u0 w0u0Var = this.w;
        String str = this.v;
        ContextTrack contextTrack = (ContextTrack) this.t.track().h();
        if (!u890.j(str, contextTrack != null ? l4o1.b0(contextTrack) : null)) {
            w0u0Var = null;
        }
        w0u0 w0u0Var2 = (w0u0Var == null || w0u0Var.a == null || w0u0Var.b == null) ? null : w0u0Var;
        return new s6g1(this.y, this.x, (w0u0Var == null || (bool = w0u0Var.b) == null) ? false : bool.booleanValue(), w0u0Var2 != null ? w0u0Var2.c : null, w0u0Var2 != null ? w0u0Var2.d : null, this.o.c, w0u0Var != null ? w0u0Var.e : null);
    }

    public final void g(boolean z) {
        boolean z2 = this.C;
        boolean z3 = false;
        boolean z4 = !z2 && z;
        if (z2 && !z) {
            z3 = true;
        }
        this.C = z;
        boolean zA = a();
        wo70 wo70Var = this.k;
        if (zA && z4) {
            wo70Var.a(new rzm0(new gd30(new Intent())));
        } else if (z3) {
            wo70Var.g(new rzm0());
        }
    }

    public final void h(PlayerState playerState) {
        Bitmap bitmapCreateBitmap;
        if (c(playerState)) {
            Bitmap bitmapCreateBitmap2 = this.z;
            byte b = 0;
            if (bitmapCreateBitmap2 == null) {
                Drawable drawable = this.a.getDrawable(2131233765);
                if (drawable instanceof BitmapDrawable) {
                    bitmapCreateBitmap2 = ((BitmapDrawable) drawable).getBitmap();
                } else if (drawable == null) {
                    bitmapCreateBitmap2 = Bitmap.createBitmap(192, 192, Bitmap.Config.ARGB_8888);
                    bitmapCreateBitmap2.eraseColor(0);
                } else {
                    try {
                        int intrinsicWidth = drawable.getIntrinsicWidth();
                        Integer numValueOf = Integer.valueOf(intrinsicWidth);
                        if (intrinsicWidth <= 0) {
                            numValueOf = null;
                        }
                        int iIntValue = numValueOf != null ? numValueOf.intValue() : 192;
                        int intrinsicHeight = drawable.getIntrinsicHeight();
                        Integer numValueOf2 = intrinsicHeight > 0 ? Integer.valueOf(intrinsicHeight) : null;
                        bitmapCreateBitmap = Bitmap.createBitmap(iIntValue, numValueOf2 != null ? numValueOf2.intValue() : 192, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                        drawable.draw(canvas);
                    } catch (Exception unused) {
                        bitmapCreateBitmap = Bitmap.createBitmap(192, 192, Bitmap.Config.ARGB_8888);
                        bitmapCreateBitmap.eraseColor(0);
                    }
                    bitmapCreateBitmap2 = bitmapCreateBitmap;
                }
                this.z = bitmapCreateBitmap2;
            }
            Notification notificationC = this.d.c(playerState, this.s, bitmapCreateBitmap2, this.u, f());
            d(notificationC);
            this.A = notificationC;
            ContextTrack contextTrack = (ContextTrack) playerState.track().b();
            String strM = l1d.m("player:", contextTrack.uri());
            this.B = strM;
            if (!this.n.d() || l4o1.C(contextTrack)) {
                b(l4o1.a0((ContextTrack) playerState.track().b(), "image_url")).j(new r0s0(this, strM, new y0u0(this, (byte) 1)));
            } else {
                String strUri = contextTrack.uri();
                this.E.b(fbp1.n(this.l, "playback_notification", Collections.singletonList(strUri), zkk1.b).map(new k9p1(strUri, (byte) 17)).filter(xi20.Z0).take(1L).observeOn(this.i).subscribe(new z0u0(this, strM, b)));
            }
        }
    }
}
