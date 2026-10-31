package p;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.TextUtils;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wxh0 extends MediaSession.Callback {
    public final /* synthetic */ xxh0 a;

    public wxh0(xxh0 xxh0Var) {
        this.a = xxh0Var;
    }

    public static void b(yxh0 yxh0Var) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        MediaSession mediaSession = yxh0Var.a;
        String str = null;
        try {
            str = (String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
        } catch (Exception unused) {
        }
        if (TextUtils.isEmpty(str)) {
            str = "android.media.session.MediaController";
        }
        yxh0Var.d(new f0i0(str, -1, -1));
    }

    public final yxh0 a() {
        yxh0 yxh0Var;
        xxh0 xxh0Var;
        synchronized (this.a.a) {
            yxh0Var = (yxh0) this.a.d.get();
        }
        if (yxh0Var == null) {
            return null;
        }
        xxh0 xxh0Var2 = this.a;
        synchronized (yxh0Var.d) {
            xxh0Var = yxh0Var.m;
        }
        if (xxh0Var2 == xxh0Var) {
            return yxh0Var;
        }
        return null;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        int i;
        h5j1 h5j1Var;
        yxh0 yxh0VarA = a();
        if (yxh0VarA == null) {
            return;
        }
        eyh0.b(bundle);
        b(yxh0VarA);
        try {
            if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                Bundle bundle2 = new Bundle();
                MediaSessionCompat$Token mediaSessionCompat$Token = yxh0VarA.c;
                lh70 lh70VarA = mediaSessionCompat$Token.a();
                y1a1.J(lh70VarA == null ? null : lh70VarA.asBinder(), bundle2);
                synchronized (mediaSessionCompat$Token.a) {
                    h5j1Var = mediaSessionCompat$Token.d;
                }
                eqr0.L(bundle2, h5j1Var);
                resultReceiver.send(0, bundle2);
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
            } else if (!str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                this.a.b(str, bundle, resultReceiver);
            } else if (yxh0VarA.h != null && (i = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1)) >= 0 && i < yxh0VarA.h.size()) {
            }
        } catch (BadParcelableException unused) {
        }
        yxh0VarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        yxh0 yxh0VarA = a();
        if (yxh0VarA == null) {
            return;
        }
        eyh0.b(bundle);
        b(yxh0VarA);
        try {
            boolean zEquals = str.equals("android.support.v4.media.session.action.PLAY_FROM_URI");
            xxh0 xxh0Var = this.a;
            if (zEquals) {
                Uri uri = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                eyh0.b(bundle2);
                xxh0Var.i(uri, bundle2);
            } else if (!str.equals("android.support.v4.media.session.action.PREPARE")) {
                if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                    String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                    Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    eyh0.b(bundle3);
                    xxh0Var.j(string, bundle3);
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                    bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                    eyh0.b(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                    Uri uri2 = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                    Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    eyh0.b(bundle4);
                    xxh0Var.k(uri2, bundle4);
                } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                    bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                    xxh0Var.n(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                    xxh0Var.o(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                    bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                    eyh0.b(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                    bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f);
                } else {
                    xxh0Var.c(str, bundle);
                }
            }
        } catch (BadParcelableException unused) {
        }
        yxh0VarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onFastForward() {
        yxh0 yxh0VarA = a();
        if (yxh0VarA == null) {
            return;
        }
        b(yxh0VarA);
        yxh0VarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        yxh0 yxh0VarA = a();
        if (yxh0VarA == null) {
            return false;
        }
        b(yxh0VarA);
        boolean zD = this.a.d(intent);
        yxh0VarA.d(null);
        return zD || super.onMediaButtonEvent(intent);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPause() {
        yxh0 yxh0VarA = a();
        if (yxh0VarA == null) {
            return;
        }
        b(yxh0VarA);
        this.a.e();
        yxh0VarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        yxh0 yxh0VarA = a();
        if (yxh0VarA == null) {
            return;
        }
        b(yxh0VarA);
        this.a.f();
        yxh0VarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        yxh0 yxh0VarA = a();
        if (yxh0VarA == null) {
            return;
        }
        eyh0.b(bundle);
        b(yxh0VarA);
        this.a.g(str, bundle);
        yxh0VarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromSearch(String str, Bundle bundle) {
        yxh0 yxh0VarA = a();
        if (yxh0VarA == null) {
            return;
        }
        eyh0.b(bundle);
        b(yxh0VarA);
        this.a.h(str, bundle);
        yxh0VarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        yxh0 yxh0VarA = a();
        if (yxh0VarA == null) {
            return;
        }
        eyh0.b(bundle);
        b(yxh0VarA);
        this.a.i(uri, bundle);
        yxh0VarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepare() {
        yxh0 yxh0VarA = a();
        if (yxh0VarA == null) {
            return;
        }
        b(yxh0VarA);
        yxh0VarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        yxh0 yxh0VarA = a();
        if (yxh0VarA == null) {
            return;
        }
        eyh0.b(bundle);
        b(yxh0VarA);
        this.a.j(str, bundle);
        yxh0VarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        yxh0 yxh0VarA = a();
        if (yxh0VarA == null) {
            return;
        }
        eyh0.b(bundle);
        b(yxh0VarA);
        yxh0VarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        yxh0 yxh0VarA = a();
        if (yxh0VarA == null) {
            return;
        }
        eyh0.b(bundle);
        b(yxh0VarA);
        this.a.k(uri, bundle);
        yxh0VarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onRewind() {
        yxh0 yxh0VarA = a();
        if (yxh0VarA == null) {
            return;
        }
        b(yxh0VarA);
        yxh0VarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSeekTo(long j) {
        yxh0 yxh0VarA = a();
        if (yxh0VarA == null) {
            return;
        }
        b(yxh0VarA);
        this.a.l(j);
        yxh0VarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetPlaybackSpeed(float f) {
        yxh0 yxh0VarA = a();
        if (yxh0VarA == null) {
            return;
        }
        b(yxh0VarA);
        yxh0VarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetRating(Rating rating) {
        yxh0 yxh0VarA = a();
        if (yxh0VarA == null) {
            return;
        }
        b(yxh0VarA);
        this.a.m(RatingCompat.a(rating));
        yxh0VarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToNext() {
        yxh0 yxh0VarA = a();
        if (yxh0VarA == null) {
            return;
        }
        b(yxh0VarA);
        this.a.p();
        yxh0VarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToPrevious() {
        yxh0 yxh0VarA = a();
        if (yxh0VarA == null) {
            return;
        }
        b(yxh0VarA);
        this.a.q();
        yxh0VarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToQueueItem(long j) {
        yxh0 yxh0VarA = a();
        if (yxh0VarA == null) {
            return;
        }
        b(yxh0VarA);
        this.a.r(j);
        yxh0VarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onStop() {
        yxh0 yxh0VarA = a();
        if (yxh0VarA == null) {
            return;
        }
        b(yxh0VarA);
        this.a.s();
        yxh0VarA.d(null);
    }
}
