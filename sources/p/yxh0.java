package p;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.b;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class yxh0 {
    public final MediaSession a;
    public final b b;
    public final MediaSessionCompat$Token c;
    public Bundle e;
    public PlaybackStateCompat g;
    public List h;
    public MediaMetadataCompat i;
    public byte j;
    public int k;
    public int l;
    public xxh0 m;
    public f0i0 n;
    public final Object d = new Object();
    public final RemoteCallbackList f = new RemoteCallbackList();

    public yxh0(Context context, String str) {
        MediaSession mediaSessionA = a(context, str);
        this.a = mediaSessionA;
        b bVar = new b(this);
        this.b = bVar;
        this.c = new MediaSessionCompat$Token(mediaSessionA.getSessionToken(), bVar, 0);
        this.e = null;
        mediaSessionA.setFlags(3);
    }

    public MediaSession a(Context context, String str) {
        return new MediaSession(context, str);
    }

    public f0i0 b() {
        f0i0 f0i0Var;
        synchronized (this.d) {
            f0i0Var = this.n;
        }
        return f0i0Var;
    }

    public final void c(xxh0 xxh0Var, Handler handler) {
        synchronized (this.d) {
            try {
                this.m = xxh0Var;
                this.a.setCallback(xxh0Var == null ? null : xxh0Var.b, handler);
                if (xxh0Var != null) {
                    xxh0Var.t(this, handler);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(f0i0 f0i0Var) {
        synchronized (this.d) {
            this.n = f0i0Var;
        }
    }

    public void e() {
        this.j = (byte) 2;
    }

    public yxh0(MediaSession mediaSession) {
        this.a = mediaSession;
        b bVar = new b(this);
        this.b = bVar;
        this.c = new MediaSessionCompat$Token(mediaSession.getSessionToken(), bVar, 0);
        this.e = null;
        mediaSession.setFlags(3);
    }
}
